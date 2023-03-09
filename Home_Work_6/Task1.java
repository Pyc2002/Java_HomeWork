
package Home_Work_6;

import java.util.HashMap;
import java.util.Map;
 // while (true) -> while (!plate.isEmpty())
// 1. Создать массив котов. Пусть все коты из массива по очереди едят из одной тарелки.
// В конце каждого цикла мы досыпаем в тарелку еду.
// Для досыпания еды сделать метод increaseFood в классе Plate.
// 2. Поменять поле satiety у кота с boolean на int.
// Допустим у кота апптит 10, сытность 3. Значит кот захочет поесть 7 единиц.
// 3. * Доработать поток thread в классе Cat, чтобы он каждую секунду уменьшал сытость кота на 1.



public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        
        // boolean flag = true;
        
        Plate plate = new Plate(150);
        Map<String, Integer> cats = new HashMap<>();
        cats.put("Murzik",15);
        cats.put("Barsik",10);
        cats.put("Ryzyk",5);
        cats.put("Chupakabra",50);
        
        
            int eatenbycats = 0;
            for (Map.Entry<String, Integer> pair : cats.entrySet()){
                
                while (plate.isEmpty(pair.getValue())) {
                    for (var item : cats.entrySet()){
                        Cat cat = new Cat(item.getKey(), item.getValue());
                        System.out.println("");
                        System.out.println(plate);
            
                        // cat.makeHungry();
                        int temp = cat.eatenByCats(item.getValue(), plate.food);
                        eatenbycats += temp;
                        cat.eat(plate);
                        
                        System.out.println(cat);
                        System.out.println("съедено " + eatenbycats);
                        System.out.println("Left in plate - " + plate);
                        
                        cats.put(item.getKey(), cat.newAppetite());
                        // cat.newSatiety();
                        
                       
                                            
                        
                        
                        Thread.sleep(1000);
                        
                    }
                }
                
            }
            plate.increaseFood(eatenbycats);
            System.out.println(eatenbycats);
            System.out.println(plate);

        
        
        
    }
}
