import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ThirdSem implements ActionListener {
    JFrame f;
    JPanel panel1,panel2;
    JLabel label;
    JButton but1,but2,but3,but4,but5,but6,but7,but8,but9,but10;
    ThirdSem()
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

        but1=new JButton("Full Stack Wed Development");
        but2=new JButton("Data Science");
        but3=new JButton("Internet OF Things");
        but4=new JButton("Cyber Security And Forensics");
        but5=new JButton("Professional Ethics");
        but6=new JButton("Full Stack Wed Development Lab");
        but7=new JButton("Data Science With R Programming Lab");
        but8=new JButton("Internet OF Things Lab");
        but9=new JButton("Mini Project");
        but10=new JButton("Prev");

        panel2.add(but1);
        panel2.add(but2);
        panel2.add(but3);
        panel2.add(but4);
        panel2.add(but5);
        panel2.add(but6);
        panel2.add(but7);
        panel2.add(but8);
        panel2.add(but9);
        panel2.add(but10);


        but1.setBounds(10,100,170,60);
        but2.setBounds(300,100,170,60);
        but3.setBounds(10,180,170,60);
        but4.setBounds(300,180,170,60);
        but5.setBounds(10,260,170,60);
        but6.setBounds(300,260,170,60);
        but7.setBounds(10,340,170,60);
        but8.setBounds(300,340,170,60);
        but9.setBounds(10,420,170,60);
        but10.setBounds(320,470,90,30);

        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);
        but10.addActionListener(this);






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
                String url="https://drive.google.com/file/d/1isGsHWq29VTe9pVNfqfV1DJEu6zZ6V_b/view?usp=sharing";
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
                String url="https://drive.google.com/file/d/1lrDWXE4O584QIho-uXV2EVFOyObzpgq0/view?usp=sharing";
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
                String url="https://drive.google.com/file/d/1spDo5BtKvBbIk8kpXs9VMaBmqAnO6el2/view?usp=sharing";
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
                String url="https://drive.google.com/file/d/1za3t2kBNmLE_nU1gjPlNzlknx9vbeUqB/view?usp=sharing";
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
                String url="https://drive.google.com/file/d/1Q2ZCZkE-1OrftAX9h3bvkjy3WMUDV5gR/view?usp=sharing";
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
                String url="https://drive.google.com/file/d/1IaZVin2PBk7jUxcpXuaVRRTAl8lom-uN/view?usp=sharing";
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
                String url="https://drive.google.com/file/d/1ajDRYJngJskXB2Gg0AVGhdI0xCh9eVEp/view?usp=sharing";
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
                String url="https://drive.google.com/file/d/1mMRbumKQBT338Q7ZsfW7JztWs6QLoAO2/view?usp=sharing";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }
        }
        else if(e.getSource()==but9)
        {
            try
            {
                String url="https://drive.google.com/file/d/1WU_ED4rnnTAtaUfi0cGVmHdAg0j-_owg/view?usp=sharing";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }
        }
        else if(e.getSource()==but10)
        {
            f.dispose();
            SelectSemister obj1=new SelectSemister();
        }
    }
}
