import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FourthSem implements ActionListener {
    JFrame f;
    JPanel panel1,panel2;
    JLabel label;
    JButton but1,but2,but3,but4,but5,but6,but7,but8,but9;
    FourthSem()
    {
        f=new JFrame();
        f.setTitle("SELECT THE SUBJECT");
        f.setSize(500,500);
        f.setLocation(550,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1=new JPanel();
        panel1.setBounds(0,0,500,150);
        panel2=new JPanel();
        panel2.setBounds(0,150,500,350);
        panel2.setLayout(null);

        label=new JLabel("Select The Subject");
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("Arial",Font.ITALIC,35));


        panel1.add(label);

        but1=new JButton("Big Data Analytics");
        but2=new JButton("Cloud Computing");
        but3=new JButton("Prev");

        panel2.add(but1);
        panel2.add(but2);
        panel2.add(but3);


        but1.setBounds(10,180,170,60);
        but2.setBounds(300,180,170,60);
        //but3.setBounds(10,200,170,60);
        but3.setBounds(200,300,90,30);

        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);


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
                String url="https://drive.google.com/file/d/1jadPQMGOzpTXH_NUoZqPVUuL3poxVpMs/view?usp=sharing";
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
                String url="https://drive.google.com/file/d/1WkJQJF-I8HvkSH7AZW99Zkd4_DF9fQ3c/view?usp=sharing";
                Desktop.getDesktop().browse(new URI(url));
            }
            catch (IOException | URISyntaxException ex)
            {
                ex.printStackTrace();
            }

        }

        else if(e.getSource()==but3)
        {
            f.dispose();
            SelectSemister obj1=new SelectSemister();
        }
    }
}
