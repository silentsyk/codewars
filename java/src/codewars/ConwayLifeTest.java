import java.io.Console;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class ConwayLifeTest{

    @Test
    public void testGlider() {
        int[][][] gliders = {
                        {{1,0,0},
                        {0,1,1},
                        {1,1,0}}
        };
        System.out.println("Glider");
        //LifeDebug.print(gliders[0]);
        int[][] res = ConwayLife.getGeneration(gliders[0], 2);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (res[i][j]==0) {
                    System.out.print(".");
                }else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        //assertArrayEquals(gliders[1],res);
        //assertTrue("Got \n" + LifeDebug.htmlize(res) + "\ninstead of\n" + LifeDebug.htmlize(gliders[1]), LifeDebug.equals(res, gliders[1]));
    }

}