package avlo;

public class AnaSinif {

	public AnaSinif() {
		// TODO Auto-generated constructor stub
	}
	
	
		public static void main(String[] args) {
			Avlagac aa=new Avlagac();
			
			aa.kok=aa.ekle(aa.kok, 100);
			aa.kok=aa.ekle(aa.kok, 50);
			aa.kok=aa.ekle(aa.kok, 60);
			aa.araGezinti(aa.kok);

		}
		


}
