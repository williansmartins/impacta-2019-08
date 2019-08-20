package br.com.impacta.model;

public class Clientes {

		private String nome;
		private int idade = 0;
		private EstadoCivil estadoCivil;
		
		public void calcular() {
			
			
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



		public EstadoCivil getEstadoCivil() {
			return estadoCivil;
		}



		public void setEstadoCivil(EstadoCivil estadoCivil) {
			this.estadoCivil = estadoCivil;
		}



		@Override
		public String toString() {
			return "Clientes [nome=" + nome + ", idade=" + idade + ", estadoCivil=" + estadoCivil + "]";
		}
		
}
