public class Conta {

	//Vars
			private String agencia;
			private String numero;
			private double saldo;


		//Sets
			public void setAgencia(String agencia){
				this.agencia = agencia;
			}
			
			public void setNumero(String numero){
				this.numero = numero;
			}

			public void setSaldo(double saldo){
				this.saldo = saldo;
			}

			
		//Gets
			public String getAgencia(){
				return(agencia);
			}

			public String getNumero(){
				return(numero);
			}

			public double getSaldo(){
				return(saldo);
			}
	}
		
