import java.util.ArrayList;
import java.util.Arrays;

public class DigitsTester
{
    public static int passedTests = 0;
    public static int failedTests = 0;

    public static void main(String[] args)
    {
        System.out.println("--------- TEST constructor (part a) ---------");
        // TEST #1
        Digits d1 = new Digits(15704);
        ArrayList<Integer> expected1 = new ArrayList<Integer>(Arrays.asList(1, 5, 7, 0, 4));
        testDigits(expected1, d1.getDigitList(), 1);

        // TEST #2
        Digits d2 = new Digits(0);
        ArrayList<Integer> expected2 = new ArrayList<Integer>(Arrays.asList(0));
        testDigits(expected2, d2.getDigitList(), 2);

        // TEST #3
        Digits d3 = new Digits(980);
        ArrayList<Integer> expected3 = new ArrayList<Integer>(Arrays.asList(9, 8, 0));
        testDigits(expected3, d3.getDigitList(), 3);

        // TEST #4
        Digits d4 = new Digits(700256);
        ArrayList<Integer> expected4 = new ArrayList<Integer>(Arrays.asList(7, 0, 0, 2, 5, 6));
        testDigits(expected4, d4.getDigitList(), 4);

        // TEST #5
        Digits d5 = new Digits(9);
        ArrayList<Integer> expected5 = new ArrayList<Integer>(Arrays.asList(9));
        testDigits(expected5, d5.getDigitList(), 5);

        // TEST #6
        Digits d6 = new Digits(10);
        ArrayList<Integer> expected6 = new ArrayList<Integer>(Arrays.asList(1, 0));
        testDigits(expected6, d6.getDigitList(), 6);

        System.out.println("------- TEST isStrictlyIncreasing (part b) -------");
        // TEST #7
        testDecreasing(7, true, 7);

        // TEST #8
        testDecreasing(1356, true, 8);

        // TEST #9
        testDecreasing(1336, false, 9);

        // TEST #10
        testDecreasing(1536, false, 10);

        // TEST #11
        testDecreasing(65310, false, 11);

        // TEST #12
        testDecreasing(11234, false, 12);

        // TEST #13
        testDecreasing(456788, false, 13);

        // TEST #14
        testDecreasing(13579, true, 14);

        // TEST #15
        testDecreasing(55, false, 15);

        // TEST #16
        testDecreasing(52, false, 16);

        // TEST #17
        testDecreasing(58, true, 17);

        System.out.println("--------------------------------------------------");
        System.out.println("TOTAL PASSED TESTS: " + passedTests + " out of 17");
        System.out.println("TOTAL FAILED TESTS: " + failedTests + " out of 17");
    }

    public static void testDigits(ArrayList<Integer> expInv, ArrayList<Integer> actInv, int testNo)
    {
        System.out.print("TEST #" + testNo + " -- ");
        if (expInv.equals(actInv))
        {
            System.out.println("PASS");
            passedTests++;
        }
        else
        {
            System.out.println("*****FAIL*****");
            failedTests++;
        }
        System.out.println(" Expected: " + expInv);
        System.out.println("   Actual: " + actInv);
    }

    public static void testDecreasing(int digits, boolean expected, int testNo)
    {
        Digits dig = new Digits(digits);

        System.out.print("TEST #" + testNo + " -- ");
        boolean actual = dig.isStrictlyIncreasing();

        if (actual == expected)
        {
            System.out.println("PASS");
            passedTests++;
        }
        else
        {
            System.out.println("*****FAIL*****");
            failedTests++;
        }
        System.out.println(" Expected: " + expected);
        System.out.println("   Actual: " + actual);
    }
}