public class LoopControl {

    // Method to demonstrate incorrect variable usage
    public void incorrectVariableUsage() {
        int index; // Variable declaration
        // Violation: Variable declaration and initialization are separated, violating VariableDeclarationUsageDistance rule
        System.out.println("Preparing to loop...");
        index = 0; // Variable assignment
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

    // Method to demonstrate empty block usage
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            }
            // No violation here; empty block handled correctly
        }
    }

    // Method to demonstrate incorrectly modified control variable
    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // Violation: Modifying loop control variable inside the loop
                System.out.println("to " + m);
            }
        }
    }

    // Method to calculate sum of squares of the first 10 positive integers
    public int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        return sum;
    }

    // Method to print a right-angled triangle made of asterisks with height 5
    public void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to demonstrate incorrectly modifying loop control variable
    public void modifyIndexIncorrectly() {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Modifying loop index from " + i);
                i += 2; // Violation: Modifying loop control variable inside the loop
                System.out.println("to " + i);
            }
        }
    }
}
