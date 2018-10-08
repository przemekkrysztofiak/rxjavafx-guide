package pl.pkrysztofiak.rxjavafxguide.rxjavafundamentals;

import io.reactivex.Observable;

public class Page15App {

    public static void main(String[] args) {

        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);

        //@formatter:off
        observable.subscribe(
                next -> System.out.println("next=" + next),
                throwable -> throwable.printStackTrace(),
                () -> System.out.println("Done!"));
        //@formatter:on

    }
}
