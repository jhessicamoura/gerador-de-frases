package application;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> frases = new ArrayList<String>();
		frases.add("As pessoas costumam dizer que a motiva��o n�o dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente");
		frases.add("Sacode a poeira e d� a volta por cima! S� tome cuidado com a rinite.");
		frases.add("V� atr�s dos seus objetivos com a mesma agilidade que voc� corre para o banheiro quando est� apertado.");
		frases.add("Se pizza que vem de moto demora, imagine quanto tempo seus sonhos v�o demorar pra chegar se voc� n�o sair do lugar!");
		frases.add("Se a vida te der uma rasteira, pegue a coberta, tire um cochilo e depois v� em busca dos seus sonhos.");
		frases.add("Viva como se fosse morrer, porque voc� vai.");
		
		int fraseAleatoria = (int) (Math.random() * frases.size());
		
		System.out.println("E a frase do dia �: " + frases.get(fraseAleatoria));
	}

}
