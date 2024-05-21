import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o 1° parâmetro:");
        int primeiroParametro = terminal.nextInt();

        System.out.println("Informe o 2° parâmetro:");
        int segundoParametro = terminal.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }


    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        // validar se primeiroParametro é MAIOR que segundoParametro e lançar a exceção
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = segundoParametro - primeiroParametro;
        // realizar o 'for' para imprimir os números com base na variável 'contagem'
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
