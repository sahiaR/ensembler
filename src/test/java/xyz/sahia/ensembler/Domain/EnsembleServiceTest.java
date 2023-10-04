package xyz.sahia.ensembler.Domain;

import org.junit.jupiter.api.Test;
import xyz.sahia.ensembler.domain.EnsembleService;
import xyz.sahia.ensembler.domain.InMemoryEnsembleRepository;

import java.time.ZonedDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class EnsembleServiceTest {
    @Test
    public  void unSeulScheduleEnsembleEstRetournePourAllEnsembles(){
       var ensembleService = new EnsembleService(new InMemoryEnsembleRepository());

       ensembleService.scheduleEnsemble("Nom", ZonedDateTime.now());
       assertThat(ensembleService.allEnsembles()).hasSize(1);
    }
}