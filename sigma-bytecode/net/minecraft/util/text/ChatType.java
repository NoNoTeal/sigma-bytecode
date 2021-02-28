public enum net.minecraft.util.text.ChatType {
    public static net.minecraft.util.text.ChatType[] values() {
        return:ChatType[](checkcast:ChatType[](net.minecraft.util.text.ChatType[].class, invokevirtual:ChatType[](ChatType[]::clone, getstatic:ChatType[](ChatType::$VALUES))))
    }
    
    public static net.minecraft.util.text.ChatType valueOf(java.lang.String name) {
        return:ChatType(checkcast:ChatType(net.minecraft.util.text.ChatType.class, invokestatic:ChatType(Enum<E>::valueOf, ldc:Class<ChatType>(net.minecraft.util.text.ChatType.class), name:String)))
    }
    
    private void ChatType(java.lang.String p0, int p1, byte p_i50783_3_, boolean p_i50783_4_) {
        invokespecial:Enum(Enum::<init>, this:ChatType, p0:String, p1:int)
        putfield:byte(ChatType::id, this:ChatType, p_i50783_3_:byte)
        putfield:boolean(ChatType::field_218691_e, this:ChatType, p_i50783_4_:boolean)
    }
    
    public byte getId() {
        return:byte(getfield:byte(ChatType::id, this:ChatType))
    }
    
    public static net.minecraft.util.text.ChatType byId(byte idIn) {
        // java.lang.NullPointerException
    }
    
    public boolean getInterrupts() {
        return:boolean(getfield:boolean(ChatType::field_218691_e, this:ChatType))
    }
    
    static {
        putstatic:ChatType(ChatType::CHAT, initobject:ChatType(ChatType::<init>, ldc:String("CHAT"), ldc:int(0), ldc:byte(0), ldc:boolean(0)))
        putstatic:ChatType(ChatType::SYSTEM, initobject:ChatType(ChatType::<init>, ldc:String("SYSTEM"), ldc:int(1), ldc:byte(1), ldc:boolean(1)))
        putstatic:ChatType(ChatType::GAME_INFO, initobject:ChatType(ChatType::<init>, ldc:String("GAME_INFO"), ldc:int(2), ldc:byte(2), ldc:boolean(1)))
        putstatic:ChatType[](ChatType::$VALUES, initarray:ChatType[](net.minecraft.util.text.ChatType[].class, getstatic:ChatType(ChatType::CHAT), getstatic:ChatType(ChatType::SYSTEM), getstatic:ChatType(ChatType::GAME_INFO)))
    }
}
