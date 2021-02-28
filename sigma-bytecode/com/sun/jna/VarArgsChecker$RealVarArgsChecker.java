public final class com.sun.jna.VarArgsChecker$RealVarArgsChecker {
    private void VarArgsChecker$RealVarArgsChecker() {
        invokespecial:VarArgsChecker(VarArgsChecker::<init>, this:VarArgsChecker$RealVarArgsChecker, aconstnull:VarArgsChecker$1())
    }
    
    public boolean isVarArgs(java.lang.reflect.Method m) {
        return:boolean(invokevirtual:boolean(Method::isVarArgs, m:Method))
    }
    
    public int fixedArgs(java.lang.reflect.Method m) {
        return:int(ternaryop:int(invokevirtual:boolean(Method::isVarArgs, m:Method), sub:int(arraylength:int(invokevirtual:Class<?>[](Method::getParameterTypes, m:Method)), ldc:int(1)), ldc:int(0)))
    }
    
    public void VarArgsChecker$RealVarArgsChecker(com.sun.jna.VarArgsChecker$1 x0) {
        invokespecial:VarArgsChecker$RealVarArgsChecker(VarArgsChecker$RealVarArgsChecker::<init>, this:VarArgsChecker$RealVarArgsChecker)
    }
}
