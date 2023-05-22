package org.iftmprojeto.view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class Livros {

	private JFrame frmCadastroDeLivros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Livros window = new Livros();
					window.frmCadastroDeLivros.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Livros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeLivros = new JFrame();
		frmCadastroDeLivros.setTitle("Library Instituto");
		frmCadastroDeLivros.setBounds(100, 100, 524, 432);
		frmCadastroDeLivros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeLivros.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 39, 488, -13);
		frmCadastroDeLivros.getContentPane().add(desktopPane);
	}
}
