import java.util.*;
public class a8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int number = sc.nextInt();
        sc.close();

        Thread palindromeThread = new Thread(() -> {
            int num = number;
            int reversedNumber = 0;
            while (num > 0) {
                int digit = num % 10;
                reversedNumber = reversedNumber * 10 + digit;
                num =num/10;
            }
            if (number == reversedNumber) {
                System.out.println(number + " is a palindrome .");
            } else {
                System.out.println(number + " is not a palindrome .");
            }
        });
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is a composite number.");
        }
        palindromeThread.start();
    }
}
