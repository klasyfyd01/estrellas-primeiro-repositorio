package aula15Exe1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Color {
	/*
	 * 1. Escreva um programa em Java que crie um ArrayList adicione algumas cores
	 * (string) e as imprima na tela.
	 */
	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String >();
		color.add("blue");
		color.add ("green");
		color.add("red");
		color.add("yellow");

		/**Scanner input = new Scanner(System.in);
		String color = input.nextLine();

		color = "";
		while (color.equals("preto")) {
			System.out.println("Core invaldio");

		}**/
		
		
		for(String color1 : color) {
		System.out.println(color1);	
		}
	}
}
