package bg.tu_varna.sit.a2.f22621663.homework10.task4;

import java.util.*;

public class PresidentialElection {
    public static void main(String[] args) {
        // Sample usage of the classes
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Smith");
        Person person3 = new Person("Bob", "Johnson");

        Candidacy candidacy1 = new Candidacy(1, person1, person2, Party.AAA);
        Candidacy candidacy2 = new Candidacy(2, person2, person3, Party.BBB);
        Candidacy candidacy3 = new Candidacy(3, person3, person1, Party.CCC);

        Election election = new Election("2023-12-18");
        election.addResult(candidacy1, 5000);
        election.addResult(candidacy2, 7000);
        election.addResult(candidacy3, 6000);

        election.printOrderedByCandidacyId();
        election.printOrderedByVotes();

        System.out.println("Votes for " + person1 + ": " + election.getVotesByPerson(person1));
        System.out.println("Votes for " + person2 + ": " + election.getVotesByPerson(person2));
        System.out.println("Votes for " + person3 + ": " + election.getVotesByPerson(person3));

        election.getUnsupportedCandidacies();
        election.calculateElectionResults();
    }
}
