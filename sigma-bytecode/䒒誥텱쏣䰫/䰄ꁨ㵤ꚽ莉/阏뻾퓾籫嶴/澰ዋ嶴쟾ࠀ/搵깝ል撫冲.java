public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u6435\uae5d\u120d\u64ab\u51b2 {
    public void \u6435\uae5d\u120d\u64ab\u51b2() {
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
            invokespecial:\u5f50\u7bad\ubcb0\u600f\u4975(\u5f50\u7bad\ubcb0\u600f\u4975::<init>, this:\u6435\uae5d\u120d\u64ab\u51b2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ud4fe\ucef1\u647c\uc2bd\u40a9() {
        var_1_7A : int
        var_5_C7 : Runtime
        var_6_CA : Process
        stack_128_0 : Runtime [generated]
        expr_D5 : String[] [generated]
        var_4_14F : InputStream
        var_7_15A : Scanner
        var_8_169 : String
        var_3_1E3 : IOException
        
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
        var_1_7A = and:int(ldc:int(-1723371719), ldc:int(2080519931))
        
        loop {
            if (cmpne:boolean(and:int(var_1_7A:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_7A = and:int(var_1_7A:int, ldc:int(1814936319))
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_1_7A:int, ldc:int(8192)), ldc:int(0))) {
                var_1_7A = and:int(var_1_7A:int, ldc:int(-1277729219))
                
                if (cmpeq:boolean(getstatic:String(\u6435\uae5d\u120d\u64ab\u51b2::\u6b5f\u8d98\uc2bd\u7873\u6fb0), aconstnull:String())) {
                    try {
                        var_5_C7 = invokestatic:Runtime(Runtime::getRuntime)
                        var_6_CA = aconstnull:Process()
                        
                        try {
                            stack_128_0 = var_5_C7:Runtime
                            expr_D5 = newarray:String[](java.lang.String.class, and:int(ldc:int(25630), ldc:int(4612)))
                            storeelement:String(expr_D5:String[], and:int(ldc:int(16986), ldc:int(-29407)), loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), and:int(ldc:int(-10990), ldc:int(8869))))
                            storeelement:String(expr_D5:String[], xor:int(ldc:int(-32760), ldc:int(-32759)), loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), xor:int(ldc:int(5129), ldc:int(5128))))
                            storeelement:String(expr_D5:String[], and:int(ldc:int(19526), ldc:int(8722)), loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), and:int(ldc:int(20626), ldc:int(9223))))
                            storeelement:String(expr_D5:String[], and:int(ldc:int(1543), ldc:int(26939)), loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), and:int(ldc:int(2395), ldc:int(8199))))
                            var_6_CA = invokevirtual:Process(Runtime::exec, stack_128_0:Runtime, expr_D5:String[])
                        }
                        catch (java.io.IOException var_7_134) {
                            putstatic:String(\u6435\uae5d\u120d\u64ab\u51b2::\u6b5f\u8d98\uc2bd\u7873\u6fb0, loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), and:int(ldc:int(16908), ldc:int(390))))
                        }
                        
                        invokevirtual:OutputStream(Process::getOutputStream, var_6_CA:Process)
                        var_4_14F = invokevirtual:InputStream(Process::getInputStream, var_6_CA:Process)
                        var_7_15A = initobject:Scanner(Scanner::<init>, var_4_14F:InputStream)
                        
                        try {
                            while (invokevirtual:boolean(Scanner::hasNext, var_7_15A:Scanner)) {
                                var_8_169 = invokevirtual:String(Scanner::next, var_7_15A:Scanner)
                                
                                try {
                                    if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), and:int(ldc:int(6157), ldc:int(1031))), var_8_169:String[expected:Object])) {
                                        putstatic:String(\u6435\uae5d\u120d\u64ab\u51b2::\u6b5f\u8d98\uc2bd\u7873\u6fb0, invokevirtual:String(String::trim, invokevirtual:String(Scanner::next, var_7_15A:Scanner)))
                                        looporswitchbreak()
                                    }
                                    
                                    loopcontinue()
                                }
                                catch (java.util.NoSuchElementException var_9_197) {
                                    putstatic:String(\u6435\uae5d\u120d\u64ab\u51b2::\u6b5f\u8d98\uc2bd\u7873\u6fb0, loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), xor:int(ldc:int(16676), ldc:int(16674))))
                                }
                            }
                        }
                        finally {
                            invokevirtual:void(InputStream::close, var_4_14F:InputStream)
                        }
                        
                        if (cmpeq:boolean(getstatic:String(\u6435\uae5d\u120d\u64ab\u51b2::\u6b5f\u8d98\uc2bd\u7873\u6fb0), aconstnull:String())) {
                            putstatic:String(\u6435\uae5d\u120d\u64ab\u51b2::\u6b5f\u8d98\uc2bd\u7873\u6fb0, loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), and:int(ldc:int(1047), ldc:int(31047))))
                        }
                    }
                    catch (java.io.IOException var_3_1E3) {
                        invokevirtual:void(Throwable::printStackTrace, var_3_1E3:IOException[expected:Throwable])
                    }
                    
                    return:String(putstatic:String(\u6435\uae5d\u120d\u64ab\u51b2::\u6b5f\u8d98\uc2bd\u7873\u6fb0, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getstatic:String(\u6435\uae5d\u120d\u64ab\u51b2::\u6b5f\u8d98\uc2bd\u7873\u6fb0)), loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), xor:int(ldc:int(-22524), ldc:int(-22516)))), invokestatic:String(System::getProperty, loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), and:int(ldc:int(4235), ldc:int(27673))))), loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), xor:int(ldc:int(65), ldc:int(73)))), invokestatic:String(System::getProperty, loadelement:String(getstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6), and:int(ldc:int(14), ldc:int(3338))))))))
                }
            }
            
            Label_0129:
            
            if (cmpeq:boolean(and:int(var_1_7A:int, ldc:int(1)), ldc:int(0))) {
                var_1_7A = and:int(var_1_7A:int, ldc:int(1036793195))
            }
            else {
                if (cmpne:boolean(and:int(var_1_7A:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_7A = and:int(var_1_7A:int, ldc:int(931355258))
                    loopcontinue()
                }
                
                var_1_7A = and:int(var_1_7A:int, ldc:int(1066870617))
            }
            
            Label_0164:
            
            if (cmpeq:boolean(and:int(var_1_7A:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0129)
            }
            
            if (cmpne:boolean(and:int(var_1_7A:int, ldc:int(2147483647)), ldc:int(0))) {
                return:String(getstatic:String(\u6435\uae5d\u120d\u64ab\u51b2::\u6b5f\u8d98\uc2bd\u7873\u6fb0))
            }
        }
    }
    
    static {
        var_0_27F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_87_0 : byte[] [generated]
        stack_89_0 : byte[] [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_291_0 : byte[] [generated]
        stack_2F9_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_21C : byte[]
        var_4_21D : int
        expr_89 : int [generated]
        var_5_26C : int
        var_3_271 : byte[]
        var_4_272 : int
        expr_294 : byte [generated]
        var_0_2EF : int
        expr_2F9 : byte [generated]
        stack_327_2 : byte [generated]
        expr_A5 : int [generated]
        var_3_D2 : String
        stack_213_0 : String[] [generated]
        expr_E4 : String[] [generated]
        
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
            var_0_27F = and:int(ldc:int(931097734), ldc:int(-25333890))
            expr_65 = var_2_69 = stack_87_0 = stack_89_0 = stack_A3_0 = stack_A5_0 = stack_C6_0 = stack_291_0 = stack_2F9_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("By1LYUKjZ2tPU2dbM3Flf1i9ZRtlW2dyu0cdZr9m2LOHArVFbtyb/y9tVUC7Zx1mv2KrZwK1RWNXQ2l1WUNhe0ddZr9ja2dCtUVle2SnSvFb83FVYWSnSu1fx11pdXlRSgYA"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_21C = newarray:byte[](byte.class, expr_6D:int)
                var_4_21D = expr_6D:int
                
                loop {
                    var_0_27F = and:int(var_0_27F:int, ldc:int(-1074961569))
                    var_4_21D = add:int(var_4_21D:int, ldc:int(-1))
                    storeelement:byte(var_3_21C:byte[], var_4_21D:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_21D:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_21D:int, xor:int(ldc:int(5), ldc:int(4)))), ldc:int(5)), and:int(ldc:int(1095), ldc:int(16927)))))
                    
                    if (cmpne:boolean(var_4_21D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_89_0 = stack_87_0 = stack_A3_0 = stack_A5_0 = stack_C6_0 = stack_291_0 = stack_2F9_0 = var_3_21C:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_27F:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0170)
                }
                
                if (cmpeq:boolean(and:int(var_0_27F:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0142)
                }
                
                var_0_27F = and:int(var_0_27F:int, ldc:int(-1073775857))
                expr_89 = arraylength:int(stack_89_0:byte[])
                
                if (cmpeq:boolean(expr_89:int, ldc:int(0))) {
                    goto(Label_0142)
                }
                
                var_5_26C = expr_89:int
                var_3_271 = newarray:byte[](byte.class, expr_89:int)
                var_4_272 = expr_89:int
                Label_0628:
                
                while (cmpne:boolean(and:int(var_0_27F:int, ldc:int(2)), ldc:int(0))) {
                    var_0_27F = and:int(var_0_27F:int, ldc:int(-9438130))
                    var_4_272 = add:int(var_4_272:int, ldc:int(-1))
                    expr_294 = xor:byte(loadelement:byte(stack_291_0:byte[], var_4_272:int), ldc:byte(37))
                    storeelement:byte(var_3_271:byte[], var_4_272:int, add:int(or:int(and:int(shl:int(expr_294:byte, and:int(ldc:int(302), ldc:int(16452))), ldc:int(-16)), and:int(shr:int(expr_294:byte[expected:int], xor:int(ldc:int(655), ldc:int(651))), ldc:int(15))), ldc:int(16)))
                    
                    if (cmpne:boolean(var_4_272:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_89_0 = stack_87_0 = stack_A3_0 = stack_A5_0 = stack_C6_0 = stack_291_0 = stack_2F9_0 = var_3_271:byte[]
                    goto(Label_0142)
                }
                
                var_0_27F = and:int(var_0_27F:int, ldc:int(-1983634281))
                Label_0732:
                
                while (cmpne:boolean(and:int(var_0_27F:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_2EF = and:int(var_0_27F:int, ldc:int(2138799126))
                    var_4_272 = add:int(var_4_272:int, ldc:int(-1))
                    expr_2F9 = loadelement:byte(stack_2F9_0:byte[], var_4_272:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_272:int, ldc:int(2)), neg:int(var_5_26C:int)), ldc:int(0))) {
                        var_0_2EF = and:int(var_0_2EF:int, ldc:int(1073606758))
                        stack_327_2 = add:byte(expr_2F9:byte, ldc:byte(2))
                    }
                    else {
                        stack_327_2 = add:byte(expr_2F9:byte, loadelement:byte(var_3_271:byte[], add:int(var_4_272:int, ldc:int(2))))
                    }
                    
                    var_0_27F = and:int(var_0_2EF:int, ldc:int(-40377))
                    storeelement:byte(var_3_271:byte[], var_4_272:int, stack_327_2:byte)
                    
                    if (cmpne:boolean(var_4_272:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_89_0 = stack_87_0 = stack_A3_0 = stack_A5_0 = stack_C6_0 = stack_291_0 = stack_2F9_0 = var_3_271:byte[]
                    goto(Label_0170)
                }
                
                var_0_27F = and:int(var_0_27F:int, ldc:int(-1746164796))
                goto(Label_0628)
                Label_0142:
                
                if (cmpne:boolean(and:int(var_0_27F:int, ldc:int(268435456)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_27F:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_27F = and:int(var_0_27F:int, ldc:int(2122051095))
                    expr_A5 = arraylength:int(stack_A5_0:byte[])
                    
                    if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                        var_5_26C = expr_A5:int
                        var_3_271 = newarray:byte[](byte.class, expr_A5:int)
                        var_4_272 = expr_A5:int
                        goto(Label_0732)
                    }
                }
                
                Label_0170:
                
                if (cmpeq:boolean(and:int(var_0_27F:int, ldc:int(2)), ldc:int(0))) {
                    var_0_27F = and:int(var_0_27F:int, ldc:int(-722027372))
                    goto(Label_0142)
                }
                
                if (cmpne:boolean(and:int(var_0_27F:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_D2 = initobject:String(String::<init>, stack_C6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_213_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(11), ldc:int(1291)))
            expr_E4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32630), ldc:int(-32639)))
            storeelement:String(expr_E4:String[], and:int(ldc:int(2090), ldc:int(13065)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(4234), ldc:int(-4235)), xor:int(ldc:int(-32749), ldc:int(-32750))))
            storeelement:String(expr_E4:String[], xor:int(ldc:int(4098), ldc:int(4102)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, xor:int(ldc:int(2176), ldc:int(2177)), xor:int(ldc:int(8546), ldc:int(8558))))
            storeelement:String(expr_E4:String[], xor:int(ldc:int(2850), ldc:int(2852)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, xor:int(ldc:int(4256), ldc:int(4268)), and:int(ldc:int(5145), ldc:int(9113))))
            storeelement:String(expr_E4:String[], and:int(ldc:int(5127), ldc:int(8743)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, xor:int(ldc:int(-28641), ldc:int(-28666)), xor:int(ldc:int(8309), ldc:int(8280))))
            storeelement:String(expr_E4:String[], and:int(ldc:int(71), ldc:int(4997)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(4141), ldc:int(301)), xor:int(ldc:int(548), ldc:int(541))))
            storeelement:String(expr_E4:String[], xor:int(ldc:int(-16127), ldc:int(-16128)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, xor:int(ldc:int(-16378), ldc:int(-16321)), and:int(ldc:int(8253), ldc:int(255))))
            storeelement:String(expr_E4:String[], xor:int(ldc:int(-32494), ldc:int(-32496)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(2429), ldc:int(8253)), and:int(ldc:int(22992), ldc:int(9324))))
            storeelement:String(expr_E4:String[], and:int(ldc:int(9271), ldc:int(20483)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(576), ldc:int(506)), xor:int(ldc:int(32), ldc:int(108))))
            storeelement:String(expr_E4:String[], and:int(ldc:int(14987), ldc:int(94)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, xor:int(ldc:int(80), ldc:int(28)), xor:int(ldc:int(17331), ldc:int(17382))))
            storeelement:String(expr_E4:String[], xor:int(ldc:int(230), ldc:int(239)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(4853), ldc:int(9301)), xor:int(ldc:int(24668), ldc:int(24578))))
            storeelement:String(expr_E4:String[], and:int(ldc:int(-11838), ldc:int(11293)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, xor:int(ldc:int(17132), ldc:int(17074)), xor:int(ldc:int(16475), ldc:int(16441))))
            putstatic:String[](\u6435\uae5d\u120d\u64ab\u51b2::\u6435\u8413\u8d90\u9af2\u97e6, expr_E4:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u92ee\ub18d\u4e72\u760c\u600f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61F : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_62A : int
        
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
        var_3_61F = and:int(ldc:int(1892127198), ldc:int(-18359082))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6435\uae5d\u120d\u64ab\u51b2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_61F = and:int(var_3_61F:int, ldc:int(-1003419512))
        }
        else {
            var_3_61F = and:int(var_3_61F:int, ldc:int(-354445590))
            var_5_85 = and:int(ldc:int(-2918), ldc:int(2917))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17865), ldc:int(-17866)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61F:int, ldc:int(1727119329))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(24576), ldc:int(24577)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(18), ldc:int(19)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61F = and:int(var_3_DA:int, ldc:int(-237110336))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8729), ldc:int(1281)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(291457271))
                        goto(Label_1480)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1728049994))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(358697660))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1112)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-2042074641))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1760316205))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1514316206))
                    }
                    else {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1459198581))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(11004613))
                        goto(Label_1480)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(352091580))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1112)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-918527734))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-81800275))
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1185208797))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(1760671088))
                            var_11_EB = and:int(ldc:int(-1002), ldc:int(1001))
                            goto(Label_1469)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1587786417))
                        goto(Label_1480)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(848793310))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1112)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(990142462))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1320938238))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1103606857))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0689:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1279339231))
                        goto(Label_1480)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(374042536))
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1296062137))
                        goto(Label_1112)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1027491731))
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1398325574))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(107497866))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-764922761))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-104205965))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1400849087))
                        goto(Label_1480)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1608892930))
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1591557534))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1112)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-574707561))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-219552249))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1540338377))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(5120), ldc:int(5121))
                                goto(Label_1112)
                            }
                        }
                    }
                    
                    Label_0966:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(635608231))
                        goto(Label_1480)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(1618118710))
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(1526742652))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1543484129))
                        var_11_EB = and:int(ldc:int(-2191), ldc:int(2190))
                    }
                    
                    Label_1112:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(852210842))
                        goto(Label_1480)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-2124624810))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0966)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-673708880))
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1657403223))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1339)
                            }
                        }
                    }
                    
                    Label_1221:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-800343501))
                        goto(Label_1480)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1112)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(630527014))
                            goto(Label_0966)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1300810047))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-557346568))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1469)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1339:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-473894283))
                        goto(Label_1480)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1328168597))
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1164615832))
                        goto(Label_1112)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1071115678))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61F = and:int(var_3_61F:int, ldc:int(2010364101))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1469:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62A = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1480:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1112)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-2003602292))
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1830372034))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1693046103))
                        var_17_62A = add:int(var_16_119:int, xor:int(ldc:int(-20472), ldc:int(-20471)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61F = and:int(var_3_61F:int, ldc:int(-540806816))
                
                if (cmple:boolean(var_5_85 = var_17_62A:int, sub:int(var_6_8C:int, xor:int(ldc:int(272), ldc:int(273))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
            var_3_61F = and:int(var_3_61F:int, ldc:int(1187869256))
            goto(Label_0106)
        }
    }
}
