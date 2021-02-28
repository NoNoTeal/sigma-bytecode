public interface club.minnced.discord.rpc.DiscordRPC {
    void Discord_Initialize(java.lang.String p0, club.minnced.discord.rpc.DiscordEventHandlers p1, boolean p2, java.lang.String p3);
    
    void Discord_Shutdown();
    
    void Discord_RunCallbacks();
    
    void Discord_UpdateConnection();
    
    void Discord_UpdatePresence(club.minnced.discord.rpc.DiscordRichPresence p0);
    
    void Discord_ClearPresence();
    
    void Discord_Respond(java.lang.String p0, int p1);
    
    void Discord_UpdateHandlers(club.minnced.discord.rpc.DiscordEventHandlers p0);
    
    void Discord_Register(java.lang.String p0, java.lang.String p1);
    
    void Discord_RegisterSteamGame(java.lang.String p0, java.lang.String p1);
    
    static {
        putstatic:DiscordRPC(DiscordRPC::INSTANCE, checkcast:DiscordRPC(club.minnced.discord.rpc.DiscordRPC.class, invokestatic:DiscordRPC(Native::loadLibrary, ldc:String("discord-rpc"), ldc:Class<DiscordRPC>(club.minnced.discord.rpc.DiscordRPC.class))))
    }
}
