package Jogo;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Mapafases extends JFrame{
	
	JPanel painelFundo;
    JTable fases;
    JScrollPane barraRolagem;
    
    public JButton botaoFase1;
    public JButton botaoFase2;
    public JButton botaoFase3;
    public JButton botaoFase4;
    public JButton botaoFase5;
    public JButton botaoFase6;
    public JButton botaoFase7;
    public JButton botaoFase8;
    public JButton botaoFase9;
    public JButton botaoFase10;


    public Mapafases() {
        super("Mapa das Fases");
        criaJanela();
    }

    public void criaJanela(){

        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
     
        barraRolagem = new JScrollPane(fases);
        botaoFase1 = new JButton("1");
        botaoFase2 = new JButton("2");
        botaoFase3 = new JButton("3");
        botaoFase4 = new JButton("4");
        botaoFase5 = new JButton("5");
        botaoFase6 = new JButton("6");
        botaoFase7 = new JButton("7");
        botaoFase8 = new JButton("8");
        botaoFase9 = new JButton("9");
        botaoFase10 = new JButton("10");

        botaoFase1.setBounds(30, 790, 200,70);
        botaoFase2.setBounds(130, 640, 200, 70);
        botaoFase3.setBounds(230, 490, 200, 70);
        botaoFase4.setBounds(290, 380, 200, 70);
        botaoFase5.setBounds(500, 250, 200, 70);
        botaoFase6.setBounds(700, 90, 200, 70);
        botaoFase7.setBounds(950, 250, 200, 70);
        botaoFase8.setBounds(1200, 380, 200, 70);
        botaoFase9.setBounds(1350, 590, 200, 70);
        botaoFase10.setBounds(1250, 790, 200, 70);

        
        painelFundo.add(barraRolagem);
        add(botaoFase1);
        add(botaoFase2);
        add(botaoFase3);
        add(botaoFase4);
        add(botaoFase5);
        add(botaoFase6);
        add(botaoFase7);
        add(botaoFase8);
        add(botaoFase9);
        add(botaoFase10);

        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setVisible(true);
    }

    public static void main(String[] args) {
        Mapafases lc  = new Mapafases();
        lc.criaJanela();
    }
}
