public class com.sun.jna.Structure$LayoutInfo {
    private void Structure$LayoutInfo() {
        invokespecial:Object(Object::<init>, this:Structure$LayoutInfo)
        putfield:int(Structure$LayoutInfo::size, this:Structure$LayoutInfo, ldc:int(-1))
        putfield:int(Structure$LayoutInfo::alignment, this:Structure$LayoutInfo, ldc:int(1))
        putfield:Map<String, Structure$StructField>(Structure$LayoutInfo::fields, this:Structure$LayoutInfo, invokestatic:Map<String, Structure$StructField>(Collections::synchronizedMap, initobject:LinkedHashMap<String, Structure$StructField>[expected:Map<String, Structure$StructField>](LinkedHashMap<K, V>::<init>)))
        putfield:int(Structure$LayoutInfo::alignType, this:Structure$LayoutInfo, ldc:int(0))
    }
    
    public static boolean access$000(com.sun.jna.Structure$LayoutInfo x0) {
        return:boolean(getfield:boolean(Structure$LayoutInfo::variable, x0:Structure$LayoutInfo))
    }
    
    public static int access$100(com.sun.jna.Structure$LayoutInfo x0) {
        return:int(getfield:int(Structure$LayoutInfo::size, x0:Structure$LayoutInfo))
    }
    
    public static int access$200(com.sun.jna.Structure$LayoutInfo x0) {
        return:int(getfield:int(Structure$LayoutInfo::alignType, x0:Structure$LayoutInfo))
    }
    
    public static com.sun.jna.TypeMapper access$300(com.sun.jna.Structure$LayoutInfo x0) {
        return:TypeMapper(getfield:TypeMapper(Structure$LayoutInfo::typeMapper, x0:Structure$LayoutInfo))
    }
    
    public static int access$400(com.sun.jna.Structure$LayoutInfo x0) {
        return:int(getfield:int(Structure$LayoutInfo::alignment, x0:Structure$LayoutInfo))
    }
    
    public static java.util.Map access$500(com.sun.jna.Structure$LayoutInfo x0) {
        return:Map(getfield:Map<String, Structure$StructField>(Structure$LayoutInfo::fields, x0:Structure$LayoutInfo))
    }
    
    public void Structure$LayoutInfo(com.sun.jna.Structure$1 x0) {
        invokespecial:Structure$LayoutInfo(Structure$LayoutInfo::<init>, this:Structure$LayoutInfo)
    }
    
    public static int access$202(com.sun.jna.Structure$LayoutInfo x0, int x1) {
        return:int(putfield:int(Structure$LayoutInfo::alignType, x0:Structure$LayoutInfo, x1:int))
    }
    
    public static com.sun.jna.TypeMapper access$302(com.sun.jna.Structure$LayoutInfo x0, com.sun.jna.TypeMapper x1) {
        return:TypeMapper(putfield:TypeMapper(Structure$LayoutInfo::typeMapper, x0:Structure$LayoutInfo, x1:TypeMapper))
    }
    
    public static boolean access$002(com.sun.jna.Structure$LayoutInfo x0, boolean x1) {
        return:boolean(putfield:boolean(Structure$LayoutInfo::variable, x0:Structure$LayoutInfo, x1:boolean))
    }
    
    public static int access$402(com.sun.jna.Structure$LayoutInfo x0, int x1) {
        return:int(putfield:int(Structure$LayoutInfo::alignment, x0:Structure$LayoutInfo, x1:int))
    }
    
    public static com.sun.jna.Structure$StructField access$700(com.sun.jna.Structure$LayoutInfo x0) {
        return:Structure$StructField(getfield:Structure$StructField(Structure$LayoutInfo::typeInfoField, x0:Structure$LayoutInfo))
    }
    
    public static com.sun.jna.Structure$StructField access$702(com.sun.jna.Structure$LayoutInfo x0, com.sun.jna.Structure$StructField x1) {
        return:Structure$StructField(putfield:Structure$StructField(Structure$LayoutInfo::typeInfoField, x0:Structure$LayoutInfo, x1:Structure$StructField))
    }
    
    public static int access$102(com.sun.jna.Structure$LayoutInfo x0, int x1) {
        return:int(putfield:int(Structure$LayoutInfo::size, x0:Structure$LayoutInfo, x1:int))
    }
}
