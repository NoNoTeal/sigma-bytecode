public class net.minecraft.util.text.CharacterManager$1 {
    public void CharacterManager$1(net.minecraft.util.text.CharacterManager this$0, net.minecraft.util.text.CharacterManager$StringWidthProcessor p1) {
        putfield:CharacterManager(CharacterManager$1::this$0, this:CharacterManager$1, this$0:CharacterManager)
        putfield:CharacterManager$StringWidthProcessor(CharacterManager$1::val$charactermanager$stringwidthprocessor, this:CharacterManager$1, p1:CharacterManager$StringWidthProcessor)
        invokespecial:Object(Object::<init>, this:CharacterManager$1)
        putfield:TextPropertiesManager(CharacterManager$1::field_238368_c_, this:CharacterManager$1, initobject:TextPropertiesManager(TextPropertiesManager::<init>))
    }
    
    public java.util.Optional<net.minecraft.util.text.ITextProperties> accept(net.minecraft.util.text.Style p_accept_1_, java.lang.String p_accept_2_) {
        var_5_22 : String
        
        invokevirtual:void(CharacterManager$StringWidthProcessor::func_238399_b_, getfield:CharacterManager$StringWidthProcessor(CharacterManager$1::val$charactermanager$stringwidthprocessor, this:CharacterManager$1))
        
        if (logicalnot:boolean(invokestatic:boolean(TextProcessing::func_238346_c_, p_accept_2_:String, p_accept_1_:Style, getfield:CharacterManager$StringWidthProcessor[expected:\ub8be\u1187\ud523\u3c25\u8d98\u760c](CharacterManager$1::val$charactermanager$stringwidthprocessor, this:CharacterManager$1)))) {
            var_5_22 = invokevirtual:String(String::substring, p_accept_2_:String, ldc:int(0), invokevirtual:int(CharacterManager$StringWidthProcessor::func_238398_a_, getfield:CharacterManager$StringWidthProcessor(CharacterManager$1::val$charactermanager$stringwidthprocessor, this:CharacterManager$1)))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_5_22:String))) {
                invokevirtual:void(TextPropertiesManager::func_238155_a_, getfield:TextPropertiesManager(CharacterManager$1::field_238368_c_, this:CharacterManager$1), invokestatic:ITextProperties(ITextProperties::func_240653_a_, var_5_22:String, p_accept_1_:Style))
            }
            
            return:Optional<ITextProperties>(invokestatic:Optional<ITextProperties>(Optional<T>::of, invokevirtual:ITextProperties(TextPropertiesManager::func_238156_b_, getfield:TextPropertiesManager(CharacterManager$1::field_238368_c_, this:CharacterManager$1))))
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, p_accept_2_:String))) {
            invokevirtual:void(TextPropertiesManager::func_238155_a_, getfield:TextPropertiesManager(CharacterManager$1::field_238368_c_, this:CharacterManager$1), invokestatic:ITextProperties(ITextProperties::func_240653_a_, p_accept_2_:String, p_accept_1_:Style))
        }
        
        return:Optional<ITextProperties>(invokestatic:Optional<ITextProperties>(Optional<T>::empty))
    }
}
