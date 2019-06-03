package ContaBancaria;

import Programa1.Cliente;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        float valor;
        int contaOrigem;
        int contaDestino;


        Clientes c1 = new Clientes("Isaac G. Portes", 01, "Av, São Paulo, 2200", "isaacportes@gmail.com");
        Clientes c2 = new Clientes("Rebeca L. Portes", 02, "Av, São Paulo, 2200", "rebecaportes@gmail.com");
        Clientes c3 = new Clientes ("Nathan G. Portes",03,"Av,São Paulo,2200","nathanportes@gmail");

        Account account_isaac = new Account(001, 2000.0f);
        Account account_rebeca = new Account(002, 2000.0f);
        Account account_nathan = new Account(003,2000.0f);


        Map<Integer, Account> banco = new HashMap<>();
        banco.put(1,account_isaac);
        banco.put(2,account_rebeca);
        banco.put(3,account_nathan);

        Map<Integer, Clientes> clientes = new HashMap<>();
        clientes.put(01,c1);
        clientes.put(02 ,c2);
        clientes.put(03,c3);

        System.out.println("*************************//Menu//*********************************");

           do {
               System.out.println("Escolha uma opção \n 1.Depositar\n 2.Sacar\n 3.Transferir\n 4.Inprimir Informações de conta\n 5.Mostrar Saldo\n 0.Sair");
               valor = in.nextInt();
               if (valor == 1) {
                   System.out.println("*************************//DEPOSITAR//*********************************");
                   System.out.println("Quando você quer depositar?");
                   valor = in.nextInt();
                   System.out.println("Qual conta vai depositar? \n1. Isaac Portes \n2. Rebeca L. Portes\n3. Nathan Portes");
                   contaOrigem = in.nextInt();
                   banco.get(contaOrigem).deposit(valor);

               } else if (valor == 2) {
                   System.out.println("*************************//SACAR//*********************************");
                   System.out.println("Qual conta vai sacar? \n1. Isaac Portes \n2. Rebeca L. Portes \n3. Nathan Portes");
                   contaOrigem = in.nextInt();
                   System.out.println("Quanto quer sacar? ");
                   valor = in.nextInt();
                   banco.get(contaOrigem).withdraw(valor);

               } else if (valor == 3) {
                   System.out.println("*************************//TRANSFERENCIA//*********************************");
                   System.out.println("Qual conta de Origem ? \n1. Isaac Portes \n2. Rebeca L. Portes\n3. Nathan Portes");
                   contaOrigem = in.nextInt();
                   System.out.println("Qual conta de Destino ? \n1. Isaac Portes \n2. Rebeca L. Portes\n3. Nathan Portes");
                   contaDestino = in.nextInt();
                   System.out.println("Quanto vai transferir?");
                   valor = in.nextInt();
                   banco.get(contaOrigem).transferTo(banco.get(contaDestino),valor);

               }else if (valor == 4){
                   System.out.println("Qual conta você quer as informações?\n 1. Isaac G. Portes\n 2. Rebeca L. Portes\n 3. Nathan G. Portes");
                   contaOrigem = in.nextInt();
                  System.out.println(clientes.get(contaOrigem));
               }
               else if (valor == 5) {
                  System.out.println("what account do you want to see the balance?\n 1.Isaac G. Portes\n 2.Rebeca L. Portes\n 3.Nathan G. Portes");
                  contaOrigem = in.nextInt();
                  banco.get(contaOrigem).getBalance();
                  System.out.println("Current Account Balance: " + banco.get(contaOrigem).getBalance());

               } else {
               }
           }while (valor > 0);


            // account_isaac.withdraw(1500.0f);
            // account_isaac.deposit(1500.0f);
//            System.out.println("*************************//Account 002//*********************************");
//            System.out.println(c2);
//            System.out.println(account_rebeca);
//
//            System.out.println("*************************//Transfer//*********************************");
//            account_isaac.transferTo(account_rebeca, 1500);
//            account_rebeca.transferTo(account_isaac, 1000);


        }
    }

