package com.s28572.junit.service.extension;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class GlobalExtension implements BeforeAllCallback, AfterTestExecutionCallback {

    // Executed before @BeforeAll
    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("Before all callback");
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("After execution of test: " + context.getDisplayName());
    }
}
