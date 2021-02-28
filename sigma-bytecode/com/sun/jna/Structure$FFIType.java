public class com.sun.jna.Structure$FFIType {
    private void Structure$FFIType(com.sun.jna.Structure ref) {
        var_4_20 : Structure$StructField
        var_5_3E : Pointer[]
        els : Pointer[]
        var_6_64 : Iterator<Structure$StructField>
        
        invokespecial:Structure(Structure::<init>, this:Structure$FFIType)
        putfield:short(Structure$FFIType::type, this:Structure$FFIType, ldc:short(13))
        invokestatic:void(Structure::access$1900, ref:Structure, ldc:boolean(1))
        
        if (instanceof:boolean(com.sun.jna.Union.class, ref:Structure)) {
            var_4_20 = invokevirtual:Structure$StructField(Structure::typeInfoField, checkcast:Union[expected:Structure](com.sun.jna.Union.class, ref:Structure[expected:Union]))
            var_5_3E = initarray:Pointer[](com.sun.jna.Pointer[].class, invokestatic:Pointer(Structure$FFIType::get, invokevirtual:Object(Structure::getFieldValue, ref:Structure, getfield:Field(Structure$StructField::field, var_4_20:Structure$StructField)), getfield:Class<?>(Structure$StructField::type, var_4_20:Structure$StructField)), aconstnull:Pointer())
        }
        else {
            var_5_3E = newarray:Pointer[](com.sun.jna.Pointer.class, add:int(invokeinterface:int(Map<K, V>::size, invokevirtual:Map<String, Structure$StructField>(Structure::fields, ref:Structure)), ldc:int(1)))
            els = ldc:int[expected:Pointer[]](0)
            var_6_64 = invokeinterface:Iterator<Structure$StructField>(Collection<Structure$StructField>::iterator, invokeinterface:Collection<Structure$StructField>(Map<String, Structure$StructField>::values, invokevirtual:Map<String, Structure$StructField>(Structure::fields, ref:Structure)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_64:Iterator<Structure$StructField>)) {
                storeelement:Pointer(var_5_3E:Pointer[], postincrement:Pointer[][expected:int](1, els:Pointer[]), invokevirtual:Pointer(Structure::getFieldTypeInfo, ref:Structure, checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Iterator<Structure$StructField>::next, var_6_64:Iterator<Structure$StructField>))))
            }
        }
        
        invokespecial:void(Structure$FFIType::init, this:Structure$FFIType, var_5_3E:Pointer[])
    }
    
    private void Structure$FFIType(java.lang.Object array, java.lang.Class<?> type) {
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
    
    public java.util.List<java.lang.String> getFieldOrder() {
        return:List<String>(invokestatic:List<String>(Arrays::asList, initarray:String[](java.lang.String[].class, ldc:String("size"), ldc:String("alignment"), ldc:String("type"), ldc:String("elements"))))
    }
    
    private void init(com.sun.jna.Pointer[] els) {
        invokevirtual:void(Pointer::write, putfield:Pointer(Structure$FFIType::elements, this:Structure$FFIType, initobject:Memory[expected:Pointer](Memory::<init>, i2l:long(mul:int(getstatic:int(Pointer::SIZE), arraylength:int(els:Pointer[]))))), ldc:long(0L), els:Pointer[], ldc:int(0), arraylength:int(els:Pointer[]))
        invokevirtual:void(Structure::write, this:Structure$FFIType[expected:Structure])
    }
    
    public static com.sun.jna.Pointer get(java.lang.Object obj) {
        if (cmpeq:boolean(obj:Object, aconstnull:Object())) {
            return:Pointer(invokestatic:Pointer(Structure$FFIType$FFITypes::access$1800))
        }
        
        if (instanceof:boolean(java.lang.Class.class, obj:Object)) {
            return:Pointer(invokestatic:Pointer(Structure$FFIType::get, aconstnull:Object(), checkcast:Class(java.lang.Class.class, obj:Object[expected:Class<?>])))
        }
        
        return:Pointer(invokestatic:Pointer(Structure$FFIType::get, obj:Object, invokevirtual:Class<?>(Object::getClass, obj:Object)))
    }
    
    private static com.sun.jna.Pointer get(java.lang.Object obj, java.lang.Class<?> cls) {
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
    
    public static com.sun.jna.Pointer access$800(java.lang.Object x0, java.lang.Class x1) {
        return:Pointer(invokestatic:Pointer(Structure$FFIType::get, x0:Object, x1:Class<?>))
    }
    
    static {
        var_2_F4 : Pointer
        
        putstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap, initobject:WeakHashMap<Object, Object>[expected:Map<Object, Object>](WeakHashMap<K, V>::<init>))
        
        if (cmpeq:boolean(getstatic:int(Native::POINTER_SIZE), ldc:int(0))) {
            athrow(initobject:Error(Error::<init>, ldc:String("Native library not initialized")))
        }
        
        if (cmpeq:boolean(invokestatic:Pointer(Structure$FFIType$FFITypes::access$900), aconstnull:Pointer())) {
            athrow(initobject:Error(Error::<init>, ldc:String("FFI types not initialized")))
        }
        
        invokeinterface:Pointer(Map<Class<Void>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), getstatic:Class<Void>(Void::TYPE), invokestatic:Pointer(Structure$FFIType$FFITypes::access$900))
        invokeinterface:Pointer(Map<Class<Void>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<Void>(java.lang.Void.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$900))
        invokeinterface:Pointer(Map<Class<Float>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), getstatic:Class<Float>(Float::TYPE), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1000))
        invokeinterface:Pointer(Map<Class<Float>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<Float>(java.lang.Float.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1000))
        invokeinterface:Pointer(Map<Class<Double>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), getstatic:Class<Double>(Double::TYPE), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1100))
        invokeinterface:Pointer(Map<Class<Double>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<Double>(java.lang.Double.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1100))
        invokeinterface:Pointer(Map<Class<Long>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), getstatic:Class<Long>(Long::TYPE), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1200))
        invokeinterface:Pointer(Map<Class<Long>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<Long>(java.lang.Long.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1200))
        invokeinterface:Pointer(Map<Class<Integer>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), getstatic:Class<Integer>(Integer::TYPE), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1300))
        invokeinterface:Pointer(Map<Class<Integer>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<Integer>(java.lang.Integer.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1300))
        invokeinterface:Pointer(Map<Class<Short>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), getstatic:Class<Short>(Short::TYPE), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1400))
        invokeinterface:Pointer(Map<Class<Short>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<Short>(java.lang.Short.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1400))
        var_2_F4 = ternaryop:Pointer(cmpeq:boolean(getstatic:int(Native::WCHAR_SIZE), ldc:int(2)), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1500), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1600))
        invokeinterface:Pointer(Map<Class<Character>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), getstatic:Class<Character>(Character::TYPE), var_2_F4:Pointer)
        invokeinterface:Pointer(Map<Class<Character>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<Character>(java.lang.Character.class), var_2_F4:Pointer)
        invokeinterface:Pointer(Map<Class<Byte>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), getstatic:Class<Byte>(Byte::TYPE), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1700))
        invokeinterface:Pointer(Map<Class<Byte>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<Byte>(java.lang.Byte.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1700))
        invokeinterface:Pointer(Map<Class<Pointer>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<Pointer>(com.sun.jna.Pointer.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1800))
        invokeinterface:Pointer(Map<Class<String>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<String>(java.lang.String.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1800))
        invokeinterface:Pointer(Map<Class<WString>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<WString>(com.sun.jna.WString.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1800))
        invokeinterface:Pointer(Map<Class<Boolean>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), getstatic:Class<Boolean>(Boolean::TYPE), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1600))
        invokeinterface:Pointer(Map<Class<Boolean>, Pointer>::put, getstatic:Map<Object, Object>(Structure$FFIType::typeInfoMap), ldc:Class<Boolean>(java.lang.Boolean.class), invokestatic:Pointer(Structure$FFIType$FFITypes::access$1600))
    }
}
