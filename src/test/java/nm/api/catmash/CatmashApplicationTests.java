package nm.api.catmash;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import nm.api.catmash.Model.Cat;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
@WebAppConfiguration
class CatmashApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void shouldInsertCat() throws Exception {
		this.mockMvc.perform(post("/save").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(new Cat(0, "test")))).andExpect(status().isCreated());
	}

	@Test
	public void shouldGetAllCats() throws Exception {
		this.mockMvc.perform(get("/cats").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	@Test
	public void shouldUpdateCatInfo() throws Exception {
		this.mockMvc.perform(put("/update").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(new Cat(14, 2, "test21")))).andExpect(status().isOk());
	}

	@Test
	public void shouldRemoveCat() throws Exception {
		this.mockMvc.perform(delete("/remove").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(1))).andExpect(status().isAccepted());
	}

}
