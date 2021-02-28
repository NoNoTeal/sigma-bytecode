public final class net.minecraft.util.text.ITextProperties$4 {
    public void ITextProperties$4(java.util.List p0) {
        putfield:List(ITextProperties$4::val$p_240654_0_, this:ITextProperties$4, p0:List)
        invokespecial:Object(Object::<init>, this:ITextProperties$4)
    }
    
    public java.util.Optional<T> func_230438_a_(net.minecraft.util.text.ITextProperties$ITextAcceptor<T> p_230438_1_) {
        var_4_0C : Iterator<ITextProperties>
        var_6_2C : Optional<T>
        
        var_4_0C = invokeinterface:Iterator<ITextProperties>(List<ITextProperties>::iterator, getfield:List(ITextProperties$4::val$p_240654_0_, this:ITextProperties$4))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_0C:Iterator<ITextProperties>)) {
            var_6_2C = invokeinterface:Optional<T>(ITextProperties::func_230438_a_, checkcast:ITextProperties(net.minecraft.util.text.ITextProperties.class, invokeinterface:ITextProperties(Iterator<ITextProperties>::next, var_4_0C:Iterator<ITextProperties>)), p_230438_1_:ITextProperties$ITextAcceptor<T>)
            
            if (invokevirtual:boolean(Optional<T>::isPresent, var_6_2C:Optional<T>)) {
                return:Optional<T>(var_6_2C:Optional<T>)
            }
        }
        
        return:Optional<T>(invokestatic:Optional<T>(Optional<T>::empty))
    }
    
    public java.util.Optional<T> func_230439_a_(net.minecraft.util.text.ITextProperties$IStyledTextAcceptor<T> p_230439_1_, net.minecraft.util.text.Style p_230439_2_) {
        var_5_0C : Iterator<ITextProperties>
        var_7_2D : Optional<T>
        
        var_5_0C = invokeinterface:Iterator<ITextProperties>(List<ITextProperties>::iterator, getfield:List(ITextProperties$4::val$p_240654_0_, this:ITextProperties$4))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_0C:Iterator<ITextProperties>)) {
            var_7_2D = invokeinterface:Optional<T>(ITextProperties::func_230439_a_, checkcast:ITextProperties(net.minecraft.util.text.ITextProperties.class, invokeinterface:ITextProperties(Iterator<ITextProperties>::next, var_5_0C:Iterator<ITextProperties>)), p_230439_1_:ITextProperties$IStyledTextAcceptor<T>, p_230439_2_:Style)
            
            if (invokevirtual:boolean(Optional<T>::isPresent, var_7_2D:Optional<T>)) {
                return:Optional<T>(var_7_2D:Optional<T>)
            }
        }
        
        return:Optional<T>(invokestatic:Optional<T>(Optional<T>::empty))
    }
}
