package CodingBlocks.Fundamentals.December.SixteenDecember.TimeComplexity;

/*
 * Here are some common conditions for loops that can determine time complexity:
 * i = i + k where k is a constant: O(n)
 * i = i * k where k is a constant: O(log_k(n))
 * n = n / k where k is a constant: O(log_k(n))
 * n = n - k where k is a constant: O(ceil(n/k))
 * i = 2^i: O(log(n))
 * i = i^2: O(sqrt(n))
 * i = i^3: O(n^(1/3))
 * i = i + (n-i)/2: O(n)
 * i = i * 2, i = i * 3, i = i * 5, ... (i multiplied by a series of primes): O(log_2(n))
 * i = i * 2, i = i * 4, i = i * 8, ... (i multiplied by powers of 2): O(log(n))
 * i = i + a * k where k is a constant and a is a variable: O(n)
 * i = i * a^k where a is a constant and k is a variable: O(log_a(n))
 * n = n / a^k where a is a constant and k is a variable: O(log_a(n))
 * i = 2^k where k is a variable: O(log_2(n))
 * i = 3^k where k is a variable: O(log_3(n))
 * i = n^c where c is a constant: O(n^c)
 * n = n - a^k where a is a constant and k is a variable: O(n^(1/k)) */

public class WhilesA {
    public static void main(String[] args) {
//        WhileOne();
//        WhileTwo();
//        WhileThree();
//        WhileFour();
        WhileFive();
    }

    static void WhileOne( ) {
        int i = 1;
        int n = 10;
        while ( i < n ) {
            System.out.println(i);
            i = i + 1;
        }
    }

    static void WhileTwo( ) {
        int i = 1;
        int n = 10;
        while ( i <= n ) {
            i = i + 2;
            System.out.println(i);
        }
    }
    /*
     * In this case, the value of i increases by 2 in each iteration, so the
     * number of iterations is equal to floor(n/2). The time complexity of the
     * loop would be O(floor(n/2)), because the number of iterations is
     * proportional to floor(n/2). */

    static void WhileThree( ) {
        int i = 1;
        int n = 10;
        int k = 2;
        while ( i <= n ) {
            i = i + 2;
            i = i + 3;
            System.out.println(i);
        }
    }

    static void WhileFour( ) {
        int i = 1;
        int n = 10;
        int k = 2;
        while ( i <= n ) {
            i = i + k;
            System.out.println(i);
        }
    }
    /*
     * The time complexity of this code is O(n/k), where n is the value of
     * the variable "n" and k is the value of the variable "k".
     * In each iteration of the while loop, the value of i is increased by k,
     * so it will take n/k iterations to reach a value of n or greater. The
     * operation inside the loop is a constant time operation (i.e. printing
     * to the console), so the total time complexity is O(n/k). */

    static void WhileFive( ) {
        int i = 1;
        int n = 10;
        while ( i <= n ) {
            i = i * 2;
            System.out.println(i);
        }
    }
    /*
     * The time complexity of this code is O(log n), where n is the value of
     * the variable "n".
     * In each iteration of the while loop, the value of i is doubled, so it
     * will take log2(n) iterations to reach a value of n or greater. The
     * operation inside the loop is a constant time operation (i.e. printing
     * to the console), so the total time complexity is O(log n). */

    static void WhileSix( ) {
        int i = 1;
        int n = 10;
        while ( i <= n ) {
            i = i * 3;
            System.out.println(i);
        }
    }
    /*
     * The time complexity of the code above is O(log_3(n)). This is because
     * each iteration of the loop multiplies i by 3, and the loop continues
     * until i is greater than n. The number of times the loop will iterate
     * before i is greater than n can be calculated as log_3(n), where log_3
     * is the logarithm to the base 3. This logarithmic time complexity makes
     * the code efficient and fast, especially as n gets very large.
     *  */

    static void WhileSeven( ) {
        int i = 1;
        int n = 10;
        while ( i <= n ) {
            i = i * 2;
            i = i * 3;
            System.out.println(i);
        }
    }
    /*
     * The time complexity of the code above is O(log_2(n)), because each
     * iteration of the loop multiplies i by 2, and then by 3. The loop
     * continues until i is greater than n. The number of times the loop will
     * iterate before i is greater than n can be calculated as log_2(n), where
     * log_2 is the logarithm to the base 2. This logarithmic time complexity
     * makes the code efficient and fast, especially as n gets very large.
     *  */

    static void WhileEight( ) {
        int i = 1;
        int n = 10;
        int k = 2;
        while ( i <= n ) {
            i = i * k;
            System.out.println(i);
        }
    }
    /*
     * The time complexity of the code above is O(log_k(n)). This is because
     * each iteration of the loop multiplies i by k, and the loop continues
     * until i is greater than n. The number of times the loop will iterate
     * before i is greater than n can be calculated as log_k(n), where log_k
     * is the logarithm to the base k. This logarithmic time complexity makes
     * the code efficient and fast, especially as n gets very large.
     *  */

    static void WhileNine( ) {
        int n = 10;
        while ( n >= 1 ) {
            n = n - 1;
            System.out.println(n);
        }
    }
    /*
     * The time complexity of the code above is O(n), because each iteration
     * of the loop decrements n by 1, and the loop continues until n is less
     * than or equal to 1. The number of times the loop will iterate before n
     * is less than or equal to 1 is equal to n, so the time complexity is O
     * (n). This linear time complexity means that the code takes
     * proportionally longer to run as the size of n increases.
     *  */

    static void WhileTen( ) {
        int n = 10;
        while ( n >= 1 ) {
            n = n - 2;
            System.out.println(n);
        }
    }
    /*
     * The time complexity of the code above is O(ceil(n/2)), where ceil is
     * the ceiling function. This is because each iteration of the loop
     * decrements n by 2, and the loop continues until n is less than or equal
     * to 1. The number of times the loop will iterate before n is less than
     * or equal to 1 can be calculated as ceil(n/2), where ceil(n/2) is the
     * smallest integer greater than or equal to n/2. This time complexity is
     * linear, so the code takes proportionally longer to run as the size of n
     * increases. */

    static void WhileEleven( ) {
        int n = 10;
        int k = 2;
        while ( n >= 1 ) {
            n = n - k;
            System.out.println(n);
        }
    }

    /*
     * The time complexity of WhileEleven() is O(log_k(n)), which can also be
     * written as O(ceil(n/k)).
     *
     * The reason is that with each iteration of the while loop, the value of
     * n decreases by a factor of k, until it reaches 0. The number of
     * iterations it takes to reach 0 is logarithmic in n, with base k.
     *
     * So, if k is 2, it takes O(log_2(n)) iterations to reach 0. If k is 3,
     * it takes O(log_3(n)) iterations to reach 0. Similarly, if k is x, it
     * takes O(log_x(n)) iterations to reach 0. Hence, the time complexity is
     * O(log_k(n)). */

    static void WhileTwelve( ) {
        int n = 10;
        while ( n >= 1 ) {
            n = n / 2;
            System.out.println(n);
        }
    }

    /*
     * The time complexity of the above code is O(log(n)), where n is the
     * value of the variable "n". The code performs a single operation in each
     * iteration of the while loop, which is to divide the value of "n" by 2.
     * Since the value of "n" is halved in each iteration, the number of
     * iterations will be proportional to the logarithm base 2 of n. Thus the
     * time complexity is O(log_2(n)).
     *  */

    static void WhileThirteen( ) {
        int n = 10;
        while ( n >= 1 ) {
            n = n / 3;
            System.out.println(n);
        }
    }

    /*
     * The time complexity of the code is O(log_3(n)), where n is the value of
     * the variable "n". The code performs a single operation in each
     * iteration of the while loop, which is to divide the value of "n" by 3.
     * The number of iterations will be proportional to the logarithm base 3
     * of n. Thus, the time complexity is O(log_3(n)).
     *  */
    static void WhileFourteen( ) {
        int n = 20;
        while ( n >= 1 ) {
            n = n / 2;
            n = n / 6;
            System.out.println(n);
        }
    }
    /*
     * To prove that the time complexity of the code is O(log_3(n)), we need
     * to show that the number of iterations of the while loop is proportional
     * to the logarithm base 3 of n.
     *
     * Let's denote the initial value of n as n0.
     *
     * After the first iteration of the while loop,
     * the value of n will be n0 / 2 / 6 = n0 / 12.
     *
     * After the second iteration,
     * the value of n will be n0 / 2^2 / 6^2 = n0 / 144.
     *
     * In general, after the kth iteration,
     * the value of n will be n0 / 2^k / 6^k.
     *
     * The while loop will continue until n becomes less than or equal to 1,
     * so we need to find the value of k such that n0 / 2^k / 6^k <= 1.
     *
     * Rearranging the inequality, we get:
     * n0 / 2^k / 6^k <= 1
     * => n0 / 6^k <= 2^k
     * => log_3(n0 / 6^k) <= log_3(2^k)
     * => log_3(n0) - k * log_3(6) <= k * log_3(2)
     * => log_3(n0) <= k * (log_3(2) + log_3(6))
     * => k >= log_3(n0) / (log_3(2) + log_3(6))
     *
     * Since the right-hand side of the inequality is proportional to the
     * logarithm base 3 of n0, we can conclude that k is proportional to the
     * logarithm base 3 of n0. Therefore, the number of iterations of the
     * while loop is proportional to the logarithm base 3 of n0, and the time
     * complexity of the code is O(log_3(n0)).
     *  */

    static void WhileFifteen( ) {
        int n = 20;
        int k = 3;
        while ( n >= 1 ) {
            n = n / k;
            System.out.println(n);
        }
    }
    /*
     * The time complexity of the code is O(log_k(n)), where n is the value of
     * the variable "n" and k is the value of the variable "k". The code
     * performs one operation in each iteration of the while loop, dividing n
     * by k. The number of iterations will be proportional to the logarithm
     * base k of n (since n is divided by k in each iteration), and thus the
     * time complexity is O(log_k(n)).
     *
     * To prove that the time complexity of the code is O(log_k(n)), we need
     * to show that the number of iterations of the while loop is
     * proportional to the logarithm base k of n.
     *
     * Let's denote the initial value of n as n0.
     *
     * After the first iteration of the while loop,
     * the value of n will be n0 / k.
     *
     * After the second iteration,
     * the value of n will be n0 / k^2.
     *
     * In general, after the kth iteration,
     * the value of n will be n0 / k^k.
     *
     * The while loop will continue until n becomes less than or equal to 1,
     * so we need to find the value of k such that n0 / k^k <= 1.
     *
     * Rearranging the inequality, we get:
     * n0 / k^k <= 1
     * => log_k(n0 / k^k) <= log_k(1)
     * => log_k(n0) - k * log_k(k) <= 0
     * => log_k(n0) <= k * log_k(k)
     * => k >= log_k(n0) / log_k(k)
     *
     * Since the right-hand side of the inequality is proportional to the
     * logarithm base k of n0, we can conclude that k is proportional to the
     * logarithm base k of n0. Therefore, the number of iterations of the
     * while loop is proportional to the logarithm base k of n0, and the time
     * complexity of the code is O(log_k(n0)).
     *  */

}
