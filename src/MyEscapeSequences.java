/*
Write a Java program to print the following columns of values. Use \t for the tabs between the columns.
Cost      Quantity   Total
$1,000.00   4       $4,000.00
$   50.00   8         $400.00
______________________________
TOTAL:      12      $4,400.00
 */


public class MyEscapeSequences {
    public static void main(String[] args) {
        System.out.println("Cost\tQuantity\tTotal\n$1000.00\t4\t$4000.00\n$  50.00\t8\t$400.00"
                +"\n___________________________\nTOTAL\t\t12\t$4,400.00");

    }
}
