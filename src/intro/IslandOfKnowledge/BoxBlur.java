package intro.IslandOfKnowledge;

import com.sun.javafx.geom.Path2D;

import java.util.ArrayList;

public class BoxBlur {
    public static void main(String[] args) {
        int[][] image = {{36,0,18,9},
                        {27,54,9,0},
                        {81,63,72,45}};
        result(image);

    }

   static int[][] result (int[][] image) {
       if (image.length == 4) {
           int sum1 = 0;
           int[][] newArray = new int[2][2];

       }

       int sum = 0;
       int[][] newArray = new int[1][1];
       for (int i = 0; i < image.length; i++) {
           for (int j = 0; j < image[i].length; j++) {
               sum += image[i][j];
           }
       }
       newArray[0][0] = sum/9;
       return newArray;
    }
}
