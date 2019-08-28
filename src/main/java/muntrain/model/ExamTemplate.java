package muntrain.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "examtemplate")

public class ExamTemplate implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idexamtemplate")
	private int idexamtemplate;

	@Column(name = "description")
	private String description;
	
	@Column(name = "ispublished")
	private boolean ispublished;
	
	@OneToMany (mappedBy = "examtemplate")
	private List <Question> question; 
	
	
	public ExamTemplate() {
		
	}
	
	public ExamTemplate(int idexamtemplate, String description, boolean ispublished, List<Question> question) {
		super();
		this.idexamtemplate = idexamtemplate;
		this.description = description;
		this.ispublished = ispublished;
		this.question = question;
	}
	

	public int getIdexamtemplate() {
		return idexamtemplate;
	}
	public void setIdexamtemplate(int idexamtemplate) {
		this.idexamtemplate = idexamtemplate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isIspublished() {
		return ispublished;
	}
	public void setIspublished(boolean ispublished) {
		this.ispublished = ispublished;
	}
	public List<Question> getQuestion() {
		return question;
	}
	public void setQuestion(List<Question> question) {
		this.question = question;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
