package Aula13Exe4;
/*4. Crie uma classe que represente um cartão de crédito, que deve ter como atributos o seu limite, o
saldo da fatura e nome do cliente. Crie também os métodos aumentaLimite(), diminuiLimite(),
realizaCompra() que não deve permitir uma compra caso o limite tenha sido atingido e o
imprimeFatura() que imprime na tela o valor da fatura.*/

public class CartaoDeCredito {
	private double  limite;
	private int saldoDaFatura;
	private String nomeDoCliente;

	CartaoDeCredito(double limite, String nomeDoCliente) {
		this.limite = limite;
		this.saldoDaFatura = 0;
		this.nomeDoCliente = nomeDoCliente;
	}

	public void relizarCompra(int valorDaCompra) {
		if (valorDaCompra <=  limite) {
			System.out.println("Compra Realizada com successo ");
			this.limite = limite - valorDaCompra;
			this.saldoDaFatura += valorDaCompra;

		} else {
			System.out.println("Compar não autorizada");
		}

	}

	public void aumentaLimite(double novoLimite) {
		this.limite += novoLimite;
	}
	public void diminuirLimite(double limiteReduzido) {
		this.limite -= limiteReduzido;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getSaldoDaFatura() {
		return saldoDaFatura;
	}

	public void setSaldoDaFatura(int saldoDaFatura) {
		this.saldoDaFatura = saldoDaFatura;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;

	}
}
