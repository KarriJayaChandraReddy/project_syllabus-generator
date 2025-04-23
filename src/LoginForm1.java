import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginForm1 implements ActionListener
{
    HashMap<String,String> logininfo=new HashMap<String,String>();

    JFrame f;
    JLabel label1,label2,messagelabel;
    JTextField user;
    JPasswordField pass;
    JButton btn1,btn2;

    LoginForm1(HashMap<String,String> loginInfoOriginal)
    {
        logininfo=loginInfoOriginal;
        f=new JFrame();
        f.setTitle("LOGIN FORM");
        f.setSize(400,300);
        f.setLocation(550,250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        label1=new JLabel("Username");
        label2=new JLabel("Password");
        messagelabel=new JLabel();

        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20);
        messagelabel.setBounds(150,180,100,20);

        f.add(label1);
        f.add(label2);
        f.add(messagelabel);

        user=new JTextField();
        user.setBounds(120,50,120,20);
        f.add(user);

        pass=new JPasswordField();
        pass.setBounds(120,100,120,20);
        f.add(pass);

        btn1=new JButton("Login");
        btn1.setBounds(100,150,70,20);
        btn1.addActionListener(this);
        f.add(btn1);

        btn2=new JButton("Reset");
        btn2.setBounds(190,150,70,20);
        btn2.addActionListener(this);
        f.add(btn2);



        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn2)
        {
            user.setText("");
            pass.setText("");
        }
        if(e.getSource()==btn1)
        {
            String userid=user.getText();
            String password=String.valueOf(pass.getPassword());
            if(logininfo.containsKey(userid))
            {
                if(logininfo.get(userid).equals(password))
                {
                    f.dispose();
                    SelectSemister obj1=new SelectSemister();
                }
                else
                {
                    messagelabel.setForeground(Color.red);
                    messagelabel.setText("Invalid Password");
                }
            }
            else
            {
                messagelabel.setForeground(Color.red);
                messagelabel.setText("Invalid Username");
            }
        }
    }

}
