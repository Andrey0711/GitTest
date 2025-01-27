import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyAnnotation {
    String author() default "Andrei";
    int dateOfCreationAnnotation() default 1234123;
    String purpose() default "For testing...";
}
