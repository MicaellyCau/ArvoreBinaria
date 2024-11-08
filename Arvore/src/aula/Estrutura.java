package aula;

public class Estrutura {

	private No raiz;

	public void inserir(int valor) {

		inserir(this.raiz, valor);
	}

	private void inserir(No no, int valor) {

		if (no != null) {
			if(valor<no.getValor()) {
				if(no.getEsquerda()!= null) {
					inserir(no.getEsquerda(), valor);
				}
				else{
					
					no.setEsquerda(new No(valor));
				}	
			}
			if(valor > no.getValor()) {
				if(no.getDireita() != null) {
					inserir(no.getDireita(),valor);
				}
				else {
					no.setDireita(new No(valor));
				}
			}
		}
		else {
			this.raiz = new No(valor);
		}
	}
	public void preOrdem() {
		preOrdem(this.raiz);
	}
	
public void preOrdem(No no) {
		
	if(no!= null) {
		System.out.println(no.getValor());
		preOrdem(no.getEsquerda());
		preOrdem(no.getDireita());
	}
	
	}
public void posOrdem() {
	posOrdem(this.raiz);
}
	
public void posOrdem(No no) {
	if(no!= null) {
		posOrdem(no.getEsquerda());
		posOrdem(no.getDireita());
		System.out.println(no.getValor());
	}
	

}	
public void inOrdem() {
	inOrdem(this.raiz);

}

public void inOrdem(No no) {
	if(no!=null) {
		inOrdem(no.getEsquerda());
		System.out.println(no.getValor());
		inOrdem(no.getDireita());
	}
}
public No valorMinimo() {
		return this.valorMinimo(raiz);
	}
	private No valorMinimo(No no) {
		if(no.getEsquerda()!= null) {
		no= valorMinimo(no.getEsquerda());
		}
		return no;
	}

	public No valorMaximo() {
		return this.valorMaximo(raiz);
	}
	public No valorMaximo(No no) {
	if(no.getDireita()!= null) {
		no= valorMaximo(no.getDireita());
	}
	return no;
}
	
	public No removerValorMinimo() {
		return this.removerValorMinino(raiz);
	}
	private No removerValorMinino(No no) {
	if(no.getEsquerda()==null) {
		return no.getDireita();
		
	}else {
		no.setEsquerda(removerValorMinino(no.getEsquerda()));
		return no;
	}
	
		
	}

}
