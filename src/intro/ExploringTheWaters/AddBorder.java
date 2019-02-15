package intro.ExploringTheWaters;
/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.


*/

public class AddBorder {
    public static void main(String[] args) {
        String[] picture = {"abc", "ded"};
        AddBorder(picture);
    }
    static String[] AddBorder (String[] picture) {
        int lenghtArr = picture.length + 2;
        int lenghtArrElem = picture[0].length()+2;

        String stars = "";

        for (int j = 0; j < lenghtArrElem; j++) {
            stars += "*";
        }
       // System.out.println(stars);

        for (int i = 0; i < picture.length; i++) {
            picture[i] = "*" + picture[i] + "*";
        }
        //System.out.println(picture[0]);

        String[] newArr = new String[1];
        newArr[0] = stars;
        String[] result = new String[lenghtArr];

        for (int k = 0; k < lenghtArr; k++) {
            result[k] = newArr[0];
            k++;
            int d;
            for (d = 0; d < picture.length; d++) {
                result[k] = picture[d];
                k++;
            }
            result[k] = newArr[0];
        }
        return result;
    }
}
