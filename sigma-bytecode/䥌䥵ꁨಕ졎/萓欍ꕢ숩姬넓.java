public class \u494c\u4975\ua068\u0c95\uc84e.\u8413\u6b0d\ua562\uc229\u59ec\ub113 {
    public void \u8413\u6b0d\ua562\uc229\u59ec\ub113(int p0, com.mojang.datafixers.schemas.Schema p1) {
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
            invokespecial:Schema(Schema::<init>, this:\u8413\u6b0d\ua562\uc229\u59ec\ub113, p0:int, p1:Schema)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> registerEntities(com.mojang.datafixers.schemas.Schema p0) {
        var_4_65 : Map
        
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
            var_4_65 = invokespecial:Map(Schema::registerEntities, this:\u8413\u6b0d\ua562\uc229\u59ec\ub113[expected:Schema], p0:Schema)
            invokeinterface:Supplier<TypeTemplate>(Map<String, Supplier<TypeTemplate>>::remove, var_4_65:Map<String, Supplier<TypeTemplate>>, loadelement:String[expected:Object](getstatic:String[](\u8413\u6b0d\ua562\uc229\u59ec\ub113::\u6435\uc31c\ubb2b\ub8be\u98a4\u51b2), and:int(ldc:int(-25915), ldc:int(1322))))
            return:Map<String, Supplier<TypeTemplate>>(var_4_65:Map<String, Supplier<TypeTemplate>>)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1EC : int
        expr_6B : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_117_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_163_0 : byte[] [generated]
        stack_165_0 : byte[] [generated]
        stack_18C_0 : byte[] [generated]
        stack_1FE_0 : byte[] [generated]
        stack_251_0 : byte[] [generated]
        stack_2DF_0 : byte[] [generated]
        stack_32F_0 : byte[] [generated]
        stack_384_0 : byte[] [generated]
        var_4_1D2 : int
        var_3_1D7 : byte[]
        var_5_1D8 : int
        var_0_247 : int
        expr_251 : byte [generated]
        stack_295_2 : byte [generated]
        stack_274_0 : byte [generated]
        expr_2DF : byte [generated]
        expr_A5 : int [generated]
        expr_D7 : int [generated]
        var_2_117 : byte[]
        expr_11B : int [generated]
        var_3_31E : byte[]
        var_5_31F : int
        expr_165 : int [generated]
        var_3_373 : byte[]
        var_5_374 : int
        var_3_198 : String
        stack_1CB_0 : String[] [generated]
        expr_1AA : String[] [generated]
        
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
        var_0_1EC = and:int(ldc:int(-1714847407), ldc:int(-1652858543))
        expr_6B = arraylength:int(stack_A3_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_117_0 = stack_119_0 = stack_163_0 = stack_165_0 = stack_18C_0 = stack_1FE_0 = stack_251_0 = stack_2DF_0 = stack_32F_0 = stack_384_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Wl39nTcLu7Ph")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1D2 = expr_6B:int
        var_3_1D7 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1D8 = expr_6B:int
        Label_0474:
        
        while (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(256)), ldc:int(0))) {
                var_0_1EC = and:int(var_0_1EC:int, ldc:int(1327625928))
                goto(Label_0557)
            }
            
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(-1614027494))
            var_5_1D8 = add:int(var_5_1D8:int, ldc:int(-1))
            storeelement:byte(var_3_1D7:byte[], var_5_1D8:int, xor:byte(loadelement:byte(stack_1FE_0:byte[], var_5_1D8:int), ldc:byte(29)))
            
            if (cmpne:boolean(var_5_1D8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_117_0 = stack_119_0 = stack_163_0 = stack_165_0 = stack_18C_0 = stack_1FE_0 = stack_251_0 = stack_2DF_0 = stack_32F_0 = stack_384_0 = var_3_1D7:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0699)
        Label_0557:
        
        while (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0474)
            }
            
            var_0_247 = and:int(var_0_1EC:int, ldc:int(-1084508683))
            var_5_1D8 = add:int(var_5_1D8:int, ldc:int(-1))
            expr_251 = stack_295_2 = loadelement(stack_251_0, var_5_1D8)
            
            if (cmplt:boolean(add:int(add:int(var_5_1D8:int, ldc:int(4)), neg:int(var_4_1D2:int)), ldc:int(0))) {
                stack_295_2 = stack_274_0 = add:byte(expr_251:byte, loadelement:byte(var_3_1D7:byte[], add:int(var_5_1D8:int, ldc:int(4))))
                goto(Label_0644)
            }
            
            Label_0606:
            
            if (cmpne:boolean(and:int(var_0_247:int, ldc:int(8)), ldc:int(0))) {
                var_0_247 = and:int(var_0_247:int, ldc:int(-483097830))
            }
            else {
                var_0_247 = and:int(var_0_247:int, ldc:int(-104127619))
                stack_295_2 = stack_274_0 = add:byte(expr_251:byte, ldc:byte(4))
            }
            
            Label_0644:
            
            if (cmpne:boolean(and:int(var_0_247:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0606)
            }
            
            var_0_1EC = and:int(var_0_247:int, ldc:int(-1284562479))
            storeelement:byte(var_3_1D7:byte[], var_5_1D8:int, stack_295_2:byte)
            
            if (cmpne:boolean(var_5_1D8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_117_0 = stack_119_0 = stack_163_0 = stack_165_0 = stack_18C_0 = stack_1FE_0 = stack_251_0 = stack_2DF_0 = stack_32F_0 = stack_384_0 = var_3_1D7:byte[]
            goto(Label_0170)
        }
        
        var_0_1EC = and:int(var_0_1EC:int, ldc:int(730082937))
        Label_0699:
        
        while (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0474)
            }
            
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(-1711715887))
            var_5_1D8 = add:int(var_5_1D8:int, ldc:int(-1))
            expr_2DF = loadelement:byte(stack_2DF_0:byte[], var_5_1D8:int)
            storeelement:byte(var_3_1D7:byte[], var_5_1D8:int, or:int(and:int(shl:int(expr_2DF:byte, xor:int(ldc:int(-32757), ldc:int(-32753))), ldc:int(-16)), and:int(shr:int(expr_2DF:byte[expected:int], and:int(ldc:int(21), ldc:int(10924))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1D8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_117_0 = stack_119_0 = stack_163_0 = stack_165_0 = stack_18C_0 = stack_1FE_0 = stack_251_0 = stack_2DF_0 = stack_32F_0 = stack_384_0 = var_3_1D7:byte[]
            goto(Label_0220)
        }
        
        var_0_1EC = and:int(var_0_1EC:int, ldc:int(-1541756213))
        goto(Label_0557)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0362)
        }
        
        if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(16)), ldc:int(0))) {
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(1915763059))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(131072)), ldc:int(0))) {
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(-1313288124))
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(256)), ldc:int(0))) {
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(-1076157508))
            expr_A5 = arraylength:int(stack_A5_0:byte[])
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_4_1D2 = expr_A5:int
                var_3_1D7 = newarray:byte[](byte.class, expr_A5:int)
                var_5_1D8 = expr_A5:int
                goto(Label_0557)
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0362)
        }
        
        if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(-372921764))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(-177265704))
            expr_D7 = arraylength:int(stack_D7_0:byte[])
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_4_1D2 = expr_D7:int
                var_3_1D7 = newarray:byte[](byte.class, expr_D7:int)
                var_5_1D8 = expr_D7:int
                goto(Label_0699)
            }
        }
        
        Label_0220:
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(8)), ldc:int(0))) {
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(1974348483))
            goto(Label_0362)
        }
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(1024)), ldc:int(0))) {
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(406239090))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(1024)), ldc:int(0))) {
                var_0_1EC = and:int(var_0_1EC:int, ldc:int(1719357692))
                goto(Label_0170)
            }
            
            if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(-1611944013))
            var_2_117 = stack_117_0:byte[]
            expr_11B = add:int(arraylength:int(stack_119_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_3_31E = newarray:byte[](byte.class, expr_11B:int)
                var_5_31F = expr_11B:int
                
                loop {
                    var_0_1EC = and:int(var_0_1EC:int, ldc:int(-538099820))
                    var_5_31F = add:int(var_5_31F:int, ldc:int(-1))
                    storeelement:byte(var_3_31E:byte[], var_5_31F:int, add:int(shl:int(loadelement:byte(stack_32F_0:byte[], var_5_31F:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_117:byte[], add:int(var_5_31F:int, and:int(ldc:int(5249), ldc:int(8707)))), ldc:int(7)), and:int(ldc:int(4611), ldc:int(165)))))
                    
                    if (cmpne:boolean(var_5_31F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_117_0 = stack_119_0 = stack_163_0 = stack_165_0 = stack_18C_0 = stack_1FE_0 = stack_251_0 = stack_2DF_0 = stack_32F_0 = stack_384_0 = var_3_31E:byte[]
            }
        }
        
        Label_0288:
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(131072)), ldc:int(0))) {
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(-432403338))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(4096)), ldc:int(0))) {
                var_0_1EC = and:int(var_0_1EC:int, ldc:int(1880620862))
                goto(Label_0220)
            }
            
            if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_1EC = and:int(var_0_1EC:int, ldc:int(-1536007499))
                goto(Label_0170)
            }
            
            if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_1EC = and:int(var_0_1EC:int, ldc:int(1865454800))
                goto(Label_0112)
            }
            
            var_0_1EC = and:int(var_0_1EC:int, ldc:int(-1621369578))
            expr_165 = arraylength:int(stack_165_0:byte[])
            
            if (cmpne:boolean(expr_165:int, ldc:int(0))) {
                var_3_373 = newarray:byte[](byte.class, expr_165:int)
                var_5_374 = expr_165:int
                
                loop {
                    var_0_1EC = and:int(var_0_1EC:int, ldc:int(-1856295078))
                    var_5_374 = add:int(var_5_374:int, ldc:int(-1))
                    storeelement:byte(var_3_373:byte[], var_5_374:int, add:byte(loadelement:byte(stack_384_0:byte[], var_5_374:int), ldc:byte(30)))
                    
                    if (cmpne:boolean(var_5_374:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_117_0 = stack_119_0 = stack_163_0 = stack_165_0 = stack_18C_0 = stack_1FE_0 = stack_251_0 = stack_2DF_0 = stack_32F_0 = stack_384_0 = var_3_373:byte[]
            }
        }
        
        Label_0362:
        
        if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0170)
        }
        
        if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(256)), ldc:int(0))) {
            var_3_198 = initobject:String(String::<init>, stack_18C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1CB_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(514), ldc:int(515)))
            expr_1AA = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16481), ldc:int(16480)))
            storeelement:String(expr_1AA:String[], and:int(ldc:int(-23265), ldc:int(23264)), invokevirtual:String[expected:String](String::substring, var_3_198:String, and:int(ldc:int(-17974), ldc:int(17973)), xor:int(ldc:int(28694), ldc:int(28702))))
            putstatic:String[](\u8413\u6b0d\ua562\uc229\u59ec\ub113::\u6435\uc31c\ubb2b\ub8be\u98a4\u51b2, expr_1AA:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u4179\u6c56\u5bc4\ub18d\u8aa5\u7006(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FF : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_60A : int
        
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
        var_3_5FF = and:int(ldc:int(-1884086638), ldc:int(-920134225))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8413\u6b0d\ua562\uc229\u59ec\ub113[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(524288)), ldc:int(0))) {
            var_3_5FF = and:int(var_3_5FF:int, ldc:int(692042369))
        }
        else {
            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-815576349))
            var_5_85 = and:int(ldc:int(17418), ldc:int(-17419))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25554), ldc:int(25537)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5FF:int, ldc:int(-906781526))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(6145), ldc:int(24641)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(2593), ldc:int(2592)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5FF = and:int(var_3_DA:int, ldc:int(-1614951769))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(8704), ldc:int(8705)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(729454027))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1128006313))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(1682433409))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-646730565))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1755317103))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(1089553457))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(1687952703))
                            loopcontinue()
                        }
                        
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1150439437))
                        var_11_EB = and:int(ldc:int(3014), ldc:int(-3015))
                        goto(Label_1411)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-649060639))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1549205014))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1903646346))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(1530433692))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1121367561))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(678161959))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-170686980))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(497039499))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(1184199221))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-76218905))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-114824457))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(2005955041))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(1347449501))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-594827923))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1625851346))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-131250416))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(776794450))
                            loopcontinue()
                        }
                        
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1344042034))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(11266), ldc:int(11267))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(1329655997))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-815841080))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-894935227))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-148218987))
                            loopcontinue()
                        }
                        
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-374612862))
                        var_11_EB = and:int(ldc:int(18497), ldc:int(-18498))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(12668738))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1897659686))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1351899830))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-720846016))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-499817532))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-508482845))
                            loopcontinue()
                        }
                        
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-114692945))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-2021180627))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(1634803143))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(774925387))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-828442162))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-34628430))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1411)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1206435733))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1794869980))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-241736432))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FF = and:int(var_3_5FF:int, ldc:int(-302552378))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1411:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60A = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1422:
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1278760496))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1472159871))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1334555622))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-906558424))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(706473395))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FF = and:int(var_3_5FF:int, ldc:int(-1918772270))
                        var_17_60A = add:int(var_16_119:int, and:int(ldc:int(8193), ldc:int(353)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FF = and:int(var_3_5FF:int, ldc:int(-302958154))
                
                if (cmple:boolean(var_5_85 = var_17_60A:int, sub:int(var_6_8C:int, xor:int(ldc:int(7172), ldc:int(7173))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FF:int, ldc:int(524288)), ldc:int(0))) {
            var_3_5FF = and:int(var_3_5FF:int, ldc:int(-334599088))
            goto(Label_0106)
        }
    }
}
