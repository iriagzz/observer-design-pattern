package observer;

public interface Observable {
	//também chamado de "Subject" (GoF), "Observable" (java.util),"Source" ou "Event Source" (java.swing e java.beans)

	public void inscrever(Observer observer);
	
	public void desinscrever(Observer observer);
	
	public void notificar(String mensagem);
	
	
}
