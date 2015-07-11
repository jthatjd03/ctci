public class Deck{
	List<Card> cards;
	int dealIndex = 0;

	public Deck(){
		cards = new ArrayList<Card>;
		for(int i =1;i<=13;i++){
			for(Suite suite:Cards.Suite.values()){
				cards.add(new Card(i, suite));
			}			
		}
	}

	public void shuffle(){
		Collections.shuffle(cards);
	}

	public Card dealCard(){
		cards.get(dealIndex);
		dealIndex++
	}
}