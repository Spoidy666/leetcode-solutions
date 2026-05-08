class Palindrom_Number:
    def isPalindrome(self, x):
        y=x
        sum=0
        rem=0
        while(y>0):
            rem=y%10
            sum=sum*10+rem
            y=y//10
        return sum==x

def main():
    n=int(input("Enter the number to be checked : "))
    obj= Palindrom_Number()

    print(obj.isPalindrome(n))


if __name__ == "__main__":
    main()