package Executavel;

import Classes.Aluno;
import Classes.Diretor;
import Classes.Secretario;

import javax.swing.*;

public class TestedeClasses {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Mauricio Silva");


        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("35565546454");
        diretor.setTempoDirecao(200);
        diretor.setTitulacao("Diretor Geral");


        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNivelCargo("Superior");
        secretario.setRegistro("01s024s021");

        System.out.println(diretor.toString());
        System.out.println(secretario.toString());
        System.out.println(aluno.toString());

        System.out.println("Salario do diretor: $"  + diretor.salario());
        System.out.println("Salario do secretario: $"  + secretario.salario());
        System.out.println("Salario do aluno: $"  + aluno.salario());

        String login = JOptionPane.showInputDialog("Informe o login: ");
        String senha = JOptionPane.showInputDialog("Informe a senha: ");

        Secretario secretario1 = new Secretario();
        secretario1.setLogin(login);
        secretario1.setSenha(senha);

        if (secretario1.autenticar()){
            JOptionPane.showMessageDialog(null, "Logado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado!");

    }
}
}
