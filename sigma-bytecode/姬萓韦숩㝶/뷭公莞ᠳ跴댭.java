public class \u59ec\u8413\u97e6\uc229\u3776.\ubded\u516c\u839e\u1833\u8df4\ub32d {
    private static java.awt.Font \uc238\u0a06\u946b\u93a2\u5db4\ub32d(java.lang.String p0) {
        var_1_5F : int
        stack_78_0 : Font [generated]
        var_3_7D : FontFormatException
        var_3_AC : IOException
        
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
        var_1_5F = and:int(ldc:int(311776246), ldc:int(-1820992522))
        
        try {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-606740482))
            stack_78_0 = invokestatic:Font(Font::createFont, and:int(ldc:int(3351), ldc:int(-15640)), invokestatic:InputStream(\u3dd3\u76bc\u4f4a\u494c\ubded\u600f::\u97b7\u72f1\u7e3f\u7006\u8258\uc2bd, p0:String))
            var_1_5F = and:int(var_1_5F:int, ldc:int(-1776452937))
            return:Font(stack_78_0:Font)
        }
        catch (java.awt.FontFormatException var_3_7D) {
            athrow(initobject:\u1833\u4179\u9255\u8aa5\u7006\u8258(\u1833\u4179\u9255\u8aa5\u7006\u8258::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), and:int(ldc:int(-12855), ldc:int(12838)))), p0:String)), var_3_7D:FontFormatException[expected:Throwable]))
        }
        catch (java.io.IOException var_3_AC) {
            athrow(initobject:\u1833\u4179\u9255\u8aa5\u7006\u8258(\u1833\u4179\u9255\u8aa5\u7006\u8258::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), xor:int(ldc:int(4260), ldc:int(4261)))), p0:String)), var_3_AC:IOException[expected:Throwable]))
        }
    }
    
    public void \ubded\u516c\u839e\u1833\u8df4\ub32d(java.lang.String p0, java.lang.String p1) {
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
            invokespecial:\ubded\u516c\u839e\u1833\u8df4\ub32d(\ubded\u516c\u839e\u1833\u8df4\ub32d::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:String, initobject:\u9af2\ud217\u760c\u3bc9\u6d69\ud171(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::<init>, p1:String))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u516c\u839e\u1833\u8df4\ub32d(java.lang.String p0, \u516c\u3d64\u718f\ub171\u6b5f.\u9af2\ud217\u760c\u3bc9\u6d69\ud171 p1) {
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
            invokespecial:Object(Object::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)
            putfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u927d\u64ab\u36d3\u8cae\u6d99\ua6bd, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, newarray:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[].class, and:int(ldc:int(2175), ldc:int(20479))))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u51b2\u6fb0\u9255\u71ae\uc4d2\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>, xor:int(ldc:int(-16116), ldc:int(-16372))))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud51e\u8d90\u5d20\ubded\u52d3\uf995, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, and:int(ldc:int(584), ldc:int(790)))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(10648), ldc:int(11160)))
            putfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, and:int[expected:boolean](ldc:int(193), ldc:int(57)))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, ldc:int(-1))
            putfield:LinkedHashMap(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:\u8709\u183a\u7ce1\u600f\u1833\u7af6[expected:LinkedHashMap](\u8709\u183a\u7ce1\u600f\u1833\u7af6::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(-32622), ldc:int(-32678)), ldc:float(1.0f), and:int[expected:boolean](ldc:int(28947), ldc:int(1))))
            putfield:String(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8bb0\u7043\u8d98\uc2bd\ub19c\u6fb0, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:String)
            invokespecial:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub102\u600f\u5140\u4bc8\u7e3f\u6ec6, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokestatic:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc238\u0a06\u946b\u93a2\u5db4\ub32d, p0:String), invokevirtual:int(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u3504\u7043\u516c\u51fa\ubcb0\u64ab, p1:\u9af2\ud217\u760c\u3bc9\u6d69\ud171), invokevirtual:boolean(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u6198\u40a9\u1187\u4492\ub102\u446c, p1:\u9af2\ud217\u760c\u3bc9\u6d69\ud171), invokevirtual:boolean(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u4975\ub1b9\ud12e\uc9f6\u4ab3\ucfaf, p1:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            invokespecial:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u1187\u92ee\u156b\u40a9\u7ce1\uf9c5, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p1:\u9af2\ud217\u760c\u3bc9\u6d69\ud171)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u516c\u839e\u1833\u8df4\ub32d(java.lang.String p0, int p1, boolean p2, boolean p3) {
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
            invokespecial:Object(Object::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)
            putfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u927d\u64ab\u36d3\u8cae\u6d99\ua6bd, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, newarray:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[].class, xor:int(ldc:int(-31376), ldc:int(-29425))))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u51b2\u6fb0\u9255\u71ae\uc4d2\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>, xor:int(ldc:int(13007), ldc:int(13263))))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud51e\u8d90\u5d20\ubded\u52d3\uf995, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(-32226), ldc:int(-32738)))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(12636), ldc:int(13148)))
            putfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, and:int[expected:boolean](ldc:int(4113), ldc:int(2405)))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, ldc:int(-1))
            putfield:LinkedHashMap(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:\u8709\u183a\u7ce1\u600f\u1833\u7af6[expected:LinkedHashMap](\u8709\u183a\u7ce1\u600f\u1833\u7af6::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, and:int(ldc:int(2760), ldc:int(20975)), ldc:float(1.0f), and:int[expected:boolean](ldc:int(3853), ldc:int(16417))))
            putfield:String(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8bb0\u7043\u8d98\uc2bd\ub19c\u6fb0, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:String)
            invokespecial:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub102\u600f\u5140\u4bc8\u7e3f\u6ec6, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokestatic:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc238\u0a06\u946b\u93a2\u5db4\ub32d, p0:String), p1:int, p2:boolean, p3:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u516c\u839e\u1833\u8df4\ub32d(java.awt.Font p0, java.lang.String p1) {
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
            invokespecial:\ubded\u516c\u839e\u1833\u8df4\ub32d(\ubded\u516c\u839e\u1833\u8df4\ub32d::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:Font, initobject:\u9af2\ud217\u760c\u3bc9\u6d69\ud171(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::<init>, p1:String))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u516c\u839e\u1833\u8df4\ub32d(java.awt.Font p0, \u516c\u3d64\u718f\ub171\u6b5f.\u9af2\ud217\u760c\u3bc9\u6d69\ud171 p1) {
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
            invokespecial:Object(Object::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)
            putfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u927d\u64ab\u36d3\u8cae\u6d99\ua6bd, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, newarray:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[].class, xor:int(ldc:int(16764), ldc:int(18691))))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u51b2\u6fb0\u9255\u71ae\uc4d2\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>, xor:int(ldc:int(374), ldc:int(118))))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud51e\u8d90\u5d20\ubded\u52d3\uf995, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, and:int(ldc:int(709), ldc:int(8712)))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(16559), ldc:int(17071)))
            putfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, and:int[expected:boolean](ldc:int(18529), ldc:int(12293)))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, ldc:int(-1))
            putfield:LinkedHashMap(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:\u8709\u183a\u7ce1\u600f\u1833\u7af6[expected:LinkedHashMap](\u8709\u183a\u7ce1\u600f\u1833\u7af6::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(154), ldc:int(82)), ldc:float(1.0f), xor:int[expected:boolean](ldc:int(8234), ldc:int(8235))))
            invokespecial:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub102\u600f\u5140\u4bc8\u7e3f\u6ec6, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:Font, invokevirtual:int(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u3504\u7043\u516c\u51fa\ubcb0\u64ab, p1:\u9af2\ud217\u760c\u3bc9\u6d69\ud171), invokevirtual:boolean(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u6198\u40a9\u1187\u4492\ub102\u446c, p1:\u9af2\ud217\u760c\u3bc9\u6d69\ud171), invokevirtual:boolean(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u4975\ub1b9\ud12e\uc9f6\u4ab3\ucfaf, p1:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            invokespecial:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u1187\u92ee\u156b\u40a9\u7ce1\uf9c5, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p1:\u9af2\ud217\u760c\u3bc9\u6d69\ud171)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u516c\u839e\u1833\u8df4\ub32d(java.awt.Font p0) {
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
            invokespecial:Object(Object::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)
            putfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u927d\u64ab\u36d3\u8cae\u6d99\ua6bd, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, newarray:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[].class, xor:int(ldc:int(1774), ldc:int(3729))))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u51b2\u6fb0\u9255\u71ae\uc4d2\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>, and:int(ldc:int(12578), ldc:int(17172))))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud51e\u8d90\u5d20\ubded\u52d3\uf995, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(17916), ldc:int(18428)))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(-32624), ldc:int(-32112)))
            putfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int[expected:boolean](ldc:int(12480), ldc:int(12481)))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, ldc:int(-1))
            putfield:LinkedHashMap(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:\u8709\u183a\u7ce1\u600f\u1833\u7af6[expected:LinkedHashMap](\u8709\u183a\u7ce1\u600f\u1833\u7af6::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(1179), ldc:int(1107)), ldc:float(1.0f), xor:int[expected:boolean](ldc:int(513), ldc:int(512))))
            invokespecial:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub102\u600f\u5140\u4bc8\u7e3f\u6ec6, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:Font, invokevirtual:int(Font::getSize, p0:Font), invokevirtual:boolean(Font::isBold, p0:Font), invokevirtual:boolean(Font::isItalic, p0:Font))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u516c\u839e\u1833\u8df4\ub32d(java.awt.Font p0, int p1, boolean p2, boolean p3) {
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
            invokespecial:Object(Object::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)
            putfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u927d\u64ab\u36d3\u8cae\u6d99\ua6bd, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, newarray:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[].class, xor:int(ldc:int(179), ldc:int(2252))))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u51b2\u6fb0\u9255\u71ae\uc4d2\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>, and:int(ldc:int(6409), ldc:int(8964))))
            putfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:ArrayList[expected:List](ArrayList::<init>))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud51e\u8d90\u5d20\ubded\u52d3\uf995, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, and:int(ldc:int(4969), ldc:int(18948)))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(470), ldc:int(982)))
            putfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int[expected:boolean](ldc:int(338), ldc:int(339)))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, ldc:int(-1))
            putfield:LinkedHashMap(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:\u8709\u183a\u7ce1\u600f\u1833\u7af6[expected:LinkedHashMap](\u8709\u183a\u7ce1\u600f\u1833\u7af6::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, xor:int(ldc:int(1132), ldc:int(1188)), ldc:float(1.0f), and:int[expected:boolean](ldc:int(21307), ldc:int(65))))
            invokespecial:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub102\u600f\u5140\u4bc8\u7e3f\u6ec6, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:Font, p1:int, p2:boolean, p3:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub102\u600f\u5140\u4bc8\u7e3f\u6ec6(java.awt.Font p0, int p1, boolean p2, boolean p3) {
        var_5_68 : int
        var_7_6E : Map<TextAttribute, ?>
        var_5_164 : int
        stack_23D_0 : Map<TextAttribute, ?> [generated]
        stack_18E_0 : Map<TextAttribute, ?> [generated]
        stack_23D_1 : TextAttribute [generated]
        stack_18E_1 : TextAttribute [generated]
        stack_23D_2 : Float [generated]
        stack_18E_2 : Float [generated]
        stack_2D3_0 : Map<TextAttribute, ?> [generated]
        stack_2D3_1 : Object [generated]
        stack_2D3_2 : Object [generated]
        var_5_413 : int
        var_8_402 : FontMetrics
        var_9_501 : char[]
        
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
            var_5_68 = and:int(and:int(ldc:int(916265214), ldc:int(1463679991)), ldc:int(-29440034))
            var_7_6E = invokevirtual:Map<TextAttribute, ?>(Font::getAttributes, p0:Font)
            
            loop {
                Label_0112:
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(262144)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(358538767))
                    goto(Label_0933)
                }
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0853)
                }
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0729)
                }
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0579)
                }
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(512)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(2091167644))
                    goto(Label_0404)
                }
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(2097152)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(-457104868))
                }
                else {
                    var_5_68 = and:int(var_5_68:int, ldc:int(335300567))
                    invokeinterface:?(Map<TextAttribute, ?>::put, var_7_6E:Map<TextAttribute, ?>, getstatic:TextAttribute(TextAttribute::SIZE), initobject:?(Float::<init>, i2f:float(p1:int)))
                }
                
                Label_0217:
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(4)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(-929770038))
                    goto(Label_0933)
                }
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(2)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(165471816))
                    goto(Label_0853)
                }
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0729)
                }
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(16777216)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(1220458013))
                    goto(Label_0579)
                }
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(268435456)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(-561072546))
                    goto(Label_0404)
                }
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(16777216)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_5_164 = and:int(var_5_68:int, ldc:int(-1109535018))
                stack_23D_0 = stack_18E_0 = var_7_6E
                stack_23D_1 = stack_18E_1 = getstatic(TextAttribute::WEIGHT)
                
                if (logicalnot:boolean(p2:boolean)) {
                    stack_23D_2 = stack_18E_2 = getstatic(TextAttribute::WEIGHT_REGULAR)
                    goto(Label_0371)
                }
                
                Label_0330:
                
                if (cmpeq:boolean(and:int(var_5_164:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_164 = and:int(var_5_164:int, ldc:int(1871014903))
                    goto(Label_0527)
                }
                
                var_5_164 = and:int(var_5_164:int, ldc:int(1348368606))
                stack_23D_2 = stack_18E_2 = getstatic(TextAttribute::WEIGHT_BOLD)
                Label_0371:
                
                if (cmpeq:boolean(and:int(var_5_164:int, ldc:int(1048576)), ldc:int(0))) {
                    var_5_164 = and:int(var_5_164:int, ldc:int(100532380))
                    goto(Label_0557)
                }
                
                var_5_68 = and:int(var_5_164:int, ldc:int(1948187870))
                invokeinterface:?(Map<TextAttribute, ?>::put, stack_18E_0:Map<TextAttribute, ?>, stack_18E_1:TextAttribute, stack_18E_2:Object[expected:?])
                Label_0404:
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(512)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(1144758322))
                    goto(Label_0933)
                }
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(4194304)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(562219677))
                    goto(Label_0853)
                }
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(4)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(-567498680))
                    goto(Label_0729)
                }
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0579)
                }
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(2)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(2007268551))
                    goto(Label_0217)
                }
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(128)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(389906341))
                    loopcontinue()
                }
                
                var_5_164 = and:int(var_5_68:int, ldc:int(-94523394))
                stack_23D_0 = stack_18E_0 = var_7_6E
                stack_23D_1 = stack_18E_1 = getstatic(TextAttribute::POSTURE)
                
                if (logicalnot:boolean(p3:boolean)) {
                    stack_23D_2 = stack_18E_2 = getstatic(TextAttribute::POSTURE_REGULAR)
                    goto(Label_0557)
                }
                
                Label_0527:
                
                if (cmpeq:boolean(and:int(var_5_164:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0330)
                }
                
                var_5_164 = and:int(var_5_164:int, ldc:int(-1319282177))
                stack_23D_2 = stack_18E_2 = getstatic(TextAttribute::POSTURE_OBLIQUE)
                Label_0557:
                
                if (cmpne:boolean(and:int(var_5_164:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0371)
                }
                
                var_5_68 = and:int(var_5_164:int, ldc:int(2082459895))
                invokeinterface:?(Map<TextAttribute, ?>::put, stack_23D_0:Map<TextAttribute, ?>, stack_23D_1:TextAttribute, stack_23D_2:Object[expected:?])
                
                try {
                    Label_0579:
                    
                    while (cmpeq:boolean(and:int(var_5_68:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_5_68:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0853)
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(2)), ldc:int(0))) {
                            var_5_68 = and:int(var_5_68:int, ldc:int(-1217084291))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_5_68:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Block_53)
                            }
                            
                            if (cmpne:boolean(and:int(var_5_68:int, ldc:int(131072)), ldc:int(0))) {
                                goto(Block_54)
                            }
                            
                            if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(524288)), ldc:int(0))) {
                                loopcontinue(Label_0112)
                            }
                            
                            var_5_68 = and:int(var_5_68:int, ldc:int(-1847724841))
                            stack_2D3_0 = var_7_6E:Map<TextAttribute, ?>
                            stack_2D3_1 = invokevirtual:Object[expected:TextAttribute](Field::get, invokevirtual:Field(Class<T>::getDeclaredField, ldc:Class<TextAttribute>(java.awt.font.TextAttribute.class), loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), xor:int(ldc:int(198), ldc:int(196)))), aconstnull:Object())
                            stack_2D3_2 = invokevirtual:Object(Field::get, invokevirtual:Field(Class<T>::getDeclaredField, ldc:Class<TextAttribute>(java.awt.font.TextAttribute.class), loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), xor:int(ldc:int(2075), ldc:int(2072)))), aconstnull:Object())
                            var_5_68 = and:int(var_5_68:int, ldc:int(-1323523874))
                            invokeinterface:?(Map<TextAttribute, ?>::put, stack_2D3_0:Map<TextAttribute, ?>, stack_2D3_1:TextAttribute, stack_2D3_2:Object[expected:?])
                        }
                        
                        Label_0729:
                        
                        if (cmpne:boolean(and:int(var_5_68:int, ldc:int(16777216)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Block_57)
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0777)
                        }
                        
                        var_5_68 = and:int(var_5_68:int, ldc:int(992561693))
                    }
                    
                    goto(Label_0933)
                    Block_53:
                    var_5_68 = and:int(var_5_68:int, ldc:int(-684732236))
                    goto(Label_0404)
                    Block_54:
                    var_5_68 = and:int(var_5_68:int, ldc:int(336812413))
                    goto(Label_0217)
                    Block_57:
                    var_5_68 = and:int(var_5_68:int, ldc:int(198386658))
                    goto(Label_0853)
                    Label_0777:
                    
                    if (cmpne:boolean(and:int(var_5_68:int, ldc:int(4194304)), ldc:int(0))) {
                        var_5_68 = and:int(var_5_68:int, ldc:int(718425514))
                        goto(Label_0404)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_68:int, ldc:int(2097152)), ldc:int(0))) {
                        var_5_68 = and:int(var_5_68:int, ldc:int(-1966452186))
                        goto(Label_0217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(524288)), ldc:int(0))) {
                        var_5_68 = and:int(var_5_68:int, ldc:int(-1435400718))
                        loopcontinue()
                    }
                    
                    var_5_68 = and:int(var_5_68:int, ldc:int(-65192490))
                }
                catch (java.lang.Exception stack_353_0) {
                }
                
                Label_0853:
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_68:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(128)), ldc:int(0))) {
                        var_5_68 = and:int(var_5_68:int, ldc:int(1899154633))
                        goto(Label_0217)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_68:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_5_68 = and:int(var_5_68:int, ldc:int(499112414))
                    putfield:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc87f\u4cd9\ucfaf\ub171\u3bc9\u6b0d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:Font(Font::deriveFont, p0:Font, var_7_6E:Map<TextAttribute, ?>))
                }
                
                Label_0933:
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0853)
                }
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0729)
                }
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0579)
                }
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(8192)), ldc:int(0))) {
                    var_5_68 = and:int(var_5_68:int, ldc:int(286649388))
                    goto(Label_0404)
                }
                
                if (cmpne:boolean(and:int(var_5_68:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0217)
                }
                
                if (cmpeq:boolean(and:int(var_5_68:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_68 = and:int(var_5_68:int, ldc:int(-1905550040))
            }
            
            var_5_413 = and:int(var_5_68:int, ldc:int(2140956118))
            var_8_402 = invokevirtual:FontMetrics(Graphics::getFontMetrics, invokestatic:Graphics2D[expected:Graphics](\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\ud217\ub7dc\ube23\u67d0\ufcaf\u600f), getfield:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc87f\u4cd9\ucfaf\ub171\u3bc9\u6b0d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
            
            loop {
                if (cmpne:boolean(and:int(var_5_413:int, ldc:int(16384)), ldc:int(0))) {
                    var_5_413 = and:int(var_5_413:int, ldc:int(-53369039))
                    goto(Label_1212)
                }
                
                if (cmpeq:boolean(and:int(var_5_413:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1135)
                }
                
                if (cmpne:boolean(and:int(var_5_413:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_413 = and:int(var_5_413:int, ldc:int(1379781078))
                    putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u99f7\uc2e8\u7c6b\ufe34\u92ee\u965f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(FontMetrics::getAscent, var_8_402:FontMetrics))
                }
                
                Label_1082:
                
                if (cmpne:boolean(and:int(var_5_413:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1212)
                }
                
                if (cmpeq:boolean(and:int(var_5_413:int, ldc:int(262144)), ldc:int(0))) {
                    var_5_413 = and:int(var_5_413:int, ldc:int(131317124))
                }
                else {
                    if (cmpne:boolean(and:int(var_5_413:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_5_413 = and:int(var_5_413:int, ldc:int(-1273200938))
                    putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u71f1\u4ab3\ubded\u3e75\u392e\u7d52, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(FontMetrics::getDescent, var_8_402:FontMetrics))
                }
                
                Label_1135:
                
                if (cmpne:boolean(and:int(var_5_413:int, ldc:int(4194304)), ldc:int(0))) {
                    var_5_413 = and:int(var_5_413:int, ldc:int(1537028830))
                }
                else {
                    if (cmpeq:boolean(and:int(var_5_413:int, ldc:int(16)), ldc:int(0))) {
                        var_5_413 = and:int(var_5_413:int, ldc:int(-77333005))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_413:int, ldc:int(131072)), ldc:int(0))) {
                        var_5_413 = and:int(var_5_413:int, ldc:int(1214810497))
                        loopcontinue()
                    }
                    
                    var_5_413 = and:int(var_5_413:int, ldc:int(381502431))
                    putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u5140\u7006\u4ab3\u8640\ubff1\ub83f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(FontMetrics::getLeading, var_8_402:FontMetrics))
                }
                
                Label_1212:
                
                if (cmpne:boolean(and:int(var_5_413:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1135)
                }
                
                if (cmpne:boolean(and:int(var_5_413:int, ldc:int(512)), ldc:int(0))) {
                    var_5_413 = and:int(var_5_413:int, ldc:int(1818537986))
                    goto(Label_1082)
                }
                
                if (cmpne:boolean(and:int(var_5_413:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_413 = and:int(var_5_413:int, ldc:int(-827586755))
            }
            
            var_9_501 = invokevirtual:char[](String::toCharArray, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), xor:int(ldc:int(6212), ldc:int(6208))))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u16f6\ua61f\ub70c\uc2bd\u5db4\ub83f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, getfield:int(Rectangle::width, invokeinterface:Rectangle(Shape::getBounds, invokevirtual:Shape(GlyphVector::getGlyphLogicalBounds, invokevirtual:GlyphVector(Font::layoutGlyphVector, getfield:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc87f\u4cd9\ucfaf\ub171\u3bc9\u6b0d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getstatic:FontRenderContext(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\ufcaf\uc238\u5fe1\u7e3f\u3711\u6c52), var_9_501:char[], and:int(ldc:int(15372), ldc:int(-15373)), arraylength:int(var_9_501:char[]), and:int(ldc:int(16000), ldc:int(-16039))), and:int(ldc:int(8973), ldc:int(-8990))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u1187\u92ee\u156b\u40a9\u7ce1\uf9c5(\u516c\u3d64\u718f\ub171\u6b5f.\u9af2\ud217\u760c\u3bc9\u6d69\ud171 p0) {
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
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u0c95\u6c56\ua61f\u4d85\u071d\u61a4, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\uf94d\u647c\u759a\u12cb\u5140\u9255, p0:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8cae\u16f6\uae87\u3bd6\u7043\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\ud51e\u6ec6\u36d3\u5fe1\ubded\u5654, p0:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ufe34\u8753\ufe34\uc29a\u1833\u7ce1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\ubcb0\u4ab3\ubff1\u8c8a\u071d\u52d3, p0:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc238\u965f\u8640\u4bc8\u51b2\u1833, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u4c04\u71ae\u4ab3\uc2e8\uc87f\uc229, p0:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub32d\u8389\u392e\u4ab3\uceb8\uc4d2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\ud12e\u4bc8\u7049\ub70c\u7049\uff55, p0:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ua6bd\u71f1\ubf56\u759a\u76bc\u97e6, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u7006\u8df4\u0b8e\uff55\u0b8e\u8413, p0:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud51e\u8d90\u5d20\ubded\u52d3\uf995, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u8df4\ubff1\u3504\u34df\u67e9\u7af6, p0:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u516c\u98a4\ub70c\u5654\u624e\ua562, p0:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            invokeinterface:boolean(List::addAll, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), invokevirtual:List[expected:Collection](\u9af2\ud217\u760c\u3bc9\u6d69\ud171::\u6b0d\u72f1\ucb79\u516c\u7873\u9937, p0:\u9af2\ud217\u760c\u3bc9\u6d69\ud171))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\u2dcc\u6198\u51fa\u0b8e\u4bc8(int p0, int p1) {
        var_3_61 : int
        var_5_63 : int
        
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
            var_3_61 = and:int(ldc:int(1026158462), ldc:int(-1917075471))
            var_5_63 = p0:int
            
            loop {
                var_3_61 = and:int(var_3_61:int, ldc:int(1606344560))
                
                if (cmpgt:boolean(var_5_63:int, p1:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64ab\u2dcc\u6198\u51fa\u0b8e\u4bc8, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, initobject:String(String::<init>, invokestatic:char[](Character::toChars, var_5_63:int)))
                inc:int(var_5_63, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\u2dcc\u6198\u51fa\u0b8e\u4bc8(java.lang.String p0) {
        var_4_70 : char[]
        var_5_8F : GlyphVector
        var_6_98 : int
        var_8_DF : int
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_4_70 = invokevirtual:char[](String::toCharArray, p0:String)
            var_5_8F = invokevirtual:GlyphVector(Font::layoutGlyphVector, getfield:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc87f\u4cd9\ucfaf\ub171\u3bc9\u6b0d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getstatic:FontRenderContext(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\ufcaf\uc238\u5fe1\u7e3f\u3711\u6c52), var_4_70:char[], and:int(ldc:int(17177), ldc:int(-17242)), arraylength:int(var_4_70:char[]), and:int(ldc:int(-8854), ldc:int(8853)))
            var_6_98 = and:int(ldc:int(-13839), ldc:int(13838))
            
            while (cmplt:boolean(var_6_98:int, invokevirtual:int(GlyphVector::getNumGlyphs, var_5_8F:GlyphVector))) {
                var_8_DF = invokevirtual:int(String::codePointAt, p0:String, invokevirtual:int(GlyphVector::getGlyphCharIndex, var_5_8F:GlyphVector, var_6_98:int))
                invokespecial:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub102\u7af6\u0a06\ub18d\u6fb0\u120d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(GlyphVector::getGlyphCode, var_5_8F:GlyphVector, var_6_98:int), var_8_DF:int, invokespecial:Rectangle(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u4179\u9937\u5245\u4e72\u71ae\u8d90, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, var_5_8F:GlyphVector, var_6_98:int, var_8_DF:int), var_5_8F:GlyphVector, var_6_98:int)
                inc:int(var_6_98, ldc:int(1))
            }
            
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), xor:int(ldc:int(3585), ldc:int(3588)))))
    }
    
    public void \uafe7\u8c8a\u88c5\u836c\u8753\u946b() {
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
            invokevirtual:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64ab\u2dcc\u6198\u51fa\u0b8e\u4bc8, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, ldc:int(32), and:int(ldc:int(4863), ldc:int(10495)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc84e\ud217\u7e3f\u6b0d\u5f50\u416d() {
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
            invokevirtual:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64ab\u2dcc\u6198\u51fa\u0b8e\u4bc8, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, ldc:int(32), xor:int(ldc:int(799), ldc:int(927)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8350\ubefe\ub6ab\u61a4\u7330\u4c04() {
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
            return:boolean(invokevirtual:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8350\ubefe\ub6ab\u61a4\u7330\u4c04, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, ldc:int(-1)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8350\ubefe\ub6ab\u61a4\u7330\u4c04(int p0) {
        var_2_7A : int
        var_2_129 : int
        var_4_A6 : Iterator
        var_5_10B : \u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1
        var_6_112 : int
        var_2_2F3 : int
        var_4_F8 : Iterator<\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6>
        var_4_2CF : \u72f1\ua068\ub6ab\ub171\u3a62\u6ec6
        
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
        var_2_7A = and:int(ldc:int(-1788419915), ldc:int(-813801246))
        
        if (invokeinterface:boolean(List::isEmpty, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))) {
            return:boolean(and:int[expected:boolean](ldc:int(-12275), ldc:int(12256)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_7A:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_7A = and:int(var_2_7A:int, ldc:int(-2123957585))
                
                if (invokeinterface:boolean(List::isEmpty, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))) {
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), and:int(ldc:int(2566), ldc:int(24583)))))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_7A:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_129 = and:int(var_2_7A:int, ldc:int(-1452377036))
                var_4_A6 = invokeinterface:Iterator(List::iterator, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_A6:Iterator)) {
                    var_5_10B = checkcast:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1.class, invokeinterface:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(Iterator<\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1>::next, var_4_A6:Iterator<\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1>))
                    var_6_112 = invokevirtual:int(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u7c6b\u92ff\u3e75\u7bad\u34df\u9255, var_5_10B:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1)
                    
                    if (cmpne:boolean(invokevirtual:int(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\ub18d\u7043\uc7fe\u5db4\ubff1\u4f52, var_5_10B:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1), ldc:int(0))) {
                        if (cmpne:boolean(var_6_112:int, ldc:int(32))) {
                            goto(Label_0344)
                        }
                    }
                    
                    Label_0284:
                    
                    if (cmpeq:boolean(and:int(var_2_129:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_129 = and:int(var_2_129:int, ldc:int(-768821172))
                        goto(Label_0467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_129:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_129:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_129 = and:int(var_2_129:int, ldc:int(-1351718202))
                        invokeinterface:void(Iterator::remove, var_4_A6:Iterator<\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1>)
                        loopcontinue()
                    }
                    
                    Label_0344:
                    
                    if (cmpne:boolean(and:int(var_2_129:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_129 = and:int(var_2_129:int, ldc:int(946631480))
                        goto(Label_0467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_129:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_129 = and:int(var_2_129:int, ldc:int(970913621))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_129:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0284)
                        }
                        
                        var_2_129 = and:int(var_2_129:int, ldc:int(-243895782))
                        
                        if (invokevirtual:boolean(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u759a\uceb8\u718f\u12cb\u4ab3\ub6ab, var_5_10B:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1)) {
                            if (cmpeq:boolean(getfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u47c2\u120d\u4ab3\u873d\u71f1\u6cfe, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), aconstnull:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1())) {
                                goto(Label_0467)
                            }
                            
                            if (cmpeq:boolean(var_5_10B:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1, getfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u47c2\u120d\u4ab3\u873d\u71f1\u6cfe, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))) {
                                loopcontinue()
                            }
                            
                            invokeinterface:void(Iterator<E>::remove, var_4_A6:Iterator<\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1>)
                            loopcontinue()
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_2_129:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_129 = and:int(var_2_129:int, ldc:int(-491225134))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_129:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0344)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_129:int, ldc:int(1048576)), ldc:int(0))) {
                            var_2_129 = and:int(var_2_129:int, ldc:int(1995009390))
                            goto(Label_0284)
                        }
                        
                        var_2_129 = and:int(var_2_129:int, ldc:int(-1486426418))
                        loopcontinue()
                    }
                    
                    Label_0467:
                    
                    if (cmpeq:boolean(and:int(var_2_129:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_129 = and:int(var_2_129:int, ldc:int(-270412459))
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_129:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_129 = and:int(var_2_129:int, ldc:int(1835626584))
                        goto(Label_0344)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_129:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_129 = and:int(var_2_129:int, ldc:int(-1132683855))
                        goto(Label_0284)
                    }
                    
                    var_2_129 = and:int(var_2_129:int, ldc:int(-1778422034))
                    putfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u47c2\u120d\u4ab3\u873d\u71f1\u6cfe, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, var_5_10B:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1)
                    goto(Label_0399)
                }
                
                var_2_2F3 = and:int(var_2_129:int, ldc:int(-512328526))
                invokestatic:void(Collections::sort, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getstatic:Comparator(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub19c\u56bd\u47c2\u3d4b\ua562\u92ff))
                var_4_F8 = invokeinterface:Iterator(List::iterator, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u51b2\u6fb0\u9255\u71ae\uc4d2\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
                
                while (invokeinterface:boolean(Iterator::hasNext, var_4_F8:Iterator)) {
                    p0 = sub:int(p0:int, invokevirtual:int(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\u71ae\u965f\ubded\u6c52\ub83f\ucb79, checkcast:\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6.class, invokeinterface:\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6(Iterator<\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6>::next, var_4_F8:Iterator<\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6>)), getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), p0:int))
                    
                    if (cmpne:boolean(p0:int, ldc:int(0))) {
                        if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)))) {
                            goto(Label_0666)
                        }
                    }
                    
                    Label_0629:
                    
                    if (cmpne:boolean(and:int(var_2_2F3:int, ldc:int(262144)), ldc:int(0))) {
                        return:boolean(xor:int[expected:boolean](ldc:int(1345), ldc:int(1344)))
                    }
                    
                    Label_0666:
                    
                    if (cmpeq:boolean(and:int(var_2_2F3:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_2F3 = and:int(var_2_2F3:int, ldc:int(659791214))
                        goto(Label_0629)
                    }
                    
                    var_2_2F3 = and:int(var_2_2F3:int, ldc:int(-370216737))
                }
                
                while (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)))) {
                    var_4_2CF = initobject:\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud51e\u8d90\u5d20\ubded\u52d3\uf995, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
                    invokeinterface:boolean(List<\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6>::add, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u51b2\u6fb0\u9255\u71ae\uc4d2\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), var_4_2CF:\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6)
                    p0 = sub:int(p0:int, invokevirtual:int(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\u71ae\u965f\ubded\u6c52\ub83f\ucb79, var_4_2CF:\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), p0:int))
                    
                    if (cmpeq:boolean(p0:int, ldc:int(0))) {
                        return:boolean(and:int[expected:boolean](ldc:int(5121), ldc:int(19075)))
                    }
                    
                    var_2_2F3 = and:int(var_2_2F3:int, ldc:int(-1853980914))
                }
                
                return:boolean(xor:int[expected:boolean](ldc:int(8261), ldc:int(8260)))
            }
            
            var_2_7A = and:int(var_2_7A:int, ldc:int(633966577))
        }
    }
    
    public void \u446c\ub8be\uc84e\u0a06\u6d99\u718f() {
        var_1_15F : int
        var_3_6F : int
        var_3_14A : Iterator<\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6>
        var_1_279 : int
        var_4_283 : \u72f1\ua068\ub6ab\ub171\u3a62\u6ec6
        
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
            var_1_15F = and:int(and:int(ldc:int(496123613), ldc:int(-1164198371)), ldc:int(-1648412043))
            var_3_6F = and:int(ldc:int(-31629), ldc:int(31116))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(512)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-1465634374))
                    goto(Label_0272)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-1904699307))
                    goto(Label_0226)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-1714525410))
                }
                else {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(2094431063))
                    
                    if (cmpge:boolean(var_3_6F:int, and:int(ldc:int(3071), ldc:int(14463)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0179:
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0272)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(1992042283))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(1720252987))
                        loopcontinue()
                    }
                    
                    var_1_15F = and:int(var_1_15F:int, ldc:int(1559346973))
                }
                
                Label_0226:
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(-1585185048))
                        loopcontinue()
                    }
                    
                    var_1_15F = and:int(var_1_15F:int, ldc:int(498416285))
                    storeelement:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[](getfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u927d\u64ab\u36d3\u8cae\u6d99\ua6bd, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), var_3_6F:int, aconstnull:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[]())
                }
                
                Label_0272:
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0226)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(1026176638))
                    goto(Label_0179)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2048)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_15F = and:int(var_1_15F:int, ldc:int(1033649823))
                inc:int(var_3_6F, ldc:int(1))
            }
            
            var_3_14A = invokeinterface:Iterator(List::iterator, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u51b2\u6fb0\u9255\u71ae\uc4d2\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
            
            loop {
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1321)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(2140178929))
                    goto(Label_1208)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1099)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0994)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(2086563635))
                    goto(Label_0880)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0759)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0520)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(1539095445))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_14A:Iterator<\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6>))) {
                        invokeinterface:void(List::clear, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u51b2\u6fb0\u9255\u71ae\uc4d2\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
                        goto(Label_0759)
                    }
                }
                
                Label_0426:
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(846574134))
                    goto(Label_1321)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1208)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1099)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0994)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0880)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(1013531564))
                    goto(Label_0759)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(512)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-948241667))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_15F = and:int(var_1_15F:int, ldc:int(984644285))
                }
                
                Label_0520:
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1321)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(370799381))
                    goto(Label_1208)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_1099)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0994)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(1688536540))
                    goto(Label_0880)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(16)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(175541287))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(-1040028705))
                        goto(Label_0426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(-641239587))
                        loopcontinue()
                    }
                    
                    var_1_279 = and:int(var_1_15F:int, ldc:int(-543785443))
                    var_4_283 = checkcast:\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6.class, invokeinterface:\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6(Iterator<\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6>::next, var_3_14A:Iterator<\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6>))
                    
                    loop {
                        try {
                            while (cmpne:boolean(and:int(var_1_279:int, ldc:int(1)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_1_279:int, ldc:int(2048)), ldc:int(0))) {
                                    var_1_279 = and:int(var_1_279:int, ldc:int(2073919261))
                                    invokevirtual:void(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\u6bb9\u93a2\ub1b9\u7043\u0c95\u3c25, invokevirtual:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\u69d9\uc84e\ua3b4\ud36e\u64ab\u0800, var_4_283:\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6))
                                }
                                
                                Label_0684:
                                
                                if (cmpeq:boolean(and:int(var_1_279:int, ldc:int(4)), ldc:int(0))) {
                                    goto(Label_0714)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_279:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_1_279 = and:int(var_1_279:int, ldc:int(-623560137))
                                    goto(Label_0714)
                                }
                            }
                            
                            var_1_279 = and:int(var_1_279:int, ldc:int(1515619396))
                        }
                        catch (\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u1833\u4179\u9255\u8aa5\u7006\u8258 stack_2C8_0) {
                        }
                        
                        Label_0714:
                        
                        if (cmpeq:boolean(and:int(var_1_279:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_279:int, ldc:int(4)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_1_279 = and:int(var_1_279:int, ldc:int(334167495))
                    }
                    
                    var_1_15F = and:int(var_1_279:int, ldc:int(-577144193))
                    loopcontinue()
                }
                
                Label_0759:
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-1331854674))
                    goto(Label_1321)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(1182635956))
                    goto(Label_1208)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(883446444))
                    goto(Label_1099)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(4)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-1809695176))
                    goto(Label_0994)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-2141020001))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0520)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_15F = and:int(var_1_15F:int, ldc:int(1521679895))
                    
                    if (cmpeq:boolean(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), ldc:int(-1))) {
                        goto(Label_1208)
                    }
                }
                
                Label_0880:
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1321)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(175082538))
                    goto(Label_1208)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(1270974276))
                    goto(Label_1099)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(-1309150285))
                        goto(Label_0759)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(-1547285261))
                        goto(Label_0520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(512)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(-1441101094))
                        goto(Label_0426)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-1143850443))
                }
                
                Label_0994:
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_1321)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_1208)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(-1315884967))
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0759)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0426)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(-1697373350))
                        loopcontinue()
                    }
                    
                    var_1_15F = and:int(var_1_15F:int, ldc:int(2059091647))
                    invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\u8709\ub83f\u4f52\ud12e\uc2e8\ub19c, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), invokevirtual:int(HashMap::size, getfield:LinkedHashMap[expected:HashMap](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)))
                }
                
                Label_1099:
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-790572156))
                    goto(Label_1321)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1073741824)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(-421271253))
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(846463946))
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0759)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(-465904815))
                        loopcontinue()
                    }
                    
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-1147420875))
                    putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, ldc:int(-1))
                }
                
                Label_1208:
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-403855559))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(1167985145))
                        goto(Label_0759)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(1274224008))
                        goto(Label_0520)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_15F = and:int(var_1_15F:int, ldc:int(1503253446))
                        goto(Label_0426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-1661158505))
                    invokeinterface:void(List::clear, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
                }
                
                Label_1321:
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1208)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1099)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0994)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0880)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-1907022542))
                    goto(Label_0759)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0520)
                }
                
                if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2)), ldc:int(0))) {
                    var_1_15F = and:int(var_1_15F:int, ldc:int(-1141228284))
                    goto(Label_0426)
                }
                
                if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(262144)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_15F = and:int(var_1_15F:int, ldc:int(-2057280360))
            }
            
            putfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u47c2\u120d\u4ab3\u873d\u71f1\u6cfe, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, aconstnull:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc9f6\ufcaf\ub83f\u0a06\u446c\u6435() {
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
            invokevirtual:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u446c\ub8be\uc84e\u0a06\u6d99\u718f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d \ub171\u99f7\u836c\uc4d2\u3dd3\u494c(float p0, float p1, java.lang.String p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330 p3, int p4, int p5) {
        var_7_63 : int
        var_7_220 : int
        var_9_106 : String
        var_10_5C7 : \u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d
        var_11_332 : int
        var_11_13A : char[]
        var_12_159 : GlyphVector
        var_13_162 : int
        var_14_16B : int
        var_15_174 : int
        var_16_17D : int
        var_17_183 : int
        var_18_18C : int
        var_19_18F : \ubcb0\uc246\ua6bd\u527a\u97e6\ubefe
        var_20_198 : int
        var_22_3DB : int
        var_23_3F1 : int
        var_24_3FD : Rectangle
        var_25_412 : \u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1
        var_26_41E : \ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c
        var_27_4D2 : \ubcb0\uc246\ua6bd\u527a\u97e6\ubefe
        
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
        var_7_63 = and:int(ldc:int(1174898601), ldc:int(2006326061))
        
        if (cmpeq:boolean(p2:String, aconstnull:String())) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), xor:int(ldc:int(-32712), ldc:int(-32707)))))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_7_63:int, ldc:int(2097152)), ldc:int(0))) {
                var_7_63 = and:int(var_7_63:int, ldc:int(-186806609))
                goto(Label_0201)
            }
            
            if (cmpne:boolean(and:int(var_7_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_7_63 = and:int(var_7_63:int, ldc:int(284659953))
            }
            else {
                var_7_63 = and:int(var_7_63:int, ldc:int(-2020178455))
                
                if (cmpeq:boolean(invokevirtual:int(String::length, p2:String), ldc:int(0))) {
                    return:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(getstatic:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8350\u960f\uae87\u6c56\u0b8e\u9255))
                }
            }
            
            Label_0159:
            
            if (cmpeq:boolean(and:int(var_7_63:int, ldc:int(4194304)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_7_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_7_63 = and:int(var_7_63:int, ldc:int(1418780646))
                    loopcontinue()
                }
                
                var_7_63 = and:int(var_7_63:int, ldc:int(-167776275))
                
                if (cmpeq:boolean(p3:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330, aconstnull:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330())) {
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), xor:int(ldc:int(99), ldc:int(100)))))
                }
            }
            
            Label_0201:
            
            if (cmpne:boolean(and:int(var_7_63:int, ldc:int(268435456)), ldc:int(0))) {
                var_7_63 = and:int(var_7_63:int, ldc:int(1269343750))
                goto(Label_0159)
            }
            
            if (cmpne:boolean(and:int(var_7_63:int, ldc:int(32)), ldc:int(0))) {
                var_7_220 = and:int(var_7_63:int, ldc:int(49993007))
                p0 = sub:float(p0:float, i2f:float(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8cae\u16f6\uae87\u3bd6\u7043\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)))
                p1 = sub:float(p1:float, i2f:float(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u0c95\u6c56\ua61f\u4d85\u071d\u61a4, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)))
                var_9_106 = invokevirtual:String(String::substring, p2:String, p4:int, p5:int)
                invokevirtual:void(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\uae5d\u6ec6\u120d\ub6ab\u71f1\u156b, p3:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330)
                invokestatic:void(\u69d9\u3e75\u8389\u647c\u983f\u7ce1::\u6b0d\u8aa5\uc910\u494c\u965f\ud171)
                var_10_5C7 = aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d()
                
                if (getfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)) {
                    if (invokeinterface:boolean(List::isEmpty, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))) {
                        if (cmpeq:boolean(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), ldc:int(-1))) {
                            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokeinterface:int(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\u64ab\u51b2\uf995\u6198\uafe7\u6b0d, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f), xor:int(ldc:int(2514), ldc:int(2330))))
                            
                            if (cmpeq:boolean(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), ldc:int(0))) {
                                putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, ldc:int(-1))
                                putfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, and:int[expected:boolean](ldc:int(26152), ldc:int(-26490)))
                                return:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(initobject:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::<init>))
                            }
                        }
                        
                        var_10_5C7 = checkcast:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d.class, invokevirtual:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(LinkedHashMap<K, \u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d>::get, getfield:LinkedHashMap(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), var_9_106:String[expected:Object]))
                        
                        if (cmpne:boolean(var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d())) {
                            if (logicalnot:boolean(getfield:boolean(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\u8d98\u52d3\uceb8\ud7e8\u5654\u6c52, var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d))) {
                                goto(Label_0699)
                            }
                            
                            putfield:boolean(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\u8d98\u52d3\uceb8\ud7e8\u5654\u6c52, var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, and:int[expected:boolean](ldc:int(5029), ldc:int(-5094)))
                            goto(Label_0571)
                        }
                        
                        Label_0530:
                        
                        if (cmpne:boolean(and:int(var_7_220:int, ldc:int(2097152)), ldc:int(0))) {
                            var_7_220 = and:int(var_7_220:int, ldc:int(-90476853))
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_7_220:int, ldc:int(32)), ldc:int(0))) {
                            var_7_220 = and:int(var_7_220:int, ldc:int(-1911809109))
                            
                            if (cmpeq:boolean(var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d())) {
                                var_10_5C7 = initobject:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::<init>)
                                var_11_332 = invokevirtual:int(HashMap::size, getfield:LinkedHashMap[expected:HashMap](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
                                invokevirtual:Object(HashMap::put, getfield:LinkedHashMap[expected:HashMap<String, \u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d>](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), var_9_106:String[expected:Object], var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d[expected:Object])
                                
                                if (cmpge:boolean(var_11_332:int, and:int(ldc:int(2760), ldc:int(8699)))) {
                                    var_7_220 = and:int(var_7_220:int, ldc:int(-483431635))
                                    putfield:int(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\ufe34\uc229\ucef1\u2dcc\u3711\uf9c5, var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u416d\u965f\u6d69\u4f4a\uc84e\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
                                }
                                else {
                                    putfield:int(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\ufe34\uc229\ucef1\u2dcc\u3711\uf9c5, var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, add:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uceb8\u51fa\ub6ab\uc9f6\u8413\ua562, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), var_11_332:int))
                                }
                            }
                        }
                        
                        Label_0571:
                        
                        if (cmpne:boolean(and:int(var_7_220:int, ldc:int(2147483647)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_7_220:int, ldc:int(4096)), ldc:int(0))) {
                                var_7_220 = and:int(var_7_220:int, ldc:int(163725664))
                                goto(Label_0530)
                            }
                            
                            invokevirtual:Object(HashMap::put, getfield:LinkedHashMap[expected:HashMap<String, \u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d>](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), var_9_106:String[expected:Object], var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d[expected:Object])
                            goto(Label_0282)
                        }
                        
                        Label_0699:
                        
                        if (cmpne:boolean(and:int(var_7_220:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_7_220:int, ldc:int(268435456)), ldc:int(0))) {
                            var_7_220 = and:int(var_7_220:int, ldc:int(-2012382669))
                            goto(Label_0530)
                        }
                        
                        invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\u7bad\u76bc\u69d9\u97b7\u71ae\ub19c, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f), p0:float, p1:float, ldc:float(0.0f))
                        invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\u6c52\u7049\u74b1\ua6bd\u6d69\u7330, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f), getfield:int(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\ufe34\uc229\ucef1\u2dcc\u3711\uf9c5, var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d))
                        invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\u7bad\u76bc\u69d9\u97b7\u71ae\ub19c, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f), neg:float(p0:float), neg:float(p1:float), ldc:float(0.0f))
                        return:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d)
                    }
                }
                
                Label_0282:
                invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\u7bad\u76bc\u69d9\u97b7\u71ae\ub19c, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f), p0:float, p1:float, ldc:float(0.0f))
                
                if (cmpne:boolean(var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d())) {
                    invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\u56bd\u960f\u3776\ub32d\u5d20\uc9f6, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f), getfield:int(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\ufe34\uc229\ucef1\u2dcc\u3711\uf9c5, var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d), xor:int(ldc:int(6414), ldc:int(2575)))
                }
                
                var_11_13A = invokevirtual:char[](String::toCharArray, invokevirtual:String(String::substring, p2:String, and:int(ldc:int(4576), ldc:int(-4577)), p5:int))
                var_12_159 = invokevirtual:GlyphVector(Font::layoutGlyphVector, getfield:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc87f\u4cd9\ucfaf\ub171\u3bc9\u6b0d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getstatic:FontRenderContext(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\ufcaf\uc238\u5fe1\u7e3f\u3711\u6c52), var_11_13A:char[], and:int(ldc:int(9869), ldc:int(-9936)), arraylength:int(var_11_13A:char[]), and:int(ldc:int(16902), ldc:int(-16903)))
                var_13_162 = and:int(ldc:int(-17849), ldc:int(17816))
                var_14_16B = and:int(ldc:int(-20830), ldc:int(20829))
                var_15_174 = and:int(ldc:int(1943), ldc:int(-18328))
                var_16_17D = and:int(ldc:int(26900), ldc:int(-27957))
                var_17_183 = getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u99f7\uc2e8\u7c6b\ufe34\u92ee\u965f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)
                var_18_18C = and:int(ldc:int(-7195), ldc:int(7194))
                var_19_18F = aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe()
                var_20_198 = and:int(ldc:int(1601), ldc:int(-1602))
                
                while (cmplt:boolean(var_20_198:int, invokevirtual:int(GlyphVector::getNumGlyphs, var_12_159:GlyphVector))) {
                    var_22_3DB = invokevirtual:int(GlyphVector::getGlyphCharIndex, var_12_159:GlyphVector, var_20_198:int)
                    
                    if (cmpge:boolean(var_22_3DB:int, p4:int)) {
                        if (cmpgt:boolean(var_22_3DB:int, p5:int)) {
                            looporswitchbreak()
                        }
                        
                        var_23_3F1 = invokevirtual:int(String::codePointAt, p2:String, var_22_3DB:int)
                        var_24_3FD = invokespecial:Rectangle(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u4179\u9937\u5245\u4e72\u71ae\u8d90, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, var_12_159:GlyphVector, var_20_198:int, var_23_3F1:int)
                        var_25_412 = invokespecial:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub102\u7af6\u0a06\ub18d\u6fb0\u120d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, invokevirtual:int(GlyphVector::getGlyphCode, var_12_159:GlyphVector, var_20_198:int), var_23_3F1:int, var_24_3FD:Rectangle, var_12_159:GlyphVector, var_20_198:int)
                        
                        if (cmpne:boolean(var_18_18C:int, ldc:int(0))) {
                            if (cmpne:boolean(var_23_3F1:int, ldc:int(10))) {
                                var_16_17D = neg:int(getfield:int(Rectangle::x, var_24_3FD:Rectangle))
                                var_18_18C = and:int(ldc:int(3041), ldc:int(-3042))
                            }
                        }
                        
                        var_26_41E = invokevirtual:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u59ec\ufcaf\ua6bd\u6435\u0a06\uff55, var_25_412:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1)
                        
                        if (cmpeq:boolean(var_26_41E:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c, aconstnull:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c())) {
                            if (cmpne:boolean(getfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u47c2\u120d\u4ab3\u873d\u71f1\u6cfe, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), aconstnull:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1())) {
                                if (invokevirtual:boolean(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u759a\uceb8\u718f\u12cb\u4ab3\ub6ab, var_25_412:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1)) {
                                    var_26_41E = invokevirtual:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u59ec\ufcaf\ua6bd\u6435\u0a06\uff55, getfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u47c2\u120d\u4ab3\u873d\u71f1\u6cfe, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
                                }
                            }
                        }
                        
                        if (cmpne:boolean(var_26_41E:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c, aconstnull:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c())) {
                            var_27_4D2 = invokevirtual:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\u8d90\u8413\ub19c\ua068\u7e3f\ub83f, var_26_41E:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c)
                            
                            if (cmpne:boolean(var_19_18F:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe, aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe())) {
                                if (cmpne:boolean(var_19_18F:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe, var_27_4D2:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe)) {
                                    invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\uc31c\u624e\u516c\ub8be\ub113\ud158, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f))
                                    var_19_18F = aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe()
                                }
                            }
                            
                            if (cmpeq:boolean(var_19_18F:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe, aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe())) {
                                invokeinterface:void(\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe::\uc9f6\u3776\uc246\u4f52\ua3b4\u624e, var_27_4D2:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe)
                                invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\u51fa\uf94d\u494c\u385b\u9af2\uc29a, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f), ldc:int(7))
                                var_19_18F = var_27_4D2:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe
                            }
                            
                            invokevirtual:void(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\ubf56\u7049\u3d64\u946b\u8350\u7049, var_26_41E:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c, i2f:float(add:int(getfield:int(Rectangle::x, var_24_3FD:Rectangle), var_16_17D:int)), i2f:float(add:int(getfield:int(Rectangle::y, var_24_3FD:Rectangle), var_17_183:int)), i2f:float(invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc238\uc29a\uf995\u5245\ucef1\u836c, var_26_41E:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c)), i2f:float(invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc31c\u3d64\uff55\u36d3\u3bd6\u12b2, var_26_41E:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c)))
                        }
                        
                        if (cmpge:boolean(var_20_198:int, ldc:int(0))) {
                            var_16_17D = add:int(var_16_17D:int, add:int(add:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc238\u965f\u8640\u4bc8\u51b2\u1833, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8cae\u16f6\uae87\u3bd6\u7043\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub32d\u8389\u392e\u4ab3\uceb8\uc4d2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)))
                        }
                        
                        var_13_162 = invokestatic:int(Math::max, var_13_162:int, add:int(add:int(getfield:int(Rectangle::x, var_24_3FD:Rectangle), var_16_17D:int), getfield:int(Rectangle::width, var_24_3FD:Rectangle)))
                        var_14_16B = invokestatic:int(Math::max, var_14_16B:int, add:int(add:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u99f7\uc2e8\u7c6b\ufe34\u92ee\u965f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getfield:int(Rectangle::y, var_24_3FD:Rectangle)), getfield:int(Rectangle::height, var_24_3FD:Rectangle)))
                        
                        if (cmpeq:boolean(var_23_3F1:int, ldc:int(10))) {
                            var_18_18C = xor:int(ldc:int(80), ldc:int(81))
                            var_17_183 = add:int(var_17_183:int, invokevirtual:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u1833\u98a4\ud158\u8413\u3e2a\uc4d2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
                            inc:int(var_15_174, ldc:int(1))
                            var_14_16B = and:int(ldc:int(-4407), ldc:int(4390))
                        }
                    }
                    
                    inc:int(var_20_198, ldc:int(1))
                }
                
                if (cmpne:boolean(var_19_18F:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe, aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe())) {
                    invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\uc31c\u624e\u516c\ub8be\ub113\ud158, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f))
                }
                
                if (cmpne:boolean(var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d())) {
                    invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\u92ee\u3bc9\u99f7\u3c25\u965f\u3d4b, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)))) {
                        putfield:boolean(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\u8d98\u52d3\uceb8\ud7e8\u5654\u6c52, var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, and:int[expected:boolean](ldc:int(65), ldc:int(15273)))
                    }
                }
                
                invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\u7bad\u76bc\u69d9\u97b7\u71ae\ub19c, getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f), neg:float(p0:float), neg:float(p1:float), ldc:float(0.0f))
                
                if (cmpeq:boolean(var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d())) {
                    var_10_5C7 = initobject:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::<init>)
                }
                
                putfield:short(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\ufe34\uc87f\u8aa5\ube23\ubff1\ua61f, var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, i2s:short(var_13_162:int))
                putfield:short(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\u416d\u12cb\u5245\ud51e\u385b\u760c, var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, i2s:short(add:int(mul:int(var_15_174:int, invokevirtual:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u1833\u98a4\ud158\u8413\u3e2a\uc4d2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)), var_14_16B:int)))
                return:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(var_10_5C7:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d)
            }
        }
    }
    
    public void \u9a18\u5140\u3bd6\ube23\u5d20\ubf56(float p0, float p1, java.lang.String p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330 p3, int p4, int p5) {
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
            invokevirtual:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub171\u99f7\u836c\uc4d2\u3dd3\u494c, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:float, p1:float, p2:String, p3:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330, p4:int, p5:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\u5140\u3bd6\ube23\u5d20\ubf56(float p0, float p1, java.lang.String p2) {
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
            invokevirtual:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u9a18\u5140\u3bd6\ube23\u5d20\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:float, p1:float, p2:String, getstatic:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\ud12e\u7e3f\u5fe1\u4ab3\ud51e\ud12e))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\u5140\u3bd6\ube23\u5d20\ubf56(float p0, float p1, java.lang.String p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330 p3) {
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
            invokevirtual:void(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u9a18\u5140\u3bd6\ube23\u5d20\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:float, p1:float, p2:String, p3:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330, and:int(ldc:int(-30303), ldc:int(17502)), invokevirtual:int(String::length, p2:String))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1 \ub102\u7af6\u0a06\ub18d\u6fb0\u120d(int p0, int p1, java.awt.Rectangle p2, java.awt.font.GlyphVector p3, int p4) {
        var_8_9C : int
        var_9_A7 : int
        var_11_B3 : \u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[]
        expr_BB : \u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][] [generated]
        expr_BE : int [generated]
        expr_C7 : \u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[] [generated]
        var_10_E1 : \u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1
        expr_E8 : \u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[] [generated]
        expr_EA : int [generated]
        expr_EC : \u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1 [generated]
        var_10_FC : \u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1
        
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
        
        if (logicaland:boolean(cmpge:boolean(p0:int, ldc:int(0)), cmplt:boolean(p0:int, ldc:int(1114111)))) {
            var_8_9C = div:int(p0:int, and:int(ldc:int(12865), ldc:int(524)))
            var_9_A7 = and:int(p0:int, and:int(ldc:int(1535), ldc:int(8703)))
            var_11_B3 = loadelement:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[](getfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u927d\u64ab\u36d3\u8cae\u6d99\ua6bd, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), var_8_9C:int)
            
            if (cmpeq:boolean(var_11_B3:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[], aconstnull:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[]())) {
                expr_BB = getfield:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u927d\u64ab\u36d3\u8cae\u6d99\ua6bd, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)
                expr_BE = var_8_9C:int
                expr_C7 = newarray:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1.class, xor:int(ldc:int(5040), ldc:int(4528)))
                storeelement:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[](expr_BB:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[][], expr_BE:int, expr_C7:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[])
                var_11_B3 = expr_C7:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[]
            }
            else {
                var_10_E1 = loadelement:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(var_11_B3:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[], var_9_A7:int)
                
                if (cmpne:boolean(var_10_E1:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1, aconstnull:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1())) {
                    return:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(var_10_E1:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1)
                }
            }
            
            expr_E8 = var_11_B3:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[]
            expr_EA = var_9_A7:int
            expr_EC = initobject:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::<init>, p1:int, p2:Rectangle, p3:GlyphVector, p4:int, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)
            storeelement:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(expr_E8:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[], expr_EA:int, expr_EC:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1)
            var_10_FC = expr_EC:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1
            invokeinterface:boolean(List<\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1>::add, getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6435\u7049\u839e\uc910\u527a\ubf56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), var_10_FC:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1)
            return:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(var_10_FC:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1)
        }
        
        return:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(initobject:\u6fb0\u8709\u759a\ubefe\u3776\u156b[expected:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1](\u6fb0\u8709\u759a\ubefe\u3776\u156b::<init>, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p1:int, p2:Rectangle, p3:GlyphVector, p4:int, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
    }
    
    private java.awt.Rectangle \u4179\u9937\u5245\u4e72\u71ae\u8d90(java.awt.font.GlyphVector p0, int p1, int p2) {
        var_6_6F : Rectangle
        
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
            var_6_6F = invokevirtual:Rectangle(GlyphVector::getGlyphPixelBounds, p0:GlyphVector, p1:int, getstatic:FontRenderContext(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\ufcaf\uc238\u5fe1\u7e3f\u3711\u6c52), ldc:float(0.0f), ldc:float(0.0f))
            
            if (cmpeq:boolean(p2:int, ldc:int(32))) {
                putfield:int(Rectangle::width, var_6_6F:Rectangle, getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u16f6\ua61f\ub70c\uc2bd\u5db4\ub83f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
            }
            
            return:Rectangle(var_6_6F:Rectangle)
        }
        
        goto(Label_0006)
    }
    
    public int \uae87\u6d69\u0b8e\u92ff\u6d99\ubded() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u16f6\ua61f\ub70c\uc2bd\u5db4\ub83f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public int \u446c\u8bb0\u3776\u446c\u385b\u8308(java.lang.String p0) {
        var_2_61 : int
        var_4_158 : \u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d
        var_2_1B3 : int
        var_4_D4 : char[]
        var_5_F3 : GlyphVector
        var_6_FC : int
        var_7_105 : int
        var_8_10E : int
        var_9_117 : int
        var_12_193 : int
        var_13_19F : Rectangle
        var_2_1C6 : int
        
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
        var_2_61 = and:int(ldc:int(-676028644), ldc:int(-2082828661))
        
        if (cmpeq:boolean(p0:String, aconstnull:String())) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), and:int(ldc:int(10253), ldc:int(16453)))))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0178)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1227355031))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1543696609))
                
                if (cmpeq:boolean(invokevirtual:int(String::length, p0:String), ldc:int(0))) {
                    return:int(and:int(ldc:int(-12519), ldc:int(4326)))
                }
            }
            
            Label_0140:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2048)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1785395338))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1477707109))
                
                if (getfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)) {
                    var_4_158 = checkcast:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d.class, invokevirtual:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(LinkedHashMap<K, \u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d>::get, getfield:LinkedHashMap(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), p0:String[expected:Object]))
                    
                    if (cmpne:boolean(var_4_158:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d())) {
                        return:int(getfield:short(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\ufe34\uc87f\u8aa5\ube23\ubff1\ua61f, var_4_158:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d))
                    }
                }
            }
            
            Label_0178:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0140)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                var_2_1B3 = and:int(var_2_61:int, ldc:int(-1351660597))
                var_4_D4 = invokevirtual:char[](String::toCharArray, p0:String)
                var_5_F3 = invokevirtual:GlyphVector(Font::layoutGlyphVector, getfield:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc87f\u4cd9\ucfaf\ub171\u3bc9\u6b0d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getstatic:FontRenderContext(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\ufcaf\uc238\u5fe1\u7e3f\u3711\u6c52), var_4_D4:char[], and:int(ldc:int(-20014), ldc:int(20004)), arraylength:int(var_4_D4:char[]), and:int(ldc:int(-2523), ldc:int(2266)))
                var_6_FC = and:int(ldc:int(5228), ldc:int(-5229))
                var_7_105 = and:int(ldc:int(-2793), ldc:int(2664))
                var_8_10E = and:int(ldc:int(-9005), ldc:int(8972))
                var_9_117 = and:int(ldc:int(-1394), ldc:int(1393))
                
                while (cmplt:boolean(var_9_117:int, invokevirtual:int(GlyphVector::getNumGlyphs, var_5_F3:GlyphVector))) {
                    var_12_193 = invokevirtual:int(String::codePointAt, p0:String, invokevirtual:int(GlyphVector::getGlyphCharIndex, var_5_F3:GlyphVector, var_9_117:int))
                    var_13_19F = invokespecial:Rectangle(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u4179\u9937\u5245\u4e72\u71ae\u8d90, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, var_5_F3:GlyphVector, var_9_117:int, var_12_193:int)
                    
                    if (cmpne:boolean(var_8_10E:int, ldc:int(0))) {
                        if (cmpne:boolean(var_12_193:int, ldc:int(10))) {
                            var_7_105 = neg:int(getfield:int(Rectangle::x, var_13_19F:Rectangle))
                        }
                    }
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_1B3:int, ldc:int(33554432)), ldc:int(0))) {
                            var_2_1B3 = and:int(var_2_1B3:int, ldc:int(-270180661))
                            
                            if (cmpgt:boolean(var_9_117:int, ldc:int(0))) {
                                var_7_105 = add:int(var_7_105:int, add:int(add:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8cae\u16f6\uae87\u3bd6\u7043\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc238\u965f\u8640\u4bc8\u51b2\u1833, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub32d\u8389\u392e\u4ab3\uceb8\uc4d2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)))
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1B3:int, ldc:int(134217728)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_2_1C6 = and:int(var_2_1B3:int, ldc:int(-2089199060))
                    var_6_FC = invokestatic:int(Math::max, var_6_FC:int, add:int(add:int(getfield:int(Rectangle::x, var_13_19F:Rectangle), var_7_105:int), getfield:int(Rectangle::width, var_13_19F:Rectangle)))
                    
                    if (cmpeq:boolean(var_12_193:int, ldc:int(10))) {
                        var_8_10E = xor:int(ldc:int(9216), ldc:int(9217))
                    }
                    
                    var_2_1B3 = and:int(var_2_1C6:int, ldc:int(-2028691585))
                    inc:int(var_9_117, ldc:int(1))
                }
                
                return:int(var_6_FC:int)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-660134391))
        }
    }
    
    public int \ud523\u64f2\u52d3\u97b7\ub113\u7873(java.lang.String p0) {
        var_2_8F : int
        var_4_14F : \u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d
        var_2_1A0 : int
        var_4_D4 : char[]
        var_5_F3 : GlyphVector
        var_6_FC : int
        var_7_105 : int
        var_8_10E : int
        var_11_192 : int
        var_12_1AB : Rectangle
        
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
        var_2_8F = and:int(ldc:int(-132005729), ldc:int(-1156765675))
        
        if (cmpeq:boolean(p0:String, aconstnull:String())) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), and:int(ldc:int(28693), ldc:int(2055)))))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_8F:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0168)
            }
            
            if (cmpeq:boolean(and:int(var_2_8F:int, ldc:int(2048)), ldc:int(0))) {
                var_2_8F = and:int(var_2_8F:int, ldc:int(-149487577))
                
                if (cmpeq:boolean(invokevirtual:int(String::length, p0:String), ldc:int(0))) {
                    return:int(and:int(ldc:int(-1952), ldc:int(1934)))
                }
            }
            
            Label_0130:
            
            if (cmpeq:boolean(and:int(var_2_8F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_8F = and:int(var_2_8F:int, ldc:int(-1280219722))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_8F:int, ldc:int(1)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_8F = and:int(var_2_8F:int, ldc:int(-36235169))
                
                if (getfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)) {
                    var_4_14F = checkcast:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d.class, invokevirtual:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(LinkedHashMap<K, \u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d>::get, getfield:LinkedHashMap(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), p0:String[expected:Object]))
                    
                    if (cmpne:boolean(var_4_14F:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d())) {
                        return:int(getfield:short(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\u416d\u12cb\u5245\ud51e\u385b\u760c, var_4_14F:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d))
                    }
                }
            }
            
            Label_0168:
            
            if (cmpeq:boolean(and:int(var_2_8F:int, ldc:int(65536)), ldc:int(0))) {
                var_2_8F = and:int(var_2_8F:int, ldc:int(2038215657))
                goto(Label_0130)
            }
            
            if (cmpeq:boolean(and:int(var_2_8F:int, ldc:int(2048)), ldc:int(0))) {
                var_2_1A0 = and:int(var_2_8F:int, ldc:int(-27951411))
                var_4_D4 = invokevirtual:char[](String::toCharArray, p0:String)
                var_5_F3 = invokevirtual:GlyphVector(Font::layoutGlyphVector, getfield:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc87f\u4cd9\ucfaf\ub171\u3bc9\u6b0d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getstatic:FontRenderContext(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\ufcaf\uc238\u5fe1\u7e3f\u3711\u6c52), var_4_D4:char[], and:int(ldc:int(-6982), ldc:int(6977)), arraylength:int(var_4_D4:char[]), and:int(ldc:int(-24986), ldc:int(24857)))
                var_6_FC = and:int(ldc:int(5185), ldc:int(-5186))
                var_7_105 = and:int(ldc:int(21541), ldc:int(-29870))
                var_8_10E = and:int(ldc:int(-2851), ldc:int(2850))
                
                while (cmplt:boolean(var_8_10E:int, invokevirtual:int(GlyphVector::getNumGlyphs, var_5_F3:GlyphVector))) {
                    var_11_192 = invokevirtual:int(String::codePointAt, p0:String, invokevirtual:int(GlyphVector::getGlyphCharIndex, var_5_F3:GlyphVector, var_8_10E:int))
                    
                    if (cmpne:boolean(var_11_192:int, ldc:int(32))) {
                        var_2_1A0 = and:int(var_2_1A0:int, ldc:int(-240676745))
                        var_12_1AB = invokespecial:Rectangle(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u4179\u9937\u5245\u4e72\u71ae\u8d90, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, var_5_F3:GlyphVector, var_8_10E:int, var_11_192:int)
                        var_7_105 = invokestatic:int(Math::max, var_7_105:int, add:int(add:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u99f7\uc2e8\u7c6b\ufe34\u92ee\u965f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getfield:int(Rectangle::y, var_12_1AB:Rectangle)), getfield:int(Rectangle::height, var_12_1AB:Rectangle)))
                        
                        if (cmpeq:boolean(var_11_192:int, ldc:int(10))) {
                            inc:int(var_6_FC, ldc:int(1))
                            var_7_105 = and:int(ldc:int(-29558), ldc:int(29281))
                        }
                    }
                    
                    var_2_1A0 = and:int(var_2_1A0:int, ldc:int(-231242243))
                    inc:int(var_8_10E, ldc:int(1))
                }
                
                return:int(add:int(mul:int(var_6_FC:int, invokevirtual:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u1833\u98a4\ud158\u8413\u3e2a\uc4d2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)), var_7_105:int))
            }
            
            var_2_8F = and:int(var_2_8F:int, ldc:int(-1300140602))
        }
    }
    
    public int \uc229\u4f52\u12cb\u6b0d\u52d3\u40a9(java.lang.String p0) {
        var_4_6D : \u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d
        var_5_7C : int
        var_6_88 : char[]
        var_8_B9 : int
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_4_6D = aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d()
            
            if (getfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)) {
                var_4_6D = checkcast:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d.class, invokevirtual:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(LinkedHashMap<K, \u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d>::get, getfield:LinkedHashMap(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u67e9\uc2bd\ufcaf\ucfaf\ubefe\u93a2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), p0:String[expected:Object]))
                
                if (cmpne:boolean(var_4_6D:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d())) {
                    if (cmpne:boolean(getfield:Short(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\u8d90\u47c2\ud12e\uc4d2\ucfaf\u6d69, var_4_6D:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d), aconstnull:Short())) {
                        return:int(invokevirtual:int(Short::intValue, getfield:Short(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\u8d90\u47c2\ud12e\uc4d2\ucfaf\u6d69, var_4_6D:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d)))
                    }
                }
            }
            
            var_5_7C = invokevirtual:int(String::indexOf, p0:String, ldc:int(10))
            
            if (cmpne:boolean(var_5_7C:int, ldc:int(-1))) {
                p0 = invokevirtual:String(String::substring, p0:String, and:int(ldc:int(-17823), ldc:int(1422)), var_5_7C:int)
            }
            
            var_6_88 = invokevirtual:char[](String::toCharArray, p0:String)
            var_8_B9 = add:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u99f7\uc2e8\u7c6b\ufe34\u92ee\u965f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getfield:int(Rectangle::y, invokevirtual:Rectangle(GlyphVector::getPixelBounds, invokevirtual:GlyphVector(Font::layoutGlyphVector, getfield:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc87f\u4cd9\ucfaf\ub171\u3bc9\u6b0d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getstatic:FontRenderContext(\u72f1\ua068\ub6ab\ub171\u3a62\u6ec6::\ufcaf\uc238\u5fe1\u7e3f\u3711\u6c52), var_6_88:char[], and:int(ldc:int(-18389), ldc:int(17860)), arraylength:int(var_6_88:char[]), and:int(ldc:int(-21331), ldc:int(17234))), aconstnull:FontRenderContext(), ldc:float(0.0f), ldc:float(0.0f))))
            
            if (cmpne:boolean(var_4_6D:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, aconstnull:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d())) {
                putfield:Short(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::\u8d90\u47c2\ud12e\uc4d2\ucfaf\u6d69, var_4_6D:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d, initobject:Short(Short::<init>, i2s:short(var_8_B9:int)))
            }
            
            return:int(var_8_B9:int)
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), and:int(ldc:int(2285), ldc:int(28949)))))
    }
    
    public java.awt.Font \u71ae\u3dd3\u71f1\u62da\u8c8a\u62da() {
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
            return:Font(getfield:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc87f\u4cd9\ucfaf\ub171\u3bc9\u6b0d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public int \uc246\u7d52\u8d98\u156b\u8350\u47c2() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u0c95\u6c56\ua61f\u4d85\u071d\u61a4, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public void \u6c56\uae5d\u5fe1\ub102\u4daf\ub6ab(int p0) {
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
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u0c95\u6c56\ua61f\u4d85\u071d\u61a4, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u6fb0\ub171\u8d90\u4179\u51b2\u3e2a() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8cae\u16f6\uae87\u3bd6\u7043\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public void \u839e\ubb2b\u927d\u88c5\u600f\u3bc9(int p0) {
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
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8cae\u16f6\uae87\u3bd6\u7043\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u494c\u97e6\ub113\u6c56\ud36e\u67e9() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ufe34\u8753\ufe34\uc29a\u1833\u7ce1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public void \uc87f\ua3b4\u97b7\u56bd\ua6bd\u6cfe(int p0) {
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
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ufe34\u8753\ufe34\uc29a\u1833\u7ce1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u3bc9\u7e3f\u8df4\u1833\u7006\u67e9() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc238\u965f\u8640\u4bc8\u51b2\u1833, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public void \u6c52\u51fa\u8389\u0b8e\u5fe1\ubded(int p0) {
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
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc238\u965f\u8640\u4bc8\u51b2\u1833, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u600f\u5d20\u3e2a\ua068\u3d4b\u8640() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub32d\u8389\u392e\u4ab3\uceb8\uc4d2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public void \u1833\u9a18\u7049\ud171\u3c25\u4179(int p0) {
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
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub32d\u8389\u392e\u4ab3\uceb8\uc4d2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u7bad\u385b\u51fa\u183a\u624e\u759a() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ua6bd\u71f1\ubf56\u759a\u76bc\u97e6, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public void \ub113\u9937\u34df\u34df\u6c52\u183a(int p0) {
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
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ua6bd\u71f1\ubf56\u759a\u76bc\u97e6, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u1833\u98a4\ud158\u8413\u3e2a\uc4d2() {
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
            return:int(add:int(add:int(add:int(add:int(add:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u71f1\u4ab3\ubded\u3e75\u392e\u7d52, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u99f7\uc2e8\u7c6b\ufe34\u92ee\u965f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u5140\u7006\u4ab3\u8640\ubff1\ub83f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u0c95\u6c56\ua61f\u4d85\u071d\u61a4, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ufe34\u8753\ufe34\uc29a\u1833\u7ce1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)), getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ua6bd\u71f1\ubf56\u759a\u76bc\u97e6, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)))
        }
        
        goto(Label_0006)
    }
    
    public int \u4e72\u5140\u0800\u7873\ub18d\u071d() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u99f7\uc2e8\u7c6b\ufe34\u92ee\u965f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public int \u8753\ufcaf\u494c\u0c95\u7e3f\u64ab() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u71f1\u4ab3\ubded\u3e75\u392e\u7d52, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public int \u5db4\u97b7\u8350\u7330\u6d99\uc238() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u5140\u7006\u4ab3\u8640\ubff1\ub83f, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public int \ubefe\u4f4a\u120d\u36d3\uc31c\u5140() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud51e\u8d90\u5d20\ubded\u52d3\uf995, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public void \uc910\u34df\u9937\ub171\uc2bd\uf995(int p0) {
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
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud51e\u8d90\u5d20\ubded\u52d3\uf995, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u5db4\u40a9\u3d4b\uf995\ubded\u5bc4() {
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
            return:int(getfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public void \u97e6\u1833\u8d90\uc4d2\u8753\u416d(int p0) {
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
            putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List \u8d90\u7d52\u7ce1\u1187\u7bad\u6c52() {
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
            return:List(getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u51b2\u6fb0\u9255\u71ae\uc4d2\u6c56, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List \u8bb0\ua562\u071d\u3d64\uc246\u4c2b() {
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
            return:List(getfield:List(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub83f\u3776\u9937\u7bad\uc910\uc87f() {
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
            return:boolean(getfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public void \u4d85\u12cb\u99f7\ub6ab\u8709\u9a18(boolean p0) {
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
            putfield:boolean(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u8753\u3e2a\u16f6\u3e75\ufcaf\u5bc4() {
        var_1_F6 : int
        stack_125_0 : Class<?> [generated]
        stack_125_1 : String [generated]
        expr_117 : Class[] [generated]
        stack_140_0 : Method [generated]
        stack_140_1 : Object [generated]
        expr_130 : Object[] [generated]
        var_3_143 : Object
        var_4_175 : Field
        
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
        var_1_F6 = and:int(ldc:int(-1551905118), ldc:int(-562604417))
        
        loop {
            Label_0098:
            
            if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_F6 = and:int(var_1_F6:int, ldc:int(2137142545))
                goto(Label_0565)
            }
            
            if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_F6 = and:int(var_1_F6:int, ldc:int(1534695184))
                    goto(Label_0153)
                }
                
                var_1_F6 = and:int(var_1_F6:int, ldc:int(-1879672962))
                
                if (cmpeq:boolean(getfield:String(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8bb0\u7043\u8d98\uc2bd\ub19c\u6fb0, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), aconstnull:String())) {
                    goto(Label_0153)
                }
                
                goto(Label_0565)
            }
            
            loop {
                Block_9:
                
                try {
                    Label_0200:
                    
                    if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(512)), ldc:int(0))) {
                        var_1_F6 = and:int(var_1_F6:int, ldc:int(1214219570))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_F6 = and:int(var_1_F6:int, ldc:int(1645018565))
                        loopcontinue(Label_0098)
                    }
                    
                    var_1_F6 = and:int(var_1_F6:int, ldc:int(-1611235717))
                    stack_125_0 = invokestatic:Class<?>(Class<T>::forName, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), and:int(ldc:int(10606), ldc:int(648))))
                    stack_125_1 = loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), and:int(ldc:int(16649), ldc:int(8201)))
                    expr_117 = newarray:Class[](java.lang.Class.class, and:int(ldc:int(6181), ldc:int(1875)))
                    storeelement:Class(expr_117:Class[], and:int(ldc:int(6900), ldc:int(-23285)), ldc:Class<Font>(java.awt.Font.class))
                    stack_140_0 = invokevirtual:Method(Class::getDeclaredMethod, stack_125_0:Class, stack_125_1:String, expr_117:Class[])
                    stack_140_1 = aconstnull:Object()
                    expr_130 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4225), ldc:int(19469)))
                    storeelement:Object(expr_130:Object[], and:int(ldc:int(-17266), ldc:int(17264)), getfield:Font[expected:Object](\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc87f\u4cd9\ucfaf\ub171\u3bc9\u6b0d, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
                    var_3_143 = invokevirtual:Object(Method::invoke, stack_140_0:Method, stack_140_1:Object, expr_130:Object[])
                    Label_0324:
                    
                    if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0528)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_F6 = and:int(var_1_F6:int, ldc:int(-1628213333))
                        var_4_175 = invokevirtual:Field(Class<T>::getDeclaredField, invokestatic:Class<?>(Class<T>::forName, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), xor:int(ldc:int(45), ldc:int(39)))), loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), and:int(ldc:int(26699), ldc:int(4123))))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(2097152)), ldc:int(0))) {
                                var_1_F6 = and:int(var_1_F6:int, ldc:int(-721570579))
                                goto(Label_0451)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_F6 = and:int(var_1_F6:int, ldc:int(-1821153685))
                                invokevirtual:void(AccessibleObject::setAccessible, var_4_175:Field[expected:AccessibleObject], xor:int[expected:boolean](ldc:int(36), ldc:int(37)))
                            }
                            
                            Label_0417:
                            
                            if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(1048576)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(4194304)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_F6 = and:int(var_1_F6:int, ldc:int(-948701401))
                                putfield:String(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8bb0\u7043\u8d98\uc2bd\ub19c\u6fb0, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, checkcast:String(java.lang.String.class, invokevirtual:Object(Field::get, var_4_175:Field, var_3_143:Object)))
                            }
                            
                            Label_0451:
                            
                            if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_0417)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(1024)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_F6 = and:int(var_1_F6:int, ldc:int(-1716666885))
                        }
                        
                        var_1_F6 = and:int(var_1_F6:int, ldc:int(-1955340677))
                    }
                }
                catch (java.lang.Throwable stack_1E9_0) {
                }
                
                Label_0490:
                
                if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_F6 = and:int(var_1_F6:int, ldc:int(1142867128))
                        goto(Label_0324)
                    }
                    
                    var_1_F6 = and:int(var_1_F6:int, ldc:int(-755081246))
                    
                    if (cmpne:boolean(getfield:String(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8bb0\u7043\u8d98\uc2bd\ub19c\u6fb0, this:\ubded\u516c\u839e\u1833\u8df4\ub32d), aconstnull:String())) {
                        goto(Label_0565)
                    }
                }
                
                Label_0528:
                
                if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0490)
                }
                
                if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                goto(Label_0324)
            }
            
            var_1_F6 = and:int(var_1_F6:int, ldc:int(-1955076186))
            putfield:String(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8bb0\u7043\u8d98\uc2bd\ub19c\u6fb0, this:\ubded\u516c\u839e\u1833\u8df4\ub32d, loadelement:String(getstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52), xor:int(ldc:int(8214), ldc:int(8218))))
            goto(Label_0565)
            Label_0153:
            
            if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(131072)), ldc:int(0))) {
                var_1_F6 = and:int(var_1_F6:int, ldc:int(605610359))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_F6 = and:int(var_1_F6:int, ldc:int(-979480653))
                    goto(Label_0200)
                }
                
                if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_F6 = and:int(var_1_F6:int, ldc:int(-696887622))
                    goto(Block_9)
                }
                
                loopcontinue()
            }
            
            Label_0565:
            
            if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0200)
            }
            
            if (cmpeq:boolean(and:int(var_1_F6:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0153)
            }
            
            if (cmpne:boolean(and:int(var_1_F6:int, ldc:int(16384)), ldc:int(0))) {
                looporswitchbreak()
            }
        }
        
        if (cmpeq:boolean(invokevirtual:int(String::length, getfield:String(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8bb0\u7043\u8d98\uc2bd\ub19c\u6fb0, this:\ubded\u516c\u839e\u1833\u8df4\ub32d)), ldc:int(0))) {
            return:String(aconstnull:String())
        }
        
        return:String(getfield:String(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8bb0\u7043\u8d98\uc2bd\ub19c\u6fb0, this:\ubded\u516c\u839e\u1833\u8df4\ub32d))
    }
    
    public static int \u4c2b\u8d90\uc4d2\ucef1\u600f\u3776(\u59ec\u8413\u97e6\uc229\u3776.\ubded\u516c\u839e\u1833\u8df4\ub32d p0, int p1) {
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
            return:int(putfield:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u416d\u965f\u6d69\u4f4a\uc84e\u6c56, p0:\ubded\u516c\u839e\u1833\u8df4\ub32d, p1:int))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_29F_0 : byte[] [generated]
        stack_301_0 : byte[] [generated]
        stack_372_0 : byte[] [generated]
        var_4_280 : int
        var_3_285 : byte[]
        var_5_286 : int
        expr_2A5 : byte [generated]
        var_0_2F7 : int
        expr_301 : byte [generated]
        stack_340_2 : byte [generated]
        stack_31E_0 : byte [generated]
        expr_96 : int [generated]
        var_2_B3 : byte[]
        expr_B7 : int [generated]
        var_3_360 : byte[]
        var_5_361 : int
        var_3_E8 : String
        stack_25F_0 : String[] [generated]
        expr_FA : String[] [generated]
        
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
        var_0_61 = and:int(ldc:int(933726747), ldc:int(1975227737))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_B3_0 = stack_B5_0 = stack_DC_0 = stack_29F_0 = stack_301_0 = stack_372_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("tiR11dzZNM5YU/HaXU8w9vZHWrq9X05a9Vzb0bL29kdNJ6vV3VNZXdrOUN1TWVfR3CUjyddP0bFe29nKTtzTRNvdUDz2VlbVrnHY3P060s41VvBa1VpX3NnYL1Hd9dtdz7ZU1Pzb19rW3NHdr9RPcFBWW1rcXO620lW9zlt5VVzTs090V1jXvdXSdtfW+bXVVjDy3Ndbo9jQU8zCWc+7JMTdWdInUdZvU1bbr/HAWE+60VDX3CXbzs7X1XPaVtuv8cBP2zEhW1rQS13SVaPV2dP80t1TutXSdtfW+bXVVjDy7CKpiZY=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_280 = expr_6E:int
        var_3_285 = newarray:byte[](byte.class, expr_6E:int)
        var_5_286 = expr_6E:int
        Label_0648:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-269784961))
            var_5_286 = add:int(var_5_286:int, ldc:int(-1))
            expr_2A5 = add:byte(xor:byte(loadelement:byte(stack_29F_0:byte[], var_5_286:int), ldc:byte(30)), ldc:byte(62))
            storeelement:byte(var_3_285:byte[], var_5_286:int, or:int(and:int(shl:int(expr_2A5:byte, xor:int(ldc:int(1032), ldc:int(1036))), ldc:int(-16)), and:int(shr:int(expr_2A5:byte[expected:int], xor:int(ldc:int(16785), ldc:int(16789))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_286:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B3_0 = stack_B5_0 = stack_DC_0 = stack_29F_0 = stack_301_0 = stack_372_0 = var_3_285:byte[]
            goto(Label_0115)
        }
        
        Label_0746:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(1)), ldc:int(0))) {
            var_0_2F7 = and:int(var_0_61:int, ldc:int(2112864319))
            var_5_286 = add:int(var_5_286:int, ldc:int(-1))
            expr_301 = stack_340_2 = loadelement(stack_301_0, var_5_286)
            
            if (cmplt:boolean(add:int(add:int(var_5_286:int, ldc:int(4)), neg:int(var_4_280:int)), ldc:int(0))) {
                stack_340_2 = stack_31E_0 = add:byte(expr_301:byte, loadelement:byte(var_3_285:byte[], add:int(var_5_286:int, ldc:int(4))))
                goto(Label_0814)
            }
            
            Label_0782:
            
            if (cmpeq:boolean(and:int(var_0_2F7:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_2F7 = and:int(var_0_2F7:int, ldc:int(-441511909))
                stack_340_2 = stack_31E_0 = add:byte(expr_301:byte, ldc:byte(4))
            }
            
            Label_0814:
            
            if (cmpeq:boolean(and:int(var_0_2F7:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0782)
            }
            
            var_0_61 = and:int(var_0_2F7:int, ldc:int(-1242039395))
            storeelement:byte(var_3_285:byte[], var_5_286:int, stack_340_2:byte)
            
            if (cmpne:boolean(var_5_286:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B3_0 = stack_B5_0 = stack_DC_0 = stack_29F_0 = stack_301_0 = stack_372_0 = var_3_285:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0648)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0188)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(131072)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1546295314))
        }
        else {
            var_0_61 = and:int(var_0_61:int, ldc:int(1073153467))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_280 = expr_96:int
                var_3_285 = newarray:byte[](byte.class, expr_96:int)
                var_5_286 = expr_96:int
                goto(Label_0746)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(2013259903))
            var_2_B3 = stack_B3_0:byte[]
            expr_B7 = add:int(arraylength:int(stack_B5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B7:int, ldc:int(0))) {
                var_3_360 = newarray:byte[](byte.class, expr_B7:int)
                var_5_361 = expr_B7:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1740056793))
                    var_5_361 = add:int(var_5_361:int, ldc:int(-1))
                    storeelement:byte(var_3_360:byte[], var_5_361:int, add:int(shl:int(loadelement:byte(stack_372_0:byte[], var_5_361:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_B3:byte[], add:int(var_5_361:int, and:int(ldc:int(5393), ldc:int(8289)))), ldc:int(3)), xor:int(ldc:int(98), ldc:int(125)))))
                    
                    if (cmpne:boolean(var_5_361:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B3_0 = stack_B5_0 = stack_DC_0 = stack_29F_0 = stack_301_0 = stack_372_0 = var_3_360:byte[]
            }
        }
        
        Label_0188:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16384)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1902665216))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_E8 = initobject:String(String::<init>, stack_DC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_25F_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4485), ldc:int(4488)))
            expr_FA = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(100), ldc:int(105)))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(2722), ldc:int(2734)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(-7691), ldc:int(3594)), and:int(ldc:int(-13144), ldc:int(13141))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(3142), ldc:int(788)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(21509), ldc:int(-21550)), xor:int(ldc:int(1026), ldc:int(1027))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(2243), ldc:int(16413)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(129), ldc:int(257)), xor:int(ldc:int(16647), ldc:int(16658))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(-3967), ldc:int(1334)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(1053), ldc:int(2645)), and:int(ldc:int(2275), ldc:int(823))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(16917), ldc:int(16919)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(22055), ldc:int(99)), and:int(ldc:int(1343), ldc:int(18602))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(2051), ldc:int(16451)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(676), ldc:int(654)), and:int(ldc:int(125), ldc:int(15668))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(269), ldc:int(267)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(10359), ldc:int(10307)), xor:int(ldc:int(906), ldc:int(776))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(1), ldc:int(6)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(3091), ldc:int(3217)), xor:int(ldc:int(1032), ldc:int(1183))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(4098), ldc:int(4107)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(8343), ldc:int(16855)), xor:int(ldc:int(8279), ldc:int(8439))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(11), ldc:int(31663)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(944), ldc:int(2210)), and:int(ldc:int(25004), ldc:int(680))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(24696), ldc:int(1292)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(6216), ldc:int(6368)), and:int(ldc:int(2494), ldc:int(21692))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(26446), ldc:int(11)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(5123), ldc:int(5311)), and:int(ldc:int(723), ldc:int(12501))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(16539), ldc:int(16542)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(-28620), ldc:int(-28443)), xor:int(ldc:int(48), ldc:int(213))))
            putstatic:String[](\ubded\u516c\u839e\u1833\u8df4\ub32d::\u64f2\ucef1\ubff1\u3e2a\u9033\u6c52, expr_FA:String[])
            putstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc4d2\ua6bd\u52d3\u516c\u718f\u600f, invokestatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u8640\u6bb9\u9033\u76bc\u8413\u839e))
            putstatic:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u8350\u960f\uae87\u6c56\u0b8e\u9255, initobject:\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d(\u0c95\u71ae\u97e6\ua3b4\u12cb\uf94d::<init>))
            putstatic:Comparator(\ubded\u516c\u839e\u1833\u8df4\ub32d::\ub19c\u56bd\u47c2\u3d4b\ua562\u92ff, initobject:\u183a\u52d3\ubded\ua61f\ucfaf\u3a62[expected:Comparator](\u183a\u52d3\ubded\ua61f\ucfaf\u3a62::<init>))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u16f6\uc2bd\ub1b9\u0c95\u3c25\u8bb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65E : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_669 : int
        
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
        var_3_65E = and:int(ldc:int(-1036856651), ldc:int(-281747785))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubded\u516c\u839e\u1833\u8df4\ub32d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(4)), ldc:int(0))) {
            var_3_65E = and:int(var_3_65E:int, ldc:int(-359563603))
            var_5_80 = and:int(ldc:int(-5837), ldc:int(4812))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29036), ldc:int(-29565)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_65E:int, ldc:int(-756801))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(17425), ldc:int(8397)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(4161), ldc:int(25867)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_65E = and:int(var_3_D0:int, ldc:int(-226797657))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(49), ldc:int(19521)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-167785767))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1460369918))
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-554070765))
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0679)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(601537333))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1530124261))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0564)
                            }
                            
                            goto(Label_0844)
                        }
                    }
                    
                    Label_0398:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1520416258))
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(72002817))
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1386939095))
                        goto(Label_0679)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-608983170))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-336136521))
                            var_11_E1 = and:int(ldc:int(21349), ldc:int(-21366))
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0564:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1922328537))
                        goto(Label_1381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-446032828))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-586714265))
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-877628737))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0844)
                        }
                    }
                    
                    Label_0679:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(350914341))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-2073863837))
                        goto(Label_1381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-391695975))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(119325980))
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-865872915))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(395210598))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-1001343510))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1245878967))
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1662817261))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0844:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1402677868))
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(157386772))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1727264529))
                            goto(Label_0679)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-108956928))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1177515247))
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1660762023))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = xor:int(ldc:int(8256), ldc:int(8257))
                                goto(Label_1127)
                            }
                        }
                    }
                    
                    Label_0978:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-2133573572))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-1459068324))
                            goto(Label_0844)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1122983942))
                            goto(Label_0679)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-877268251))
                        var_11_E1 = and:int(ldc:int(25216), ldc:int(-25217))
                    }
                    
                    Label_1127:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1886770097))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0978)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-1404587772))
                            goto(Label_0844)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0679)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(652364064))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(457081154))
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-287664139))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1381)
                            }
                        }
                    }
                    
                    Label_1248:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(2009533151))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(46320104))
                            goto(Label_1127)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0978)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0844)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0679)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-1213560978))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(341144925))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1714492069))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1381:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1971076826))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1540610921))
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-2011659723))
                        goto(Label_0679)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65E = and:int(var_3_65E:int, ldc:int(1863539453))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_669 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(121328232))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(239564851))
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1285060086))
                        goto(Label_0679)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-864976349))
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-480552209))
                        var_17_669 = add:int(var_16_10F:int, and:int(ldc:int(801), ldc:int(5209)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65E = and:int(var_3_65E:int, ldc:int(-285428811))
                
                if (cmple:boolean(var_5_80 = var_17_669:int, sub:int(var_6_87:int, and:int(ldc:int(8407), ldc:int(6665))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
