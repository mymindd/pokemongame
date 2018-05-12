import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PokemonGUI extends JFrame {
    private Container c;
    private JPanel frameOne;
    private JPanel frameBut;
    private Icon icon;
    private JLabel label;
    private JLabel labelLogo;
    private JButton eat;
    public PokemonGUI(){
        super("Pokemon Game");
        setSize(600, 800);
        
        
        c = getContentPane();
        c.setLayout(new BorderLayout());
        frameOne = new JPanel();
        frameOne.setLayout(new GridLayout(0,1));
        frameBut = new JPanel();
        frameBut.setLayout(new BorderLayout());
        icon = new ImageIcon(getClass().getResource("./images/logo.png"));
        label = new JLabel("Test");
        labelLogo = new JLabel("");
        labelLogo.setVerticalAlignment(JLabel.TOP);
        labelLogo.setIcon(icon);
        labelLogo.setHorizontalAlignment(JLabel.CENTER); 
        eat = new JButton("Eat");
        
        
        frameOne.add(labelLogo);
        frameOne.add(label);

        frameBut.add(eat);

        c.add(frameBut,BorderLayout.SOUTH);
        c.add(frameOne,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
    }
}
