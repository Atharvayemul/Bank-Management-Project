package BankManagementSystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signupone  extends JFrame implements ActionListener {

    long random;
    JTextField nameTextfield,fnameTextfield,emailTextfield,addressTextfield,cityTextfield,stateTextfield,pinTextfield;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;



    Signupone()
    {
        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personDetails = new JLabel("Page 1 : Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);


        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

         nameTextfield  = new JTextField();
        nameTextfield.setFont( new Font("Raleway",Font.BOLD,14));
        nameTextfield.setBounds(300,140,400,30);
        add(nameTextfield);


        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

         fnameTextfield  = new JTextField();
        fnameTextfield.setFont( new Font("Raleway",Font.BOLD,14));
        fnameTextfield.setBounds(300,190,400,30);
        add(fnameTextfield);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

         dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);


        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

         male = new JRadioButton("Male");
        male.setBounds(300,290,120,30);
        male.setBackground(Color.white);
        add(male);

         female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);


        JLabel email = new JLabel("Email Address");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

         emailTextfield  = new JTextField();
        emailTextfield.setFont( new Font("Raleway",Font.BOLD,14));
        emailTextfield.setBounds(300,340,400,30);
        add(emailTextfield);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

         married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);

         unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);

         other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.white);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

         addressTextfield  = new JTextField();
        addressTextfield.setFont( new Font("Raleway",Font.BOLD,14));
        addressTextfield.setBounds(300,440,400,30);
        add(addressTextfield);


        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

         cityTextfield  = new JTextField();
        cityTextfield.setFont( new Font("Raleway",Font.BOLD,14));
        cityTextfield.setBounds(300,490,400,30);
        add(cityTextfield);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

         stateTextfield  = new JTextField();
        stateTextfield.setFont( new Font("Raleway",Font.BOLD,14));
        stateTextfield.setBounds(300,540,400,30);
        add(stateTextfield);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

         pinTextfield  = new JTextField();
        pinTextfield.setFont( new Font("Raleway",Font.BOLD,14));
        pinTextfield.setBounds(300,590,400,30);
        add(pinTextfield);

         next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        add(next);
        next.addActionListener(this);




        getContentPane().setBackground(Color.white);


        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent actionEvent)
    {
        String formno = "" + random;
        String name = nameTextfield.getText();
        String fname = fnameTextfield.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected())
        {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailTextfield.getText();
        String marital = null;
        if (married.isSelected())
        {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String address = addressTextfield.getText();
        String city = cityTextfield.getText();
        String state = stateTextfield.getText();
        String pin = pinTextfield.getText();

        try {

            if (name.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
                new Signup2(formno).setVisible(true);

            }

        }catch (Exception e)
        {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        new Signupone();
    }
}
