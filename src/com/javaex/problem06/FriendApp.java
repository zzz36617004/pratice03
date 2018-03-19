package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        
        String str0=sc.nextLine();
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        
        String a[]=str0.split(" ");
        String b[]=str1.split(" ");
        String c[]=str2.split(" ");
        
        
    	   friendArray[0]=new Friend(a[0],a[1],a[2]);
    	   friendArray[1]=new Friend(b[0],b[1],b[2]);
    	   friendArray[2]=new Friend(c[0],c[1],c[2]);
    	
    	   for(int i=0;i<3;i++) {
    	   friendArray[i].showInfo();
        }
        sc.close();
    }

}
