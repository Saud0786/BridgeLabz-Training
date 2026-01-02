package com.e_walletapplication;

public class EWalletApp{
    public static void main(String[] args){

        User u1=new User(1,"Ayaan",new PersonalWallet(5000,200));
        User u2=new User(2,"Sara",new BusinessWallet(10000));

        u1.getWallet().transferTo(u2,1000);
        u2.getWallet().transferTo(u1,2000);

        System.out.println("Ayaan Balance:"+u1.getWallet().getBalance());
        System.out.println("Sara Balance:"+u2.getWallet().getBalance());
    }
}

