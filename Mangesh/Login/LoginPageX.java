package Mangesh.Login;

import java.util.*;

public class LoginPageX
{
    private String UserName;
    private String Password;

    private HashMap <String,String> hobj = new HashMap<>();

    public LoginPageX()
    {
        String UserName = "";
        String Password = "";
    }

    public int ChkUserPass(String A,String B)
    {
        this.UserName = A;
        this.Password = B;

        if(hobj.containsKey(UserName))
        {
            if(Password.equals(hobj.get(UserName)))
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
        else
        {
            return -1;
        }
    }//End of ChkUserPass

    public int CreateUserPass(String A, String B)
    {
        this.UserName = A;
        this.Password = B;

        
        if(hobj.containsKey(UserName))
        {
            System.out.println("Username already exists");
            return -1;
        }

        hobj.put(UserName,Password);
        return 1;

    }//End of CreateUSerPass

    public void ResetUserPass(String A, String B)
    {
        this.UserName = A;
        this.Password = B;

        if((UserName.isEmpty()))
        {
            System.out.println("Enter the Username properly");
            return;
        }
        if(! hobj.containsKey(UserName))
        {
            System.out.println("Username not exists");
            return;
        }
        String old  = hobj.get(UserName);

        if(old == Password)
        {
            System.out.println("old Password and new is identical please enter different password");
            return;
        }
        hobj.put(UserName,Password);
        System.out.println("Password Reset successfully");

    }
}

