import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaoFilaThread extends Thread {
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {
		System.out.println("Fila Rodando");
		

		while(true) {
			Iterator iteracao = pilha_fila.iterator();
		synchronized (pilha_fila) {// Bloqueiar o acesso a esta lista por outro processo
			while (iteracao.hasNext()) {// enquanto conter dados na lista
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				// processar 10 mil notas fiscais
				// gerar lista enorme de pdfs
				// gerar envio em massa de email
				System.out.println(processar.getNomeString());
				System.out.println(processar.getEmailString());
				System.out.println("--------------------------------");
				iteracao.remove();
				try {
					Thread.sleep(100);// dar um tempo para descarga de memoria
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // processou toda List da um tempo para descarga memoria
			}
		}

	}
	}
	
}
