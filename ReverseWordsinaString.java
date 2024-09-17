class Solution {
    public String reverseWords(String s) {
     String[] arr=s.split("\\s+");//remove multiple space
     StringBuilder sb=new StringBuilder("");
     for(int i=arr.length-1;i>=0;i--){
        sb.append(arr[i]+" ");
     }
     String ans=sb.toString();
     ans=ans.trim();//remove space from trailing and leading
     return ans;
    }
}
