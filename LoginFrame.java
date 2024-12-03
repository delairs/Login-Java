import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {

    private JLabel userLabel, passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginFrame() {
        setTitle("User Login");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Label and TextField for username
        userLabel = new JLabel("Username:");
        userTextField = new JTextField(20);
        
        // Label and PasswordField for password
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        
        // Login Button
        loginButton = new JButton("Login");

        // Action when login button is clicked
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                String password = new String(passwordField.getPassword());
                
                // Simple validation
                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            }
        });

        // Add components to the frame
        add(userLabel);
        add(userTextField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
    }
}
