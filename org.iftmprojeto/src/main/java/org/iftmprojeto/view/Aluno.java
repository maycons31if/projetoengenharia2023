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
	private JTextField alMatricula;
	private JTextField alNome;
	private JLabel lblalEdicao;
	private JTextField alTelefone;
	private JLabel lblalEndereco;
	private JTextField alEndereco;
	private JLabel lblalCurso;
	private JTextField alCurso;
	private JLabel lblalCep;
	private JTextField alCep;
	private JButton btnNovo;
	private JTextField alNascimento;
	private JComboBox alSituacao;
	private JLabel lblalSituação;
	private JLabel lblalTurno;
	private JTextField alTurno;

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
		
		JLabel lblNewLabel = new JLabel("Cadastro de Aluno");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 488, 14);
		frmCadastroDeAluno.getContentPane().add(lblNewLabel);
		
		JLabel lblalMatricula = new JLabel("Matricula:");
		lblalMatricula.setBounds(20, 45, 79, 14);
		frmCadastroDeAluno.getContentPane().add(lblalMatricula);
		
		alMatricula = new JTextField();
		alMatricula.setBounds(20, 64, 109, 20);
		frmCadastroDeAluno.getContentPane().add(alMatricula);
		alMatricula.setColumns(13);
		
		JLabel lblalAluno = new JLabel("Aluno:");
		lblalAluno.setBounds(139, 45, 46, 14);
		frmCadastroDeAluno.getContentPane().add(lblalAluno);
		
		alNome = new JTextField();
		alNome.setColumns(13);
		alNome.setBounds(139, 64, 260, 20);
		frmCadastroDeAluno.getContentPane().add(alNome);
		
		lblalEdicao = new JLabel("Telefone:");
		lblalEdicao.setBounds(20, 95, 46, 14);
		frmCadastroDeAluno.getContentPane().add(lblalEdicao);
		
		alTelefone = new JTextField();
		alTelefone.setColumns(13);
		alTelefone.setBounds(20, 120, 109, 20);
		frmCadastroDeAluno.getContentPane().add(alTelefone);
		
		lblalEndereco = new JLabel("Endereço:");
		lblalEndereco.setBounds(258, 95, 240, 14);
		frmCadastroDeAluno.getContentPane().add(lblalEndereco);
		
		alEndereco = new JTextField();
		alEndereco.setColumns(13);
		alEndereco.setBounds(258, 120, 240, 20);
		frmCadastroDeAluno.getContentPane().add(alEndereco);
		
		lblalCurso = new JLabel("Curso:");
		lblalCurso.setBounds(139, 151, 46, 14);
		frmCadastroDeAluno.getContentPane().add(lblalCurso);
		
		alCurso = new JTextField();
		alCurso.setColumns(13);
		alCurso.setBounds(139, 176, 109, 20);
		frmCadastroDeAluno.getContentPane().add(alCurso);
		
		lblalCep = new JLabel("CEP:");
		lblalCep.setBounds(139, 95, 46, 14);
		frmCadastroDeAluno.getContentPane().add(lblalCep);
		
		alCep = new JTextField();
		alCep.setColumns(13);
		alCep.setBounds(139, 120, 109, 20);
		frmCadastroDeAluno.getContentPane().add(alCep);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(113, 348, 89, 23);
		frmCadastroDeAluno.getContentPane().add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(215, 348, 89, 23);
		frmCadastroDeAluno.getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(310, 348, 89, 23);
		frmCadastroDeAluno.getContentPane().add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(409, 348, 89, 23);
		frmCadastroDeAluno.getContentPane().add(btnSair);
		
		btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 348, 89, 23);
		frmCadastroDeAluno.getContentPane().add(btnNovo);
		
		JPanel lblalImagem = new JPanel();
		lblalImagem.setBounds(258, 154, 228, 183);
		frmCadastroDeAluno.getContentPane().add(lblalImagem);
		lblalImagem.setLayout(null);
		
		alNascimento = new JTextField();
		alNascimento.setColumns(13);
		alNascimento.setBounds(20, 176, 109, 20);
		frmCadastroDeAluno.getContentPane().add(alNascimento);
		
		JLabel lblalNascimento = new JLabel("Data Nascimento:");
		lblalNascimento.setBounds(20, 151, 109, 14);
		frmCadastroDeAluno.getContentPane().add(lblalNascimento);
		
		alSituacao = new JComboBox();
		alSituacao.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		alSituacao.setToolTipText("");
		alSituacao.setBounds(409, 63, 89, 22);
		frmCadastroDeAluno.getContentPane().add(alSituacao);
		
		lblalSituação = new JLabel("Situação:");
		lblalSituação.setBounds(409, 45, 89, 14);
		frmCadastroDeAluno.getContentPane().add(lblalSituação);
		
		lblalTurno = new JLabel("Turno:");
		lblalTurno.setBounds(20, 207, 46, 14);
		frmCadastroDeAluno.getContentPane().add(lblalTurno);
		
		alTurno = new JTextField();
		alTurno.setColumns(13);
		alTurno.setBounds(20, 232, 109, 20);
		frmCadastroDeAluno.getContentPane().add(alTurno);
	}
}
