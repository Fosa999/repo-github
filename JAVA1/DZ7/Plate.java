class Plate {
    int food;
    
    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }
    void add(int food) {
        this.food += food; //еда добавляется в тарелку
}

    @Override
    public String toString () {
        return "plate: " + food;
    }
}