import java.util.Scanner;

class aout {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int read = Integer.parseInt(reader.nextLine());
		while(reader.hasNext()){
			read = Integer.parseInt(reader.nextLine());
			System.out.print(read + ":");
			
			for(int i = 2; i <= read; i++){
				while(read % i == 0){
					System.out.print(" "+i);
					read /= i;
				}
			}
			System.out.println();
		}
	}
}
