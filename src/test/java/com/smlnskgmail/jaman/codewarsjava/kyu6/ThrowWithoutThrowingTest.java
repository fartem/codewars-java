package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import java.nio.BufferOverflowException;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import static org.junit.Assert.fail;

public class ThrowWithoutThrowingTest {

    @Test
    public void tests() {
        assertThrows(
                ArithmeticException.class,
                ThrowWithoutThrowing::arithmetic
        );
        assertThrows(
                NoSuchElementException.class,
                ThrowWithoutThrowing::noSuchElement
        );
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                ThrowWithoutThrowing::arrayIndexOutOfBound
        );
        assertThrows(
                ClassCastException.class,
                ThrowWithoutThrowing::classCast
        );
        assertThrows(
                StackOverflowError.class,
                ThrowWithoutThrowing::stackOverflow
        );
        assertThrows(
                NullPointerException.class,
                ThrowWithoutThrowing::nullPointer
        );
        assertThrows(
                NumberFormatException.class,
                ThrowWithoutThrowing::numberFormat
        );
        assertThrows(
                IllegalArgumentException.class,
                ThrowWithoutThrowing::illegalArgument
        );
        assertThrows(
                NegativeArraySizeException.class,
                ThrowWithoutThrowing::negativeArraySize
        );
        assertThrows(
                EmptyStackException.class,
                ThrowWithoutThrowing::emptyStack
        );
        assertThrows(
                BufferOverflowException.class,
                ThrowWithoutThrowing::bufferOverflow
        );
        assertThrows(
                ArrayStoreException.class,
                ThrowWithoutThrowing::arrayStore
        );
        assertThrows(
                UnsupportedOperationException.class,
                ThrowWithoutThrowing::unsupportedOperation
        );
        assertThrows(
                IllegalStateException.class,
                ThrowWithoutThrowing::illegalState
        );
    }

    private static void assertThrows(
            Class<? extends Throwable> clazz,
            Lambda function
    ) {
        try {
            function.apply();
        } catch (Throwable e) {
            if (e.getClass() == clazz) {
                System.out.println(
                        "Successfully thrown "
                                + e.getClass().getSimpleName()
                                + ", message: "
                                + e.getMessage()
                );
            } else {
                fail(
                        "Error: expected: "
                                + clazz.getSimpleName()
                                + ", get: "
                                + e.getClass().getSimpleName()
                );
            }
            return;
        }
        fail("No exceptions thrown!");
    }

    interface Lambda {
        void apply();
    }

}
