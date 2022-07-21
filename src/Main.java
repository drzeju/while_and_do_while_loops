import java.util.*;

public class Main {
    public static void main(String[] args) {

// ===========================================  The sum of elements  ===================================================
// Find the sum of all elements of a sequence, ending with the number 0.
// The number 0 itself is not included into the sequence and serves as a sign of cessation.

//        Scanner scanner = new Scanner(System.in);
//
//        int number = 0;
//        int sum = 0;
//
//        do {
//            number = scanner.nextInt();
//            sum += number;
//        } while (number != 0);
//        System.out.println(sum);


// ===========================================  The smallest value  ====================================================
// A user inputs a long positive number m. You need to find out what is the smallest int number n such that n! > m.
// n!, or factorial n, is a product of all natural numbers from 1 to n inclusive: for example, 5! = 1 * 2 * 3 * 4 * 5.
// For example, the user enters 100. This means m = 100 and n = 5 because 5! = 120 (see the factorial formula)
// and this is the smallest number that satisfies the condition n! > m.
// Pay attention that the user may input a huge number so choose an appropriate data type!

//        Scanner scanner = new Scanner(System.in);
//
//        long number = scanner.nextLong();
//        long n = 1L;
//        int i = 1;
//
//        do {
//            n *= (i + 1);
//            i++;
//        } while (number >= n);
//        System.out.println(i);


// ===========================================  The length of the sequence  ============================================
// For its input, the program gets a sequence of non-negative integers; each integer is written in a separate line.
// The sequence ends with an integer 0; when the program reads 0,
// it should end its work and output the length of the sequence (not counting the final 0).
// Don’t read numbers following the number 0.

//        Scanner scanner = new Scanner(System.in);
//
//        int stop = 0;
//        int i = 0;
//
//        int number = scanner.nextInt();
//
//        while (number != stop && number > stop) {
//            number = scanner.nextInt();
//            i++;
//        }
//        System.out.println(i);


// ===========================================  Squares of natural numbers  ============================================
// Read an integer number N from the input and print all the squares of positive integers:
//    less than or equal to N,
//    in ascending order.

//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int i = 1;
//
//        while (a >= i * i && i > 0) {
//            System.out.println(i * i);
//            i++;
//        }


// ===========================================  The largest element of a sequence  =====================================
// Given a sequence of positive integer numbers (which ends with the number 0). Find the largest element of the sequence.
// The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.

//        Scanner scanner = new Scanner(System.in);
//
//        int value = scanner.nextInt();
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        while (value != 0) {
//            numbers.add(value);
//            value = scanner.nextInt();
//        }
//
//        Integer maxValue = Collections.max(numbers);
//        System.out.println(maxValue);


// ===========================================  The sequence  ==========================================================
// You are given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
// As input, the program gets the number of elements in the sequence, and then the elements themselves.
// In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000.
// The program should print a single number: the maximum element of the sequence divisible by 4.
// Try to solve this problem by using a while-loop.

//        Scanner scanner = new Scanner(System.in);
//
//        int elementsNumber = scanner.nextInt();
//        int num = scanner.nextInt();
//        int i = 1;
//        int j = 0;
//
//        int [] numbers = new int [elementsNumber];
//        int [] numDividableByFour = new int[elementsNumber];
//
//        while (i < elementsNumber) {
//            numbers [i] = num;
//            num = scanner.nextInt();
//            i++;
//        }
//
//        while (j < elementsNumber) {
//            if (numbers [j] % 4 == 0) {
//                numDividableByFour [j] = numbers [j];
//            }
//            j++;
//        }
//
//        int maxDiv = Arrays.stream(numDividableByFour).max().getAsInt();
//
//        System.out.println(maxDiv);


// ===========================================  Collatz conjecture  ====================================================
// Given natural number n not exceeding 1_000_000, generate a sequence of integers, described in the Collatz conjecture:
// If n is an even number, divide it in half; if it is odd, multiply it by 3 and add 1.
// Repeat this operation until we get the number 1 as a result.
// For example, if the number n = 17, then the sequence looks as the following:
// 17 52 26 13 40 20 10 5 16 8 4 2 1
// It was proved that such a sequence will stop at number 1 for any initial natural number n up to 2^68.

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.print(a);
        System.out.print(" ");

        while (a > 1) {
            if (a % 2 == 0) {
                a /= 2;
                System.out.print(a);
            } else {
                a *= 3;
                a++;
                System.out.print(a);
            }
            System.out.print(" ");
        }

    }
}