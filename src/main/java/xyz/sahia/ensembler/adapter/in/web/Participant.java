package xyz.sahia.ensembler.adapter.in.web;

public record Participant(String fullName,
                          String gitHubUsername,
                          String email,
                          String discordUsername,
                          boolean newToMobbing
                          ) {
}
