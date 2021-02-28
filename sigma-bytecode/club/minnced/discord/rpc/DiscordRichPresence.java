public class club.minnced.discord.rpc.DiscordRichPresence {
    public void DiscordRichPresence(java.lang.String encoding) {
        invokespecial:Structure(Structure::<init>, this:DiscordRichPresence)
        invokevirtual:void(Structure::setStringEncoding, this:DiscordRichPresence[expected:Structure], encoding:String)
    }
    
    public void DiscordRichPresence() {
        invokespecial:DiscordRichPresence(DiscordRichPresence::<init>, this:DiscordRichPresence, ldc:String("UTF-8"))
    }
    
    public boolean equals(java.lang.Object o) {
        var_4_17 : DiscordRichPresence
        
        if (cmpeq:boolean(this:DiscordRichPresence[expected:Object], o:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(club.minnced.discord.rpc.DiscordRichPresence.class, o:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_17 = checkcast:DiscordRichPresence(club.minnced.discord.rpc.DiscordRichPresence.class, o:Object[expected:DiscordRichPresence])
        return:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(cmpeq:boolean(getfield:long(DiscordRichPresence::startTimestamp, this:DiscordRichPresence), getfield:long(DiscordRichPresence::startTimestamp, var_4_17:DiscordRichPresence)), cmpeq:boolean(getfield:long(DiscordRichPresence::endTimestamp, this:DiscordRichPresence), getfield:long(DiscordRichPresence::endTimestamp, var_4_17:DiscordRichPresence))), cmpeq:boolean(getfield:int(DiscordRichPresence::partySize, this:DiscordRichPresence), getfield:int(DiscordRichPresence::partySize, var_4_17:DiscordRichPresence))), cmpeq:boolean(getfield:int(DiscordRichPresence::partyMax, this:DiscordRichPresence), getfield:int(DiscordRichPresence::partyMax, var_4_17:DiscordRichPresence))), cmpeq:boolean(getfield:byte(DiscordRichPresence::instance, this:DiscordRichPresence), getfield:byte(DiscordRichPresence::instance, var_4_17:DiscordRichPresence))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordRichPresence::state, this:DiscordRichPresence), getfield:String(DiscordRichPresence::state, var_4_17:DiscordRichPresence))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordRichPresence::details, this:DiscordRichPresence), getfield:String(DiscordRichPresence::details, var_4_17:DiscordRichPresence))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordRichPresence::largeImageKey, this:DiscordRichPresence), getfield:String(DiscordRichPresence::largeImageKey, var_4_17:DiscordRichPresence))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordRichPresence::largeImageText, this:DiscordRichPresence), getfield:String(DiscordRichPresence::largeImageText, var_4_17:DiscordRichPresence))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordRichPresence::smallImageKey, this:DiscordRichPresence), getfield:String(DiscordRichPresence::smallImageKey, var_4_17:DiscordRichPresence))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordRichPresence::smallImageText, this:DiscordRichPresence), getfield:String(DiscordRichPresence::smallImageText, var_4_17:DiscordRichPresence))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordRichPresence::partyId, this:DiscordRichPresence), getfield:String(DiscordRichPresence::partyId, var_4_17:DiscordRichPresence))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordRichPresence::matchSecret, this:DiscordRichPresence), getfield:String(DiscordRichPresence::matchSecret, var_4_17:DiscordRichPresence))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordRichPresence::joinSecret, this:DiscordRichPresence), getfield:String(DiscordRichPresence::joinSecret, var_4_17:DiscordRichPresence))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordRichPresence::spectateSecret, this:DiscordRichPresence), getfield:String(DiscordRichPresence::spectateSecret, var_4_17:DiscordRichPresence))))
    }
    
    public int hashCode() {
        return:int(invokestatic:int(Objects::hash, initarray:Object[](java.lang.Object[].class, getfield:String[expected:Object](DiscordRichPresence::state, this:DiscordRichPresence), getfield:String[expected:Object](DiscordRichPresence::details, this:DiscordRichPresence), invokestatic:Long[expected:Object](Long::valueOf, getfield:long(DiscordRichPresence::startTimestamp, this:DiscordRichPresence)), invokestatic:Long[expected:Object](Long::valueOf, getfield:long(DiscordRichPresence::endTimestamp, this:DiscordRichPresence)), getfield:String[expected:Object](DiscordRichPresence::largeImageKey, this:DiscordRichPresence), getfield:String[expected:Object](DiscordRichPresence::largeImageText, this:DiscordRichPresence), getfield:String[expected:Object](DiscordRichPresence::smallImageKey, this:DiscordRichPresence), getfield:String[expected:Object](DiscordRichPresence::smallImageText, this:DiscordRichPresence), getfield:String[expected:Object](DiscordRichPresence::partyId, this:DiscordRichPresence), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(DiscordRichPresence::partySize, this:DiscordRichPresence)), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(DiscordRichPresence::partyMax, this:DiscordRichPresence)), getfield:String[expected:Object](DiscordRichPresence::matchSecret, this:DiscordRichPresence), getfield:String[expected:Object](DiscordRichPresence::joinSecret, this:DiscordRichPresence), getfield:String[expected:Object](DiscordRichPresence::spectateSecret, this:DiscordRichPresence), invokestatic:Byte[expected:Object](Byte::valueOf, getfield:byte(DiscordRichPresence::instance, this:DiscordRichPresence)))))
    }
    
    public java.util.List<java.lang.String> getFieldOrder() {
        return:List<String>(getstatic:List<String>(DiscordRichPresence::FIELD_ORDER))
    }
    
    static {
        putstatic:List<String>(DiscordRichPresence::FIELD_ORDER, invokestatic:List<String>(Collections::unmodifiableList, invokestatic:List<? extends T>(Arrays::asList, initarray:String[][expected:? extends T[]](java.lang.String[].class, ldc:String("state"), ldc:String("details"), ldc:String("startTimestamp"), ldc:String("endTimestamp"), ldc:String("largeImageKey"), ldc:String("largeImageText"), ldc:String("smallImageKey"), ldc:String("smallImageText"), ldc:String("partyId"), ldc:String("partySize"), ldc:String("partyMax"), ldc:String("matchSecret"), ldc:String("joinSecret"), ldc:String("spectateSecret"), ldc:String("instance")))))
    }
}
