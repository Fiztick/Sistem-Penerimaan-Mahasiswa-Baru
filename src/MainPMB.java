import java.util.*;

public class MainPMB {
	
	static calon maba = new calon();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daftar();
		Akademik();
		System.exit(0);
	}

	public static void Daftar() {
		String nama, nisn, asal_sekolah, alamat;
		nama = "Hafiz Juansyah Putra";
		nisn = "2007411020";
		asal_sekolah = "SMK Islam PB.Soedirman 1 Jakarta Timur";
		alamat = "Kp. Areman Jl. Alamanda RT 08/07 No.95 Cimanggis, Depok";
		
		System.out.println("Selamat Datang di Form Penerimaan Mahasiswa Baru");
		System.out.println("================================================");
		
		// Input data
		System.out.print("Nama         : ");
		//nama = input.nextLine();
		System.out.println();
		System.out.print("NISN         : ");
		//nisn = input.nextLine();
		System.out.println();
		System.out.print("Asal Sekolah : ");
		//asal_sekolah = input.nextLine();
		System.out.println();
		System.out.print("Alamat Rumah : ");
		//alamat = input.nextLine();
		System.out.println();
		
		// set data utama
		maba.setNama(nama);
		maba.setNISN(nisn);
		maba.setAsalSekolah(asal_sekolah);
		maba.setAlamat(alamat);
				
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
			// ngambil data pendaftar
			maba.getData();
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
			maba.jurusan.getData();
		}
	}
	//akhir class MainPMB
}
