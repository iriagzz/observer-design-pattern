package observer;

public class Main {

	public static void main(String[] args) {
		// instanciar os observadores
		Observer1 o1 = new Observer1();
		Observer2 o2 = new Observer2();

		// criar quem ser� "observado"
		ConcreteObservable observable = new ConcreteObservable();

		// vincular os observadores ao observado
		observable.inscrever(o1);
		observable.inscrever(o2);

		// mudan�a de estado no observado -- para o1 e o2
		observable.notificar(Mensagem.INICIO);

		// desinscreve o2
		observable.desinscrever(o2);

		// apenas o1 recebe a notifica��o
		observable.notificar(Mensagem.TROCA_TURNO);

	}
}
