package com.company;

import com.company.mylib.Account;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("piotr Gołabek");
        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
        System.out.println(acc.getName());
    }
}
