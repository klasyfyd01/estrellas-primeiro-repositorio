package Aula13Exe4;
/*4. Crie uma classe que represente um cartão de crédito, que deve ter como atributos o seu limite, o
saldo da fatura e nome do cliente. Crie também os métodos aumentaLimite(), diminuiLimite(),
realizaCompra() que não deve permitir uma compra caso o limite tenha sido atingido e o
imprimeFatura() que imprime na tela o valor da fatura.*/

public class CartaoDeCredito4 {
	int limite;
	int saldoDaFatura;
	String nomeDoCliente;

	private CartaoDeCredito4(int limite, String nomeDoCliente) {
		super();
		this.limite = limite;
		this.saldoDaFatura = 0;
		this.nomeDoCliente = nomeDoCliente;
	}

	public void relizarCompra(int limit, int valorDaCompra) {
		if (valorDaCompra < limit) {
			System.out.println("Compra Realizada com successo ");
			this.limite = limite - valorDaCompra;
			this.saldoDaFatura += valorDaCompra;
		}
	}

	public void aumentaLimite(int limite, int saldoDaFatura) {
		if (saldoDaFatura == limite) {
			System.out.println("aumentaLimite");
		
		}
	}
}
