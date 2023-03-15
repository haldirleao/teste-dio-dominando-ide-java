package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	public static void main(String[] args) {

//		int a = 2;
//		int b = 3;
//		System.out.println("Hello Wordl! " + (a+b));
//		System.out.println("Leaoh, 15/mar/2023");

		Gato gato = new Gato();
		Gato gato_preto = new Gato("Blackinho","preto", 3);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(gato_preto);
		System.out.println(livros);
	}
}

class Livros{
	private String nome;
	private String npag;
}
