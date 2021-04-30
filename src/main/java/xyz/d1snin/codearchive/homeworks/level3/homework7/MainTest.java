package xyz.d1snin.codearchive.homeworks.level3.homework7;

import xyz.d1snin.codearchive.homeworks.level3.homework7.annotation.AfterSuite;
import xyz.d1snin.codearchive.homeworks.level3.homework7.annotation.BeforeSuite;
import xyz.d1snin.codearchive.homeworks.level3.homework7.annotation.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @SuppressWarnings("RawUseOfParameterized")
    public static void start(Class clazz) {
        try {

            boolean beforeSuiteDeclared = false;
            boolean afterSuiteDeclared = false;

            Method[] methods = clazz.getDeclaredMethods();
            List<Method> testMethodsList = new ArrayList<>();

            for (Method m : methods) {
                if (m.getAnnotation(Test.class) != null) {
                    testMethodsList.add(m);
                }
            }

            Method[] testMethods = new Method[testMethodsList.size()];
            testMethodsList.toArray(testMethods);

            for (Method method : testMethods) {
                if (method.getAnnotation(Test.class).priority() > 10
                        || method.getAnnotation(Test.class).priority() < 1)
                    throw new RuntimeException("The priority can only be in the range from 1 to 10");
            }

            for (int i = testMethods.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (testMethods[j].getAnnotation(Test.class).priority() > testMethods[j + 1].getAnnotation(Test.class).priority()) {
                        Method tmp = testMethods[j];
                        testMethods[j] = testMethods[j + 1];
                        testMethods[j + 1] = tmp;
                    }
                }
            }

            for (Method method : methods) {

                if (method.getAnnotation(BeforeSuite.class) != null) {
                    if (beforeSuiteDeclared)
                        throw new RuntimeException("The @BeforeSuite annotation can only exist in a single instance.");
                    beforeSuiteDeclared = true;
                }

                if (method.getAnnotation(AfterSuite.class) != null) {
                    if (afterSuiteDeclared)
                        throw new RuntimeException("The @AfterSuite annotation can only exist in a single instance.");
                    afterSuiteDeclared = true;
                }
            }

            for (Method m : methods) {
                if (m.getAnnotation(BeforeSuite.class) != null) {
                    m.invoke(null);
                }
            }

            for (Method m : methods) {
                if (m.getAnnotation(Test.class) != null) {
                    m.invoke(null);
                    System.out.printf("Method %s was \"tested\"%n", m.getName());
                }
            }

            for (Method m : methods) {
                if (m.getAnnotation(AfterSuite.class) != null) {
                    m.invoke(null);
                }
            }
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
