import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        MySingletonClass mySingletonClass = MySingletonClass.getInstance();
        Connection connection = MySingletonClass.getInstance().getConnection();
    }

}