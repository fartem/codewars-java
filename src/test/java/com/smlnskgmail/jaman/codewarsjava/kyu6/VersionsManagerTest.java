package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class VersionsManagerTest {

    @Test
    public void initializationTests() {
        try {
            assertEquals(
                    "0.0.1",
                    new VersionsManager().release()
            );
            assertEquals(
                    "0.0.1",
                    new VersionsManager("").release()
            );
            assertEquals(
                    "1.2.3",
                    new VersionsManager("1.2.3").release()
            );
            assertEquals(
                    "1.2.3",
                    new VersionsManager("1.2.3.4").release()
            );
            assertEquals(
                    "1.2.3",
                    new VersionsManager("1.2.3.d").release()
            );
            assertEquals(
                    "1.0.0",
                    new VersionsManager("1").release()
            );
            assertEquals(
                    "1.1.0",
                    new VersionsManager("1.1").release()
            );
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void majorReleasesTests() {
        try {
            assertEquals(
                    "1.0.0",
                    new VersionsManager().major().release()
            );
            assertEquals(
                    "2.0.0",
                    new VersionsManager("1.2.3").major().release()
            );
            assertEquals(
                    "3.0.0",
                    new VersionsManager("1.2.3").major().major().release()
            );
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void minorReleasesTests() {
        try {
            assertEquals(
                    "0.1.0",
                    new VersionsManager().minor().release()
            );
            assertEquals(
                    "1.3.0",
                    new VersionsManager("1.2.3").minor().release()
            );
            assertEquals(
                    "1.1.0",
                    new VersionsManager("1").minor().release()
            );
            assertEquals(
                    "4.2.0",
                    new VersionsManager("4").minor().minor().release()
            );
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void patchReleasesTests() {
        try {
            assertEquals(
                    "0.0.2", new VersionsManager().patch().release());
            assertEquals(
                    "1.2.4", new VersionsManager("1.2.3").patch().release());
            assertEquals(
                    "4.0.2", new VersionsManager("4").patch().patch().release());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void rollbacksTests() {
        try {
            assertEquals(
                    "0.0.1",
                    new VersionsManager().major().rollback().release()
            );
            assertEquals(
                    "0.0.1",
                    new VersionsManager().minor().rollback().release()
            );
            assertEquals(
                    "0.0.1",
                    new VersionsManager().patch().rollback().release()
            );
            assertEquals(
                    "1.0.0",
                    new VersionsManager().major().patch().rollback().release()
            );
            assertEquals(
                    "1.0.0",
                    new VersionsManager().major().patch().rollback().major().rollback().release()
            );
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void seperatedCallsTests() {
        try {
            VersionsManager versionsManager = new VersionsManager("1.2.3");
            versionsManager.major();
            versionsManager.minor();
            assertEquals(
                    "2.1.0",
                    versionsManager.release()
            );
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void exceptionsTests() {
        try {
            new VersionsManager("a.b.c");
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals(
                    "Error occured while parsing version!",
                    e.getMessage()
            );
        }
        try {
            new VersionsManager().rollback();
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals(
                    "Cannot rollback!",
                    e.getMessage()
            );
        }
    }

}
