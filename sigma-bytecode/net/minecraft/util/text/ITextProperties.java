public interface net.minecraft.util.text.ITextProperties {
    java.util.Optional<T> func_230438_a_(net.minecraft.util.text.ITextProperties$ITextAcceptor<T> p0);
    
    java.util.Optional<T> func_230439_a_(net.minecraft.util.text.ITextProperties$IStyledTextAcceptor<T> p0, net.minecraft.util.text.Style p1);
    
    net.minecraft.util.text.ITextProperties func_240652_a_(java.lang.String p_240652_0_) {
        return:ITextProperties(initobject:ITextProperties$2[expected:ITextProperties](ITextProperties$2::<init>, p_240652_0_:String))
    }
    
    net.minecraft.util.text.ITextProperties func_240653_a_(java.lang.String p_240653_0_, net.minecraft.util.text.Style p_240653_1_) {
        return:ITextProperties(initobject:ITextProperties$3[expected:ITextProperties](ITextProperties$3::<init>, p_240653_0_:String, p_240653_1_:Style))
    }
    
    net.minecraft.util.text.ITextProperties func_240655_a_(net.minecraft.util.text.ITextProperties[] p_240655_0_) {
        return:ITextProperties(invokestatic:ITextProperties(ITextProperties::func_240654_a_, invokestatic:ImmutableList[expected:List<ITextProperties>](ImmutableList::copyOf, p_240655_0_:ITextProperties[][expected:Object[]])))
    }
    
    net.minecraft.util.text.ITextProperties func_240654_a_(java.util.List<net.minecraft.util.text.ITextProperties> p_240654_0_) {
        return:ITextProperties(initobject:ITextProperties$4[expected:ITextProperties](ITextProperties$4::<init>, p_240654_0_:List<ITextProperties>))
    }
    
    java.lang.String getString() {
        var_3_0A : StringBuilder
        
        var_3_0A = initobject:StringBuilder(StringBuilder::<init>)
        invokeinterface:Optional<Object>(ITextProperties::func_230438_a_, this:ITextProperties, bind:ITextProperties$ITextAcceptor<Object>((p_241754_1_:String) -> {
            invokevirtual:StringBuilder(StringBuilder::append, var_3_0A:StringBuilder, p_241754_1_:String)
            return:Optional<Object>(invokestatic:Optional<Object>(Optional<T>::empty))
        }))
        return:String(invokevirtual:String(StringBuilder::toString, var_3_0A:StringBuilder))
    }
    
    java.util.Optional lambda$getString$0(java.lang.StringBuilder stringbuilder, java.lang.String p_241754_1_) {
        invokevirtual:StringBuilder(StringBuilder::append, stringbuilder:StringBuilder, p_241754_1_:String)
        return:Optional(invokestatic:Optional<Object>(Optional<Object>::empty))
    }
    
    static {
        putstatic:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(ITextProperties::field_240650_b_, invokestatic:Optional<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(Optional<T>::of, getstatic:\u3bc9\u4492\u69d9\ud12e\uc238\u6c56(\u3bc9\u4492\u69d9\ud12e\uc238\u6c56::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1)))
        putstatic:ITextProperties(ITextProperties::field_240651_c_, initobject:ITextProperties$1[expected:ITextProperties](ITextProperties$1::<init>))
    }
}
