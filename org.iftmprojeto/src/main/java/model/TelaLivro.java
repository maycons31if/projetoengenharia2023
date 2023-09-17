package model;

import java.io.Serializable;

import javax.persistence.Entity;


/**
 * 
 * @author bruno
 *	O nome da classe não esta correta, deveria ser Livro
 */
@Entity 
public class TelaLivro  implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private Integer isbn;
	private String  titulo;
	private Integer edicao;
	private String  editora;
	private String  idioma;
	private Integer volume;
	private Integer ano;
	
	
	
	public TelaLivro(Integer isbn, String titulo, Integer edicao, String editora, String idioma, Integer volume,
			Integer ano) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicao = edicao;
		this.editora = editora;
		this.idioma = idioma;
		this.volume = volume;
		this.ano = ano;
	}



	public Integer getIsbn() {
		return isbn;
	}



	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public Integer getEdicao() {
		return edicao;
	}



	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}



	public String getEditora() {
		return editora;
	}



	public void setEditora(String editora) {
		this.editora = editora;
	}



	public String getIdioma() {
		return idioma;
	}



	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}



	public Integer getVolume() {
		return volume;
	}



	public void setVolume(Integer volume) {
		this.volume = volume;
	}



	public Integer getAno() {
		return ano;
	}



	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
	

	



	
	
	
}
