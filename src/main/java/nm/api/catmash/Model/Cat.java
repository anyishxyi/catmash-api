package nm.api.catmash.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cat")
public class Cat {
	@Id
	private String id;
	private Integer vote;
	private String imageData;

	public Cat() {
	}

	public Cat(Integer vote, String imageData) {
		this.vote = vote;
		this.imageData = imageData;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public void setImageData(String ImageData) {
		this.imageData = imageData;
	}
}
