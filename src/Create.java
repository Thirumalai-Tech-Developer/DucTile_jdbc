
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Create {
    public void Create() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("Enter table name : ");
        App ap = new App();
        sb.append(sc.nextLine());
        try {
            System.out.println("How many coloums you want to add");
            int n = sc.nextInt();
            sc.nextLine();
            sb.append("(");
            for (int i = 1; i <= n ; i++){
                System.out.print("Coloumn_"+i+" name ");
                sb.append(sc.nextLine());
                sb.append(" ");
                System.out.println();
                System.out.print("Coloumn_"+i+" Datatype ");
                sb.append(sc.nextLine()).append(" not null");
                System.out.println();
                if (i != n) sb.append(",");
            }
            sb.append(")");
            String name = sb.toString();
            String sql = String.format("create table %s", name );
            Connection con = DriverManager.getConnection(ap.URL,ap.USER,ap.PASS);
            PreparedStatement pst = con.prepareStatement(sql);
        pst.executeUpdate();
        } catch (SQLException s) {
            System.out.println(s);
        }
    }
}
