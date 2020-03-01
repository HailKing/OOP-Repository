package br.edu.ifpb.menu;

import br.edu.ifpb.conta.ContaCorrente;

public class Menu {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(10, "Hércules de Sousa", 150.99);
        System.out.printf("Dono da conta = %s\n", c1.getTitular());
        System.out.printf("Saldo da conta = %.2f\n", c1.getSaldo());

        c1.depositar(800.99);

        System.out.printf("Saldo da conta = %.2f\n", c1.getSaldo());

        c1.saque(50.35);

        System.out.printf("Saldo da conta = %.2f\n", c1.getSaldo());

        System.out.println(c1.getExtrato());
    }
}
