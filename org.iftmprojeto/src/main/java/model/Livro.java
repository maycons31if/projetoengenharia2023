package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * 
 * @Maycon
 *	O nome da classe n�o esta correta, deveria ser Livro
 */
@Entity 





public class Livro  implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	private Integer isbn;
	private String  titulo;
	private Integer edicao;
	private String  editora;
	private String  idioma;
	private Integer volume;
	private Integer ano;
	
	
	
	
	public Livro(Integer id, Integer isbn, String titulo, Integer edicao, String editora, String idioma,
			Integer volume, Integer ano) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicao = edicao;
		this.editora = editora;
		this.idioma = idioma;
		this.volume = volume;
		this.ano = ano;
	}




	public Integer getId() {
		return id;
	}




	public void setCod(Integer id) {
		this.id = id;
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




	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	public Livro() {	}	
	

	}
	
