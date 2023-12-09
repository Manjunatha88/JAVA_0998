import java.util.Scanner;
class reverseword {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter a word: ");
String word = s.nextLine();
String reversedWord = reverse(word);
System.out.println("Reversed word: " + reversedWord);
s.close();
}
public static String reverse(String word) {
char[] characters = word.toCharArray();
int start = 0;
int end = characters.length - 1;
while (start < end) {
char temp = characters[start];
characters[start] = characters[end];
characters[end] = temp;
start++;
end--;
}
return new String(characters);
}
}
