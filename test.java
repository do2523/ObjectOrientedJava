import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read a word
        String word = scan.next();
        System.out.println("Word is " + word);

        // Consume the remaining newline from the previous input
        scan.nextLine();

        // // Read a full line
        // String givenLine = scan.nextLine();
        // System.out.println("Line is " + givenLine);

        // // Read an integer
        // int givenInt = scan.nextInt();
        // System.out.println("Int is " + givenInt);

        scan.close();
    }
}