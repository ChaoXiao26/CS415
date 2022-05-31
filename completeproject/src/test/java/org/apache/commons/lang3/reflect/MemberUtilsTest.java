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

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.lang3.reflect.MemberUtils;

import java.lang.reflect.Executable;
import java.lang.reflect.Method;

public class MemberUtilsTest {
    class MethodsClass{
        public int methodOne(int i) {
            return i;
        }

        public float methodTwo(float f) {
            return f;
        }

        public String[] varArgsMethod(String oneMore, String twoMore, String... strings) {
            return strings;
        };

        public int[] smallVarMethod(int... ints) {
            return ints;
        }
    }
    /*
     * This method already had decent coverage, but I noticed multiple branches that weren't being hit
     * both in this method, and the private methods that it calls.
     * Since this seemed like a good candidate for graph-coverage testing I used that as my strategy.
     * This method is private, so I call compareMethodFit in order to reach it.
     */

    @Test
    public void testTransformCost() throws Exception {
        Method varMethod = MethodsClass.class.getMethod("varArgsMethod", String.class, String.class, String[].class);
        Method smallVarMethod = MethodsClass.class.getMethod("smallVarMethod", int[].class);
        Method methodOne = MethodsClass.class.getMethod("methodOne", int.class);
        Method methodTwo = MethodsClass.class.getMethod("methodTwo", float.class);

        // Hit varArgs branch
        assertEquals(0, MemberUtils.compareMethodFit(varMethod, varMethod, new Class<?>[0]));

        // Hit all explicitArrayForVarArgs branches
        Class<?>[] srcArgs = new Class<?>[1];
        srcArgs[0] = null;
        assertEquals(-1, MemberUtils.compareMethodFit(smallVarMethod, varMethod, srcArgs));
        srcArgs[0] = int[].class;
        assertEquals(-1, MemberUtils.compareMethodFit(smallVarMethod, varMethod, srcArgs));
    }
}
