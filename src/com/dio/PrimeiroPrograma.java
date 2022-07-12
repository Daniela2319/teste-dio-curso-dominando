package com.dio;

import com.dio.mode.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros Livros = new Livros();
		
		System.out.println(gato);
		System.out.println(Livros);
		
		
		/*int a = 5;
		int b = 6;
		System.out.println("hello World" + "\n" + (a+b));*/
	}

}
class Livros {
	private String nome;
	private String npag;
}