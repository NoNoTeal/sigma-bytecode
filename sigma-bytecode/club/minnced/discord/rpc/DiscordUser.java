public class club.minnced.discord.rpc.DiscordUser {
    public void DiscordUser(java.lang.String encoding) {
        invokespecial:Structure(Structure::<init>, this:DiscordUser)
        invokevirtual:void(Structure::setStringEncoding, this:DiscordUser[expected:Structure], encoding:String)
    }
    
    public void DiscordUser() {
        invokespecial:DiscordUser(DiscordUser::<init>, this:DiscordUser, ldc:String("UTF-8"))
    }
    
    public boolean equals(java.lang.Object o) {
        var_4_17 : DiscordUser
        
        if (cmpeq:boolean(this:DiscordUser[expected:Object], o:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(club.minnced.discord.rpc.DiscordUser.class, o:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_17 = checkcast:DiscordUser(club.minnced.discord.rpc.DiscordUser.class, o:Object[expected:DiscordUser])
        return:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordUser::userId, this:DiscordUser), getfield:String(DiscordUser::userId, var_4_17:DiscordUser)), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordUser::username, this:DiscordUser), getfield:String(DiscordUser::username, var_4_17:DiscordUser))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordUser::discriminator, this:DiscordUser), getfield:String(DiscordUser::discriminator, var_4_17:DiscordUser))), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](DiscordUser::avatar, this:DiscordUser), getfield:String(DiscordUser::avatar, var_4_17:DiscordUser))))
    }
    
    public int hashCode() {
        return:int(invokestatic:int(Objects::hash, initarray:Object[](java.lang.Object[].class, getfield:String[expected:Object](DiscordUser::userId, this:DiscordUser), getfield:String[expected:Object](DiscordUser::username, this:DiscordUser), getfield:String[expected:Object](DiscordUser::discriminator, this:DiscordUser), getfield:String[expected:Object](DiscordUser::avatar, this:DiscordUser))))
    }
    
    public java.util.List<java.lang.String> getFieldOrder() {
        return:List<String>(getstatic:List<String>(DiscordUser::FIELD_ORDER))
    }
    
    static {
        putstatic:List<String>(DiscordUser::FIELD_ORDER, invokestatic:List<String>(Collections::unmodifiableList, invokestatic:List<? extends T>(Arrays::asList, initarray:String[][expected:? extends T[]](java.lang.String[].class, ldc:String("userId"), ldc:String("username"), ldc:String("discriminator"), ldc:String("avatar")))))
    }
}
