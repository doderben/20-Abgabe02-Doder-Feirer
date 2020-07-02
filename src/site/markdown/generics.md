# Generics

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