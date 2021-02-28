public interface \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd {
    int \u718f\u64ab\uc9f6\uc246\u7006\ubff1();
    
    int \u5140\u946b\u8709\u8413\u4f4a\ub18d();
    
    boolean \u6cfe\uc2bd\ud36e\u071d\u7049\u9937();
    
    boolean \u52d3\u4e72\u36d3\u56bd\u0b8e\ud4fe();
    
    boolean \u12cb\ub113\u12b2\u3d64\uff55\uc3e3() {
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
            return:boolean(invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u52d3\u4e72\u36d3\u56bd\u0b8e\ud4fe, this:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
        }
        
        goto(Label_0006)
    }
    
    boolean \u5140\ube23\u8709\u4c04\uae87\ub70c();
    
    void \u7330\u51fa\ud12e\u4d85\ube23\ucef1(boolean p0);
    
    int \u624e\u3d4b\u16f6\u416d\ub1b9\u36d3();
    
    \u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a[] \u52d3\u5bc4\u3c25\u8cae\ud7e8\u927d();
    
    int[] \ub6ab\u946b\u4bc8\u12b2\u8389\ub113();
    
    void \ub32d\u71f1\ud217\u392e\u0b8e\u5fe1(int[] p0);
    
    \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776 \u7bad\u64ab\uc87f\uc84e\u34df\u0800();
    
    void \ud36e\u6d99\u97e6\u4ab3\ubded\u3d64(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776 p0);
    
    java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776> \u6ec6\ub83f\ud217\uc229\u74b1\ub32d();
}
