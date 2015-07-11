public class Card{
	public enum Suite{
		DIAMOND, CLUB, SPADE, HEART
	}

	public Card(int value, Suite suite){
		this.suite = suite;
		this.value = value;
	}
	Suite suite;
	int value;
}