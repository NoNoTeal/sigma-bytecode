public class com.sun.jna.CallbackReference$AttachOptions {
    public void CallbackReference$AttachOptions() {
        invokespecial:Structure(Structure::<init>, this:CallbackReference$AttachOptions)
        invokevirtual:void(Structure::setStringEncoding, this:CallbackReference$AttachOptions[expected:Structure], ldc:String("utf8"))
    }
    
    public java.util.List<java.lang.String> getFieldOrder() {
        return:List<String>(getstatic:List<String>(CallbackReference$AttachOptions::FIELDS))
    }
    
    static {
        putstatic:List<String>(CallbackReference$AttachOptions::FIELDS, invokestatic:List<String>(Structure::createFieldsOrder, initarray:String[](java.lang.String[].class, ldc:String("daemon"), ldc:String("detach"), ldc:String("name"))))
    }
}
