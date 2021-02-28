public interface \u3504\ufe34\u600f\u6b0d\u69d9.\u3711\u7873\u12b2\u3e2a\u3711\u927d {
    byte \u5140\ud36e\u836c\ub113\u6ec6\u12cb();
    
    byte \u5bc4\u718f\u4e72\uf9c5\u4bc8\u1187();
    
    byte \u51fa\u64f2\uc29a\u718f\u74b1\u64ab();
    
    short \uf995\u4ab3\ucef1\u4bc8\ub8be\u7043(int p0);
    
    short \uf995\u4ab3\ucef1\u4bc8\ub8be\u7043() {
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
            return:short(invokeinterface:short(\u3711\u7873\u12b2\u3e2a\u3711\u927d::\uf995\u4ab3\ucef1\u4bc8\ub8be\u7043, this:\u3711\u7873\u12b2\u3e2a\u3711\u927d, ldc:int(-1)))
        }
        
        goto(Label_0006)
    }
    
    int \u5140\u64ab\u67e9\u8350\u9255\u1833();
    
    void \uc3e3\u92ee\u4179\u839e\u9a18\ub83f(int p0);
}
