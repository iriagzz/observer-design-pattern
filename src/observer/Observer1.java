package observer;

public class Observer1 implements Observer{

	@Override
	public void atualizar(String mensagem) {
		System.out.println("Mensagem de Atualiza��o Observer1 :: " + mensagem);
		
	}

}
