package in.confest.examplemodule;

import com.google.inject.AbstractModule;

public class ExampleModule extends AbstractModule {

    @Override protected void configure() {
        bind(Message.class).to(ExampleMessage.class);
    }

}
