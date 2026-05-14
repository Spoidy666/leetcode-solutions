class _3Sum(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        length = len(nums)
        nums.sort()
        output=[]
        for i in range(length-2):
            if (i>=1 and nums[i]==nums[i-1]):
                continue
            l=i+1
            r=length-1
            while (l<r):
                a = nums[r]+nums[i]+nums[l]
                if (a==0):
                    output.append([nums[i],nums[l],nums[r]])
                    while (l<r and nums[l]==nums[l+1]):
                        l+=1
                    while (l<r and nums[r]==nums[r-1]):
                        r-=1
                    l+=1
                    r-=1
                elif (a<0):
                    l+=1
                else:
                    r-=1
        return output
                

def main():
    nums = eval(input("Enter this list : "))
    obj = _3Sum()
    print(obj.threeSum(nums))


if __name__ == "__main__":
    main()
        