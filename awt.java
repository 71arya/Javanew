import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButtonDemo extends JFrame implements ActionListener {

    public ColorButtonDemo() {
        setTitle("Color Button Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        
        add(buttonPanel);

        
        getContentPane().setBackground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String command = e.getActionCommand();

        switch (command) {
            case "Red":
                getContentPane().setBackground(Color.RED);
                break;
            case "Green":
                getContentPane().setBackground(Color.GREEN);
                break;
            case "Blue":
                getContentPane().setBackground(Color.BLUE);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorButtonDemo colorButtonDemo = new ColorButtonDemo();
            colorButtonDemo.setVisible(true);
        });
    }
}
