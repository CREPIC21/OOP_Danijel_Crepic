package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.OperatingSystem;
import com.company.Animal;
import com.company.devices.Phone;

import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog", FoodType.MEAT);

        dog.name = "Szarik";

        Human me = new Human(1000.0);
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;
        me.hashCode();

        me.feed(1.0);
        System.out.println(me.species);

        Phone onePlus = new Phone("onePlus",
                "8Pro",
                2.3,
                OperatingSystem.Android);

        Phone iPhone6 = new Phone("apple", "6s", 5.0, OperatingSystem.iOS);

        System.out.println("phone: " + onePlus);
        System.out.println("phone: " + iPhone6);
        System.out.println("human: " + me);


        onePlus.turnOn();

        Car fiat = new Car("fiat", "bravo");
        fiat.engineSize = 1.9;
        fiat.fuelType = "disel";
        System.out.println(fiat.producer);

        dog.feed(1.0, FoodType.MEAT);

        Human brother = new Human(1231.2);

        dog.sell(me, brother, 1.0);

        fiat.refill();

        // TASK 2
        System.out.println("OOP TASK 2");
        Animal elephant = new Animal("elephant", FoodType.CROPS);
        elephant.feed(50.0, FoodType.CROPS);


        Animal cat = new Animal("cat", FoodType.MEAT);
        cat.feed(1.0, FoodType.MEAT);


        //Task3
        System.out.println("OOP TASK 3");
        System.out.println("Country GDP in PLN" + Country.CROATIA.getGdpInPln());

        //Task4
        System.out.println("OOP TASK 4");

        Map<Country, Double> area = new HashMap<>();
        area.put(Country.CANADA, 982598239.114);
        area.put(Country.CROATIA, 825823832.114);
        area.put(Country.IRELAND, 974637654.114);
        area.put(Country.NORWAY, 4536209784.114);
        area.put(Country.THAILAND, 645382964.114);

        double minimum = Collections.min(area.values());
        double maximum = Collections.max(area.values());

        for (Map.Entry<Country, Double> item : area.entrySet()) {
            if (item.getValue().equals(minimum)) {
                System.out.println("Minimum value is: " + item.getValue() + ", country code is: " + item.getKey().getCode() + ", language is: " + item.getKey().getLanguage());
            }
            if (item.getValue().equals(maximum)) {
                System.out.println("Maximum value is: " + item.getValue() + ", country code is: " + item.getKey().getCode() + ", language is: " + item.getKey().getLanguage());
            }
        }

        //Task 5
        System.out.println("OOP TASK 5");

        Map<String, Country> capital = new HashMap<>();
        capital.put("Oslo", Country.NORWAY);
        capital.put("Ottawa", Country.CANADA);
        capital.put("Dublin", Country.IRELAND);

        //Sorting the result by converting it to a TreeMap
        Map<String, Country> capitalSorted = new TreeMap<>(capital);

        for (Map.Entry<String, Country> cap : capitalSorted.entrySet()) {
            System.out.println("Alphabetically sorted capital cities: " + cap.getKey());
        }

        //Task6
        System.out.println("OOP TASK 6");
        Animal kica = new Pet("cat", FoodType.ALL, "Kica");
        Animal lucy = new Pet("dog", FoodType.ALL, "Lucy");
        Animal danijel = new Human(6000.0);
        Animal marta = new Human(5000.0);
        Animal babyElephant = new FarmAnimal("elephant", FoodType.CROPS, "Dambo");
        Animal motherElephant = new FarmAnimal("elephant", FoodType.CROPS, "Earie");

        List<Animal> petsList = new ArrayList<>();
        petsList.add(kica);
        petsList.add(lucy);

        List<Animal> humanList = new ArrayList<>();
        humanList.add(danijel);
        humanList.add(marta);

        List<Animal> farmAnimalList = new ArrayList<>();
        farmAnimalList.add(babyElephant);
        farmAnimalList.add(motherElephant);


        Map<FoodType, List<Animal>> animalMap = new HashMap<>();
        animalMap.put(FoodType.ALL, petsList);
        animalMap.put(FoodType.MEAT, humanList);
        animalMap.put(FoodType.CROPS, farmAnimalList);

        //First way:
        System.out.println(animalMap.get(FoodType.ALL));
        System.out.println(animalMap.get(FoodType.MEAT));
        System.out.println(animalMap.get(FoodType.CROPS));

        //Second way:
        for (Entry<FoodType, List<Animal>> findFoodType : animalMap.entrySet()) {

            if (findFoodType.getKey().equals(FoodType.ALL)) {
                System.out.println(findFoodType.getValue().get(0) + ", " + findFoodType.getValue().get(1));
            } else if (findFoodType.getKey().equals(FoodType.MEAT)) {
                System.out.println(findFoodType.getValue().get(0) + ", " + findFoodType.getValue().get(1));
            } else {
                System.out.println(findFoodType.getValue().get(0) + ", " + findFoodType.getValue().get(1));
            }
        }

        //Task7
        System.out.println("OOP TASK 7");
        Car volvo = new Car("Volvo", "XC90");
        volvo.startACar();


        //Task8
        System.out.println("OOP TASK 8");
        List<Animal> animals = new LinkedList<>();
        //First way
        Animal nico = new Human(75.0);
        Animal klaker = new Human(90.0);
        Animal snjeska = new Pet ("cat",FoodType.ALL, "Snjeska");
        Animal merkur = new Pet("dog",FoodType.ALL, "Merkur");
        Animal ela = new FarmAnimal("elephant", FoodType.CROPS, "Ela");
        Animal ted = new FarmAnimal("elephant", FoodType.CROPS, "Ted");
        animals.add(nico);
        animals.add(klaker);
        animals.add(snjeska);
        animals.add(merkur);
        animals.add(ela);
        animals.add(ted);
        nico.setWeight(70.0);
        klaker.setWeight(80.0);
        snjeska.setWeight(4.0);
        merkur.setWeight(7.0);
        ela.setWeight(500.0);
        ted.setWeight(800.0);

        //Second way
        animals.add(new Human(2000.0));
        animals.add(new Human(800.0));
        animals.add(new Pet("dog", FoodType.ALL, "Fluffy"));
        animals.add(new Pet("cat", FoodType.ALL, "Dan"));
        animals.add(new FarmAnimal("elephant", FoodType.CROPS, "Miki"));
        animals.add(new FarmAnimal("elephant", FoodType.CROPS, "Maus"));
        animals.get(0).setWeight(88.0);
        animals.get(0).name = "Nico";
        animals.get(1).setWeight(75.0);
        animals.get(1).name = "Klaker";
        animals.get(2).setWeight(7.0);
        animals.get(3).setWeight(45.0);
        animals.get(4).setWeight(800.0);
        animals.get(5).setWeight(600.0);

        Collections.sort(animals, new Comparator<>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        System.out.println(animals.toString());
        for (Animal animal : animals) {
            System.out.println("The weight of the animal " + animal.species + " is: " + animal.getWeight());
        }


        //Task 11
        System.out.println("OOP TASK 11");
        Collections.sort(animals, (o1, o2) -> o1.getWeight().compareTo(o2.getWeight()));
        System.out.println(animals);


        // tasks 10, 12, 13, 14, 15, 16, 17





    }
}
