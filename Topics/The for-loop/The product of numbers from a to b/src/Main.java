import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a;
        for (int i = a + 1; i < b; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}