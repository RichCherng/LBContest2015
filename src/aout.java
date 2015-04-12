import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class aout {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<waiter> wait = new ArrayList<waiter>();
		ArrayList<nonWaiter> nwait = new ArrayList<nonWaiter>();
		double bonus = Double.parseDouble(reader.nextLine());
		while (reader.hasNext()) {
			String[] person = reader.nextLine().split("\\s+");
			if (person.length == 3) {
				nwait.add(new nonWaiter(person[0], person[1], Double
						.parseDouble(person[2])));
			} else
				wait.add(new waiter(person[0], person[1], Double
						.parseDouble(person[2]), Double.parseDouble(person[3])));
		}
		double fwait = bonus * 0.25;
		double fnwait = bonus * 0.75;
		//System.out.println(fnwait);
		double totalnWait = 0;
		double totalwait = 0;
		for (nonWaiter i : nwait) {
			totalnWait += i.mwage;
		}
		for (waiter i : wait) {
			totalnWait += i.mwage;
			totalwait += i.mtip;
		}

		for (nonWaiter i : nwait) {
			i.total = fnwait * (i.mwage / totalnWait);
			// System.out.println(i.mwage);
			// System.out.println(totalnWait);
			// System.out.println((i.mwage/totalnWait));
			//System.out.println(i);
		}

		for (waiter i : wait) {
			i.total += fnwait * (i.mwage / totalnWait);
		}

		for (waiter i : wait) {
			i.total += fwait * (i.mtip / totalwait);
			//System.out.println(i);
		}
		
		ArrayList<String> person = new ArrayList<String>();
		String[] Person = new String[wait.size()+nwait.size()];
		int count = 0;
		for (waiter i : wait) {
			//person.add(i.toString());
			Person[count] = i.toString();
			count++;
		}
		for (nonWaiter i : nwait) {
			Person[count] = i.toString();
			count++;
		}
		
		Arrays.sort(Person);
		for(String i:Person){
			System.out.println(i);
		}

	}


static class waiter {
	String mfirst, mlast;
	double mwage, mtip, total;

	public waiter(String last, String first, double wage, double tip) {
		mfirst = first;
		mlast = last;
		mwage = wage;
		mtip = tip;
		total = 0;
	}

	public String round() {
		double temp;
		temp = total * 100.0;
		temp = (double) Math.round((float) temp);
		temp /= 100;
		String string = String.valueOf(temp);
		int index = string.indexOf(".");
		if(index < 0){
			return string + ".00";
		}
		
		if(string.length() - index == 2){
			return string + "0";
		}
		else
			return string;
	}

	public String toString() {
		return mlast + "\t" + mfirst + "\t" + round();
	}
}

static class nonWaiter {
	String mfirst, mlast;
	double mwage, total;

	public nonWaiter(String last, String first, double wage) {
		mlast = last;
		mfirst = first;
		mwage = wage;
		total = 0;
	}
	/*
	public String round() {
		double temp;
		temp = total * 100.0;
		temp = (double) Math.round((float) temp);
		temp /= 100;
		String string = String.valueOf(temp);
		String[] arr = string.split(".");
		if (arr.length == 0)
			string += ".00";
		else {
			if(arr[1].length() == 1)
				string += "0";
		}
		return string;
	}
	*/
	
	public String round(){
		double temp;
		temp = total * 100.0;
		temp = (double) Math.round((float) temp);
		temp /= 100;
		String string = String.valueOf(temp);
		int index = string.indexOf(".");
		if(index < 0){
			return string + ".00";
		}
		
		if(string.length() - index == 2){
			return string + "0";
		}
		else
			return string;
	}
	public String toString() {
		return mlast + "\t" + mfirst + "\t" + round();
	}
}
}
