
import java.util.Scanner;

public class Create {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("Enter table name : ");
        sb.append(sc.nextLine());
        try {
            System.out.println("How many coloums you want to add");
            int n = sc.nextInt();
            sc.nextLine();
            sb.append("(");
            for (int i = 1; i <= n ; i++){
                System.out.print("Coloumn_name"+i+" ");
                sb.append(sc.nextLine());
                sb.append(" ");
                System.out.println();
                System.out.print("Coloumn_Datatype"+i+" ");
                sb.append(sc.nextLine()).append(" not null");
                System.out.println();
                if (i != n) sb.append(",");
            }
            sb.append(")");
        } catch (Exception s) {
            System.out.println(s);
        }
        String name = sb.toString();
        String sql = String.format("create table %s", name );
        System.out.println(sql);
        System.out.println(sb.toString());
    }
}
