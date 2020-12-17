import java.util.Scanner;

/**
 * Customer
 */
public class Customer {

  private String name;
  private String cmnd;
  private String sdt;
  Scanner sc = new Scanner(System.in);

  public Customer() {
    this.name = null;
    this.cmnd = null;
    this.sdt = null;
  }

  public Customer(String name, String cmnd, String sdt) {
    this.name = name;
    this.cmnd = cmnd;
    this.sdt = sdt;
  }

  public String getCmnd() {
    return cmnd;
  }

  public String getName() {
    return name;
  }

  public String getSdt() {
    return sdt;
  }

  public void setCmnd(String cmnd) {
    this.cmnd = cmnd;
  }

  public void setCmnd() {
    System.out.println("nhap cmnd: ");
    name = sc.nextLine();

  }

  public void setName(String name) {
    this.name = name;
  }

  public void setName() {
    System.out.println("nhap ten: ");
    name = sc.nextLine();

  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public void setSdt() {
    System.out.println("nhap sdt: ");
    sdt = sc.nextLine();
  }

  public void setAll() {
    setCmnd();
    setName();
    setSdt();
  }

  @Override
  public String toString() {
    return "name = " + name + " ,cmnd = " + cmnd + " ,sdt = " + sdt;
  }

}