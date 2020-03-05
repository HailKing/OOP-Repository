package br.edu.ifpb.menu;
import br.edu.ifpb.conta.ContaCorrente;
import java.util.Scanner;

public class Menu {

    public static void exibirMenu(){
        System.out.println("--- Projeto Conta Corrente ---");
        System.out.println("   1. Saque");
        System.out.println("   2. Depósito");
        System.out.println("   3. Saldo na tela");
        System.out.println("   4. Extrato");
        System.out.println("   5. Sair");
        System.out.println("------------------------------");
        System.out.print("   Digite uma opção: ");
    }

    public static void main(String[] args) {

        int opcao = -1;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        ContaCorrente c1 = new ContaCorrente(10, "João", 800.99);

        while(opcao != 5){
            exibirMenu();
            opcao = s1.nextInt();
            if(opcao == 1){
                System.out.print("\nDigite o valor do saque: ");
                double valor = s2.nextDouble();
                c1.saque(valor);
            }
            else{
                if(opcao == 2){
                    System.out.print("\nDigite o valor do depósito: ");
                    double valor = s2.nextDouble();
                    c1.depositar(valor);
                }
                else{
                    if(opcao == 3){
                        System.out.println("\n" + c1.getSaldo());
                    }
                    else{
                        if(opcao == 4){
                            System.out.print("\n");
                            System.out.println(c1.getExtrato());
                        }
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
