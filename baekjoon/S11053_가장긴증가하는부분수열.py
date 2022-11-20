length = int(input())

ls = list(map(int, input().split()))
dp = [1] * length

for i in range(len(dp)):
    for j in range(i + 1, len(dp)):
        if ls[j] > ls[i]:
            dp[j] = max(dp[i] + 1, dp[j])

print(max(dp))
