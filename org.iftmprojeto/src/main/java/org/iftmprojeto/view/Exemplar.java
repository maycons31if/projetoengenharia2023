package org.iftmprojeto.view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Exemplar {

	private JFrame frmCadastroDeExemplar;
	private JTextField exIsbn;
	private JTextField exTitulo;
	private JLabel lblexEdicao;
	private JTextField exEdicao;
	private JLabel lblexEditora;
	private JTextField exEditora;
	private JLabel lblexIdioma;
	private JTextField exIdioma;
	private JLabel lblexVolume;
	private JTextField exPrateleira;
	private JButton btnNovo;
	private JTextField exEstante;
	private JTextField exCodigo;
	private JLabel lblexSituacao;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplar window = new Exemplar();
					window.frmCadastroDeExemplar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exemplar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeExemplar = new JFrame();
		frmCadastroDeExemplar.setTitle("Cadastro de Exemplares");
		frmCadastroDeExemplar.setBounds(100, 100, 524, 432);
		frmCadastroDeExemplar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeExemplar.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Exemplares");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 488, 14);
		frmCadastroDeExemplar.getContentPane().add(lblNewLabel);
		
		JLabel lblexisbn = new JLabel("ISBN:");
		lblexisbn.setBounds(20, 101, 46, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexisbn);
		
		exIsbn = new JTextField();
		exIsbn.setBounds(20, 120, 109, 20);
		frmCadastroDeExemplar.getContentPane().add(exIsbn);
		exIsbn.setColumns(13);
		
		JLabel lblexTitulo = new JLabel("Titulo:");
		lblexTitulo.setBounds(139, 51, 46, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexTitulo);
		
		exTitulo = new JTextField();
		exTitulo.setColumns(13);
		exTitulo.setBounds(139, 70, 359, 20);
		frmCadastroDeExemplar.getContentPane().add(exTitulo);
		
		lblexEdicao = new JLabel("Edição:");
		lblexEdicao.setBounds(139, 101, 46, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexEdicao);
		
		exEdicao = new JTextField();
		exEdicao.setColumns(13);
		exEdicao.setBounds(139, 120, 109, 20);
		frmCadastroDeExemplar.getContentPane().add(exEdicao);
		
		lblexEditora = new JLabel("Editora:");
		lblexEditora.setBounds(258, 101, 46, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexEditora);
		
		exEditora = new JTextField();
		exEditora.setColumns(13);
		exEditora.setBounds(258, 120, 109, 20);
		frmCadastroDeExemplar.getContentPane().add(exEditora);
		
		lblexIdioma = new JLabel("Idioma:");
		lblexIdioma.setBounds(377, 101, 46, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexIdioma);
		
		exIdioma = new JTextField();
		exIdioma.setColumns(13);
		exIdioma.setBounds(377, 120, 109, 20);
		frmCadastroDeExemplar.getContentPane().add(exIdioma);
		
		lblexVolume = new JLabel("Prateleira:");
		lblexVolume.setBounds(20, 207, 79, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexVolume);
		
		exPrateleira = new JTextField();
		exPrateleira.setColumns(13);
		exPrateleira.setBounds(20, 232, 109, 20);
		frmCadastroDeExemplar.getContentPane().add(exPrateleira);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(113, 348, 89, 23);
		frmCadastroDeExemplar.getContentPane().add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(215, 348, 89, 23);
		frmCadastroDeExemplar.getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(310, 348, 89, 23);
		frmCadastroDeExemplar.getContentPane().add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(409, 348, 89, 23);
		frmCadastroDeExemplar.getContentPane().add(btnSair);
		
		btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 348, 89, 23);
		frmCadastroDeExemplar.getContentPane().add(btnNovo);
		
		JPanel lblexImagem = new JPanel();
		lblexImagem.setBounds(258, 154, 228, 183);
		frmCadastroDeExemplar.getContentPane().add(lblexImagem);
		lblexImagem.setLayout(null);
		
		exEstante = new JTextField();
		exEstante.setColumns(13);
		exEstante.setBounds(139, 232, 109, 20);
		frmCadastroDeExemplar.getContentPane().add(exEstante);
		
		JLabel lblexEstante = new JLabel("Estante:");
		lblexEstante.setBounds(139, 207, 46, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexEstante);
		
		exCodigo = new JTextField();
		exCodigo.setColumns(13);
		exCodigo.setBounds(20, 70, 109, 20);
		frmCadastroDeExemplar.getContentPane().add(exCodigo);
		
		JLabel lblexCodigo = new JLabel("Codigo:");
		lblexCodigo.setBounds(20, 51, 46, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexCodigo);
		
		lblexSituacao = new JLabel("Situação:");
		lblexSituacao.setBounds(20, 263, 46, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexSituacao);
		
		JComboBox exSituacao = new JComboBox();
		exSituacao.setModel(new DefaultComboBoxModel(new String[] {"Disponivel", "Reservado", "Emprestado"}));
		exSituacao.setToolTipText("Disponivel\r\nReservado\r\nEmprestado\r\n");
		exSituacao.setBounds(20, 288, 109, 22);
		frmCadastroDeExemplar.getContentPane().add(exSituacao);
		
		textField = new JTextField();
		textField.setColumns(13);
		textField.setBounds(20, 176, 109, 20);
		frmCadastroDeExemplar.getContentPane().add(textField);
		
		JLabel lblexVolume_1 = new JLabel("Volume:");
		lblexVolume_1.setBounds(20, 151, 46, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexVolume_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(13);
		textField_1.setBounds(139, 176, 109, 20);
		frmCadastroDeExemplar.getContentPane().add(textField_1);
		
		JLabel lblexAno = new JLabel("Ano:");
		lblexAno.setBounds(139, 151, 46, 14);
		frmCadastroDeExemplar.getContentPane().add(lblexAno);
	}
}
