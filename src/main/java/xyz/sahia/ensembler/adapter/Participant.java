package xyz.sahia.ensembler.adapter;

public record Participant(String fullName,
                          String gitHubUsername,
                          String email,
                          String discordUsername,
                          boolean newToMobbing
                          ) {
}
