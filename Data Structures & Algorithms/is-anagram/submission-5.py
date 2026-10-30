class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return self.count_alphabet(s) == self.count_alphabet(t)

    def count_alphabet(self,s):
        alph = [0 for _ in range(26)]
        for c in s : 
            alph[ord(c) - ord('a')] += 1
        return list(alph)
    
        