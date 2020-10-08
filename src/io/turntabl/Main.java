package io.turntabl;

public class Main {

    public static void main(String[] args) {
	// write your code here
//    Divide(3);

        num();


    }

    static void num(){
        int result;
        try {
            result = 4 / 0;
            System.out.println(result);
        }catch (ArithmeticException ex){
        System.err.println("Invalid Operation");
        }

    }

//    static void  Divide(int number){
//        try{
//            number = number/0;
//            System.out.println(number);
//        }
//        catch (ArithmeticException ex){
//            System.err.println("Invalid");
//        }

    }
//}
