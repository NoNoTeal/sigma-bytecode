public abstract class \u3d64\u7af6\uae87\uc238\u7d52.\u7d52\ubded\u760c\u760c\ub7dc\ud7e8 {
    public static \u3d64\u7af6\uae87\uc238\u7d52.\u7d52\ubded\u760c\u760c\ub7dc\ud7e8 \u4c2b\u34df\u6c52\u647c\u9937\ubff1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u71f1\u1187\ub102\u3d4b\u3d64 p0) {
        var_1_5F : int
        var_3_64 : int
        var_4_6C : int
        var_5_75 : int
        var_6_89 : int
        var_7_BE : \u7d52\ubded\u760c\u760c\ub7dc\ud7e8
        var_8_EA : long
        stack_13D_0 : Logger [generated]
        stack_13D_1 : Level [generated]
        stack_13D_2 : String [generated]
        expr_11C : Long[] [generated]
        expr_F8 : \u7d52\ubded\u760c\u760c\ub7dc\ud7e8 [generated]
        
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
            var_1_5F = and:int(ldc:int(-1715028994), ldc:int(-67715150))
            var_3_64 = invokevirtual:int(\u7043\u71f1\u1187\ub102\u3d4b\u3d64::\uc2e8\uf9c5\uc2bd\uc29a\ubded\ua562, p0:\u7043\u71f1\u1187\ub102\u3d4b\u3d64)
            var_4_6C = and:int(ldc:int(49), ldc:int(18817))
            var_5_75 = and:int(ldc:int(22225), ldc:int(-30674))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-503383242))
                var_6_89 = invokevirtual:int(\u7043\u71f1\u1187\ub102\u3d4b\u3d64::\uc2e8\uf9c5\uc2bd\uc29a\ubded\ua562, p0:\u7043\u71f1\u1187\ub102\u3d4b\u3d64)
                var_5_75 = or:int(shl:int(var_5_75:int, ldc:int(7)), and:int(var_6_89:int, ldc:int(127)))
                inc:int(var_4_6C, ldc:int(1))
                
                if (cmpeq:boolean(and:int(var_6_89:int, xor:int(ldc:int(8275), ldc:int(8403))), xor:int(ldc:int(43), ldc:int(171)))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
            
            var_7_BE = invokestatic:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u47c2\u1833\uae5d\uc3e3\u40a9\u3bc9, var_3_64:int)
            putfield:int(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u9af2\u7d52\ube23\ub83f\u6b5f\u718f, var_7_BE:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8, var_3_64:int)
            putfield:int(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u8753\u494c\u0a06\u3c25\ubf56\u5654, var_7_BE:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8, var_5_75:int)
            putfield:long(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\uf94d\u8753\ube23\ub7dc\u8709\uff55, var_7_BE:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8, invokevirtual:long(\u7043\u71f1\u1187\ub102\u3d4b\u3d64::\uc4d2\u4f52\ub1b9\u8413\u62da\uff55, p0:\u7043\u71f1\u1187\ub102\u3d4b\u3d64))
            invokevirtual:void(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u6ec6\u3711\ud7e8\ubefe\uc9f6\ub19c, var_7_BE:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8, p0:\u7043\u71f1\u1187\ub102\u3d4b\u3d64)
            var_8_EA = sub:long(i2l:long(var_5_75:int), sub:long(invokevirtual:long(\u7043\u71f1\u1187\ub102\u3d4b\u3d64::\uc4d2\u4f52\ub1b9\u8413\u62da\uff55, p0:\u7043\u71f1\u1187\ub102\u3d4b\u3d64), getfield:long(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\uf94d\u8753\ube23\ub7dc\u8709\uff55, var_7_BE:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8)))
            
            if (cmpgt:boolean(var_8_EA:long, ldc:long(0L))) {
                stack_13D_0 = invokestatic:Logger(Logger::getLogger, ldc:String("MP4 Boxes"))
                stack_13D_1 = getstatic:Level(Level::INFO)
                stack_13D_2 = ldc:String("Descriptor: bytes left: {0}, offset: {1}")
                expr_11C = newarray:Long[](java.lang.Long.class, xor:int(ldc:int(7424), ldc:int(7426)))
                storeelement:Long(expr_11C:Long[], and:int(ldc:int(-5177), ldc:int(5176)), invokestatic:Long(Long::valueOf, var_8_EA:long))
                storeelement:Long(expr_11C:Long[], xor:int(ldc:int(8458), ldc:int(8459)), invokestatic:Long(Long::valueOf, invokevirtual:long(\u7043\u71f1\u1187\ub102\u3d4b\u3d64::\uc4d2\u4f52\ub1b9\u8413\u62da\uff55, p0:\u7043\u71f1\u1187\ub102\u3d4b\u3d64)))
                invokevirtual:void(Logger::log, stack_13D_0:Logger, stack_13D_1:Level, stack_13D_2:String, expr_11C:Long[][expected:Object[]])
                invokevirtual:void(\u7043\u71f1\u1187\ub102\u3d4b\u3d64::\u8d98\u71f1\uc229\u6cfe\uff55\u59ec, p0:\u7043\u71f1\u1187\ub102\u3d4b\u3d64, var_8_EA:long)
            }
            
            expr_F8 = var_7_BE:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8
            putfield:int(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u8753\u494c\u0a06\u3c25\ubf56\u5654, expr_F8:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8, add:int(getfield:int(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u8753\u494c\u0a06\u3c25\ubf56\u5654, expr_F8:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8), var_4_6C:int))
            return:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8(var_7_BE:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8)
        }
        
        goto(Label_0006)
    }
    
    private static \u3d64\u7af6\uae87\uc238\u7d52.\u7d52\ubded\u760c\u760c\ub7dc\ud7e8 \u47c2\u1833\uae5d\uc3e3\u40a9\u3bc9(int p0) {
        var_3_BF : \u7d52\ubded\u760c\u760c\ub7dc\ud7e8
        
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
            
            switch (p0:int) {
                case 1:
                    var_3_BF = initobject:\u3504\u4cd9\ucef1\u927d\ube23\u8aa5[expected:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8](\u3504\u4cd9\ucef1\u927d\ube23\u8aa5::<init>)
                    looporswitchbreak()
                
                case 2:
                case 16:
                    var_3_BF = initobject:\u071d\ud12e\u8d98\u8308\u5d20\u7e3f[expected:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8](\u071d\ud12e\u8d98\u8308\u5d20\u7e3f::<init>)
                    looporswitchbreak()
                
                case 3:
                    var_3_BF = initobject:\u6b0d\u59ec\u156b\uc7fe\u59ec\u6b0d[expected:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8](\u6b0d\u59ec\u156b\uc7fe\u59ec\u6b0d::<init>)
                    looporswitchbreak()
                
                case 4:
                    var_3_BF = initobject:\u71ae\u873d\u9033\u5db4\u416d\ub70c[expected:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8](\u71ae\u873d\u9033\u5db4\u416d\ub70c::<init>)
                    looporswitchbreak()
                
                case 5:
                    var_3_BF = initobject:\u8350\u4cd9\u6c52\u3e75\u873d\u527a[expected:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8](\u8350\u4cd9\u6c52\u3e75\u873d\u527a::<init>)
                    looporswitchbreak()
                
                default:
                    invokevirtual:void(Logger::log, invokestatic:Logger(Logger::getLogger, ldc:String("MP4 Boxes")), getstatic:Level(Level::INFO), ldc:String("Unknown descriptor type: {0}"), invokestatic:Integer[expected:Object](Integer::valueOf, p0:int))
                    var_3_BF = initobject:\u416d\u6d69\uf9c5\u600f\u3d4b\u8753[expected:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8](\u416d\u6d69\uf9c5\u600f\u3d4b\u8753::<init>)
                    looporswitchbreak()
            }
            
            return:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8(var_3_BF:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8)
        }
        
        goto(Label_0006)
    }
    
    public void \u7d52\ubded\u760c\u760c\ub7dc\ud7e8() {
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
            invokespecial:Object(Object::<init>, this:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8)
            putfield:List<\u7d52\ubded\u760c\u760c\ub7dc\ud7e8>(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u8350\u946b\u8bb0\ub32d\u5fe1\ubb2b, this:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8, initobject:ArrayList<\u7d52\ubded\u760c\u760c\ub7dc\ud7e8>[expected:List<\u7d52\ubded\u760c\u760c\ub7dc\ud7e8>](ArrayList<E>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract void \u6ec6\u3711\ud7e8\ubefe\uc9f6\ub19c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u71f1\u1187\ub102\u3d4b\u3d64 p0);
    
    public void \u927d\uf9c5\ub7dc\u12b2\ud7e8\u0c95(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u71f1\u1187\ub102\u3d4b\u3d64 p0) {
        var_2_5F : int
        
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
            var_2_5F = and:int(ldc:int(-1100730444), ldc:int(2137325116))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-17883329))
                
                if (cmple:boolean(sub:long(i2l:long(getfield:int(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u8753\u494c\u0a06\u3c25\ubf56\u5654, this:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8)), sub:long(invokevirtual:long(\u7043\u71f1\u1187\ub102\u3d4b\u3d64::\uc4d2\u4f52\ub1b9\u8413\u62da\uff55, p0:\u7043\u71f1\u1187\ub102\u3d4b\u3d64), getfield:long(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\uf94d\u8753\ube23\ub7dc\u8709\uff55, this:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8))), ldc:long(0L))) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<\u7d52\ubded\u760c\u760c\ub7dc\ud7e8>::add, getfield:List<\u7d52\ubded\u760c\u760c\ub7dc\ud7e8>(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u8350\u946b\u8bb0\ub32d\u5fe1\ubb2b, this:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8), invokestatic:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u4c2b\u34df\u6c52\u647c\u9937\ubff1, p0:\u7043\u71f1\u1187\ub102\u3d4b\u3d64))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u3d64\u7af6\uae87\uc238\u7d52.\u7d52\ubded\u760c\u760c\ub7dc\ud7e8> \u7006\ubf56\u9af2\uf9c5\ua6bd\u64f2() {
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
            return:List<\u7d52\ubded\u760c\u760c\ub7dc\ud7e8>(invokestatic:List<\u7d52\ubded\u760c\u760c\ub7dc\ud7e8>(Collections::unmodifiableList, getfield:List<\u7d52\ubded\u760c\u760c\ub7dc\ud7e8>(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u8350\u946b\u8bb0\ub32d\u5fe1\ubb2b, this:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8)))
        }
        
        goto(Label_0006)
    }
    
    public int \u946b\u98a4\u7af6\u4c04\u4d85\ucb79() {
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
            return:int(getfield:int(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u9af2\u7d52\ube23\ub83f\u6b5f\u718f, this:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    public int \u8258\u6d69\u6d69\u873d\u4ab3\uceb8() {
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
            return:int(getfield:int(\u7d52\ubded\u760c\u760c\ub7dc\ud7e8::\u8753\u494c\u0a06\u3c25\ubf56\u5654, this:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    public void \ua3b4\u3bc9\u76bc\ub171\u5bc4\u0c95(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63F : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_64A : int
        
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
        var_3_63F = and:int(ldc:int(-1912556037), ldc:int(-1372358667))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7d52\ubded\u760c\u760c\ub7dc\ud7e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
            var_3_63F = and:int(var_3_63F:int, ldc:int(-718685810))
        }
        else {
            var_3_63F = and:int(var_3_63F:int, ldc:int(1620653939))
            var_5_85 = and:int(ldc:int(2145), ldc:int(-2146))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1520), ldc:int(-2033)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63F:int, ldc:int(616275707))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(10240), ldc:int(10241)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(3309), ldc:int(13073)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63F = and:int(var_3_D2:int, ldc:int(694443133))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(2817), ldc:int(2816)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1195447395))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1227115373))
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(323293948))
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(971738471))
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1978430587))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0558)
                            }
                            
                            goto(Label_0797)
                        }
                    }
                    
                    Label_0390:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(748782395))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1342875631))
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1953896795))
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1317177938))
                        goto(Label_0797)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(149438427))
                        goto(Label_0687)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(790658675))
                            var_11_E3 = and:int(ldc:int(-30191), ldc:int(24814))
                            goto(Label_1468)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0558:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(996541147))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1955176527))
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(442552186))
                        goto(Label_0797)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-2049425261))
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1388626725))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-129541005))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0797)
                        }
                    }
                    
                    Label_0687:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1150762300))
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1888231488))
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(188424181))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0797:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-522472905))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-405259499))
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1673187211))
                        goto(Label_1102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(63503638))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-219542312))
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1891685745))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(1129), ldc:int(4613))
                                goto(Label_1102)
                            }
                        }
                    }
                    
                    Label_0927:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-2090467653))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1634571403))
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0797)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1142619457))
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(838545768))
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-453497178))
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1033858253))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-811985667))
                        var_11_E3 = and:int(ldc:int(-4804), ldc:int(4803))
                    }
                    
                    Label_1102:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1611788086))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1204431232))
                            goto(Label_0927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0797)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(2096083253))
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1100379285))
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-199140227))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1338)
                            }
                        }
                    }
                    
                    Label_1223:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(2115190558))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1102)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0797)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1789779004))
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-246235277))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1468)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1338:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(690949327))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(277012083))
                        goto(Label_1102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-240891630))
                        goto(Label_0687)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(960459554))
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63F = and:int(var_3_63F:int, ldc:int(1692695667))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1468:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64A = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1479:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-899434471))
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-684238533))
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-468619433))
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-747728589))
                        goto(Label_0687)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-585386427))
                        goto(Label_0390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-241690765))
                        var_17_64A = add:int(var_16_111:int, xor:int(ldc:int(25664), ldc:int(25665)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63F = and:int(var_3_63F:int, ldc:int(-332529679))
                
                if (cmple:boolean(var_5_85 = var_17_64A:int, sub:int(var_6_8C:int, and:int(ldc:int(321), ldc:int(20641))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
