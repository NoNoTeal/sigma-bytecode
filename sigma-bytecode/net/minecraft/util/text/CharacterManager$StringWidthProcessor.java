public class net.minecraft.util.text.CharacterManager$StringWidthProcessor {
    public void CharacterManager$StringWidthProcessor(net.minecraft.util.text.CharacterManager this$0, float p_i232248_2_) {
        putfield:CharacterManager(CharacterManager$StringWidthProcessor::this$0, this:CharacterManager$StringWidthProcessor, this$0:CharacterManager)
        invokespecial:Object(Object::<init>, this:CharacterManager$StringWidthProcessor)
        putfield:float(CharacterManager$StringWidthProcessor::field_238396_b_, this:CharacterManager$StringWidthProcessor, p_i232248_2_:float)
    }
    
    public boolean \ubcb0\u760c\ub32d\u927d\uc9f6\u64ab(int p_accept_1_, net.minecraft.util.text.Style p_accept_2_, int p_accept_3_) {
        putfield:float(CharacterManager$StringWidthProcessor::field_238396_b_, this:CharacterManager$StringWidthProcessor, sub:float(getfield:float(CharacterManager$StringWidthProcessor::field_238396_b_, this:CharacterManager$StringWidthProcessor), invokeinterface:float(CharacterManager$ICharWidthProvider::getWidth, invokestatic:CharacterManager$ICharWidthProvider(CharacterManager::access$300, getfield:CharacterManager(CharacterManager$StringWidthProcessor::this$0, this:CharacterManager$StringWidthProcessor)), p_accept_3_:int, p_accept_2_:Style)))
        
        if (cmpge:boolean(getfield:float(CharacterManager$StringWidthProcessor::field_238396_b_, this:CharacterManager$StringWidthProcessor), ldc:float(0.0f))) {
            putfield:int(CharacterManager$StringWidthProcessor::field_238397_c_, this:CharacterManager$StringWidthProcessor, add:int(p_accept_1_:int, invokestatic:int(Character::charCount, p_accept_3_:int)))
            return:boolean(ldc:boolean(1))
        }
        
        return:boolean(ldc:boolean(0))
    }
    
    public int func_238398_a_() {
        return:int(getfield:int(CharacterManager$StringWidthProcessor::field_238397_c_, this:CharacterManager$StringWidthProcessor))
    }
    
    public void func_238399_b_() {
        putfield:int(CharacterManager$StringWidthProcessor::field_238397_c_, this:CharacterManager$StringWidthProcessor, ldc:int(0))
    }
}
