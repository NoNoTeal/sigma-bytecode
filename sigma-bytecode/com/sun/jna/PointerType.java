public abstract class com.sun.jna.PointerType {
    public void PointerType() {
        invokespecial:Object(Object::<init>, this:PointerType)
        putfield:Pointer(PointerType::pointer, this:PointerType, getstatic:Pointer(Pointer::NULL))
    }
    
    public void PointerType(com.sun.jna.Pointer p) {
        invokespecial:Object(Object::<init>, this:PointerType)
        putfield:Pointer(PointerType::pointer, this:PointerType, p:Pointer)
    }
    
    public java.lang.Class<?> nativeType() {
        return:Class<?>(ldc:Class<Pointer>(com.sun.jna.Pointer.class))
    }
    
    public java.lang.Object toNative() {
        return:Object(invokevirtual:Pointer[expected:Object](PointerType::getPointer, this:PointerType))
    }
    
    public com.sun.jna.Pointer getPointer() {
        return:Pointer(getfield:Pointer(PointerType::pointer, this:PointerType))
    }
    
    public void setPointer(com.sun.jna.Pointer p) {
        putfield:Pointer(PointerType::pointer, this:PointerType, p:Pointer)
    }
    
    public java.lang.Object fromNative(java.lang.Object nativeValue, com.sun.jna.FromNativeContext context) {
        var_5_13 : PointerType
        
        if (cmpeq:boolean(nativeValue:Object, aconstnull:Object())) {
            return:Object(aconstnull:Object())
        }
        
        try {
            var_5_13 = checkcast:PointerType(com.sun.jna.PointerType.class, invokevirtual:? extends PointerType[expected:PointerType](Class<? extends PointerType>::newInstance, invokevirtual:Class<? extends PointerType>(PointerType::getClass, this:PointerType)))
            putfield:Pointer(PointerType::pointer, var_5_13:PointerType, checkcast:Pointer(com.sun.jna.Pointer.class, nativeValue:Object[expected:Pointer]))
            return:Object(var_5_13:PointerType[expected:Object])
        }
        catch (java.lang.InstantiationException var_5_21) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Can't instantiate ")), invokevirtual:Class<? extends PointerType>[expected:Object](PointerType::getClass, this:PointerType)))))
        }
        catch (java.lang.IllegalAccessException var_5_41) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Not allowed to instantiate ")), invokevirtual:Class<? extends PointerType>[expected:Object](PointerType::getClass, this:PointerType)))))
        }
    }
    
    public int hashCode() {
        return:int(ternaryop:int(cmpne:boolean(getfield:Pointer(PointerType::pointer, this:PointerType), aconstnull:Pointer()), invokevirtual:int(Pointer::hashCode, getfield:Pointer(PointerType::pointer, this:PointerType)), ldc:int(0)))
    }
    
    public boolean equals(java.lang.Object o) {
        var_4_18 : Pointer
        
        if (cmpeq:boolean(o:Object, this:PointerType[expected:Object])) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(com.sun.jna.PointerType.class, o:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_18 = invokevirtual:Pointer(PointerType::getPointer, checkcast:PointerType(com.sun.jna.PointerType.class, o:Object[expected:PointerType]))
        
        if (cmpeq:boolean(getfield:Pointer(PointerType::pointer, this:PointerType), aconstnull:Pointer())) {
            return:boolean(cmpeq:boolean(var_4_18:Pointer, aconstnull:Pointer()))
        }
        
        return:boolean(invokevirtual:boolean(Pointer::equals, getfield:Pointer(PointerType::pointer, this:PointerType), var_4_18:Pointer[expected:Object]))
    }
    
    public java.lang.String toString() {
        return:String(ternaryop:String(cmpeq:boolean(getfield:Pointer(PointerType::pointer, this:PointerType), aconstnull:Pointer()), ldc:String("NULL"), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(Pointer::toString, getfield:Pointer(PointerType::pointer, this:PointerType))), ldc:String(" (")), invokespecial:String(Object::toString, this:PointerType[expected:Object])), ldc:String(")")))))
    }
}
