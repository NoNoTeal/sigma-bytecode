public class com.sun.jna.win32.W32APITypeMapper$1 {
    public void W32APITypeMapper$1(com.sun.jna.win32.W32APITypeMapper this$0) {
        putfield:W32APITypeMapper(W32APITypeMapper$1::this$0, this:W32APITypeMapper$1, this$0:W32APITypeMapper)
        invokespecial:Object(Object::<init>, this:W32APITypeMapper$1)
    }
    
    public java.lang.Object toNative(java.lang.Object value, com.sun.jna.ToNativeContext context) {
        if (cmpeq:boolean(value:Object, aconstnull:Object())) {
            return:Object(aconstnull:Object())
        }
        
        if (instanceof:boolean(java.lang.String[].class, value:Object)) {
            return:Object(initobject:StringArray[expected:Object](StringArray::<init>, checkcast:String[](java.lang.String[].class, checkcast:String[](java.lang.String[].class, value:Object[expected:String[]])), ldc:boolean(1)))
        }
        
        return:Object(initobject:WString[expected:Object](WString::<init>, invokevirtual:String(Object::toString, value:Object)))
    }
    
    public java.lang.Object fromNative(java.lang.Object value, com.sun.jna.FromNativeContext context) {
        if (cmpeq:boolean(value:Object, aconstnull:Object())) {
            return:Object(aconstnull:Object())
        }
        
        return:Object(invokevirtual:String[expected:Object](Object::toString, value:Object))
    }
    
    public java.lang.Class<?> nativeType() {
        return:Class<?>(ldc:Class<WString>(com.sun.jna.WString.class))
    }
}
