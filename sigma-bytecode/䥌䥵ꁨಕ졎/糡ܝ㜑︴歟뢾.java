public class \u494c\u4975\ua068\u0c95\uc84e.\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be {
    public void \u7ce1\u071d\u3711\ufe34\u6b5f\ub8be() {
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
            invokespecial:Object(Object::<init>, this:\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be)
            putfield:Deque<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>(\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be::\u8389\ud36e\ufcaf\u93a2\u62da\u718f, this:\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be, initobject:ArrayDeque<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>[expected:Deque<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>](ArrayDeque<E>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8709\u071d\uc4d2\ufe34\u946b\uc4d2(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d p0) {
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
        invokeinterface:void(Deque<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>::addLast, getfield:Deque<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>(\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be::\u8389\ud36e\ufcaf\u93a2\u62da\u718f, this:\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be), p0:\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d)
        
        if (cmple:boolean(invokeinterface:int(Deque<E>::size, getfield:Deque<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>(\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be::\u8389\ud36e\ufcaf\u93a2\u62da\u718f, this:\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be)), ldc:int(100))) {
            return:void()
        }
        
        athrow(initobject:RuntimeException(RuntimeException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be::\u8d98\u647c\u965f\u7d52\ub7dc\ucfaf), and:int(ldc:int(-9575), ldc:int(9510)))), invokeinterface:int(Deque<E>::size, getfield:Deque<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>(\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be::\u8389\ud36e\ufcaf\u93a2\u62da\u718f, this:\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be))))))
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d \u4975\u4492\u74b1\u927d\ua562\u9937() {
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
        
        if (logicalnot:boolean(invokeinterface:boolean(Collection<E>::isEmpty, getfield:Deque<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>[expected:Collection<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>](\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be::\u8389\ud36e\ufcaf\u93a2\u62da\u718f, this:\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be)))) {
            return:\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d(checkcast:\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d.class, invokeinterface:\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d(Deque<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>::pollLast, getfield:Deque<\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d>(\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be::\u8389\ud36e\ufcaf\u93a2\u62da\u718f, this:\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be))))
        }
        
        athrow(initobject:RuntimeException(RuntimeException::<init>, loadelement:String(getstatic:String[](\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be::\u8d98\u647c\u965f\u7d52\ub7dc\ucfaf), and:int(ldc:int(4233), ldc:int(1025)))))
    }
    
    static {
        var_0_1A2 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_14C_0 : byte[] [generated]
        stack_1B4_0 : byte[] [generated]
        stack_229_0 : byte[] [generated]
        var_4_12F : int
        var_3_134 : byte[]
        var_5_135 : int
        expr_14C : byte [generated]
        var_0_1CC : int
        expr_1B4 : byte [generated]
        stack_1F8_2 : byte [generated]
        stack_1CF_0 : byte [generated]
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
        var_0_1A2 = and:int(ldc:int(-19516665), ldc:int(-305274345))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_14C_0 = stack_1B4_0 = stack_229_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("K8q8EWApEUvmvErKyKElK4TM4CnKvBFgKRFL5rxKGx1DH+IVui+mMCaGsPQ=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_12F = expr_6B:int
        var_3_134 = newarray:byte[](byte.class, expr_6B:int)
        var_5_135 = expr_6B:int
        Label_0311:
        
        while (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(128)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-1445699457))
            var_5_135 = add:int(var_5_135:int, ldc:int(-1))
            expr_14C = loadelement:byte(stack_14C_0:byte[], var_5_135:int)
            storeelement:byte(var_3_134:byte[], var_5_135:int, xor:int(add:int(or:int(and:int(shl:int(expr_14C:byte, and:int(ldc:int(5), ldc:int(1062))), ldc:int(-16)), and:int(shr:int(expr_14C:byte[expected:int], xor:int(ldc:int(1), ldc:int(5))), ldc:int(15))), ldc:int(113)), ldc:int(61)))
            
            if (cmpne:boolean(var_5_135:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_14C_0 = stack_1B4_0 = stack_229_0 = var_3_134:byte[]
            goto(Label_0112)
        }
        
        Label_0407:
        
        while (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1CC = and:int(var_0_1A2:int, ldc:int(-286509609))
            var_5_135 = add:int(var_5_135:int, ldc:int(-1))
            expr_1B4 = stack_1F8_2 = loadelement(stack_1B4_0, var_5_135)
            
            if (cmplt:boolean(add:int(add:int(var_5_135:int, ldc:int(3)), neg:int(var_4_12F:int)), ldc:int(0))) {
                stack_1F8_2 = stack_1CF_0 = add:byte(expr_1B4:byte, loadelement:byte(var_3_134:byte[], add:int(var_5_135:int, ldc:int(3))))
                goto(Label_0479)
            }
            
            Label_0449:
            
            if (cmpeq:boolean(and:int(var_0_1CC:int, ldc:int(16384)), ldc:int(0))) {
                var_0_1CC = and:int(var_0_1CC:int, ldc:int(-322526993))
                stack_1F8_2 = stack_1CF_0 = add:byte(expr_1B4:byte, ldc:byte(3))
            }
            
            Label_0479:
            
            if (cmpeq:boolean(and:int(var_0_1CC:int, ldc:int(8192)), ldc:int(0))) {
                var_0_1CC = and:int(var_0_1CC:int, ldc:int(-1629925372))
                goto(Label_0449)
            }
            
            var_0_1A2 = and:int(var_0_1CC:int, ldc:int(-1428200665))
            storeelement:byte(var_3_134:byte[], var_5_135:int, stack_1F8_2:byte)
            
            if (cmpne:boolean(var_5_135:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_14C_0 = stack_1B4_0 = stack_229_0 = var_3_134:byte[]
            goto(Label_0148)
        }
        
        var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-903003481))
        goto(Label_0311)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-213191370))
        }
        else {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-1377535769))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_12F = expr_8F:int
                var_3_134 = newarray:byte[](byte.class, expr_8F:int)
                var_5_135 = expr_8F:int
                goto(Label_0407)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(64)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-1194369512))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-1409897081))
            var_2_B1 = stack_B1_0:byte[]
            expr_B5 = add:int(arraylength:int(stack_B3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_3_218 = newarray:byte[](byte.class, expr_B5:int)
                var_5_219 = expr_B5:int
                
                loop {
                    var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-1413122353))
                    var_5_219 = add:int(var_5_219:int, ldc:int(-1))
                    storeelement:byte(var_3_218:byte[], var_5_219:int, add:int(shl:int(loadelement:byte(stack_229_0:byte[], var_5_219:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_B1:byte[], add:int(var_5_219:int, xor:int(ldc:int(513), ldc:int(512)))), ldc:int(5)), and:int(ldc:int(327), ldc:int(26671)))))
                    
                    if (cmpne:boolean(var_5_219:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_14C_0 = stack_1B4_0 = stack_229_0 = var_3_218:byte[]
            }
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0148)
        }
        
        if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(1)), ldc:int(0))) {
            var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_128_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(21058), ldc:int(1163)))
            expr_EC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(24642), ldc:int(24640)))
            storeelement:String(expr_EC:String[], and:int(ldc:int(8717), ldc:int(81)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(-7174), ldc:int(7173)), xor:int(ldc:int(558), ldc:int(573))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(-5185), ldc:int(5184)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(6547), ldc:int(17491)), xor:int(ldc:int(1087), ldc:int(1044))))
            putstatic:String[](\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be::\u8d98\u647c\u965f\u7d52\ub7dc\ucfaf, expr_EC:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ucef1\u4d85\u16f6\uf995\u6c52\u92ee(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_635 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_640 : int
        
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
        var_3_635 = and:int(ldc:int(1661573279), ldc:int(2142034871))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(1702187201))
        }
        else {
            var_3_635 = and:int(var_3_635:int, ldc:int(-1394017))
            var_5_85 = and:int(ldc:int(-2561), ldc:int(2560))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10453), ldc:int(-26846)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_635:int, ldc:int(1730935998))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(45), ldc:int(1299)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-27647), ldc:int(-27648)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_635 = and:int(var_3_DA:int, ldc:int(2073812374))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(640), ldc:int(641)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1661091805))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1799145023))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-610598159))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1830399315))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1145256398))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-345302082))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1842425447))
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-432356538))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1164611689))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-150389346))
                            var_11_EB = and:int(ldc:int(28811), ldc:int(-29100))
                            goto(Label_1465)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-286304535))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-635956820))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-536384449))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(466449646))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1162740691))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1715710697))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-216384777))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(450387807))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(296605964))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(157954393))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-732968755))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-146973633))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1827496588))
                        goto(Label_1335)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(184169306))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-319968006))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1777769324))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(1872371030))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(10255), ldc:int(497))
                                goto(Label_1092)
                            }
                        }
                    }
                    
                    Label_0912:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-979336013))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-921996652))
                        goto(Label_1335)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1104105519))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1875308123))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1729319864))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(818540826))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(633933319))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-416407946))
                        var_11_EB = and:int(ldc:int(-10006), ldc:int(10005))
                    }
                    
                    Label_1092:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1204307652))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0912)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(837759764))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(263403526))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(713862552))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-54926782))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(1934392694))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1335)
                            }
                        }
                    }
                    
                    Label_1217:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(379970009))
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(367758376))
                            goto(Label_1092)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0912)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(217210845))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-82060426))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1465)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1335:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1856561946))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(938651659))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-2112813591))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(484285859))
                        loopcontinue()
                    }
                    
                    var_3_635 = and:int(var_3_635:int, ldc:int(2000370143))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1465:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_640 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1476:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1202976775))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1592466847))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1889708920))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1093663251))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(900867533))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-338911394))
                        var_17_640 = add:int(var_16_119:int, xor:int(ldc:int(3), ldc:int(2)))
                        looporswitchbreak()
                    }
                }
                
                var_3_635 = and:int(var_3_635:int, ldc:int(-338993506))
                
                if (cmple:boolean(var_5_85 = var_17_640:int, sub:int(var_6_8C:int, xor:int(ldc:int(16386), ldc:int(16387))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(2016437971))
            goto(Label_0106)
        }
    }
}
