
// TestaConta.java
// Cria e manipula um objeto de Conta
import java.util.Scanner;

public class TestaConta {
	public static void main(String[] args) {
		// Cria um objeto Scanner para obter dados do usu�rio
		Scanner entrada = new Scanner(System.in);

		// cria dois objetos de Conta
		Conta conta1 = new Conta("João da Silva", 50.0);
		Conta conta2 = new Conta("Maria de Souza", -7.53);

		// exibe o saldo inicial de cada objeto
		System.out.printf("O saldo de %s é: $%.2f %n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("O saldo de %s é: $%.2f %n", conta2.getNome(), conta2.getSaldo());

		// prompt
		System.out.printf("Entre quantia de depósito para a conta de %s: ", conta1.getNome());
		double quantiaDeposito = entrada.nextDouble(); // obtém entrada do usuário

		System.out.printf("%nAdicionando %.2f ao saldo da conta 1 %n%n", quantiaDeposito);
		conta1.deposita(quantiaDeposito); // adiciona o saldo à conta1

		// exibe os saldos
		System.out.printf("O saldo de %s é: $%.2f %n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("O saldo de %s é: $%.2f %n", conta2.getNome(), conta2.getSaldo());

		System.out.printf("Entre quantia de depósito para a conta de %s: ", conta2.getNome());
		quantiaDeposito = entrada.nextDouble(); // obtém entrada do usuário

		System.out.printf("%nAdicionando %.2f ao saldo da conta 2 %n%n", quantiaDeposito);
		conta2.deposita(quantiaDeposito); // adiciona o saldo à conta1

		System.out.printf("O saldo de %s é: $%.2f %n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("O saldo de %s é: $%.2f %n", conta2.getNome(), conta2.getSaldo());

		System.out.printf("Entre a quantia de saque para a conta de %s: ", conta1.getNome());
		double quantiaSaque = entrada.nextDouble();

		System.out.printf("%nSacando %.2f do saldo da conta 1 %n%n", quantiaSaque);
		conta1.saque(quantiaSaque);

		System.out.printf("O saldo de %s é: $%.2f %n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("O saldo de %s é: $%.2f %n", conta2.getNome(), conta2.getSaldo());

		System.out.printf("Entre a quantia de saque para a conta de %s: ", conta2.getNome());
		quantiaSaque = entrada.nextDouble();

		System.out.printf("%nSacando %.2f do saldo da conta 2 %n%n", quantiaSaque);
		conta2.saque(quantiaSaque);

		System.out.printf("O saldo de %s é: $%.2f %n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("O saldo de %s é: $%.2f %n", conta2.getNome(), conta2.getSaldo());

		entrada.close();
	}
}
