import java.util.Scanner;

public class Program {
	public static String unspare(String myStr) {
		String newSt;
		String[] words = myStr.split(" ");
		String mesudarAll="";
		char c;
		for (int i = 0; i < words.length; i++) {
			newSt = "";
			if (mesudarAll != "") {
				mesudarAll = mesudarAll + " ";
			}
			for (int j = 0; j < words[i].length(); j++) {
				c = words[i].charAt(j);
				if ((int) newSt.indexOf(c) == -1) {
					newSt = newSt + c;
				}
			}
			mesudarAll = mesudarAll + newSt;
		}
		return mesudarAll;
	}
	/*
	 * public static String reverse(String myStr) { if (myStr == "") return "";
	 * String s = ""; String[] temp = myStr.split(" "); String[] best = new
	 * String[temp.length]; int counter = 0; for (int i = 0; i < temp.length; i++)
	 * if (!(temp[i].equals(""))) best[counter++] = temp[i];
	 * 
	 * for (int i = counter-1; i >= 0; i--) { s += best[i]; if (i + 1 < counter) s
	 * += " "; }
	 * 
	 * return s; }
	 */

	public static String reverse(String myStr) {
		if (myStr == "")
			return "";

		StringBuffer s = new StringBuffer();
		String[] t = myStr.split(" ");

		for (int i = 0; i < t.length; i++) {
			if (t[i].equals("") || t[i].equals(" "))
				continue;

			s.append(t[t.length-1-i] + " ");

		}

		return s.toString();
	}

	public static void main(String[] args) {
		System.out.println("The Start");
		Scanner scr = new Scanner(System.in);
		String st1 = scr.nextLine();		
		while (!(st1.equals(""))) {
			System.out.println(unspare(st1));
			System.out.println(reverse(st1));
			st1 = scr.nextLine();
		}
		System.out.println("The End");
		scr.close();
	}

}
