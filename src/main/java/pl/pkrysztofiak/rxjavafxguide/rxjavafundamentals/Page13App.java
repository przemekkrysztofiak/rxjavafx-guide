package pl.pkrysztofiak.rxjavafxguide.rxjavafundamentals;

import io.reactivex.Observable;

public class Page13App {

    public static void main(String[] args) {

        Observable<Integer> observable = Observable.just(1, 2, 3, 4);

        observable.subscribe(System.out::println);
    }
}
