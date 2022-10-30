package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        String bit;
        int filler = 8;

        for (int i = 0; i < height; i++) {
            System.out.print(filler);
            if (i == 0 || i == height - 1) bit = "" + filler;
            else bit = " ";
            for (int j = 0; j < length - 2; j++) System.out.print(bit);
            System.out.println(filler);
        }
    }
}
