
public class KisiAnaliz {
	
	public static String kisiIsmSoyisimAl(Kisi analizEdilecek){
		String isimSoyisim = analizEdilecek.Getad�() + " " + analizEdilecek.Getsoyadi() + " " + analizEdilecek.GettcNo();
	
		return isimSoyisim;
	}

}
