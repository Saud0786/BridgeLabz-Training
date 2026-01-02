package com.e_walletapplication;

//Abstraction for fund transfer behavior
public interface Transferrable{
 void transferTo(User receiver,double amount);
}

