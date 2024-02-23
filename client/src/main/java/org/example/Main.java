package org.example;

import proxy.BanqueService;
import proxy.Compte;
import  proxy.BangueWs;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BanqueService stub=new  BangueWs().getBanqueServicePort();
        System.out.println(stub.convert(3300));
}
}