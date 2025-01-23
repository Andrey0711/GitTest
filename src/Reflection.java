import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
    Car car = new Car();
    Class<Car> getClass = Car.class;
    Class<?> getCarClass = Class.forName("Car");
    Method[] methods = getClass.getMethods();
//    for(Method method : methods){
//        System.out.println(method.getName() + " / "
//                + method.getReturnType() + " / "
//                + Arrays.toString(method.getTypeParameters()));
//    }
    Field[] fields = getClass.getDeclaredFields();
    for(Field field: fields){
        System.out.println(field.getType() + " / " + field.getName());
    }
    Annotation[] annotations = getClass.getAnnotations();
    for(Annotation annotation: annotations){
        if(annotation instanceof MyAnnotation){
            System.out.println("It is");
        }
    }
    }
}
