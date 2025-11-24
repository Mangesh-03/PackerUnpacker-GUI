package Mangesh.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Mangesh.GUI.GUIPX;
import Mangesh.GUI.GUIU;

public class PackerUnpackerInterface implements ActionListener
{
    private JFrame fobj;
    private JButton Pack, Unpack;
    private JLabel titleLabel;

    public PackerUnpackerInterface(String Title, int Width, int Height)
    {
        fobj = new JFrame();
        fobj.setTitle(Title);
        fobj.setSize(Width, Height);
        fobj.setLayout(null);
        fobj.setLocationRelativeTo(null);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font titleFont = new Font("Arial", Font.BOLD, 22);
        Font btnFont = new Font("Arial", Font.BOLD, 16);

        // Title
        titleLabel = new JLabel("Marvellous Packer - Unpacker", SwingConstants.CENTER);
        titleLabel.setFont(titleFont);
        titleLabel.setBounds(20, 20, 360, 40);
        fobj.add(titleLabel);

        // Pack Button
        Pack = new JButton("Pack");
        Pack.setFont(btnFont);
        Pack.setBounds(80, 110, 120, 40);
        Pack.addActionListener(this);
        fobj.add(Pack);

        // Unpack button
        Unpack = new JButton("Unpack");
        Unpack.setFont(btnFont);
        Unpack.setBounds(210, 110, 120, 40);
        Unpack.addActionListener(this);
        fobj.add(Unpack);

        fobj.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == Pack)
        {
            fobj.setVisible(false);
            new GUIPX("Packer", 400, 300);
        }
        else if (e.getSource() == Unpack)
        {
            fobj.setVisible(false);
            new GUIU("Unpacker", 400, 300);
        }
    }
}
