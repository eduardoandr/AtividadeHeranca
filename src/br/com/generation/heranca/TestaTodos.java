package br.com.generation.heranca;

public class TestaTodos {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro();
		Cavalo cav1 = new Cavalo();
		Preguica preg1 = new Preguica();
		
		dog1.setNome("Napole�o");
		dog1.setIdade(6);
		System.out.println("O cachorro se chama: " + dog1.getNome());
		System.out.println("\nEle tem " + dog1.getIdade() + " anos ");
		dog1.correr();
		dog1.emitir();
		
		cav1.setNome("Garanh�o");
		cav1.setIdade(3);
		System.out.println("\nO cavalo se chama: " + cav1.getNome());
		System.out.println("\nEle tem " + cav1.getIdade() + " anos ");
		cav1.correr();
		cav1.emitir();
		
		preg1.setNome("Prigui");
		preg1.setIdade(40);
		System.out.println("\nA pregui�a se chama: " + preg1.getNome());
		System.out.println("\nEla tem " + preg1.getIdade() + " anos ");
		preg1.emitir();
		preg1.subir();
		

	}
	

}

