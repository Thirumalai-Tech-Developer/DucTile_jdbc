public class App {
    public static final String URL = "jdbc:mysql://localhost:3306/gt";
    public static final String USER = "root";
    public static final String PASS = "gtking";
    public static void main(String[] args) {
        System.out.println("What operation did want perform \n 1.Create Table \n 2.Update Table \n 3.Insert Value in Table \n 4.Delete the Table");
        Create create = new Create();
    }
}
