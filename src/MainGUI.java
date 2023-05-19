import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUI extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JLabel welcomeLabel;
    private JButton sendButton;
    private JTextField textField1;
    private JButton aCompellingButton;
    private JTextArea textArea1;

    public MainGUI() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("My GUI");
        setSize(420, 370);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aCompellingButton.addActionListener(this);
        sendButton.addActionListener(this);
        textField1.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String text = button.getText();
            String textBox = textField1.getText();

            if (text.equals("Send")) {
                textArea1.append(textBox);
            } else {
                textArea1.append("AAaAAAaaAaaAaaAaaaAaAAAAAAAAA");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
