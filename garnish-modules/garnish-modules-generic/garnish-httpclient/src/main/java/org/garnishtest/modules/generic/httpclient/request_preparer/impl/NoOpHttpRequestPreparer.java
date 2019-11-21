/*
 * Copyright 2016-2018, Garnish.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.garnishtest.modules.generic.httpclient.request_preparer.impl;

import lombok.NonNull;
import org.garnishtest.modules.generic.httpclient.HttpRequestBuilder;
import org.garnishtest.modules.generic.httpclient.request_preparer.HttpRequestPreparer;

public final class NoOpHttpRequestPreparer implements HttpRequestPreparer {

    private static final NoOpHttpRequestPreparer INSTANCE = new NoOpHttpRequestPreparer();

    private NoOpHttpRequestPreparer() {
    }

    public static NoOpHttpRequestPreparer instance() {
        return INSTANCE;
    }

    @Override public void prepareRequest(@NonNull final HttpRequestBuilder requestBuilder) {
        // no-op = no operation (do nothing)
    }
}
