import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class SecondSem implements ActionListener {
    JFrame f;
    JPanel panel1,panel2;
    JLabel label;
    JButton but1,but2,but3,but4,but5,but6,but7,but8,but9;
    SecondSem()
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

        but1=new JButton("OOPS Through Java");
        but2=new JButton("OS");
        but3=new JButton("DAA");
        but4=new JButton("SE");
        but5=new JButton("CN");
        but6=new JButton("Java Lab");
        but7=new JButton("OS Lab");
        but8=new JButton("SE Lab");
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


        but1.setBounds(10,120,170,60);
        but2.setBounds(300,120,170,60);
        but3.setBounds(10,200,170,60);
        but4.setBounds(300,200,170,60);
        but5.setBounds(10,280,170,60);
        but6.setBounds(300,280,170,60);
        but7.setBounds(10,360,170,60);
        but8.setBounds(300,360,170,60);
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
                String url="https://drive.google.com/file/d/1a5658eRJCPuyeBCA-jEW3cUNeuV5rvgk/view?usp=share_link";
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
                String url="https://drive.google.com/file/d/1xm1xU-DpPa0DTT2uk72jG-1I0jspr77O/view?usp=share_link";
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
                String url="https://drive.google.com/file/d/12UPQ5gY_HoPsaCtO6yMnxLhogtH6sP4q/view?usp=share_link";
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
                String url="https://drive.google.com/file/d/1NhFwQVxXEab-aUmrkn0pfb5bVyfokf9x/view?usp=share_link";
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
                String url="https://drive.google.com/file/d/1cDG42uzSt6oAlLo5cGzPA7NFgOgyVTQc/view?usp=share_link";
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
                String url="https://drive.google.com/file/d/1wgdbUsrx8raVe7U5wsXV_N4Rz3Uh8V4b/view?usp=share_link";
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
                String url="https://drive.google.com/file/d/1fFr05RFV49wtY2isOHMl4smiaJxBQP4F/view?usp=share_link";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }
        }
        else if(e.getSource()==but8)
        {try
        {
            String url="https://drive.google.com/file/d/1NqG-Xb36o4eZ1ldZSffUjsKVsXxfGcQP/view?usp=share_link";
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
