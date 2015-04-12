import java.util.Scanner;


public class BrokenPedometer {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int nCase = Integer.parseInt(read.nextLine());
		for(int i =0; i < nCase; i++){
			int led = Integer.parseInt(read.nextLine());
			int seg = Integer.parseInt(read.nextLine());
			String[][] segment = new String[seg][led];
			for(int ii = 0; ii < seg; ii++){
				segment[0] = read.nextLine().split(" ");
			}
		}
	}
}
