public class com.sun.jna.DefaultTypeMapper {
    public void DefaultTypeMapper() {
        invokespecial:Object(Object::<init>, this:DefaultTypeMapper)
        putfield:List<DefaultTypeMapper$Entry>(DefaultTypeMapper::toNativeConverters, this:DefaultTypeMapper, initobject:ArrayList<DefaultTypeMapper$Entry>[expected:List<DefaultTypeMapper$Entry>](ArrayList<E>::<init>))
        putfield:List<DefaultTypeMapper$Entry>(DefaultTypeMapper::fromNativeConverters, this:DefaultTypeMapper, initobject:ArrayList<DefaultTypeMapper$Entry>[expected:List<DefaultTypeMapper$Entry>](ArrayList<E>::<init>))
    }
    
    private java.lang.Class<?> getAltClass(java.lang.Class<?> cls) {
        if (cmpeq:boolean(cls:Class<?>, ldc:Class<Boolean>(java.lang.Boolean.class))) {
            return:Class<?>(getstatic:Class<Boolean>(Boolean::TYPE))
        }
        
        if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Boolean>(Boolean::TYPE))) {
            return:Class<?>(ldc:Class<Boolean>(java.lang.Boolean.class))
        }
        
        if (cmpeq:boolean(cls:Class<?>, ldc:Class<Byte>(java.lang.Byte.class))) {
            return:Class<?>(getstatic:Class<Byte>(Byte::TYPE))
        }
        
        if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Byte>(Byte::TYPE))) {
            return:Class<?>(ldc:Class<Byte>(java.lang.Byte.class))
        }
        
        if (cmpeq:boolean(cls:Class<?>, ldc:Class<Character>(java.lang.Character.class))) {
            return:Class<?>(getstatic:Class<Character>(Character::TYPE))
        }
        
        if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Character>(Character::TYPE))) {
            return:Class<?>(ldc:Class<Character>(java.lang.Character.class))
        }
        
        if (cmpeq:boolean(cls:Class<?>, ldc:Class<Short>(java.lang.Short.class))) {
            return:Class<?>(getstatic:Class<Short>(Short::TYPE))
        }
        
        if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Short>(Short::TYPE))) {
            return:Class<?>(ldc:Class<Short>(java.lang.Short.class))
        }
        
        if (cmpeq:boolean(cls:Class<?>, ldc:Class<Integer>(java.lang.Integer.class))) {
            return:Class<?>(getstatic:Class<Integer>(Integer::TYPE))
        }
        
        if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Integer>(Integer::TYPE))) {
            return:Class<?>(ldc:Class<Integer>(java.lang.Integer.class))
        }
        
        if (cmpeq:boolean(cls:Class<?>, ldc:Class<Long>(java.lang.Long.class))) {
            return:Class<?>(getstatic:Class<Long>(Long::TYPE))
        }
        
        if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Long>(Long::TYPE))) {
            return:Class<?>(ldc:Class<Long>(java.lang.Long.class))
        }
        
        if (cmpeq:boolean(cls:Class<?>, ldc:Class<Float>(java.lang.Float.class))) {
            return:Class<?>(getstatic:Class<Float>(Float::TYPE))
        }
        
        if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Float>(Float::TYPE))) {
            return:Class<?>(ldc:Class<Float>(java.lang.Float.class))
        }
        
        if (cmpeq:boolean(cls:Class<?>, ldc:Class<Double>(java.lang.Double.class))) {
            return:Class<?>(getstatic:Class<Double>(Double::TYPE))
        }
        
        if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Double>(Double::TYPE))) {
            return:Class<?>(ldc:Class<Double>(java.lang.Double.class))
        }
        
        return:Class<?>(aconstnull:Class<?>())
    }
    
    public void addToNativeConverter(java.lang.Class<?> cls, com.sun.jna.ToNativeConverter converter) {
        var_5_1B : Class<?>
        
        invokeinterface:boolean(List<DefaultTypeMapper$Entry>::add, getfield:List<DefaultTypeMapper$Entry>(DefaultTypeMapper::toNativeConverters, this:DefaultTypeMapper), initobject:DefaultTypeMapper$Entry(DefaultTypeMapper$Entry::<init>, cls:Class<?>, converter:ToNativeConverter[expected:Object]))
        var_5_1B = invokespecial:Class<?>(DefaultTypeMapper::getAltClass, this:DefaultTypeMapper, cls:Class<?>)
        
        if (cmpne:boolean(var_5_1B:Class<?>, aconstnull:Class<?>())) {
            invokeinterface:boolean(List<DefaultTypeMapper$Entry>::add, getfield:List<DefaultTypeMapper$Entry>(DefaultTypeMapper::toNativeConverters, this:DefaultTypeMapper), initobject:DefaultTypeMapper$Entry(DefaultTypeMapper$Entry::<init>, var_5_1B:Class<?>, converter:ToNativeConverter[expected:Object]))
        }
    }
    
    public void addFromNativeConverter(java.lang.Class<?> cls, com.sun.jna.FromNativeConverter converter) {
        var_5_1B : Class<?>
        
        invokeinterface:boolean(List<DefaultTypeMapper$Entry>::add, getfield:List<DefaultTypeMapper$Entry>(DefaultTypeMapper::fromNativeConverters, this:DefaultTypeMapper), initobject:DefaultTypeMapper$Entry(DefaultTypeMapper$Entry::<init>, cls:Class<?>, converter:FromNativeConverter[expected:Object]))
        var_5_1B = invokespecial:Class<?>(DefaultTypeMapper::getAltClass, this:DefaultTypeMapper, cls:Class<?>)
        
        if (cmpne:boolean(var_5_1B:Class<?>, aconstnull:Class<?>())) {
            invokeinterface:boolean(List<DefaultTypeMapper$Entry>::add, getfield:List<DefaultTypeMapper$Entry>(DefaultTypeMapper::fromNativeConverters, this:DefaultTypeMapper), initobject:DefaultTypeMapper$Entry(DefaultTypeMapper$Entry::<init>, var_5_1B:Class<?>, converter:FromNativeConverter[expected:Object]))
        }
    }
    
    public void addTypeConverter(java.lang.Class<?> cls, com.sun.jna.TypeConverter converter) {
        invokevirtual:void(DefaultTypeMapper::addFromNativeConverter, this:DefaultTypeMapper, cls:Class<?>, converter:TypeConverter[expected:FromNativeConverter])
        invokevirtual:void(DefaultTypeMapper::addToNativeConverter, this:DefaultTypeMapper, cls:Class<?>, converter:TypeConverter[expected:ToNativeConverter])
    }
    
    private java.lang.Object lookupConverter(java.lang.Class<?> javaClass, java.util.Collection<? extends com.sun.jna.DefaultTypeMapper$Entry> converters) {
        var_5_09 : Iterator<? extends DefaultTypeMapper$Entry>
        var_6_1F : DefaultTypeMapper$Entry
        
        var_5_09 = invokeinterface:Iterator<? extends DefaultTypeMapper$Entry>(Collection<? extends DefaultTypeMapper$Entry>::iterator, converters:Collection<? extends DefaultTypeMapper$Entry>)
        
        while (invokeinterface:boolean(Iterator::hasNext, var_5_09:Iterator<? extends DefaultTypeMapper$Entry>)) {
            var_6_1F = checkcast:DefaultTypeMapper$Entry(com.sun.jna.DefaultTypeMapper$Entry.class, invokeinterface:? extends DefaultTypeMapper$Entry[expected:DefaultTypeMapper$Entry](Iterator<? extends DefaultTypeMapper$Entry>::next, var_5_09:Iterator<? extends DefaultTypeMapper$Entry>))
            
            if (invokevirtual:boolean(Class<T>::isAssignableFrom, getfield:Class<?>(DefaultTypeMapper$Entry::type, var_6_1F:DefaultTypeMapper$Entry), javaClass:Class<?>)) {
                return:Object(getfield:Object(DefaultTypeMapper$Entry::converter, var_6_1F:DefaultTypeMapper$Entry))
            }
        }
        
        return:Object(aconstnull:Object())
    }
    
    public com.sun.jna.FromNativeConverter getFromNativeConverter(java.lang.Class<?> javaType) {
        return:FromNativeConverter(checkcast:FromNativeConverter(com.sun.jna.FromNativeConverter.class, invokespecial:Object[expected:FromNativeConverter](DefaultTypeMapper::lookupConverter, this:DefaultTypeMapper, javaType:Class<?>, getfield:List<DefaultTypeMapper$Entry>[expected:Collection<? extends DefaultTypeMapper$Entry>](DefaultTypeMapper::fromNativeConverters, this:DefaultTypeMapper))))
    }
    
    public com.sun.jna.ToNativeConverter getToNativeConverter(java.lang.Class<?> javaType) {
        return:ToNativeConverter(checkcast:ToNativeConverter(com.sun.jna.ToNativeConverter.class, invokespecial:Object[expected:ToNativeConverter](DefaultTypeMapper::lookupConverter, this:DefaultTypeMapper, javaType:Class<?>, getfield:List<DefaultTypeMapper$Entry>[expected:Collection<? extends DefaultTypeMapper$Entry>](DefaultTypeMapper::toNativeConverters, this:DefaultTypeMapper))))
    }
}
