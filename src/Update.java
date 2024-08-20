
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
    public void Update() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        App ap = new App();
        try {
            System.out.println("Enter table name");
            String tname = sc.nextLine();
            System.out.println("Which column want to change");
            String a = sc.nextLine();
            System.out.printf("Enter new %s ",a);
            String a1 = sc.nextLine();
            System.out.println("which reference column name");
            String b = sc.nextLine();
            System.out.printf("Enter reference %s ",b);
            String b1 = sc.nextLine();
            sb.append("update ").append(tname).append(" set ");
            sb.append(a).append("=").append("'").append(a1).append("'");
            sb.append(" where ").append(b).append("=").append(b1);
            String sql = sb.toString();
            Connection con = DriverManager.getConnection(ap.URL,ap.USER,ap.PASS);
            PreparedStatement pst = con.prepareStatement(sql);

            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
