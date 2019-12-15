package org.sergei.rxjava;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;

/**
 * @author Sergei Visotsky
 */
public class ObservableDemo {

    public Disposable retrieveTitle(AnyPojo pojo) {
        return Single.create(emitter -> {
            Thread thread = new Thread(() -> {
                try {
                    List<AnyPojo> allPojos = List.of(pojo);
                    System.out.print("Called!");
                    emitter.onSuccess(allPojos);
                } catch (Exception e) {
                    emitter.onError(e);
                }
            });
            thread.start();
        }).subscribe(System.out::print);
    }

}
