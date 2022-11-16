package src;

public interface Bank {
    public void addMoney(int money);
    public boolean withdraw(int money);
    public int checkBal();
    public double calculateIntrest();
}
