import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        //Lê os valores de entrada
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //Atribui a alíquota de 5% mediante o salário
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100 && valorSalario <= 2500) {
            //Atribui a alíquota de 10% mediante o salário
            valorImposto = 0.10F * valorSalario;
        } else {
            //Atribui a alíquota de 15% mediante o salário
            valorImposto = 0.15F * valorSalario;
        }

        //Calcula e imprime a saída (com 2 casas decimais)
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
        
        //Fechar o Scanner
        leitorDeEntradas.close();
    }
}
