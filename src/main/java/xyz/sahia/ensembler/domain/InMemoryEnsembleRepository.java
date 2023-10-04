package xyz.sahia.ensembler.domain;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEnsembleRepository implements EnsembleRepository{
    private final List<Ensemble> ensembles = new ArrayList<>();

    @Override
    public Ensemble save(Ensemble ensemble) {
        ensembles.add(ensemble);
        return ensemble;
    }

    @Override
    public List<Ensemble> findAll() {
        return List.copyOf(ensembles);
    }
}
