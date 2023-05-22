package Annotations;
import java.lang.annotation.*;
public class Annotation3 {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Execute {
        int sequence() default 0;
    }

    class MyClass {
        @Execute(sequence = 2)
        public void myMethod1() {
            // Method implementation
        }

        @Execute(sequence = 1)
        public void myMethod2() {
            // Method implementation
        }

        @Execute(sequence = 3)
        public void myMethod3() {
            // Method implementation
        }
    }

}
