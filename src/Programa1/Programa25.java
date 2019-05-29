package Programa1;

import Programa1.Cliente;
import Programa1.Conta;

public class Programa25 {
    public static void main(String[] args) {

        Cliente isaac = new Cliente ("Isaac Portes", "Rua da paz 45");
        Cliente rebeca = new Cliente ("Rebeca Portes", "Rua da paz 45");

        Conta conta_isaac = new Conta (1, 100.0f,200.0f,isaac);
        Conta conta_rebeca = new Conta (2,300.0f,500.0f,rebeca);

        System.out.println("Saldo do Isaac R$  " + conta_isaac.getSaldo());
        System.out.println("Saldo da Rebeca R$ " +conta_rebeca.getSaldo());

        conta_isaac.sacar (110.0f);
        System.out.println("Saldo do Isaac Depois do saque R$  "+ conta_isaac.getSaldo());

        conta_rebeca.sacar(100.0f);
        System.out.println("Saldo do Rebeca Depois do saque R$  "+ conta_rebeca.getSaldo());
    }
}
