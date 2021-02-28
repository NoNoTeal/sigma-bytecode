public class \u3504\ufe34\u600f\u6b0d\u69d9.\ua068\u1187\u600f\u6435\u4d85\uae87 {
    private void \ua068\u1187\u600f\u6435\u4d85\uae87(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2 p7, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p8) {
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
            invokespecial:\u8bb0\uc910\ua562\u4f52\u385b\u6cfe(\u8bb0\uc910\ua562\u4f52\u385b\u6cfe::<init>, this:\ua068\u1187\u600f\u6435\u4d85\uae87, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p8:\u873d\ube23\uc84e\u9033\u494c\uff55, ldc:float(-0.004f))
            putfield:double(\ua068\u1187\u600f\u6435\u4d85\uae87::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ua068\u1187\u600f\u6435\u4d85\uae87, p4:double)
            putfield:double(\ua068\u1187\u600f\u6435\u4d85\uae87::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ua068\u1187\u600f\u6435\u4d85\uae87, p5:double)
            putfield:double(\ua068\u1187\u600f\u6435\u4d85\uae87::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ua068\u1187\u600f\u6435\u4d85\uae87, p6:double)
            putfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\ua068\u1187\u600f\u6435\u4d85\uae87::\u6cfe\ubf56\ubded\u5654\u67d0\u156b, this:\ua068\u1187\u600f\u6435\u4d85\uae87, p7:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2)
            putfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\ua068\u1187\u600f\u6435\u4d85\uae87, mul:float(getfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\ua068\u1187\u600f\u6435\u4d85\uae87), ldc:float(0.75f)))
            putfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ua068\u1187\u600f\u6435\u4d85\uae87, add:int(ldc:int(48), invokevirtual:int(Random::nextInt, getfield:Random(\ua068\u1187\u600f\u6435\u4d85\uae87::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ua068\u1187\u600f\u6435\u4d85\uae87), ldc:int(12))))
            invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\ua068\u1187\u600f\u6435\u4d85\uae87[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], p8:\u873d\ube23\uc84e\u9033\u494c\uff55)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4975\u8c8a\u99f7\u76bc\u51fa\u8389(boolean p0) {
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
            putfield:boolean(\ua068\u1187\u600f\u6435\u4d85\uae87::\u72f1\ud7e8\u5d20\uc7fe\uafe7\uc31c, this:\ua068\u1187\u600f\u6435\u4d85\uae87, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6435\u8389\ub32d\u0b8e\ubcb0\u5f50(boolean p0) {
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
            putfield:boolean(\ua068\u1187\u600f\u6435\u4d85\uae87::\u92ff\u97b7\ud4fe\u59ec\u965f\u9033, this:\ua068\u1187\u600f\u6435\u4d85\uae87, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u839e\u69d9\ucfaf\uc9f6\u6bb9\ub113(\u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u836c\u8cae\ub18d\u836c\u8753\u59ec p1, float p2) {
        var_4_61 : int
        
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
            var_4_61 = and:int(ldc:int(-353425898), ldc:int(-202420701))
            
            if (getfield:boolean(\ua068\u1187\u600f\u6435\u4d85\uae87::\u92ff\u97b7\ud4fe\u59ec\u965f\u9033, this:\ua068\u1187\u600f\u6435\u4d85\uae87)) {
                if (cmpge:boolean(getfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ua068\u1187\u600f\u6435\u4d85\uae87), div:int(getfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ua068\u1187\u600f\u6435\u4d85\uae87), xor:int(ldc:int(12553), ldc:int(12554))))) {
                    if (cmpne:boolean(rem:int(div:int(add:int(getfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ua068\u1187\u600f\u6435\u4d85\uae87), getfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ua068\u1187\u600f\u6435\u4d85\uae87)), and:int(ldc:int(2075), ldc:int(16387))), and:int(ldc:int(346), ldc:int(28674))), ldc:int(0))) {
                        return:void()
                    }
                }
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(-305291705))
            invokespecial:void(\u3bd6\u97e6\u156b\u718f\u385b\u72f1::\u839e\u69d9\ucfaf\uc9f6\u6bb9\ub113, this:\ua068\u1187\u600f\u6435\u4d85\uae87[expected:\u3bd6\u97e6\u156b\u718f\u385b\u72f1], p0:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p1:\u836c\u8cae\ub18d\u836c\u8753\u59ec, p2:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u120d\u3504\ub6ab\u071d\u5bc4() {
        var_1_5F : int
        var_3_CC : \ua068\u1187\u600f\u6435\u4d85\uae87
        
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
            var_1_5F = and:int(ldc:int(-1552863328), ldc:int(-1955319812))
            invokespecial:void(\u8bb0\uc910\ua562\u4f52\u385b\u6cfe::\u4ab3\u120d\u3504\ub6ab\u071d\u5bc4, this:\ua068\u1187\u600f\u6435\u4d85\uae87[expected:\u8bb0\uc910\ua562\u4f52\u385b\u6cfe])
            
            if (getfield:boolean(\ua068\u1187\u600f\u6435\u4d85\uae87::\u72f1\ud7e8\u5d20\uc7fe\uafe7\uc31c, this:\ua068\u1187\u600f\u6435\u4d85\uae87)) {
                if (cmplt:boolean(getfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ua068\u1187\u600f\u6435\u4d85\uae87), div:int(getfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ua068\u1187\u600f\u6435\u4d85\uae87), and:int(ldc:int(25602), ldc:int(4275))))) {
                    if (cmpeq:boolean(rem:int(add:int(getfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ua068\u1187\u600f\u6435\u4d85\uae87), getfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ua068\u1187\u600f\u6435\u4d85\uae87)), xor:int(ldc:int(16641), ldc:int(16643))), ldc:int(0))) {
                        var_3_CC = initobject:\ua068\u1187\u600f\u6435\u4d85\uae87(\ua068\u1187\u600f\u6435\u4d85\uae87::<init>, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\ua068\u1187\u600f\u6435\u4d85\uae87::\u0c95\u1187\u61a4\u1187\u4bc8\u759a, this:\ua068\u1187\u600f\u6435\u4d85\uae87), getfield:double(\ua068\u1187\u600f\u6435\u4d85\uae87::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\ua068\u1187\u600f\u6435\u4d85\uae87), getfield:double(\ua068\u1187\u600f\u6435\u4d85\uae87::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\ua068\u1187\u600f\u6435\u4d85\uae87), getfield:double(\ua068\u1187\u600f\u6435\u4d85\uae87::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\ua068\u1187\u600f\u6435\u4d85\uae87), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0), getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\ua068\u1187\u600f\u6435\u4d85\uae87::\u6cfe\ubf56\ubded\u5654\u67d0\u156b, this:\ua068\u1187\u600f\u6435\u4d85\uae87), getfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\ua068\u1187\u600f\u6435\u4d85\uae87::\u9255\u3bd6\u392e\ubded\u67d0\u6fb0, this:\ua068\u1187\u600f\u6435\u4d85\uae87))
                        invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u392e\u8308\u97b7\u6bb9\u92ff\u873d, var_3_CC:\ua068\u1187\u600f\u6435\u4d85\uae87[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], ldc:float(0.99f))
                        invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ud51e\ud4fe\ua6bd\u4179\u965f\u7e3f, var_3_CC:\ua068\u1187\u600f\u6435\u4d85\uae87[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], getfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\uc3e3\uc910\u64f2\u34df\u7af6\ub19c, this:\ua068\u1187\u600f\u6435\u4d85\uae87), getfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\ub8be\u0800\ufcaf\ube23\u8cae\u624e, this:\ua068\u1187\u600f\u6435\u4d85\uae87), getfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\u7ce1\ub171\u3776\u56bd\u7bad\uceb8, this:\ua068\u1187\u600f\u6435\u4d85\uae87))
                        putfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u446c\uf995\u67e9\ud217\u6c56\u120d, var_3_CC:\ua068\u1187\u600f\u6435\u4d85\uae87, div:int(getfield:int(\ua068\u1187\u600f\u6435\u4d85\uae87::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, var_3_CC:\ua068\u1187\u600f\u6435\u4d85\uae87), and:int(ldc:int(1031), ldc:int(594))))
                        
                        if (getfield:boolean(\ua068\u1187\u600f\u6435\u4d85\uae87::\ua61f\u8258\u92ee\ubefe\u92ff\u4975, this:\ua068\u1187\u600f\u6435\u4d85\uae87)) {
                            putfield:boolean(\ua068\u1187\u600f\u6435\u4d85\uae87::\ua61f\u8258\u92ee\ubefe\u92ff\u4975, var_3_CC:\ua068\u1187\u600f\u6435\u4d85\uae87, and:int[expected:boolean](ldc:int(6185), ldc:int(25089)))
                            putfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\u9033\u92ff\ud171\u416d\u7330\u61a4, var_3_CC:\ua068\u1187\u600f\u6435\u4d85\uae87, getfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\u9033\u92ff\ud171\u416d\u7330\u61a4, this:\ua068\u1187\u600f\u6435\u4d85\uae87))
                            putfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\ub8be\u97e6\u12b2\ubf56\ua61f\ub113, var_3_CC:\ua068\u1187\u600f\u6435\u4d85\uae87, getfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\ub8be\u97e6\u12b2\ubf56\ua61f\ub113, this:\ua068\u1187\u600f\u6435\u4d85\uae87))
                            putfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\u624e\u5140\u8640\ucb79\u3bc9\u6b5f, var_3_CC:\ua068\u1187\u600f\u6435\u4d85\uae87, getfield:float(\ua068\u1187\u600f\u6435\u4d85\uae87::\u624e\u5140\u8640\ucb79\u3bc9\u6b5f, this:\ua068\u1187\u600f\u6435\u4d85\uae87))
                        }
                        
                        var_1_5F = and:int(var_1_5F:int, ldc:int(-235409754))
                        putfield:boolean(\ua068\u1187\u600f\u6435\u4d85\uae87::\u92ff\u97b7\ud4fe\u59ec\u965f\u9033, var_3_CC:\ua068\u1187\u600f\u6435\u4d85\uae87, getfield:boolean(\ua068\u1187\u600f\u6435\u4d85\uae87::\u92ff\u97b7\ud4fe\u59ec\u965f\u9033, this:\ua068\u1187\u600f\u6435\u4d85\uae87))
                        invokevirtual:void(\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2::\u6ec6\ubf56\u5bc4\u4d85\u960f\u9937, getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\ua068\u1187\u600f\u6435\u4d85\uae87::\u6cfe\ubf56\ubded\u5654\u67d0\u156b, this:\ua068\u1187\u600f\u6435\u4d85\uae87), var_3_CC:\ua068\u1187\u600f\u6435\u4d85\uae87[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua068\u1187\u600f\u6435\u4d85\uae87(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2 p7, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p8, \u5d20\u7043\u88c5\u5db4\uf94d.\u62da\ub70c\u416d\u6435\uc31c\ub18d p9) {
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
            invokespecial:\ua068\u1187\u600f\u6435\u4d85\uae87(\ua068\u1187\u600f\u6435\u4d85\uae87::<init>, this:\ua068\u1187\u600f\u6435\u4d85\uae87, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:double, p6:double, p7:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2, p8:\u873d\ube23\uc84e\u9033\u494c\uff55)
            return:void()
        }
        
        goto(Label_0006)
    }
    
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8c8a\u5140\ub8be\u760c\u7af6\ub70c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_622 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_62D : int
        
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
        var_3_622 = and:int(ldc:int(-1039127676), ldc:int(-769688371))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua068\u1187\u600f\u6435\u4d85\uae87[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
            var_3_622 = and:int(var_3_622:int, ldc:int(2062752296))
        }
        else {
            var_3_622 = and:int(var_3_622:int, ldc:int(-334366476))
            var_5_85 = and:int(ldc:int(7198), ldc:int(-23583))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(31904), ldc:int(-32161)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_622:int, ldc:int(1828187313))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(9411), ldc:int(16397)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2049), ldc:int(567)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_622 = and:int(var_3_D2:int, ldc:int(1792932520))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(4617), ldc:int(4616)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-895119538))
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(128)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-822511823))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1459726538))
                        goto(Label_1089)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(246643092))
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1224550663))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(128)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1388017856))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-144109699))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-360552933))
                        goto(Label_1089)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-994353761))
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1118563609))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-324816849))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(1251749523))
                        var_11_E3 = and:int(ldc:int(-26364), ldc:int(25242))
                        goto(Label_1435)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-687385633))
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-978857243))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1303134479))
                        goto(Label_1089)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-513950103))
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-879121692))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(802496946))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(1767455886))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1142007036))
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1089)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-902300465))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(907684872))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(1737895583))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0806:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1669654475))
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(657512056))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1089)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-61443127))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-2098061629))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(1997944069))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-439292772))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(-16255), ldc:int(-16256))
                                goto(Label_1089)
                            }
                        }
                    }
                    
                    Label_0935:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-207502245))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-1210656428))
                            goto(Label_0806)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(1956661593))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-1893678381))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(2020883399))
                        var_11_E3 = and:int(ldc:int(-13509), ldc:int(13508))
                    }
                    
                    Label_1089:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(128)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1759816383))
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0935)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-1996468688))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-1823890159))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(2021556160))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1197:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-2121249545))
                            goto(Label_1089)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0935)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(430541115))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(590221817))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-732579621))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1435)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(172628930))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1936566880))
                        goto(Label_1089)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1703407932))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_622 = and:int(var_3_622:int, ldc:int(1689824456))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1435:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1446:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1531640331))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1680101301))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-98561446))
                        goto(Label_1089)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1312137211))
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-118335897))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-295948661))
                        var_17_62D = add:int(var_16_111:int, xor:int(ldc:int(3138), ldc:int(3139)))
                        looporswitchbreak()
                    }
                    
                    var_3_622 = and:int(var_3_622:int, ldc:int(-945212881))
                }
                
                var_3_622 = and:int(var_3_622:int, ldc:int(-466506088))
                
                if (cmple:boolean(var_5_85 = var_17_62D:int, sub:int(var_6_8C:int, and:int(ldc:int(29729), ldc:int(2195))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
