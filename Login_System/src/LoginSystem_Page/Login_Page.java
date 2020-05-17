package LoginSystem_Page;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Font;

public class Login_Page {

	private JFrame frame;
	private JTextField txtusername;
	private JTextField txtpassword;
	protected JFrame frmLoginsystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
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
	public Login_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 25));
		frame.setBounds(150, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbllogin = new JLabel("Login Page");
		lbllogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbllogin.setBounds(144, 11, 219, 29);
		frame.getContentPane().add(lbllogin);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblUserName.setBounds(39, 80, 150, 26);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPassword.setBounds(39, 136, 184, 29);
		frame.getContentPane().add(lblPassword);
		
		txtusername = new JTextField();
		txtusername.setBounds(223, 80, 168, 26);
		frame.getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setBounds(223, 130, 168, 26);
		frame.getContentPane().add(txtpassword);
		txtpassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login ");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userName = txtusername.getText();
				String password = txtpassword.getText();
				
				if(userName.contains("OneSparrow") && password.contains("FlayingAway"))
				{
					txtpassword.setText(null);
					txtusername.setText(null);
					
					JOptionPane.showMessageDialog( null,"Login Successfully", "Login Successfully", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtpassword.setText(null);
					txtusername.setText(null);
				}
				
			}
		});
		btnLogin.setBounds(39, 210, 111, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtusername.setText(null);
				txtpassword.setText(null);
			}
		});
		btnReset.setBounds(183, 210, 109, 29);
		frame.getContentPane().add(btnReset);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginsystem =new JFrame("Cancel");
				if(JOptionPane.showConfirmDialog(frmLoginsystem, "Confirm if you want to exit ", "Login Page",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				 
			}
		});
		btnCancel.setBounds(318, 210, 111, 29);
		frame.getContentPane().add(btnCancel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 187, 422, -31);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.DARK_GRAY);
		separator_1.setBounds(23, 187, 431, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.DARK_GRAY);
		separator_2.setBounds(22, 52, 422, 2);
		frame.getContentPane().add(separator_2);
	}
}
