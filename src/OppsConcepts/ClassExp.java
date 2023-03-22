package OppsConcepts;

public class ClassExp {
   

   

    public static void main(String[] args) {
    //Encapsulation
        Text obj = new Text();
        obj.setName("meena");
        obj.getName();

    }

}
class Text{
   private String na = "Reetesh";

   void getName(){
        System.out.println(na);
        System.out.println(this.na);
   }
   String setName(String n){
        this.na = n;
        return na;
   }
}
