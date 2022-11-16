package com.sid.tutorials.performance.tuning.memory.management;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

  private List<Integer> primes;

  private Boolean isPrime(Integer testNumber) {
    /**
     * <pre>
     * The for-Loop can be converted into Java-8 structure
     * 	for (int i = 2; i < testNumber; i++) {
     * 		if (testNumber % i == 0)
     * 			return false;
     * 	}
     * 	return true;
     * </pre>
     */
    boolean match = IntStream.range(2, testNumber).allMatch(i -> {
      if (testNumber % i == 0) {
        return false;
      }
      return true;
    });
    return match;
  }

  private Integer getNextPrimeAbove(Integer previous) {
    Integer testNumber = previous + 1;
    while (!isPrime(testNumber)) {
      testNumber++;
    }
    return testNumber;
  }

  public List<Integer> generateNumbers(Integer max) {
    primes = new ArrayList<Integer>();
    primes.add(2);

    Integer next = 2;
    while (primes.size() <= max) {
      next = getNextPrimeAbove(next);
      primes.add(next);
    }
    return primes;
  }

}
