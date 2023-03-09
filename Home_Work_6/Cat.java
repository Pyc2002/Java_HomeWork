

package Home_Work_6;

public class Cat {

    private String name;
    public int appetite;
    public volatile int satiety;
    

 
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = 3;
     
        

        Thread backgroundSatietyManagement = new Thread(() -> {
            while (satiety<appetite) {
                // satiety = false;
                try {
                    Thread.sleep(5 * 1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        backgroundSatietyManagement.setDaemon(true);
        backgroundSatietyManagement.start();
    }

    public int eat(Plate plate) {
        if (satiety < appetite) {
            
            plate.food = plate.decreaseFood(appetite);
            
        }
        return plate.food;
    }
    // public void newSatiety() {
    //     if (satiety < appetite) {
            
    //         satiety = appetite - satiety;
    //     }
    
    // }

    public int newAppetite() {
        if (satiety < appetite) {
            
            appetite = appetite - satiety;
        }
       return appetite;
    }
    public int eatenByCats(int num, int food) {
        int eaten = 0;
        if (food > appetite) {
           
           eaten = num;
           
        }
        return eaten;
    }
  
    // public void makeHungry() {
    //     satiety = false; 
    // }

    @Override
    public String toString() {
        return name + "{appetite=" + appetite + ", satiety=" + satiety +"}";
    }
}
