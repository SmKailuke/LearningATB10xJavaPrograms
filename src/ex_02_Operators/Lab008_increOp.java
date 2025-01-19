package ex_02_Operators;

public class Lab008_increOp {
    public static void main(String[] args) {
        int a = 10;
       //System.out.println(++a);
        //output 11
        //System.out.println(++a + a++);
        //++a: 11 & a++: 11
        //output 22
       System.out.println(++a + a++ + a++);
        //A=++a 11
        //B=a++ 11
        //C=a++ 12 : 11+11+12=34
        System.out.println(a);
    }
    }
