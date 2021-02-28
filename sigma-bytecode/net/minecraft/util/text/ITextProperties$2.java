public final class net.minecraft.util.text.ITextProperties$2 {
    public void ITextProperties$2(java.lang.String p0) {
        putfield:String(ITextProperties$2::val$p_240652_0_, this:ITextProperties$2, p0:String)
        invokespecial:Object(Object::<init>, this:ITextProperties$2)
    }
    
    public java.util.Optional<T> func_230438_a_(net.minecraft.util.text.ITextProperties$ITextAcceptor<T> p_230438_1_) {
        return:Optional<T>(invokeinterface:Optional<T>(ITextProperties$ITextAcceptor<T>::accept, p_230438_1_:ITextProperties$ITextAcceptor<T>, getfield:String(ITextProperties$2::val$p_240652_0_, this:ITextProperties$2)))
    }
    
    public java.util.Optional<T> func_230439_a_(net.minecraft.util.text.ITextProperties$IStyledTextAcceptor<T> p_230439_1_, net.minecraft.util.text.Style p_230439_2_) {
        return:Optional<T>(invokeinterface:Optional<T>(ITextProperties$IStyledTextAcceptor<T>::accept, p_230439_1_:ITextProperties$IStyledTextAcceptor<T>, p_230439_2_:Style, getfield:String(ITextProperties$2::val$p_240652_0_, this:ITextProperties$2)))
    }
}
