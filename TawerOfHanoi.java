import java.util.Scanner;

public class TawerOfHanoi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter number of disks:  ");
        int n = input.nextInt();
        // find the solution recursively
        System.out.println("the moves are:  ");
        moveDisks(n, 'A', 'B', 'C');

    }

    // method to find the solution to move n disks from fromtower
    // to totower with auxtower
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {

        if (n == 1) // stopping condition
            System.out.println("move disks " + n + " from " + fromTower + " to " + toTower);
        else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);

        }
    }
}
