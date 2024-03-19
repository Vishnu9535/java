import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.events.MouseEvent;
import java.awt.event.MouseAdapter;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.sql.*;
import java.util.Vector;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.Vector;

public class HomePage extends JFrame {
  // Constructor for HomePage
    public HomePage() {
        setTitle("Home Page");
        setSize(300, 200); // Set the window size
        setLayout(new GridLayout(3, 1, 10, 10)); // 3 rows, 1 column, with padding
        setLocationRelativeTo(null); // Center on screen

        // Create buttons
        JButton addButton = new JButton("Add");
        JButton viewButton = new JButton("View");
        JButton updateButton = new JButton("Update");

        // Add action listeners to buttons
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addRecord();
            }
        });

        

        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewRecords();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateRecord();
            }
        });

        // Add buttons to JFrame
        add(addButton);
        add(viewButton);
        add(updateButton);

        // Set default close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Placeholder method for adding a record
    private void addRecord() {
        // Options for the types of records to add
        String[] options = {"Crew Members", "Experiments", "Resources"};
    
        // Create a JOptionPane
        int choice = JOptionPane.showOptionDialog(this, 
            "What would you like to add?", 
            "Add Record", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]);
    
        // Based on the user's choice, call different methods
        switch (choice) {
            case 0: // Crew Members
                addCrewMember();
                break;
            case 1: // Experiments
                addExperiment();
                break;
            case 2: // Resources
                addResource();
                break;
            default:
                // If the user closes the dialog, do nothing
                break;
        }
    }

    private void insertCrewMemberIntoDB(String crewId, String crewName, String expAllot) {
    String url = "jdbc:mysql://localhost:3306/spacestation";
    String dbUsername = "root"; // Replace with your MySQL username
    String dbPassword = "dell@123"; // Replace with your MySQL password
    String query = "INSERT INTO CrewMembers (Crew_id, Crew_name, Exp_allot) VALUES (?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        // Set the values for the INSERT statement
        pstmt.setString(1, crewId);
        pstmt.setString(2, crewName);
        pstmt.setString(3, expAllot);

        // Execute the INSERT statement
        int affectedRows = pstmt.executeUpdate();
        if (affectedRows > 0) {
            JOptionPane.showMessageDialog(this, "Crew member added successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add crew member.");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error while adding crew member.");
    }
}

    
    // Placeholder methods for adding crew members, experiments, and resources
    private void addCrewMember() {
        JTextField crewIdField = new JTextField();
        JTextField crewNameField = new JTextField();
        JTextField expAllotField = new JTextField();
    
        Object[] message = {
            "Crew ID:", crewIdField,
            "Crew Name:", crewNameField,
            "Experiment Allotted:", expAllotField
        };
    
        int option = JOptionPane.showConfirmDialog(this, message, "Enter Crew Member Details", JOptionPane.OK_CANCEL_OPTION);
    
        if (option == JOptionPane.OK_OPTION) {
            // Get values from text fields
            String crewId = crewIdField.getText();
            String crewName = crewNameField.getText();
            String expAllot = expAllotField.getText();
            
            // Insert data into database
            insertCrewMemberIntoDB(crewId, crewName, expAllot);
        }
    }
    
    
    private void inserExperimentsIntoDB(String ExpId, String ExpName, String progress) {
        String url = "jdbc:mysql://localhost:3306/spacestation";
        String dbUsername = "root"; // Replace with your MySQL username
        String dbPassword = "dell@123"; // Replace with your MySQL password
        String query = "INSERT INTO experiment (Ex_id, Ex_name, progress) VALUES (?, ?, ?)";
    
        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
    
            // Set the values for the INSERT statement
            pstmt.setString(1, ExpId);
            pstmt.setString(2, ExpName);
            pstmt.setString(3, progress);
    
            // Execute the INSERT statement
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Experiment added successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add Experiment.");
            }
    
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error while adding Expermients.");
        }
    }
    
    private void addExperiment() {
        JTextField ExpIdField = new JTextField();
        JTextField ExpNameField = new JTextField();
        JTextField progressField = new JTextField();
    
        Object[] message = {
            "Exp ID:", ExpIdField,
            "Exp Name:", ExpNameField,
            "progress:", progressField
        };
    
        int option = JOptionPane.showConfirmDialog(this, message, "Enter Expermint Details", JOptionPane.OK_CANCEL_OPTION);
    
        if (option == JOptionPane.OK_OPTION) {
            // Get values from text fields
            String ExpId = ExpIdField.getText();
            String ExpName = ExpNameField.getText();
            String progress = progressField.getText();
            
            // Insert data into database
            inserExperimentsIntoDB(ExpId, ExpName, progress);
        }
    }


    private void insertresourcesIntoDB(String RecNo, String Type, String Quantity) {
        String url = "jdbc:mysql://localhost:3306/spacestation";
        String dbUsername = "root"; // Replace with your MySQL username
        String dbPassword = "dell@123"; // Replace with your MySQL password
        String query = "INSERT INTO Resources (RecNo, Type, Quantity) VALUES (?, ?, ?)";
    
        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
    
            // Set the values for the INSERT statement
            pstmt.setString(1, RecNo);
            pstmt.setString(2, Type);
            pstmt.setString(3, Quantity);
    
            // Execute the INSERT statement
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Resources added successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add Resources.");
            }
    
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error while adding Resources.");
        }
    }
    
    private void addResource() {
        JTextField RecNoField = new JTextField();
        JTextField TypeField = new JTextField();
        JTextField QuantityField = new JTextField();
    
        Object[] message = {
            "Rec No:", RecNoField,
            "Type :", TypeField,
            "Quantity :", QuantityField
        };
    
        int option = JOptionPane.showConfirmDialog(this, message, "Enter Resource Details", JOptionPane.OK_CANCEL_OPTION);
    
        if (option == JOptionPane.OK_OPTION) {
            // Get values from text fields
            String RecNo = RecNoField.getText();
            String Type = TypeField.getText();
            String Quantity = QuantityField.getText();
            
            // Insert data into database
            insertresourcesIntoDB(RecNo, Type, Quantity);
        }
    }
    

    // Placeholder method for viewing records
    private void viewRecords() {
       // Options for the types of records to add
       String[] options = {"Crew Members", "Experiments", "Resources"};
    
       // Create a JOptionPane
       int choice = JOptionPane.showOptionDialog(this, 
           "What would you like to view?", 
           "View Record", 
           JOptionPane.DEFAULT_OPTION, 
           JOptionPane.QUESTION_MESSAGE, 
           null, 
           options, 
           options[0]);
   
       // Based on the user's choice, call different methods
       switch (choice) {
           case 0: // Crew Members
               viewCrewMembers();
               break;
           case 1: // Experiments
               viewExperiments();
               break;
           case 2: // Resources
               viewResources();
               break;
           default:
               // If the user closes the dialog, do nothing
               break;
       }
    }

    private void viewCrewMembers() {
    String url = "jdbc:mysql://localhost:3306/spacestation";
    String user = "root"; // replace with your MySQL username
    String password = "dell@123"; // replace with your MySQL password
    String query = "SELECT Crew_id, Crew_name, Exp_allot FROM CrewMembers";

    try (Connection con = DriverManager.getConnection(url, user, password);
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        JTable table = new JTable(buildTableModel(rs));
        JOptionPane.showMessageDialog(null, new JScrollPane(table), "View Crew Members", JOptionPane.PLAIN_MESSAGE);

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error while retrieving crew members.");
    }
}

private void viewExperiments() {
    String url = "jdbc:mysql://localhost:3306/spacestation";
    String user = "root"; // replace with your MySQL username
    String password = "dell@123"; // replace with your MySQL password
    String query = "SELECT Ex_id, Ex_name, progress FROM experiment";

    try (Connection con = DriverManager.getConnection(url, user, password);
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        // Create a JTable to hold the data
        JTable table = new JTable(buildTableModel(rs));
        // Display the table in a JScrollPane
        JOptionPane.showMessageDialog(null, new JScrollPane(table), "View Experiment", JOptionPane.PLAIN_MESSAGE);

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error while retrieving Experiment.");
    }
}

private void viewResources() {
    String url = "jdbc:mysql://localhost:3306/spacestation";
    String user = "root"; // replace with your MySQL username
    String password = "dell@123"; // replace with your MySQL password
    String query = "SELECT RecNo, Type, Quantity FROM resources";

    try (Connection con = DriverManager.getConnection(url, user, password);
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        // Create a JTable to hold the data
        JTable table = new JTable(buildTableModel(rs));
        // Display the table in a JScrollPane
        JOptionPane.showMessageDialog(null, new JScrollPane(table), "View Resources", JOptionPane.PLAIN_MESSAGE);

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error while retrieving Resources.");
    }
}


    // Placeholder method for updating a record
    private void updateRecord() {
        // Options for the types of records to add
        String[] options = {"Crew Members", "Experiments", "Resources"};
    
        // Create a JOptionPane
        int choice = JOptionPane.showOptionDialog(this, 
            "What would you like to add?", 
            "Add Record", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]);
    
        // Based on the user's choice, call different methods
        switch (choice) {
            case 0: // Crew Members
                updateCrewMembers();
                break;
            case 1: // Experiments
                addExperiment();
                break;
            case 2: // Resources
                addResource();
                break;
            default:
                // If the user closes the dialog, do nothing
                break;
        }
    }

    





private void updateCrewMembers() {
    try {
        String url = "jdbc:mysql://localhost:3306/spacestation";
        String user = "root"; // Replace with your MySQL username
        String password = "dell@123"; // Replace with your MySQL password
        String query = "SELECT Crew_id, Crew_name, Exp_allot FROM CrewMembers";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            JTable table = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table), "Select a Crew Member to Edit", JOptionPane.PLAIN_MESSAGE);

            // Add a mouse listener to handle the selection and editing
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked((java.awt.event.MouseEvent) e);
                    if (((java.awt.event.MouseEvent) e).getClickCount() == 2) { // Check for double click
                        int row = table.getSelectedRow(); // Get the index of the selected row
                        // Assuming the first column contains the unique ID
                        String crewId = table.getModel().getValueAt(row, 0).toString();
                        String crewName = table.getModel().getValueAt(row, 1).toString();
                        String expAllot = table.getModel().getValueAt(row, 2).toString();
                        
                        // Now call the method to show the edit dialog
                        showEditDialog(crewId, crewName, expAllot);

                        
                    }
                }
            });
            
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error fetching crew members.");
    }
}

private void showEditDialog(String crewId, String crewName, String expAllot) {
    JTextField crewIdField = new JTextField(crewId);
    JTextField crewNameField = new JTextField(crewName);
    JTextField expAllotField = new JTextField(expAllot);
    
    crewIdField.setEditable(false); // Make Crew ID non-editable if it's your primary key

    Object[] message = {
        "Crew ID:", crewIdField,
        "Crew Name:", crewNameField,
        "Experiment Allotted:", expAllotField,
    };

    int option = JOptionPane.showConfirmDialog(this, message, "Edit Crew Member", JOptionPane.OK_CANCEL_OPTION);
    if (option == JOptionPane.OK_OPTION) {
        // Update the database with the new details
        updateCrewMemberInDB(crewId, crewNameField.getText(), expAllotField.getText());
    }
}

private void updateCrewMemberInDB(String crewId, String crewName, String expAllot) {
    String url = "jdbc:mysql://localhost:3306/spacestation";
    String dbUsername = "root";
    String dbPassword = "dell@123";
    String query = "UPDATE CrewMembers SET Crew_name = ?, Exp_allot = ? WHERE Crew_id = ?";

    try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setString(1, crewName);
        pstmt.setString(2, expAllot);
        pstmt.setString(3, crewId);

        int affectedRows = pstmt.executeUpdate();
        if (affectedRows > 0) {
            JOptionPane.showMessageDialog(this, "Crew member updated successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update crew member.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error while updating crew member.");
    }
}
















    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
    ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();

    // Names of columns
    Vector<String> columnNames = new Vector<>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // Data of the table
    Vector<Vector<Object>> data = new Vector<>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);
}

    // Main method to start the application
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
                new HomePage();
            }
        });
    }
}
