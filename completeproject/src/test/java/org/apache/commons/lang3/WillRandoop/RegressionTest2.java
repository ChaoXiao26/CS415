package org.apache.commons.lang3.WillRandoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream0);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream2 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream3 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream4 = objectToStringComparatorFailableStream1.stream();
        java.util.function.Predicate<java.lang.String> strPredicate6 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass7 = strPredicate6.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector8 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass7);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier9 = objArrayCollector8.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator10 = objArrayCollector8.combiner();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction11 = objArrayCollector8.finisher();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier12 = objArrayCollector8.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator13 = objArrayCollector8.combiner();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = objectToStringComparatorFailableStream1.collect((java.util.stream.Collector<java.lang.Object, java.util.List<java.lang.Object>, java.lang.Object[]>) objArrayCollector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectToStringComparatorStream2);
        org.junit.Assert.assertNull(objectToStringComparatorStream3);
        org.junit.Assert.assertNull(objectToStringComparatorStream4);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objListSupplier9);
        org.junit.Assert.assertNotNull(objListBinaryOperator10);
        org.junit.Assert.assertNotNull(objListFunction11);
        org.junit.Assert.assertNotNull(objListSupplier12);
        org.junit.Assert.assertNotNull(objListBinaryOperator13);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean14 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean17 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean19 = strComparableCheckBuilder1.greaterThanOrEqualTo("hi!");
        boolean boolean22 = strComparableCheckBuilder1.between("", "");
        boolean boolean24 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean26 = strComparableCheckBuilder1.lessThan("");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("");
        boolean boolean4 = strComparableCheckBuilder1.between("", "");
        boolean boolean6 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean9 = strComparableCheckBuilder1.betweenExclusive("", "");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.stream.IntStream intStream1 = org.apache.commons.lang3.stream.IntStreams.rangeClosed(59);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        boolean boolean5 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        boolean boolean7 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = objArrayCollector3.characteristics();
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream9 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream10 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream12 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream13 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream14 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(characteristicsStream9);
        org.junit.Assert.assertNotNull(characteristicsFailableStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
        org.junit.Assert.assertNotNull(characteristicsStream12);
        org.junit.Assert.assertNotNull(characteristicsFailableStream13);
        org.junit.Assert.assertNotNull(characteristicsStream14);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean4 = strComparableCheckBuilder1.between("hi!", "");
        boolean boolean6 = strComparableCheckBuilder1.greaterThan("hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream7 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream8 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream9 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream10 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsFailableStream7);
        org.junit.Assert.assertNotNull(characteristicsFailableStream8);
        org.junit.Assert.assertNotNull(characteristicsStream9);
        org.junit.Assert.assertNotNull(characteristicsStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.Class<java.util.Set<java.util.stream.Collector.Characteristics>[]> characteristicsSetArrayClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.util.Set<java.util.stream.Collector.Characteristics>[]> characteristicsSetArrayEventListenerSupport1 = new org.apache.commons.lang3.event.EventListenerSupport<java.util.Set<java.util.stream.Collector.Characteristics>[]>(characteristicsSetArrayClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: listenerInterface");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean14 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.between("hi!", "hi!");
        boolean boolean20 = strComparableCheckBuilder1.betweenExclusive("hi!", "hi!");
        boolean boolean22 = strComparableCheckBuilder1.greaterThanOrEqualTo("hi!");
        boolean boolean25 = strComparableCheckBuilder1.betweenExclusive("hi!", "");
        boolean boolean27 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.equalTo("");
        boolean boolean14 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.between("hi!", "hi!");
        boolean boolean20 = strComparableCheckBuilder1.between("", "hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.stream.Collector.Characteristics[] characteristicsArray0 = new java.util.stream.Collector.Characteristics[] {};
        java.util.ArrayList<java.util.stream.Collector.Characteristics> characteristicsList1 = new java.util.ArrayList<java.util.stream.Collector.Characteristics>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1, characteristicsArray0);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream3 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream4 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream5 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream6 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream7 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream8 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream9 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream10 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.junit.Assert.assertNotNull(characteristicsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(characteristicsFailableStream3);
        org.junit.Assert.assertNotNull(characteristicsFailableStream4);
        org.junit.Assert.assertNotNull(characteristicsFailableStream5);
        org.junit.Assert.assertNotNull(characteristicsStream6);
        org.junit.Assert.assertNotNull(characteristicsFailableStream7);
        org.junit.Assert.assertNotNull(characteristicsStream8);
        org.junit.Assert.assertNotNull(characteristicsStream9);
        org.junit.Assert.assertNotNull(characteristicsStream10);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream0);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream2 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream3 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream4 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream5 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream6 = objectToStringComparatorFailableStream1.stream();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator7 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        java.util.Comparator<java.lang.Object> objComparator8 = objectToStringComparator7.reversed();
        java.util.Comparator<java.lang.Object> objComparator9 = objectToStringComparator7.reversed();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator10 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        java.util.Comparator<java.lang.Object> objComparator11 = objectToStringComparator10.reversed();
        java.util.Comparator<java.lang.Object> objComparator12 = objectToStringComparator10.reversed();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator13 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator14 = objectToStringComparator13.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate16 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams17 = new org.apache.commons.lang3.stream.Streams();
        int int18 = objectToStringComparator13.compare((java.lang.Object) strPredicate16, (java.lang.Object) streams17);
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder20 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate22 = org.apache.commons.lang3.compare.ComparableUtils.gt("hi!");
        int int23 = objectToStringComparator13.compare((java.lang.Object) "hi!", (java.lang.Object) strPredicate22);
        java.util.Comparator<java.lang.Object> objComparator24 = objectToStringComparator13.reversed();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator25 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator26 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator27 = objectToStringComparator26.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate29 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Object obj30 = null;
        int int31 = objectToStringComparator26.compare((java.lang.Object) "hi!", obj30);
        java.util.Comparator<java.lang.Object> objComparator32 = objectToStringComparator25.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator26);
        java.util.Comparator<java.lang.Object> objComparator33 = objectToStringComparator13.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator26);
        java.util.Comparator<java.lang.Object> objComparator34 = objComparator12.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator26);
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder36 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean38 = strComparableCheckBuilder36.greaterThan("hi!");
        boolean boolean41 = strComparableCheckBuilder36.betweenExclusive("", "");
        boolean boolean43 = strComparableCheckBuilder36.equalTo("hi!");
        boolean boolean45 = strComparableCheckBuilder36.lessThan("");
        boolean boolean47 = strComparableCheckBuilder36.lessThan("");
        boolean boolean49 = strComparableCheckBuilder36.lessThanOrEqualTo("");
        boolean boolean52 = strComparableCheckBuilder36.between("", "hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder54 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean56 = strComparableCheckBuilder54.greaterThan("hi!");
        boolean boolean59 = strComparableCheckBuilder54.betweenExclusive("", "");
        boolean boolean61 = strComparableCheckBuilder54.equalTo("hi!");
        boolean boolean63 = strComparableCheckBuilder54.lessThan("");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder65 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean67 = strComparableCheckBuilder65.greaterThan("hi!");
        boolean boolean70 = strComparableCheckBuilder65.betweenExclusive("", "");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder72 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean74 = strComparableCheckBuilder72.greaterThan("hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[] comparableCheckBuilderArray76 = new org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[] strComparableCheckBuilderArray77 = (org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[]) comparableCheckBuilderArray76;
        strComparableCheckBuilderArray77[0] = strComparableCheckBuilder36;
        strComparableCheckBuilderArray77[1] = strComparableCheckBuilder54;
        strComparableCheckBuilderArray77[2] = strComparableCheckBuilder65;
        strComparableCheckBuilderArray77[3] = strComparableCheckBuilder72;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderStream86 = org.apache.commons.lang3.stream.Streams.of(strComparableCheckBuilderArray77);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream87 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream86);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream88 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream86);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream89 = org.apache.commons.lang3.stream.Streams.failableStream(strComparableCheckBuilderStream86);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream90 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream86);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream91 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream86);
        java.lang.Object obj92 = null;
        int int93 = objectToStringComparator26.compare((java.lang.Object) strComparableCheckBuilderFailableStream91, obj92);
        java.util.Comparator<java.lang.Object> objComparator94 = objectToStringComparator26.reversed();
        java.util.Comparator<java.lang.Object> objComparator95 = objectToStringComparator7.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator26);
        java.util.function.BinaryOperator<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorBinaryOperator96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator97 = objectToStringComparatorFailableStream1.reduce(objectToStringComparator7, objectToStringComparatorBinaryOperator96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectToStringComparatorStream2);
        org.junit.Assert.assertNull(objectToStringComparatorStream3);
        org.junit.Assert.assertNull(objectToStringComparatorStream4);
        org.junit.Assert.assertNull(objectToStringComparatorStream5);
        org.junit.Assert.assertNull(objectToStringComparatorStream6);
        org.junit.Assert.assertNotNull(objectToStringComparator7);
        org.junit.Assert.assertNotNull(objComparator8);
        org.junit.Assert.assertNotNull(objComparator9);
        org.junit.Assert.assertNotNull(objectToStringComparator10);
        org.junit.Assert.assertNotNull(objComparator11);
        org.junit.Assert.assertNotNull(objComparator12);
        org.junit.Assert.assertNotNull(objComparator14);
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-16) + "'", int18 == (-16));
        org.junit.Assert.assertNotNull(strComparableCheckBuilder20);
        org.junit.Assert.assertNotNull(strPredicate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-7) + "'", int23 == (-7));
        org.junit.Assert.assertNotNull(objComparator24);
        org.junit.Assert.assertNotNull(objComparator27);
        org.junit.Assert.assertNotNull(strPredicate29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objComparator32);
        org.junit.Assert.assertNotNull(objComparator33);
        org.junit.Assert.assertNotNull(objComparator34);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(comparableCheckBuilderArray76);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderArray77);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderStream86);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream87);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream88);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream89);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream90);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(objComparator94);
        org.junit.Assert.assertNotNull(objComparator95);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean14 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.between("", "hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder19 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean21 = strComparableCheckBuilder19.greaterThan("hi!");
        boolean boolean24 = strComparableCheckBuilder19.betweenExclusive("", "");
        boolean boolean26 = strComparableCheckBuilder19.equalTo("hi!");
        boolean boolean28 = strComparableCheckBuilder19.lessThan("");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder30 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean32 = strComparableCheckBuilder30.greaterThan("hi!");
        boolean boolean35 = strComparableCheckBuilder30.betweenExclusive("", "");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder37 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean39 = strComparableCheckBuilder37.greaterThan("hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[] comparableCheckBuilderArray41 = new org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[] strComparableCheckBuilderArray42 = (org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[]) comparableCheckBuilderArray41;
        strComparableCheckBuilderArray42[0] = strComparableCheckBuilder1;
        strComparableCheckBuilderArray42[1] = strComparableCheckBuilder19;
        strComparableCheckBuilderArray42[2] = strComparableCheckBuilder30;
        strComparableCheckBuilderArray42[3] = strComparableCheckBuilder37;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderStream51 = org.apache.commons.lang3.stream.Streams.of(strComparableCheckBuilderArray42);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream52 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream53 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream54 = org.apache.commons.lang3.stream.Streams.failableStream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream55 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream56 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream57 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream58 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream59 = org.apache.commons.lang3.stream.Streams.failableStream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream60 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream61 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream51);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(comparableCheckBuilderArray41);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderArray42);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderStream51);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream52);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream53);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream54);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream55);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream56);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream57);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream58);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream59);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream60);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream61);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.stream.Collector.Characteristics[] characteristicsArray0 = new java.util.stream.Collector.Characteristics[] {};
        java.util.ArrayList<java.util.stream.Collector.Characteristics> characteristicsList1 = new java.util.ArrayList<java.util.stream.Collector.Characteristics>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1, characteristicsArray0);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream3 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream4 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream5 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream6 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream7 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream8 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream9 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream10 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.junit.Assert.assertNotNull(characteristicsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(characteristicsFailableStream3);
        org.junit.Assert.assertNotNull(characteristicsFailableStream4);
        org.junit.Assert.assertNotNull(characteristicsFailableStream5);
        org.junit.Assert.assertNotNull(characteristicsStream6);
        org.junit.Assert.assertNotNull(characteristicsFailableStream7);
        org.junit.Assert.assertNotNull(characteristicsStream8);
        org.junit.Assert.assertNotNull(characteristicsStream9);
        org.junit.Assert.assertNotNull(characteristicsStream10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean14 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        boolean boolean16 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        boolean boolean18 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean21 = strComparableCheckBuilder1.between("hi!", "");
        boolean boolean23 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean25 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean27 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean14 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean17 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean19 = strComparableCheckBuilder1.lessThanOrEqualTo("hi!");
        boolean boolean21 = strComparableCheckBuilder1.equalTo("");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.equalTo("");
        boolean boolean14 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean16 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean18 = strComparableCheckBuilder1.lessThanOrEqualTo("hi!");
        boolean boolean20 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean23 = strComparableCheckBuilder1.between("", "hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream0);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream2 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream3 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream4 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream5 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream6 = objectToStringComparatorFailableStream1.stream();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator7 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator8 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator9 = objectToStringComparator8.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate11 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Object obj12 = null;
        int int13 = objectToStringComparator8.compare((java.lang.Object) "hi!", obj12);
        java.util.Comparator<java.lang.Object> objComparator14 = objectToStringComparator7.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator8);
        java.util.function.BinaryOperator<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorBinaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator16 = objectToStringComparatorFailableStream1.reduce(objectToStringComparator8, objectToStringComparatorBinaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectToStringComparatorStream2);
        org.junit.Assert.assertNull(objectToStringComparatorStream3);
        org.junit.Assert.assertNull(objectToStringComparatorStream4);
        org.junit.Assert.assertNull(objectToStringComparatorStream5);
        org.junit.Assert.assertNull(objectToStringComparatorStream6);
        org.junit.Assert.assertNotNull(objComparator9);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objComparator14);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator1 = objectToStringComparator0.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate3 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams4 = new org.apache.commons.lang3.stream.Streams();
        int int5 = objectToStringComparator0.compare((java.lang.Object) strPredicate3, (java.lang.Object) streams4);
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder7 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = org.apache.commons.lang3.compare.ComparableUtils.gt("hi!");
        int int10 = objectToStringComparator0.compare((java.lang.Object) "hi!", (java.lang.Object) strPredicate9);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator11 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator12 = objectToStringComparator11.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate14 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams15 = new org.apache.commons.lang3.stream.Streams();
        int int16 = objectToStringComparator11.compare((java.lang.Object) strPredicate14, (java.lang.Object) streams15);
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder18 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate20 = org.apache.commons.lang3.compare.ComparableUtils.gt("hi!");
        int int21 = objectToStringComparator11.compare((java.lang.Object) "hi!", (java.lang.Object) strPredicate20);
        java.util.Comparator<java.lang.Object> objComparator22 = objectToStringComparator11.reversed();
        java.util.Comparator<java.lang.Object> objComparator23 = objectToStringComparator0.thenComparing(objComparator22);
        java.lang.Class<?> wildcardClass24 = objComparator23.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector25 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = objArrayCollector25.getClass();
        java.lang.ClassLoader classLoader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.Object> objEventListenerSupport28 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass26, classLoader27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: classLoader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objComparator1);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-16) + "'", int5 == (-16));
        org.junit.Assert.assertNotNull(strComparableCheckBuilder7);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-7) + "'", int10 == (-7));
        org.junit.Assert.assertNotNull(objComparator12);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-16) + "'", int16 == (-16));
        org.junit.Assert.assertNotNull(strComparableCheckBuilder18);
        org.junit.Assert.assertNotNull(strPredicate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(objComparator22);
        org.junit.Assert.assertNotNull(objComparator23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean10 = strComparableCheckBuilder1.greaterThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean14 = strComparableCheckBuilder1.greaterThanOrEqualTo("hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean14 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.between("", "hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder19 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean21 = strComparableCheckBuilder19.greaterThan("hi!");
        boolean boolean24 = strComparableCheckBuilder19.betweenExclusive("", "");
        boolean boolean26 = strComparableCheckBuilder19.equalTo("hi!");
        boolean boolean28 = strComparableCheckBuilder19.lessThan("");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder30 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean32 = strComparableCheckBuilder30.greaterThan("hi!");
        boolean boolean35 = strComparableCheckBuilder30.betweenExclusive("", "");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder37 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean39 = strComparableCheckBuilder37.greaterThan("hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[] comparableCheckBuilderArray41 = new org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[] strComparableCheckBuilderArray42 = (org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[]) comparableCheckBuilderArray41;
        strComparableCheckBuilderArray42[0] = strComparableCheckBuilder1;
        strComparableCheckBuilderArray42[1] = strComparableCheckBuilder19;
        strComparableCheckBuilderArray42[2] = strComparableCheckBuilder30;
        strComparableCheckBuilderArray42[3] = strComparableCheckBuilder37;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderStream51 = org.apache.commons.lang3.stream.Streams.of(strComparableCheckBuilderArray42);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream52 = org.apache.commons.lang3.stream.Streams.failableStream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream53 = org.apache.commons.lang3.stream.Streams.failableStream(strComparableCheckBuilderStream51);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream54 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream51);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(comparableCheckBuilderArray41);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderArray42);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderStream51);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream52);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream53);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream54);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        java.util.Comparator<java.lang.Object> objComparator1 = objectToStringComparator0.reversed();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder3 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean5 = strComparableCheckBuilder3.greaterThan("hi!");
        boolean boolean8 = strComparableCheckBuilder3.between("hi!", "");
        boolean boolean10 = strComparableCheckBuilder3.lessThanOrEqualTo("hi!");
        int int12 = objectToStringComparator0.compare((java.lang.Object) strComparableCheckBuilder3, (java.lang.Object) 4);
        java.util.function.Predicate<java.lang.String> strPredicate14 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass15 = strPredicate14.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector16 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass15);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier17 = objArrayCollector16.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator18 = objArrayCollector16.combiner();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction19 = objArrayCollector16.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator20 = objArrayCollector16.combiner();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder22 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean24 = strComparableCheckBuilder22.greaterThan("hi!");
        boolean boolean27 = strComparableCheckBuilder22.betweenExclusive("", "");
        boolean boolean29 = strComparableCheckBuilder22.equalTo("hi!");
        boolean boolean31 = strComparableCheckBuilder22.lessThan("");
        boolean boolean33 = strComparableCheckBuilder22.equalTo("");
        boolean boolean35 = strComparableCheckBuilder22.lessThan("hi!");
        boolean boolean37 = strComparableCheckBuilder22.greaterThan("hi!");
        int int38 = objectToStringComparator0.compare((java.lang.Object) objArrayCollector16, (java.lang.Object) "hi!");
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction39 = objArrayCollector16.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator40 = objArrayCollector16.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet41 = objArrayCollector16.characteristics();
        org.junit.Assert.assertNotNull(objectToStringComparator0);
        org.junit.Assert.assertNotNull(objComparator1);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objListSupplier17);
        org.junit.Assert.assertNotNull(objListBinaryOperator18);
        org.junit.Assert.assertNotNull(objListFunction19);
        org.junit.Assert.assertNotNull(objListBinaryOperator20);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 7 + "'", int38 == 7);
        org.junit.Assert.assertNotNull(objListFunction39);
        org.junit.Assert.assertNotNull(objListBinaryOperator40);
        org.junit.Assert.assertNotNull(characteristicsSet41);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.lang.Class<java.util.Comparator<java.lang.Object>> objComparatorClass0 = null;
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.util.Comparator<java.lang.Object>> objComparatorEventListenerSupport2 = new org.apache.commons.lang3.event.EventListenerSupport<java.util.Comparator<java.lang.Object>>(objComparatorClass0, classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: listenerInterface");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.lang.Class<java.lang.Object> objClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector1 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>(objClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: elementType");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator5 = objArrayCollector3.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer6 = objArrayCollector3.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer7 = objArrayCollector3.accumulator();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListBinaryOperator5);
        org.junit.Assert.assertNotNull(objListBiConsumer6);
        org.junit.Assert.assertNotNull(objListBiConsumer7);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.stream.Stream<java.lang.String[]> strArrayStream1 = org.apache.commons.lang3.stream.Streams.of(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArrayStream1);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer7 = objArrayCollector3.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = objArrayCollector3.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer10 = objArrayCollector3.accumulator();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(objListBiConsumer7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(objListBiConsumer10);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = objArrayCollector3.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier9 = objArrayCollector3.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator10 = objArrayCollector3.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer11 = objArrayCollector3.accumulator();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(objListSupplier9);
        org.junit.Assert.assertNotNull(objListBinaryOperator10);
        org.junit.Assert.assertNotNull(objListBiConsumer11);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator1 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator2 = objectToStringComparator1.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate4 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Object obj5 = null;
        int int6 = objectToStringComparator1.compare((java.lang.Object) "hi!", obj5);
        java.util.Comparator<java.lang.Object> objComparator7 = objectToStringComparator0.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator1);
        java.util.function.Predicate<java.lang.String> strPredicate9 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass10 = strPredicate9.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector11 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass10);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier12 = objArrayCollector11.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction13 = objArrayCollector11.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet14 = objArrayCollector11.characteristics();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction15 = objArrayCollector11.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator16 = objArrayCollector11.combiner();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier17 = objArrayCollector11.supplier();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier18 = objArrayCollector11.supplier();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder20 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean22 = strComparableCheckBuilder20.greaterThan("hi!");
        boolean boolean25 = strComparableCheckBuilder20.betweenExclusive("", "");
        boolean boolean27 = strComparableCheckBuilder20.equalTo("hi!");
        boolean boolean29 = strComparableCheckBuilder20.lessThan("");
        boolean boolean31 = strComparableCheckBuilder20.lessThan("");
        boolean boolean33 = strComparableCheckBuilder20.lessThanOrEqualTo("");
        boolean boolean36 = strComparableCheckBuilder20.between("", "hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder38 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean40 = strComparableCheckBuilder38.greaterThan("hi!");
        boolean boolean43 = strComparableCheckBuilder38.betweenExclusive("", "");
        boolean boolean45 = strComparableCheckBuilder38.equalTo("hi!");
        boolean boolean47 = strComparableCheckBuilder38.lessThan("");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder49 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean51 = strComparableCheckBuilder49.greaterThan("hi!");
        boolean boolean54 = strComparableCheckBuilder49.betweenExclusive("", "");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder56 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean58 = strComparableCheckBuilder56.greaterThan("hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[] comparableCheckBuilderArray60 = new org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[] strComparableCheckBuilderArray61 = (org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[]) comparableCheckBuilderArray60;
        strComparableCheckBuilderArray61[0] = strComparableCheckBuilder20;
        strComparableCheckBuilderArray61[1] = strComparableCheckBuilder38;
        strComparableCheckBuilderArray61[2] = strComparableCheckBuilder49;
        strComparableCheckBuilderArray61[3] = strComparableCheckBuilder56;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderStream70 = org.apache.commons.lang3.stream.Streams.of(strComparableCheckBuilderArray61);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream71 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream70);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream72 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream70);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream73 = org.apache.commons.lang3.stream.Streams.failableStream(strComparableCheckBuilderStream70);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream74 = org.apache.commons.lang3.stream.Streams.failableStream(strComparableCheckBuilderStream70);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream75 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream70);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream76 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream70);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream77 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream70);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream78 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream70);
        int int79 = objectToStringComparator0.compare((java.lang.Object) objArrayCollector11, (java.lang.Object) strComparableCheckBuilderStream70);
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer80 = objArrayCollector11.accumulator();
        org.junit.Assert.assertNotNull(objComparator2);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objComparator7);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objListSupplier12);
        org.junit.Assert.assertNotNull(objListFunction13);
        org.junit.Assert.assertNotNull(characteristicsSet14);
        org.junit.Assert.assertNotNull(objListFunction15);
        org.junit.Assert.assertNotNull(objListBinaryOperator16);
        org.junit.Assert.assertNotNull(objListSupplier17);
        org.junit.Assert.assertNotNull(objListSupplier18);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(comparableCheckBuilderArray60);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderArray61);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderStream70);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream71);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream72);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream73);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream74);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream75);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream76);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream77);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 5 + "'", int79 == 5);
        org.junit.Assert.assertNotNull(objListBiConsumer80);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction4 = objArrayCollector3.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator5 = objArrayCollector3.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator6 = objArrayCollector3.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator7 = objArrayCollector3.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer8 = objArrayCollector3.accumulator();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListFunction4);
        org.junit.Assert.assertNotNull(objListBinaryOperator5);
        org.junit.Assert.assertNotNull(objListBinaryOperator6);
        org.junit.Assert.assertNotNull(objListBinaryOperator7);
        org.junit.Assert.assertNotNull(objListBiConsumer8);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean14 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean16 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean18 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        boolean boolean20 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction7 = objArrayCollector3.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator8 = objArrayCollector3.combiner();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier9 = objArrayCollector3.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator10 = objArrayCollector3.combiner();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(objListFunction7);
        org.junit.Assert.assertNotNull(objListBinaryOperator8);
        org.junit.Assert.assertNotNull(objListSupplier9);
        org.junit.Assert.assertNotNull(objListBinaryOperator10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = objArrayCollector3.characteristics();
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream8 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet7);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream9 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet7);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream10 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet7);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet7);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream12 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet7);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(characteristicsStream8);
        org.junit.Assert.assertNotNull(characteristicsStream9);
        org.junit.Assert.assertNotNull(characteristicsFailableStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
        org.junit.Assert.assertNotNull(characteristicsStream12);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        java.util.Comparator<java.lang.Object> objComparator1 = objectToStringComparator0.reversed();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder3 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean5 = strComparableCheckBuilder3.greaterThan("hi!");
        boolean boolean8 = strComparableCheckBuilder3.between("hi!", "");
        boolean boolean10 = strComparableCheckBuilder3.lessThanOrEqualTo("hi!");
        int int12 = objectToStringComparator0.compare((java.lang.Object) strComparableCheckBuilder3, (java.lang.Object) 4);
        java.util.function.Predicate<java.lang.String> strPredicate14 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass15 = strPredicate14.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector16 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass15);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier17 = objArrayCollector16.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator18 = objArrayCollector16.combiner();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction19 = objArrayCollector16.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator20 = objArrayCollector16.combiner();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder22 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean24 = strComparableCheckBuilder22.greaterThan("hi!");
        boolean boolean27 = strComparableCheckBuilder22.betweenExclusive("", "");
        boolean boolean29 = strComparableCheckBuilder22.equalTo("hi!");
        boolean boolean31 = strComparableCheckBuilder22.lessThan("");
        boolean boolean33 = strComparableCheckBuilder22.equalTo("");
        boolean boolean35 = strComparableCheckBuilder22.lessThan("hi!");
        boolean boolean37 = strComparableCheckBuilder22.greaterThan("hi!");
        int int38 = objectToStringComparator0.compare((java.lang.Object) objArrayCollector16, (java.lang.Object) "hi!");
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator39 = objArrayCollector16.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet40 = objArrayCollector16.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier41 = objArrayCollector16.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction42 = objArrayCollector16.finisher();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier43 = objArrayCollector16.supplier();
        org.junit.Assert.assertNotNull(objectToStringComparator0);
        org.junit.Assert.assertNotNull(objComparator1);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objListSupplier17);
        org.junit.Assert.assertNotNull(objListBinaryOperator18);
        org.junit.Assert.assertNotNull(objListFunction19);
        org.junit.Assert.assertNotNull(objListBinaryOperator20);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 7 + "'", int38 == 7);
        org.junit.Assert.assertNotNull(objListBinaryOperator39);
        org.junit.Assert.assertNotNull(characteristicsSet40);
        org.junit.Assert.assertNotNull(objListSupplier41);
        org.junit.Assert.assertNotNull(objListFunction42);
        org.junit.Assert.assertNotNull(objListSupplier43);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = objArrayCollector3.characteristics();
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream9 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream10 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream12 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream13 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream14 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream15 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(characteristicsStream9);
        org.junit.Assert.assertNotNull(characteristicsFailableStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
        org.junit.Assert.assertNotNull(characteristicsStream12);
        org.junit.Assert.assertNotNull(characteristicsFailableStream13);
        org.junit.Assert.assertNotNull(characteristicsFailableStream14);
        org.junit.Assert.assertNotNull(characteristicsStream15);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream7 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream8 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsFailableStream7);
        org.junit.Assert.assertNotNull(characteristicsStream8);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean5 = strComparableCheckBuilder1.greaterThanOrEqualTo("hi!");
        boolean boolean7 = strComparableCheckBuilder1.greaterThan("");
        boolean boolean10 = strComparableCheckBuilder1.betweenExclusive("", "hi!");
        boolean boolean13 = strComparableCheckBuilder1.between("", "hi!");
        boolean boolean15 = strComparableCheckBuilder1.lessThanOrEqualTo("hi!");
        boolean boolean17 = strComparableCheckBuilder1.lessThan("hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.stream.IntStream intStream1 = org.apache.commons.lang3.stream.IntStreams.rangeClosed(5);
        java.util.stream.IntStream intStream3 = org.apache.commons.lang3.stream.IntStreams.rangeClosed(0);
        java.util.stream.IntStream intStream5 = org.apache.commons.lang3.stream.IntStreams.rangeClosed(5);
        java.util.stream.IntStream intStream7 = org.apache.commons.lang3.stream.IntStreams.range(62);
        java.util.stream.IntStream intStream9 = org.apache.commons.lang3.stream.IntStreams.range(1);
        java.util.stream.BaseStream[] baseStreamArray11 = new java.util.stream.BaseStream[5];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>[] intBaseStreamArray12 = (java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>[]) baseStreamArray11;
        intBaseStreamArray12[0] = intStream1;
        intBaseStreamArray12[1] = intStream3;
        intBaseStreamArray12[2] = intStream5;
        intBaseStreamArray12[3] = intStream7;
        intBaseStreamArray12[4] = intStream9;
        java.util.stream.Stream<java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>> intBaseStreamStream23 = org.apache.commons.lang3.stream.Streams.of(intBaseStreamArray12);
        java.util.stream.Stream<java.lang.AutoCloseable> autoCloseableStream24 = org.apache.commons.lang3.stream.Streams.of((java.lang.AutoCloseable[]) intBaseStreamArray12);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(baseStreamArray11);
        org.junit.Assert.assertNotNull(intBaseStreamArray12);
        org.junit.Assert.assertNotNull(intBaseStreamStream23);
        org.junit.Assert.assertNotNull(autoCloseableStream24);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer6 = objArrayCollector3.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = objArrayCollector3.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer8 = objArrayCollector3.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet10 = objArrayCollector3.characteristics();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder12 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean14 = strComparableCheckBuilder12.greaterThan("hi!");
        boolean boolean17 = strComparableCheckBuilder12.between("hi!", "");
        boolean boolean19 = strComparableCheckBuilder12.lessThanOrEqualTo("hi!");
        boolean boolean22 = strComparableCheckBuilder12.between("hi!", "");
        java.lang.Class<?> wildcardClass23 = strComparableCheckBuilder12.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector24 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass23);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier25 = objArrayCollector24.supplier();
        java.util.stream.Collector[] collectorArray27 = new java.util.stream.Collector[2];
        @SuppressWarnings("unchecked")
        java.util.stream.Collector<java.lang.Object, java.util.List<java.lang.Object>, java.lang.Object[]>[] objCollectorArray28 = (java.util.stream.Collector<java.lang.Object, java.util.List<java.lang.Object>, java.lang.Object[]>[]) collectorArray27;
        objCollectorArray28[0] = objArrayCollector3;
        objCollectorArray28[1] = objArrayCollector24;
        java.util.stream.Stream<java.util.stream.Collector<java.lang.Object, java.util.List<java.lang.Object>, java.lang.Object[]>> objCollectorStream33 = org.apache.commons.lang3.stream.Streams.of(objCollectorArray28);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector<java.lang.Object, java.util.List<java.lang.Object>, java.lang.Object[]>> objCollectorFailableStream34 = new org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector<java.lang.Object, java.util.List<java.lang.Object>, java.lang.Object[]>>(objCollectorStream33);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(objListBiConsumer6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(objListBiConsumer8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(characteristicsSet10);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(objListSupplier25);
        org.junit.Assert.assertNotNull(collectorArray27);
        org.junit.Assert.assertNotNull(objCollectorArray28);
        org.junit.Assert.assertNotNull(objCollectorStream33);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator5 = objArrayCollector3.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream7 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream8 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream9 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream10 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream12 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListBinaryOperator5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsFailableStream7);
        org.junit.Assert.assertNotNull(characteristicsFailableStream8);
        org.junit.Assert.assertNotNull(characteristicsStream9);
        org.junit.Assert.assertNotNull(characteristicsFailableStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
        org.junit.Assert.assertNotNull(characteristicsFailableStream12);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator6 = objArrayCollector3.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator7 = objArrayCollector3.combiner();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier8 = objArrayCollector3.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = objArrayCollector3.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer10 = objArrayCollector3.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier11 = objArrayCollector3.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet12 = objArrayCollector3.characteristics();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(objListBinaryOperator6);
        org.junit.Assert.assertNotNull(objListBinaryOperator7);
        org.junit.Assert.assertNotNull(objListSupplier8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(objListBiConsumer10);
        org.junit.Assert.assertNotNull(objListSupplier11);
        org.junit.Assert.assertNotNull(characteristicsSet12);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean14 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.between("hi!", "hi!");
        boolean boolean20 = strComparableCheckBuilder1.betweenExclusive("hi!", "hi!");
        boolean boolean22 = strComparableCheckBuilder1.lessThanOrEqualTo("hi!");
        boolean boolean24 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean26 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean28 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean30 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean33 = strComparableCheckBuilder1.betweenExclusive("", "hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator1 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator2 = objectToStringComparator1.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate4 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams5 = new org.apache.commons.lang3.stream.Streams();
        int int6 = objectToStringComparator1.compare((java.lang.Object) strPredicate4, (java.lang.Object) streams5);
        java.util.Comparator<java.lang.Object> objComparator7 = objectToStringComparator0.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator1);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator8 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        int int11 = objectToStringComparator8.compare((java.lang.Object) 100L, (java.lang.Object) (short) 10);
        java.util.function.Predicate<java.lang.String> strPredicate13 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass14 = strPredicate13.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector15 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass14);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier16 = objArrayCollector15.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction17 = objArrayCollector15.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer18 = objArrayCollector15.accumulator();
        int int19 = objectToStringComparator0.compare((java.lang.Object) (short) 10, (java.lang.Object) objListBiConsumer18);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator20 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator21 = objectToStringComparator20.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate23 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams24 = new org.apache.commons.lang3.stream.Streams();
        int int25 = objectToStringComparator20.compare((java.lang.Object) strPredicate23, (java.lang.Object) streams24);
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder27 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate29 = org.apache.commons.lang3.compare.ComparableUtils.gt("hi!");
        int int30 = objectToStringComparator20.compare((java.lang.Object) "hi!", (java.lang.Object) strPredicate29);
        java.util.Comparator<java.lang.Object> objComparator31 = objectToStringComparator20.reversed();
        java.util.Comparator<java.lang.Object> objComparator32 = objectToStringComparator20.reversed();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder34 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean36 = strComparableCheckBuilder34.greaterThanOrEqualTo("");
        int int37 = objectToStringComparator0.compare((java.lang.Object) objComparator32, (java.lang.Object) boolean36);
        java.util.function.Predicate<java.lang.String> strPredicate39 = org.apache.commons.lang3.compare.ComparableUtils.gt("");
        java.util.function.Predicate<java.lang.String> strPredicate41 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass42 = strPredicate41.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector43 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass42);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier44 = objArrayCollector43.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction45 = objArrayCollector43.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer46 = objArrayCollector43.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet47 = objArrayCollector43.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier48 = objArrayCollector43.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator49 = objArrayCollector43.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet50 = objArrayCollector43.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator51 = objArrayCollector43.combiner();
        int int52 = objectToStringComparator0.compare((java.lang.Object) strPredicate39, (java.lang.Object) objArrayCollector43);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet53 = objArrayCollector43.characteristics();
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream54 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet53);
        java.lang.Class<?> wildcardClass55 = characteristicsSet53.getClass();
        org.junit.Assert.assertNotNull(objComparator2);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16) + "'", int6 == (-16));
        org.junit.Assert.assertNotNull(objComparator7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objListSupplier16);
        org.junit.Assert.assertNotNull(objListFunction17);
        org.junit.Assert.assertNotNull(objListBiConsumer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-62) + "'", int19 == (-62));
        org.junit.Assert.assertNotNull(objComparator21);
        org.junit.Assert.assertNotNull(strPredicate23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-16) + "'", int25 == (-16));
        org.junit.Assert.assertNotNull(strComparableCheckBuilder27);
        org.junit.Assert.assertNotNull(strPredicate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertNotNull(objComparator31);
        org.junit.Assert.assertNotNull(objComparator32);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-10) + "'", int37 == (-10));
        org.junit.Assert.assertNotNull(strPredicate39);
        org.junit.Assert.assertNotNull(strPredicate41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(objListSupplier44);
        org.junit.Assert.assertNotNull(objListFunction45);
        org.junit.Assert.assertNotNull(objListBiConsumer46);
        org.junit.Assert.assertNotNull(characteristicsSet47);
        org.junit.Assert.assertNotNull(objListSupplier48);
        org.junit.Assert.assertNotNull(objListBinaryOperator49);
        org.junit.Assert.assertNotNull(characteristicsSet50);
        org.junit.Assert.assertNotNull(objListBinaryOperator51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-16) + "'", int52 == (-16));
        org.junit.Assert.assertNotNull(characteristicsSet53);
        org.junit.Assert.assertNotNull(characteristicsFailableStream54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream0);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream2 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream3 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream4 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream5 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream6 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream7 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream8 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream9 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream10 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream11 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream12 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream13 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream14 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream15 = objectToStringComparatorFailableStream1.stream();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator16 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator17 = objectToStringComparator16.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate19 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams20 = new org.apache.commons.lang3.stream.Streams();
        int int21 = objectToStringComparator16.compare((java.lang.Object) strPredicate19, (java.lang.Object) streams20);
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder23 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate25 = org.apache.commons.lang3.compare.ComparableUtils.gt("hi!");
        int int26 = objectToStringComparator16.compare((java.lang.Object) "hi!", (java.lang.Object) strPredicate25);
        java.util.Comparator<java.lang.Object> objComparator27 = objectToStringComparator16.reversed();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator28 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator29 = objectToStringComparator28.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate31 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams32 = new org.apache.commons.lang3.stream.Streams();
        int int33 = objectToStringComparator28.compare((java.lang.Object) strPredicate31, (java.lang.Object) streams32);
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder35 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate37 = org.apache.commons.lang3.compare.ComparableUtils.gt("hi!");
        int int38 = objectToStringComparator28.compare((java.lang.Object) "hi!", (java.lang.Object) strPredicate37);
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder40 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean42 = strComparableCheckBuilder40.greaterThan("hi!");
        boolean boolean45 = strComparableCheckBuilder40.betweenExclusive("", "");
        boolean boolean47 = strComparableCheckBuilder40.equalTo("hi!");
        boolean boolean49 = strComparableCheckBuilder40.lessThan("");
        boolean boolean51 = strComparableCheckBuilder40.lessThan("");
        boolean boolean53 = strComparableCheckBuilder40.greaterThanOrEqualTo("");
        boolean boolean55 = strComparableCheckBuilder40.greaterThanOrEqualTo("");
        boolean boolean57 = strComparableCheckBuilder40.lessThanOrEqualTo("");
        boolean boolean60 = strComparableCheckBuilder40.between("hi!", "");
        int int61 = objectToStringComparator16.compare((java.lang.Object) strPredicate37, (java.lang.Object) "hi!");
        java.util.function.BinaryOperator<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorBinaryOperator62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator63 = objectToStringComparatorFailableStream1.reduce(objectToStringComparator16, objectToStringComparatorBinaryOperator62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectToStringComparatorStream2);
        org.junit.Assert.assertNull(objectToStringComparatorStream3);
        org.junit.Assert.assertNull(objectToStringComparatorStream4);
        org.junit.Assert.assertNull(objectToStringComparatorStream5);
        org.junit.Assert.assertNull(objectToStringComparatorStream6);
        org.junit.Assert.assertNull(objectToStringComparatorStream7);
        org.junit.Assert.assertNull(objectToStringComparatorStream8);
        org.junit.Assert.assertNull(objectToStringComparatorStream9);
        org.junit.Assert.assertNull(objectToStringComparatorStream10);
        org.junit.Assert.assertNull(objectToStringComparatorStream11);
        org.junit.Assert.assertNull(objectToStringComparatorStream12);
        org.junit.Assert.assertNull(objectToStringComparatorStream13);
        org.junit.Assert.assertNull(objectToStringComparatorStream14);
        org.junit.Assert.assertNull(objectToStringComparatorStream15);
        org.junit.Assert.assertNotNull(objComparator17);
        org.junit.Assert.assertNotNull(strPredicate19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-16) + "'", int21 == (-16));
        org.junit.Assert.assertNotNull(strComparableCheckBuilder23);
        org.junit.Assert.assertNotNull(strPredicate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-7) + "'", int26 == (-7));
        org.junit.Assert.assertNotNull(objComparator27);
        org.junit.Assert.assertNotNull(objComparator29);
        org.junit.Assert.assertNotNull(strPredicate31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-16) + "'", int33 == (-16));
        org.junit.Assert.assertNotNull(strComparableCheckBuilder35);
        org.junit.Assert.assertNotNull(strPredicate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-7) + "'", int38 == (-7));
        org.junit.Assert.assertNotNull(strComparableCheckBuilder40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 7 + "'", int61 == 7);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream7 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        java.lang.Class<?> wildcardClass8 = characteristicsFailableStream7.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector9 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass8);
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction10 = objArrayCollector9.finisher();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsFailableStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objListFunction10);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.stream.Collector.Characteristics[] characteristicsArray0 = new java.util.stream.Collector.Characteristics[] {};
        java.util.ArrayList<java.util.stream.Collector.Characteristics> characteristicsList1 = new java.util.ArrayList<java.util.stream.Collector.Characteristics>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1, characteristicsArray0);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream3 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream4 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream5 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream6 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream7 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.junit.Assert.assertNotNull(characteristicsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(characteristicsFailableStream3);
        org.junit.Assert.assertNotNull(characteristicsStream4);
        org.junit.Assert.assertNotNull(characteristicsFailableStream5);
        org.junit.Assert.assertNotNull(characteristicsFailableStream6);
        org.junit.Assert.assertNotNull(characteristicsStream7);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean14 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.between("hi!", "");
        boolean boolean20 = strComparableCheckBuilder1.betweenExclusive("", "hi!");
        boolean boolean22 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean25 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean27 = strComparableCheckBuilder1.greaterThan("");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream0);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream2 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream3 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream4 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream5 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream6 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream7 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream8 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream9 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream10 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream11 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream12 = objectToStringComparatorFailableStream1.stream();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator13 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        java.util.Comparator<java.lang.Object> objComparator14 = objectToStringComparator13.reversed();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder16 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean18 = strComparableCheckBuilder16.greaterThan("hi!");
        boolean boolean21 = strComparableCheckBuilder16.between("hi!", "");
        boolean boolean23 = strComparableCheckBuilder16.lessThanOrEqualTo("hi!");
        int int25 = objectToStringComparator13.compare((java.lang.Object) strComparableCheckBuilder16, (java.lang.Object) 4);
        java.util.function.Predicate<java.lang.String> strPredicate27 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass28 = strPredicate27.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector29 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass28);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier30 = objArrayCollector29.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator31 = objArrayCollector29.combiner();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction32 = objArrayCollector29.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator33 = objArrayCollector29.combiner();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder35 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean37 = strComparableCheckBuilder35.greaterThan("hi!");
        boolean boolean40 = strComparableCheckBuilder35.betweenExclusive("", "");
        boolean boolean42 = strComparableCheckBuilder35.equalTo("hi!");
        boolean boolean44 = strComparableCheckBuilder35.lessThan("");
        boolean boolean46 = strComparableCheckBuilder35.equalTo("");
        boolean boolean48 = strComparableCheckBuilder35.lessThan("hi!");
        boolean boolean50 = strComparableCheckBuilder35.greaterThan("hi!");
        int int51 = objectToStringComparator13.compare((java.lang.Object) objArrayCollector29, (java.lang.Object) "hi!");
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator52 = objArrayCollector29.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet53 = objArrayCollector29.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier54 = objArrayCollector29.supplier();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier55 = objArrayCollector29.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer56 = objArrayCollector29.accumulator();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction57 = objArrayCollector29.finisher();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray58 = objectToStringComparatorFailableStream1.collect((java.util.stream.Collector<java.lang.Object, java.util.List<java.lang.Object>, java.lang.Object[]>) objArrayCollector29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectToStringComparatorStream2);
        org.junit.Assert.assertNull(objectToStringComparatorStream3);
        org.junit.Assert.assertNull(objectToStringComparatorStream4);
        org.junit.Assert.assertNull(objectToStringComparatorStream5);
        org.junit.Assert.assertNull(objectToStringComparatorStream6);
        org.junit.Assert.assertNull(objectToStringComparatorStream7);
        org.junit.Assert.assertNull(objectToStringComparatorStream8);
        org.junit.Assert.assertNull(objectToStringComparatorStream9);
        org.junit.Assert.assertNull(objectToStringComparatorStream10);
        org.junit.Assert.assertNull(objectToStringComparatorStream11);
        org.junit.Assert.assertNull(objectToStringComparatorStream12);
        org.junit.Assert.assertNotNull(objectToStringComparator13);
        org.junit.Assert.assertNotNull(objComparator14);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 59 + "'", int25 == 59);
        org.junit.Assert.assertNotNull(strPredicate27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objListSupplier30);
        org.junit.Assert.assertNotNull(objListBinaryOperator31);
        org.junit.Assert.assertNotNull(objListFunction32);
        org.junit.Assert.assertNotNull(objListBinaryOperator33);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 7 + "'", int51 == 7);
        org.junit.Assert.assertNotNull(objListBinaryOperator52);
        org.junit.Assert.assertNotNull(characteristicsSet53);
        org.junit.Assert.assertNotNull(objListSupplier54);
        org.junit.Assert.assertNotNull(objListSupplier55);
        org.junit.Assert.assertNotNull(objListBiConsumer56);
        org.junit.Assert.assertNotNull(objListFunction57);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream0);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream2 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream3 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream4 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream5 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream6 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream7 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream8 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream9 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream10 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream11 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream12 = objectToStringComparatorFailableStream1.stream();
        java.util.function.Predicate<java.lang.String> strPredicate14 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass15 = strPredicate14.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector16 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass15);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier17 = objArrayCollector16.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction18 = objArrayCollector16.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer19 = objArrayCollector16.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet20 = objArrayCollector16.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer21 = objArrayCollector16.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet22 = objArrayCollector16.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier23 = objArrayCollector16.supplier();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray24 = objectToStringComparatorFailableStream1.collect((java.util.stream.Collector<java.lang.Object, java.util.List<java.lang.Object>, java.lang.Object[]>) objArrayCollector16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectToStringComparatorStream2);
        org.junit.Assert.assertNull(objectToStringComparatorStream3);
        org.junit.Assert.assertNull(objectToStringComparatorStream4);
        org.junit.Assert.assertNull(objectToStringComparatorStream5);
        org.junit.Assert.assertNull(objectToStringComparatorStream6);
        org.junit.Assert.assertNull(objectToStringComparatorStream7);
        org.junit.Assert.assertNull(objectToStringComparatorStream8);
        org.junit.Assert.assertNull(objectToStringComparatorStream9);
        org.junit.Assert.assertNull(objectToStringComparatorStream10);
        org.junit.Assert.assertNull(objectToStringComparatorStream11);
        org.junit.Assert.assertNull(objectToStringComparatorStream12);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objListSupplier17);
        org.junit.Assert.assertNotNull(objListFunction18);
        org.junit.Assert.assertNotNull(objListBiConsumer19);
        org.junit.Assert.assertNotNull(characteristicsSet20);
        org.junit.Assert.assertNotNull(objListBiConsumer21);
        org.junit.Assert.assertNotNull(characteristicsSet22);
        org.junit.Assert.assertNotNull(objListSupplier23);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.lang.Class<java.lang.CharSequence[]> charSequenceArrayClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.CharSequence[]> charSequenceArrayArrayCollector1 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.CharSequence[]>(charSequenceArrayClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: elementType");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator1 = objectToStringComparator0.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate3 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Object obj4 = null;
        int int5 = objectToStringComparator0.compare((java.lang.Object) "hi!", obj4);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator6 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator7 = objectToStringComparator6.reversed();
        java.util.Comparator<java.lang.Object> objComparator8 = objectToStringComparator0.thenComparing(objComparator7);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator9 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator10 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator11 = objectToStringComparator10.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate13 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Object obj14 = null;
        int int15 = objectToStringComparator10.compare((java.lang.Object) "hi!", obj14);
        java.util.Comparator<java.lang.Object> objComparator16 = objectToStringComparator9.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator10);
        int int18 = objectToStringComparator0.compare((java.lang.Object) objectToStringComparator9, (java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass19 = objectToStringComparator9.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector20 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass19);
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector21 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass19);
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator22 = objArrayCollector21.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer23 = objArrayCollector21.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator24 = objArrayCollector21.combiner();
        org.junit.Assert.assertNotNull(objComparator1);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objComparator7);
        org.junit.Assert.assertNotNull(objComparator8);
        org.junit.Assert.assertNotNull(objComparator11);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objComparator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 62 + "'", int18 == 62);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(objListBinaryOperator22);
        org.junit.Assert.assertNotNull(objListBiConsumer23);
        org.junit.Assert.assertNotNull(objListBinaryOperator24);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream0);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream2 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream3 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream4 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream5 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream6 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream7 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream8 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream9 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream10 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream11 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream10);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream12 = objectToStringComparatorFailableStream11.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream13 = objectToStringComparatorFailableStream11.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream14 = objectToStringComparatorFailableStream11.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream15 = objectToStringComparatorFailableStream11.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream16 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream17 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream16);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream18 = objectToStringComparatorFailableStream17.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream19 = objectToStringComparatorFailableStream17.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream20 = objectToStringComparatorFailableStream17.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream21 = objectToStringComparatorFailableStream17.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream22 = objectToStringComparatorFailableStream17.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream23 = objectToStringComparatorFailableStream17.stream();
        org.apache.commons.lang3.stream.Streams.FailableStream[] failableStreamArray25 = new org.apache.commons.lang3.stream.Streams.FailableStream[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[] objectToStringComparatorFailableStreamArray26 = (org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[]) failableStreamArray25;
        objectToStringComparatorFailableStreamArray26[0] = objectToStringComparatorFailableStream1;
        objectToStringComparatorFailableStreamArray26[1] = objectToStringComparatorFailableStream11;
        objectToStringComparatorFailableStreamArray26[2] = objectToStringComparatorFailableStream17;
        java.util.stream.Stream<org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>> objectToStringComparatorFailableStreamStream33 = org.apache.commons.lang3.stream.Streams.of(objectToStringComparatorFailableStreamArray26);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>> objectToStringComparatorFailableStreamFailableStream34 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>>(objectToStringComparatorFailableStreamStream33);
        org.junit.Assert.assertNull(objectToStringComparatorStream2);
        org.junit.Assert.assertNull(objectToStringComparatorStream3);
        org.junit.Assert.assertNull(objectToStringComparatorStream4);
        org.junit.Assert.assertNull(objectToStringComparatorStream5);
        org.junit.Assert.assertNull(objectToStringComparatorStream6);
        org.junit.Assert.assertNull(objectToStringComparatorStream7);
        org.junit.Assert.assertNull(objectToStringComparatorStream8);
        org.junit.Assert.assertNull(objectToStringComparatorStream9);
        org.junit.Assert.assertNull(objectToStringComparatorStream12);
        org.junit.Assert.assertNull(objectToStringComparatorStream13);
        org.junit.Assert.assertNull(objectToStringComparatorStream14);
        org.junit.Assert.assertNull(objectToStringComparatorStream15);
        org.junit.Assert.assertNull(objectToStringComparatorStream18);
        org.junit.Assert.assertNull(objectToStringComparatorStream19);
        org.junit.Assert.assertNull(objectToStringComparatorStream20);
        org.junit.Assert.assertNull(objectToStringComparatorStream21);
        org.junit.Assert.assertNull(objectToStringComparatorStream22);
        org.junit.Assert.assertNull(objectToStringComparatorStream23);
        org.junit.Assert.assertNotNull(failableStreamArray25);
        org.junit.Assert.assertNotNull(objectToStringComparatorFailableStreamArray26);
        org.junit.Assert.assertNotNull(objectToStringComparatorFailableStreamStream33);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.greaterThan("");
        boolean boolean14 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean17 = strComparableCheckBuilder1.betweenExclusive("", "");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        java.util.Comparator<java.lang.Object> objComparator1 = objectToStringComparator0.reversed();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder3 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean5 = strComparableCheckBuilder3.greaterThan("hi!");
        boolean boolean8 = strComparableCheckBuilder3.between("hi!", "");
        boolean boolean10 = strComparableCheckBuilder3.lessThanOrEqualTo("hi!");
        int int12 = objectToStringComparator0.compare((java.lang.Object) strComparableCheckBuilder3, (java.lang.Object) 4);
        java.util.function.Predicate<java.lang.String> strPredicate14 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass15 = strPredicate14.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector16 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass15);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier17 = objArrayCollector16.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator18 = objArrayCollector16.combiner();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction19 = objArrayCollector16.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator20 = objArrayCollector16.combiner();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder22 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean24 = strComparableCheckBuilder22.greaterThan("hi!");
        boolean boolean27 = strComparableCheckBuilder22.betweenExclusive("", "");
        boolean boolean29 = strComparableCheckBuilder22.equalTo("hi!");
        boolean boolean31 = strComparableCheckBuilder22.lessThan("");
        boolean boolean33 = strComparableCheckBuilder22.equalTo("");
        boolean boolean35 = strComparableCheckBuilder22.lessThan("hi!");
        boolean boolean37 = strComparableCheckBuilder22.greaterThan("hi!");
        int int38 = objectToStringComparator0.compare((java.lang.Object) objArrayCollector16, (java.lang.Object) "hi!");
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator39 = objArrayCollector16.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet40 = objArrayCollector16.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier41 = objArrayCollector16.supplier();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier42 = objArrayCollector16.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer43 = objArrayCollector16.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator44 = objArrayCollector16.combiner();
        org.junit.Assert.assertNotNull(objectToStringComparator0);
        org.junit.Assert.assertNotNull(objComparator1);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objListSupplier17);
        org.junit.Assert.assertNotNull(objListBinaryOperator18);
        org.junit.Assert.assertNotNull(objListFunction19);
        org.junit.Assert.assertNotNull(objListBinaryOperator20);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 7 + "'", int38 == 7);
        org.junit.Assert.assertNotNull(objListBinaryOperator39);
        org.junit.Assert.assertNotNull(characteristicsSet40);
        org.junit.Assert.assertNotNull(objListSupplier41);
        org.junit.Assert.assertNotNull(objListSupplier42);
        org.junit.Assert.assertNotNull(objListBiConsumer43);
        org.junit.Assert.assertNotNull(objListBinaryOperator44);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator1 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator2 = objectToStringComparator1.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate4 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams5 = new org.apache.commons.lang3.stream.Streams();
        int int6 = objectToStringComparator1.compare((java.lang.Object) strPredicate4, (java.lang.Object) streams5);
        java.util.Comparator<java.lang.Object> objComparator7 = objectToStringComparator0.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator1);
        java.util.Comparator<java.lang.Object> objComparator8 = objComparator7.reversed();
        java.util.Comparator<java.lang.Object> objComparator9 = objComparator7.reversed();
        java.util.Comparator<java.lang.Object> objComparator10 = objComparator9.reversed();
        org.junit.Assert.assertNotNull(objComparator2);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16) + "'", int6 == (-16));
        org.junit.Assert.assertNotNull(objComparator7);
        org.junit.Assert.assertNotNull(objComparator8);
        org.junit.Assert.assertNotNull(objComparator9);
        org.junit.Assert.assertNotNull(objComparator10);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator5 = objArrayCollector3.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer7 = objArrayCollector3.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = objArrayCollector3.characteristics();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListBinaryOperator5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(objListBiConsumer7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean14 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.between("hi!", "hi!");
        boolean boolean19 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean21 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        boolean boolean24 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean27 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean29 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean32 = strComparableCheckBuilder1.betweenExclusive("hi!", "hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator1 = objectToStringComparator0.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate3 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams4 = new org.apache.commons.lang3.stream.Streams();
        int int5 = objectToStringComparator0.compare((java.lang.Object) strPredicate3, (java.lang.Object) streams4);
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder7 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = org.apache.commons.lang3.compare.ComparableUtils.gt("hi!");
        int int10 = objectToStringComparator0.compare((java.lang.Object) "hi!", (java.lang.Object) strPredicate9);
        java.util.Comparator<java.lang.Object> objComparator11 = objectToStringComparator0.reversed();
        java.util.Comparator<java.lang.Object> objComparator12 = objectToStringComparator0.reversed();
        java.util.stream.Collector.Characteristics[] characteristicsArray13 = new java.util.stream.Collector.Characteristics[] {};
        java.util.ArrayList<java.util.stream.Collector.Characteristics> characteristicsList14 = new java.util.ArrayList<java.util.stream.Collector.Characteristics>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList14, characteristicsArray13);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream16 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList14);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream17 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList14);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream18 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList14);
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder20 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean22 = strComparableCheckBuilder20.greaterThan("hi!");
        boolean boolean25 = strComparableCheckBuilder20.betweenExclusive("", "");
        boolean boolean27 = strComparableCheckBuilder20.equalTo("hi!");
        boolean boolean29 = strComparableCheckBuilder20.lessThan("");
        boolean boolean31 = strComparableCheckBuilder20.lessThan("hi!");
        boolean boolean33 = strComparableCheckBuilder20.greaterThanOrEqualTo("hi!");
        boolean boolean35 = strComparableCheckBuilder20.greaterThanOrEqualTo("hi!");
        boolean boolean38 = strComparableCheckBuilder20.betweenExclusive("", "");
        int int39 = objectToStringComparator0.compare((java.lang.Object) characteristicsList14, (java.lang.Object) "");
        java.util.stream.Collector.Characteristics[] characteristicsArray40 = new java.util.stream.Collector.Characteristics[] {};
        java.util.ArrayList<java.util.stream.Collector.Characteristics> characteristicsList41 = new java.util.ArrayList<java.util.stream.Collector.Characteristics>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList41, characteristicsArray40);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream43 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList41);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream44 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList41);
        java.util.ArrayList[] arrayListArray46 = new java.util.ArrayList[2];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.util.stream.Collector.Characteristics>[] characteristicsListArray47 = (java.util.ArrayList<java.util.stream.Collector.Characteristics>[]) arrayListArray46;
        characteristicsListArray47[0] = characteristicsList14;
        characteristicsListArray47[1] = characteristicsList41;
        java.util.stream.Stream<java.util.ArrayList<java.util.stream.Collector.Characteristics>> characteristicsListStream52 = org.apache.commons.lang3.stream.Streams.of(characteristicsListArray47);
        java.util.stream.Stream<java.util.ArrayList<java.util.stream.Collector.Characteristics>> characteristicsListStream53 = org.apache.commons.lang3.stream.Streams.of(characteristicsListArray47);
        java.util.stream.Stream<java.util.AbstractList<java.util.stream.Collector.Characteristics>> characteristicsListStream54 = org.apache.commons.lang3.stream.Streams.of((java.util.AbstractList<java.util.stream.Collector.Characteristics>[]) characteristicsListArray47);
        org.junit.Assert.assertNotNull(objComparator1);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-16) + "'", int5 == (-16));
        org.junit.Assert.assertNotNull(strComparableCheckBuilder7);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-7) + "'", int10 == (-7));
        org.junit.Assert.assertNotNull(objComparator11);
        org.junit.Assert.assertNotNull(objComparator12);
        org.junit.Assert.assertNotNull(characteristicsArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(characteristicsFailableStream16);
        org.junit.Assert.assertNotNull(characteristicsFailableStream17);
        org.junit.Assert.assertNotNull(characteristicsStream18);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(characteristicsArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(characteristicsFailableStream43);
        org.junit.Assert.assertNotNull(characteristicsFailableStream44);
        org.junit.Assert.assertNotNull(arrayListArray46);
        org.junit.Assert.assertNotNull(characteristicsListArray47);
        org.junit.Assert.assertNotNull(characteristicsListStream52);
        org.junit.Assert.assertNotNull(characteristicsListStream53);
        org.junit.Assert.assertNotNull(characteristicsListStream54);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        java.util.Comparator<java.lang.Object> objComparator1 = objectToStringComparator0.reversed();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder3 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean5 = strComparableCheckBuilder3.greaterThan("hi!");
        boolean boolean8 = strComparableCheckBuilder3.between("hi!", "");
        boolean boolean10 = strComparableCheckBuilder3.lessThanOrEqualTo("hi!");
        int int12 = objectToStringComparator0.compare((java.lang.Object) strComparableCheckBuilder3, (java.lang.Object) 4);
        java.util.Comparator<java.lang.Object> objComparator13 = objectToStringComparator0.reversed();
        java.util.Comparator<java.lang.Object> objComparator14 = objComparator13.reversed();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator15 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator16 = objectToStringComparator15.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate18 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams19 = new org.apache.commons.lang3.stream.Streams();
        int int20 = objectToStringComparator15.compare((java.lang.Object) strPredicate18, (java.lang.Object) streams19);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator21 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator22 = objectToStringComparator21.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate24 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Object obj25 = null;
        int int26 = objectToStringComparator21.compare((java.lang.Object) "hi!", obj25);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator27 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator28 = objectToStringComparator27.reversed();
        java.util.Comparator<java.lang.Object> objComparator29 = objectToStringComparator21.thenComparing(objComparator28);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator30 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator31 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator32 = objectToStringComparator31.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate34 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Object obj35 = null;
        int int36 = objectToStringComparator31.compare((java.lang.Object) "hi!", obj35);
        java.util.Comparator<java.lang.Object> objComparator37 = objectToStringComparator30.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator31);
        int int39 = objectToStringComparator21.compare((java.lang.Object) objectToStringComparator30, (java.lang.Object) 1L);
        java.util.Comparator<java.lang.Object> objComparator40 = objectToStringComparator15.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator30);
        java.util.Comparator<java.lang.Object> objComparator41 = objectToStringComparator15.reversed();
        java.util.Comparator<java.lang.Object> objComparator42 = objComparator13.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator15);
        org.junit.Assert.assertNotNull(objectToStringComparator0);
        org.junit.Assert.assertNotNull(objComparator1);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(objComparator13);
        org.junit.Assert.assertNotNull(objComparator14);
        org.junit.Assert.assertNotNull(objComparator16);
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-16) + "'", int20 == (-16));
        org.junit.Assert.assertNotNull(objComparator22);
        org.junit.Assert.assertNotNull(strPredicate24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objComparator28);
        org.junit.Assert.assertNotNull(objComparator29);
        org.junit.Assert.assertNotNull(objComparator32);
        org.junit.Assert.assertNotNull(strPredicate34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objComparator37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 62 + "'", int39 == 62);
        org.junit.Assert.assertNotNull(objComparator40);
        org.junit.Assert.assertNotNull(objComparator41);
        org.junit.Assert.assertNotNull(objComparator42);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector4 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector5 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("");
        boolean boolean4 = strComparableCheckBuilder1.between("", "");
        boolean boolean6 = strComparableCheckBuilder1.greaterThan("");
        boolean boolean9 = strComparableCheckBuilder1.betweenExclusive("hi!", "hi!");
        boolean boolean11 = strComparableCheckBuilder1.lessThan("");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.lang.AutoCloseable[] autoCloseableArray0 = new java.lang.AutoCloseable[] {};
        java.util.stream.Stream<java.lang.AutoCloseable> autoCloseableStream1 = org.apache.commons.lang3.stream.Streams.of(autoCloseableArray0);
        org.junit.Assert.assertNotNull(autoCloseableArray0);
        org.junit.Assert.assertNotNull(autoCloseableStream1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator6 = objArrayCollector3.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator7 = objArrayCollector3.combiner();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier8 = objArrayCollector3.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = objArrayCollector3.characteristics();
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream10 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(objListBinaryOperator6);
        org.junit.Assert.assertNotNull(objListBinaryOperator7);
        org.junit.Assert.assertNotNull(objListSupplier8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(characteristicsStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator6 = objArrayCollector3.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator7 = objArrayCollector3.combiner();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier8 = objArrayCollector3.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = objArrayCollector3.characteristics();
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream10 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream12 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(objListBinaryOperator6);
        org.junit.Assert.assertNotNull(objListBinaryOperator7);
        org.junit.Assert.assertNotNull(objListSupplier8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(characteristicsStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
        org.junit.Assert.assertNotNull(characteristicsFailableStream12);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator0 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        java.util.Comparator<java.lang.Object> objComparator1 = objectToStringComparator0.reversed();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder3 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean5 = strComparableCheckBuilder3.greaterThan("hi!");
        boolean boolean8 = strComparableCheckBuilder3.between("hi!", "");
        boolean boolean10 = strComparableCheckBuilder3.lessThanOrEqualTo("hi!");
        int int12 = objectToStringComparator0.compare((java.lang.Object) strComparableCheckBuilder3, (java.lang.Object) 4);
        java.util.function.Predicate<java.lang.String> strPredicate14 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass15 = strPredicate14.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector16 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass15);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier17 = objArrayCollector16.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator18 = objArrayCollector16.combiner();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction19 = objArrayCollector16.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator20 = objArrayCollector16.combiner();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder22 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean24 = strComparableCheckBuilder22.greaterThan("hi!");
        boolean boolean27 = strComparableCheckBuilder22.betweenExclusive("", "");
        boolean boolean29 = strComparableCheckBuilder22.equalTo("hi!");
        boolean boolean31 = strComparableCheckBuilder22.lessThan("");
        boolean boolean33 = strComparableCheckBuilder22.equalTo("");
        boolean boolean35 = strComparableCheckBuilder22.lessThan("hi!");
        boolean boolean37 = strComparableCheckBuilder22.greaterThan("hi!");
        int int38 = objectToStringComparator0.compare((java.lang.Object) objArrayCollector16, (java.lang.Object) "hi!");
        java.util.function.Predicate<java.lang.String> strPredicate40 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass41 = strPredicate40.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector42 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass41);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier43 = objArrayCollector42.supplier();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier44 = objArrayCollector42.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet45 = objArrayCollector42.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator46 = objArrayCollector42.combiner();
        java.util.function.Predicate<java.lang.String> strPredicate48 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass49 = strPredicate48.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector50 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass49);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier51 = objArrayCollector50.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction52 = objArrayCollector50.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer53 = objArrayCollector50.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet54 = objArrayCollector50.characteristics();
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream55 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet54);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream56 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet54);
        int int57 = objectToStringComparator0.compare((java.lang.Object) objListBinaryOperator46, (java.lang.Object) characteristicsStream56);
        org.junit.Assert.assertNotNull(objectToStringComparator0);
        org.junit.Assert.assertNotNull(objComparator1);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objListSupplier17);
        org.junit.Assert.assertNotNull(objListBinaryOperator18);
        org.junit.Assert.assertNotNull(objListFunction19);
        org.junit.Assert.assertNotNull(objListBinaryOperator20);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 7 + "'", int38 == 7);
        org.junit.Assert.assertNotNull(strPredicate40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(objListSupplier43);
        org.junit.Assert.assertNotNull(objListSupplier44);
        org.junit.Assert.assertNotNull(characteristicsSet45);
        org.junit.Assert.assertNotNull(objListBinaryOperator46);
        org.junit.Assert.assertNotNull(strPredicate48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(objListSupplier51);
        org.junit.Assert.assertNotNull(objListFunction52);
        org.junit.Assert.assertNotNull(objListBiConsumer53);
        org.junit.Assert.assertNotNull(characteristicsSet54);
        org.junit.Assert.assertNotNull(characteristicsFailableStream55);
        org.junit.Assert.assertNotNull(characteristicsStream56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray0, charSequenceArray1, charSequenceArray2 };
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray4, charSequenceArray5, charSequenceArray6 };
        java.lang.CharSequence[][][] charSequenceArray8 = new java.lang.CharSequence[][][] { charSequenceArray3, charSequenceArray7 };
        java.util.stream.Stream<java.lang.CharSequence[][]> charSequenceArrayStream9 = org.apache.commons.lang3.stream.Streams.of(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArrayStream9);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean4 = strComparableCheckBuilder1.between("hi!", "");
        boolean boolean6 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.Class<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorEventListenerSupport1 = new org.apache.commons.lang3.event.EventListenerSupport<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: listenerInterface");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream0);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream2 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream3 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream4 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream5 = objectToStringComparatorFailableStream1.stream();
        org.apache.commons.lang3.stream.Streams.FailableStream[] failableStreamArray7 = new org.apache.commons.lang3.stream.Streams.FailableStream[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[] objectToStringComparatorFailableStreamArray8 = (org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[]) failableStreamArray7;
        objectToStringComparatorFailableStreamArray8[0] = objectToStringComparatorFailableStream1;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream11 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream12 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream11);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream13 = objectToStringComparatorFailableStream12.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream14 = objectToStringComparatorFailableStream12.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream15 = objectToStringComparatorFailableStream12.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream16 = objectToStringComparatorFailableStream12.stream();
        org.apache.commons.lang3.stream.Streams.FailableStream[] failableStreamArray18 = new org.apache.commons.lang3.stream.Streams.FailableStream[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[] objectToStringComparatorFailableStreamArray19 = (org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[]) failableStreamArray18;
        objectToStringComparatorFailableStreamArray19[0] = objectToStringComparatorFailableStream12;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream22 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream23 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream22);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream24 = objectToStringComparatorFailableStream23.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream25 = objectToStringComparatorFailableStream23.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream26 = objectToStringComparatorFailableStream23.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream27 = objectToStringComparatorFailableStream23.stream();
        org.apache.commons.lang3.stream.Streams.FailableStream[] failableStreamArray29 = new org.apache.commons.lang3.stream.Streams.FailableStream[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[] objectToStringComparatorFailableStreamArray30 = (org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[]) failableStreamArray29;
        objectToStringComparatorFailableStreamArray30[0] = objectToStringComparatorFailableStream23;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream33 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream34 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream33);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream35 = objectToStringComparatorFailableStream34.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream36 = objectToStringComparatorFailableStream34.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream37 = objectToStringComparatorFailableStream34.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream38 = objectToStringComparatorFailableStream34.stream();
        org.apache.commons.lang3.stream.Streams.FailableStream[] failableStreamArray40 = new org.apache.commons.lang3.stream.Streams.FailableStream[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[] objectToStringComparatorFailableStreamArray41 = (org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[]) failableStreamArray40;
        objectToStringComparatorFailableStreamArray41[0] = objectToStringComparatorFailableStream34;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream44 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream45 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream44);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream46 = objectToStringComparatorFailableStream45.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream47 = objectToStringComparatorFailableStream45.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream48 = objectToStringComparatorFailableStream45.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream49 = objectToStringComparatorFailableStream45.stream();
        org.apache.commons.lang3.stream.Streams.FailableStream[] failableStreamArray51 = new org.apache.commons.lang3.stream.Streams.FailableStream[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[] objectToStringComparatorFailableStreamArray52 = (org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[]) failableStreamArray51;
        objectToStringComparatorFailableStreamArray52[0] = objectToStringComparatorFailableStream45;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream55 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream56 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream55);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream57 = objectToStringComparatorFailableStream56.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream58 = objectToStringComparatorFailableStream56.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream59 = objectToStringComparatorFailableStream56.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream60 = objectToStringComparatorFailableStream56.stream();
        org.apache.commons.lang3.stream.Streams.FailableStream[] failableStreamArray62 = new org.apache.commons.lang3.stream.Streams.FailableStream[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[] objectToStringComparatorFailableStreamArray63 = (org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[]) failableStreamArray62;
        objectToStringComparatorFailableStreamArray63[0] = objectToStringComparatorFailableStream56;
        org.apache.commons.lang3.stream.Streams.FailableStream[][] failableStreamArray67 = new org.apache.commons.lang3.stream.Streams.FailableStream[6][];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[][] objectToStringComparatorFailableStreamArray68 = (org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[][]) failableStreamArray67;
        objectToStringComparatorFailableStreamArray68[0] = objectToStringComparatorFailableStreamArray8;
        objectToStringComparatorFailableStreamArray68[1] = objectToStringComparatorFailableStreamArray19;
        objectToStringComparatorFailableStreamArray68[2] = objectToStringComparatorFailableStreamArray30;
        objectToStringComparatorFailableStreamArray68[3] = objectToStringComparatorFailableStreamArray41;
        objectToStringComparatorFailableStreamArray68[4] = objectToStringComparatorFailableStreamArray52;
        objectToStringComparatorFailableStreamArray68[5] = objectToStringComparatorFailableStreamArray63;
        java.util.stream.Stream<org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>[]> objectToStringComparatorFailableStreamArrayStream81 = org.apache.commons.lang3.stream.Streams.of(objectToStringComparatorFailableStreamArray68);
        org.junit.Assert.assertNull(objectToStringComparatorStream2);
        org.junit.Assert.assertNull(objectToStringComparatorStream3);
        org.junit.Assert.assertNull(objectToStringComparatorStream4);
        org.junit.Assert.assertNull(objectToStringComparatorStream5);
        org.junit.Assert.assertNotNull(failableStreamArray7);
        org.junit.Assert.assertNotNull(objectToStringComparatorFailableStreamArray8);
        org.junit.Assert.assertNull(objectToStringComparatorStream13);
        org.junit.Assert.assertNull(objectToStringComparatorStream14);
        org.junit.Assert.assertNull(objectToStringComparatorStream15);
        org.junit.Assert.assertNull(objectToStringComparatorStream16);
        org.junit.Assert.assertNotNull(failableStreamArray18);
        org.junit.Assert.assertNotNull(objectToStringComparatorFailableStreamArray19);
        org.junit.Assert.assertNull(objectToStringComparatorStream24);
        org.junit.Assert.assertNull(objectToStringComparatorStream25);
        org.junit.Assert.assertNull(objectToStringComparatorStream26);
        org.junit.Assert.assertNull(objectToStringComparatorStream27);
        org.junit.Assert.assertNotNull(failableStreamArray29);
        org.junit.Assert.assertNotNull(objectToStringComparatorFailableStreamArray30);
        org.junit.Assert.assertNull(objectToStringComparatorStream35);
        org.junit.Assert.assertNull(objectToStringComparatorStream36);
        org.junit.Assert.assertNull(objectToStringComparatorStream37);
        org.junit.Assert.assertNull(objectToStringComparatorStream38);
        org.junit.Assert.assertNotNull(failableStreamArray40);
        org.junit.Assert.assertNotNull(objectToStringComparatorFailableStreamArray41);
        org.junit.Assert.assertNull(objectToStringComparatorStream46);
        org.junit.Assert.assertNull(objectToStringComparatorStream47);
        org.junit.Assert.assertNull(objectToStringComparatorStream48);
        org.junit.Assert.assertNull(objectToStringComparatorStream49);
        org.junit.Assert.assertNotNull(failableStreamArray51);
        org.junit.Assert.assertNotNull(objectToStringComparatorFailableStreamArray52);
        org.junit.Assert.assertNull(objectToStringComparatorStream57);
        org.junit.Assert.assertNull(objectToStringComparatorStream58);
        org.junit.Assert.assertNull(objectToStringComparatorStream59);
        org.junit.Assert.assertNull(objectToStringComparatorStream60);
        org.junit.Assert.assertNotNull(failableStreamArray62);
        org.junit.Assert.assertNotNull(objectToStringComparatorFailableStreamArray63);
        org.junit.Assert.assertNotNull(failableStreamArray67);
        org.junit.Assert.assertNotNull(objectToStringComparatorFailableStreamArray68);
        org.junit.Assert.assertNotNull(objectToStringComparatorFailableStreamArrayStream81);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator6 = objArrayCollector3.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator7 = objArrayCollector3.combiner();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier8 = objArrayCollector3.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = objArrayCollector3.characteristics();
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream10 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream12 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream13 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(objListBinaryOperator6);
        org.junit.Assert.assertNotNull(objListBinaryOperator7);
        org.junit.Assert.assertNotNull(objListSupplier8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(characteristicsStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
        org.junit.Assert.assertNotNull(characteristicsStream12);
        org.junit.Assert.assertNotNull(characteristicsStream13);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.stream.BaseStream[] baseStreamArray1 = new java.util.stream.BaseStream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>[] intBaseStreamArray2 = (java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>[]) baseStreamArray1;
        java.util.stream.BaseStream[] baseStreamArray4 = new java.util.stream.BaseStream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>[] intBaseStreamArray5 = (java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>[]) baseStreamArray4;
        java.util.stream.BaseStream[][] baseStreamArray7 = new java.util.stream.BaseStream[2][];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>[][] intBaseStreamArray8 = (java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>[][]) baseStreamArray7;
        intBaseStreamArray8[0] = intBaseStreamArray2;
        intBaseStreamArray8[1] = baseStreamArray4;
        java.util.stream.Stream<java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>[]> intBaseStreamArrayStream13 = org.apache.commons.lang3.stream.Streams.of(intBaseStreamArray8);
        java.util.stream.Stream<java.lang.AutoCloseable[]> autoCloseableArrayStream14 = org.apache.commons.lang3.stream.Streams.of((java.lang.AutoCloseable[][]) intBaseStreamArray8);
        org.junit.Assert.assertNotNull(baseStreamArray1);
        org.junit.Assert.assertNotNull(intBaseStreamArray2);
        org.junit.Assert.assertNotNull(baseStreamArray4);
        org.junit.Assert.assertNotNull(intBaseStreamArray5);
        org.junit.Assert.assertNotNull(baseStreamArray7);
        org.junit.Assert.assertNotNull(intBaseStreamArray8);
        org.junit.Assert.assertNotNull(intBaseStreamArrayStream13);
        org.junit.Assert.assertNotNull(autoCloseableArrayStream14);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean14 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.between("", "hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder19 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean21 = strComparableCheckBuilder19.greaterThan("hi!");
        boolean boolean24 = strComparableCheckBuilder19.betweenExclusive("", "");
        boolean boolean26 = strComparableCheckBuilder19.equalTo("hi!");
        boolean boolean28 = strComparableCheckBuilder19.lessThan("");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder30 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean32 = strComparableCheckBuilder30.greaterThan("hi!");
        boolean boolean35 = strComparableCheckBuilder30.betweenExclusive("", "");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder37 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean39 = strComparableCheckBuilder37.greaterThan("hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[] comparableCheckBuilderArray41 = new org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[] strComparableCheckBuilderArray42 = (org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[]) comparableCheckBuilderArray41;
        strComparableCheckBuilderArray42[0] = strComparableCheckBuilder1;
        strComparableCheckBuilderArray42[1] = strComparableCheckBuilder19;
        strComparableCheckBuilderArray42[2] = strComparableCheckBuilder30;
        strComparableCheckBuilderArray42[3] = strComparableCheckBuilder37;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderStream51 = org.apache.commons.lang3.stream.Streams.of(strComparableCheckBuilderArray42);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderStream52 = org.apache.commons.lang3.stream.Streams.of(strComparableCheckBuilderArray42);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream53 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream52);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(comparableCheckBuilderArray41);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderArray42);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderStream51);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderStream52);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream53);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator5 = objArrayCollector3.combiner();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction6 = objArrayCollector3.finisher();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier7 = objArrayCollector3.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator8 = objArrayCollector3.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet10 = objArrayCollector3.characteristics();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction11 = objArrayCollector3.finisher();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListBinaryOperator5);
        org.junit.Assert.assertNotNull(objListFunction6);
        org.junit.Assert.assertNotNull(objListSupplier7);
        org.junit.Assert.assertNotNull(objListBinaryOperator8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(characteristicsSet10);
        org.junit.Assert.assertNotNull(objListFunction11);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.util.stream.Stream<org.apache.commons.lang3.stream.Streams> streamsStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.stream.Streams> streamsFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.stream.Streams>(streamsStream0);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer6 = objArrayCollector3.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer7 = objArrayCollector3.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = objArrayCollector3.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator9 = objArrayCollector3.combiner();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(objListBiConsumer6);
        org.junit.Assert.assertNotNull(objListBiConsumer7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(objListBinaryOperator9);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("");
        boolean boolean4 = strComparableCheckBuilder1.between("", "");
        boolean boolean6 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean8 = strComparableCheckBuilder1.lessThan("");
        boolean boolean11 = strComparableCheckBuilder1.betweenExclusive("", "hi!");
        boolean boolean13 = strComparableCheckBuilder1.equalTo("hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream7 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream8 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream9 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream10 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet6);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsStream7);
        org.junit.Assert.assertNotNull(characteristicsFailableStream8);
        org.junit.Assert.assertNotNull(characteristicsStream9);
        org.junit.Assert.assertNotNull(characteristicsFailableStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.stream.Collector.Characteristics[] characteristicsArray0 = new java.util.stream.Collector.Characteristics[] {};
        java.util.ArrayList<java.util.stream.Collector.Characteristics> characteristicsList1 = new java.util.ArrayList<java.util.stream.Collector.Characteristics>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1, characteristicsArray0);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream3 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream4 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream5 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsList1);
        org.junit.Assert.assertNotNull(characteristicsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(characteristicsFailableStream3);
        org.junit.Assert.assertNotNull(characteristicsStream4);
        org.junit.Assert.assertNotNull(characteristicsFailableStream5);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream0);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream2 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream3 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream4 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream5 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream6 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream7 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream8 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream9 = objectToStringComparatorFailableStream1.stream();
        java.util.function.Predicate<java.lang.String> strPredicate11 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass12 = strPredicate11.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector13 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass12);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier14 = objArrayCollector13.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction15 = objArrayCollector13.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer16 = objArrayCollector13.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet17 = objArrayCollector13.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier18 = objArrayCollector13.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator19 = objArrayCollector13.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet20 = objArrayCollector13.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator21 = objArrayCollector13.combiner();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray22 = objectToStringComparatorFailableStream1.collect((java.util.stream.Collector<java.lang.Object, java.util.List<java.lang.Object>, java.lang.Object[]>) objArrayCollector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectToStringComparatorStream2);
        org.junit.Assert.assertNull(objectToStringComparatorStream3);
        org.junit.Assert.assertNull(objectToStringComparatorStream4);
        org.junit.Assert.assertNull(objectToStringComparatorStream5);
        org.junit.Assert.assertNull(objectToStringComparatorStream6);
        org.junit.Assert.assertNull(objectToStringComparatorStream7);
        org.junit.Assert.assertNull(objectToStringComparatorStream8);
        org.junit.Assert.assertNull(objectToStringComparatorStream9);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objListSupplier14);
        org.junit.Assert.assertNotNull(objListFunction15);
        org.junit.Assert.assertNotNull(objListBiConsumer16);
        org.junit.Assert.assertNotNull(characteristicsSet17);
        org.junit.Assert.assertNotNull(objListSupplier18);
        org.junit.Assert.assertNotNull(objListBinaryOperator19);
        org.junit.Assert.assertNotNull(characteristicsSet20);
        org.junit.Assert.assertNotNull(objListBinaryOperator21);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean14 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.between("hi!", "hi!");
        boolean boolean20 = strComparableCheckBuilder1.betweenExclusive("hi!", "hi!");
        boolean boolean22 = strComparableCheckBuilder1.lessThanOrEqualTo("hi!");
        boolean boolean24 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean26 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean28 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean30 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean32 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean34 = strComparableCheckBuilder1.lessThanOrEqualTo("hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[][][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2 };
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray3 };
        java.util.stream.Stream<java.lang.reflect.GenericDeclaration[][][]> genericDeclarationArrayStream5 = org.apache.commons.lang3.stream.Streams.of(genericDeclarationArray4);
        java.util.stream.Stream<java.lang.reflect.GenericDeclaration[][][]> genericDeclarationArrayStream6 = org.apache.commons.lang3.stream.Streams.of(genericDeclarationArray4);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.lang.reflect.GenericDeclaration[][][]> genericDeclarationArrayFailableStream7 = new org.apache.commons.lang3.stream.Streams.FailableStream<java.lang.reflect.GenericDeclaration[][][]>(genericDeclarationArrayStream6);
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArrayStream5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayStream6);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator6 = objArrayCollector3.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator7 = objArrayCollector3.combiner();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier8 = objArrayCollector3.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = objArrayCollector3.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator10 = objArrayCollector3.combiner();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction11 = objArrayCollector3.finisher();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction12 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet13 = objArrayCollector3.characteristics();
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream14 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet13);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(objListBinaryOperator6);
        org.junit.Assert.assertNotNull(objListBinaryOperator7);
        org.junit.Assert.assertNotNull(objListSupplier8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(objListBinaryOperator10);
        org.junit.Assert.assertNotNull(objListFunction11);
        org.junit.Assert.assertNotNull(objListFunction12);
        org.junit.Assert.assertNotNull(characteristicsSet13);
        org.junit.Assert.assertNotNull(characteristicsFailableStream14);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream0 = null;
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorFailableStream1 = new org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ObjectToStringComparator>(objectToStringComparatorStream0);
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream2 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream3 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream4 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream5 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream6 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream7 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream8 = objectToStringComparatorFailableStream1.stream();
        java.util.stream.Stream<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorStream9 = objectToStringComparatorFailableStream1.stream();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator10 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        java.util.Comparator<java.lang.Object> objComparator11 = objectToStringComparator10.reversed();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder13 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean15 = strComparableCheckBuilder13.greaterThan("hi!");
        boolean boolean18 = strComparableCheckBuilder13.between("hi!", "");
        boolean boolean20 = strComparableCheckBuilder13.lessThanOrEqualTo("hi!");
        int int22 = objectToStringComparator10.compare((java.lang.Object) strComparableCheckBuilder13, (java.lang.Object) 4);
        java.util.function.Predicate<java.lang.String> strPredicate24 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass25 = strPredicate24.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector26 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass25);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier27 = objArrayCollector26.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator28 = objArrayCollector26.combiner();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction29 = objArrayCollector26.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator30 = objArrayCollector26.combiner();
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder32 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean34 = strComparableCheckBuilder32.greaterThan("hi!");
        boolean boolean37 = strComparableCheckBuilder32.betweenExclusive("", "");
        boolean boolean39 = strComparableCheckBuilder32.equalTo("hi!");
        boolean boolean41 = strComparableCheckBuilder32.lessThan("");
        boolean boolean43 = strComparableCheckBuilder32.equalTo("");
        boolean boolean45 = strComparableCheckBuilder32.lessThan("hi!");
        boolean boolean47 = strComparableCheckBuilder32.greaterThan("hi!");
        int int48 = objectToStringComparator10.compare((java.lang.Object) objArrayCollector26, (java.lang.Object) "hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder50 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean52 = strComparableCheckBuilder50.greaterThan("hi!");
        boolean boolean55 = strComparableCheckBuilder50.betweenExclusive("", "");
        boolean boolean57 = strComparableCheckBuilder50.equalTo("hi!");
        boolean boolean59 = strComparableCheckBuilder50.lessThan("");
        boolean boolean61 = strComparableCheckBuilder50.greaterThan("");
        boolean boolean63 = strComparableCheckBuilder50.lessThanOrEqualTo("hi!");
        boolean boolean65 = strComparableCheckBuilder50.lessThanOrEqualTo("");
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator66 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator67 = objectToStringComparator66.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate69 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        org.apache.commons.lang3.stream.Streams streams70 = new org.apache.commons.lang3.stream.Streams();
        int int71 = objectToStringComparator66.compare((java.lang.Object) strPredicate69, (java.lang.Object) streams70);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator72 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator73 = objectToStringComparator72.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate75 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Object obj76 = null;
        int int77 = objectToStringComparator72.compare((java.lang.Object) "hi!", obj76);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator78 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator79 = objectToStringComparator78.reversed();
        java.util.Comparator<java.lang.Object> objComparator80 = objectToStringComparator72.thenComparing(objComparator79);
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator81 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator82 = new org.apache.commons.lang3.compare.ObjectToStringComparator();
        java.util.Comparator<java.lang.Object> objComparator83 = objectToStringComparator82.reversed();
        java.util.function.Predicate<java.lang.String> strPredicate85 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Object obj86 = null;
        int int87 = objectToStringComparator82.compare((java.lang.Object) "hi!", obj86);
        java.util.Comparator<java.lang.Object> objComparator88 = objectToStringComparator81.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator82);
        int int90 = objectToStringComparator72.compare((java.lang.Object) objectToStringComparator81, (java.lang.Object) 1L);
        java.util.Comparator<java.lang.Object> objComparator91 = objectToStringComparator66.thenComparing((java.util.Comparator<java.lang.Object>) objectToStringComparator81);
        java.util.Comparator<java.lang.Object> objComparator92 = objComparator91.reversed();
        int int93 = objectToStringComparator10.compare((java.lang.Object) boolean65, (java.lang.Object) objComparator92);
        java.util.function.BinaryOperator<org.apache.commons.lang3.compare.ObjectToStringComparator> objectToStringComparatorBinaryOperator94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator95 = objectToStringComparatorFailableStream1.reduce(objectToStringComparator10, objectToStringComparatorBinaryOperator94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectToStringComparatorStream2);
        org.junit.Assert.assertNull(objectToStringComparatorStream3);
        org.junit.Assert.assertNull(objectToStringComparatorStream4);
        org.junit.Assert.assertNull(objectToStringComparatorStream5);
        org.junit.Assert.assertNull(objectToStringComparatorStream6);
        org.junit.Assert.assertNull(objectToStringComparatorStream7);
        org.junit.Assert.assertNull(objectToStringComparatorStream8);
        org.junit.Assert.assertNull(objectToStringComparatorStream9);
        org.junit.Assert.assertNotNull(objectToStringComparator10);
        org.junit.Assert.assertNotNull(objComparator11);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
        org.junit.Assert.assertNotNull(strPredicate24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(objListSupplier27);
        org.junit.Assert.assertNotNull(objListBinaryOperator28);
        org.junit.Assert.assertNotNull(objListFunction29);
        org.junit.Assert.assertNotNull(objListBinaryOperator30);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 7 + "'", int48 == 7);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objComparator67);
        org.junit.Assert.assertNotNull(strPredicate69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-16) + "'", int71 == (-16));
        org.junit.Assert.assertNotNull(objComparator73);
        org.junit.Assert.assertNotNull(strPredicate75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(objComparator79);
        org.junit.Assert.assertNotNull(objComparator80);
        org.junit.Assert.assertNotNull(objComparator83);
        org.junit.Assert.assertNotNull(strPredicate85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(objComparator88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 62 + "'", int90 == 62);
        org.junit.Assert.assertNotNull(objComparator91);
        org.junit.Assert.assertNotNull(objComparator92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-4) + "'", int93 == (-4));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean15 = strComparableCheckBuilder1.betweenExclusive("", "hi!");
        boolean boolean17 = strComparableCheckBuilder1.greaterThanOrEqualTo("hi!");
        boolean boolean19 = strComparableCheckBuilder1.lessThan("");
        boolean boolean22 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean25 = strComparableCheckBuilder1.betweenExclusive("hi!", "hi!");
        boolean boolean28 = strComparableCheckBuilder1.betweenExclusive("hi!", "");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("");
        boolean boolean14 = strComparableCheckBuilder1.lessThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.between("hi!", "hi!");
        boolean boolean20 = strComparableCheckBuilder1.betweenExclusive("hi!", "hi!");
        boolean boolean23 = strComparableCheckBuilder1.betweenExclusive("", "hi!");
        boolean boolean25 = strComparableCheckBuilder1.greaterThanOrEqualTo("hi!");
        boolean boolean27 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        boolean boolean29 = strComparableCheckBuilder1.greaterThan("hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator6 = objArrayCollector3.combiner();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction7 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = objArrayCollector3.characteristics();
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream10 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream11 = org.apache.commons.lang3.stream.Streams.toStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(objListBinaryOperator6);
        org.junit.Assert.assertNotNull(objListFunction7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(characteristicsStream10);
        org.junit.Assert.assertNotNull(characteristicsStream11);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.lessThan("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean14 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean17 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean20 = strComparableCheckBuilder1.betweenExclusive("", "hi!");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder22 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean24 = strComparableCheckBuilder22.greaterThan("hi!");
        boolean boolean27 = strComparableCheckBuilder22.betweenExclusive("", "");
        boolean boolean30 = strComparableCheckBuilder22.between("", "hi!");
        boolean boolean33 = strComparableCheckBuilder22.betweenExclusive("", "");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[] comparableCheckBuilderArray35 = new org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[] strComparableCheckBuilderArray36 = (org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>[]) comparableCheckBuilderArray35;
        strComparableCheckBuilderArray36[0] = strComparableCheckBuilder1;
        strComparableCheckBuilderArray36[1] = strComparableCheckBuilder22;
        java.util.stream.Stream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderStream41 = org.apache.commons.lang3.stream.Streams.of(strComparableCheckBuilderArray36);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream42 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream41);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream43 = org.apache.commons.lang3.stream.Streams.stream(strComparableCheckBuilderStream41);
        org.apache.commons.lang3.stream.Streams.FailableStream<org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String>> strComparableCheckBuilderFailableStream44 = org.apache.commons.lang3.stream.Streams.failableStream(strComparableCheckBuilderStream41);
        java.lang.Class<?> wildcardClass45 = strComparableCheckBuilderStream41.getClass();
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableCheckBuilder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(comparableCheckBuilderArray35);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderArray36);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderStream41);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream42);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream43);
        org.junit.Assert.assertNotNull(strComparableCheckBuilderFailableStream44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = objArrayCollector3.characteristics();
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream8 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet7);
        java.lang.Class<?> wildcardClass9 = characteristicsFailableStream8.getClass();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(characteristicsFailableStream8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        boolean boolean5 = strComparableCheckBuilder1.lessThanOrEqualTo("hi!");
        boolean boolean7 = strComparableCheckBuilder1.lessThan("hi!");
        boolean boolean10 = strComparableCheckBuilder1.between("", "");
        boolean boolean12 = strComparableCheckBuilder1.equalTo("");
        boolean boolean14 = strComparableCheckBuilder1.greaterThanOrEqualTo("hi!");
        boolean boolean17 = strComparableCheckBuilder1.betweenExclusive("hi!", "");
        boolean boolean20 = strComparableCheckBuilder1.between("", "hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.stream.IntStream intStream1 = org.apache.commons.lang3.stream.IntStreams.rangeClosed((int) (byte) 1);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator5 = objArrayCollector3.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = objArrayCollector3.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.Object>, java.lang.Object> objListBiConsumer7 = objArrayCollector3.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier8 = objArrayCollector3.supplier();
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListBinaryOperator5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(objListBiConsumer7);
        org.junit.Assert.assertNotNull(objListSupplier8);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean6 = strComparableCheckBuilder1.betweenExclusive("", "");
        boolean boolean8 = strComparableCheckBuilder1.equalTo("hi!");
        boolean boolean10 = strComparableCheckBuilder1.equalTo("");
        boolean boolean12 = strComparableCheckBuilder1.lessThan("hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<java.lang.String> strComparableCheckBuilder1 = org.apache.commons.lang3.compare.ComparableUtils.is("hi!");
        boolean boolean3 = strComparableCheckBuilder1.greaterThan("hi!");
        boolean boolean5 = strComparableCheckBuilder1.greaterThanOrEqualTo("hi!");
        boolean boolean7 = strComparableCheckBuilder1.greaterThan("");
        boolean boolean10 = strComparableCheckBuilder1.between("hi!", "hi!");
        boolean boolean12 = strComparableCheckBuilder1.greaterThanOrEqualTo("hi!");
        boolean boolean14 = strComparableCheckBuilder1.greaterThanOrEqualTo("");
        boolean boolean17 = strComparableCheckBuilder1.betweenExclusive("", "hi!");
        org.junit.Assert.assertNotNull(strComparableCheckBuilder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.util.function.Predicate<java.lang.String> strPredicate1 = org.apache.commons.lang3.compare.ComparableUtils.lt("hi!");
        java.lang.Class<?> wildcardClass2 = strPredicate1.getClass();
        org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object> objArrayCollector3 = new org.apache.commons.lang3.stream.Streams.ArrayCollector<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass2);
        java.util.function.Supplier<java.util.List<java.lang.Object>> objListSupplier4 = objArrayCollector3.supplier();
        java.util.function.Function<java.util.List<java.lang.Object>, java.lang.Object[]> objListFunction5 = objArrayCollector3.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator6 = objArrayCollector3.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.Object>> objListBinaryOperator7 = objArrayCollector3.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = objArrayCollector3.characteristics();
        java.util.stream.Stream<java.util.stream.Collector.Characteristics> characteristicsStream9 = org.apache.commons.lang3.stream.Streams.nullSafeStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream10 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objListSupplier4);
        org.junit.Assert.assertNotNull(objListFunction5);
        org.junit.Assert.assertNotNull(objListBinaryOperator6);
        org.junit.Assert.assertNotNull(objListBinaryOperator7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(characteristicsStream9);
        org.junit.Assert.assertNotNull(characteristicsFailableStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
    }
}

