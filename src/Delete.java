import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Which Table did u want to delete??  " );
            String a = sc.nextLine();
            String sql = String.format("drop table %s", a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
