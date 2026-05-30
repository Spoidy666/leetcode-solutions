class MaximumSubArray(object):
    def maxSubArray(self, nums):
        maxvalue = float('-inf')
        sum = 0
        for i in nums:
            sum+=i
            maxvalue= max(sum,maxvalue)
            if(sum<0):
                sum=0
        return maxvalue

def main():
    nums= list(map(int, input("Enter the elements : ").split()))
    obj = MaximumSubArray()
    print("Maxmimum sub array value is : ",obj.maxSubArray(nums))

if __name__ == "__main__":
    main()