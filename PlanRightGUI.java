import javax.swing.*;
import java.awt.event.*;

public class PlanRightGUI extends JFrame {
    JTextField gradeField, subjectField, weekField;
    JButton submitButton;

    public PlanRightGUI() {
        setTitle("PlanRight GUI Version");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel gradeLabel = new JLabel("Grade:");
        gradeLabel.setBounds(10, 10, 80, 25);
        add(gradeLabel);

        gradeField = new JTextField();
        gradeField.setBounds(100, 10, 165, 25);
        add(gradeField);

        JLabel subjectLabel = new JLabel("Subject:");
        subjectLabel.setBounds(10, 40, 80, 25);
        add(subjectLabel);

        subjectField = new JTextField();
        subjectField.setBounds(100, 40, 165, 25);
        add(subjectField);

        JLabel weekLabel = new JLabel("Week:");
        weekLabel.setBounds(10, 70, 80, 25);
        add(weekLabel);

        weekField = new JTextField();
        weekField.setBounds(100, 70, 165, 25);
        add(weekField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(100, 110, 100, 25);
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String grade = gradeField.getText();
                String subject = subjectField.getText();
                String week = weekField.getText();
                JOptionPane.showMessageDialog(null,
                    "Lesson Plan\nGrade: " + grade + "\nSubject: " + subject + "\nWeek: " + week);
            }
        });
    }

    public static void main(String[] args) {
        new PlanRightGUI().setVisible(true);
    }
}
