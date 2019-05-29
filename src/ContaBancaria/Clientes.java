package ContaBancaria;

public class Clientes {
    String nome;
    int numero;
    String endereco;
    String email;

    public Clientes(String nome, int numero, String endereco, String email) {
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
        this.email = email;
    }

    @Override
    public String toString() {
        return ("Nome: "+this.nome+ "\nNumero: "+this.numero+ "\nEndereço: "+ this.endereco+ "\nEmail: "+this.email);
    }
}

