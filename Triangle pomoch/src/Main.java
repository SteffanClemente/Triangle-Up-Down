public class Main {
    public static void main(String[] args) {
//        Перевернутая пирамида
        int x = 10;
        for (int i = 0; i < x; i++) {
            for (int j = x*2; j > x - i; j--) {
                if (j == x*2 - i) {
                    for (int k = x*2-2; k >= i * 2; k--) {

                        System.out.print("*");
                    }


                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
//  ///////////////////////////////////////////////////
//        for (int i = 0; i < 10; i++) {
//            for (int j = 9; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = -1; k < i * 2; k++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        int x = 10;
//        for (int j = 0; j < x; j++) {
//            for (int i = 0; i < j; i++) {
//                System.out.print(" ");
//            }
//            for (int l = x*2-1; l >j*2 ; l--) {
//                System.out.print("*");

//            }
//            System.out.println();
//        }
    }
}