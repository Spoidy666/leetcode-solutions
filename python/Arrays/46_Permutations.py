class Permutation(object):
    def permute(self, nums):
        if len(nums)==0:
            return [[]]
        perm = self.permute(nums[1:])
        result = []
        for i in perm:
            for j in range(len(i)+1):
                cop = i.copy()
                cop.insert(j, nums[0])
                result.append(cop)
        return result

def main():
    nums=list(map(int,input("Enter the elements : ").split()))
    obj = Permutation()
    print(obj.permute(nums))


if __name__ == "__main__":
    main()