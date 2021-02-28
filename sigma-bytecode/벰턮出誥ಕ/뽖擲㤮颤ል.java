public interface \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d {
    void \ucef1\u8258\u446c\u760c\u1833\u36d3();
    
    void \u8aa5\ufcaf\u64f2\ua562\ubefe\u69d9();
    
    void \u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a(java.lang.String p0);
    
    void \u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a(java.util.function.Supplier<java.lang.String> p0);
    
    void \u61a4\u4c04\uf995\uc31c\u4ab3\u6d69();
    
    void \u3d4b\u64f2\u7d52\u3d4b\ua3b4\u385b(java.lang.String p0);
    
    void \u3d4b\u64f2\u7d52\u3d4b\ua3b4\u385b(java.util.function.Supplier<java.lang.String> p0);
    
    void \ud51e\u8413\u51b2\u72f1\uc84e\u6198(java.lang.String p0);
    
    void \u8cae\ucef1\u600f\u3d4b\ufcaf\u76bc(java.util.function.Supplier<java.lang.String> p0);
    
    \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d \ucfaf\uc31c\uc29a\ub83f\ua562\ub7dc(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
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
        
        if (cmpne:boolean(p0:\ubf56\u64f2\u392e\u98a4\u120d, getstatic:\u836c\ub171\u3a62\u34df\u3dd3[expected:\ubf56\u64f2\u392e\u98a4\u120d](\u836c\ub171\u3a62\u34df\u3dd3::\u59ec\u8709\ubb2b\u76bc\u5140\u7af6))) {
            return:\ubf56\u64f2\u392e\u98a4\u120d(ternaryop:\ubf56\u64f2\u392e\u98a4\u120d(cmpne:boolean(p1:\ubf56\u64f2\u392e\u98a4\u120d, getstatic:\u836c\ub171\u3a62\u34df\u3dd3[expected:\ubf56\u64f2\u392e\u98a4\u120d](\u836c\ub171\u3a62\u34df\u3dd3::\u59ec\u8709\ubb2b\u76bc\u5140\u7af6)), initobject:\ubff1\u93a2\ud171\u7330\u7e3f[expected:\ubf56\u64f2\u392e\u98a4\u120d](\ubff1\u93a2\ud171\u7330\u7e3f::<init>, p0:\ubf56\u64f2\u392e\u98a4\u120d, p1:\ubf56\u64f2\u392e\u98a4\u120d), p0:\ubf56\u64f2\u392e\u98a4\u120d))
        }
        
        return:\ubf56\u64f2\u392e\u98a4\u120d(p1:\ubf56\u64f2\u392e\u98a4\u120d)
    }
}
