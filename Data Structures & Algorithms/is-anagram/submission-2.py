class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        seen_dict = {}
        if len(s) != len(t) : return False
        for c in s : 
            if c in seen_dict.keys() : seen_dict[c] += 1
            else : seen_dict.update({c:1})
        for c in t : 
            if c in seen_dict.keys() : seen_dict[c] -= 1
            else : return False
        for key in seen_dict.keys():
            if seen_dict[key] != 0 : return False
        return True
    
        