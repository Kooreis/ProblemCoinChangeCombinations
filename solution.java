Here is a Java console application that solves the coin change problem for combinations:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total amount: ");
        int amount = scanner.nextInt();
        System.out.println("Enter the number of coin types: ");
        int m = scanner.nextInt();
        int[] coins = new int[m];
        System.out.println("Enter the coin values: ");
        for (int i = 0; i < m; i++) {
            coins[i] = scanner.nextInt();
        }
        System.out.println("Total combinations: " + count(coins, m, amount));
    }

    static long count(int S[], int m, int n) {
        long[] table = new long[n + 1];
        table[0] = 1;
        for (int i = 0; i < m; i++)
            for (int j = S[i]; j <= n; j++)
                table[j] += table[j - S[i]];
        return table[n];
    }
}
```

This program first takes the total amount and the number of coin types as input from the user. Then it takes the coin values as input. It then calculates the total number of combinations to make up the total amount using the given coin types and prints it.