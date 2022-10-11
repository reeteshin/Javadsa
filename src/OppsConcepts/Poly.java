package OppsConcepts;


class Polygon {

    // method to render a shape
    public void render() {
      System.out.println("Rendering Polygon...");
    }
  }
  
  class Square extends Polygon {
  
    // renders Square
    public void render() {
      System.out.println("Rendering Square...");
    }
  }
  
  class Circle extends Polygon {
  
    // renders circle
    public void render() {
      System.out.println("Rendering Circle...");
    }
  }
  
  class Poly {
    public static void main(String[] args) {
      System.out.println("");
      // create an object of Square
      Square s1 = new Square();
      s1.render();
  
      // create an object of Circle
      Circle c1 = new Circle();
      c1.render();
      System.out.println("");
    }
  }











// class Poly {
//     void run() {
//         System.out.println("RUNNING");
//     }
// }

// class Splendor extends Poly {
//     void run() {
//         System.out.println("running safely with 60km");
//     }

//     public static void main(String args[]) {
//         Poly b = new Splendor();// upcasting
//         b.run();
//     }
// }