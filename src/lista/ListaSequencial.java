package lista;

public class ListaSequencial <T> {

		//Sabendo que o TAD Lista Sequenciais é declarado como Lista 
		//e que possui as variáveis para início da lista e fim da lista
		//(IL e FL respectivamente, escreva o algoritmo, em java, para:
		// (a) Inicializar a lista;
		// (b) Incluir um elemento no início;
		// (c) Incluir um elemento no final;
		// (d) Localizar um elemento da lista; 
		// (e) Excluir um elemento da lista.
	 
	private T[] lista;
	private int IL, FL;
	
	public ListaSequencial(int tam) {
		lista = (T[])new Object[tam];
	}
	
	public void iniciar() {
		IL = -1;
		FL = -1;
	}

	public void incluirInicio(T base) {
		if (IL == -1) {
			IL++;
			FL++;
			lista[IL] = base;
		} else {
			for (int i = FL; i >= IL; i--) {
				lista[i + 1] = lista[i];
			}
			lista[IL] = base;
			FL++;
		}
	}

	public void incluirFim(T base) {
		if (FL == -1) {
			IL++;
			FL++;
			lista[FL] = base;
		} else {
			FL++;
			lista[FL] = base;
		}
	}
	
	public int localizador(T base) {
		for (int i = IL; i <= FL; i++) {
			if (lista[i].equals(base)) {
				return i;
			}
		}
		return -1;
	}

	public void excluir(T base) {
		int posicao = localizador(base);
		if (posicao == -1) {
			System.out.println("Dado não encontrado :( ");
			return;
		}

		for (int i = posicao; i < FL; i++) {
			lista[i] = lista[i + 1];
		}
		FL--;
	}
	
	public T[] getLista() {
		return lista;
	}

	public int getIL() {
		return IL;
	}

	public int getFL() {
		return FL;
	}
}