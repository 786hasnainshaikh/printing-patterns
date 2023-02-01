import java.util.Scanner;
public class printing_pattern2 {
    public static void main(String[] args) {
        System.out.println("printing pattern");
        Scanner sc= new Scanner(System.in);
        System.out.println("input outer loop");
        int outer= sc.nextInt();

        for (int i=1; i<=outer; i++){ // this loop for rows or outer itterration
            for (int j=1; j<=i; j++){ // this loop is fpr print spaces or s
                System.out.print("s");
            }
            for (int k=outer; k>=i; k--){ // this loop is for print *
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

// output will be
//      s*****
//      ss****
//      sss***
//      ssss**
//      sssss*