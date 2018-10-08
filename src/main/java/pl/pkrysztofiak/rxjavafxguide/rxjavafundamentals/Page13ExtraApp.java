package pl.pkrysztofiak.rxjavafxguide.rxjavafundamentals;

import io.reactivex.rxjavafx.observables.JavaFxObservable;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Page13ExtraApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button("Click me!");

        //@formatter:off
        JavaFxObservable.actionEventsOf(button)
        .take(1)
        .subscribe(
                next -> System.out.println("next=" + next),
                throwable -> throwable.printStackTrace(),
                () -> System.out.println("Completed"),
                disposable -> System.out.println("subscribed"));
        //@formatter:off

        stage.setScene(new Scene(button));
        stage.show();
    }
}