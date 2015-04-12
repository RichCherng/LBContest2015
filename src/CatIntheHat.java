import java.util.Scanner;


public class CatIntheHat {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		while(reader.hasNext()){
			String[] input = reader.nextLine().split("\\s+");
			int height = Integer.parseInt(input[0]);
			int smaller = Integer.parseInt(input[1]);
			int split = 2;
			int cat = 0;
			int temp = height;
			while(cat ){
				while(cat < smaller){
					cat *= split;
				}
			}
		}
	}
}
