public final class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d {
    public void \u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d(com.mojang.datafixers.Typed<?> p0, com.mojang.datafixers.schemas.Schema p1) {
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
            invokespecial:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a(\u9033\ud12e\u836c\ufcaf\u873d\u8c8a::<init>, this:\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d, p0:Typed<?>, p1:Schema)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u40a9\u7330\uafe7\u5654\u59ec\u8413() {
        var_1_5F : int
        var_3_72 : int
        
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
            var_1_5F = and:int(ldc:int(1236740721), ldc:int(2090511351))
            putfield:IntSet(\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d::\u071d\u836c\u12cb\u8709\uc229\uc4d2, this:\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d, initobject:IntOpenHashSet[expected:IntSet](IntOpenHashSet::<init>))
            var_3_72 = and:int(ldc:int(-16718), ldc:int(16461))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(1)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-916809480))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-868766007))
                    
                    if (cmplt:boolean(var_3_72:int, invokeinterface:int(List<E>::size, getfield:List<Dynamic<?>>(\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d::\ub7dc\u6435\u3504\u12cb\ucef1\ud158, this:\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d)))) {
                        if (invokestatic:boolean(Objects::equals, invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, checkcast:Dynamic<?>(com.mojang.serialization.Dynamic<?>.class, invokeinterface:Dynamic<?>(List<Dynamic<?>>::get, getfield:List<Dynamic<?>>(\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d::\ub7dc\u6435\u3504\u12cb\ucef1\ud158, this:\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d), var_3_72:int)), loadelement:String(getstatic:String[](\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d::\u760c\ubf56\u7043\u600f\ucfaf\u7e3f), and:int(ldc:int(13588), ldc:int(-29975)))), loadelement:String(getstatic:String[](\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d::\u760c\ubf56\u7043\u600f\ucfaf\u7e3f), xor:int(ldc:int(-28415), ldc:int(-28416)))), loadelement:String[expected:Object](getstatic:String[](\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d::\u760c\ubf56\u7043\u600f\ucfaf\u7e3f), xor:int(ldc:int(-28666), ldc:int(-28668))))) {
                            invokeinterface:boolean(IntSet::add, getfield:IntSet(\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d::\u071d\u836c\u12cb\u8709\uc229\uc4d2, this:\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d), var_3_72:int)
                        }
                        
                        var_1_5F = and:int(var_1_5F:int, ldc:int(2044391315))
                        inc:int(var_3_72, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:boolean(invokeinterface:boolean(IntSet::isEmpty, getfield:IntSet(\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d::\u071d\u836c\u12cb\u8709\uc229\uc4d2, this:\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub8be\u0a06\u836c\ubded\u8350\u8d90(int p0) {
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
            return:boolean(invokeinterface:boolean(IntSet::contains, getfield:IntSet(\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d::\u071d\u836c\u12cb\u8709\uc229\uc4d2, this:\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d), p0:int))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1B5 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1C7_0 : byte[] [generated]
        stack_224_0 : byte[] [generated]
        stack_291_0 : byte[] [generated]
        stack_2E6_0 : byte[] [generated]
        var_4_1A2 : int
        var_3_1A7 : byte[]
        var_5_1A8 : int
        expr_1CA : byte [generated]
        var_0_21A : int
        expr_224 : byte [generated]
        stack_260_2 : byte [generated]
        stack_23F_0 : byte [generated]
        expr_9E : int [generated]
        var_2_CF : byte[]
        expr_D3 : int [generated]
        var_3_280 : byte[]
        var_5_281 : int
        expr_FE : int [generated]
        var_3_2D5 : byte[]
        var_5_2D6 : int
        var_3_132 : String
        stack_19B_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_1B5 = and:int(ldc:int(-849014261), ldc:int(1542404824))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1C7_0 = stack_224_0 = stack_291_0 = stack_2E6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("G9MUHETbfByT3WuzhEI0dOOcfOPjc5serTY20w==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1A2 = expr_6B:int
        var_3_1A7 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1A8 = expr_6B:int
        Label_0426:
        
        while (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(2147465972))
            var_5_1A8 = add:int(var_5_1A8:int, ldc:int(-1))
            expr_1CA = xor:byte(loadelement:byte(stack_1C7_0:byte[], var_5_1A8:int), ldc:byte(20))
            storeelement:byte(var_3_1A7:byte[], var_5_1A8:int, or:int(and:int(shl:int(expr_1CA:byte, and:int(ldc:int(4), ldc:int(516))), ldc:int(-16)), and:int(shr:int(expr_1CA:byte[expected:int], xor:int(ldc:int(4485), ldc:int(4481))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1A8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1C7_0 = stack_224_0 = stack_291_0 = stack_2E6_0 = var_3_1A7:byte[]
            goto(Label_0112)
        }
        
        var_0_1B5 = and:int(var_0_1B5:int, ldc:int(680417923))
        Label_0527:
        
        while (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(2048)), ldc:int(0))) {
            var_0_21A = and:int(var_0_1B5:int, ldc:int(1214992275))
            var_5_1A8 = add:int(var_5_1A8:int, ldc:int(-1))
            expr_224 = stack_260_2 = loadelement(stack_224_0, var_5_1A8)
            
            if (cmplt:boolean(add:int(add:int(var_5_1A8:int, ldc:int(4)), neg:int(var_4_1A2:int)), ldc:int(0))) {
                stack_260_2 = stack_23F_0 = add:byte(expr_224:byte, loadelement:byte(var_3_1A7:byte[], add:int(var_5_1A8:int, ldc:int(4))))
                goto(Label_0591)
            }
            
            Label_0561:
            
            if (cmpne:boolean(and:int(var_0_21A:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_21A = and:int(var_0_21A:int, ldc:int(-621184322))
                stack_260_2 = stack_23F_0 = add:byte(expr_224:byte, ldc:byte(4))
            }
            
            Label_0591:
            
            if (cmpne:boolean(and:int(var_0_21A:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0561)
            }
            
            var_0_1B5 = and:int(var_0_21A:int, ldc:int(2104719227))
            storeelement:byte(var_3_1A7:byte[], var_5_1A8:int, stack_260_2:byte)
            
            if (cmpne:boolean(var_5_1A8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1C7_0 = stack_224_0 = stack_291_0 = stack_2E6_0 = var_3_1A7:byte[]
            goto(Label_0163)
        }
        
        goto(Label_0426)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(512)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-320268606))
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(870827627))
        }
        else {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-18495548))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_1A2 = expr_9E:int
                var_3_1A7 = newarray:byte[](byte.class, expr_9E:int)
                var_5_1A8 = expr_9E:int
                goto(Label_0527)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(4)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-1878678566))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(512)), ldc:int(0))) {
                var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-209786542))
                goto(Label_0112)
            }
            
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(1233089413))
            var_2_CF = stack_CF_0:byte[]
            expr_D3 = add:int(arraylength:int(stack_D1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_3_280 = newarray:byte[](byte.class, expr_D3:int)
                var_5_281 = expr_D3:int
                
                loop {
                    var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-345409654))
                    var_5_281 = add:int(var_5_281:int, ldc:int(-1))
                    storeelement:byte(var_3_280:byte[], var_5_281:int, add:int(shl:int(loadelement:byte(stack_291_0:byte[], var_5_281:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_CF:byte[], add:int(var_5_281:int, xor:int(ldc:int(18), ldc:int(19)))), ldc:int(7)), and:int(ldc:int(677), ldc:int(16451)))))
                    
                    if (cmpne:boolean(var_5_281:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1C7_0 = stack_224_0 = stack_291_0 = stack_2E6_0 = var_3_280:byte[]
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(408966296))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-352462258))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2D5 = newarray:byte[](byte.class, expr_FE:int)
                var_5_2D6 = expr_FE:int
                
                loop {
                    var_0_1B5 = and:int(var_0_1B5:int, ldc:int(1777673192))
                    var_5_2D6 = add:int(var_5_2D6:int, ldc:int(-1))
                    storeelement:byte(var_3_2D5:byte[], var_5_2D6:int, add:byte(loadelement:byte(stack_2E6_0:byte[], var_5_2D6:int), ldc:byte(39)))
                    
                    if (cmpne:boolean(var_5_2D6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1C7_0 = stack_224_0 = stack_291_0 = stack_2E6_0 = var_3_2D5:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(4)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(2029796520))
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_19B_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4128), ldc:int(4131)))
            expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(20483), ldc:int(2579)))
            storeelement:String(expr_144:String[], xor:int(ldc:int(600), ldc:int(601)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(3522), ldc:int(-24516)), and:int(ldc:int(-18798), ldc:int(361))))
            storeelement:String(expr_144:String[], and:int(ldc:int(9892), ldc:int(-9893)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-19639), ldc:int(17588)), and:int(ldc:int(12292), ldc:int(484))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(13377), ldc:int(13379)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(10884), ldc:int(1094)), xor:int(ldc:int(5128), ldc:int(5139))))
            putstatic:String[](\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d::\u760c\ubf56\u7043\u600f\ucfaf\u7e3f, expr_144:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u40a9\u4daf\u0c95\u8413\ud7e8\u760c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_639 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_644 : int
        
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
        var_3_639 = and:int(ldc:int(-584111808), ldc:int(1987045342))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
            var_3_639 = and:int(var_3_639:int, ldc:int(-1591515378))
        }
        else {
            var_3_639 = and:int(var_3_639:int, ldc:int(338481529))
            var_5_85 = and:int(ldc:int(16571), ldc:int(-16572))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25384), ldc:int(-29615)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_639:int, ldc:int(1950308953))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(4097), ldc:int(27393)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(20552), ldc:int(20553)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_639 = and:int(var_3_DA:int, ldc:int(914100171))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(18449), ldc:int(18448)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1689066861))
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-138693220))
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1268431571))
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(472860107))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0813)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1174319830))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-385208939))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1551245700))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1157609850))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(347962713))
                        var_11_EB = and:int(ldc:int(-28408), ldc:int(19623))
                        goto(Label_1451)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(596548308))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1934657262))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(501277632))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1267547161))
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1418058656))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1817893190))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1612097679))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(938232555))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0813)
                        }
                    }
                    
                    Label_0681:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1327074829))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(412740225))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1310791965))
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1386847143))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(694571093))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1043192950))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0813:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(2)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1122367429))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-214939988))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(701794247))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1042981958))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1051860048))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1132651143))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(18624), ldc:int(18625))
                                goto(Label_1080)
                            }
                        }
                    }
                    
                    Label_0938:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1857189145))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-2125231198))
                            goto(Label_0813)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(327547529))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1564412152))
                        var_11_EB = and:int(ldc:int(-18252), ldc:int(17227))
                    }
                    
                    Label_1080:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0938)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1530586990))
                            goto(Label_0813)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-604246137))
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1650509482))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-470688061))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1765832125))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1341)
                            }
                        }
                    }
                    
                    Label_1196:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(2)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-743747874))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1080)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(269946957))
                            goto(Label_0938)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0813)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1023135017))
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1494912370))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1398630796))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1911421683))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(348038509))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1451)
                    }
                    
                    Label_1341:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-640330883))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1394316257))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_639 = and:int(var_3_639:int, ldc:int(-692291263))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1451:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_644 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1462:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-889597684))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-173554369))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(166593346))
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1734389826))
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1731578849))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1310611134))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(2013074430))
                        var_17_644 = add:int(var_16_119:int, xor:int(ldc:int(105), ldc:int(104)))
                        looporswitchbreak()
                    }
                    
                    var_3_639 = and:int(var_3_639:int, ldc:int(-1902070395))
                }
                
                var_3_639 = and:int(var_3_639:int, ldc:int(-1128502574))
                
                if (cmple:boolean(var_5_85 = var_17_644:int, sub:int(var_6_8C:int, xor:int(ldc:int(16448), ldc:int(16449))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_639 = and:int(var_3_639:int, ldc:int(34369533))
            goto(Label_0106)
        }
    }
}
