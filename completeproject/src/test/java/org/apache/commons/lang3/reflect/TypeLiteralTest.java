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
package org.apache.commons.lang3.reflect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.lang.reflect.WildcardType;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TypeLiteralTest {

    @Test
    public void testBasic() {
        assertTrue(TypeUtils.equals(String.class, new TypeLiteral<String>() {}.value));
        assertTrue(TypeUtils.equals(TypeUtils.parameterize(List.class, String.class),
            new TypeLiteral<List<String>>() {}.value));
    }

    @Test
    public void testTyped() {
        final Typed<String> stringType = new TypeLiteral<String>() {};
        assertTrue(TypeUtils.equals(String.class, stringType.getType()));
        final Typed<List<String>> listOfStringType = new TypeLiteral<List<String>>() {};
        assertTrue(TypeUtils.equals(TypeUtils.parameterize(List.class, String.class), listOfStringType.getType()));
    }

    @Test
    public void testEquals() {
        assertEquals(new TypeLiteral<String>() {}, new TypeLiteral<String>() {});
        assertEquals(new TypeLiteral<List<String>>() {}, new TypeLiteral<List<String>>() {});
        assertNotEquals(new TypeLiteral<String>() {}, new TypeLiteral<List<String>>() {});
        assertNotEquals(new TypeLiteral<String>() {}, new String());
    }

    @SuppressWarnings("rawtypes")
    @Test
    public void testRaw() {
        assertThrows(NullPointerException.class, () -> new TypeLiteral() {});
    }

    //Tests graph nodes that were previously unreached in the equals() method
    @Test
    public void testSameEquals() {
        TypeLiteral type = new TypeLiteral<String>() {};
        TypeLiteral sameType = new TypeLiteral<String>() {};
        assertEquals(type, type);
        assertEquals(type, sameType);
    }

    /*
    Input space partitioning (only one meaningful variable)
    Characteristic: Difference in values
    Partitions: Same value, Same type of value, Different type of value
    */
    @Test
    public void testHashCode() {
        TypeLiteral type = new TypeLiteral<String>() {};
        TypeLiteral sameType = new TypeLiteral<String>() {};
        TypeLiteral otherType = new TypeLiteral<Integer>() {};
        assertEquals(type.hashCode(), type.hashCode());
        assertEquals(type.hashCode(), sameType.hashCode());
        assertNotEquals(type.hashCode(), otherType.hashCode());
    }

    /*
    Input space partitioning (only one meaningful variable)
    Characteristic: type of value
    Partitions: Class type, Parameterized type, WildcardType
    */
    @Test
    public void testToString() {
        TypeLiteral type = new TypeLiteral<Integer>() {};
        TypeLiteral listType = new TypeLiteral<List<String>>() {};
        TypeLiteral wildType = new TypeLiteral<WildcardType>() {};
        assertEquals("TypeLiteral<java.lang.Integer>", type.toString());
        assertEquals("TypeLiteral<java.util.List<java.lang.String>>", listType.toString());
        assertEquals("TypeLiteral<java.lang.reflect.WildcardType>", wildType.toString());
    }
}
