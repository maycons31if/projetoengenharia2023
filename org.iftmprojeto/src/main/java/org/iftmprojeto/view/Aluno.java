package org.iftmprojeto.view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Aluno {

	private JFrame frmCadastroDeAluno;
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aluno window = new Aluno();
					window.frmCadastroDeAluno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeAluno = new JFrame();
		frmCadastroDeAluno.setTitle("Cadastro de Aluno");
		frmCadastroDeAluno.setBounds(100, 100, 524, 432);
		frmCadastroDeAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeAluno.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 508, 393);
		frmCadastroDeAluno.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Aluno");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 128, 17);
		panel.add(lblNewLabel);
		
		JLabel lblalMatricula = new JLabel("Matricula:");
		lblalMatricula.setBounds(20, 45, 110, 14);
		panel.add(lblalMatricula);
		
		textField = new JTextField();
		textField.setColumns(13);
		textField.setBounds(20, 64, 110, 20);
		panel.add(textField);
		
		JLabel lblalAluno = new JLabel("Aluno:");
		lblalAluno.setBounds(139, 45, 260, 14);
		panel.add(lblalAluno);
		
		textField_1 = new JTextField();
		textField_1.setColumns(13);
		textField_1.setBounds(139, 64, 260, 20);
		panel.add(textField_1);
		
		JLabel lblalEdicao = new JLabel("Telefone:");
		lblalEdicao.setBounds(20, 95, 110, 14);
		panel.add(lblalEdicao);
		
		textField_2 = new JTextField();
		textField_2.setColumns(13);
		textField_2.setBounds(20, 120, 110, 20);
		panel.add(textField_2);
		
		JLabel lblalEndereco = new JLabel("Endereço:");
		lblalEndereco.setBounds(258, 95, 177, 14);
		panel.add(lblalEndereco);
		
		textField_3 = new JTextField();
		textField_3.setColumns(13);
		textField_3.setBounds(258, 120, 228, 20);
		panel.add(textField_3);
		
		JLabel lblalCurso = new JLabel("Curso:");
		lblalCurso.setBounds(139, 151, 110, 14);
		panel.add(lblalCurso);
		
		textField_4 = new JTextField();
		textField_4.setColumns(13);
		textField_4.setBounds(139, 176, 110, 20);
		panel.add(textField_4);
		
		JLabel lblalCep = new JLabel("CEP:");
		lblalCep.setBounds(139, 95, 109, 14);
		panel.add(lblalCep);
		
		textField_5 = new JTextField();
		textField_5.setColumns(13);
		textField_5.setBounds(139, 120, 110, 20);
		panel.add(textField_5);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(113, 348, 83, 23);
		panel.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(217, 348, 83, 23);
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(310, 348, 83, 23);
		panel.add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(415, 348, 83, 23);
		panel.add(btnSair);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 348, 83, 23);
		panel.add(btnNovo);
		
		JPanel lblalImagem = new JPanel();
		lblalImagem.setLayout(null);
		lblalImagem.setBounds(258, 154, 1, 1);
		panel.add(lblalImagem);
		
		textField_6 = new JTextField();
		textField_6.setColumns(13);
		textField_6.setBounds(20, 176, 110, 20);
		panel.add(textField_6);
		
		JLabel lblalNascimento = new JLabel("Data Nascimento:");
		lblalNascimento.setBounds(20, 151, 110, 14);
		panel.add(lblalNascimento);
		
		JComboBox alSituacao = new JComboBox();
		alSituacao.setToolTipText("");
		alSituacao.setBounds(409, 63, 60, 20);
		panel.add(alSituacao);
		
		JLabel lblalSituacao = new JLabel("Situação:");
		lblalSituacao.setBounds(409, 45, 60, 14);
		panel.add(lblalSituacao);
		
		JLabel lblalTurno = new JLabel("Turno:");
		lblalTurno.setBounds(20, 207, 83, 14);
		panel.add(lblalTurno);
		
		textField_7 = new JTextField();
		textField_7.setColumns(13);
		textField_7.setBounds(20, 232, 110, 20);
		panel.add(textField_7);
		
		JPanel lblexImagem = new JPanel();
		lblexImagem.setLayout(null);
		lblexImagem.setBounds(258, 154, 228, 183);
		panel.add(lblexImagem);
	}
}
