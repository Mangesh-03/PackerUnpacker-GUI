package Mangesh.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Mangesh.Logic.MarvellousUnpacker;
import java.io.*;

class GUIU implements ActionListener
{
    private JFrame fobj;
    private JButton unpackButton,backButton;
    private JLabel FileNameLabel, ResultLabel, titleLabel;
    private JTextField FileNameTextField;

    public GUIU(String Title, int Width, int Height)
    {
        fobj = new JFrame();
        fobj.setTitle(Title);
        fobj.setSize(Width, Height);
        fobj.setLayout(null);
        fobj.setLocationRelativeTo(null);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font labelFont = new Font("Arial", Font.BOLD, 16);
        Font textFont = new Font("Arial", Font.PLAIN, 16);
        Font titleFont = new Font("Arial", Font.BOLD, 20);

        // Title
        titleLabel = new JLabel("Marvellous Unpacker");
        titleLabel.setFont(titleFont);
        titleLabel.setBounds(105, 20, 250, 30);
        fobj.add(titleLabel);

        // File name label
        FileNameLabel = new JLabel("Packed File:");
        FileNameLabel.setFont(labelFont);
        FileNameLabel.setBounds(40, 80, 120, 40);
        fobj.add(FileNameLabel);

        // File name textbox
        FileNameTextField = new JTextField();
        FileNameTextField.setFont(textFont);
        FileNameTextField.setBounds(160, 80, 180, 40);
        fobj.add(FileNameTextField);

        // Result label
        ResultLabel = new JLabel("", SwingConstants.CENTER);
        ResultLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        ResultLabel.setBounds(100, 230, 200, 30);
        fobj.add(ResultLabel);

        // Unpack button
        unpackButton = new JButton("Unpack");
        unpackButton.setFont(new Font("Arial", Font.BOLD, 16));
        unpackButton.setBounds(140, 170, 120, 40);
        unpackButton.addActionListener(this);
        fobj.add(unpackButton);

        //back button
        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.BOLD, 16));
        backButton.setBounds(20, 20, 80, 30); 
        backButton.addActionListener(this);
        fobj.add(backButton);

        fobj.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == unpackButton)
        {
            try
            {
                String file = FileNameTextField.getText().trim();

                if (file.isEmpty())
                {
                    ResultLabel.setText("Enter packed file name");
                    return;
                }

                File f = new File(file);
                if (!f.exists())
                {
                    ResultLabel.setText("File not found");
                    return;
                }
                
                MarvellousUnpacker mobj = new MarvellousUnpacker(file);
                mobj.UnpackingActivity();

                ResultLabel.setText("Unpacked Successfully!");
            }
            catch (Exception ex)
            {
                ResultLabel.setText("Error: " + ex.getMessage());
            }
        }
        else if(e.getSource() == backButton)
        {
            fobj.setVisible(false);
            new PackerUnpackerInterface("Interface", 400, 300);
        }
    }
}

