public class net.minecraft.util.text.TranslationTextComponent {
    public void TranslationTextComponent(java.lang.String p_i232574_1_) {
        invokespecial:TextComponent(TextComponent::<init>, this:TranslationTextComponent)
        putfield:List<ITextProperties>(TranslationTextComponent::children, this:TranslationTextComponent, invokestatic:ArrayList[expected:List<ITextProperties>](Lists::newArrayList))
        putfield:String(TranslationTextComponent::key, this:TranslationTextComponent, p_i232574_1_:String)
        putfield:Object[](TranslationTextComponent::formatArgs, this:TranslationTextComponent, getstatic:Object[](TranslationTextComponent::field_240753_d_))
    }
    
    public void TranslationTextComponent(java.lang.String translationKey, java.lang.Object[] args) {
        invokespecial:TextComponent(TextComponent::<init>, this:TranslationTextComponent)
        putfield:List<ITextProperties>(TranslationTextComponent::children, this:TranslationTextComponent, invokestatic:ArrayList[expected:List<ITextProperties>](Lists::newArrayList))
        putfield:String(TranslationTextComponent::key, this:TranslationTextComponent, translationKey:String)
        putfield:Object[](TranslationTextComponent::formatArgs, this:TranslationTextComponent, args:Object[])
    }
    
    private void ensureInitialized() {
        // java.lang.NullPointerException
    }
    
    private void func_240758_a_(java.lang.String p_240758_1_) {
        // java.lang.NullPointerException
    }
    
    private net.minecraft.util.text.ITextProperties func_240757_a_(int p_240757_1_) {
        var_4_1C : Object
        
        if (cmpge:boolean(p_240757_1_:int, arraylength:int(getfield:Object[](TranslationTextComponent::formatArgs, this:TranslationTextComponent)))) {
            athrow(initobject:TranslationTextComponentFormatException(TranslationTextComponentFormatException::<init>, this:TranslationTextComponent, p_240757_1_:int))
        }
        
        var_4_1C = loadelement:Object(getfield:Object[](TranslationTextComponent::formatArgs, this:TranslationTextComponent), p_240757_1_:int)
        
        if (instanceof:boolean(net.minecraft.util.text.ITextComponent.class, var_4_1C:Object)) {
            return:ITextProperties(checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, var_4_1C:ITextComponent[expected:Object]))
        }
        
        return:ITextProperties(ternaryop:ITextProperties(cmpeq:boolean(var_4_1C:ITextComponent, aconstnull:ITextComponent()), getstatic:ITextProperties(TranslationTextComponent::field_240755_f_), invokestatic:ITextProperties(ITextProperties::func_240652_a_, invokevirtual:String(Object::toString, var_4_1C:ITextComponent[expected:Object]))))
    }
    
    public net.minecraft.util.text.TranslationTextComponent copyRaw() {
        return:TranslationTextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, getfield:String(TranslationTextComponent::key, this:TranslationTextComponent), getfield:Object[](TranslationTextComponent::formatArgs, this:TranslationTextComponent)))
    }
    
    public java.util.Optional<T> func_230534_b_(net.minecraft.util.text.ITextProperties$IStyledTextAcceptor<T> p_230534_1_, net.minecraft.util.text.Style p_230534_2_) {
        var_5_10 : Iterator<ITextProperties>
        var_7_31 : Optional<T>
        
        invokespecial:void(TranslationTextComponent::ensureInitialized, this:TranslationTextComponent)
        var_5_10 = invokeinterface:Iterator<ITextProperties>(List<ITextProperties>::iterator, getfield:List<ITextProperties>(TranslationTextComponent::children, this:TranslationTextComponent))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_10:Iterator<ITextProperties>)) {
            var_7_31 = invokeinterface:Optional<T>(ITextProperties::func_230439_a_, checkcast:ITextProperties(net.minecraft.util.text.ITextProperties.class, invokeinterface:ITextProperties(Iterator<ITextProperties>::next, var_5_10:Iterator<ITextProperties>)), p_230534_1_:ITextProperties$IStyledTextAcceptor<T>, p_230534_2_:Style)
            
            if (invokevirtual:boolean(Optional<T>::isPresent, var_7_31:Optional<T>)) {
                return:Optional<T>(var_7_31:Optional<T>)
            }
        }
        
        return:Optional<T>(invokestatic:Optional<T>(Optional<T>::empty))
    }
    
    public java.util.Optional<T> func_230533_b_(net.minecraft.util.text.ITextProperties$ITextAcceptor<T> p_230533_1_) {
        var_4_10 : Iterator<ITextProperties>
        var_6_30 : Optional<T>
        
        invokespecial:void(TranslationTextComponent::ensureInitialized, this:TranslationTextComponent)
        var_4_10 = invokeinterface:Iterator<ITextProperties>(List<ITextProperties>::iterator, getfield:List<ITextProperties>(TranslationTextComponent::children, this:TranslationTextComponent))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_10:Iterator<ITextProperties>)) {
            var_6_30 = invokeinterface:Optional<T>(ITextProperties::func_230438_a_, checkcast:ITextProperties(net.minecraft.util.text.ITextProperties.class, invokeinterface:ITextProperties(Iterator<ITextProperties>::next, var_4_10:Iterator<ITextProperties>)), p_230533_1_:ITextProperties$ITextAcceptor<T>)
            
            if (invokevirtual:boolean(Optional<T>::isPresent, var_6_30:Optional<T>)) {
                return:Optional<T>(var_6_30:Optional<T>)
            }
        }
        
        return:Optional<T>(invokestatic:Optional<T>(Optional<T>::empty))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent func_230535_a_(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_230535_1_, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p_230535_2_, int p_230535_3_) {
        // java.lang.NullPointerException
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_18 : TranslationTextComponent
        
        if (cmpeq:boolean(this:TranslationTextComponent[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(net.minecraft.util.text.TranslationTextComponent.class, p_equals_1_:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_18 = checkcast:TranslationTextComponent(net.minecraft.util.text.TranslationTextComponent.class, p_equals_1_:Object[expected:TranslationTextComponent])
        return:boolean(logicaland:boolean(logicaland:boolean(invokestatic:boolean(Arrays::equals, getfield:Object[](TranslationTextComponent::formatArgs, this:TranslationTextComponent), getfield:Object[](TranslationTextComponent::formatArgs, var_4_18:TranslationTextComponent)), invokevirtual:boolean(String::equals, getfield:String(TranslationTextComponent::key, this:TranslationTextComponent), getfield:String(TranslationTextComponent::key, var_4_18:TranslationTextComponent))), invokespecial:boolean(TextComponent::equals, this:TranslationTextComponent[expected:TextComponent], p_equals_1_:Object)))
    }
    
    public int hashCode() {
        return:int(add:int(mul:int(ldc:int(31), add:int(mul:int(ldc:int(31), invokespecial:int(TextComponent::hashCode, this:TranslationTextComponent[expected:TextComponent])), invokevirtual:int(String::hashCode, getfield:String(TranslationTextComponent::key, this:TranslationTextComponent)))), invokestatic:int(Arrays::hashCode, getfield:Object[](TranslationTextComponent::formatArgs, this:TranslationTextComponent))))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("TranslatableComponent{key='")), getfield:String(TranslationTextComponent::key, this:TranslationTextComponent)), ldc:char(39)), ldc:String(", args=")), invokestatic:String(Arrays::toString, getfield:Object[](TranslationTextComponent::formatArgs, this:TranslationTextComponent))), ldc:String(", siblings=")), getfield:List<ITextComponent>[expected:Object](TranslationTextComponent::siblings, this:TranslationTextComponent)), ldc:String(", style=")), invokevirtual:Style[expected:Object](TextComponent::getStyle, this:TranslationTextComponent[expected:TextComponent])), ldc:char(125))))
    }
    
    public java.lang.String getKey() {
        return:String(getfield:String(TranslationTextComponent::key, this:TranslationTextComponent))
    }
    
    public java.lang.Object[] getFormatArgs() {
        return:Object[](getfield:Object[](TranslationTextComponent::formatArgs, this:TranslationTextComponent))
    }
    
    public net.minecraft.util.text.TextComponent copyRaw() {
        return:TextComponent(invokevirtual:TranslationTextComponent[expected:TextComponent](TranslationTextComponent::copyRaw, this:TranslationTextComponent))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent copyRaw() {
        return:IFormattableTextComponent(invokevirtual:TranslationTextComponent[expected:IFormattableTextComponent](TranslationTextComponent::copyRaw, this:TranslationTextComponent))
    }
    
    static {
        putstatic:Object[](TranslationTextComponent::field_240753_d_, newarray:Object[](java.lang.Object.class, ldc:int(0)))
        putstatic:ITextProperties(TranslationTextComponent::field_240754_e_, invokestatic:ITextProperties(ITextProperties::func_240652_a_, ldc:String("%")))
        putstatic:ITextProperties(TranslationTextComponent::field_240755_f_, invokestatic:ITextProperties(ITextProperties::func_240652_a_, ldc:String("null")))
        putstatic:Pattern(TranslationTextComponent::STRING_VARIABLE_PATTERN, invokestatic:Pattern(Pattern::compile, ldc:String("%(?:(\\d+)\\$)?([A-Za-z%]|$)")))
    }
}
