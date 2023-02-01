public class printing_pattern {
    public static void main(String[] args) {
        System.out.println("printing patter");
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // above code print /\
        //*
        //**
        //***
        //****
        //*****

        // below code print this patter
        //****
        //***
        //**
        //*

        for (int i=1; i<=4; i++){
            for (int j=4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// both combine print below pattern
         //*
        //**
        //***
        //****
        //*****
        //****
        //***
        //**
        //*