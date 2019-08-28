package muntrain.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name = "response")

public class Response implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idresponse")
	private int idresponse;

	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "value")
	private boolean value;
	
	@Column(name = "order")
	private int order;
	
	@ManyToOne
	@JoinColumn (name = "idquestion")
	private Question question;

	
	public Response() {
		
	}
	public Response(int idresponse, String description, String image, boolean value, int order, Question question) {
		super();
		this.idresponse = idresponse;
		this.description = description;
		this.image = image;
		this.value = value;
		this.order = order;
		this.question = question;
	}
}

