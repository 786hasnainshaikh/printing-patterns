public class printing_pattern1 {
    public static void main(String[] args) {
        System.out.println("print pattern");
        for (int i=1; i<=5; i++){  // this loop for rows or outer itterration
            for (int j=4; j>=i; j--){ // this loop is for print spaces
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){ // this loop is for print l
                System.out.print("l");
            }
            System.out.println();

        }

        // above code print this pattern
       //        l
        //      ll
        //     lll
        //    llll
        //   lllll
        //
        // below code print this pattern
       //     xxxx
        //     xxx
        //      xx
        //       x


        for (int i=1; i<=4; i++){ // this loop for rows or outer itterration
            for (int j=1; j<=i; j++){ // this loop is fpr print spaces
                System.out.print(" ");
            }
            for (int k=4; k>=i; k--){ // this loop is for print x
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
