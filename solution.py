Sure, here is a Python console application that solves the coin change problem for combinations.

```python
def coin_change(coins, amount):
    dp = [0] * (amount + 1)
    dp[0] = 1

    for coin in coins:
        for x in range(coin, amount + 1):
            dp[x] += dp[x - coin]

    return dp[amount]

def main():
    coins = list(map(int, input("Enter the coin denominations (separated by spaces): ").split()))
    amount = int(input("Enter the amount: "))
    print("Number of combinations: ", coin_change(coins, amount))

if __name__ == "__main__":
    main()
```

In this application, you first enter the coin denominations separated by spaces, then enter the amount for which you want to find the number of combinations. The application will then print the number of combinations.