public class net.minecraft.util.text.CharacterManager$SubstyledText {
    public void CharacterManager$SubstyledText(java.util.List<net.minecraft.util.text.CharacterManager$StyleOverridingTextComponent> p_i232245_1_) {
        invokespecial:Object(Object::<init>, this:CharacterManager$SubstyledText)
        putfield:List<CharacterManager$StyleOverridingTextComponent>(CharacterManager$SubstyledText::field_238369_a_, this:CharacterManager$SubstyledText, p_i232245_1_:List<CharacterManager$StyleOverridingTextComponent>)
        putfield:String(CharacterManager$SubstyledText::field_238370_b_, this:CharacterManager$SubstyledText, checkcast:String(java.lang.String.class, invokeinterface:String(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, p_i232245_1_:List<CharacterManager$StyleOverridingTextComponent>[expected:Collection<Object>]), bind:Function<Object, String>((p_238375_0_:CharacterManager$StyleOverridingTextComponent) -> return:String(invokestatic:String(CharacterManager$StyleOverridingTextComponent::access$100, p_238375_0_:CharacterManager$StyleOverridingTextComponent)))), invokestatic:Collector<CharSequence, ?, String>(Collectors::joining))))
    }
    
    public char func_238372_a_(int p_238372_1_) {
        return:char(invokevirtual:char(String::charAt, getfield:String(CharacterManager$SubstyledText::field_238370_b_, this:CharacterManager$SubstyledText), p_238372_1_:int))
    }
    
    public net.minecraft.util.text.ITextProperties func_238373_a_(int p_238373_1_, int p_238373_2_, net.minecraft.util.text.Style p_238373_3_) {
        // java.lang.NullPointerException
    }
    
    public net.minecraft.util.text.ITextProperties func_238371_a_() {
        var_3_0A : TextPropertiesManager
        
        var_3_0A = initobject:TextPropertiesManager(TextPropertiesManager::<init>)
        invokeinterface:void(Iterable<Object>::forEach, getfield:List<CharacterManager$StyleOverridingTextComponent>[expected:Iterable<Object>](CharacterManager$SubstyledText::field_238369_a_, this:CharacterManager$SubstyledText), invokedynamic:Consumer<ITextProperties>(accept:(Lnet/minecraft/util/text/TextPropertiesManager;)Ljava/util/function/Consumer;, var_3_0A:TextPropertiesManager))
        invokeinterface:void(List<E>::clear, getfield:List<CharacterManager$StyleOverridingTextComponent>(CharacterManager$SubstyledText::field_238369_a_, this:CharacterManager$SubstyledText))
        return:ITextProperties(invokevirtual:ITextProperties(TextPropertiesManager::func_238154_a_, var_3_0A:TextPropertiesManager))
    }
    
    private static java.lang.String lambda$new$0(net.minecraft.util.text.CharacterManager$StyleOverridingTextComponent p_238375_0_) {
        return:String(invokestatic:String(CharacterManager$StyleOverridingTextComponent::access$100, p_238375_0_:CharacterManager$StyleOverridingTextComponent))
    }
    
    public static java.util.List access$000(net.minecraft.util.text.CharacterManager$SubstyledText x0) {
        return:List(getfield:List<CharacterManager$StyleOverridingTextComponent>(CharacterManager$SubstyledText::field_238369_a_, x0:CharacterManager$SubstyledText))
    }
}
