package InterviewPractice.Strings;

public class AmendTheSentence {
    public static void main(String[] args) {
        String s = "CodesignalIsAwesome";
        result(s);
    }
    static String result(String s) {
        String[] r = s.split("(?=\\p{Upper})");
        for (int i = 0; i < r.length; i++) {
            r[i] = r[i].toLowerCase();
        }

        String res= "";
        for (int i = 0; i < r.length; i++) {
            if (i < r.length-1) {
                res += r[i] + " ";
            }   else {
                res += r[i];
            }
        }
        return res;
    }
}
