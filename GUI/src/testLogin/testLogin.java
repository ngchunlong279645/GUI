package testLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testLogin {

	private JFrame frame;
	private JTextField userNameTextField;
	private JTextField passwordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testLogin window = new testLogin();
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
	public testLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 472, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(userNameTextField.getText().equals("Azman")&&passwordTextField.getText().equals("abc123")) 
						JOptionPane.showMessageDialog(null, "Login Successful");
					else 
						JOptionPane.showMessageDialog(null, "Login Unsuccessful");

					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter the correct Username&Password");
				}
			}
		});
		loginButton.setBackground(Color.BLACK);
		loginButton.setForeground(Color.WHITE);
		loginButton.setFont(new Font("Source Code Pro Black", Font.BOLD, 25));
		loginButton.setBounds(139, 216, 143, 46);
		frame.getContentPane().add(loginButton);
		
		JLabel nameLabel = new JLabel("Username :");
		nameLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 20));
		nameLabel.setBounds(68, 82, 160, 14);
		frame.getContentPane().add(nameLabel);
		
		JLabel passwordLabel = new JLabel("Password :");
		passwordLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 20));
		passwordLabel.setBounds(68, 137, 160, 14);
		frame.getContentPane().add(passwordLabel);
		
		userNameTextField = new JTextField();
		userNameTextField.setFont(new Font("Tekton Pro Ext", Font.BOLD, 15));
		userNameTextField.setBounds(238, 82, 163, 20);
		frame.getContentPane().add(userNameTextField);
		userNameTextField.setColumns(10);
		
		passwordTextField = new JTextField();
		passwordTextField.setFont(new Font("Tekton Pro Ext", Font.BOLD, 15));
		passwordTextField.setBounds(238, 137, 163, 20);
		frame.getContentPane().add(passwordTextField);
		passwordTextField.setColumns(10);
	}
}
