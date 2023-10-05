package xyz.sahia.ensembler.domain;

public record EnsembleId(long id) {
    public static EnsembleId of (long id){
        return new EnsembleId(id);
    }
}
