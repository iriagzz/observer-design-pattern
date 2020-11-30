package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void inscrever(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void desinscrever(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notificar(String mensagem) {
		for (Observer observer : observers) {
			observer.atualizar(mensagem);
		}

	}

}
