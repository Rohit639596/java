public class Starpattern {
    public static void main(String[] args) {

        System.out.println("\n1.Square star pattern\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\n2.Hollow Square star pattern\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("\n3.Rhombus star pattern\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\n4.Mirrored Rhombus star pattern\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\n5.Hollow Mirrored Rhombus star Pattern\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("\n6.Hollow Rhombus Star Pattern\n");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("\n7.Right star triangle pattern\n");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("\n8. Inverterted right star triangle pattern\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("\n9.Mirrored right angle triangle\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println("");
        }
        System.out.println("\n10.Inverted Mirrored right angle triangle\n");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("\n11.Pyramid star pattern\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("\n12.Inverted Pyramid star pattern\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        System.out.println("\n13.Hollow right angle star pattern\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                if (i == 1 || j == 5 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
        System.out.println("\n14.Hollow Mirrored right angle triangle\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 5; j >= i; j--) {
                if (i == 1 || j == i || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

        System.out.println("\n15. Hollow Inverterted right star triangle pattern\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == 5 || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
        System.out.println("\n16.Inverted Mirrored right angle triangle\n");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 5 || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
        System.out.println("\n17.Hollow Pyramid star pattern\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 5 || j == (2 * i - 1) || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
        System.out.println("\n18.Inverted Pyramid star pattern\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 5 || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
