

package Home_Work_6;

public class Plate {

    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean isEmpty(int appetite){
        if (food > appetite){
            return true;
        }
        return false;
    }

    public int decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease){ 
            food = food - foodToDecrease;
            
        }
        return food;
    }

    public boolean increaseFood(int eatenByCats) {
        food = eatenByCats*90/100;
            
        return true;
    }
  
    @Override
    public String toString() {
        return "Plate[" + food + "]";
    }

}