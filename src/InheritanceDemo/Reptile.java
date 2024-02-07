package InheritanceDemo;



public class Reptile extends Animal{
    private String color;
    private boolean hasStrips;
    private int numOfLegs;

//    public Reptile(String color, boolean hasStrips, int numOfLegs){
//        super(true,0,"Carnivore");
//
//    }
    public Reptile(String color, boolean hasStrips, int numOfLegs){
        super (true,0, "Carnivore");
        this.color  = color;
        this.hasStrips = hasStrips;
        this.numOfLegs = numOfLegs;
    }

    public Reptile(String color, boolean hasStrips){
        super(false, 0,"Herbavore");
        this.color = color;
        this.hasStrips =hasStrips;
    }
   public Reptile(){
       super(true, 0, "Carnivore");
   }
}
