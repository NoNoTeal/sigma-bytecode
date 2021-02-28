public class net.minecraft.util.text.TextComponentUtils {
    public void TextComponentUtils() {
        invokespecial:Object(Object::<init>, this:TextComponentUtils)
    }
    
    public static net.minecraft.util.text.IFormattableTextComponent func_240648_a_(net.minecraft.util.text.IFormattableTextComponent p_240648_0_, net.minecraft.util.text.Style p_240648_1_) {
        var_4_12 : Style
        
        if (invokevirtual:boolean(Style::isEmpty, p_240648_1_:Style)) {
            return:IFormattableTextComponent(p_240648_0_:IFormattableTextComponent)
        }
        
        var_4_12 = invokeinterface:Style(ITextComponent::getStyle, p_240648_0_:IFormattableTextComponent[expected:ITextComponent])
        
        if (invokevirtual:boolean(Style::isEmpty, var_4_12:Style)) {
            return:IFormattableTextComponent(invokeinterface:IFormattableTextComponent(IFormattableTextComponent::setStyle, p_240648_0_:IFormattableTextComponent, p_240648_1_:Style))
        }
        
        return:IFormattableTextComponent(ternaryop:IFormattableTextComponent(invokevirtual:boolean(Style::equals, var_4_12:Style, p_240648_1_:Style[expected:Object]), p_240648_0_:IFormattableTextComponent, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::setStyle, p_240648_0_:IFormattableTextComponent, invokevirtual:Style(Style::mergeStyle, var_4_12:Style, p_240648_1_:Style))))
    }
    
    public static net.minecraft.util.text.IFormattableTextComponent func_240645_a_(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_240645_0_, net.minecraft.util.text.ITextComponent p_240645_1_, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p_240645_2_, int p_240645_3_) {
        var_6_2F : IFormattableTextComponent
        var_7_3C : Iterator<ITextComponent>
        
        if (cmpgt:boolean(p_240645_3_:int, ldc:int(100))) {
            return:IFormattableTextComponent(invokeinterface:IFormattableTextComponent(ITextComponent::deepCopy, p_240645_1_:ITextComponent))
        }
        
        var_6_2F = ternaryop:IFormattableTextComponent(instanceof:boolean(net.minecraft.util.text.ITargetedTextComponent.class, p_240645_1_:ITextComponent), invokeinterface:IFormattableTextComponent(ITargetedTextComponent::func_230535_a_, checkcast:ITargetedTextComponent(net.minecraft.util.text.ITargetedTextComponent.class, p_240645_1_:ITextComponent[expected:ITargetedTextComponent]), p_240645_0_:\u8413\u5140\u64f2\uc9f6\u9937, p_240645_2_:\u7d52\u718f\u3776\u6fb0\ub83f, add:int(p_240645_3_:int, ldc:int(1))), invokeinterface:IFormattableTextComponent(ITextComponent::copyRaw, p_240645_1_:ITextComponent))
        var_7_3C = invokeinterface:Iterator<ITextComponent>(List<ITextComponent>::iterator, invokeinterface:List<ITextComponent>(ITextComponent::getSiblings, p_240645_1_:ITextComponent))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_3C:Iterator<ITextComponent>)) {
            invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, var_6_2F:IFormattableTextComponent, invokestatic:IFormattableTextComponent(TextComponentUtils::func_240645_a_, p_240645_0_:\u8413\u5140\u64f2\uc9f6\u9937, checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, invokeinterface:ITextComponent(Iterator<ITextComponent>::next, var_7_3C:Iterator<ITextComponent>)), p_240645_2_:\u7d52\u718f\u3776\u6fb0\ub83f, add:int(p_240645_3_:int, ldc:int(1))))
        }
        
        return:IFormattableTextComponent(invokeinterface:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, var_6_2F:IFormattableTextComponent, invokestatic:Style(TextComponentUtils::func_240646_a_, p_240645_0_:\u8413\u5140\u64f2\uc9f6\u9937, invokeinterface:Style(ITextComponent::getStyle, p_240645_1_:ITextComponent), p_240645_2_:\u7d52\u718f\u3776\u6fb0\ub83f, p_240645_3_:int)))
    }
    
    private static net.minecraft.util.text.Style func_240646_a_(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_240646_0_, net.minecraft.util.text.Style p_240646_1_, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p_240646_2_, int p_240646_3_) {
        var_6_08 : HoverEvent
        var_7_1A : ITextComponent
        
        var_6_08 = invokevirtual:HoverEvent(Style::getHoverEvent, p_240646_1_:Style)
        
        if (cmpne:boolean(var_6_08:HoverEvent, aconstnull:HoverEvent())) {
            var_7_1A = checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, invokevirtual:ITextComponent(HoverEvent::getParameter, var_6_08:HoverEvent, getstatic:HoverEvent$Action<ITextComponent>(HoverEvent$Action::SHOW_TEXT)))
            
            if (cmpne:boolean(var_7_1A:ITextComponent, aconstnull:ITextComponent())) {
                return:Style(invokevirtual:Style(Style::setHoverEvent, p_240646_1_:Style, initobject:HoverEvent(HoverEvent::<init>, getstatic:HoverEvent$Action<ITextComponent>(HoverEvent$Action::SHOW_TEXT), invokestatic:IFormattableTextComponent(TextComponentUtils::func_240645_a_, p_240646_0_:\u8413\u5140\u64f2\uc9f6\u9937, var_7_1A:ITextComponent, p_240646_2_:\u7d52\u718f\u3776\u6fb0\ub83f, add:int(p_240646_3_:int, ldc:int(1))))))
            }
        }
        
        return:Style(p_240646_1_:Style)
    }
    
    public static net.minecraft.util.text.ITextComponent getDisplayName(com.mojang.authlib.GameProfile profile) {
        if (cmpne:boolean(invokevirtual:String(GameProfile::getName, profile:GameProfile), aconstnull:String())) {
            return:ITextComponent(initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, invokevirtual:String(GameProfile::getName, profile:GameProfile)))
        }
        
        return:ITextComponent(ternaryop:StringTextComponent[expected:ITextComponent](cmpne:boolean(invokevirtual:UUID(GameProfile::getId, profile:GameProfile), aconstnull:UUID()), initobject:StringTextComponent(StringTextComponent::<init>, invokevirtual:String(UUID::toString, invokevirtual:UUID(GameProfile::getId, profile:GameProfile))), initobject:StringTextComponent(StringTextComponent::<init>, ldc:String("(unknown)"))))
    }
    
    public static net.minecraft.util.text.ITextComponent makeGreenSortedList(java.util.Collection<java.lang.String> collection) {
        return:ITextComponent(invokestatic:ITextComponent(TextComponentUtils::makeSortedList, collection:Collection<String>, bind:Function<Object, IFormattableTextComponent>((p_197681_0_:String) -> return:IFormattableTextComponent(invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:StringTextComponent(StringTextComponent::<init>, p_197681_0_:String), getstatic:TextFormatting(TextFormatting::GREEN))))))
    }
    
    public static net.minecraft.util.text.ITextComponent makeSortedList(java.util.Collection<T> collection, java.util.function.Function<T, net.minecraft.util.text.ITextComponent> toTextComponent) {
        var_4_33 : ArrayList
        
        if (invokeinterface:boolean(Collection<E>::isEmpty, collection:Collection<T>)) {
            return:ITextComponent(getstatic:ITextComponent(StringTextComponent::EMPTY))
        }
        
        if (cmpeq:boolean(invokeinterface:int(Collection<E>::size, collection:Collection<T>), ldc:int(1))) {
            return:ITextComponent(checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, invokeinterface:ITextComponent(Function<T, ITextComponent>::apply, toTextComponent:Function<T, ITextComponent>, invokeinterface:T extends Comparable<T>(Iterator<T>::next, invokeinterface:Iterator<T>(Collection<T>::iterator, collection:Collection<T>)))))
        }
        
        var_4_33 = invokestatic:ArrayList(Lists::newArrayList, collection:Collection<T>[expected:Iterable])
        invokeinterface:void(List<Object>::sort, var_4_33:ArrayList<Object>[expected:List<Object>], invokedynamic:Comparator<? super Object>(compare:()Ljava/util/Comparator;))
        return:ITextComponent(invokestatic:IFormattableTextComponent(TextComponentUtils::func_240649_b_, var_4_33:ArrayList<T>[expected:Collection<T>], toTextComponent:Function<T, ITextComponent>))
    }
    
    public static net.minecraft.util.text.IFormattableTextComponent func_240649_b_(java.util.Collection<T> p_240649_0_, java.util.function.Function<T, net.minecraft.util.text.ITextComponent> p_240649_1_) {
        // java.lang.NullPointerException
    }
    
    public static net.minecraft.util.text.IFormattableTextComponent wrapWithSquareBrackets(net.minecraft.util.text.ITextComponent toWrap) {
        return:IFormattableTextComponent(initobject:TranslationTextComponent[expected:IFormattableTextComponent](TranslationTextComponent::<init>, ldc:String("chat.square_brackets"), initarray:Object[](java.lang.Object[].class, toWrap:ITextComponent[expected:Object])))
    }
    
    public static net.minecraft.util.text.ITextComponent toTextComponent(com.mojang.brigadier.Message message) {
        return:ITextComponent(ternaryop:ITextComponent(instanceof:boolean(net.minecraft.util.text.ITextComponent.class, message:Message), checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, message:Message[expected:ITextComponent]), initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, invokeinterface:String(Message::getString, message:Message))))
    }
    
    private static net.minecraft.util.text.ITextComponent lambda$makeGreenSortedList$0(java.lang.String p_197681_0_) {
        return:ITextComponent(invokevirtual:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::mergeStyle, initobject:StringTextComponent[expected:IFormattableTextComponent](StringTextComponent::<init>, p_197681_0_:String), getstatic:TextFormatting(TextFormatting::GREEN)))
    }
}
