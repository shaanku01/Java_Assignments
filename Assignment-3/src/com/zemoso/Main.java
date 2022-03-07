package com.zemoso;

import java.net.InetAddress;

public class Main {

    public static void fun1(String str){
        try{
            InetAddress address = InetAddress.getByName(str);
            boolean reachable = address.isReachable(10000);

            System.out.println("Is host reachable? " + reachable);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String str = "108.177.8.1";
        Main.fun1(str);

    }
}
