package xyz.sahia.ensembler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {
    @GetMapping("/dashboard")
    public String dashboardView(Model model){
        return "dashboard" ;
    }
}