package observer;

public class Observer2 implements Observer {

	@Override
	public void atualizar(String mensagem) {
		System.out.println("Mensagem de Atualiza��o Observer2 :: " + mensagem);
		
	}

}
