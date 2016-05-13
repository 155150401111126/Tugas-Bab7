package BAB7;
public class Premium extends Salon {
  private double jasa;
  private double barang;
  public Premium(String n, String no, double j, double b) {
    super(n, no);
    jasa = j;
    barang = b;
  }
  public void setJasa(double j) {
    jasa = j * 80 / 100;
  }
  public void setBarang(double b) {
    barang = b * 90 / 100;
  }
  @Override
  public double getJasa() {
    return jasa;
  }
  @Override
  public double getBarang() {
    return barang;
  }
  @Override
  public void data() {
    super.data();
    biaya();
  }
  public void biaya() {
    System.out.println("Biaya Jasa   : Rp " + getJasa());
    System.out.println("Biaya barang : Rp " + getBarang());
  }
  public void info() {
    System.out.println("Diskon 20% untuk penggunaan layanan dan 10% untuk pembelian barang bagi Premium Member");
  }
}

