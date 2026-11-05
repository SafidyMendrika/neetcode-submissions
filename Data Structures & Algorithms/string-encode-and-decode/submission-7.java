class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        int len = strs.size();
        for(int i = 0 ; i < len ; i++){
            if(i != len-1){
                builder.append(this.toIpString(strs.get(i))+"//");
            }else{
                builder.append(this.toIpString(strs.get(i)));
            }
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        String[] strs = str.split("//");

        ArrayList<String> result = new ArrayList();

        for(int i=0; i < strs.length ;i++){
            if(strs[i].equals(""))continue;
            result.add(this.toNormalString(strs[i]));
        }

        return result;
    }
    public String toIpString(String s){
        if(s.length() == 0) return ",";

        StringBuilder result = new StringBuilder();
        int len = s.length();
        for(int i = 0; i < len;i++){
            if(i != len-1){
                result.append(Character.codePointAt(s,i)+".");
            }else{
                result.append(Character.codePointAt(s,i));
            }
        }
        return result.toString();
    }
    public String toNormalString(String s){

        StringBuilder result = new StringBuilder();

        String[] codes = s.split("\\.");
        int temp = 0;
        for(String c : codes){
            if(c.equals(",")){
                result.append("");
                continue;
            }
            temp = Integer.valueOf(c);
            result.append((char)temp);
        }
        return result.toString();
    }
}
