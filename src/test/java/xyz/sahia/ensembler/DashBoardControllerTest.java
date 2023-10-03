package xyz.sahia.ensembler;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class DashBoardControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void getDashboardEndpointReturn200ok() throws Exception {
        mockMvc.perform(get("/dashboard"))
        .andExpect(status().isOk());
    }
}