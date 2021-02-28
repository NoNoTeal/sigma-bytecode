public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0 {
    public void \u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0() {
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
            invokespecial:Object(Object::<init>, this:\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u416d\ud7e8\u5245\u99f7\ubff1\uf94d(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff> p3, java.util.Random p4) {
        var_5_61 : int
        var_7_A5 : int
        var_8_CC : int
        
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
            var_5_61 = and:int(ldc:int(-613883829), ldc:int(-213326865))
            
            if (cmplt:boolean(invokevirtual:double(Random::nextDouble, p4:Random), ldc:double(0.5))) {
                var_7_A5 = add:int(invokevirtual:int(Random::nextInt, p4:Random, ldc:int(8)), and:int(ldc:int(25132), ldc:int(262)))
                invokeinterface:boolean(List<\u40a9\ub70c\u7330\uae87\u98a4>::add, p3:List<\u40a9\ub70c\u7330\uae87\u98a4>, initobject:\u40a9\ub70c\u7330\uae87\u98a4(\u40a9\ub70c\u7330\uae87\u98a4::<init>, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uae5d\u4f4a\u4d85\u6c52\u6d99\u4f4a), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, mul:int(var_7_A5:int, xor:int(ldc:int(17601), ldc:int(17602)))))
                var_8_CC = and:int(ldc:int(-24776), ldc:int(24643))
                
                loop {
                    var_5_61 = and:int(var_5_61:int, ldc:int(-1076957682))
                    
                    if (cmpge:boolean(var_8_CC:int, sub:int(var_7_A5:int, and:int(ldc:int(5657), ldc:int(10307))))) {
                        looporswitchbreak()
                    }
                    
                    invokeinterface:boolean(List<\u40a9\ub70c\u7330\uae87\u98a4>::add, p3:List<\u40a9\ub70c\u7330\uae87\u98a4>, initobject:\u40a9\ub70c\u7330\uae87\u98a4(\u40a9\ub70c\u7330\uae87\u98a4::<init>, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uae5d\u7330\ua3b4\u3bc9\u3a62\ud51e), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, mul:int(var_8_CC:int, xor:int(ldc:int(5160), ldc:int(5163)))))
                    inc:int(var_8_CC, ldc:int(1))
                }
            }
            
            invokeinterface:boolean(List<\u40a9\ub70c\u7330\uae87\u98a4>::add, p3:List<\u40a9\ub70c\u7330\uae87\u98a4>, initobject:\u40a9\ub70c\u7330\uae87\u98a4(\u40a9\ub70c\u7330\uae87\u98a4::<init>, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\u6ec6\u7af6\ua6bd\uc29a\u56bd\ufcaf), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, and:int(ldc:int(-8347), ldc:int(8346))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Map \u183a\u51b2\u98a4\ucef1\ubcb0\uc3e3() {
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
            return:Map(getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\u0c95\ub113\u6bb9\ub1b9\u3776\u34df))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Map \u8308\ufe34\u8753\u9255\u927d\u4daf() {
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
            return:Map(getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uc910\uf94d\u5140\u40a9\u3a62\ubded))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u51fa\u62da\uc84e\uc910\u5245\u6d69() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\u6ec6\u7af6\ua6bd\uc29a\u56bd\ufcaf))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_8A : int
        expr_65 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_2C0_0 : byte[] [generated]
        stack_315_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_235 : int
        var_3_23A : byte[]
        var_5_23B : int
        var_0_263 : int
        expr_24B : byte [generated]
        stack_28F_2 : byte [generated]
        stack_266_0 : byte [generated]
        var_0_7B : int
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_2AF : byte[]
        var_5_2B0 : int
        expr_BD : int [generated]
        var_3_304 : byte[]
        var_5_305 : int
        expr_318 : byte [generated]
        var_3_F2 : String
        expr_FA : String[] [generated]
        expr_104 : String[] [generated]
        var_3_161 : String[]
        
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
            var_0_8A = and:int(ldc:int(-1781601413), ldc:int(30141309))
            expr_65 = stack_8D_0 = stack_8F_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_2C0_0 = stack_315_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("VOAgZEAH7CDgnMD58PggJAQnEAjg3PzZDCDwcevqx6v3eg=="))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_235 = expr_6B:int
                var_3_23A = newarray:byte[](byte.class, expr_6B:int)
                var_5_23B = expr_6B:int
                
                loop {
                    var_0_263 = and:int(var_0_8A:int, ldc:int(-873640975))
                    var_5_23B = add:int(var_5_23B:int, ldc:int(-1))
                    expr_24B = stack_28F_2 = loadelement(expr_65, var_5_23B)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_23B:int, ldc:int(6)), neg:int(var_4_235:int)), ldc:int(0))) {
                        stack_28F_2 = stack_266_0 = add:byte(expr_24B:byte, loadelement:byte(var_3_23A:byte[], add:int(var_5_23B:int, ldc:int(6))))
                        goto(Label_0630)
                    }
                    
                    Label_0600:
                    
                    if (cmpne:boolean(and:int(var_0_263:int, ldc:int(524288)), ldc:int(0))) {
                        var_0_263 = and:int(var_0_263:int, ldc:int(-1209304072))
                        stack_28F_2 = stack_266_0 = add:byte(expr_24B:byte, ldc:byte(6))
                    }
                    
                    Label_0630:
                    
                    if (cmpeq:boolean(and:int(var_0_263:int, ldc:int(4194304)), ldc:int(0))) {
                        var_0_263 = and:int(var_0_263:int, ldc:int(-1274976150))
                        goto(Label_0600)
                    }
                    
                    var_0_8A = and:int(var_0_263:int, ldc:int(1542049660))
                    storeelement:byte(var_3_23A:byte[], var_5_23B:int, stack_28F_2:byte)
                    
                    if (cmpne:boolean(var_5_23B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_2C0_0 = stack_315_0 = var_3_23A:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_8A:int, ldc:int(-1981086794))
                    goto(Label_0194)
                }
                
                if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(332131319))
                    var_2_8D = stack_8D_0:byte[]
                    expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                        var_3_2AF = newarray:byte[](byte.class, expr_91:int)
                        var_5_2B0 = expr_91:int
                        
                        loop {
                            var_0_8A = and:int(var_0_8A:int, ldc:int(-1778593929))
                            var_5_2B0 = add:int(var_5_2B0:int, ldc:int(-1))
                            storeelement:byte(var_3_2AF:byte[], var_5_2B0:int, add:int(shl:int(loadelement:byte(stack_2C0_0:byte[], var_5_2B0:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_2B0:int, xor:int(ldc:int(77), ldc:int(76)))), ldc:int(6)), xor:int(ldc:int(16385), ldc:int(16386)))))
                            
                            if (cmpne:boolean(var_5_2B0:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_2C0_0 = stack_315_0 = var_3_2AF:byte[]
                    }
                }
                
                Label_0150:
                
                if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_8A:int, ldc:int(1365265853))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_0_8A = and:int(var_0_8A:int, ldc:int(1575138210))
                        loopcontinue()
                    }
                    
                    var_0_7B = and:int(var_0_8A:int, ldc:int(502000511))
                    expr_BD = arraylength:int(stack_BD_0:byte[])
                    
                    if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                        var_3_304 = newarray:byte[](byte.class, expr_BD:int)
                        var_5_305 = expr_BD:int
                        
                        loop {
                            var_0_7B = and:int(var_0_7B:int, ldc:int(-874610697))
                            var_5_305 = add:int(var_5_305:int, ldc:int(-1))
                            expr_318 = add:byte(loadelement:byte(stack_315_0:byte[], var_5_305:int), ldc:byte(32))
                            storeelement:byte(var_3_304:byte[], var_5_305:int, xor:int(or:int(and:int(shl:int(expr_318:byte, xor:int(ldc:int(1826), ldc:int(1830))), ldc:int(-16)), and:int(shr:int(expr_318:byte[expected:int], and:int(ldc:int(5180), ldc:int(10821))), ldc:int(15))), ldc:int(17)))
                            
                            if (cmpne:boolean(var_5_305:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_2C0_0 = stack_315_0 = var_3_304:byte[]
                    }
                }
                
                Label_0194:
                
                if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(256)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_7B:int, ldc:int(-117358554))
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(32)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_8A = and:int(var_0_7B:int, ldc:int(-1114464128))
            }
            
            var_3_F2 = initobject:String(String::<init>, stack_E6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_FA = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8226), ldc:int(8225)))
            expr_104 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(18952), ldc:int(18955)))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(4096), ldc:int(4098)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, and:int(ldc:int(9141), ldc:int(-9214)), xor:int(ldc:int(17410), ldc:int(17422))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(9729), ldc:int(4229)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, and:int(ldc:int(684), ldc:int(10590)), and:int(ldc:int(19100), ldc:int(8281))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(20122), ldc:int(-20123)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, and:int(ldc:int(2106), ldc:int(8604)), and:int(ldc:int(169), ldc:int(27427))))
            putstatic:String[](\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uc31c\u6435\uc31c\u7873\ub83f\u5f50, expr_104:String[])
            var_3_161 = expr_FA:String[]
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\u6ec6\u7af6\ua6bd\uc29a\u56bd\ufcaf, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_161:String[], and:int(ldc:int(10299), ldc:int(-14908)))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uae5d\u7330\ua3b4\u3bc9\u3a62\ud51e, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_161:String[], xor:int(ldc:int(-24511), ldc:int(-24512)))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uae5d\u4f4a\u4d85\u6c52\u6d99\u4f4a, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_161:String[], xor:int(ldc:int(-16316), ldc:int(-16314)))))
            putstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uc910\uf94d\u5140\u40a9\u3a62\ubded, invokestatic:ImmutableMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>](ImmutableMap::of, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\u6ec6\u7af6\ua6bd\uc29a\u56bd\ufcaf), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, and:int(ldc:int(1175), ldc:int(2123)), xor:int(ldc:int(69), ldc:int(64)), and:int(ldc:int(8709), ldc:int(1031))), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uae5d\u7330\ua3b4\u3bc9\u3a62\ud51e), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, and:int(ldc:int(6437), ldc:int(17041)), xor:int(ldc:int(2049), ldc:int(2050)), and:int(ldc:int(4641), ldc:int(1031))), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uae5d\u4f4a\u4d85\u6c52\u6d99\u4f4a), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, and:int(ldc:int(6723), ldc:int(24603)), ldc:int(6), ldc:int(7))))
            putstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\u0c95\ub113\u6bb9\ub1b9\u3776\u34df, invokestatic:ImmutableMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>](ImmutableMap::of, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\u6ec6\u7af6\ua6bd\uc29a\u56bd\ufcaf), getstatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u92ee\u56bd\u7ce1\ua6bd\u8709\u946b), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uae5d\u7330\ua3b4\u3bc9\u3a62\ud51e), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, and:int(ldc:int(17682), ldc:int(4162)), ldc:int(-3), xor:int(ldc:int(16513), ldc:int(16517))), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0::\uae5d\u4f4a\u4d85\u6c52\u6d99\u4f4a), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, and:int(ldc:int(29329), ldc:int(-30688)), ldc:int(-3), ldc:int(-2))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8d90\u7d52\u7049\u0c95\u62da\ub18d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_604 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60F : int
        
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
        var_3_604 = and:int(ldc:int(903123037), ldc:int(1408365151))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
            var_3_604 = and:int(var_3_604:int, ldc:int(-636214179))
        }
        else {
            var_3_604 = and:int(var_3_604:int, ldc:int(1029084511))
            var_5_85 = and:int(ldc:int(21338), ldc:int(-21339))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4419), ldc:int(-13124)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_604:int, ldc:int(-1755655715))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-16126), ldc:int(-16125)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(1031), ldc:int(8833)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_604 = and:int(var_3_D2:int, ldc:int(1442683517))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(68), ldc:int(69)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-489416245))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(153513585))
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0854)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(220396723))
                        goto(Label_0745)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-980874630))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1067630465))
                    }
                    else {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1071642207))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0745)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1126016285))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0854)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0745)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-863439530))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(128)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(2113852767))
                            var_11_E3 = and:int(ldc:int(-24975), ldc:int(24974))
                            goto(Label_1434)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1987771835))
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1017039433))
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(128)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-418378421))
                        goto(Label_0745)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1141000099))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0745)
                        }
                    }
                    
                    Label_0640:
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1294359521))
                        goto(Label_1007)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-2090673275))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-44762019))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0745:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1640972916))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1211739745))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0640)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(660190761))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(469144319))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(2049), ldc:int(8597))
                                goto(Label_1007)
                            }
                        }
                    }
                    
                    Label_0854:
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(128)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(72425772))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1088294860))
                            goto(Label_0745)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0640)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1566534884))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-602628994))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(368283773))
                        var_11_E3 = and:int(ldc:int(-1883), ldc:int(1866))
                    }
                    
                    Label_1007:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1703265186))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1088878876))
                            goto(Label_0854)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0745)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(128)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1083468070))
                            goto(Label_0640)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-834011867))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-291784345))
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(2113067647))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1288)
                            }
                        }
                    }
                    
                    Label_1133:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(318416508))
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1021199938))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(346812887))
                            goto(Label_1007)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(446457020))
                            goto(Label_0854)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0745)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(937956997))
                            goto(Label_0640)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1116126925))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(265478608))
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(1364521597))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1434)
                    }
                    
                    Label_1288:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-651846418))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1801814626))
                        goto(Label_1007)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0854)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-981172114))
                        goto(Label_0745)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(501286558))
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-578797514))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1344728090))
                        loopcontinue()
                    }
                    
                    var_3_604 = and:int(var_3_604:int, ldc:int(-1822781057))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1434:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1445:
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-130781178))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-791827132))
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-939868389))
                        goto(Label_0854)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0745)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-707600419))
                        var_17_60F = add:int(var_16_111:int, xor:int(ldc:int(12353), ldc:int(12352)))
                        looporswitchbreak()
                    }
                }
                
                var_3_604 = and:int(var_3_604:int, ldc:int(2144575487))
                
                if (cmple:boolean(var_5_85 = var_17_60F:int, sub:int(var_6_8C:int, and:int(ldc:int(8199), ldc:int(3585))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
