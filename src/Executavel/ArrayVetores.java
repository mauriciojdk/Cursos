package Executavel;

import Classes.Aluno;
import Classes.Disciplina;

import javax.swing.*;

public class ArrayVetores {
    public static void main(String[] args) {

        double[] notasUm = {8.8, 9.7, 7.9, 6.9};
        double[] notaDois = {8.0, 9.0, 7.0, 6.0};

        Aluno aluno = new Aluno();

        aluno.setNome("Mauricio");
        aluno.setNomeEscola("Colegio Estadual");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Geografia");
        disciplina.setNota(notasUm);

        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Historia");
        disciplina2.setNota(notaDois);

        aluno.getDisciplinas().add(disciplina2);

        Aluno[] arrayAlunos = new Aluno[1];
        arrayAlunos[0] = aluno;

        for (int pos = 0; pos < arrayAlunos.length; pos ++){
            System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());

            for (Disciplina d : arrayAlunos[pos].getDisciplinas()){
                System.out.println("Nome da disciplina é: " + d.getDisciplina());

                for (int posnota = 0; posnota < d.getNota().length; posnota++){
                    System.out.println("Nota " + (posnota + 1) + " é igual = " + d.getNota()[posnota]);

                }
            }



        }




    }
}
