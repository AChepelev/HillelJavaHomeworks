package hw5.Task1.professions;

public class Driver extends Person{

   private Double drivingStud;

   public Driver(Integer age, String fullName, Double drivingStud) {
      super(age, fullName);
      this.drivingStud = drivingStud;
   }

   public Double getDrivingStud() {
      return drivingStud;
   }

   public void setDrivingStud(Double drivingStud) {
      this.drivingStud = drivingStud;
   }

   @Override
   public String toString() {
      return "Driver{" +
              "drivingStud=" + drivingStud +
              '}';
   }
}

