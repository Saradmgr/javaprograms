import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FullScreenJFrame extends JFrame {
    public FullScreenJFrame(String title) {
        super(title);
        // JFrame frame = new JFrame();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setUndecorated(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);
        getContentPane()
                .add(new JLabel("    HIGHCOURT OF JUDICATURE AT ALLHAHABAD"), BorderLayout.NORTH);
        JLabel label = new JLabel("JJ");
        label.setBounds(20, 20, 150, 20);

        // label.setText(s);
        add(label);
    }

    public static void main(String[] args) {
        FullScreenJFrame frame = new FullScreenJFrame("");
        // JFrame frame1 = new JFrame();
        // JLabel label = new JLabel("dd");
        // label.setBounds(370, 340, 150, 20);
        // frame1.add(label);
        frame.setVisible(true);
    }
}