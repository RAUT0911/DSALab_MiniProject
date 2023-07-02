/*
Design a mini project for automated Term work assessment of student based on 
parameters like daily attendance, Unit Test / Prelim performance, Students 
achievements if any, Mock Practical. 
Code Below WrittenIn JAVA LANGUAGE
*/
package termworkassessmentgui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TermWorkAssessmentGUI extends JFrame implements ActionListener {
    private JTextField nameField;
    private JTextField attendanceField;
    private JTextField unitTestField;
    private JTextField achievementsField;
    private JTextField mockPracticalField;
    private JLabel resultLabel;

    public TermWorkAssessmentGUI() {
        // Set up the GUI components
        setTitle("Term Work Assessment");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridLayout(6, 2, 10, 10));

        // Add labels and input fields for each parameter
        mainPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        mainPanel.add(nameField);

        mainPanel.add(new JLabel("Attendance (%):"));
        attendanceField = new JTextField();
        mainPanel.add(attendanceField);

        mainPanel.add(new JLabel("Unit Test / Prelim (%):"));
        unitTestField = new JTextField();
        mainPanel.add(unitTestField);

        mainPanel.add(new JLabel("Achievements:"));
        achievementsField = new JTextField();
        mainPanel.add(achievementsField);

        mainPanel.add(new JLabel("Mock Practical (%):"));
        mockPracticalField = new JTextField();
        mainPanel.add(mockPracticalField);

        // Add a button to calculate the assessment score
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        mainPanel.add(calculateButton);

        // Add a label to display the result
        resultLabel = new JLabel("");
        mainPanel.add(resultLabel);

        // Add the main panel to the frame
        add(mainPanel);

        // Make the GUI visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the TermWorkAssessmentGUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TermWorkAssessmentGUI();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        // Calculate the assessment score when the Calculate button is clicked
        if (e.getActionCommand().equals("Calculate")) {
            // Get the input values
            String name = nameField.getText();
            double attendance = Double.parseDouble(attendanceField.getText());
            double unitTest = Double.parseDouble(unitTestField.getText());
            String achievements = achievementsField.getText();
            double mockPractical = Double.parseDouble(mockPracticalField.getText());

            // Perform the assessment calculation (adjust the formula based on your requirements)
            double assessmentScore = (attendance * 0.2) + (unitTest * 0.3) + (achievements.length() * 2) + (mockPractical * 0.5);

            // Display the result
            resultLabel.setText("Assessment Score for " + name + ": " + assessmentScore);
        }
    }
}
