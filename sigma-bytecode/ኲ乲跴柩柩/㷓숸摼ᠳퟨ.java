public interface \u12b2\u4e72\u8df4\u67e9\u67e9.\u3dd3\uc238\u647c\u1833\ud7e8 {
    int \u624e\uc7fe\ufe34\u6bb9\u839e\u8308(int p0, int p1);
    
    void \u624e\uc7fe\ufe34\u6bb9\u839e\u8308(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u4c04\ub102\ufcaf\u8d90\u8aa5 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u4c04\ub102\ufcaf\u8d90\u8aa5 p1) {
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
            invokevirtual:void(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u7043\u965f\u4f52\uf94d\u5db4\u52d3, p0:\u4c04\ub102\ufcaf\u8d90\u8aa5, invokeinterface:int(\u3dd3\uc238\u647c\u1833\ud7e8::\u624e\uc7fe\ufe34\u6bb9\u839e\u8308, this:\u3dd3\uc238\u647c\u1833\ud7e8, invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, p0:\u4c04\ub102\ufcaf\u8d90\u8aa5), invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, p1:\u4c04\ub102\ufcaf\u8d90\u8aa5)))
            return:void()
        }
        
        goto(Label_0006)
    }
}
