class Solution:
    # 1) Compare biggers
    """
    def maxProfit(self, prices):
        max = 0
        for index, item in enumerate(prices):
            k = index + 1
            while k < len(prices):
                if item < prices[k]:
                    temp = prices[k] - item
                    if temp > max:
                        max = temp
                k += 1
        return max
   """
    '''
    # 2) Compare biggest
    def maxProfit(self, prices):
        max_profit = 0
        for index, item in enumerate(prices):
            k = index + 1
            big = item
            while k < len(prices):
                if big < prices[k]:
                    big = prices[k]
                k += 1
            temp = big - item
            max_profit = max_profit(temp, max)
        return max
    '''

    # 3)
    def maxProfit(self, prices):
        max_profit = 0
        min_buy = prices[0]
        for prices in prices[1:]:
            profit = prices - min_buy
            max_profit = max(max_profit, profit)
            min_buy = min(min_buy, prices)

        return max_profit


prices1 = [7, 1, 5, 3, 6, 4]
prices2 = [7, 6, 4, 3, 1]

s = Solution()
print(s.maxProfit(prices1))
print(s.maxProfit(prices2))
