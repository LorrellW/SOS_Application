package Sprint0;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class secondaryWindow extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { secondaryWindow frame = new
	 * secondaryWindow(); //frame.setLocationRelativeTo(null);
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */
	/**
	 * Create the frame.
	 */
	public secondaryWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(secondaryWindow.class.getResource("/Images/SOS black.png")));
		setTitle(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 396);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel SWpanel_1 = new JPanel();
		SWpanel_1.setBackground(new Color(51, 51, 51));
		SWpanel_1.setBounds(0, 0, 585, 357);
		contentPane.add(SWpanel_1);
		SWpanel_1.setLayout(null);	
		JLabel lblNewLabel = new JLabel("Player 1:");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 51));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 15));
		lblNewLabel.setBackground(new Color(0, 102, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 39, 130, 28);
		SWpanel_1.add(lblNewLabel);
		
		JLabel lblPlayer = new JLabel("Player 2:");
		lblPlayer.setOpaque(true);
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setForeground(new Color(255, 255, 51));
		lblPlayer.setFont(new Font("SimSun", Font.BOLD, 15));
		lblPlayer.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPlayer.setBackground(new Color(255, 0, 0));
		lblPlayer.setBounds(446, 39, 129, 28);
		SWpanel_1.add(lblPlayer);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnNewButton.setBounds(467, 296, 89, 23);
		SWpanel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainWindow mainWindow = new mainWindow();
				mainWindow.setVisible(true);
				dispose();
			}});
		
		JButton btnNewButton_1 = new JButton("New Game");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel gameBoard = new JPanel();
			}
		});
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnNewButton_1.setBounds(467, 266, 89, 23);
		SWpanel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Board Size: ");
		lblNewLabel_2.setForeground(new Color(255, 204, 51));
		lblNewLabel_2.setFont(new Font("SimSun", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(29, 329, 124, 14);
		SWpanel_1.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("S");
		rdbtnNewRadioButton.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton.setFont(new Font("SimSun", Font.BOLD, 20));
		rdbtnNewRadioButton.setBackground(new Color(0, 102, 255));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBounds(50, 100, 51, 23);
		SWpanel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnO = new JRadioButton("O");
		rdbtnO.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnO.setForeground(new Color(204, 204, 204));
		rdbtnO.setFont(new Font("SimSun", Font.BOLD, 20));
		rdbtnO.setBackground(new Color(0, 102, 255));
		rdbtnO.setBounds(50, 126, 51, 23);
		SWpanel_1.add(rdbtnO);
		
		JRadioButton rdbtnO_1 = new JRadioButton("O");
		rdbtnO_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnO_1.setForeground(new Color(204, 204, 204));
		rdbtnO_1.setFont(new Font("SimSun", Font.BOLD, 20));
		rdbtnO_1.setBackground(new Color(255, 0, 0));
		rdbtnO_1.setBounds(484, 126, 51, 23);
		SWpanel_1.add(rdbtnO_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton_1.setFont(new Font("SimSun", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBackground(new Color(255, 0, 0));
		rdbtnNewRadioButton_1.setBounds(484, 100, 51, 23);
		SWpanel_1.add(rdbtnNewRadioButton_1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Human");
		tglbtnNewToggleButton.setIconTextGap(3);
		tglbtnNewToggleButton.setHorizontalTextPosition(SwingConstants.CENTER);
		tglbtnNewToggleButton.setFont(new Font("SimSun", Font.PLAIN, 11));
		tglbtnNewToggleButton.setBounds(10, 68, 65, 23);
		SWpanel_1.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnCpu = new JToggleButton("CPU");
		tglbtnCpu.setIconTextGap(3);
		tglbtnCpu.setHorizontalTextPosition(SwingConstants.CENTER);
		tglbtnCpu.setFont(new Font("SimSun", Font.PLAIN, 11));
		tglbtnCpu.setBounds(75, 68, 65, 23);
		SWpanel_1.add(tglbtnCpu);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Human");
		tglbtnNewToggleButton_1.setIconTextGap(3);
		tglbtnNewToggleButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		tglbtnNewToggleButton_1.setFont(new Font("SimSun", Font.PLAIN, 11));
		tglbtnNewToggleButton_1.setBounds(445, 68, 65, 23);
		SWpanel_1.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnCpu_1 = new JToggleButton("CPU");
		tglbtnCpu_1.setIconTextGap(3);
		tglbtnCpu_1.setHorizontalTextPosition(SwingConstants.CENTER);
		tglbtnCpu_1.setFont(new Font("SimSun", Font.PLAIN, 11));
		tglbtnCpu_1.setBounds(510, 68, 65, 23);
		SWpanel_1.add(tglbtnCpu_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(secondaryWindow.class.getResource("/Images/SOS black.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(248, 0, 89, 49);
		SWpanel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Current Turn: ");
		lblNewLabel_4.setFont(new Font("SimSun", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(new Color(255, 204, 51));
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(29, 295, 126, 23);
		SWpanel_1.add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Record Game");
		chckbxNewCheckBox.setFont(new Font("SimSun", Font.PLAIN, 12));
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(29, 266, 94, 23);
		SWpanel_1.add(chckbxNewCheckBox);
		
		JPanel gameBoard = new JPanel();
		gameBoard.setBackground(Color.white);
		gameBoard.setBounds(167, 49, 250, 250);
		gameBoard.setLayout(new GridLayout(3, 3,10,10));
		
		
		JButton btnX = new JButton("");
		btnX.setFocusPainted(false);
		btnX.setBorder(null);
		btnX.setFont(new Font("Arial", Font.PLAIN, 52));
		btnX.setBackground(Color.white);
		btnX.setForeground(new Color(255, 255, 255));
		btnX.setVerifyInputWhenFocusTarget(false);
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnX.setFont(new Font("Arial", Font.PLAIN, 52));
				btnX.setForeground(Color.red);
				btnX.setBackground(Color.WHITE);
				btnX.setText("S");
				System.out.println(btnX.getText());
				if (btnX.getText() == "S") {
					System.out.print("YOU WIN");
				}
				else { 
						System.out.println("Broken");
					}
				}
			
				
		});
	
		JButton btnX1 = new JButton("");
		btnX1.setFocusPainted(false);
		btnX1.setBorder(null);
		btnX1.setFont(new Font("Arial", Font.PLAIN, 52));
		btnX1.setBackground(Color.white);
		btnX1.setForeground(new Color(255, 255, 255));
		btnX1.setVerifyInputWhenFocusTarget(false);
		btnX1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnX1.setFont(new Font("Arial", Font.PLAIN, 52));
				btnX1.setForeground(Color.blue);
				btnX1.setBackground(Color.WHITE);
				btnX1.setText("O");
				
			}
		});
		JButton btnX2 = new JButton("");
		btnX2.setFocusPainted(false);
		btnX2.setBorder(null);
		btnX2.setFont(new Font("Arial", Font.PLAIN, 52));
		btnX2.setBackground(Color.white);
		btnX2.setForeground(new Color(255, 255, 255));
		btnX2.setVerifyInputWhenFocusTarget(false);
		btnX2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnX2.setFont(new Font("Arial", Font.PLAIN, 52));
				btnX2.setForeground(Color.red);
				btnX2.setBackground(Color.WHITE);
				btnX2.setText("S");
				
			}
		});
		
		gameBoard.add(btnX);
		gameBoard.add(btnX1);
		gameBoard.add(btnX2);
		gameBoard.add(new JButton("4"));
		gameBoard.add(new JButton("5"));
		gameBoard.add(new JButton("6"));
		gameBoard.add(new JButton("7"));
		gameBoard.add(new JButton("8"));
		gameBoard.add(new JButton("9"));
		
		SWpanel_1.add(gameBoard);
		
	}

}



