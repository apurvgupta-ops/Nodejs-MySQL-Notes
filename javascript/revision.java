package javascript;

class Solution {

    // !Patterns questions
    // ? Square pattern
    public void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    // ?Right angled triangle
    public void rightAngledTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ?Right angled triangle with incremental counting
    public void rightAngledTriangleCounting(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // ?Right angled triangle with same counting
    public void rightAngledTriangleSameCounting(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // ?Inverted Right Angled Triangle
    public void InvertedRightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ?Inverted Right angled triangle with incremental counting
}

public class revision {

    public static void main(String[] args) {
        int n = 5;
        Solution solver = new Solution();

        System.out.println("Square Pattern");
        solver.square(n);

        System.out.println("\nRight Angled Triangle");
        solver.rightAngledTriangle(n);

        System.out.println("\nRight Angled Triangle with incremental counting");
        solver.rightAngledTriangleCounting(n);

        System.out.println("\nRight Angled Triangle with same counting");
        solver.rightAngledTriangleSameCounting(n);

        System.out.println("\nInverted Right Angled Triangle");
        solver.InvertedRightAngledTriangle(n);
    }

    public static void main1(String[] args) {

    }
}
