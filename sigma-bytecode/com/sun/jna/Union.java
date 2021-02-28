public abstract class com.sun.jna.Union {
    public void Union() {
        invokespecial:Structure(Structure::<init>, this:Union)
    }
    
    public void Union(com.sun.jna.Pointer p) {
        invokespecial:Structure(Structure::<init>, this:Union, p:Pointer)
    }
    
    public void Union(com.sun.jna.Pointer p, int alignType) {
        invokespecial:Structure(Structure::<init>, this:Union, p:Pointer, alignType:int)
    }
    
    public void Union(com.sun.jna.TypeMapper mapper) {
        invokespecial:Structure(Structure::<init>, this:Union, mapper:TypeMapper)
    }
    
    public void Union(com.sun.jna.Pointer p, int alignType, com.sun.jna.TypeMapper mapper) {
        invokespecial:Structure(Structure::<init>, this:Union, p:Pointer, alignType:int, mapper:TypeMapper)
    }
    
    public java.util.List<java.lang.String> getFieldOrder() {
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
    
    public void setType(java.lang.Class<?> type) {
        var_4_15 : Iterator<Structure$StructField>
        var_5_2B : Structure$StructField
        
        invokevirtual:void(Structure::ensureAllocated, this:Union[expected:Structure])
        var_4_15 = invokeinterface:Iterator<Structure$StructField>(Collection<Structure$StructField>::iterator, invokeinterface:Collection<Structure$StructField>(Map<String, Structure$StructField>::values, invokevirtual:Map<String, Structure$StructField>(Structure::fields, this:Union[expected:Structure])))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_15:Iterator<Structure$StructField>)) {
            var_5_2B = checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Iterator<Structure$StructField>::next, var_4_15:Iterator<Structure$StructField>))
            
            if (cmpeq:boolean(getfield:Class<?>(Structure$StructField::type, var_5_2B:Structure$StructField), type:Class<?>)) {
                putfield:Structure$StructField(Union::activeField, this:Union, var_5_2B:Structure$StructField)
                return:void()
            }
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("No field of type ")), type:Class<?>[expected:Object]), ldc:String(" in ")), this:Union[expected:Object]))))
    }
    
    public void setType(java.lang.String fieldName) {
        var_4_14 : Structure$StructField
        
        invokevirtual:void(Structure::ensureAllocated, this:Union[expected:Structure])
        var_4_14 = checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Map<String, Structure$StructField>::get, invokevirtual:Map<String, Structure$StructField>(Structure::fields, this:Union[expected:Structure]), fieldName:String[expected:Object]))
        
        if (cmpne:boolean(var_4_14:Structure$StructField, aconstnull:Structure$StructField())) {
            putfield:Structure$StructField(Union::activeField, this:Union, var_4_14:Structure$StructField)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("No field named ")), fieldName:String), ldc:String(" in ")), this:Union[expected:Object]))))
    }
    
    public java.lang.Object readField(java.lang.String fieldName) {
        invokevirtual:void(Structure::ensureAllocated, this:Union[expected:Structure])
        invokevirtual:void(Union::setType, this:Union, fieldName:String)
        return:Object(invokespecial:Object(Structure::readField, this:Union[expected:Structure], fieldName:String))
    }
    
    public void writeField(java.lang.String fieldName) {
        invokevirtual:void(Structure::ensureAllocated, this:Union[expected:Structure])
        invokevirtual:void(Union::setType, this:Union, fieldName:String)
        invokespecial:void(Structure::writeField, this:Union[expected:Structure], fieldName:String)
    }
    
    public void writeField(java.lang.String fieldName, java.lang.Object value) {
        invokevirtual:void(Structure::ensureAllocated, this:Union[expected:Structure])
        invokevirtual:void(Union::setType, this:Union, fieldName:String)
        invokespecial:void(Structure::writeField, this:Union[expected:Structure], fieldName:String, value:Object)
    }
    
    public java.lang.Object getTypedValue(java.lang.Class<?> type) {
        var_4_15 : Iterator<Structure$StructField>
        var_5_2B : Structure$StructField
        
        invokevirtual:void(Structure::ensureAllocated, this:Union[expected:Structure])
        var_4_15 = invokeinterface:Iterator<Structure$StructField>(Collection<Structure$StructField>::iterator, invokeinterface:Collection<Structure$StructField>(Map<String, Structure$StructField>::values, invokevirtual:Map<String, Structure$StructField>(Structure::fields, this:Union[expected:Structure])))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_15:Iterator<Structure$StructField>)) {
            var_5_2B = checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Iterator<Structure$StructField>::next, var_4_15:Iterator<Structure$StructField>))
            
            if (cmpeq:boolean(getfield:Class<?>(Structure$StructField::type, var_5_2B:Structure$StructField), type:Class<?>)) {
                putfield:Structure$StructField(Union::activeField, this:Union, var_5_2B:Structure$StructField)
                invokevirtual:void(Structure::read, this:Union[expected:Structure])
                return:Object(invokevirtual:Object(Structure::getFieldValue, this:Union[expected:Structure], getfield:Field(Structure$StructField::field, getfield:Structure$StructField(Union::activeField, this:Union))))
            }
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("No field of type ")), type:Class<?>[expected:Object]), ldc:String(" in ")), this:Union[expected:Object]))))
    }
    
    public java.lang.Object setTypedValue(java.lang.Object object) {
        var_4_0B : Structure$StructField
        
        var_4_0B = invokespecial:Structure$StructField(Union::findField, this:Union, invokevirtual:Class<?>(Object::getClass, object:Object))
        
        if (cmpne:boolean(var_4_0B:Structure$StructField, aconstnull:Structure$StructField())) {
            putfield:Structure$StructField(Union::activeField, this:Union, var_4_0B:Structure$StructField)
            invokevirtual:void(Structure::setFieldValue, this:Union[expected:Structure], getfield:Field(Structure$StructField::field, var_4_0B:Structure$StructField), object:Object)
            return:Object(this:Union[expected:Object])
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("No field of type ")), invokevirtual:Class<?>[expected:Object](Object::getClass, object:Object)), ldc:String(" in ")), this:Union[expected:Object]))))
    }
    
    private com.sun.jna.Structure$StructField findField(java.lang.Class<?> type) {
        var_4_15 : Iterator<Structure$StructField>
        var_5_2B : Structure$StructField
        
        invokevirtual:void(Structure::ensureAllocated, this:Union[expected:Structure])
        var_4_15 = invokeinterface:Iterator<Structure$StructField>(Collection<Structure$StructField>::iterator, invokeinterface:Collection<Structure$StructField>(Map<String, Structure$StructField>::values, invokevirtual:Map<String, Structure$StructField>(Structure::fields, this:Union[expected:Structure])))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_15:Iterator<Structure$StructField>)) {
            var_5_2B = checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Iterator<Structure$StructField>::next, var_4_15:Iterator<Structure$StructField>))
            
            if (invokevirtual:boolean(Class<T>::isAssignableFrom, getfield:Class<?>(Structure$StructField::type, var_5_2B:Structure$StructField), type:Class<?>)) {
                return:Structure$StructField(var_5_2B:Structure$StructField)
            }
        }
        
        return:Structure$StructField(aconstnull:Structure$StructField())
    }
    
    public void writeField(com.sun.jna.Structure$StructField field) {
        if (cmpeq:boolean(field:Structure$StructField, getfield:Structure$StructField(Union::activeField, this:Union))) {
            invokespecial:void(Structure::writeField, this:Union[expected:Structure], field:Structure$StructField)
        }
    }
    
    public java.lang.Object readField(com.sun.jna.Structure$StructField field) {
        if (logicalor:boolean(cmpeq:boolean(field:Structure$StructField, getfield:Structure$StructField(Union::activeField, this:Union)), logicalnot:boolean(logicalor:boolean(logicalor:boolean(invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure>(com.sun.jna.Structure.class), getfield:Class<?>(Structure$StructField::type, field:Structure$StructField)), invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<String>(java.lang.String.class), getfield:Class<?>(Structure$StructField::type, field:Structure$StructField))), invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<WString>(com.sun.jna.WString.class), getfield:Class<?>(Structure$StructField::type, field:Structure$StructField)))))) {
            return:Object(invokespecial:Object(Structure::readField, this:Union[expected:Structure], field:Structure$StructField))
        }
        
        return:Object(aconstnull:Object())
    }
    
    public int getNativeAlignment(java.lang.Class<?> type, java.lang.Object value, boolean isFirstElement) {
        return:int(invokespecial:int(Structure::getNativeAlignment, this:Union[expected:Structure], type:Class<?>, value:Object, ldc:boolean(1)))
    }
}
