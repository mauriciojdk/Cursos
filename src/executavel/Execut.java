package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Classes.Aluno;
import Classes.Disciplina;


public class Execut {
    public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++){

			
			Aluno aluno1 = new Aluno();
			/*Student Data*/
			aluno1.setNome(JOptionPane.showInputDialog("Qual nome do aluno "+ qtd + " ?"));;
			aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno " + qtd + " ?")));;
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
			
			int  resposta = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
			
			if (resposta == 0) {
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover == 0) {
					
					String disciplina = (JOptionPane.showInputDialog("Qual disciplina sera removida? 1, 2, 3 ou 4: "));
					aluno1.getDisciplinas().remove((Integer.parseInt(disciplina)) - posicao);
					posicao ++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
				}
				/*for (int test = 0; test <= 3 ; test++) {
					System.out.println(aluno1.getDisciplinas().toString());   // - Show the list
				}*/ 
			}
			alunos.add(aluno1);
		}

			
		for (Aluno aluno : alunos) {
			/* Show student text */
			if (aluno.getNome().equalsIgnoreCase("alex")) {
				alunos.remove(aluno); // Remove stund "alex" and not show the data
			break;
			} else{
			JOptionPane.showMessageDialog(null,  "Nome do aluno: " + aluno.getNome() + "\n" +
			"Idade do aluno: " + aluno.getIdade() + "\n" +
			"Data de nascimento: " + aluno.getDataNascimento() + "\n" +
			"RG: " + aluno.getRegistroGeral() + "\n" +
			"CPF: " + aluno.getNumeroCpf() + "\n" +
			"Mãe do aluno: " + aluno.getNomeMae() + "\n" + 
			"Pai do aluno:" + aluno.getNomePai() + "\n" +
			"Data de matricula: " + aluno.getDataMatricula() + "\n" +
			"Nome da escola:  " + aluno.getNomeEscola() + "\n" +
			"Serie: " + aluno.getSerieMatriculado() + "\n" +
			"Situação do aluno: " + aluno.getAlunoAprovado());
			}
		}
			

    }
}
