package ContaBancaria;

import Programa1.Cliente;

import java.util.Scanner;

public class Programa {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        float valor;
        int conta;


        Clientes c1 = new Clientes("Isaac G. Portes", 01, "Av, São Paulo, 2200", "isaacportes@gmail.com");
        Clientes c2 = new Clientes("Rebeca L. Portes", 02, "Av, São Paulo, 2200", "rebecaportes@gmail.com");
        Clientes c3 = new Clientes ("Nathan G. Portes",03,"Av,São Paulo,2200","nathanportes@gmail");

        Account account_isaac = new Account(001, 2000.0f);
        Account account_rebeca = new Account(002, 2000.0f);
        Account account_nathan = new Account(003,2000.0f);

        System.out.println("*************************//Menu//*********************************");

           do {
               System.out.println("Escolha uma opção \n 1.Depositar\n 2.Sacar\n 3.Transferir\n 4.Inprimir Informações de conta\n 0.Sair");
               valor = in.nextInt();
               if (valor == 1) {
                   System.out.println("*************************//DEPOSITAR//*********************************");
                   System.out.println("Quando você quer depositar?");
                   valor = in.nextInt();
                   System.out.println("Qual conta vai depositar? \n01 Isaac Portes \n02 Rebeca Portes\n03 Nathan Portes");
                   conta = in.nextInt();
                   if (conta == 1) {
                       account_isaac.deposit(valor);
                   } else if (conta == 2) {
                       account_rebeca.deposit(valor);
                   }else if (conta == 3){
                       account_nathan.deposit(valor);
                   }
               } else if (valor == 2) {
                   System.out.println("*************************//SACAR//*********************************");
                   System.out.println("Qual conta vai sacar? \n01 Isaac Portes \n02 Rebeca Portes \n03 Nathan Portes");
                   conta = in.nextInt();
                   System.out.println("Quanto quer sacar? ");
                   valor = in.nextInt();
                   if (conta == 1) {
                       account_isaac.withdraw(valor);
                   } else if (conta == 2) {
                       account_rebeca.withdraw(valor);
                   }else if (conta == 3){
                       account_rebeca.withdraw(valor);
                   }
                   else {
                       System.out.println("Transferencia cancelada");
                   }
               } else if (valor == 3) {
                   System.out.println("*************************//TRANSFERENCIA//*********************************");
                   System.out.println("Qual conta vai transferir ? \n01 Isaac Portes \n02 Rebeca Portes\n 03Nathan Portes");
                   valor = in.nextInt();
                   System.out.println("Quanto vai transferir?");
                   conta = in.nextInt();
                   if (conta == 1) {
                       account_rebeca.transferTo(account_isaac, valor);
                       System.out.println("Successful transfer\n Novo  saldo: " + account_isaac + valor);
                   } else if (conta == 2) {
                       account_isaac.transferTo(account_rebeca, valor);
                       System.out.println("Successful transfer\n Novo saldo: " + account_rebeca + valor);
                   }else if(conta == 3){

                   }
               }else if (valor == 4){
                   System.out.println("Qual conta você quer as informações?\n 01 Isaac G. Portes\n 02 Rebeca L. Portes\n 03 Nathan G. Portes");
                   conta = in.nextInt();
                   if (conta == 1){
                       System.out.println(c1);
                   }else if (conta == 2){
                       System.out.println(c2);
                   }else if (conta == 3){
                       System.out.println(c3);
                   }
               }
               else if (valor == 0) {
                   System.out.println("Tchau");
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

