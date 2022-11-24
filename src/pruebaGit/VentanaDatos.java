package pruebaGit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class VentanaDatos extends JFrame {

	private JPanel contentPane;
	JLabel lblCod;
	JLabel lblNombre;
	JLabel lblApe1;
	JLabel lblApe2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDatos frame = new VentanaDatos();
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
	public VentanaDatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("");
		lblNombre.setBounds(156, 48, 157, 14);
		contentPane.add(lblNombre);
		
		lblApe1 = new JLabel("");
		lblApe1.setBounds(156, 93, 199, 14);
		contentPane.add(lblApe1);
		
		lblApe2 = new JLabel("");
		lblApe2.setBounds(156, 145, 199, 14);
		contentPane.add(lblApe2);
		
		lblCod = new JLabel("");
		lblCod.setBounds(156, 190, 199, 14);
		contentPane.add(lblCod);
	}

}
