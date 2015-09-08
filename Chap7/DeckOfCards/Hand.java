public abstract class Hand {
	List<T extends Card> cards = new ArrayList();

	public int getScore{
		int score = 0;
		for(Card card : cards){
			score+=card.value;
		}
		return score;
	}
}