package silva.sousa.hercules;

import java.util.Scanner;

public class testarMenu {
    public static void main(String [] args){
        menuCalculadora m1 = new menuCalculadora();
        calculadora c1 = new calculadora();
        double[] numeros = new double[2];
        boolean t = true;
        while(t){
            int opcao;
            double resultado;
            Scanner s1 = new Scanner(System.in);
            Scanner s2 = new Scanner(System.in);
            m1.exibirMenu();
            opcao = s1.nextInt();
            if(opcao < 5) numeros = m1.capturarNumeros();
            if(opcao == 1){
                resultado = c1.somar(numeros);
                System.out.println("Resultado = " + resultado);
            }
            if(opcao == 2){
                resultado = c1.subtrair(numeros);
                System.out.println("Resultado = " + resultado);
            }
            if(opcao == 3){
                resultado = c1.multiplicar(numeros);
                System.out.println("Resultado = " + resultado);
            }
            if(opcao == 4){
                resultado = c1.dividir(numeros);
                System.out.println("Resultado = " + resultado );
            }
            if(opcao == 5){
                double m = s1.nextDouble();
                c1.setMemoria(m);
            }
            if(opcao == 6){
                System.out.print(c1.getMemoria());
            }
            if(opcao == 7){
                System.out.print("Digite a nova descrição: ");
                String descricao = s2.nextLine();
                c1.setDescricao(descricao);
            }
            if(opcao == 8){
                System.out.println(c1.getDescricao());
            }
            if(opcao == 9) break;
        }
    }
}
