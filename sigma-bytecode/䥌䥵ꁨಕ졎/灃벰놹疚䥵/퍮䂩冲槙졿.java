public final class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ud36e\u40a9\u51b2\u69d9\uc87f {
    private void \ud36e\u40a9\u51b2\u69d9\uc87f() {
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
            invokespecial:Object(Object::<init>, this:\ud36e\u40a9\u51b2\u69d9\uc87f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u527a\u61a4\u16f6\u7006\uc87f\u965f(java.util.Random p0, int p1, int p2) {
        var_6_89 : int
        
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
        
        if (cmple:boolean(p2:int, ldc:int(0))) {
            return:int(p1:int)
        }
        
        var_6_89 = sub:int(invokevirtual:int(Random::nextInt, p0:Random, add:int(p2:int, xor:int(ldc:int(-32416), ldc:int(-32414)))), and:int(ldc:int(21373), ldc:int(1)))
        
        if (cmplt:boolean(var_6_89:int, ldc:int(0))) {
            var_6_89 = and:int(ldc:int(5360), ldc:int(-22517))
        }
        
        return:int(mul:int(p1:int, add:int(var_6_89:int, xor:int(ldc:int(4233), ldc:int(4232)))))
    }
    
    public void \u47c2\u76bc\u3776\ud36e\uf94d\u5fe1(com.google.gson.JsonObject p0, com.google.gson.JsonSerializationContext p1) {
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
    
    public static \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u8aa5\u4179\u183a\ua6bd\uc9f6 \u36d3\u7330\u183a\u74b1\u71f1\ucef1(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1) {
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
            return:\u8aa5\u4179\u183a\ua6bd\uc9f6(initobject:\ud36e\u40a9\u51b2\u69d9\uc87f[expected:\u8aa5\u4179\u183a\ua6bd\uc9f6](\ud36e\u40a9\u51b2\u69d9\uc87f::<init>))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u88c5\u873d\uc29a\ua3b4\uf94d\u69d9() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud36e\u40a9\u51b2\u69d9\uc87f::\u4ab3\ud36e\uc2e8\u64f2\uc2bd\u446c))
        }
        
        goto(Label_0006)
    }
    
    public void \ud36e\u40a9\u51b2\u69d9\uc87f(\u5d20\u97b7\u8753\u873d\u16f6.\uc84e\u120d\u71ae\u527a\u9937 p0) {
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
            invokespecial:\ud36e\u40a9\u51b2\u69d9\uc87f(\ud36e\u40a9\u51b2\u69d9\uc87f::<init>, this:\ud36e\u40a9\u51b2\u69d9\uc87f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_18C : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_19E_0 : byte[] [generated]
        stack_1F1_0 : byte[] [generated]
        stack_24D_0 : byte[] [generated]
        stack_2C5_0 : byte[] [generated]
        var_4_179 : int
        var_3_17E : byte[]
        var_5_17F : int
        expr_1A1 : byte [generated]
        var_0_265 : int
        expr_24D : byte [generated]
        stack_291_2 : byte [generated]
        stack_268_0 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_1E0 : byte[]
        var_5_1E1 : int
        expr_CB : int [generated]
        expr_EE : int [generated]
        var_3_2B4 : byte[]
        var_5_2B5 : int
        var_3_12A : String
        expr_132 : String[] [generated]
        expr_13C : String[] [generated]
        
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
        var_0_18C = and:int(ldc:int(442765283), ldc:int(-1419346061))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_19E_0 = stack_1F1_0 = stack_24D_0 = stack_2C5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ub63uKpEKtNSww==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_179 = expr_6B:int
        var_3_17E = newarray:byte[](byte.class, expr_6B:int)
        var_5_17F = expr_6B:int
        Label_0385:
        
        while (cmpne:boolean(and:int(var_0_18C:int, ldc:int(2)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(1274183546))
            var_5_17F = add:int(var_5_17F:int, ldc:int(-1))
            expr_1A1 = add:byte(loadelement:byte(stack_19E_0:byte[], var_5_17F:int), ldc:byte(71))
            storeelement:byte(var_3_17E:byte[], var_5_17F:int, or:int(and:int(shl:int(expr_1A1:byte, and:int(ldc:int(4381), ldc:int(10854))), ldc:int(-16)), and:int(shr:int(expr_1A1:byte[expected:int], and:int(ldc:int(17061), ldc:int(11276))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_17F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C9_0 = stack_CB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_19E_0 = stack_1F1_0 = stack_24D_0 = stack_2C5_0 = var_3_17E:byte[]
            goto(Label_0112)
        }
        
        var_0_18C = and:int(var_0_18C:int, ldc:int(-217153283))
        Label_0568:
        
        while (cmpne:boolean(and:int(var_0_18C:int, ldc:int(1024)), ldc:int(0))) {
            var_0_265 = and:int(var_0_18C:int, ldc:int(-1446957174))
            var_5_17F = add:int(var_5_17F:int, ldc:int(-1))
            expr_24D = stack_291_2 = loadelement(stack_24D_0, var_5_17F)
            
            if (cmplt:boolean(add:int(add:int(var_5_17F:int, ldc:int(2)), neg:int(var_4_179:int)), ldc:int(0))) {
                stack_291_2 = stack_268_0 = add:byte(expr_24D:byte, loadelement:byte(var_3_17E:byte[], add:int(var_5_17F:int, ldc:int(2))))
                goto(Label_0632)
            }
            
            Label_0602:
            
            if (cmpne:boolean(and:int(var_0_265:int, ldc:int(1024)), ldc:int(0))) {
                var_0_265 = and:int(var_0_265:int, ldc:int(-1100673242))
                stack_291_2 = stack_268_0 = add:byte(expr_24D:byte, ldc:byte(2))
            }
            
            Label_0632:
            
            if (cmpeq:boolean(and:int(var_0_265:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_265 = and:int(var_0_265:int, ldc:int(796764147))
                goto(Label_0602)
            }
            
            var_0_18C = and:int(var_0_265:int, ldc:int(776101814))
            storeelement:byte(var_3_17E:byte[], var_5_17F:int, stack_291_2:byte)
            
            if (cmpne:boolean(var_5_17F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C9_0 = stack_CB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_19E_0 = stack_1F1_0 = stack_24D_0 = stack_2C5_0 = var_3_17E:byte[]
            goto(Label_0208)
        }
        
        goto(Label_0385)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(512)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(-241864880))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_18C:int, ldc:int(2048)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(1029152543))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_1E0 = newarray:byte[](byte.class, expr_98:int)
                var_5_1E1 = expr_98:int
                
                loop {
                    var_0_18C = and:int(var_0_18C:int, ldc:int(1802034979))
                    var_5_1E1 = add:int(var_5_1E1:int, ldc:int(-1))
                    storeelement:byte(var_3_1E0:byte[], var_5_1E1:int, add:int(shl:int(loadelement:byte(stack_1F1_0:byte[], var_5_1E1:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_1E1:int, xor:int(ldc:int(-32464), ldc:int(-32463)))), ldc:int(3)), and:int(ldc:int(4159), ldc:int(2783)))))
                    
                    if (cmpne:boolean(var_5_1E1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C9_0 = stack_CB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_19E_0 = stack_1F1_0 = stack_24D_0 = stack_2C5_0 = var_3_1E0:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(256)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(1967142938))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(256)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(-1312974861))
        }
        else {
            if (cmpne:boolean(and:int(var_0_18C:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_18C = and:int(var_0_18C:int, ldc:int(1516932962))
            expr_CB = arraylength:int(stack_CB_0:byte[])
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_4_179 = expr_CB:int
                var_3_17E = newarray:byte[](byte.class, expr_CB:int)
                var_5_17F = expr_CB:int
                goto(Label_0568)
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_18C:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_18C = and:int(var_0_18C:int, ldc:int(-1185906718))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2B4 = newarray:byte[](byte.class, expr_EE:int)
                var_5_2B5 = expr_EE:int
                
                loop {
                    var_0_18C = and:int(var_0_18C:int, ldc:int(-555941946))
                    var_5_2B5 = add:int(var_5_2B5:int, ldc:int(-1))
                    storeelement:byte(var_3_2B4:byte[], var_5_2B5:int, xor:byte(loadelement:byte(stack_2C5_0:byte[], var_5_2B5:int), ldc:byte(69)))
                    
                    if (cmpne:boolean(var_5_2B5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C9_0 = stack_CB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_19E_0 = stack_1F1_0 = stack_24D_0 = stack_2C5_0 = var_3_2B4:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_18C:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(2004341952))
            goto(Label_0157)
        }
        
        if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(512)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(1363613984))
            goto(Label_0112)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_132 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16397), ldc:int(5251)))
        expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(96), ldc:int(97)))
        storeelement:String(expr_132:String[], and:int(ldc:int(-17365), ldc:int(16852)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(10384), ldc:int(-10385)), xor:int(ldc:int(17), ldc:int(24))))
        putstatic:String[](\ud36e\u40a9\u51b2\u69d9\uc87f::\ufe34\ubefe\u6fb0\u16f6\u946b\u647c, expr_13C:String[])
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud36e\u40a9\u51b2\u69d9\uc87f::\u4ab3\ud36e\uc2e8\u64f2\uc2bd\u446c, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(expr_132:String[], and:int(ldc:int(10317), ldc:int(-10574)))))
    }
    
    public void \u960f\u6bb9\ubb2b\u52d3\uc2e8\u9255(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DC : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5E7 : int
        
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
        var_3_5DC = and:int(ldc:int(-36721717), ldc:int(-29364325))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud36e\u40a9\u51b2\u69d9\uc87f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1824231712))
        }
        else {
            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-509091941))
            var_5_85 = and:int(ldc:int(-1095), ldc:int(1094))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10505), ldc:int(10504)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5DC:int, ldc:int(-166752857))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(1083), ldc:int(389)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5DC = and:int(var_3_DA:int, ldc:int(-262677543))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1032), ldc:int(1033)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(2019697981))
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1333966887))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-164898341))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1729242170))
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(44393853))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-879161622))
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-84938777))
                        var_11_EB = and:int(ldc:int(-25550), ldc:int(17356))
                        goto(Label_1385)
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1808492905))
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1981678457))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1633229025))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1208550697))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-386861858))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-404239411))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(1584657137))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-456551345))
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-195576431))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(974950402))
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-96262677))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-161373978))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-967513472))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-248780297))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(12808), ldc:int(12809))
                                goto(Label_1003)
                            }
                        }
                    }
                    
                    Label_0857:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1483625403))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1229730378))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1645838571))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(1592131509))
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-56127555))
                        var_11_EB = and:int(ldc:int(20674), ldc:int(-23243))
                    }
                    
                    Label_1003:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1113907222))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1777379872))
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1037636209))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(871287869))
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1840126548))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1107796814))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(1804500455))
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-65536021))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1266)
                            }
                        }
                    }
                    
                    Label_1139:
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-57241959))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-450260416))
                            goto(Label_1003)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-289410490))
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(1806498798))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-260317255))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1385)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1266:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(919278896))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1099688057))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(659911709))
                        loopcontinue()
                    }
                    
                    var_3_5DC = and:int(var_3_5DC:int, ldc:int(-306979849))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1385:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E7 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1396:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1506610890))
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1155460018))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1085287288))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-435438175))
                        var_17_5E7 = add:int(var_16_119:int, and:int(ldc:int(18505), ldc:int(4119)))
                        looporswitchbreak()
                    }
                    
                    var_3_5DC = and:int(var_3_5DC:int, ldc:int(-168982426))
                }
                
                var_3_5DC = and:int(var_3_5DC:int, ldc:int(-48497189))
                
                if (cmple:boolean(var_5_85 = var_17_5E7:int, sub:int(var_6_8C:int, xor:int(ldc:int(18), ldc:int(19))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
            var_3_5DC = and:int(var_3_5DC:int, ldc:int(600668005))
            goto(Label_0106)
        }
    }
}
