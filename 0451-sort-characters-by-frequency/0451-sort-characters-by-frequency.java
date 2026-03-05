class Solution {
    public String frequencySort(String s) {
        char[] seq= s.toCharArray();
        HashMap<Character,Integer> map= new HashMap<>();
        for(char ch : seq){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        
        list.sort((a,b) -> b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character,Integer> ent : list){
            char c = ent.getKey();
            int ct = ent.getValue();

            for(int i=0 ; i<ct;i++){
                sb.append(c);
            }
        }

        return sb.toString();
        
    }
}