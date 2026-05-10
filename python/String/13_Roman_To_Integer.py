class RomanToInteger(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        output= 0
        n = len(s)
        for i in range(n):
            if i<n-1 and roman[s[i]]<roman[s[i+1]]:
                output-=roman[s[i]]
            else:
                output+=roman[s[i]]
        return output

def main():
    s= input("Enter the roman string : ")
    obj = RomanToInteger()
    print("The integer value is : ", obj.romanToInt(s))


if __name__ == "__main__":
    main()