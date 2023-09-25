// Lorrell Winfield 2023

package Sprint0;
//import secondaryWindow;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Label;
import java.awt.Choice;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Dimension;
import javax.swing.SpringLayout;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import java.awt.TextField;
import java.awt.Panel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class mainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainWindow() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(mainWindow.class.getResource("/Images/SOS black.png")));
		setTitle("SOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 396);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 212, 357);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel gridPic = new JLabel("");
		gridPic.setForeground(new Color(255, 0, 0));
		gridPic.setHorizontalAlignment(SwingConstants.CENTER);
		gridPic.setIcon(new ImageIcon(mainWindow.class.getResource("/Images/board small.jpg")));
		gridPic.setBounds(1, 74, 212, 157);
		panel.add(gridPic);
		
		JLabel sosPic = new JLabel("");
		sosPic.setHorizontalAlignment(SwingConstants.CENTER);
		sosPic.setIcon(new ImageIcon(mainWindow.class.getResource("/Images/SOS black.png")));
		sosPic.setBounds(0, 0, 212, 108);
		panel.add(sosPic);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		panel_1.setBounds(211, 0, 374, 357);
		contentPane.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JPanel panel_2 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_2, 76, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_2, -10, SpringLayout.EAST, panel_1);
		panel_2.setBackground(new Color(153, 153, 153));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		Label label_1 = new Label("Game Type:");
		label_1.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_1.setBounds(56, 10, 78, 22);
		panel_2.add(label_1);
		
		Choice choice = new Choice();
		choice.setBounds(140, 12, 105, 20);
		choice.add("Simple Game");
		choice.add("General Game");
		panel_2.add(choice);
		
		Label label_3 = new Label("PLAYER 1:");
		label_3.setForeground(new Color(220, 220, 220));
		label_3.setFont(new Font("SimSun", Font.BOLD, 11));
		label_3.setBackground(new Color(0, 51, 255));
		label_3.setAlignment(Label.CENTER);
		label_3.setBounds(57, 100, 62, 22);
		panel_2.add(label_3);
		
		Label label_4 = new Label("PLAYER 2:");
		label_4.setForeground(new Color(220, 220, 220));
		label_4.setFont(new Font("SimSun", Font.BOLD, 11));
		label_4.setBackground(new Color(255, 0, 0));
		label_4.setAlignment(Label.CENTER);
		label_4.setBounds(232, 100, 62, 22);
		panel_2.add(label_4);
		
		Label label_2 = new Label("Board Size:");
		label_2.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_2.setBounds(56, 50, 62, 22);
		panel_2.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("SimSun", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"3x3", "4x4", "5x5", "6x6", "7x7", "8x8", "9x9"}));
		comboBox.setBounds(141, 50, 53, 22);
		panel_2.add(comboBox);
		
		JRadioButton p1Hbtn = new JRadioButton("Human");
		p1Hbtn.setBackground(new Color(30, 144, 255));
		p1Hbtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p1Hbtn.setMinimumSize(new Dimension(50, 23));
		p1Hbtn.setPreferredSize(new Dimension(50, 23));
		p1Hbtn.setBounds(56, 128, 62, 14);
		panel_2.add(p1Hbtn);
		
		JRadioButton p2Hbtn = new JRadioButton("Human");
		p2Hbtn.setBackground(new Color(255, 153, 153));
		p2Hbtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p2Hbtn.setPreferredSize(new Dimension(50, 23));
		p2Hbtn.setMinimumSize(new Dimension(50, 23));
		p2Hbtn.setBounds(232, 128, 62, 14);
		panel_2.add(p2Hbtn);
		
		JRadioButton p1CPUbtn = new JRadioButton("CPU");
		p1CPUbtn.setBackground(new Color(30, 144, 255));
		p1CPUbtn.setPreferredSize(new Dimension(50, 23));
		p1CPUbtn.setMinimumSize(new Dimension(50, 23));
		p1CPUbtn.setBounds(56, 145, 62, 14);
		panel_2.add(p1CPUbtn);
		
		JRadioButton p2CPUbtn = new JRadioButton("CPU");
		p2CPUbtn.setBackground(new Color(255, 153, 153));
		p2CPUbtn.setPreferredSize(new Dimension(50, 23));
		p2CPUbtn.setMinimumSize(new Dimension(50, 23));
		p2CPUbtn.setBounds(232, 145, 62, 14);
		panel_2.add(p2CPUbtn);
		
		JLabel gameLabel = new JLabel("Game Settings");
		sl_panel_1.putConstraint(SpringLayout.NORTH, gameLabel, 41, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, gameLabel, 0, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, gameLabel, -6, SpringLayout.NORTH, panel_2);
		sl_panel_1.putConstraint(SpringLayout.EAST, gameLabel, 374, SpringLayout.WEST, panel_1);
		panel_1.add(gameLabel);
		gameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gameLabel.setFont(new Font("SimSun", Font.BOLD, 20));
		gameLabel.setForeground(new Color(220, 220, 220));
		
		JButton startButton = new JButton("Start Game");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_2, -21, SpringLayout.NORTH, startButton);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, startButton, -29, SpringLayout.SOUTH, panel_1);
		startButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		startButton.setFont(new Font("SimSun", Font.PLAIN, 15));
		startButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		startButton.setForeground(new Color(0, 0, 0));
		startButton.setBackground(new Color(50, 205, 50));
		sl_panel_1.putConstraint(SpringLayout.NORTH, startButton, 294, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, startButton, 121, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, startButton, -126, SpringLayout.EAST, panel_1);
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                secondaryWindow secondaryWindow = new secondaryWindow();
                secondaryWindow.setVisible(true);
                dispose();
				
			}
		});
		
		panel_1.add(startButton);
		
		
	}
}

