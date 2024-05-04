def coin_change(coins, amount):
    dp = [0] * (amount + 1)
    dp[0] = 1