public class \u6435\ub8be\u718f\u6b0d\u67e9.\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9 {
    public void \uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9(int p0, int p1) {
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
            invokespecial:Object(Object::<init>, this:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9)
            putfield:int(\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\ub171\ub32d\ub32d\u4f4a\u3711\uc910, this:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9, invokestatic:int(Math::min, p0:int, p1:int))
            putfield:int(\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\u1833\u4c2b\u7d52\ubefe\u8350\u8258, this:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9, invokestatic:int(Math::max, p0:int, p1:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5654\u6fb0\u4c2b\u92ff\u6d69\ua3b4(int p0) {
        var_2_87 : int
        stack_B1_0 : int [generated]
        
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
        var_2_87 = and:int(ldc:int(-989123434), ldc:int(-432285737))
        
        if (cmpge:boolean(p0:int, getfield:int(\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\ub171\ub32d\ub32d\u4f4a\u3711\uc910, this:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9))) {
            do {
                if (cmpeq:boolean(and:int(var_2_87:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_87 = and:int(var_2_87:int, ldc:int(-437571666))
                    
                    if (cmpgt:boolean(p0:int, getfield:int(\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\u1833\u4c2b\u7d52\ubefe\u8350\u8258, this:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9))) {
                        loopcontinue()
                    }
                    
                    stack_B1_0 = and:int[expected:boolean](ldc:int(805), ldc:int(9217))
                    return:boolean(stack_B1_0:boolean)
                }
            } while (cmpne:boolean(and:int(var_2_87:int, ldc:int(16384)), ldc:int(0)))
            
            var_2_87 = and:int(var_2_87:int, ldc:int(-1621116930))
            stack_B1_0 = and:int[expected:boolean](ldc:int(15002), ldc:int(-15004))
            return:boolean(stack_B1_0:boolean[expected:int])
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(1159), ldc:int(-1208)))
    }
    
    public int \ubefe\u7af6\u9255\uc29a\u4492\u071d() {
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
            return:int(getfield:int(\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\ub171\ub32d\ub32d\u4f4a\u3711\uc910, this:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9))
        }
        
        goto(Label_0006)
    }
    
    public int \u3bd6\u74b1\uc29a\u6d69\u7ce1\u3e2a() {
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
            return:int(getfield:int(\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\u1833\u4c2b\u7d52\ubefe\u8350\u8258, this:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\u3e2a\u3711\u3711\u6bb9\u7c6b\u4bc8), and:int(ldc:int(-6625), ldc:int(6624)))), getfield:int(\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\ub171\ub32d\ub32d\u4f4a\u3711\uc910, this:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9)), loadelement:String(getstatic:String[](\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\u3e2a\u3711\u3711\u6bb9\u7c6b\u4bc8), xor:int(ldc:int(-22526), ldc:int(-22525)))), getfield:int(\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\u1833\u4c2b\u7d52\ubefe\u8350\u8258, this:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_142 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_154_0 : byte[] [generated]
        stack_1D3_0 : byte[] [generated]
        stack_229_0 : byte[] [generated]
        var_4_12F : int
        var_3_134 : byte[]
        var_5_135 : int
        var_0_14A : int
        expr_154 : byte [generated]
        stack_198_2 : byte [generated]
        stack_177_0 : byte [generated]
        expr_1D9 : byte [generated]
        expr_8F : int [generated]
        var_2_B1 : byte[]
        expr_B5 : int [generated]
        var_3_218 : byte[]
        var_5_219 : int
        var_3_DA : String
        stack_128_0 : String[] [generated]
        expr_EC : String[] [generated]
        
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
        var_0_142 = and:int(ldc:int(-1236764494), ldc:int(1946146731))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_154_0 = stack_1D3_0 = stack_229_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MM8koA1Y1wTw1WCIjw==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_12F = expr_6B:int
        var_3_134 = newarray:byte[](byte.class, expr_6B:int)
        var_5_135 = expr_6B:int
        Label_0311:
        
        while (cmpne:boolean(and:int(var_0_142:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_14A = and:int(var_0_142:int, ldc:int(2129748207))
            var_5_135 = add:int(var_5_135:int, ldc:int(-1))
            expr_154 = stack_198_2 = loadelement(stack_154_0, var_5_135)
            
            if (cmplt:boolean(add:int(add:int(var_5_135:int, ldc:int(1)), neg:int(var_4_12F:int)), ldc:int(0))) {
                stack_198_2 = stack_177_0 = add:byte(expr_154:byte, loadelement:byte(var_3_134:byte[], add:int(var_5_135:int, ldc:int(1))))
                goto(Label_0391)
            }
            
            Label_0353:
            
            if (cmpeq:boolean(and:int(var_0_14A:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_14A = and:int(var_0_14A:int, ldc:int(866632549))
            }
            else {
                var_0_14A = and:int(var_0_14A:int, ldc:int(-231551761))
                stack_198_2 = stack_177_0 = add:byte(expr_154:byte, ldc:byte(1))
            }
            
            Label_0391:
            
            if (cmpeq:boolean(and:int(var_0_14A:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0353)
            }
            
            var_0_142 = and:int(var_0_14A:int, ldc:int(-1286641729))
            storeelement:byte(var_3_134:byte[], var_5_135:int, stack_198_2:byte)
            
            if (cmpne:boolean(var_5_135:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_154_0 = stack_1D3_0 = stack_229_0 = var_3_134:byte[]
            goto(Label_0112)
        }
        
        var_0_142 = and:int(var_0_142:int, ldc:int(1720821339))
        Label_0446:
        
        while (cmpne:boolean(and:int(var_0_142:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_142 = and:int(var_0_142:int, ldc:int(-18746641))
            var_5_135 = add:int(var_5_135:int, ldc:int(-1))
            expr_1D9 = add:byte(xor:byte(loadelement:byte(stack_1D3_0:byte[], var_5_135:int), ldc:byte(6)), ldc:byte(106))
            storeelement:byte(var_3_134:byte[], var_5_135:int, or:int(and:int(shl:int(expr_1D9:byte, and:int(ldc:int(9540), ldc:int(4))), ldc:int(-16)), and:int(shr:int(expr_1D9:byte[expected:int], xor:int(ldc:int(-28413), ldc:int(-28409))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_135:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_154_0 = stack_1D3_0 = stack_229_0 = var_3_134:byte[]
            goto(Label_0148)
        }
        
        goto(Label_0311)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_142:int, ldc:int(256)), ldc:int(0))) {
            var_0_142 = and:int(var_0_142:int, ldc:int(-2078773164))
            goto(Label_0186)
        }
        
        if (cmpne:boolean(and:int(var_0_142:int, ldc:int(2)), ldc:int(0))) {
            var_0_142 = and:int(var_0_142:int, ldc:int(-491197777))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_12F = expr_8F:int
                var_3_134 = newarray:byte[](byte.class, expr_8F:int)
                var_5_135 = expr_8F:int
                goto(Label_0446)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_142:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_142 = and:int(var_0_142:int, ldc:int(-273276860))
        }
        else {
            if (cmpne:boolean(and:int(var_0_142:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_142 = and:int(var_0_142:int, ldc:int(773519274))
            var_2_B1 = stack_B1_0:byte[]
            expr_B5 = add:int(arraylength:int(stack_B3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_3_218 = newarray:byte[](byte.class, expr_B5:int)
                var_5_219 = expr_B5:int
                
                loop {
                    var_0_142 = and:int(var_0_142:int, ldc:int(707592186))
                    var_5_219 = add:int(var_5_219:int, ldc:int(-1))
                    storeelement:byte(var_3_218:byte[], var_5_219:int, add:int(shl:int(loadelement:byte(stack_229_0:byte[], var_5_219:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_B1:byte[], add:int(var_5_219:int, and:int(ldc:int(24833), ldc:int(741)))), ldc:int(6)), and:int(ldc:int(3387), ldc:int(21127)))))
                    
                    if (cmpne:boolean(var_5_219:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_154_0 = stack_1D3_0 = stack_229_0 = var_3_218:byte[]
            }
        }
        
        Label_0186:
        
        if (cmpeq:boolean(and:int(var_0_142:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0148)
        }
        
        if (cmpne:boolean(and:int(var_0_142:int, ldc:int(128)), ldc:int(0))) {
            var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_128_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1666), ldc:int(14402)))
            expr_EC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(205), ldc:int(207)))
            storeelement:String(expr_EC:String[], and:int(ldc:int(297), ldc:int(1045)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(7760), ldc:int(-7769)), xor:int(ldc:int(2101), ldc:int(2098))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(17050), ldc:int(-17083)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(12591), ldc:int(23)), xor:int(ldc:int(280), ldc:int(276))))
            putstatic:String[](\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::\u3e2a\u3711\u3711\u6bb9\u7c6b\u4bc8, expr_EC:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u16f6\u5245\uceb8\u4bc8\ub19c\u6cfe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_600 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60B : int
        
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
        var_3_600 = and:int(ldc:int(1559969378), ldc:int(-1023430929))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(512)), ldc:int(0))) {
            var_3_600 = and:int(var_3_600:int, ldc:int(1709131275))
        }
        else {
            var_3_600 = and:int(var_3_600:int, ldc:int(-592035990))
            var_5_85 = and:int(ldc:int(-3247), ldc:int(3244))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-27261), ldc:int(16980)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_600:int, ldc:int(1559756507))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(16769), ldc:int(8195)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(6419), ldc:int(26113)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_600 = and:int(var_3_D2:int, ldc:int(2128347095))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(4160), ldc:int(4161)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-960782229))
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(2112013522))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(798523111))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-809526674))
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1668680117))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1500074276))
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1080443319))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(333868674))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-1881948204))
                            var_11_E3 = and:int(ldc:int(-23178), ldc:int(23177))
                            goto(Label_1412)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1144481009))
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(721175571))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-221072445))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1615659868))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1541984790))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1180700674))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-933893019))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-794889907))
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1111753980))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(512)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(2068085913))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-243614286))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-73400625))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-103567405))
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-540640584))
                        goto(Label_1293)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(491490128))
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1763491313))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1974008381))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-1781580463))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-116469962))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1632129200))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(4195), ldc:int(2193))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-793014555))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(366685771))
                        var_11_E3 = and:int(ldc:int(16983), ldc:int(-19032))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-726287497))
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-676711489))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(686952955))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1661792729))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(512)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-2123058189))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(2080031934))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-1047571783))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(179449416))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1293)
                            }
                        }
                    }
                    
                    Label_1175:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1319676154))
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-99788289))
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-726822076))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1119698632))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1412)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1293:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1684008318))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(2129373570))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(778316339))
                        loopcontinue()
                    }
                    
                    var_3_600 = and:int(var_3_600:int, ldc:int(1387359849))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1412:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60B = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1423:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(386426207))
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(2033427557))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1122264678))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(371110036))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1439903711))
                        var_17_60B = add:int(var_16_111:int, and:int(ldc:int(9), ldc:int(24897)))
                        looporswitchbreak()
                    }
                    
                    var_3_600 = and:int(var_3_600:int, ldc:int(565067352))
                }
                
                var_3_600 = and:int(var_3_600:int, ldc:int(228015815))
                
                if (cmple:boolean(var_5_85 = var_17_60B:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32670), ldc:int(-32669))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
