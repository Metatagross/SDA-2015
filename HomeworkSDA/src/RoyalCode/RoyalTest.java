package RoyalCode;

public class RoyalTest {

	public static void main(String[] args) {
		FrontBookKeeper61858 test = new FrontBookKeeper61858();
		String[] news = new String[] { 
				"regiment_Stoykov = [1, 2, 3]",
				"show regiment_Stoykov",
				"regiment_Chaushev = [13]", 
				"show soldier 13", 
				"division_Dimitroff = []",
				"regiment_Stoykov attached to division_Dimitroff", 
				"regiment_Chaushev attached to division_Dimitroff",
				"show division_Dimitroff",
				"show soldier 13", 
				"brigade_Ignatov = []",
				"regiment_Stoykov attached to brigade_Ignatov",
				"regiment_Chaushev attached to brigade_Ignatov after soldier 3",
				"show brigade_Ignatov",
				"show division_Dimitroff", 
				"brigade_Ignatov attached to division_Dimitroff",
				"show division_Dimitroff",
				"soldiers 2..3 from division_Dimitroff died heroically",
				"show regiment_Stoykov",
				"show brigade_Ignatov", 
				"show division_Dimitroff" };
		System.out.println(test.updateFront(news));
	}

}
/*
 * Example test soldiers = [1,5,8,9] officers = [7,8,9,51] soldiers attached to
 * officers
 */