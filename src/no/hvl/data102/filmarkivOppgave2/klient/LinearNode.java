package no.hvl.data102.filmarkivOppgave2.klient;

public class LinearNode <T> {
	public T data;
	public LinearNode<T> neste;
	
	//start
	public LinearNode () {
		this.neste = null;
	}
	public LinearNode (T data) {
		this.data = data;
		this.neste = null;
	}
	
	public T getData() {
		return data;
	}
	public LinearNode<T> getNeste(){
		return neste;
	}
	
	public void setNeste(LinearNode<T> neste) {
		this.neste = neste;
	}
}
