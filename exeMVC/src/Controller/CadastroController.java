package controller;

import model.Usuario;
import view.CadastroView;
import view.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CadastroController {
    private CadastroView cadastroView;
    private LoginView loginView;
    private Usuario usuario;

    public CadastroController(CadastroView cadastroView, LoginView loginView, Usuario usuario) {
        this.cadastroView = cadastroView;
        this.loginView = loginView;
        this.usuario = usuario;
        initController();
    }

    private void initController() {
        cadastroView.setCadastroButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario.setUsername(cadastroView.getUsername());
                usuario.setPassword(cadastroView.getPassword());
                JOptionPane.showMessageDialog(cadastroView, "Cadastro feito");
            }
        });

        cadastroView.setGoToLoginButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastroView.setVisible(false);
                loginView.setVisible(true);
            }
        });
    }
}
