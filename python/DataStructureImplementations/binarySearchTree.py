class TreeNode:
    def __init__(self,val=0,left=None,right=None):
        self.val=val
        self.left=left
        self.right=right
    def insert(self,root,val):
        if not root:
            return TreeNode(val)
        if val<root.val:
            root.left=self.insert(root.left,val)
        else:
            root.right = self.insert(root.right,val)
        return root
    def search(self,root,value):
        if not root:
            return None
        if root.val==value:
            return root
        if root.val>value:
            return self.search(root.left,value)
        else:
            return self.search(root.right,value)
    def delete(self,root,value):
        if not root:
            return None
        if root.val>value:
            root.left= self.delete(root.left,value)

        elif (root.val<value):
            root.right= self.delete(root.right,value)
        else:
            #case 1 (i dont know what this shit is, i think its the case where there is no children, that means leaf node? yes. ALso it handles both no children as well as one children cases.)
            if not root.left:
                return root.right
            elif not root.right:
                return root.left

            #Case 2 where there is children (more ).
            successor = root.right
            while successor.left:
                successor=successor.left
            root.val=successor.val
            root.right=self.delete(root.right,successor.val)
        return root
def main():
    print("Hello world ")