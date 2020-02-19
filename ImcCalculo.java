package CalculoImc;
import java.util.Scanner;

public class ImcCalculo {
	public static void main(String[] args) {
		Scanner imput = new Scanner (System.in);

		System.out.println("Digite seu nome");
		String nome = imput.next();
	    System.out.println("Digite seu peso (Em Kilos)");
		Double peso = imput.nextDouble();
		System.out.println("Digite sua altura (Em metros)");
		Double altura = imput.nextDouble ();
		Double imc = peso / (altura*altura);
		
		if (imc <= 18.5) {
			System.out.println(nome +" Seu IMC �: " + imc + " Voc� est� abaixo do peso!");
		}
		
		if (imc >= 18.5 && imc <= 24.9) {
			System.out.println(nome +" Seu IMC �: " + imc + " Voc� est� no peso ideal, parab�ns!");
			
		}
		
		if (imc >= 25 && imc <= 29.9) {
			System.out.println(nome +" Seu IMC �: " + imc + " Voc� est� levemente acima do peso!");
			
		}
		
		if (imc >= 30 && imc <=34.9) {
			System.out.println(nome +" Seu IMC �: " + imc + " Voc� est� com grau de obesidade avan�ado n�vel 1!");
			
		}
		
		if (imc >= 35 && imc <= 39.9) {
			System.out.println(nome +" Seu IMC �: " + imc + " Voc� est� com grau de obesidade avan�ado n�vel 2!");
			
		}
		
		System.exit(0);

	}

}
