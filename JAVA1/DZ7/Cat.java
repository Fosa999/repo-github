class Cat {
    private String name;
    private int appetite;
    private boolean saturation;
    
    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        saturation = false;
    }
    
    void setSaturation(boolean status) {
        saturation = status;
    }
    
    void eat(Plate plate) {
        if(!saturation ){
        saturation = plate.decreaseFood(appetite);
        }
    }
    
    @Override
    public String toString () {
        return "{name=" + name + ", appetite:" + appetite + ", saturation =" + saturation + "}";
    }
}