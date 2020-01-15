/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class kucing {

    public class animal {

        public int numOfLegs;

        public animal(int x) {
            numOfLegs = x;
        }

        public void walk() {
            System.out.println("Animal is walking");
        }

    }

    public class Cat extends animal {

        public int lifeSpan;

        public Cat(int d, int w) {
            super(w);
            lifeSpan = d;

        }

        public void walk() {
            System.out.println("Cat is walking");
        }
        
    }
    
}
