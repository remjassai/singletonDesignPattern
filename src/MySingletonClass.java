import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySingletonClass {
    private static MySingletonClass istance = null;
    private String url = "Uniform/Resource/Locator";
    private String usrName = "user";
    private String pass = "password";

    private MySingletonClass() {

    }

    public static MySingletonClass getInstance(){
        if(istance == null){
            istance = new MySingletonClass();
        }
        return istance;
    }
    public Connection getConnection(){
        try{
            return DriverManager.getConnection(url,usrName,pass);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public String getUrl(){
        return url;
    }

    public String getUsrName(){
        return usrName;
    }

    public String getPass(){
        return pass;
    }

}
