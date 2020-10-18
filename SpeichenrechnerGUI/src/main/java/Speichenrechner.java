import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Speichenrechner extends JFrame {

    public void start(){

        ImageIcon icon = new ImageIcon(".res//heic0910e.jpg");
        JFrame jFrame = new JFrame();

        jFrame.setLayout(null);
        jFrame.setSize(400, 450);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("Speichenrechner");
        jFrame.setResizable(false);
        jFrame.setLocation(450, 100);
        jFrame.getContentPane().setBackground(new Color(351564));
        jFrame.setIconImage(icon.getImage());



        JLabel label = new JLabel();

        label.setText("Speichenrechner");
        label.setBounds(15, 5, 300, 30);
        jFrame.add(label);


        JLabel label1 = new JLabel();
        final JTextPane txtpane = new JTextPane();

        label1.setText("Der genaue Radius der Felge (innen)(mm):");
        label1.setBounds(15, 30, 300, 30);
        jFrame.add(label1);
        txtpane.setEditable(true);
        txtpane.setBounds(285, 30, 80, 30);
        txtpane.setBackground(Color.DARK_GRAY);
        txtpane.setForeground(Color.lightGray);
        jFrame.add(txtpane);


        JLabel label2 = new JLabel();
        final JTextPane txtpane1 = new JTextPane();

        label2.setText("Der genaue Radius des Nabenflansches(mm):");
        label2.setBounds(15, 70, 300, 30);
        jFrame.add(label2);
        txtpane1.setEditable(true);
        txtpane1.setBounds(285, 70, 80, 30);
        txtpane1.setBackground(Color.DARK_GRAY);
        txtpane1.setForeground(Color.lightGray);
        jFrame.add(txtpane1);


        JLabel label3 = new JLabel();
        final JTextPane txtpane2 = new JTextPane();

        label3.setText("Der Abstand des Nabenflansches(mm):");
        label3.setBounds(15, 110, 300, 30);
        jFrame.add(label3);
        txtpane2.setEditable(true);
        txtpane2.setBounds(285, 110, 80, 30);
        txtpane2.setBackground(Color.DARK_GRAY);
        txtpane2.setForeground(Color.lightGray);
        jFrame.add(txtpane2);


        JLabel label4 = new JLabel();
        final JTextPane txtpane3 = new JTextPane();

        label4.setText("Die Kreuzungszahl:");
        label4.setBounds(15, 150, 300, 30);
        jFrame.add(label4);
        txtpane3.setEditable(true);
        txtpane3.setBounds(285, 150, 80, 30);
        txtpane3.setBackground(Color.DARK_GRAY);
        txtpane3.setForeground(Color.lightGray);
        jFrame.add(txtpane3);


        JLabel label5 = new JLabel();
        final JTextPane txtpane4 = new JTextPane();

        label5.setText("Die Speichenanzahl:");
        label5.setBounds(15, 190, 300, 30);
        jFrame.add(label5);
        txtpane4.setEditable(true);
        txtpane4.setBounds(285, 190, 80, 30);
        txtpane4.setBackground(Color.DARK_GRAY);
        txtpane4.setForeground(Color.lightGray);
        jFrame.add(txtpane4);

        JButton button = new JButton();

        button.setText("Ergebnis");
        button.setBounds(15, 250, 175, 30);
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.lightGray);
        jFrame.add(button);

        JButton reset = new JButton();
        reset.setText("Reset");
        reset.setBounds(190,250,175,30);
        reset.setForeground(Color.lightGray);
        reset.setBackground(Color.DARK_GRAY);
        jFrame.add(reset);

        final JLabel ergebnis = new JLabel();
        ergebnis.setText("Hallo User!  ;)");
        ergebnis.setBounds(15, 300, 300, 30);
        jFrame.add(ergebnis);

        JButton button1 = new JButton();

        button1.setText("Beende das Program!  °__°");
        button1.setBounds(15, 350, 350, 50);
        button1.setBackground(Color.DARK_GRAY);
        button1.setForeground(Color.lightGray);
        jFrame.add(button1);


        jFrame.setVisible(true);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double s = Double.parseDouble(txtpane.getText());
                double r = Double.parseDouble(txtpane1.getText());
                double a = Double.parseDouble(txtpane2.getText());
                double k = Double.parseDouble(txtpane3.getText());
                double n = Double.parseDouble(txtpane4.getText());

                double s2 = s * s;
                double r2 = r * r;
                double a2 = 0.5 * a;
                double a3 = a2 * a2;
                double s3 = s * 2;

                double er = Math.sqrt(s2 + r2 + a3 - s3 * r * Math.cos((4 * 3.141592 * k) / n));

                ergebnis.setText(String.valueOf(er) + " mm");

                System.out.println(er);
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                txtpane.setText("");
                txtpane1.setText("");
                txtpane2.setText("");
                txtpane3.setText("");
                txtpane4.setText("");
                ergebnis.setText("Hallo User!  ;)");

            }
        });
    }
    public static void main(String[]args){

        Speichenrechner frame = new Speichenrechner();

        frame.start();

    }
}