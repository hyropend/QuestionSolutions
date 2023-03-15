class Solution {

    /*
    Burda 26 karakterli bir array oluşturduk. Çünkü İngilizce alfabede 26 harf bulunur.
    for içinde önce ilk kelimenin ilk harfinin ascii değerini a dan çıkarıyoruz. mesela
    ilk harf c ise a dan çıkarıyoruz 2 buluyoruz. çünkü c nin ascii değeri 99, a nın ise 97.
    2 değerini bulduktan sonra store array inin 2. elemanın bir artırıyoruz. sonra ikinci kelime
    için de aynı şeyi yapıyoruz ama bu sefer 1 eksiltiyoruz. İşin sonunda aynı kelimeden aynı sayıda
    varsa store array inin tüm elemanları bir olmalı bunu kontrol ediyoruz.
    */

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
}

    /*
    Burda s stringindeki harfleri map e key olarak ekledik ve eğer aynı keyden başka bir tane daha
    varsa o keyin değerini bir artırdık. "map.getOrDefault(ch,0)" kodu şu demektir: ch keyi için
    bir değer varsa onu getir, ancak yoksa default olarak 0 ata. s stringindek tüm harfler için
    bunu yaptıktan sonra t stringi için bunu kontrol ederiz. eğer aynı harf varsa "map.put(ch,map.get(ch)-1)"
    ile değerini azaltırız. ve son bir tane kaldıysa yani value si 1 se mapten çıkartırız. en sonda map boşsa
    true döner anagramdır. aynı harften aynı sayıda vardır.
    */

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
}
