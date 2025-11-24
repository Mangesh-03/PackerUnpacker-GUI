package Mangesh.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Mangesh.Login.LoginPageX;
import Mangesh.GUI.PackerUnpackerInterface;

public class UsernamePasswordGUI implements ActionListener
{
    private JFrame fobj;
    private JButton SignIn, SignUp;
    private JLabel UserLabel, PassLabel, Resultlabel;
    private JTextField UserTextField, PassTextField;

    LoginPageX lobj = new LoginPageX();

    public UsernamePasswordGUI(String Title, int Width, int Height)
    {
        fobj = new JFrame();
        fobj.setTitle(Title);
        fobj.setSize(Width, Height);
        fobj.setLayout(null);
        fobj.setLocationRelativeTo(null);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font labelFont = new Font("Arial", Font.BOLD, 16);
        Font textFont = new Font("Arial", Font.PLAIN, 16);
        Font buttonFont = new Font("Arial", Font.BOLD, 16);

        UserLabel = new JLabel("Enter Username:");
        UserLabel.setFont(labelFont);
        UserLabel.setBounds(40, 40, 150, 30);

        UserTextField = new JTextField();
        UserTextField.setFont(textFont);
        UserTextField.setBounds(180, 40, 170, 30);

        PassLabel = new JLabel("Enter Password:");
        PassLabel.setFont(labelFont);
        PassLabel.setBounds(40, 90, 150, 30);

        PassTextField = new JTextField();
        PassTextField.setFont(textFont);
        PassTextField.setBounds(180, 90, 170, 30);

        SignIn = new JButton("Sign In");
        SignIn.setFont(buttonFont);
        SignIn.setBounds(80, 150, 120, 40);
        SignIn.addActionListener(this);

        SignUp = new JButton("Sign Up");
        SignUp.setFont(buttonFont);
        SignUp.setBounds(220, 150, 120, 40);
        SignUp.addActionListener(this);

        Resultlabel = new JLabel("", SwingConstants.CENTER);
        Resultlabel.setFont(new Font("Arial", Font.PLAIN, 14));
        Resultlabel.setBounds(80, 210, 240, 30);

        fobj.add(UserLabel);
        fobj.add(UserTextField);
        fobj.add(PassLabel);
        fobj.add(PassTextField);
        fobj.add(SignIn);
        fobj.add(SignUp);
        fobj.add(Resultlabel);

        fobj.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String Username = UserTextField.getText();
        String Password = PassTextField.getText();
        int iRet = 0;

        if (e.getSource() == SignIn)
        {
            if (Username.isEmpty())
            {
                Resultlabel.setText("Enter the Username");
                return;
            }
            if (Password.isEmpty())
            {
                Resultlabel.setText("Enter the Password");
                return;
            }

            iRet = lobj.ChkUserPass(Username, Password);

            if (iRet == 0)
            {
                Resultlabel.setText("Login Successful");
                fobj.setVisible(false);
                new PackerUnpackerInterface("Interface", 400, 300);
            }
            else if (iRet == 1)
            {
                Resultlabel.setText("Incorrect Password");
            }
            else if (iRet == -1)
            {
                Resultlabel.setText("Invalid Username");
            }
        }
        else if (e.getSource() == SignUp)
        {
            if (Username.isEmpty())
            {
                Resultlabel.setText("Enter the Username");
                return;
            }
            if (Password.isEmpty())
            {
                Resultlabel.setText("Enter the Password");
                return;
            }

            iRet = lobj.CreateUserPass(Username, Password);

            if (iRet == 1)
            {
                Resultlabel.setText("Account Created Successfully");
            }
            else
            {
                Resultlabel.setText("Username Already Exists");
            }
        }
    }
}
