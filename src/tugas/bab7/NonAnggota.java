package BAB7;
public class NonAnggota extends Salon {
 private double jasa;
  private double barang;
  public NonAnggota(String n, String no, double j, double b) {
    super(n, no);
    jasa = j ;
    barang = b;
  }
  public void setJasa(double j) {
    jasa = j;
  }
  public void setBarang(double b) {
    barang = b;
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
    System.out.println("Non-Member tidak mendapat potongan :)");
  }
}
