package Mynewjava;

public class Pre {
    public static void Myname(String name){
        System.out.println("My name is "+name);
    }

    public static int Mynumber(int a){

        switch (a %2){
            case 0:
                System.out.println("Even number");
                break;
            case 1:
                System.out.println("Odd number");
                break;
        }

        return a;
    }

//    public static void Leapyear(int year){
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println(year + " is a leap year.");
//                } else {
//                    System.out.println(year + " is not a leap year.");
//                }
//            } else {
//                System.out.println(year + " is a leap year.");
//            }
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }
//
//    }

    public static void Pattern(int w){
        int i,j;
        for(i=1;i<w;i++){
            String a=" ";
            for (j=1;j<=i;j++){
                a+="*";
            }

            System.out.println(a);
        }
    }

}


