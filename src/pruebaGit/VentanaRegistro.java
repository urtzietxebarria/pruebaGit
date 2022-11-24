package pruebaGit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField textCod;
	private JTextField textNombre;
	private JTextField textApe1;
	private JTextField textApe2;
	private JButton btnRegistro;
	private JLabel lblCod;
	private JLabel lblNombre;
	private JLabel lblApe1;
	private JLabel lblApe2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
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
	public VentanaRegistro() {
		setTitle("REGISTRO ESTUDIANTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//JLABEL	
		lblCod = new JLabel("CÓDIGO ESTUDIANTE: ");
		lblCod.setFont(new Font("Consolas", Font.BOLD, 12));
		lblCod.setBounds(49, 43, 151, 14);
		contentPane.add(lblCod);
		
		lblNombre = new JLabel("NOMBRE: ");
		lblNombre.setFont(new Font("Consolas", Font.BOLD, 12));
		lblNombre.setBounds(49, 77, 113, 14);
		contentPane.add(lblNombre);
		
		lblApe1 = new JLabel("APELLIDO 1:");
		lblApe1.setFont(new Font("Consolas", Font.BOLD, 12));
		lblApe1.setBounds(49, 108, 113, 14);
		contentPane.add(lblApe1);
		
		lblApe2 = new JLabel("APELLIDO 2:");
		lblApe2.setFont(new Font("Consolas", Font.BOLD, 12));
		lblApe2.setBounds(49, 139, 113, 14);
		contentPane.add(lblApe2);
		
		
		//JTEXTFIELD
		textCod = new JTextField();
		textCod.setBounds(210, 38, 132, 20);
		contentPane.add(textCod);
		textCod.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(210, 69, 132, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApe1 = new JTextField();
		textApe1.setBounds(210, 105, 132, 20);
		contentPane.add(textApe1);
		textApe1.setColumns(10);
		
		textApe2 = new JTextField();
		textApe2.setBounds(210, 136, 132, 20);
		contentPane.add(textApe2);
		textApe2.setColumns(10);
		
		
		//JBUTTON
		btnRegistro = new JButton("REGISTRAR");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cod_estu = textCod.getText();
				String nombre = textNombre.getText();
				String ape1 = textApe1.getText();
				String ape2 = textApe2.getText();
					
				Estudiante e1 = new Estudiante(cod_estu, nombre, ape1, ape2);			
				VentanaDatos vd = new VentanaDatos();
				vd.setVisible(true);			
				
				vd.lblCod.setText(e1.getCod_estu());
				vd.lblNombre.setText(e1.getNombre());
				vd.lblApe1.setText(e1.getApellido1());
				vd.lblApe2.setText(e1.getApellido2());
						
			}
		});
		btnRegistro.setFont(new Font("Consolas", Font.BOLD, 12));
		btnRegistro.setBounds(143, 191, 139, 43);
		contentPane.add(btnRegistro);
		
		
	}
}
