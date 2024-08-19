
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Which column want to change");
            String a = sc.nextLine();
            System.out.printf("Enter new %s ",a);
            String a1 = sc.nextLine();
            System.out.println("which reference column name");
            String b = sc.nextLine();
            System.out.printf("Enter reference %s ",b);
            String b1 = sc.nextLine();
            String sql = String.format("update profile set %s=%s where %s=%s",a,a1,b,b1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
