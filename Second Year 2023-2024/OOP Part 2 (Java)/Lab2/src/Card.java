public class Card {
    long id;
    String iban;
    int cvv;
    String type;

    private Card(CardBuilder cardBuilder){
        this.id = id;
        this.iban = iban;
        this.cvv = cvv;
        this.type = type;
    }


    public static class CardBuilder{
        long id;
        String iban;
        int cvv;
        String type;

        public CardBuilder withId(long id){
            this.id = id;
            return this;
        }

        public CardBuilder withIban(String iban){
            this.iban = iban;
            return this;
        }

        public CardBuilder withCvv(int cvv){
            this.cvv = cvv;
            return this;
        }

        public CardBuilder withId(String type){
            this.type = type;
            return this;
        }

        public Card Builder()
        {
            return new Card(this);
        }

    }
}
