public interface \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u6d99\u4975\u7e3f\u965f\ubefe {
    boolean \u8753\u4179\u3d4b\uc910\uc87f\u5bc4(int p0, java.util.List<\u5d20\u7043\u88c5\u5db4\uf94d.\u1833\u5140\ub1b9\ub7dc\u7006\u6bb9> p1);
    
    boolean \u4e72\u385b\u3e75\u3e75\u6198\u8df4(int p0, java.util.List<\u5d20\u7043\u88c5\u5db4\uf94d.\u1833\u5140\ub1b9\ub7dc\u7006\u6bb9> p1, boolean p2);
    
    boolean \uc2bd\u3bd6\u9a18\u74b1\uf995\u1187(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52 p1, int p2, boolean p3);
    
    void \u97b7\u9937\u4975\u36d3\u6b0d\ub19c(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u12b2\u71ae\ua3b4\u7e3f\u6d69\ucef1 p1);
    
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
            putstatic:\uc3e3\u6d99\u4975\u7e3f\u965f\ubefe(\uc3e3\u6d99\u4975\u7e3f\u965f\ubefe::\uc910\u760c\uc229\u6bb9\u98a4\u4ab3, initobject:\u8753\u8640\ubefe\u392e\u873d\uceb8[expected:\uc3e3\u6d99\u4975\u7e3f\u965f\ubefe](\u8753\u8640\ubefe\u392e\u873d\uceb8::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
}
