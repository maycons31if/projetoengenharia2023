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
	private JPanel panel;

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
		
		panel = new JPanel();
		panel.setBounds(10, 11, 488, 360);
		frmCadastroDeExemplar.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Exemplares");
		lblNewLabel.setBounds(0, 0, 488, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblexisbn = new JLabel("ISBN:");
		lblexisbn.setBounds(10, 90, 46, 14);
		panel.add(lblexisbn);
		
		exIsbn = new JTextField();
		exIsbn.setBounds(10, 109, 109, 20);
		panel.add(exIsbn);
		exIsbn.setColumns(13);
		
		JLabel lblexTitulo = new JLabel("Titulo:");
		lblexTitulo.setBounds(129, 40, 46, 14);
		panel.add(lblexTitulo);
		
		exTitulo = new JTextField();
		exTitulo.setBounds(129, 59, 359, 20);
		panel.add(exTitulo);
		exTitulo.setColumns(13);
		
		lblexEdicao = new JLabel("Edição:");
		lblexEdicao.setBounds(129, 90, 46, 14);
		panel.add(lblexEdicao);
		
		exEdicao = new JTextField();
		exEdicao.setBounds(129, 109, 109, 20);
		panel.add(exEdicao);
		exEdicao.setColumns(13);
		
		lblexEditora = new JLabel("Editora:");
		lblexEditora.setBounds(248, 90, 46, 14);
		panel.add(lblexEditora);
		
		exEditora = new JTextField();
		exEditora.setBounds(248, 109, 109, 20);
		panel.add(exEditora);
		exEditora.setColumns(13);
		
		lblexIdioma = new JLabel("Idioma:");
		lblexIdioma.setBounds(367, 90, 46, 14);
		panel.add(lblexIdioma);
		
		exIdioma = new JTextField();
		exIdioma.setBounds(367, 109, 109, 20);
		panel.add(exIdioma);
		exIdioma.setColumns(13);
		
		lblexVolume = new JLabel("Prateleira:");
		lblexVolume.setBounds(10, 196, 79, 14);
		panel.add(lblexVolume);
		
		exPrateleira = new JTextField();
		exPrateleira.setBounds(10, 221, 109, 20);
		panel.add(exPrateleira);
		exPrateleira.setColumns(13);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(103, 337, 89, 23);
		panel.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(205, 337, 89, 23);
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(300, 337, 89, 23);
		panel.add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(399, 337, 89, 23);
		panel.add(btnSair);
		
		btnNovo = new JButton("Novo");
		btnNovo.setBounds(0, 337, 89, 23);
		panel.add(btnNovo);
		
		JPanel lblexImagem = new JPanel();
		lblexImagem.setBounds(248, 143, 228, 183);
		panel.add(lblexImagem);
		lblexImagem.setLayout(null);
		
		exEstante = new JTextField();
		exEstante.setBounds(129, 221, 109, 20);
		panel.add(exEstante);
		exEstante.setColumns(13);
		
		JLabel lblexEstante = new JLabel("Estante:");
		lblexEstante.setBounds(129, 196, 46, 14);
		panel.add(lblexEstante);
		
		exCodigo = new JTextField();
		exCodigo.setBounds(10, 59, 109, 20);
		panel.add(exCodigo);
		exCodigo.setColumns(13);
		
		JLabel lblexCodigo = new JLabel("Codigo:");
		lblexCodigo.setBounds(10, 40, 46, 14);
		panel.add(lblexCodigo);
		
		lblexSituacao = new JLabel("Situação:");
		lblexSituacao.setBounds(10, 252, 46, 14);
		panel.add(lblexSituacao);
		
		JComboBox exSituacao = new JComboBox();
		exSituacao.setBounds(10, 277, 109, 22);
		panel.add(exSituacao);
		exSituacao.setModel(new DefaultComboBoxModel(new String[] {"Disponivel", "Reservado", "Emprestado"}));
		exSituacao.setToolTipText("Disponivel\r\nReservado\r\nEmprestado\r\n");
		
		textField = new JTextField();
		textField.setBounds(10, 165, 109, 20);
		panel.add(textField);
		textField.setColumns(13);
		
		JLabel lblexVolume_1 = new JLabel("Volume:");
		lblexVolume_1.setBounds(10, 140, 46, 14);
		panel.add(lblexVolume_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 165, 109, 20);
		panel.add(textField_1);
		textField_1.setColumns(13);
		
		JLabel lblexAno = new JLabel("Ano:");
		lblexAno.setBounds(129, 140, 46, 14);
		panel.add(lblexAno);
	}
}
