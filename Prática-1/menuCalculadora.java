package silva.sousa.hercules;

import java.util.Scanner;

public class menuCalculadora {
    public void exibirMenu(){
        System.out.println("               Calculadora");
        System.out.println("===========================================");
        System.out.println("1.Somar");
        System.out.println("2.Subtrair");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Gravar na memória");
        System.out.println("6.Ler número na memória");
        System.out.println("7.Alterar descrição sobre a calculadora");
        System.out.println("8.Consultar descrição sobre a calculadora");
        System.out.println("9.Sair");
        System.out.print("Digite uma opção: ");
    }

    public double[] capturarNumeros(){
        double n1, n2;
        double[] n = new double[2];
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = s1.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = s2.nextDouble();
        n[0] = n1;
        n[1] = n2;
        return n;
    }

}
