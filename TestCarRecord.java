
// ===== Include header =====
public class TestCarRecord {
   public static void main (String [] args) {
      CarRecord familyCar = new CarRecord();

      familyCar.print();
      familyCar.setYearMade(2009);
      familyCar.setVehicleIdNum(444555666);
      familyCar.print();

   }
}