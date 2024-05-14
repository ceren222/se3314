public class App {
    public static void main(String[] args) {
        LoopControl loopControl = new LoopControl();
        ExampleUsage exampleUsage = new ExampleUsage();

        // Displaying the correct and incorrect variable usage
        System.out.println("Demonstrating correct variable usage:");
        loopControl.modifyIndexIncorrectly();
        System.out.println("\nDemonstrating incorrect variable usage:");
        loopControl.incorrectVariableUsage();

        // Demonstrating empty block usage
        System.out.println("\nDemonstrating empty block usage (should handle without output):");
        loopControl.avoidEmptyBlock();

        // Demonstrating modified control variable
        System.out.println("\nDemonstrating correctly modified control variable:");
        loopControl.modifyIndexIncorrectly();
        System.out.println("\nDemonstrating incorrectly modified control variable:");
        loopControl.modifiedControlVariable();

        // Calculating and displaying the sum of squares of the first 10 positive integers
        int sumOfSquares = loopControl.sumOfSquares();
        System.out.println("\nSum of squares of the first 10 positive integers: " + sumOfSquares);

        // Printing a right-angled triangle with height 5
        System.out.println("\nPrinting a right-angled triangle:");
        loopControl.printTriangle();

        // Demonstrating incorrect modification of loop control variable
        System.out.println("\nDemonstrating incorrect modification of loop control variable:");
        loopControl.modifyIndexIncorrectly();

        // Filtering and counting even numbers between 1 and 20
        System.out.println("\nFiltering and counting even numbers between 1 and 20:");
        exampleUsage.filterAndCountEvenNumbers();

        // Calculating and displaying the sum of diagonal elements of a 3x3 matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int diagonalSum = exampleUsage.matrixDiagonalSum(matrix);
        System.out.println("\nSum of diagonal elements of the 3x3 matrix: " + diagonalSum);

        // Using ExampleUsage class to show practical uses of loops
        System.out.println("\nDisplaying even numbers:");
        exampleUsage.displayEvenNumbers();

        // Summing an array
        System.out.println("\nSumming an array:");
        int sum = exampleUsage.sumArray();
        System.out.println("Total Sum: " + sum);

        // Processing a matrix
        System.out.println("\nProcessing a matrix:");
        exampleUsage.processMatrix();
    }
}
