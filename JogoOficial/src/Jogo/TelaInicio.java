package Jogo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class TelaInicio extends JFrame {
	
	
		ImageIcon imagem = new ImageIcon(getClass().getResource("ArcadeGamer.png"));
		ImageIcon ibotao = new ImageIcon(getClass().getResource("Group 2.png"));
		JLabel label = new JLabel(imagem);
		JButton botao = new JButton(ibotao);
		
	public TelaInicio() {
		
		
		setTitle("AbcPlay");
		setSize(650,410);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		botao.setBounds(120, 150, 380, 250);
		botao.setBorderPainted(false);
        botao.setFocusable(false);
        botao.setContentAreaFilled(false);
		botao.addActionListener(
			new ActionListener() {

			 @Override
			public void actionPerformed(ActionEvent e) {
					new Mapafases();
			}
		});
	
		add(botao);
		add(label);
		
		
	}
	

	public static void main (String [] args) {
		new TelaInicio();
	}
	
}
			
			
		
	