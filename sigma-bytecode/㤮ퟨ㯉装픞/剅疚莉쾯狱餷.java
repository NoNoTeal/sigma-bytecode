public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u5245\u759a\u8389\ucfaf\u72f1\u9937 {
    public void \u5245\u759a\u8389\ucfaf\u72f1\u9937(int p0) {
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
            invokespecial:Object(Object::<init>, this:\u5245\u759a\u8389\ucfaf\u72f1\u9937)
            putfield:int(\u5245\u759a\u8389\ucfaf\u72f1\u9937::\u0b8e\uc31c\u873d\uae5d\u4ab3\u3711, this:\u5245\u759a\u8389\ucfaf\u72f1\u9937, and:int(ldc:int(15187), ldc:int(-15188)))
            putfield:int(\u5245\u759a\u8389\ucfaf\u72f1\u9937::\u0b8e\uc31c\u873d\uae5d\u4ab3\u3711, this:\u5245\u759a\u8389\ucfaf\u72f1\u9937, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u6ec6\u5bc4\u8389\u93a2\uc31c\u8389(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u76bc\u5f50\u9937\u8df4\uc2e8\u4e72 p0) {
        var_4_73 : NumberFormat
        
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
            putfield:int(\u5245\u759a\u8389\ucfaf\u72f1\u9937::\u0b8e\uc31c\u873d\uae5d\u4ab3\u3711, this:\u5245\u759a\u8389\ucfaf\u72f1\u9937, add:int(getfield:int(\u5245\u759a\u8389\ucfaf\u72f1\u9937::\u0b8e\uc31c\u873d\uae5d\u4ab3\u3711, this:\u5245\u759a\u8389\ucfaf\u72f1\u9937), xor:int(ldc:int(-32704), ldc:int(-32703))))
            var_4_73 = invokestatic:NumberFormat(NumberFormat::getNumberInstance)
            invokevirtual:void(NumberFormat::setMinimumIntegerDigits, var_4_73:NumberFormat, and:int(ldc:int(2099), ldc:int(18319)))
            invokevirtual:void(NumberFormat::setMaximumFractionDigits, var_4_73:NumberFormat, and:int(ldc:int(-18016), ldc:int(17987)))
            invokevirtual:void(NumberFormat::setGroupingUsed, var_4_73:NumberFormat, and:int[expected:boolean](ldc:int(2969), ldc:int(-7066)))
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u5245\u759a\u8389\ucfaf\u72f1\u9937::\u93a2\u67e9\u8640\uafe7\u6b0d\u760c), and:int(ldc:int(-4393), ldc:int(4392)))), invokevirtual:String(NumberFormat::format, var_4_73:NumberFormat, i2l:long(getfield:int(\u5245\u759a\u8389\ucfaf\u72f1\u9937::\u0b8e\uc31c\u873d\uae5d\u4ab3\u3711, this:\u5245\u759a\u8389\ucfaf\u72f1\u9937))))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_258 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_EA_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_188_0 : byte[] [generated]
        stack_1E3_0 : byte[] [generated]
        stack_271_0 : byte[] [generated]
        stack_2C4_0 : byte[] [generated]
        var_4_15C : int
        var_3_161 : byte[]
        var_5_162 : int
        var_0_1D9 : int
        expr_1E3 : byte [generated]
        stack_227_2 : byte [generated]
        stack_206_0 : byte [generated]
        expr_274 : byte [generated]
        expr_8E : int [generated]
        expr_B9 : int [generated]
        var_2_EA : byte[]
        expr_EE : int [generated]
        var_3_2B3 : byte[]
        var_5_2B4 : int
        var_3_122 : String
        stack_155_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_258 = and:int(ldc:int(-1839717693), ldc:int(536228851))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B7_0 = stack_B9_0 = stack_EA_0 = stack_EC_0 = stack_116_0 = stack_188_0 = stack_1E3_0 = stack_271_0 = stack_2C4_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Bsjo")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_15C = expr_6B:int
        var_3_161 = newarray:byte[](byte.class, expr_6B:int)
        var_5_162 = expr_6B:int
        Label_0356:
        
        while (cmpeq:boolean(and:int(var_0_258:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_258:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0439)
            }
            
            var_0_258 = and:int(var_0_258:int, ldc:int(-532101397))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            storeelement:byte(var_3_161:byte[], var_5_162:int, xor:byte(loadelement:byte(stack_188_0:byte[], var_5_162:int), ldc:byte(122)))
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_EA_0 = stack_EC_0 = stack_116_0 = stack_188_0 = stack_1E3_0 = stack_271_0 = stack_2C4_0 = var_3_161:byte[]
            goto(Label_0112)
        }
        
        var_0_258 = and:int(var_0_258:int, ldc:int(-768219494))
        goto(Label_0589)
        Label_0439:
        
        while (cmpne:boolean(and:int(var_0_258:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_258:int, ldc:int(2048)), ldc:int(0))) {
                var_0_258 = and:int(var_0_258:int, ldc:int(1263028008))
                goto(Label_0356)
            }
            
            var_0_1D9 = and:int(var_0_258:int, ldc:int(1766729677))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            expr_1E3 = stack_227_2 = loadelement(stack_1E3_0, var_5_162)
            
            if (cmplt:boolean(add:int(add:int(var_5_162:int, ldc:int(1)), neg:int(var_4_15C:int)), ldc:int(0))) {
                stack_227_2 = stack_206_0 = add:byte(expr_1E3:byte, loadelement:byte(var_3_161:byte[], add:int(var_5_162:int, ldc:int(1))))
                goto(Label_0534)
            }
            
            Label_0496:
            
            if (cmpne:boolean(and:int(var_0_1D9:int, ldc:int(1024)), ldc:int(0))) {
                var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-96008530))
            }
            else {
                var_0_1D9 = and:int(var_0_1D9:int, ldc:int(98494147))
                stack_227_2 = stack_206_0 = add:byte(expr_1E3:byte, ldc:byte(1))
            }
            
            Label_0534:
            
            if (cmpeq:boolean(and:int(var_0_1D9:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0496)
            }
            
            var_0_258 = and:int(var_0_1D9:int, ldc:int(-463424803))
            storeelement:byte(var_3_161:byte[], var_5_162:int, stack_227_2:byte)
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_EA_0 = stack_EC_0 = stack_116_0 = stack_188_0 = stack_1E3_0 = stack_271_0 = stack_2C4_0 = var_3_161:byte[]
            goto(Label_0147)
        }
        
        var_0_258 = and:int(var_0_258:int, ldc:int(-2034528956))
        Label_0589:
        
        while (cmpne:boolean(and:int(var_0_258:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_258:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0356)
            }
            
            var_0_258 = and:int(var_0_258:int, ldc:int(1602209733))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            expr_274 = add:byte(loadelement:byte(stack_271_0:byte[], var_5_162:int), ldc:byte(111))
            storeelement:byte(var_3_161:byte[], var_5_162:int, or:int(and:int(shl:int(expr_274:byte, and:int(ldc:int(1348), ldc:int(14))), ldc:int(-16)), and:int(shr:int(expr_274:byte[expected:int], xor:int(ldc:int(4225), ldc:int(4229))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_EA_0 = stack_EC_0 = stack_116_0 = stack_188_0 = stack_1E3_0 = stack_271_0 = stack_2C4_0 = var_3_161:byte[]
            goto(Label_0190)
        }
        
        var_0_258 = and:int(var_0_258:int, ldc:int(1299149703))
        goto(Label_0439)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_258:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_258:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0190)
        }
        
        if (cmpne:boolean(and:int(var_0_258:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_258 = and:int(var_0_258:int, ldc:int(-513492229))
            expr_8E = arraylength:int(stack_8E_0:byte[])
            
            if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                var_4_15C = expr_8E:int
                var_3_161 = newarray:byte[](byte.class, expr_8E:int)
                var_5_162 = expr_8E:int
                goto(Label_0439)
            }
        }
        
        Label_0147:
        
        if (cmpne:boolean(and:int(var_0_258:int, ldc:int(32)), ldc:int(0))) {
            var_0_258 = and:int(var_0_258:int, ldc:int(2045979940))
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_258:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_258:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_258 = and:int(var_0_258:int, ldc:int(509348837))
            expr_B9 = arraylength:int(stack_B9_0:byte[])
            
            if (cmpne:boolean(expr_B9:int, ldc:int(0))) {
                var_4_15C = expr_B9:int
                var_3_161 = newarray:byte[](byte.class, expr_B9:int)
                var_5_162 = expr_B9:int
                goto(Label_0589)
            }
        }
        
        Label_0190:
        
        if (cmpne:boolean(and:int(var_0_258:int, ldc:int(4)), ldc:int(0))) {
            var_0_258 = and:int(var_0_258:int, ldc:int(110076097))
        }
        else {
            if (cmpne:boolean(and:int(var_0_258:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_258 = and:int(var_0_258:int, ldc:int(-1283207522))
                goto(Label_0147)
            }
            
            if (cmpeq:boolean(and:int(var_0_258:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_258 = and:int(var_0_258:int, ldc:int(-461929529))
            var_2_EA = stack_EA_0:byte[]
            expr_EE = add:int(arraylength:int(stack_EC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2B3 = newarray:byte[](byte.class, expr_EE:int)
                var_5_2B4 = expr_EE:int
                
                loop {
                    var_0_258 = and:int(var_0_258:int, ldc:int(24793801))
                    var_5_2B4 = add:int(var_5_2B4:int, ldc:int(-1))
                    storeelement:byte(var_3_2B3:byte[], var_5_2B4:int, add:int(shl:int(loadelement:byte(stack_2C4_0:byte[], var_5_2B4:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_EA:byte[], add:int(var_5_2B4:int, and:int(ldc:int(2049), ldc:int(5653)))), ldc:int(3)), xor:int(ldc:int(587), ldc:int(596)))))
                    
                    if (cmpne:boolean(var_5_2B4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_EA_0 = stack_EC_0 = stack_116_0 = stack_188_0 = stack_1E3_0 = stack_271_0 = stack_2C4_0 = var_3_2B3:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_258:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0190)
        }
        
        if (cmpne:boolean(and:int(var_0_258:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0147)
        }
        
        if (cmpeq:boolean(and:int(var_0_258:int, ldc:int(1)), ldc:int(0))) {
            var_0_258 = and:int(var_0_258:int, ldc:int(-1740753049))
            goto(Label_0112)
        }
        
        var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_155_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4098), ldc:int(4099)))
        expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16640), ldc:int(16641)))
        storeelement:String(expr_134:String[], and:int(ldc:int(-1418), ldc:int(1417)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-15748), ldc:int(13699)), xor:int(ldc:int(16977), ldc:int(16979))))
        putstatic:String[](\u5245\u759a\u8389\ucfaf\u72f1\u9937::\u93a2\u67e9\u8640\uafe7\u6b0d\u760c, expr_134:String[])
    }
    
    public void \u3dd3\u8258\u873d\ud36e\u71ae\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5EA : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5F5 : int
        
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
        var_3_5EA = and:int(ldc:int(802201656), ldc:int(997827357))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5245\u759a\u8389\ucfaf\u72f1\u9937[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2)), ldc:int(0))) {
            var_3_5EA = and:int(var_3_5EA:int, ldc:int(1558690015))
        }
        else {
            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-2089316195))
            var_5_85 = and:int(ldc:int(-12402), ldc:int(12401))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10106), ldc:int(9593)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5EA:int, ldc:int(-749148332))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(1537), ldc:int(16611)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(1032), ldc:int(1033)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5EA = and:int(var_3_D2:int, ldc:int(1130030866))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(136), ldc:int(137)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(648314724))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-2135011829))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-865854843))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1647017814))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1124738391))
                    }
                    else {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1353538730))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(612727710))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1484436692))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(543735115))
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1315839949))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1815113817))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1198706279))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1619934883))
                        var_11_E3 = and:int(ldc:int(16995), ldc:int(-17012))
                        goto(Label_1408)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-278333476))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1155367591))
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-943302334))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1200447898))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1266170141))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-318987900))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1811534939))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-85261178))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(892860350))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1125499253))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1823238216))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-749768822))
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(1184034068))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(2098943067))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(1985414190))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1339797842))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(-12160), ldc:int(-12159))
                                goto(Label_1082)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1003749292))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-937561486))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1228326627))
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1213362046))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-302164132))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(1377121273))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1801117209))
                        var_11_E3 = and:int(ldc:int(9417), ldc:int(-14026))
                    }
                    
                    Label_1082:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-255602912))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(1486671257))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-2119495102))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1266209083))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1298)
                            }
                        }
                    }
                    
                    Label_1189:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1444678128))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1473539603))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1082)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-78514789))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1408)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1298:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-2106368051))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(596587149))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5EA = and:int(var_3_5EA:int, ldc:int(-2021880967))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1408:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F5 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1419:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(413794547))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(576858391))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(802945749))
                        var_17_5F5 = add:int(var_16_111:int, xor:int(ldc:int(18432), ldc:int(18433)))
                        looporswitchbreak()
                    }
                    
                    var_3_5EA = and:int(var_3_5EA:int, ldc:int(1961156344))
                }
                
                var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1688734281))
                
                if (cmple:boolean(var_5_85 = var_17_5F5:int, sub:int(var_6_8C:int, xor:int(ldc:int(4115), ldc:int(4114))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
