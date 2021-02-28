public class com.sun.jna.ELFAnalyser {
    public static com.sun.jna.ELFAnalyser analyse(java.lang.String filename) {
        var_3_0B : ELFAnalyser
        
        var_3_0B = initobject:ELFAnalyser(ELFAnalyser::<init>, filename:String)
        invokespecial:void(ELFAnalyser::runDetection, var_3_0B:ELFAnalyser)
        return:ELFAnalyser(var_3_0B:ELFAnalyser)
    }
    
    public boolean isELF() {
        return:boolean(getfield:boolean(ELFAnalyser::ELF, this:ELFAnalyser))
    }
    
    public boolean is64Bit() {
        return:boolean(getfield:boolean(ELFAnalyser::_64Bit, this:ELFAnalyser))
    }
    
    public boolean isBigEndian() {
        return:boolean(getfield:boolean(ELFAnalyser::bigEndian, this:ELFAnalyser))
    }
    
    public java.lang.String getFilename() {
        return:String(getfield:String(ELFAnalyser::filename, this:ELFAnalyser))
    }
    
    public boolean isArmHardFloat() {
        return:boolean(getfield:boolean(ELFAnalyser::armHardFloat, this:ELFAnalyser))
    }
    
    public boolean isArmSoftFloat() {
        return:boolean(getfield:boolean(ELFAnalyser::armSoftFloat, this:ELFAnalyser))
    }
    
    public boolean isArm() {
        return:boolean(getfield:boolean(ELFAnalyser::arm, this:ELFAnalyser))
    }
    
    private void ELFAnalyser(java.lang.String filename) {
        invokespecial:Object(Object::<init>, this:ELFAnalyser)
        putfield:boolean(ELFAnalyser::ELF, this:ELFAnalyser, ldc:boolean(0))
        putfield:boolean(ELFAnalyser::_64Bit, this:ELFAnalyser, ldc:boolean(0))
        putfield:boolean(ELFAnalyser::bigEndian, this:ELFAnalyser, ldc:boolean(0))
        putfield:boolean(ELFAnalyser::armHardFloat, this:ELFAnalyser, ldc:boolean(0))
        putfield:boolean(ELFAnalyser::armSoftFloat, this:ELFAnalyser, ldc:boolean(0))
        putfield:boolean(ELFAnalyser::arm, this:ELFAnalyser, ldc:boolean(0))
        putfield:String(ELFAnalyser::filename, this:ELFAnalyser, filename:String)
    }
    
    private void runDetection() {
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
    
    static {
        putstatic:byte[](ELFAnalyser::ELF_MAGIC, initarray:byte[](byte[].class, ldc:byte(127), ldc:byte(69), ldc:byte(76), ldc:byte(70)))
    }
}
