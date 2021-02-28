public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u3776\u600f\u5245\u62da\u6b5f\uafe7 {
    public void \u3776\u600f\u5245\u62da\u6b5f\uafe7() {
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
            invokespecial:Object(Object::<init>, this:\u3776\u600f\u5245\u62da\u6b5f\uafe7)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u6ec6\u5fe1\ub18d\u97b7\u92ff\ub32d(int p0) {
        var_1_6B : int
        
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
        var_1_6B = and:int(ldc:int(2102911241), ldc:int(-436743221))
        
        loop {
            if (cmpne:boolean(and:int(var_1_6B:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_6B = and:int(var_1_6B:int, ldc:int(1677187751))
                
                switch (p0:int) {
                    case 1:
                        invokestatic:void(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u6ec6\u5fe1\ub18d\u97b7\u92ff\ub32d, initobject:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b[expected:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20](\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::<init>))
                        looporswitchbreak()
                    
                    case 2:
                        invokestatic:void(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u6ec6\u5fe1\ub18d\u97b7\u92ff\ub32d, initobject:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::<init>))
                        return:void()
                    
                    default:
                        athrow(initobject:RuntimeException(RuntimeException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u8308\u12b2\u69d9\ub32d\u0a06\u8cae), and:int(ldc:int(-25911), ldc:int(16694)))), p0:int))))
                }
            }
            
            if (cmpeq:boolean(and:int(var_1_6B:int, ldc:int(128)), ldc:int(0))) {
                return:void()
            }
            
            var_1_6B = and:int(var_1_6B:int, ldc:int(1655153375))
        }
    }
    
    public static void \u64f2\u88c5\u62da\u8df4\u647c\u6d99(int p0) {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(-397221209), ldc:int(-314384915))
            
            do {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-1138721130))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-864322715))
                    
                    switch (p0:int) {
                        case 3:
                            invokestatic:void(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u64f2\u88c5\u62da\u8df4\u647c\u6d99, initobject:\ubb2b\u8709\u5f50\u0c95\u93a2\u4492[expected:\u8413\u3bc9\u69d9\ua3b4\u8cae\u9937](\ubb2b\u8709\u5f50\u0c95\u93a2\u4492::<init>))
                            loopcontinue()
                        
                        case 4:
                            invokestatic:void(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u64f2\u88c5\u62da\u8df4\u647c\u6d99, initobject:\u0800\ub70c\u98a4\uc4d2\u6cfe\ufe34[expected:\u8413\u3bc9\u69d9\ua3b4\u8cae\u9937](\u0800\ub70c\u98a4\uc4d2\u6cfe\ufe34::<init>))
                        
                        default:
                            athrow(initobject:RuntimeException(RuntimeException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u8308\u12b2\u69d9\ub32d\u0a06\u8cae), xor:int(ldc:int(8256), ldc:int(8257)))), p0:int))))
                    }
                }
            } while (cmpne:boolean(and:int(var_1_5F:int, ldc:int(64)), ldc:int(0)))
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u64f2\u88c5\u62da\u8df4\u647c\u6d99(\u36d3\u9033\u6b0d\u983f\u8d90.\u8413\u3bc9\u69d9\ua3b4\u8cae\u9937 p0) {
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
            putstatic:\u8413\u3bc9\u69d9\ua3b4\u8cae\u9937(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u7e3f\u61a4\uc29a\ubff1\uae5d\u836c, p0:\u8413\u3bc9\u69d9\ua3b4\u8cae\u9937)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u6ec6\u5fe1\ub18d\u97b7\u92ff\ub32d(\u5245\u8aa5\u61a4\u7049\u4cd9.\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20 p0) {
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
            putstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u8640\ua3b4\u4e72\ud158\uc2bd\u965f, p0:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u5245\u8aa5\u61a4\u7049\u4cd9.\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20 \u8640\u6bb9\u9033\u76bc\u8413\u839e() {
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
            return:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(getstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u8640\ua3b4\u4e72\ud158\uc2bd\u965f))
        }
        
        goto(Label_0006)
    }
    
    public static \u36d3\u9033\u6b0d\u983f\u8d90.\u8413\u3bc9\u69d9\ua3b4\u8cae\u9937 \u416d\u927d\uc4d2\ua3b4\u6cfe\u392e() {
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
            return:\u8413\u3bc9\u69d9\ua3b4\u8cae\u9937(getstatic:\u8413\u3bc9\u69d9\ua3b4\u8cae\u9937(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u7e3f\u61a4\uc29a\ubff1\uae5d\u836c))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_7B : int
        expr_65 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_1DE_0 : byte[] [generated]
        stack_233_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_153 : int
        var_3_158 : byte[]
        var_5_159 : int
        var_0_181 : int
        expr_169 : byte [generated]
        stack_1AD_2 : byte [generated]
        stack_184_0 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_1CD : byte[]
        var_5_1CE : int
        expr_B5 : int [generated]
        var_3_222 : byte[]
        var_5_223 : int
        expr_233 : byte [generated]
        var_3_EA : String
        stack_138_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
            var_0_7B = and:int(ldc:int(-1996505981), ldc:int(-1889943927))
            expr_65 = stack_8D_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1DE_0 = stack_233_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("p6jYCEA48p4oyFga9mgQ2LiCbngoUAgIeIiSXmg46ErQZyeo2AhAOPLueChQCAh4iJJeaDjoStCIfw=="))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_153 = expr_6B:int
                var_3_158 = newarray:byte[](byte.class, expr_6B:int)
                var_5_159 = expr_6B:int
                
                loop {
                    var_0_181 = and:int(var_0_7B:int, ldc:int(779828957))
                    var_5_159 = add:int(var_5_159:int, ldc:int(-1))
                    expr_169 = stack_1AD_2 = loadelement(expr_65, var_5_159)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_159:int, ldc:int(1)), neg:int(var_4_153:int)), ldc:int(0))) {
                        stack_1AD_2 = stack_184_0 = add:byte(expr_169:byte, loadelement:byte(var_3_158:byte[], add:int(var_5_159:int, ldc:int(1))))
                        goto(Label_0404)
                    }
                    
                    Label_0374:
                    
                    if (cmpne:boolean(and:int(var_0_181:int, ldc:int(2048)), ldc:int(0))) {
                        var_0_181 = and:int(var_0_181:int, ldc:int(2139938291))
                        stack_1AD_2 = stack_184_0 = add:byte(expr_169:byte, ldc:byte(1))
                    }
                    
                    Label_0404:
                    
                    if (cmpne:boolean(and:int(var_0_181:int, ldc:int(67108864)), ldc:int(0))) {
                        var_0_181 = and:int(var_0_181:int, ldc:int(-864841519))
                        goto(Label_0374)
                    }
                    
                    var_0_7B = and:int(var_0_181:int, ldc:int(1005534375))
                    storeelement:byte(var_3_158:byte[], var_5_159:int, stack_1AD_2:byte)
                    
                    if (cmpne:boolean(var_5_159:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1DE_0 = stack_233_0 = var_3_158:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(128)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(1619118493))
                    goto(Label_0186)
                }
                
                if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(-901784123))
                    var_2_8D = stack_8D_0:byte[]
                    expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                        var_3_1CD = newarray:byte[](byte.class, expr_91:int)
                        var_5_1CE = expr_91:int
                        
                        loop {
                            var_0_7B = and:int(var_0_7B:int, ldc:int(-1204896069))
                            var_5_1CE = add:int(var_5_1CE:int, ldc:int(-1))
                            storeelement:byte(var_3_1CD:byte[], var_5_1CE:int, add:int(shl:int(loadelement:byte(stack_1DE_0:byte[], var_5_1CE:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_1CE:int, and:int(ldc:int(1029), ldc:int(4363)))), ldc:int(7)), xor:int(ldc:int(130), ldc:int(131)))))
                            
                            if (cmpne:boolean(var_5_1CE:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1DE_0 = stack_233_0 = var_3_1CD:byte[]
                    }
                }
                
                Label_0150:
                
                if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_7B = and:int(var_0_7B:int, ldc:int(53719104))
                        loopcontinue()
                    }
                    
                    var_0_7B = and:int(var_0_7B:int, ldc:int(-386229029))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_3_222 = newarray:byte[](byte.class, expr_B5:int)
                        var_5_223 = expr_B5:int
                        
                        loop {
                            var_0_7B = and:int(var_0_7B:int, ldc:int(1245232583))
                            var_5_223 = add:int(var_5_223:int, ldc:int(-1))
                            expr_233 = loadelement:byte(stack_233_0:byte[], var_5_223:int)
                            storeelement:byte(var_3_222:byte[], var_5_223:int, xor:int(add:int(or:int(and:int(shl:int(expr_233:byte, and:int(ldc:int(1052), ldc:int(2373))), ldc:int(-16)), and:int(shr:int(expr_233:byte[expected:int], xor:int(ldc:int(4260), ldc:int(4256))), ldc:int(15))), ldc:int(32)), ldc:int(17)))
                            
                            if (cmpne:boolean(var_5_223:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1DE_0 = stack_233_0 = var_3_222:byte[]
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(-1382395931))
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_7B = and:int(var_0_7B:int, ldc:int(1256702529))
            }
            
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_138_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2), ldc:int(12050)))
            expr_FC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1033), ldc:int(1035)))
            storeelement:String(expr_FC:String[], and:int(ldc:int(12289), ldc:int(16521)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(2235), ldc:int(-18684)), xor:int(ldc:int(-30050), ldc:int(-30020))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(5062), ldc:int(-5063)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(554), ldc:int(290)), xor:int(ldc:int(25), ldc:int(32))))
            putstatic:String[](\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u8308\u12b2\u69d9\ub32d\u0a06\u8cae, expr_FC:String[])
            putstatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u8640\ua3b4\u4e72\ud158\uc2bd\u965f, initobject:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b[expected:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20](\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::<init>))
            putstatic:\u8413\u3bc9\u69d9\ua3b4\u8cae\u9937(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u7e3f\u61a4\uc29a\ubff1\uae5d\u836c, initobject:\ubb2b\u8709\u5f50\u0c95\u93a2\u4492[expected:\u8413\u3bc9\u69d9\ua3b4\u8cae\u9937](\ubb2b\u8709\u5f50\u0c95\u93a2\u4492::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\u8640\u4bc8\u4bc8\u3dd3\u7e3f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63E : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_649 : int
        
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
        var_3_63E = and:int(ldc:int(-587666913), ldc:int(-840369639))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3776\u600f\u5245\u62da\u6b5f\uafe7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_63E = and:int(var_3_63E:int, ldc:int(-336928163))
            var_5_7D = and:int(ldc:int(-24957), ldc:int(24684))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8549), ldc:int(-8550)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_63E:int, ldc:int(-412419301))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(13313), ldc:int(13312)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(17032), ldc:int(17033)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_63E = and:int(var_3_CA:int, ldc:int(-303039955))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(20485), ldc:int(20484)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1625788943))
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(998056590))
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1108888687))
                        goto(Label_0659)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(309624062))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-662718743))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0793)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1741836892))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1572283185))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1267575536))
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0659)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1072042136))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-277235093))
                            var_11_DB = and:int(ldc:int(6714), ldc:int(-7867))
                            goto(Label_1481)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(721700466))
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-756460526))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-388758706))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(397141763))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1263405116))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-546362535))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0793)
                        }
                    }
                    
                    Label_0659:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(2006031559))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1706939514))
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-831936061))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1603387320))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(730328356))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-729844839))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0793:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1113182925))
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1410893042))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(488228141))
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-591786306))
                            goto(Label_0659)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1214894614))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-209946037))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(4740), ldc:int(4741))
                                goto(Label_1081)
                            }
                        }
                    }
                    
                    Label_0919:
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-600898095))
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1195280244))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-570520530))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(598610488))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0659)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(192804076))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-571639857))
                        var_11_DB = and:int(ldc:int(-9301), ldc:int(9300))
                    }
                    
                    Label_1081:
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1063166681))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0919)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-71673925))
                            goto(Label_0793)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0659)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1351387292))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-304008425))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1408403767))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-629427703))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1343)
                            }
                        }
                    }
                    
                    Label_1207:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1297396895))
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-264196666))
                            goto(Label_1081)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-501465048))
                            goto(Label_0919)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0659)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-903207473))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1434221998))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-873831557))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1481)
                    }
                    
                    Label_1343:
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1471724469))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(369648222))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1129877260))
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1658918933))
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-318537697))
                        goto(Label_0659)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63E = and:int(var_3_63E:int, ldc:int(-772020407))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1481:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_649 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1492:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(615089983))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1059943296))
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0659)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(2061237114))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1781423276))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-588287461))
                        var_17_649 = add:int(var_16_109:int, xor:int(ldc:int(4097), ldc:int(4096)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63E = and:int(var_3_63E:int, ldc:int(-278251877))
                
                if (cmple:boolean(var_5_7D = var_17_649:int, sub:int(var_6_84:int, xor:int(ldc:int(-27632), ldc:int(-27631))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
