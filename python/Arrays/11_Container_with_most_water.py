class Container_with_most_water:
    def maxArea(self, height):
        maxArea= 0
        l=0
        r=len(height)-1
        while(l<r):
            maxArea = max(min(height[l],height[r])*(r-l),maxArea)
            if(height[l]<height[r]):
                l+=1
            else:
                r-=1
        return maxArea

def main():
    height= list(map(int,input("Enter the integer array (leave space between each number) ").split()))
    c = Container_with_most_water()
    print("Maximum area of container is : ", c.maxArea(height))

if __name__=="__main__":
    main()