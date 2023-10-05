package xyz.sahia.ensembler.domain;

import java.util.List;
import java.util.Optional;

public interface EnsembleRepository {
    Ensemble save(Ensemble ensemble);
    List<Ensemble> findAll();

    Optional<Ensemble> findById(EnsembleId ensembleId);
}
