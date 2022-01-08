abstract class Animal implements IAnimal {
    protected String name;
    protected int runMax;
    protected int swimMax;
    
    Animal (String name, int runMax, int swimMax) {
        this.name = name;
        this.runMax = runMax;
        this.swimMax = swimMax;
    }
    
    @Override
    public String run(int distance) {
        if (distance > runMax) {
            return name + " ne smogu probezgat " + distance + " m";
        }else{
            return name + " probezgal " + distance + " m";
        }
    }
    
        @Override
    public String swim(int distance) {
        if (distance > swimMax) {
            return name + " ne smogu proplyt " + distance + " m";
        }else{
            return name + " proplyl " + distance + " m";
        }
    }    
    
    @Override
    public String toString () {
        return name + ". runMax:" + runMax + ", swimMax: " + swimMax;
    }
}