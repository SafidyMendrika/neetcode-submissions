class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group_dict = defaultdict(list)
        for s in strs : 
            tup = self.alphabet_tupple(s)
            group_dict[tup].append(s)

        return list(group_dict.values())

    def alphabet_tupple(self,s):
        alph = [0 for i in range(26)]
        for c in s : 
            alph[ord(c) - ord('a')] += 1
        return tuple(alph)
        
        