class ValidParanthesis:
    def isValid(self, s):
        stack=[]
        length= len(s)
        for i in range(length):
            if s[i]=='{':
                stack.append('}')
            elif s[i]=='(':
                stack.append(')')
            elif s[i] == '[':
                stack.append(']')
            else:
                if(not stack):
                    return False
                if (stack.pop() != s[i]):
                    return False
        return not stack
def main():
    s = input("Enter the paranthesis string : ")
    obj = ValidParanthesis()
    print("The paranthesis is : ",obj.isValid(s))
if __name__ == "__main__":
    main()