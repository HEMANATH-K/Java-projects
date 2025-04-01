package BusRes;

public class Bus {
  private int busno;
  private boolean AC;
  private int  Capacity;

   Bus(int no,boolean ac, int cap){
	this.busno=no;
	this.AC=ac;
	this.Capacity=cap;
}
  public int  getCapacity(){
	   return Capacity;
   }public void setCapacity(int cap) {
	   Capacity=cap;
   }public boolean getAC() {
	   return AC;
   }public void setAC(boolean ac) {
	   AC=ac;
   }public int getbusno() {
	   return busno;
   }
   public void displaybusinfo() {
	   System.out.println("Busno:"+busno);
	   System.out.println("AC available"+AC);
	   System.out.println("Capacity:"+Capacity);
   }
}