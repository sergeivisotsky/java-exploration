package org.sergei.rxjava;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * @author Sergei Visotsky
 */
public class ReactivePlayground {

    /**
     * Retrieve a simple pojo title using {@link Single}
     *
     * @param pojo to get a title from
     * @return a single pojo
     */
    public Single<AnyPojo> retrieveTitle(AnyPojo pojo) {
        if (pojo == null) {
            return Single.error(() -> new IllegalStateException("Illegal state"));
        }
        return Single.just(pojo);
    }

    /**
     * Return an {@link Observable} of a title of {@link AnyPojo} object
     *
     * @param anyPojo any pojo object as an operational object
     * @return observable of formatted title
     */
    public Observable<String> retrieveAnyReformattedTitle(AnyPojo anyPojo) {
        return Observable.just(formatString(anyPojo.getTitle()));
    }

    /**
     * Perform a concurrent calculation using a {@link CompletableFuture} an {@link Flowable}
     *
     * @param request regust of the {@link FirstPojo}
     * @return {@link Flowable} of concurrent calculation
     */
    public Flowable<String> performCalculations(FirstPojo request) {
        CompletableFuture<String> future = new CompletableFuture<>();
        Executors.newCachedThreadPool().submit(() -> {
            try {
                Thread.sleep(5000);
                future.complete(formatString(request.getFirstField()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        return Flowable.fromFuture(future)
                .onErrorReturn(ExceptionUtils::getMessage);
    }

    /**
     * Format {@link String} to replace all "t" with "b"
     *
     * @param str string to perform replacement
     * @return formatted string
     */
    private static String formatString(String str) {
        return str.replaceAll("l", "b");
    }

}
