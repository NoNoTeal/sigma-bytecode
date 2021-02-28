public interface \u392e\ud7e8\u3bc9\u88c5\ud51e.\ubff1\uc87f\u7049\ubf56\u5140\ud7e8 {
    \u47c2\u2dcc\u12cb\ud171\u8c8a.\ub32d\u873d\u071d\u34df\u4975\u9af2 \u93a2\uc9f6\u760c\u16f6\u6b0d\u7af6(\u5d20\u97b7\u8753\u873d\u16f6.\u4492\uc4d2\u494c\u5f50\u120d\ud158 p0, \ua562\ucb79\uc87f\u3dd3\ubcb0.\u6fb0\u69d9\u7c6b\uc2bd\u4c2b\ud12e p1);
    
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
            putstatic:\ubff1\uc87f\u7049\ubf56\u5140\ud7e8(\ubff1\uc87f\u7049\ubf56\u5140\ud7e8::\u71f1\u6c52\uc238\ub70c\u527a\u718f, initobject:\u8cae\uc9f6\u516c\uae87\u718f\u8413[expected:\ubff1\uc87f\u7049\ubf56\u5140\ud7e8](\u8cae\uc9f6\u516c\uae87\u718f\u8413::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
}
