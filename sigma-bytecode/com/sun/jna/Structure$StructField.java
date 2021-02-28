public class com.sun.jna.Structure$StructField {
    public void Structure$StructField() {
        invokespecial:Object(Object::<init>, this:Structure$StructField)
        putfield:int(Structure$StructField::size, this:Structure$StructField, ldc:int(-1))
        putfield:int(Structure$StructField::offset, this:Structure$StructField, ldc:int(-1))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(Structure$StructField::name, this:Structure$StructField)), ldc:String("@")), getfield:int(Structure$StructField::offset, this:Structure$StructField)), ldc:String("[")), getfield:int(Structure$StructField::size, this:Structure$StructField)), ldc:String("] (")), getfield:Class<?>[expected:Object](Structure$StructField::type, this:Structure$StructField)), ldc:String(")"))))
    }
}
