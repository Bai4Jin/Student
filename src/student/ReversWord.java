/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;
import java.util.Scanner;
/*author: Bai Jin */
/*added comment for fetch+merge*/
/*added comment for pull*/
public class ReversWord {
    public static void main(String[] args){
        char[] myArray=new char[7];
        myArray[0]='s';
        myArray[1]='t';
        myArray[2]='u';
        myArray[3]='d';
        myArray[4]='e';
        myArray[5]='n';
        myArray[6]='t';
        
       /* for(int i=0; i<myArray.length;i++)
             System.out.println(myArray[i]);
    }*/
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a word");
    String word = sc.nextLine();
    char[]myLetters= new char[word.length()];
    for(int i=0; i<myLetters.length;i++){
        
        myLetters[i]=word.charAt(i);
        System.out.println(myLetters[i]);
    }
    System.out.println();
    for(int i=myLetters.length-1 ; i>=0;i--){
        
        System.out.println(myLetters[i]);
    }
    
    
}
}
