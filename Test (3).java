import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
	// static HashMap<String, Integer> hmap = new HashMap();
	static String kelime;
	// static StringBuffer buff = new StringBuffer(5);
	static ArrayList<String> isimler = new ArrayList<>();
	static ArrayList<Integer> degerler = new ArrayList<>();
	static int isaretci = 0;

	public static void degis(String obje) {
		if (isimler.contains(obje)) {
			degerler.set(isimler.indexOf(obje), 1);
			if (isimler.get(isaretci).equals(obje))
				isArtýr();
		}
		else  {
			for (int i = 0; i < 6; i++) {
				if (degerler.get(isaretci) == 0) {
					isimler.set(isaretci, kelime);
					degerler.set(isaretci, 1);
					isArtýr();
					break;
				}
				else {
					degerler.set(isaretci, 0);
					isArtýr();
				}
			}
			for (int i = 0; i < isimler.size(); i++)
				System.out.print(isimler.get(i) + "=" + degerler.get(i) + " ");
				System.out.println("\nÝþaretçi: "+isaretci);
			
		}
	}

	public static void isArtýr() {

		isaretci = ++isaretci % 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			isimler.add("");
			degerler.add(0);
		}
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("\nÝsim gir: ");

			kelime = input.next();
			degis(kelime);
			System.out.println(isimler);
			System.out.println(degerler);
		}

	}

}
