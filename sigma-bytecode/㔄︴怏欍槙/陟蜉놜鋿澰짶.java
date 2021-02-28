public class \u3504\ufe34\u600f\u6b0d\u69d9.\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6 {
    public void \u965f\u8709\ub19c\u92ff\u6fb0\uc9f6() {
        var_4_7D : Iterator<\u3e2a\u8413\ud12e\u4f4a\ud7e8>
        
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
            invokespecial:Object(Object::<init>, this:\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6)
            putfield:List<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>(\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6::\u8c8a\u7006\u3504\u718f\u3e75\u4daf, this:\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6, invokestatic:ArrayList[expected:List<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>](Lists::newArrayList))
            var_4_7D = invokeinterface:Iterator<\u3e2a\u8413\ud12e\u4f4a\ud7e8>(Collection<\u3e2a\u8413\ud12e\u4f4a\ud7e8>::iterator, invokevirtual:Collection<\u3e2a\u8413\ud12e\u4f4a\ud7e8>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u5f50\ua068\ub83f\u4cd9\u8d98\u67d0, invokevirtual:\u7c6b\ud36e\u8d90\u0800\ua6bd(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u8df4\ub113\u9937\u4cd9\u4c04\u6d69, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_7D:Iterator<\u3e2a\u8413\ud12e\u4f4a\ud7e8>)) {
                invokeinterface:boolean(List<\u9937\u99f7\u8308\u92ff\ub113\u9937>::add, getfield:List<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>(\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6::\u8c8a\u7006\u3504\u718f\u3e75\u4daf, this:\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6), initobject:\u9937\u99f7\u8308\u92ff\ub113\u9937(\u9937\u99f7\u8308\u92ff\ub113\u9937::<init>, this:\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6, checkcast:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8.class, invokeinterface:\u3e2a\u8413\ud12e\u4f4a\ud7e8(Iterator<\u3e2a\u8413\ud12e\u4f4a\ud7e8>::next, var_4_7D:Iterator<\u3e2a\u8413\ud12e\u4f4a\ud7e8>))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u392e\ud7e8\u3bc9\u88c5\ud51e.\u4975\u92ee\ua562\u7ce1\u9a18\u71ae> \ub113\u4179\u7bad\u71ae\u8350\u9a18() {
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
            return:List<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>(getfield:List<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>(\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6::\u8c8a\u7006\u3504\u718f\u3e75\u4daf, this:\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \ub7dc\u98a4\u8709\u183a\u8413\u0a06() {
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
            return:ITextComponent(getstatic:ITextComponent(\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6::\u4c04\uc2e8\u0b8e\u416d\ubff1\u71f1))
        }
        
        goto(Label_0006)
    }
    
    public void \ub7dc\uc9f6\u6d69\ucfaf\u3d4b\u8d90(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6c52\u0800\u183a\ud7e8\ufcaf\u0800 p0) {
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
            invokevirtual:void(\u6c52\u0800\u183a\ud7e8\ufcaf\u0800::\u8350\u8df4\uf94d\u9937\u7006\u759a, p0:\u6c52\u0800\u183a\ud7e8\ufcaf\u0800, this:\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6[expected:\u647c\u4c04\u385b\ubefe\u74b1\ud217])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \ube23\ubb2b\u9937\u4c2b\u52d3\u516c() {
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
            return:ITextComponent(getstatic:ITextComponent(\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6::\u3c25\u4f4a\u0a06\u5245\uc229\u7af6))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\u759a\u416d\u1187\u6435\uc910(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, float p1, int p2) {
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
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uff55\ucb79\u34df\u8d90\ud523\u6d99::\u416d\u946b\ua61f\u3e2a\u0800\uc4d2))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, and:int(ldc:int(-5505), ldc:int(5504)), and:int(ldc:int(-19926), ldc:int(19861)), ldc:float(16.0f), ldc:float(0.0f), ldc:int(16), ldc:int(16), xor:int(ldc:int(4300), ldc:int(4556)), xor:int(ldc:int(394), ldc:int(138)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4492\u4f4a\u0b8e\u0b8e\u3dd3\u4179() {
        var_1_5F : int
        var_3_69 : Iterator<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>
        
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
        var_1_5F = and:int(ldc:int(-1862602323), ldc:int(-84499689))
        var_3_69 = invokeinterface:Iterator<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>(List<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>::iterator, getfield:List<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>(\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6::\u8c8a\u7006\u3504\u718f\u3e75\u4daf, this:\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6))
        
        loop {
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1259163739))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_69:Iterator<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>)) {
                    if (logicalnot:boolean(invokeinterface:boolean(\u4975\u92ee\ua562\u7ce1\u9a18\u71ae::\u4492\u4f4a\u0b8e\u0b8e\u3dd3\u4179, checkcast:\u4975\u92ee\ua562\u7ce1\u9a18\u71ae(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u4975\u92ee\ua562\u7ce1\u9a18\u71ae.class, invokeinterface:\u4975\u92ee\ua562\u7ce1\u9a18\u71ae(Iterator<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>::next, var_3_69:Iterator<\u4975\u92ee\ua562\u7ce1\u9a18\u71ae>))))) {
                        var_1_5F = and:int(var_1_5F:int, ldc:int(-889196737))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(10931), ldc:int(5121)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(2048)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-18743), ldc:int(2354)))
            }
        }
    }
    
    static {
        var_0_260 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1CD_0 : byte[] [generated]
        stack_207_0 : byte[] [generated]
        stack_272_0 : byte[] [generated]
        stack_2DE_0 : byte[] [generated]
        var_4_1A9 : int
        var_3_1AE : byte[]
        var_5_1AF : int
        expr_275 : byte [generated]
        var_0_2D4 : int
        expr_2DE : byte [generated]
        stack_30C_2 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_1F6 : byte[]
        var_5_1F7 : int
        expr_C3 : int [generated]
        expr_EE : int [generated]
        var_3_12A : String
        expr_132 : String[] [generated]
        expr_13C : String[] [generated]
        var_3_17C : String[]
        
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
        var_0_260 = and:int(ldc:int(1501567849), ldc:int(2034974690))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1CD_0 = stack_207_0 = stack_272_0 = stack_2DE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("xhEuF2UuJhHIJPsxN2ClQiwqFA8yIhodS0gNZhEuF2UuJhHIJPsxN2ClQiwqFA8yJ5ooEzk7QJ8LAfX/B+0=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1A9 = expr_6B:int
        var_3_1AE = newarray:byte[](byte.class, expr_6B:int)
        var_5_1AF = expr_6B:int
        Label_0433:
        
        while (cmpne:boolean(and:int(var_0_260:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_260:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0590)
            }
            
            var_0_260 = and:int(var_0_260:int, ldc:int(1592515530))
            var_5_1AF = add:int(var_5_1AF:int, ldc:int(-1))
            storeelement:byte(var_3_1AE:byte[], var_5_1AF:int, add:byte(loadelement:byte(stack_1CD_0:byte[], var_5_1AF:int), ldc:byte(83)))
            
            if (cmpne:boolean(var_5_1AF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1CD_0 = stack_207_0 = stack_272_0 = stack_2DE_0 = var_3_1AE:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0698)
        Label_0590:
        
        while (cmpeq:boolean(and:int(var_0_260:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_260:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_260 = and:int(var_0_260:int, ldc:int(161911303))
                goto(Label_0433)
            }
            
            var_0_260 = and:int(var_0_260:int, ldc:int(2142175092))
            var_5_1AF = add:int(var_5_1AF:int, ldc:int(-1))
            expr_275 = xor:byte(loadelement:byte(stack_272_0:byte[], var_5_1AF:int), ldc:byte(52))
            storeelement:byte(var_3_1AE:byte[], var_5_1AF:int, or:int(and:int(shl:int(expr_275:byte, xor:int(ldc:int(2054), ldc:int(2050))), ldc:int(-16)), and:int(shr:int(expr_275:byte[expected:int], xor:int(ldc:int(2437), ldc:int(2433))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1AF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1CD_0 = stack_207_0 = stack_272_0 = stack_2DE_0 = var_3_1AE:byte[]
            goto(Label_0200)
        }
        
        Label_0698:
        
        while (cmpne:boolean(and:int(var_0_260:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_260:int, ldc:int(128)), ldc:int(0))) {
                var_0_260 = and:int(var_0_260:int, ldc:int(118488894))
                goto(Label_0433)
            }
            
            var_0_2D4 = and:int(var_0_260:int, ldc:int(-590323773))
            var_5_1AF = add:int(var_5_1AF:int, ldc:int(-1))
            expr_2DE = loadelement:byte(stack_2DE_0:byte[], var_5_1AF:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1AF:int, ldc:int(6)), neg:int(var_4_1A9:int)), ldc:int(0))) {
                var_0_2D4 = and:int(var_0_2D4:int, ldc:int(-12534787))
                stack_30C_2 = add:byte(expr_2DE:byte, ldc:byte(6))
            }
            else {
                stack_30C_2 = add:byte(expr_2DE:byte, loadelement:byte(var_3_1AE:byte[], add:int(var_5_1AF:int, ldc:int(6))))
            }
            
            var_0_260 = and:int(var_0_2D4:int, ldc:int(1541046083))
            storeelement:byte(var_3_1AE:byte[], var_5_1AF:int, stack_30C_2:byte)
            
            if (cmpne:boolean(var_5_1AF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1CD_0 = stack_207_0 = stack_272_0 = stack_2DE_0 = var_3_1AE:byte[]
            goto(Label_0243)
        }
        
        goto(Label_0590)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_260:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_260:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_260:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_260 = and:int(var_0_260:int, ldc:int(-668886051))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_1F6 = newarray:byte[](byte.class, expr_90:int)
                var_5_1F7 = expr_90:int
                
                loop {
                    var_0_260 = and:int(var_0_260:int, ldc:int(2138766144))
                    var_5_1F7 = add:int(var_5_1F7:int, ldc:int(-1))
                    storeelement:byte(var_3_1F6:byte[], var_5_1F7:int, add:int(shl:int(loadelement:byte(stack_207_0:byte[], var_5_1F7:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_1F7:int, xor:int(ldc:int(48), ldc:int(49)))), ldc:int(5)), xor:int(ldc:int(20995), ldc:int(20996)))))
                    
                    if (cmpne:boolean(var_5_1F7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1CD_0 = stack_207_0 = stack_272_0 = stack_2DE_0 = var_3_1F6:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpne:boolean(and:int(var_0_260:int, ldc:int(32768)), ldc:int(0))) {
            var_0_260 = and:int(var_0_260:int, ldc:int(-1673965676))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_260:int, ldc:int(2048)), ldc:int(0))) {
            var_0_260 = and:int(var_0_260:int, ldc:int(-1298310351))
        }
        else {
            if (cmpne:boolean(and:int(var_0_260:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_260 = and:int(var_0_260:int, ldc:int(2041577305))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_1A9 = expr_C3:int
                var_3_1AE = newarray:byte[](byte.class, expr_C3:int)
                var_5_1AF = expr_C3:int
                goto(Label_0590)
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_260:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_260:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_260 = and:int(var_0_260:int, ldc:int(1456802730))
                goto(Label_0149)
            }
            
            if (cmpeq:boolean(and:int(var_0_260:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_260 = and:int(var_0_260:int, ldc:int(-72614022))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_4_1A9 = expr_EE:int
                var_3_1AE = newarray:byte[](byte.class, expr_EE:int)
                var_5_1AF = expr_EE:int
                goto(Label_0698)
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_260:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_260:int, ldc:int(8192)), ldc:int(0))) {
            var_0_260 = and:int(var_0_260:int, ldc:int(94982038))
            goto(Label_0149)
        }
        
        if (cmpeq:boolean(and:int(var_0_260:int, ldc:int(4096)), ldc:int(0))) {
            var_0_260 = and:int(var_0_260:int, ldc:int(1462022369))
            goto(Label_0112)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_132 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8962), ldc:int(4118)))
        expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(13851), ldc:int(16386)))
        storeelement:String(expr_132:String[], and:int(ldc:int(-191), ldc:int(190)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-28459), ldc:int(27912)), xor:int(ldc:int(191), ldc:int(164))))
        storeelement:String(expr_132:String[], and:int(ldc:int(25), ldc:int(1285)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(768), ldc:int(795)), xor:int(ldc:int(2076), ldc:int(2081))))
        putstatic:String[](\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6::\u6b0d\u72f1\u927d\u0b8e\u8d90\ubded, expr_13C:String[])
        var_3_17C = expr_132:String[]
        putstatic:ITextComponent(\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6::\u3c25\u4f4a\u0a06\u5245\uc229\u7af6, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_17C:String[], and:int(ldc:int(5622), ldc:int(-6144)))))
        putstatic:ITextComponent(\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6::\u4c04\uc2e8\u0b8e\u416d\ubff1\u71f1, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_17C:String[], xor:int(ldc:int(33), ldc:int(32)))))
    }
    
    public void \u8350\u600f\ufcaf\uc2e8\u527a\u3bd6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_644 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BB : double
        var_3_CD : int
        var_11_DE : int
        var_14_108 : double
        var_16_10C : int
        var_12_104 : double
        var_17_64F : int
        
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
        var_3_644 = and:int(ldc:int(-62818517), ldc:int(-247400613))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4)), ldc:int(0))) {
            var_3_644 = and:int(var_3_644:int, ldc:int(-137145173))
            var_5_7D = and:int(ldc:int(-21643), ldc:int(17546))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4085), ldc:int(1876)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CD = and:int(var_3_644:int, ldc:int(-220988406))
                    var_9_BB = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DE = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DE:int, sub:int(var_6_84:int, xor:int(ldc:int(-14848), ldc:int(-14847)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DE:int, and:int(ldc:int(16643), ldc:int(4193)))), var_7_93:double))) {
                        inc:int(var_11_DE, ldc:int(1))
                    }
                    
                    var_3_644 = and:int(var_3_CD:int, ldc:int(-1212490709))
                    var_14_108 = var_7_93:double
                    var_16_10C = var_11_DE:int
                }
                else {
                    var_11_DE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(4513), ldc:int(523)))
                    var_12_104 = var_14_108 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10C = var_11_DE:int, var_6_84:int)) {
                        var_9_BB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DE:int)
                        var_16_10C = var_11_DE:int
                        var_14_108 = var_12_104:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(4)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1269659643))
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0662)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1368501228))
                        goto(Label_0531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-182716934))
                        
                        if (cmplt:boolean(var_16_10C:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0531)
                            }
                            
                            goto(Label_0809)
                        }
                    }
                    
                    Label_0377:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-2012391830))
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(496762942))
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0662)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-714291810))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1139679333))
                        var_11_DE = and:int(ldc:int(5057), ldc:int(-5058))
                        goto(Label_1473)
                    }
                    
                    Label_0531:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-983812880))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(139455456))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-2070966963))
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-784173573))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-1850810954))
                            goto(Label_0377)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1118216834))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_108 = var_9_BB:double
                            goto(Label_0809)
                        }
                    }
                    
                    Label_0662:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(435611712))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(146638016))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-695733404))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(481318607))
                            goto(Label_0531)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-1662986902))
                            goto(Label_0377)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-148065225))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1204521141))
                        var_14_108 = mul:double(ldc:double(0.5), add:double(var_9_BB:double, var_14_108:double))
                    }
                    
                    Label_0809:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1586307308))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-1753364068))
                            goto(Label_0662)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-875252415))
                            goto(Label_0531)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(324019666))
                            goto(Label_0377)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1190365873))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DE = xor:int(ldc:int(20612), ldc:int(20613))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0933:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1868832973))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0809)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1825945915))
                            goto(Label_0662)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-195298821))
                            goto(Label_0531)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-991064545))
                            goto(Label_0377)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1348131468))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1227031490))
                        var_11_DE = and:int(ldc:int(-29100), ldc:int(29089))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1930009799))
                            goto(Label_0933)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(459084514))
                            goto(Label_0809)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0662)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0531)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0377)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-165841650))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                                goto(Label_1339)
                            }
                        }
                    }
                    
                    Label_1205:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1916916435))
                            goto(Label_0933)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-674987575))
                            goto(Label_0809)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0662)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(519062210))
                            goto(Label_0531)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0377)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-1737653492))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-27110065))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_108:double, var_5_7D:int, var_16_10C:int)
                        goto(Label_1473)
                    }
                    
                    Label_1339:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1565121729))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1985340946))
                        goto(Label_0662)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1980134186))
                        goto(Label_0531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(896886834))
                        loopcontinue()
                    }
                    
                    var_3_644 = and:int(var_3_644:int, ldc:int(-1108320982))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_108:double, ldc:double(0.0))
                    Label_1473:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64F = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1484:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-410638896))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(2099236843))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(14562377))
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0662)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(2111595140))
                        goto(Label_0531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(4)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1318551231))
                        goto(Label_0377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-12821158))
                        var_17_64F = add:int(var_16_10C:int, xor:int(ldc:int(2092), ldc:int(2093)))
                        looporswitchbreak()
                    }
                }
                
                var_3_644 = and:int(var_3_644:int, ldc:int(-75180817))
                
                if (cmple:boolean(var_5_7D = var_17_64F:int, sub:int(var_6_84:int, xor:int(ldc:int(-31216), ldc:int(-31215))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
