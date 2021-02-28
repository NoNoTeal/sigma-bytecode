public interface \u5d20\u97b7\u8753\u873d\u16f6.\ua6bd\u8d98\u6ec6\uc246\uc238 {
    \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 \u3711\u4492\ub8be\u7330\uc9f6\u8640();
    
    void \u624e\ub113\u3a62\u93a2\u6cfe\u6fb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            invokeinterface:void(Stream<\u7d52\u718f\u3776\u6fb0\ub83f>::forEach, invokevirtual:Stream<\u7d52\u718f\u3776\u6fb0\ub83f>(\u7d52\u718f\u3776\u6fb0\ub83f::\ua3b4\u839e\u9937\u5140\u6d69\u946b, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokedynamic:Consumer<\u7d52\u718f\u3776\u6fb0\ub83f>(accept:(L\u5d20\u97b7\u8753\u873d\u16f6/\ua6bd\u8d98\u6ec6\uc246\uc238;)Ljava/util/function/Consumer;, this:\ua6bd\u8d98\u6ec6\uc246\uc238[expected:\u72f1\u7ce1\ucef1\ub83f\u516c]))
            return:void()
        }
        
        goto(Label_0006)
    }
}
