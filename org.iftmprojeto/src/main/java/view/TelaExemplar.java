package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExemplar extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExemplar frame = new TelaExemplar();
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
	public TelaExemplar() {
		setBounds(100, 100, 518, 411);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 488, 360);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Exemplar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 182, 14);
		panel.add(lblNewLabel);
		
		JLabel lblexisbn = new JLabel("ISBN:");
		lblexisbn.setBounds(10, 90, 46, 14);
		panel.add(lblexisbn);
		
		textField = new JTextField();
		textField.setColumns(13);
		textField.setBounds(10, 109, 109, 20);
		panel.add(textField);
		
		JLabel lblexTitulo = new JLabel("Titulo:");
		lblexTitulo.setBounds(129, 40, 46, 14);
		panel.add(lblexTitulo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(13);
		textField_1.setBounds(129, 59, 359, 20);
		panel.add(textField_1);
		
		JLabel lblexEdicao = new JLabel("Edição:");
		lblexEdicao.setBounds(129, 90, 46, 14);
		panel.add(lblexEdicao);
		
		textField_2 = new JTextField();
		textField_2.setColumns(13);
		textField_2.setBounds(129, 109, 109, 20);
		panel.add(textField_2);
		
		JLabel lblexEditora = new JLabel("Editora:");
		lblexEditora.setBounds(248, 90, 46, 14);
		panel.add(lblexEditora);
		
		textField_3 = new JTextField();
		textField_3.setColumns(13);
		textField_3.setBounds(248, 109, 109, 20);
		panel.add(textField_3);
		
		JLabel lblexIdioma = new JLabel("Idioma:");
		lblexIdioma.setBounds(367, 90, 46, 14);
		panel.add(lblexIdioma);
		
		textField_4 = new JTextField();
		textField_4.setColumns(13);
		textField_4.setBounds(367, 109, 109, 20);
		panel.add(textField_4);
		
		JLabel lblexVolume = new JLabel("Prateleira:");
		lblexVolume.setBounds(10, 196, 79, 14);
		panel.add(lblexVolume);
		
		textField_5 = new JTextField();
		textField_5.setColumns(13);
		textField_5.setBounds(10, 221, 109, 20);
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
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Runtime.getRuntime().exit(1);
				//System.exit(0);

			}
		});
		btnSair.setBounds(399, 337, 89, 23);
		panel.add(btnSair);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(0, 337, 89, 23);
		panel.add(btnNovo);
		
		JPanel lblexImagem = new JPanel();
		lblexImagem.setLayout(null);
		lblexImagem.setBounds(248, 143, 228, 183);
		panel.add(lblexImagem);
		
		textField_6 = new JTextField();
		textField_6.setColumns(13);
		textField_6.setBounds(129, 221, 109, 20);
		panel.add(textField_6);
		
		JLabel lblexEstante = new JLabel("Estante:");
		lblexEstante.setBounds(129, 196, 46, 14);
		panel.add(lblexEstante);
		
		textField_7 = new JTextField();
		textField_7.setColumns(13);
		textField_7.setBounds(10, 59, 109, 20);
		panel.add(textField_7);
		
		JLabel lblexCodigo = new JLabel("Codigo:");
		lblexCodigo.setBounds(10, 40, 46, 14);
		panel.add(lblexCodigo);
		
		JLabel lblexSituacao = new JLabel("Situação:");
		lblexSituacao.setBounds(10, 252, 46, 14);
		panel.add(lblexSituacao);
		
		JComboBox exSituacao = new JComboBox();
		exSituacao.setToolTipText("Disponivel\r\nReservado\r\nEmprestado\r\n");
		exSituacao.setBounds(10, 277, 109, 22);
		panel.add(exSituacao);
		
		textField_8 = new JTextField();
		textField_8.setColumns(13);
		textField_8.setBounds(10, 165, 109, 20);
		panel.add(textField_8);
		
		JLabel lblexVolume_1 = new JLabel("Volume:");
		lblexVolume_1.setBounds(10, 140, 46, 14);
		panel.add(lblexVolume_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(13);
		textField_9.setBounds(129, 165, 109, 20);
		panel.add(textField_9);
		
		JLabel lblexAno = new JLabel("Ano:");
		lblexAno.setBounds(129, 140, 46, 14);
		panel.add(lblexAno);

	}

}
