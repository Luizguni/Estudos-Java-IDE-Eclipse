package br.comjava;

public class TesteVariavel {

	public static void main(String[] args) {		
		String Copo = "�gua Mineral";
		
		//Impress�o dos dados do copo no console
		System.out.println(Copo);
		
		//Modifica o valor da Vari�vel
		Copo = "Refrigerante";
		System.out.println(Copo);
		
		//Limpar a vari�vel e o copo
		Copo = "";
		System.out.println(Copo);
		
		//Valor null para vari�vel
		Copo = null;
		System.out.println(Copo);
	}

}
