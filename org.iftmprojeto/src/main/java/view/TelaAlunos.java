package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import control.AlunoControle;
import model.Aluno;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class TelaAlunos extends JInternalFrame {
		
	private Aluno objeto;
	private AlunoControle controle = new AlunoControle();
	
	
private static final long serialVersionUID = 1L;
	
	protected static final JLabel alFoto = null;

	private JTextField alMatricula;
	private JTextField alNome;
	private JTextField alTelefone;
	private JTextField alEndereco;
	private JTextField alCurso;
	private JTextField alCep;
	private JTextField alNascimento;
	private JTextField alTurno;
	private JTextField alId;
	protected JTextField alSituacao;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlunos frame = new TelaAlunos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public TelaAlunos() {
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setTitle("Cadastro de Alunos");
		setBounds(100, 100, 612, 511);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 608, 481);
		getContentPane().add(tabbedPane);
		
		JPanel taTabela = new JPanel();
		tabbedPane.addTab("Tabela Alunos", null, taTabela, null);
		taTabela.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 583, 381);
		taTabela.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel taAluno = new JPanel();
		tabbedPane.addTab("Aluno", null, taAluno, null);
		taAluno.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 128, 17);
		taAluno.add(lblNewLabel);
		
		JLabel lblalMatricula = new JLabel("Matricula:");
		lblalMatricula.setBounds(20, 45, 109, 14);
		taAluno.add(lblalMatricula);
		
		alSituacao = new JTextField();
		alSituacao.setToolTipText("");
		alSituacao.setBounds(409, 63, 172, 20);
		taAluno.add(alSituacao);
		
		alMatricula = new JTextField();
		alMatricula.setColumns(13);
		alMatricula.setBounds(20, 64, 110, 20);
		taAluno.add(alMatricula);
		
		JLabel lblalAluno = new JLabel("Nome:");
		lblalAluno.setBounds(139, 45, 260, 14);
		taAluno.add(lblalAluno);
		
		alNome = new JTextField();
		alNome.setColumns(13);
		alNome.setBounds(139, 64, 260, 20);
		taAluno.add(alNome);
		
		JLabel lblalEdicao = new JLabel("Telefone:");
		lblalEdicao.setBounds(20, 95, 75, 14);
		taAluno.add(lblalEdicao);
		
		alTelefone = new JTextField();
		alTelefone.setColumns(13);
		alTelefone.setBounds(20, 120, 110, 20);
		taAluno.add(alTelefone);
		
		JLabel lblalEndereco = new JLabel("Endereço:");
		lblalEndereco.setBounds(258, 95, 211, 14);
		taAluno.add(lblalEndereco);
		
		alEndereco = new JTextField();
		alEndereco.setColumns(13);
		alEndereco.setBounds(258, 120, 323, 20);
		taAluno.add(alEndereco);
		
		JLabel lblalCurso = new JLabel("Curso:");
		lblalCurso.setBounds(139, 151, 109, 14);
		taAluno.add(lblalCurso);
		
		alCurso = new JTextField();
		alCurso.setColumns(13);
		alCurso.setBounds(139, 176, 110, 20);
		taAluno.add(alCurso);
		
		JLabel lblalCep = new JLabel("CEP:");
		lblalCep.setBounds(139, 95, 110, 14);
		taAluno.add(lblalCep);
		
		alCep = new JTextField();
		alCep.setColumns(13);
		alCep.setBounds(139, 120, 110, 20);
		taAluno.add(alCep);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				if (objeto!=null) {
					objeto.setId(Integer.parseInt(alId.getText()));
					objeto.setMatricula(Integer.parseInt(alMatricula.getText()));
					objeto.setNome(alNome.getText());
					objeto.setSituacao(alSituacao.getText());
					objeto.setTelefone(Integer.parseInt(alTelefone.getText()));
					objeto.setCep(Integer.parseInt(alCep.getText()));
					objeto.setEndereco(alEndereco.getText());
					objeto.setDataNascimento(Integer.parseInt(alNascimento.getText()));
					objeto.setCurso(alCurso.getText());
					objeto.setTurno(alTurno.getText());

					controle.alterar(objeto);
					JOptionPane.showMessageDialog(null, "Aluno Atualizado com sucesso.");

				}else {
					JOptionPane.showMessageDialog(null, "Não foi realizado Alteração.");
				}
}
		});
		btnAlterar.setBounds(105, 389, 85, 23);
		taAluno.add(btnAlterar);
		
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
		btnExcluir.setBounds(201, 389, 85, 23);
		taAluno.add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do aluno "));
				objeto = controle.buscarPorId(id);   
				
				
				if (objeto!=null) {					
					alId.setText(String.valueOf(objeto.getId()));
					alMatricula.setText(String.valueOf(objeto.getMatricula()));	
					alNome.setText(objeto.getNome());
					alSituacao.setText(objeto.getSituacao());
					alTelefone.setText(String.valueOf(objeto.getTelefone()));
					alEndereco.setText(objeto.getEndereco());
					alNascimento.setText(String.valueOf(objeto.getDataNascimento()));
					alCurso.setText(objeto.getCurso());
					alTurno.setText(objeto.getTurno());
					alCep.setText(String.valueOf(objeto.getCep()));
					
					}else {
						JOptionPane.showMessageDialog(null, "Não exite Aluno com essa matricula");
						alMatricula.setText("");
					}

				
				
				
				
				//System.exit(0);
				   
				   
				   
				   
				   
			 
			}
		});
		btnConsultar.setBounds(391, 389, 100, 23);
		taAluno.add(btnConsultar);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				

					objeto = new Aluno(null, Integer.parseInt(alMatricula.getText()), alNome.getText(), alSituacao.getText(), Integer.parseInt(alTelefone.getText()), Integer.parseInt(alCep.getText()), alEndereco.getText(), Integer.parseInt(alNascimento.getText()), alCurso.getText(), alTurno.getText());
					controle.inserir(objeto);
					JOptionPane.showMessageDialog(null, "Aluno Cadastrado.");
					alId.setText(String.valueOf(objeto.getId()));
					
								
			
			}
		});
		
		
		btnInserir.setBounds(10, 389, 85, 23);
		taAluno.add(btnInserir);
		
		JPanel lblalImagem = new JPanel();
		lblalImagem.setLayout(null);
		lblalImagem.setBounds(258, 154, 1, 1);
		taAluno.add(lblalImagem);
		
		alNascimento = new JTextField();
		alNascimento.setColumns(13);
		alNascimento.setBounds(20, 176, 110, 20);
		taAluno.add(alNascimento);
		
		JLabel lblalNascimento = new JLabel("Data Nascimento:");
		lblalNascimento.setBounds(20, 151, 109, 14);
		taAluno.add(lblalNascimento);
		

		
		JLabel lblalSituacao = new JLabel("Situação:");
		lblalSituacao.setBounds(409, 45, 60, 14);
		taAluno.add(lblalSituacao);
		
		JLabel lblalTurno = new JLabel("Turno:");
		lblalTurno.setBounds(20, 207, 109, 14);
		taAluno.add(lblalTurno);
		
		alTurno = new JTextField();
		alTurno.setColumns(13);
		alTurno.setBounds(20, 232, 110, 20);
		taAluno.add(alTurno);
		
		JPanel alFoto_1 = new JPanel();
		alFoto_1.setLayout(null);
		alFoto_1.setBounds(353, 151, 228, 183);
		taAluno.add(alFoto_1);
		
		JLabel lblalid = new JLabel("ID:");
		lblalid.setBounds(360, 14, 39, 14);
		taAluno.add(lblalid);
		
		alId = new JTextField();
		alId.setEditable(false);
		alId.setColumns(13);
		alId.setBounds(388, 11, 193, 20);
		taAluno.add(alId);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				alId.setText(null);
				
				alMatricula.setText(null);	
				alNome.setText(null);
				alSituacao.setText(null);
				alTelefone.setText(null);
				alEndereco.setText(null);
				alNascimento.setText(null);
				alCurso.setText(null);
				alTurno.setText(null);
				alCep.setText(null);
				
				JOptionPane.showMessageDialog(null, "Limpeza Realizada com sucesso.");
				
				
			}
		});
		btnLimpar.setBounds(296, 389, 85, 23);
		taAluno.add(btnLimpar);

	}
}
