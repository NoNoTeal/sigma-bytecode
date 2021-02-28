public interface \u5245\u8aa5\u61a4\u7049\u4cd9.\u7049\u40a9\uc87f\u2dcc\ub113 {
    java.util.concurrent.CompletableFuture<\u59ec\u8413\u97e6\uc229\u3776.\u3bc9\u4492\u69d9\ud12e\uc238\u6c56> \u93a2\u120d\u47c2\u51b2\u4d85\u183a(java.util.concurrent.Executor p0, java.util.concurrent.Executor p1, java.util.List<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> p2, java.util.concurrent.CompletableFuture<\u59ec\u8413\u97e6\uc229\u3776.\u3bc9\u4492\u69d9\ud12e\uc238\u6c56> p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:CompletableFuture<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(invokeinterface:CompletableFuture<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(\u59ec\ucb79\u156b\uc3e3\u3d64::\ud171\u3e2a\u9937\u56bd\u5fe1\u983f, invokeinterface:\u59ec\ucb79\u156b\uc3e3\u3d64(\u7049\u40a9\uc87f\u2dcc\ub113::\u98a4\ubded\u6d69\u156b\u6b0d\u8c8a, this:\u7049\u40a9\uc87f\u2dcc\ub113, p0:Executor, p1:Executor, p3:CompletableFuture<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, p2:List<\u4f52\u7ce1\uc229\ucef1\ube23>)))
        }
        
        goto(Label_0006)
    }
    
    \u47c2\u2dcc\u12cb\ud171\u8c8a.\u59ec\ucb79\u156b\uc3e3\u3d64 \u98a4\ubded\u6d69\u156b\u6b0d\u8c8a(java.util.concurrent.Executor p0, java.util.concurrent.Executor p1, java.util.concurrent.CompletableFuture<\u59ec\u8413\u97e6\uc229\u3776.\u3bc9\u4492\u69d9\ud12e\uc238\u6c56> p2, java.util.List<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> p3);
    
    void \uc29a\u99f7\u7bad\u416d\u8350\ub32d(\u3504\ufe34\u600f\u6b0d\u69d9.\ube23\ua562\ud12e\u3d64\ufcaf p0);
    
    void close();
}
