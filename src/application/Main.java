package application;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> frases = new ArrayList<String>();
		frases.add("As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente");
		frases.add("Sacode a poeira e dá a volta por cima! Só tome cuidado com a rinite.");
		frases.add("Vá atrás dos seus objetivos com a mesma agilidade que você corre para o banheiro quando está apertado.");
		frases.add("Se pizza que vem de moto demora, imagine quanto tempo seus sonhos vão demorar pra chegar se você não sair do lugar!");
		frases.add("Se a vida te der uma rasteira, pegue a coberta, tire um cochilo e depois vá em busca dos seus sonhos.");
		frases.add("Viva como se fosse morrer, porque você vai.");
		
		int fraseAleatoria = (int) (Math.random() * frases.size());
		
		System.out.println("E a frase do dia é: " + frases.get(fraseAleatoria));
	}

}
