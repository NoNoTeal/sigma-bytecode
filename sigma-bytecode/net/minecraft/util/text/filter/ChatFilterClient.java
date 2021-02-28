public class net.minecraft.util.text.filter.ChatFilterClient {
    private void func_244568_a(com.mojang.authlib.GameProfile p_244568_1_, java.net.URL p_244568_2_, java.util.concurrent.Executor p_244568_3_) {
        var_6_0B : JsonObject
        jsonobject : JsonObject [generated]
        var_6_0E : Exception
        
        var_6_0B = initobject:JsonObject(JsonObject::<init>)
        invokevirtual:void(JsonObject::addProperty, var_6_0B:JsonObject, ldc:String("server"), getfield:String(ChatFilterClient::field_244557_i, this:ChatFilterClient))
        invokevirtual:void(JsonObject::addProperty, var_6_0B:JsonObject, ldc:String("room"), ldc:String("Chat"))
        invokevirtual:void(JsonObject::addProperty, var_6_0B:JsonObject, ldc:String("user_id"), invokevirtual:String(UUID::toString, invokevirtual:UUID(GameProfile::getId, p_244568_1_:GameProfile)))
        invokevirtual:void(JsonObject::addProperty, var_6_0B:JsonObject, ldc:String("user_display_name"), invokevirtual:String(GameProfile::getName, p_244568_1_:GameProfile))
        invokeinterface:void(Executor::execute, p_244568_3_:Executor, bind:Runnable(() -> {
            try {
                invokespecial:void(ChatFilterClient::func_244573_b, this:ChatFilterClient, jsonobject:JsonObject, p_244568_2_:URL)
            }
            catch (java.lang.Exception var_6_0E) {
                invokeinterface:void(Logger::warn, getstatic:Logger(ChatFilterClient::field_244549_a), ldc:String("Failed to send join/leave packet to {} for player {}"), p_244568_2_:URL[expected:Object], p_244568_1_:GameProfile[expected:Object], var_6_0E:Exception[expected:Object])
            }
        }))
    }
    
    private java.util.concurrent.CompletableFuture<java.util.Optional<java.lang.String>> func_244567_a(com.mojang.authlib.GameProfile p_244567_1_, java.lang.String p_244567_2_, net.minecraft.util.text.filter.ChatFilterClient$IIgnoreTest p_244567_3_, java.util.concurrent.Executor p_244567_4_) {
        // java.lang.NullPointerException
    }
    
    public void close() {
        invokeinterface:List<Runnable>(ExecutorService::shutdownNow, getfield:ExecutorService(ChatFilterClient::field_244559_k, this:ChatFilterClient))
    }
    
    private void func_244569_a(java.io.InputStream p_244569_1_) {
        while (cmpne:boolean(invokevirtual:int(InputStream::read, p_244569_1_:InputStream, newarray:byte[](byte.class, ldc:int(1024))), ldc:int(-1))) {
        }
    }
    
    private com.google.gson.JsonObject func_244564_a(com.google.gson.JsonObject p_244564_1_, java.net.URL p_244564_2_) {
        // java.lang.NullPointerException
    }
    
    private void func_244573_b(com.google.gson.JsonObject p_244573_1_, java.net.URL p_244573_2_) {
        var_6_10 : InputStream
        var_7_13 : Throwable
        var_8_41 : Throwable
        var_10_5E : Throwable
        
        var_6_10 = invokevirtual:InputStream(URLConnection::getInputStream, invokespecial:HttpURLConnection[expected:URLConnection](ChatFilterClient::func_244575_c, this:ChatFilterClient, p_244573_1_:JsonObject, p_244573_2_:URL))
        var_7_13 = aconstnull:Throwable()
        
        try {
            invokespecial:void(ChatFilterClient::func_244569_a, this:ChatFilterClient, var_6_10:InputStream)
        }
        catch (java.lang.Throwable var_8_41) {
            var_7_13 = var_8_41:Throwable
            athrow(var_8_41:Throwable)
        }
        finally {
            if (cmpne:boolean(var_6_10:InputStream, aconstnull:InputStream())) {
                if (cmpne:boolean(var_7_13:Throwable, aconstnull:Throwable())) {
                    try {
                        invokevirtual:void(InputStream::close, var_6_10:InputStream)
                    }
                    catch (java.lang.Throwable var_10_5E) {
                        invokevirtual:void(Throwable::addSuppressed, var_7_13:Throwable, var_10_5E:Throwable)
                    }
                }
                else {
                    invokevirtual:void(InputStream::close, var_6_10:InputStream)
                }
            }
        }
    }
    
    private java.net.HttpURLConnection func_244575_c(com.google.gson.JsonObject p_244575_1_, java.net.URL p_244575_2_) {
        // java.lang.NullPointerException
    }
    
    public net.minecraft.util.text.filter.IChatFilter func_244566_a(com.mojang.authlib.GameProfile p_244566_1_) {
        return:IChatFilter(initobject:ChatFilterClient$ProfileFilter[expected:IChatFilter](ChatFilterClient$ProfileFilter::<init>, this:ChatFilterClient, p_244566_1_:GameProfile, aconstnull:ChatFilterClient$1()))
    }
    
    private void ChatFilterClient() {
        invokespecial:Object(Object::<init>, this:ChatFilterClient)
        putfield:URL(ChatFilterClient::field_244552_d, this:ChatFilterClient, aconstnull:URL())
        putfield:URL(ChatFilterClient::field_244553_e, this:ChatFilterClient, aconstnull:URL())
        putfield:URL(ChatFilterClient::field_244554_f, this:ChatFilterClient, aconstnull:URL())
        putfield:String(ChatFilterClient::field_244555_g, this:ChatFilterClient, aconstnull:String())
        putfield:int(ChatFilterClient::field_244556_h, this:ChatFilterClient, ldc:int(0))
        putfield:String(ChatFilterClient::field_244557_i, this:ChatFilterClient, aconstnull:String())
        putfield:ChatFilterClient$IIgnoreTest(ChatFilterClient::field_244558_j, this:ChatFilterClient, aconstnull:ChatFilterClient$IIgnoreTest())
        putfield:ExecutorService(ChatFilterClient::field_244559_k, this:ChatFilterClient, aconstnull:ExecutorService())
        athrow(initobject:RuntimeException(RuntimeException::<init>, ldc:String("Synthetic constructor added by MCP, do not call")))
    }
    
    private java.util.Optional lambda$func_244567_a$2(com.google.gson.JsonObject jsonobject, java.lang.String p_244567_2_, net.minecraft.util.text.filter.ChatFilterClient$IIgnoreTest p_244567_3_) {
        // java.lang.NullPointerException
    }
    
    private void lambda$func_244568_a$1(com.google.gson.JsonObject jsonobject, java.net.URL p_244568_2_, com.mojang.authlib.GameProfile p_244568_1_) {
        var_6_0E : Exception
        
        try {
            invokespecial:void(ChatFilterClient::func_244573_b, this:ChatFilterClient, jsonobject:JsonObject, p_244568_2_:URL)
        }
        catch (java.lang.Exception var_6_0E) {
            invokeinterface:void(Logger::warn, getstatic:Logger(ChatFilterClient::field_244549_a), ldc:String("Failed to send join/leave packet to {} for player {}"), p_244568_2_:URL[expected:Object], p_244568_1_:GameProfile[expected:Object], var_6_0E:Exception[expected:Object])
        }
    }
    
    private static java.lang.Thread lambda$static$0(java.lang.Runnable p_244570_0_) {
        var_3_0C : Thread
        
        var_3_0C = initobject:Thread(Thread::<init>, p_244570_0_:Runnable)
        invokevirtual:void(Thread::setName, var_3_0C:Thread, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Chat-Filter-Worker-")), invokevirtual:int(AtomicInteger::getAndIncrement, getstatic:AtomicInteger(ChatFilterClient::field_244550_b)))))
        return:Thread(var_3_0C:Thread)
    }
    
    public static java.util.concurrent.ExecutorService access$200(net.minecraft.util.text.filter.ChatFilterClient x0) {
        return:ExecutorService(getfield:ExecutorService(ChatFilterClient::field_244559_k, x0:ChatFilterClient))
    }
    
    public static java.net.URL access$300(net.minecraft.util.text.filter.ChatFilterClient x0) {
        return:URL(getfield:URL(ChatFilterClient::field_244553_e, x0:ChatFilterClient))
    }
    
    public static void access$400(net.minecraft.util.text.filter.ChatFilterClient x0, com.mojang.authlib.GameProfile x1, java.net.URL x2, java.util.concurrent.Executor x3) {
        invokespecial:void(ChatFilterClient::func_244568_a, x0:ChatFilterClient, x1:GameProfile, x2:URL, x3:Executor)
    }
    
    public static java.net.URL access$500(net.minecraft.util.text.filter.ChatFilterClient x0) {
        return:URL(getfield:URL(ChatFilterClient::field_244554_f, x0:ChatFilterClient))
    }
    
    public static net.minecraft.util.text.filter.ChatFilterClient$IIgnoreTest access$600(net.minecraft.util.text.filter.ChatFilterClient x0) {
        return:ChatFilterClient$IIgnoreTest(getfield:ChatFilterClient$IIgnoreTest(ChatFilterClient::field_244558_j, x0:ChatFilterClient))
    }
    
    public static java.util.concurrent.CompletableFuture access$700(net.minecraft.util.text.filter.ChatFilterClient x0, com.mojang.authlib.GameProfile x1, java.lang.String x2, net.minecraft.util.text.filter.ChatFilterClient$IIgnoreTest x3, java.util.concurrent.Executor x4) {
        return:CompletableFuture(invokespecial:CompletableFuture<Optional<String>>(ChatFilterClient::func_244567_a, x0:ChatFilterClient, x1:GameProfile, x2:String, x3:ChatFilterClient$IIgnoreTest, x4:Executor))
    }
    
    static {
        var_3_0C : Thread
        
        putstatic:Logger(ChatFilterClient::field_244549_a, invokestatic:Logger(LogManager::getLogger))
        putstatic:AtomicInteger(ChatFilterClient::field_244550_b, initobject:AtomicInteger(AtomicInteger::<init>, ldc:int(1)))
        putstatic:ThreadFactory(ChatFilterClient::field_244551_c, bind:ThreadFactory((p_244570_0_:Runnable) -> {
            var_3_0C = initobject:Thread(Thread::<init>, p_244570_0_:Runnable)
            invokevirtual:void(Thread::setName, var_3_0C:Thread, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Chat-Filter-Worker-")), invokevirtual:int(AtomicInteger::getAndIncrement, getstatic:AtomicInteger(ChatFilterClient::field_244550_b)))))
            return:Thread(var_3_0C:Thread)
        }))
    }
}
