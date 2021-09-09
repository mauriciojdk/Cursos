package executavelRegistroEstudante;

import javax.swing.JOptionPane;

import registroEstudante.Aluno;


public class Execut {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
		

		aluno1.setNome(JOptionPane.showInputDialog("Qual nome do aluno? "));;
		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno? ")));;
		aluno1.setDataNascimento(JOptionPane.showInputDialog("Qual data de nascimento do aluno? "));;
		aluno1.setRegistroGeral(JOptionPane.showInputDialog("Qual é o registro  geral do aluno? "));;
		aluno1.setNumeroCpf(JOptionPane.showInputDialog("Qual o numero de CPF do aluno? "));;
		aluno1.setNomeMae(JOptionPane.showInputDialog("Qual nome da mãe do aluno? "));;
		aluno1.setNomePai(JOptionPane.showInputDialog("Qual nome do pai do aluno? "));;
		aluno1.setDataMatricula(JOptionPane.showInputDialog("Qual é a data de matricula do aluno? "));;
		aluno1.setNomeEscola(JOptionPane.showInputDialog("Qual nome da escola? "));;
		aluno1.setSerieMatriculado(JOptionPane.showInputDialog("Em qual serie aluno está matriculado? "));;
		
		JOptionPane.showMessageDialog(null, "O nome do aluno é : " + aluno1.getNome() + "\n" +
				"A idade do aluno é : " + aluno1.getIdade() + "\n" +
				"A data de nascimento do aluno é : " + aluno1.getDataNascimento() + "\n" +
				"O registo geral do aluno é : " + aluno1.getRegistroGeral() + "\n" +
				"O CPF do aluno é : " + aluno1.getNumeroCpf() + "\n" +
				"O nome da mãe do aluno é : " + aluno1.getNomeMae() + "\n" + 
				"O nome do pai do aluno é :" + aluno1.getNomePai() + "\n" +
				"A data de matricula do aluno é : " + aluno1.getDataMatricula() + "\n" +
				"O nome da escola do referente aluno é :  " + aluno1.getNomeEscola() + "\n" +
				"A serie que o aluno está matriculado é : " + aluno1.getSerieMatriculado());










































    }
}
