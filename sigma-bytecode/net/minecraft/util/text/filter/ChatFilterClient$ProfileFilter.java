public class net.minecraft.util.text.filter.ChatFilterClient$ProfileFilter {
    private void ChatFilterClient$ProfileFilter(net.minecraft.util.text.filter.ChatFilterClient this$0, com.mojang.authlib.GameProfile p_i244507_2_) {
        putfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter, this$0:ChatFilterClient)
        invokespecial:Object(Object::<init>, this:ChatFilterClient$ProfileFilter)
        putfield:GameProfile(ChatFilterClient$ProfileFilter::field_244585_b, this:ChatFilterClient$ProfileFilter, p_i244507_2_:GameProfile)
        putfield:Executor(ChatFilterClient$ProfileFilter::field_244586_c, this:ChatFilterClient$ProfileFilter, invokedynamic:Executor(execute:(L\u494c\u4975\ua068\u0c95\uc84e/\u7043\ubcb0\ub1b9\u759a\u4975/\ua562\u759a\u7043\ubefe\u516c\ucef1;)Ljava/util/concurrent/Executor;, invokestatic:\ua562\u759a\u7043\ubefe\u516c\ucef1<Runnable>(\ua562\u759a\u7043\ubefe\u516c\ucef1<T>::\uc238\u8389\u8d90\u71f1\ucef1\uae5d, invokestatic:ExecutorService[expected:Executor](ChatFilterClient::access$200, this$0:ChatFilterClient), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("chat stream for ")), invokevirtual:String(GameProfile::getName, p_i244507_2_:GameProfile))))))
    }
    
    public void func_244800_a() {
        invokestatic:void(ChatFilterClient::access$400, getfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter), getfield:GameProfile(ChatFilterClient$ProfileFilter::field_244585_b, this:ChatFilterClient$ProfileFilter), invokestatic:URL(ChatFilterClient::access$300, getfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter)), getfield:Executor(ChatFilterClient$ProfileFilter::field_244586_c, this:ChatFilterClient$ProfileFilter))
    }
    
    public void func_244434_b() {
        invokestatic:void(ChatFilterClient::access$400, getfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter), getfield:GameProfile(ChatFilterClient$ProfileFilter::field_244585_b, this:ChatFilterClient$ProfileFilter), invokestatic:URL(ChatFilterClient::access$500, getfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter)), getfield:Executor(ChatFilterClient$ProfileFilter::field_244586_c, this:ChatFilterClient$ProfileFilter))
    }
    
    public java.util.concurrent.CompletableFuture<java.util.Optional<java.util.List<java.lang.String>>> func_244433_a(java.util.List<java.lang.String> p_244433_1_) {
        return:CompletableFuture<Optional<List<String>>>(invokevirtual:CompletableFuture<Optional<List<String>>>(CompletableFuture<Optional<List<String>>>::exceptionally, invokevirtual:CompletableFuture<Optional<List<String>>>(CompletableFuture<List<Object>>::thenApply, invokestatic:CompletableFuture<List<Object>>(\ud217\u3504\u760c\uc29a\u97e6\ube23::\ud7e8\ud158\u5140\u67d0\uc238\ufe34, checkcast:List<? extends CompletableFuture<? extends V>>(java.util.List<? extends java.util.concurrent.CompletableFuture<? extends V>>.class, invokeinterface:List<? extends CompletableFuture<? extends V>>(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, p_244433_1_:List<String>[expected:Collection<Object>]), bind:Function<Object, CompletableFuture>((p_244589_1_:String) -> return:CompletableFuture(invokestatic:CompletableFuture(ChatFilterClient::access$700, getfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter), getfield:GameProfile(ChatFilterClient$ProfileFilter::field_244585_b, this:ChatFilterClient$ProfileFilter), p_244589_1_:String, invokestatic:ChatFilterClient$IIgnoreTest(ChatFilterClient::access$600, getfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter)), getfield:Executor(ChatFilterClient$ProfileFilter::field_244586_c, this:ChatFilterClient$ProfileFilter))))), invokestatic:Collector(ImmutableList::toImmutableList)))), bind:Function<? super List<Object>, ? extends Optional<List<String>>>((p_244590_0_:List<Object>) -> return:Optional<Object>(invokestatic:Optional<Object>(Optional<T>::of, invokeinterface:T(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, p_244590_0_:List<Object>[expected:Collection<Object>]), bind:Function<Object, String>((p_244588_0_:Optional<String>) -> return:String(checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::orElse, p_244588_0_:Optional<String>, ldc:String("")))))), invokestatic:Collector(ImmutableList::toImmutableList)))))), bind:Function<Object, Optional<Object>>((p_244587_0_:Throwable) -> return:Optional<Object>(invokestatic:Optional<Object>[expected:Object](Optional<Object>::empty)))))
    }
    
    public java.util.concurrent.CompletableFuture<java.util.Optional<java.lang.String>> func_244432_a(java.lang.String p_244432_1_) {
        return:CompletableFuture<Optional<String>>(invokestatic:CompletableFuture(ChatFilterClient::access$700, getfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter), getfield:GameProfile(ChatFilterClient$ProfileFilter::field_244585_b, this:ChatFilterClient$ProfileFilter), p_244432_1_:String, invokestatic:ChatFilterClient$IIgnoreTest(ChatFilterClient::access$600, getfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter)), getfield:Executor(ChatFilterClient$ProfileFilter::field_244586_c, this:ChatFilterClient$ProfileFilter)))
    }
    
    private static java.util.Optional lambda$func_244433_a$3(java.lang.Throwable p_244587_0_) {
        return:Optional(invokestatic:Optional<Object>(Optional<Object>::empty))
    }
    
    private static java.util.Optional lambda$func_244433_a$2(java.util.List p_244590_0_) {
        return:Optional(invokestatic:Optional<Object>(Optional<T>::of, invokeinterface:T[expected:Object](Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, p_244590_0_:List<Object>[expected:Collection<Object>]), bind:Function<Object, String>((p_244588_0_:Optional<String>) -> return:String(checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::orElse, p_244588_0_:Optional<String>, ldc:String("")))))), invokestatic:Collector(ImmutableList::toImmutableList))))
    }
    
    private static java.lang.String lambda$null$1(java.util.Optional p_244588_0_) {
        return:String(checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::orElse, p_244588_0_:Optional<String>, ldc:String(""))))
    }
    
    private java.util.concurrent.CompletableFuture lambda$func_244433_a$0(java.lang.String p_244589_1_) {
        return:CompletableFuture(invokestatic:CompletableFuture(ChatFilterClient::access$700, getfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter), getfield:GameProfile(ChatFilterClient$ProfileFilter::field_244585_b, this:ChatFilterClient$ProfileFilter), p_244589_1_:String, invokestatic:ChatFilterClient$IIgnoreTest(ChatFilterClient::access$600, getfield:ChatFilterClient(ChatFilterClient$ProfileFilter::this$0, this:ChatFilterClient$ProfileFilter)), getfield:Executor(ChatFilterClient$ProfileFilter::field_244586_c, this:ChatFilterClient$ProfileFilter)))
    }
    
    public void ChatFilterClient$ProfileFilter(net.minecraft.util.text.filter.ChatFilterClient x0, com.mojang.authlib.GameProfile x1, net.minecraft.util.text.filter.ChatFilterClient$1 x2) {
        invokespecial:ChatFilterClient$ProfileFilter(ChatFilterClient$ProfileFilter::<init>, this:ChatFilterClient$ProfileFilter, x0:ChatFilterClient, x1:GameProfile)
    }
}
