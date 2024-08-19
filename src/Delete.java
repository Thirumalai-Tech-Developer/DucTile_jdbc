import java.util.Scanner;

public class Delete {
    public static void Delete(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("drop table ");
        try {
            System.out.print("Which Table did u want to delete??  " );
            String a = sc.nextLine();
            sb.append("'").append(a).append("'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
