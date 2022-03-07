package com.zemoso;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine().toLowerCase();
        int arr[] = new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<str.length();i++){
            int index = str.charAt(i);
            System.out.println(index);
            if(index==32)
                continue;
            arr[index-97] = 1;

        }
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                flag = 1;

            }
        }
        if(flag==1){
            System.out.println("It doesnot contain all the alphabets");
        }else{
            System.out.println("It  contains all the alphabets");
        }

    }
}
