import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
    public void Delete() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Delete Table or Column \n 1.Table \n 2.Coloumn");
        int n = sc.nextInt();
        sc.nextLine();
        App ap = new App();
        System.out.print("Enter table name " );
        String a = sc.nextLine();
        
        try {
            Connection con = DriverManager.getConnection(ap.URL,ap.USER,ap.PASS);
            switch(n){
                case 1:
                    sb.append("drop table ").append(a);
                    break;
                case 2:
                    System.out.print("Which Column did u want to delete??  " );
                    String a1 = sc.nextLine();
                    sb.append("alter table ").append(a).append(" drop column ").append(a1);
                    break;
            }
            PreparedStatement pst = con.prepareStatement(sb.toString());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        sc.close();
    }
}
