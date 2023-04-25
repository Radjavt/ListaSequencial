package lista;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ListaSequencial <Object> lista = new ListaSequencial<>(6);
		Random gerador = new Random();
		
		lista.iniciar();
		lista.incluirInicio(gerador.nextInt(20));
		lista.incluirInicio(gerador.nextInt(20));
		lista.incluirInicio(gerador.nextInt(20));
		lista.incluirFim(gerador.nextInt(20));
		int posicao = lista.localizador(5);
			if(posicao != -1) {
				System.out.println("Elemento encontrado na posição: "+posicao);
			}else {
				System.out.println("Elemento não encontrado.");
			}
			
		lista.excluir(6);
		
		for (int i = lista.getIL(); i <= lista.getFL(); i++) {
			System.out.print("["+lista.getLista()[i]+"]");
		}	
	}
}