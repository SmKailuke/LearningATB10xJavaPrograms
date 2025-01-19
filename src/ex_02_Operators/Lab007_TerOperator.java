package ex_02_Operators;

public class Lab007_TerOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        String result=(a>b)?"min":((b>=c)?"Min":"Max is c:30");
        System.out.println(result);
    }
}
