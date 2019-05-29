package ContaBancaria;

import Programa1.Cliente;

public class Programa {
    public static void main(String[] args) {
        Clientes c1 = new Clientes("Isaac G. Portes",01,"Av, São Paulo, 2200","isaacportes@gmail.com");
        Clientes c2 = new Clientes("Rebeca L. Portes",02,"Av, São Paulo, 2200","rebecaportes@gmail.com");

        Account account_isaac = new Account(001,2000.0f);
        Account account_rebeca = new Account(002,2000.0f);

        System.out.println("*************************//Account 001//*********************************");
        System.out.println(c1);
        System.out.println(account_isaac);
       // account_isaac.withdraw(1500.0f);
       // account_isaac.deposit(1500.0f);
        System.out.println("*************************//Account 002//*********************************");
        System.out.println(c2);
        System.out.println(account_rebeca);

        System.out.println("*************************//Transfer//*********************************");
        account_isaac.transferTo(account_rebeca, 1500);
        account_rebeca.transferTo(account_isaac,1000);
    }
}
