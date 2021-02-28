public class \u5d20\u97b7\u8753\u873d\u16f6.\u960f\ub7dc\ub8be\u385b\uc31c\u71f1 {
    public void \u960f\ub7dc\ub8be\u385b\uc31c\u71f1(\u51fa\u12cb\u7330\u74b1\u6c52.\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e p0, java.lang.Class p1, int p2) {
        var_6_98 : int
        
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
            invokespecial:Object(Object::<init>, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1)
            putfield:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u446c\u7330\u7330\u0c95\ua3b4\uf94d, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1, p0:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e)
            putfield:Class(\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u7c6b\u0a06\u8753\u5f50\uc910\ua562, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1, p1:Class)
            
            if (invokevirtual:boolean(\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e::\u9255\u8413\ube23\u71ae\u647c\u4f52, p0:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e)) {
                if (cmpne:boolean(p1:Class, aconstnull:Class())) {
                    putfield:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0[](\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u36d3\ub6ab\u7043\ud217\u7ce1\u4bc8, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1, newarray:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0[](\u36d3\u9033\u6b0d\u983f\u8d90.\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0.class, p2:int))
                    var_6_98 = and:int(ldc:int(10515), ldc:int(-15260))
                    
                    while (cmplt:boolean(var_6_98:int, arraylength:int(getfield:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0[](\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u36d3\ub6ab\u7043\ud217\u7ce1\u4bc8, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1)))) {
                        storeelement:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(getfield:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0[](\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u36d3\ub6ab\u7043\ud217\u7ce1\u4bc8, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1), var_6_98:int, initobject:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0::<init>, p0:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e, p1:Class, var_6_98:int))
                        inc:int(var_6_98, ldc:int(1))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e \u8c8a\u8350\u6bb9\ub113\u7d52\u839e() {
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
            return:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(getfield:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u446c\u7330\u7330\u0c95\ua3b4\uf94d, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Class \uc246\u88c5\ub18d\uc229\u8cae\u1187() {
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
            return:Class(getfield:Class(\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u7c6b\u0a06\u8753\u5f50\uc910\ua562, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1))
        }
        
        goto(Label_0006)
    }
    
    public int \u6b0d\u6435\ubefe\u62da\u8350\ub102() {
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
            return:int(getfield:int(\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u4d85\uc31c\ud51e\uc7fe\u9af2\ubcb0, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1))
        }
        
        goto(Label_0006)
    }
    
    public \u36d3\u9033\u6b0d\u983f\u8d90.\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0 \u40a9\ubb2b\u64f2\ud7e8\u4ab3\u71ae(int p0) {
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
            return:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(ternaryop:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(logicaland:boolean(cmpge:boolean(p0:int, ldc:int(0)), cmplt:boolean(p0:int, arraylength:int(getfield:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0[](\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u36d3\ub6ab\u7043\ud217\u7ce1\u4bc8, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1)))), loadelement:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(getfield:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0[](\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u36d3\ub6ab\u7043\ud217\u7ce1\u4bc8, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1), p0:int), aconstnull:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0()))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u836c\uc87f\u8709\ucef1\u36d3\ub1b9(java.lang.Object p0, int p1) {
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
            return:Object(invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u416d\ud158\ud36e\u4c2b\u5db4\u8308, p0:Object, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1, p1:int))
        }
        
        goto(Label_0006)
    }
    
    public void \ud12e\ucef1\u0c95\uc4d2\u071d\ub102(java.lang.Object p0, int p1, java.lang.Object p2) {
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
            invokestatic:boolean(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u0b8e\u527a\u0a06\u76bc\u624e\u4e72, p0:Object, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1, p1:int, p2:Object)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uf995\uae5d\u5140\u7ce1\u92ff\uae87() {
        var_3_73 : int
        
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
        
        if (cmpne:boolean(getfield:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0[](\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u36d3\ub6ab\u7043\ud217\u7ce1\u4bc8, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1), aconstnull:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0[]())) {
            var_3_73 = and:int(ldc:int(20324), ldc:int(-28527))
            
            while (cmplt:boolean(var_3_73:int, arraylength:int(getfield:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0[](\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u36d3\ub6ab\u7043\ud217\u7ce1\u4bc8, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1)))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0::\u7e3f\ubb2b\u7e3f\u446c\u97b7\ucfaf, loadelement:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(getfield:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0[](\u960f\ub7dc\ub8be\u385b\uc31c\u71f1::\u36d3\ub6ab\u7043\ud217\u7ce1\u4bc8, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1), var_3_73:int)))) {
                    return:boolean(and:int[expected:boolean](ldc:int(13640), ldc:int(-13673)))
                }
                
                inc:int(var_3_73, ldc:int(1))
            }
            
            return:boolean(xor:int[expected:boolean](ldc:int(26628), ldc:int(26629)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(19000), ldc:int(-19071)))
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
    
    public void \u16f6\u836c\u56bd\u760c\uc87f\u624e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_600 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_60B : int
        
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
        var_3_600 = and:int(ldc:int(1377495003), ldc:int(-537076033))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u960f\ub7dc\ub8be\u385b\uc31c\u71f1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
            var_3_600 = and:int(var_3_600:int, ldc:int(418255072))
        }
        else {
            var_3_600 = and:int(var_3_600:int, ldc:int(1593605311))
            var_5_85 = and:int(ldc:int(19587), ldc:int(-19692))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14624), ldc:int(-31203)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_600:int, ldc:int(-7635041))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(617), ldc:int(18689)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(1176), ldc:int(1177)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_600 = and:int(var_3_DA:int, ldc:int(1922629087))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16711), ldc:int(1)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1504790579))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-322946294))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1786233068))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1844745202))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1633220062))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(416096822))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-671555521))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(2146432482))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1761034800))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-12710317))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1726018724))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(953772696))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1583287601))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-569390597))
                        var_11_EB = and:int(ldc:int(-17255), ldc:int(870))
                        goto(Label_1439)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-600269067))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(919185577))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-568501866))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1077528297))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1354892876))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-420553857))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1118289543))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1021600317))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-760278258))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1162548635))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-224605153))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1627203589))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1504954890))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(697000375))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-2073521113))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(1982396799))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(561), ldc:int(560))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(528474830))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-628289739))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(556992220))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(2076706930))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1704851345))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(386463002))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(1671417087))
                        var_11_EB = and:int(ldc:int(6286), ldc:int(-22687))
                    }
                    
                    Label_1091:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(457789859))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-500099023))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(1465744095))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1091)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1524472093))
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-822521894))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1963021625))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(304607126))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1530027077))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1034326949))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1439)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1864068688))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(531062972))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1562981425))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(53110589))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_600 = and:int(var_3_600:int, ldc:int(-694434369))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60B = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-2134748839))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-501057332))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-819042725))
                        var_17_60B = add:int(var_16_119:int, and:int(ldc:int(12353), ldc:int(2181)))
                        looporswitchbreak()
                    }
                }
                
                var_3_600 = and:int(var_3_600:int, ldc:int(-1022536769))
                
                if (cmple:boolean(var_5_85 = var_17_60B:int, sub:int(var_6_8C:int, and:int(ldc:int(26641), ldc:int(485))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
            var_3_600 = and:int(var_3_600:int, ldc:int(1528256021))
            goto(Label_0106)
        }
    }
}
