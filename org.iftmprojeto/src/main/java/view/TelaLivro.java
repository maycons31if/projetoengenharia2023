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

	private static final long serialVersionUID = 1L;
	private Livro objeto;
	private LivroControle controle = new LivroControle();
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
		setBounds(100, 100, 509, 442);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 488, 412);
		getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("Cadastro de Livros");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 22, 139, 14);
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
		lititulo.setBounds(129, 72, 359, 20);
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
		btnSalvar.setBounds(106, 378, 89, 23);
		panel.add(btnSalvar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (objeto != null) {

					objeto.setIsbn(liisbn.getText());
					objeto.setTitulo(lititulo.getText());
					objeto.setEdicao(liedicao.getText());
					objeto.setEditora(lieditora.getText());
					objeto.setIdioma(liidioma.getText());
					objeto.setVolume(livolume.getText());
					objeto.setAno(liano.getText());

					controle.alterar(objeto);

					JOptionPane.showMessageDialog(null, "Livro alterado com sucesso.");

				} else {

					JOptionPane.showMessageDialog(null, "Não há Livro a ser alterado.");

				}

			}
		});
		btnAlterar.setBounds(205, 378, 89, 23);
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
		btnExcluir.setBounds(300, 378, 89, 23);
		panel.add(btnExcluir);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Integer valor = Integer.parseInt(liid.getText());
				objeto = controle.buscarPorId(valor);
				if (objeto != null) {

					liid.getText.setText(String.valueOf(objeto.getId()));
					liisbn.setText(objeto.getNome());
					lititulo.setText(objeto.getNome());
					liedicao.setText(objeto.getNome());
					lieditora.setText(objeto.getNome());
					liidioma.setText(objeto.getNome());
					livolume.setText(objeto.getNome());
					liano.setText(objeto.getNome());

					liid.setText(objeto.getId());

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
		btnConsultar.setBounds(399, 378, 89, 23);
		panel.add(btnConsultar);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				objeto = new Livro(null, liisbn.getText(), lititulo.getText(), liedicao.getText(), lieditora.getText(),
						liidioma.getText(), livolume.getText(), liano.getText());
				controle.inserir(objeto);
				JOptionPane.showMessageDialog(null, "Livro Cadastrado.");
				liid.setText(String.valueOf(objeto.getId()));
				/*
				 * 
				 * Livro v = new Livro( null, "9788533302273", "Programacao Java", "2", "IFTM",
				 * "portugues", "1", "2023");
				 * 
				 * 
				 * 
				 * private JTextField liid; private JTextField liisbn; private JTextField
				 * lititulo; private JTextField liedicao; private JTextField lieditora; private
				 * JTextField liidioma; private JTextField livolume; private JTextField liano;
				 * 
				 * 
				 */
			}
		});
		btnInserir.setBounds(7, 378, 89, 23);
		panel.add(btnInserir);

		JPanel lifoto = new JPanel();
		lifoto.setLayout(null);
		lifoto.setBounds(248, 184, 228, 183);
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
		liid.setBounds(378, 22, 98, 20);
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
