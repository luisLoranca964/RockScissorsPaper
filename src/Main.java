import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();
		//Se cambia de 1 a 2 en el print
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		// se quita escaner no necesario
		String j2 = s.nextLine();

		// se quita parentesis de mas
		if (j1 == j2) {
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2 == "tijeras") {
					g = 1;
				}

			case "papel":
				if (j2 == "piedra") {
					g = 1;
				}
				// se agrega llave de cierre del id
			case "tijera":
				if (j2.equals("papel")) {
					g = 1;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + g);
		}
		// se cierra escaner
		// se agrega formato al codigo para mejor lectura
		s.close();
	}
}
