package algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		for(int i = 100; i <= 200; i++) {
			array.add(i);
		}
		
		Scanner scan = new Scanner(System.in);
		Integer numberInserted = scan.nextInt();
		scan.close();
		
		
		Integer baixo = 0;
		Integer alto = array.size() - 1;
		Integer meio = 0;
		Integer chute = 0;
		
		while(baixo <= alto) {
			meio = (baixo + alto) / 2;
			chute = array.get(meio);
			
			if(chute.equals(numberInserted)) {
				System.out.println("Achei o seu número, ele é o " + chute);
				break;
			} else if(chute < numberInserted) {
				System.out.println("Tentativa feita");
				baixo = meio + 1;
			} else if(chute > numberInserted) {
				System.out.println("Tentativa feita");
				alto = meio - 1;
			}
		}
		
		
	}

}
