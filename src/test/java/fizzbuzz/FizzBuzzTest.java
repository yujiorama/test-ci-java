package fizzbuzz;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

/**
 * Unit test for simple FizzBuzz.
 */
public class FizzBuzzTest {
    
    FizzBuzz sut = new FizzBuzz();

    @Test
    public void expectReturnFizz() {
        assertThat(sut.fizzbuzz("3"), is("Fizz"));
    }
    
    @Test
    public void expectReturnBuzz() {
        assertThat(sut.fizzbuzz("5"), is("Buzz"));
    }

    @Test
    public void expectReturnFizzBuzz() {
        assertThat(sut.fizzbuzz("15"), is("FizzBuzz"));
    }
    
    @Test
    public void expectReturnNumber() {
        assertThat(sut.fizzbuzz("4"), is("4"));
    }
}
