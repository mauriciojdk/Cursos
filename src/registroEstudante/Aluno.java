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
		
		/*Method - for get result of the student if is aproved or reproved*/

		public String getAlunoAprovado(){
			double media = this.getMediaNota();
			if (media >= 50) {
				if(media >= 70){
					return "Aprovado";
			}else {
				return "Recuperação";
			}
		} else {
			return "Reprovado";
			}
		}
		@Override
		public String toString() {
			return "Aluno [dataMatricula=" + dataMatricula + ", dataNascimento=" + dataNascimento + ", disciplinas="
					+ disciplinas + ", idade=" + idade + ", nome=" + nome + ", nomeEscola=" + nomeEscola + ", nomeMae="
					+ nomeMae + ", nomePai=" + nomePai + ", numeroCpf=" + numeroCpf + ", registroGeral=" + registroGeral
					+ ", serieMatriculado=" + serieMatriculado + "]";
		}

		
}
