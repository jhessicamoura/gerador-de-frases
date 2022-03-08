package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Path filePath = Paths.get("phrases.txt");

		try {
			List<String> phrases = Files.readAllLines(filePath);
			int sortedPhrase = (int) (Math.random() * phrases.size());
			System.out.println("E a frase do dia é: " + phrases.get(sortedPhrase));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
