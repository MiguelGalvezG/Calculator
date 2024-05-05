package com.example.Pruebas;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebasApplication {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa 2 números:");
		float num1 = sc.nextInt();
		float num2 = sc.nextInt();
		
		boolean salir = false; 
		while(!salir) {
			System.out.println("Ingresa una de las operacions:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Finalizar programa");
			
			int opcion = sc.nextInt();
			
			switch (opcion) {
				case 1: 
					System.out.println("La suma de los numeros es:"+(num1 + num2));
					break;
				case 2: 
					System.out.println("La resta de los numeros es:"+(num1 - num2));
					break;	
				case 3: 
					System.out.println("La multiplicación de los numeros es:"+(num1 * num2));
					break;
				case 4: 
					System.out.println("La división de los numeros es:"+(num1 / num2));
					break;
				case 5: 
					salir = true;
					break;
				default: 
					System.out.println("OPCIÓN NO VALIDA");
			}
			
		}
		}
	}

