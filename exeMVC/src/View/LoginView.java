package view;

import controller.LoginController;
import controller.CadastroController;
import model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton goToCadastroButton;

    public LoginView() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Logar");
        goToCadastroButton = new JButton("Cadastro");

        add(new JLabel("Usuario:"));
        add(usernameField);
        add(new JLabel("Senha:"));
        add(passwordField);
        add(loginButton);
        add(goToCadastroButton);

        setLocationRelativeTo(null);
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void setLoginButtonActionListener(ActionListener actionListener) {
        loginButton.addActionListener(actionListener);
    }

    public void setGoToCadastroButtonActionListener(ActionListener actionListener) {
        goToCadastroButton.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("", "");

        LoginView loginView = new LoginView();
        CadastroView cadastroView = new CadastroView();

        LoginController loginController = new LoginController(loginView, cadastroView, usuario);
        CadastroController cadastroController = new CadastroController(cadastroView, loginView, usuario);

        loginView.setVisible(true);
    }
}
