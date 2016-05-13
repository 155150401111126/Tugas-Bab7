package BAB7;
public abstract class Salon {
  private String nama;
  private String nomor;
  public Salon(String n, String no){
    nama=n;
    nomor=no;
  }
  public void setNama(String n){
    nama=n;
  }
  public String getNama(){
    return nama;
  }
  public void setNomor(String no){
    nomor=no;
  }
  public String getNomor(){
    return nomor;
  }
  public void data(){
    System.out.println("Nama         : "+getNama());
    System.out.println("Nomor        : "+getNomor());
  }
  public abstract double getJasa();
  public abstract double getBarang();
}

