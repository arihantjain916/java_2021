import java.util.Random;
import java.util.Scanner;

class game1 {
    int num;
    int intnum;
    int guess;

    game1() {
        Random rand = new Random();
        this.num = rand.nextInt(100);
    }

    void input() {
        System.out.print("Enter the number: ");
        Scanner n = new Scanner(System.in);
        intnum = n.nextInt();
        // n.close();
    }

    boolean checknum() {
        if (intnum == num) {
            System.out.println("Hurrah , You guess it right.");
            return true;
        } else if (intnum > num) {
            System.out.println("Please enter smaller number");
        } else if (intnum < num) {
            System.out.println("Please enter higher number");
        }
        return false;
    }
}

public class game {
    public static void main(String[] args) {
        // Guessing the number
        game1 g = new game1();
        boolean b = false;
        while (b == false) {
            g.input();
            b = g.checknum();
        }
    }
}
