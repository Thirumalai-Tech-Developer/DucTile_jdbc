
import java.util.Scanner;

public class Update {
    public static void Update(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        try {
            System.out.println("Which column want to change");
            String a = sc.nextLine();
            System.out.printf("Enter new %s ",a);
            String a1 = sc.nextLine();
            System.out.println("which reference column name");
            String b = sc.nextLine();
            System.out.printf("Enter reference %s ",b);
            String b1 = sc.nextLine();
            sb.append("update profile set ");
            sb.append(a).append("=").append("'").append(a1).append("' ");
            sb.append("where ").append(b).append("=").append("'").append(b1).append("'");
            String sql = sb.toString();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
