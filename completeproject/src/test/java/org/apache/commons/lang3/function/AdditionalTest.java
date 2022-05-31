/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.lang3.function;

import org.apache.commons.lang3.stream.Streams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class AdditionalTest {

    @Test
    public void FailableObjIntConsumerTest() throws Throwable{
        String test = "";
        FailableObjIntConsumer.nop().accept(test,123);
    }

    @Test
    public void FailableLongToDoubleFunctionTest() throws Throwable{
        assertEquals(0.0, FailableLongToDoubleFunction.nop().applyAsDouble(123));
    }

    @Test
    public void FailableLongFunctionTest() throws Throwable{
        assertNull(FailableLongFunction.nop().apply(123));
    }

    @Test
    public void FailableLongToIntFunctionTest() throws Throwable{
        Assertions.assertEquals(0, FailableLongToIntFunction.nop().applyAsInt(123));
    }

    @Test
    public void FailableObjDoubleConsumerTest() throws Throwable{
        String test = "";
        FailableObjDoubleConsumer.nop().accept(test,123.0);
    }

    @Test
    public void FailableIntToLongFunctionTest() throws Throwable{
        Assertions.assertEquals(0.0, FailableIntToLongFunction.nop().applyAsLong(123));
    }

    @Test
    public void FailableIntToDoubleFunctionTest() throws Throwable{
        Assertions.assertEquals(0.0, FailableIntToDoubleFunction.nop().applyAsDouble(123));
    }

    @Test
    public void FailableIntFunctionTest() throws Throwable{
        Assertions.assertNull(FailableIntFunction.nop().apply(123));

    }

    @Test
    public void FailableFunctionTest() throws Throwable{
        Assertions.assertEquals(123,FailableFunction.identity().apply(123));
        assertNull(FailableFunction.identity().apply(null));
        Assertions.assertEquals("123",FailableFunction.identity().apply("123"));
        Assertions.assertEquals('c',FailableFunction.identity().apply('c'));
        Assertions.assertEquals('@',FailableFunction.identity().apply('@'));
        //Assertions.assertEquals('?',FailableFunction.identity().apply('?'));
    }

    @Test
    public void FailableDoubleUnaryOperatorTest() throws Throwable{
        Assertions.assertEquals(123,FailableDoubleUnaryOperator.identity().applyAsDouble(123));

    }

    @Test
    public void FailableDoubleToIntFunctionTest() throws Throwable{
        Assertions.assertEquals(0,FailableDoubleToIntFunction.nop().applyAsInt(123));
    }

    @Test
    public void FailableDoubleFunctionTest() throws Throwable {
        Assertions.assertNull(FailableDoubleFunction.nop().apply(123));
    }

    @Test
    public void FailableDoubleToLongFunctionTest() throws Throwable {
        Assertions.assertEquals(0,FailableDoubleToLongFunction.nop().applyAsLong(123));
    }

    @Test
    public void FailableCollectionTest(){
        Collection<String> collection = new ArrayList<>();
        Streams.FailableStream<String> stream = Failable.stream(collection);
    }

    @Test
    public void FailableStreamTest(){
        Collection<String> collection = new ArrayList<>();
        Streams.FailableStream<String> stream = Failable.stream(collection.stream());

    }

    @Test
    public void Failable_RuntimeExceptionTest() throws Throwable {
        Assertions.assertThrows(RuntimeException.class, () -> Failable.rethrow(new RuntimeException()));
        Assertions.assertThrows(Error.class, () -> Failable.rethrow(new Error()));
        Assertions.assertThrows(UncheckedIOException.class, () -> Failable.rethrow(new IOException()));
        Assertions.assertThrows(UndeclaredThrowableException.class, () -> Failable.rethrow(new Exception()));
        Assertions.assertThrows(RuntimeException.class, () -> Failable.getAsShort(() -> {
            throw new RuntimeException();
        }));
    }

    @Test
    public void FailableObjLongConsumerTest() throws Throwable{
        FailableObjLongConsumer.nop().accept("test",114514);
    }

    @Test
    public void FailableToDoubleBiFunctionTest() throws Throwable{
        assertEquals(0.0, FailableToDoubleBiFunction.nop().applyAsDouble("test",233));
    }

    @Test
    public void FailableToDoubleFunctionTest() throws Throwable{
        assertEquals(0.0, FailableToDoubleFunction.nop().applyAsDouble("114"));
    }

    @Test
    public void FailableToIntFunctionTest() throws Throwable{
        assertEquals(0, FailableToIntFunction.nop().applyAsInt("114"));
    }

    @Test
    public void FailableToIntBiFunctionTest() throws Throwable{
        assertEquals(0, FailableToIntBiFunction.nop().applyAsInt("test", "114"));
    }

    @Test
    public void FailableToLongBiFunctionTest() throws Throwable{
        assertEquals(0, FailableToLongBiFunction.nop().applyAsLong("test", "114"));
    }

    @Test
    public void FailableToLongFunctionTest() throws Throwable{
        assertEquals(0.0, FailableToLongFunction.nop().applyAsLong("114"));
    }

    @Test
    public void testPredicateOr() throws Throwable {
        assertTrue(FailablePredicate.TRUE.or(FailablePredicate.TRUE).test(0));
        assertTrue(FailablePredicate.TRUE.or(FailablePredicate.FALSE).test(0));
        assertTrue(FailablePredicate.FALSE.or(FailablePredicate.TRUE).test(0));
        assertFalse(FailablePredicate.FALSE.or(FailablePredicate.FALSE).test(0));
        // null tests
        assertThrows(NullPointerException.class, () -> assertFalse(FailablePredicate.falsePredicate().or(null).test(0)));
        assertThrows(NullPointerException.class, () -> assertTrue(FailablePredicate.truePredicate().or(null).test(0)));
    }

    @Test
    public void testPredicateNegate() throws Throwable {
        assertFalse(FailablePredicate.TRUE.negate().test(0L));
        assertFalse(FailablePredicate.truePredicate().negate().test(0L));
        assertTrue(FailablePredicate.FALSE.negate().test(0L));
        assertTrue(FailablePredicate.falsePredicate().negate().test(0L));
    }

    @Test
    public void FailableIntUnaryOperatorTest() throws Throwable {
        assertEquals(114, FailableIntUnaryOperator.identity().applyAsInt(114));
    }
}
