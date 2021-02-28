public class com.sun.jna.StructureWriteContext {
    public void StructureWriteContext(com.sun.jna.Structure struct, java.lang.reflect.Field field) {
        invokespecial:ToNativeContext(ToNativeContext::<init>, this:StructureWriteContext)
        putfield:Structure(StructureWriteContext::struct, this:StructureWriteContext, struct:Structure)
        putfield:Field(StructureWriteContext::field, this:StructureWriteContext, field:Field)
    }
    
    public com.sun.jna.Structure getStructure() {
        return:Structure(getfield:Structure(StructureWriteContext::struct, this:StructureWriteContext))
    }
    
    public java.lang.reflect.Field getField() {
        return:Field(getfield:Field(StructureWriteContext::field, this:StructureWriteContext))
    }
}
