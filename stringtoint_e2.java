import java.util.*;
import java.io.*;

class stringtoint_e2
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        try {
            int n = Integer.parseInt(str);
            System.out.println("Converted integer: " + n);
        } catch (Exception e) {
            System.out.println("Error: Input string is not a valid integer.");
}
}
}