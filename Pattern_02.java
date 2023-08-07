public class Pattern_2 {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i=5; i>=1; i--) {
            for (int j=5; j>=i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=5; i>=1; i--) {
            for (int j=5; j>=i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i=1; i<=5; i++) {
            for (int j=i; j>=1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1; i<=5; i++) {
            for (int j=i; j>=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i=5; i>=1; i--) {
            for (int j=i; j<=5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=5; i>=1; i--) {
            for (int j=i; j<=5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i=1, number=0; i<=9; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(++number + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i=1; i<=9; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i=1; i<=10; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print((char)(64+j) + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i=1; i<=10; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print((char)(64+i) + " ");
            }
            System.out.println();
        }
    }
}
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 * * * * * * * * *
 */
