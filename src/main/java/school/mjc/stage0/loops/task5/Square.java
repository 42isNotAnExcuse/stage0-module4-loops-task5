package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        int filler = 8;
        int c1 = 0;

        while (c1++ < sideLength) {
            System.out.print(filler);
            int c2 = 0;
            while (c2++ < sideLength - 2) {
                if (c1 == 1 || c1 == sideLength) System.out.print(filler);
                else System.out.print(" ");
            }
            System.out.println(filler);
        }

    }
}
