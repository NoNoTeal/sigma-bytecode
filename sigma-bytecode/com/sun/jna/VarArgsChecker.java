public abstract class com.sun.jna.VarArgsChecker {
    private void VarArgsChecker() {
        invokespecial:Object(Object::<init>, this:VarArgsChecker)
    }
    
    public static com.sun.jna.VarArgsChecker create() {
        try {
            if (cmpne:boolean(invokevirtual:Method(Class<T>::getMethod, ldc:Class<Method>(java.lang.reflect.Method.class), ldc:String("isVarArgs"), newarray:Class[](java.lang.Class.class, ldc:int(0))), aconstnull:Method())) {
                return:VarArgsChecker(initobject:VarArgsChecker$RealVarArgsChecker[expected:VarArgsChecker](VarArgsChecker$RealVarArgsChecker::<init>, aconstnull:VarArgsChecker$1()))
            }
            
            return:VarArgsChecker(initobject:VarArgsChecker$NoVarArgsChecker[expected:VarArgsChecker](VarArgsChecker$NoVarArgsChecker::<init>, aconstnull:VarArgsChecker$1()))
        }
        catch (java.lang.NoSuchMethodException var_2_25) {
            return:VarArgsChecker(initobject:VarArgsChecker$NoVarArgsChecker[expected:VarArgsChecker](VarArgsChecker$NoVarArgsChecker::<init>, aconstnull:VarArgsChecker$1()))
        }
        catch (java.lang.SecurityException var_2_2F) {
            return:VarArgsChecker(initobject:VarArgsChecker$NoVarArgsChecker[expected:VarArgsChecker](VarArgsChecker$NoVarArgsChecker::<init>, aconstnull:VarArgsChecker$1()))
        }
    }
    
    public abstract boolean isVarArgs(java.lang.reflect.Method p0);
    
    public abstract int fixedArgs(java.lang.reflect.Method p0);
    
    public void VarArgsChecker(com.sun.jna.VarArgsChecker$1 x0) {
        invokespecial:VarArgsChecker(VarArgsChecker::<init>, this:VarArgsChecker)
    }
}
