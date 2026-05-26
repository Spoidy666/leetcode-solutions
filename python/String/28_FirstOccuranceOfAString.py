class FirstOccuranceOfAString(object):
    def strStr(self, haystack, needle):
        length=len(needle)
        for i in range(0,len(haystack)-length+1):
            if(haystack[i:i+length]==needle):
                return i
        return -1     
        


def main():
    haystack=input("Enter the haystack : ")
    needle = input("Enter the needle : ")
    obj = FirstOccuranceOfAString();
    print("Output is : ",obj.strStr(haystack,needle))
if __name__ == "__main__":
    main()