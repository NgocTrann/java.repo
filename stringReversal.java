import java.util.Scanner;

public class stringReversal {
 public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();

    System.out.println("Enter String: ");
    String StringToReverse = userInput.next();

    int stringLength = StringToReverse.length();
    System.out.println("String Length: " + stringLength);

    String[] table = new String[stringLength];

    for ( int i = 0; i < stringLength; i++) {

        StringToReverse.charAt(i);   
        System.out.println(Character.toString(StringToReverse.charAt(i)));
        table[i] = Character.toString(StringToReverse.charAt(i));
    };


    
    // Print elements of the array 'table'
   // for (String str : table) {
       // System.out.println(str);
  //  };


    System.out.println("Table Length: " + table.length);

    for (int i = table.length - 1; i >= 0; i--) {
        System.out.println(table[i]);
        stringBuilder.append(table[i]);
    };

    System.out.println("Reversed: " + stringBuilder);

    userInput.close();

 };
}
