import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table num : ");

        int n = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            // System.out.println(n*i);
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}