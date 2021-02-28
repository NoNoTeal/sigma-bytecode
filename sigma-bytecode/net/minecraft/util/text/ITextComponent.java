public interface net.minecraft.util.text.ITextComponent {
    net.minecraft.util.text.Style getStyle();
    
    java.lang.String getUnformattedComponentText();
    
    java.lang.String getString() {
        return:String(invokespecial:String(ITextProperties::getString, this:ITextComponent[expected:ITextProperties]))
    }
    
    java.lang.String getStringTruncated(int maxLen) {
        var_4_0A : StringBuilder
        var_5_09 : int
        stringbuilder : StringBuilder [generated]
        
        var_4_0A = initobject:StringBuilder(StringBuilder::<init>)
        invokeinterface:Optional<Object>(ITextComponent::func_230438_a_, this:ITextComponent, bind:ITextProperties$ITextAcceptor<Object>((p_240639_2_:String) -> {
            var_5_09 = sub:int(maxLen:int, invokevirtual:int(StringBuilder::length, stringbuilder:StringBuilder))
            
            if (cmple:boolean(var_5_09:int, ldc:int(0))) {
                return:Optional(getstatic:Optional(ITextComponent::field_240650_b_))
            }
            else {
                invokevirtual:StringBuilder(StringBuilder::append, stringbuilder:StringBuilder, ternaryop:String(cmple:boolean(invokevirtual:int(String::length, p_240639_2_:String), var_5_09:int), p_240639_2_:String, invokevirtual:String(String::substring, p_240639_2_:String, ldc:int(0), var_5_09:int)))
                return:Optional(invokestatic:Optional<Object>(Optional<Object>::empty))
            }
        }))
        return:String(invokevirtual:String(StringBuilder::toString, var_4_0A:StringBuilder))
    }
    
    java.util.List<net.minecraft.util.text.ITextComponent> getSiblings();
    
    net.minecraft.util.text.IFormattableTextComponent copyRaw();
    
    net.minecraft.util.text.IFormattableTextComponent deepCopy();
    
    \u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d func_241878_f();
    
    java.util.Optional<T> func_230439_a_(net.minecraft.util.text.ITextProperties$IStyledTextAcceptor<T> p_230439_1_, net.minecraft.util.text.Style p_230439_2_) {
        // java.lang.NullPointerException
    }
    
    java.util.Optional<T> func_230438_a_(net.minecraft.util.text.ITextProperties$ITextAcceptor<T> p_230438_1_) {
        var_4_0A : Optional<Object>
        var_5_22 : Iterator<ITextComponent>
        var_7_42 : Optional<Object>
        
        var_4_0A = invokeinterface:Optional<Object>(ITextComponent::func_230533_b_, this:ITextComponent, p_230438_1_:ITextProperties$ITextAcceptor<T>)
        
        if (invokevirtual:boolean(Optional::isPresent, var_4_0A:Optional<Object>)) {
            return:Optional<T>(var_4_0A:Optional<Object>)
        }
        
        var_5_22 = invokeinterface:Iterator<ITextComponent>(List<ITextComponent>::iterator, invokeinterface:List<ITextComponent>(ITextComponent::getSiblings, this:ITextComponent))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_22:Iterator<ITextComponent>)) {
            var_7_42 = invokeinterface:Optional<Object>(ITextComponent::func_230438_a_, checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, invokeinterface:ITextComponent(Iterator<ITextComponent>::next, var_5_22:Iterator<ITextComponent>)), p_230438_1_:ITextProperties$ITextAcceptor<T>)
            
            if (invokevirtual:boolean(Optional::isPresent, var_7_42:Optional<Object>)) {
                return:Optional<T>(var_7_42:Optional<Object>)
            }
        }
        
        return:Optional<T>(invokestatic:Optional<T>(Optional<T>::empty))
    }
    
    java.util.Optional<T> func_230534_b_(net.minecraft.util.text.ITextProperties$IStyledTextAcceptor<T> p_230534_1_, net.minecraft.util.text.Style p_230534_2_) {
        return:Optional<T>(invokeinterface:Optional<T>(ITextProperties$IStyledTextAcceptor<T>::accept, p_230534_1_:ITextProperties$IStyledTextAcceptor<T>, p_230534_2_:Style, invokeinterface:String(ITextComponent::getUnformattedComponentText, this:ITextComponent)))
    }
    
    java.util.Optional<T> func_230533_b_(net.minecraft.util.text.ITextProperties$ITextAcceptor<T> p_230533_1_) {
        return:Optional<T>(invokeinterface:Optional<T>(ITextProperties$ITextAcceptor<T>::accept, p_230533_1_:ITextProperties$ITextAcceptor<T>, invokeinterface:String(ITextComponent::getUnformattedComponentText, this:ITextComponent)))
    }
    
    net.minecraft.util.text.ITextComponent func_244388_a(java.lang.String p_244388_0_) {
        return:ITextComponent(ternaryop:ITextComponent(cmpne:boolean(p_244388_0_:String, aconstnull:String()), initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, p_244388_0_:String), getstatic:ITextComponent(StringTextComponent::EMPTY)))
    }
    
    java.util.Optional lambda$getStringTruncated$0(int maxLen, java.lang.StringBuilder stringbuilder, java.lang.String p_240639_2_) {
        var_5_09 : int
        
        var_5_09 = sub:int(maxLen:int, invokevirtual:int(StringBuilder::length, stringbuilder:StringBuilder))
        
        if (cmple:boolean(var_5_09:int, ldc:int(0))) {
            return:Optional(getstatic:Optional(ITextComponent::field_240650_b_))
        }
        
        invokevirtual:StringBuilder(StringBuilder::append, stringbuilder:StringBuilder, ternaryop:String(cmple:boolean(invokevirtual:int(String::length, p_240639_2_:String), var_5_09:int), p_240639_2_:String, invokevirtual:String(String::substring, p_240639_2_:String, ldc:int(0), var_5_09:int)))
        return:Optional(invokestatic:Optional<Object>(Optional<Object>::empty))
    }
}
