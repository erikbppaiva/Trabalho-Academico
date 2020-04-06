package Leitor;

import java.util.Scanner;

@SuppressWarnings("all")
public class Leitor {
	
	// int
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int lerInt(String msg) {
		System.out.print(msg);
		return lerInt();
	}
	//char
	public static char lerCaractere(String msg) {
		System.out.print(msg);
		return lerCaractere();
	}

	public static char lerCaractere() {
		return new Scanner(System.in).next().charAt(0);
	}
	
	//String
	public static String lerString(String msg) {
		System.out.print(msg);
		return lerString();
	}

	public static String lerString() {
		return new Scanner(System.in).nextLine();
	}
	
	//double
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();

	}
	public static double lerDouble(String msg) {
		System.out.print(msg);
		return lerDouble();
	}


}
