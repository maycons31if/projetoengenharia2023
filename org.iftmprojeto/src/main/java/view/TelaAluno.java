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

public class TelaAluno extends JInternalFrame {
	private JTextField almatricula;
	private JTextField alaluno;
	private JTextField altelefone;
	private JTextField alendereco;
	private JTextField alcurso;
	private JTextField alcep;
	private JTextField alnascimento;
	private JTextField alturno;
	private JTextField idaluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAluno frame = new TelaAluno();
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
	public TelaAluno() {
		setBounds(100, 100, 529, 439);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 508, 393);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Aluno");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 128, 17);
		panel.add(lblNewLabel);
		
		JLabel lblalMatricula = new JLabel("Matricula:");
		lblalMatricula.setBounds(20, 45, 109, 14);
		panel.add(lblalMatricula);
		
		almatricula = new JTextField();
		almatricula.setColumns(13);
		almatricula.setBounds(20, 64, 110, 20);
		panel.add(almatricula);
		
		JLabel lblalAluno = new JLabel("Aluno:");
		lblalAluno.setBounds(139, 45, 260, 14);
		panel.add(lblalAluno);
		
		alaluno = new JTextField();
		alaluno.setColumns(13);
		alaluno.setBounds(139, 64, 260, 20);
		panel.add(alaluno);
		
		JLabel lblalEdicao = new JLabel("Telefone:");
		lblalEdicao.setBounds(20, 95, 75, 14);
		panel.add(lblalEdicao);
		
		altelefone = new JTextField();
		altelefone.setColumns(13);
		altelefone.setBounds(20, 120, 110, 20);
		panel.add(altelefone);
		
		JLabel lblalEndereco = new JLabel("Endereço:");
		lblalEndereco.setBounds(258, 95, 211, 14);
		panel.add(lblalEndereco);
		
		alendereco = new JTextField();
		alendereco.setColumns(13);
		alendereco.setBounds(258, 120, 228, 20);
		panel.add(alendereco);
		
		JLabel lblalCurso = new JLabel("Curso:");
		lblalCurso.setBounds(139, 151, 109, 14);
		panel.add(lblalCurso);
		
		alcurso = new JTextField();
		alcurso.setColumns(13);
		alcurso.setBounds(139, 176, 110, 20);
		panel.add(alcurso);
		
		JLabel lblalCep = new JLabel("CEP:");
		lblalCep.setBounds(139, 95, 110, 14);
		panel.add(lblalCep);
		
		alcep = new JTextField();
		alcep.setColumns(13);
		alcep.setBounds(139, 120, 110, 20);
		panel.add(alcep);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(113, 348, 85, 23);
		panel.add(btnSalvar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlterar.setBounds(215, 348, 85, 23);
		panel.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(310, 348, 85, 23);
		panel.add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   System.exit(0);
			}
		});
		btnSair.setBounds(405, 348, 85, 23);
		panel.add(btnSair);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInserir.setBounds(10, 348, 85, 23);
		panel.add(btnInserir);
		
		JPanel lblalImagem = new JPanel();
		lblalImagem.setLayout(null);
		lblalImagem.setBounds(258, 154, 1, 1);
		panel.add(lblalImagem);
		
		alnascimento = new JTextField();
		alnascimento.setColumns(13);
		alnascimento.setBounds(20, 176, 110, 20);
		panel.add(alnascimento);
		
		JLabel lblalNascimento = new JLabel("Data Nascimento:");
		lblalNascimento.setBounds(20, 151, 109, 14);
		panel.add(lblalNascimento);
		
		JComboBox alSituacao = new JComboBox();
		alSituacao.setToolTipText("");
		alSituacao.setBounds(409, 63, 77, 20);
		panel.add(alSituacao);
		
		JLabel lblalSituacao = new JLabel("Situação:");
		lblalSituacao.setBounds(409, 45, 60, 14);
		panel.add(lblalSituacao);
		
		JLabel lblalTurno = new JLabel("Turno:");
		lblalTurno.setBounds(20, 207, 109, 14);
		panel.add(lblalTurno);
		
		alturno = new JTextField();
		alturno.setColumns(13);
		alturno.setBounds(20, 232, 110, 20);
		panel.add(alturno);
		
		JPanel alfoto = new JPanel();
		alfoto.setLayout(null);
		alfoto.setBounds(258, 154, 228, 183);
		panel.add(alfoto);
		
		JLabel lblalid = new JLabel("ID:");
		lblalid.setBounds(360, 14, 39, 14);
		panel.add(lblalid);
		
		idaluno = new JTextField();
		idaluno.setEditable(false);
		idaluno.setColumns(13);
		idaluno.setBounds(388, 11, 98, 20);
		panel.add(idaluno);

	}
}
