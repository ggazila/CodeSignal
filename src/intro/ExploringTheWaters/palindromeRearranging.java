package intro.ExploringTheWaters;

public class palindromeRearranging {
    public static void main(String[] args) {
        String s = "aabb";
        result(s);
    }
    static boolean result(String inputString) {

        int []niz = new int[26];

        for(int i=0; i<inputString.length(); i++)
            niz[inputString.charAt(i)-97]++;

        int cnt=0;
        for(int i=0; i<niz.length; i++)
            if(niz[i]%2!=0)
                cnt++;

        return cnt<=1;
    }

}
