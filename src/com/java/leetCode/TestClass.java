package com.java.leetCode;




///* IMPORTANT: Multiple classes and nested static classes are supported */

///*
//* uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes


class TestClass {
 public static void main(String args[] ) throws Exception {
     // /*
     //  * Read input from stdin and provide input before running
     //  * Use either of these methods for input

     //BufferedReader
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String line = br.readLine(),str1,str2;
	
     int N = Integer.parseInt(line);

     //Scanner
     // Scanner s = new Scanner(System.in);
     // int N = s.nextInt();

     for (int i = 0; i < N; i++) {
         // System.out.println("hello world"+N);
         String[] words=br.readLine().trim().split("\\s+");
         str1= words[0];
         str2= words[1];
         fun(str1,str2);
     }
 }
 
 public static void fun(String s1,String s2){
     int[] charcount1=new int[256];
     int[] charcount2=new int[256];
     for(char c:s1.toCharArray()){
         charcount1[c-'0']++;
     }
     for(char c:s2.toCharArray()){
         charcount2[c-'0']++;
     }
     for(int i=0;i<256;i++){
         if(charcount1[i]!=charcount2[i]){
             System.out.println("NO");
             return;
         }
     }
     System.out.println("YES");
     return;
 }
}
