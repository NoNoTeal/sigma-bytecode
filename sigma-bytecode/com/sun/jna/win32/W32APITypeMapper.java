public class com.sun.jna.win32.W32APITypeMapper {
    public void W32APITypeMapper(boolean unicode) {
        var_4_13 : W32APITypeMapper$1
        
        invokespecial:DefaultTypeMapper(DefaultTypeMapper::<init>, this:W32APITypeMapper)
        
        if (unicode:boolean) {
            var_4_13 = initobject:W32APITypeMapper$1(W32APITypeMapper$1::<init>, this:W32APITypeMapper)
            invokevirtual:void(DefaultTypeMapper::addTypeConverter, this:W32APITypeMapper[expected:DefaultTypeMapper], ldc:Class<String>(java.lang.String.class), var_4_13:W32APITypeMapper$1[expected:TypeConverter])
            invokevirtual:void(DefaultTypeMapper::addToNativeConverter, this:W32APITypeMapper[expected:DefaultTypeMapper], ldc:Class<String[]>(java.lang.String[].class), var_4_13:W32APITypeMapper$1[expected:ToNativeConverter])
        }
        
        invokevirtual:void(DefaultTypeMapper::addTypeConverter, this:W32APITypeMapper[expected:DefaultTypeMapper], ldc:Class<Boolean>(java.lang.Boolean.class), initobject:W32APITypeMapper$2[expected:TypeConverter](W32APITypeMapper$2::<init>, this:W32APITypeMapper))
    }
    
    static {
        putstatic:TypeMapper(W32APITypeMapper::UNICODE, initobject:W32APITypeMapper[expected:TypeMapper](W32APITypeMapper::<init>, ldc:boolean(1)))
        putstatic:TypeMapper(W32APITypeMapper::ASCII, initobject:W32APITypeMapper[expected:TypeMapper](W32APITypeMapper::<init>, ldc:boolean(0)))
        putstatic:TypeMapper(W32APITypeMapper::DEFAULT, ternaryop:TypeMapper(invokestatic:boolean(Boolean::getBoolean, ldc:String("w32.ascii")), getstatic:TypeMapper(W32APITypeMapper::ASCII), getstatic:TypeMapper(W32APITypeMapper::UNICODE)))
    }
}
