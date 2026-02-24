class Solution:
    ''' Recursive approach: 7ms / 16.9mb
    def maxProfit(self, prices):
        max_profit = 0
        min_buy = prices[0]
        for i, price in enumerate(prices[1:]):
            profit = price - min_buy
            if profit > 0:
                max_profit = profit
                max_profit += self.maxProfit(prices[i+1:])
                break
            else:
                min_buy = price

        return max_profit
    '''
    ''' while loop approach: 3ms / 13.22mb
    def maxProfit(self, prices):
        max_profit = 0
        min_buy = prices[0]
        i = 1
        while (i < len(prices)):
            profit = prices[i] - min_buy
            if profit > 0:
                max_profit += profit
                min_buy = prices[i]
                print(max_profit)
            else:
                min_buy = prices[i]
            i += 1
        return max_profit
    '''

    # for loop approach  2ms / 13.14 mb
    def maxProfit(self, prices):
        max_profit = 0
        min_buy = prices[0]
        for price in prices[1:]:
            profit = price - min_buy
            if (profit > 0):
                max_profit += profit
                min_buy = price
            else:
                min_buy = price
        return max_profit


prices1 = [7, 1, 5, 3, 6, 4]
prices2 = [1, 2, 3, 4, 5]
prices3 = [7, 6, 4, 3, 1]

s = Solution()
print(s.maxProfit(prices1), "\n")
print(s.maxProfit(prices2), "\n")
print(s.maxProfit(prices3), "\n")
