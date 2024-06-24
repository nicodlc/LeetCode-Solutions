class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices: return 0
    
        min_val = float('inf')
        profit = 0
        for price in prices:
            if price < min_val:
                min_val = price
            elif price - min_val > profit:
                profit = price - min_val
    
        return profit
