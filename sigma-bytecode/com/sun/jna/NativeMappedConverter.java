public class com.sun.jna.NativeMappedConverter {
    public static com.sun.jna.NativeMappedConverter getInstance(java.lang.Class<?> cls) {
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:136)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void NativeMappedConverter(java.lang.Class<?> type) {
        invokespecial:Object(Object::<init>, this:NativeMappedConverter)
        
        if (logicalnot:boolean(invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<NativeMapped>(com.sun.jna.NativeMapped.class), type:Class<?>))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Type must derive from ")), ldc:Class<NativeMapped>[expected:Object](com.sun.jna.NativeMapped.class)))))
        }
        
        putfield:Class<?>(NativeMappedConverter::type, this:NativeMappedConverter, type:Class<?>)
        putfield:NativeMapped(NativeMappedConverter::instance, this:NativeMappedConverter, invokevirtual:NativeMapped(NativeMappedConverter::defaultValue, this:NativeMappedConverter))
        putfield:Class<?>(NativeMappedConverter::nativeType, this:NativeMappedConverter, invokeinterface:Class<?>(NativeMapped::nativeType, getfield:NativeMapped(NativeMappedConverter::instance, this:NativeMappedConverter)))
    }
    
    public com.sun.jna.NativeMapped defaultValue() {
        var_3_0E : InstantiationException
        var_3_3A : IllegalAccessException
        
        try {
            return:NativeMapped(checkcast:NativeMapped(com.sun.jna.NativeMapped.class, invokevirtual:?[expected:NativeMapped](Class<?>::newInstance, getfield:Class<?>(NativeMappedConverter::type, this:NativeMappedConverter))))
        }
        catch (java.lang.InstantiationException var_3_0E) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Can't create an instance of ")), getfield:Class<?>[expected:Object](NativeMappedConverter::type, this:NativeMappedConverter)), ldc:String(", requires a no-arg constructor: ")), var_3_0E:InstantiationException[expected:Object]))))
        }
        catch (java.lang.IllegalAccessException var_3_3A) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Not allowed to create an instance of ")), getfield:Class<?>[expected:Object](NativeMappedConverter::type, this:NativeMappedConverter)), ldc:String(", requires a public, no-arg constructor: ")), var_3_3A:IllegalAccessException[expected:Object]))))
        }
    }
    
    public java.lang.Object fromNative(java.lang.Object nativeValue, com.sun.jna.FromNativeContext context) {
        return:Object(invokeinterface:Object(NativeMapped::fromNative, getfield:NativeMapped(NativeMappedConverter::instance, this:NativeMappedConverter), nativeValue:Object, context:FromNativeContext))
    }
    
    public java.lang.Class<?> nativeType() {
        return:Class<?>(getfield:Class<?>(NativeMappedConverter::nativeType, this:NativeMappedConverter))
    }
    
    public java.lang.Object toNative(java.lang.Object value, com.sun.jna.ToNativeContext context) {
        if (cmpeq:boolean(value:Object, aconstnull:Object())) {
            if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Pointer>(com.sun.jna.Pointer.class), getfield:Class<?>(NativeMappedConverter::nativeType, this:NativeMappedConverter))) {
                return:Object(aconstnull:Object())
            }
            
            value = invokevirtual:NativeMapped[expected:Object](NativeMappedConverter::defaultValue, this:NativeMappedConverter)
        }
        
        return:Object(invokeinterface:Object(NativeMapped::toNative, checkcast:NativeMapped(com.sun.jna.NativeMapped.class, value:Object[expected:NativeMapped])))
    }
    
    static {
        putstatic:Map<Class<?>, Reference<NativeMappedConverter>>(NativeMappedConverter::converters, initobject:WeakHashMap<Class<?>, Reference<NativeMappedConverter>>[expected:Map<Class<?>, Reference<NativeMappedConverter>>](WeakHashMap<K, V>::<init>))
    }
}
