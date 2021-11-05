import java.util.Scanner;

public class Kubus {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String nama, nim, kelas;
		double sisi, tinggi, luas, vlimas, vkubus, vtotal;

		System.out.println("Masukkan Nama\t\t :");
		nama = sc.nextLine();
		System.out.println("Masukkan NIM\t\t :");
		nim = sc.nextLine();
		System.out.println("Masukkan Kelas\t\t :");
		kelas = sc.nextLine();

		System.out.println("Masukkan sisi kubus\t\t :");
		sisi = sc.nextInt();
		System.out.println("Masukkan tinggi limas\t\t :");
		tinggi = sc.nextInt();

		luas = sisi * sisi;
		vkubus = sisi * sisi * sisi;
		vlimas = ((1F/3F) * luas * tinggi);
		vtotal = vkubus + vlimas;

		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("Nama Saya adalah " + nama);
		System.out.println("NIM Saya adalah " + nim);
		System.out.println("Kelas Saya adalah " + kelas);
		System.out.println(String.format("Hasil luas sisi kubus adalah %.2f", luas));
		System.out.println(String.format("Hasil volume kubus adalah %.2f", vkubus));
		System.out.println(String.format("Hasil volume limas adalah %.2f", vlimas));
		System.out.println(String.format("Hasil total volume adalah %.2f", vtotal));


	}
}