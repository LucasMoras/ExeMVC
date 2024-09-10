package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CadastroView extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton cadastroButton;
    private JButton goToLoginButton;

    public CadastroView() {
        setTitle("Cadastro");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        cadastroButton = new JButton("Cadastrar");
        goToLoginButton = new JButton("Login");

        add(new JLabel("Usuario:"));
        add(usernameField);
        add(new JLabel("Senha:"));
        add(passwordField);
        add(cadastroButton);
        add(goToLoginButton);

        setLocationRelativeTo(null);
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void setCadastroButtonActionListener(ActionListener actionListener) {
        cadastroButton.addActionListener(actionListener);
    }

    public void setGoToLoginButtonActionListener(ActionListener actionListener) {
        goToLoginButton.addActionListener(actionListener);
    }
}
