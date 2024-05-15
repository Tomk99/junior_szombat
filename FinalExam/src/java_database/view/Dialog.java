package java_database.view;
import javax.swing.*;

public class Dialog extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public Dialog() {
        super("Input Dialog");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Input mezők létrehozása
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);

        panel.add(new JLabel("Input 1:"));
        panel.add(textField1);
        panel.add(new JLabel("Input 2:"));
        panel.add(textField2);
        panel.add(new JLabel("Input 3:"));
        panel.add(textField3);

        // OK gomb hozzáadása
        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> {
            // Az adatok kiolvasása a mezőkből
            String input1 = textField1.getText();
            String input2 = textField2.getText();
            String input3 = textField3.getText();

            // Egy egyszerű kiírás a konzolra
            System.out.println("Input 1: " + input1);
            System.out.println("Input 2: " + input2);
            System.out.println("Input 3: " + input3);

            // Itt lehetne folytatni további műveletekkel vagy bezárni a dialógust
        });
        panel.add(okButton);

        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Dialog::new);
    }
}
