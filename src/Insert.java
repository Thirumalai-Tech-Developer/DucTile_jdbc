
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {
    public static void Insert() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        App ap = new App();
        try {
            System.out.print("Enter tablename to insert value ???");
            String tname = sc.nextLine();
            String sl = String.format("insert into %s() ",tname);
            sb.append(sl).append("value ");

            Connection con = DriverManager.getConnection(ap.URL,ap.USER,ap.PASS);
            Statement st = con.createStatement();
            String sql = String.format("SELECT * FROM %s",tname);
            ResultSet rs = st.executeQuery(sql);
            int count = 0;
            while(rs.next()){
                count++;
            }
            System.out.println("How many row's want to insert");
            int n= sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= n; i++){
                sb.append("(");
                for(int j = 1; j <= count ; j++){
                    System.out.printf("column_%d value ",i);
                    sb.append("'").append(sc.nextLine()).append("'");
                    if (j != count){
                        sb.append(",");
                    }
                }
                if ( i != n){
                    sb.append("),");
                }else sb.append(");");
            }
            System.out.println(sb.toString());
            PreparedStatement pst = con.prepareStatement(sb.toString());
            pst.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        sc.close();
    }
}