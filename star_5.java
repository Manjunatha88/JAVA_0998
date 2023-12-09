import java.util.Scanner;
public class star_5 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the value of n: ");
int n = scanner.nextInt();
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= i; j++) {
System.out.print("1");
}
System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
for (int j = 1; j <= i; j++) {
System.out.print("1");
}            
System.out.println();
}
}
}