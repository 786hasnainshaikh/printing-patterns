public class printing_pattern3 {
    public static void main(String[] args) {
        System.out.println("printing pattern");
        for (int i=1; i<=5; i++){ // this is for outer loop
            for (int j=5; j>=i; j--){ // this loop for printing spaces
                System.out.print(" ");
            } for (int k=1; k<=i; k++){ // this loop create below pattern
                System.out.print("*");
            }


      //       *
    //        **
   //        ***
  //        ****
//         *****

            for (int k=2; k<=i; k++){ // this code create below code start with 2 bc want to print * in second line
            System.out.print("*");
            }
 //         *
   //       **
 //         ***
 //         ****



            System.out.println();


        }
    }
}

// result
//          *
//         ***
//        *****
//       *******
//      *********