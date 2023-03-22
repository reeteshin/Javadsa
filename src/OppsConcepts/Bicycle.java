package OppsConcepts;

import java.util.Hashtable;

public class Bicycle {
    public static void main(String args[]) {
        System.out.println("Hellow form Opps");
       
       Lamp light = new Lamp();
       light.turnOn();
       light.turnOff();

    //    Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
    //    hm.size();
    //    hm.put(10,"nema");
    //    hm.put(11,"nema2");
    //    hm.put(12,"nema3");
    //    System.out.println(hm);
    light.hash();
    }

    
    
}

class Lamp {
  
    // stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;
  
    // method to turn on the light
    void turnOn() {
      isOn = true;
      System.out.println("Light on? " + isOn);
  
    }
  
    // method to turnoff the light
    void turnOff() {
      isOn = false;
      System.out.println("Light on? " + isOn);
    }

    void hash(){
        Hashtable<Integer,String> map = new Hashtable<Integer,String>();
        map.put(100, "From Calss");
        System.out.println( map.getClass().getSimpleName());

    }
    
    

  }