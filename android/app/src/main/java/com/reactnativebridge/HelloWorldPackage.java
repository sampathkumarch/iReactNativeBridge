package com.reactbridge; // Package name

import com.facebook.react.ReactPackage; // Interface for registering modules/view managers
import com.facebook.react.bridge.NativeModule; // Interface for creating modules
import com.facebook.react.uimanager.ViewManager; // Used for native UI components
import com.facebook.react.bridge.ReactApplicationContext; // Access point for React context

import java.util.ArrayList; // Used to create list of modules
import java.util.Collections; // Used for empty list
import java.util.List; // List interface

// This class registers the native module with React Native
public class HelloWorldPackage implements ReactPackage {

    // Adds our HelloWorldModule to the list of native modules
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>(); // Create a list of modules
        modules.add(new HelloWorldModule(reactContext)); // Add our HelloWorldModule
        return modules;
    }

    // No custom UI components, return empty list
    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}

