Here is a C# console application that solves the coin change problem for combinations:

```CSharp
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        int[] coins = { 1, 2, 5 };
        int amount = 5;
        Console.WriteLine(Change(amount, coins));
    }

    public static int Change(int amount, int[] coins)
    {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        foreach (var coin in coins)
        {
            for (int i = coin; i <= amount; i++)
            {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
```

This program uses dynamic programming to solve the coin change problem. It initializes an array `dp` where `dp[i]` will be storing the number of solutions for value `i`. We fill the entries for all values from 1 to `amount` in a bottom-up manner. For each coin of value less than equal to `i`, the count value is incremented by the count of remaining value (`i - coin`).