package xyz.sahia.ensembler;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import xyz.sahia.ensembler.adapter.DashBoardController;
import xyz.sahia.ensembler.adapter.EnsembleSummaryView;
import xyz.sahia.ensembler.domain.Ensemble;
import xyz.sahia.ensembler.domain.EnsembleService;
import xyz.sahia.ensembler.domain.InMemoryEnsembleRepository;

import java.time.ZonedDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DashBoardControllerTest {
    @Test
    void unEnsembleDonneDevraitEtreDansEnsembleViewModel(){
        var ensemble = new Ensemble("name", ZonedDateTime.now());
        var ensembleRepository = new InMemoryEnsembleRepository();
        var ensembleService = new EnsembleService(ensembleRepository);
        ensembleRepository.save(ensemble);

        var dashBoardController = new DashBoardController(ensembleService);
        Model model = new ConcurrentModel();
        dashBoardController.dashboardView(model);
        List<EnsembleSummaryView> ensembleSummaryViews = (List<EnsembleSummaryView>)
                                                            model.getAttribute("ensembles");

        assertThat(ensembleSummaryViews).hasSize(1);
    }
}