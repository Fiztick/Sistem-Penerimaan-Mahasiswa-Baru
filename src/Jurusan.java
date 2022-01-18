import java.util.Scanner;

public class Jurusan {
	public String[] daftar = {"Teknik Sipil", "Teknik Mesin", "Teknik Elektro", 
							   "Teknik Informatika & Komputer", "Teknik Grafika & Penerbitan",
							   "Akuntansi", "Administrasi Niaga"};
	private String pilihan;
	private int num;
	
	public void getData() {
		System.out.println("=============================");
		System.out.println("Pilih Jurusan yang diinginkan");
		System.out.println("=============================");
		for (int i = 1; i <= daftar.length; i++)
		{
			System.out.println(i + ". " + daftar[i-1]);
		}
		System.out.println("=============================");
	}
	
	public void setPilihan(int val) {
		pilihan = daftar[val];
		num = val;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getPilihan() {
		return pilihan;
	}
	
	public void setJurusan(int n) {
		// buat milih jurusan
			if (n == 1) 
			{
				setPilihan(n-1);
			} else if (n == 2)
			{
				setPilihan(n-1);
			} else if (n == 3)
			{
				setPilihan(n-1);
			} else if (n == 4)
			{
				setPilihan(n-1);
			} else if (n == 5)
			{
				setPilihan(n-1);
			} else if (n == 6)
			{
				setPilihan(n-1);
			} else if (n == 7)
			{
				setPilihan(n-1);
			} else
			{
				Scanner s = new Scanner(System.in);
				System.out.println("Mohon pilih dari data jurusan yang tersedia!");
				s.nextLine();
				s.close();	
				getData();
				setJurusan(n);
			}
		}
	}
