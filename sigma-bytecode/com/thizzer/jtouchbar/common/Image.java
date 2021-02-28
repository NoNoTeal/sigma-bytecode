public class com.thizzer.jtouchbar.common.Image {
    private void Image() {
        invokespecial:Object(Object::<init>, this:Image)
    }
    
    public void Image(java.lang.String nameOrPath, boolean isPath) {
        invokespecial:Object(Object::<init>, this:Image)
        
        if (isPath:boolean) {
            putfield:String(Image::_path, this:Image, nameOrPath:String)
        }
        else {
            putfield:String(Image::_name, this:Image, nameOrPath:String)
        }
    }
    
    public void Image(byte[] data) {
        invokespecial:Object(Object::<init>, this:Image)
        putfield:byte[](Image::_data, this:Image, data:byte[])
    }
    
    public void Image(java.io.InputStream dataInputStream) {
        invokespecial:Object(Object::<init>, this:Image)
        invokevirtual:void(Image::readFromInputStream, this:Image, dataInputStream:InputStream)
    }
    
    public void readFromInputStream(java.io.InputStream dataInputStream) {
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
    
    public java.lang.String getName() {
        return:String(getfield:String(Image::_name, this:Image))
    }
    
    public void setName(java.lang.String name) {
        putfield:String(Image::_name, this:Image, name:String)
    }
    
    public java.lang.String getPath() {
        return:String(getfield:String(Image::_path, this:Image))
    }
    
    public void setPath(java.lang.String path) {
        putfield:String(Image::_path, this:Image, path:String)
    }
    
    public byte[] getData() {
        return:byte[](getfield:byte[](Image::_data, this:Image))
    }
    
    public void getData(byte[] data) {
        putfield:byte[](Image::_data, this:Image, data:byte[])
    }
}
