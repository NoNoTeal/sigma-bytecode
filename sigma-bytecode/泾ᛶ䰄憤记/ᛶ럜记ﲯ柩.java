public interface \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u16f6\ub7dc\u8bb0\ufcaf\u67e9 {
    void \u5fe1\u3711\uc910\ucfaf\u494c\u8640();
    
    void \u946b\u3bc9\u718f\u3dd3\ub171\u6ec6(java.lang.Object p0) {
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
            
            if (instanceof:boolean(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u16f6\ub7dc\u8bb0\ufcaf\u67e9.class, p0:Object)) {
                invokeinterface:void(\u16f6\ub7dc\u8bb0\ufcaf\u67e9::\u5fe1\u3711\uc910\ucfaf\u494c\u8640, checkcast:\u16f6\ub7dc\u8bb0\ufcaf\u67e9(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u16f6\ub7dc\u8bb0\ufcaf\u67e9.class, p0:Object[expected:\u16f6\ub7dc\u8bb0\ufcaf\u67e9]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
}
