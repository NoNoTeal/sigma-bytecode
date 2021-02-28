public class com.sun.jna.StructureReadContext {
    public void StructureReadContext(com.sun.jna.Structure struct, java.lang.reflect.Field field) {
        invokespecial:FromNativeContext(FromNativeContext::<init>, this:StructureReadContext, invokevirtual:Class<?>(Field::getType, field:Field))
        putfield:Structure(StructureReadContext::structure, this:StructureReadContext, struct:Structure)
        putfield:Field(StructureReadContext::field, this:StructureReadContext, field:Field)
    }
    
    public com.sun.jna.Structure getStructure() {
        return:Structure(getfield:Structure(StructureReadContext::structure, this:StructureReadContext))
    }
    
    public java.lang.reflect.Field getField() {
        return:Field(getfield:Field(StructureReadContext::field, this:StructureReadContext))
    }
}
