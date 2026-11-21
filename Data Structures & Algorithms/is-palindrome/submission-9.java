class Solution {
    public boolean isPalindrome(String s) {
        String nospace = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        ArrayList<Character> chr=new ArrayList<>();
        for(int i=0;i<nospace.length();i++){
            chr.add(nospace.charAt(i));
        }
        for(int j=0;j<(chr.size())/2;j++){
            if(chr.get(j)!=chr.get(chr.size()-j-1)){
                return false; 
            }

        }
        return true;
    }
}
