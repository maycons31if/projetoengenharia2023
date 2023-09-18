package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Component;

public class Home {

	private JFrame frmCadastroDeLivros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeLivros = new JFrame();
		frmCadastroDeLivros.setTitle("Cadastro de Livros");
		frmCadastroDeLivros.setBounds(100, 100, 524, 432);
		frmCadastroDeLivros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmCadastroDeLivros.setJMenuBar(menuBar);
		
		JMenu Cadastros = new JMenu("Cadastro");
		menuBar.add(Cadastros);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Livros");
		
		frmCadastroDeLivros.getContentPane().setLayout(new BorderLayout(0, 0));
		
		final JDesktopPane desktopPane = new JDesktopPane();
		
		frmCadastroDeLivros.getContentPane().add(desktopPane, BorderLayout.CENTER);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLivro tela = new TelaLivro();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		Cadastros.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exemplar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaExemplar telae = new TelaExemplar();
				telae.setVisible(true);
				desktopPane.add(telae);
			}
		});
		Cadastros.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aluno");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAluno telaa = new TelaAluno();
				telaa.setVisible(true);
				desktopPane.add(telaa);
			}
		});
		Cadastros.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Sair");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   System.exit(0);
			}
		});
		menuBar.add(mnNewMenu);
	}
}
