package lab3;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
//import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;


public class Windows extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField_2;
	private JButton btnNewButton_3;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows frame = new Windows();
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
	public Windows() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnNewButton_1 = new JButton("Проверить");
		btnNewButton_1.setBounds(33, 67, 205, 25);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				String s = textField_4.getText();
				 int i = Integer.parseInt(s.trim());
				 
				
				
				textField_1.setText( " "+lab2.isPrime(i));
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
		
		
		
		textField = new JTextField();
		textField.setBounds(296, 12, 334, 19);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(textField);
		textField.setColumns(30);
		
		
		JButton btnNewButton = new JButton(" Получить");
		btnNewButton.setBounds(33, 12, 224, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				int a = 0;
				while (a==0) {      
				if (a == 0)
				{
					 a = lab2.getRandomPrime();   
				 
				}
				 
				}
				textField.setText("   " + a);
				
				
		
				
				
				
			}
		});
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(33, 104, 334, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(30);
		
		btnNewButton_2 = new JButton("Получить");
		btnNewButton_2.setBounds(246, 217, 117, 25);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int b = 0;
				while (b==0) {      
				if (b == 0)
				{
				b = lab2.getNext(14);    
				}
				 
				}
				
				textField_2.setText("  " + b);
				
				
			}
		});
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Получить следующее после Prime простое число");
		lblNewLabel.setBounds(106, 190, 524, 15);
		contentPane.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(178, 254, 298, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_3 = new JButton("Получить");
		btnNewButton_3.setBounds(213, 288, 201, 25);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField_3.setText("  " + Arrays.toString(lab2.getRandomArray(20).toArray()));
			}
		});
		contentPane.add(btnNewButton_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(106, 325, 456, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(296, 70, 114, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
