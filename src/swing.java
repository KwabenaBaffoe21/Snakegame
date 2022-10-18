import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing implements ActionListener {
    static JButton btnUp;
    static JButton btnDown;
    static JButton btnLeft;
    static JButton btnRight;
    static JLabel label;
    static JPanel panel;

    public swing() {
        JFrame frame = new JFrame("Snake Game");
        frame.setLayout(null);
        frame.setSize(550, 550);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnUp = new JButton("Up");
        btnUp.setFocusable(false);
        btnUp.setBounds(270, 465, 80, 30);
        btnUp.addActionListener(this);
        frame.add(btnUp);

        btnDown = new JButton("Down");
        btnDown.setFocusable(false);
        btnDown.setBounds(170, 465, 80, 30);
        btnDown.addActionListener(this);
        frame.add(btnDown);

        btnLeft = new JButton("Left");
        btnLeft.setFocusable(false);
        btnLeft.setBounds(70, 465, 80, 30);
        btnLeft.addActionListener(this);
        frame.add(btnLeft);

        btnRight = new JButton("Right");
        btnRight.setFocusable(false);
        btnRight.setBounds(370, 465, 80, 30);
        btnRight.addActionListener(this);
        frame.add(btnRight);

        panel = new JPanel();
        panel.setSize(550, 440);
        panel.setBackground(Color.GREEN);
        panel.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
        frame.add(panel);

        ImageIcon icon = new ImageIcon("images/snake.gif");
        Image images = icon.getImage().getScaledInstance(90,70,Image.SCALE_DEFAULT);
        icon = new ImageIcon(images);
        label = new JLabel(icon);
        label.setBounds(100, 50, 80, 50);
        label.setBackground(Color.DARK_GRAY);
        panel.add(label);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRight) {
            label.setLocation(label.getX() + 2, label.getY());
            label.setSize(label.getWidth() + 2, label.getHeight());
        } else if (e.getSource() == btnLeft) {
            label.setLocation(label.getX() - 2, label.getY());
            label.setSize(label.getWidth() - 2, label.getHeight());
        } else if (e.getSource() == btnUp) {
            label.setLocation(label.getX(), label.getY() - 2);
            label.setSize(label.getWidth(), label.getHeight() - 2);
        } else {
            label.setLocation(label.getX(), label.getY() + 2);
            label.setSize(label.getWidth(), label.getHeight() + 2);
        }

    }
}
