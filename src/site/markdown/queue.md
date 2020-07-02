# Queue-Template



### Queue

The Queue represents a type of Collection that works in a FIFO(=first-in first-out)-order. So if you are the first to join the queue, you will be the first to leave it.

###### Uses of the Queue:

- Waiting lines
- Media Playlist (e.g. Spotify, YouTube)
- Breadth-First-Search-Algorithm for Trees



### Generics

Generics are used to make implementations usable for different variable types. A well known example generics are the Java Collections that can be parameterized. There are different naming conventions:

- E - Element
- K - Key
- N - Number
- T - Type
- V - Value

Here is an example of how we have used generics in our implementation:

```java
public interface IQueue<T> {}
```

This interface describes the general methods of a queue and because of the generic type (= **\<T>**)

```java
public class GenericQueue<T> implements IQueue<T> {
    private List<T> elements = new ArrayList<T>();
    private int maxSize;
    
        public GenericQueue(int maxSize) {
        this.maxSize = maxSize;
    }
    //all methods from IQueue
}
```

This is the generic class we have created to implement the queue

```java
GenericQueue<Integer> queue = new GenericQueue<Integer>(3);
```

This is an example of an Integer-queue using the class we have implemented. In this case the maximum size of the queue is 3.



### Code Coverage

In IntelliJ you have the option to run your JUnit-Tests with coverage. That way you can see how much of your written code has been executed. If the code coverage equals 100%, every line of the code has been executed at least once.