package nm.api.catmash.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cat")
public class CatModel {
	@Id
	private String id;
	private Integer vote;
	private String imageData;

	public CatModel() {
	}

	public CatModel(Integer vote, String imageData) {
		this.vote = vote;
		this.imageData = imageData;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
