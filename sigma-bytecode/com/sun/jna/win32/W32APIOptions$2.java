public final class com.sun.jna.win32.W32APIOptions$2 {
    public void W32APIOptions$2() {
        invokespecial:HashMap(HashMap::<init>, this:W32APIOptions$2)
        invokevirtual:TypeMapper(HashMap<String, TypeMapper>::put, this:W32APIOptions$2[expected:HashMap<String, TypeMapper>], ldc:String("type-mapper"), getstatic:TypeMapper(W32APITypeMapper::ASCII))
        invokevirtual:FunctionMapper(HashMap<String, FunctionMapper>::put, this:W32APIOptions$2[expected:HashMap<String, FunctionMapper>], ldc:String("function-mapper"), getstatic:FunctionMapper(W32APIFunctionMapper::ASCII))
    }
}
