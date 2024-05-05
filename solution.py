for coin in coins:
        for x in range(coin, amount + 1):
            dp[x] += dp[x - coin]