import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        System.out.print("Enter an index: ");
        int index = sc.nextInt();

        //calc length
        System.out.println("The length of "+word+" is: "+word.length());

        //calc index
        if(index <= word.length()) {
            System.out.println("The substring from 0 to " + index + " is: " + word.substring(0, index));
        } else {
            System.out.println("Index is larger than length.");
        }

    }
}
