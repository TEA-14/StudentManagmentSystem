import javax.swing.*;
import java.awt.*;

public class Students {
    JFrame frame;
    JTextField first_name, last_name, age, email;
    JButton add_student, view_student, search_student;

    Students() {
        frame = new JFrame("Student Management System");
        frame.setLayout(null); // Set layout to null for absolute positioning

        JLabel head_label = new JLabel("Student Management System");
        head_label.setBounds(200, 2, 300, 80);

        JLabel fname = new JLabel("First Name");
        fname.setBounds(50, 100, 150, 20);

        JLabel lname = new JLabel("Last Name");
        lname.setBounds(50, 150, 150, 20);

        JLabel mail = new JLabel("Email");
        mail.setBounds(50, 200, 150, 20);

        JLabel sage = new JLabel("Age");
        sage.setBounds(50, 250, 150, 20);

        first_name = new JTextField();
        first_name.setBounds(200, 100, 150, 20);

        last_name = new JTextField();
        last_name.setBounds(200, 150, 150, 20);

        email = new JTextField();
        email.setBounds(200, 200, 150, 20);

        age = new JTextField();
        age.setBounds(200, 250, 150, 20);

        add_student = new JButton("Add Student");
        add_student.setBounds(50, 300, 150, 30);

        view_student = new JButton("View Student");
        view_student.setBounds(220, 300, 150, 30);

        search_student = new JButton("Search Student");
        search_student.setBounds(390, 300, 150, 30);

        frame.add(head_label);
        frame.add(fname);
        frame.add(lname);
        frame.add(mail);
        frame.add(sage);

        frame.add(first_name);
        frame.add(last_name);
        frame.add(email);
        frame.add(age);

        frame.add(add_student);
        frame.add(view_student);
        frame.add(search_student);

        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
