package com.e_walletapplication;


// Personal wallet with no tax
public class PersonalWallet extends Wallet{

    public PersonalWallet(double balance){
        super(balance);
    }

    public PersonalWallet(double balance,double bonus){
        super(balance,bonus);
    }

    @Override
    public void transferTo(User receiver,double amount){
        if(getInternalBalance()>=amount){
            debit(amount);
            receiver.getWallet().credit(amount);
            Transaction.log("Personal transfer of "+amount);
        }
    }
}
