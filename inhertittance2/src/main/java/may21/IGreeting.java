package may21;
/*
    if an interface has only 1 single abstract method
    it can be considered as functional interface
 */

@FunctionalInterface
public interface IGreeting {
    String greet(String name);
    default void enjoy(){
        System.out.println("Default");
    }
}
