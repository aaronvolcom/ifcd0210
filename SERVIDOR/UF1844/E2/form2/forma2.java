package form2;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;

public class forma2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forma2 frame = new forma2();
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
	public forma2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUsuario.setBounds(10, 200, 74, 14);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(94, 198, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Arial", Font.PLAIN, 12));
		lblContrasea.setBounds(10, 225, 74, 14);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(94, 223, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setBounds(190, 197, 86, 23);
		contentPane.add(btnValidar);
		
		JLabel lblNombre = new JLabel("nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(10, 11, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidos.setBounds(10, 36, 56, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEdad.setBounds(10, 61, 46, 14);
		contentPane.add(lblEdad);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Arial", Font.PLAIN, 11));
		spinner.setModel(new SpinnerNumberModel(18, 18, 200, 1));
		spinner.setBounds(86, 59, 46, 20);
		contentPane.add(spinner);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 34, 114, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 9, 114, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSexo.setBounds(10, 101, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnHombre.setBounds(86, 98, 109, 23);
		contentPane.add(rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnMujer.setBounds(86, 124, 109, 23);
		contentPane.add(rdbtnMujer);
		
		JRadioButton rdbtnPrefieroNoDecirlo = new JRadioButton("No binario");
		rdbtnPrefieroNoDecirlo.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnPrefieroNoDecirlo.setBounds(86, 150, 134, 23);
		contentPane.add(rdbtnPrefieroNoDecirlo);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Arial", Font.PLAIN, 11));
		editorPane.setBackground(UIManager.getColor("Button.highlight"));
		editorPane.setBounds(235, 34, 161, 139);
		contentPane.add(editorPane);
		
		JLabel lblSobreTi = new JLabel("Definete:");
		lblSobreTi.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSobreTi.setBounds(233, 12, 56, 14);
		contentPane.add(lblSobreTi);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(UIManager.getColor("Button.shadow"));
		btnEnviar.setBounds(335, 227, 89, 23);
		contentPane.add(btnEnviar);
	}
};
