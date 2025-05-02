final class SecuritySystem 
{
    boolean authenticateUser(String username, String password) 
    {
        return "admin".equals(username) && "password123".equals(password);
    }
}

/*
class AdvancedSecurity extends SecuritySystem {
    boolean authenticateUser(String username, String password) {
        return "superadmin".equals(username) && "securePass".equals(password);
    }
}
*/

public class SecurityDemo 
{
    public static void main(String[] args) 
    {
        SecuritySystem security = new SecuritySystem();
        
        String username = "admin";
        String password = "password123";

        if (security.authenticateUser(username, password)) 
        {
            System.out.println("Authentication successful!");
        } 
        else 
        {
            System.out.println("Authentication failed!");
        }
    }
}