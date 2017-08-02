package com.thecreative.screensavermode;

import android.app.Instrumentation;
import android.content.Context;

import static junit.framework.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
class ExampleInstrumentedTest {
    @org.testng.annotations.Test
    void useAppContext(Instrumentation InstrumentationRegistry) throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.thecreative.screensavermode", appContext.getPackageName());
    }
}
