package lab3;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.JLabel;


public class Windows2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_2;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows2 frame = new Windows2();
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
	public Windows2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton(" Получить ");
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
		////////////////////////////////////
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Проверить");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = textField_1.getText();
				 int i = Integer.parseInt(s.trim());
				 
				
				
				textField_2.setText( " "+lab2.isPrime(i));
				
				
				
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Получить следующее после Prime простое число");
		
		JButton button = new JButton("Получить");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int b = 0;
				while (b==0) {      
				if (b == 0)
				{
				b = lab2.getNext(14);    
				}
				 
				}
				
				textField_3.setText("  " + b);
			}
		});
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		btnNewButton_2 = new JButton("Сформировать");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_4.setText("  " + Arrays.toString(lab2.getRandomArray(20).toArray()));
			}
		});
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addComponent(btnNewButton)
					.addGap(6)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(btnNewButton_1)
					.addGap(18)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(127)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(239)
					.addComponent(button))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(238)
					.addComponent(btnNewButton_2))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(button)
					.addGap(12)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addComponent(btnNewButton_2)
					.addGap(18)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
