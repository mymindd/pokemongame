import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PokemonGUI extends JFrame {
    private PokemonFarm pokemonFarm;
    private Container c;
    private JPanel frameOne;
    private JPanel frameBut;
    private JPanel frameInfo;
    //private JPanel frameList;
    private Icon icon;
    private Icon picPo;
    private JLabel labelInfo;
    private JLabel labelDMG;
    private JLabel labelWeight;
    private JLabel labelLogo;
    private JLabel labelPic;
    private JLabel labelType;
	private JLabel labelEXP;
	private JLabel labelLV;
	private JLabel labelHP;
    //private JLabel infor;
    private JLabel selectPo;
    private JButton feed;
    private JButton train;
    private JButton status;
    private JButton exit;
    private JButton goFight;
    //private JComboBox listPo;
    public PokemonGUI(PokemonFarm pokemonFarm){
        super("Pokemon Game");
        this.pokemonFarm = pokemonFarm;
        setSize(700, 650);
        String[] listPokemon = {"Charmander","Pichu","Helioptile"};
        JComboBox listPo = new JComboBox(listPokemon);
        //infor = new JLabel();
        
        c = getContentPane();
        c.setLayout(new BorderLayout());
        frameOne = new JPanel();
        frameOne.setLayout(new GridLayout(0,1));
        frameBut = new JPanel();
        frameBut.setLayout(new FlowLayout());
        frameInfo = new JPanel();
        frameInfo.setLayout(new BoxLayout(frameInfo,BoxLayout.Y_AXIS));
        
        frameInfo.setBorder(BorderFactory.createEmptyBorder(0,250,0,0));


        icon = new ImageIcon(getClass().getResource("./images/logo.png"));
        picPo = new ImageIcon();
        labelPic = new JLabel("");
        labelPic.setIcon(picPo);
        labelPic.setHorizontalAlignment(JLabel.CENTER);
        labelEXP = new JLabel();
		labelLV = new JLabel();
        labelType = new JLabel();
		labelHP = new JLabel();
        labelLogo = new JLabel("");
        labelLogo.setVerticalAlignment(JLabel.TOP);
        labelLogo.setIcon(icon);

        labelLogo.setHorizontalAlignment(JLabel.CENTER); 
        selectPo = new JLabel("Select Pokemon: ");
        feed = new JButton("Feed");
        train = new JButton("Train");
        status = new JButton("Status");
        exit = new JButton("Exit");
        goFight = new JButton("Fight!!");

        labelInfo = new JLabel("Please select Pokemon");
        labelDMG = new JLabel();
        labelWeight = new JLabel();
        
        JLabel temp = new JLabel();


        labelInfo.setHorizontalAlignment(JLabel.CENTER); 
        labelDMG.setHorizontalAlignment(JLabel.CENTER); 
        labelWeight.setHorizontalAlignment(JLabel.CENTER); 

        status.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){  
            String currPo = (String)listPo.getSelectedItem();
            Pokemon curr = pokemonFarm.getPokemon(currPo);
            labelInfo.setText("Name :"+curr.getName());
            labelDMG.setText("Damage :"+curr.getDMG());
            labelEXP.setText("EXP :"+curr.getEXP()+"/100");
            labelHP.setText("HP :"+curr.getHP());
            labelLV.setText("Level :"+curr.getLV());
            labelWeight.setText("Weight :"+curr.getWeight());
            labelType.setText("Type :"+curr.getType());
            labelPic.setIcon(new ImageIcon(getClass().getResource("./images/"+ currPo +".png")));
          }
        });

        feed.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
            String currPo = (String)listPo.getSelectedItem();
            Pokemon curr = pokemonFarm.getPokemon(currPo);
            curr.eat();
            labelWeight.setText("Weight :"+curr.getWeight());
           }
        });

        train.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
            String currPo = (String)listPo.getSelectedItem();
            Pokemon curr = pokemonFarm.getPokemon(currPo);
            curr.tain();
			curr.levelUp();
            labelWeight.setText("Weight :"+curr.getWeight());
            labelEXP.setText("EXP :"+curr.getEXP()+"/100");
            labelLV.setText("Level :"+curr.getLV());
            labelDMG.setText("Damage :"+curr.getDMG());
            labelHP.setText("HP :"+curr.getHP());
           }
        });
        
        goFight.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
            String currPo = (String)listPo.getSelectedItem();
            Pokemon curr = pokemonFarm.getPokemon(currPo);
			curr.goFight();
            labelHP.setText("HP :"+curr.getHP());
			}
        });

        exit.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
            System.exit(0);
           }
        });

        

        frameOne.add(labelLogo);

        frameInfo.add(labelPic);
        frameInfo.add(labelInfo);
		frameInfo.add(labelEXP);
		frameInfo.add(labelLV);
		frameInfo.add(labelHP);
        frameInfo.add(labelDMG);
        frameInfo.add(labelWeight);
        frameInfo.add(labelType);

        frameBut.add(selectPo);
        frameBut.add(listPo);
        frameBut.add(status);
        frameBut.add(feed);
        frameBut.add(train);
        frameBut.add(goFight);
        frameBut.add(exit);

        c.add(frameBut,BorderLayout.SOUTH);
        c.add(frameOne,BorderLayout.NORTH);
        c.add(frameInfo,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
    }
}
