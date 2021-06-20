package nm.api.catmash.Model;

import org.springframework.data.annotation.Id;

public class DatabaseSequence {
	@Id
	private String id;
	private long seq;

	public DatabaseSequence() {
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public long getSeq() {
		return this.seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}
}
