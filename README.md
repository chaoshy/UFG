UFG
===

Atividades de SI - UFG

public class Pessoa{
	
	//Vars
		private String nome;
		private int idade;
		private String cidade;
		private String estado;
		private double peso;


	//Sets
		public void setNome(String nome){
			this.nome = nome;
		}
		
		public void setIdade(int idade){
			this.idade = idade;
		}

		public void setCidade(String cidade){
			this.cidade = cidade;
		}

		public void setEstado(String estado){
			this.estado = estado;
		}

		public void setPeso(double peso){
			this.peso = peso;
		}

		
	//Gets
		public String getNome(){
			return(nome);
		}

		public int getIdade(){
			return(idade);
		}

		public String getCidade(){
			return(cidade);
		}

		public String getEstado(){
			return(estado);
		}

		public double getPeso(){
			return(peso);
		}
}
	
