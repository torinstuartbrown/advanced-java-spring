package platform.codingnomads.co.springweb.returningdatatoclient.responsebody.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import platform.codingnomads.co.springtest.usingmockmvc.MockMvcMain;
import platform.codingnomads.co.springweb.returningdatatoclient.responsebody.ResponseBodyMain;
import platform.codingnomads.co.springweb.returningdatatoclient.responsebody.model.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest(classes = ResponseBodyMain.class)
//indicate that Spring should autoconfigure the MockMvc object
@AutoConfigureMockMvc


class UserControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void user() throws Exception {
//        User u = new User(1000, "Spring Dev", "dev@codingnomads.co");
        this.mockMvc.perform(get("/response-entity"))
                .andDo(print())
                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("id").value(1000));


    }
}