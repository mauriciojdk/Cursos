package Classes;

import java.util.ArrayList;
import java.util.List;

import Constantes.StatusAluno;
//Subclasse
public class Aluno extends Pessoa{
    

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

	@Override
	public double salario() {
		return 1000.80;
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
				soma += disciplina.getMediaNotas();
			}

			return soma / disciplinas.size() ;
		}
		
		/*Method - for get result of the student if is aproved or reproved*/

		public String getAlunoAprovado(){
			double media = this.getMediaNota();
			if (media >= 50) {
				if(media >= 70){
					return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
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
