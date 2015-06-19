
public class Test {
	public static void main(String[] args) {
	
		Kisi analizEdilecekKisi = new Kisi();
		
		analizEdilecekKisi.Setadý("M.Turan");
		analizEdilecekKisi.Setsoyadý("Çuhadar");
		analizEdilecekKisi.SettcNo(130);
		analizEdilecekKisi.SetdogumYili(1234);
		analizEdilecekKisi.Setcinsiyet("Erkek");
		
		String bilgi = KisiAnaliz.kisiIsmSoyisimAl(analizEdilecekKisi);
		
		System.out.println(bilgi);
		
	}

}
