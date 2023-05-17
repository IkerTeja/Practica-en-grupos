package pkt;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Conversor de Longitud");
		System.out.println("1. Metros a Pies");
		System.out.println("2. Pies a Metros");
		System.out.print("Elige una opción: ");
		int opcion = scanner.nextInt();
		
		if (opcion == 1) {
		    System.out.print("Ingresa la longitud en metros: ");
		    double metros = scanner.nextDouble();
		    double pies = metros * 3.28084;
		    System.out.println(metros + " metros equivale a " + pies + " pies.");
		} else if (opcion == 2) {
		    System.out.print("Ingresa la longitud en pies: ");
		    double pies = scanner.nextDouble();
		    double metros = pies / 3.28084;
		    System.out.println(pies + " pies equivale a " + metros + " metros.");
		} else {
		    System.out.println("Opción inválida. Por favor, elige 1 o 2.");
		}       
		scanner.close();
	}

}
