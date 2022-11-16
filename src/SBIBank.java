package src;

public class SBIBank implements  Bank{
    int accNo;
    String name;
    int balance;
    double intrestRate;
    public SBIBank(int accNo,String name, int balance, double intrestRate){
        this.accNo=accNo;
        this.name=name;
        this.balance=balance;
        this.intrestRate=intrestRate;
    }
    @Override
    public void addMoney(int money) {
        balance=balance+money;
        System.out.println("Your Total Balance is: "+balance);
    }

    @Override
    public boolean withdraw(int money) {
        if(money<=balance){
            balance=balance-money;
            System.out.println(money+"WithDraw. Succefully");
            return true;
        }
        else{
            System.out.println("Your Insufficient Balance");
            return false;
        }

    }

    @Override
    public int checkBal() {
        System.out.println(balance);
        return this.balance;
    }

    @Override
    public double calculateIntrest() {

         return balance * intrestRate / 100;
    }
}
