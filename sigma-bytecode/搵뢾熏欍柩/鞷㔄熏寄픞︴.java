public interface \u6435\ub8be\u718f\u6b0d\u67e9.\u97b7\u3504\u718f\u5bc4\ud51e\ufe34 {
    void \ubb2b\ubff1\ubefe\ud4fe\u7006\u836c(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99 p1);
    
    void \u7bad\u3bd6\u16f6\ubded\u600f\u97b7(\u516c\u3d64\u718f\ub171\u6b5f.\ub6ab\u8cae\u64ab\u5245\ubff1\u3711 p0);
    
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
            putstatic:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(\u97b7\u3504\u718f\u5bc4\ud51e\ufe34::\u72f1\u7049\u6b0d\u3bd6\ua3b4\u6b5f, initobject:\uc229\u6d69\u6ec6\u6ec6\u4c2b\u51b2[expected:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34](\uc229\u6d69\u6ec6\u6ec6\u4c2b\u51b2::<init>))
            putstatic:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(\u97b7\u3504\u718f\u5bc4\ud51e\ufe34::\uc31c\uae87\u7006\u3dd3\u156b\u120d, initobject:\uafe7\u7ce1\u385b\u3bc9\u416d\ubb2b[expected:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34](\uafe7\u7ce1\u385b\u3bc9\u416d\ubb2b::<init>))
            putstatic:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(\u97b7\u3504\u718f\u5bc4\ud51e\ufe34::\u76bc\ud12e\u527a\u8d90\u8df4\ubefe, initobject:\ub32d\uf94d\ub7dc\u4ab3\u5d20\u40a9[expected:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34](\ub32d\uf94d\ub7dc\u4ab3\u5d20\u40a9::<init>))
            putstatic:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(\u97b7\u3504\u718f\u5bc4\ud51e\ufe34::\uc87f\u64ab\uc229\ub83f\u446c\u59ec, initobject:\uf94d\uc31c\u8d90\u6198\ua3b4\ub8be[expected:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34](\uf94d\uc31c\u8d90\u6198\ua3b4\ub8be::<init>))
            putstatic:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(\u97b7\u3504\u718f\u5bc4\ud51e\ufe34::\u56bd\u6b0d\u3d64\u624e\uae87\u3504, initobject:\u6bb9\u12b2\u6435\u960f\uc84e\u5fe1[expected:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34](\u6bb9\u12b2\u6435\u960f\uc84e\u5fe1::<init>))
            putstatic:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(\u97b7\u3504\u718f\u5bc4\ud51e\ufe34::\u47c2\u6b0d\u8709\ua61f\ubff1\ucb79, initobject:\uf995\ub32d\u494c\uae87\u839e\u4d85[expected:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34](\uf995\ub32d\u494c\uae87\u839e\u4d85::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
}
