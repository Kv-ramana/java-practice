/*
7. Traffic Light Simulator: Create a simulation of traffic lights at a junction. Use conditional statements to change the lights based on the time of day and the traffic flow.
*/


public class Trafficlights {
  public static void main(String[] args) {     
      int hour = java.time.LocalTime.now().getHour();
      String lightColor;
      if (hour >= 7 && hour < 10) {
          
          lightColor = "RED";
      } else if (hour >= 10 && hour < 16) {
          lightColor = "GREEN";
      } else if (hour >= 16 && hour < 19) {

          lightColor = "RED";
      } else {
      
          lightColor = "GREEN";
      }
    System.out.println("The traffic light is " + lightColor);
  }
}