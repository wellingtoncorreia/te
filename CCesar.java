package CifradeCesar;
import java.util.ArrayList;
import java.util.Arrays;
public class CCesar {

	public static void main(String[] args) {
		ArrayList <String> cifra = new ArrayList<String>();
		int letra = 0;
		String[] alfabeto= {"A","B","C","D","E","F","G",
							"H","I","J","K","L","M","N",
							"O","P","Q","R","S","T","U",
							"V","W","X","Y","Z"};
		ArrayList <String> alpha = new ArrayList<String>(Arrays.asList(alfabeto));
		
		cifra.add("W");
		cifra.add("E");
		cifra.add("L");
		cifra.add("L");
		cifra.add("I");
		cifra.add("N");
		cifra.add("G");
		cifra.add("T");
		cifra.add("O");
		cifra.add("N");
		
		for(int j=0; j<cifra.size();j++) {
			for(int i=0; i<alpha.size();i++) {
				
				if (cifra.get(j).equals(alpha.get(i))) {
					if(alpha.get(i).equals("Z")) {
						i=0;
						letra= i+2;
						j++;
					System.out.print(alpha.get(letra));
					}
					else {
						letra= i+3;
						System.out.print(alpha.get(letra));
					}
				}
			}
		}	
	}
}

