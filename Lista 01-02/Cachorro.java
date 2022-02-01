package br.com.generation.interfacee;

public class Cachorro implements Animal{
	
	String nomeCachorro;
	
	Cachorro(String nome){
		nomeCachorro = nome;
		System.out.println(nomeCachorro);
	}

	@Override //--> sobrescrita de m�todo
	public void somAnimal() {
		System.out.println("Som do cachorro: auaua");		
	}

	@Override
	public void dormir() {
		System.out.println("Cachorro dormindo...");	
	}

	@Override
	public void comer() {
		System.out.println("Cachorro Comendo.....");		
	}

}
