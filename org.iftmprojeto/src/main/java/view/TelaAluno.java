package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import control.AlunoControle;
import model.Aluno;
import model.Livro;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAluno extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final JLabel alSituacao = null;
	protected static final JLabel alFoto = null;
	private Aluno objeto;
	private TelaAluno controle = new TelaAluno();
	
	private JTextField alMatricula;
	private JTextField alNome;
	private JTextField alTelefone;
	private JTextField alEndereco;
	private JTextField alCurso;
	private JTextField alCep;
	private JTextField alNascimento;
	private JTextField alTurno;
	private JTextField alId;

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
		
		alMatricula = new JTextField();
		alMatricula.setColumns(13);
		alMatricula.setBounds(20, 64, 110, 20);
		panel.add(alMatricula);
		
		JLabel lblalAluno = new JLabel("Nome:");
		lblalAluno.setBounds(139, 45, 260, 14);
		panel.add(lblalAluno);
		
		alNome = new JTextField();
		alNome.setColumns(13);
		alNome.setBounds(139, 64, 260, 20);
		panel.add(alNome);
		
		JLabel lblalEdicao = new JLabel("Telefone:");
		lblalEdicao.setBounds(20, 95, 75, 14);
		panel.add(lblalEdicao);
		
		alTelefone = new JTextField();
		alTelefone.setColumns(13);
		alTelefone.setBounds(20, 120, 110, 20);
		panel.add(alTelefone);
		
		JLabel lblalEndereco = new JLabel("Endereço:");
		lblalEndereco.setBounds(258, 95, 211, 14);
		panel.add(lblalEndereco);
		
		alEndereco = new JTextField();
		alEndereco.setColumns(13);
		alEndereco.setBounds(258, 120, 228, 20);
		panel.add(alEndereco);
		
		JLabel lblalCurso = new JLabel("Curso:");
		lblalCurso.setBounds(139, 151, 109, 14);
		panel.add(lblalCurso);
		
		alCurso = new JTextField();
		alCurso.setColumns(13);
		alCurso.setBounds(139, 176, 110, 20);
		panel.add(alCurso);
		
		JLabel lblalCep = new JLabel("CEP:");
		lblalCep.setBounds(139, 95, 110, 14);
		panel.add(lblalCep);
		
		alCep = new JTextField();
		alCep.setColumns(13);
		alCep.setBounds(139, 120, 110, 20);
		panel.add(alCep);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer matricula = Integer.parseInt(alNome.getText());
			}
		});
		btnSalvar.setBounds(113, 348, 85, 23);
		panel.add(btnSalvar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				if (objeto!=null) {
					objeto.setId(Integer.parseInt(alId.getText()));
					objeto.setMatricula(Integer.parseInt(alMatricula.getText()));
					objeto.setNome(alNome.getText());
					objeto.alSituacao(alSituacao.getText());
					objeto.setTelefone(Integer.parseInt(alTelefone.getText()));
					objeto.setCep(Integer.parseInt(alCep.getText()));
					objeto.setEndereco(Integer.parseInt(alEndereco.getText()));
					objeto.alNascimento(Integer.parseInt(alNascimento.getText()));
					objeto.setCurso(alCurso.getText());
					objeto.setTurno(alTurno.getText());
					objeto.alFoto(Aluno.getText());

					controle.alterar(objeto);
					JOptionPane.showMessageDialog(null, "Aluno Atualizado com sucesso.");

				}else {
					JOptionPane.showMessageDialog(null, "Não foi realizado Alteração.");
				}
}
		});
		btnAlterar.setBounds(215, 348, 85, 23);
		panel.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
				if (objeto!=null) {
					controle.excluir(objeto);
			objeto = null;
					

			alId.setText("");
			alMatricula.setText("");
			alNome.setText("");
			alSituacao.setText("");
			alTelefone.setText("");
			alCep.setText("");
			alEndereco.setText("");
			alNascimento.setText("");
			alCurso.setText("");
			alTurno.setText("");

			
			
					JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso.");
			}else {
					JOptionPane.showMessageDialog(null, "Não há objeto a ser excluído.");
				}

			
			
			
			
			
			
			
			}
		});
		btnExcluir.setBounds(310, 348, 85, 23);
		panel.add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   
				
				
				if (objeto!=null) {					
					alId.setText(String.valueOf(objeto.getId()));
					alMatricula.setText(String.valueOf(objeto.getMatricula()));	
					alNome.setText(objeto.getNome());
					alSituacao.setText(objeto.getSituacao());
					alTelefone.setText(String.valueOf(objeto.getTelefone()));
					alEndereco.setText(objeto.getEndereco());
					alNascimento.setText(String.valueOf(objeto.getNascimento()));
					alCurso.setText(objeto.getCurso());
					alTurno.setText(objeto.getTurno());
					alFoto.setText(objeto.alFoto());
					
					}else {
						JOptionPane.showMessageDialog(null, "Não exite Aluno com essa matricula");
						alMatricula.setText("");
					}

				
				
				
				
				//System.exit(0);
				   
				   
				   
				   
				   
			 
			}
		});
		btnConsultar.setBounds(405, 348, 85, 23);
		panel.add(btnConsultar);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				

					objeto = new Aluno(null, alMatricula.getText(), alNome.getText(), alSituacao.getText(), alTelefone.getText(), alCep.getText(), alEndereco.getText(), alNascimento.getText(), alCurso.getText(), alTurno.getText(), null );
					controle.inserir(objeto);
					JOptionPane.showMessageDialog(null, "Aluno Cadastrado.");
					alId.setText(String.valueOf(objeto.getId()));
					
					
			
						
			
			}
		});
		
		
		btnInserir.setBounds(10, 348, 85, 23);
		panel.add(btnInserir);
		
		JPanel lblalImagem = new JPanel();
		lblalImagem.setLayout(null);
		lblalImagem.setBounds(258, 154, 1, 1);
		panel.add(lblalImagem);
		
		alNascimento = new JTextField();
		alNascimento.setColumns(13);
		alNascimento.setBounds(20, 176, 110, 20);
		panel.add(alNascimento);
		
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
		
		alTurno = new JTextField();
		alTurno.setColumns(13);
		alTurno.setBounds(20, 232, 110, 20);
		panel.add(alTurno);
		
		JPanel alFoto = new JPanel();
		alFoto.setLayout(null);
		alFoto.setBounds(258, 154, 228, 183);
		panel.add(alFoto);
		
		JLabel lblalid = new JLabel("ID:");
		lblalid.setBounds(360, 14, 39, 14);
		panel.add(lblalid);
		
		alId = new JTextField();
		alId.setEditable(false);
		alId.setColumns(13);
		alId.setBounds(388, 11, 98, 20);
		panel.add(alId);

	}

	protected void alterar(Aluno objeto2) {
		// TODO Auto-generated method stub
		
	}

	protected void inserir(Aluno objeto2) {
		// TODO Auto-generated method stub
		
	}

	protected void excluir(Aluno objeto2) {
		// TODO Auto-generated method stub
		
	}
}
