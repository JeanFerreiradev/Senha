package beecrowd;

import java.util.Scanner;

public class Senha {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		int senha = 0;
		int tentativas = 0;
		System.out.println("Digite sua senha:");
		senha = console.nextInt();

		for (tentativas = 3; tentativas > 0; tentativas--) {
			if (senha != 2002) {
				System.out.println("Voc� tem mais " + tentativas + " tentativas!");
				System.out.println("Senha inv�lida, digite novamente:");
				senha = console.nextInt();
			}
		}

		if (tentativas == 0 && senha != 2002) {
			System.out.println("Conta bloqueada por quest�es de seguran�a! ");
		} else {
			System.out.println("Acesso permitido!");
		}

	}

}
