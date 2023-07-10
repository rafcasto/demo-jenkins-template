package org.techdojo.practice.customs;

import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;
import org.techdojo.practice.controllers.SauceLabController;

public class CustomPicoFactory implements ObjectFactory {
    private PicoFactory delegate = new PicoFactory();
    public CustomPicoFactory()
    {
        setDriver();
    }
    @Override
    public void start() {
        delegate.start();
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return delegate.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return delegate.getInstance(aClass);
    }

    private void setDriver()
    {

        addClass(SauceLabController.class);
    }
}
