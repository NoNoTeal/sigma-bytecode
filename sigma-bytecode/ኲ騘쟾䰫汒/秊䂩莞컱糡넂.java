public interface \u12b2\u9a18\uc7fe\u4c2b\u6c52.\uf995\u40a9\u839e\ucef1\u7ce1\ub102 {
    void \u4e72\u071d\u3776\ud12e\ua562\u071d(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\uc4d2\uc2bd\u965f\uc29a\u760c\ua068 p0, java.util.List<\u36d3\u9033\u6b0d\u983f\u8d90.\u7c6b\u56bd\u97b7\u74b1\ubcb0\u416d> p1);
    
    java.util.List<\u36d3\u9033\u6b0d\u983f\u8d90.\u7c6b\u56bd\u97b7\u74b1\ubcb0\u416d> \u3e75\u7ce1\u47c2\u6c52\u6b5f\u7873(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\uc4d2\uc2bd\u965f\uc29a\u760c\ua068 p0);
    
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
            putstatic:\uf995\u40a9\u839e\ucef1\u7ce1\ub102(\uf995\u40a9\u839e\ucef1\u7ce1\ub102::\u7af6\u72f1\ubf56\u97b7\uafe7\ua562, initobject:\u4c04\u4179\uc3e3\u5140\u56bd\ub19c[expected:\uf995\u40a9\u839e\ucef1\u7ce1\ub102](\u4c04\u4179\uc3e3\u5140\u56bd\ub19c::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
}
