import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectSemister implements ActionListener {
    JFrame f;
    JPanel panel1,panel2;
    JLabel label;
    JButton but1,but2,but3,but4,but5;
    SelectSemister()
    {
        f=new JFrame();
        f.setTitle("SELECT THE SEMISTER");
        f.setSize(500,500);
        f.setLocation(550,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1=new JPanel();
        panel1.setBounds(0,0,500,100);
        panel2=new JPanel();
        panel2.setBounds(0,100,500,400);
        panel2.setLayout(null);

        label=new JLabel("Select The Semister");
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("Arial",Font.ITALIC,35));


        panel1.add(label);

        but1=new JButton("First Semister");
        but2=new JButton("Second Semister");
        but3=new JButton("Third Semister");
        but4=new JButton("Fourth Semister");
        but5=new JButton("Prev");

        //but1.setBackground(Color.WHITE);
        //but1.setForeground(new Color(50,50,200));

        panel2.add(but1);
        panel2.add(but2);
        panel2.add(but3);
        panel2.add(but4);
        panel2.add(but5);

        but1.setBounds(10,120,150,50);
        but2.setBounds(300,120,150,50);
        but3.setBounds(10,200,150,50);
        but4.setBounds(300,200,150,50);
        but5.setBounds(200,300,90,30);

        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);





        f.add(panel1);
        f.add(panel2);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==but1)
        {
            f.dispose();
            FirstSem first=new FirstSem();
        }
        else if(e.getSource()==but2)
        {
            f.dispose();
            SecondSem first=new SecondSem();
        }
        else if(e.getSource()==but3)
        {
            f.dispose();
            ThirdSem first=new ThirdSem();
        }
        else if(e.getSource()==but4)
        {
            f.dispose();
            FourthSem fourth=new FourthSem();
        }
        else if(e.getSource()==but5)
        {
            f.dispose();
            IdsAndPasswords idsandpass=new IdsAndPasswords();

            LoginForm1 login=new LoginForm1(idsandpass.getLoginInfo());
        }
    }
}
