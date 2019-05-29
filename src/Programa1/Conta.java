package Programa1;

import Programa1.Cliente;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;
    //private float transferencia;
    public Conta( int numero, Float saldo, Float limite, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void sacar (float valor) {
        if (valor <= (this.saldo )) {
            this.saldo = this.saldo - valor;
        } else if (valor <= this.saldo + this.limite) {
            float val_ret = this.saldo - valor;
            if (val_ret <= 0){
                this.saldo = 0;
            }
            val_ret = this.limite + val_ret;
            this.limite = val_ret;
            System.out.println("Entrou no limite especial");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

        public void deposito ( float valor){
            this.saldo = saldo + valor;
        }
        public float getSaldo(){
            return this.saldo + limite;
        }
        public float getLimite () {
            return this.limite;
        }

        // public float getTransferencia(float valor)
        // {if (valor <= (this.saldo )){
        //  this. saldo = (this.saldo - valor );
        // }else{
        //    System.out.println("Saldo insuficiente");
        //}


}
