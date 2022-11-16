/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Lenovo<br/>
 *         To run the below code in the commend prompt follow the below steps <br/>
 * 
 *         <pre>
 *         Note : Make sure the built will be in JAR not in WAR
 *         Step-1: Navigate to the target folder <br/>
 *         		cd path<br/>
 *         Step-2: run the below commend in a single line <br/>
 *         		java -cp Section-02-Just-In-Time-Compilation-And-The-Code-Cache.jar
 *         com.sid.tutorials.performance.tuning.memory.management.Section02JustInTimeCompilationAndTheCodeCache 10
 *         
 *         		java -XX:+PrintCompilation -cp Section-02-Just-In-Time-Compilation-And-The-Code-Cache.jar 
 *         com.sid.tutorials.performance.tuning.memory.management.Section02JustInTimeCompilationAndTheCodeCache 10
 *         
 *         To check the code cache
 *         		java -XX:+PrintCodeCache -cp Section-02-Just-In-Time-Compilation-And-The-Code-Cache.jar 
 *         com.sid.tutorials.performance.tuning.memory.management.Section02JustInTimeCompilationAndTheCodeCache 10
 *         
 *         To increase the cache
 *         		java -XX:ReservedCodeCacheSize=300m -XX:+PrintCodeCache -cp Section-02-Just-In-Time-Compilation-And-The-Code-Cache.jar 
 *         com.sid.tutorials.performance.tuning.memory.management.Section02JustInTimeCompilationAndTheCodeCache 10
 *         </pre>
 *
 */
public class Section02JustInTimeCompilationAndTheCodeCache {

  /**
   * @param args
   */
  public static void main(String[] args) {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    Integer max = Integer.parseInt(args[0]);
    List<Integer> primes = primeNumbers.generateNumbers(max);
    System.out.println(primes);
    /**
     * Calculate sum of all elements in a List using sum() method
     */
    System.out.println(
        "Sum of all prime numbers intValue : " + primes.stream().mapToInt(Integer::intValue).sum());
    System.out.println(
        "Sum of all prime numbers valueOf : " + primes.stream().mapToInt(Integer::valueOf).sum());

    /**
     * Calculate sum of all elements in a List using Reduce operation method
     * 
     * <pre>
     * For more reference please follow the below link.
     * https://www.javatpoint.com/reduce-java#:~:text=In%20Java%2C%20reducing%20is%20a,the%20elements%20of%20a%20stream.
     * </pre>
     */
    System.out.println("Sum of all prime numbers valueOf Reduce operation method: "
        + primes.stream().reduce((x, y) -> x + y).get());
    System.out
        .println("Sum of all prime numbers valueOf Reduce operation method without optional : "
            + primes.stream().reduce(0, (x, y) -> x + y));

    /**
     * Calculate sum of all elements in a List Using IntSummaryStatistics
     * 
     */
    System.out.println("Sum of all prime numbers valueOf IntSummaryStatistics method: "
        + primes.stream().mapToInt(Integer::valueOf).summaryStatistics().getSum());


  }

}
