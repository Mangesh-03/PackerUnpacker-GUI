package Mangesh.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Mangesh.Logic.MarvellousPacker;
import java.util.ArrayList;
import java.io.*;

public class GUIPX implements ActionListener 
{
    private ArrayList<String> UsedFiles;
    private JFrame fobj;
    private JButton packButton,backButton;
    private JLabel DirNameLabel, PackNameLabel, Resultlabel, titleLabel;
    private JTextField DirNameTextField, PackNameTextField;

    public GUIPX(String Title, int Width, int Height)
    {
        UsedFiles = new ArrayList<>();
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
        titleLabel = new JLabel("Marvellous Packer");
        titleLabel.setFont(titleFont);
        titleLabel.setBounds(110, 20, 250, 30);
        fobj.add(titleLabel);

        // Folder Name Label
        DirNameLabel = new JLabel("Folder Name:");
        DirNameLabel.setFont(labelFont);
        DirNameLabel.setBounds(40, 70, 120, 40);
        fobj.add(DirNameLabel);

        // Folder Textbox
        DirNameTextField = new JTextField();
        DirNameTextField.setFont(textFont);
        DirNameTextField.setBounds(170, 70, 180, 40);
        fobj.add(DirNameTextField);

        // Output File Label
        PackNameLabel = new JLabel("Output File:");
        PackNameLabel.setFont(labelFont);
        PackNameLabel.setBounds(40, 140, 120, 40);
        fobj.add(PackNameLabel);

        // Output File Name Textbox
        PackNameTextField = new JTextField();
        PackNameTextField.setFont(textFont);
        PackNameTextField.setBounds(170, 140, 180, 40);
        fobj.add(PackNameTextField);

        // Result Label
        Resultlabel = new JLabel("");
        Resultlabel.setFont(new Font("Arial", Font.PLAIN, 15));
        Resultlabel.setBounds(100, 260, 200, 30);
        Resultlabel.setHorizontalAlignment(SwingConstants.CENTER);
        fobj.add(Resultlabel);

        // Pack Button
        packButton = new JButton("Pack");
        packButton.setFont(new Font("Arial", Font.BOLD, 16));
        packButton.setBounds(140, 210, 120, 40);
        packButton.addActionListener(this);
        fobj.add(packButton);

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
        if (e.getSource() == packButton)
        {
            String folder = DirNameTextField.getText().trim();
            String file = PackNameTextField.getText().trim();

            File fobj1 = new File(file);
            File dobj = new File(folder);

            if (folder.isEmpty())
            {
                Resultlabel.setText("Enter folder name");
                return;
            }

            if (file.isEmpty())
            {
                Resultlabel.setText("Enter output file name");
                return;
            }

            if (!dobj.exists())
            {
                Resultlabel.setText("Folder not found");
                return;
            }

            if (fobj1.exists())
            {
                Resultlabel.setText("File already exists");
                return;
            }
            MarvellousPacker mobj = new MarvellousPacker(file, folder);
            mobj.PackingActivity();
            Resultlabel.setText("Packed Successfully");
        }
        else if(e.getSource() == backButton)
        {
            fobj.setVisible(false);
            new PackerUnpackerInterface("Interface", 400, 300);
        }
    }
}
