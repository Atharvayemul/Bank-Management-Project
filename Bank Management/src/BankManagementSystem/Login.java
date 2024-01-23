package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton login,clear,signup;
    JTextField cardtextfield;
    JPasswordField pintextfield;

    Login()
    {
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("Welcome to Atm");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(250,40,400,40);
        add(text);

        JLabel cardno = new JLabel("Card No.");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);

         cardtextfield = new JTextField();
        cardtextfield.setBounds(300,150,230,30);
        cardtextfield.setFont(new Font("Arial",Font.BOLD,14));
        add(cardtextfield);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Osward",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);

         pintextfield = new JPasswordField();
        pintextfield.setBounds(300,220,230,30);
        pintextfield.setFont(new Font("Arial",Font.BOLD,14));
        add(pintextfield);

         login = new JButton("SIGN IN");
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.setBounds(300,300,100,30);
        login.addActionListener(this);
        add(login);

         clear = new JButton("CLEAR");
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.setBounds(430,300,100,30);
        clear.addActionListener(this);
        add(clear);

         signup = new JButton("SIGNUP");
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.setBounds(300,350,230,30);
        signup.addActionListener(this);
        add(signup);



        getContentPane().setBackground(Color.white);


        setSize(800,480);
        setVisible(true);
        setLocation(350,200);

    }

    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == clear)
        {
            cardtextfield.setText("");
            pintextfield.setText("");

        } else if (actionEvent.getSource() == login) {
            Conn conn = new Conn();
            String cardnumber = cardtextfield.getText();
            String pinnumber = pintextfield.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"' ";
            try {
               ResultSet rs = conn.s.executeQuery(query);
               if (rs.next())
               {
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(null,"Incorrect Credentails");
               }
            }catch (Exception e){
                System.out.println(e);
            }

        } else if (actionEvent.getSource() == signup) {

            setVisible(false);
            new Signupone().setVisible(true);
        }

    }


    public static void main(String[] args) {
        new Login();

//        As soon as we create object the login constructor gets called
    }
}
