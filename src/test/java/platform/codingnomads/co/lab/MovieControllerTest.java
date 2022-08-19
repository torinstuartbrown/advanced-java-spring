package platform.codingnomads.co.lab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import platform.codingnomads.co.springtest.lab.SpringTestLab;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest(classes = SpringTestLab.class)
@AutoConfigureMockMvc
public class MovieControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllMoviesSuccess() throws Exception {
        mockMvc.perform(get("/all/"))
                .andExpect(status().isOk());
//        MvcResult result = mockMvc.perform(get("/all/"))
//                .andReturn();
//        String content = result.getResponse().getContentAsString();
//        System.out.println(content + " findme");


    }

    @Test
    public void testGetAllMoviesFailure() {

    }

    @Test
    public void testGetAllMoviesSuccessMockService() {

    }
}
