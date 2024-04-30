import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por gentileza, informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe sua agência: ");
        String agencia = scanner.next();

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência: " + agencia);
        System.out.println("Sua conta: " + numeroConta);
        System.out.println("Seu saldo: R$" + saldo);

    }
}
