public interface \u5d20\u7043\u88c5\u5db4\uf94d.\u64f2\u6198\uc7fe\uae87\u4d85\uf995 {
    void \uf94d\u965f\u4cd9\u7049\u12cb\ub32d(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, boolean p1) {
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
            invokeinterface:void(\u64f2\u6198\uc7fe\uae87\u4d85\uf995::\ud158\u965f\u7043\u4d85\u52d3\u6ec6, this:\u64f2\u6198\uc7fe\uae87\u4d85\uf995, invokestatic:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\uc910\u4975\ub7dc\u8258\u839e\u99f7, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    void \ud158\u965f\u7043\u4d85\u52d3\u6ec6(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p0, boolean p1);
}
