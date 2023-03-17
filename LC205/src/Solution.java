class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            char x=t.charAt(i);
            char check = map1.getOrDefault(c,x);

            if(check != x) return false;
            map1.put(c,x);

            char check2 = map2.getOrDefault(x,c);
            if(check2 != c) return false;
            map2.put(x,c);
        }
        return true;
    }
}

//******************************************************************

class Solution {
    public boolean isIsomorphic(String s, String t) {

        int map1[]=new int[200];
        int map2[]=new int[200];

        if(s.length()!=t.length())
            return false;


        for(int i=0;i<s.length();i++)
        {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                return false;

            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;
    }
}