import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class DemoTest {

    @Test
    public void testBubbleSort() {
        System.out.println("******** Test Bubble Sort ********");
        //Given
        Integer[] givenArr = {7,12,55,3,24,19};
        System.out.println("Given array: " + Arrays.toString(givenArr));
        Integer[] expectedArr = {3,7,12,19,24,55};
        System.out.println("Expected array: " + Arrays.toString(expectedArr));
        //When
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] result = bubbleSort.bubbleSort(givenArr);
        //Then
        Assert.assertArrayEquals(expectedArr,result);
        System.out.println("----------------");
        System.out.println("Result array: " + Arrays.toString(result) + "\n");
    }

    @Test
    public void testBubbleSortOptimized() {
        System.out.println("****** Test Bubble Sort Optimized ******");
        //Given
        Integer[] givenArr = {7,12,55,3,24,19};
        System.out.println("Given array: " + Arrays.toString(givenArr));
        Integer[] expectedArr = {3,7,12,19,24,55};
        System.out.println("Expected array: " + Arrays.toString(expectedArr));
        //When
        BubbleSort bubbleSort = new BubbleSort();
        //Then
        Integer[] resultOptimized = bubbleSort.bubbleSortOptimized(givenArr);
        Assert.assertArrayEquals(expectedArr,resultOptimized);
        System.out.println("----------------");
        System.out.println("Result array: " + Arrays.toString(resultOptimized) + "\n");
    }

    @Test
    public void testJavaSort() {
        System.out.println("******** Test Java Sort ********");
        //Given
        Integer[] givenArr = {7,12,55,3,24,19};
        System.out.println("Given array: " + Arrays.toString(givenArr));
        Integer[] expectedArr = {3,7,12,19,24,55};
        System.out.println("Expected array: " + Arrays.toString(expectedArr));
        //When
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] result = bubbleSort.javaSort(givenArr);
        //Then
        Assert.assertArrayEquals(expectedArr,result);
        System.out.println("----------------");
        System.out.println("Result array: " + Arrays.toString(result) + "\n");
    }


    @Test
    public void testLinearSearch() {
        System.out.println("******** Test Linear Search ********");
        long startTime = System.nanoTime();
        //Given
        Integer[] givenArr = {3,7,12,19,24,55};
        System.out.println("Given array: " + Arrays.toString(givenArr));
        Integer elementToFind = 24;
        System.out.println("Element to find: " + elementToFind);
        //When
        BinarySearch binarySearch = new BinarySearch();
        //Then
        Boolean result = binarySearch.sequentialSearch(elementToFind, givenArr);
        Assert.assertTrue(result);
        System.out.println("----------------");
        System.out.println("Result: " + result + "\n");
    }

    @Test
    public void testBinarySearch() {
        System.out.println("******** Test Binary Search ********");
        //Given
        Integer[] givenArr = {3,7,12,19,24,55};
        Integer elementToFind = 24;
        System.out.println("Given array: " + Arrays.toString(givenArr));
        System.out.println("Element to find: " + elementToFind);
        //When
        BinarySearch binarySearch = new BinarySearch();
        //Then
        Boolean result = binarySearch.binarySearch(elementToFind, givenArr);
        Assert.assertTrue(result);
        System.out.println("----------------");
        System.out.println("Result: " + result + "\n");
    }
}
