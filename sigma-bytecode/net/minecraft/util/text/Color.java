public final class net.minecraft.util.text.Color {
    private void Color(int p_i232573_1_, java.lang.String p_i232573_2_) {
        invokespecial:Object(Object::<init>, this:Color)
        putfield:int(Color::field_240740_c_, this:Color, p_i232573_1_:int)
        putfield:String(Color::field_240741_d_, this:Color, p_i232573_2_:String)
    }
    
    private void Color(int p_i232572_1_) {
        invokespecial:Object(Object::<init>, this:Color)
        putfield:int(Color::field_240740_c_, this:Color, p_i232572_1_:int)
        putfield:String(Color::field_240741_d_, this:Color, aconstnull:String())
    }
    
    public int func_240742_a_() {
        return:int(getfield:int(Color::field_240740_c_, this:Color))
    }
    
    public java.lang.String func_240747_b_() {
        return:String(ternaryop:String(cmpne:boolean(getfield:String(Color::field_240741_d_, this:Color), aconstnull:String()), getfield:String(Color::field_240741_d_, this:Color), invokespecial:String(Color::func_240749_c_, this:Color)))
    }
    
    private java.lang.String func_240749_c_() {
        return:String(invokestatic:String(String::format, ldc:String("#%06X"), initarray:Object[](java.lang.Object[].class, invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(Color::field_240740_c_, this:Color)))))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        return:boolean(logicalor:boolean(cmpeq:boolean(this:Color[expected:Object], p_equals_1_:Object), logicaland:boolean(logicaland:boolean(cmpne:boolean(p_equals_1_:Object, aconstnull:Object()), cmpeq:boolean(invokevirtual:Class<? extends Color>(Color::getClass, this:Color), invokevirtual:Class<?>(Object::getClass, p_equals_1_:Object))), cmpeq:boolean(getfield:int(Color::field_240740_c_, this:Color), getfield:int(Color::field_240740_c_, checkcast:Color(net.minecraft.util.text.Color.class, p_equals_1_:Object[expected:Color]))))))
    }
    
    public int hashCode() {
        return:int(invokestatic:int(Objects::hash, initarray:Object[](java.lang.Object[].class, invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(Color::field_240740_c_, this:Color)), getfield:String[expected:Object](Color::field_240741_d_, this:Color))))
    }
    
    public java.lang.String toString() {
        return:String(ternaryop:String(cmpne:boolean(getfield:String(Color::field_240741_d_, this:Color), aconstnull:String()), getfield:String(Color::field_240741_d_, this:Color), invokespecial:String(Color::func_240749_c_, this:Color)))
    }
    
    public static net.minecraft.util.text.Color func_240744_a_(net.minecraft.util.text.TextFormatting p_240744_0_) {
        return:Color(checkcast:Color(net.minecraft.util.text.Color.class, invokeinterface:Color(Map<TextFormatting, Color>::get, getstatic:Map<TextFormatting, Color>(Color::field_240738_a_), p_240744_0_:TextFormatting[expected:Object])))
    }
    
    public static net.minecraft.util.text.Color func_240743_a_(int p_240743_0_) {
        return:Color(initobject:Color(Color::<init>, p_240743_0_:int))
    }
    
    public static net.minecraft.util.text.Color func_240745_a_(java.lang.String p_240745_0_) {
        if (invokevirtual:boolean(String::startsWith, p_240745_0_:String, ldc:String("#"))) {
            try {
                return:Color(invokestatic:Color(Color::func_240743_a_, invokestatic:int(Integer::parseInt, invokevirtual:String(String::substring, p_240745_0_:String, ldc:int(1)), ldc:int(16))))
            }
            catch (java.lang.NumberFormatException var_3_1C) {
                return:Color(aconstnull:Color())
            }
        }
        
        return:Color(checkcast:Color(net.minecraft.util.text.Color.class, invokeinterface:Color(Map<String, Color>::get, getstatic:Map<String, Color>(Color::field_240739_b_), p_240745_0_:String[expected:Object])))
    }
    
    private static java.lang.String lambda$static$1(net.minecraft.util.text.Color p_240746_0_) {
        return:String(getfield:String(Color::field_240741_d_, p_240746_0_:Color))
    }
    
    private static net.minecraft.util.text.Color lambda$static$0(net.minecraft.util.text.TextFormatting p_240748_0_) {
        return:Color(initobject:Color(Color::<init>, invokevirtual:int(Integer::intValue, invokevirtual:Integer(TextFormatting::getColor, p_240748_0_:TextFormatting)), invokevirtual:String(TextFormatting::getFriendlyName, p_240748_0_:TextFormatting)))
    }
    
    static {
        putstatic:Map<TextFormatting, Color>(Color::field_240738_a_, checkcast:Map<TextFormatting, Color>(java.util.Map<net.minecraft.util.text.TextFormatting, net.minecraft.util.text.Color>.class, invokeinterface:Map<TextFormatting, Color>(Stream<TextFormatting>::collect, invokeinterface:Stream<TextFormatting>(Stream<TextFormatting>::filter, invokestatic:Stream<TextFormatting>(Stream<T>::of, invokestatic:TextFormatting[](TextFormatting::values)), invokedynamic:Predicate<? super TextFormatting>(test:()Ljava/util/function/Predicate;)), invokestatic:Collector(ImmutableMap::toImmutableMap, invokestatic:Function<Object, Object>(Function<Object, Object>::identity), bind:Function<Object, Color>((p_240748_0_:TextFormatting) -> return:Color(initobject:Color(Color::<init>, invokevirtual:int(Integer::intValue, invokevirtual:Integer(TextFormatting::getColor, p_240748_0_:TextFormatting)), invokevirtual:String(TextFormatting::getFriendlyName, p_240748_0_:TextFormatting))))))))
        putstatic:Map<String, Color>(Color::field_240739_b_, checkcast:Map<String, Color>(java.util.Map<java.lang.String, net.minecraft.util.text.Color>.class, invokeinterface:Map<String, Color>(Stream<Color>::collect, invokeinterface:Stream<Color>(Collection<Color>::stream, invokeinterface:Collection<Color>(Map<TextFormatting, Color>::values, getstatic:Map<TextFormatting, Color>(Color::field_240738_a_))), invokestatic:Collector(ImmutableMap::toImmutableMap, bind:Function<Object, String>((p_240746_0_:Color) -> return:String(getfield:String(Color::field_240741_d_, p_240746_0_:Color))), invokestatic:Function<Object, Object>(Function<Object, Object>::identity)))))
    }
}
