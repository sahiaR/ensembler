package xyz.sahia.ensembler.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class InMemoryEnsembleRepository implements EnsembleRepository{
    private final Map<EnsembleId, Ensemble> ensembles = new HashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    public Ensemble save(Ensemble ensemble) {
       if (ensemble.getId()== null){
           ensemble.setId(EnsembleId.of(sequence.getAndIncrement()));
       }
        ensembles.put(ensemble.getId(),ensemble);
        return ensemble;
    }
    @Override
    public List<Ensemble> findAll() {
        return List.copyOf(ensembles.values());
    }

    @Override
    public Optional<Ensemble> findById(EnsembleId ensembleId) {
        return Optional.ofNullable(ensembles.get(ensembleId));
    }
}
