class Solution {
    public int beautySum(String s) {
      int sum=0;
      for(int i=0;i<s.length();i++){
        int[] fre = new int[26];
        for(int j=i;j<s.length();j++){
            fre[s.charAt(j)-'a']++;
            int beauty = getMax(fre)-getMin(fre);
            sum+=beauty;
        }
      }  
      return sum;
    }

    public int getMax(int[] fr){
        int max=0;
        for(int i=0;i<26;i++){
            max=Math.max(max,fr[i]);
        }
        return max;
    }
    public int getMin(int[] fr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(fr[i]!=0){
             min=Math.min(min,fr[i]);
            }
        }
        return min;
    }
}