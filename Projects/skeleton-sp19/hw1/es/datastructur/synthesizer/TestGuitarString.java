package es.datastructur.synthesizer;

/* Imports the required audio library from the
 * edu.princeton.cs.introcs package. */
import edu.princeton.cs.introcs.StdAudio;

import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the GuitarString class.
 *  @author Josh Hug
 */

public class TestGuitarString {
    @Test
    public void testPluckTheAString() {
        double CONCERT_A = 440.0;
        GuitarString aString = new GuitarString(CONCERT_A);
        aString.pluck();
        for (int i = 0; i < 50000; i += 1) {
            StdAudio.play(aString.sample());
            aString.tic();
        }
    }


    @Test
    public void testTic() {
        // Create a GuitarString of frequency 11025, which
        // is an ArrayRingBuffer of length 4.
        GuitarString s = new GuitarString(11025);
        s.pluck();

        // Record the front four values, ticcing as we go.
        double s1 = s.sample();
        System.out.println(s1);
        s.tic();
        double s2 = s.sample();
        System.out.println(s2);
        s.tic();
        double s3 = s.sample();
        System.out.println(s3);
        s.tic();
        double s4 = s.sample();
        System.out.println(s4);

        // If we tic once more, it should be equal to 0.996*0.5*(s1 + s2)
        s.tic();

        double s5 = s.sample();
        System.out.println(s5);
        double expected = 0.996 * 0.5 * (s1 + s2);

        // Check that new sample is correct, using tolerance of 0.001.
        // See JUnit documentation for a description of how tolerances work
        // for assertEquals(double, double)
        assertEquals(expected, s5, 0.5001);

    }

}