import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Picture{
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setLayout(new GridLayout(4,2));

    JLabel labels[] = {
      new JLabel("Name"), new JLabel("Phone"),
      new JLabel("Alice"), new JLabel("01553-123456"),
      new JLabel("Bob"), new JLabel("01553-654321"),
      new JLabel("Carol"), new JLabel("01903-823660") };

    frame.add(labels[0]);
    frame.add(labels[1]);

    JLabel boldLabel = new JLabel("Name");
    Font boldFont = boldLabel.getFont();
    Font plainFont = new Font(boldFont.getName(), Font.PLAIN, boldFont.getSize());

    for (int i = 2; i < 8; i++){
      labels[i].setFont(plainFont);
      frame.add(labels[i]);
    }
    frame.pack();
    frame.setVisible(true);
    }
  }
