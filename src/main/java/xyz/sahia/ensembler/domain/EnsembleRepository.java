package xyz.sahia.ensembler.domain;

import java.util.List;

public interface EnsembleRepository {
    Ensemble save(Ensemble ensemble);
    List<Ensemble> findAll();
}
