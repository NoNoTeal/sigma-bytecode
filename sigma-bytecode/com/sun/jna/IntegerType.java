public abstract class com.sun.jna.IntegerType {
    public void IntegerType(int size) {
        invokespecial:IntegerType(IntegerType::<init>, this:IntegerType, size:int, ldc:long(0L), ldc:boolean(0))
    }
    
    public void IntegerType(int size, boolean unsigned) {
        invokespecial:IntegerType(IntegerType::<init>, this:IntegerType, size:int, ldc:long(0L), unsigned:boolean)
    }
    
    public void IntegerType(int size, long value) {
        invokespecial:IntegerType(IntegerType::<init>, this:IntegerType, size:int, value:long, ldc:boolean(0))
    }
    
    public void IntegerType(int size, long value, boolean unsigned) {
        invokespecial:Number(Number::<init>, this:IntegerType)
        putfield:int(IntegerType::size, this:IntegerType, size:int)
        putfield:boolean(IntegerType::unsigned, this:IntegerType, unsigned:boolean)
        invokevirtual:void(IntegerType::setValue, this:IntegerType, value:long)
    }
    
    public void setValue(long value) {
        var_5_04 : long
        var_7_E4 : long
        
        var_5_04 = value:long
        putfield:long(IntegerType::value, this:IntegerType, value:long)
        
        switch (getfield:int(IntegerType::size, this:IntegerType)) {
            case 1:
                if (getfield:boolean(IntegerType::unsigned, this:IntegerType)) {
                    putfield:long(IntegerType::value, this:IntegerType, and:long(value:long, ldc:long(255L)))
                }
                
                var_5_04 = i2l:long(i2b:byte[expected:int](l2i:int(value:long)))
                putfield:Number(IntegerType::number, this:IntegerType, invokestatic:Byte[expected:Number](Byte::valueOf, i2b:byte(l2i:int(value:long))))
                looporswitchbreak()
            
            case 2:
                if (getfield:boolean(IntegerType::unsigned, this:IntegerType)) {
                    putfield:long(IntegerType::value, this:IntegerType, and:long(value:long, ldc:long(65535L)))
                }
                
                var_5_04 = i2l:long(i2s:short[expected:int](l2i:int(value:long)))
                putfield:Number(IntegerType::number, this:IntegerType, invokestatic:Short[expected:Number](Short::valueOf, i2s:short(l2i:int(value:long))))
                looporswitchbreak()
            
            case 4:
                if (getfield:boolean(IntegerType::unsigned, this:IntegerType)) {
                    putfield:long(IntegerType::value, this:IntegerType, and:long(value:long, ldc:long(4294967295L)))
                }
                
                var_5_04 = i2l:long(l2i:int(value:long))
                putfield:Number(IntegerType::number, this:IntegerType, invokestatic:Integer[expected:Number](Integer::valueOf, l2i:int(value:long)))
                looporswitchbreak()
            
            case 8:
                putfield:Number(IntegerType::number, this:IntegerType, invokestatic:Long[expected:Number](Long::valueOf, value:long))
                looporswitchbreak()
            
            default:
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Unsupported size: ")), getfield:int(IntegerType::size, this:IntegerType)))))
        }
        
        if (cmplt:boolean(getfield:int(IntegerType::size, this:IntegerType), ldc:int(8))) {
            var_7_E4 = xor:long(sub:long(shl:long(ldc:long(1L), mul:int(getfield:int(IntegerType::size, this:IntegerType), ldc:int(8))), ldc:long(1L)), ldc:long(-1L))
            
            if (logicalor:boolean(logicaland:boolean(cmplt:boolean(value:long, ldc:long(0L)), cmpne:boolean(var_5_04:long, value:long)), logicaland:boolean(cmpge:boolean(value:long, ldc:long(0L)), cmpne:boolean(and:long(var_7_E4:long, value:long), ldc:long(0L))))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Argument value 0x")), invokestatic:String(Long::toHexString, value:long)), ldc:String(" exceeds native capacity (")), getfield:int(IntegerType::size, this:IntegerType)), ldc:String(" bytes) mask=0x")), invokestatic:String(Long::toHexString, var_7_E4:long)))))
            }
        }
    }
    
    public java.lang.Object toNative() {
        return:Object(getfield:Number[expected:Object](IntegerType::number, this:IntegerType))
    }
    
    public java.lang.Object fromNative(java.lang.Object nativeValue, com.sun.jna.FromNativeContext context) {
        var_5_12 : long
        var_7_1E : IntegerType
        
        var_5_12 = ternaryop:long(cmpeq:boolean(nativeValue:Object, aconstnull:Object()), ldc:long(0L), invokevirtual:long(Number::longValue, checkcast:Number(java.lang.Number.class, nativeValue:Object[expected:Number])))
        
        try {
            var_7_1E = checkcast:IntegerType(com.sun.jna.IntegerType.class, invokevirtual:? extends IntegerType[expected:IntegerType](Class<? extends IntegerType>::newInstance, invokevirtual:Class<? extends IntegerType>(IntegerType::getClass, this:IntegerType)))
            invokevirtual:void(IntegerType::setValue, var_7_1E:IntegerType, var_5_12:long)
            return:Object(var_7_1E:IntegerType[expected:Object])
        }
        catch (java.lang.InstantiationException var_7_2A) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Can't instantiate ")), invokevirtual:Class<? extends IntegerType>[expected:Object](IntegerType::getClass, this:IntegerType)))))
        }
        catch (java.lang.IllegalAccessException var_7_4A) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Not allowed to instantiate ")), invokevirtual:Class<? extends IntegerType>[expected:Object](IntegerType::getClass, this:IntegerType)))))
        }
    }
    
    public java.lang.Class<?> nativeType() {
        return:Class<?>(invokevirtual:Class<? extends Number>(Number::getClass, getfield:Number(IntegerType::number, this:IntegerType)))
    }
    
    public int intValue() {
        return:int(l2i:int(getfield:long(IntegerType::value, this:IntegerType)))
    }
    
    public long longValue() {
        return:long(getfield:long(IntegerType::value, this:IntegerType))
    }
    
    public float floatValue() {
        return:float(invokevirtual:float(Number::floatValue, getfield:Number(IntegerType::number, this:IntegerType)))
    }
    
    public double doubleValue() {
        return:double(invokevirtual:double(Number::doubleValue, getfield:Number(IntegerType::number, this:IntegerType)))
    }
    
    public boolean equals(java.lang.Object rhs) {
        return:boolean(logicaland:boolean(instanceof:boolean(com.sun.jna.IntegerType.class, rhs:Object), invokevirtual:boolean(Object::equals, getfield:Number[expected:Object](IntegerType::number, this:IntegerType), getfield:Number[expected:Object](IntegerType::number, checkcast:IntegerType(com.sun.jna.IntegerType.class, rhs:Object[expected:IntegerType])))))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(Object::toString, getfield:Number[expected:Object](IntegerType::number, this:IntegerType)))
    }
    
    public int hashCode() {
        return:int(invokevirtual:int(Object::hashCode, getfield:Number[expected:Object](IntegerType::number, this:IntegerType)))
    }
    
    public static int compare(T extends com.sun.jna.IntegerType v1, T extends com.sun.jna.IntegerType v2) {
        if (cmpeq:boolean(v1:T extends IntegerType, v2:T extends IntegerType)) {
            return:int(ldc:int(0))
        }
        
        if (cmpeq:boolean(v1:T extends IntegerType, aconstnull:T extends IntegerType())) {
            return:int(ldc:int(1))
        }
        
        if (cmpeq:boolean(v2:T extends IntegerType, aconstnull:T extends IntegerType())) {
            return:int(ldc:int(-1))
        }
        
        return:int(invokestatic:int(IntegerType::compare, invokevirtual:long(IntegerType::longValue, v1:T extends IntegerType[expected:IntegerType]), invokevirtual:long(IntegerType::longValue, v2:T extends IntegerType[expected:IntegerType])))
    }
    
    public static int compare(com.sun.jna.IntegerType v1, long v2) {
        if (cmpeq:boolean(v1:IntegerType, aconstnull:IntegerType())) {
            return:int(ldc:int(1))
        }
        
        return:int(invokestatic:int(IntegerType::compare, invokevirtual:long(IntegerType::longValue, v1:IntegerType), v2:long))
    }
    
    public static final int compare(long v1, long v2) {
        if (cmpeq:boolean(v1:long, v2:long)) {
            return:int(ldc:int(0))
        }
        
        if (cmplt:boolean(v1:long, v2:long)) {
            return:int(ldc:int(-1))
        }
        
        return:int(ldc:int(1))
    }
}
