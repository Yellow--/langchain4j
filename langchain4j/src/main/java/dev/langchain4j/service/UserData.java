package dev.langchain4j.service;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * The value of a method parameter annotated with @UserData will be used to bypass to underlying tools/rag.
 * A parameter annotated with @UserData can be of Map type, provided its elements has properly implemented equals() and hashCode() methods.
 */
@Retention(RUNTIME)
@Target(PARAMETER)
public @interface UserData {

}
