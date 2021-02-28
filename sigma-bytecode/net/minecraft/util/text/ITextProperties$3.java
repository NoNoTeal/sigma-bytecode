public final class net.minecraft.util.text.ITextProperties$3 {
    public void ITextProperties$3(java.lang.String p0, net.minecraft.util.text.Style p1) {
        putfield:String(ITextProperties$3::val$p_240653_0_, this:ITextProperties$3, p0:String)
        putfield:Style(ITextProperties$3::val$p_240653_1_, this:ITextProperties$3, p1:Style)
        invokespecial:Object(Object::<init>, this:ITextProperties$3)
    }
    
    public java.util.Optional<T> func_230438_a_(net.minecraft.util.text.ITextProperties$ITextAcceptor<T> p_230438_1_) {
        return:Optional<T>(invokeinterface:Optional<T>(ITextProperties$ITextAcceptor<T>::accept, p_230438_1_:ITextProperties$ITextAcceptor<T>, getfield:String(ITextProperties$3::val$p_240653_0_, this:ITextProperties$3)))
    }
    
    public java.util.Optional<T> func_230439_a_(net.minecraft.util.text.ITextProperties$IStyledTextAcceptor<T> p_230439_1_, net.minecraft.util.text.Style p_230439_2_) {
        return:Optional<T>(invokeinterface:Optional<T>(ITextProperties$IStyledTextAcceptor<T>::accept, p_230439_1_:ITextProperties$IStyledTextAcceptor<T>, invokevirtual:Style(Style::mergeStyle, getfield:Style(ITextProperties$3::val$p_240653_1_, this:ITextProperties$3), p_230439_2_:Style), getfield:String(ITextProperties$3::val$p_240653_0_, this:ITextProperties$3)))
    }
}
