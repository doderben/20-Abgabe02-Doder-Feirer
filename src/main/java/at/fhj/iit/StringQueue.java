package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
 * This class can be used as a queue for Strings. It implements the IQueue Interface
 *
 * @param <String>
 */
public class StringQueue<String> implements IQueue<String> {

  /**
   * all the String elements in the queue from front to back
   */
  private List<String> elements = new ArrayList<String>();

  /**
   * the maximum size of the queue
   */
  private int maxSize;

  /**
   * Creates a StringQueue object with a given maxSize
   *
   * @param maxSize the maximum size of the queue
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) {
      elements.remove(0);
    }

    return element;
  }

  @Override
  public String remove() {
    String element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * getter for maxSize
   *
   * @return the maximum Size of the Queue
   */
  public int getMaxSize() {
    return maxSize;
  }
}