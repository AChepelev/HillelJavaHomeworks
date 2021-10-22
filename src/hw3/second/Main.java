package hw3.second;

public class Main {
    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();
        Integer[] numbers = randomizer.randomNumbers(10, 10);
        Integer[] sqrtNumbers = randomizer.doSqrtByIntegerValues(numbers);
        Integer[] sort = randomizer.sort(sqrtNumbers);
        for (Integer integer : sort) {
            System.out.println(integer);
        }
    }
}
