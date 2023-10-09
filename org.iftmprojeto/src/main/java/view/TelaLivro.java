package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLivro extends JInternalFrame {
	private JTextField liisbn;
	private JTextField lititulo;
	private JTextField liedicao;
	private JTextField lieditora;
	private JTextField liidioma;
	private JTextField livolume;
	private JTextField liano;
	private JTextField liid;

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
		btnAlterar.setBounds(205, 378, 89, 23);
		panel.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(300, 378, 89, 23);
		panel.add(btnExcluir);

		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(399, 378, 89, 23);
		panel.add(btnSair);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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

}
