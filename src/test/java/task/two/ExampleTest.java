package task.two;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ExampleTest {
    @Test
    void getLongestLineCharsCount1() {
        FileReader mockReader = mock(FileReader.class);
        when(mockReader.readLine()).thenReturn("abcd");
        when(mockReader.hasMoreLines()).thenReturn(true,false);
        assertEquals(4,Example.getLongestLineCharsCount(mockReader));
        verify(mockReader).readLine();
        verify(mockReader, times(2)).hasMoreLines();

    }

    @Test

    void getLongestLineCharsCount2() {

        FileReader mockReader = mock(FileReader.class);
        when(mockReader.readLine()).thenReturn("abcd","123456789", "");
        when(mockReader.hasMoreLines()).thenReturn(true,true,true,false);
        assertEquals(9,Example.getLongestLineCharsCount(mockReader));
        verify(mockReader, times(3)).readLine();
        verify(mockReader, times(4)).hasMoreLines();

    }

}