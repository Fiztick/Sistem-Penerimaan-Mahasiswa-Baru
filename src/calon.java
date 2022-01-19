
public class calon extends MainPMB{
	private String nama;
	private String asal_sekolah;
	private String nisn;
	private String alamat;
	private String[] data_calon = new String[10];
	Jurusan jurusan = new Jurusan();
	Prodi prodi = new Prodi();
	
	public String getNama() {
		return nama;
	}
	
	public String getAsalSekolah() {
		return asal_sekolah;
	}
	
	public String getNISN() {
		return nisn;
	}
	
	public String getAlamat() {
		return alamat;
	}
	
	public void setNama(String val) {
		nama = val;
	}
	
	public void setAsalSekolah(String val) {
		asal_sekolah = val;
	}
	
	public void setNISN(String val) {
		nisn = val;
	}
	
	public void setAlamat(String val) {
		alamat = val;
	}
	
	// nampilin data
	public void getData() {
		System.out.println("==============================================");
		System.out.println("Data Calon Mahasiswa Politeknik Negeri Jakarta");
		System.out.println("==============================================");
		System.out.println("Nama         : " + nama);
		System.out.println("nisn         : " + nisn);
		System.out.println("Asal Sekolah : " + asal_sekolah);
		System.out.println("Alamat Rumah : " + alamat);
		System.out.println("Jurusan      : " + jurusan.getPilihan());
		System.out.println("Prodi        : " + prodi.getPilihan());
		System.out.println("==============================================");
	}
	
	public void setCalon() {
		String jurusan_fin = jurusan.getPilihan();
		String prodi_fin = prodi.getPilihan();
		if (nama == null && nisn == null && asal_sekolah == null && alamat == null && jurusan_fin == null && prodi_fin == null) {
			System.out.println("Mohon lengkapi data terlebih dahulu!");
			input.nextLine();
			input.nextLine();
			super.menuTampilan();
		} else {
			data_calon[0] = getNama();
			data_calon[1] = getNISN();
			data_calon[2] = getAsalSekolah();
			data_calon[3] = getAlamat();
			data_calon[4] = jurusan_fin;
			data_calon[5] = prodi_fin;
			System.out.println("Terimakasih sudah mengirim data anda, mohon tunggu konfirmasi dari pihak kami");
			input.nextLine();
			input.nextLine();
			super.menuTampilan();
		}
		
	}
}
