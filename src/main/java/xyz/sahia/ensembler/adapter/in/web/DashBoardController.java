package xyz.sahia.ensembler.adapter.in.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.sahia.ensembler.domain.Ensemble;
import xyz.sahia.ensembler.domain.EnsembleService;

import java.time.ZonedDateTime;
import java.util.List;

@Controller
public class DashBoardController {
    private final EnsembleService ensembleService;
    @Autowired
    public DashBoardController(EnsembleService ensembleService) {
        this.ensembleService = ensembleService;
    }
    @GetMapping("/dashboard")
    public String dashboardView(Model model){
        List<Ensemble> ensembles= ensembleService.allEnsembles();
        List<EnsembleSummaryView> ensembleSummaryViews= EnsembleSummaryView.from(ensembles);
        model.addAttribute("ensembles", ensembleSummaryViews);
        model.addAttribute("scheduleEnsembleForm", new ScheduleEnsembleForm());
        return ("dashboard");
    }

    @GetMapping("/ensemble")
    public String ensembleDetaiView(Model model){
        EnsembleDetailView ensembleDetailView = new EnsembleDetailView("Nom",
                "04/10/2023 11am ","90 minutes", "Project LOOM", 5);
        model.addAttribute("ensemble",ensembleDetailView);
        return ("ensemble-detail");
    }
    @PostMapping ("/schedule")
    public String scheduleEnsemble(ScheduleEnsembleForm scheduleEnsembleForm){
        ZonedDateTime dateTime = ZonedDateTime.now();
        ensembleService.scheduleEnsemble(scheduleEnsembleForm.getName(), dateTime);
        return ("redirect:/dashboard");
    }
}
