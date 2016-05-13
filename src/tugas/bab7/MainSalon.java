package BAB7;
public class MainSalon {
public static void main(String[] args) {
    Premium a= new Premium("Doraemon","120942",150000,70000);
    a.data();
    a.info();
    a.setJasa(150000);
    a.setBarang(70000);
    System.out.println("Yang harus dibayar");
    a.biaya();
    System.out.println("---------------------------------");
    Gold b= new Gold("Nobita","131534",100000,90000);
    b.data();
    b.info();
    b.setJasa(100000);
    b.setBarang(90000);
    System.out.println("Yang harus dibayar");
    b.biaya();
    System.out.println("----------------------------------");
    Silver c= new Silver("Sizuka","143145",250000,50000);
    c.data();
    c.info();
    c.setJasa(250000);
    c.setBarang(50000);
    System.out.println("Yang harus dibayar");
    c.biaya();
    System.out.println("----------------------------------");
    NonAnggota d= new NonAnggota("Giant","100421",30000,90000);
    d.data();
    d.info();
    d.setJasa(30000);
    d.setBarang(90000);
    System.out.println("Yang harus dibayar");
    d.biaya();
    System.out.println("----------------------------------");
    System.out.println("\nTerimakasih\nDeby Chintya\n155150201111350");
  }
}

