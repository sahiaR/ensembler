package xyz.sahia.ensembler;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import static org.assertj.core.api.Assertions.assertThat;

class DashBoardControllerTest {
    @Test
    public void soitUnRegroupementEtAjoutToModel (){
        var dashBoardController = new DashBoardController();
        Model model = new ConcurrentModel();
        dashBoardController.dashboardView(model);

        assertThat(model.containsAttribute("regroupements"))
                .isTrue();
    }
}