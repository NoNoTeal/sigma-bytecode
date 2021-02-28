public interface \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4179\ud36e\u4bc8\u446c\u3504 {
    void \u5db4\u0c95\u960f\u3776\ud217\u647c(net.minecraft.util.text.ITextComponent p0, java.util.UUID p1);
    
    boolean \ua562\ub18d\u7006\u8413\u3dd3\ubff1();
    
    boolean \u7330\u759a\u92ff\u67d0\u8d90\uae87();
    
    boolean \u64ab\u8c8a\u92ff\u8308\u3d64\u9033();
    
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
            putstatic:\u4179\ud36e\u4bc8\u446c\u3504(\u4179\ud36e\u4bc8\u446c\u3504::\u12b2\u0b8e\u3776\u120d\ub113\ubefe, initobject:\uc9f6\u7043\u3776\u51fa\ucfaf[expected:\u4179\ud36e\u4bc8\u446c\u3504](\uc9f6\u7043\u3776\u51fa\ucfaf::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
}
