package Aula13Exe4;

/*4. Crie uma classe que represente um cart�o de cr�dito, que deve ter como atributos o seu limite, o
saldo da fatura e nome do cliente. Crie tamb�m os m�todos aumentaLimite(), diminuiLimite(),
realizaCompra() que n�o deve permitir uma compra caso o limite tenha sido atingido e o
imprimeFatura() que imprime na tela o valor da fatura.*/
public class ProgramaCartao {
	public static void main(String[] args) {
		CartaoDeCredito cartao = new CartaoDeCredito(2000,"Braulio Bonitao" );
		System.out.println("Bem vindo nosso caro "+ cartao.getNomeDoCliente());
		cartao.getLimite();
		cartao.aumentaLimite(7000);
		cartao.diminuirLimite(4000);
		System.out.println("O seu limite e "+cartao.getLimite());
	}
		
		
}
