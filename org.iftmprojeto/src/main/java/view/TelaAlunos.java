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
	public TelaAlunos() throws PropertyVetoException {
		setIconifiable(true);
		setMaximizable(true);
		setMaximum(true);
		setClosable(true);
		setTitle("Cadastro de Alunos");
		setBounds(100, 100, 624, 457);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 608, 431);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 128, 17);
		panel.add(lblNewLabel);
		
		JLabel lblalMatricula = new JLabel("Matricula:");
		lblalMatricula.setBounds(20, 45, 109, 14);
		panel.add(lblalMatricula);
		
		alSituacao = new JTextField();
		alSituacao.setToolTipText("");
		alSituacao.setBounds(409, 63, 172, 20);
		panel.add(alSituacao);
		
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
		alEndereco.setBounds(258, 120, 323, 20);
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
			}
		});
		btnSalvar.setBounds(139, 386, 85, 23);
		panel.add(btnSalvar);
		
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
		btnAlterar.setBounds(258, 386, 85, 23);
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
		btnExcluir.setBounds(388, 386, 85, 23);
		panel.add(btnExcluir);
		
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
		btnConsultar.setBounds(513, 386, 85, 23);
		panel.add(btnConsultar);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				

					objeto = new Aluno(null, Integer.parseInt(alMatricula.getText()), alNome.getText(), alSituacao.getText(), Integer.parseInt(alTelefone.getText()), Integer.parseInt(alCep.getText()), alEndereco.getText(), Integer.parseInt(alNascimento.getText()), alCurso.getText(), alTurno.getText());
					controle.inserir(objeto);
					JOptionPane.showMessageDialog(null, "Aluno Cadastrado.");
					alId.setText(String.valueOf(objeto.getId()));
					
								
			
			}
		});
		
		
		btnInserir.setBounds(10, 386, 85, 23);
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
		alFoto.setBounds(353, 151, 228, 183);
		panel.add(alFoto);
		
		JLabel lblalid = new JLabel("ID:");
		lblalid.setBounds(360, 14, 39, 14);
		panel.add(lblalid);
		
		alId = new JTextField();
		alId.setEditable(false);
		alId.setColumns(13);
		alId.setBounds(388, 11, 193, 20);
		panel.add(alId);

	}
}
