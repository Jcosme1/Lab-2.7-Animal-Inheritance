package InheritanceDemo;



public class Reptile extends Animal{
    private String color;
    private boolean hasStrips;
    private boolean hasShell;


//    public Reptile(String color, boolean hasStrips, int numOfLegs){
//        super(true,0,"Carnivore");
//
//    }
    public Reptile(String color, boolean hasStrips, boolean hasShell){ //Tutrle
        super (true,0, "Herbivore");
        this.color  = color;
        this.hasStrips = hasStrips;
        this.hasShell = hasShell;
    }
    public Reptile(String color, boolean hasStrips){ //Snake
        super(false, 0,"Carnivore");
        this.color = color;
        this.hasStrips =hasStrips;
    }
   public Reptile(){
       super(true, 0, "Omnivore");
   }
}
