package bg.tu_varna.sit.a2.f22621663.homework10.task4;

class Candidacy implements Comparable<Candidacy> {
    private int candidacyId;
    private Person candidatePresident;
    private Person candidateVicePresident;
    private Party party;

    public Candidacy(int candidacyId, Person candidatePresident, Person candidateVicePresident, Party party) {
        this.candidacyId = candidacyId;
        this.candidatePresident = candidatePresident;
        this.candidateVicePresident = candidateVicePresident;
        this.party = party;
    }

    public int getCandidacyId() {
        return candidacyId;
    }

    public Person getCandidatePresident() {
        return candidatePresident;
    }

    public Person getCandidateVicePresident() {
        return candidateVicePresident;
    }

    public Party getParty() {
        return party;
    }

    @Override
    public int compareTo(Candidacy o) {
        return Integer.compare(this.candidacyId, o.candidacyId);
    }

    @Override
    public String toString() {
        return String.format("Candidacy %d: President=%s, Vice President=%s, Party=%s",
                candidacyId, candidatePresident, candidateVicePresident, party);
    }
}
