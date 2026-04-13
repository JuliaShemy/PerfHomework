package homework8_2;

import java.util.LinkedList;

public class AnimalCollection {

    private final LinkedList<String> animals = new LinkedList<>();

    public void addAnimal(String animal){
        animals.addFirst(animal);//добавляем в начало
    }

    public  void removeAnimal(){
       String remove = animals.removeLast();//удаляем с конца
          }
    public void printAnimals(){
        System.out.println("Список животных: " + animals);
    }
}