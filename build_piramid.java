public class build_piramid {
    public static void main(String[] args) {
        int rows = 15;

        for (int i = 1; i <= rows; i++) {
            // print leading spaces for centering
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

