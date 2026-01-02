package com.e_walletapplication;

// Business wallet with transaction tax
public class BusinessWallet extends Wallet{

    public BusinessWallet(double balance){
        super(balance);
    }

    public BusinessWallet(double balance,double bonus){
        super(balance,bonus);
    }

    @Override
    public void transferTo(User receiver,double amount){
        double tax=amount*0.02;
        double total=amount+tax;
        if(getInternalBalance()>=total){
            debit(total);
            receiver.getWallet().credit(amount);
            Transaction.log("Business transfer of "+amount+" with tax "+tax);
        }
    }
}

