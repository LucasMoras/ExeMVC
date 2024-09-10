package controller;

import model.Usuario;
import view.LoginView;
import view.CadastroView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginController {
    private LoginView loginView;
    private CadastroView cadastroView;
    private Usuario usuario;

    public LoginController(LoginView loginView, CadastroView cadastroView, Usuario usuario) {
        this.loginView = loginView;
        this.cadastroView = cadastroView;
        this.usuario = usuario;
        initController();
    }

    private void initController() {
        loginView.setLoginButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usuario.getUsername().equals(loginView.getUsername()) && usuario.getPassword().equals(loginView.getPassword())) {
                    JOptionPane.showMessageDialog(loginView, "Login feito");
                } else {
                    JOptionPane.showMessageDialog(loginView, "Credencais invalidas");
                }
            }
        });

        loginView.setGoToCadastroButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginView.setVisible(false);
                cadastroView.setVisible(true);
            }
        });
    }
}
