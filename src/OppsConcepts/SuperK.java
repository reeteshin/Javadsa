package OppsConcepts;

class SuperK {
    String color = "white";
}

class Dog extends SuperK {
    String color = "black";

    void printColor() {
        System.out.println(color);// prints color of Dog class
        System.out.println(super.color);// prints color of SuperK class
    }
}

class TestSuper1 {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.printColor();
    }
}


//for invoking the methods ||

// class Animal {
//     void eat() {
//         System.out.println("eating...");
//     }
// }

// class Dog extends Animal {
//     void eat() {
//         System.out.println("eating bread...");
//     }

//     void bark() {
//         System.out.println("barking...");
//     }

//     void work() {
//         super.eat();
//         bark();
//     }
// }

