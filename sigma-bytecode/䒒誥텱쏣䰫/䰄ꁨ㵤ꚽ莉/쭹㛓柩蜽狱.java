public final class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ucb79\u36d3\u67e9\u873d\u72f1 {
    public void \ucb79\u36d3\u67e9\u873d\u72f1() {
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
            invokespecial:Object(Object::<init>, this:\ucb79\u36d3\u67e9\u873d\u72f1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ucb79\uf995\u3d64\u64f2\ucef1 \uc2e8\uc31c\u74b1\u0c95\u839e\u3c25(java.io.DataInput p0, int p1, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u8aa5\u0800\u5654\u3e75\ud51e p2) {
        var_4_61 : int
        var_6_70 : int
        var_7_81 : int[]
        var_8_8A : int
        
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
            var_4_61 = and:int(ldc:int(1190907622), ldc:int(939228128))
            invokevirtual:void(\u8aa5\u0800\u5654\u3e75\ud51e::\u8709\u8df4\u72f1\u8aa5\u6b0d\u3711, p2:\u8aa5\u0800\u5654\u3e75\ud51e, ldc:long(192L))
            var_6_70 = invokeinterface:int(DataInput::readInt, p0:DataInput)
            invokevirtual:void(\u8aa5\u0800\u5654\u3e75\ud51e::\u8709\u8df4\u72f1\u8aa5\u6b0d\u3711, p2:\u8aa5\u0800\u5654\u3e75\ud51e, mul:long(ldc:long(32L), i2l:long(var_6_70:int)))
            var_7_81 = newarray:int[](int.class, var_6_70:int)
            var_8_8A = and:int(ldc:int(1816), ldc:int(-10009))
            
            loop {
                var_4_61 = and:int(var_4_61:int, ldc:int(1071364716))
                
                if (cmpge:boolean(var_8_8A:int, var_6_70:int)) {
                    looporswitchbreak()
                }
                
                storeelement:int(var_7_81:int[], var_8_8A:int, invokeinterface:int(DataInput::readInt, p0:DataInput))
                inc:int(var_8_8A, ldc:int(1))
            }
            
            return:\ucb79\uf995\u3d64\u64f2\ucef1(initobject:\ucb79\uf995\u3d64\u64f2\ucef1(\ucb79\uf995\u3d64\u64f2\ucef1::<init>, var_7_81:int[]))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \uc84e\u5245\ua6bd\u0a06\u34df\u946b() {
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
            return:String(loadelement:String(getstatic:String[](\ucb79\u36d3\u67e9\u873d\u72f1::\u4f4a\ub32d\u0b8e\u5fe1\ubf56\u6fb0), and:int(ldc:int(19750), ldc:int(-24359))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u71f1\u4e72\u759a\u071d\u759a\ucb79() {
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
            return:String(loadelement:String(getstatic:String[](\ucb79\u36d3\u67e9\u873d\u72f1::\u4f4a\ub32d\u0b8e\u5fe1\ubf56\u6fb0), xor:int(ldc:int(2577), ldc:int(2576))))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab \uc2e8\uc31c\u74b1\u0c95\u839e\u3c25(java.io.DataInput p0, int p1, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u8aa5\u0800\u5654\u3e75\ud51e p2) {
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
            return:\u93a2\u97b7\u647c\ud36e\u64ab(invokevirtual:\ucb79\uf995\u3d64\u64f2\ucef1[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\ucb79\u36d3\u67e9\u873d\u72f1::\uc2e8\uc31c\u74b1\u0c95\u839e\u3c25, this:\ucb79\u36d3\u67e9\u873d\u72f1, p0:DataInput, p1:int, p2:\u8aa5\u0800\u5654\u3e75\ud51e))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_249 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1F6_0 : byte[] [generated]
        stack_25B_0 : byte[] [generated]
        stack_2D3_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_189 : byte[]
        var_4_18A : int
        expr_98 : int [generated]
        var_5_1D9 : int
        var_3_1DE : byte[]
        var_4_1DF : int
        expr_1F9 : byte [generated]
        var_0_273 : int
        expr_25B : byte [generated]
        stack_29F_2 : byte [generated]
        stack_276_0 : byte [generated]
        expr_CB : int [generated]
        expr_F6 : int [generated]
        var_3_2C2 : byte[]
        var_4_2C3 : int
        var_3_132 : String
        stack_180_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
            var_0_249 = and:int(ldc:int(-374801997), ldc:int(-638513353))
            expr_65 = var_2_69 = stack_96_0 = stack_98_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F6_0 = stack_25B_0 = stack_2D3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ITlewul+nd3SsqFaqXGqamYHgA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_189 = newarray:byte[](byte.class, expr_6D:int)
                var_4_18A = expr_6D:int
                
                loop {
                    var_0_249 = and:int(var_0_249:int, ldc:int(-370010309))
                    var_4_18A = add:int(var_4_18A:int, ldc:int(-1))
                    storeelement:byte(var_3_189:byte[], var_4_18A:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_18A:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_18A:int, xor:int(ldc:int(16397), ldc:int(16396)))), ldc:int(6)), xor:int(ldc:int(24833), ldc:int(24834)))))
                    
                    if (cmpne:boolean(var_4_18A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F6_0 = stack_25B_0 = stack_2D3_0 = var_3_189:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0251)
                }
                
                if (cmpne:boolean(and:int(var_0_249:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(-185627009))
                    goto(Label_0157)
                }
                
                var_0_249 = and:int(var_0_249:int, ldc:int(-302271065))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_1D9 = expr_98:int
                var_3_1DE = newarray:byte[](byte.class, expr_98:int)
                var_4_1DF = expr_98:int
                Label_0481:
                
                while (cmpne:boolean(and:int(var_0_249:int, ldc:int(2097152)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(-810378253))
                    var_4_1DF = add:int(var_4_1DF:int, ldc:int(-1))
                    expr_1F9 = xor:byte(loadelement:byte(stack_1F6_0:byte[], var_4_1DF:int), ldc:byte(74))
                    storeelement:byte(var_3_1DE:byte[], var_4_1DF:int, or:int(and:int(shl:int(expr_1F9:byte, xor:int(ldc:int(16643), ldc:int(16647))), ldc:int(-16)), and:int(shr:int(expr_1F9:byte[expected:int], xor:int(ldc:int(1058), ldc:int(1062))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_1DF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F6_0 = stack_25B_0 = stack_2D3_0 = var_3_1DE:byte[]
                    goto(Label_0157)
                }
                
                Label_0574:
                
                while (cmpeq:boolean(and:int(var_0_249:int, ldc:int(512)), ldc:int(0))) {
                    var_0_273 = and:int(var_0_249:int, ldc:int(-35032713))
                    var_4_1DF = add:int(var_4_1DF:int, ldc:int(-1))
                    expr_25B = stack_29F_2 = loadelement(stack_25B_0, var_4_1DF)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1DF:int, ldc:int(4)), neg:int(var_5_1D9:int)), ldc:int(0))) {
                        stack_29F_2 = stack_276_0 = add:byte(expr_25B:byte, loadelement:byte(var_3_1DE:byte[], add:int(var_4_1DF:int, ldc:int(4))))
                        goto(Label_0646)
                    }
                    
                    Label_0616:
                    
                    if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(512)), ldc:int(0))) {
                        var_0_273 = and:int(var_0_273:int, ldc:int(-1111535257))
                        stack_29F_2 = stack_276_0 = add:byte(expr_25B:byte, ldc:byte(4))
                    }
                    
                    Label_0646:
                    
                    if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(2)), ldc:int(0))) {
                        var_0_273 = and:int(var_0_273:int, ldc:int(-826593971))
                        goto(Label_0616)
                    }
                    
                    var_0_249 = and:int(var_0_273:int, ldc:int(-838972109))
                    storeelement:byte(var_3_1DE:byte[], var_4_1DF:int, stack_29F_2:byte)
                    
                    if (cmpne:boolean(var_4_1DF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F6_0 = stack_25B_0 = stack_2D3_0 = var_3_1DE:byte[]
                    goto(Label_0208)
                }
                
                var_0_249 = and:int(var_0_249:int, ldc:int(-925016078))
                goto(Label_0481)
                Label_0157:
                
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(2097152)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(1633100866))
                    goto(Label_0251)
                }
                
                if (cmpne:boolean(and:int(var_0_249:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(601441796))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_249:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_249 = and:int(var_0_249:int, ldc:int(-1448747669))
                    expr_CB = arraylength:int(stack_CB_0:byte[])
                    
                    if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                        var_5_1D9 = expr_CB:int
                        var_3_1DE = newarray:byte[](byte.class, expr_CB:int)
                        var_4_1DF = expr_CB:int
                        goto(Label_0574)
                    }
                }
                
                Label_0208:
                
                if (cmpne:boolean(and:int(var_0_249:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(241836094))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_249:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0157)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_249:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_249 = and:int(var_0_249:int, ldc:int(-805584449))
                    expr_F6 = arraylength:int(stack_F6_0:byte[])
                    
                    if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                        var_3_2C2 = newarray:byte[](byte.class, expr_F6:int)
                        var_4_2C3 = expr_F6:int
                        
                        loop {
                            var_0_249 = and:int(var_0_249:int, ldc:int(-805528201))
                            var_4_2C3 = add:int(var_4_2C3:int, ldc:int(-1))
                            storeelement:byte(var_3_2C2:byte[], var_4_2C3:int, add:byte(loadelement:byte(stack_2D3_0:byte[], var_4_2C3:int), ldc:byte(48)))
                            
                            if (cmpne:boolean(var_4_2C3:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F6_0 = stack_25B_0 = stack_2D3_0 = var_3_2C2:byte[]
                    }
                }
                
                Label_0251:
                
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(-1887826296))
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_249 = and:int(var_0_249:int, ldc:int(-656072939))
            }
            
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_180_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(41), ldc:int(43)))
            expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(137), ldc:int(139)))
            storeelement:String(expr_144:String[], and:int(ldc:int(-4003), ldc:int(1442)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(25496), ldc:int(-25497)), and:int(ldc:int(1029), ldc:int(28687))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(2560), ldc:int(2561)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(16517), ldc:int(1325)), and:int(ldc:int(2290), ldc:int(20510))))
            putstatic:String[](\ucb79\u36d3\u67e9\u873d\u72f1::\u4f4a\ub32d\u0b8e\u5fe1\ubf56\u6fb0, expr_144:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\u8df4\ud158\ua61f\u516c\u759a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5AC : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5B7 : int
        
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
        var_3_5AC = and:int(ldc:int(-1603467409), ldc:int(-1574244753))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucb79\u36d3\u67e9\u873d\u72f1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1199888789))
            var_5_7D = and:int(ldc:int(-30320), ldc:int(21100))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8677), ldc:int(-8678)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5AC:int, ldc:int(-315023377))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(2112), ldc:int(2113)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(9216), ldc:int(9217)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5AC = and:int(var_3_CA:int, ldc:int(-1230930005))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(4099), ldc:int(2401)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(491408634))
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(1010043562))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(341285785))
                        goto(Label_0979)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(1333481912))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1971442357))
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-2141385070))
                    }
                    else {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-357068817))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0730)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(1438990806))
                            loopcontinue()
                        }
                        
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-394300309))
                        var_11_DB = and:int(ldc:int(-9470), ldc:int(1229))
                        goto(Label_1346)
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1620370134))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(378271637))
                            loopcontinue()
                        }
                        
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-323980181))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0730)
                        }
                    }
                    
                    Label_0620:
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(461795957))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-2144295963))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(97303294))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1539555777))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0730:
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(1940403595))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(49532763))
                        goto(Label_0979)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(-333455919))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-270160129))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-12287), ldc:int(-12288))
                                goto(Label_0979)
                            }
                        }
                    }
                    
                    Label_0833:
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1520162449))
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(1085048887))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(367399094))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1440536316))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-29536913))
                        var_11_DB = and:int(ldc:int(9728), ldc:int(-9729))
                    }
                    
                    Label_0979:
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(1929526706))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(2008324017))
                            goto(Label_0730)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(151060842))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(917476067))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-484098881))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1227)
                            }
                        }
                    }
                    
                    Label_1091:
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(1560819181))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1198143983))
                            goto(Label_0979)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(-625093487))
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1473971808))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(-797085709))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1233318037))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1346)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1227:
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1173394136))
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1471620547))
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1584444392))
                        loopcontinue()
                    }
                    
                    var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1604213265))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1346:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5B7 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1357:
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-828541970))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(1352390760))
                        goto(Label_0979)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(1461266815))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5AC = and:int(var_3_5AC:int, ldc:int(-1326487953))
                        var_17_5B7 = add:int(var_16_109:int, xor:int(ldc:int(320), ldc:int(321)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5AC = and:int(var_3_5AC:int, ldc:int(-13359681))
                
                if (cmple:boolean(var_5_7D = var_17_5B7:int, sub:int(var_6_84:int, and:int(ldc:int(81), ldc:int(1))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5AC:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
