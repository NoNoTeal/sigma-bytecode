public class com.sun.jna.Native$AWT {
    private void Native$AWT() {
        invokespecial:Object(Object::<init>, this:Native$AWT)
    }
    
    public static long getWindowID(java.awt.Window w) {
        return:long(invokestatic:long(Native$AWT::getComponentID, w:Window[expected:Object]))
    }
    
    public static long getComponentID(java.lang.Object o) {
        var_3_17 : Component
        
        if (invokestatic:boolean(GraphicsEnvironment::isHeadless)) {
            athrow(initobject:HeadlessException(HeadlessException::<init>, ldc:String("No native windows when headless")))
        }
        
        var_3_17 = checkcast:Component(java.awt.Component.class, o:Object[expected:Component])
        
        if (invokevirtual:boolean(Component::isLightweight, var_3_17:Component)) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("Component must be heavyweight")))
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(Component::isDisplayable, var_3_17:Component))) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("Component must be displayable")))
        }
        
        if (logicaland:boolean(logicaland:boolean(invokestatic:boolean(Platform::isX11), invokevirtual:boolean(String::startsWith, invokestatic:String(System::getProperty, ldc:String("java.version")), ldc:String("1.4"))), logicalnot:boolean(invokevirtual:boolean(Component::isVisible, var_3_17:Component)))) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("Component must be visible")))
        }
        
        return:long(invokestatic:long(Native::getWindowHandle0, var_3_17:Component))
    }
}
