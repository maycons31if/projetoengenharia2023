package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import control.LivroControle;
import model.Livro;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLivro extends JInternalFrame {
	
	private Livro objeto;
	private LivroControle controle = getControle();
		
	
	
	private static final long serialVersionUID = 1L;
	//private Livro objeto;
	//private LivroControle controle = new LivroControle();
	private JTextField liid;
	private JTextField liisbn;
	private JTextField lititulo;
	private JTextField liedicao;
	private JTextField lieditora;
	private JTextField liidioma;
	private JTextField livolume;
	private JTextField liano;

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
		setTitle("Cadastro de Livros");
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(200, 200, 585, 480);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 569, 450);
		getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 139, 14);
		panel.add(lblNewLabel);

		JLabel lblliIsbn = new JLabel("ISBN:");
		lblliIsbn.setBounds(10, 53, 46, 14);
		panel.add(lblliIsbn);

		liisbn = new JTextField();
		liisbn.setColumns(13);
		liisbn.setBounds(10, 72, 109, 20);
		panel.add(liisbn);

		JLabel lbliTitulo = new JLabel("Titulo:");
		lbliTitulo.setBounds(129, 53, 46, 14);
		panel.add(lbliTitulo);

		lititulo = new JTextField();
		lititulo.setColumns(13);
		lititulo.setBounds(129, 72, 399, 20);
		panel.add(lititulo);

		JLabel lblliEdicao = new JLabel("Edição:");
		lblliEdicao.setBounds(10, 103, 46, 14);
		panel.add(lblliEdicao);

		liedicao = new JTextField();
		liedicao.setColumns(13);
		liedicao.setBounds(10, 128, 109, 20);
		panel.add(liedicao);

		JLabel lblliEditora = new JLabel("Editora:");
		lblliEditora.setBounds(129, 103, 46, 14);
		panel.add(lblliEditora);

		lieditora = new JTextField();
		lieditora.setColumns(13);
		lieditora.setBounds(129, 128, 109, 20);
		panel.add(lieditora);

		JLabel lblIiIdioma = new JLabel("Idioma:");
		lblIiIdioma.setBounds(248, 103, 46, 14);
		panel.add(lblIiIdioma);

		liidioma = new JTextField();
		liidioma.setColumns(13);
		liidioma.setBounds(248, 128, 109, 20);
		panel.add(liidioma);

		JLabel lblliVolume = new JLabel("Volume:");
		lblliVolume.setBounds(367, 103, 46, 14);
		panel.add(lblliVolume);

		livolume = new JTextField();
		livolume.setColumns(13);
		livolume.setBounds(367, 128, 109, 20);
		panel.add(livolume);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(126, 416, 89, 23);
		panel.add(btnSalvar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (objeto != null) {

					objeto.setIsbn(Integer.parseInt(liisbn.getText()));
					objeto.setTitulo(lititulo.getText());
					objeto.setEdicao(Integer.parseInt(liedicao.getText()));
					objeto.setEditora(lieditora.getText());
					objeto.setIdioma(liidioma.getText());
					objeto.setVolume(Integer.parseInt(livolume.getText()));
					objeto.setAno(Integer.parseInt(liano.getText()));

					controle.alterar(objeto);

					JOptionPane.showMessageDialog(null, "Livro alterado com sucesso.");

				} else {

					JOptionPane.showMessageDialog(null, "Não há Livro a ser alterado.");

				}

			}
		});
		btnAlterar.setBounds(239, 416, 89, 23);
		panel.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (objeto != null) {

					controle.excluir(objeto);

					objeto = null;

					/*
					 * private JTextField liid; private JTextField liisbn; private JTextField
					 * lititulo; private JTextField liedicao; private JTextField lieditora; private
					 * JTextField liidioma; private JTextField livolume; private JTextField liano;
					 */

					liid.setText("");
					liisbn.setText("");
					lititulo.setText("");
					liedicao.setText("");
					lieditora.setText("");
					liidioma.setText("");
					livolume.setText("");
					liano.setText("");

					JOptionPane.showMessageDialog(null, "Livro excluído com sucesso.");

				} else {

					JOptionPane.showMessageDialog(null, "Não há Livro a ser excluído.");

				}

			}
		});
		btnExcluir.setBounds(354, 416, 89, 23);
		panel.add(btnExcluir);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Integer valor = Integer.parseInt(liid.getText());
				objeto = controle.buscarPorId(valor);
				if (objeto != null) {

					liid.setText(String.valueOf(objeto.getId()));
					liisbn.setText(String.valueOf(objeto.getIsbn()));
					lititulo.setText(String.valueOf(objeto.getTitulo()));
					liedicao.setText(String.valueOf(objeto.getEdicao()));
					lieditora.setText(String.valueOf(objeto.getEditora()));
					liidioma.setText(String.valueOf(objeto.getIdioma()));
					livolume.setText(String.valueOf(objeto.getVolume()));
					liano.setText(String.valueOf(objeto.getAno()));

					

				} else {

					JOptionPane.showMessageDialog(null, "Não existe livro com este ID cadastrado");

					liid.setText("");

				}
				/*
				 * objeto = new Livro(null, liisbn.getText(), lititulo.getText(),
				 * liedicao.getText(), lieditora.getText(), liidioma.getText(),
				 * livolume.getText(), liano.getText());
				 */

			}
		});
		btnConsultar.setBounds(459, 416, 89, 23);
		panel.add(btnConsultar);
		
		
		

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				objeto = new Livro(null, liisbn.getText(), lititulo.getText(), liedicao.getText(), lieditora.getText(), liidioma.getText(), livolume.getText(), liano.getText());
				controle.inserir(objeto);
				JOptionPane.showMessageDialog(null, "Livro Cadastrado.");
				liid.setText(String.valueOf(objeto.getId()));
				
						}
		});
		
		
		
		btnInserir.setBounds(10, 416, 89, 23);
		panel.add(btnInserir);

		JPanel lifoto = new JPanel();
		lifoto.setLayout(null);
		lifoto.setBounds(300, 184, 228, 183);
		panel.add(lifoto);

		liano = new JTextField();
		liano.setColumns(13);
		liano.setBounds(10, 184, 109, 20);
		panel.add(liano);

		JLabel lblliAno = new JLabel("Ano:");
		lblliAno.setBounds(10, 159, 46, 14);
		panel.add(lblliAno);

		liid = new JTextField();
		liid.setEditable(false);
		liid.setColumns(13);
		liid.setBounds(378, 22, 150, 20);
		panel.add(liid);

		JLabel lblliId = new JLabel("ID:");
		lblliId.setBounds(350, 25, 39, 14);
		panel.add(lblliId);

	}

	public Livro getObjeto() {
		return objeto;
	}

	public void setObjeto(Livro objeto) {
		this.objeto = objeto;
	}

	public LivroControle getControle() {
		return controle;
	}

	public void setControle(LivroControle controle) {
		this.controle = controle;
	}

	public JTextField getLiisbn() {
		return liisbn;
	}

	public void setLiisbn(JTextField liisbn) {
		this.liisbn = liisbn;
	}

	public JTextField getLititulo() {
		return lititulo;
	}

	public void setLititulo(JTextField lititulo) {
		this.lititulo = lititulo;
	}

	public JTextField getLiedicao() {
		return liedicao;
	}

	public void setLiedicao(JTextField liedicao) {
		this.liedicao = liedicao;
	}

	public JTextField getLieditora() {
		return lieditora;
	}

	public void setLieditora(JTextField lieditora) {
		this.lieditora = lieditora;
	}

	public JTextField getLiidioma() {
		return liidioma;
	}

	public void setLiidioma(JTextField liidioma) {
		this.liidioma = liidioma;
	}

	public JTextField getLivolume() {
		return livolume;
	}

	public void setLivolume(JTextField livolume) {
		this.livolume = livolume;
	}

	public JTextField getLiano() {
		return liano;
	}

	public void setLiano(JTextField liano) {
		this.liano = liano;
	}

	public JTextField getLiid() {
		return liid;
	}

	public void setLiid(JTextField liid) {
		this.liid = liid;
	}
}
