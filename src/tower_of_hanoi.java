public class tower_of_hanoi {
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char src, char dest, char helper) {
        if (n == 0) {
            return;
        }
        // Will print instruction without violation the rule.
        hanoi(n - 1, src, helper, dest);
        // This will move n-1 disc from src to dest using helper.
        System.out.println("Move from " + src + " to " + dest);
        hanoi(n - 1, helper, dest, src);

        // ---> Here we only taken the output from In Order <---
    }
}