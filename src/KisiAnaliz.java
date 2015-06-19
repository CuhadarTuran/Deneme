
public class KisiAnaliz {
	
	public static String kisiIsmSoyisimAl(Kisi analizEdilecek){
		String isimSoyisim = analizEdilecek.Getadý() + " " + analizEdilecek.Getsoyadi() + " " + analizEdilecek.GettcNo();
	
		return isimSoyisim;
	}

}
