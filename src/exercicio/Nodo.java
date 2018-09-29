package exercicio;

public class Nodo {
	private int elemento;
	private Nodo next;
	
	public Nodo(int elemento, Nodo next) {
		this.elemento = elemento;
		this.next = next;
	}
	
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	
	public int getElement() {
		return this.elemento;
	}
	
	public void setNext(Nodo next) {
		this.next = next;
	}
	
	public Nodo getNext() {
		return this.next;
	}
}
