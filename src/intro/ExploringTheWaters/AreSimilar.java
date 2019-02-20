package intro.ExploringTheWaters;

public class AreSimilar {
    public static void main(String[] args) {
        int[] a = {4,6,3};
        int[] b = {3,4,6};
        result(a,b);
    }
    static boolean result (int[] A, int[] B) {
        int cnt=0, a1=0, a2=0, b1=0, b2=0;

        for(int i=0; i<A.length; i++)
            if(A[i]!=B[i]) {
                cnt++;
                if(cnt==1) {
                    a1 = A[i];
                    b1 = B[i];
                }
                else if(cnt==2) {
                    a2 = A[i];
                    b2 = B[i];
                }
            }

        return cnt==0 || cnt==2 && a1==b2 && a2==b1;
    }
}
