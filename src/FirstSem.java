import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FirstSem implements ActionListener {
    JFrame f;
    JPanel panel1,panel2;
    JLabel label;
    JButton but1,but2,but3,but4,but5,but6,but7,but8,but9;
    FirstSem()
    {
        f=new JFrame();
        f.setTitle("SELECT THE SUBJECT");
        f.setSize(500,550);
        f.setLocation(550,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1=new JPanel();
        panel1.setBounds(0,0,500,100);
        panel2=new JPanel();
        panel2.setBounds(0,100,500,450);
        panel2.setLayout(null);

        label=new JLabel("Select The Subject");
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("Arial",Font.ITALIC,35));


        panel1.add(label);

        but1=new JButton("P And S");
        but2=new JButton("DMS");
        but3=new JButton("C And DS");
        but4=new JButton("CO");
        but5=new JButton("DBMS");
        but6=new JButton("C And DS Lab");
        but7=new JButton("DBMS Lab");
        but8=new JButton("Python Lab");
        but9=new JButton("Prev");

        panel2.add(but1);
        panel2.add(but2);
        panel2.add(but3);
        panel2.add(but4);
        panel2.add(but5);
        panel2.add(but6);
        panel2.add(but7);
        panel2.add(but8);
        panel2.add(but9);


        but1.setBounds(10,120,150,50);
        but2.setBounds(300,120,150,50);
        but3.setBounds(10,200,150,50);
        but4.setBounds(300,200,150,50);
        but5.setBounds(10,280,150,50);
        but6.setBounds(300,280,150,50);
        but7.setBounds(10,360,150,50);
        but8.setBounds(300,360,150,50);
        but9.setBounds(200,450,90,30);

        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);






        f.add(panel1);
        f.add(panel2);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==but1)
        {
            try
            {
                String url="https://drive.google.com/file/d/1L9yQaQv2Idt6PuuT7bO-Gs024KN4SIZj/view?usp=share_link";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }
        }
        else if(e.getSource()==but2)
        {
            try
            {
                String url="https://drive.google.com/file/d/1AWqH7DlWpQ4WHXTEiaZCSArwZa2CfTDg/view?usp=share_link";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }

        }
        else if(e.getSource()==but3)
        {
            try
            {
                String url="https://drive.google.com/file/d/1-hv_PDamg_hvz2gYujwztboSkq9l5NZs/view?usp=share_link";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }

        }
        else if(e.getSource()==but4)
        {
            try
            {
                String url="https://drive.google.com/file/d/1ZV51GkRlUY82HryDHL5Prialfo80rhIv/view?usp=share_link";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }

        }
        else if(e.getSource()==but5)
        {
            try
            {
                String url="https://drive.google.com/file/d/1XP-SUXsp7mgkAcX3glkXvFG66JTDjed8/view?usp=share_link";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }

        }
        else if(e.getSource()==but6)
        {
            try
            {
                String url="https://drive.google.com/file/d/1cgCJMLeP3mP-xn_yWgxp-cBWPsaAFXAO/view?usp=share_link";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }

        }
        else if(e.getSource()==but7)
        {
            try
            {
                String url="https://drive.google.com/file/d/19egRkOpGE9h4c3DChQf34ZWnI9aM01Mn/view?usp=share_link";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }

        }
        else if(e.getSource()==but8)
        {
            try
            {
                String url="https://drive.google.com/file/d/10droA9FLVOUTlOwaKWTiCSodLPOHfaC9/view?usp=share_link";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }

        }
        else if(e.getSource()==but9)
        {
            f.dispose();
            SelectSemister obj1=new SelectSemister();
        }
    }
}
