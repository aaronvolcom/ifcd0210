package form2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class forma2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
		setBounds(100, 100, 427, 271);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(14, 22, 56, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidos.setBounds(14, 51, 56, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEdad.setBounds(13, 82, 46, 14);
		contentPane.add(lblEdad);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Arial", Font.PLAIN, 11));
		spinner.setModel(new SpinnerNumberModel(18, 18, 200, 1));
		spinner.setBounds(93, 80, 46, 20);
		contentPane.add(spinner);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 49, 114, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(93, 20, 114, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSexo.setBounds(13, 112, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBackground(SystemColor.text);
		rdbtnHombre.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnHombre.setBounds(85, 108, 109, 23);
		contentPane.add(rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBackground(SystemColor.text);
		rdbtnMujer.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnMujer.setBounds(85, 133, 109, 23);
		contentPane.add(rdbtnMujer);
		
		JRadioButton rdbtnPrefieroNoDecirlo = new JRadioButton("No binario");
		rdbtnPrefieroNoDecirlo.setBackground(SystemColor.text);
		rdbtnPrefieroNoDecirlo.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnPrefieroNoDecirlo.setBounds(85, 157, 134, 23);
		contentPane.add(rdbtnPrefieroNoDecirlo);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Arial", Font.PLAIN, 11));
		editorPane.setBackground(SystemColor.controlHighlight);
		editorPane.setBounds(234, 41, 161, 139);
		contentPane.add(editorPane);
		
		JLabel lblSobreTi = new JLabel("Definete:");
		lblSobreTi.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSobreTi.setBounds(235, 22, 56, 14);
		contentPane.add(lblSobreTi);
		
		JButton btnEnviar = new JButton("Enviar");
		 btnEnviar.setFont(new Font("Arial", Font.BOLD, 12));
	             btnEnviar.addActionListener(new ActionListener(){
	               public void actionPerformed(ActionEvent arg0){
	                   String nombre= textField_2.getText();
	                   String apellido= textField_1.getText();
	                   Integer edad= (Integer)spinner.getValue();
	                   String genero = null;
	                    if (rdbtnHombre.isSelected()) {
	                        genero = "Hombre";
	                    } else if (rdbtnMujer.isSelected()){
	                        genero = "Mujer";
	                    } else if (rdbtnPrefieroNoDecirlo.isSelected()) {
	                        genero = "No binario";
	                    } else {
	                        genero = "No indicado";
	                    }
	                    
	                    String datos= editorPane.getText();
	                    String mensaje= " Nombre: "+nombre+"\n Apellidos: "+apellido+"\n Edad: "+edad+"\n Genero: "+genero+"\n Otros datos: "+datos;
	                    JOptionPane.showMessageDialog(null, mensaje ); //MOSTRAR LOS DATOS DEL FORMULARIO
	                    PrintWriter writer = null;
	                    try {
	                        writer = new PrintWriter("usuario.txt", "UTF-8");                //CREAR UN ARCHIVO .TXT CON LOS DATOS DE USUARIO
	                    } catch (FileNotFoundException | UnsupportedEncodingException e) {
	                        e.printStackTrace();
	                    }
	                    writer.println(mensaje);
	                    writer.close();
	               }
	            });
	        btnEnviar.setBounds(166, 197, 89, 23);
	        contentPane.add(btnEnviar);
	}
};
