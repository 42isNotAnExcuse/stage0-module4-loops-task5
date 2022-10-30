package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                int filler = 8;
                String bit = " ";

                if (i == sideLength / 2) {
                    bit = "" + filler;
                    System.out.print(bit);
                    continue;
                }
                if (j == sideLength / 2) bit = "" + filler;
                System.out.print(bit);
            }
            System.out.println();
        }
    }

}
