package muntrain.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name = "question")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idquestion")
	private int idquestion;

	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@ManyToOne
	@JoinColumn (name = "idexamtemplate")
	private ExamTemplate examtemplate;
	
	
	
	
	public Question () {
		
	}

	public Question(int idquestion, String description, String image) {
		super();
		this.idquestion = idquestion;
		this.description = description;
		this.image = image;
	}

	public int getIdquestion() {
		return idquestion;
	}

	public void setIdquestion(int idquestion) {
		this.idquestion = idquestion;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
