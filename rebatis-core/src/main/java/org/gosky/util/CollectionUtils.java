package org.gosky.util;

import java.util.Collection;

public final class CollectionUtils {


    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
}
