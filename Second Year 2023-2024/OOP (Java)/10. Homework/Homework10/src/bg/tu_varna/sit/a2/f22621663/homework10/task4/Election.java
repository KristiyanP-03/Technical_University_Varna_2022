package bg.tu_varna.sit.a2.f22621663.homework10.task4;

import java.util.*;

class Election {
    private String dateOfElection;
    private Map<Candidacy, Integer> results;

    public Election(String dateOfElection) {
        this.dateOfElection = dateOfElection;
        this.results = new HashMap<>();
    }

    public void addResult(Candidacy candidacy, int votes) {
        results.put(candidacy, votes);
    }

    public void printOrderedByCandidacyId() {
        List<Candidacy> sortedCandidacies = new ArrayList<>(results.keySet());
        sortedCandidacies.sort(Comparator.naturalOrder());
        sortedCandidacies.forEach(candidacy ->
                System.out.println(String.format("%s - Votes: %d", candidacy.toString(), results.get(candidacy))));
    }

    public void printOrderedByVotes() {
        List<Map.Entry<Candidacy, Integer>> sortedResults = new ArrayList<>(results.entrySet());
        sortedResults.sort(Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(sortedResults);
        sortedResults.forEach(entry ->
                System.out.println(String.format("%s - Votes: %d", entry.getKey().toString(), entry.getValue())));
    }

    public int getVotesByPerson(Person person) {
        int totalVotes = 0;
        for (Map.Entry<Candidacy, Integer> entry : results.entrySet()) {
            Candidacy candidacy = entry.getKey();
            if (candidacy.getCandidatePresident().equals(person) || candidacy.getCandidateVicePresident().equals(person)) {
                totalVotes += entry.getValue();
            }
        }
        return totalVotes;
    }

    public void getUnsupportedCandidacies() {
        Set<Candidacy> unsupportedCandidacies = new HashSet<>(results.keySet());
        unsupportedCandidacies.removeAll(results.keySet());

        if (unsupportedCandidacies.isEmpty()) {
            System.out.println("All candidacies are supported by a party.");
        } else {
            System.out.println("Unsupported candidacies:");
            unsupportedCandidacies.forEach(candidacy -> System.out.println(candidacy.toString()));
        }
    }

    public void calculateElectionResults() {
        int totalVotes = results.values().stream().mapToInt(Integer::intValue).sum();
        Map.Entry<Candidacy, Integer> winnerEntry = results.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .orElse(null);

        if (winnerEntry != null) {
            double winnerPercentage = (double) winnerEntry.getValue() / totalVotes * 100;

            if (winnerPercentage > 50) {
                System.out.println("The " + winnerEntry.getKey().toString() + " are the choice of the nation.");
            } else {
                System.out.println("Moving to the second round of elections.");
            }
        }
    }
}
