package exercise_1.bank;

public class Account {

    public String owner;
    private double balance;
    protected int pin;
    String internalNote;


    public double getBalance() {
        return balance;
    }

    public void changePin(int pin){
        if(this.pin == pin){
            this.pin = pin;
        }
    }
}

