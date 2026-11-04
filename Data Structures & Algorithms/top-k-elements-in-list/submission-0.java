class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> times = new HashMap<Integer,Integer>();

        for(int n : nums){
            times.put(n, times.getOrDefault(n, 0)+1);
        }

        int[] result = new int[k];
        int index = 0;
        int maxElement = 0;
        int maxValue = -1001;
        while(index < k){
            for(Map.Entry<Integer, Integer> entry : times.entrySet()){
                if(entry.getValue() > maxValue){
                    maxValue = entry.getValue();
                    maxElement = entry.getKey();
                }
            }
            result[index] = maxElement;
            index++;
            times.remove(maxElement);
            maxValue=-1001;
            maxElement=0;
        }
        return result;
    }
}
