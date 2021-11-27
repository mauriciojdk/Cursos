package executavel;

import Classes.Aluno;
import Classes.Diretor;
import Classes.Secretario;

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


    }
}
