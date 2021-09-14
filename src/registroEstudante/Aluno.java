package registroEstudante;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    
        private String nome;
		private int idade;
		private String dataNascimento;
		private String registroGeral;
		private String numeroCpf;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;

		private List <Disciplina> disciplinas = new ArrayList<Disciplina>();


		public List<Disciplina> getDisciplinas() {
			return disciplinas;
		}
		public void setDisciplinas(List<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public String getRegistroGeral() {
			return registroGeral;
		}
		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}
		public String getNumeroCpf() {
			return numeroCpf;
		}
		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}
		public String getNomeMae() {
			return nomeMae;
		}
		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}
		public String getNomePai() {
			return nomePai;
		}
		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}
		public String getDataMatricula() {
			return dataMatricula;
		}
		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}
		public String getNomeEscola() {
			return nomeEscola;
		}
		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}
		public String getSerieMatriculado() {
			return serieMatriculado;
		}
		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}

		/*Method - student grade*/

		public double getMediaNota(){

			double soma = 0;

			for (Disciplina disciplina : disciplinas) {
				soma += disciplina.getNota();
			}

			return soma / disciplinas.size() ;
		}
		
		/*Method - True for aproved / False for reproved*/

		public boolean getAlunoAprovado(){
			double media = this.getMediaNota();
			if (media >= 70) {
				return true;
			}else {
				return false;
			}

		}
		

}
