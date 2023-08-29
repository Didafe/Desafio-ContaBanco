import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("=================================================");
       System.out.println("Programa: Por favor, digite seu nome:");
       System.out.println("=================================================\n");
       System.out.print("Usuário: ");
       String nomeCliente = scan.next();
       
       System.out.println("=================================================");
       System.out.println("Programa: Por favor, digite o número da agência:");
       System.out.println("=================================================\n");
       System.out.print("Usuário: ");
       String numeroAgencia = scan.next();

       System.out.println("=================================================");
       System.out.println("Programa: Por favor, digite o número da conta:");
       System.out.println("=================================================\n");
       System.out.print("Usuário: ");
       int numeroConta = scan.nextInt();

       System.out.println("=================================================");
       System.out.println("Programa: Por favor, digite o saldo:");
       System.out.println("=================================================\n");
       System.out.print("Usuário: ");
       double saldo = scan.nextDouble();

       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já disponível.");
    }
}
