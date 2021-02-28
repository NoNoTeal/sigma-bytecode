public interface \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u7d52\u120d\uc229\uc2e8\u7043 {
    int \ub113\u5fe1\u8bb0\u62da\u67d0\ud217(java.util.Random p0);
    
    \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u983f\u7ce1\ub113\uc4d2\u718f\u7006();
    
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
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u7d52\u120d\uc229\uc2e8\u7043::\u5f50\u88c5\u5d20\uc238\u4daf\u156b, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("constant")))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u7d52\u120d\uc229\uc2e8\u7043::\u836c\ube23\u5654\u76bc\u446c\u71f1, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("uniform")))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u7d52\u120d\uc229\uc2e8\u7043::\ufcaf\u97e6\uc7fe\u8389\u527a\ud51e, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("binomial")))
            return:void()
        }
        
        goto(Label_0006)
    }
}
