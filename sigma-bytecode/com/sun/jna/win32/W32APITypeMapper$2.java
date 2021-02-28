public class com.sun.jna.win32.W32APITypeMapper$2 {
    public void W32APITypeMapper$2(com.sun.jna.win32.W32APITypeMapper this$0) {
        putfield:W32APITypeMapper(W32APITypeMapper$2::this$0, this:W32APITypeMapper$2, this$0:W32APITypeMapper)
        invokespecial:Object(Object::<init>, this:W32APITypeMapper$2)
    }
    
    public java.lang.Object toNative(java.lang.Object value, com.sun.jna.ToNativeContext context) {
        return:Object(invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:boolean[expected:int](Boolean::equals, getstatic:Boolean(Boolean::TRUE), value:Object)))
    }
    
    public java.lang.Object fromNative(java.lang.Object value, com.sun.jna.FromNativeContext context) {
        return:Object(ternaryop:Boolean[expected:Object](cmpne:boolean(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, value:Object[expected:Integer])), ldc:int(0)), getstatic:Boolean(Boolean::TRUE), getstatic:Boolean(Boolean::FALSE)))
    }
    
    public java.lang.Class<?> nativeType() {
        return:Class<?>(ldc:Class<Integer>(java.lang.Integer.class))
    }
}
