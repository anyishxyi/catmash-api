package nm.api.catmash.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cat")
public class Cat {
	@Transient
	public static final String SEQUENCE_NAME = "cats_sequence";
	@Id
	private long id;
	private Integer vote;
	private String imageData;

	public Cat() {
	}

	public Cat(Integer vote, String imageData) {
		this.vote = vote;
		this.imageData = imageData;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getVote() {
		return this.vote;
	}

	public void setVote(Integer vote) {
		this.vote = vote;
	}

	public String getImageData() {
		return this.imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
	}
}
