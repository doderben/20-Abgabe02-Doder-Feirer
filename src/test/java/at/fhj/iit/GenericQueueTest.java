package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing for the class GenericQueue with Strings
 */
@DisplayName("Testing GenericQueue with Strings")
class GenericQueueTest {
    private GenericQueue<String> queue, emptyQueue;

    /**
     * inits two queues for EACH test
     */
    @BeforeEach
    void setup(){
        //Setup Phase
        queue = new GenericQueue<String>(3);
        queue.offer("String 0");
        queue.offer("String 1");
        queue.offer("String 2");
        emptyQueue = new GenericQueue<String>(2);
    }

    /**
     * Testing the constructor
     */
    @Test
    @DisplayName("Testing constructor")
    public void testGenericQueueConstructor(){
        assertEquals(queue.getMaxSize(), 3);
        assertEquals(emptyQueue.getMaxSize(), 2);
    }

    /**
     * Testing the function offer()
     */
    @Test
    @DisplayName("Testing Function offer")
    public void testFunctionOffer(){
        assertEquals(queue.offer("String 3"), false);
        assertEquals(emptyQueue.offer("String 0"), true);
    }

    /**
     * Testing the function remove(), poll(), peek()
     */
    @Test
    @DisplayName("Testing Function remove")
    public void testFunctionRemove(){
        assertEquals(queue.remove(), "String 0");
        assertThrows(NoSuchElementException.class, ()->{emptyQueue.remove();});
    }

    /**
     * Testing the function element() and peek()
     */
    @Test
    @DisplayName("Testing Function element")
    public void testFunctionElement(){
        assertEquals(queue.element(), "String 0");
        assertThrows(NoSuchElementException.class, ()->{emptyQueue.element();});
    }


}