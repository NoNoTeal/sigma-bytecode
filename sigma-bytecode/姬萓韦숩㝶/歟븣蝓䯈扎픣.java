public class \u59ec\u8413\u97e6\uc229\u3776.\u6b5f\ube23\u8753\u4bc8\u624e\ud523 {
    public void \u6b5f\ube23\u8753\u4bc8\u624e\ud523(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u72f1\u8389\ucb79\ub6ab\u8d98 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u527a\u873d\u071d\u4f52\uc229\ud217 p2) {
        var_6_AF : \u839e\ud36e\ufe34\uc31c\u392e\u64ab
        
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
            invokespecial:Object(Object::<init>, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523)
            putfield:int(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\ubcb0\u624e\ufcaf\uc2bd\u8bb0\u5db4, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523, invokeinterface:int(Collection<E>::size, invokevirtual:Collection<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>(\u527a\u873d\u071d\u4f52\uc229\ud217::\u97b7\u64ab\ucfaf\u8df4\ud4fe\u4c2b, p2:\u527a\u873d\u071d\u4f52\uc229\ud217)))
            putfield:boolean(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\u72f1\u97e6\u392e\ub113\u6fb0\ub113, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523, ternaryop:int[expected:boolean](invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\u59ec\ua61f\u36d3\u4e72\u7006\u927d, invokevirtual:\u527a\u494c\u88c5\u965f\u759a(\u527a\u873d\u071d\u4f52\uc229\ud217::\ua562\u9255\u36d3\u8389\uc246\ub113, p2:\u527a\u873d\u071d\u4f52\uc229\ud217)), and:int(ldc:int(13587), ldc:int(-13588)), xor:int(ldc:int(9504), ldc:int(9505))))
            putfield:String(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\uc7fe\u61a4\ub102\ud36e\u99f7\uff55, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523, invokevirtual:String(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u6c52\u8df4\u6b0d\u8cae\u624e\u16f6, invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd])))
            var_6_AF = invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\u527a\u873d\u071d\u4f52\uc229\ud217::\u72f1\u9af2\u71ae\u1187\u2dcc\u8308, p2:\u527a\u873d\u071d\u4f52\uc229\ud217, invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p1:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            
            if (cmpeq:boolean(var_6_AF:\u839e\ud36e\ufe34\uc31c\u392e\u64ab, aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab())) {
                putfield:String(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\uc84e\u8413\u4ab3\u99f7\u3dd3\u3776, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523, loadelement:String(getstatic:String[](\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\u516c\u5654\u946b\u3d64\u494c\ufe34), and:int(ldc:int(-28389), ldc:int(28356))))
            }
            else {
                putfield:String(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\uc84e\u8413\u4ab3\u99f7\u3dd3\u3776, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523, invokevirtual:String(\uf94d\u51b2\u1833\u34df\u1187::\uf94d\u183a\u446c\u71f1\u5654\u9033, invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\uafe7\ud51e\ufcaf\u0c95\u6435\u71ae, var_6_AF:\u839e\ud36e\ufe34\uc31c\u392e\u64ab)))
            }
            
            putfield:UUID(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\u9af2\ub32d\u1187\ua562\ua61f\ud4fe, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523, invokevirtual:UUID(\u527a\u873d\u071d\u4f52\uc229\ud217::\u76bc\u12cb\u88c5\uc9f6\ucb79\ud171, p2:\u527a\u873d\u071d\u4f52\uc229\ud217))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int getPlayerCount() {
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
            return:int(getfield:int(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\ubcb0\u624e\ufcaf\uc2bd\u8bb0\u5db4, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523))
        }
        
        goto(Label_0006)
    }
    
    public boolean isRemoteServer() {
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
            return:boolean(getfield:boolean(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\u72f1\u97e6\u392e\ub113\u6fb0\ub113, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String getDifficulty() {
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
            return:String(getfield:String(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\uc7fe\u61a4\ub102\ud36e\u99f7\uff55, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String getGameMode() {
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
            return:String(getfield:String(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\uc84e\u8413\u4ab3\u99f7\u3dd3\u3776, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523))
        }
        
        goto(Label_0006)
    }
    
    public java.util.UUID getSessionId() {
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
            return:UUID(getfield:UUID(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\u9af2\ub32d\u1187\ua562\ua61f\ud4fe, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1E1 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_139_0 : byte[] [generated]
        stack_18F_0 : byte[] [generated]
        stack_1F3_0 : byte[] [generated]
        var_4_11C : int
        var_3_121 : byte[]
        var_5_122 : int
        expr_13F : byte [generated]
        var_0_1E9 : int
        expr_1F3 : byte [generated]
        stack_221_2 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_17E : byte[]
        var_5_17F : int
        expr_B5 : int [generated]
        var_3_E2 : String
        stack_115_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
        var_0_1E1 = and:int(ldc:int(-1411936341), ldc:int(-51077699))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_139_0 = stack_18F_0 = stack_1F3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("gxrCfmY+ftM=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_11C = expr_6B:int
        var_3_121 = newarray:byte[](byte.class, expr_6B:int)
        var_5_122 = expr_6B:int
        Label_0292:
        
        while (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-1455218))
            var_5_122 = add:int(var_5_122:int, ldc:int(-1))
            expr_13F = add:byte(xor:byte(loadelement:byte(stack_139_0:byte[], var_5_122:int), ldc:byte(106)), ldc:byte(71))
            storeelement:byte(var_3_121:byte[], var_5_122:int, or:int(and:int(shl:int(expr_13F:byte, and:int(ldc:int(1606), ldc:int(2100))), ldc:int(-16)), and:int(shr:int(expr_13F:byte[expected:int], xor:int(ldc:int(3210), ldc:int(3214))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_122:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_139_0 = stack_18F_0 = stack_1F3_0 = var_3_121:byte[]
            goto(Label_0112)
        }
        
        Label_0470:
        
        while (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1E9 = and:int(var_0_1E1:int, ldc:int(-1445860887))
            var_5_122 = add:int(var_5_122:int, ldc:int(-1))
            expr_1F3 = loadelement:byte(stack_1F3_0:byte[], var_5_122:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_122:int, ldc:int(4)), neg:int(var_4_11C:int)), ldc:int(0))) {
                var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-1562728031))
                stack_221_2 = add:byte(expr_1F3:byte, ldc:byte(4))
            }
            else {
                stack_221_2 = add:byte(expr_1F3:byte, loadelement:byte(var_3_121:byte[], add:int(var_5_122:int, ldc:int(4))))
            }
            
            var_0_1E1 = and:int(var_0_1E9:int, ldc:int(-370828830))
            storeelement:byte(var_3_121:byte[], var_5_122:int, stack_221_2:byte)
            
            if (cmpne:boolean(var_5_122:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_139_0 = stack_18F_0 = stack_1F3_0 = var_3_121:byte[]
            goto(Label_0186)
        }
        
        var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-78733001))
        goto(Label_0292)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-100854587))
        }
        else {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-252585564))
            var_2_8D = stack_8D_0:byte[]
            expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                var_3_17E = newarray:byte[](byte.class, expr_91:int)
                var_5_17F = expr_91:int
                
                loop {
                    var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-3171962))
                    var_5_17F = add:int(var_5_17F:int, ldc:int(-1))
                    storeelement:byte(var_3_17E:byte[], var_5_17F:int, add:int(shl:int(loadelement:byte(stack_18F_0:byte[], var_5_17F:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_17F:int, and:int(ldc:int(17921), ldc:int(4099)))), ldc:int(7)), and:int(ldc:int(17421), ldc:int(33)))))
                    
                    if (cmpne:boolean(var_5_17F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_139_0 = stack_18F_0 = stack_1F3_0 = var_3_17E:byte[]
            }
        }
        
        Label_0150:
        
        if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-1630887366))
                goto(Label_0112)
            }
            
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-252837929))
            expr_B5 = arraylength:int(stack_B5_0:byte[])
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_4_11C = expr_B5:int
                var_3_121 = newarray:byte[](byte.class, expr_B5:int)
                var_5_122 = expr_B5:int
                goto(Label_0470)
            }
        }
        
        Label_0186:
        
        if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0150)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-1120742050))
            goto(Label_0112)
        }
        
        var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_115_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(20480), ldc:int(20481)))
        expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1), ldc:int(129)))
        storeelement:String(expr_F4:String[], and:int(ldc:int(634), ldc:int(-635)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-7447), ldc:int(7430)), xor:int(ldc:int(8326), ldc:int(8321))))
        putstatic:String[](\u6b5f\ube23\u8753\u4bc8\u624e\ud523::\u516c\u5654\u946b\u3d64\u494c\ufe34, expr_F4:String[])
    }
    
    public void \u6b0d\u8350\ud158\u4bc8\u4ab3\u62da(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_606 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_611 : int
        
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
        var_3_606 = and:int(ldc:int(394089019), ldc:int(931105533))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b5f\ube23\u8753\u4bc8\u624e\ud523[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(512)), ldc:int(0))) {
            var_3_606 = and:int(var_3_606:int, ldc:int(-918893836))
        }
        else {
            var_3_606 = and:int(var_3_606:int, ldc:int(-1115973079))
            var_5_85 = and:int(ldc:int(-13670), ldc:int(13605))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11910), ldc:int(-16263)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_606:int, ldc:int(939130429))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(145), ldc:int(2053)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(20683), ldc:int(8213)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_606 = and:int(var_3_D2:int, ldc:int(897257061))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(3202), ldc:int(3203)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-925832812))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(1744248962))
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-239122123))
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(479817158))
                        goto(Label_0901)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0664)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(2137535630))
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(512)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-6931283))
                    }
                    else {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-679477661))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0555)
                            }
                            
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(256)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-2011900203))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0901)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-1453811403))
                        goto(Label_0664)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(4613273))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_606:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(-142660751))
                            var_11_E3 = and:int(ldc:int(21573), ldc:int(-21574))
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0555:
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-996900680))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-46044794))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0901)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(32)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-454280105))
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_606:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_606 = and:int(var_3_606:int, ldc:int(1065308007))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0664:
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-847767340))
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-643829855))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0901)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-1457007262))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_606:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_606:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(282723777))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_606:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(-345758944))
                            loopcontinue()
                        }
                        
                        var_3_606 = and:int(var_3_606:int, ldc:int(-1786823769))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0799:
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(256)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(920286953))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(814531377))
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_606 = and:int(var_3_606:int, ldc:int(536475641))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(4803), ldc:int(24833))
                                goto(Label_1053)
                            }
                        }
                    }
                    
                    Label_0901:
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-468063159))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(4)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-1354123088))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(1892144561))
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(591062249))
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_606 = and:int(var_3_606:int, ldc:int(-1208116301))
                        var_11_E3 = and:int(ldc:int(25395), ldc:int(-25588))
                    }
                    
                    Label_1053:
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(32)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(876088626))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-55801822))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_606:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0901)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(2113089163))
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(1699259441))
                            goto(Label_0664)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_606:int, ldc:int(4)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(1524352525))
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(918074110))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_606:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_606 = and:int(var_3_606:int, ldc:int(1971043233))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1304)
                            }
                        }
                    }
                    
                    Label_1190:
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(32)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(2014160274))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(853571928))
                            goto(Label_1053)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0901)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(4)), ldc:int(0))) {
                            var_3_606 = and:int(var_3_606:int, ldc:int(-1082562571))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1304:
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(338314430))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0901)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0664)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(1)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-1373960519))
                        goto(Label_0555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_606 = and:int(var_3_606:int, ldc:int(-679919957))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_611 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(1630228677))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-1201622874))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(1)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-1206375753))
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0901)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(1548069017))
                        goto(Label_0664)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(-928325421))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_606:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_606 = and:int(var_3_606:int, ldc:int(2004738737))
                        var_17_611 = add:int(var_16_111:int, xor:int(ldc:int(36), ldc:int(37)))
                        looporswitchbreak()
                    }
                }
                
                var_3_606 = and:int(var_3_606:int, ldc:int(-176433419))
                
                if (cmple:boolean(var_5_85 = var_17_611:int, sub:int(var_6_8C:int, and:int(ldc:int(8225), ldc:int(1113))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_606:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
