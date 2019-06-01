package ContaBancaria;

public class Account {

    int accountnum;
    private float balance;

    public Account(int accountnum, float balance) {
        this.accountnum = accountnum;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ("Account number: "+this.accountnum+"\nAccount Balance: "+this.balance);
    }

    public void withdraw(float value){
        if (value<= this.getBalance()){
            float newBalance = this.getBalance() - value;
            this.setBalance(newBalance);
            System.out.println("New Balance after withdraw: " + newBalance);
        }else {
            throw new RuntimeException("Saldo insuficiente");
        }
    }

    public void deposit(float value){
        float newBalance = this.getBalance() +value;
        System.out.println("Novo saldo : "+ newBalance);
        setBalance(newBalance);
}
    public void transferTo(Account destino, float value){
        this.withdraw(value);
        destino.deposit(value);
        System.out.println("Successful transfer ");

    }

}
