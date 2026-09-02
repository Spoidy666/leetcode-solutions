class TrieNode:
    def __init__(self):
        self.children= {}
        self.isWord= False
class Trie:
    def __init__ (self):
        self.root=TrieNode()
    def insert(self,word):
        current = self.root
        for i in word:
            if i not in current.children:
                current.children[i]=TrieNode()
            current= current.children[i]
        current.isWord = True
    def search(self,word):
        current = self.root
        for i in word:
            if i not in current.children:
                return False
            current = current.children[i]
        return current.isWord
    def startsWith(self,word):
        current = self.root
        for i in word:
            if i not in current.children:
                return False
            current= current.children[i]
        return True

