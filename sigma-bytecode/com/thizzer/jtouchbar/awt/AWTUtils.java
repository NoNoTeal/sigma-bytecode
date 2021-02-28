public class com.thizzer.jtouchbar.awt.AWTUtils {
    public void AWTUtils() {
        invokespecial:Object(Object::<init>, this:AWTUtils)
    }
    
    public static long getViewPointer(java.awt.Component component) {
        var_3_0E : Exception
        
        if (cmpeq:boolean(component:Component, aconstnull:Component())) {
            return:long(ldc:long(0L))
        }
        
        try {
            return:long(invokestatic:long(JTouchBarJNI::getAWTViewPointer0, component:Component))
        }
        catch (java.lang.Exception var_3_0E) {
            athrow(initobject:RuntimeException(RuntimeException::<init>, var_3_0E:Exception[expected:Throwable]))
        }
    }
}
