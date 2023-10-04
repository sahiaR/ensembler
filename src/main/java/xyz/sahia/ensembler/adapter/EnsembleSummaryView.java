package xyz.sahia.ensembler.adapter;

import xyz.sahia.ensembler.domain.Ensemble;

import java.util.List;

public record EnsembleSummaryView(String name,
                                String dateTime,
                                int numberRegistered) {

    public static List<EnsembleSummaryView> from (List<Ensemble>ensembles){
        return ensembles.stream()
                .map(EnsembleSummaryView::toView)
                .toList();
    }

    private static EnsembleSummaryView toView(Ensemble ensemble) {
        return new EnsembleSummaryView(ensemble.name(),
                ensemble.startDateTime().toString(),
                ensemble.numberRegistered());
    }
}
