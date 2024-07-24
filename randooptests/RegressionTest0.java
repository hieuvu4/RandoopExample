import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        sorting.MergeSort mergeSort0 = new sorting.MergeSort();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        WhichPath whichPath0 = new WhichPath();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            insertionSort0.sort(intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = NestedLoops.calculateSum(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"matrix\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        NestedLoops nestedLoops0 = new NestedLoops();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.Class<?> wildcardClass1 = whatKindOfNumber0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 10, 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str3 = WhichPath.makeDecision((int) '#', 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str3 = WhichPath.makeDecision((int) '4', 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 1" + "'", str3, "Path 1");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        Calculator calculator0 = new Calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 1, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        searching.BinarySearch binarySearch6 = new searching.BinarySearch();
        int[] intArray9 = new int[] { (byte) 100, (short) 10 };
        int int11 = binarySearch6.search(intArray9, (int) '4');
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        int int17 = binarySearch6.search(intArray14, (int) 'a');
        int int19 = binarySearch0.search(intArray14, 100);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        searching.BinarySearch binarySearch26 = new searching.BinarySearch();
        int[] intArray29 = new int[] { (byte) 100, (short) 10 };
        int int31 = binarySearch26.search(intArray29, (int) '4');
        int[] intArray34 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray34);
        int int37 = binarySearch26.search(intArray34, (int) 'a');
        int[] intArray40 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray40);
        sorting.MergeSort.sort(intArray40, 1);
        int int45 = binarySearch26.search(intArray40, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray14, intArray22, intArray40, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        ExamGrades examGrades0 = new ExamGrades();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = examGrades0.grade((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str3 = WhichPath.makeDecision(1, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int[] intArray2 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray2);
        sorting.MergeSort.sort(intArray2, 1);
        searching.BinarySearch binarySearch6 = new searching.BinarySearch();
        int[] intArray9 = new int[] { (byte) 100, (short) 10 };
        int int11 = binarySearch6.search(intArray9, (int) '4');
        int[] intArray15 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray2, intArray9, intArray15, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 100, 10, 0 });
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        int int6 = binarySearch1.search(intArray4, (int) '4');
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        int int12 = binarySearch1.search(intArray9, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray9, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int int9 = linearSearch1.search(intArray5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray5, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        searching.BinarySearch binarySearch6 = new searching.BinarySearch();
        int[] intArray9 = new int[] { (byte) 100, (short) 10 };
        int int11 = binarySearch6.search(intArray9, (int) '4');
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        int int17 = binarySearch6.search(intArray14, (int) 'a');
        int int19 = binarySearch0.search(intArray14, 100);
        searching.LinearSearch linearSearch20 = new searching.LinearSearch();
        int[] intArray24 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray24, 0);
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        sorting.MergeSort.sort(intArray29, 1);
        int[] intArray35 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray35);
        sorting.MergeSort.merge(intArray24, intArray29, intArray35, (int) (short) 0, (int) (short) 1);
        int int41 = linearSearch20.search(intArray35, 100);
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray14, intArray35, intArray44, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 1 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 'a', (byte) -1, (byte) 1 };
        searching.LinearSearch linearSearch5 = new searching.LinearSearch();
        int[] intArray9 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray9, 0);
        int int13 = linearSearch5.search(intArray9, (int) ' ');
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        int int34 = linearSearch5.search(intArray22, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray0, intArray4, intArray22, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, (-1), 1 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double9 = calculator0.squareRoot(151.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.288205727444508d + "'", double9 == 12.288205727444508d);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.sort(intArray14, 1);
        int[] intArray20 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray20);
        sorting.MergeSort.sort(intArray20, 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray8, intArray14, intArray20, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 35 });
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str3 = WhichPath.makeDecision((int) ' ', (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 5" + "'", str3, "Path 5");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 10, (int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int[] intArray0 = null;
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        searching.BinarySearch binarySearch2 = new searching.BinarySearch();
        int[] intArray5 = new int[] { (byte) 100, (short) 10 };
        int int7 = binarySearch2.search(intArray5, (int) '4');
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        int int13 = binarySearch2.search(intArray10, (int) 'a');
        int int15 = linearSearch1.search(intArray10, (int) ' ');
        searching.BinarySearch binarySearch16 = new searching.BinarySearch();
        int[] intArray19 = new int[] { (byte) 100, (short) 10 };
        int int21 = binarySearch16.search(intArray19, (int) '4');
        int int23 = linearSearch1.search(intArray19, 1);
        searching.BinarySearch binarySearch24 = new searching.BinarySearch();
        int[] intArray27 = new int[] { (byte) 100, (short) 10 };
        int int29 = binarySearch24.search(intArray27, (int) '4');
        searching.BinarySearch binarySearch30 = new searching.BinarySearch();
        int[] intArray33 = new int[] { (byte) 100, (short) 10 };
        int int35 = binarySearch30.search(intArray33, (int) '4');
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        int int41 = binarySearch30.search(intArray38, (int) 'a');
        int int43 = binarySearch24.search(intArray38, 100);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray0, intArray19, intArray38, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str3 = WhichPath.makeDecision((-1), (int) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        searching.BinarySearch binarySearch19 = new searching.BinarySearch();
        int[] intArray22 = new int[] { (byte) 100, (short) 10 };
        int int24 = binarySearch19.search(intArray22, (int) '4');
        int[] intArray28 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray28, 0);
        int[] intArray33 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray33);
        sorting.MergeSort.sort(intArray33, 1);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        sorting.MergeSort.merge(intArray28, intArray33, intArray39, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray8, intArray22, intArray28, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, 10 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int[] intArray2 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray2);
        searching.BinarySearch binarySearch4 = new searching.BinarySearch();
        int[] intArray7 = new int[] { (byte) 100, (short) 10 };
        int int9 = binarySearch4.search(intArray7, (int) '4');
        int[] intArray12 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray12);
        int int15 = binarySearch4.search(intArray12, (int) 'a');
        int[] intArray18 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray18);
        sorting.MergeSort.sort(intArray18, 1);
        int int23 = binarySearch4.search(intArray18, (int) (short) 1);
        sorting.SelectionSort.sort(intArray18);
        int[] intArray31 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray31);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray2, intArray18, intArray31, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 0, 1, 10, 35, 100 });
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = calculator0.squareRoot((-2.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch19 = new searching.LinearSearch();
        searching.BinarySearch binarySearch20 = new searching.BinarySearch();
        int[] intArray23 = new int[] { (byte) 100, (short) 10 };
        int int25 = binarySearch20.search(intArray23, (int) '4');
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        int int31 = binarySearch20.search(intArray28, (int) 'a');
        int int33 = linearSearch19.search(intArray28, (int) ' ');
        searching.LinearSearch linearSearch34 = new searching.LinearSearch();
        int[] intArray38 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray38, 0);
        int[] intArray43 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray43);
        sorting.MergeSort.sort(intArray43, 1);
        int[] intArray49 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray49);
        sorting.MergeSort.merge(intArray38, intArray43, intArray49, (int) (short) 0, (int) (short) 1);
        int int55 = linearSearch34.search(intArray49, 100);
        searching.BinarySearch binarySearch56 = new searching.BinarySearch();
        int[] intArray59 = new int[] { (byte) 100, (short) 10 };
        int int61 = binarySearch56.search(intArray59, (int) '4');
        int[] intArray64 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray64);
        int int67 = binarySearch56.search(intArray64, (int) (short) 10);
        int int69 = linearSearch34.search(intArray64, 1);
        sorting.MergeSort.merge(intArray3, intArray28, intArray64, (int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass73 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 0, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 10, 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 1, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str3 = WhichPath.makeDecision(5, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        int int6 = binarySearch1.search(intArray4, (int) '4');
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        int int12 = binarySearch1.search(intArray9, (int) 'a');
        int int14 = linearSearch0.search(intArray9, (int) ' ');
        sorting.SelectionSort.sort(intArray9);
        searching.LinearSearch linearSearch16 = new searching.LinearSearch();
        searching.BinarySearch binarySearch17 = new searching.BinarySearch();
        int[] intArray20 = new int[] { (byte) 100, (short) 10 };
        int int22 = binarySearch17.search(intArray20, (int) '4');
        int[] intArray25 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray25);
        int int28 = binarySearch17.search(intArray25, (int) 'a');
        int int30 = linearSearch16.search(intArray25, (int) ' ');
        searching.LinearSearch linearSearch31 = new searching.LinearSearch();
        int[] intArray35 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray35, 0);
        int[] intArray40 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray40);
        sorting.MergeSort.sort(intArray40, 1);
        int[] intArray46 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray46);
        sorting.MergeSort.merge(intArray35, intArray40, intArray46, (int) (short) 0, (int) (short) 1);
        int int52 = linearSearch31.search(intArray46, 100);
        int[] intArray56 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray56, 0);
        int[] intArray62 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray62, 0);
        int[] intArray67 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray67);
        sorting.MergeSort.sort(intArray67, 1);
        int[] intArray73 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray73);
        sorting.MergeSort.merge(intArray62, intArray67, intArray73, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray46, intArray56, intArray67, (int) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray9, intArray25, intArray46, (int) (byte) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 1, 35 });
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str3 = WhichPath.makeDecision(10, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double14 = calculator0.add((-0.0d), (-45.0d));
        double double17 = calculator0.divide((double) ' ', (double) (byte) 100);
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-45.0d) + "'", double14 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.32d + "'", double17 == 0.32d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray31 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray31, 0);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.sort(intArray36, 1);
        int[] intArray42 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray42);
        sorting.MergeSort.merge(intArray31, intArray36, intArray42, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray15, intArray25, intArray36, (int) (byte) -1, (int) (short) 1);
        int[] intArray52 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray52);
        sorting.MergeSort.sort(intArray52, 1);
        searching.LinearSearch linearSearch56 = new searching.LinearSearch();
        searching.BinarySearch binarySearch57 = new searching.BinarySearch();
        int[] intArray60 = new int[] { (byte) 100, (short) 10 };
        int int62 = binarySearch57.search(intArray60, (int) '4');
        int[] intArray65 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray65);
        int int68 = binarySearch57.search(intArray65, (int) 'a');
        int int70 = linearSearch56.search(intArray65, (int) ' ');
        searching.BinarySearch binarySearch71 = new searching.BinarySearch();
        int[] intArray74 = new int[] { (byte) 100, (short) 10 };
        int int76 = binarySearch71.search(intArray74, (int) '4');
        int int78 = linearSearch56.search(intArray74, 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray36, intArray52, intArray74, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.add((double) 0L, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = calculator0.divide((-1.0d), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = examGrades0.grade((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.String str3 = WhichPath.makeDecision((-1), 5, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        searching.BinarySearch binarySearch6 = new searching.BinarySearch();
        int[] intArray9 = new int[] { (byte) 100, (short) 10 };
        int int11 = binarySearch6.search(intArray9, (int) '4');
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        int int17 = binarySearch6.search(intArray14, (int) 'a');
        int int19 = binarySearch0.search(intArray14, 100);
        searching.BinarySearch binarySearch20 = new searching.BinarySearch();
        int[] intArray23 = new int[] { (byte) 100, (short) 10 };
        int int25 = binarySearch20.search(intArray23, (int) '4');
        sorting.QuickSort quickSort26 = new sorting.QuickSort();
        int[] intArray33 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray33);
        quickSort26.sort(intArray33, 1, 1);
        int int39 = binarySearch20.search(intArray33, (int) (short) 0);
        searching.LinearSearch linearSearch40 = new searching.LinearSearch();
        searching.BinarySearch binarySearch41 = new searching.BinarySearch();
        int[] intArray44 = new int[] { (byte) 100, (short) 10 };
        int int46 = binarySearch41.search(intArray44, (int) '4');
        int[] intArray49 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray49);
        int int52 = binarySearch41.search(intArray49, (int) 'a');
        int int54 = linearSearch40.search(intArray49, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray14, intArray33, intArray49, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str3 = WhichPath.makeDecision(0, 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 1, (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 10, (int) (short) 0, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        quickSort0.sort(intArray9, (int) (byte) 0, (int) (byte) 1);
        searching.LinearSearch linearSearch23 = new searching.LinearSearch();
        searching.BinarySearch binarySearch24 = new searching.BinarySearch();
        int[] intArray27 = new int[] { (byte) 100, (short) 10 };
        int int29 = binarySearch24.search(intArray27, (int) '4');
        int[] intArray32 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray32);
        int int35 = binarySearch24.search(intArray32, (int) 'a');
        int int37 = linearSearch23.search(intArray32, (int) ' ');
        searching.BinarySearch binarySearch38 = new searching.BinarySearch();
        int[] intArray41 = new int[] { (byte) 100, (short) 10 };
        int int43 = binarySearch38.search(intArray41, (int) '4');
        int int45 = linearSearch23.search(intArray41, 1);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray41, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, (double) 0L);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        searching.BinarySearch binarySearch12 = new searching.BinarySearch();
        int[] intArray15 = new int[] { (byte) 100, (short) 10 };
        int int17 = binarySearch12.search(intArray15, (int) '4');
        int[] intArray20 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray20);
        int int23 = binarySearch12.search(intArray20, (int) 'a');
        int[] intArray27 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray27, 0);
        int[] intArray32 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray32);
        sorting.MergeSort.sort(intArray32, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        sorting.MergeSort.merge(intArray27, intArray32, intArray38, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch43 = new searching.LinearSearch();
        searching.BinarySearch binarySearch44 = new searching.BinarySearch();
        int[] intArray47 = new int[] { (byte) 100, (short) 10 };
        int int49 = binarySearch44.search(intArray47, (int) '4');
        int[] intArray52 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray52);
        int int55 = binarySearch44.search(intArray52, (int) 'a');
        int int57 = linearSearch43.search(intArray52, (int) ' ');
        searching.LinearSearch linearSearch58 = new searching.LinearSearch();
        int[] intArray62 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray62, 0);
        int[] intArray67 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray67);
        sorting.MergeSort.sort(intArray67, 1);
        int[] intArray73 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray73);
        sorting.MergeSort.merge(intArray62, intArray67, intArray73, (int) (short) 0, (int) (short) 1);
        int int79 = linearSearch58.search(intArray73, 100);
        searching.BinarySearch binarySearch80 = new searching.BinarySearch();
        int[] intArray83 = new int[] { (byte) 100, (short) 10 };
        int int85 = binarySearch80.search(intArray83, (int) '4');
        int[] intArray88 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray88);
        int int91 = binarySearch80.search(intArray88, (int) (short) 10);
        int int93 = linearSearch58.search(intArray88, 1);
        sorting.MergeSort.merge(intArray27, intArray52, intArray88, (int) (byte) -1, (int) (byte) -1);
        sorting.MergeSort.merge(intArray8, intArray20, intArray52, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber((int) (short) 100);
        java.lang.String str4 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str6 = whatKindOfNumber0.processNumber((int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = whatKindOfNumber0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Positive Even Not Multiple of 3" + "'", str2, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Negative Odd" + "'", str4, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Positive Even Not Multiple of 3" + "'", str6, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 0, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray31 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray31, 0);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.sort(intArray36, 1);
        int[] intArray42 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray42);
        sorting.MergeSort.merge(intArray31, intArray36, intArray42, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray15, intArray25, intArray36, (int) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray36, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 35 });
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        int[] intArray15 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray15, 0);
        int[] intArray20 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray20);
        sorting.MergeSort.sort(intArray20, 1);
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        sorting.MergeSort.merge(intArray15, intArray20, intArray26, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray20, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        searching.BinarySearch binarySearch6 = new searching.BinarySearch();
        int[] intArray9 = new int[] { (byte) 100, (short) 10 };
        int int11 = binarySearch6.search(intArray9, (int) '4');
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        int int17 = binarySearch6.search(intArray14, (int) 'a');
        int int19 = binarySearch0.search(intArray14, 100);
        sorting.SelectionSort.sort(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str3 = WhichPath.makeDecision(10, (-1), 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double9 = calculator0.squareRoot(12.288205727444508d);
        double double11 = calculator0.square(9.9999999E7d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = calculator0.divide((double) 10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.505453712067028d + "'", double9 == 3.505453712067028d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.9999998E15d + "'", double11 == 9.9999998E15d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = examGrades0.grade((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 10, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        searching.BinarySearch binarySearch22 = new searching.BinarySearch();
        int[] intArray25 = new int[] { (byte) 100, (short) 10 };
        int int27 = binarySearch22.search(intArray25, (int) '4');
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        int int33 = binarySearch22.search(intArray30, (int) (short) 10);
        int int35 = linearSearch0.search(intArray30, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        int int41 = linearSearch0.search(intArray38, (int) (short) -1);
        sorting.QuickSort quickSort42 = new sorting.QuickSort();
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        sorting.MergeSort.sort(intArray51, 1);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.merge(intArray46, intArray51, intArray57, (int) (short) 0, (int) (short) 1);
        quickSort42.sort(intArray51, (int) (byte) 0, (int) (byte) 1);
        int int66 = linearSearch0.search(intArray51, 100);
        int[] intArray67 = null;
        sorting.InsertionSort insertionSort68 = new sorting.InsertionSort();
        int[] intArray71 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray71);
        sorting.MergeSort.sort(intArray71, 1);
        insertionSort68.sort(intArray71);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray51, intArray67, intArray71, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 35 });
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.add((double) 0L, (double) (byte) -1);
        double double8 = calculator0.multiply((double) (-1L), 1.0E8d);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0E8d) + "'", double8 == (-1.0E8d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String str3 = WhichPath.makeDecision((int) 'a', (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = calculator0.divide(1500.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int[] intArray5 = new int[] { '#', 'a', (byte) 1, 5, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 97, 1, 5, 32 });
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch19 = new searching.LinearSearch();
        searching.BinarySearch binarySearch20 = new searching.BinarySearch();
        int[] intArray23 = new int[] { (byte) 100, (short) 10 };
        int int25 = binarySearch20.search(intArray23, (int) '4');
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        int int31 = binarySearch20.search(intArray28, (int) 'a');
        int int33 = linearSearch19.search(intArray28, (int) ' ');
        searching.LinearSearch linearSearch34 = new searching.LinearSearch();
        int[] intArray38 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray38, 0);
        int[] intArray43 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray43);
        sorting.MergeSort.sort(intArray43, 1);
        int[] intArray49 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray49);
        sorting.MergeSort.merge(intArray38, intArray43, intArray49, (int) (short) 0, (int) (short) 1);
        int int55 = linearSearch34.search(intArray49, 100);
        searching.BinarySearch binarySearch56 = new searching.BinarySearch();
        int[] intArray59 = new int[] { (byte) 100, (short) 10 };
        int int61 = binarySearch56.search(intArray59, (int) '4');
        int[] intArray64 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray64);
        int int67 = binarySearch56.search(intArray64, (int) (short) 10);
        int int69 = linearSearch34.search(intArray64, 1);
        sorting.MergeSort.merge(intArray3, intArray28, intArray64, (int) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray28, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double9 = calculator0.squareRoot(12.288205727444508d);
        double double11 = calculator0.square(9.9999999E7d);
        double double14 = calculator0.divide((double) '#', (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = calculator0.squareRoot((-2.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.505453712067028d + "'", double9 == 3.505453712067028d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.9999998E15d + "'", double11 == 9.9999998E15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.5d + "'", double14 == 3.5d);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int[] intArray6 = new int[] { (byte) 100, (byte) -1, (byte) 1, (short) 0, 'a', (byte) 10 };
        int[] intArray13 = new int[] { (byte) 100, (byte) -1, (byte) 1, (short) 0, 'a', (byte) 10 };
        int[] intArray20 = new int[] { (byte) 100, (byte) -1, (byte) 1, (short) 0, 'a', (byte) 10 };
        int[] intArray27 = new int[] { (byte) 100, (byte) -1, (byte) 1, (short) 0, 'a', (byte) 10 };
        int[] intArray34 = new int[] { (byte) 100, (byte) -1, (byte) 1, (short) 0, 'a', (byte) 10 };
        int[] intArray41 = new int[] { (byte) 100, (byte) -1, (byte) 1, (short) 0, 'a', (byte) 10 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        int int43 = NestedLoops.calculateSum(intArray42);
        int int44 = NestedLoops.calculateSum(intArray42);
        int int45 = NestedLoops.calculateSum(intArray42);
        int int46 = NestedLoops.calculateSum(intArray42);
        int int47 = NestedLoops.calculateSum(intArray42);
        java.lang.Class<?> wildcardClass48 = intArray42.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 1, 0, 97, 10 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 100, (-1), 1, 0, 97, 10 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 100, (-1), 1, 0, 97, 10 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 100, (-1), 1, 0, 97, 10 });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 100, (-1), 1, 0, 97, 10 });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 100, (-1), 1, 0, 97, 10 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            sorting.SelectionSort.sort(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 0, 2, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        quickSort0.sort(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray26 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray26, 0);
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        sorting.MergeSort.sort(intArray31, 1);
        int[] intArray37 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray37);
        sorting.MergeSort.merge(intArray26, intArray31, intArray37, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch42 = new searching.LinearSearch();
        searching.BinarySearch binarySearch43 = new searching.BinarySearch();
        int[] intArray46 = new int[] { (byte) 100, (short) 10 };
        int int48 = binarySearch43.search(intArray46, (int) '4');
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        int int54 = binarySearch43.search(intArray51, (int) 'a');
        int int56 = linearSearch42.search(intArray51, (int) ' ');
        searching.LinearSearch linearSearch57 = new searching.LinearSearch();
        int[] intArray61 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray61, 0);
        int[] intArray66 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray66);
        sorting.MergeSort.sort(intArray66, 1);
        int[] intArray72 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray72);
        sorting.MergeSort.merge(intArray61, intArray66, intArray72, (int) (short) 0, (int) (short) 1);
        int int78 = linearSearch57.search(intArray72, 100);
        searching.BinarySearch binarySearch79 = new searching.BinarySearch();
        int[] intArray82 = new int[] { (byte) 100, (short) 10 };
        int int84 = binarySearch79.search(intArray82, (int) '4');
        int[] intArray87 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray87);
        int int90 = binarySearch79.search(intArray87, (int) (short) 10);
        int int92 = linearSearch57.search(intArray87, 1);
        sorting.MergeSort.merge(intArray26, intArray51, intArray87, (int) (byte) -1, (int) (byte) -1);
        quickSort0.sort(intArray26, (int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass99 = quickSort0.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertArrayEquals(intArray87, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.multiply((double) '4', (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double10 = calculator0.squareRoot((-52.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-52.0d) + "'", double8 == (-52.0d));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = calculator0.divide((-1500.0d), (-0.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str3 = WhichPath.makeDecision((int) '4', (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str3 = WhichPath.makeDecision(0, 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        int[] intArray24 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray24, 0);
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        sorting.MergeSort.sort(intArray29, 1);
        int[] intArray35 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray35);
        sorting.MergeSort.merge(intArray24, intArray29, intArray35, (int) (short) 0, (int) (short) 1);
        int[] intArray40 = null;
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray4, intArray29, intArray40, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 35 });
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str3 = WhichPath.makeDecision((int) '4', (int) (short) 1, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 2" + "'", str3, "Path 2");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.subtract((double) (short) 0, 1500.0d);
        double double13 = calculator0.add((-52.0d), (-1.0E8d));
        // The following exception was thrown during execution in test generation
        try {
            double double16 = calculator0.divide(0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1500.0d) + "'", double10 == (-1500.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.00000052E8d) + "'", double13 == (-1.00000052E8d));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort2 = new sorting.BubbleSort();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0 };
        bubbleSort2.sort(intArray4);
        sorting.BubbleSort bubbleSort6 = new sorting.BubbleSort();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort6.sort(intArray11);
        bubbleSort2.sort(intArray11);
        bubbleSort1.sort(intArray11);
        bubbleSort0.sort(intArray11);
        sorting.BubbleSort bubbleSort16 = new sorting.BubbleSort();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort16.sort(intArray21);
        sorting.BubbleSort bubbleSort23 = new sorting.BubbleSort();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort23.sort(intArray28);
        bubbleSort16.sort(intArray28);
        bubbleSort0.sort(intArray28);
        java.lang.Class<?> wildcardClass32 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        searching.LinearSearch linearSearch12 = new searching.LinearSearch();
        int[] intArray16 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray16, 0);
        int int20 = linearSearch12.search(intArray16, (int) ' ');
        int int22 = binarySearch0.search(intArray16, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String str3 = WhichPath.makeDecision((int) 'a', (int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 5" + "'", str3, "Path 5");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        ExamGrades examGrades0 = new ExamGrades();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = examGrades0.grade((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int[] intArray2 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray2, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, 35 });
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 0, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double8 = calculator0.multiply((double) (short) 10, (double) (short) 100);
        double double11 = calculator0.subtract((double) (byte) 100, (double) 10L);
        double double13 = calculator0.squareRoot((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = calculator0.divide((double) (short) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1000.0d + "'", double8 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) 'a');
        int int4 = examGrades0.grade(5);
        java.lang.Class<?> wildcardClass5 = examGrades0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.String str3 = WhichPath.makeDecision((-1), (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        int int6 = binarySearch1.search(intArray4, (int) '4');
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        int int12 = binarySearch1.search(intArray9, (int) 'a');
        int int14 = linearSearch0.search(intArray9, (int) ' ');
        searching.BinarySearch binarySearch15 = new searching.BinarySearch();
        int[] intArray18 = new int[] { (byte) 100, (short) 10 };
        int int20 = binarySearch15.search(intArray18, (int) '4');
        int int22 = linearSearch0.search(intArray18, 1);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        searching.BinarySearch binarySearch29 = new searching.BinarySearch();
        int[] intArray32 = new int[] { (byte) 100, (short) 10 };
        int int34 = binarySearch29.search(intArray32, (int) '4');
        int[] intArray37 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray37);
        int int40 = binarySearch29.search(intArray37, (int) 'a');
        int int42 = binarySearch23.search(intArray37, 100);
        sorting.QuickSort quickSort43 = new sorting.QuickSort();
        int[] intArray47 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray47, 0);
        int[] intArray52 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray52);
        sorting.MergeSort.sort(intArray52, 1);
        int[] intArray58 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray58);
        sorting.MergeSort.merge(intArray47, intArray52, intArray58, (int) (short) 0, (int) (short) 1);
        quickSort43.sort(intArray52, (int) (byte) 0, (int) (byte) 1);
        int int67 = binarySearch23.search(intArray52, 0);
        int int69 = linearSearch0.search(intArray52, 10);
        java.lang.Class<?> wildcardClass70 = intArray52.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray14, (int) (short) 0);
        searching.LinearSearch linearSearch21 = new searching.LinearSearch();
        searching.BinarySearch binarySearch22 = new searching.BinarySearch();
        int[] intArray25 = new int[] { (byte) 100, (short) 10 };
        int int27 = binarySearch22.search(intArray25, (int) '4');
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        int int33 = binarySearch22.search(intArray30, (int) 'a');
        int int35 = linearSearch21.search(intArray30, (int) ' ');
        searching.BinarySearch binarySearch36 = new searching.BinarySearch();
        int[] intArray39 = new int[] { (byte) 100, (short) 10 };
        int int41 = binarySearch36.search(intArray39, (int) '4');
        int int43 = linearSearch21.search(intArray39, 1);
        sorting.SelectionSort.sort(intArray39);
        searching.BinarySearch binarySearch45 = new searching.BinarySearch();
        int[] intArray48 = new int[] { (byte) 100, (short) 10 };
        int int50 = binarySearch45.search(intArray48, (int) '4');
        int[] intArray53 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray53);
        int int56 = binarySearch45.search(intArray53, (int) (short) 10);
        searching.BinarySearch binarySearch57 = new searching.BinarySearch();
        int[] intArray60 = new int[] { (byte) 100, (short) 10 };
        int int62 = binarySearch57.search(intArray60, (int) '4');
        searching.BinarySearch binarySearch63 = new searching.BinarySearch();
        int[] intArray66 = new int[] { (byte) 100, (short) 10 };
        int int68 = binarySearch63.search(intArray66, (int) '4');
        int[] intArray71 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray71);
        int int74 = binarySearch63.search(intArray71, (int) 'a');
        int int76 = binarySearch57.search(intArray71, 100);
        sorting.SelectionSort.sort(intArray71);
        int int79 = binarySearch45.search(intArray71, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray14, intArray39, intArray71, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 10 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        int int34 = binarySearch23.search(intArray31, (int) (short) 10);
        int int36 = linearSearch1.search(intArray31, 1);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = linearSearch1.search(intArray39, (int) (short) -1);
        int int44 = binarySearch0.search(intArray39, (int) (short) 100);
        searching.BinarySearch binarySearch45 = new searching.BinarySearch();
        int[] intArray48 = new int[] { (byte) 100, (short) 10 };
        int int50 = binarySearch45.search(intArray48, (int) '4');
        sorting.QuickSort quickSort51 = new sorting.QuickSort();
        int[] intArray58 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray58);
        quickSort51.sort(intArray58, 1, 1);
        int int64 = binarySearch45.search(intArray58, (int) (short) 0);
        int int66 = binarySearch0.search(intArray58, 5);
        int[] intArray70 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray70, 0);
        int[] intArray75 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray75);
        sorting.MergeSort.sort(intArray75, 1);
        int[] intArray81 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray81);
        sorting.MergeSort.merge(intArray70, intArray75, intArray81, (int) (short) 0, (int) (short) 1);
        int int87 = binarySearch0.search(intArray75, 0);
        int[] intArray88 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int90 = binarySearch0.search(intArray88, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort1.sort(intArray6);
        sorting.BubbleSort bubbleSort8 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort9 = new sorting.BubbleSort();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0 };
        bubbleSort9.sort(intArray11);
        sorting.BubbleSort bubbleSort13 = new sorting.BubbleSort();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort13.sort(intArray18);
        bubbleSort9.sort(intArray18);
        bubbleSort8.sort(intArray18);
        bubbleSort1.sort(intArray18);
        bubbleSort0.sort(intArray18);
        sorting.BubbleSort bubbleSort24 = new sorting.BubbleSort();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort24.sort(intArray29);
        bubbleSort0.sort(intArray29);
        java.lang.Integer[] intArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            bubbleSort0.sort(intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int int8 = linearSearch0.search(intArray4, (int) ' ');
        int[] intArray12 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray12, 0);
        int[] intArray17 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray17);
        sorting.MergeSort.sort(intArray17, 1);
        int[] intArray23 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray23);
        sorting.MergeSort.merge(intArray12, intArray17, intArray23, (int) (short) 0, (int) (short) 1);
        int int29 = linearSearch0.search(intArray17, (int) (short) 1);
        java.lang.Class<?> wildcardClass30 = linearSearch0.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        searching.LinearSearch linearSearch2 = new searching.LinearSearch();
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray6, 0);
        int[] intArray11 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray11);
        sorting.MergeSort.sort(intArray11, 1);
        int[] intArray17 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray17);
        sorting.MergeSort.merge(intArray6, intArray11, intArray17, (int) (short) 0, (int) (short) 1);
        int int23 = linearSearch2.search(intArray17, 100);
        searching.BinarySearch binarySearch24 = new searching.BinarySearch();
        int[] intArray27 = new int[] { (byte) 100, (short) 10 };
        int int29 = binarySearch24.search(intArray27, (int) '4');
        int[] intArray32 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray32);
        int int35 = binarySearch24.search(intArray32, (int) (short) 10);
        int int37 = linearSearch2.search(intArray32, 1);
        int[] intArray40 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray40);
        int int43 = linearSearch2.search(intArray40, (int) (short) -1);
        int int45 = binarySearch1.search(intArray40, (int) (short) 100);
        searching.BinarySearch binarySearch46 = new searching.BinarySearch();
        int[] intArray49 = new int[] { (byte) 100, (short) 10 };
        int int51 = binarySearch46.search(intArray49, (int) '4');
        sorting.QuickSort quickSort52 = new sorting.QuickSort();
        int[] intArray59 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray59);
        quickSort52.sort(intArray59, 1, 1);
        int int65 = binarySearch46.search(intArray59, (int) (short) 0);
        int int67 = binarySearch1.search(intArray59, 5);
        int[] intArray71 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray71, 0);
        int[] intArray76 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray76);
        sorting.MergeSort.sort(intArray76, 1);
        int[] intArray82 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray82);
        sorting.MergeSort.merge(intArray71, intArray76, intArray82, (int) (short) 0, (int) (short) 1);
        int int88 = binarySearch1.search(intArray76, 0);
        int[] intArray90 = new int[] { (byte) 1 };
        int int92 = binarySearch1.search(intArray90, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray90, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str3 = WhichPath.makeDecision((int) 'a', 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 4" + "'", str3, "Path 4");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch19 = new searching.LinearSearch();
        searching.BinarySearch binarySearch20 = new searching.BinarySearch();
        int[] intArray23 = new int[] { (byte) 100, (short) 10 };
        int int25 = binarySearch20.search(intArray23, (int) '4');
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        int int31 = binarySearch20.search(intArray28, (int) 'a');
        int int33 = linearSearch19.search(intArray28, (int) ' ');
        searching.LinearSearch linearSearch34 = new searching.LinearSearch();
        int[] intArray38 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray38, 0);
        int[] intArray43 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray43);
        sorting.MergeSort.sort(intArray43, 1);
        int[] intArray49 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray49);
        sorting.MergeSort.merge(intArray38, intArray43, intArray49, (int) (short) 0, (int) (short) 1);
        int int55 = linearSearch34.search(intArray49, 100);
        searching.BinarySearch binarySearch56 = new searching.BinarySearch();
        int[] intArray59 = new int[] { (byte) 100, (short) 10 };
        int int61 = binarySearch56.search(intArray59, (int) '4');
        int[] intArray64 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray64);
        int int67 = binarySearch56.search(intArray64, (int) (short) 10);
        int int69 = linearSearch34.search(intArray64, 1);
        sorting.MergeSort.merge(intArray3, intArray28, intArray64, (int) (byte) -1, (int) (byte) -1);
        sorting.SelectionSort.sort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str3 = WhichPath.makeDecision((int) 'a', (int) (short) 0, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 2" + "'", str3, "Path 2");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str3 = WhichPath.makeDecision((int) ' ', 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 1" + "'", str3, "Path 1");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.sort(intArray14, 1);
        int int19 = binarySearch0.search(intArray14, (int) (short) 1);
        sorting.InsertionSort insertionSort20 = new sorting.InsertionSort();
        int[] intArray23 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray23);
        sorting.MergeSort.sort(intArray23, 1);
        insertionSort20.sort(intArray23);
        searching.BinarySearch binarySearch28 = new searching.BinarySearch();
        searching.LinearSearch linearSearch29 = new searching.LinearSearch();
        int[] intArray33 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray33, 0);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        sorting.MergeSort.sort(intArray38, 1);
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        sorting.MergeSort.merge(intArray33, intArray38, intArray44, (int) (short) 0, (int) (short) 1);
        int int50 = linearSearch29.search(intArray44, 100);
        searching.BinarySearch binarySearch51 = new searching.BinarySearch();
        int[] intArray54 = new int[] { (byte) 100, (short) 10 };
        int int56 = binarySearch51.search(intArray54, (int) '4');
        int[] intArray59 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray59);
        int int62 = binarySearch51.search(intArray59, (int) (short) 10);
        int int64 = linearSearch29.search(intArray59, 1);
        int[] intArray67 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray67);
        int int70 = linearSearch29.search(intArray67, (int) (short) -1);
        int int72 = binarySearch28.search(intArray67, (int) (short) 100);
        insertionSort20.sort(intArray67);
        int int75 = binarySearch0.search(intArray67, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray67, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch20 = new searching.LinearSearch();
        searching.BinarySearch binarySearch21 = new searching.BinarySearch();
        int[] intArray24 = new int[] { (byte) 100, (short) 10 };
        int int26 = binarySearch21.search(intArray24, (int) '4');
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        int int32 = binarySearch21.search(intArray29, (int) 'a');
        int int34 = linearSearch20.search(intArray29, (int) ' ');
        searching.LinearSearch linearSearch35 = new searching.LinearSearch();
        int[] intArray39 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray39, 0);
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        sorting.MergeSort.sort(intArray44, 1);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        sorting.MergeSort.merge(intArray39, intArray44, intArray50, (int) (short) 0, (int) (short) 1);
        int int56 = linearSearch35.search(intArray50, 100);
        searching.BinarySearch binarySearch57 = new searching.BinarySearch();
        int[] intArray60 = new int[] { (byte) 100, (short) 10 };
        int int62 = binarySearch57.search(intArray60, (int) '4');
        int[] intArray65 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray65);
        int int68 = binarySearch57.search(intArray65, (int) (short) 10);
        int int70 = linearSearch35.search(intArray65, 1);
        sorting.MergeSort.merge(intArray4, intArray29, intArray65, (int) (byte) -1, (int) (byte) -1);
        insertionSort0.sort(intArray4);
        int[] intArray75 = null;
        // The following exception was thrown during execution in test generation
        try {
            insertionSort0.sort(intArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        quickSort0.sort(intArray9, (int) (byte) 0, (int) (byte) 1);
        sorting.InsertionSort insertionSort23 = new sorting.InsertionSort();
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        sorting.MergeSort.sort(intArray26, 1);
        insertionSort23.sort(intArray26);
        int[] intArray34 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray34, 0);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        sorting.MergeSort.sort(intArray39, 1);
        int[] intArray45 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray45);
        sorting.MergeSort.merge(intArray34, intArray39, intArray45, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray45, (int) (short) 0);
        sorting.SelectionSort.sort(intArray45);
        sorting.SelectionSort.sort(intArray45);
        insertionSort23.sort(intArray45);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray45, 2, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1, 35 });
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = calculator0.squareRoot((-2.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.sort(intArray14, 1);
        int int19 = binarySearch0.search(intArray14, (int) (short) 1);
        sorting.InsertionSort insertionSort20 = new sorting.InsertionSort();
        int[] intArray23 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray23);
        sorting.MergeSort.sort(intArray23, 1);
        insertionSort20.sort(intArray23);
        searching.BinarySearch binarySearch28 = new searching.BinarySearch();
        searching.LinearSearch linearSearch29 = new searching.LinearSearch();
        int[] intArray33 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray33, 0);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        sorting.MergeSort.sort(intArray38, 1);
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        sorting.MergeSort.merge(intArray33, intArray38, intArray44, (int) (short) 0, (int) (short) 1);
        int int50 = linearSearch29.search(intArray44, 100);
        searching.BinarySearch binarySearch51 = new searching.BinarySearch();
        int[] intArray54 = new int[] { (byte) 100, (short) 10 };
        int int56 = binarySearch51.search(intArray54, (int) '4');
        int[] intArray59 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray59);
        int int62 = binarySearch51.search(intArray59, (int) (short) 10);
        int int64 = linearSearch29.search(intArray59, 1);
        int[] intArray67 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray67);
        int int70 = linearSearch29.search(intArray67, (int) (short) -1);
        int int72 = binarySearch28.search(intArray67, (int) (short) 100);
        insertionSort20.sort(intArray67);
        int int75 = binarySearch0.search(intArray67, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray67, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber((int) (short) 100);
        java.lang.String str4 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str6 = whatKindOfNumber0.processNumber(100);
        java.lang.String str8 = whatKindOfNumber0.processNumber(10);
        java.lang.Class<?> wildcardClass9 = whatKindOfNumber0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Positive Even Not Multiple of 3" + "'", str2, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Negative Odd" + "'", str4, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Positive Even Not Multiple of 3" + "'", str6, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Positive Even Not Multiple of 3" + "'", str8, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 10, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade(1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = examGrades0.grade((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double9 = calculator0.square(2.02d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = calculator0.divide(111.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0804d + "'", double9 == 4.0804d);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray14, (int) (short) 0);
        sorting.SelectionSort.sort(intArray14);
        sorting.SelectionSort.sort(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.divide((double) 100L, (double) 1L);
        double double12 = calculator0.square((double) 5);
        double double15 = calculator0.add(1.5828625057366885d, 4.5E-7d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculator0.divide(25.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.5828629557366884d + "'", double15 == 1.5828629557366884d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.subtract(1.0E8d, 3000.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculator0.squareRoot((-6.62251642384104E13d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.9997E7d + "'", double16 == 9.9997E7d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        quickSort0.sort(intArray17, 100, 0);
        java.lang.Class<?> wildcardClass38 = quickSort0.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 1);
        int int6 = examGrades0.grade((int) ' ');
        int int8 = examGrades0.grade((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = examGrades0.grade((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (byte) 0);
        int int4 = examGrades0.grade((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str3 = WhichPath.makeDecision((-1), 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        sorting.QuickSort quickSort6 = new sorting.QuickSort();
        int[] intArray13 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray13);
        quickSort6.sort(intArray13, 1, 1);
        int int19 = binarySearch0.search(intArray13, (int) (short) 0);
        sorting.QuickSort quickSort20 = new sorting.QuickSort();
        int[] intArray27 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray27);
        quickSort20.sort(intArray27, 1, 1);
        int int33 = binarySearch0.search(intArray27, (int) (byte) 1);
        java.lang.Class<?> wildcardClass34 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.subtract(0.0d, 8880400.0d);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8880400.0d) + "'", double14 == (-8880400.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        searching.LinearSearch linearSearch22 = new searching.LinearSearch();
        int[] intArray26 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray26, 0);
        int int30 = linearSearch22.search(intArray26, (int) ' ');
        int[] intArray34 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray34, 0);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        sorting.MergeSort.sort(intArray39, 1);
        int[] intArray45 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray45);
        sorting.MergeSort.merge(intArray34, intArray39, intArray45, (int) (short) 0, (int) (short) 1);
        int int51 = linearSearch22.search(intArray39, (int) (short) 1);
        int int53 = linearSearch0.search(intArray39, 100);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray39, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort2 = new sorting.BubbleSort();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0 };
        bubbleSort2.sort(intArray4);
        sorting.BubbleSort bubbleSort6 = new sorting.BubbleSort();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort6.sort(intArray11);
        bubbleSort2.sort(intArray11);
        bubbleSort1.sort(intArray11);
        bubbleSort0.sort(intArray11);
        sorting.BubbleSort bubbleSort16 = new sorting.BubbleSort();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort16.sort(intArray21);
        sorting.BubbleSort bubbleSort23 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort24 = new sorting.BubbleSort();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0 };
        bubbleSort24.sort(intArray26);
        sorting.BubbleSort bubbleSort28 = new sorting.BubbleSort();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort28.sort(intArray33);
        bubbleSort24.sort(intArray33);
        bubbleSort23.sort(intArray33);
        bubbleSort16.sort(intArray33);
        bubbleSort0.sort(intArray33);
        sorting.BubbleSort bubbleSort39 = new sorting.BubbleSort();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0 };
        bubbleSort39.sort(intArray41);
        sorting.BubbleSort bubbleSort43 = new sorting.BubbleSort();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort43.sort(intArray48);
        bubbleSort39.sort(intArray48);
        sorting.BubbleSort bubbleSort51 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort52 = new sorting.BubbleSort();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort52.sort(intArray57);
        sorting.BubbleSort bubbleSort59 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort60 = new sorting.BubbleSort();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0 };
        bubbleSort60.sort(intArray62);
        sorting.BubbleSort bubbleSort64 = new sorting.BubbleSort();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort64.sort(intArray69);
        bubbleSort60.sort(intArray69);
        bubbleSort59.sort(intArray69);
        bubbleSort52.sort(intArray69);
        bubbleSort51.sort(intArray69);
        bubbleSort39.sort(intArray69);
        bubbleSort0.sort(intArray69);
        java.lang.Class<?> wildcardClass77 = bubbleSort0.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort0.sort(intArray5);
        sorting.BubbleSort bubbleSort7 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort8 = new sorting.BubbleSort();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0 };
        bubbleSort8.sort(intArray10);
        sorting.BubbleSort bubbleSort12 = new sorting.BubbleSort();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort12.sort(intArray17);
        bubbleSort8.sort(intArray17);
        bubbleSort7.sort(intArray17);
        bubbleSort0.sort(intArray17);
        java.lang.Integer[] intArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bubbleSort0.sort(intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 10, (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String str3 = WhichPath.makeDecision((int) '#', (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 1" + "'", str3, "Path 1");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.add((double) ' ', (double) 1.0f);
        double double11 = calculator0.multiply((-2.0d), (double) 10);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 33.0d + "'", double8 == 33.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-20.0d) + "'", double11 == (-20.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) (short) 10);
        int[] intArray15 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray15, 0);
        int[] intArray20 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray20);
        sorting.MergeSort.sort(intArray20, 1);
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        sorting.MergeSort.merge(intArray15, intArray20, intArray26, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray26, (int) (short) 0);
        sorting.SelectionSort.sort(intArray26);
        sorting.SelectionSort.sort(intArray26);
        sorting.SelectionSort.sort(intArray26);
        int int37 = binarySearch0.search(intArray26, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray26, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double9 = calculator0.squareRoot(12.288205727444508d);
        double double11 = calculator0.square(9.9999999E7d);
        double double14 = calculator0.add(2.979955299664745E7d, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = calculator0.divide(4.8639953996688776E7d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.505453712067028d + "'", double9 == 3.505453712067028d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.9999998E15d + "'", double11 == 9.9999998E15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.979956299664745E7d + "'", double14 == 2.979956299664745E7d);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 0, (int) '#', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String str3 = WhichPath.makeDecision(1, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.String str3 = WhichPath.makeDecision(1, (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        int int6 = binarySearch1.search(intArray4, (int) '4');
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        int int12 = binarySearch1.search(intArray9, (int) 'a');
        int int14 = linearSearch0.search(intArray9, (int) ' ');
        searching.BinarySearch binarySearch15 = new searching.BinarySearch();
        int[] intArray18 = new int[] { (byte) 100, (short) 10 };
        int int20 = binarySearch15.search(intArray18, (int) '4');
        int int22 = linearSearch0.search(intArray18, 1);
        sorting.SelectionSort.sort(intArray18);
        java.lang.Class<?> wildcardClass24 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        int int6 = binarySearch1.search(intArray4, (int) '4');
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        int int12 = binarySearch1.search(intArray9, (int) 'a');
        int int14 = linearSearch0.search(intArray9, (int) ' ');
        searching.BinarySearch binarySearch15 = new searching.BinarySearch();
        int[] intArray18 = new int[] { (byte) 100, (short) 10 };
        int int20 = binarySearch15.search(intArray18, (int) '4');
        int int22 = linearSearch0.search(intArray18, 1);
        int[] intArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = linearSearch0.search(intArray23, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double14 = calculator0.add((-0.0d), (-45.0d));
        double double17 = calculator0.divide((double) 0L, 3.1622776601683795d);
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-45.0d) + "'", double14 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        searching.LinearSearch linearSearch21 = new searching.LinearSearch();
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        sorting.MergeSort.sort(intArray30, 1);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.merge(intArray25, intArray30, intArray36, (int) (short) 0, (int) (short) 1);
        int int42 = linearSearch21.search(intArray36, 100);
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray52 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray52, 0);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.sort(intArray57, 1);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.merge(intArray52, intArray57, intArray63, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray36, intArray46, intArray57, (int) (byte) -1, (int) (short) 1);
        insertionSort0.sort(intArray57);
        searching.LinearSearch linearSearch72 = new searching.LinearSearch();
        int[] intArray76 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray76, 0);
        int[] intArray81 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray81);
        sorting.MergeSort.sort(intArray81, 1);
        int[] intArray87 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray87);
        sorting.MergeSort.merge(intArray76, intArray81, intArray87, (int) (short) 0, (int) (short) 1);
        int int93 = linearSearch72.search(intArray87, 100);
        insertionSort0.sort(intArray87);
        int[] intArray97 = new int[] { ' ', ' ' };
        insertionSort0.sort(intArray97);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertArrayEquals(intArray87, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertArrayEquals(intArray97, new int[] { 32, 32 });
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.String str3 = WhichPath.makeDecision((int) '#', 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 4" + "'", str3, "Path 4");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String str3 = WhichPath.makeDecision(0, (-1), 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.add(1500.0d, (double) 100.0f);
        double double16 = calculator0.square((double) 'a');
        double double19 = calculator0.add((double) (short) 100, 42.288205727444506d);
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1600.0d + "'", double14 == 1600.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9409.0d + "'", double16 == 9409.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 142.2882057274445d + "'", double19 == 142.2882057274445d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) -1, (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort1.sort(intArray6);
        sorting.BubbleSort bubbleSort8 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort9 = new sorting.BubbleSort();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0 };
        bubbleSort9.sort(intArray11);
        sorting.BubbleSort bubbleSort13 = new sorting.BubbleSort();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort13.sort(intArray18);
        bubbleSort9.sort(intArray18);
        bubbleSort8.sort(intArray18);
        bubbleSort1.sort(intArray18);
        bubbleSort0.sort(intArray18);
        sorting.BubbleSort bubbleSort24 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort25 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort26 = new sorting.BubbleSort();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0 };
        bubbleSort26.sort(intArray28);
        sorting.BubbleSort bubbleSort30 = new sorting.BubbleSort();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort30.sort(intArray35);
        bubbleSort26.sort(intArray35);
        bubbleSort25.sort(intArray35);
        bubbleSort24.sort(intArray35);
        sorting.BubbleSort bubbleSort40 = new sorting.BubbleSort();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort40.sort(intArray45);
        sorting.BubbleSort bubbleSort47 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort48 = new sorting.BubbleSort();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0 };
        bubbleSort48.sort(intArray50);
        sorting.BubbleSort bubbleSort52 = new sorting.BubbleSort();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort52.sort(intArray57);
        bubbleSort48.sort(intArray57);
        bubbleSort47.sort(intArray57);
        bubbleSort40.sort(intArray57);
        bubbleSort24.sort(intArray57);
        bubbleSort0.sort(intArray57);
        sorting.BubbleSort bubbleSort64 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort65 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort66 = new sorting.BubbleSort();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0 };
        bubbleSort66.sort(intArray68);
        sorting.BubbleSort bubbleSort70 = new sorting.BubbleSort();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort70.sort(intArray75);
        bubbleSort66.sort(intArray75);
        bubbleSort65.sort(intArray75);
        bubbleSort64.sort(intArray75);
        sorting.BubbleSort bubbleSort80 = new sorting.BubbleSort();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort80.sort(intArray85);
        sorting.BubbleSort bubbleSort87 = new sorting.BubbleSort();
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort87.sort(intArray92);
        bubbleSort80.sort(intArray92);
        bubbleSort64.sort(intArray92);
        bubbleSort0.sort(intArray92);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.add((double) 0L, (double) (byte) -1);
        double double8 = calculator0.multiply((double) (-1L), 1.0E8d);
        double double11 = calculator0.divide(2.0d, (double) 100L);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0E8d) + "'", double8 == (-1.0E8d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02d + "'", double11 == 0.02d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        int int34 = binarySearch23.search(intArray31, (int) (short) 10);
        int int36 = linearSearch1.search(intArray31, 1);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = linearSearch1.search(intArray39, (int) (short) -1);
        int int44 = binarySearch0.search(intArray39, (int) (short) 100);
        searching.BinarySearch binarySearch45 = new searching.BinarySearch();
        int[] intArray48 = new int[] { (byte) 100, (short) 10 };
        int int50 = binarySearch45.search(intArray48, (int) '4');
        sorting.QuickSort quickSort51 = new sorting.QuickSort();
        int[] intArray58 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray58);
        quickSort51.sort(intArray58, 1, 1);
        int int64 = binarySearch45.search(intArray58, (int) (short) 0);
        int int66 = binarySearch0.search(intArray58, 5);
        java.lang.Class<?> wildcardClass67 = intArray58.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        searching.LinearSearch linearSearch12 = new searching.LinearSearch();
        searching.BinarySearch binarySearch13 = new searching.BinarySearch();
        int[] intArray16 = new int[] { (byte) 100, (short) 10 };
        int int18 = binarySearch13.search(intArray16, (int) '4');
        int[] intArray21 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray21);
        int int24 = binarySearch13.search(intArray21, (int) 'a');
        int int26 = linearSearch12.search(intArray21, (int) ' ');
        searching.BinarySearch binarySearch27 = new searching.BinarySearch();
        int[] intArray30 = new int[] { (byte) 100, (short) 10 };
        int int32 = binarySearch27.search(intArray30, (int) '4');
        int int34 = linearSearch12.search(intArray30, 1);
        sorting.SelectionSort.sort(intArray30);
        quickSort0.sort(intArray30, (int) (byte) 10, (int) (byte) 10);
        sorting.QuickSort quickSort39 = new sorting.QuickSort();
        int[] intArray46 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray46);
        quickSort39.sort(intArray46, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray46, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 0, 1, 10, 35, 100 });
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String str3 = WhichPath.makeDecision(2, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide((double) (short) 0, (double) (short) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.add(1500.0d, (double) 100.0f);
        double double16 = calculator0.square((double) 'a');
        double double19 = calculator0.subtract((-1.0d), (-1466.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1600.0d + "'", double14 == 1600.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9409.0d + "'", double16 == 9409.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1465.0d + "'", double19 == 1465.0d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        Calculator calculator0 = new Calculator();
        double double3 = calculator0.add((double) 10, 12.288205727444508d);
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 22.288205727444506d + "'", double3 == 22.288205727444506d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        quickSort0.sort(intArray17, 100, 0);
        sorting.MergeSort.sort(intArray17, (-1));
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) -1, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) (short) 10);
        searching.BinarySearch binarySearch12 = new searching.BinarySearch();
        int[] intArray15 = new int[] { (byte) 100, (short) 10 };
        int int17 = binarySearch12.search(intArray15, (int) '4');
        searching.BinarySearch binarySearch18 = new searching.BinarySearch();
        int[] intArray21 = new int[] { (byte) 100, (short) 10 };
        int int23 = binarySearch18.search(intArray21, (int) '4');
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        int int29 = binarySearch18.search(intArray26, (int) 'a');
        int int31 = binarySearch12.search(intArray26, 100);
        sorting.SelectionSort.sort(intArray26);
        int int34 = binarySearch0.search(intArray26, (int) (short) 1);
        java.lang.Class<?> wildcardClass35 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String str3 = WhichPath.makeDecision((-1), (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        searching.BinarySearch binarySearch22 = new searching.BinarySearch();
        int[] intArray25 = new int[] { (byte) 100, (short) 10 };
        int int27 = binarySearch22.search(intArray25, (int) '4');
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        int int33 = binarySearch22.search(intArray30, (int) (short) 10);
        int int35 = linearSearch0.search(intArray30, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        int int41 = linearSearch0.search(intArray38, (int) (short) -1);
        sorting.QuickSort quickSort42 = new sorting.QuickSort();
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        sorting.MergeSort.sort(intArray51, 1);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.merge(intArray46, intArray51, intArray57, (int) (short) 0, (int) (short) 1);
        quickSort42.sort(intArray51, (int) (byte) 0, (int) (byte) 1);
        int int66 = linearSearch0.search(intArray51, 100);
        int[] intArray73 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray73);
        int int76 = linearSearch0.search(intArray73, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray73, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        quickSort0.sort(intArray17, 100, 0);
        sorting.QuickSort quickSort38 = new sorting.QuickSort();
        searching.LinearSearch linearSearch39 = new searching.LinearSearch();
        int[] intArray43 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray43, 0);
        int[] intArray48 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray48);
        sorting.MergeSort.sort(intArray48, 1);
        int[] intArray54 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray54);
        sorting.MergeSort.merge(intArray43, intArray48, intArray54, (int) (short) 0, (int) (short) 1);
        int int60 = linearSearch39.search(intArray54, 100);
        int[] intArray64 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray64, 0);
        int[] intArray70 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray70, 0);
        int[] intArray75 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray75);
        sorting.MergeSort.sort(intArray75, 1);
        int[] intArray81 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray81);
        sorting.MergeSort.merge(intArray70, intArray75, intArray81, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray54, intArray64, intArray75, (int) (byte) -1, (int) (short) 1);
        quickSort38.sort(intArray64, (int) '4', (int) (short) -1);
        quickSort0.sort(intArray64, 10, (-78));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 35 });
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        insertionSort1.sort(intArray5);
        insertionSort0.sort(intArray5);
        searching.LinearSearch linearSearch23 = new searching.LinearSearch();
        int[] intArray27 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray27, 0);
        int[] intArray32 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray32);
        sorting.MergeSort.sort(intArray32, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        sorting.MergeSort.merge(intArray27, intArray32, intArray38, (int) (short) 0, (int) (short) 1);
        int int44 = linearSearch23.search(intArray38, 100);
        insertionSort0.sort(intArray38);
        int[] intArray49 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray49, 0);
        insertionSort0.sort(intArray49);
        searching.BinarySearch binarySearch53 = new searching.BinarySearch();
        int[] intArray56 = new int[] { (byte) 100, (short) 10 };
        int int58 = binarySearch53.search(intArray56, (int) '4');
        searching.BinarySearch binarySearch59 = new searching.BinarySearch();
        int[] intArray62 = new int[] { (byte) 100, (short) 10 };
        int int64 = binarySearch59.search(intArray62, (int) '4');
        int[] intArray67 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray67);
        int int70 = binarySearch59.search(intArray67, (int) 'a');
        int int72 = binarySearch53.search(intArray67, 100);
        searching.LinearSearch linearSearch73 = new searching.LinearSearch();
        searching.BinarySearch binarySearch74 = new searching.BinarySearch();
        int[] intArray77 = new int[] { (byte) 100, (short) 10 };
        int int79 = binarySearch74.search(intArray77, (int) '4');
        int[] intArray82 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray82);
        int int85 = binarySearch74.search(intArray82, (int) 'a');
        int int87 = linearSearch73.search(intArray82, (int) ' ');
        searching.BinarySearch binarySearch88 = new searching.BinarySearch();
        int[] intArray91 = new int[] { (byte) 100, (short) 10 };
        int int93 = binarySearch88.search(intArray91, (int) '4');
        int int95 = linearSearch73.search(intArray91, 1);
        sorting.SelectionSort.sort(intArray91);
        int int98 = binarySearch53.search(intArray91, 1);
        insertionSort0.sort(intArray91);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 0, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.multiply(1600.0d, 52.32d);
        double double17 = calculator0.divide(142.2882057274445d, (-1.0d));
        double double20 = calculator0.subtract(34.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 83712.0d + "'", double14 == 83712.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-142.2882057274445d) + "'", double17 == (-142.2882057274445d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 34.0d + "'", double20 == 34.0d);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        searching.LinearSearch linearSearch21 = new searching.LinearSearch();
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        sorting.MergeSort.sort(intArray30, 1);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.merge(intArray25, intArray30, intArray36, (int) (short) 0, (int) (short) 1);
        int int42 = linearSearch21.search(intArray36, 100);
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray52 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray52, 0);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.sort(intArray57, 1);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.merge(intArray52, intArray57, intArray63, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray36, intArray46, intArray57, (int) (byte) -1, (int) (short) 1);
        insertionSort0.sort(intArray57);
        searching.LinearSearch linearSearch72 = new searching.LinearSearch();
        int[] intArray76 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray76, 0);
        int[] intArray81 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray81);
        sorting.MergeSort.sort(intArray81, 1);
        int[] intArray87 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray87);
        sorting.MergeSort.merge(intArray76, intArray81, intArray87, (int) (short) 0, (int) (short) 1);
        int int93 = linearSearch72.search(intArray87, 100);
        insertionSort0.sort(intArray87);
        sorting.SelectionSort.sort(intArray87);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertArrayEquals(intArray87, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String str3 = WhichPath.makeDecision((int) '#', (int) (short) 1, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 2" + "'", str3, "Path 2");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int int8 = linearSearch0.search(intArray4, (int) ' ');
        int[] intArray12 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray12, 0);
        int[] intArray17 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray17);
        sorting.MergeSort.sort(intArray17, 1);
        int[] intArray23 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray23);
        sorting.MergeSort.merge(intArray12, intArray17, intArray23, (int) (short) 0, (int) (short) 1);
        int int29 = linearSearch0.search(intArray17, (int) (short) 1);
        searching.LinearSearch linearSearch30 = new searching.LinearSearch();
        searching.BinarySearch binarySearch31 = new searching.BinarySearch();
        int[] intArray34 = new int[] { (byte) 100, (short) 10 };
        int int36 = binarySearch31.search(intArray34, (int) '4');
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = binarySearch31.search(intArray39, (int) 'a');
        int int44 = linearSearch30.search(intArray39, (int) ' ');
        searching.BinarySearch binarySearch45 = new searching.BinarySearch();
        int[] intArray48 = new int[] { (byte) 100, (short) 10 };
        int int50 = binarySearch45.search(intArray48, (int) '4');
        int int52 = linearSearch30.search(intArray48, 1);
        int int54 = linearSearch0.search(intArray48, (int) (short) -1);
        int[] intArray55 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int57 = linearSearch0.search(intArray55, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.divide((double) 100L, (double) 1L);
        double double12 = calculator0.square((double) 5);
        double double15 = calculator0.divide(34.0d, 496.76411454889006d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculator0.divide(9.9498743710662d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.06844294707333136d + "'", double15 == 0.06844294707333136d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 100, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 5" + "'", str3, "Path 5");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 0, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) -1, (-78), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.multiply(1600.0d, 52.32d);
        double double17 = calculator0.divide(142.2882057274445d, (-1.0d));
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 83712.0d + "'", double14 == 83712.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-142.2882057274445d) + "'", double17 == (-142.2882057274445d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 100, 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 1, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray3, (int) (short) 1);
        int[] intArray23 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray23);
        sorting.SelectionSort.sort(intArray23);
        searching.BinarySearch binarySearch26 = new searching.BinarySearch();
        int[] intArray29 = new int[] { (byte) 100, (short) 10 };
        int int31 = binarySearch26.search(intArray29, (int) '4');
        int[] intArray34 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray34);
        int int37 = binarySearch26.search(intArray34, (int) (short) 10);
        searching.BinarySearch binarySearch38 = new searching.BinarySearch();
        int[] intArray41 = new int[] { (byte) 100, (short) 10 };
        int int43 = binarySearch38.search(intArray41, (int) '4');
        searching.BinarySearch binarySearch44 = new searching.BinarySearch();
        int[] intArray47 = new int[] { (byte) 100, (short) 10 };
        int int49 = binarySearch44.search(intArray47, (int) '4');
        int[] intArray52 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray52);
        int int55 = binarySearch44.search(intArray52, (int) 'a');
        int int57 = binarySearch38.search(intArray52, 100);
        sorting.SelectionSort.sort(intArray52);
        int int60 = binarySearch26.search(intArray52, (int) (short) 1);
        searching.LinearSearch linearSearch61 = new searching.LinearSearch();
        searching.BinarySearch binarySearch62 = new searching.BinarySearch();
        int[] intArray65 = new int[] { (byte) 100, (short) 10 };
        int int67 = binarySearch62.search(intArray65, (int) '4');
        int[] intArray70 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray70);
        int int73 = binarySearch62.search(intArray70, (int) 'a');
        int int75 = linearSearch61.search(intArray70, (int) ' ');
        searching.BinarySearch binarySearch76 = new searching.BinarySearch();
        int[] intArray79 = new int[] { (byte) 100, (short) 10 };
        int int81 = binarySearch76.search(intArray79, (int) '4');
        int int83 = linearSearch61.search(intArray79, 1);
        sorting.SelectionSort.sort(intArray79);
        int int86 = binarySearch26.search(intArray79, (int) (byte) 10);
        int[] intArray93 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray93);
        int int96 = binarySearch26.search(intArray93, 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray3, intArray23, intArray93, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 0, 1 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 2 + "'", int96 == 2);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str3 = WhichPath.makeDecision(0, 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.add((-1.0d), (-1.0d));
        double double19 = calculator0.multiply((double) '4', (double) 1L);
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double7 = calculator0.squareRoot(0.0d);
        double double10 = calculator0.subtract(151.0d, 1500.0d);
        double double13 = calculator0.multiply((double) (byte) -1, (double) (-1.0f));
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1349.0d) + "'", double10 == (-1349.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) -1, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        searching.BinarySearch binarySearch22 = new searching.BinarySearch();
        int[] intArray25 = new int[] { (byte) 100, (short) 10 };
        int int27 = binarySearch22.search(intArray25, (int) '4');
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        int int33 = binarySearch22.search(intArray30, (int) (short) 10);
        int int35 = linearSearch0.search(intArray30, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        int int41 = linearSearch0.search(intArray38, (int) (short) -1);
        sorting.QuickSort quickSort42 = new sorting.QuickSort();
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        sorting.MergeSort.sort(intArray51, 1);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.merge(intArray46, intArray51, intArray57, (int) (short) 0, (int) (short) 1);
        quickSort42.sort(intArray51, (int) (byte) 0, (int) (byte) 1);
        int int66 = linearSearch0.search(intArray51, 100);
        int[] intArray73 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray73);
        int int76 = linearSearch0.search(intArray73, (int) 'a');
        java.lang.Class<?> wildcardClass77 = intArray73.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.multiply((double) '4', (double) (-1));
        double double11 = calculator0.subtract(30.0d, 9.9999998E15d);
        double double13 = calculator0.squareRoot(0.32d);
        double double16 = calculator0.add((double) 'a', (-33.0d));
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-52.0d) + "'", double8 == (-52.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.99999979999997E15d) + "'", double11 == (-9.99999979999997E15d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.565685424949238d + "'", double13 == 0.565685424949238d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 64.0d + "'", double16 == 64.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str3 = WhichPath.makeDecision(1, (int) (byte) -1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 100, 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 1" + "'", str3, "Path 1");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.add((-1.0d), (-1.0d));
        double double19 = calculator0.divide((double) (byte) 100, (double) 100.0f);
        double double21 = calculator0.square(2.02d);
        double double24 = calculator0.multiply(1.0E16d, 4.5E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0804d + "'", double21 == 4.0804d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.5E9d + "'", double24 == 4.5E9d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.divide((double) 100L, (double) 1L);
        double double12 = calculator0.square((double) 5);
        double double15 = calculator0.add(1.5828625057366885d, 4.5E-7d);
        double double18 = calculator0.multiply((-0.19134373790511922d), (-2.711794272555494d));
        double double21 = calculator0.subtract(0.02d, 9.9993902092964E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.5828629557366884d + "'", double15 == 1.5828629557366884d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5188848525404619d + "'", double18 == 0.5188848525404619d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9.9993902092964E15d) + "'", double21 == (-9.9993902092964E15d));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double8 = calculator0.divide(2.979955299664745E7d, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = calculator0.squareRoot((-0.8600917431192661d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2979955.299664745d + "'", double8 == 2979955.299664745d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber(5);
        java.lang.String str4 = whatKindOfNumber0.processNumber((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Positive Odd" + "'", str2, "Positive Odd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Positive Even Not Multiple of 3" + "'", str4, "Positive Even Not Multiple of 3");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.String str3 = WhichPath.makeDecision(0, 1, (-78));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        int int6 = binarySearch1.search(intArray4, (int) '4');
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        int int12 = binarySearch1.search(intArray9, (int) (short) 10);
        searching.BinarySearch binarySearch13 = new searching.BinarySearch();
        int[] intArray16 = new int[] { (byte) 100, (short) 10 };
        int int18 = binarySearch13.search(intArray16, (int) '4');
        searching.BinarySearch binarySearch19 = new searching.BinarySearch();
        int[] intArray22 = new int[] { (byte) 100, (short) 10 };
        int int24 = binarySearch19.search(intArray22, (int) '4');
        int[] intArray27 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray27);
        int int30 = binarySearch19.search(intArray27, (int) 'a');
        int int32 = binarySearch13.search(intArray27, 100);
        sorting.SelectionSort.sort(intArray27);
        int int35 = binarySearch1.search(intArray27, (int) (short) 1);
        searching.LinearSearch linearSearch36 = new searching.LinearSearch();
        searching.BinarySearch binarySearch37 = new searching.BinarySearch();
        int[] intArray40 = new int[] { (byte) 100, (short) 10 };
        int int42 = binarySearch37.search(intArray40, (int) '4');
        int[] intArray45 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray45);
        int int48 = binarySearch37.search(intArray45, (int) 'a');
        int int50 = linearSearch36.search(intArray45, (int) ' ');
        searching.BinarySearch binarySearch51 = new searching.BinarySearch();
        int[] intArray54 = new int[] { (byte) 100, (short) 10 };
        int int56 = binarySearch51.search(intArray54, (int) '4');
        int int58 = linearSearch36.search(intArray54, 1);
        sorting.SelectionSort.sort(intArray54);
        int int61 = binarySearch1.search(intArray54, (int) (byte) 10);
        int[] intArray68 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray68);
        int int71 = binarySearch1.search(intArray68, 1);
        searching.BinarySearch binarySearch72 = new searching.BinarySearch();
        int[] intArray75 = new int[] { (byte) 100, (short) 10 };
        int int77 = binarySearch72.search(intArray75, (int) '4');
        int[] intArray80 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray80);
        int int83 = binarySearch72.search(intArray80, (int) (short) 10);
        searching.BinarySearch binarySearch84 = new searching.BinarySearch();
        int[] intArray87 = new int[] { (byte) 100, (short) 10 };
        int int89 = binarySearch84.search(intArray87, (int) '4');
        int int91 = binarySearch72.search(intArray87, (int) 'a');
        sorting.SelectionSort.sort(intArray87);
        sorting.SelectionSort.sort(intArray87);
        int int95 = binarySearch1.search(intArray87, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray87, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertArrayEquals(intArray87, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber((int) (short) 100);
        java.lang.String str4 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str6 = whatKindOfNumber0.processNumber((int) (byte) 10);
        java.lang.String str8 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = whatKindOfNumber0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Positive Even Not Multiple of 3" + "'", str2, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Negative Odd" + "'", str4, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Positive Even Not Multiple of 3" + "'", str6, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Negative Odd" + "'", str8, "Negative Odd");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.String str3 = WhichPath.makeDecision(5, (-78), (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        quickSort0.sort(intArray17, 100, 0);
        searching.LinearSearch linearSearch38 = new searching.LinearSearch();
        int[] intArray42 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray42, 0);
        int[] intArray47 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray47);
        sorting.MergeSort.sort(intArray47, 1);
        int[] intArray53 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray53);
        sorting.MergeSort.merge(intArray42, intArray47, intArray53, (int) (short) 0, (int) (short) 1);
        int int59 = linearSearch38.search(intArray53, 100);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray53, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String str3 = WhichPath.makeDecision((int) '#', 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 2" + "'", str3, "Path 2");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide((double) (short) 0, (double) (short) -1);
        double double11 = calculator0.subtract((double) '4', (-99.0d));
        double double14 = calculator0.add(1.0E8d, (-1.0d));
        double double17 = calculator0.add((double) 1, (double) 100);
        double double20 = calculator0.subtract(0.32d, (-52.0d));
        double double23 = calculator0.multiply((double) 0.0f, (double) (byte) 10);
        double double26 = calculator0.add(0.0d, (double) (byte) -1);
        double double28 = calculator0.squareRoot(1030.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 151.0d + "'", double11 == 151.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.9999999E7d + "'", double14 == 9.9999999E7d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 101.0d + "'", double17 == 101.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.32d + "'", double20 == 52.32d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 32.09361307176243d + "'", double28 == 32.09361307176243d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.String str3 = WhichPath.makeDecision((int) ' ', (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 1" + "'", str3, "Path 1");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 1);
        int int6 = examGrades0.grade((int) ' ');
        int int8 = examGrades0.grade((int) '#');
        int int10 = examGrades0.grade((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = examGrades0.grade((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        bubbleSort0.sort(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        quickSort0.sort(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray26 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray26, 0);
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        sorting.MergeSort.sort(intArray31, 1);
        int[] intArray37 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray37);
        sorting.MergeSort.merge(intArray26, intArray31, intArray37, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray26, (int) (short) 1);
        sorting.MergeSort.sort(intArray26, 2);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray26, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 35 });
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        quickSort0.sort(intArray9, (int) (byte) 0, (int) (byte) 1);
        searching.LinearSearch linearSearch23 = new searching.LinearSearch();
        sorting.InsertionSort insertionSort24 = new sorting.InsertionSort();
        int[] intArray27 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray27);
        sorting.MergeSort.sort(intArray27, 1);
        insertionSort24.sort(intArray27);
        int[] intArray35 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray35, 0);
        int[] intArray40 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray40);
        sorting.MergeSort.sort(intArray40, 1);
        int[] intArray46 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray46);
        sorting.MergeSort.merge(intArray35, intArray40, intArray46, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray46, (int) (short) 0);
        sorting.SelectionSort.sort(intArray46);
        sorting.SelectionSort.sort(intArray46);
        insertionSort24.sort(intArray46);
        int int57 = linearSearch23.search(intArray46, (int) 'a');
        searching.LinearSearch linearSearch58 = new searching.LinearSearch();
        int[] intArray62 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray62, 0);
        int int66 = linearSearch58.search(intArray62, (int) ' ');
        int[] intArray70 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray70, 0);
        int[] intArray75 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray75);
        sorting.MergeSort.sort(intArray75, 1);
        int[] intArray81 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray81);
        sorting.MergeSort.merge(intArray70, intArray75, intArray81, (int) (short) 0, (int) (short) 1);
        int int87 = linearSearch58.search(intArray75, (int) (short) 1);
        sorting.MergeSort.sort(intArray75, (-1));
        int int91 = linearSearch23.search(intArray75, 10);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray75, 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.String str3 = WhichPath.makeDecision(5, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String str3 = WhichPath.makeDecision(2, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        quickSort0.sort(intArray17, 100, 0);
        searching.BinarySearch binarySearch38 = new searching.BinarySearch();
        int[] intArray41 = new int[] { (byte) 100, (short) 10 };
        int int43 = binarySearch38.search(intArray41, (int) '4');
        int[] intArray46 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray46);
        int int49 = binarySearch38.search(intArray46, (int) 'a');
        searching.LinearSearch linearSearch50 = new searching.LinearSearch();
        int[] intArray54 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray54, 0);
        int int58 = linearSearch50.search(intArray54, (int) ' ');
        int int60 = binarySearch38.search(intArray54, (int) (byte) 100);
        quickSort0.sort(intArray54, (int) '4', 0);
        searching.BinarySearch binarySearch64 = new searching.BinarySearch();
        int[] intArray67 = new int[] { (byte) 100, (short) 10 };
        int int69 = binarySearch64.search(intArray67, (int) '4');
        int[] intArray72 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray72);
        int int75 = binarySearch64.search(intArray72, (int) (short) 10);
        searching.BinarySearch binarySearch76 = new searching.BinarySearch();
        int[] intArray79 = new int[] { (byte) 100, (short) 10 };
        int int81 = binarySearch76.search(intArray79, (int) '4');
        int int83 = binarySearch64.search(intArray79, (int) 'a');
        sorting.SelectionSort.sort(intArray79);
        sorting.SelectionSort.sort(intArray79);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray79, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int int8 = linearSearch0.search(intArray4, (int) ' ');
        int[] intArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linearSearch0.search(intArray9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.String str3 = WhichPath.makeDecision(0, (int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.divide(0.0d, (-2.0d));
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0d) + "'", double10 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 0, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        int int34 = binarySearch23.search(intArray31, (int) (short) 10);
        int int36 = linearSearch1.search(intArray31, 1);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = linearSearch1.search(intArray39, (int) (short) -1);
        int int44 = binarySearch0.search(intArray39, (int) (short) 100);
        searching.BinarySearch binarySearch45 = new searching.BinarySearch();
        int[] intArray48 = new int[] { (byte) 100, (short) 10 };
        int int50 = binarySearch45.search(intArray48, (int) '4');
        sorting.QuickSort quickSort51 = new sorting.QuickSort();
        int[] intArray58 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray58);
        quickSort51.sort(intArray58, 1, 1);
        int int64 = binarySearch45.search(intArray58, (int) (short) 0);
        int int66 = binarySearch0.search(intArray58, 5);
        int[] intArray70 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray70, 0);
        int[] intArray75 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray75);
        sorting.MergeSort.sort(intArray75, 1);
        int[] intArray81 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray81);
        sorting.MergeSort.merge(intArray70, intArray75, intArray81, (int) (short) 0, (int) (short) 1);
        int int87 = binarySearch0.search(intArray75, 0);
        int[] intArray89 = new int[] { (byte) 1 };
        int int91 = binarySearch0.search(intArray89, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray89, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.add((-1.0d), (-1.0d));
        double double19 = calculator0.multiply((double) '4', (double) 1L);
        double double22 = calculator0.add((double) 100, 9.9997E7d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = calculator0.squareRoot((-6.62251642384104E13d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9.99971E7d + "'", double22 == 9.99971E7d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.divide((double) 100L, (double) 1L);
        double double12 = calculator0.square((double) 5);
        double double15 = calculator0.add(1.5828625057366885d, 4.5E-7d);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.5828629557366884d + "'", double15 == 1.5828629557366884d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.divide((double) 100L, (double) 1L);
        double double12 = calculator0.square((double) 5);
        double double15 = calculator0.add(1.5828625057366885d, 4.5E-7d);
        double double18 = calculator0.multiply((-0.19134373790511922d), (-2.711794272555494d));
        double double21 = calculator0.multiply(6.0d, 39634.65733182616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.5828629557366884d + "'", double15 == 1.5828629557366884d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5188848525404619d + "'", double18 == 0.5188848525404619d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 237807.94399095693d + "'", double21 == 237807.94399095693d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.multiply((double) 1, (double) 0.0f);
        double double18 = calculator0.squareRoot((double) (byte) 10);
        double double20 = calculator0.square(10000.0d);
        double double23 = calculator0.subtract(9.99971E7d, 22288.205727444507d);
        double double26 = calculator0.multiply((-20.0d), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.1622776601683795d + "'", double18 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E8d + "'", double20 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 9.997481179427256E7d + "'", double23 == 9.997481179427256E7d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2000.0d) + "'", double26 == (-2000.0d));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        int int6 = binarySearch1.search(intArray4, (int) '4');
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        int int12 = binarySearch1.search(intArray9, (int) 'a');
        int int14 = linearSearch0.search(intArray9, (int) ' ');
        searching.BinarySearch binarySearch15 = new searching.BinarySearch();
        int[] intArray18 = new int[] { (byte) 100, (short) 10 };
        int int20 = binarySearch15.search(intArray18, (int) '4');
        searching.BinarySearch binarySearch21 = new searching.BinarySearch();
        int[] intArray24 = new int[] { (byte) 100, (short) 10 };
        int int26 = binarySearch21.search(intArray24, (int) '4');
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        int int32 = binarySearch21.search(intArray29, (int) 'a');
        int int34 = binarySearch15.search(intArray29, 100);
        sorting.QuickSort quickSort35 = new sorting.QuickSort();
        int[] intArray39 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray39, 0);
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        sorting.MergeSort.sort(intArray44, 1);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        sorting.MergeSort.merge(intArray39, intArray44, intArray50, (int) (short) 0, (int) (short) 1);
        quickSort35.sort(intArray44, (int) (byte) 0, (int) (byte) 1);
        int int59 = binarySearch15.search(intArray44, 0);
        int int61 = linearSearch0.search(intArray44, 0);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray44, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide((double) (short) 0, (double) (short) -1);
        double double11 = calculator0.subtract((double) '4', (-99.0d));
        double double14 = calculator0.add(1.0E8d, (-1.0d));
        double double17 = calculator0.add((double) 1, (double) 100);
        double double20 = calculator0.add((-52.0d), 2979955.299664745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 151.0d + "'", double11 == 151.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.9999999E7d + "'", double14 == 9.9999999E7d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 101.0d + "'", double17 == 101.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2979903.299664745d + "'", double20 == 2979903.299664745d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        quickSort0.sort(intArray17, 100, 0);
        searching.BinarySearch binarySearch38 = new searching.BinarySearch();
        int[] intArray41 = new int[] { (byte) 100, (short) 10 };
        int int43 = binarySearch38.search(intArray41, (int) '4');
        int[] intArray46 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray46);
        int int49 = binarySearch38.search(intArray46, (int) (short) 10);
        sorting.MergeSort.sort(intArray46, 0);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray46, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        quickSort0.sort(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray23 = null;
        quickSort0.sort(intArray23, 10, (int) (short) -1);
        sorting.QuickSort quickSort27 = new sorting.QuickSort();
        int[] intArray34 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray34);
        quickSort27.sort(intArray34, (int) 'a', (int) (byte) 10);
        sorting.InsertionSort insertionSort39 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort40 = new sorting.InsertionSort();
        int[] intArray44 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray44, 0);
        int[] intArray49 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray49);
        sorting.MergeSort.sort(intArray49, 1);
        int[] intArray55 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray55);
        sorting.MergeSort.merge(intArray44, intArray49, intArray55, (int) (short) 0, (int) (short) 1);
        insertionSort40.sort(intArray44);
        insertionSort39.sort(intArray44);
        searching.LinearSearch linearSearch62 = new searching.LinearSearch();
        int[] intArray66 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray66, 0);
        int[] intArray71 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray71);
        sorting.MergeSort.sort(intArray71, 1);
        int[] intArray77 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray77);
        sorting.MergeSort.merge(intArray66, intArray71, intArray77, (int) (short) 0, (int) (short) 1);
        int int83 = linearSearch62.search(intArray77, 100);
        insertionSort39.sort(intArray77);
        int[] intArray88 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray88, 0);
        insertionSort39.sort(intArray88);
        quickSort27.sort(intArray88, 100, 1);
        sorting.SelectionSort.sort(intArray88);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray88, (-78), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -78 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { 0, 10, 100 });
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 10, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        quickSort0.sort(intArray9, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.add((-1.0d), 25.0d);
        double double12 = calculator0.squareRoot(30.0d);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 24.0d + "'", double10 == 24.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.477225575051661d + "'", double12 == 5.477225575051661d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double9 = calculator0.square(34.0d);
        double double12 = calculator0.multiply(0.02d, 1030.0d);
        double double14 = calculator0.squareRoot(2.979955299664745E7d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = calculator0.squareRoot((-1.0E8d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1156.0d + "'", double9 == 1156.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.6d + "'", double12 == 20.6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5458.896683089674d + "'", double14 == 5458.896683089674d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 100, (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, (int) 'a', (int) (byte) 10);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        searching.LinearSearch linearSearch35 = new searching.LinearSearch();
        int[] intArray39 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray39, 0);
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        sorting.MergeSort.sort(intArray44, 1);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        sorting.MergeSort.merge(intArray39, intArray44, intArray50, (int) (short) 0, (int) (short) 1);
        int int56 = linearSearch35.search(intArray50, 100);
        insertionSort12.sort(intArray50);
        quickSort0.sort(intArray50, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray50, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double4 = calculator0.square((double) 100L);
        double double7 = calculator0.multiply(0.0d, 33.0d);
        double double10 = calculator0.subtract(52.32d, 34.0d);
        double double12 = calculator0.squareRoot(0.02d);
        double double14 = calculator0.squareRoot((double) 1);
        double double17 = calculator0.multiply((-1.0E8d), (double) (short) -1);
        double double19 = calculator0.square(25.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 18.32d + "'", double10 == 18.32d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1414213562373095d + "'", double12 == 0.1414213562373095d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E8d + "'", double17 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 625.0d + "'", double19 == 625.0d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.add((-1.0d), (-1.0d));
        double double19 = calculator0.divide((double) (byte) 100, (double) 100.0f);
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 100, (int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 5" + "'", str3, "Path 5");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.multiply((double) '4', (double) (-1));
        double double11 = calculator0.subtract(30.0d, 9.9999998E15d);
        double double13 = calculator0.squareRoot(0.32d);
        double double15 = calculator0.square((-1467.0d));
        double double18 = calculator0.subtract(52.32d, 0.0d);
        double double21 = calculator0.subtract(2.505453712067028d, (-0.0019327650293446384d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-52.0d) + "'", double8 == (-52.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.99999979999997E15d) + "'", double11 == (-9.99999979999997E15d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.565685424949238d + "'", double13 == 0.565685424949238d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2152089.0d + "'", double15 == 2152089.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.32d + "'", double18 == 52.32d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.507386477096373d + "'", double21 == 2.507386477096373d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double4 = calculator0.square((double) 100L);
        double double7 = calculator0.subtract(149.0d, 9.99971E7d);
        double double10 = calculator0.subtract((double) (byte) 0, 33.0d);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.9996951E7d) + "'", double7 == (-9.9996951E7d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-33.0d) + "'", double10 == (-33.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int[] intArray0 = null;
        sorting.MergeSort.sort(intArray0, (int) (short) 1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) -1, (int) (short) 100, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray3 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray3);
        sorting.MergeSort.sort(intArray3, 1);
        insertionSort0.sort(intArray3);
        int[] intArray11 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray11, 0);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.sort(intArray16, 1);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.merge(intArray11, intArray16, intArray22, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray22, (int) (short) 0);
        sorting.SelectionSort.sort(intArray22);
        sorting.SelectionSort.sort(intArray22);
        insertionSort0.sort(intArray22);
        sorting.QuickSort quickSort32 = new sorting.QuickSort();
        searching.LinearSearch linearSearch33 = new searching.LinearSearch();
        int[] intArray37 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray37, 0);
        int[] intArray42 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray42);
        sorting.MergeSort.sort(intArray42, 1);
        int[] intArray48 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray48);
        sorting.MergeSort.merge(intArray37, intArray42, intArray48, (int) (short) 0, (int) (short) 1);
        int int54 = linearSearch33.search(intArray48, 100);
        int[] intArray58 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray58, 0);
        int[] intArray64 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray64, 0);
        int[] intArray69 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray69);
        sorting.MergeSort.sort(intArray69, 1);
        int[] intArray75 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray75);
        sorting.MergeSort.merge(intArray64, intArray69, intArray75, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray48, intArray58, intArray69, (int) (byte) -1, (int) (short) 1);
        quickSort32.sort(intArray58, (int) '4', (int) (short) -1);
        insertionSort0.sort(intArray58);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray58, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 1, 35 });
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String str3 = WhichPath.makeDecision(2, (int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        sorting.QuickSort quickSort1 = new sorting.QuickSort();
        int[] intArray8 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray8);
        quickSort1.sort(intArray8, (int) 'a', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray8, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 0, 1, 10, 35, 100 });
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide((double) (short) 0, (double) (short) -1);
        double double11 = calculator0.subtract((double) '4', (-99.0d));
        double double14 = calculator0.add(1.0E8d, (-1.0d));
        double double17 = calculator0.add((double) 1, (double) 100);
        double double20 = calculator0.divide((double) 100, 2025.0d);
        java.lang.Class<?> wildcardClass21 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 151.0d + "'", double11 == 151.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.9999999E7d + "'", double14 == 9.9999999E7d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 101.0d + "'", double17 == 101.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.04938271604938271d + "'", double20 == 0.04938271604938271d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str3 = WhichPath.makeDecision((int) ' ', (-78), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String str3 = WhichPath.makeDecision(0, (int) (byte) 100, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double8 = calculator0.multiply((double) (short) 10, (double) (short) 100);
        double double11 = calculator0.subtract((double) (byte) 100, (double) 10L);
        double double14 = calculator0.add(3000.0d, (-20.0d));
        double double16 = calculator0.squareRoot(30.0d);
        double double18 = calculator0.squareRoot(6.0d);
        double double21 = calculator0.divide(6561.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1000.0d + "'", double8 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2980.0d + "'", double14 == 2980.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.477225575051661d + "'", double16 == 5.477225575051661d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.449489742783178d + "'", double18 == 2.449489742783178d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 65.61d + "'", double21 == 65.61d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double7 = calculator0.squareRoot(0.0d);
        double double9 = calculator0.squareRoot(9.9993902092964E15d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = calculator0.squareRoot((-9.99999979999997E15d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.9996951E7d + "'", double9 == 9.9996951E7d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 1);
        int int6 = examGrades0.grade((int) ' ');
        int int8 = examGrades0.grade((int) '#');
        int int10 = examGrades0.grade((int) ' ');
        int int12 = examGrades0.grade((int) (short) 10);
        int int14 = examGrades0.grade((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = examGrades0.grade((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 1, (int) (byte) 1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = examGrades0.grade((-78));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) (short) 10);
        searching.BinarySearch binarySearch12 = new searching.BinarySearch();
        int[] intArray15 = new int[] { (byte) 100, (short) 10 };
        int int17 = binarySearch12.search(intArray15, (int) '4');
        int int19 = binarySearch0.search(intArray15, (int) 'a');
        searching.BinarySearch binarySearch20 = new searching.BinarySearch();
        int[] intArray23 = new int[] { (byte) 100, (short) 10 };
        int int25 = binarySearch20.search(intArray23, (int) '4');
        searching.BinarySearch binarySearch26 = new searching.BinarySearch();
        int[] intArray29 = new int[] { (byte) 100, (short) 10 };
        int int31 = binarySearch26.search(intArray29, (int) '4');
        int[] intArray34 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray34);
        int int37 = binarySearch26.search(intArray34, (int) 'a');
        int int39 = binarySearch20.search(intArray34, 100);
        sorting.QuickSort quickSort40 = new sorting.QuickSort();
        int[] intArray44 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray44, 0);
        int[] intArray49 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray49);
        sorting.MergeSort.sort(intArray49, 1);
        int[] intArray55 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray55);
        sorting.MergeSort.merge(intArray44, intArray49, intArray55, (int) (short) 0, (int) (short) 1);
        quickSort40.sort(intArray49, (int) (byte) 0, (int) (byte) 1);
        int int64 = binarySearch20.search(intArray49, 0);
        int int66 = binarySearch0.search(intArray49, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray31 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray31, 0);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.sort(intArray36, 1);
        int[] intArray42 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray42);
        sorting.MergeSort.merge(intArray31, intArray36, intArray42, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray15, intArray25, intArray36, (int) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray25, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 35 });
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        sorting.SelectionSort.sort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int int8 = linearSearch0.search(intArray4, (int) ' ');
        int[] intArray12 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray12, 0);
        int[] intArray17 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray17);
        sorting.MergeSort.sort(intArray17, 1);
        int[] intArray23 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray23);
        sorting.MergeSort.merge(intArray12, intArray17, intArray23, (int) (short) 0, (int) (short) 1);
        int int29 = linearSearch0.search(intArray17, (int) (short) 1);
        searching.LinearSearch linearSearch30 = new searching.LinearSearch();
        int[] intArray34 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray34, 0);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        sorting.MergeSort.sort(intArray39, 1);
        int[] intArray45 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray45);
        sorting.MergeSort.merge(intArray34, intArray39, intArray45, (int) (short) 0, (int) (short) 1);
        int int51 = linearSearch30.search(intArray45, 100);
        int[] intArray55 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray55, 0);
        int[] intArray61 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray61, 0);
        int[] intArray66 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray66);
        sorting.MergeSort.sort(intArray66, 1);
        int[] intArray72 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray72);
        sorting.MergeSort.merge(intArray61, intArray66, intArray72, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray45, intArray55, intArray66, (int) (byte) -1, (int) (short) 1);
        sorting.MergeSort.sort(intArray55, (int) (byte) 0);
        int int83 = linearSearch0.search(intArray55, (int) (short) 0);
        java.lang.Class<?> wildcardClass84 = intArray55.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.String str3 = WhichPath.makeDecision((-45), (-45), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.subtract(0.0d, 8880400.0d);
        double double16 = calculator0.square((-9.9996951E7d));
        double double19 = calculator0.subtract(4.5E-7d, (-25.0d));
        double double22 = calculator0.add((double) (-78), 9999.849998874983d);
        java.lang.Class<?> wildcardClass23 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8880400.0d) + "'", double14 == (-8880400.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.9993902092964E15d + "'", double16 == 9.9993902092964E15d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 25.00000045d + "'", double19 == 25.00000045d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9921.849998874983d + "'", double22 == 9921.849998874983d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber((int) (short) 100);
        java.lang.String str4 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str6 = whatKindOfNumber0.processNumber((int) (byte) 10);
        java.lang.String str8 = whatKindOfNumber0.processNumber(1);
        java.lang.String str10 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str12 = whatKindOfNumber0.processNumber((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = whatKindOfNumber0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Positive Even Not Multiple of 3" + "'", str2, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Negative Odd" + "'", str4, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Positive Even Not Multiple of 3" + "'", str6, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Positive Odd" + "'", str8, "Positive Odd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Negative Odd" + "'", str10, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Positive Odd" + "'", str12, "Positive Odd");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        insertionSort1.sort(intArray5);
        insertionSort0.sort(intArray5);
        searching.LinearSearch linearSearch23 = new searching.LinearSearch();
        int[] intArray27 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray27, 0);
        int[] intArray32 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray32);
        sorting.MergeSort.sort(intArray32, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        sorting.MergeSort.merge(intArray27, intArray32, intArray38, (int) (short) 0, (int) (short) 1);
        int int44 = linearSearch23.search(intArray38, 100);
        insertionSort0.sort(intArray38);
        searching.LinearSearch linearSearch46 = new searching.LinearSearch();
        int[] intArray50 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray50, 0);
        int[] intArray55 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray55);
        sorting.MergeSort.sort(intArray55, 1);
        int[] intArray61 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray61);
        sorting.MergeSort.merge(intArray50, intArray55, intArray61, (int) (short) 0, (int) (short) 1);
        int int67 = linearSearch46.search(intArray61, 100);
        insertionSort0.sort(intArray61);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray61, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade(1);
        int int6 = examGrades0.grade((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = examGrades0.grade((-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        quickSort0.sort(intArray17, 100, 0);
        searching.BinarySearch binarySearch38 = new searching.BinarySearch();
        int[] intArray41 = new int[] { (byte) 100, (short) 10 };
        int int43 = binarySearch38.search(intArray41, (int) '4');
        searching.BinarySearch binarySearch44 = new searching.BinarySearch();
        int[] intArray47 = new int[] { (byte) 100, (short) 10 };
        int int49 = binarySearch44.search(intArray47, (int) '4');
        int[] intArray52 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray52);
        int int55 = binarySearch44.search(intArray52, (int) 'a');
        int int57 = binarySearch38.search(intArray52, 100);
        sorting.QuickSort quickSort58 = new sorting.QuickSort();
        int[] intArray62 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray62, 0);
        int[] intArray67 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray67);
        sorting.MergeSort.sort(intArray67, 1);
        int[] intArray73 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray73);
        sorting.MergeSort.merge(intArray62, intArray67, intArray73, (int) (short) 0, (int) (short) 1);
        quickSort58.sort(intArray67, (int) (byte) 0, (int) (byte) 1);
        int int82 = binarySearch38.search(intArray67, 0);
        quickSort0.sort(intArray67, (int) '#', (-1));
        int[] intArray92 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray92);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray92, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { (-1), 0, 1, 10, 35, 100 });
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 1);
        int int6 = examGrades0.grade((int) ' ');
        int int8 = examGrades0.grade(0);
        int int10 = examGrades0.grade(0);
        int int12 = examGrades0.grade((int) (byte) 1);
        int int14 = examGrades0.grade((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = examGrades0.grade((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        int int34 = binarySearch23.search(intArray31, (int) (short) 10);
        int int36 = linearSearch1.search(intArray31, 1);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = linearSearch1.search(intArray39, (int) (short) -1);
        int int44 = binarySearch0.search(intArray39, (int) (short) 100);
        int[] intArray45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int47 = binarySearch0.search(intArray45, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.String str3 = WhichPath.makeDecision(10, (int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, (double) 0L);
        double double14 = calculator0.multiply(0.32d, (double) 100L);
        double double17 = calculator0.subtract(99.0d, 53.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 46.0d + "'", double17 == 46.0d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch19 = new searching.LinearSearch();
        searching.BinarySearch binarySearch20 = new searching.BinarySearch();
        int[] intArray23 = new int[] { (byte) 100, (short) 10 };
        int int25 = binarySearch20.search(intArray23, (int) '4');
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        int int31 = binarySearch20.search(intArray28, (int) 'a');
        int int33 = linearSearch19.search(intArray28, (int) ' ');
        searching.LinearSearch linearSearch34 = new searching.LinearSearch();
        int[] intArray38 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray38, 0);
        int[] intArray43 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray43);
        sorting.MergeSort.sort(intArray43, 1);
        int[] intArray49 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray49);
        sorting.MergeSort.merge(intArray38, intArray43, intArray49, (int) (short) 0, (int) (short) 1);
        int int55 = linearSearch34.search(intArray49, 100);
        searching.BinarySearch binarySearch56 = new searching.BinarySearch();
        int[] intArray59 = new int[] { (byte) 100, (short) 10 };
        int int61 = binarySearch56.search(intArray59, (int) '4');
        int[] intArray64 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray64);
        int int67 = binarySearch56.search(intArray64, (int) (short) 10);
        int int69 = linearSearch34.search(intArray64, 1);
        sorting.MergeSort.merge(intArray3, intArray28, intArray64, (int) (byte) -1, (int) (byte) -1);
        sorting.SelectionSort.sort(intArray64);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray64, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) 'a');
        int int4 = examGrades0.grade(5);
        int int6 = examGrades0.grade((int) (byte) 0);
        int int8 = examGrades0.grade((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        searching.LinearSearch linearSearch21 = new searching.LinearSearch();
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        sorting.MergeSort.sort(intArray30, 1);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.merge(intArray25, intArray30, intArray36, (int) (short) 0, (int) (short) 1);
        int int42 = linearSearch21.search(intArray36, 100);
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray52 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray52, 0);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.sort(intArray57, 1);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.merge(intArray52, intArray57, intArray63, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray36, intArray46, intArray57, (int) (byte) -1, (int) (short) 1);
        insertionSort0.sort(intArray57);
        searching.BinarySearch binarySearch72 = new searching.BinarySearch();
        int[] intArray75 = new int[] { (byte) 100, (short) 10 };
        int int77 = binarySearch72.search(intArray75, (int) '4');
        int[] intArray80 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray80);
        int int83 = binarySearch72.search(intArray80, (int) 'a');
        int[] intArray86 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray86);
        sorting.MergeSort.sort(intArray86, 1);
        int int91 = binarySearch72.search(intArray86, (int) (short) 1);
        sorting.SelectionSort.sort(intArray86);
        insertionSort0.sort(intArray86);
        java.lang.Class<?> wildcardClass94 = intArray86.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 10, (int) (short) 10, (-45));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 6" + "'", str3, "Path 6");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber(5);
        java.lang.String str4 = whatKindOfNumber0.processNumber((-1));
        java.lang.String str6 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str8 = whatKindOfNumber0.processNumber((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Positive Odd" + "'", str2, "Positive Odd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Negative Odd" + "'", str4, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Negative Odd" + "'", str6, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Zero" + "'", str8, "Zero");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String str3 = WhichPath.makeDecision((int) ' ', (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 1" + "'", str3, "Path 1");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        insertionSort1.sort(intArray5);
        insertionSort0.sort(intArray5);
        searching.LinearSearch linearSearch23 = new searching.LinearSearch();
        int[] intArray27 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray27, 0);
        int[] intArray32 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray32);
        sorting.MergeSort.sort(intArray32, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        sorting.MergeSort.merge(intArray27, intArray32, intArray38, (int) (short) 0, (int) (short) 1);
        int int44 = linearSearch23.search(intArray38, 100);
        insertionSort0.sort(intArray38);
        searching.LinearSearch linearSearch46 = new searching.LinearSearch();
        int[] intArray50 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray50, 0);
        int int54 = linearSearch46.search(intArray50, (int) ' ');
        int[] intArray58 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray58, 0);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.sort(intArray63, 1);
        int[] intArray69 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray69);
        sorting.MergeSort.merge(intArray58, intArray63, intArray69, (int) (short) 0, (int) (short) 1);
        int int75 = linearSearch46.search(intArray63, (int) (short) 1);
        sorting.MergeSort.sort(intArray63, (int) (byte) 0);
        insertionSort0.sort(intArray63);
        sorting.SelectionSort.sort(intArray63);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        sorting.MergeSort.sort(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort2 = new sorting.BubbleSort();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort2.sort(intArray7);
        sorting.BubbleSort bubbleSort9 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort10 = new sorting.BubbleSort();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0 };
        bubbleSort10.sort(intArray12);
        sorting.BubbleSort bubbleSort14 = new sorting.BubbleSort();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort14.sort(intArray19);
        bubbleSort10.sort(intArray19);
        bubbleSort9.sort(intArray19);
        bubbleSort2.sort(intArray19);
        bubbleSort1.sort(intArray19);
        sorting.BubbleSort bubbleSort25 = new sorting.BubbleSort();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort25.sort(intArray30);
        bubbleSort1.sort(intArray30);
        bubbleSort0.sort(intArray30);
        java.lang.Integer[] intArray34 = null;
        // The following exception was thrown during execution in test generation
        try {
            bubbleSort0.sort(intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch19 = new searching.LinearSearch();
        searching.BinarySearch binarySearch20 = new searching.BinarySearch();
        int[] intArray23 = new int[] { (byte) 100, (short) 10 };
        int int25 = binarySearch20.search(intArray23, (int) '4');
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        int int31 = binarySearch20.search(intArray28, (int) 'a');
        int int33 = linearSearch19.search(intArray28, (int) ' ');
        searching.LinearSearch linearSearch34 = new searching.LinearSearch();
        int[] intArray38 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray38, 0);
        int[] intArray43 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray43);
        sorting.MergeSort.sort(intArray43, 1);
        int[] intArray49 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray49);
        sorting.MergeSort.merge(intArray38, intArray43, intArray49, (int) (short) 0, (int) (short) 1);
        int int55 = linearSearch34.search(intArray49, 100);
        searching.BinarySearch binarySearch56 = new searching.BinarySearch();
        int[] intArray59 = new int[] { (byte) 100, (short) 10 };
        int int61 = binarySearch56.search(intArray59, (int) '4');
        int[] intArray64 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray64);
        int int67 = binarySearch56.search(intArray64, (int) (short) 10);
        int int69 = linearSearch34.search(intArray64, 1);
        sorting.MergeSort.merge(intArray3, intArray28, intArray64, (int) (byte) -1, (int) (byte) -1);
        sorting.SelectionSort.sort(intArray28);
        sorting.SelectionSort.sort(intArray28);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray28, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 1);
        int int6 = examGrades0.grade((int) ' ');
        int int8 = examGrades0.grade(0);
        int int10 = examGrades0.grade(0);
        int int12 = examGrades0.grade((int) (byte) 1);
        int int14 = examGrades0.grade((int) ' ');
        int int16 = examGrades0.grade(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.String str3 = WhichPath.makeDecision(1, (int) (byte) 10, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, (double) 0L);
        double double13 = calculator0.squareRoot((double) (short) 1);
        double double15 = calculator0.square((double) (short) 10);
        double double18 = calculator0.add(3.1622776601683795d, (double) 1.0f);
        double double20 = calculator0.square(22.288205727444506d);
        double double23 = calculator0.divide(4.8639947606592275E7d, 149.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.16227766016838d + "'", double18 == 4.16227766016838d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 496.76411454889006d + "'", double20 == 496.76411454889006d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 326442.6013865253d + "'", double23 == 326442.6013865253d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.String str3 = WhichPath.makeDecision(100, (-78), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        searching.LinearSearch linearSearch12 = new searching.LinearSearch();
        int[] intArray16 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray16, 0);
        int[] intArray21 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray21);
        sorting.MergeSort.sort(intArray21, 1);
        int[] intArray27 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray27);
        sorting.MergeSort.merge(intArray16, intArray21, intArray27, (int) (short) 0, (int) (short) 1);
        int int33 = linearSearch12.search(intArray27, 100);
        searching.BinarySearch binarySearch34 = new searching.BinarySearch();
        int[] intArray37 = new int[] { (byte) 100, (short) 10 };
        int int39 = binarySearch34.search(intArray37, (int) '4');
        int[] intArray42 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray42);
        int int45 = binarySearch34.search(intArray42, (int) (short) 10);
        int int47 = linearSearch12.search(intArray42, 1);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        int int53 = linearSearch12.search(intArray50, (int) (short) -1);
        sorting.QuickSort quickSort54 = new sorting.QuickSort();
        int[] intArray58 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray58, 0);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.sort(intArray63, 1);
        int[] intArray69 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray69);
        sorting.MergeSort.merge(intArray58, intArray63, intArray69, (int) (short) 0, (int) (short) 1);
        quickSort54.sort(intArray63, (int) (byte) 0, (int) (byte) 1);
        int int78 = linearSearch12.search(intArray63, 100);
        int[] intArray85 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray85);
        int int88 = linearSearch12.search(intArray85, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray85, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray14, (int) (short) 0);
        sorting.SelectionSort.sort(intArray14);
        sorting.SelectionSort.sort(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double8 = calculator0.multiply((double) (short) 10, (double) (short) 100);
        double double11 = calculator0.subtract((double) (byte) 100, (double) 10L);
        double double14 = calculator0.add(3000.0d, (-20.0d));
        double double16 = calculator0.square(0.10837419638896069d);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1000.0d + "'", double8 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2980.0d + "'", double14 == 2980.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01174496644295302d + "'", double16 == 0.01174496644295302d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray3 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray3);
        sorting.MergeSort.sort(intArray3, 1);
        insertionSort0.sort(intArray3);
        searching.BinarySearch binarySearch8 = new searching.BinarySearch();
        searching.LinearSearch linearSearch9 = new searching.LinearSearch();
        int[] intArray13 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray13, 0);
        int[] intArray18 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray18);
        sorting.MergeSort.sort(intArray18, 1);
        int[] intArray24 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray24);
        sorting.MergeSort.merge(intArray13, intArray18, intArray24, (int) (short) 0, (int) (short) 1);
        int int30 = linearSearch9.search(intArray24, 100);
        searching.BinarySearch binarySearch31 = new searching.BinarySearch();
        int[] intArray34 = new int[] { (byte) 100, (short) 10 };
        int int36 = binarySearch31.search(intArray34, (int) '4');
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = binarySearch31.search(intArray39, (int) (short) 10);
        int int44 = linearSearch9.search(intArray39, 1);
        int[] intArray47 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray47);
        int int50 = linearSearch9.search(intArray47, (int) (short) -1);
        int int52 = binarySearch8.search(intArray47, (int) (short) 100);
        searching.BinarySearch binarySearch53 = new searching.BinarySearch();
        int[] intArray56 = new int[] { (byte) 100, (short) 10 };
        int int58 = binarySearch53.search(intArray56, (int) '4');
        sorting.QuickSort quickSort59 = new sorting.QuickSort();
        int[] intArray66 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray66);
        quickSort59.sort(intArray66, 1, 1);
        int int72 = binarySearch53.search(intArray66, (int) (short) 0);
        int int74 = binarySearch8.search(intArray66, 5);
        int[] intArray78 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray78, 0);
        int[] intArray83 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray83);
        sorting.MergeSort.sort(intArray83, 1);
        int[] intArray89 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray89);
        sorting.MergeSort.merge(intArray78, intArray83, intArray89, (int) (short) 0, (int) (short) 1);
        int int95 = binarySearch8.search(intArray83, 0);
        sorting.SelectionSort.sort(intArray83);
        insertionSort0.sort(intArray83);
        java.lang.Class<?> wildcardClass98 = intArray83.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.add((-1.0d), (-1.0d));
        double double18 = calculator0.square(1441.0133021728857d);
        double double21 = calculator0.subtract(110.0d, 111.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2076519.3370392043d + "'", double18 == 2076519.3370392043d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.multiply((double) 1, (double) 0.0f);
        double double18 = calculator0.squareRoot((double) (byte) 10);
        double double20 = calculator0.squareRoot(99.0d);
        double double23 = calculator0.subtract(0.0d, 20529.50990059046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.1622776601683795d + "'", double18 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 9.9498743710662d + "'", double20 == 9.9498743710662d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-20529.50990059046d) + "'", double23 == (-20529.50990059046d));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 0, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        searching.LinearSearch linearSearch12 = new searching.LinearSearch();
        int[] intArray16 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray16, 0);
        int int20 = linearSearch12.search(intArray16, (int) ' ');
        int int22 = binarySearch0.search(intArray16, (int) (byte) 100);
        int[] intArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = binarySearch0.search(intArray23, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 0, (int) (short) 0, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.sort(intArray14, 1);
        int int19 = binarySearch0.search(intArray14, (int) (short) 1);
        sorting.QuickSort quickSort20 = new sorting.QuickSort();
        int[] intArray27 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray27);
        quickSort20.sort(intArray27, 1, 1);
        sorting.InsertionSort insertionSort32 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort33 = new sorting.InsertionSort();
        int[] intArray37 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray37, 0);
        int[] intArray42 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray42);
        sorting.MergeSort.sort(intArray42, 1);
        int[] intArray48 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray48);
        sorting.MergeSort.merge(intArray37, intArray42, intArray48, (int) (short) 0, (int) (short) 1);
        insertionSort33.sort(intArray37);
        insertionSort32.sort(intArray37);
        quickSort20.sort(intArray37, 100, 0);
        int int59 = binarySearch0.search(intArray37, 5);
        java.lang.Class<?> wildcardClass60 = intArray37.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) -1, (int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        searching.BinarySearch binarySearch22 = new searching.BinarySearch();
        int[] intArray25 = new int[] { (byte) 100, (short) 10 };
        int int27 = binarySearch22.search(intArray25, (int) '4');
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        int int33 = binarySearch22.search(intArray30, (int) (short) 10);
        int int35 = linearSearch0.search(intArray30, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        int int41 = linearSearch0.search(intArray38, (int) (short) -1);
        sorting.QuickSort quickSort42 = new sorting.QuickSort();
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        sorting.MergeSort.sort(intArray51, 1);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.merge(intArray46, intArray51, intArray57, (int) (short) 0, (int) (short) 1);
        quickSort42.sort(intArray51, (int) (byte) 0, (int) (byte) 1);
        int int66 = linearSearch0.search(intArray51, 100);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray51, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int int8 = linearSearch0.search(intArray4, (int) ' ');
        searching.LinearSearch linearSearch9 = new searching.LinearSearch();
        int[] intArray13 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray13, 0);
        int[] intArray18 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray18);
        sorting.MergeSort.sort(intArray18, 1);
        int[] intArray24 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray24);
        sorting.MergeSort.merge(intArray13, intArray18, intArray24, (int) (short) 0, (int) (short) 1);
        int int30 = linearSearch9.search(intArray24, 100);
        int[] intArray34 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray34, 0);
        int[] intArray40 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray40, 0);
        int[] intArray45 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray45);
        sorting.MergeSort.sort(intArray45, 1);
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        sorting.MergeSort.merge(intArray40, intArray45, intArray51, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray24, intArray34, intArray45, (int) (byte) -1, (int) (short) 1);
        sorting.MergeSort.sort(intArray34, (int) (byte) 0);
        int int62 = linearSearch0.search(intArray34, (int) (byte) -1);
        sorting.InsertionSort insertionSort63 = new sorting.InsertionSort();
        int[] intArray66 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray66);
        sorting.MergeSort.sort(intArray66, 1);
        insertionSort63.sort(intArray66);
        int int72 = linearSearch0.search(intArray66, 10);
        int[] intArray73 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int75 = linearSearch0.search(intArray73, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String str3 = WhichPath.makeDecision((int) ' ', 5, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 5" + "'", str3, "Path 5");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort2 = new sorting.BubbleSort();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0 };
        bubbleSort2.sort(intArray4);
        sorting.BubbleSort bubbleSort6 = new sorting.BubbleSort();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort6.sort(intArray11);
        bubbleSort2.sort(intArray11);
        bubbleSort1.sort(intArray11);
        bubbleSort0.sort(intArray11);
        sorting.BubbleSort bubbleSort16 = new sorting.BubbleSort();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0 };
        bubbleSort16.sort(intArray18);
        sorting.BubbleSort bubbleSort20 = new sorting.BubbleSort();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort20.sort(intArray25);
        bubbleSort16.sort(intArray25);
        bubbleSort0.sort(intArray25);
        sorting.BubbleSort bubbleSort29 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort30 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort31 = new sorting.BubbleSort();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0 };
        bubbleSort31.sort(intArray33);
        sorting.BubbleSort bubbleSort35 = new sorting.BubbleSort();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort35.sort(intArray40);
        bubbleSort31.sort(intArray40);
        bubbleSort30.sort(intArray40);
        bubbleSort29.sort(intArray40);
        sorting.BubbleSort bubbleSort45 = new sorting.BubbleSort();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort45.sort(intArray50);
        sorting.BubbleSort bubbleSort52 = new sorting.BubbleSort();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort52.sort(intArray57);
        bubbleSort45.sort(intArray57);
        sorting.BubbleSort bubbleSort60 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort61 = new sorting.BubbleSort();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 0 };
        bubbleSort61.sort(intArray63);
        sorting.BubbleSort bubbleSort65 = new sorting.BubbleSort();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort65.sort(intArray70);
        bubbleSort61.sort(intArray70);
        bubbleSort60.sort(intArray70);
        bubbleSort45.sort(intArray70);
        bubbleSort29.sort(intArray70);
        bubbleSort0.sort(intArray70);
        sorting.BubbleSort bubbleSort77 = new sorting.BubbleSort();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort77.sort(intArray82);
        bubbleSort0.sort(intArray82);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int[] intArray2 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray2);
        sorting.QuickSort quickSort4 = new sorting.QuickSort();
        int[] intArray11 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray11);
        quickSort4.sort(intArray11, 1, 1);
        sorting.InsertionSort insertionSort16 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort17 = new sorting.InsertionSort();
        int[] intArray21 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray21, 0);
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        sorting.MergeSort.sort(intArray26, 1);
        int[] intArray32 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray32);
        sorting.MergeSort.merge(intArray21, intArray26, intArray32, (int) (short) 0, (int) (short) 1);
        insertionSort17.sort(intArray21);
        insertionSort16.sort(intArray21);
        quickSort4.sort(intArray21, 100, 0);
        sorting.SelectionSort.sort(intArray21);
        searching.BinarySearch binarySearch43 = new searching.BinarySearch();
        int[] intArray46 = new int[] { (byte) 100, (short) 10 };
        int int48 = binarySearch43.search(intArray46, (int) '4');
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        int int54 = binarySearch43.search(intArray51, (int) (short) 10);
        int[] intArray58 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray58, 0);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.sort(intArray63, 1);
        int[] intArray69 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray69);
        sorting.MergeSort.merge(intArray58, intArray63, intArray69, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray69, (int) (short) 0);
        sorting.SelectionSort.sort(intArray69);
        sorting.SelectionSort.sort(intArray69);
        sorting.SelectionSort.sort(intArray69);
        int int80 = binarySearch43.search(intArray69, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray2, intArray21, intArray69, (int) (short) 100, (-78));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.subtract((double) (short) 0, 1500.0d);
        double double13 = calculator0.add((-52.0d), (-1.0E8d));
        double double16 = calculator0.divide((double) 0.0f, 2025.0d);
        double double19 = calculator0.subtract(32.0d, (-530.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1500.0d) + "'", double10 == (-1500.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.00000052E8d) + "'", double13 == (-1.00000052E8d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 562.0d + "'", double19 == 562.0d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.divide(3000.0d, 2.0d);
        double double7 = calculator0.squareRoot(3.1622776601683795d);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1500.0d + "'", double5 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7782794100389228d + "'", double7 == 1.7782794100389228d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int[] intArray5 = new int[] { (byte) 1, (byte) 1, 'a', 100, (short) 10 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 1, 'a', 100, (short) 10 };
        int[] intArray17 = new int[] { (byte) 1, (byte) 1, 'a', 100, (short) 10 };
        int[] intArray23 = new int[] { (byte) 1, (byte) 1, 'a', 100, (short) 10 };
        int[] intArray29 = new int[] { (byte) 1, (byte) 1, 'a', 100, (short) 10 };
        int[] intArray35 = new int[] { (byte) 1, (byte) 1, 'a', 100, (short) 10 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        int int37 = NestedLoops.calculateSum(intArray36);
        int int38 = NestedLoops.calculateSum(intArray36);
        java.lang.Class<?> wildcardClass39 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 1, 97, 100, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 1, 1, 97, 100, 10 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 1, 97, 100, 10 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 1, 97, 100, 10 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 1, 97, 100, 10 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 1, 97, 100, 10 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        int[] intArray24 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray24, 0);
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        sorting.MergeSort.sort(intArray29, 1);
        int[] intArray35 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray35);
        sorting.MergeSort.merge(intArray24, intArray29, intArray35, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch40 = new searching.LinearSearch();
        searching.BinarySearch binarySearch41 = new searching.BinarySearch();
        int[] intArray44 = new int[] { (byte) 100, (short) 10 };
        int int46 = binarySearch41.search(intArray44, (int) '4');
        int[] intArray49 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray49);
        int int52 = binarySearch41.search(intArray49, (int) 'a');
        int int54 = linearSearch40.search(intArray49, (int) ' ');
        searching.LinearSearch linearSearch55 = new searching.LinearSearch();
        int[] intArray59 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray59, 0);
        int[] intArray64 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray64);
        sorting.MergeSort.sort(intArray64, 1);
        int[] intArray70 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray70);
        sorting.MergeSort.merge(intArray59, intArray64, intArray70, (int) (short) 0, (int) (short) 1);
        int int76 = linearSearch55.search(intArray70, 100);
        searching.BinarySearch binarySearch77 = new searching.BinarySearch();
        int[] intArray80 = new int[] { (byte) 100, (short) 10 };
        int int82 = binarySearch77.search(intArray80, (int) '4');
        int[] intArray85 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray85);
        int int88 = binarySearch77.search(intArray85, (int) (short) 10);
        int int90 = linearSearch55.search(intArray85, 1);
        sorting.MergeSort.merge(intArray24, intArray49, intArray85, (int) (byte) -1, (int) (byte) -1);
        sorting.SelectionSort.sort(intArray49);
        insertionSort0.sort(intArray49);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray49, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int int8 = linearSearch0.search(intArray4, (int) ' ');
        searching.BinarySearch binarySearch9 = new searching.BinarySearch();
        searching.LinearSearch linearSearch10 = new searching.LinearSearch();
        int[] intArray14 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray14, 0);
        int[] intArray19 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray19);
        sorting.MergeSort.sort(intArray19, 1);
        int[] intArray25 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray25);
        sorting.MergeSort.merge(intArray14, intArray19, intArray25, (int) (short) 0, (int) (short) 1);
        int int31 = linearSearch10.search(intArray25, 100);
        searching.BinarySearch binarySearch32 = new searching.BinarySearch();
        int[] intArray35 = new int[] { (byte) 100, (short) 10 };
        int int37 = binarySearch32.search(intArray35, (int) '4');
        int[] intArray40 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray40);
        int int43 = binarySearch32.search(intArray40, (int) (short) 10);
        int int45 = linearSearch10.search(intArray40, 1);
        int[] intArray48 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray48);
        int int51 = linearSearch10.search(intArray48, (int) (short) -1);
        int int53 = binarySearch9.search(intArray48, (int) (short) 100);
        searching.BinarySearch binarySearch54 = new searching.BinarySearch();
        int[] intArray57 = new int[] { (byte) 100, (short) 10 };
        int int59 = binarySearch54.search(intArray57, (int) '4');
        sorting.QuickSort quickSort60 = new sorting.QuickSort();
        int[] intArray67 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray67);
        quickSort60.sort(intArray67, 1, 1);
        int int73 = binarySearch54.search(intArray67, (int) (short) 0);
        int int75 = binarySearch9.search(intArray67, 5);
        int[] intArray79 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray79, 0);
        int[] intArray84 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray84);
        sorting.MergeSort.sort(intArray84, 1);
        int[] intArray90 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray90);
        sorting.MergeSort.merge(intArray79, intArray84, intArray90, (int) (short) 0, (int) (short) 1);
        int int96 = binarySearch9.search(intArray84, 0);
        int int98 = linearSearch0.search(intArray84, (int) (short) 100);
        sorting.SelectionSort.sort(intArray84);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        sorting.QuickSort quickSort6 = new sorting.QuickSort();
        int[] intArray13 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray13);
        quickSort6.sort(intArray13, 1, 1);
        int int19 = binarySearch0.search(intArray13, (int) (short) 0);
        searching.LinearSearch linearSearch20 = new searching.LinearSearch();
        searching.BinarySearch binarySearch21 = new searching.BinarySearch();
        int[] intArray24 = new int[] { (byte) 100, (short) 10 };
        int int26 = binarySearch21.search(intArray24, (int) '4');
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        int int32 = binarySearch21.search(intArray29, (int) 'a');
        int int34 = linearSearch20.search(intArray29, (int) ' ');
        int int36 = binarySearch0.search(intArray29, (int) (byte) 10);
        sorting.SelectionSort.sort(intArray29);
        sorting.SelectionSort.sort(intArray29);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str3 = WhichPath.makeDecision(0, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String str3 = WhichPath.makeDecision((-1), 0, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.add((double) 0L, (double) (byte) -1);
        double double8 = calculator0.multiply((double) (-1L), 1.0E8d);
        double double11 = calculator0.divide(22289.788590400243d, (-1.0049875822118436E-17d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0E8d) + "'", double8 == (-1.0E8d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-2.2179168165783095E21d) + "'", double11 == (-2.2179168165783095E21d));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        int[] intArray26 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray26, 0);
        int[] intArray32 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray32, 0);
        int[] intArray37 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray37);
        sorting.MergeSort.sort(intArray37, 1);
        int[] intArray43 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray43);
        sorting.MergeSort.merge(intArray32, intArray37, intArray43, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray16, intArray26, intArray37, (int) (byte) -1, (int) (short) 1);
        int int52 = binarySearch0.search(intArray37, (-1));
        java.lang.Class<?> wildcardClass53 = intArray37.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        int[] intArray26 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray26, 0);
        int[] intArray32 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray32, 0);
        int[] intArray37 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray37);
        sorting.MergeSort.sort(intArray37, 1);
        int[] intArray43 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray43);
        sorting.MergeSort.merge(intArray32, intArray37, intArray43, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray16, intArray26, intArray37, (int) (byte) -1, (int) (short) 1);
        quickSort0.sort(intArray26, (int) '4', (int) (short) -1);
        sorting.SelectionSort.sort(intArray26);
        sorting.SelectionSort.sort(intArray26);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray26, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 35 });
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort0.sort(intArray5);
        sorting.BubbleSort bubbleSort7 = new sorting.BubbleSort();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort7.sort(intArray12);
        bubbleSort0.sort(intArray12);
        sorting.BubbleSort bubbleSort15 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort16 = new sorting.BubbleSort();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort16.sort(intArray21);
        sorting.BubbleSort bubbleSort23 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort24 = new sorting.BubbleSort();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0 };
        bubbleSort24.sort(intArray26);
        sorting.BubbleSort bubbleSort28 = new sorting.BubbleSort();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort28.sort(intArray33);
        bubbleSort24.sort(intArray33);
        bubbleSort23.sort(intArray33);
        bubbleSort16.sort(intArray33);
        bubbleSort15.sort(intArray33);
        sorting.BubbleSort bubbleSort39 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort40 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort41 = new sorting.BubbleSort();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0 };
        bubbleSort41.sort(intArray43);
        sorting.BubbleSort bubbleSort45 = new sorting.BubbleSort();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort45.sort(intArray50);
        bubbleSort41.sort(intArray50);
        bubbleSort40.sort(intArray50);
        bubbleSort39.sort(intArray50);
        sorting.BubbleSort bubbleSort55 = new sorting.BubbleSort();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0 };
        bubbleSort55.sort(intArray57);
        sorting.BubbleSort bubbleSort59 = new sorting.BubbleSort();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort59.sort(intArray64);
        bubbleSort55.sort(intArray64);
        bubbleSort39.sort(intArray64);
        bubbleSort15.sort(intArray64);
        bubbleSort0.sort(intArray64);
        java.lang.Class<?> wildcardClass70 = intArray64.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int[] intArray2 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray2);
        sorting.SelectionSort.sort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, 35 });
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        quickSort0.sort(intArray17, 100, 0);
        searching.BinarySearch binarySearch38 = new searching.BinarySearch();
        int[] intArray41 = new int[] { (byte) 100, (short) 10 };
        int int43 = binarySearch38.search(intArray41, (int) '4');
        int[] intArray46 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray46);
        int int49 = binarySearch38.search(intArray46, (int) 'a');
        searching.LinearSearch linearSearch50 = new searching.LinearSearch();
        int[] intArray54 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray54, 0);
        int int58 = linearSearch50.search(intArray54, (int) ' ');
        int int60 = binarySearch38.search(intArray54, (int) (byte) 100);
        quickSort0.sort(intArray54, (int) '4', 0);
        searching.LinearSearch linearSearch64 = new searching.LinearSearch();
        searching.BinarySearch binarySearch65 = new searching.BinarySearch();
        int[] intArray68 = new int[] { (byte) 100, (short) 10 };
        int int70 = binarySearch65.search(intArray68, (int) '4');
        int[] intArray73 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray73);
        int int76 = binarySearch65.search(intArray73, (int) 'a');
        int int78 = linearSearch64.search(intArray73, (int) ' ');
        sorting.SelectionSort.sort(intArray73);
        sorting.SelectionSort.sort(intArray73);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray73, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.multiply((double) 1, (double) 0.0f);
        double double18 = calculator0.squareRoot((double) (byte) 10);
        double double20 = calculator0.square(10000.0d);
        double double23 = calculator0.subtract(9.99971E7d, 22288.205727444507d);
        double double25 = calculator0.square(1000.0d);
        double double27 = calculator0.squareRoot(998555.4110913763d);
        double double29 = calculator0.square((-3.1575932231642967d));
        double double32 = calculator0.divide(0.0d, 9.893330492872007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.1622776601683795d + "'", double18 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E8d + "'", double20 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 9.997481179427256E7d + "'", double23 == 9.997481179427256E7d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1000000.0d + "'", double25 == 1000000.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 999.2774445024646d + "'", double27 == 999.2774445024646d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 9.970394962973092d + "'", double29 == 9.970394962973092d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        int[] intArray28 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray28);
        searching.BinarySearch binarySearch30 = new searching.BinarySearch();
        int[] intArray33 = new int[] { (byte) 100, (short) 10 };
        int int35 = binarySearch30.search(intArray33, (int) '4');
        sorting.QuickSort quickSort36 = new sorting.QuickSort();
        int[] intArray43 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray43);
        quickSort36.sort(intArray43, 1, 1);
        int int49 = binarySearch30.search(intArray43, (int) (short) 0);
        sorting.QuickSort quickSort50 = new sorting.QuickSort();
        int[] intArray57 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray57);
        quickSort50.sort(intArray57, 1, 1);
        int int63 = binarySearch30.search(intArray57, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray15, intArray28, intArray57, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), 0 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray31 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray31, 0);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.sort(intArray36, 1);
        int[] intArray42 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray42);
        sorting.MergeSort.merge(intArray31, intArray36, intArray42, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray15, intArray25, intArray36, (int) (byte) -1, (int) (short) 1);
        sorting.MergeSort.sort(intArray25, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray25, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 35 });
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide((double) (short) 0, (double) (short) -1);
        double double11 = calculator0.subtract((double) '4', (-99.0d));
        double double14 = calculator0.add(1.0E8d, (-1.0d));
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 151.0d + "'", double11 == 151.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.9999999E7d + "'", double14 == 9.9999999E7d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str3 = WhichPath.makeDecision((int) ' ', (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double4 = calculator0.square((double) 100L);
        double double7 = calculator0.subtract(149.0d, 9.99971E7d);
        double double10 = calculator0.subtract((double) (byte) 0, 33.0d);
        double double13 = calculator0.multiply(31.622776601683793d, 4.5E9d);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.9996951E7d) + "'", double7 == (-9.9996951E7d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-33.0d) + "'", double10 == (-33.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.4230249470757706E11d + "'", double13 == 1.4230249470757706E11d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 1, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 100, (int) 'a', (-45));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 5" + "'", str3, "Path 5");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String str3 = WhichPath.makeDecision(2, (int) '#', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int[] intArray6 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 1, 10, 35, 100 });
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.subtract((double) (short) 0, 1500.0d);
        double double13 = calculator0.add((-52.0d), (-1.0E8d));
        double double16 = calculator0.subtract((-8880400.0d), 2.979956299664745E7d);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1500.0d) + "'", double10 == (-1500.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.00000052E8d) + "'", double13 == (-1.00000052E8d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.867996299664745E7d) + "'", double16 == (-3.867996299664745E7d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        bubbleSort0.sort(intArray2);
        sorting.BubbleSort bubbleSort4 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort5 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort6 = new sorting.BubbleSort();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 0 };
        bubbleSort6.sort(intArray8);
        sorting.BubbleSort bubbleSort10 = new sorting.BubbleSort();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort10.sort(intArray15);
        bubbleSort6.sort(intArray15);
        bubbleSort5.sort(intArray15);
        bubbleSort4.sort(intArray15);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 100 };
        bubbleSort4.sort(intArray22);
        sorting.BubbleSort bubbleSort24 = new sorting.BubbleSort();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0 };
        bubbleSort24.sort(intArray26);
        sorting.BubbleSort bubbleSort28 = new sorting.BubbleSort();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort28.sort(intArray33);
        bubbleSort24.sort(intArray33);
        bubbleSort4.sort(intArray33);
        bubbleSort0.sort(intArray33);
        sorting.BubbleSort bubbleSort38 = new sorting.BubbleSort();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0 };
        bubbleSort38.sort(intArray40);
        sorting.BubbleSort bubbleSort42 = new sorting.BubbleSort();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort42.sort(intArray47);
        bubbleSort38.sort(intArray47);
        sorting.BubbleSort bubbleSort50 = new sorting.BubbleSort();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort50.sort(intArray55);
        sorting.BubbleSort bubbleSort57 = new sorting.BubbleSort();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort57.sort(intArray62);
        bubbleSort50.sort(intArray62);
        sorting.BubbleSort bubbleSort65 = new sorting.BubbleSort();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort65.sort(intArray70);
        bubbleSort50.sort(intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, (-1), (-1) };
        bubbleSort50.sort(intArray76);
        bubbleSort38.sort(intArray76);
        bubbleSort0.sort(intArray76);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 2, 100 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new java.lang.Integer[] { (-1), (-1), 2 });
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, (int) 'a', (int) (byte) 10);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        searching.LinearSearch linearSearch35 = new searching.LinearSearch();
        int[] intArray39 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray39, 0);
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        sorting.MergeSort.sort(intArray44, 1);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        sorting.MergeSort.merge(intArray39, intArray44, intArray50, (int) (short) 0, (int) (short) 1);
        int int56 = linearSearch35.search(intArray50, 100);
        insertionSort12.sort(intArray50);
        quickSort0.sort(intArray50, (int) (short) 1, 0);
        int[] intArray61 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray61, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.String str3 = WhichPath.makeDecision((int) '#', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        sorting.QuickSort quickSort6 = new sorting.QuickSort();
        int[] intArray13 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray13);
        quickSort6.sort(intArray13, 1, 1);
        int int19 = binarySearch0.search(intArray13, (int) (short) 0);
        sorting.MergeSort.sort(intArray13, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String str3 = WhichPath.makeDecision(2, (-1), (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.multiply((double) 1, (double) 0.0f);
        double double18 = calculator0.squareRoot((double) (byte) 10);
        double double20 = calculator0.square(10000.0d);
        double double23 = calculator0.subtract(9.99971E7d, 22288.205727444507d);
        double double25 = calculator0.square(1000.0d);
        double double27 = calculator0.squareRoot((double) 100L);
        double double30 = calculator0.multiply((-2.2179168165783095E21d), 2152089.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.1622776601683795d + "'", double18 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E8d + "'", double20 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 9.997481179427256E7d + "'", double23 == 9.997481179427256E7d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1000000.0d + "'", double25 == 1000000.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-4.773154383873198E27d) + "'", double30 == (-4.773154383873198E27d));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        int int34 = binarySearch23.search(intArray31, (int) (short) 10);
        int int36 = linearSearch1.search(intArray31, 1);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = linearSearch1.search(intArray39, (int) (short) -1);
        int int44 = binarySearch0.search(intArray39, (int) (short) 100);
        searching.BinarySearch binarySearch45 = new searching.BinarySearch();
        int[] intArray48 = new int[] { (byte) 100, (short) 10 };
        int int50 = binarySearch45.search(intArray48, (int) '4');
        sorting.QuickSort quickSort51 = new sorting.QuickSort();
        int[] intArray58 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray58);
        quickSort51.sort(intArray58, 1, 1);
        int int64 = binarySearch45.search(intArray58, (int) (short) 0);
        int int66 = binarySearch0.search(intArray58, 5);
        int[] intArray70 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray70, 0);
        int[] intArray75 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray75);
        sorting.MergeSort.sort(intArray75, 1);
        int[] intArray81 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray81);
        sorting.MergeSort.merge(intArray70, intArray75, intArray81, (int) (short) 0, (int) (short) 1);
        int int87 = binarySearch0.search(intArray75, 0);
        java.lang.Class<?> wildcardClass88 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) '#');
        int int6 = examGrades0.grade(5);
        int int8 = examGrades0.grade((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = examGrades0.grade((-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.String str3 = WhichPath.makeDecision((int) 'a', 4, (-78));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double4 = calculator0.square((double) 100L);
        double double7 = calculator0.subtract(149.0d, 9.99971E7d);
        double double10 = calculator0.subtract((double) (byte) 0, 33.0d);
        double double13 = calculator0.multiply(31.622776601683793d, 4.5E9d);
        double double16 = calculator0.subtract(9.9999998E15d, 10.535653752852738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.9996951E7d) + "'", double7 == (-9.9996951E7d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-33.0d) + "'", double10 == (-33.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.4230249470757706E11d + "'", double13 == 1.4230249470757706E11d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.99999979999999E15d + "'", double16 == 9.99999979999999E15d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) (short) 10);
        searching.BinarySearch binarySearch12 = new searching.BinarySearch();
        int[] intArray15 = new int[] { (byte) 100, (short) 10 };
        int int17 = binarySearch12.search(intArray15, (int) '4');
        searching.BinarySearch binarySearch18 = new searching.BinarySearch();
        int[] intArray21 = new int[] { (byte) 100, (short) 10 };
        int int23 = binarySearch18.search(intArray21, (int) '4');
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        int int29 = binarySearch18.search(intArray26, (int) 'a');
        int int31 = binarySearch12.search(intArray26, 100);
        sorting.SelectionSort.sort(intArray26);
        int int34 = binarySearch0.search(intArray26, (int) (short) 1);
        searching.LinearSearch linearSearch35 = new searching.LinearSearch();
        searching.BinarySearch binarySearch36 = new searching.BinarySearch();
        int[] intArray39 = new int[] { (byte) 100, (short) 10 };
        int int41 = binarySearch36.search(intArray39, (int) '4');
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        int int47 = binarySearch36.search(intArray44, (int) 'a');
        int int49 = linearSearch35.search(intArray44, (int) ' ');
        searching.BinarySearch binarySearch50 = new searching.BinarySearch();
        int[] intArray53 = new int[] { (byte) 100, (short) 10 };
        int int55 = binarySearch50.search(intArray53, (int) '4');
        int int57 = linearSearch35.search(intArray53, 1);
        sorting.SelectionSort.sort(intArray53);
        int int60 = binarySearch0.search(intArray53, (int) (byte) 10);
        int[] intArray67 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray67);
        int int70 = binarySearch0.search(intArray67, 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray67, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        bubbleSort0.sort(intArray2);
        sorting.BubbleSort bubbleSort4 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort5 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort6 = new sorting.BubbleSort();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 0 };
        bubbleSort6.sort(intArray8);
        sorting.BubbleSort bubbleSort10 = new sorting.BubbleSort();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort10.sort(intArray15);
        bubbleSort6.sort(intArray15);
        bubbleSort5.sort(intArray15);
        bubbleSort4.sort(intArray15);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 100 };
        bubbleSort4.sort(intArray22);
        sorting.BubbleSort bubbleSort24 = new sorting.BubbleSort();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0 };
        bubbleSort24.sort(intArray26);
        sorting.BubbleSort bubbleSort28 = new sorting.BubbleSort();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort28.sort(intArray33);
        bubbleSort24.sort(intArray33);
        bubbleSort4.sort(intArray33);
        bubbleSort0.sort(intArray33);
        java.lang.Class<?> wildcardClass38 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 2, 100 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        quickSort0.sort(intArray17, 100, 0);
        searching.BinarySearch binarySearch38 = new searching.BinarySearch();
        int[] intArray41 = new int[] { (byte) 100, (short) 10 };
        int int43 = binarySearch38.search(intArray41, (int) '4');
        int[] intArray46 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray46);
        int int49 = binarySearch38.search(intArray46, (int) 'a');
        searching.LinearSearch linearSearch50 = new searching.LinearSearch();
        int[] intArray54 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray54, 0);
        int int58 = linearSearch50.search(intArray54, (int) ' ');
        int int60 = binarySearch38.search(intArray54, (int) (byte) 100);
        quickSort0.sort(intArray54, (int) '4', 0);
        int[] intArray64 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray64, (-45), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        quickSort0.sort(intArray17, 100, 0);
        searching.BinarySearch binarySearch38 = new searching.BinarySearch();
        int[] intArray41 = new int[] { (byte) 100, (short) 10 };
        int int43 = binarySearch38.search(intArray41, (int) '4');
        int[] intArray46 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray46);
        int int49 = binarySearch38.search(intArray46, (int) 'a');
        searching.LinearSearch linearSearch50 = new searching.LinearSearch();
        int[] intArray54 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray54, 0);
        int int58 = linearSearch50.search(intArray54, (int) ' ');
        int int60 = binarySearch38.search(intArray54, (int) (byte) 100);
        quickSort0.sort(intArray54, (int) '4', 0);
        int[] intArray66 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray66);
        searching.LinearSearch linearSearch68 = new searching.LinearSearch();
        int[] intArray72 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray72, 0);
        int[] intArray77 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray77);
        sorting.MergeSort.sort(intArray77, 1);
        int[] intArray83 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray83);
        sorting.MergeSort.merge(intArray72, intArray77, intArray83, (int) (short) 0, (int) (short) 1);
        int int89 = linearSearch68.search(intArray83, 100);
        sorting.SelectionSort.sort(intArray83);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray54, intArray66, intArray83, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 1, 35 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.subtract((-9.99999979999997E17d), (-20.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = calculator0.squareRoot((-22.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.99999979999997E17d) + "'", double10 == (-9.99999979999997E17d));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.add((double) ' ', (double) 1.0f);
        double double10 = calculator0.square(0.0d);
        double double13 = calculator0.multiply((-1466.891625803611d), 9999.849998874983d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 33.0d + "'", double8 == 33.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.4668696222641962E7d) + "'", double13 == (-1.4668696222641962E7d));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, (int) 'a', (int) (byte) 10);
        int[] intArray12 = null;
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.sort(intArray16, 1);
        insertionSort13.sort(intArray16);
        searching.BinarySearch binarySearch21 = new searching.BinarySearch();
        int[] intArray24 = new int[] { (byte) 100, (short) 10 };
        int int26 = binarySearch21.search(intArray24, (int) '4');
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        int int32 = binarySearch21.search(intArray29, (int) 'a');
        int[] intArray35 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray35);
        sorting.MergeSort.sort(intArray35, 1);
        int int40 = binarySearch21.search(intArray35, (int) (short) 1);
        sorting.QuickSort quickSort41 = new sorting.QuickSort();
        int[] intArray48 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray48);
        quickSort41.sort(intArray48, 1, 1);
        sorting.InsertionSort insertionSort53 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort54 = new sorting.InsertionSort();
        int[] intArray58 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray58, 0);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.sort(intArray63, 1);
        int[] intArray69 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray69);
        sorting.MergeSort.merge(intArray58, intArray63, intArray69, (int) (short) 0, (int) (short) 1);
        insertionSort54.sort(intArray58);
        insertionSort53.sort(intArray58);
        quickSort41.sort(intArray58, 100, 0);
        int int80 = binarySearch21.search(intArray58, 5);
        insertionSort13.sort(intArray58);
        sorting.MergeSort.sort(intArray58, (int) (short) -1);
        sorting.MergeSort.sort(intArray58, (-45));
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray7, intArray12, intArray58, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 1, 10, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray4);
        sorting.MergeSort.sort(intArray4, 1);
        insertionSort1.sort(intArray4);
        int[] intArray12 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray12, 0);
        int[] intArray17 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray17);
        sorting.MergeSort.sort(intArray17, 1);
        int[] intArray23 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray23);
        sorting.MergeSort.merge(intArray12, intArray17, intArray23, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray23, (int) (short) 0);
        sorting.SelectionSort.sort(intArray23);
        sorting.SelectionSort.sort(intArray23);
        insertionSort1.sort(intArray23);
        int int34 = linearSearch0.search(intArray23, (int) 'a');
        int[] intArray38 = new int[] { 10, ' ', (short) -1 };
        sorting.MergeSort.sort(intArray38, 1);
        int int42 = linearSearch0.search(intArray38, (int) (byte) 10);
        sorting.InsertionSort insertionSort43 = new sorting.InsertionSort();
        int[] intArray46 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray46);
        sorting.MergeSort.sort(intArray46, 1);
        insertionSort43.sort(intArray46);
        searching.BinarySearch binarySearch51 = new searching.BinarySearch();
        searching.LinearSearch linearSearch52 = new searching.LinearSearch();
        int[] intArray56 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray56, 0);
        int[] intArray61 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray61);
        sorting.MergeSort.sort(intArray61, 1);
        int[] intArray67 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray67);
        sorting.MergeSort.merge(intArray56, intArray61, intArray67, (int) (short) 0, (int) (short) 1);
        int int73 = linearSearch52.search(intArray67, 100);
        searching.BinarySearch binarySearch74 = new searching.BinarySearch();
        int[] intArray77 = new int[] { (byte) 100, (short) 10 };
        int int79 = binarySearch74.search(intArray77, (int) '4');
        int[] intArray82 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray82);
        int int85 = binarySearch74.search(intArray82, (int) (short) 10);
        int int87 = linearSearch52.search(intArray82, 1);
        int[] intArray90 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray90);
        int int93 = linearSearch52.search(intArray90, (int) (short) -1);
        int int95 = binarySearch51.search(intArray90, (int) (short) 100);
        insertionSort43.sort(intArray90);
        sorting.SelectionSort.sort(intArray90);
        int int99 = linearSearch0.search(intArray90, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 10, 32, (-1) });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = examGrades0.grade((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        bubbleSort0.sort(intArray2);
        sorting.BubbleSort bubbleSort4 = new sorting.BubbleSort();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0 };
        bubbleSort4.sort(intArray6);
        sorting.BubbleSort bubbleSort8 = new sorting.BubbleSort();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort8.sort(intArray13);
        bubbleSort4.sort(intArray13);
        sorting.BubbleSort bubbleSort16 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort17 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort18 = new sorting.BubbleSort();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 0 };
        bubbleSort18.sort(intArray20);
        sorting.BubbleSort bubbleSort22 = new sorting.BubbleSort();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort22.sort(intArray27);
        bubbleSort18.sort(intArray27);
        bubbleSort17.sort(intArray27);
        bubbleSort16.sort(intArray27);
        sorting.BubbleSort bubbleSort32 = new sorting.BubbleSort();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort32.sort(intArray37);
        sorting.BubbleSort bubbleSort39 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort40 = new sorting.BubbleSort();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0 };
        bubbleSort40.sort(intArray42);
        sorting.BubbleSort bubbleSort44 = new sorting.BubbleSort();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort44.sort(intArray49);
        bubbleSort40.sort(intArray49);
        bubbleSort39.sort(intArray49);
        bubbleSort32.sort(intArray49);
        bubbleSort16.sort(intArray49);
        sorting.BubbleSort bubbleSort55 = new sorting.BubbleSort();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0 };
        bubbleSort55.sort(intArray57);
        sorting.BubbleSort bubbleSort59 = new sorting.BubbleSort();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort59.sort(intArray64);
        bubbleSort55.sort(intArray64);
        sorting.BubbleSort bubbleSort67 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort68 = new sorting.BubbleSort();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort68.sort(intArray73);
        sorting.BubbleSort bubbleSort75 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort76 = new sorting.BubbleSort();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0 };
        bubbleSort76.sort(intArray78);
        sorting.BubbleSort bubbleSort80 = new sorting.BubbleSort();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort80.sort(intArray85);
        bubbleSort76.sort(intArray85);
        bubbleSort75.sort(intArray85);
        bubbleSort68.sort(intArray85);
        bubbleSort67.sort(intArray85);
        bubbleSort55.sort(intArray85);
        bubbleSort16.sort(intArray85);
        bubbleSort4.sort(intArray85);
        bubbleSort0.sort(intArray85);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 10, 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        int int34 = binarySearch23.search(intArray31, (int) (short) 10);
        int int36 = linearSearch1.search(intArray31, 1);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = linearSearch1.search(intArray39, (int) (short) -1);
        int int44 = binarySearch0.search(intArray39, (int) (short) 100);
        searching.BinarySearch binarySearch45 = new searching.BinarySearch();
        int[] intArray48 = new int[] { (byte) 100, (short) 10 };
        int int50 = binarySearch45.search(intArray48, (int) '4');
        sorting.QuickSort quickSort51 = new sorting.QuickSort();
        int[] intArray58 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray58);
        quickSort51.sort(intArray58, 1, 1);
        int int64 = binarySearch45.search(intArray58, (int) (short) 0);
        int int66 = binarySearch0.search(intArray58, 5);
        int[] intArray70 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray70, 0);
        int[] intArray75 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray75);
        sorting.MergeSort.sort(intArray75, 1);
        int[] intArray81 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray81);
        sorting.MergeSort.merge(intArray70, intArray75, intArray81, (int) (short) 0, (int) (short) 1);
        int int87 = binarySearch0.search(intArray75, 0);
        int[] intArray89 = new int[] { (byte) 1 };
        int int91 = binarySearch0.search(intArray89, (int) 'a');
        sorting.SelectionSort.sort(intArray89);
        sorting.SelectionSort.sort(intArray89);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray89, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        int[] intArray26 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray26, 0);
        int[] intArray32 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray32, 0);
        int[] intArray37 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray37);
        sorting.MergeSort.sort(intArray37, 1);
        int[] intArray43 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray43);
        sorting.MergeSort.merge(intArray32, intArray37, intArray43, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray16, intArray26, intArray37, (int) (byte) -1, (int) (short) 1);
        quickSort0.sort(intArray26, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass54 = quickSort0.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 10, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray31 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray31, 0);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.sort(intArray36, 1);
        int[] intArray42 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray42);
        sorting.MergeSort.merge(intArray31, intArray36, intArray42, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray15, intArray25, intArray36, (int) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray15, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 35 });
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray3 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray3);
        sorting.MergeSort.sort(intArray3, 1);
        insertionSort0.sort(intArray3);
        int[] intArray11 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray11, 0);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.sort(intArray16, 1);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.merge(intArray11, intArray16, intArray22, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray11, (int) (short) 1);
        sorting.MergeSort.sort(intArray11, 2);
        insertionSort0.sort(intArray11);
        searching.BinarySearch binarySearch32 = new searching.BinarySearch();
        int[] intArray35 = new int[] { (byte) 100, (short) 10 };
        int int37 = binarySearch32.search(intArray35, (int) '4');
        sorting.MergeSort.sort(intArray35, (int) (byte) 1);
        insertionSort0.sort(intArray35);
        searching.LinearSearch linearSearch41 = new searching.LinearSearch();
        int[] intArray45 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray45, 0);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        sorting.MergeSort.sort(intArray50, 1);
        int[] intArray56 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray56);
        sorting.MergeSort.merge(intArray45, intArray50, intArray56, (int) (short) 0, (int) (short) 1);
        int int62 = linearSearch41.search(intArray56, 100);
        int[] intArray66 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray66, 0);
        int[] intArray72 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray72, 0);
        int[] intArray77 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray77);
        sorting.MergeSort.sort(intArray77, 1);
        int[] intArray83 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray83);
        sorting.MergeSort.merge(intArray72, intArray77, intArray83, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray56, intArray66, intArray77, (int) (byte) -1, (int) (short) 1);
        insertionSort0.sort(intArray56);
        java.lang.Class<?> wildcardClass92 = intArray56.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.String str3 = WhichPath.makeDecision(100, (int) (short) 1, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 2" + "'", str3, "Path 2");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.divide((double) 100L, (double) 1L);
        double double12 = calculator0.square((double) 5);
        double double15 = calculator0.add(1.5828625057366885d, 4.5E-7d);
        double double18 = calculator0.subtract(22.288205727444506d, (-20.0d));
        double double21 = calculator0.subtract(25.0d, (-2.711794272555494d));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.5828629557366884d + "'", double15 == 1.5828629557366884d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 42.288205727444506d + "'", double18 == 42.288205727444506d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 27.711794272555494d + "'", double21 == 27.711794272555494d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        quickSort0.sort(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray26 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray26, 0);
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        sorting.MergeSort.sort(intArray31, 1);
        int[] intArray37 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray37);
        sorting.MergeSort.merge(intArray26, intArray31, intArray37, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch42 = new searching.LinearSearch();
        searching.BinarySearch binarySearch43 = new searching.BinarySearch();
        int[] intArray46 = new int[] { (byte) 100, (short) 10 };
        int int48 = binarySearch43.search(intArray46, (int) '4');
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        int int54 = binarySearch43.search(intArray51, (int) 'a');
        int int56 = linearSearch42.search(intArray51, (int) ' ');
        searching.LinearSearch linearSearch57 = new searching.LinearSearch();
        int[] intArray61 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray61, 0);
        int[] intArray66 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray66);
        sorting.MergeSort.sort(intArray66, 1);
        int[] intArray72 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray72);
        sorting.MergeSort.merge(intArray61, intArray66, intArray72, (int) (short) 0, (int) (short) 1);
        int int78 = linearSearch57.search(intArray72, 100);
        searching.BinarySearch binarySearch79 = new searching.BinarySearch();
        int[] intArray82 = new int[] { (byte) 100, (short) 10 };
        int int84 = binarySearch79.search(intArray82, (int) '4');
        int[] intArray87 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray87);
        int int90 = binarySearch79.search(intArray87, (int) (short) 10);
        int int92 = linearSearch57.search(intArray87, 1);
        sorting.MergeSort.merge(intArray26, intArray51, intArray87, (int) (byte) -1, (int) (byte) -1);
        quickSort0.sort(intArray26, (int) (short) 100, (int) (short) 10);
        sorting.SelectionSort.sort(intArray26);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertArrayEquals(intArray87, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 1);
        int int6 = examGrades0.grade((int) ' ');
        int int8 = examGrades0.grade(0);
        int int10 = examGrades0.grade(0);
        int int12 = examGrades0.grade((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = examGrades0.grade((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.divide(3000.0d, 2.0d);
        double double7 = calculator0.squareRoot(3.1622776601683795d);
        double double10 = calculator0.add((-10.0d), (-520.0d));
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1500.0d + "'", double5 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7782794100389228d + "'", double7 == 1.7782794100389228d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-530.0d) + "'", double10 == (-530.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        searching.LinearSearch linearSearch21 = new searching.LinearSearch();
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        sorting.MergeSort.sort(intArray30, 1);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.merge(intArray25, intArray30, intArray36, (int) (short) 0, (int) (short) 1);
        int int42 = linearSearch21.search(intArray36, 100);
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray52 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray52, 0);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.sort(intArray57, 1);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.merge(intArray52, intArray57, intArray63, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray36, intArray46, intArray57, (int) (byte) -1, (int) (short) 1);
        insertionSort0.sort(intArray57);
        searching.BinarySearch binarySearch72 = new searching.BinarySearch();
        int[] intArray75 = new int[] { (byte) 100, (short) 10 };
        int int77 = binarySearch72.search(intArray75, (int) '4');
        int[] intArray80 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray80);
        int int83 = binarySearch72.search(intArray80, (int) 'a');
        int[] intArray86 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray86);
        sorting.MergeSort.sort(intArray86, 1);
        int int91 = binarySearch72.search(intArray86, (int) (short) 1);
        sorting.SelectionSort.sort(intArray86);
        insertionSort0.sort(intArray86);
        sorting.MergeSort.sort(intArray86, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray86, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double8 = calculator0.divide(0.0d, 100.0d);
        double double10 = calculator0.squareRoot(2.505453712067028d);
        double double13 = calculator0.add((-9.9993902092964E15d), 1390.1802741106371d);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.5828625057366885d + "'", double10 == 1.5828625057366885d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.99939020929501E15d) + "'", double13 == (-9.99939020929501E15d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.multiply((double) '4', (double) (-1));
        double double11 = calculator0.subtract(30.0d, 9.9999998E15d);
        double double13 = calculator0.squareRoot(0.32d);
        double double16 = calculator0.subtract(999.9849998874982d, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculator0.squareRoot((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-52.0d) + "'", double8 == (-52.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.99999979999997E15d) + "'", double11 == (-9.99999979999997E15d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.565685424949238d + "'", double13 == 0.565685424949238d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1000.9849998874982d + "'", double16 == 1000.9849998874982d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        insertionSort1.sort(intArray5);
        insertionSort0.sort(intArray5);
        java.lang.Class<?> wildcardClass23 = insertionSort0.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.String str3 = WhichPath.makeDecision((int) '#', (-78), 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) (short) 10);
        searching.BinarySearch binarySearch12 = new searching.BinarySearch();
        int[] intArray15 = new int[] { (byte) 100, (short) 10 };
        int int17 = binarySearch12.search(intArray15, (int) '4');
        searching.BinarySearch binarySearch18 = new searching.BinarySearch();
        int[] intArray21 = new int[] { (byte) 100, (short) 10 };
        int int23 = binarySearch18.search(intArray21, (int) '4');
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        int int29 = binarySearch18.search(intArray26, (int) 'a');
        int int31 = binarySearch12.search(intArray26, 100);
        sorting.SelectionSort.sort(intArray26);
        int int34 = binarySearch0.search(intArray26, (int) (short) 1);
        searching.LinearSearch linearSearch35 = new searching.LinearSearch();
        searching.BinarySearch binarySearch36 = new searching.BinarySearch();
        int[] intArray39 = new int[] { (byte) 100, (short) 10 };
        int int41 = binarySearch36.search(intArray39, (int) '4');
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        int int47 = binarySearch36.search(intArray44, (int) 'a');
        int int49 = linearSearch35.search(intArray44, (int) ' ');
        searching.BinarySearch binarySearch50 = new searching.BinarySearch();
        int[] intArray53 = new int[] { (byte) 100, (short) 10 };
        int int55 = binarySearch50.search(intArray53, (int) '4');
        int int57 = linearSearch35.search(intArray53, 1);
        sorting.SelectionSort.sort(intArray53);
        int int60 = binarySearch0.search(intArray53, (int) (byte) 10);
        int[] intArray67 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray67);
        int int70 = binarySearch0.search(intArray67, 1);
        java.lang.Class<?> wildcardClass71 = intArray67.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        searching.BinarySearch binarySearch22 = new searching.BinarySearch();
        int[] intArray25 = new int[] { (byte) 100, (short) 10 };
        int int27 = binarySearch22.search(intArray25, (int) '4');
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        int int33 = binarySearch22.search(intArray30, (int) (short) 10);
        int int35 = linearSearch0.search(intArray30, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        int int41 = linearSearch0.search(intArray38, (int) (short) -1);
        int[] intArray42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = linearSearch0.search(intArray42, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) '#');
        int int6 = examGrades0.grade(5);
        int int8 = examGrades0.grade((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = examGrades0.grade((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort2 = new sorting.BubbleSort();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0 };
        bubbleSort2.sort(intArray4);
        sorting.BubbleSort bubbleSort6 = new sorting.BubbleSort();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort6.sort(intArray11);
        bubbleSort2.sort(intArray11);
        bubbleSort1.sort(intArray11);
        bubbleSort0.sort(intArray11);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 2, 100 };
        bubbleSort0.sort(intArray18);
        sorting.BubbleSort bubbleSort20 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort21 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort22 = new sorting.BubbleSort();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0 };
        bubbleSort22.sort(intArray24);
        sorting.BubbleSort bubbleSort26 = new sorting.BubbleSort();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort26.sort(intArray31);
        bubbleSort22.sort(intArray31);
        bubbleSort21.sort(intArray31);
        bubbleSort20.sort(intArray31);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 100 };
        bubbleSort20.sort(intArray38);
        sorting.BubbleSort bubbleSort40 = new sorting.BubbleSort();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0 };
        bubbleSort40.sort(intArray42);
        sorting.BubbleSort bubbleSort44 = new sorting.BubbleSort();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort44.sort(intArray49);
        bubbleSort40.sort(intArray49);
        bubbleSort20.sort(intArray49);
        bubbleSort0.sort(intArray49);
        java.lang.Integer[] intArray54 = null;
        // The following exception was thrown during execution in test generation
        try {
            bubbleSort0.sort(intArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new java.lang.Integer[] { 2, 100 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new java.lang.Integer[] { 2, 100 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (byte) 0);
        int int4 = examGrades0.grade((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = examGrades0.grade((-78));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int int8 = linearSearch0.search(intArray4, (int) ' ');
        searching.LinearSearch linearSearch9 = new searching.LinearSearch();
        int[] intArray13 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray13, 0);
        int[] intArray18 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray18);
        sorting.MergeSort.sort(intArray18, 1);
        int[] intArray24 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray24);
        sorting.MergeSort.merge(intArray13, intArray18, intArray24, (int) (short) 0, (int) (short) 1);
        int int30 = linearSearch9.search(intArray24, 100);
        searching.BinarySearch binarySearch31 = new searching.BinarySearch();
        int[] intArray34 = new int[] { (byte) 100, (short) 10 };
        int int36 = binarySearch31.search(intArray34, (int) '4');
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = binarySearch31.search(intArray39, (int) (short) 10);
        int int44 = linearSearch9.search(intArray39, 1);
        int[] intArray47 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray47);
        int int50 = linearSearch9.search(intArray47, (int) (short) -1);
        searching.LinearSearch linearSearch51 = new searching.LinearSearch();
        searching.BinarySearch binarySearch52 = new searching.BinarySearch();
        int[] intArray55 = new int[] { (byte) 100, (short) 10 };
        int int57 = binarySearch52.search(intArray55, (int) '4');
        int[] intArray60 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray60);
        int int63 = binarySearch52.search(intArray60, (int) 'a');
        int int65 = linearSearch51.search(intArray60, (int) ' ');
        int int67 = linearSearch9.search(intArray60, 10);
        int int69 = linearSearch0.search(intArray60, 2);
        int[] intArray70 = null;
        int[] intArray77 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray77);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray60, intArray70, intArray77, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { (-1), 0, 1, 10, 35, 100 });
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        searching.BinarySearch binarySearch22 = new searching.BinarySearch();
        int[] intArray25 = new int[] { (byte) 100, (short) 10 };
        int int27 = binarySearch22.search(intArray25, (int) '4');
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        int int33 = binarySearch22.search(intArray30, (int) (short) 10);
        int int35 = linearSearch0.search(intArray30, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        int int41 = linearSearch0.search(intArray38, (int) (short) -1);
        sorting.QuickSort quickSort42 = new sorting.QuickSort();
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        sorting.MergeSort.sort(intArray51, 1);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.merge(intArray46, intArray51, intArray57, (int) (short) 0, (int) (short) 1);
        quickSort42.sort(intArray51, (int) (byte) 0, (int) (byte) 1);
        int int66 = linearSearch0.search(intArray51, 100);
        java.lang.Class<?> wildcardClass67 = linearSearch0.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 10, (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int[] intArray0 = null;
        int[] intArray3 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray3);
        searching.LinearSearch linearSearch5 = new searching.LinearSearch();
        int[] intArray9 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray9, 0);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.sort(intArray14, 1);
        int[] intArray20 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray20);
        sorting.MergeSort.merge(intArray9, intArray14, intArray20, (int) (short) 0, (int) (short) 1);
        int int26 = linearSearch5.search(intArray20, 100);
        searching.LinearSearch linearSearch27 = new searching.LinearSearch();
        int[] intArray31 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray31, 0);
        int int35 = linearSearch27.search(intArray31, (int) ' ');
        int[] intArray39 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray39, 0);
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        sorting.MergeSort.sort(intArray44, 1);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        sorting.MergeSort.merge(intArray39, intArray44, intArray50, (int) (short) 0, (int) (short) 1);
        int int56 = linearSearch27.search(intArray44, (int) (short) 1);
        int int58 = linearSearch5.search(intArray44, 100);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray0, intArray3, intArray44, 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double9 = calculator0.square(34.0d);
        double double12 = calculator0.multiply(0.02d, 1030.0d);
        double double14 = calculator0.squareRoot(2.979955299664745E7d);
        double double17 = calculator0.divide((double) (-1), (-9.99984936099035E7d));
        double double20 = calculator0.subtract(0.0d, 143.2882057274445d);
        java.lang.Class<?> wildcardClass21 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1156.0d + "'", double9 == 1156.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.6d + "'", double12 == 20.6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5458.896683089674d + "'", double14 == 5458.896683089674d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0000150641278895E-8d + "'", double17 == 1.0000150641278895E-8d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-143.2882057274445d) + "'", double20 == (-143.2882057274445d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.String str3 = WhichPath.makeDecision((int) 'a', (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) -1, (int) (byte) 1, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort1.sort(intArray6);
        sorting.BubbleSort bubbleSort8 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort9 = new sorting.BubbleSort();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0 };
        bubbleSort9.sort(intArray11);
        sorting.BubbleSort bubbleSort13 = new sorting.BubbleSort();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort13.sort(intArray18);
        bubbleSort9.sort(intArray18);
        bubbleSort8.sort(intArray18);
        bubbleSort1.sort(intArray18);
        bubbleSort0.sort(intArray18);
        sorting.BubbleSort bubbleSort24 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort25 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort26 = new sorting.BubbleSort();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0 };
        bubbleSort26.sort(intArray28);
        sorting.BubbleSort bubbleSort30 = new sorting.BubbleSort();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort30.sort(intArray35);
        bubbleSort26.sort(intArray35);
        bubbleSort25.sort(intArray35);
        bubbleSort24.sort(intArray35);
        sorting.BubbleSort bubbleSort40 = new sorting.BubbleSort();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0 };
        bubbleSort40.sort(intArray42);
        sorting.BubbleSort bubbleSort44 = new sorting.BubbleSort();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort44.sort(intArray49);
        bubbleSort40.sort(intArray49);
        bubbleSort24.sort(intArray49);
        bubbleSort0.sort(intArray49);
        sorting.BubbleSort bubbleSort54 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort55 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort56 = new sorting.BubbleSort();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0 };
        bubbleSort56.sort(intArray58);
        sorting.BubbleSort bubbleSort60 = new sorting.BubbleSort();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort60.sort(intArray65);
        bubbleSort56.sort(intArray65);
        bubbleSort55.sort(intArray65);
        bubbleSort54.sort(intArray65);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 100 };
        bubbleSort54.sort(intArray72);
        sorting.BubbleSort bubbleSort74 = new sorting.BubbleSort();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0 };
        bubbleSort74.sort(intArray76);
        sorting.BubbleSort bubbleSort78 = new sorting.BubbleSort();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort78.sort(intArray83);
        bubbleSort74.sort(intArray83);
        bubbleSort54.sort(intArray83);
        bubbleSort0.sort(intArray83);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new java.lang.Integer[] { 2, 100 });
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.String str3 = WhichPath.makeDecision(5, (-78), 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.add(1500.0d, (double) 100.0f);
        double double17 = calculator0.multiply(9.9498743710662d, (double) '4');
        double double20 = calculator0.multiply((-99.0d), 0.565685424949238d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculator0.squareRoot((-22.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1600.0d + "'", double14 == 1600.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 517.3934672954424d + "'", double17 == 517.3934672954424d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-56.00285706997456d) + "'", double20 == (-56.00285706997456d));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double8 = calculator0.divide(0.0d, 100.0d);
        double double11 = calculator0.add(9.9999999E7d, 275.22030825688074d);
        double double14 = calculator0.divide(4.0804d, 2979803.299664745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0000027422030826E8d + "'", double11 == 1.0000027422030826E8d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.3693521315514626E-6d + "'", double14 == 1.3693521315514626E-6d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 1, 4, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double9 = calculator0.squareRoot(12.288205727444508d);
        double double11 = calculator0.square(9.9999999E7d);
        double double14 = calculator0.add(2.979955299664745E7d, 10.0d);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.505453712067028d + "'", double9 == 3.505453712067028d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.9999998E15d + "'", double11 == 9.9999998E15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.979956299664745E7d + "'", double14 == 2.979956299664745E7d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        int int21 = linearSearch0.search(intArray15, 100);
        searching.BinarySearch binarySearch22 = new searching.BinarySearch();
        int[] intArray25 = new int[] { (byte) 100, (short) 10 };
        int int27 = binarySearch22.search(intArray25, (int) '4');
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        int int33 = binarySearch22.search(intArray30, (int) (short) 10);
        int int35 = linearSearch0.search(intArray30, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        int int41 = linearSearch0.search(intArray38, (int) (short) -1);
        searching.LinearSearch linearSearch42 = new searching.LinearSearch();
        searching.BinarySearch binarySearch43 = new searching.BinarySearch();
        int[] intArray46 = new int[] { (byte) 100, (short) 10 };
        int int48 = binarySearch43.search(intArray46, (int) '4');
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        int int54 = binarySearch43.search(intArray51, (int) 'a');
        int int56 = linearSearch42.search(intArray51, (int) ' ');
        int int58 = linearSearch0.search(intArray51, 10);
        sorting.SelectionSort.sort(intArray51);
        java.lang.Class<?> wildcardClass60 = intArray51.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.divide(3000.0d, 2.0d);
        double double7 = calculator0.squareRoot(3.1622776601683795d);
        double double10 = calculator0.add((-10.0d), (-520.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = calculator0.squareRoot((-42.92960703019922d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1500.0d + "'", double5 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7782794100389228d + "'", double7 == 1.7782794100389228d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-530.0d) + "'", double10 == (-530.0d));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        int int34 = binarySearch23.search(intArray31, (int) (short) 10);
        int int36 = linearSearch1.search(intArray31, 1);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = linearSearch1.search(intArray39, (int) (short) -1);
        int int44 = binarySearch0.search(intArray39, (int) (short) 100);
        searching.BinarySearch binarySearch45 = new searching.BinarySearch();
        int[] intArray48 = new int[] { (byte) 100, (short) 10 };
        int int50 = binarySearch45.search(intArray48, (int) '4');
        sorting.QuickSort quickSort51 = new sorting.QuickSort();
        int[] intArray58 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray58);
        quickSort51.sort(intArray58, 1, 1);
        int int64 = binarySearch45.search(intArray58, (int) (short) 0);
        int int66 = binarySearch0.search(intArray58, 5);
        int[] intArray70 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray70, 0);
        int[] intArray75 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray75);
        sorting.MergeSort.sort(intArray75, 1);
        int[] intArray81 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray81);
        sorting.MergeSort.merge(intArray70, intArray75, intArray81, (int) (short) 0, (int) (short) 1);
        int int87 = binarySearch0.search(intArray75, 0);
        int[] intArray89 = new int[] { (byte) 1 };
        int int91 = binarySearch0.search(intArray89, (int) 'a');
        int[] intArray92 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int94 = binarySearch0.search(intArray92, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray3, 0);
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        sorting.MergeSort.sort(intArray8, 1);
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.merge(intArray3, intArray8, intArray14, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray14, (int) (short) 0);
        sorting.SelectionSort.sort(intArray14);
        sorting.SelectionSort.sort(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.add((-1.0d), 25.0d);
        double double13 = calculator0.divide(2.02d, 52.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = calculator0.squareRoot((-1.5054537120670282d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 24.0d + "'", double10 == 24.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.03884615384615385d + "'", double13 == 0.03884615384615385d);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray3 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray3);
        sorting.MergeSort.sort(intArray3, 1);
        insertionSort0.sort(intArray3);
        searching.BinarySearch binarySearch8 = new searching.BinarySearch();
        int[] intArray11 = new int[] { (byte) 100, (short) 10 };
        int int13 = binarySearch8.search(intArray11, (int) '4');
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        int int19 = binarySearch8.search(intArray16, (int) 'a');
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int int27 = binarySearch8.search(intArray22, (int) (short) 1);
        sorting.QuickSort quickSort28 = new sorting.QuickSort();
        int[] intArray35 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray35);
        quickSort28.sort(intArray35, 1, 1);
        sorting.InsertionSort insertionSort40 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort41 = new sorting.InsertionSort();
        int[] intArray45 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray45, 0);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        sorting.MergeSort.sort(intArray50, 1);
        int[] intArray56 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray56);
        sorting.MergeSort.merge(intArray45, intArray50, intArray56, (int) (short) 0, (int) (short) 1);
        insertionSort41.sort(intArray45);
        insertionSort40.sort(intArray45);
        quickSort28.sort(intArray45, 100, 0);
        int int67 = binarySearch8.search(intArray45, 5);
        insertionSort0.sort(intArray45);
        sorting.MergeSort.sort(intArray45, (int) (short) -1);
        java.lang.Class<?> wildcardClass71 = intArray45.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray4);
        sorting.MergeSort.sort(intArray4, 1);
        insertionSort1.sort(intArray4);
        int[] intArray12 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray12, 0);
        int[] intArray17 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray17);
        sorting.MergeSort.sort(intArray17, 1);
        int[] intArray23 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray23);
        sorting.MergeSort.merge(intArray12, intArray17, intArray23, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray23, (int) (short) 0);
        sorting.SelectionSort.sort(intArray23);
        sorting.SelectionSort.sort(intArray23);
        insertionSort1.sort(intArray23);
        int int34 = linearSearch0.search(intArray23, (int) 'a');
        searching.LinearSearch linearSearch35 = new searching.LinearSearch();
        int[] intArray39 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray39, 0);
        int int43 = linearSearch35.search(intArray39, (int) ' ');
        int[] intArray47 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray47, 0);
        int[] intArray52 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray52);
        sorting.MergeSort.sort(intArray52, 1);
        int[] intArray58 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray58);
        sorting.MergeSort.merge(intArray47, intArray52, intArray58, (int) (short) 0, (int) (short) 1);
        int int64 = linearSearch35.search(intArray52, (int) (short) 1);
        sorting.MergeSort.sort(intArray52, (-1));
        int int68 = linearSearch0.search(intArray52, 10);
        java.lang.Class<?> wildcardClass69 = linearSearch0.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.multiply(100.01174496644295d, 0.0d);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide(9.9997E7d, 101.0d);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 990069.3069306931d + "'", double8 == 990069.3069306931d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.multiply((double) '4', (double) (-1));
        double double10 = calculator0.square((-45.0d));
        double double13 = calculator0.add(2979955.299664745d, 9999.849998874983d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = calculator0.squareRoot((-1466.891625803611d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-52.0d) + "'", double8 == (-52.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2025.0d + "'", double10 == 2025.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2989955.14966362d + "'", double13 == 2989955.14966362d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort0.sort(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        searching.BinarySearch binarySearch12 = new searching.BinarySearch();
        searching.LinearSearch linearSearch13 = new searching.LinearSearch();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        int int34 = linearSearch13.search(intArray28, 100);
        searching.BinarySearch binarySearch35 = new searching.BinarySearch();
        int[] intArray38 = new int[] { (byte) 100, (short) 10 };
        int int40 = binarySearch35.search(intArray38, (int) '4');
        int[] intArray43 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray43);
        int int46 = binarySearch35.search(intArray43, (int) (short) 10);
        int int48 = linearSearch13.search(intArray43, 1);
        int[] intArray51 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray51);
        int int54 = linearSearch13.search(intArray51, (int) (short) -1);
        int int56 = binarySearch12.search(intArray51, (int) (short) 100);
        searching.BinarySearch binarySearch57 = new searching.BinarySearch();
        int[] intArray60 = new int[] { (byte) 100, (short) 10 };
        int int62 = binarySearch57.search(intArray60, (int) '4');
        sorting.QuickSort quickSort63 = new sorting.QuickSort();
        int[] intArray70 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray70);
        quickSort63.sort(intArray70, 1, 1);
        int int76 = binarySearch57.search(intArray70, (int) (short) 0);
        int int78 = binarySearch12.search(intArray70, 5);
        int int80 = binarySearch0.search(intArray70, (int) (short) 10);
        int[] intArray81 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int83 = binarySearch0.search(intArray81, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.add((-1.0d), (-1.0d));
        double double19 = calculator0.divide((double) (byte) 100, (double) 100.0f);
        double double22 = calculator0.divide(1600000.0d, (-10.928462001760517d));
        double double24 = calculator0.square(900.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-146406.694715345d) + "'", double22 == (-146406.694715345d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 810000.0d + "'", double24 == 810000.0d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.divide((double) 100L, (double) 1L);
        double double12 = calculator0.square((double) 5);
        double double15 = calculator0.add(1.5828625057366885d, 4.5E-7d);
        double double18 = calculator0.subtract(22.288205727444506d, (-20.0d));
        double double21 = calculator0.subtract(25.0d, (-2.711794272555494d));
        double double24 = calculator0.multiply(4.3857723784044314E27d, (-1.4668696222641962E7d));
        // The following exception was thrown during execution in test generation
        try {
            double double26 = calculator0.squareRoot((-530.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.5828629557366884d + "'", double15 == 1.5828629557366884d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 42.288205727444506d + "'", double18 == 42.288205727444506d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 27.711794272555494d + "'", double21 == 27.711794272555494d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-6.433356272046853E34d) + "'", double24 == (-6.433356272046853E34d));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.divide((double) 100L, (double) 1L);
        double double12 = calculator0.square((double) 5);
        double double15 = calculator0.add(1.5828625057366885d, 4.5E-7d);
        double double18 = calculator0.subtract(22.288205727444506d, (-20.0d));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.5828629557366884d + "'", double15 == 1.5828629557366884d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 42.288205727444506d + "'", double18 == 42.288205727444506d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str3 = WhichPath.makeDecision(1, (int) (short) 100, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray3 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray3);
        sorting.MergeSort.sort(intArray3, 1);
        insertionSort0.sort(intArray3);
        searching.BinarySearch binarySearch8 = new searching.BinarySearch();
        searching.LinearSearch linearSearch9 = new searching.LinearSearch();
        int[] intArray13 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray13, 0);
        int[] intArray18 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray18);
        sorting.MergeSort.sort(intArray18, 1);
        int[] intArray24 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray24);
        sorting.MergeSort.merge(intArray13, intArray18, intArray24, (int) (short) 0, (int) (short) 1);
        int int30 = linearSearch9.search(intArray24, 100);
        searching.BinarySearch binarySearch31 = new searching.BinarySearch();
        int[] intArray34 = new int[] { (byte) 100, (short) 10 };
        int int36 = binarySearch31.search(intArray34, (int) '4');
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = binarySearch31.search(intArray39, (int) (short) 10);
        int int44 = linearSearch9.search(intArray39, 1);
        int[] intArray47 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray47);
        int int50 = linearSearch9.search(intArray47, (int) (short) -1);
        int int52 = binarySearch8.search(intArray47, (int) (short) 100);
        insertionSort0.sort(intArray47);
        java.lang.Class<?> wildcardClass54 = insertionSort0.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) -1, 1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.String str3 = WhichPath.makeDecision((-45), 5, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 0, 0, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.add(1500.0d, (double) 100.0f);
        double double17 = calculator0.multiply(9.9498743710662d, (double) '4');
        double double19 = calculator0.square(237807.94399095693d);
        double double21 = calculator0.squareRoot(101.0d);
        double double24 = calculator0.multiply((-62.6363428016757d), 90.2882057274445d);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = calculator0.squareRoot((-9.999999799999969E17d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1600.0d + "'", double14 == 1600.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 517.3934672954424d + "'", double17 == 517.3934672954424d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.655261822520611E10d + "'", double19 == 5.655261822520611E10d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.04987562112089d + "'", double21 == 10.04987562112089d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-5655.323004892433d) + "'", double24 == (-5655.323004892433d));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.String str3 = WhichPath.makeDecision((-45), (int) (short) 100, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        int[] intArray24 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray24, 0);
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        sorting.MergeSort.sort(intArray29, 1);
        int[] intArray35 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray35);
        sorting.MergeSort.merge(intArray24, intArray29, intArray35, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch40 = new searching.LinearSearch();
        searching.BinarySearch binarySearch41 = new searching.BinarySearch();
        int[] intArray44 = new int[] { (byte) 100, (short) 10 };
        int int46 = binarySearch41.search(intArray44, (int) '4');
        int[] intArray49 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray49);
        int int52 = binarySearch41.search(intArray49, (int) 'a');
        int int54 = linearSearch40.search(intArray49, (int) ' ');
        searching.LinearSearch linearSearch55 = new searching.LinearSearch();
        int[] intArray59 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray59, 0);
        int[] intArray64 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray64);
        sorting.MergeSort.sort(intArray64, 1);
        int[] intArray70 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray70);
        sorting.MergeSort.merge(intArray59, intArray64, intArray70, (int) (short) 0, (int) (short) 1);
        int int76 = linearSearch55.search(intArray70, 100);
        searching.BinarySearch binarySearch77 = new searching.BinarySearch();
        int[] intArray80 = new int[] { (byte) 100, (short) 10 };
        int int82 = binarySearch77.search(intArray80, (int) '4');
        int[] intArray85 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray85);
        int int88 = binarySearch77.search(intArray85, (int) (short) 10);
        int int90 = linearSearch55.search(intArray85, 1);
        sorting.MergeSort.merge(intArray24, intArray49, intArray85, (int) (byte) -1, (int) (byte) -1);
        sorting.SelectionSort.sort(intArray49);
        insertionSort0.sort(intArray49);
        int[] intArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            insertionSort0.sort(intArray96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.multiply((double) 1, (double) 0.0f);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) -1, (int) (byte) 10, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber((int) (short) 100);
        java.lang.String str4 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str6 = whatKindOfNumber0.processNumber(100);
        java.lang.String str8 = whatKindOfNumber0.processNumber(1);
        java.lang.String str10 = whatKindOfNumber0.processNumber((int) (byte) -1);
        java.lang.String str12 = whatKindOfNumber0.processNumber((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = whatKindOfNumber0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Positive Even Not Multiple of 3" + "'", str2, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Negative Odd" + "'", str4, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Positive Even Not Multiple of 3" + "'", str6, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Positive Odd" + "'", str8, "Positive Odd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Negative Odd" + "'", str10, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Positive Even Not Multiple of 3" + "'", str12, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 0, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) (short) 10);
        searching.BinarySearch binarySearch12 = new searching.BinarySearch();
        int[] intArray15 = new int[] { (byte) 100, (short) 10 };
        int int17 = binarySearch12.search(intArray15, (int) '4');
        searching.BinarySearch binarySearch18 = new searching.BinarySearch();
        int[] intArray21 = new int[] { (byte) 100, (short) 10 };
        int int23 = binarySearch18.search(intArray21, (int) '4');
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        int int29 = binarySearch18.search(intArray26, (int) 'a');
        int int31 = binarySearch12.search(intArray26, 100);
        sorting.SelectionSort.sort(intArray26);
        int int34 = binarySearch0.search(intArray26, (int) (short) 1);
        searching.LinearSearch linearSearch35 = new searching.LinearSearch();
        searching.BinarySearch binarySearch36 = new searching.BinarySearch();
        int[] intArray39 = new int[] { (byte) 100, (short) 10 };
        int int41 = binarySearch36.search(intArray39, (int) '4');
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        int int47 = binarySearch36.search(intArray44, (int) 'a');
        int int49 = linearSearch35.search(intArray44, (int) ' ');
        searching.BinarySearch binarySearch50 = new searching.BinarySearch();
        int[] intArray53 = new int[] { (byte) 100, (short) 10 };
        int int55 = binarySearch50.search(intArray53, (int) '4');
        int int57 = linearSearch35.search(intArray53, 1);
        sorting.SelectionSort.sort(intArray53);
        int int60 = binarySearch0.search(intArray53, (int) (byte) 10);
        sorting.SelectionSort.sort(intArray53);
        java.lang.Class<?> wildcardClass62 = intArray53.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.add((double) 0L, (double) (byte) -1);
        double double8 = calculator0.subtract(3.1622776601683795d, 9.0d);
        double double10 = calculator0.square((-2341.7117942725554d));
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.83772233983162d) + "'", double8 == (-5.83772233983162d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5483614.127435191d + "'", double10 == 5483614.127435191d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        sorting.MergeSort.sort(intArray7, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        searching.LinearSearch linearSearch6 = new searching.LinearSearch();
        int[] intArray10 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray10, 0);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.sort(intArray15, 1);
        int[] intArray21 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray21);
        sorting.MergeSort.merge(intArray10, intArray15, intArray21, (int) (short) 0, (int) (short) 1);
        int int27 = linearSearch6.search(intArray21, 100);
        int[] intArray31 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray31, 0);
        int[] intArray37 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray37, 0);
        int[] intArray42 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray42);
        sorting.MergeSort.sort(intArray42, 1);
        int[] intArray48 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray48);
        sorting.MergeSort.merge(intArray37, intArray42, intArray48, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray21, intArray31, intArray42, (int) (byte) -1, (int) (short) 1);
        sorting.MergeSort.sort(intArray31, (int) (byte) 0);
        sorting.MergeSort.sort(intArray31, (int) (short) -1);
        int int61 = binarySearch0.search(intArray31, (int) '#');
        int[] intArray62 = new int[] {};
        sorting.MergeSort.sort(intArray62, 1);
        int int66 = binarySearch0.search(intArray62, (int) (byte) 100);
        java.lang.Class<?> wildcardClass67 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] {});
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double9 = calculator0.square(34.0d);
        double double12 = calculator0.multiply(0.02d, 1030.0d);
        double double14 = calculator0.squareRoot(2.979955299664745E7d);
        double double17 = calculator0.divide((double) (-1), (-9.99984936099035E7d));
        double double20 = calculator0.subtract(0.0d, 143.2882057274445d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculator0.squareRoot((-1.0000014228820573E8d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1156.0d + "'", double9 == 1156.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.6d + "'", double12 == 20.6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5458.896683089674d + "'", double14 == 5458.896683089674d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0000150641278895E-8d + "'", double17 == 1.0000150641278895E-8d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-143.2882057274445d) + "'", double20 == (-143.2882057274445d));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int int8 = linearSearch0.search(intArray4, (int) ' ');
        searching.LinearSearch linearSearch9 = new searching.LinearSearch();
        int[] intArray13 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray13, 0);
        int[] intArray18 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray18);
        sorting.MergeSort.sort(intArray18, 1);
        int[] intArray24 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray24);
        sorting.MergeSort.merge(intArray13, intArray18, intArray24, (int) (short) 0, (int) (short) 1);
        int int30 = linearSearch9.search(intArray24, 100);
        searching.BinarySearch binarySearch31 = new searching.BinarySearch();
        int[] intArray34 = new int[] { (byte) 100, (short) 10 };
        int int36 = binarySearch31.search(intArray34, (int) '4');
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = binarySearch31.search(intArray39, (int) (short) 10);
        int int44 = linearSearch9.search(intArray39, 1);
        int[] intArray47 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray47);
        int int50 = linearSearch9.search(intArray47, (int) (short) -1);
        searching.LinearSearch linearSearch51 = new searching.LinearSearch();
        searching.BinarySearch binarySearch52 = new searching.BinarySearch();
        int[] intArray55 = new int[] { (byte) 100, (short) 10 };
        int int57 = binarySearch52.search(intArray55, (int) '4');
        int[] intArray60 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray60);
        int int63 = binarySearch52.search(intArray60, (int) 'a');
        int int65 = linearSearch51.search(intArray60, (int) ' ');
        int int67 = linearSearch9.search(intArray60, 10);
        int int69 = linearSearch0.search(intArray60, 2);
        java.lang.Class<?> wildcardClass70 = linearSearch0.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, (double) 0L);
        double double14 = calculator0.multiply(0.32d, (double) 100L);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) -1, 3, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double8 = calculator0.divide(0.0d, 100.0d);
        double double10 = calculator0.squareRoot(2.505453712067028d);
        double double13 = calculator0.add((-9.9993902092964E15d), 1390.1802741106371d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = calculator0.squareRoot((-8880400.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.5828625057366885d + "'", double10 == 1.5828625057366885d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.99939020929501E15d) + "'", double13 == (-9.99939020929501E15d));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, (int) 'a', (int) (byte) 10);
        int[] intArray15 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray15, 0);
        int[] intArray20 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray20);
        sorting.MergeSort.sort(intArray20, 1);
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        sorting.MergeSort.merge(intArray15, intArray20, intArray26, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch31 = new searching.LinearSearch();
        searching.BinarySearch binarySearch32 = new searching.BinarySearch();
        int[] intArray35 = new int[] { (byte) 100, (short) 10 };
        int int37 = binarySearch32.search(intArray35, (int) '4');
        int[] intArray40 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray40);
        int int43 = binarySearch32.search(intArray40, (int) 'a');
        int int45 = linearSearch31.search(intArray40, (int) ' ');
        searching.LinearSearch linearSearch46 = new searching.LinearSearch();
        int[] intArray50 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray50, 0);
        int[] intArray55 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray55);
        sorting.MergeSort.sort(intArray55, 1);
        int[] intArray61 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray61);
        sorting.MergeSort.merge(intArray50, intArray55, intArray61, (int) (short) 0, (int) (short) 1);
        int int67 = linearSearch46.search(intArray61, 100);
        searching.BinarySearch binarySearch68 = new searching.BinarySearch();
        int[] intArray71 = new int[] { (byte) 100, (short) 10 };
        int int73 = binarySearch68.search(intArray71, (int) '4');
        int[] intArray76 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray76);
        int int79 = binarySearch68.search(intArray76, (int) (short) 10);
        int int81 = linearSearch46.search(intArray76, 1);
        sorting.MergeSort.merge(intArray15, intArray40, intArray76, (int) (byte) -1, (int) (byte) -1);
        quickSort0.sort(intArray40, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.String str3 = WhichPath.makeDecision((int) 'a', (-45), (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray3 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray3);
        sorting.MergeSort.sort(intArray3, 1);
        insertionSort0.sort(intArray3);
        searching.BinarySearch binarySearch8 = new searching.BinarySearch();
        int[] intArray11 = new int[] { (byte) 100, (short) 10 };
        int int13 = binarySearch8.search(intArray11, (int) '4');
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        int int19 = binarySearch8.search(intArray16, (int) 'a');
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int int27 = binarySearch8.search(intArray22, (int) (short) 1);
        sorting.QuickSort quickSort28 = new sorting.QuickSort();
        int[] intArray35 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray35);
        quickSort28.sort(intArray35, 1, 1);
        sorting.InsertionSort insertionSort40 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort41 = new sorting.InsertionSort();
        int[] intArray45 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray45, 0);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        sorting.MergeSort.sort(intArray50, 1);
        int[] intArray56 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray56);
        sorting.MergeSort.merge(intArray45, intArray50, intArray56, (int) (short) 0, (int) (short) 1);
        insertionSort41.sort(intArray45);
        insertionSort40.sort(intArray45);
        quickSort28.sort(intArray45, 100, 0);
        int int67 = binarySearch8.search(intArray45, 5);
        insertionSort0.sort(intArray45);
        sorting.MergeSort.sort(intArray45, (int) (short) -1);
        sorting.MergeSort.sort(intArray45, (-45));
        searching.BinarySearch binarySearch73 = new searching.BinarySearch();
        int[] intArray76 = new int[] { (byte) 100, (short) 10 };
        int int78 = binarySearch73.search(intArray76, (int) '4');
        int[] intArray81 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray81);
        int int84 = binarySearch73.search(intArray81, (int) (short) 10);
        sorting.MergeSort.sort(intArray81, 0);
        int[] intArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.merge(intArray45, intArray81, intArray87, (-45), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.String str3 = WhichPath.makeDecision((-78), 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.String str3 = WhichPath.makeDecision((-1), 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        quickSort0.sort(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray25 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray25);
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray25, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 35 });
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        sorting.QuickSort quickSort6 = new sorting.QuickSort();
        int[] intArray13 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray13);
        quickSort6.sort(intArray13, 1, 1);
        int int19 = binarySearch0.search(intArray13, (int) (short) 0);
        sorting.QuickSort quickSort20 = new sorting.QuickSort();
        int[] intArray27 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray27);
        quickSort20.sort(intArray27, 1, 1);
        int int33 = binarySearch0.search(intArray27, (int) (byte) 1);
        searching.LinearSearch linearSearch34 = new searching.LinearSearch();
        int[] intArray38 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray38, 0);
        int int42 = linearSearch34.search(intArray38, (int) ' ');
        searching.LinearSearch linearSearch43 = new searching.LinearSearch();
        int[] intArray47 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray47, 0);
        int[] intArray52 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray52);
        sorting.MergeSort.sort(intArray52, 1);
        int[] intArray58 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray58);
        sorting.MergeSort.merge(intArray47, intArray52, intArray58, (int) (short) 0, (int) (short) 1);
        int int64 = linearSearch43.search(intArray58, 100);
        int[] intArray68 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray68, 0);
        int[] intArray74 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray74, 0);
        int[] intArray79 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray79);
        sorting.MergeSort.sort(intArray79, 1);
        int[] intArray85 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray85);
        sorting.MergeSort.merge(intArray74, intArray79, intArray85, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray58, intArray68, intArray79, (int) (byte) -1, (int) (short) 1);
        sorting.MergeSort.sort(intArray68, (int) (byte) 0);
        int int96 = linearSearch34.search(intArray68, (int) (byte) -1);
        int int98 = binarySearch0.search(intArray68, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        int[] intArray26 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray26, 0);
        int[] intArray32 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray32, 0);
        int[] intArray37 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray37);
        sorting.MergeSort.sort(intArray37, 1);
        int[] intArray43 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray43);
        sorting.MergeSort.merge(intArray32, intArray37, intArray43, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray16, intArray26, intArray37, (int) (byte) -1, (int) (short) 1);
        quickSort0.sort(intArray26, (int) '4', (int) (short) -1);
        searching.BinarySearch binarySearch54 = new searching.BinarySearch();
        int[] intArray57 = new int[] { (byte) 100, (short) 10 };
        int int59 = binarySearch54.search(intArray57, (int) '4');
        int[] intArray62 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray62);
        int int65 = binarySearch54.search(intArray62, (int) 'a');
        int[] intArray68 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray68);
        sorting.MergeSort.sort(intArray68, 1);
        int int73 = binarySearch54.search(intArray68, (int) (short) 1);
        sorting.SelectionSort.sort(intArray68);
        sorting.MergeSort.sort(intArray68, (int) (short) 0);
        quickSort0.sort(intArray68, 0, (-78));
        int[] intArray80 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickSort0.sort(intArray80, 3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray3 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray3);
        sorting.MergeSort.sort(intArray3, 1);
        insertionSort0.sort(intArray3);
        searching.BinarySearch binarySearch8 = new searching.BinarySearch();
        searching.LinearSearch linearSearch9 = new searching.LinearSearch();
        int[] intArray13 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray13, 0);
        int[] intArray18 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray18);
        sorting.MergeSort.sort(intArray18, 1);
        int[] intArray24 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray24);
        sorting.MergeSort.merge(intArray13, intArray18, intArray24, (int) (short) 0, (int) (short) 1);
        int int30 = linearSearch9.search(intArray24, 100);
        searching.BinarySearch binarySearch31 = new searching.BinarySearch();
        int[] intArray34 = new int[] { (byte) 100, (short) 10 };
        int int36 = binarySearch31.search(intArray34, (int) '4');
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = binarySearch31.search(intArray39, (int) (short) 10);
        int int44 = linearSearch9.search(intArray39, 1);
        int[] intArray47 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray47);
        int int50 = linearSearch9.search(intArray47, (int) (short) -1);
        int int52 = binarySearch8.search(intArray47, (int) (short) 100);
        searching.BinarySearch binarySearch53 = new searching.BinarySearch();
        int[] intArray56 = new int[] { (byte) 100, (short) 10 };
        int int58 = binarySearch53.search(intArray56, (int) '4');
        sorting.QuickSort quickSort59 = new sorting.QuickSort();
        int[] intArray66 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray66);
        quickSort59.sort(intArray66, 1, 1);
        int int72 = binarySearch53.search(intArray66, (int) (short) 0);
        int int74 = binarySearch8.search(intArray66, 5);
        int[] intArray78 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray78, 0);
        int[] intArray83 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray83);
        sorting.MergeSort.sort(intArray83, 1);
        int[] intArray89 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray89);
        sorting.MergeSort.merge(intArray78, intArray83, intArray89, (int) (short) 0, (int) (short) 1);
        int int95 = binarySearch8.search(intArray83, 0);
        sorting.SelectionSort.sort(intArray83);
        insertionSort0.sort(intArray83);
        int[] intArray98 = null;
        // The following exception was thrown during execution in test generation
        try {
            insertionSort0.sort(intArray98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.subtract(1.0E8d, 3000.0d);
        double double19 = calculator0.multiply(3.488255033557047d, 4.5E-7d);
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.9997E7d + "'", double16 == 9.9997E7d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.569714765100671E-6d + "'", double19 == 1.569714765100671E-6d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String str3 = WhichPath.makeDecision(1, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.String str3 = WhichPath.makeDecision(5, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide((double) (short) 0, (double) (short) -1);
        double double11 = calculator0.subtract((double) '4', (-99.0d));
        double double14 = calculator0.add(1.0E8d, (-1.0d));
        double double17 = calculator0.add((double) 1, (double) 100);
        double double20 = calculator0.subtract(0.32d, (-52.0d));
        double double23 = calculator0.add(2076519.3370392043d, 90.0d);
        double double26 = calculator0.add(222.2222141186207d, 484.50181864903743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 151.0d + "'", double11 == 151.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.9999999E7d + "'", double14 == 9.9999999E7d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 101.0d + "'", double17 == 101.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.32d + "'", double20 == 52.32d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2076609.3370392043d + "'", double23 == 2076609.3370392043d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 706.7240327676582d + "'", double26 == 706.7240327676582d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.add(1500.0d, (double) 100.0f);
        double double16 = calculator0.square((double) 'a');
        double double19 = calculator0.subtract(2932.0d, 83712.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = calculator0.squareRoot((-1.00000052E8d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1600.0d + "'", double14 == 1600.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9409.0d + "'", double16 == 9409.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-80780.0d) + "'", double19 == (-80780.0d));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort0.sort(intArray5);
        sorting.BubbleSort bubbleSort7 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort8 = new sorting.BubbleSort();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0 };
        bubbleSort8.sort(intArray10);
        sorting.BubbleSort bubbleSort12 = new sorting.BubbleSort();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort12.sort(intArray17);
        bubbleSort8.sort(intArray17);
        bubbleSort7.sort(intArray17);
        bubbleSort0.sort(intArray17);
        sorting.BubbleSort bubbleSort22 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort23 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort24 = new sorting.BubbleSort();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0 };
        bubbleSort24.sort(intArray26);
        sorting.BubbleSort bubbleSort28 = new sorting.BubbleSort();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort28.sort(intArray33);
        bubbleSort24.sort(intArray33);
        bubbleSort23.sort(intArray33);
        bubbleSort22.sort(intArray33);
        sorting.BubbleSort bubbleSort38 = new sorting.BubbleSort();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort38.sort(intArray43);
        sorting.BubbleSort bubbleSort45 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort46 = new sorting.BubbleSort();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0 };
        bubbleSort46.sort(intArray48);
        sorting.BubbleSort bubbleSort50 = new sorting.BubbleSort();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort50.sort(intArray55);
        bubbleSort46.sort(intArray55);
        bubbleSort45.sort(intArray55);
        bubbleSort38.sort(intArray55);
        bubbleSort22.sort(intArray55);
        sorting.BubbleSort bubbleSort61 = new sorting.BubbleSort();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 0 };
        bubbleSort61.sort(intArray63);
        sorting.BubbleSort bubbleSort65 = new sorting.BubbleSort();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort65.sort(intArray70);
        bubbleSort61.sort(intArray70);
        sorting.BubbleSort bubbleSort73 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort74 = new sorting.BubbleSort();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort74.sort(intArray79);
        sorting.BubbleSort bubbleSort81 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort82 = new sorting.BubbleSort();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0 };
        bubbleSort82.sort(intArray84);
        sorting.BubbleSort bubbleSort86 = new sorting.BubbleSort();
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort86.sort(intArray91);
        bubbleSort82.sort(intArray91);
        bubbleSort81.sort(intArray91);
        bubbleSort74.sort(intArray91);
        bubbleSort73.sort(intArray91);
        bubbleSort61.sort(intArray91);
        bubbleSort22.sort(intArray91);
        bubbleSort0.sort(intArray91);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) (short) 10);
        searching.BinarySearch binarySearch12 = new searching.BinarySearch();
        int[] intArray15 = new int[] { (byte) 100, (short) 10 };
        int int17 = binarySearch12.search(intArray15, (int) '4');
        searching.BinarySearch binarySearch18 = new searching.BinarySearch();
        int[] intArray21 = new int[] { (byte) 100, (short) 10 };
        int int23 = binarySearch18.search(intArray21, (int) '4');
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        int int29 = binarySearch18.search(intArray26, (int) 'a');
        int int31 = binarySearch12.search(intArray26, 100);
        sorting.SelectionSort.sort(intArray26);
        int int34 = binarySearch0.search(intArray26, (int) (short) 1);
        sorting.SelectionSort.sort(intArray26);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray26, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String str3 = WhichPath.makeDecision(1, (int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int int8 = linearSearch0.search(intArray4, (int) ' ');
        int[] intArray12 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray12, 0);
        int[] intArray17 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray17);
        sorting.MergeSort.sort(intArray17, 1);
        int[] intArray23 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray23);
        sorting.MergeSort.merge(intArray12, intArray17, intArray23, (int) (short) 0, (int) (short) 1);
        int int29 = linearSearch0.search(intArray17, (int) (short) 1);
        searching.LinearSearch linearSearch30 = new searching.LinearSearch();
        searching.BinarySearch binarySearch31 = new searching.BinarySearch();
        int[] intArray34 = new int[] { (byte) 100, (short) 10 };
        int int36 = binarySearch31.search(intArray34, (int) '4');
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = binarySearch31.search(intArray39, (int) 'a');
        int int44 = linearSearch30.search(intArray39, (int) ' ');
        searching.BinarySearch binarySearch45 = new searching.BinarySearch();
        int[] intArray48 = new int[] { (byte) 100, (short) 10 };
        int int50 = binarySearch45.search(intArray48, (int) '4');
        int int52 = linearSearch30.search(intArray48, 1);
        sorting.SelectionSort.sort(intArray48);
        int int55 = linearSearch0.search(intArray48, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray48, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        searching.LinearSearch linearSearch1 = new searching.LinearSearch();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        int int22 = linearSearch1.search(intArray16, 100);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        int int34 = binarySearch23.search(intArray31, (int) (short) 10);
        int int36 = linearSearch1.search(intArray31, 1);
        int[] intArray39 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray39);
        int int42 = linearSearch1.search(intArray39, (int) (short) -1);
        int int44 = binarySearch0.search(intArray39, (int) (short) 100);
        searching.BinarySearch binarySearch45 = new searching.BinarySearch();
        int[] intArray48 = new int[] { (byte) 100, (short) 10 };
        int int50 = binarySearch45.search(intArray48, (int) '4');
        sorting.QuickSort quickSort51 = new sorting.QuickSort();
        int[] intArray58 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray58);
        quickSort51.sort(intArray58, 1, 1);
        int int64 = binarySearch45.search(intArray58, (int) (short) 0);
        int int66 = binarySearch0.search(intArray58, 5);
        sorting.QuickSort quickSort67 = new sorting.QuickSort();
        int[] intArray74 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray74);
        quickSort67.sort(intArray74, (int) 'a', (int) (byte) 10);
        int int80 = binarySearch0.search(intArray74, 5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.String str3 = WhichPath.makeDecision((-45), (int) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) (short) 10);
        searching.BinarySearch binarySearch12 = new searching.BinarySearch();
        int[] intArray15 = new int[] { (byte) 100, (short) 10 };
        int int17 = binarySearch12.search(intArray15, (int) '4');
        int int19 = binarySearch0.search(intArray15, (int) 'a');
        sorting.SelectionSort.sort(intArray15);
        sorting.SelectionSort.sort(intArray15);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        searching.LinearSearch linearSearch21 = new searching.LinearSearch();
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        sorting.MergeSort.sort(intArray30, 1);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.merge(intArray25, intArray30, intArray36, (int) (short) 0, (int) (short) 1);
        int int42 = linearSearch21.search(intArray36, 100);
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray52 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray52, 0);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.sort(intArray57, 1);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.merge(intArray52, intArray57, intArray63, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray36, intArray46, intArray57, (int) (byte) -1, (int) (short) 1);
        insertionSort0.sort(intArray57);
        searching.BinarySearch binarySearch72 = new searching.BinarySearch();
        int[] intArray75 = new int[] { (byte) 100, (short) 10 };
        int int77 = binarySearch72.search(intArray75, (int) '4');
        int[] intArray80 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray80);
        int int83 = binarySearch72.search(intArray80, (int) 'a');
        int[] intArray86 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray86);
        sorting.MergeSort.sort(intArray86, 1);
        int int91 = binarySearch72.search(intArray86, (int) (short) 1);
        sorting.SelectionSort.sort(intArray86);
        insertionSort0.sort(intArray86);
        sorting.MergeSort.sort(intArray86, (int) (short) 1);
        sorting.MergeSort.sort(intArray86, (-45));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber((int) (short) 100);
        java.lang.String str4 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str6 = whatKindOfNumber0.processNumber((int) (byte) 10);
        java.lang.String str8 = whatKindOfNumber0.processNumber(5);
        java.lang.String str10 = whatKindOfNumber0.processNumber(0);
        java.lang.String str12 = whatKindOfNumber0.processNumber((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Positive Even Not Multiple of 3" + "'", str2, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Negative Odd" + "'", str4, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Positive Even Not Multiple of 3" + "'", str6, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Positive Odd" + "'", str8, "Positive Odd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Zero" + "'", str10, "Zero");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Positive Odd" + "'", str12, "Positive Odd");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide((double) (short) 0, (double) (short) -1);
        double double11 = calculator0.subtract((double) '4', (-99.0d));
        double double13 = calculator0.square(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 151.0d + "'", double11 == 151.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 1, (-1), (-45));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray4);
        sorting.MergeSort.sort(intArray4, 1);
        insertionSort1.sort(intArray4);
        int[] intArray12 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray12, 0);
        int[] intArray17 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray17);
        sorting.MergeSort.sort(intArray17, 1);
        int[] intArray23 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray23);
        sorting.MergeSort.merge(intArray12, intArray17, intArray23, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray23, (int) (short) 0);
        sorting.SelectionSort.sort(intArray23);
        sorting.SelectionSort.sort(intArray23);
        insertionSort1.sort(intArray23);
        int int34 = linearSearch0.search(intArray23, (int) 'a');
        searching.LinearSearch linearSearch35 = new searching.LinearSearch();
        int[] intArray39 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray39, 0);
        int int43 = linearSearch35.search(intArray39, (int) ' ');
        int[] intArray47 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray47, 0);
        int[] intArray52 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray52);
        sorting.MergeSort.sort(intArray52, 1);
        int[] intArray58 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray58);
        sorting.MergeSort.merge(intArray47, intArray52, intArray58, (int) (short) 0, (int) (short) 1);
        int int64 = linearSearch35.search(intArray52, (int) (short) 1);
        sorting.MergeSort.sort(intArray52, (-1));
        int int68 = linearSearch0.search(intArray52, 10);
        int[] intArray72 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray72, 0);
        int int76 = linearSearch0.search(intArray72, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray72, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String str3 = WhichPath.makeDecision(3, (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort0.sort(intArray5);
        sorting.BubbleSort bubbleSort7 = new sorting.BubbleSort();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort7.sort(intArray12);
        bubbleSort0.sort(intArray12);
        sorting.BubbleSort bubbleSort15 = new sorting.BubbleSort();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort15.sort(intArray20);
        bubbleSort0.sort(intArray20);
        sorting.BubbleSort bubbleSort23 = new sorting.BubbleSort();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort23.sort(intArray28);
        sorting.BubbleSort bubbleSort30 = new sorting.BubbleSort();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort30.sort(intArray35);
        bubbleSort23.sort(intArray35);
        bubbleSort0.sort(intArray35);
        sorting.BubbleSort bubbleSort39 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort40 = new sorting.BubbleSort();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort40.sort(intArray45);
        sorting.BubbleSort bubbleSort47 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort48 = new sorting.BubbleSort();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0 };
        bubbleSort48.sort(intArray50);
        sorting.BubbleSort bubbleSort52 = new sorting.BubbleSort();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort52.sort(intArray57);
        bubbleSort48.sort(intArray57);
        bubbleSort47.sort(intArray57);
        bubbleSort40.sort(intArray57);
        bubbleSort39.sort(intArray57);
        sorting.BubbleSort bubbleSort63 = new sorting.BubbleSort();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort63.sort(intArray68);
        sorting.BubbleSort bubbleSort70 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort71 = new sorting.BubbleSort();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0 };
        bubbleSort71.sort(intArray73);
        sorting.BubbleSort bubbleSort75 = new sorting.BubbleSort();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort75.sort(intArray80);
        bubbleSort71.sort(intArray80);
        bubbleSort70.sort(intArray80);
        bubbleSort63.sort(intArray80);
        bubbleSort39.sort(intArray80);
        bubbleSort0.sort(intArray80);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort1.sort(intArray6);
        sorting.BubbleSort bubbleSort8 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort9 = new sorting.BubbleSort();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0 };
        bubbleSort9.sort(intArray11);
        sorting.BubbleSort bubbleSort13 = new sorting.BubbleSort();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort13.sort(intArray18);
        bubbleSort9.sort(intArray18);
        bubbleSort8.sort(intArray18);
        bubbleSort1.sort(intArray18);
        bubbleSort0.sort(intArray18);
        sorting.BubbleSort bubbleSort24 = new sorting.BubbleSort();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort24.sort(intArray29);
        bubbleSort0.sort(intArray29);
        sorting.BubbleSort bubbleSort32 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort33 = new sorting.BubbleSort();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort33.sort(intArray38);
        sorting.BubbleSort bubbleSort40 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort41 = new sorting.BubbleSort();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0 };
        bubbleSort41.sort(intArray43);
        sorting.BubbleSort bubbleSort45 = new sorting.BubbleSort();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort45.sort(intArray50);
        bubbleSort41.sort(intArray50);
        bubbleSort40.sort(intArray50);
        bubbleSort33.sort(intArray50);
        bubbleSort32.sort(intArray50);
        sorting.BubbleSort bubbleSort56 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort57 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort58 = new sorting.BubbleSort();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0 };
        bubbleSort58.sort(intArray60);
        sorting.BubbleSort bubbleSort62 = new sorting.BubbleSort();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort62.sort(intArray67);
        bubbleSort58.sort(intArray67);
        bubbleSort57.sort(intArray67);
        bubbleSort56.sort(intArray67);
        sorting.BubbleSort bubbleSort72 = new sorting.BubbleSort();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort72.sort(intArray77);
        sorting.BubbleSort bubbleSort79 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort80 = new sorting.BubbleSort();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0 };
        bubbleSort80.sort(intArray82);
        sorting.BubbleSort bubbleSort84 = new sorting.BubbleSort();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort84.sort(intArray89);
        bubbleSort80.sort(intArray89);
        bubbleSort79.sort(intArray89);
        bubbleSort72.sort(intArray89);
        bubbleSort56.sort(intArray89);
        bubbleSort32.sort(intArray89);
        bubbleSort0.sort(intArray89);
        java.lang.Class<?> wildcardClass97 = intArray89.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.String str3 = WhichPath.makeDecision(5, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, (double) 0L);
        double double14 = calculator0.divide((double) 0L, 33.0d);
        double double17 = calculator0.add(52.32d, (-99.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-46.68d) + "'", double17 == (-46.68d));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, 3.1622776601683795d);
        double double13 = calculator0.square((double) 100L);
        double double16 = calculator0.multiply((double) 1, (double) 0.0f);
        double double18 = calculator0.square((double) (byte) 1);
        double double21 = calculator0.multiply(9.997675406651087E7d, 22288.205727444507d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = calculator0.squareRoot((-11.365657592810937d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10000.0d + "'", double13 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.2283024625965186E12d + "'", double21 == 2.2283024625965186E12d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double4 = calculator0.square((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = calculator0.divide((double) 'a', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort2 = new sorting.BubbleSort();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0 };
        bubbleSort2.sort(intArray4);
        sorting.BubbleSort bubbleSort6 = new sorting.BubbleSort();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort6.sort(intArray11);
        bubbleSort2.sort(intArray11);
        bubbleSort1.sort(intArray11);
        bubbleSort0.sort(intArray11);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 2, 100 };
        bubbleSort0.sort(intArray18);
        sorting.BubbleSort bubbleSort20 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort21 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort22 = new sorting.BubbleSort();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0 };
        bubbleSort22.sort(intArray24);
        sorting.BubbleSort bubbleSort26 = new sorting.BubbleSort();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort26.sort(intArray31);
        bubbleSort22.sort(intArray31);
        bubbleSort21.sort(intArray31);
        bubbleSort20.sort(intArray31);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 100 };
        bubbleSort20.sort(intArray38);
        sorting.BubbleSort bubbleSort40 = new sorting.BubbleSort();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0 };
        bubbleSort40.sort(intArray42);
        sorting.BubbleSort bubbleSort44 = new sorting.BubbleSort();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort44.sort(intArray49);
        bubbleSort40.sort(intArray49);
        bubbleSort20.sort(intArray49);
        bubbleSort0.sort(intArray49);
        sorting.BubbleSort bubbleSort54 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort55 = new sorting.BubbleSort();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort55.sort(intArray60);
        sorting.BubbleSort bubbleSort62 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort63 = new sorting.BubbleSort();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0 };
        bubbleSort63.sort(intArray65);
        sorting.BubbleSort bubbleSort67 = new sorting.BubbleSort();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort67.sort(intArray72);
        bubbleSort63.sort(intArray72);
        bubbleSort62.sort(intArray72);
        bubbleSort55.sort(intArray72);
        bubbleSort54.sort(intArray72);
        sorting.BubbleSort bubbleSort78 = new sorting.BubbleSort();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort78.sort(intArray83);
        bubbleSort54.sort(intArray83);
        bubbleSort0.sort(intArray83);
        java.lang.Class<?> wildcardClass87 = bubbleSort0.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new java.lang.Integer[] { 2, 100 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new java.lang.Integer[] { 2, 100 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 100, 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 1" + "'", str3, "Path 1");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int4 = examGrades0.grade((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 10, (int) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double8 = calculator0.multiply((double) (short) 10, (double) (short) 100);
        double double11 = calculator0.subtract((double) (byte) 100, (double) 10L);
        double double14 = calculator0.divide(4.3857723784044314E27d, 40.833333333333336d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1000.0d + "'", double8 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.074066704915371E26d + "'", double14 == 1.074066704915371E26d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.multiply((double) '4', (double) (-1));
        double double11 = calculator0.subtract(30.0d, 9.9999998E15d);
        double double14 = calculator0.add((-142.2882057274445d), 0.01174496644295302d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = calculator0.squareRoot((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-52.0d) + "'", double8 == (-52.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.99999979999997E15d) + "'", double11 == (-9.99999979999997E15d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-142.27646076100154d) + "'", double14 == (-142.27646076100154d));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) (short) 10);
        int[] intArray15 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray15, 0);
        int[] intArray20 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray20);
        sorting.MergeSort.sort(intArray20, 1);
        int[] intArray26 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray26);
        sorting.MergeSort.merge(intArray15, intArray20, intArray26, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray26, (int) (short) 0);
        sorting.SelectionSort.sort(intArray26);
        sorting.SelectionSort.sort(intArray26);
        sorting.SelectionSort.sort(intArray26);
        int int37 = binarySearch0.search(intArray26, (int) (short) 1);
        searching.BinarySearch binarySearch38 = new searching.BinarySearch();
        int[] intArray41 = new int[] { (byte) 100, (short) 10 };
        int int43 = binarySearch38.search(intArray41, (int) '4');
        int int45 = binarySearch0.search(intArray41, (int) (short) 10);
        int[] intArray49 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray49, 0);
        int[] intArray54 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray54);
        sorting.MergeSort.sort(intArray54, 1);
        int[] intArray60 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray60);
        sorting.MergeSort.merge(intArray49, intArray54, intArray60, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.sort(intArray49, (int) (short) 1);
        int int68 = binarySearch0.search(intArray49, (int) (byte) 0);
        int[] intArray71 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray71);
        sorting.MergeSort.sort(intArray71, 1);
        int int76 = binarySearch0.search(intArray71, (int) (byte) 1);
        java.lang.Class<?> wildcardClass77 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        searching.LinearSearch linearSearch21 = new searching.LinearSearch();
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        sorting.MergeSort.sort(intArray30, 1);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.merge(intArray25, intArray30, intArray36, (int) (short) 0, (int) (short) 1);
        int int42 = linearSearch21.search(intArray36, 100);
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray52 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray52, 0);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.sort(intArray57, 1);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.merge(intArray52, intArray57, intArray63, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray36, intArray46, intArray57, (int) (byte) -1, (int) (short) 1);
        insertionSort0.sort(intArray57);
        searching.BinarySearch binarySearch72 = new searching.BinarySearch();
        int[] intArray75 = new int[] { (byte) 100, (short) 10 };
        int int77 = binarySearch72.search(intArray75, (int) '4');
        int[] intArray80 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray80);
        int int83 = binarySearch72.search(intArray80, (int) 'a');
        int[] intArray86 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray86);
        sorting.MergeSort.sort(intArray86, 1);
        int int91 = binarySearch72.search(intArray86, (int) (short) 1);
        sorting.SelectionSort.sort(intArray86);
        insertionSort0.sort(intArray86);
        sorting.SelectionSort.sort(intArray86);
        java.lang.Class<?> wildcardClass95 = intArray86.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        searching.LinearSearch linearSearch21 = new searching.LinearSearch();
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        sorting.MergeSort.sort(intArray30, 1);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.merge(intArray25, intArray30, intArray36, (int) (short) 0, (int) (short) 1);
        int int42 = linearSearch21.search(intArray36, 100);
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray52 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray52, 0);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.sort(intArray57, 1);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.merge(intArray52, intArray57, intArray63, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray36, intArray46, intArray57, (int) (byte) -1, (int) (short) 1);
        insertionSort0.sort(intArray57);
        searching.BinarySearch binarySearch72 = new searching.BinarySearch();
        int[] intArray75 = new int[] { (byte) 100, (short) 10 };
        int int77 = binarySearch72.search(intArray75, (int) '4');
        int[] intArray80 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray80);
        int int83 = binarySearch72.search(intArray80, (int) 'a');
        searching.LinearSearch linearSearch84 = new searching.LinearSearch();
        int[] intArray88 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray88, 0);
        int int92 = linearSearch84.search(intArray88, (int) ' ');
        int int94 = binarySearch72.search(intArray88, (int) (byte) 100);
        insertionSort0.sort(intArray88);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray88, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { 0, 10, 100 });
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.String str3 = WhichPath.makeDecision((int) 'a', (int) '4', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 5" + "'", str3, "Path 5");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort1 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort2 = new sorting.BubbleSort();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort2.sort(intArray7);
        sorting.BubbleSort bubbleSort9 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort10 = new sorting.BubbleSort();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0 };
        bubbleSort10.sort(intArray12);
        sorting.BubbleSort bubbleSort14 = new sorting.BubbleSort();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort14.sort(intArray19);
        bubbleSort10.sort(intArray19);
        bubbleSort9.sort(intArray19);
        bubbleSort2.sort(intArray19);
        bubbleSort1.sort(intArray19);
        sorting.BubbleSort bubbleSort25 = new sorting.BubbleSort();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort25.sort(intArray30);
        bubbleSort1.sort(intArray30);
        bubbleSort0.sort(intArray30);
        sorting.BubbleSort bubbleSort34 = new sorting.BubbleSort();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort34.sort(intArray39);
        sorting.BubbleSort bubbleSort41 = new sorting.BubbleSort();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0 };
        bubbleSort41.sort(intArray43);
        sorting.BubbleSort bubbleSort45 = new sorting.BubbleSort();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort45.sort(intArray50);
        bubbleSort41.sort(intArray50);
        sorting.BubbleSort bubbleSort53 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort54 = new sorting.BubbleSort();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort54.sort(intArray59);
        sorting.BubbleSort bubbleSort61 = new sorting.BubbleSort();
        sorting.BubbleSort bubbleSort62 = new sorting.BubbleSort();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0 };
        bubbleSort62.sort(intArray64);
        sorting.BubbleSort bubbleSort66 = new sorting.BubbleSort();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort66.sort(intArray71);
        bubbleSort62.sort(intArray71);
        bubbleSort61.sort(intArray71);
        bubbleSort54.sort(intArray71);
        bubbleSort53.sort(intArray71);
        bubbleSort41.sort(intArray71);
        bubbleSort34.sort(intArray71);
        bubbleSort0.sort(intArray71);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new java.lang.Integer[] { 0 });
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new java.lang.Integer[] { 0, 0, 0, 10 });
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 1, (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        searching.LinearSearch linearSearch12 = new searching.LinearSearch();
        int[] intArray16 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray16, 0);
        int int20 = linearSearch12.search(intArray16, (int) ' ');
        int int22 = binarySearch0.search(intArray16, (int) (byte) 100);
        sorting.QuickSort quickSort23 = new sorting.QuickSort();
        int[] intArray30 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray30);
        quickSort23.sort(intArray30, 1, 1);
        int int36 = binarySearch0.search(intArray30, (-1));
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray30, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 1);
        int int6 = examGrades0.grade((int) ' ');
        int int8 = examGrades0.grade(0);
        int int10 = examGrades0.grade(0);
        int int12 = examGrades0.grade(0);
        int int14 = examGrades0.grade(1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = examGrades0.grade((-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.String str3 = WhichPath.makeDecision(10, (int) 'a', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray4);
        sorting.MergeSort.sort(intArray4, 1);
        insertionSort1.sort(intArray4);
        searching.BinarySearch binarySearch9 = new searching.BinarySearch();
        searching.LinearSearch linearSearch10 = new searching.LinearSearch();
        int[] intArray14 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray14, 0);
        int[] intArray19 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray19);
        sorting.MergeSort.sort(intArray19, 1);
        int[] intArray25 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray25);
        sorting.MergeSort.merge(intArray14, intArray19, intArray25, (int) (short) 0, (int) (short) 1);
        int int31 = linearSearch10.search(intArray25, 100);
        searching.BinarySearch binarySearch32 = new searching.BinarySearch();
        int[] intArray35 = new int[] { (byte) 100, (short) 10 };
        int int37 = binarySearch32.search(intArray35, (int) '4');
        int[] intArray40 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray40);
        int int43 = binarySearch32.search(intArray40, (int) (short) 10);
        int int45 = linearSearch10.search(intArray40, 1);
        int[] intArray48 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray48);
        int int51 = linearSearch10.search(intArray48, (int) (short) -1);
        int int53 = binarySearch9.search(intArray48, (int) (short) 100);
        insertionSort1.sort(intArray48);
        insertionSort0.sort(intArray48);
        int[] intArray56 = null;
        // The following exception was thrown during execution in test generation
        try {
            insertionSort0.sort(intArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        searching.LinearSearch linearSearch20 = new searching.LinearSearch();
        searching.BinarySearch binarySearch21 = new searching.BinarySearch();
        int[] intArray24 = new int[] { (byte) 100, (short) 10 };
        int int26 = binarySearch21.search(intArray24, (int) '4');
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        int int32 = binarySearch21.search(intArray29, (int) 'a');
        int int34 = linearSearch20.search(intArray29, (int) ' ');
        searching.LinearSearch linearSearch35 = new searching.LinearSearch();
        int[] intArray39 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray39, 0);
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        sorting.MergeSort.sort(intArray44, 1);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        sorting.MergeSort.merge(intArray39, intArray44, intArray50, (int) (short) 0, (int) (short) 1);
        int int56 = linearSearch35.search(intArray50, 100);
        searching.BinarySearch binarySearch57 = new searching.BinarySearch();
        int[] intArray60 = new int[] { (byte) 100, (short) 10 };
        int int62 = binarySearch57.search(intArray60, (int) '4');
        int[] intArray65 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray65);
        int int68 = binarySearch57.search(intArray65, (int) (short) 10);
        int int70 = linearSearch35.search(intArray65, 1);
        sorting.MergeSort.merge(intArray4, intArray29, intArray65, (int) (byte) -1, (int) (byte) -1);
        insertionSort0.sort(intArray4);
        sorting.SelectionSort.sort(intArray4);
        java.lang.Class<?> wildcardClass76 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 1, 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.String str3 = WhichPath.makeDecision(5, (int) (byte) 10, (-78));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 6" + "'", str3, "Path 6");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double8 = calculator0.multiply((double) (short) 10, (double) (short) 100);
        double double11 = calculator0.subtract((double) (byte) 100, (double) 10L);
        double double14 = calculator0.add(3000.0d, (-20.0d));
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1000.0d + "'", double8 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2980.0d + "'", double14 == 2980.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.String str3 = WhichPath.makeDecision((-1), (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        int int6 = binarySearch1.search(intArray4, (int) '4');
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        int int12 = binarySearch1.search(intArray9, (int) 'a');
        int int14 = linearSearch0.search(intArray9, (int) ' ');
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        int int6 = binarySearch1.search(intArray4, (int) '4');
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        int int12 = binarySearch1.search(intArray9, (int) 'a');
        int int14 = linearSearch0.search(intArray9, (int) ' ');
        searching.BinarySearch binarySearch15 = new searching.BinarySearch();
        int[] intArray18 = new int[] { (byte) 100, (short) 10 };
        int int20 = binarySearch15.search(intArray18, (int) '4');
        int int22 = linearSearch0.search(intArray18, 1);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        searching.BinarySearch binarySearch29 = new searching.BinarySearch();
        int[] intArray32 = new int[] { (byte) 100, (short) 10 };
        int int34 = binarySearch29.search(intArray32, (int) '4');
        int[] intArray37 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray37);
        int int40 = binarySearch29.search(intArray37, (int) 'a');
        int int42 = binarySearch23.search(intArray37, 100);
        sorting.QuickSort quickSort43 = new sorting.QuickSort();
        int[] intArray47 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray47, 0);
        int[] intArray52 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray52);
        sorting.MergeSort.sort(intArray52, 1);
        int[] intArray58 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray58);
        sorting.MergeSort.merge(intArray47, intArray52, intArray58, (int) (short) 0, (int) (short) 1);
        quickSort43.sort(intArray52, (int) (byte) 0, (int) (byte) 1);
        int int67 = binarySearch23.search(intArray52, 0);
        int int69 = linearSearch0.search(intArray52, 10);
        sorting.MergeSort.sort(intArray52, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide((double) (short) 0, (double) (short) -1);
        double double11 = calculator0.subtract((double) '4', (-99.0d));
        double double14 = calculator0.add(1.0E8d, (-1.0d));
        double double17 = calculator0.add((double) 1, (double) 100);
        double double20 = calculator0.multiply(22.288205727444506d, 9.9498743710662d);
        double double22 = calculator0.squareRoot(9.9996951E7d);
        double double24 = calculator0.squareRoot(0.0d);
        double double27 = calculator0.multiply((-9.9993902092964E15d), 2.040261207836235E-6d);
        double double29 = calculator0.squareRoot(10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 151.0d + "'", double11 == 151.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.9999999E7d + "'", double14 == 9.9999999E7d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 101.0d + "'", double17 == 101.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 221.76484694455098d + "'", double20 == 221.76484694455098d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9999.847548837932d + "'", double22 == 9999.847548837932d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-2.04013679460449E10d) + "'", double27 == (-2.04013679460449E10d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 3.1622776601683795d + "'", double29 == 3.1622776601683795d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.String str3 = WhichPath.makeDecision(5, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double10 = calculator0.squareRoot(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = calculator0.squareRoot((-80780.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = examGrades0.grade((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid points");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, 1, 1);
        searching.LinearSearch linearSearch12 = new searching.LinearSearch();
        int[] intArray16 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray16, 0);
        int int20 = linearSearch12.search(intArray16, (int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray24, 0);
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        sorting.MergeSort.sort(intArray29, 1);
        int[] intArray35 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray35);
        sorting.MergeSort.merge(intArray24, intArray29, intArray35, (int) (short) 0, (int) (short) 1);
        int int41 = linearSearch12.search(intArray29, (int) (short) 1);
        quickSort0.sort(intArray29, 2, (int) (short) -1);
        java.lang.Class<?> wildcardClass45 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 0, 2, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        insertionSort1.sort(intArray5);
        insertionSort0.sort(intArray5);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        sorting.QuickSort quickSort29 = new sorting.QuickSort();
        int[] intArray36 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray36);
        quickSort29.sort(intArray36, 1, 1);
        int int42 = binarySearch23.search(intArray36, (int) (short) 0);
        sorting.QuickSort quickSort43 = new sorting.QuickSort();
        int[] intArray50 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray50);
        quickSort43.sort(intArray50, 1, 1);
        int int56 = binarySearch23.search(intArray50, (int) (byte) 1);
        insertionSort0.sort(intArray50);
        searching.BinarySearch binarySearch58 = new searching.BinarySearch();
        int[] intArray61 = new int[] { (byte) 100, (short) 10 };
        int int63 = binarySearch58.search(intArray61, (int) '4');
        int[] intArray66 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray66);
        int int69 = binarySearch58.search(intArray66, (int) 'a');
        int[] intArray72 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray72);
        sorting.MergeSort.sort(intArray72, 1);
        int int77 = binarySearch58.search(intArray72, (int) (short) 1);
        sorting.SelectionSort.sort(intArray72);
        sorting.MergeSort.sort(intArray72, (int) (short) 0);
        insertionSort0.sort(intArray72);
        int[] intArray84 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray84);
        sorting.SelectionSort.sort(intArray84);
        insertionSort0.sort(intArray84);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray84, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 1, 35 });
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double7 = calculator0.square(10000.0d);
        double double10 = calculator0.subtract((double) (short) 0, 1500.0d);
        double double12 = calculator0.squareRoot(9.9996951E7d);
        double double14 = calculator0.square(1.4850000000000168E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E8d + "'", double7 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1500.0d) + "'", double10 == (-1500.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9999.847548837932d + "'", double12 == 9999.847548837932d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.2052250000000497E14d + "'", double14 == 2.2052250000000497E14d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        searching.LinearSearch linearSearch21 = new searching.LinearSearch();
        int[] intArray25 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray25, 0);
        int[] intArray30 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray30);
        sorting.MergeSort.sort(intArray30, 1);
        int[] intArray36 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray36);
        sorting.MergeSort.merge(intArray25, intArray30, intArray36, (int) (short) 0, (int) (short) 1);
        int int42 = linearSearch21.search(intArray36, 100);
        int[] intArray46 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray46, 0);
        int[] intArray52 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray52, 0);
        int[] intArray57 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray57);
        sorting.MergeSort.sort(intArray57, 1);
        int[] intArray63 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray63);
        sorting.MergeSort.merge(intArray52, intArray57, intArray63, (int) (short) 0, (int) (short) 1);
        sorting.MergeSort.merge(intArray36, intArray46, intArray57, (int) (byte) -1, (int) (short) 1);
        insertionSort0.sort(intArray57);
        searching.BinarySearch binarySearch72 = new searching.BinarySearch();
        int[] intArray75 = new int[] { (byte) 100, (short) 10 };
        int int77 = binarySearch72.search(intArray75, (int) '4');
        insertionSort0.sort(intArray75);
        int[] intArray79 = null;
        // The following exception was thrown during execution in test generation
        try {
            insertionSort0.sort(intArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 10, 100 });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.String str3 = WhichPath.makeDecision(0, 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 1);
        int int6 = examGrades0.grade((int) ' ');
        int int8 = examGrades0.grade(0);
        int int10 = examGrades0.grade((int) (byte) 10);
        int int12 = examGrades0.grade(0);
        java.lang.Class<?> wildcardClass13 = examGrades0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str3 = WhichPath.makeDecision(10, (int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 10, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray4, 0);
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        sorting.MergeSort.sort(intArray9, 1);
        int[] intArray15 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray15);
        sorting.MergeSort.merge(intArray4, intArray9, intArray15, (int) (short) 0, (int) (short) 1);
        insertionSort0.sort(intArray4);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 10, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.String str3 = WhichPath.makeDecision((int) 'a', (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 5" + "'", str3, "Path 5");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String str3 = WhichPath.makeDecision(2, (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide((double) (short) 0, (double) (short) -1);
        double double11 = calculator0.subtract((double) '4', (-99.0d));
        double double14 = calculator0.add(1.0E8d, (-1.0d));
        double double16 = calculator0.squareRoot((double) 100);
        double double18 = calculator0.squareRoot(9.9997E7d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = calculator0.squareRoot((-4307.065632219975d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 151.0d + "'", double11 == 151.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.9999999E7d + "'", double14 == 9.9999999E7d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9999.849998874983d + "'", double18 == 9999.849998874983d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        sorting.QuickSort quickSort0 = new sorting.QuickSort();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray7);
        quickSort0.sort(intArray7, (int) 'a', (int) (byte) 10);
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        searching.LinearSearch linearSearch35 = new searching.LinearSearch();
        int[] intArray39 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray39, 0);
        int[] intArray44 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray44);
        sorting.MergeSort.sort(intArray44, 1);
        int[] intArray50 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray50);
        sorting.MergeSort.merge(intArray39, intArray44, intArray50, (int) (short) 0, (int) (short) 1);
        int int56 = linearSearch35.search(intArray50, 100);
        insertionSort12.sort(intArray50);
        int[] intArray61 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray61, 0);
        insertionSort12.sort(intArray61);
        quickSort0.sort(intArray61, 100, 1);
        int[] intArray68 = null;
        quickSort0.sort(intArray68, 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 0, 10, 100 });
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double4 = calculator0.square((double) 100L);
        double double7 = calculator0.multiply(0.0d, 33.0d);
        double double10 = calculator0.multiply(0.0d, 2.2283024625965186E12d);
        double double13 = calculator0.divide(810000.0d, 1808.2923436466704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 447.936420704256d + "'", double13 == 447.936420704256d);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        ExamGrades examGrades0 = new ExamGrades();
        int int2 = examGrades0.grade((int) (short) 100);
        int int4 = examGrades0.grade((int) (short) 1);
        int int6 = examGrades0.grade((int) ' ');
        int int8 = examGrades0.grade(0);
        int int10 = examGrades0.grade(0);
        int int12 = examGrades0.grade((int) (byte) 1);
        int int14 = examGrades0.grade((int) ' ');
        java.lang.Class<?> wildcardClass15 = examGrades0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        sorting.InsertionSort insertionSort12 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort13 = new sorting.InsertionSort();
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray17, 0);
        int[] intArray22 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray22);
        sorting.MergeSort.sort(intArray22, 1);
        int[] intArray28 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray28);
        sorting.MergeSort.merge(intArray17, intArray22, intArray28, (int) (short) 0, (int) (short) 1);
        insertionSort13.sort(intArray17);
        insertionSort12.sort(intArray17);
        int int36 = binarySearch0.search(intArray17, (int) (byte) -1);
        int[] intArray43 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray43);
        int int46 = binarySearch0.search(intArray43, (-1));
        searching.BinarySearch binarySearch47 = new searching.BinarySearch();
        int[] intArray50 = new int[] { (byte) 100, (short) 10 };
        int int52 = binarySearch47.search(intArray50, (int) '4');
        sorting.QuickSort quickSort53 = new sorting.QuickSort();
        int[] intArray60 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray60);
        quickSort53.sort(intArray60, 1, 1);
        int int66 = binarySearch47.search(intArray60, (int) (short) 0);
        searching.LinearSearch linearSearch67 = new searching.LinearSearch();
        searching.BinarySearch binarySearch68 = new searching.BinarySearch();
        int[] intArray71 = new int[] { (byte) 100, (short) 10 };
        int int73 = binarySearch68.search(intArray71, (int) '4');
        int[] intArray76 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray76);
        int int79 = binarySearch68.search(intArray76, (int) 'a');
        int int81 = linearSearch67.search(intArray76, (int) ' ');
        int int83 = binarySearch47.search(intArray76, (int) (byte) 10);
        sorting.SelectionSort.sort(intArray76);
        int int86 = binarySearch0.search(intArray76, (int) (short) 0);
        int[] intArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int89 = binarySearch0.search(intArray87, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 100, (int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 4" + "'", str3, "Path 4");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.lang.String str3 = WhichPath.makeDecision((int) '4', 4, (-78));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 3" + "'", str3, "Path 3");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        int[] intArray8 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray8);
        int int11 = binarySearch0.search(intArray8, (int) 'a');
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        sorting.MergeSort.sort(intArray14, 1);
        int int19 = binarySearch0.search(intArray14, (int) (short) 1);
        sorting.QuickSort quickSort20 = new sorting.QuickSort();
        int[] intArray27 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray27);
        quickSort20.sort(intArray27, 1, 1);
        sorting.InsertionSort insertionSort32 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort33 = new sorting.InsertionSort();
        int[] intArray37 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray37, 0);
        int[] intArray42 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray42);
        sorting.MergeSort.sort(intArray42, 1);
        int[] intArray48 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray48);
        sorting.MergeSort.merge(intArray37, intArray42, intArray48, (int) (short) 0, (int) (short) 1);
        insertionSort33.sort(intArray37);
        insertionSort32.sort(intArray37);
        quickSort20.sort(intArray37, 100, 0);
        int int59 = binarySearch0.search(intArray37, 5);
        sorting.MergeSort.sort(intArray37, (-78));
        sorting.MergeSort.sort(intArray37, (-78));
        java.lang.Class<?> wildcardClass64 = intArray37.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.String str3 = WhichPath.makeDecision((int) (short) 1, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double4 = calculator0.square((double) 100L);
        double double7 = calculator0.multiply(0.0d, 33.0d);
        double double9 = calculator0.square(32.0d);
        double double11 = calculator0.square((-1466.0d));
        double double14 = calculator0.divide((-1961.0133021728857d), (-156.04127261285774d));
        double double17 = calculator0.subtract((-1.619975596480437E15d), 111.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1024.0d + "'", double9 == 1024.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2149156.0d + "'", double11 == 2149156.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.5672731921266d + "'", double14 == 12.5672731921266d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.619975596480548E15d) + "'", double17 == (-1.619975596480548E15d));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.subtract((double) 1.0f, 100.0d);
        double double14 = calculator0.subtract(0.0d, 8880400.0d);
        double double16 = calculator0.square((-9.9996951E7d));
        double double19 = calculator0.subtract(4.5E-7d, (-25.0d));
        double double22 = calculator0.add((double) (-78), 9999.849998874983d);
        double double25 = calculator0.add(31.61134993166955d, 0.8600917431192661d);
        double double27 = calculator0.square(999.9849998874982d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8880400.0d) + "'", double14 == (-8880400.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.9993902092964E15d + "'", double16 == 9.9993902092964E15d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 25.00000045d + "'", double19 == 25.00000045d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9921.849998874983d + "'", double22 == 9921.849998874983d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.471441674788814d + "'", double25 == 32.471441674788814d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 999969.9999999999d + "'", double27 == 999969.9999999999d);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String str3 = WhichPath.makeDecision((int) 'a', 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 4" + "'", str3, "Path 4");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, (double) 0L);
        double double13 = calculator0.squareRoot((double) (short) 1);
        double double16 = calculator0.divide((-45.0d), (-1.0E8d));
        double double18 = calculator0.squareRoot((double) 100L);
        double double20 = calculator0.squareRoot((double) 'a');
        double double23 = calculator0.multiply(22.288205727444506d, 9.970394962973092d);
        double double26 = calculator0.multiply(1.0000027422030826E8d, 1600.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.5E-7d + "'", double16 == 4.5E-7d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 9.848857801796104d + "'", double20 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 222.2222141186207d + "'", double23 == 222.2222141186207d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.6000043875249323E11d + "'", double26 == 1.6000043875249323E11d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        searching.LinearSearch linearSearch0 = new searching.LinearSearch();
        searching.BinarySearch binarySearch1 = new searching.BinarySearch();
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        int int6 = binarySearch1.search(intArray4, (int) '4');
        int[] intArray9 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray9);
        int int12 = binarySearch1.search(intArray9, (int) 'a');
        int int14 = linearSearch0.search(intArray9, (int) ' ');
        sorting.InsertionSort insertionSort15 = new sorting.InsertionSort();
        int[] intArray18 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray18);
        sorting.MergeSort.sort(intArray18, 1);
        insertionSort15.sort(intArray18);
        searching.BinarySearch binarySearch23 = new searching.BinarySearch();
        int[] intArray26 = new int[] { (byte) 100, (short) 10 };
        int int28 = binarySearch23.search(intArray26, (int) '4');
        int[] intArray31 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray31);
        int int34 = binarySearch23.search(intArray31, (int) 'a');
        int[] intArray37 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray37);
        sorting.MergeSort.sort(intArray37, 1);
        int int42 = binarySearch23.search(intArray37, (int) (short) 1);
        sorting.QuickSort quickSort43 = new sorting.QuickSort();
        int[] intArray50 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        sorting.SelectionSort.sort(intArray50);
        quickSort43.sort(intArray50, 1, 1);
        sorting.InsertionSort insertionSort55 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort56 = new sorting.InsertionSort();
        int[] intArray60 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray60, 0);
        int[] intArray65 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray65);
        sorting.MergeSort.sort(intArray65, 1);
        int[] intArray71 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray71);
        sorting.MergeSort.merge(intArray60, intArray65, intArray71, (int) (short) 0, (int) (short) 1);
        insertionSort56.sort(intArray60);
        insertionSort55.sort(intArray60);
        quickSort43.sort(intArray60, 100, 0);
        int int82 = binarySearch23.search(intArray60, 5);
        insertionSort15.sort(intArray60);
        sorting.MergeSort.sort(intArray60, (int) (short) -1);
        int int87 = linearSearch0.search(intArray60, 100);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray60, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1), 0, 1, 10, 35, 100 });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String str3 = WhichPath.makeDecision((int) (byte) 10, (int) (short) 100, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber((int) (short) 100);
        java.lang.String str4 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str6 = whatKindOfNumber0.processNumber((-1));
        java.lang.String str8 = whatKindOfNumber0.processNumber((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = whatKindOfNumber0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Positive Even Not Multiple of 3" + "'", str2, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Negative Odd" + "'", str4, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Negative Odd" + "'", str6, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Zero" + "'", str8, "Zero");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.String str3 = WhichPath.makeDecision(0, (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 9" + "'", str3, "Path 9");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber((-1));
        java.lang.String str4 = whatKindOfNumber0.processNumber((int) (short) 10);
        java.lang.Class<?> wildcardClass5 = whatKindOfNumber0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Negative Odd" + "'", str2, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Positive Even Not Multiple of 3" + "'", str4, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber((int) (short) 100);
        java.lang.String str4 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str6 = whatKindOfNumber0.processNumber((int) (byte) 10);
        java.lang.String str8 = whatKindOfNumber0.processNumber(1);
        java.lang.String str10 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str12 = whatKindOfNumber0.processNumber((int) (short) 1);
        java.lang.String str14 = whatKindOfNumber0.processNumber(1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Positive Even Not Multiple of 3" + "'", str2, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Negative Odd" + "'", str4, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Positive Even Not Multiple of 3" + "'", str6, "Positive Even Not Multiple of 3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Positive Odd" + "'", str8, "Positive Odd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Negative Odd" + "'", str10, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Positive Odd" + "'", str12, "Positive Odd");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Positive Odd" + "'", str14, "Positive Odd");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, (double) 0L);
        double double13 = calculator0.squareRoot((double) (short) 1);
        double double15 = calculator0.square((double) (short) 10);
        double double18 = calculator0.add(3.1622776601683795d, (double) 1.0f);
        double double20 = calculator0.square(22.288205727444506d);
        double double23 = calculator0.subtract(0.0024000365888366976d, 9.99999980000199E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.16227766016838d + "'", double18 == 4.16227766016838d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 496.76411454889006d + "'", double20 == 496.76411454889006d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.99999980000199E15d) + "'", double23 == (-9.99999980000199E15d));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
        java.lang.String str2 = whatKindOfNumber0.processNumber((-1));
        java.lang.String str4 = whatKindOfNumber0.processNumber((-1));
        java.lang.String str6 = whatKindOfNumber0.processNumber((int) (short) 1);
        java.lang.String str8 = whatKindOfNumber0.processNumber((int) (short) -1);
        java.lang.String str10 = whatKindOfNumber0.processNumber(4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Negative Odd" + "'", str2, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Negative Odd" + "'", str4, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Positive Odd" + "'", str6, "Positive Odd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Negative Odd" + "'", str8, "Negative Odd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Positive Even Not Multiple of 3" + "'", str10, "Positive Even Not Multiple of 3");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        searching.BinarySearch binarySearch0 = new searching.BinarySearch();
        int[] intArray3 = new int[] { (byte) 100, (short) 10 };
        int int5 = binarySearch0.search(intArray3, (int) '4');
        searching.BinarySearch binarySearch6 = new searching.BinarySearch();
        int[] intArray9 = new int[] { (byte) 100, (short) 10 };
        int int11 = binarySearch6.search(intArray9, (int) '4');
        int[] intArray14 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray14);
        int int17 = binarySearch6.search(intArray14, (int) 'a');
        int int19 = binarySearch0.search(intArray14, 100);
        sorting.QuickSort quickSort20 = new sorting.QuickSort();
        int[] intArray24 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray24, 0);
        int[] intArray29 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray29);
        sorting.MergeSort.sort(intArray29, 1);
        int[] intArray35 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray35);
        sorting.MergeSort.merge(intArray24, intArray29, intArray35, (int) (short) 0, (int) (short) 1);
        quickSort20.sort(intArray29, (int) (byte) 0, (int) (byte) 1);
        int int44 = binarySearch0.search(intArray29, 0);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray29, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray4 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray4);
        sorting.MergeSort.sort(intArray4, 1);
        insertionSort1.sort(intArray4);
        searching.BinarySearch binarySearch9 = new searching.BinarySearch();
        searching.LinearSearch linearSearch10 = new searching.LinearSearch();
        int[] intArray14 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray14, 0);
        int[] intArray19 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray19);
        sorting.MergeSort.sort(intArray19, 1);
        int[] intArray25 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray25);
        sorting.MergeSort.merge(intArray14, intArray19, intArray25, (int) (short) 0, (int) (short) 1);
        int int31 = linearSearch10.search(intArray25, 100);
        searching.BinarySearch binarySearch32 = new searching.BinarySearch();
        int[] intArray35 = new int[] { (byte) 100, (short) 10 };
        int int37 = binarySearch32.search(intArray35, (int) '4');
        int[] intArray40 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray40);
        int int43 = binarySearch32.search(intArray40, (int) (short) 10);
        int int45 = linearSearch10.search(intArray40, 1);
        int[] intArray48 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray48);
        int int51 = linearSearch10.search(intArray48, (int) (short) -1);
        int int53 = binarySearch9.search(intArray48, (int) (short) 100);
        insertionSort1.sort(intArray48);
        insertionSort0.sort(intArray48);
        sorting.SelectionSort.sort(intArray48);
        // The following exception was thrown during execution in test generation
        try {
            sorting.MergeSort.sort(intArray48, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        sorting.InsertionSort insertionSort1 = new sorting.InsertionSort();
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray5, 0);
        int[] intArray10 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray10);
        sorting.MergeSort.sort(intArray10, 1);
        int[] intArray16 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray16);
        sorting.MergeSort.merge(intArray5, intArray10, intArray16, (int) (short) 0, (int) (short) 1);
        insertionSort1.sort(intArray5);
        insertionSort0.sort(intArray5);
        searching.LinearSearch linearSearch23 = new searching.LinearSearch();
        int[] intArray27 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray27, 0);
        int[] intArray32 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray32);
        sorting.MergeSort.sort(intArray32, 1);
        int[] intArray38 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray38);
        sorting.MergeSort.merge(intArray27, intArray32, intArray38, (int) (short) 0, (int) (short) 1);
        int int44 = linearSearch23.search(intArray38, 100);
        insertionSort0.sort(intArray38);
        searching.LinearSearch linearSearch46 = new searching.LinearSearch();
        int[] intArray50 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        sorting.MergeSort.sort(intArray50, 0);
        int[] intArray55 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray55);
        sorting.MergeSort.sort(intArray55, 1);
        int[] intArray61 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray61);
        sorting.MergeSort.merge(intArray50, intArray55, intArray61, (int) (short) 0, (int) (short) 1);
        int int67 = linearSearch46.search(intArray61, 100);
        insertionSort0.sort(intArray61);
        sorting.SelectionSort.sort(intArray61);
        sorting.SelectionSort.sort(intArray61);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 1, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1, 10, 0 });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 1, 35 });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 1, 35 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String str3 = WhichPath.makeDecision(10, 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.add((double) ' ', (double) 1.0f);
        double double11 = calculator0.multiply((-2.0d), (double) 10);
        double double14 = calculator0.multiply(24.0d, 148500.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = calculator0.divide((-2341.7117942725554d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: b must not be 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 33.0d + "'", double8 == 33.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-20.0d) + "'", double11 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3564000.0d + "'", double14 == 3564000.0d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.subtract((double) '4', (double) 'a');
        double double11 = calculator0.multiply(0.0d, (double) 0L);
        double double13 = calculator0.squareRoot((double) (short) 1);
        double double15 = calculator0.square((double) (short) 10);
        double double18 = calculator0.add(3.1622776601683795d, (double) 1.0f);
        double double20 = calculator0.square(22.288205727444506d);
        java.lang.Class<?> wildcardClass21 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-45.0d) + "'", double8 == (-45.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.16227766016838d + "'", double18 == 4.16227766016838d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 496.76411454889006d + "'", double20 == 496.76411454889006d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String str3 = WhichPath.makeDecision(3, (int) '4', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Path 8" + "'", str3, "Path 8");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) (byte) 100, (-1.0d));
        double double8 = calculator0.divide((double) (short) 0, (double) (short) -1);
        double double11 = calculator0.subtract((double) '4', (-99.0d));
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 151.0d + "'", double11 == 151.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double4 = calculator0.squareRoot((double) 1L);
        double double6 = calculator0.squareRoot((double) (short) 100);
        double double8 = calculator0.squareRoot(8.880133588E14d);
        double double10 = calculator0.squareRoot(2980.0d);
        double double13 = calculator0.multiply(9.848857801796104d, 0.02d);
        double double15 = calculator0.square(1.4492279554211748E-7d);
        double double18 = calculator0.divide(42.288205727444506d, (-1500.0d));
        double double21 = calculator0.subtract((-2.1002616667742384E-14d), 0.17782860786992447d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.979955299664745E7d + "'", double8 == 2.979955299664745E7d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 54.589376255824725d + "'", double10 == 54.589376255824725d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.19697715603592209d + "'", double13 == 0.19697715603592209d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.1002616667742384E-14d + "'", double15 == 2.1002616667742384E-14d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.02819213715162967d) + "'", double18 == (-0.02819213715162967d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.17782860786994548d) + "'", double21 == (-0.17782860786994548d));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        sorting.BubbleSort bubbleSort0 = new sorting.BubbleSort();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort0.sort(intArray5);
        sorting.BubbleSort bubbleSort7 = new sorting.BubbleSort();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0, 0, 0, 10 };
        bubbleSort7.sort(intArray12);
        bubbleSort0.sort(intArray12);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0, 0, 0, 10 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        sorting.InsertionSort insertionSort0 = new sorting.InsertionSort();
        int[] intArray3 = new int[] { '#', (short) 1 };
        sorting.SelectionSort.sort(intArray3);
        sorting.MergeSort.sort(intArray3, 1);
        insertionSort0.sort(intArray3);
        int[] intArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            insertionSort0.sort(intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 35 });
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double5 = calculator0.subtract((double) 10.0f, (double) 10);
        double double8 = calculator0.multiply((double) (short) 10, (double) (short) 100);
        double double10 = calculator0.square((-1.0E8d));
        double double13 = calculator0.multiply((-99.0d), (-1.0099993702092934E18d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1000.0d + "'", double8 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E16d + "'", double10 == 1.0E16d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 9.998993765072005E19d + "'", double13 == 9.998993765072005E19d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        Calculator calculator0 = new Calculator();
        double double2 = calculator0.squareRoot((double) 10);
        double double4 = calculator0.square((double) 100L);
        double double7 = calculator0.multiply(0.0d, (-142.2882057274445d));
        double double9 = calculator0.squareRoot(9999.847548837932d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = calculator0.squareRoot((-1.00000042E8d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: a must not lesser than 0.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99923774128446d + "'", double9 == 99.99923774128446d);
    }
}

