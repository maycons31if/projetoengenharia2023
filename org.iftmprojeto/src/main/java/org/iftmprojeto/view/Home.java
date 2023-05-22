package org.iftmprojeto.view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Home {

	private JFrame frmCadastroDeLivros;
	private JTextField lvIsbn;
	private JTextField lvTitulo;
	private JLabel lblEdicao;
	private JTextField lvEdicao;
	private JLabel lblEditora;
	private JTextField lvEditora;
	private JLabel lblIdioma;
	private JTextField lvIdioma;
	private JLabel lblVolume;
	private JTextField lvVolume;
	private JButton btnNovo;
	private JTextField textField;

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
		frmCadastroDeLivros.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Livros");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 488, 14);
		frmCadastroDeLivros.getContentPane().add(lblNewLabel);
		
		JLabel lblisbn = new JLabel("ISBN:");
		lblisbn.setBounds(20, 45, 46, 14);
		frmCadastroDeLivros.getContentPane().add(lblisbn);
		
		lvIsbn = new JTextField();
		lvIsbn.setBounds(20, 64, 109, 20);
		frmCadastroDeLivros.getContentPane().add(lvIsbn);
		lvIsbn.setColumns(13);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(139, 45, 46, 14);
		frmCadastroDeLivros.getContentPane().add(lblTitulo);
		
		lvTitulo = new JTextField();
		lvTitulo.setColumns(13);
		lvTitulo.setBounds(139, 64, 359, 20);
		frmCadastroDeLivros.getContentPane().add(lvTitulo);
		
		lblEdicao = new JLabel("Edição:");
		lblEdicao.setBounds(20, 95, 46, 14);
		frmCadastroDeLivros.getContentPane().add(lblEdicao);
		
		lvEdicao = new JTextField();
		lvEdicao.setColumns(13);
		lvEdicao.setBounds(20, 120, 109, 20);
		frmCadastroDeLivros.getContentPane().add(lvEdicao);
		
		lblEditora = new JLabel("Editora:");
		lblEditora.setBounds(139, 95, 46, 14);
		frmCadastroDeLivros.getContentPane().add(lblEditora);
		
		lvEditora = new JTextField();
		lvEditora.setColumns(13);
		lvEditora.setBounds(139, 120, 109, 20);
		frmCadastroDeLivros.getContentPane().add(lvEditora);
		
		lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(258, 95, 46, 14);
		frmCadastroDeLivros.getContentPane().add(lblIdioma);
		
		lvIdioma = new JTextField();
		lvIdioma.setColumns(13);
		lvIdioma.setBounds(258, 120, 109, 20);
		frmCadastroDeLivros.getContentPane().add(lvIdioma);
		
		lblVolume = new JLabel("Volume:");
		lblVolume.setBounds(377, 95, 46, 14);
		frmCadastroDeLivros.getContentPane().add(lblVolume);
		
		lvVolume = new JTextField();
		lvVolume.setColumns(13);
		lvVolume.setBounds(377, 120, 109, 20);
		frmCadastroDeLivros.getContentPane().add(lvVolume);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(113, 348, 89, 23);
		frmCadastroDeLivros.getContentPane().add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(215, 348, 89, 23);
		frmCadastroDeLivros.getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(310, 348, 89, 23);
		frmCadastroDeLivros.getContentPane().add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(409, 348, 89, 23);
		frmCadastroDeLivros.getContentPane().add(btnSair);
		
		btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 348, 89, 23);
		frmCadastroDeLivros.getContentPane().add(btnNovo);
		
		JPanel Imagem = new JPanel();
		Imagem.setBounds(258, 154, 228, 183);
		frmCadastroDeLivros.getContentPane().add(Imagem);
		Imagem.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(13);
		textField.setBounds(20, 176, 109, 20);
		frmCadastroDeLivros.getContentPane().add(textField);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(20, 151, 46, 14);
		frmCadastroDeLivros.getContentPane().add(lblAno);
	}
}
