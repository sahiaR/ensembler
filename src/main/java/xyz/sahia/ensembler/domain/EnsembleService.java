package xyz.sahia.ensembler.domain;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

public class EnsembleService {
    private final EnsembleRepository ensembleRepository;

    public EnsembleService(EnsembleRepository ensembleRepository) {
        this.ensembleRepository = ensembleRepository;
    }
    public void scheduleEnsemble(String name, ZonedDateTime zonedDateTime){
        Ensemble ensemble = new Ensemble(name, zonedDateTime);
        ensembleRepository.save(ensemble);
    }
    public List<Ensemble> allEnsembles(){
        return ensembleRepository.findAll();
    }

    public Optional<Ensemble> findById(EnsembleId ensembleId){
        return ensembleRepository.findById(ensembleId);
    }
}
