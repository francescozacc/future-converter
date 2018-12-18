/*
 * Copyright © 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.javacrumbs.futureconverter.common.internal;

import java.util.concurrent.Future;

/**
 * Some ValueSources are already futures, let's wrap it and use its implementation.
 */
public abstract class ValueSourceFuture<T> extends FutureWrapper<T> implements ValueSource<T> {
    protected ValueSourceFuture(Future<T> wrappedFuture) {
        super(wrappedFuture);
    }
}
