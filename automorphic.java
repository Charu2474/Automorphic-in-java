import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner fr=new Scanner(System.in);
        int num=fr.nextInt();
        int sq=num*num;
        if(num>=0&&num<=9)
        {
            if(num%10!=sq%10)
            {
                System.out.println("Not Automorphic Number");
            }
            else
            {
                System.out.println("Automorphic Number");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
        
    }
}
