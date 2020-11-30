package observer;

public class Observer1 implements Observer{

	@Override
	public void atualizar(String mensagem) {
		System.out.println("Mensagem de Atualização Observer1 :: " + mensagem);
		
	}

}
