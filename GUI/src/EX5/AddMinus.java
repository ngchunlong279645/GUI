package EX5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AddMinus {

	private JFrame frmAddminus;
	private JTextField Num1;
	private JTextField Num2;
	private JTextField Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinus window = new AddMinus();
					window.frmAddminus.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddMinus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddminus = new JFrame();
		frmAddminus.setForeground(Color.WHITE);
		frmAddminus.setBackground(Color.WHITE);
		frmAddminus.getContentPane().setBackground(Color.PINK);
		frmAddminus.setTitle("Add&Minus");
		frmAddminus.setBounds(100, 100, 450, 378);
		frmAddminus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddminus.getContentPane().setLayout(null);
		
		Num1 = new JTextField();
		Num1.setBackground(Color.BLACK);
		Num1.setForeground(Color.WHITE);
		Num1.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		Num1.setBounds(40, 45, 159, 50);
		frmAddminus.getContentPane().add(Num1);
		Num1.setColumns(10);
		
		Num2 = new JTextField();
		Num2.setForeground(Color.WHITE);
		Num2.setBackground(Color.BLACK);
		Num2.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		Num2.setBounds(238, 45, 159, 50);
		frmAddminus.getContentPane().add(Num2);
		Num2.setColumns(10);
		
		JLabel lblAnswer = new JLabel("ANSWER :");
		lblAnswer.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblAnswer.setBounds(62, 235, 146, 50);
		frmAddminus.getContentPane().add(lblAnswer);
		
		Answer = new JTextField();
		Answer.setForeground(Color.WHITE);
		Answer.setBackground(Color.BLACK);
		Answer.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		Answer.setBounds(238, 237, 159, 50);
		frmAddminus.getContentPane().add(Answer);
		Answer.setColumns(10);
		
		JButton Add = new JButton("+");
		Add.setBackground(Color.ORANGE);
		Add.setFont(new Font("Source Code Pro", Font.BOLD, 30));
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n1,n2,ans;
				try {
					n1=Integer.parseInt(Num1.getText());
					n2=Integer.parseInt(Num2.getText());
					ans=n1+n2;
					Answer.setText(Integer.toString(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER!");
				}
				
			}
		});
		Add.setBounds(40, 151, 74, 45);
		frmAddminus.getContentPane().add(Add);
		
		JButton Minus = new JButton("-");
		Minus.setBackground(Color.MAGENTA);
		Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,ans;
				try {
					n1=Integer.parseInt(Num1.getText());
					n2=Integer.parseInt(Num2.getText());
					ans=n1-n2;
					Answer.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER!");
				}
			}
		});
		Minus.setFont(new Font("Source Code Pro", Font.BOLD, 30));
		Minus.setBounds(144, 151, 74, 45);
		frmAddminus.getContentPane().add(Minus);
		
		JButton Reset = new JButton("RESET");
		Reset.setBackground(Color.CYAN);
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num1.setText("");
				Num2.setText("");
				Answer.setText("");
				
			}
		});
		Reset.setFont(new Font("Source Code Pro", Font.BOLD, 30));
		Reset.setBounds(238, 151, 159, 45);
		frmAddminus.getContentPane().add(Reset);
	}
}
