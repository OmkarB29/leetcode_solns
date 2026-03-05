class Solution {
    public int maxDepth(String s) {
       int c=0;
       int max=0;
       if(s.length()==0){
        return 0;
       } 
       for(char ch : s.toCharArray()){
        if(ch=='('){
            c++;
        }
        else if(ch==')'){
            max= Math.max(max,c);
            c--;
        }
       }
       return max;
    }
}