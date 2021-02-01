package com.company;
import java.util.Scanner;
class string{
    public static int stringIntParse( String str ){
        int i = 0, number = 0;
        boolean negative = false;
        int length = str.length();
        if( str.charAt(0) == '-' ){
            negative = true;
            i = 1;
        }
        while( i < length ){
            number *= 10;
            number += ( str.charAt(i++) - '0' );
        }
        if( negative )
            number = -number;
        return number;
    }
}
public class Main {

    public static void main(String[] args){
	Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        double a=in.nextDouble();
        System.out.println("Enter you name");
        String s=in.next();
        System.out.println(a+"\n"+s);
        System.out.println("Enter a string");
        string pn=new string();
        String e=in.next();
        int c=pn.stringIntParse(e);

        System.out.println(c);
    }
}


