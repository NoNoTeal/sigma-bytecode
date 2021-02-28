public interface \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 {
    java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u71ae\u6c56\uc29a\ubefe\u760c\u71ae> \u527a\u965f\u69d9\ufe34\u7bad\u71f1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p1, java.util.Random p2);
    
    boolean \u3bc9\u960f\u6b5f\u6cfe\u6fb0\u5654();
    
    boolean \u4492\u3dd3\uc31c\u647c\u3a62\u3bd6();
    
    boolean \u3dd3\uc29a\u5245\ud171\u61a4\u071d();
    
    boolean \ud523\u4bc8\u8753\u2dcc\u8258\u120d();
    
    \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d \u385b\u52d3\u51b2\u5654\u516c\u8350();
    
    \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u600f\u4c2b\uc238\ud158\u7e3f\u3c25 \u873d\ub18d\u5f50\u0b8e\u983f\u61a4() {
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
            return:\u600f\u4c2b\uc238\ud158\u7e3f\u3c25(getstatic:\u600f\u4c2b\uc238\ud158\u7e3f\u3c25(\u600f\u4c2b\uc238\ud158\u7e3f\u3c25::\u59ec\uceb8\u7330\ucef1\ud217\ud217))
        }
        
        goto(Label_0006)
    }
    
    \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uf9c5\u1833\u624e\u8d98\u9937\u3504 \u8df4\ub70c\u3776\ud217\ub7dc\u6435();
}
