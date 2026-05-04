class LongestSubstring:
    def lengthOfLongestSubstring(self, s):
        sett =set()
        longest= 0
        l=0
        for r in range(len(s)):
            while s[r] in sett:
                sett.remove(s[l])
                l+=1
            longest= max(longest, r-l+1)
            sett.add(s[r])
        return longest

def main():
    s=input("Enter the string to check : ")
    child= LongestSubstring()

    print("The length of longest Substring is " , child.lengthOfLongestSubstring(s))

if __name__ == "__main__":
    main()