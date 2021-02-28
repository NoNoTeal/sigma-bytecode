public class net.minecraft.util.text.TextPropertiesManager {
    public void TextPropertiesManager() {
        invokespecial:Object(Object::<init>, this:TextPropertiesManager)
        putfield:List<ITextProperties>(TextPropertiesManager::field_238153_a_, this:TextPropertiesManager, invokestatic:ArrayList[expected:List<ITextProperties>](Lists::newArrayList))
    }
    
    public void func_238155_a_(net.minecraft.util.text.ITextProperties p_238155_1_) {
        invokeinterface:boolean(List<ITextProperties>::add, getfield:List<ITextProperties>(TextPropertiesManager::field_238153_a_, this:TextPropertiesManager), p_238155_1_:ITextProperties)
    }
    
    public net.minecraft.util.text.ITextProperties func_238154_a_() {
        if (invokeinterface:boolean(List<E>::isEmpty, getfield:List<ITextProperties>(TextPropertiesManager::field_238153_a_, this:TextPropertiesManager))) {
            return:ITextProperties(aconstnull:ITextProperties())
        }
        
        return:ITextProperties(ternaryop:ITextProperties(cmpeq:boolean(invokeinterface:int(List<E>::size, getfield:List<ITextProperties>(TextPropertiesManager::field_238153_a_, this:TextPropertiesManager)), ldc:int(1)), checkcast:ITextProperties(net.minecraft.util.text.ITextProperties.class, invokeinterface:ITextProperties(List<ITextProperties>::get, getfield:List<ITextProperties>(TextPropertiesManager::field_238153_a_, this:TextPropertiesManager), ldc:int(0))), invokestatic:ITextProperties(ITextProperties::func_240654_a_, getfield:List<ITextProperties>(TextPropertiesManager::field_238153_a_, this:TextPropertiesManager))))
    }
    
    public net.minecraft.util.text.ITextProperties func_238156_b_() {
        var_3_07 : ITextProperties
        
        var_3_07 = invokevirtual:ITextProperties(TextPropertiesManager::func_238154_a_, this:TextPropertiesManager)
        return:ITextProperties(ternaryop:ITextProperties(cmpne:boolean(var_3_07:ITextProperties, aconstnull:ITextProperties()), var_3_07:ITextProperties, getstatic:ITextProperties(ITextProperties::field_240651_c_)))
    }
}
