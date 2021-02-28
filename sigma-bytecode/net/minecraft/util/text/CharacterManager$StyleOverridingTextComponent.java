public class net.minecraft.util.text.CharacterManager$StyleOverridingTextComponent {
    public void CharacterManager$StyleOverridingTextComponent(java.lang.String p_i232247_1_, net.minecraft.util.text.Style p_i232247_2_) {
        invokespecial:Object(Object::<init>, this:CharacterManager$StyleOverridingTextComponent)
        putfield:String(CharacterManager$StyleOverridingTextComponent::field_238391_a_, this:CharacterManager$StyleOverridingTextComponent, p_i232247_1_:String)
        putfield:Style(CharacterManager$StyleOverridingTextComponent::field_238392_d_, this:CharacterManager$StyleOverridingTextComponent, p_i232247_2_:Style)
    }
    
    public java.util.Optional<T> func_230438_a_(net.minecraft.util.text.ITextProperties$ITextAcceptor<T> p_230438_1_) {
        return:Optional<T>(invokeinterface:Optional<T>(ITextProperties$ITextAcceptor<T>::accept, p_230438_1_:ITextProperties$ITextAcceptor<T>, getfield:String(CharacterManager$StyleOverridingTextComponent::field_238391_a_, this:CharacterManager$StyleOverridingTextComponent)))
    }
    
    public java.util.Optional<T> func_230439_a_(net.minecraft.util.text.ITextProperties$IStyledTextAcceptor<T> p_230439_1_, net.minecraft.util.text.Style p_230439_2_) {
        return:Optional<T>(invokeinterface:Optional<T>(ITextProperties$IStyledTextAcceptor<T>::accept, p_230439_1_:ITextProperties$IStyledTextAcceptor<T>, invokevirtual:Style(Style::mergeStyle, getfield:Style(CharacterManager$StyleOverridingTextComponent::field_238392_d_, this:CharacterManager$StyleOverridingTextComponent), p_230439_2_:Style), getfield:String(CharacterManager$StyleOverridingTextComponent::field_238391_a_, this:CharacterManager$StyleOverridingTextComponent)))
    }
    
    public static java.lang.String access$100(net.minecraft.util.text.CharacterManager$StyleOverridingTextComponent x0) {
        return:String(getfield:String(CharacterManager$StyleOverridingTextComponent::field_238391_a_, x0:CharacterManager$StyleOverridingTextComponent))
    }
    
    public static net.minecraft.util.text.Style access$200(net.minecraft.util.text.CharacterManager$StyleOverridingTextComponent x0) {
        return:Style(getfield:Style(CharacterManager$StyleOverridingTextComponent::field_238392_d_, x0:CharacterManager$StyleOverridingTextComponent))
    }
}
