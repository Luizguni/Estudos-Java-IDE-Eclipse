package br.comjava;

public class TesteVariavel {

	public static void main(String[] args) {		
		String Copo = "Água Mineral";
		
		//Impressão dos dados do copo no console
		System.out.println(Copo);
		
		//Modifica o valor da Variável
		Copo = "Refrigerante";
		System.out.println(Copo);
		
		//Limpar a variável e o copo
		Copo = "";
		System.out.println(Copo);
		
		//Valor null para variável
		Copo = null;
		System.out.println(Copo);
	}

}
