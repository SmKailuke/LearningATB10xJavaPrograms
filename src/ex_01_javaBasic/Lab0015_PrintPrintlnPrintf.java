package ex_01_javaBasic;

public class Lab0015_PrintPrintlnPrintf {
    public static void main(String[] args) {
        System.out.print("Hi"); // Will not add next line

        System.out.println();
        System.out.println("Hi Sonali");
//        System.out.println("Hi"); // output Will displayed in next line
        int age = 98;
        char a= 'S';
        // %d ->  any integer - byte, short, int or long
        System.out.printf("Ritesh age is %d\n",age);

        // %s -> String
        String name = "Pramod";
        System.out.println(name);
        System.out.printf("Your name is -> %s\n",name);

        // %c -> char
        System.out.printf("Sonali name start with %c\t",a);

        // %f -> float
        float pi = 3.14159f;
        System.out.printf("Pi value is  %f",pi);


    }
}
