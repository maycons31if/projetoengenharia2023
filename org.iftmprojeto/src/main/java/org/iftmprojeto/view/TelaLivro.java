package org.iftmprojeto.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaLivro extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLivro frame = new TelaLivro();
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
	public TelaLivro() {
		setBounds(100, 100, 509, 398);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 488, 360);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Livros");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 0, 488, 14);
		panel.add(lblNewLabel);
		
		JLabel lblisbn = new JLabel("ISBN:");
		lblisbn.setBounds(10, 34, 46, 14);
		panel.add(lblisbn);
		
		textField = new JTextField();
		textField.setColumns(13);
		textField.setBounds(10, 53, 109, 20);
		panel.add(textField);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(129, 34, 46, 14);
		panel.add(lblTitulo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(13);
		textField_1.setBounds(129, 53, 359, 20);
		panel.add(textField_1);
		
		JLabel lblEdicao = new JLabel("Edição:");
		lblEdicao.setBounds(10, 84, 46, 14);
		panel.add(lblEdicao);
		
		textField_2 = new JTextField();
		textField_2.setColumns(13);
		textField_2.setBounds(10, 109, 109, 20);
		panel.add(textField_2);
		
		JLabel lblEditora = new JLabel("Editora:");
		lblEditora.setBounds(129, 84, 46, 14);
		panel.add(lblEditora);
		
		textField_3 = new JTextField();
		textField_3.setColumns(13);
		textField_3.setBounds(129, 109, 109, 20);
		panel.add(textField_3);
		
		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(248, 84, 46, 14);
		panel.add(lblIdioma);
		
		textField_4 = new JTextField();
		textField_4.setColumns(13);
		textField_4.setBounds(248, 109, 109, 20);
		panel.add(textField_4);
		
		JLabel lblVolume = new JLabel("Volume:");
		lblVolume.setBounds(367, 84, 46, 14);
		panel.add(lblVolume);
		
		textField_5 = new JTextField();
		textField_5.setColumns(13);
		textField_5.setBounds(367, 109, 109, 20);
		panel.add(textField_5);
		
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
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(0, 337, 89, 23);
		panel.add(btnNovo);
		
		JPanel Imagem = new JPanel();
		Imagem.setLayout(null);
		Imagem.setBounds(248, 143, 228, 183);
		panel.add(Imagem);
		
		textField_6 = new JTextField();
		textField_6.setColumns(13);
		textField_6.setBounds(10, 165, 109, 20);
		panel.add(textField_6);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(10, 140, 46, 14);
		panel.add(lblAno);

	}

}
