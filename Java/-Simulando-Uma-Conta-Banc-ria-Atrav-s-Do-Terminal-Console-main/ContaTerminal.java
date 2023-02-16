import java.util.Scanner;
public class ContaTerminal {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
//Variaveis
	int numero;
	String agencia;
	String nomeCliente;
	double  saldo = 237.48;
//Entrada de Dados
	System.out.println("Informe seu nome: ");
		nomeCliente = teclado.next();
	System.out.println("Informe o numero da conta: ");
		numero = teclado.nextInt();
	System.out.println("Informe a conta: ");
		agencia = teclado.next();
//Saida de Dados
	System.out.println("Olá,"+nomeCliente+"Obrigado por criar uma conta em nosso banco, sua agência é: "+agencia+", conta: "+numero+" e seu saldo "+saldo+" já está disponivel para saque.");
	}

}
