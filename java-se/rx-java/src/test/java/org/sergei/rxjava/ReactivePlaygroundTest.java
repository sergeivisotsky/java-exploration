package org.sergei.rxjava;

import io.reactivex.Flowable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for {@link ReactivePlayground} class
 *
 * @author Sergei Visotsky
 */
public class ReactivePlaygroundTest {

    private ReactivePlayground testInstance;
    private AnyPojo pojo;

    @Before
    public void setUp() {
        this.testInstance = new ReactivePlayground();
        this.pojo = AnyPojo.newBuilder()
                .withId(1L)
                .withTitle("Hello world")
                .withPurpose("Demo")
                .build();
    }

    /**
     * Unit test for {@link ReactivePlayground#retrieveTitle(AnyPojo)}
     */
    @Test
    public void testRetrieveTitle() {
        AnyPojo anyPojo = testInstance.retrieveTitle(pojo)
                .toObservable()
                .blockingFirst();

        assertEquals("Hello world", anyPojo.getTitle());
        assertEquals("Demo", anyPojo.getPurpose());
    }

    /**
     * Unit test for {@link ReactivePlayground#retrieveAnyReformattedTitle(AnyPojo)}
     */
    @Test
    public void testRetrieveAnyReformattedName() {
        String result = testInstance.retrieveAnyReformattedTitle(pojo).blockingFirst();
        assertEquals("Hebbo worbd", result);
    }

    /**
     * Unit test for {@link ReactivePlayground#performCalculations(FirstPojo)}
     */
    @Test
    public void testPerformCalculations() {
        FirstPojo request = FirstPojo.create("lllll", "abcdef", 32);
        Flowable<String> result = testInstance.performCalculations(request);
        assertEquals("bbbbb", result.blockingFirst());
    }
}
