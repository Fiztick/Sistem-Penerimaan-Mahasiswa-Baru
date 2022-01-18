
public class calon{
	private String nama;
	private String asal_sekolah;
	private String NISN;
	private String alamat; 
	Jurusan jurusan = new Jurusan();
	Prodi prodi = new Prodi();
	
	public String getNama() {
		return nama;
	}
	
	public String getAsalSekolah() {
		return asal_sekolah;
	}
	
	public String getNISN() {
		return NISN;
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
		NISN = val;
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
		System.out.println("NISN         : " + NISN);
		System.out.println("Asal Sekolah : " + asal_sekolah);
		System.out.println("Alamat Rumah : " + alamat);
		System.out.println("Jurusan      : " + jurusan.getPilihan());
		System.out.println("Prodi        : " + prodi.getPilihan());
		System.out.println("==============================================");
	}
}
