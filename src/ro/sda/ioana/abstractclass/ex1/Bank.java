package ro.sda.ioana.abstractclass.ex1;

public abstract class Bank {
    private static final double TAX_VALUE = 0.15; //pt a def o ct folosim static si final

    public abstract double getBalance();

    public double getBalanceAfterTaxes(){
       double balance = getBalance();
       double tax = balance * TAX_VALUE;
       double newBalance = balance - tax;
       return newBalance;
    }

}
