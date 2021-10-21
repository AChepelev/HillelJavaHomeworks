package hw3.second;

import java.util.Arrays;
import java.util.Random;

public class Randomizer {
    public Integer[] randomNumbers(Integer range,Integer limit){
        Random random = new Random();
        Integer[] numbers = new Integer[limit];
        for (int i = 0; i < limit; i++) {
            int randomInt = random.nextInt(range) * (random.nextBoolean() ? -1 : 1);
            numbers[i] = randomInt;
        }
        return numbers;
    }

    public Integer[] sort(Integer[] randomIntegers){
       Arrays.sort(randomIntegers);
       return randomIntegers;
    }

    public Integer[] doSqrtByIntegerValues(Integer[] randomIntegers){
        Integer[] numbers = new Integer[randomIntegers.length];
        for (int i = 0; i < randomIntegers.length; i++) {
            Integer randomInteger = randomIntegers[i];
            numbers[i] = randomInteger*randomInteger;
        }
        return numbers;
    }
}
