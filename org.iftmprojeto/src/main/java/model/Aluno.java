package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 

/**
 * 
 * @Maycon
 *	O nome da classe n�o esta correta, deveria ser Aluno
 */
@Entity 
public class Aluno implements Serializable {

	
	/**
	 * 
	 */
		
	private static final long serialVersionUID = 1L;
	
	@Id  /*chave primaria*/
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	private Integer matricula;
	private String aluno;
	private String situacao;
	private Integer telefone;
	private Integer cep;
	private String endereco;
	@Column(name="dtnasc")
	private Integer dataNascimento;
	private String curso;
	private String turno;
	
	
	public Aluno(Integer id, Integer matricula, String aluno, String situacao, Integer telefone, Integer cep,
			String endereco, Integer dtnasc, String curso, String turno) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.aluno = aluno;
		this.situacao = situacao;
		this.telefone = telefone;
		this.cep = cep;
		this.endereco = endereco;
		this.dataNascimento = dtnasc;
		this.curso = curso;
		this.turno = turno;
	}
	
	
	public Aluno() {	}	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getMatricula() {
		return matricula;
	}


	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}


	public String getAluno() {
		return aluno;
	}


	public void setAluno(String aluno) {
		this.aluno = aluno;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	public Integer getTelefone() {
		return telefone;
	}


	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}


	public Integer getCep() {
		return cep;
	}


	public void setCep(Integer cep) {
		this.cep = cep;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public Integer getDtnasc() {
		return dataNascimento;
	}


	public void setDtnasc(Integer dtnasc) {
		this.dataNascimento = dtnasc;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public char[] getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
	