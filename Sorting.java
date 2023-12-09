import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Sorting {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
ArrayList<String> names = new ArrayList<>();
System.out.println("Enter names (type 'done' when finished):");
String nameInput = s.nextLine();
while (!nameInput.equalsIgnoreCase("done")) {
names.add(nameInput);
nameInput = s.nextLine();
}
if (names.isEmpty()) {
System.out.println("No names entered. Exiting...");
return;
}
System.out.println("Input:");
for (String name : names) {
System.out.println(name);
}
System.out.print("Order(A/D): ");
String order = s.nextLine();
if (order.equalsIgnoreCase("A")) {
Collections.sort(names);
} else if (order.equalsIgnoreCase("D")) {
Collections.sort(names, Collections.reverseOrder());
} else {
System.out.println("Invalid choice! Enter 'A' for ascending or 'D' for descending.");
return;
}
System.out.println("Sample Output:");
for (String sortedName : names) {
System.out.println(sortedName);
}
}
}
