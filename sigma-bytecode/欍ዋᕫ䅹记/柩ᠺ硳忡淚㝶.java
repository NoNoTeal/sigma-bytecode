public interface \u6b0d\u12cb\u156b\u4179\u8bb0.\u67e9\u183a\u7873\u5fe1\uf94d\u3776 {
    java.util.List<java.net.InetAddress> \u7049\u416d\ucef1\uc2bd\u8753\u51b2(java.lang.String p0);
    
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
            putstatic:\u67e9\u183a\u7873\u5fe1\uf94d\u3776(\u67e9\u183a\u7873\u5fe1\uf94d\u3776::\ub19c\u600f\u0c95\u93a2\u51b2\uc2e8, initobject:\ud36e\ub102\u47c2\u71ae\u7c6b\u8c8a[expected:\u67e9\u183a\u7873\u5fe1\uf94d\u3776](\ud36e\ub102\u47c2\u71ae\u7c6b\u8c8a::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
}
