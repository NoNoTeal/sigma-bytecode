public class net.minecraft.util.text.TextProcessing {
    public void TextProcessing() {
        invokespecial:Object(Object::<init>, this:TextProcessing)
    }
    
    private static boolean func_238344_a_(net.minecraft.util.text.Style p_238344_0_, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub8be\u1187\ud523\u3c25\u8d98\u760c p_238344_1_, int p_238344_2_, char p_238344_3_) {
        return:boolean(ternaryop:boolean(invokestatic:boolean(Character::isSurrogate, p_238344_3_:char), invokeinterface:boolean(\ub8be\u1187\ud523\u3c25\u8d98\u760c::\ubcb0\u760c\ub32d\u927d\uc9f6\u64ab, p_238344_1_:\ub8be\u1187\ud523\u3c25\u8d98\u760c, p_238344_2_:int, p_238344_0_:Style, ldc:int(65533)), invokeinterface:boolean(\ub8be\u1187\ud523\u3c25\u8d98\u760c::\ubcb0\u760c\ub32d\u927d\uc9f6\u64ab, p_238344_1_:\ub8be\u1187\ud523\u3c25\u8d98\u760c, p_238344_2_:int, p_238344_0_:Style, p_238344_3_:char[expected:int])))
    }
    
    public static boolean func_238341_a_(java.lang.String p_238341_0_, net.minecraft.util.text.Style p_238341_1_, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub8be\u1187\ud523\u3c25\u8d98\u760c p_238341_2_) {
        // java.lang.NullPointerException
    }
    
    public static boolean func_238345_b_(java.lang.String p_238345_0_, net.minecraft.util.text.Style p_238345_1_, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub8be\u1187\ud523\u3c25\u8d98\u760c p_238345_2_) {
        // java.lang.NullPointerException
    }
    
    public static boolean func_238346_c_(java.lang.String p_238346_0_, net.minecraft.util.text.Style p_238346_1_, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub8be\u1187\ud523\u3c25\u8d98\u760c p_238346_2_) {
        return:boolean(invokestatic:boolean(TextProcessing::func_238339_a_, p_238346_0_:String, ldc:int(0), p_238346_1_:Style, p_238346_2_:\ub8be\u1187\ud523\u3c25\u8d98\u760c))
    }
    
    public static boolean func_238339_a_(java.lang.String p_238339_0_, int p_238339_1_, net.minecraft.util.text.Style p_238339_2_, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub8be\u1187\ud523\u3c25\u8d98\u760c p_238339_3_) {
        return:boolean(invokestatic:boolean(TextProcessing::func_238340_a_, p_238339_0_:String, p_238339_1_:int, p_238339_2_:Style, p_238339_2_:Style, p_238339_3_:\ub8be\u1187\ud523\u3c25\u8d98\u760c))
    }
    
    public static boolean func_238340_a_(java.lang.String p_238340_0_, int p_238340_1_, net.minecraft.util.text.Style p_238340_2_, net.minecraft.util.text.Style p_238340_3_, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub8be\u1187\ud523\u3c25\u8d98\u760c p_238340_4_) {
        // java.lang.NullPointerException
    }
    
    public static boolean func_238343_a_(net.minecraft.util.text.ITextProperties p_238343_0_, net.minecraft.util.text.Style p_238343_1_, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub8be\u1187\ud523\u3c25\u8d98\u760c p_238343_2_) {
        return:boolean(logicalnot:boolean(invokevirtual:boolean(Optional<T>::isPresent, invokeinterface:Optional<Object>(ITextProperties::func_230439_a_, p_238343_0_:ITextProperties, bind:ITextProperties$IStyledTextAcceptor<Object>((p_238337_1_:Style, p_238337_2_:String) -> return:Optional<Object>(ternaryop:Optional<Object>(invokestatic:boolean(TextProcessing::func_238339_a_, p_238337_2_:String, ldc:int(0), p_238337_1_:Style, p_238343_2_:\ub8be\u1187\ud523\u3c25\u8d98\u760c), invokestatic:Optional<Object>(Optional<Object>::empty), getstatic:Optional<Object>(TextProcessing::field_238336_a_)))), p_238343_1_:Style))))
    }
    
    public static java.lang.String func_238338_a_(java.lang.String p_238338_0_) {
        var_3_0A : StringBuilder
        
        var_3_0A = initobject:StringBuilder(StringBuilder::<init>)
        invokestatic:boolean(TextProcessing::func_238341_a_, p_238338_0_:String, getstatic:Style(Style::EMPTY), bind:\ub8be\u1187\ud523\u3c25\u8d98\u760c((p_238342_1_:int, p_238342_2_:Style, p_238342_3_:int) -> {
            invokevirtual:StringBuilder(StringBuilder::appendCodePoint, var_3_0A:StringBuilder, p_238342_3_:int)
            return:boolean(ldc:boolean(1))
        }))
        return:String(invokevirtual:String(StringBuilder::toString, var_3_0A:StringBuilder))
    }
    
    public static java.lang.String func_244782_a(net.minecraft.util.text.ITextProperties p_244782_0_) {
        var_3_0A : StringBuilder
        
        var_3_0A = initobject:StringBuilder(StringBuilder::<init>)
        invokestatic:boolean(TextProcessing::func_238343_a_, p_244782_0_:ITextProperties, getstatic:Style(Style::EMPTY), bind:\ub8be\u1187\ud523\u3c25\u8d98\u760c((p_244781_1_:int, p_244781_2_:Style, p_244781_3_:int) -> {
            invokevirtual:StringBuilder(StringBuilder::appendCodePoint, var_3_0A:StringBuilder, p_244781_3_:int)
            return:boolean(ldc:boolean(1))
        }))
        return:String(invokevirtual:String(StringBuilder::toString, var_3_0A:StringBuilder))
    }
    
    private static boolean lambda$func_244782_a$2(java.lang.StringBuilder stringbuilder, int p_244781_1_, net.minecraft.util.text.Style p_244781_2_, int p_244781_3_) {
        invokevirtual:StringBuilder(StringBuilder::appendCodePoint, stringbuilder:StringBuilder, p_244781_3_:int)
        return:boolean(ldc:boolean(1))
    }
    
    private static boolean lambda$func_238338_a_$1(java.lang.StringBuilder stringbuilder, int p_238342_1_, net.minecraft.util.text.Style p_238342_2_, int p_238342_3_) {
        invokevirtual:StringBuilder(StringBuilder::appendCodePoint, stringbuilder:StringBuilder, p_238342_3_:int)
        return:boolean(ldc:boolean(1))
    }
    
    private static java.util.Optional lambda$func_238343_a_$0(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub8be\u1187\ud523\u3c25\u8d98\u760c p_238343_2_, net.minecraft.util.text.Style p_238337_1_, java.lang.String p_238337_2_) {
        return:Optional(ternaryop:Optional<Object>(invokestatic:boolean(TextProcessing::func_238339_a_, p_238337_2_:String, ldc:int(0), p_238337_1_:Style, p_238343_2_:\ub8be\u1187\ud523\u3c25\u8d98\u760c), invokestatic:Optional<Object>(Optional<Object>::empty), getstatic:Optional<Object>(TextProcessing::field_238336_a_)))
    }
    
    static {
        putstatic:Optional<Object>(TextProcessing::field_238336_a_, invokestatic:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(Optional<T>::of, getstatic:\u3bc9\u4492\u69d9\ud12e\uc238\u6c56(\u3bc9\u4492\u69d9\ud12e\uc238\u6c56::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1)))
    }
}
