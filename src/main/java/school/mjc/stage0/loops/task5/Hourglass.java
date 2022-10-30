package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height <= 0) System.out.print("");
        else if (height % 2 == 0) {
            int start = height;

            for (int i = 0; i <= start; i++) {
                for (int j = i; j > 0; j--) System.out.print(" ");
                for (int k = 0; k < start; k++) System.out.print(8);
                for (int j = i; j > 0; j--) System.out.print(" ");
                System.out.println();
                start -= 2;
            }
            for (int i = start; i <= height; i++) {
                for (int j = (height / 2) - 1; j > 0; j--) System.out.print(" ");
                for (int k = 0; k <= start + 1; k++) System.out.print(8);
                for (int j = (height / 2) - 1; j > 0; j--) System.out.print(" ");
                System.out.println();
                start += 2;
                height -= 2;
            }
        } else {
            int limit = height; //height * 2 - 1;

            for (int i = 0; i < height / 2; i++) {
                for (int j = i; j > 0; j--) System.out.print(" ");
                for (int k = 0; k < limit; k++) System.out.print(8);
                for (int j = i; j > 0; j--) System.out.print(" ");
                System.out.println();
                limit -= 2;
            }
            limit = 1;//height / 2;
            for (int i = 0; i <= height / 2; i++) {
                for (int j = i; j < height / 2; j++) System.out.print(" ");
                for (int k = 0; k < limit; k++) System.out.print(8);
                for (int j = i; j < height / 2; j++) System.out.print(" ");
                limit += 2;
                System.out.println();
            }
        }
    }
}
