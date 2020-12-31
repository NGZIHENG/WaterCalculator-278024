import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WaterCalculator {

	private JFrame frame;
	private JTextField textFieldWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterCalculator window = new WaterCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WaterCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How much water should I drink?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(110, 34, 213, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMyWeight = new JLabel("My weight (kg):");
		lblMyWeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMyWeight.setBounds(99, 126, 118, 28);
		frame.getContentPane().add(lblMyWeight);
		
		JButton btnTellMe = new JButton("Tell Me");
		btnTellMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double num,ans = 0.00;
				try {
					num = Double.parseDouble(textFieldWeight.getText());
					
					ans = num * 0.04;
					
					JOptionPane.showMessageDialog(null, "Buddy, you should drink " + ans + "L of water a day.");
					
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter A Valid Number");
					}
			}
		});
		btnTellMe.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTellMe.setBounds(154, 178, 116, 28);
		frame.getContentPane().add(btnTellMe);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setBounds(227, 128, 96, 28);
		frame.getContentPane().add(textFieldWeight);
		textFieldWeight.setColumns(10);
	}
}
