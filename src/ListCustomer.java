import java.util.Arrays;
import java.util.Scanner;

public class ListCustomer {

  private Customer[] listCustomer;
  private int n;
  Scanner sc = new Scanner(System.in);

  public ListCustomer() {
    listCustomer = null;
  }

  public ListCustomer(int n) {
    listCustomer = new Customer[n];
  }

  public Customer[] getListCustomer() {
    return listCustomer;
  }

  public void setListCustomer(Customer[] listCustomer) {
    this.listCustomer = listCustomer;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public void printList() {
    System.out.println("Ds khach hang la: ");
    for (int i = 0; i < n; i++) {
      System.out.println(listCustomer[i].toString());
    }
  }

  public void addCustomer(Customer o) {
    listCustomer = Arrays.copyOf(listCustomer, n + 1);
    listCustomer[n] = o;
    n++;
  }

  public void addCustomer() {
    listCustomer = Arrays.copyOf(listCustomer, n + 1);
    listCustomer[n] = new Customer();
    listCustomer[n].setAll();
    n++;
  }

  public void timKiemByCmnd() {
    System.out.println("nhap cmnd");
    String cmnd2 = sc.nextLine();

    for (Customer customer : listCustomer) {
      if (customer.getCmnd().equalsIgnoreCase(cmnd2)) {
        customer.toString();
        break;
      }
    }
  }

  public void timKiemByName() {
    System.out.println("nhap cmnd");
    String name2 = sc.nextLine();

    for (Customer customer : listCustomer) {
      if (customer.getCmnd().equalsIgnoreCase(name2)) {
        customer.toString();
        break;
      }
    }
  }

}
