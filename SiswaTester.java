package SISWA;
//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa sativa = new Siswa();
        Siswa nasya = new Siswa();
        Siswa kiya = new Siswa();
        Siswa cinta = new Siswa();

        sabrina.id = 32;
        sabrina.nama = "Sabrina";
        sabrina.ipk = 85.7;
        rasyid.id = 30;
        
        sativa.id = 31;
        sativa.nama = "Sativa";
        sativa.ipk = 93.6;
        nasya.id = 26;
        nasya.nama = "Nasya";
        nasya.ipk = 92.3;
        kiya.id = 13;
        kiya.nama = "Kiya";
        kiya.ipk = 92.2;
        cinta.id = 28;
        cinta.nama = "Cinta";
        cinta.ipk = 97.3;

        sabrina.print();
        rasyid.print();
        sativa.print();
        nasya.print();
        kiya.print();
        cinta.print();





    }
}
