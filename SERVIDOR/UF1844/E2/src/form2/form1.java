package form2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1 frame = new form1();
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
	public form1() {
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 203);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNick = new JLabel("Usuario:");
		lblNick.setForeground(Color.BLACK);
		lblNick.setBounds(10, 16, 46, 14);
		contentPane.add(lblNick);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(Color.BLACK);
		lblContrasea.setBounds(10, 41, 69, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir Contrase\u00F1a:");
		lblRepetirContrasea.setForeground(Color.BLACK);
		lblRepetirContrasea.setBounds(10, 66, 118, 14);
		contentPane.add(lblRepetirContrasea);
		
		textField = new JTextField();
		textField.setBounds(133, 13, 118, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 38, 118, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(133, 63, 118, 20);
		contentPane.add(passwordField_1);
		
		
		
		JButton btnNewButton = new JButton("Validar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    char contraseña1[] = passwordField.getPassword();
				String clave1 = new String(contraseña1);
				char contraseña2[] = passwordField_1.getPassword();
				String clave2 = new String(contraseña2);
				if (!(clave1.equals(clave2))) 
				{
					JOptionPane.showMessageDialog(null, " La contraseña no conicide" ); 
			}
				
				else {setVisible(false);
					forma2 frame2 = new forma2();
					frame2.setVisible(true);
					}
			}
		});
		btnNewButton.setBounds(58, 104, 141, 45);
		contentPane.add(btnNewButton);
	}
}
