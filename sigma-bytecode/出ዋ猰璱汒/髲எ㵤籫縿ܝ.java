public class \u51fa\u12cb\u7330\u74b1\u6c52.\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d {
    public void \u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u7330\u67d0\u8389\ub171\u647c p0) {
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
            putfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d, p0:\ud36e\u7330\u67d0\u8389\ub171\u647c)
            invokespecial:InputStream(InputStream::<init>, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int read() {
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
        
        if (getfield:boolean(\ud36e\u7330\u67d0\u8389\ub171\u647c::\ua068\ufcaf\u416d\u760c\u4ab3\ub19c, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d))) {
            athrow(initobject:IOException(IOException::<init>, loadelement:String(getstatic:String[](\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u516c\ud51e\u8413\ubf56\ub70c\u5bc4), and:int(ldc:int(1898), ldc:int(-12139)))))
        }
        
        if (logicaland:boolean(cmpeq:boolean(getfield:long(\u3711\u34df\ubded\u3d64\u494c\u6198::\uae5d\ucb79\u64ab\u3e2a\u36d3\u8709, getfield:\u3711\u34df\ubded\u3d64\u494c\u6198(\ud36e\u7330\u67d0\u8389\ub171\u647c::\ub113\u3504\u59ec\u1833\ucef1\ua3b4, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d))), ldc:long(0L)), cmpeq:boolean(invokeinterface:long(\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1::\ua068\u873d\ucef1\u3e2a\u446c\u74b1, getfield:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1(\ud36e\u7330\u67d0\u8389\ub171\u647c::\u6fb0\uf995\u6cfe\u927d\u8258\ub19c, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d)), getfield:\u3711\u34df\ubded\u3d64\u494c\u6198(\ud36e\u7330\u67d0\u8389\ub171\u647c::\ub113\u3504\u59ec\u1833\ucef1\ua3b4, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d)), ldc:long(8192L)), ldc:long(-1L)))) {
            return:int(ldc:int(-1))
        }
        
        return:int(and:int(invokevirtual:byte[expected:int](\u3711\u34df\ubded\u3d64\u494c\u6198::\u8258\u92ff\u36d3\u8709\u836c\ube23, getfield:\u3711\u34df\ubded\u3d64\u494c\u6198(\ud36e\u7330\u67d0\u8389\ub171\u647c::\ub113\u3504\u59ec\u1833\ucef1\ua3b4, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d))), xor:int(ldc:int(225), ldc:int(30))))
    }
    
    public int read(byte[] p0, int p1, int p2) {
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
        
        if (getfield:boolean(\ud36e\u7330\u67d0\u8389\ub171\u647c::\ua068\ufcaf\u416d\u760c\u4ab3\ub19c, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d))) {
            athrow(initobject:IOException(IOException::<init>, loadelement:String(getstatic:String[](\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u516c\ud51e\u8413\ubf56\ub70c\u5bc4), and:int(ldc:int(-7823), ldc:int(7820)))))
        }
        
        invokestatic:void(\u4cd9\u1833\ua61f\u7043\u36d3\u92ee::\u3bc9\u960f\ud158\u8cae\u6cfe\u3c25, i2l:long(arraylength:int(p0:byte[])), i2l:long(p1:int), i2l:long(p2:int))
        
        if (logicaland:boolean(cmpeq:boolean(getfield:long(\u3711\u34df\ubded\u3d64\u494c\u6198::\uae5d\ucb79\u64ab\u3e2a\u36d3\u8709, getfield:\u3711\u34df\ubded\u3d64\u494c\u6198(\ud36e\u7330\u67d0\u8389\ub171\u647c::\ub113\u3504\u59ec\u1833\ucef1\ua3b4, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d))), ldc:long(0L)), cmpeq:boolean(invokeinterface:long(\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1::\ua068\u873d\ucef1\u3e2a\u446c\u74b1, getfield:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1(\ud36e\u7330\u67d0\u8389\ub171\u647c::\u6fb0\uf995\u6cfe\u927d\u8258\ub19c, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d)), getfield:\u3711\u34df\ubded\u3d64\u494c\u6198(\ud36e\u7330\u67d0\u8389\ub171\u647c::\ub113\u3504\u59ec\u1833\ucef1\ua3b4, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d)), ldc:long(8192L)), ldc:long(-1L)))) {
            return:int(ldc:int(-1))
        }
        
        return:int(invokevirtual:int(\u3711\u34df\ubded\u3d64\u494c\u6198::\ua068\u873d\ucef1\u3e2a\u446c\u74b1, getfield:\u3711\u34df\ubded\u3d64\u494c\u6198(\ud36e\u7330\u67d0\u8389\ub171\u647c::\ub113\u3504\u59ec\u1833\ucef1\ua3b4, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d)), p0:byte[], p1:int, p2:int))
    }
    
    public int available() {
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
        
        if (logicalnot:boolean(getfield:boolean(\ud36e\u7330\u67d0\u8389\ub171\u647c::\ua068\ufcaf\u416d\u760c\u4ab3\ub19c, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d)))) {
            return:int(l2i:int(invokestatic:long(Math::min, getfield:long(\u3711\u34df\ubded\u3d64\u494c\u6198::\uae5d\ucb79\u64ab\u3e2a\u36d3\u8709, getfield:\u3711\u34df\ubded\u3d64\u494c\u6198(\ud36e\u7330\u67d0\u8389\ub171\u647c::\ub113\u3504\u59ec\u1833\ucef1\ua3b4, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d))), ldc:long(2147483647L))))
        }
        
        athrow(initobject:IOException(IOException::<init>, loadelement:String(getstatic:String[](\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u516c\ud51e\u8413\ubf56\ub70c\u5bc4), and:int(ldc:int(-23564), ldc:int(7179)))))
    }
    
    public void close() {
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
            invokevirtual:void(\ud36e\u7330\u67d0\u8389\ub171\u647c::close, getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c(\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:\ud36e\u7330\u67d0\u8389\ub171\u647c[expected:Object](\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u67d0\u494c\u416d\u74b1\u72f1\ud217, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d)), loadelement:String(getstatic:String[](\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u516c\ud51e\u8413\ubf56\ub70c\u5bc4), and:int(ldc:int(1025), ldc:int(28935))))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1AA : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_FA_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1CB_0 : byte[] [generated]
        stack_234_0 : byte[] [generated]
        stack_2BA_0 : byte[] [generated]
        stack_2F7_0 : byte[] [generated]
        var_4_197 : int
        var_3_19C : byte[]
        var_5_19D : int
        expr_1CB : byte [generated]
        var_0_22A : int
        expr_234 : byte [generated]
        stack_278_2 : byte [generated]
        stack_257_0 : byte [generated]
        expr_96 : int [generated]
        expr_C9 : int [generated]
        var_2_FA : byte[]
        expr_FE : int [generated]
        var_3_2E6 : byte[]
        var_5_2E7 : int
        var_3_142 : String
        stack_190_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_1AA = and:int(ldc:int(1328193242), ldc:int(2141707351))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_FA_0 = stack_FC_0 = stack_136_0 = stack_1CB_0 = stack_234_0 = stack_2BA_0 = stack_2F7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Bs/Xp1EAD4iYx8FqPqVnEFgwa8Rp")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_197 = expr_6B:int
        var_3_19C = newarray:byte[](byte.class, expr_6B:int)
        var_5_19D = expr_6B:int
        Label_0415:
        
        while (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(1140516756))
                goto(Label_0528)
            }
            
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(1606065918))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_1CB = loadelement:byte(stack_1CB_0:byte[], var_5_19D:int)
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, or:int(and:int(shl:int(expr_1CB:byte, xor:int(ldc:int(20643), ldc:int(20647))), ldc:int(-16)), and:int(shr:int(expr_1CB:byte[expected:int], and:int(ldc:int(2439), ldc:int(13380))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FA_0 = stack_FC_0 = stack_136_0 = stack_1CB_0 = stack_234_0 = stack_2BA_0 = stack_2F7_0 = var_3_19C:byte[]
            goto(Label_0112)
        }
        
        var_0_1AA = and:int(var_0_1AA:int, ldc:int(1534184583))
        goto(Label_0670)
        Label_0528:
        
        while (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(1237258497))
                goto(Label_0415)
            }
            
            var_0_22A = and:int(var_0_1AA:int, ldc:int(-810836866))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_234 = stack_278_2 = loadelement(stack_234_0, var_5_19D)
            
            if (cmplt:boolean(add:int(add:int(var_5_19D:int, ldc:int(2)), neg:int(var_4_197:int)), ldc:int(0))) {
                stack_278_2 = stack_257_0 = add:byte(expr_234:byte, loadelement:byte(var_3_19C:byte[], add:int(var_5_19D:int, ldc:int(2))))
                goto(Label_0615)
            }
            
            Label_0577:
            
            if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(262144)), ldc:int(0))) {
                var_0_22A = and:int(var_0_22A:int, ldc:int(-9883511))
            }
            else {
                var_0_22A = and:int(var_0_22A:int, ldc:int(1596448599))
                stack_278_2 = stack_257_0 = add:byte(expr_234:byte, ldc:byte(2))
            }
            
            Label_0615:
            
            if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0577)
            }
            
            var_0_1AA = and:int(var_0_22A:int, ldc:int(1341840754))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, stack_278_2:byte)
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FA_0 = stack_FC_0 = stack_136_0 = stack_1CB_0 = stack_234_0 = stack_2BA_0 = stack_2F7_0 = var_3_19C:byte[]
            goto(Label_0155)
        }
        
        Label_0670:
        
        while (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0415)
            }
            
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(536862710))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, add:byte(xor:byte(loadelement:byte(stack_2BA_0:byte[], var_5_19D:int), ldc:byte(2)), ldc:byte(102)))
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FA_0 = stack_FC_0 = stack_136_0 = stack_1CB_0 = stack_234_0 = stack_2BA_0 = stack_2F7_0 = var_3_19C:byte[]
            goto(Label_0206)
        }
        
        goto(Label_0528)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(4096)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1909636178))
        }
        else {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(796311391))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_197 = expr_96:int
                var_3_19C = newarray:byte[](byte.class, expr_96:int)
                var_5_19D = expr_96:int
                goto(Label_0528)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(8192)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1875349794))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(741546521))
                goto(Label_0112)
            }
            
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(1337368562))
            expr_C9 = arraylength:int(stack_C9_0:byte[])
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_4_197 = expr_C9:int
                var_3_19C = newarray:byte[](byte.class, expr_C9:int)
                var_5_19D = expr_C9:int
                goto(Label_0670)
            }
        }
        
        Label_0206:
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-782646288))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(-2077977742))
                goto(Label_0112)
            }
            
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(268107378))
            var_2_FA = stack_FA_0:byte[]
            expr_FE = add:int(arraylength:int(stack_FC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2E6 = newarray:byte[](byte.class, expr_FE:int)
                var_5_2E7 = expr_FE:int
                
                loop {
                    var_0_1AA = and:int(var_0_1AA:int, ldc:int(-546390817))
                    var_5_2E7 = add:int(var_5_2E7:int, ldc:int(-1))
                    storeelement:byte(var_3_2E6:byte[], var_5_2E7:int, add:int(shl:int(loadelement:byte(stack_2F7_0:byte[], var_5_2E7:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_FA:byte[], add:int(var_5_2E7:int, and:int(ldc:int(19), ldc:int(457)))), ldc:int(7)), xor:int(ldc:int(804), ldc:int(805)))))
                    
                    if (cmpne:boolean(var_5_2E7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FA_0 = stack_FC_0 = stack_136_0 = stack_1CB_0 = stack_234_0 = stack_2BA_0 = stack_2F7_0 = var_3_2E6:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1685533857))
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(65978804))
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(256673713))
            goto(Label_0112)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_190_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3602), ldc:int(8226)))
        expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2634), ldc:int(8195)))
        storeelement:String(expr_154:String[], xor:int(ldc:int(528), ldc:int(529)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(12641), ldc:int(-12666)), xor:int(ldc:int(20737), ldc:int(20751))))
        storeelement:String(expr_154:String[], and:int(ldc:int(-30406), ldc:int(29377)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(16430), ldc:int(1118)), xor:int(ldc:int(2318), ldc:int(2330))))
        putstatic:String[](\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d::\u516c\ud51e\u8413\ubf56\ub70c\u5bc4, expr_154:String[])
    }
    
    public void \u4daf\u6b5f\u4f52\u6d99\u494c\uc84e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68F : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_69A : int
        
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
        var_3_68F = and:int(ldc:int(2071492834), ldc:int(326843895))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_68F = and:int(var_3_68F:int, ldc:int(-1688259858))
            var_5_7D = and:int(ldc:int(23073), ldc:int(-23074))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25672), ldc:int(-26185)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_68F:int, ldc:int(-1485020990))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(520), ldc:int(521)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(22673), ldc:int(8257)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_68F = and:int(var_3_D2:int, ldc:int(-1550054162))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(21089), ldc:int(2185)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1456839324))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(183022561))
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1464359502))
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0868)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1347419395))
                        goto(Label_0731)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1706557813))
                        goto(Label_0583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1266197196))
                    }
                    else {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(998303223))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0868)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-341978410))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1453592118))
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-308347861))
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0868)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0731)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-108253429))
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(2006777335))
                        var_11_E3 = and:int(ldc:int(-22384), ldc:int(20522))
                        goto(Label_1532)
                    }
                    
                    Label_0583:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-929642829))
                        goto(Label_1543)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1769730793))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1873660015))
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1112391890))
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1972800526))
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-252730202))
                        goto(Label_0868)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(1136213454))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(263780074))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0868)
                        }
                    }
                    
                    Label_0731:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1392383889))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1017986351))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(228994236))
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-2101172896))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-326048437))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1207697638))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0868:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1543)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1513893087))
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1045387695))
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0731)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(310022235))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(1831052930))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1956318237))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(177), ldc:int(4865))
                                goto(Label_1166)
                            }
                        }
                    }
                    
                    Label_0990:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(904807684))
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(804881232))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0868)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(766677127))
                            goto(Label_0731)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-260168094))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1895356618))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(54522356))
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(535909887))
                        var_11_E3 = and:int(ldc:int(-25920), ldc:int(16703))
                    }
                    
                    Label_1166:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1543)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0990)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1642545837))
                            goto(Label_0868)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0731)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1733721087))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1391)
                            }
                        }
                    }
                    
                    Label_1259:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-913881752))
                        goto(Label_1543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1470765209))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1166)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0990)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-443668354))
                            goto(Label_0868)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(1489660574))
                            goto(Label_0731)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1155993378))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1532)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1391:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1822562487))
                        goto(Label_1543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1381303822))
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1304061084))
                        goto(Label_0868)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0731)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1990231412))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1487715194))
                        goto(Label_0419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68F = and:int(var_3_68F:int, ldc:int(1397412563))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1532:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69A = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1543:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(272409495))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(189321392))
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1998075851))
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-240646124))
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-592081531))
                        goto(Label_0868)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1503825946))
                        goto(Label_0731)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1688092782))
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-277618202))
                        var_17_69A = add:int(var_16_111:int, and:int(ldc:int(3141), ldc:int(8321)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68F = and:int(var_3_68F:int, ldc:int(54832635))
                
                if (cmple:boolean(var_5_7D = var_17_69A:int, sub:int(var_6_84:int, and:int(ldc:int(2057), ldc:int(17681))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
            var_3_68F = and:int(var_3_68F:int, ldc:int(-1512352903))
            goto(Label_0106)
        }
    }
}
