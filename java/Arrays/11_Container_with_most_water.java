import java.util.Scanner;
class ContainerWithMostWater{
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxArea=0;
        int a = 0 ;
        while (l<r){
            a = Math.min(height[l],height[r]);
            maxArea= Math.max(a*(r-l),maxArea);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return maxArea;
    }
    public static void main(String args[]){
        int heightSize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        heightSize = sc.nextInt();
        int[] height= new int[heightSize];
        for (int i = 0; i < heightSize ; i ++){
            height[i]= sc.nextInt();
        }
        ContainerWithMostWater c = new ContainerWithMostWater();
        System.out.println("Container with most area is " + c.maxArea(height));
    }
}