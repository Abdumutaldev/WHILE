package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s1=1,s2=0;
        int i=1,j=1;
        while (i<=n){
            while (j<=i){
                s1 *= j;
                j++;
            }
            s2+=s1;
            s1=1;
            j=1;
            i++;
        }
        System.out.println(s2-1);


    }
}
