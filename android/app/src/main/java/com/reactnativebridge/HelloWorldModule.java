package com.reactbridge; // Package name

import com.facebook.react.bridge.ReactApplicationContext; // Provides access to React Native environment
import com.facebook.react.bridge.ReactContextBaseJavaModule; // Base class for creating native modules
import com.facebook.react.bridge.ReactMethod; // Annotation to expose Java method to JavaScript
import com.facebook.react.bridge.Promise; // For handling async result to JS side

// Defines the native module HelloWorldModule
public class HelloWorldModule extends ReactContextBaseJavaModule {

    // Constructor that receives the React context
    HelloWorldModule(ReactApplicationContext context) {
        super(context);
    }

    // Returns the name of the module used to access it from JS: NativeModules.HelloWorld
    @Override
    public String getName() {
        return "HelloWorld";
    }

    // Method exposed to JS that returns "Hello World from Native!" as a resolved Promise
    @ReactMethod
    public void getMessage(Promise promise) {
        promise.resolve("Hello World from Native!");
    }
}

