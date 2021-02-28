public final class net.minecraft.util.text.LanguageMap$1 {
    public void LanguageMap$1(java.util.Map p0) {
        putfield:Map(LanguageMap$1::val$map, this:LanguageMap$1, p0:Map)
        invokespecial:LanguageMap(LanguageMap::<init>, this:LanguageMap$1)
    }
    
    public java.lang.String func_230503_a_(java.lang.String p_230503_1_) {
        return:String(checkcast:String(java.lang.String.class, invokeinterface:String(Map<K, String>::getOrDefault, getfield:Map(LanguageMap$1::val$map, this:LanguageMap$1), p_230503_1_:String[expected:Object], p_230503_1_:String)))
    }
    
    public boolean func_230506_b_(java.lang.String p_230506_1_) {
        return:boolean(invokeinterface:boolean(Map::containsKey, getfield:Map(LanguageMap$1::val$map, this:LanguageMap$1), p_230506_1_:String[expected:Object]))
    }
    
    public boolean func_230505_b_() {
        return:boolean(ldc:boolean(0))
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d func_241870_a(net.minecraft.util.text.ITextProperties p_241870_1_) {
        return:\u718f\u8413\u1833\u72f1\u5fe1\u927d(bind:\u718f\u8413\u1833\u72f1\u5fe1\u927d((p_244262_1_:\ub8be\u1187\ud523\u3c25\u8d98\u760c) -> return:boolean(invokevirtual:boolean[expected:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>](Optional<T>::isPresent, invokeinterface:Optional<Object>(ITextProperties::func_230439_a_, p_241870_1_:ITextProperties, bind:ITextProperties$IStyledTextAcceptor<Object>((p_244261_1_:Style, p_244261_2_:String) -> return:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(ternaryop:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(invokestatic:boolean(TextProcessing::func_238346_c_, p_244261_2_:String, p_244261_1_:Style, p_244262_1_:\ub8be\u1187\ud523\u3c25\u8d98\u760c), invokestatic:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(Optional<T>::empty), getstatic:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(ITextProperties::field_240650_b_)))), getstatic:Style(Style::EMPTY))))))
    }
    
    private static boolean lambda$func_241870_a$1(net.minecraft.util.text.ITextProperties p_241870_1_, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub8be\u1187\ud523\u3c25\u8d98\u760c p_244262_1_) {
        return:boolean(invokevirtual:boolean(Optional<T>::isPresent, invokeinterface:Optional<Object>(ITextProperties::func_230439_a_, p_241870_1_:ITextProperties, bind:ITextProperties$IStyledTextAcceptor<Object>((p_244261_1_:Style, p_244261_2_:String) -> return:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(ternaryop:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(invokestatic:boolean(TextProcessing::func_238346_c_, p_244261_2_:String, p_244261_1_:Style, p_244262_1_:\ub8be\u1187\ud523\u3c25\u8d98\u760c), invokestatic:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(Optional<T>::empty), getstatic:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(ITextProperties::field_240650_b_)))), getstatic:Style(Style::EMPTY))))
    }
    
    private static java.util.Optional lambda$null$0(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub8be\u1187\ud523\u3c25\u8d98\u760c p_244262_1_, net.minecraft.util.text.Style p_244261_1_, java.lang.String p_244261_2_) {
        return:Optional(ternaryop:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(invokestatic:boolean(TextProcessing::func_238346_c_, p_244261_2_:String, p_244261_1_:Style, p_244262_1_:\ub8be\u1187\ud523\u3c25\u8d98\u760c), invokestatic:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(Optional<T>::empty), getstatic:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(ITextProperties::field_240650_b_)))
    }
}
