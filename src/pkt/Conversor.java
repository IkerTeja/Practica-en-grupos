package pkt;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String choices="";
		String opciones="1º conversor de longitud"+"\n2º Conversor de peso"+ "\n3º Conversor de temperatura"; 
		
		System.out.println("Seleccione su opcion en el menu------------------------------\n"+ opciones);
		
        System.out.println("Seleccione la opción de conversión:");
        choices=scanner.nextLine();
        switch (choices) {
        case "1":
        	Coversor_long(scanner);
        	break;
        case "2":
        	Coversor_peso(scanner);
        	break;
        case "3":
        	break;
        default:{
        	System.out.println("Opcion no valida");
        	
        }
		
			
	}
        
	}
	public static void Coversor_peso(Scanner scanner) {
		
		double kg=0, libras=0;
	    
		System.out.println("Conversor de peso");
		System.out.println("1. Kilogramos a libras");
		System.out.println("2. libras a kilogramos");
		System.out.print("Elige una opción: ");
		int opcion = scanner.nextInt();
		
		if (opcion == 1) {
		    System.out.print("Ingresa el peso en kg: ");
		     kg = scanner.nextDouble();
		     libras = kg * 2.2;
		    System.out.println(" el valor introducido en kg equivale a " + libras + " libras.");
		} else if (opcion == 2) {
		    System.out.print("Ingresa el peso en libras: ");
		     libras = scanner.nextDouble();
		   	kg = libras / 2.2;
		   	System.out.println(" el valor introducido en libras equivale a " + kg + " kg.");
		} else {
		    System.out.println("Opción inválida. Por favor, elige 1 o 2.");
		}       
		scanner.close();
	}

	public static void Coversor_long(Scanner scanner) {
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


