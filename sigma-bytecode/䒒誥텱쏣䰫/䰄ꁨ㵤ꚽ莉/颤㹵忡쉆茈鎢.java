public interface \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u98a4\u3e75\u5fe1\uc246\u8308\u93a2 {
    \u6ec6\ubb2b\uf94d\u6d99\u4f52.\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1 \u4975\u97e6\u61a4\u385b\u7873\u8aa5(java.io.File p0);
    
    \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8df4\u4492\u7049\u6435\u446c\ubded \u760c\u61a4\u4d85\u4c2b\u7e3f\u4e72(java.io.File p0);
    
    \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8df4\u4492\u7049\u6435\u446c\ubded \u927d\ub18d\u600f\u0b8e\ud523\u392e(java.io.File p0);
    
    void \ud171\u34df\u5db4\ubf56\ubf56\u965f(java.io.File p0);
    
    boolean \ub83f\u718f\ub19c\u516c\u6c56\u4975(java.io.File p0);
    
    long \u3504\ubefe\u9937\uc7fe\u494c\u8df4(java.io.File p0);
    
    void \u3d4b\u62da\u4492\u983f\ub18d\u4e72(java.io.File p0, java.io.File p1);
    
    void \u8308\ucfaf\u4c04\ub70c\u873d\u8413(java.io.File p0);
    
    static {
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
            putstatic:\u98a4\u3e75\u5fe1\uc246\u8308\u93a2(\u98a4\u3e75\u5fe1\uc246\u8308\u93a2::\u0a06\ub18d\ubf56\u983f\u600f\u8753, initobject:\u3a62\ucb79\u927d\u7bad\u3d4b\uc84e[expected:\u98a4\u3e75\u5fe1\uc246\u8308\u93a2](\u3a62\ucb79\u927d\u7bad\u3d4b\uc84e::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
}
