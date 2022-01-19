import java.util.*;

public class MainPMB {
	
	static calon maba = new calon();
	static MainPMB menu = new MainPMB();
	static Scanner input = new Scanner(System.in);
	static pilih pilih = new pilih();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuTampilan();
	}
	
	public static void menuTampilan() {
		System.out.println("================================================");
		System.out.println("Selamat Datang di Menu Penerimaan Mahasiswa Baru");
		System.out.println("================================================");
		System.out.println("1. Input Data Pribadi");
		System.out.println("2. Input Data Akademik");
		System.out.println("3. Lihat Data");
		System.out.println("4. Kirim Data");
		System.out.println();
		System.out.println("0. Keluar dari program");
		System.out.println("================================================");
		// sistem menu
		if (input.hasNextInt()) {
			pilih.setPilih(input.nextInt());
			menu(pilih.getPilih());
		} else {
			System.out.println("Tolong Masukkan Angka!");
		}
	}
	
	public static void menu(int n) {
		if (n == 1) {
			Daftar();
		} else if (n == 2) {
			Akademik();
		} else if (n == 3) {
			maba.getData();
			System.out.println("Ketik apa saja untuk kembali");
			input.nextLine();
			input.nextLine();
			menuTampilan();
		} else if (n == 4) {
			maba.setCalon();
		} else if (n == 0) {
			System.out.println("Sampai jumpa");
			System.exit(0);
		} else {
			System.out.println("Tolong pilih antara 1 - 4");
			input.nextLine();
			input.nextLine();
			menuTampilan();
		}
	}

	public static void Daftar() {
		String nama, nisn, asal_sekolah, alamat;
		// buat percobaan make static diapus
		//nama = "Hafiz Juansyah Putra";
		//nisn = "2007411020";
		//asal_sekolah = "SMK Islam PB.Soedirman 1 Jakarta Timur";
		//alamat = "Kp. Areman Jl. Alamanda RT 08/07 No.95 Cimanggis, Depok";
		
		// Input data
		System.out.println("================================================");
		input.nextLine();
		System.out.print("Nama         : ");
		nama = input.nextLine();
		
		System.out.print("NISN         : ");
		nisn = input.nextLine();
		
		System.out.print("Asal Sekolah : ");
		asal_sekolah = input.nextLine();
		
		System.out.print("Alamat Rumah : ");
		alamat = input.nextLine();
		
		System.out.println();
		// set data pribadi
		maba.setNama(nama);
		maba.setNISN(nisn);
		maba.setAsalSekolah(asal_sekolah);
		maba.setAlamat(alamat);
		
		menuTampilan();
	}	
	
	public static void Akademik() {
		// jurusan
		maba.jurusan.getData();
		if (input.hasNextInt()) {
			// set data jurusan
			maba.jurusan.setJurusan(input.nextInt());
			// ngambil data buat prodi 
			maba.prodi.getData(maba.jurusan.getNum(), maba.jurusan.getPilihan());	
		} else {
			Scanner s = new Scanner(System.in);
			System.out.println("Tolong Masukkan Sebuah Angka");
			s.nextLine();
			s.close();
		}

		if (input.hasNextInt()) {
			// set data prodi
			setProdi(maba.jurusan.getNum() ,input.nextInt());
			menuTampilan();
		} else {
			Scanner s = new Scanner(System.in);
			System.out.println("Tolong Masukkan Sebuah Angka");
			s.nextLine();
			s.close();
		}
	}
	
	public static void setProdi(int num, int n) {
		num += 1;
		if (num == 1) {
			maba.prodi.setPilihan(maba.prodi.TS, n);
		} else if (num == 2)
		{
			maba.prodi.setPilihan(maba.prodi.TM, n);
		} else if (num == 3)
		{
			maba.prodi.setPilihan(maba.prodi.TE, n);
		} else if (num == 4)
		{
			maba.prodi.setPilihan(maba.prodi.TIK, n);
		} else if (num == 5)
		{
			maba.prodi.setPilihan(maba.prodi.TGP, n);
		} else if (num == 6)
		{
			maba.prodi.setPilihan(maba.prodi.AK, n);
		} else if (num == 7)
		{
			maba.prodi.setPilihan(maba.prodi.AN, n);
		} else if (num == 0) // klo 0 ulang dari jurusan
		{
			Scanner input = new Scanner(System.in);
			// jurusan
			maba.jurusan.getData();
			if (input.hasNextInt()) 
			{
				// set data jurusan
				maba.jurusan.setJurusan(input.nextInt());
				// ngambil data buat prodi 
				maba.prodi.getData(maba.jurusan.getNum(), maba.jurusan.getPilihan());	
			} else 
			{
				Scanner s = new Scanner(System.in);
				System.out.println("Tolong Masukkan Sebuah Angka");
				s.nextLine();
				s.close();
			}
			input.close();
		} else
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Mohon pilih dari data jurusan yang tersedia!");
			s.nextLine();
			s.close();
		}
	}
	//akhir class MainPMB
}
