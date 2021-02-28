public class net.minecraft.util.text.CharacterManager$MultilineProcessor {
    public void CharacterManager$MultilineProcessor(net.minecraft.util.text.CharacterManager this$0, float p_i232246_2_) {
        putfield:CharacterManager(CharacterManager$MultilineProcessor::this$0, this:CharacterManager$MultilineProcessor, this$0:CharacterManager)
        invokespecial:Object(Object::<init>, this:CharacterManager$MultilineProcessor)
        putfield:int(CharacterManager$MultilineProcessor::field_238378_c_, this:CharacterManager$MultilineProcessor, ldc:int(-1))
        putfield:Style(CharacterManager$MultilineProcessor::field_238379_d_, this:CharacterManager$MultilineProcessor, getstatic:Style(Style::EMPTY))
        putfield:int(CharacterManager$MultilineProcessor::field_238382_g_, this:CharacterManager$MultilineProcessor, ldc:int(-1))
        putfield:Style(CharacterManager$MultilineProcessor::field_238383_h_, this:CharacterManager$MultilineProcessor, getstatic:Style(Style::EMPTY))
        putfield:float(CharacterManager$MultilineProcessor::field_238377_b_, this:CharacterManager$MultilineProcessor, invokestatic:float(Math::max, p_i232246_2_:float, ldc:float(1.0f)))
    }
    
    public boolean \ubcb0\u760c\ub32d\u927d\uc9f6\u64ab(int p_accept_1_, net.minecraft.util.text.Style p_accept_2_, int p_accept_3_) {
        // java.lang.NullPointerException
    }
    
    private boolean func_238388_a_(int p_238388_1_, net.minecraft.util.text.Style p_238388_2_) {
        putfield:int(CharacterManager$MultilineProcessor::field_238378_c_, this:CharacterManager$MultilineProcessor, p_238388_1_:int)
        putfield:Style(CharacterManager$MultilineProcessor::field_238379_d_, this:CharacterManager$MultilineProcessor, p_238388_2_:Style)
        return:boolean(ldc:boolean(0))
    }
    
    private boolean func_238390_c_() {
        return:boolean(cmpne:boolean(getfield:int(CharacterManager$MultilineProcessor::field_238378_c_, this:CharacterManager$MultilineProcessor), ldc:int(-1)))
    }
    
    public int func_238386_a_() {
        return:int(ternaryop:int(invokespecial:boolean(CharacterManager$MultilineProcessor::func_238390_c_, this:CharacterManager$MultilineProcessor), getfield:int(CharacterManager$MultilineProcessor::field_238378_c_, this:CharacterManager$MultilineProcessor), getfield:int(CharacterManager$MultilineProcessor::field_238384_i_, this:CharacterManager$MultilineProcessor)))
    }
    
    public net.minecraft.util.text.Style func_238389_b_() {
        return:Style(getfield:Style(CharacterManager$MultilineProcessor::field_238379_d_, this:CharacterManager$MultilineProcessor))
    }
    
    public void func_238387_a_(int p_238387_1_) {
        putfield:int(CharacterManager$MultilineProcessor::field_238385_j_, this:CharacterManager$MultilineProcessor, add:int(getfield:int(CharacterManager$MultilineProcessor::field_238385_j_, this:CharacterManager$MultilineProcessor), p_238387_1_:int))
    }
}
