package intro.IslandOfKnowledge;
/*
Call two arms equally strong if the heaviest weights they each are able to lift are equal.

Call two people equally strong if their strongest arms are equally strong
(the strongest arm can be both the right and the left), and so are their weakest arms.

Given your and your friend's arms' lifting capabilitie
*/
public class AreEquallyStrong {
    public static void main(String[] args) {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 15;
        int friendsRight = 10;
        areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight);
    }
    static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        if((yourLeft == friendsLeft | yourLeft == friendsRight) && (yourRight == friendsRight | yourRight == friendsLeft)) return true;
        return false;
    }
}
