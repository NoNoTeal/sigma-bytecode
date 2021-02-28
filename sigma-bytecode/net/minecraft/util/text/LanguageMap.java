public abstract class net.minecraft.util.text.LanguageMap {
    public void LanguageMap() {
        invokespecial:Object(Object::<init>, this:LanguageMap)
    }
    
    private static net.minecraft.util.text.LanguageMap func_240595_c_() {
        // java.lang.NullPointerException
    }
    
    public static void func_240593_a_(java.io.InputStream p_240593_0_, java.util.function.BiConsumer<java.lang.String, java.lang.String> p_240593_1_) {
        // java.lang.NullPointerException
    }
    
    public static net.minecraft.util.text.LanguageMap getInstance() {
        return:LanguageMap(getstatic:LanguageMap(LanguageMap::field_240592_d_))
    }
    
    public static void func_240594_a_(net.minecraft.util.text.LanguageMap p_240594_0_) {
        putstatic:LanguageMap(LanguageMap::field_240592_d_, p_240594_0_:LanguageMap)
    }
    
    public abstract java.lang.String func_230503_a_(java.lang.String p0);
    
    public abstract boolean func_230506_b_(java.lang.String p0);
    
    public abstract boolean func_230505_b_();
    
    public abstract \u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d func_241870_a(net.minecraft.util.text.ITextProperties p0);
    
    public java.util.List<\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d> func_244260_a(java.util.List<net.minecraft.util.text.ITextProperties> p_244260_1_) {
        return:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(checkcast:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(java.util.List<\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d>.class, invokeinterface:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, p_244260_1_:List<ITextProperties>[expected:Collection<Object>]), invokedynamic:Function<ITextProperties, \u718f\u8413\u1833\u72f1\u5fe1\u927d>(apply:(Lnet/minecraft/util/text/LanguageMap;)Ljava/util/function/Function;, invokestatic:LanguageMap(LanguageMap::getInstance))), invokestatic:Collector(ImmutableList::toImmutableList))))
    }
    
    static {
        putstatic:Logger(LanguageMap::LOGGER, invokestatic:Logger(LogManager::getLogger))
        putstatic:Gson(LanguageMap::field_240591_b_, initobject:Gson(Gson::<init>))
        putstatic:Pattern(LanguageMap::NUMERIC_VARIABLE_PATTERN, invokestatic:Pattern(Pattern::compile, ldc:String("%(\\d+\\$)?[\\d.]*[df]")))
        putstatic:LanguageMap(LanguageMap::field_240592_d_, invokestatic:LanguageMap(LanguageMap::func_240595_c_))
    }
}
