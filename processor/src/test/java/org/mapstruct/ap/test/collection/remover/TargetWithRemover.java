/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.collection.remover;

import java.util.ArrayList;
import java.util.List;

public class TargetWithRemover {
    private List<String> strings = new ArrayList<>();

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public TargetWithRemover strings(List<String> strings) {
        this.strings.addAll( strings );
        return this;
    }

    @SuppressWarnings("unused")
    public TargetWithRemover addString(String string) {
        strings.add( string );
        return this;
    }

    @SuppressWarnings("unused")
    public TargetWithRemover removeString(String string) {
        strings.remove( string );
        return this;
    }
}
