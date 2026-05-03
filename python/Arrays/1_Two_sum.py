class Solutions:
    def twoSum(self, nums, target):
        sett=set()
        for i in range(len(nums)):
            sett[nums[i]]=i
        for i in range(len(nums)):
            value = target-nums[i]
            if value in sett and sett[value]!=i:
                return [i,sett[value]]

