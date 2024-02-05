from typing import List
class Solution:
    def topKFrequent(self, nums: List[int], k: int) ->List[int]:
        z= dict()
        o = list()
        for i in nums:
            if z.get(i) is None:
                z[i] = 1
            else:
                z[i] = z[i]+1
        for j in range(k):
            max_key = max(z,key=z.get)
            o.append(max_key)
            del z[max_key]
            print(max_key)
        return k
obj1= Solution()
l1 =[1,1,1,2,2,3]
k = 2
obj1.topKFrequent(l1,k)