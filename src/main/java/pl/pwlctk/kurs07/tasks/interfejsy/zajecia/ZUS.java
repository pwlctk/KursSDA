package main.java.pl.pwlctk.kurs07.tasks.interfejsy.zajecia;
/**
 * Created by pwykowski
 */
public class ZUS {

	public void charge(Employer employer) {
		System.out.println(employer.getCompanyName() + " nie zapłacił podatku");
	}

	public static void main(String[] args) {
		ZUS zus = new ZUS();
		Corp corp = new Corp("Microsoft");
		SklepOsiedlowy sklepik = new SklepOsiedlowy("U Bożeny");
		Spolka zoo = new Spolka("Soft S.A.");

		OsobaFizyczna ja = new OsobaFizyczna("Jan", "Kowalski");

		ja.metoda();
		zus.charge(corp);
		zus.charge(sklepik);
		zus.charge(zoo);
		zus.charge(ja);

		Employer[] employers = {corp, sklepik, zoo, ja};

		((OsobaFizyczna)employers[3]).metoda();
	}

}
