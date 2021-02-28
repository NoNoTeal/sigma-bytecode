public abstract class net.minecraft.util.text.NBTTextComponent {
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec func_218672_b(java.lang.String p_218672_0_) {
        try {
            return:\ub171\u47c2\u3bd6\u3776\u59ec(invokevirtual:\ub171\u47c2\u3bd6\u3776\u59ec(\u64ab\u7d52\u5f50\uc3e3\ubb2b::parse, initobject:\u64ab\u7d52\u5f50\uc3e3\ubb2b(\u64ab\u7d52\u5f50\uc3e3\ubb2b::<init>), initobject:StringReader(StringReader::<init>, p_218672_0_:String)))
        }
        catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_3_16) {
            return:\ub171\u47c2\u3bd6\u3776\u59ec(aconstnull:\ub171\u47c2\u3bd6\u3776\u59ec())
        }
    }
    
    public void NBTTextComponent(java.lang.String p_i50781_1_, boolean p_i50781_2_) {
        invokespecial:NBTTextComponent(NBTTextComponent::<init>, this:NBTTextComponent, p_i50781_1_:String, invokestatic:\ub171\u47c2\u3bd6\u3776\u59ec(NBTTextComponent::func_218672_b, p_i50781_1_:String), p_i50781_2_:boolean)
    }
    
    public void NBTTextComponent(java.lang.String p_i50782_1_, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p_i50782_2_, boolean p_i50782_3_) {
        invokespecial:TextComponent(TextComponent::<init>, this:NBTTextComponent)
        putfield:String(NBTTextComponent::field_218679_c, this:NBTTextComponent, p_i50782_1_:String)
        putfield:\ub171\u47c2\u3bd6\u3776\u59ec(NBTTextComponent::field_218680_d, this:NBTTextComponent, p_i50782_2_:\ub171\u47c2\u3bd6\u3776\u59ec)
        putfield:boolean(NBTTextComponent::field_218678_b, this:NBTTextComponent, p_i50782_3_:boolean)
    }
    
    public abstract java.util.stream.Stream<\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc> func_218673_a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0);
    
    public java.lang.String func_218676_i() {
        return:String(getfield:String(NBTTextComponent::field_218679_c, this:NBTTextComponent))
    }
    
    public boolean func_218677_j() {
        return:boolean(getfield:boolean(NBTTextComponent::field_218678_b, this:NBTTextComponent))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent func_230535_a_(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_230535_1_, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p_230535_2_, int p_230535_3_) {
        var_6_29 : Stream<Object>
        var_6_16 : Exception
        
        if (logicaland:boolean(cmpne:boolean(p_230535_1_:\u8413\u5140\u64f2\uc9f6\u9937, aconstnull:\u8413\u5140\u64f2\uc9f6\u9937()), cmpne:boolean(getfield:\ub171\u47c2\u3bd6\u3776\u59ec(NBTTextComponent::field_218680_d, this:NBTTextComponent), aconstnull:\ub171\u47c2\u3bd6\u3776\u59ec()))) {
            var_6_29 = invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Stream<\uc31c\uc87f\uc246\u3776\ub7dc>::flatMap, invokevirtual:Stream<\uc31c\uc87f\uc246\u3776\ub7dc>(NBTTextComponent::func_218673_a, this:NBTTextComponent, p_230535_1_:\u8413\u5140\u64f2\uc9f6\u9937), bind:Function<Object, Stream<Object>>((p_218675_1_:\uc31c\uc87f\uc246\u3776\ub7dc) -> {
                try {
                    return:Stream<Object>(invokeinterface:Stream<Object>(Collection<Object>::stream, invokevirtual:List<\u93a2\u97b7\u647c\ud36e\u64ab>(\ub171\u47c2\u3bd6\u3776\u59ec::\uf94d\ua068\u7ce1\u8c8a\u4ab3\ud158, getfield:\ub171\u47c2\u3bd6\u3776\u59ec(NBTTextComponent::field_218680_d, this:NBTTextComponent), p_218675_1_:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])))
                }
                catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_4_11) {
                    return:Stream<Object>(invokestatic:Stream<Object>(Stream<T>::empty))
                }
            })), invokedynamic:Function<? super Object, String>(apply:()Ljava/util/function/Function;))
            return:IFormattableTextComponent(ternaryop:StringTextComponent(getfield:boolean(NBTTextComponent::field_218678_b, this:NBTTextComponent), checkcast:StringTextComponent(net.minecraft.util.text.StringTextComponent.class, invokevirtual:StringTextComponent(Optional<StringTextComponent>::orElse, invokeinterface:Optional<StringTextComponent>(Stream<StringTextComponent>::reduce, invokeinterface:Stream<Object>(Stream<Object>::flatMap, var_6_29:Stream<Object>, bind:Function<Object, Stream<IFormattableTextComponent>>((p_223137_3_:String) -> {
                try {
                    return:Stream<IFormattableTextComponent>(invokestatic:Stream<IFormattableTextComponent>(Stream<T>::of, invokestatic:IFormattableTextComponent(TextComponentUtils::func_240645_a_, p_230535_1_:\u8413\u5140\u64f2\uc9f6\u9937, invokestatic:IFormattableTextComponent(ITextComponent$Serializer::func_240643_a_, p_223137_3_:String), p_230535_2_:\u7d52\u718f\u3776\u6fb0\ub83f, p_230535_3_:int)))
                }
                catch (java.lang.Exception var_6_16) {
                    invokeinterface:void(Logger::warn, getstatic:Logger(NBTTextComponent::field_218681_e), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Failed to parse component: ")), p_223137_3_:String)), var_6_16:Exception[expected:Throwable])
                    return:Stream<IFormattableTextComponent>(invokestatic:Stream<IFormattableTextComponent>(Stream<T>::of, newarray:IFormattableTextComponent[](net.minecraft.util.text.IFormattableTextComponent.class, ldc:int(0))))
                }
            })), bind:BiFunction<Object, Object, IFormattableTextComponent>[expected:BinaryOperator<StringTextComponent>]((p_240704_0_:IFormattableTextComponent, p_240704_1_:IFormattableTextComponent) -> return:IFormattableTextComponent(invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, p_240704_0_:IFormattableTextComponent, ldc:String(", ")), p_240704_1_:IFormattableTextComponent[expected:ITextComponent])))), initobject:StringTextComponent(StringTextComponent::<init>, ldc:String("")))), initobject:StringTextComponent(StringTextComponent::<init>, invokevirtual:String(Joiner::join, invokestatic:Joiner(Joiner::on, ldc:String(", ")), invokeinterface:Iterator<Object>(BaseStream<Object, BaseStream>::iterator, var_6_29:Stream<Object>)))))
        }
        
        return:IFormattableTextComponent(initobject:StringTextComponent[expected:IFormattableTextComponent](StringTextComponent::<init>, ldc:String("")))
    }
    
    private static net.minecraft.util.text.IFormattableTextComponent lambda$func_230535_a_$2(net.minecraft.util.text.IFormattableTextComponent p_240704_0_, net.minecraft.util.text.IFormattableTextComponent p_240704_1_) {
        return:IFormattableTextComponent(invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, p_240704_0_:IFormattableTextComponent, ldc:String(", ")), p_240704_1_:IFormattableTextComponent[expected:ITextComponent]))
    }
    
    private static java.util.stream.Stream lambda$func_230535_a_$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_230535_1_, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p_230535_2_, int p_230535_3_, java.lang.String p_223137_3_) {
        var_6_16 : Exception
        
        try {
            return:Stream(invokestatic:Stream<IFormattableTextComponent>(Stream<T>::of, invokestatic:IFormattableTextComponent(TextComponentUtils::func_240645_a_, p_230535_1_:\u8413\u5140\u64f2\uc9f6\u9937, invokestatic:IFormattableTextComponent[expected:ITextComponent](ITextComponent$Serializer::func_240643_a_, p_223137_3_:String), p_230535_2_:\u7d52\u718f\u3776\u6fb0\ub83f, p_230535_3_:int)))
        }
        catch (java.lang.Exception var_6_16) {
            invokeinterface:void(Logger::warn, getstatic:Logger(NBTTextComponent::field_218681_e), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Failed to parse component: ")), p_223137_3_:String)), var_6_16:Exception[expected:Throwable])
            return:Stream(invokestatic:Stream<IFormattableTextComponent>(Stream<T>::of, newarray:IFormattableTextComponent[](net.minecraft.util.text.IFormattableTextComponent.class, ldc:int(0))))
        }
    }
    
    private java.util.stream.Stream lambda$func_230535_a_$0(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p_218675_1_) {
        try {
            return:Stream(invokeinterface:Stream<Object>(Collection<Object>::stream, invokevirtual:List<\u93a2\u97b7\u647c\ud36e\u64ab>[expected:Collection<Object>](\ub171\u47c2\u3bd6\u3776\u59ec::\uf94d\ua068\u7ce1\u8c8a\u4ab3\ud158, getfield:\ub171\u47c2\u3bd6\u3776\u59ec(NBTTextComponent::field_218680_d, this:NBTTextComponent), p_218675_1_:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])))
        }
        catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_4_11) {
            return:Stream(invokestatic:Stream<Object>(Stream<Object>::empty))
        }
    }
    
    static {
        putstatic:Logger(NBTTextComponent::field_218681_e, invokestatic:Logger(LogManager::getLogger))
    }
}
