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

public class secondaryWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondaryWindow frame = new secondaryWindow();
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
	public secondaryWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(secondaryWindow.class.getResource("/Images/SOS black.png")));
		setTitle(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 396);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		panel_1.setBounds(0, 0, 585, 357);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(150, 39, 286, 250);
		panel.setLayout(null);
		panel_1.add(panel);
		
		JLabel lblNewLabel = new JLabel("Player 1:");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 51));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 15));
		lblNewLabel.setBackground(new Color(0, 102, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 39, 130, 28);
		panel_1.add(lblNewLabel);
		
		JLabel lblPlayer = new JLabel("Player 2:");
		lblPlayer.setOpaque(true);
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setForeground(new Color(255, 255, 51));
		lblPlayer.setFont(new Font("SimSun", Font.BOLD, 15));
		lblPlayer.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPlayer.setBackground(new Color(255, 0, 0));
		lblPlayer.setBounds(446, 39, 129, 28);
		panel_1.add(lblPlayer);
		
		JLabel lblNewLabel_1 = new JLabel("Simple Game or General");
		lblNewLabel_1.setForeground(new Color(255, 204, 51));
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(201, 22, 171, 14);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnNewButton.setBounds(467, 296, 89, 23);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainWindow mainWindow = new mainWindow();
				mainWindow.setVisible(true);
				dispose();
			}});
		
		JButton btnNewButton_1 = new JButton("New Game");
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnNewButton_1.setBounds(467, 266, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Board Size: ");
		lblNewLabel_2.setForeground(new Color(255, 204, 51));
		lblNewLabel_2.setFont(new Font("SimSun", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(29, 329, 124, 14);
		panel_1.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("S");
		rdbtnNewRadioButton.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton.setFont(new Font("SimSun", Font.BOLD, 20));
		rdbtnNewRadioButton.setBackground(new Color(0, 102, 255));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBounds(50, 100, 51, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnO = new JRadioButton("O");
		rdbtnO.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnO.setForeground(new Color(204, 204, 204));
		rdbtnO.setFont(new Font("SimSun", Font.BOLD, 20));
		rdbtnO.setBackground(new Color(0, 102, 255));
		rdbtnO.setBounds(50, 126, 51, 23);
		panel_1.add(rdbtnO);
		
		JRadioButton rdbtnO_1 = new JRadioButton("O");
		rdbtnO_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnO_1.setForeground(new Color(204, 204, 204));
		rdbtnO_1.setFont(new Font("SimSun", Font.BOLD, 20));
		rdbtnO_1.setBackground(new Color(255, 0, 0));
		rdbtnO_1.setBounds(484, 126, 51, 23);
		panel_1.add(rdbtnO_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton_1.setFont(new Font("SimSun", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBackground(new Color(255, 0, 0));
		rdbtnNewRadioButton_1.setBounds(484, 100, 51, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Human");
		tglbtnNewToggleButton.setIconTextGap(3);
		tglbtnNewToggleButton.setHorizontalTextPosition(SwingConstants.CENTER);
		tglbtnNewToggleButton.setFont(new Font("SimSun", Font.PLAIN, 11));
		tglbtnNewToggleButton.setBounds(10, 68, 65, 23);
		panel_1.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnCpu = new JToggleButton("CPU");
		tglbtnCpu.setIconTextGap(3);
		tglbtnCpu.setHorizontalTextPosition(SwingConstants.CENTER);
		tglbtnCpu.setFont(new Font("SimSun", Font.PLAIN, 11));
		tglbtnCpu.setBounds(75, 68, 65, 23);
		panel_1.add(tglbtnCpu);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Human");
		tglbtnNewToggleButton_1.setIconTextGap(3);
		tglbtnNewToggleButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		tglbtnNewToggleButton_1.setFont(new Font("SimSun", Font.PLAIN, 11));
		tglbtnNewToggleButton_1.setBounds(445, 68, 65, 23);
		panel_1.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnCpu_1 = new JToggleButton("CPU");
		tglbtnCpu_1.setIconTextGap(3);
		tglbtnCpu_1.setHorizontalTextPosition(SwingConstants.CENTER);
		tglbtnCpu_1.setFont(new Font("SimSun", Font.PLAIN, 11));
		tglbtnCpu_1.setBounds(510, 68, 65, 23);
		panel_1.add(tglbtnCpu_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(secondaryWindow.class.getResource("/Images/SOS black.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(250, 314, 89, 38);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Current Turn: ");
		lblNewLabel_4.setFont(new Font("SimSun", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(new Color(255, 204, 51));
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(29, 295, 126, 23);
		panel_1.add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Record Game");
		chckbxNewCheckBox.setFont(new Font("SimSun", Font.PLAIN, 12));
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(29, 266, 94, 23);
		panel_1.add(chckbxNewCheckBox);
		
	}
}
