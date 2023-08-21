import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o nome do Cliente !");
        sc.nextLine();
        nomeCliente = sc.nextLine().toUpperCase();
        System.out.println("Por favor, digite o saldo !");
        saldo = sc.nextDouble();

        System.out.println("Olá "
                + nomeCliente
                + ",  \nobrigado por criar uma conta em nosso banco ,\nsua agência é "
                + agencia + ", conta  "
                + numeroConta + " \ne seu saldo R$"
                + String.format("%.2f", saldo) + " já está disponível para saque.");

        sc.close();
    }
}
