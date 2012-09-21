package io.searchbox.core;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author Dogukan Sonmez
 */


public class PercolateTest {

    @Test
    public void percolateDocument() {
        Percolate percolate = new Percolate("twitter", "percolateQuery", "{query}");
        assertEquals("POST", percolate.getRestMethodName());
        assertEquals("twitter/percolateQuery/_percolate", percolate.getURI());
    }
}
