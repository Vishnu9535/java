import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class SpaceStation extends JFrame implements ActionListener {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    JLabel titleLabel, usernameLabel, passwordLabel;
    JPanel formPanel, buttonPanel;

    public SpaceStation() {
        // Create JFrame and components
        titleLabel = new JLabel("International Space Station");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));	
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setForeground(Color.BLACK);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setForeground(Color.BLACK);
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.BLACK);
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));
        usernameField = new JTextField(35);
        passwordField = new JPasswordField(35);
        loginButton = new JButton("Login");
        
        // Styling the login button
        loginButton.setBackground(new Color(102, 0, 153));
        loginButton.setForeground(Color.black);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("Arial", Font.BOLD, 18));

        // Add action listener to login button
        loginButton.addActionListener(this);

        // Form panel setup
        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        formPanel.setBackground(Color.WHITE);
        formPanel.add(usernameLabel);
        formPanel.add(usernameField);
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);

        // Button panel setup
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.add(loginButton);

        // Main frame layout
        setLayout(new BorderLayout(10, 10));
        add(titleLabel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // JFrame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String username = usernameField.getText();
    String password = new String(passwordField.getPassword());

    // Check credentials in the database
    if (checkCredentials(username, password)) {
        JOptionPane.showMessageDialog(this, "Login Successful!");
        // Close the login window
        this.dispose();
        // Open the home page
        new HomePage();
    } else {
        JOptionPane.showMessageDialog(this, "Login Failed!");
    }
}

    private boolean checkCredentials(String username, String password) {
        // Database URL and credentials
        String url = "jdbc:mysql://localhost:3306/spacestation";
        String dbUsername = "root"; // replace with your MySQL username
        String dbPassword = "dell@123"; // replace with your MySQL password
        String query = "SELECT * FROM Users WHERE username = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            // Set the values for the query parameters
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public static void main(String[] args) {
        // Set the look and feel to the system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SpaceStation();
            }
        });
    }
}