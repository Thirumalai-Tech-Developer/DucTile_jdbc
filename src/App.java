
import java.util.Scanner;

public class App {
    public final String URL = "jdbc:mysql://localhost:3306/gt";
    public final String USER = "root";
    public final String PASS = "gtking";
    public static void main(String[] args) {
        System.out.println("What operation did want perform \n 1.Create Table \n 2.Update Table \n 3.Insert Value in Table \n 4.Delete the Table");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1 -> {
                Create cre = new Create();
                cre.Create();
            }
            case 2 -> {
                Update upd = new Update();
                upd.Update();
            }
            case 3 -> {
                Insert ins = new Insert();
                ins.Insert();
            }
            case 4 -> {
                Delete del = new Delete();
                del.Delete();
            }
        }
        sc.close();
    }
}
