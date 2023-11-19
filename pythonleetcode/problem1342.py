num = 12
def numofsteps(num, steps):
    if(num == 0):
        return steps
    if (num % 2 == 0):
        steps =numofsteps(num/2,steps+1)
        return steps
    steps = numofsteps(num-1,steps+1)
    return steps
steps = numofsteps(num,0)
# print(steps)

class Solution(object):
    steps = 0
    
    def numberOfSteps(self, num):
        """
        :type num: int
        :rtype: int
        """
        if num == 0:
            return self.steps  # Use self.steps instead of steps

        if num % 2 == 0:
            self.steps += 1  # Use self.steps instead of steps, and increment by 1
            return self.numberOfSteps(num // 2)  # Use self.numberOfSteps instead of numofsteps, and integer division

        self.steps += 1  # Increment steps by 1
        return self.numberOfSteps(num - 1)  # Use self.numberOfSteps instead of numofsteps

obj1 = Solution()
print(obj1.numberOfSteps(14))
