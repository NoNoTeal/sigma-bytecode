public class club.minnced.discord.rpc.DiscordEventHandlers {
    public void DiscordEventHandlers() {
        invokespecial:Structure(Structure::<init>, this:DiscordEventHandlers)
    }
    
    public boolean equals(java.lang.Object o) {
        var_4_17 : DiscordEventHandlers
        
        if (cmpeq:boolean(this:DiscordEventHandlers[expected:Object], o:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(club.minnced.discord.rpc.DiscordEventHandlers.class, o:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_17 = checkcast:DiscordEventHandlers(club.minnced.discord.rpc.DiscordEventHandlers.class, o:Object[expected:DiscordEventHandlers])
        return:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(invokestatic:boolean(Objects::equals, getfield:DiscordEventHandlers$OnReady[expected:Object](DiscordEventHandlers::ready, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnReady(DiscordEventHandlers::ready, var_4_17:DiscordEventHandlers)), invokestatic:boolean(Objects::equals, getfield:DiscordEventHandlers$OnStatus[expected:Object](DiscordEventHandlers::disconnected, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnStatus(DiscordEventHandlers::disconnected, var_4_17:DiscordEventHandlers))), invokestatic:boolean(Objects::equals, getfield:DiscordEventHandlers$OnStatus[expected:Object](DiscordEventHandlers::errored, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnStatus(DiscordEventHandlers::errored, var_4_17:DiscordEventHandlers))), invokestatic:boolean(Objects::equals, getfield:DiscordEventHandlers$OnGameUpdate[expected:Object](DiscordEventHandlers::joinGame, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnGameUpdate(DiscordEventHandlers::joinGame, var_4_17:DiscordEventHandlers))), invokestatic:boolean(Objects::equals, getfield:DiscordEventHandlers$OnGameUpdate[expected:Object](DiscordEventHandlers::spectateGame, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnGameUpdate(DiscordEventHandlers::spectateGame, var_4_17:DiscordEventHandlers))), invokestatic:boolean(Objects::equals, getfield:DiscordEventHandlers$OnJoinRequest[expected:Object](DiscordEventHandlers::joinRequest, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnJoinRequest(DiscordEventHandlers::joinRequest, var_4_17:DiscordEventHandlers))))
    }
    
    public int hashCode() {
        return:int(invokestatic:int(Objects::hash, initarray:Object[](java.lang.Object[].class, getfield:DiscordEventHandlers$OnReady[expected:Object](DiscordEventHandlers::ready, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnStatus[expected:Object](DiscordEventHandlers::disconnected, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnStatus[expected:Object](DiscordEventHandlers::errored, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnGameUpdate[expected:Object](DiscordEventHandlers::joinGame, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnGameUpdate[expected:Object](DiscordEventHandlers::spectateGame, this:DiscordEventHandlers), getfield:DiscordEventHandlers$OnJoinRequest[expected:Object](DiscordEventHandlers::joinRequest, this:DiscordEventHandlers))))
    }
    
    public java.util.List<java.lang.String> getFieldOrder() {
        return:List<String>(getstatic:List<String>(DiscordEventHandlers::FIELD_ORDER))
    }
    
    static {
        putstatic:List<String>(DiscordEventHandlers::FIELD_ORDER, invokestatic:List<String>(Collections::unmodifiableList, invokestatic:List<? extends T>(Arrays::asList, initarray:String[][expected:? extends T[]](java.lang.String[].class, ldc:String("ready"), ldc:String("disconnected"), ldc:String("errored"), ldc:String("joinGame"), ldc:String("spectateGame"), ldc:String("joinRequest")))))
    }
}
