package aula;

public class Principal {
	public static void main(String[] args) {
	Estrutura e= new Estrutura();
	e.inserir(4);
	e.inserir(5);
	e.inserir(8);
	e.inserir(1);
	e.inserir(3);
	e.inserir(7);
	e.inserir(2);
	
	e.inOrdem();
	No n = new No();
			n= e.valorMinimo();
			System.out.println("\n Valor minimo : "+n.getValor());
			n=e.valorMaximo();
			System.out.println("\n Valor maximo: "+n.getValor());
			
	e.removerValorMinimo();
	System.out.println("\n");
	e.posOrdem();
}
}
