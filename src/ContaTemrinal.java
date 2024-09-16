import java.util.Scanner;

public class ContaTemrinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o número da Agência: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}