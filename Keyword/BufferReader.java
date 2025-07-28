package Keyword;

import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReader {
    public static void main(String[] args) {
        
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferReader bf = new BufferReader(in);

        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
