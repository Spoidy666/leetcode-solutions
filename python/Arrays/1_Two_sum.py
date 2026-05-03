class Solution:
    def twoSum(self, nums, target):
        sett={}
        for i in range(len(nums)):
            sett[nums[i]]=i
        for i in range(len(nums)):
            value = target-nums[i]
            if value in sett and sett[value]!=i:
                return [i,sett[value]]

def main():

    nums = eval(input("Enter the list of numbers: "))
    target = int(input("Enter the target sum: "))

    sol = Solution()
    print(sol.twoSum(nums, target))


if __name__ == "__main__":
    main()