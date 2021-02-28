public enum net.minecraft.util.text.TextFormatting {
    public static net.minecraft.util.text.TextFormatting[] values() {
        return:TextFormatting[](checkcast:TextFormatting[](net.minecraft.util.text.TextFormatting[].class, invokevirtual:TextFormatting[](TextFormatting[]::clone, getstatic:TextFormatting[](TextFormatting::$VALUES))))
    }
    
    public static net.minecraft.util.text.TextFormatting valueOf(java.lang.String name) {
        return:TextFormatting(checkcast:TextFormatting(net.minecraft.util.text.TextFormatting.class, invokestatic:TextFormatting(Enum<E>::valueOf, ldc:Class<TextFormatting>(net.minecraft.util.text.TextFormatting.class), name:String)))
    }
    
    private static java.lang.String lowercaseAlpha(java.lang.String string) {
        return:String(invokevirtual:String(String::replaceAll, invokevirtual:String(String::toLowerCase, string:String, getstatic:Locale(Locale::ROOT)), ldc:String("[^a-z]"), ldc:String("")))
    }
    
    private void TextFormatting(java.lang.String p0, int p1, java.lang.String formattingName, char formattingCodeIn, int index, java.lang.Integer colorCode) {
        invokespecial:TextFormatting(TextFormatting::<init>, this:TextFormatting, p0:String, p1:int, formattingName:String, formattingCodeIn:char, ldc:boolean(0), index:int, colorCode:Integer)
    }
    
    private void TextFormatting(java.lang.String p0, int p1, java.lang.String formattingName, char formattingCodeIn, boolean fancyStylingIn) {
        invokespecial:TextFormatting(TextFormatting::<init>, this:TextFormatting, p0:String, p1:int, formattingName:String, formattingCodeIn:char, fancyStylingIn:boolean, ldc:int(-1), checkcast:Integer(java.lang.Integer.class, aconstnull:Integer()))
    }
    
    private void TextFormatting(java.lang.String p0, int p1, java.lang.String formattingName, char formattingCodeIn, boolean fancyStylingIn, int index, java.lang.Integer colorCode) {
        invokespecial:Enum(Enum::<init>, this:TextFormatting, p0:String, p1:int)
        putfield:String(TextFormatting::name, this:TextFormatting, formattingName:String)
        putfield:char(TextFormatting::formattingCode, this:TextFormatting, formattingCodeIn:char)
        putfield:boolean(TextFormatting::fancyStyling, this:TextFormatting, fancyStylingIn:boolean)
        putfield:int(TextFormatting::colorIndex, this:TextFormatting, index:int)
        putfield:Integer(TextFormatting::color, this:TextFormatting, colorCode:Integer)
        putfield:String(TextFormatting::controlString, this:TextFormatting, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("§")), formattingCodeIn:char)))
    }
    
    public int getColorIndex() {
        return:int(getfield:int(TextFormatting::colorIndex, this:TextFormatting))
    }
    
    public boolean isFancyStyling() {
        return:boolean(getfield:boolean(TextFormatting::fancyStyling, this:TextFormatting))
    }
    
    public boolean isColor() {
        return:boolean(logicaland:boolean(logicalnot:boolean(getfield:boolean(TextFormatting::fancyStyling, this:TextFormatting)), cmpne:boolean(this:TextFormatting, getstatic:TextFormatting(TextFormatting::RESET))))
    }
    
    public java.lang.Integer getColor() {
        return:Integer(getfield:Integer(TextFormatting::color, this:TextFormatting))
    }
    
    public java.lang.String getFriendlyName() {
        return:String(invokevirtual:String(String::toLowerCase, invokevirtual:String(Enum<E>::name, this:TextFormatting[expected:Enum<TextFormatting>]), getstatic:Locale(Locale::ROOT)))
    }
    
    public java.lang.String toString() {
        return:String(getfield:String(TextFormatting::controlString, this:TextFormatting))
    }
    
    public static java.lang.String getTextWithoutFormattingCodes(java.lang.String text) {
        return:String(ternaryop:String(cmpeq:boolean(text:String, aconstnull:String()), aconstnull:String(), invokevirtual:String(Matcher::replaceAll, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(TextFormatting::FORMATTING_CODE_PATTERN), text:String[expected:CharSequence]), ldc:String(""))))
    }
    
    public static net.minecraft.util.text.TextFormatting getValueByName(java.lang.String friendlyName) {
        return:TextFormatting(ternaryop:TextFormatting(cmpeq:boolean(friendlyName:String, aconstnull:String()), aconstnull:TextFormatting(), checkcast:TextFormatting(net.minecraft.util.text.TextFormatting.class, invokeinterface:TextFormatting(Map<String, TextFormatting>::get, getstatic:Map<String, TextFormatting>(TextFormatting::NAME_MAPPING), invokestatic:String[expected:Object](TextFormatting::lowercaseAlpha, friendlyName:String)))))
    }
    
    public static net.minecraft.util.text.TextFormatting fromColorIndex(int index) {
        // java.lang.NullPointerException
    }
    
    public static net.minecraft.util.text.TextFormatting fromFormattingCode(char formattingCodeIn) {
        // java.lang.NullPointerException
    }
    
    public static java.util.Collection<java.lang.String> getValidValues(boolean getColor, boolean getFancyStyling) {
        // java.lang.NullPointerException
    }
    
    private static net.minecraft.util.text.TextFormatting lambda$static$1(net.minecraft.util.text.TextFormatting p_199747_0_) {
        return:TextFormatting(p_199747_0_:TextFormatting)
    }
    
    private static java.lang.String lambda$static$0(net.minecraft.util.text.TextFormatting p_199746_0_) {
        return:String(invokestatic:String(TextFormatting::lowercaseAlpha, getfield:String(TextFormatting::name, p_199746_0_:TextFormatting)))
    }
    
    static {
        putstatic:TextFormatting(TextFormatting::BLACK, initobject:TextFormatting(TextFormatting::<init>, ldc:String("BLACK"), ldc:int(0), ldc:String("BLACK"), ldc:char(48), ldc:int(0), invokestatic:Integer(Integer::valueOf, ldc:int(0))))
        putstatic:TextFormatting(TextFormatting::DARK_BLUE, initobject:TextFormatting(TextFormatting::<init>, ldc:String("DARK_BLUE"), ldc:int(1), ldc:String("DARK_BLUE"), ldc:char(49), ldc:int(1), invokestatic:Integer(Integer::valueOf, ldc:int(170))))
        putstatic:TextFormatting(TextFormatting::DARK_GREEN, initobject:TextFormatting(TextFormatting::<init>, ldc:String("DARK_GREEN"), ldc:int(2), ldc:String("DARK_GREEN"), ldc:char(50), ldc:int(2), invokestatic:Integer(Integer::valueOf, ldc:int(43520))))
        putstatic:TextFormatting(TextFormatting::DARK_AQUA, initobject:TextFormatting(TextFormatting::<init>, ldc:String("DARK_AQUA"), ldc:int(3), ldc:String("DARK_AQUA"), ldc:char(51), ldc:int(3), invokestatic:Integer(Integer::valueOf, ldc:int(43690))))
        putstatic:TextFormatting(TextFormatting::DARK_RED, initobject:TextFormatting(TextFormatting::<init>, ldc:String("DARK_RED"), ldc:int(4), ldc:String("DARK_RED"), ldc:char(52), ldc:int(4), invokestatic:Integer(Integer::valueOf, ldc:int(11141120))))
        putstatic:TextFormatting(TextFormatting::DARK_PURPLE, initobject:TextFormatting(TextFormatting::<init>, ldc:String("DARK_PURPLE"), ldc:int(5), ldc:String("DARK_PURPLE"), ldc:char(53), ldc:int(5), invokestatic:Integer(Integer::valueOf, ldc:int(11141290))))
        putstatic:TextFormatting(TextFormatting::GOLD, initobject:TextFormatting(TextFormatting::<init>, ldc:String("GOLD"), ldc:int(6), ldc:String("GOLD"), ldc:char(54), ldc:int(6), invokestatic:Integer(Integer::valueOf, ldc:int(16755200))))
        putstatic:TextFormatting(TextFormatting::GRAY, initobject:TextFormatting(TextFormatting::<init>, ldc:String("GRAY"), ldc:int(7), ldc:String("GRAY"), ldc:char(55), ldc:int(7), invokestatic:Integer(Integer::valueOf, ldc:int(11184810))))
        putstatic:TextFormatting(TextFormatting::DARK_GRAY, initobject:TextFormatting(TextFormatting::<init>, ldc:String("DARK_GRAY"), ldc:int(8), ldc:String("DARK_GRAY"), ldc:char(56), ldc:int(8), invokestatic:Integer(Integer::valueOf, ldc:int(5592405))))
        putstatic:TextFormatting(TextFormatting::BLUE, initobject:TextFormatting(TextFormatting::<init>, ldc:String("BLUE"), ldc:int(9), ldc:String("BLUE"), ldc:char(57), ldc:int(9), invokestatic:Integer(Integer::valueOf, ldc:int(5592575))))
        putstatic:TextFormatting(TextFormatting::GREEN, initobject:TextFormatting(TextFormatting::<init>, ldc:String("GREEN"), ldc:int(10), ldc:String("GREEN"), ldc:char(97), ldc:int(10), invokestatic:Integer(Integer::valueOf, ldc:int(5635925))))
        putstatic:TextFormatting(TextFormatting::AQUA, initobject:TextFormatting(TextFormatting::<init>, ldc:String("AQUA"), ldc:int(11), ldc:String("AQUA"), ldc:char(98), ldc:int(11), invokestatic:Integer(Integer::valueOf, ldc:int(5636095))))
        putstatic:TextFormatting(TextFormatting::RED, initobject:TextFormatting(TextFormatting::<init>, ldc:String("RED"), ldc:int(12), ldc:String("RED"), ldc:char(99), ldc:int(12), invokestatic:Integer(Integer::valueOf, ldc:int(16733525))))
        putstatic:TextFormatting(TextFormatting::LIGHT_PURPLE, initobject:TextFormatting(TextFormatting::<init>, ldc:String("LIGHT_PURPLE"), ldc:int(13), ldc:String("LIGHT_PURPLE"), ldc:char(100), ldc:int(13), invokestatic:Integer(Integer::valueOf, ldc:int(16733695))))
        putstatic:TextFormatting(TextFormatting::YELLOW, initobject:TextFormatting(TextFormatting::<init>, ldc:String("YELLOW"), ldc:int(14), ldc:String("YELLOW"), ldc:char(101), ldc:int(14), invokestatic:Integer(Integer::valueOf, ldc:int(16777045))))
        putstatic:TextFormatting(TextFormatting::WHITE, initobject:TextFormatting(TextFormatting::<init>, ldc:String("WHITE"), ldc:int(15), ldc:String("WHITE"), ldc:char(102), ldc:int(15), invokestatic:Integer(Integer::valueOf, ldc:int(16777215))))
        putstatic:TextFormatting(TextFormatting::OBFUSCATED, initobject:TextFormatting(TextFormatting::<init>, ldc:String("OBFUSCATED"), ldc:int(16), ldc:String("OBFUSCATED"), ldc:char(107), ldc:boolean(1)))
        putstatic:TextFormatting(TextFormatting::BOLD, initobject:TextFormatting(TextFormatting::<init>, ldc:String("BOLD"), ldc:int(17), ldc:String("BOLD"), ldc:char(108), ldc:boolean(1)))
        putstatic:TextFormatting(TextFormatting::STRIKETHROUGH, initobject:TextFormatting(TextFormatting::<init>, ldc:String("STRIKETHROUGH"), ldc:int(18), ldc:String("STRIKETHROUGH"), ldc:char(109), ldc:boolean(1)))
        putstatic:TextFormatting(TextFormatting::UNDERLINE, initobject:TextFormatting(TextFormatting::<init>, ldc:String("UNDERLINE"), ldc:int(19), ldc:String("UNDERLINE"), ldc:char(110), ldc:boolean(1)))
        putstatic:TextFormatting(TextFormatting::ITALIC, initobject:TextFormatting(TextFormatting::<init>, ldc:String("ITALIC"), ldc:int(20), ldc:String("ITALIC"), ldc:char(111), ldc:boolean(1)))
        putstatic:TextFormatting(TextFormatting::RESET, initobject:TextFormatting(TextFormatting::<init>, ldc:String("RESET"), ldc:int(21), ldc:String("RESET"), ldc:char(114), ldc:int(-1), checkcast:Integer(java.lang.Integer.class, aconstnull:Integer())))
        putstatic:TextFormatting[](TextFormatting::$VALUES, initarray:TextFormatting[](net.minecraft.util.text.TextFormatting[].class, getstatic:TextFormatting(TextFormatting::BLACK), getstatic:TextFormatting(TextFormatting::DARK_BLUE), getstatic:TextFormatting(TextFormatting::DARK_GREEN), getstatic:TextFormatting(TextFormatting::DARK_AQUA), getstatic:TextFormatting(TextFormatting::DARK_RED), getstatic:TextFormatting(TextFormatting::DARK_PURPLE), getstatic:TextFormatting(TextFormatting::GOLD), getstatic:TextFormatting(TextFormatting::GRAY), getstatic:TextFormatting(TextFormatting::DARK_GRAY), getstatic:TextFormatting(TextFormatting::BLUE), getstatic:TextFormatting(TextFormatting::GREEN), getstatic:TextFormatting(TextFormatting::AQUA), getstatic:TextFormatting(TextFormatting::RED), getstatic:TextFormatting(TextFormatting::LIGHT_PURPLE), getstatic:TextFormatting(TextFormatting::YELLOW), getstatic:TextFormatting(TextFormatting::WHITE), getstatic:TextFormatting(TextFormatting::OBFUSCATED), getstatic:TextFormatting(TextFormatting::BOLD), getstatic:TextFormatting(TextFormatting::STRIKETHROUGH), getstatic:TextFormatting(TextFormatting::UNDERLINE), getstatic:TextFormatting(TextFormatting::ITALIC), getstatic:TextFormatting(TextFormatting::RESET)))
        putstatic:Map<String, TextFormatting>(TextFormatting::NAME_MAPPING, checkcast:Map<String, TextFormatting>(java.util.Map<java.lang.String, net.minecraft.util.text.TextFormatting>.class, invokeinterface:Map<String, TextFormatting>(Stream<TextFormatting>::collect, invokestatic:Stream<TextFormatting>(Arrays::stream, invokestatic:TextFormatting[](TextFormatting::values)), invokestatic:Collector<? super TextFormatting, ?, Map<String, TextFormatting>>(Collectors::toMap, bind:Function<Object, String>((p_199746_0_:TextFormatting) -> return:String(invokestatic:String(TextFormatting::lowercaseAlpha, getfield:String(TextFormatting::name, p_199746_0_:TextFormatting)))), bind:Function<Object, TextFormatting>((p_199747_0_:TextFormatting) -> return:TextFormatting(p_199747_0_:TextFormatting))))))
        putstatic:Pattern(TextFormatting::FORMATTING_CODE_PATTERN, invokestatic:Pattern(Pattern::compile, ldc:String("(?i)§[0-9A-FK-OR]")))
    }
}
