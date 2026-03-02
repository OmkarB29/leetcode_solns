class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
         }
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(char ch:s.toCharArray()){
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        // for(char ch : t.toCharArray()){
        //     if(!map.containsKey(ch)){
        //         return false;
        //     }
        //     map.put(ch,map.get(ch)-1);
        // }
        // for(char ch : map.keySet()){
        //     if(map.get(ch)!=0){
        //         return false;
        //     }
        // }
        // return true;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;

        }

        for(int c:freq){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}