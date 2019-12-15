package org.sergei.rxjava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Sergei Visotsky
 */
class ObservableDemoTest {

    private ObservableDemo demo;
    private AnyPojo pojo;

    @BeforeEach
    void setUp() {
        this.demo = new ObservableDemo();
        this.pojo = new AnyPojo();
        pojo.setId(1L);
        pojo.setTitle("Hello world");
        pojo.setPurpose("Demo");
    }

    @Test
    void retrieveTitle() {
        assertEquals("Hello world", demo.retrieveTitle(pojo).toString());
    }
}
