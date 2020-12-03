package com.ly.testt;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

/**
 * Created by Alex on 12/3/20
 */
public class InjectUtils {
    public static void injectInit(Activity activity) {
        Class<? extends Activity> aClass = activity.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field f : declaredFields) {
            if (f.isAnnotationPresent(InjectView.class)) {
                InjectView annotation = f.getAnnotation(InjectView.class);
                int id = annotation.value();
                View v = activity.findViewById(id);
                boolean is = f.isAccessible();
                f.setAccessible(true); //设置访问权限，允许操作private的属性
                try {
                    f.set(activity, v);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
