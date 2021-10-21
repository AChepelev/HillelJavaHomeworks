package hw5.Task1.details;

public class Engine {
   private Integer power;
   private String creator;

   public Engine(Integer power, String creator) {
      this.power = power;
      this.creator = creator;
   }

   public Integer getPower() {
      return power;
   }

   public void setPower(Integer power) {
      this.power = power;
   }

   public String getCreator() {
      return creator;
   }

   public void setCreator(String creator) {
      this.creator = creator;
   }

   @Override
   public String toString() {
      return "Engine{" +
              "power=" + power +
              ", creator='" + creator + '\'' +
              '}';
   }
}

