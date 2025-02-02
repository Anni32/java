import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int totalseconds = scanner.nextInt()*60*60 + scanner.nextInt()*60 + scanner.nextInt();;
        int totalseconds2 = scanner.nextInt()*60*60 + scanner.nextInt()*60 + scanner.nextInt();

        System.out.println(totalseconds2 - totalseconds);
    }
}
