package challenges;
/*
You have a apples, and your friend has b apples. You will be happy if - and only if - you both have the same number of apples.

Given integers a and b, check if you will be happy after you give your friend one of your apples.

Example

For a = 3 and b = 1, the output should be
shareAnApple(a, b) = true.
 */
public class ShareAnApple {
    boolean result (int a, int b) {
        return !(a ==b) && a-b == 2;
    }

    public static void main(String[] args) {
        ShareAnApple o1 = new ShareAnApple();
        System.out.println(o1.result(5,6));
    }
}
