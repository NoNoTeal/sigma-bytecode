public final class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3 {
    public void \u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3(java.nio.file.Path p0) {
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
            putfield:Path(\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3::\ufe34\u7c6b\u0b8e\uc238\u52d3\ucb79, this:\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3, p0:Path)
            invokespecial:Object(Object::<init>, this:\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean getAsBoolean() {
        var_1_87 : int
        stack_94_0 : int [generated]
        var_3_99 : IOException
        
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
        var_1_87 = and:int(ldc:int(-1412822520), ldc:int(-321491256))
        
        try {
            loop {
                if (cmpeq:boolean(and:int(var_1_87:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_87 = and:int(var_1_87:int, ldc:int(-1327777001))
                    invokestatic:boolean(Files::deleteIfExists, getfield:Path(\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3::\ufe34\u7c6b\u0b8e\uc238\u52d3\ucb79, this:\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3))
                }
                
                if (cmpne:boolean(and:int(var_1_87:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_87 = and:int(var_1_87:int, ldc:int(-1192929525))
            }
            
            var_1_87 = and:int(var_1_87:int, ldc:int(-184783242))
            stack_94_0 = and:int(ldc:int(4103), ldc:int(1))
            var_1_87 = and:int(var_1_87:int, ldc:int(-490411358))
            return:boolean(stack_94_0:int)
        }
        catch (java.io.IOException var_3_99) {
            invokeinterface:void(Logger::warn, invokestatic:Logger(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u64ab\ub18d\u6d99\ua068\u72f1\ua068), loadelement:String(getstatic:String[](\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3::\uc4d2\uc246\ud12e\u74b1\uf995\u516c), and:int(ldc:int(8921), ldc:int(-8922))), var_3_99:IOException[expected:Throwable])
            return:boolean(and:int[expected:boolean](ldc:int(27655), ldc:int(-31776)))
        }
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3::\uc4d2\uc246\ud12e\u74b1\uf995\u516c), and:int(ldc:int(81), ldc:int(297)))), getfield:Path[expected:Object](\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3::\ufe34\u7c6b\u0b8e\uc238\u52d3\ucb79, this:\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_240 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1B4_0 : byte[] [generated]
        stack_1EE_0 : byte[] [generated]
        stack_252_0 : byte[] [generated]
        stack_2CA_0 : byte[] [generated]
        var_4_197 : int
        var_3_19C : byte[]
        var_5_19D : int
        var_0_26A : int
        expr_252 : byte [generated]
        stack_296_2 : byte [generated]
        stack_26D_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1DD : byte[]
        var_5_1DE : int
        expr_D3 : int [generated]
        expr_106 : int [generated]
        var_3_2B9 : byte[]
        var_5_2BA : int
        expr_2CA : byte [generated]
        var_3_142 : String
        stack_190_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_240 = and:int(ldc:int(1998245416), ldc:int(-734789910))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1B4_0 = stack_1EE_0 = stack_252_0 = stack_2CA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("WWJbGZgYi3Ubz2uaGZhnnBuaGZhnnUg0nliIIA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_197 = expr_6B:int
        var_3_19C = newarray:byte[](byte.class, expr_6B:int)
        var_5_19D = expr_6B:int
        Label_0415:
        
        while (cmpne:boolean(and:int(var_0_240:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(767450938))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, xor:byte(loadelement:byte(stack_1B4_0:byte[], var_5_19D:int), ldc:byte(88)))
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1B4_0 = stack_1EE_0 = stack_252_0 = stack_2CA_0 = var_3_19C:byte[]
            goto(Label_0112)
        }
        
        Label_0565:
        
        while (cmpeq:boolean(and:int(var_0_240:int, ldc:int(4096)), ldc:int(0))) {
            var_0_26A = and:int(var_0_240:int, ldc:int(-1638170965))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_252 = stack_296_2 = loadelement(stack_252_0, var_5_19D)
            
            if (cmplt:boolean(add:int(add:int(var_5_19D:int, ldc:int(1)), neg:int(var_4_197:int)), ldc:int(0))) {
                stack_296_2 = stack_26D_0 = add:byte(expr_252:byte, loadelement:byte(var_3_19C:byte[], add:int(var_5_19D:int, ldc:int(1))))
                goto(Label_0637)
            }
            
            Label_0607:
            
            if (cmpne:boolean(and:int(var_0_26A:int, ldc:int(512)), ldc:int(0))) {
                var_0_26A = and:int(var_0_26A:int, ldc:int(-978084115))
                stack_296_2 = stack_26D_0 = add:byte(expr_252:byte, ldc:byte(1))
            }
            
            Label_0637:
            
            if (cmpeq:boolean(and:int(var_0_26A:int, ldc:int(131072)), ldc:int(0))) {
                var_0_26A = and:int(var_0_26A:int, ldc:int(1661744167))
                goto(Label_0607)
            }
            
            var_0_240 = and:int(var_0_26A:int, ldc:int(-553726417))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, stack_296_2:byte)
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1B4_0 = stack_1EE_0 = stack_252_0 = stack_2CA_0 = var_3_19C:byte[]
            goto(Label_0216)
        }
        
        var_0_240 = and:int(var_0_240:int, ldc:int(-1829036686))
        goto(Label_0415)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(325622716))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(581861038))
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(4096)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(523962350))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1DD = newarray:byte[](byte.class, expr_A0:int)
                var_5_1DE = expr_A0:int
                
                loop {
                    var_0_240 = and:int(var_0_240:int, ldc:int(-1233952920))
                    var_5_1DE = add:int(var_5_1DE:int, ldc:int(-1))
                    storeelement:byte(var_3_1DD:byte[], var_5_1DE:int, add:int(shl:int(loadelement:byte(stack_1EE_0:byte[], var_5_1DE:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1DE:int, xor:int(ldc:int(2689), ldc:int(2688)))), ldc:int(2)), and:int(ldc:int(4735), ldc:int(24639)))))
                    
                    if (cmpne:boolean(var_5_1DE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1B4_0 = stack_1EE_0 = stack_252_0 = stack_2CA_0 = var_3_1DD:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(-946495360))
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(8)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(261057829))
                goto(Label_0112)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(668966907))
            expr_D3 = arraylength:int(stack_D3_0:byte[])
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_4_197 = expr_D3:int
                var_3_19C = newarray:byte[](byte.class, expr_D3:int)
                var_5_19D = expr_D3:int
                goto(Label_0565)
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(64)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(1545985388))
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(-466888023))
                goto(Label_0112)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(1582546618))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_3_2B9 = newarray:byte[](byte.class, expr_106:int)
                var_5_2BA = expr_106:int
                
                loop {
                    var_0_240 = and:int(var_0_240:int, ldc:int(487794302))
                    var_5_2BA = add:int(var_5_2BA:int, ldc:int(-1))
                    expr_2CA = loadelement:byte(stack_2CA_0:byte[], var_5_2BA:int)
                    storeelement:byte(var_3_2B9:byte[], var_5_2BA:int, add:int(or:int(and:int(shl:int(expr_2CA:byte, xor:int(ldc:int(-15231), ldc:int(-15227))), ldc:int(-16)), and:int(shr:int(expr_2CA:byte[expected:int], xor:int(ldc:int(-31731), ldc:int(-31735))), ldc:int(15))), ldc:int(47)))
                    
                    if (cmpne:boolean(var_5_2BA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1B4_0 = stack_1EE_0 = stack_252_0 = stack_2CA_0 = var_3_2B9:byte[]
            }
        }
        
        Label_0267:
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(-835281778))
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(8)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(-1433020172))
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(131072)), ldc:int(0))) {
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_190_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4106), ldc:int(6)))
            expr_154 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(641), ldc:int(643)))
            storeelement:String(expr_154:String[], and:int(ldc:int(-9989), ldc:int(9988)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(13635), ldc:int(-14152)), and:int(ldc:int(16472), ldc:int(8371))))
            storeelement:String(expr_154:String[], and:int(ldc:int(17473), ldc:int(643)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(4116), ldc:int(4100)), xor:int(ldc:int(49), ldc:int(42))))
            putstatic:String[](\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3::\uc4d2\uc246\ud12e\u74b1\uf995\u516c, expr_154:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ufcaf\u0800\ub171\u97e6\u74b1\u98a4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_650 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_65B : int
        
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
        var_3_650 = and:int(ldc:int(386095026), ldc:int(-1568055330))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8bb0\ucfaf\ubb2b\uc87f\u8753\u52d3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_650 = and:int(var_3_650:int, ldc:int(546705954))
        }
        else {
            var_3_650 = and:int(var_3_650:int, ldc:int(-174274))
            var_5_85 = and:int(ldc:int(3040), ldc:int(-19442))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6582), ldc:int(-6583)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_650:int, ldc:int(1672058813))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(3), ldc:int(2)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(16776), ldc:int(16777)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_650 = and:int(var_3_D2:int, ldc:int(-2024859779))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4253), ldc:int(2049)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(1237813609))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-2124236973))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-1274461113))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-524725577))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(1389678434))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(346117297))
                    }
                    else {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-1695695043))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-33190196))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-218128454))
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(1636988225))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(906730571))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(1564552488))
                            loopcontinue()
                        }
                        
                        var_3_650 = and:int(var_3_650:int, ldc:int(-681574446))
                        var_11_E3 = and:int(ldc:int(-31768), ldc:int(31763))
                        goto(Label_1473)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-883230716))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-2134581376))
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(512)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-1216271046))
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-172577401))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(1)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(857705919))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(1529589099))
                            loopcontinue()
                        }
                        
                        var_3_650 = and:int(var_3_650:int, ldc:int(1591580501))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(4)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-1698590333))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-879012177))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(201384881))
                        goto(Label_1120)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(1599853735))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(512)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(-1447236029))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(-361364878))
                            loopcontinue()
                        }
                        
                        var_3_650 = and:int(var_3_650:int, ldc:int(2142371802))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0833:
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-984015857))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(512)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(256337681))
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(-124354348))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(256)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(-1658878642))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(-197180968))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_650 = and:int(var_3_650:int, ldc:int(-210913417))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(16393), ldc:int(5383))
                                goto(Label_1120)
                            }
                        }
                    }
                    
                    Label_0958:
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(4)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(1918822078))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(617497745))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(125053673))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(-1796915198))
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(-344783980))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_650 = and:int(var_3_650:int, ldc:int(-968122538))
                        var_11_E3 = and:int(ldc:int(17737), ldc:int(-17882))
                    }
                    
                    Label_1120:
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(1272382908))
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(256)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(1376522590))
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(-1124073162))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(1854493914))
                            loopcontinue()
                        }
                        
                        var_3_650 = and:int(var_3_650:int, ldc:int(-537559141))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1363)
                            }
                        }
                    }
                    
                    Label_1236:
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(2030429739))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1120)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(1291498541))
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(16)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(-1304436497))
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_650:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(-2145881203))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_650 = and:int(var_3_650:int, ldc:int(859553685))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1473)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1363:
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(782124028))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(1643091093))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_650 = and:int(var_3_650:int, ldc:int(-1881850019))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1473:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65B = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1484:
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(256)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-1333250388))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(474781477))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(943112803))
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(525454516))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_650:int, ldc:int(1)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(1074931339))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(-159811267))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_650 = and:int(var_3_650:int, ldc:int(123434869))
                        var_17_65B = add:int(var_16_111:int, and:int(ldc:int(6161), ldc:int(1447)))
                        looporswitchbreak()
                    }
                    
                    var_3_650 = and:int(var_3_650:int, ldc:int(-224272720))
                }
                
                var_3_650 = and:int(var_3_650:int, ldc:int(-1305125066))
                
                if (cmple:boolean(var_5_85 = var_17_65B:int, sub:int(var_6_8C:int, xor:int(ldc:int(10252), ldc:int(10253))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_650:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
