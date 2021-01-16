package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum){
        amount = amount + sum;
        return amount;
    }

    public  void  withDraw(int sum){
        while (true){
            if (amount<sum){
                try{
                    throw new LimitException("запрашивая сумма больше чем остаток"+amount,amount);
                }catch (LimitException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }finally {
                    withDraw((int)amount);
                }
            }
            if (amount>=sum){
                amount=(int)(amount-sum);
                System.out.println("Снято "+sum);
                System.out.println("Left "+amount);
                System.out.println(amount);
                System.out.println("--------------");
            }
            if (amount==(double)0){
                break;
            }
        }
    }
}
