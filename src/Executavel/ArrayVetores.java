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

        for (Disciplina d : aluno.getDisciplinas() ){

            System.out.println("Disciplina: " + d.getDisciplina());
            System.out.println("Notas: ");
            for (int pos = 0 ; pos < d.getNota().length; pos++){
                System.out.println("Nota " + (pos + 1) + " é igual = " + d.getNota()[pos]);
            }

            double notaMax = 0.0;

            for (int pos = 0 ; pos < d.getNota().length; pos++){
                System.out.println("Nota " + (pos + 1) + " é igual = " + d.getNota()[pos]);


                if (pos == 0) {
                    notaMax = d.getNota()[pos];
                }else if (d.getNota()[pos] > notaMax){
                    notaMax = d.getNota()[pos];
                }
            }
                System.out.println("A maior nota da disciplina foi: " + notaMax);
        }




    }
}
