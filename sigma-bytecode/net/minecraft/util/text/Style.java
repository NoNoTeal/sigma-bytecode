public class net.minecraft.util.text.Style {
    private void Style(net.minecraft.util.text.Color color, java.lang.Boolean bold, java.lang.Boolean italic, java.lang.Boolean underlined, java.lang.Boolean strikethrough, java.lang.Boolean obfuscated, net.minecraft.util.text.event.ClickEvent clickEvent, net.minecraft.util.text.event.HoverEvent hoverEvent, java.lang.String insertion, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 fontId) {
        invokespecial:Object(Object::<init>, this:Style)
        putfield:Color(Style::color, this:Style, color:Color)
        putfield:Boolean(Style::bold, this:Style, bold:Boolean)
        putfield:Boolean(Style::italic, this:Style, italic:Boolean)
        putfield:Boolean(Style::underlined, this:Style, underlined:Boolean)
        putfield:Boolean(Style::strikethrough, this:Style, strikethrough:Boolean)
        putfield:Boolean(Style::obfuscated, this:Style, obfuscated:Boolean)
        putfield:ClickEvent(Style::clickEvent, this:Style, clickEvent:ClickEvent)
        putfield:HoverEvent(Style::hoverEvent, this:Style, hoverEvent:HoverEvent)
        putfield:String(Style::insertion, this:Style, insertion:String)
        putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style, fontId:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
    }
    
    public net.minecraft.util.text.Color getColor() {
        return:Color(getfield:Color(Style::color, this:Style))
    }
    
    public boolean getBold() {
        return:boolean(cmpeq:boolean(getfield:Boolean(Style::bold, this:Style), getstatic:Boolean(Boolean::TRUE)))
    }
    
    public boolean getItalic() {
        return:boolean(cmpeq:boolean(getfield:Boolean(Style::italic, this:Style), getstatic:Boolean(Boolean::TRUE)))
    }
    
    public boolean getStrikethrough() {
        return:boolean(cmpeq:boolean(getfield:Boolean(Style::strikethrough, this:Style), getstatic:Boolean(Boolean::TRUE)))
    }
    
    public boolean getUnderlined() {
        return:boolean(cmpeq:boolean(getfield:Boolean(Style::underlined, this:Style), getstatic:Boolean(Boolean::TRUE)))
    }
    
    public boolean getObfuscated() {
        return:boolean(cmpeq:boolean(getfield:Boolean(Style::obfuscated, this:Style), getstatic:Boolean(Boolean::TRUE)))
    }
    
    public boolean isEmpty() {
        return:boolean(cmpeq:boolean(this:Style, getstatic:Style(Style::EMPTY)))
    }
    
    public net.minecraft.util.text.event.ClickEvent getClickEvent() {
        return:ClickEvent(getfield:ClickEvent(Style::clickEvent, this:Style))
    }
    
    public net.minecraft.util.text.event.HoverEvent getHoverEvent() {
        return:HoverEvent(getfield:HoverEvent(Style::hoverEvent, this:Style))
    }
    
    public java.lang.String getInsertion() {
        return:String(getfield:String(Style::insertion, this:Style))
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 getFontId() {
        return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(ternaryop:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(cmpne:boolean(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style), aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753()), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::DEFAULT_FONT)))
    }
    
    public net.minecraft.util.text.Style setColor(net.minecraft.util.text.Color color) {
        return:Style(initobject:Style(Style::<init>, color:Color, getfield:Boolean(Style::bold, this:Style), getfield:Boolean(Style::italic, this:Style), getfield:Boolean(Style::underlined, this:Style), getfield:Boolean(Style::strikethrough, this:Style), getfield:Boolean(Style::obfuscated, this:Style), getfield:ClickEvent(Style::clickEvent, this:Style), getfield:HoverEvent(Style::hoverEvent, this:Style), getfield:String(Style::insertion, this:Style), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style)))
    }
    
    public net.minecraft.util.text.Style setFormatting(net.minecraft.util.text.TextFormatting formatting) {
        return:Style(invokevirtual:Style(Style::setColor, this:Style, ternaryop:Color(cmpne:boolean(formatting:TextFormatting, aconstnull:TextFormatting()), invokestatic:Color(Color::func_240744_a_, formatting:TextFormatting), aconstnull:Color())))
    }
    
    public net.minecraft.util.text.Style setBold(java.lang.Boolean bold) {
        return:Style(initobject:Style(Style::<init>, getfield:Color(Style::color, this:Style), bold:Boolean, getfield:Boolean(Style::italic, this:Style), getfield:Boolean(Style::underlined, this:Style), getfield:Boolean(Style::strikethrough, this:Style), getfield:Boolean(Style::obfuscated, this:Style), getfield:ClickEvent(Style::clickEvent, this:Style), getfield:HoverEvent(Style::hoverEvent, this:Style), getfield:String(Style::insertion, this:Style), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style)))
    }
    
    public net.minecraft.util.text.Style setItalic(java.lang.Boolean italic) {
        return:Style(initobject:Style(Style::<init>, getfield:Color(Style::color, this:Style), getfield:Boolean(Style::bold, this:Style), italic:Boolean, getfield:Boolean(Style::underlined, this:Style), getfield:Boolean(Style::strikethrough, this:Style), getfield:Boolean(Style::obfuscated, this:Style), getfield:ClickEvent(Style::clickEvent, this:Style), getfield:HoverEvent(Style::hoverEvent, this:Style), getfield:String(Style::insertion, this:Style), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style)))
    }
    
    public net.minecraft.util.text.Style func_244282_c(java.lang.Boolean p_244282_1_) {
        return:Style(initobject:Style(Style::<init>, getfield:Color(Style::color, this:Style), getfield:Boolean(Style::bold, this:Style), getfield:Boolean(Style::italic, this:Style), p_244282_1_:Boolean, getfield:Boolean(Style::strikethrough, this:Style), getfield:Boolean(Style::obfuscated, this:Style), getfield:ClickEvent(Style::clickEvent, this:Style), getfield:HoverEvent(Style::hoverEvent, this:Style), getfield:String(Style::insertion, this:Style), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style)))
    }
    
    public net.minecraft.util.text.Style setClickEvent(net.minecraft.util.text.event.ClickEvent clickEvent) {
        return:Style(initobject:Style(Style::<init>, getfield:Color(Style::color, this:Style), getfield:Boolean(Style::bold, this:Style), getfield:Boolean(Style::italic, this:Style), getfield:Boolean(Style::underlined, this:Style), getfield:Boolean(Style::strikethrough, this:Style), getfield:Boolean(Style::obfuscated, this:Style), clickEvent:ClickEvent, getfield:HoverEvent(Style::hoverEvent, this:Style), getfield:String(Style::insertion, this:Style), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style)))
    }
    
    public net.minecraft.util.text.Style setHoverEvent(net.minecraft.util.text.event.HoverEvent hoverEvent) {
        return:Style(initobject:Style(Style::<init>, getfield:Color(Style::color, this:Style), getfield:Boolean(Style::bold, this:Style), getfield:Boolean(Style::italic, this:Style), getfield:Boolean(Style::underlined, this:Style), getfield:Boolean(Style::strikethrough, this:Style), getfield:Boolean(Style::obfuscated, this:Style), getfield:ClickEvent(Style::clickEvent, this:Style), hoverEvent:HoverEvent, getfield:String(Style::insertion, this:Style), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style)))
    }
    
    public net.minecraft.util.text.Style setInsertion(java.lang.String insertion) {
        return:Style(initobject:Style(Style::<init>, getfield:Color(Style::color, this:Style), getfield:Boolean(Style::bold, this:Style), getfield:Boolean(Style::italic, this:Style), getfield:Boolean(Style::underlined, this:Style), getfield:Boolean(Style::strikethrough, this:Style), getfield:Boolean(Style::obfuscated, this:Style), getfield:ClickEvent(Style::clickEvent, this:Style), getfield:HoverEvent(Style::hoverEvent, this:Style), insertion:String, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style)))
    }
    
    public net.minecraft.util.text.Style setFontId(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 fontId) {
        return:Style(initobject:Style(Style::<init>, getfield:Color(Style::color, this:Style), getfield:Boolean(Style::bold, this:Style), getfield:Boolean(Style::italic, this:Style), getfield:Boolean(Style::underlined, this:Style), getfield:Boolean(Style::strikethrough, this:Style), getfield:Boolean(Style::obfuscated, this:Style), getfield:ClickEvent(Style::clickEvent, this:Style), getfield:HoverEvent(Style::hoverEvent, this:Style), getfield:String(Style::insertion, this:Style), fontId:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
    }
    
    public net.minecraft.util.text.Style applyFormatting(net.minecraft.util.text.TextFormatting formatting) {
        var_4_07 : Color
        var_5_0D : Boolean
        var_6_13 : Boolean
        var_7_19 : Boolean
        var_8_1F : Boolean
        var_9_25 : Boolean
        obool1 : Boolean
        obool3 : Boolean
        obool4 : Boolean
        obool2 : Boolean
        obool : Boolean
        
        var_4_07 = getfield:Color(Style::color, this:Style)
        var_5_0D = getfield:Boolean(Style::bold, this:Style)
        var_6_13 = getfield:Boolean(Style::italic, this:Style)
        var_7_19 = getfield:Boolean(Style::strikethrough, this:Style)
        var_8_1F = getfield:Boolean(Style::underlined, this:Style)
        var_9_25 = getfield:Boolean(Style::obfuscated, this:Style)
        
        switch (loadelement:int(getstatic:int[](Style$1::$SwitchMap$net$minecraft$util$text$TextFormatting), invokevirtual:int(Enum<E>::ordinal, formatting:TextFormatting[expected:Enum<TextFormatting>]))) {
            case 1:
                var_9_25 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(1))
                looporswitchbreak()
            
            case 2:
                obool1 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(1))
                looporswitchbreak()
            
            case 3:
                obool3 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(1))
                looporswitchbreak()
            
            case 4:
                obool4 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(1))
                looporswitchbreak()
            
            case 5:
                obool2 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(1))
                looporswitchbreak()
            
            case 6:
                return:Style(getstatic:Style(Style::EMPTY))
            
            default:
                obool = invokestatic:Color[expected:Boolean](Color::func_240744_a_, formatting:TextFormatting)
                looporswitchbreak()
        }
        
        return:Style(initobject:Style(Style::<init>, obool:Boolean[expected:Color], obool1:Boolean, obool2:Boolean, obool4:Boolean, obool3:Boolean, var_9_25:Boolean, getfield:ClickEvent(Style::clickEvent, this:Style), getfield:HoverEvent(Style::hoverEvent, this:Style), getfield:String(Style::insertion, this:Style), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style)))
    }
    
    public net.minecraft.util.text.Style forceFormatting(net.minecraft.util.text.TextFormatting formatting) {
        var_4_07 : Color
        var_5_0D : Boolean
        var_6_13 : Boolean
        var_7_19 : Boolean
        var_8_1F : Boolean
        var_9_25 : Boolean
        obool1 : Boolean
        obool3 : Boolean
        obool4 : Boolean
        obool2 : Boolean
        obool : Boolean
        
        var_4_07 = getfield:Color(Style::color, this:Style)
        var_5_0D = getfield:Boolean(Style::bold, this:Style)
        var_6_13 = getfield:Boolean(Style::italic, this:Style)
        var_7_19 = getfield:Boolean(Style::strikethrough, this:Style)
        var_8_1F = getfield:Boolean(Style::underlined, this:Style)
        var_9_25 = getfield:Boolean(Style::obfuscated, this:Style)
        
        switch (loadelement:int(getstatic:int[](Style$1::$SwitchMap$net$minecraft$util$text$TextFormatting), invokevirtual:int(Enum<E>::ordinal, formatting:TextFormatting[expected:Enum<TextFormatting>]))) {
            case 1:
                var_9_25 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(1))
                looporswitchbreak()
            
            case 2:
                obool1 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(1))
                looporswitchbreak()
            
            case 3:
                obool3 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(1))
                looporswitchbreak()
            
            case 4:
                obool4 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(1))
                looporswitchbreak()
            
            case 5:
                obool2 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(1))
                looporswitchbreak()
            
            case 6:
                return:Style(getstatic:Style(Style::EMPTY))
            
            default:
                var_9_25 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(0))
                obool1 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(0))
                obool3 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(0))
                obool4 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(0))
                obool2 = invokestatic:Boolean(Boolean::valueOf, ldc:boolean(0))
                obool = invokestatic:Color[expected:Boolean](Color::func_240744_a_, formatting:TextFormatting)
                looporswitchbreak()
        }
        
        return:Style(initobject:Style(Style::<init>, obool:Boolean[expected:Color], obool1:Boolean, obool2:Boolean, obool4:Boolean, obool3:Boolean, var_9_25:Boolean, getfield:ClickEvent(Style::clickEvent, this:Style), getfield:HoverEvent(Style::hoverEvent, this:Style), getfield:String(Style::insertion, this:Style), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style)))
    }
    
    public net.minecraft.util.text.Style createStyleFromFormattings(net.minecraft.util.text.TextFormatting[] formatings) {
        // java.lang.NullPointerException
    }
    
    public net.minecraft.util.text.Style mergeStyle(net.minecraft.util.text.Style style) {
        if (cmpeq:boolean(this:Style, getstatic:Style(Style::EMPTY))) {
            return:Style(style:Style)
        }
        
        return:Style(ternaryop:Style(cmpeq:boolean(style:Style, getstatic:Style(Style::EMPTY)), this:Style, initobject:Style(Style::<init>, ternaryop:Color(cmpne:boolean(getfield:Color(Style::color, this:Style), aconstnull:Color()), getfield:Color(Style::color, this:Style), getfield:Color(Style::color, style:Style)), ternaryop:Boolean(cmpne:boolean(getfield:Boolean(Style::bold, this:Style), aconstnull:Boolean()), getfield:Boolean(Style::bold, this:Style), getfield:Boolean(Style::bold, style:Style)), ternaryop:Boolean(cmpne:boolean(getfield:Boolean(Style::italic, this:Style), aconstnull:Boolean()), getfield:Boolean(Style::italic, this:Style), getfield:Boolean(Style::italic, style:Style)), ternaryop:Boolean(cmpne:boolean(getfield:Boolean(Style::underlined, this:Style), aconstnull:Boolean()), getfield:Boolean(Style::underlined, this:Style), getfield:Boolean(Style::underlined, style:Style)), ternaryop:Boolean(cmpne:boolean(getfield:Boolean(Style::strikethrough, this:Style), aconstnull:Boolean()), getfield:Boolean(Style::strikethrough, this:Style), getfield:Boolean(Style::strikethrough, style:Style)), ternaryop:Boolean(cmpne:boolean(getfield:Boolean(Style::obfuscated, this:Style), aconstnull:Boolean()), getfield:Boolean(Style::obfuscated, this:Style), getfield:Boolean(Style::obfuscated, style:Style)), ternaryop:ClickEvent(cmpne:boolean(getfield:ClickEvent(Style::clickEvent, this:Style), aconstnull:ClickEvent()), getfield:ClickEvent(Style::clickEvent, this:Style), getfield:ClickEvent(Style::clickEvent, style:Style)), ternaryop:HoverEvent(cmpne:boolean(getfield:HoverEvent(Style::hoverEvent, this:Style), aconstnull:HoverEvent()), getfield:HoverEvent(Style::hoverEvent, this:Style), getfield:HoverEvent(Style::hoverEvent, style:Style)), ternaryop:String(cmpne:boolean(getfield:String(Style::insertion, this:Style), aconstnull:String()), getfield:String(Style::insertion, this:Style), getfield:String(Style::insertion, style:Style)), ternaryop:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(cmpne:boolean(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style), aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753()), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, this:Style), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, style:Style)))))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Style{ color=")), getfield:Color[expected:Object](Style::color, this:Style)), ldc:String(", bold=")), getfield:Boolean[expected:Object](Style::bold, this:Style)), ldc:String(", italic=")), getfield:Boolean[expected:Object](Style::italic, this:Style)), ldc:String(", underlined=")), getfield:Boolean[expected:Object](Style::underlined, this:Style)), ldc:String(", strikethrough=")), getfield:Boolean[expected:Object](Style::strikethrough, this:Style)), ldc:String(", obfuscated=")), getfield:Boolean[expected:Object](Style::obfuscated, this:Style)), ldc:String(", clickEvent=")), invokevirtual:ClickEvent[expected:Object](Style::getClickEvent, this:Style)), ldc:String(", hoverEvent=")), invokevirtual:HoverEvent[expected:Object](Style::getHoverEvent, this:Style)), ldc:String(", insertion=")), invokevirtual:String(Style::getInsertion, this:Style)), ldc:String(", font=")), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](Style::getFontId, this:Style)), ldc:char(125))))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_17 : Style
        
        if (cmpeq:boolean(this:Style[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(net.minecraft.util.text.Style.class, p_equals_1_:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_17 = checkcast:Style(net.minecraft.util.text.Style.class, p_equals_1_:Object[expected:Style])
        return:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(cmpeq:boolean(invokevirtual:boolean(Style::getBold, this:Style), invokevirtual:boolean(Style::getBold, var_4_17:Style)), invokestatic:boolean(Objects::equals, invokevirtual:Color[expected:Object](Style::getColor, this:Style), invokevirtual:Color(Style::getColor, var_4_17:Style))), cmpeq:boolean(invokevirtual:boolean(Style::getItalic, this:Style), invokevirtual:boolean(Style::getItalic, var_4_17:Style))), cmpeq:boolean(invokevirtual:boolean(Style::getObfuscated, this:Style), invokevirtual:boolean(Style::getObfuscated, var_4_17:Style))), cmpeq:boolean(invokevirtual:boolean(Style::getStrikethrough, this:Style), invokevirtual:boolean(Style::getStrikethrough, var_4_17:Style))), cmpeq:boolean(invokevirtual:boolean(Style::getUnderlined, this:Style), invokevirtual:boolean(Style::getUnderlined, var_4_17:Style))), invokestatic:boolean(Objects::equals, invokevirtual:ClickEvent[expected:Object](Style::getClickEvent, this:Style), invokevirtual:ClickEvent(Style::getClickEvent, var_4_17:Style))), invokestatic:boolean(Objects::equals, invokevirtual:HoverEvent[expected:Object](Style::getHoverEvent, this:Style), invokevirtual:HoverEvent(Style::getHoverEvent, var_4_17:Style))), invokestatic:boolean(Objects::equals, invokevirtual:String[expected:Object](Style::getInsertion, this:Style), invokevirtual:String(Style::getInsertion, var_4_17:Style))), invokestatic:boolean(Objects::equals, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](Style::getFontId, this:Style), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::getFontId, var_4_17:Style))))
    }
    
    public int hashCode() {
        return:int(invokestatic:int(Objects::hash, initarray:Object[](java.lang.Object[].class, getfield:Color[expected:Object](Style::color, this:Style), getfield:Boolean[expected:Object](Style::bold, this:Style), getfield:Boolean[expected:Object](Style::italic, this:Style), getfield:Boolean[expected:Object](Style::underlined, this:Style), getfield:Boolean[expected:Object](Style::strikethrough, this:Style), getfield:Boolean[expected:Object](Style::obfuscated, this:Style), getfield:ClickEvent[expected:Object](Style::clickEvent, this:Style), getfield:HoverEvent[expected:Object](Style::hoverEvent, this:Style), getfield:String[expected:Object](Style::insertion, this:Style))))
    }
    
    public void Style(net.minecraft.util.text.Color x0, java.lang.Boolean x1, java.lang.Boolean x2, java.lang.Boolean x3, java.lang.Boolean x4, java.lang.Boolean x5, net.minecraft.util.text.event.ClickEvent x6, net.minecraft.util.text.event.HoverEvent x7, java.lang.String x8, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 x9, net.minecraft.util.text.Style$1 x10) {
        invokespecial:Style(Style::<init>, this:Style, x0:Color, x1:Boolean, x2:Boolean, x3:Boolean, x4:Boolean, x5:Boolean, x6:ClickEvent, x7:HoverEvent, x8:String, x9:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
    }
    
    public static java.lang.Boolean access$100(net.minecraft.util.text.Style x0) {
        return:Boolean(getfield:Boolean(Style::bold, x0:Style))
    }
    
    public static java.lang.Boolean access$200(net.minecraft.util.text.Style x0) {
        return:Boolean(getfield:Boolean(Style::italic, x0:Style))
    }
    
    public static java.lang.Boolean access$300(net.minecraft.util.text.Style x0) {
        return:Boolean(getfield:Boolean(Style::underlined, x0:Style))
    }
    
    public static java.lang.Boolean access$400(net.minecraft.util.text.Style x0) {
        return:Boolean(getfield:Boolean(Style::strikethrough, x0:Style))
    }
    
    public static java.lang.Boolean access$500(net.minecraft.util.text.Style x0) {
        return:Boolean(getfield:Boolean(Style::obfuscated, x0:Style))
    }
    
    public static net.minecraft.util.text.Color access$600(net.minecraft.util.text.Style x0) {
        return:Color(getfield:Color(Style::color, x0:Style))
    }
    
    public static java.lang.String access$700(net.minecraft.util.text.Style x0) {
        return:String(getfield:String(Style::insertion, x0:Style))
    }
    
    public static net.minecraft.util.text.event.ClickEvent access$800(net.minecraft.util.text.Style x0) {
        return:ClickEvent(getfield:ClickEvent(Style::clickEvent, x0:Style))
    }
    
    public static net.minecraft.util.text.event.HoverEvent access$900(net.minecraft.util.text.Style x0) {
        return:HoverEvent(getfield:HoverEvent(Style::hoverEvent, x0:Style))
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 access$1000(net.minecraft.util.text.Style x0) {
        return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::fontId, x0:Style))
    }
    
    static {
        putstatic:Style(Style::EMPTY, initobject:Style(Style::<init>, checkcast:Color(net.minecraft.util.text.Color.class, aconstnull:Color()), checkcast:Boolean(java.lang.Boolean.class, aconstnull:Boolean()), checkcast:Boolean(java.lang.Boolean.class, aconstnull:Boolean()), checkcast:Boolean(java.lang.Boolean.class, aconstnull:Boolean()), checkcast:Boolean(java.lang.Boolean.class, aconstnull:Boolean()), checkcast:Boolean(java.lang.Boolean.class, aconstnull:Boolean()), checkcast:ClickEvent(net.minecraft.util.text.event.ClickEvent.class, aconstnull:ClickEvent()), checkcast:HoverEvent(net.minecraft.util.text.event.HoverEvent.class, aconstnull:HoverEvent()), checkcast:String(java.lang.String.class, aconstnull:String()), checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::DEFAULT_FONT, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("minecraft"), ldc:String("default")))
    }
}
