package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;




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
		frmCadastroDeLivros.setType(Type.POPUP);
		frmCadastroDeLivros.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\maycon\\Downloads\\livros.png"));
		frmCadastroDeLivros.setTitle("  Library");
		frmCadastroDeLivros.setBounds(100, 100, 704, 575);
		frmCadastroDeLivros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeLivros.setExtendedState(JFrame.MAXIMIZED_BOTH);

		
		JMenuBar menuBar = new JMenuBar();
		frmCadastroDeLivros.setJMenuBar(menuBar);
		
		JMenu Cadastros = new JMenu("Cadastro");
		menuBar.add(Cadastros);
		
		JMenuItem CadastroLivro = new JMenuItem("Livros");
		frmCadastroDeLivros.getContentPane().setLayout(new BorderLayout(0, 0));
		
		final JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		frmCadastroDeLivros.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		CadastroLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLivro tela = new TelaLivro();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		
		
		/*JMenuItem CadastroAluno = new JMenuItem("Aluno");

		CadastroAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TelaAluno telaa = new TelaAluno();
				telaa.setVisible(true);
				desktopPane.add(telaa);
			}
		});*/
		

		
		JMenuItem CadastroExemplar = new JMenuItem("Exemplar");
		CadastroExemplar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaExemplar tela = new TelaExemplar();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		
		

		JMenuItem CadastroAlunos = new JMenuItem("Aluno");
		CadastroAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			TelaAlunos tela = new TelaAlunos();
			tela.setVisible(true);
			desktopPane.add(tela);
				}
		});
		
		Cadastros.add(CadastroAlunos);
		Cadastros.add(CadastroLivro);
		Cadastros.add(CadastroExemplar);
		
		
		
		JMenu mnNewMenu = new JMenu("Ajuda");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   System.exit(0);
			}
		});
		menuBar.add(mnNewMenu);
	}


}

