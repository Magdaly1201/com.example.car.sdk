package com.example.demo.car.sdk.config;
 
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

/**
 * Annotation interface for enable Sucursal SDK uses when its imported into
 * another project
 * 
 * @author rxm503
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EnableCarSDKConfiguration.class)
public @interface EnableCarSDK {
}
