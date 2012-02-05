/**
 * Copyright 2011 Niall Gallagher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.mobilityrpc;

import com.googlecode.mobilityrpc.execution.ExecutionCoordinator;
import com.googlecode.mobilityrpc.execution.impl.ExecutionCoordinatorImpl;

/**
 * A static factory which returns a new {@link ExecutionCoordinator} object, which provides the main API of the
 * mobility-rpc library.
 *
 * @author Niall Gallagher
 */
public class ExecutionFactory {

    /**
     * @return A new {@link ExecutionCoordinator} instance. Usually the application will want to cache this instance
     * so that it can interact with the library via the same {@code ExecutionCoordinator} instance.
     */
    public static ExecutionCoordinator newExecutionCoordinator() {
        // Return the default implementation...
        return new ExecutionCoordinatorImpl();
    }
}