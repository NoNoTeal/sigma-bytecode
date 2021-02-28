public abstract class com.sun.jna.Structure {
    public void Structure() {
        invokespecial:Structure(Structure::<init>, this:Structure, ldc:int(0))
    }
    
    public void Structure(com.sun.jna.TypeMapper mapper) {
        invokespecial:Structure(Structure::<init>, this:Structure, aconstnull:Pointer(), ldc:int(0), mapper:TypeMapper)
    }
    
    public void Structure(int alignType) {
        invokespecial:Structure(Structure::<init>, this:Structure, aconstnull:Pointer(), alignType:int)
    }
    
    public void Structure(int alignType, com.sun.jna.TypeMapper mapper) {
        invokespecial:Structure(Structure::<init>, this:Structure, aconstnull:Pointer(), alignType:int, mapper:TypeMapper)
    }
    
    public void Structure(com.sun.jna.Pointer p) {
        invokespecial:Structure(Structure::<init>, this:Structure, p:Pointer, ldc:int(0))
    }
    
    public void Structure(com.sun.jna.Pointer p, int alignType) {
        invokespecial:Structure(Structure::<init>, this:Structure, p:Pointer, alignType:int, aconstnull:TypeMapper())
    }
    
    public void Structure(com.sun.jna.Pointer p, int alignType, com.sun.jna.TypeMapper mapper) {
        invokespecial:Object(Object::<init>, this:Structure)
        putfield:int(Structure::size, this:Structure, ldc:int(-1))
        putfield:Map<String, Object>(Structure::nativeStrings, this:Structure, initobject:HashMap<String, Object>[expected:Map<String, Object>](HashMap<K, V>::<init>))
        putfield:boolean(Structure::autoRead, this:Structure, ldc:boolean(1))
        putfield:boolean(Structure::autoWrite, this:Structure, ldc:boolean(1))
        invokevirtual:void(Structure::setAlignType, this:Structure, alignType:int)
        invokevirtual:void(Structure::setStringEncoding, this:Structure, invokestatic:String(Native::getStringEncoding, invokevirtual:Class<? extends Structure>(Structure::getClass, this:Structure)))
        invokespecial:void(Structure::initializeTypeMapper, this:Structure, mapper:TypeMapper)
        invokespecial:void(Structure::validateFields, this:Structure)
        
        if (cmpne:boolean(p:Pointer, aconstnull:Pointer())) {
            invokevirtual:void(Structure::useMemory, this:Structure, p:Pointer, ldc:int(0), ldc:boolean(1))
        }
        else {
            invokevirtual:void(Structure::allocateMemory, this:Structure, ldc:int(-1))
        }
        
        invokespecial:void(Structure::initializeFields, this:Structure)
    }
    
    public java.util.Map<java.lang.String, com.sun.jna.Structure$StructField> fields() {
        return:Map<String, Structure$StructField>(getfield:Map<String, Structure$StructField>(Structure::structFields, this:Structure))
    }
    
    public com.sun.jna.TypeMapper getTypeMapper() {
        return:TypeMapper(getfield:TypeMapper(Structure::typeMapper, this:Structure))
    }
    
    private void initializeTypeMapper(com.sun.jna.TypeMapper mapper) {
        if (cmpeq:boolean(mapper:TypeMapper, aconstnull:TypeMapper())) {
            mapper = invokestatic:TypeMapper(Native::getTypeMapper, invokevirtual:Class<? extends Structure>(Structure::getClass, this:Structure))
        }
        
        putfield:TypeMapper(Structure::typeMapper, this:Structure, mapper:TypeMapper)
        invokespecial:void(Structure::layoutChanged, this:Structure)
    }
    
    private void layoutChanged() {
        if (cmpne:boolean(getfield:int(Structure::size, this:Structure), ldc:int(-1))) {
            putfield:int(Structure::size, this:Structure, ldc:int(-1))
            
            if (instanceof:boolean(com.sun.jna.Structure$AutoAllocated.class, getfield:Pointer(Structure::memory, this:Structure))) {
                putfield:Pointer(Structure::memory, this:Structure, aconstnull:Pointer())
            }
            
            invokevirtual:void(Structure::ensureAllocated, this:Structure)
        }
    }
    
    public void setStringEncoding(java.lang.String encoding) {
        putfield:String(Structure::encoding, this:Structure, encoding:String)
    }
    
    public java.lang.String getStringEncoding() {
        return:String(getfield:String(Structure::encoding, this:Structure))
    }
    
    public void setAlignType(int alignType) {
        putfield:int(Structure::alignType, this:Structure, alignType:int)
        
        if (cmpeq:boolean(alignType:int, ldc:int(0))) {
            alignType = invokestatic:int(Native::getStructureAlignment, invokevirtual:Class<? extends Structure>(Structure::getClass, this:Structure))
            
            if (cmpeq:boolean(alignType:int, ldc:int(0))) {
                if (invokestatic:boolean(Platform::isWindows)) {
                    alignType = ldc:int(3)
                }
                else {
                    alignType = ldc:int(2)
                }
            }
        }
        
        putfield:int(Structure::actualAlignType, this:Structure, alignType:int)
        invokespecial:void(Structure::layoutChanged, this:Structure)
    }
    
    public com.sun.jna.Memory autoAllocate(int size) {
        return:Memory(initobject:Structure$AutoAllocated[expected:Memory](Structure$AutoAllocated::<init>, size:int))
    }
    
    public void useMemory(com.sun.jna.Pointer m) {
        invokevirtual:void(Structure::useMemory, this:Structure, m:Pointer, ldc:int(0))
    }
    
    public void useMemory(com.sun.jna.Pointer m, int offset) {
        invokevirtual:void(Structure::useMemory, this:Structure, m:Pointer, offset:int, ldc:boolean(0))
    }
    
    public void useMemory(com.sun.jna.Pointer m, int offset, boolean force) {
        var_6_1E : byte[]
        var_6_7B : IndexOutOfBoundsException
        
        try {
            invokeinterface:void(Map<K, V>::clear, getfield:Map<String, Object>(Structure::nativeStrings, this:Structure))
            
            if (logicaland:boolean(instanceof:boolean(com.sun.jna.Structure$ByValue.class, this:Structure), logicalnot:boolean(force:boolean))) {
                var_6_1E = newarray:byte[](byte.class, invokevirtual:int(Structure::size, this:Structure))
                invokevirtual:void(Pointer::read, m:Pointer, ldc:long(0L), var_6_1E:byte[], ldc:int(0), arraylength:int(var_6_1E:byte[]))
                invokevirtual:void(Pointer::write, getfield:Pointer(Structure::memory, this:Structure), ldc:long(0L), var_6_1E:byte[], ldc:int(0), arraylength:int(var_6_1E:byte[]))
            }
            else {
                putfield:Pointer(Structure::memory, this:Structure, invokevirtual:Pointer(Pointer::share, m:Pointer, i2l:long(offset:int)))
                
                if (cmpeq:boolean(getfield:int(Structure::size, this:Structure), ldc:int(-1))) {
                    putfield:int(Structure::size, this:Structure, invokevirtual:int(Structure::calculateSize, this:Structure, ldc:boolean(0)))
                }
                
                if (cmpne:boolean(getfield:int(Structure::size, this:Structure), ldc:int(-1))) {
                    putfield:Pointer(Structure::memory, this:Structure, invokevirtual:Pointer(Pointer::share, m:Pointer, i2l:long(offset:int), i2l:long(getfield:int(Structure::size, this:Structure))))
                }
            }
            
            putfield:Structure[](Structure::array, this:Structure, aconstnull:Structure[]())
            putfield:boolean(Structure::readCalled, this:Structure, ldc:boolean(0))
        }
        catch (java.lang.IndexOutOfBoundsException var_6_7B) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("Structure exceeds provided memory bounds"), var_6_7B:IndexOutOfBoundsException[expected:Throwable]))
        }
    }
    
    public void ensureAllocated() {
        invokespecial:void(Structure::ensureAllocated, this:Structure, ldc:boolean(0))
    }
    
    private void ensureAllocated(boolean avoidFFIType) {
        var_4_42 : IndexOutOfBoundsException
        
        if (cmpeq:boolean(getfield:Pointer(Structure::memory, this:Structure), aconstnull:Pointer())) {
            invokespecial:void(Structure::allocateMemory, this:Structure, avoidFFIType:boolean)
        }
        else {
            if (cmpeq:boolean(getfield:int(Structure::size, this:Structure), ldc:int(-1))) {
                putfield:int(Structure::size, this:Structure, invokevirtual:int(Structure::calculateSize, this:Structure, ldc:boolean(1), avoidFFIType:boolean))
                
                if (logicalnot:boolean(instanceof:boolean(com.sun.jna.Structure$AutoAllocated.class, getfield:Pointer(Structure::memory, this:Structure)))) {
                    try {
                        putfield:Pointer(Structure::memory, this:Structure, invokevirtual:Pointer(Pointer::share, getfield:Pointer(Structure::memory, this:Structure), ldc:long(0L), i2l:long(getfield:int(Structure::size, this:Structure))))
                    }
                    catch (java.lang.IndexOutOfBoundsException var_4_42) {
                        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("Structure exceeds provided memory bounds"), var_4_42:IndexOutOfBoundsException[expected:Throwable]))
                    }
                }
            }
        }
    }
    
    public void allocateMemory() {
        invokespecial:void(Structure::allocateMemory, this:Structure, ldc:boolean(0))
    }
    
    private void allocateMemory(boolean avoidFFIType) {
        invokevirtual:void(Structure::allocateMemory, this:Structure, invokevirtual:int(Structure::calculateSize, this:Structure, ldc:boolean(1), avoidFFIType:boolean))
    }
    
    public void allocateMemory(int size) {
        if (cmpeq:boolean(size:int, ldc:int(-1))) {
            size = invokevirtual:int(Structure::calculateSize, this:Structure, ldc:boolean(0))
        }
        else {
            if (cmple:boolean(size:int, ldc:int(0))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Structure size must be greater than zero: ")), size:int))))
            }
        }
        
        if (cmpne:boolean(size:int, ldc:int(-1))) {
            if (logicalor:boolean(cmpeq:boolean(getfield:Pointer(Structure::memory, this:Structure), aconstnull:Pointer()), instanceof:boolean(com.sun.jna.Structure$AutoAllocated.class, getfield:Pointer(Structure::memory, this:Structure)))) {
                putfield:Pointer(Structure::memory, this:Structure, invokevirtual:Memory[expected:Pointer](Structure::autoAllocate, this:Structure, size:int))
            }
            
            putfield:int(Structure::size, this:Structure, size:int)
        }
    }
    
    public int size() {
        invokevirtual:void(Structure::ensureAllocated, this:Structure)
        return:int(getfield:int(Structure::size, this:Structure))
    }
    
    public void clear() {
        invokevirtual:void(Structure::ensureAllocated, this:Structure)
        invokevirtual:void(Pointer::clear, getfield:Pointer(Structure::memory, this:Structure), i2l:long(invokevirtual:int(Structure::size, this:Structure)))
    }
    
    public com.sun.jna.Pointer getPointer() {
        invokevirtual:void(Structure::ensureAllocated, this:Structure)
        return:Pointer(getfield:Pointer(Structure::memory, this:Structure))
    }
    
    public static java.util.Set<com.sun.jna.Structure> busy() {
        return:Set<Structure>(checkcast:Set<Structure>(java.util.Set<com.sun.jna.Structure>.class, invokevirtual:Set<Structure>(ThreadLocal<Set<Structure>>::get, getstatic:ThreadLocal<Set<Structure>>(Structure::busy))))
    }
    
    public static java.util.Map<com.sun.jna.Pointer, com.sun.jna.Structure> reading() {
        return:Map<Pointer, Structure>(checkcast:Map<Pointer, Structure>(java.util.Map<com.sun.jna.Pointer, com.sun.jna.Structure>.class, invokevirtual:Map<Pointer, Structure>(ThreadLocal<Map<Pointer, Structure>>::get, getstatic:ThreadLocal<Map<Pointer, Structure>>(Structure::reads))))
    }
    
    public void conditionalAutoRead() {
        if (logicalnot:boolean(getfield:boolean(Structure::readCalled, this:Structure))) {
            invokevirtual:void(Structure::autoRead, this:Structure)
        }
    }
    
    public void read() {
        var_3_52 : Iterator<Structure$StructField>
        
        if (cmpeq:boolean(getfield:Pointer(Structure::memory, this:Structure), getstatic:Pointer(Structure::PLACEHOLDER_MEMORY))) {
            return:void()
        }
        
        putfield:boolean(Structure::readCalled, this:Structure, ldc:boolean(1))
        invokevirtual:void(Structure::ensureAllocated, this:Structure)
        
        if (invokeinterface:boolean(Set<E>::contains, invokestatic:Set<Structure>(Structure::busy), this:Structure[expected:Object])) {
            return:void()
        }
        
        invokeinterface:boolean(Set<Structure>::add, invokestatic:Set<Structure>(Structure::busy), this:Structure)
        
        if (instanceof:boolean(com.sun.jna.Structure$ByReference.class, this:Structure)) {
            invokeinterface:Structure(Map<Pointer, Structure>::put, invokestatic:Map<Pointer, Structure>(Structure::reading), invokevirtual:Pointer(Structure::getPointer, this:Structure), this:Structure)
        }
        
        try {
            var_3_52 = invokeinterface:Iterator<Structure$StructField>(Collection<Structure$StructField>::iterator, invokeinterface:Collection<Structure$StructField>(Map<String, Structure$StructField>::values, invokevirtual:Map<String, Structure$StructField>(Structure::fields, this:Structure)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_3_52:Iterator<Structure$StructField>)) {
                invokevirtual:Object(Structure::readField, this:Structure, checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Iterator<Structure$StructField>::next, var_3_52:Iterator<Structure$StructField>)))
            }
        }
        finally {
            invokeinterface:boolean(Set<E>::remove, invokestatic:Set<Structure>(Structure::busy), this:Structure[expected:Object])
            
            if (cmpeq:boolean(invokeinterface:Structure(Map<Pointer, Structure>::get, invokestatic:Map<Pointer, Structure>(Structure::reading), invokevirtual:Pointer[expected:Object](Structure::getPointer, this:Structure)), this:Structure)) {
                invokeinterface:Structure(Map<Pointer, Structure>::remove, invokestatic:Map<Pointer, Structure>(Structure::reading), invokevirtual:Pointer[expected:Object](Structure::getPointer, this:Structure))
            }
        }
    }
    
    public int fieldOffset(java.lang.String name) {
        var_4_15 : Structure$StructField
        
        invokevirtual:void(Structure::ensureAllocated, this:Structure)
        var_4_15 = checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Map<String, Structure$StructField>::get, invokevirtual:Map<String, Structure$StructField>(Structure::fields, this:Structure), name:String[expected:Object]))
        
        if (cmpeq:boolean(var_4_15:Structure$StructField, aconstnull:Structure$StructField())) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("No such field: ")), name:String))))
        }
        
        return:int(getfield:int(Structure$StructField::offset, var_4_15:Structure$StructField))
    }
    
    public java.lang.Object readField(java.lang.String name) {
        var_4_15 : Structure$StructField
        
        invokevirtual:void(Structure::ensureAllocated, this:Structure)
        var_4_15 = checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Map<String, Structure$StructField>::get, invokevirtual:Map<String, Structure$StructField>(Structure::fields, this:Structure), name:String[expected:Object]))
        
        if (cmpeq:boolean(var_4_15:Structure$StructField, aconstnull:Structure$StructField())) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("No such field: ")), name:String))))
        }
        
        return:Object(invokevirtual:Object(Structure::readField, this:Structure, var_4_15:Structure$StructField))
    }
    
    public java.lang.Object getFieldValue(java.lang.reflect.Field field) {
        var_4_0A : Exception
        
        try {
            return:Object(invokevirtual:Object(Field::get, field:Field, this:Structure[expected:Object]))
        }
        catch (java.lang.Exception var_4_0A) {
            athrow(initobject:Error(Error::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Exception reading field '")), invokevirtual:String(Field::getName, field:Field)), ldc:String("' in ")), invokevirtual:Class<? extends Structure>[expected:Object](Structure::getClass, this:Structure))), var_4_0A:Exception[expected:Throwable]))
        }
    }
    
    public void setFieldValue(java.lang.reflect.Field field, java.lang.Object value) {
        invokespecial:void(Structure::setFieldValue, this:Structure, field:Field, value:Object, ldc:boolean(0))
    }
    
    private void setFieldValue(java.lang.reflect.Field field, java.lang.Object value, boolean overrideFinal) {
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
    
    public static com.sun.jna.Structure updateStructureByReference(java.lang.Class<?> type, com.sun.jna.Structure s, com.sun.jna.Pointer address) {
        var_5_28 : Structure
        
        if (cmpeq:boolean(address:Pointer, aconstnull:Pointer())) {
            s = aconstnull:Structure()
        }
        else {
            if (logicalor:boolean(cmpeq:boolean(s:Structure, aconstnull:Structure()), logicalnot:boolean(invokevirtual:boolean(Pointer::equals, address:Pointer, invokevirtual:Pointer[expected:Object](Structure::getPointer, s:Structure))))) {
                var_5_28 = checkcast:Structure(com.sun.jna.Structure.class, invokeinterface:Structure(Map<Pointer, Structure>::get, invokestatic:Map<Pointer, Structure>(Structure::reading), address:Pointer[expected:Object]))
                
                if (logicaland:boolean(cmpne:boolean(var_5_28:Structure, aconstnull:Structure()), invokevirtual:boolean(Object::equals, type:Class<?>[expected:Object], invokevirtual:Class<? extends Structure>(Structure::getClass, var_5_28:Structure)))) {
                    s = var_5_28:Structure
                    invokevirtual:void(Structure::autoRead, s:Structure)
                }
                else {
                    s = invokestatic:Structure(Structure::newInstance, type:Class<?>, address:Pointer)
                    invokevirtual:void(Structure::conditionalAutoRead, s:Structure)
                }
            }
            else {
                invokevirtual:void(Structure::autoRead, s:Structure)
            }
        }
        
        return:Structure(s:Structure)
    }
    
    public java.lang.Object readField(com.sun.jna.Structure$StructField structField) {
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
    
    public void write() {
        var_3_44 : Iterator<Structure$StructField>
        var_4_57 : Structure$StructField
        
        if (cmpeq:boolean(getfield:Pointer(Structure::memory, this:Structure), getstatic:Pointer(Structure::PLACEHOLDER_MEMORY))) {
            return:void()
        }
        
        invokevirtual:void(Structure::ensureAllocated, this:Structure)
        
        if (instanceof:boolean(com.sun.jna.Structure$ByValue.class, this:Structure)) {
            invokevirtual:Pointer(Structure::getTypeInfo, this:Structure)
        }
        
        if (invokeinterface:boolean(Set<E>::contains, invokestatic:Set<Structure>(Structure::busy), this:Structure[expected:Object])) {
            return:void()
        }
        
        invokeinterface:boolean(Set<Structure>::add, invokestatic:Set<Structure>(Structure::busy), this:Structure)
        
        try {
            var_3_44 = invokeinterface:Iterator<Structure$StructField>(Collection<Structure$StructField>::iterator, invokeinterface:Collection<Structure$StructField>(Map<String, Structure$StructField>::values, invokevirtual:Map<String, Structure$StructField>(Structure::fields, this:Structure)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_3_44:Iterator<Structure$StructField>)) {
                var_4_57 = checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Iterator<Structure$StructField>::next, var_3_44:Iterator<Structure$StructField>))
                
                if (logicalnot:boolean(getfield:boolean(Structure$StructField::isVolatile, var_4_57:Structure$StructField))) {
                    invokevirtual:void(Structure::writeField, this:Structure, var_4_57:Structure$StructField)
                }
            }
        }
        finally {
            invokeinterface:boolean(Set<E>::remove, invokestatic:Set<Structure>(Structure::busy), this:Structure[expected:Object])
        }
    }
    
    public void writeField(java.lang.String name) {
        var_4_15 : Structure$StructField
        
        invokevirtual:void(Structure::ensureAllocated, this:Structure)
        var_4_15 = checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Map<String, Structure$StructField>::get, invokevirtual:Map<String, Structure$StructField>(Structure::fields, this:Structure), name:String[expected:Object]))
        
        if (cmpeq:boolean(var_4_15:Structure$StructField, aconstnull:Structure$StructField())) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("No such field: ")), name:String))))
        }
        
        invokevirtual:void(Structure::writeField, this:Structure, var_4_15:Structure$StructField)
    }
    
    public void writeField(java.lang.String name, java.lang.Object value) {
        var_5_15 : Structure$StructField
        
        invokevirtual:void(Structure::ensureAllocated, this:Structure)
        var_5_15 = checkcast:Structure$StructField(com.sun.jna.Structure$StructField.class, invokeinterface:Structure$StructField(Map<String, Structure$StructField>::get, invokevirtual:Map<String, Structure$StructField>(Structure::fields, this:Structure), name:String[expected:Object]))
        
        if (cmpeq:boolean(var_5_15:Structure$StructField, aconstnull:Structure$StructField())) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("No such field: ")), name:String))))
        }
        
        invokevirtual:void(Structure::setFieldValue, this:Structure, getfield:Field(Structure$StructField::field, var_5_15:Structure$StructField), value:Object)
        invokevirtual:void(Structure::writeField, this:Structure, var_5_15:Structure$StructField)
    }
    
    public void writeField(com.sun.jna.Structure$StructField structField) {
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
    
    public abstract java.util.List<java.lang.String> getFieldOrder();
    
    public final void setFieldOrder(java.lang.String[] fields) {
        athrow(initobject:Error(Error::<init>, ldc:String("This method is obsolete, use getFieldOrder() instead")))
    }
    
    public void sortFields(java.util.List<java.lang.reflect.Field> fields, java.util.List<java.lang.String> names) {
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
    
    public java.util.List<java.lang.reflect.Field> getFieldList() {
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
    
    private java.util.List<java.lang.String> fieldOrder() {
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
    
    public static java.util.List<java.lang.String> createFieldsOrder(java.util.List<java.lang.String> baseFields, java.lang.String[] extraFields) {
        return:List<String>(invokestatic:List<String>(Structure::createFieldsOrder, baseFields:List<String>, invokestatic:List<String>(Arrays::asList, extraFields:String[])))
    }
    
    public static java.util.List<java.lang.String> createFieldsOrder(java.util.List<java.lang.String> baseFields, java.util.List<java.lang.String> extraFields) {
        var_4_18 : ArrayList<String>
        
        var_4_18 = initobject:ArrayList<String>(ArrayList<E>::<init>, add:int(invokeinterface:int(List<E>::size, baseFields:List<String>), invokeinterface:int(List<E>::size, extraFields:List<String>)))
        invokeinterface:boolean(List<Object>::addAll, var_4_18:List<Object>, baseFields:List<String>[expected:Collection<?>])
        invokeinterface:boolean(List<Object>::addAll, var_4_18:List<Object>, extraFields:List<String>[expected:Collection<?>])
        return:List<String>(invokestatic:List<Object>(Collections::unmodifiableList, var_4_18:List<? extends T>))
    }
    
    public static java.util.List<java.lang.String> createFieldsOrder(java.lang.String field) {
        return:List<String>(invokestatic:List<String>(Collections::unmodifiableList, invokestatic:List<? extends T>(Collections::singletonList, field:String[expected:? extends T])))
    }
    
    public static java.util.List<java.lang.String> createFieldsOrder(java.lang.String[] fields) {
        return:List<String>(invokestatic:List<String>(Collections::unmodifiableList, invokestatic:List<? extends T>(Arrays::asList, fields:String[][expected:? extends T[]])))
    }
    
    private static java.util.List<T> sort(java.util.Collection<? extends T> c) {
        var_3_0C : ArrayList<Comparable>
        
        var_3_0C = initobject:ArrayList<Comparable>[expected:List<Comparable>](ArrayList<Comparable>::<init>, c:Collection<? extends T>)
        invokestatic:void(Collections::sort, var_3_0C:List<Comparable>)
        return:List<T>(var_3_0C:ArrayList<Comparable>)
    }
    
    public java.util.List<java.lang.reflect.Field> getFields(boolean force) {
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
    
    public int calculateSize(boolean force) {
        return:int(invokevirtual:int(Structure::calculateSize, this:Structure, force:boolean, ldc:boolean(0)))
    }
    
    public static int size(java.lang.Class<?> type) {
        return:int(invokestatic:int(Structure::size, type:Class<?>, aconstnull:Structure()))
    }
    
    public static int size(java.lang.Class<?> type, com.sun.jna.Structure value) {
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
    
    public int calculateSize(boolean force, boolean avoidFFIType) {
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
    
    private void validateField(java.lang.String name, java.lang.Class<?> type) {
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
    
    private void validateFields() {
        var_4_0F : Iterator<Field>
        var_5_25 : Field
        
        var_4_0F = invokeinterface:Iterator<Field>(List<Field>::iterator, invokevirtual:List<Field>(Structure::getFieldList, this:Structure))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_0F:Iterator<Field>)) {
            var_5_25 = checkcast:Field(java.lang.reflect.Field.class, invokeinterface:Field(Iterator<Field>::next, var_4_0F:Iterator<Field>))
            invokespecial:void(Structure::validateField, this:Structure, invokevirtual:String(Field::getName, var_5_25:Field), invokevirtual:Class<?>(Field::getType, var_5_25:Field))
        }
    }
    
    private com.sun.jna.Structure$LayoutInfo deriveLayout(boolean force, boolean avoidFFIType) {
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
    
    private void initializeFields() {
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
    
    private java.lang.Object initializeField(java.lang.reflect.Field field, java.lang.Class<?> type) {
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
    
    private int addPadding(int calculatedSize) {
        return:int(invokespecial:int(Structure::addPadding, this:Structure, calculatedSize:int, getfield:int(Structure::structAlignment, this:Structure)))
    }
    
    private int addPadding(int calculatedSize, int alignment) {
        if (logicaland:boolean(cmpne:boolean(getfield:int(Structure::actualAlignType, this:Structure), ldc:int(1)), cmpne:boolean(rem:int(calculatedSize:int, alignment:int), ldc:int(0)))) {
            calculatedSize = add:int(calculatedSize:int, sub:int(alignment:int, rem:int(calculatedSize:int, alignment:int)))
        }
        
        return:int(calculatedSize:int)
    }
    
    public int getStructAlignment() {
        if (cmpeq:boolean(getfield:int(Structure::size, this:Structure), ldc:int(-1))) {
            invokevirtual:int(Structure::calculateSize, this:Structure, ldc:boolean(1))
        }
        
        return:int(getfield:int(Structure::structAlignment, this:Structure))
    }
    
    public int getNativeAlignment(java.lang.Class<?> type, java.lang.Object value, boolean isFirstElement) {
        var_7_16 : NativeMappedConverter
        var_7_31 : int
        size : int
        
        if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<NativeMapped>(com.sun.jna.NativeMapped.class), type:Class<?>)) {
            var_7_16 = invokestatic:NativeMappedConverter(NativeMappedConverter::getInstance, type:Class<?>)
            type = invokevirtual:Class<?>(NativeMappedConverter::nativeType, var_7_16:NativeMappedConverter)
            value = invokevirtual:Object(NativeMappedConverter::toNative, var_7_16:NativeMappedConverter, value:Object, initobject:ToNativeContext(ToNativeContext::<init>))
        }
        
        var_7_31 = invokestatic:int(Native::getNativeSize, type:Class<?>, value:Object)
        
        if (logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(invokevirtual:boolean(Class<T>::isPrimitive, type:Class<?>), cmpeq:boolean(ldc:Class<Long>(java.lang.Long.class), type:Class<?>)), cmpeq:boolean(ldc:Class<Integer>(java.lang.Integer.class), type:Class<?>)), cmpeq:boolean(ldc:Class<Short>(java.lang.Short.class), type:Class<?>)), cmpeq:boolean(ldc:Class<Character>(java.lang.Character.class), type:Class<?>)), cmpeq:boolean(ldc:Class<Byte>(java.lang.Byte.class), type:Class<?>)), cmpeq:boolean(ldc:Class<Boolean>(java.lang.Boolean.class), type:Class<?>)), cmpeq:boolean(ldc:Class<Float>(java.lang.Float.class), type:Class<?>)), cmpeq:boolean(ldc:Class<Double>(java.lang.Double.class), type:Class<?>))) {
            size = var_7_31:int
        }
        else {
            if (logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicaland:boolean(invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Pointer>(com.sun.jna.Pointer.class), type:Class<?>), logicalnot:boolean(invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Function>(com.sun.jna.Function.class), type:Class<?>))), logicaland:boolean(getstatic:boolean(Platform::HAS_BUFFERS), invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Buffer>(java.nio.Buffer.class), type:Class<?>))), invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Callback>(com.sun.jna.Callback.class), type:Class<?>)), cmpeq:boolean(ldc:Class<WString>(com.sun.jna.WString.class), type:Class<?>)), cmpeq:boolean(ldc:Class<String>(java.lang.String.class), type:Class<?>))) {
                size = getstatic:int(Pointer::SIZE)
            }
            else {
                if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure>(com.sun.jna.Structure.class), type:Class<?>)) {
                    if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure$ByReference>(com.sun.jna.Structure$ByReference.class), type:Class<?>)) {
                        size = getstatic:int(Pointer::SIZE)
                    }
                    else {
                        if (cmpeq:boolean(value:Object, aconstnull:Object())) {
                            value = invokestatic:Structure[expected:Object](Structure::newInstance, type:Class<?>, getstatic:Pointer(Structure::PLACEHOLDER_MEMORY))
                        }
                        
                        size = invokevirtual:int(Structure::getStructAlignment, checkcast:Structure(com.sun.jna.Structure.class, value:Object[expected:Structure]))
                    }
                }
                else {
                    if (logicalnot:boolean(invokevirtual:boolean(Class<T>::isArray, type:Class<?>))) {
                        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Type ")), type:Class<?>[expected:Object]), ldc:String(" has unknown native alignment")))))
                    }
                    
                    size = invokevirtual:int(Structure::getNativeAlignment, this:Structure, invokevirtual:Class<?>(Class<T>::getComponentType, type:Class<?>), aconstnull:Object(), isFirstElement:boolean)
                }
            }
        }
        
        if (cmpeq:boolean(getfield:int(Structure::actualAlignType, this:Structure), ldc:int(1))) {
            size = ldc:int(1)
        }
        else {
            if (cmpeq:boolean(getfield:int(Structure::actualAlignType, this:Structure), ldc:int(3))) {
                size = invokestatic:int(Math::min, ldc:int(8), size:int)
            }
            else {
                if (cmpeq:boolean(getfield:int(Structure::actualAlignType, this:Structure), ldc:int(2))) {
                    if (logicalnot:boolean(logicaland:boolean(logicaland:boolean(isFirstElement:boolean, invokestatic:boolean(Platform::isMac)), invokestatic:boolean(Platform::isPPC)))) {
                        size = invokestatic:int(Math::min, getstatic:int(Native::MAX_ALIGNMENT), size:int)
                    }
                    
                    if (logicaland:boolean(logicaland:boolean(logicalnot:boolean(isFirstElement:boolean), invokestatic:boolean(Platform::isAIX)), logicalor:boolean(cmpeq:boolean(type:Class<?>, getstatic:Class<Double>(Double::TYPE)), cmpeq:boolean(type:Class<?>, ldc:Class<Double>(java.lang.Double.class))))) {
                        size = ldc:int(4)
                    }
                }
            }
        }
        
        return:int(size:int)
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(Structure::toString, this:Structure, invokestatic:boolean(Boolean::getBoolean, ldc:String("jna.dump_memory"))))
    }
    
    public java.lang.String toString(boolean debug) {
        return:String(invokespecial:String(Structure::toString, this:Structure, ldc:int(0), ldc:boolean(1), debug:boolean))
    }
    
    private java.lang.String format(java.lang.Class<?> type) {
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
    
    private java.lang.String toString(int indent, boolean showContents, boolean dumpMemory) {
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
    
    public com.sun.jna.Structure[] toArray(com.sun.jna.Structure[] array) {
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
    
    public com.sun.jna.Structure[] toArray(int size) {
        return:Structure[](invokevirtual:Structure[](Structure::toArray, this:Structure, checkcast:Structure[](com.sun.jna.Structure[].class, checkcast:Structure[](com.sun.jna.Structure[].class, invokestatic:Object[expected:Structure[]](Array::newInstance, invokevirtual:Class<? extends Structure>(Structure::getClass, this:Structure), size:int)))))
    }
    
    private java.lang.Class<?> baseClass() {
        if (logicaland:boolean(logicalor:boolean(instanceof:boolean(com.sun.jna.Structure$ByReference.class, this:Structure), instanceof:boolean(com.sun.jna.Structure$ByValue.class, this:Structure)), invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure>(com.sun.jna.Structure.class), invokevirtual:Class<? super Structure>(Class<? extends Structure>::getSuperclass, invokevirtual:Class<? extends Structure>(Structure::getClass, this:Structure))))) {
            return:Class<?>(invokevirtual:Class<? super Structure>(Class<? extends Structure>::getSuperclass, invokevirtual:Class<? extends Structure>(Structure::getClass, this:Structure)))
        }
        
        return:Class<?>(invokevirtual:Class<? extends Structure>(Structure::getClass, this:Structure))
    }
    
    public boolean dataEquals(com.sun.jna.Structure s) {
        return:boolean(invokevirtual:boolean(Structure::dataEquals, this:Structure, s:Structure, ldc:boolean(0)))
    }
    
    public boolean dataEquals(com.sun.jna.Structure s, boolean clear) {
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
    
    public boolean equals(java.lang.Object o) {
        return:boolean(logicaland:boolean(logicaland:boolean(instanceof:boolean(com.sun.jna.Structure.class, o:Object), cmpeq:boolean(invokevirtual:Class<?>(Object::getClass, o:Object), invokevirtual:Class<? extends Structure>(Structure::getClass, this:Structure))), invokevirtual:boolean(Pointer::equals, invokevirtual:Pointer(Structure::getPointer, checkcast:Structure(com.sun.jna.Structure.class, o:Object[expected:Structure])), invokevirtual:Pointer[expected:Object](Structure::getPointer, this:Structure))))
    }
    
    public int hashCode() {
        if (cmpne:boolean(invokevirtual:Pointer(Structure::getPointer, this:Structure), aconstnull:Pointer())) {
            return:int(invokevirtual:int(Pointer::hashCode, invokevirtual:Pointer(Structure::getPointer, this:Structure)))
        }
        
        return:int(invokevirtual:int(Object::hashCode, invokevirtual:Class<? extends Structure>[expected:Object](Structure::getClass, this:Structure)))
    }
    
    public void cacheTypeInfo(com.sun.jna.Pointer p) {
        putfield:long(Structure::typeInfo, this:Structure, getfield:long(Pointer::peer, p:Pointer))
    }
    
    public com.sun.jna.Pointer getFieldTypeInfo(com.sun.jna.Structure$StructField f) {
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
    
    public com.sun.jna.Pointer getTypeInfo() {
        var_3_08 : Pointer
        
        var_3_08 = invokestatic:Pointer(Structure::getTypeInfo, this:Structure[expected:Object])
        invokevirtual:void(Structure::cacheTypeInfo, this:Structure, var_3_08:Pointer)
        return:Pointer(var_3_08:Pointer)
    }
    
    public void setAutoSynch(boolean auto) {
        invokevirtual:void(Structure::setAutoRead, this:Structure, auto:boolean)
        invokevirtual:void(Structure::setAutoWrite, this:Structure, auto:boolean)
    }
    
    public void setAutoRead(boolean auto) {
        putfield:boolean(Structure::autoRead, this:Structure, auto:boolean)
    }
    
    public boolean getAutoRead() {
        return:boolean(getfield:boolean(Structure::autoRead, this:Structure))
    }
    
    public void setAutoWrite(boolean auto) {
        putfield:boolean(Structure::autoWrite, this:Structure, auto:boolean)
    }
    
    public boolean getAutoWrite() {
        return:boolean(getfield:boolean(Structure::autoWrite, this:Structure))
    }
    
    public static com.sun.jna.Pointer getTypeInfo(java.lang.Object obj) {
        return:Pointer(invokestatic:Pointer(Structure$FFIType::get, obj:Object))
    }
    
    private static com.sun.jna.Structure newInstance(java.lang.Class<?> type, long init) {
        var_5_1C : Structure
        var_5_2C : Throwable
        
        try {
            var_5_1C = invokestatic:Structure(Structure::newInstance, type:Class<?>, ternaryop:Pointer(cmpeq:boolean(init:long, ldc:long(0L)), getstatic:Pointer(Structure::PLACEHOLDER_MEMORY), initobject:Pointer(Pointer::<init>, init:long)))
            
            if (cmpne:boolean(init:long, ldc:long(0L))) {
                invokevirtual:void(Structure::conditionalAutoRead, var_5_1C:Structure)
            }
            
            return:Structure(var_5_1C:Structure)
        }
        catch (java.lang.Throwable var_5_2C) {
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::err), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("JNA: Error creating structure: ")), var_5_2C:Throwable[expected:Object])))
            return:Structure(aconstnull:Structure())
        }
    }
    
    public static com.sun.jna.Structure newInstance(java.lang.Class<?> type, com.sun.jna.Pointer init) {
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
    
    public static com.sun.jna.Structure newInstance(java.lang.Class<?> type) {
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
    
    public com.sun.jna.Structure$StructField typeInfoField() {
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
    
    private static void structureArrayCheck(com.sun.jna.Structure[] ss) {
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
    
    public static void autoRead(com.sun.jna.Structure[] ss) {
        var_3_1C : int
        
        invokestatic:void(Structure::structureArrayCheck, ss:Structure[])
        
        if (cmpeq:boolean(getfield:Structure[](Structure::array, loadelement:Structure(ss:Structure[], ldc:int(0))), ss:Structure[])) {
            invokevirtual:void(Structure::autoRead, loadelement:Structure(ss:Structure[], ldc:int(0)))
        }
        else {
            var_3_1C = ldc:int(0)
            
            while (cmplt:boolean(var_3_1C:int, arraylength:int(ss:Structure[]))) {
                if (cmpne:boolean(loadelement:Structure(ss:Structure[], var_3_1C:int), aconstnull:Structure())) {
                    invokevirtual:void(Structure::autoRead, loadelement:Structure(ss:Structure[], var_3_1C:int))
                }
                
                inc:int(var_3_1C, ldc:int(1))
            }
        }
    }
    
    public void autoRead() {
        var_3_17 : int
        
        if (invokevirtual:boolean(Structure::getAutoRead, this:Structure)) {
            invokevirtual:void(Structure::read, this:Structure)
            
            if (cmpne:boolean(getfield:Structure[](Structure::array, this:Structure), aconstnull:Structure[]())) {
                var_3_17 = ldc:int(1)
                
                while (cmplt:boolean(var_3_17:int, arraylength:int(getfield:Structure[](Structure::array, this:Structure)))) {
                    invokevirtual:void(Structure::autoRead, loadelement:Structure(getfield:Structure[](Structure::array, this:Structure), var_3_17:int))
                    inc:int(var_3_17, ldc:int(1))
                }
            }
        }
    }
    
    public static void autoWrite(com.sun.jna.Structure[] ss) {
        var_3_1C : int
        
        invokestatic:void(Structure::structureArrayCheck, ss:Structure[])
        
        if (cmpeq:boolean(getfield:Structure[](Structure::array, loadelement:Structure(ss:Structure[], ldc:int(0))), ss:Structure[])) {
            invokevirtual:void(Structure::autoWrite, loadelement:Structure(ss:Structure[], ldc:int(0)))
        }
        else {
            var_3_1C = ldc:int(0)
            
            while (cmplt:boolean(var_3_1C:int, arraylength:int(ss:Structure[]))) {
                if (cmpne:boolean(loadelement:Structure(ss:Structure[], var_3_1C:int), aconstnull:Structure())) {
                    invokevirtual:void(Structure::autoWrite, loadelement:Structure(ss:Structure[], var_3_1C:int))
                }
                
                inc:int(var_3_1C, ldc:int(1))
            }
        }
    }
    
    public void autoWrite() {
        var_3_17 : int
        
        if (invokevirtual:boolean(Structure::getAutoWrite, this:Structure)) {
            invokevirtual:void(Structure::write, this:Structure)
            
            if (cmpne:boolean(getfield:Structure[](Structure::array, this:Structure), aconstnull:Structure[]())) {
                var_3_17 = ldc:int(1)
                
                while (cmplt:boolean(var_3_17:int, arraylength:int(getfield:Structure[](Structure::array, this:Structure)))) {
                    invokevirtual:void(Structure::autoWrite, loadelement:Structure(getfield:Structure[](Structure::array, this:Structure), var_3_17:int))
                    inc:int(var_3_17, ldc:int(1))
                }
            }
        }
    }
    
    public int getNativeSize(java.lang.Class<?> nativeType) {
        return:int(invokevirtual:int(Structure::getNativeSize, this:Structure, nativeType:Class<?>, aconstnull:Object()))
    }
    
    public int getNativeSize(java.lang.Class<?> nativeType, java.lang.Object value) {
        return:int(invokestatic:int(Native::getNativeSize, nativeType:Class<?>, value:Object))
    }
    
    public static void validate(java.lang.Class<?> cls) {
        invokestatic:Structure(Structure::newInstance, cls:Class<?>, getstatic:Pointer(Structure::PLACEHOLDER_MEMORY))
    }
    
    public static void access$1900(com.sun.jna.Structure x0, boolean x1) {
        invokespecial:void(Structure::ensureAllocated, x0:Structure, x1:boolean)
    }
    
    public static com.sun.jna.Pointer access$2000() {
        return:Pointer(getstatic:Pointer(Structure::PLACEHOLDER_MEMORY))
    }
    
    static {
        putstatic:Map<Class<?>, Structure$LayoutInfo>(Structure::layoutInfo, initobject:WeakHashMap<Class<?>, Structure$LayoutInfo>[expected:Map<Class<?>, Structure$LayoutInfo>](WeakHashMap<K, V>::<init>))
        putstatic:Map<Class<?>, List<String>>(Structure::fieldOrder, initobject:WeakHashMap<Class<?>, List<String>>[expected:Map<Class<?>, List<String>>](WeakHashMap<K, V>::<init>))
        putstatic:ThreadLocal<Map<Pointer, Structure>>(Structure::reads, initobject:Structure$1[expected:ThreadLocal<Map<Pointer, Structure>>](Structure$1::<init>))
        putstatic:ThreadLocal<Set<Structure>>(Structure::busy, initobject:Structure$2[expected:ThreadLocal<Set<Structure>>](Structure$2::<init>))
        putstatic:Pointer(Structure::PLACEHOLDER_MEMORY, initobject:Structure$3[expected:Pointer](Structure$3::<init>, ldc:long(0L)))
    }
}
