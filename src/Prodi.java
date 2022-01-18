import java.util.*;

public class Prodi extends Jurusan{
	private String pilihan;
	
	protected String[] TS = {	"Konstruksi Sipil", 
							"Konstruksi Gedung", 
							"Teknik Perancangan Jalan dan Jembatan (S.Tr)", 
							"Teknik Konstruksi Gedung (S.Tr)"};
	protected String[] TM = {	"Teknik Mesin",
			   				"Teknik Konversi Energi",
			   				"Alat Berat",
			   				"Manufaktur (S.Tr)",
			   				"Pembangkit Tenaga Listrik (S.Tr)",
			   				"Magister Rekayasa Teknologi Manufaktur (S.Tr)"};
	protected String[] TE = {"Teknik Elektro",
	   		   				"Telekomunikasi",
	   		   				"Instrumentasi Kontrol Industri (S.Tr)",
	   		   				"Teknik Otomasi Listrik Industri (S.Tr)",
	   		   				"Broadband Multimedia (S.Tr)",
	   		   				"Magister Teknik Elektro (S.Tr)"};
	protected String[] TIK = {"Teknik Informatika (S.Tr)",
	   		   				"Teknik Multimedia Digital (S.Tr)",
	   		   				"Teknik Multimedia dan Jaringan (S.Tr)",
	   		   				"Teknik Komputer dan Jaringan"};
	protected String[] TGP = {"Penerbitan",
	   		   				"Teknik Grafika",
	   		   				"Desain Grafis (S.Tr)",
	   		   				"Teknologi Industri Cetak Kemasan (S.Tr)"};
	protected String[] AK = {"Akuntansi",
	   		   				"Keuangan dan Perbankan",
	   		   				"Akuntansi Keuangan (S.Tr)",
	   		   				"Keuangan dan Perbankan (S.Tr)",
	   		   				"Keuangan Perbankan Syariah (S.Tr)",
	   		   				"Manajemen Keuangan (S.Tr)",
	   		   				"Manajemen Pemasaran (WNBK)"};
	protected String[] AN = {"Administrasi Bisnis",
			   				"Administrasi Bisnis Terapan (S.Tr)",
			   				"Usaha Jasa Konversi, Perjalanan Insentif dan Pameran /MICE (S.Tr)",
	   		   				"Bahasa Inggris untuk Komunikasi Bisnis dan Profesional (S.Tr)"};
	
	public void getDataValue(String[] arr, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". " + arr[i-1]);
			
		}
		System.out.println("===============================================");
	}
	
	public void getData(int n, String jurusan) {
		System.out.println("===============================================");
		System.out.println("Pilih Prodi untuk Jurusan " + jurusan);
		System.out.println("===============================================");
		n += 1;
		if (n == 1) 
		{
			getDataValue(TS, TS.length);
		} else if (n == 2)
		{
			getDataValue(TM, TM.length);
		} else if (n == 3)
		{
			getDataValue(TE, TE.length);
		} else if (n == 4)
		{
			getDataValue(TIK, TIK.length);
		} else if (n == 5)
		{
			getDataValue(TGP, TGP.length);
		} else if (n == 6)
		{
			getDataValue(AK, AK.length);
		} else if (n == 7)
		{
			getDataValue(AN, AN.length);
		} else {
			Scanner s = new Scanner(System.in);
			System.out.println("Tolong Masukkan Sebuah Angka");
			s.nextLine();
			s.close();
		}
	}

	public void setPilihan(String[] arr, int val) {
		if (val > arr.length) {
			Scanner s = new Scanner(System.in);
			System.out.println("Mohon pilih dari data prodi yang tersedia!");
			s.nextLine();
			s.close();	
			getData();
		}
		pilihan = arr[val-1];
	}
	
	public String getPilihan() {
		return pilihan;
	}
}
