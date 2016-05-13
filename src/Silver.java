package BAB7;
public class Silver extends Salon {
  private double jasa;
  private double barang;
  public Silver(String n, String no, double j, double b) {
    super(n, no);
    jasa = j ;
    barang = b ;
  }
  public void setJasa(double j) {
    jasa = j * 90 / 100;
  }
  public void setBarang(double b) {
    barang = b * 90 / 100;
  }
  public double getJasa() {
    return jasa;
  }
  public double getBarang() {
    return barang;
  }
  public void data(){
    super.data();
    biaya();
  }
  public void biaya() {
    System.out.println("Biaya Jasa   : Rp " + getJasa());
    System.out.println("Biaya barang : Rp " + getBarang());
  }
  public void info(){
    System.out.println("Diskon 10% untuk penggunaan layanan dan 10% untuk pembelian barang bagi Silver Member");
  }
}

