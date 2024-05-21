import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = leitura.nextLine();
        System.out.println("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = leitura.nextLine();
        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo no valor de " + saldo + " já está disponível para saque");

    }
}
