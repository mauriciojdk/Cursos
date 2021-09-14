package executavelRegistroEstudante;

import javax.swing.JOptionPane;

import registroEstudante.Aluno;
import registroEstudante.Disciplina;


public class Execut {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
		/*Student Data*/
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

		/*Student Grades*/
		for (int i = 1; i <= 4; i++){
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+ i +" :");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+ i +" :");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);
		};


		/*Show text*/
		JOptionPane.showMessageDialog(null, "Nome do aluno: " + aluno1.getNome() + "\n" +
				"Idade do aluno: " + aluno1.getIdade() + "\n" +
				"Data de nascimento: " + aluno1.getDataNascimento() + "\n" +
				"RG: " + aluno1.getRegistroGeral() + "\n" +
				"CPF: " + aluno1.getNumeroCpf() + "\n" +
				"Mãe do aluno: " + aluno1.getNomeMae() + "\n" + 
				"Pai do aluno:" + aluno1.getNomePai() + "\n" +
				"Data de matricula: " + aluno1.getDataMatricula() + "\n" +
				"Nome da escola:  " + aluno1.getNomeEscola() + "\n" +
				"Serie: " + aluno1.getSerieMatriculado() + "\n" +
				"Situação do aluno: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));










































    }
}
