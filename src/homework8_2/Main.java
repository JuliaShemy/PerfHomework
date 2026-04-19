package homework8_2;

/*
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */
public class Main {
    public static void main(String[] args) {
        AnimalCollection listAnimals = new AnimalCollection();
        listAnimals.addAnimal("Кролик");//добавляем
        listAnimals.addAnimal("Собака");
        listAnimals.addAnimal("Кот");
        listAnimals.printAnimals();

        listAnimals.removeAnimal();//удаляем
        listAnimals.printAnimals();
    }
}