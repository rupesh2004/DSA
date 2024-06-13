import java.util.*;
public class scannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.next();
        String name = sc.nextLine();

        System.out.println(a);
        System.out.println(name);

    }
}
