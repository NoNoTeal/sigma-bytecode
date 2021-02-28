public class \ub113\ufcaf\u3c25\u071d\u97b7.\u4f52\uc2e8\u5f50\u4d85\u839e {
    public void \u4f52\uc2e8\u5f50\u4d85\u839e() {
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
            invokespecial:\u071d\u3776\u4ab3\u8640\u7af6(\u071d\u3776\u4ab3\u8640\u7af6::<init>, this:\u4f52\uc2e8\u5f50\u4d85\u839e, loadelement:String(getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), and:int(ldc:int(1892), ldc:int(-18287))), loadelement:String(getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), xor:int(ldc:int(13314), ldc:int(13315))), getstatic:\u759a\uc87f\u6d99\uc910\ua6bd(\u759a\uc87f\u6d99\uc910\ua6bd::\u516c\u3d64\u718f\ub171\u6b5f))
            putfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, Boolean>(\u4f52\uc2e8\u5f50\u4d85\u839e::\u6cfe\u16f6\u4c04\u61a4\u8bb0, this:\u4f52\uc2e8\u5f50\u4d85\u839e, initobject:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, Boolean>(HashMap<K, V>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub113\uc4d2\u183a\u527a\u6435(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_4_72 : String
        var_5_A0 : String
        var_6_AB : String
        var_7_14F : double
        var_9_162 : double
        var_11_175 : double
        var_13_185 : double
        
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
        
        if (cmpeq:boolean(p0:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
            return:boolean(and:int[expected:boolean](ldc:int(-1110), ldc:int(1109)))
        }
        
        var_4_72 = invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
        var_5_A0 = ternaryop:String(cmpne:boolean(invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uf9c5\uf94d\u64f2\u624e\u7ce1, p0:\u7d52\u718f\u3776\u6fb0\ub83f), aconstnull:ITextComponent()), invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uf9c5\uf94d\u64f2\u624e\u7ce1, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), aconstnull:String())
        var_6_AB = invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\uf94d\u7c6b\u92ff\u071d\u7e3f\u69d9, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
        
        if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u9937\u3bd6\ubcb0\u8389\u7c6b\u8308, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
            if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_4_72:String, loadelement:String(getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), and:int(ldc:int(146), ldc:int(34)))))) {
                if (invokevirtual:boolean(String::endsWith, var_4_72:String, loadelement:String(getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), xor:int(ldc:int(16771), ldc:int(16768))))) {
                    if (logicalor:boolean(cmpeq:boolean(var_5_A0:String, aconstnull:String()), invokevirtual:boolean(String::equals, var_5_A0:String, var_6_AB:String[expected:Object]))) {
                        var_7_14F = invokestatic:double(Math::abs, sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4f52\uc2e8\u5f50\u4d85\u839e::\u4492\u8aa5\ud171\uc3e3\u4c2b)))))
                        var_9_162 = invokestatic:double(Math::abs, sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4f52\uc2e8\u5f50\u4d85\u839e::\u4492\u8aa5\ud171\uc3e3\u4c2b)))))
                        var_11_175 = invokestatic:double(Math::abs, sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4f52\uc2e8\u5f50\u4d85\u839e::\u4492\u8aa5\ud171\uc3e3\u4c2b)))))
                        var_13_185 = invokestatic:double(Math::sqrt, add:double(mul:double(var_7_14F:double, var_7_14F:double), mul:double(var_11_175:double, var_11_175:double)))
                        
                        if (cmplt:boolean(var_9_162:double, ldc:double(13.0))) {
                            if (cmpgt:boolean(var_9_162:double, ldc:double(10.0))) {
                                if (cmplt:boolean(var_13_185:double, ldc:double(3.0))) {
                                    return:boolean(and:int[expected:boolean](ldc:int(25633), ldc:int(2821)))
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_4_72:String, loadelement:String(getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), xor:int(ldc:int(9), ldc:int(13))))), invokevirtual:boolean(String::endsWith, var_4_72:String, loadelement:String(getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), xor:int(ldc:int(8200), ldc:int(8203)))))) {
            return:boolean(and:int[expected:boolean](ldc:int(12461), ldc:int(17)))
        }
        
        if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u9937\u3bd6\ubcb0\u8389\u7c6b\u8308, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
            if (invokevirtual:boolean(String::equals, var_6_AB:String, var_4_72:String[expected:Object])) {
                if (invokevirtual:boolean(String::equals, var_5_A0:String, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_6_AB:String), loadelement:String(getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), and:int(ldc:int(2563), ldc:int(9379))))))) {
                    return:boolean(and:int[expected:boolean](ldc:int(5163), ldc:int(10561)))
                }
            }
        }
        
        if (cmpne:boolean(var_5_A0:String, aconstnull:String())) {
            if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, var_5_A0:String, loadelement:String(getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), and:int(ldc:int(20741), ldc:int(10791)))))) {
                if (invokevirtual:boolean(String::contains, invokevirtual:String(String::toLowerCase, var_4_72:String), loadelement:String[expected:CharSequence](getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), and:int(ldc:int(27143), ldc:int(4314))))) {
                    if (invokevirtual:boolean(String::contains, invokevirtual:String(String::toLowerCase, var_4_72:String), loadelement:String[expected:CharSequence](getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), xor:int(ldc:int(32), ldc:int(35))))) {
                        return:boolean(xor:int[expected:boolean](ldc:int(192), ldc:int(193)))
                    }
                }
            }
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(String::contains, var_4_72:String, loadelement:String[expected:CharSequence](getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), xor:int(ldc:int(-23550), ldc:int(-23548)))))) {
            if (logicalnot:boolean(invokevirtual:boolean(String::contains, var_4_72:String, loadelement:String[expected:CharSequence](getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), xor:int(ldc:int(8353), ldc:int(8355)))))) {
                if (cmpne:boolean(var_5_A0:String, aconstnull:String())) {
                    if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, var_5_A0:String, loadelement:String(getstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a), xor:int(ldc:int(8193), ldc:int(8196)))))) {
                        return:boolean(and:int[expected:boolean](ldc:int(16515), ldc:int(8205)))
                    }
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(13349), ldc:int(-13350)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(1077), ldc:int(2315)))
    }
    
    public boolean \u51b2\u6fb0\ufcaf\u61a4\u0800(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(9229), ldc:int(4705)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_213_0 : byte[] [generated]
        stack_266_0 : byte[] [generated]
        stack_2C2_0 : byte[] [generated]
        stack_33A_0 : byte[] [generated]
        var_4_1F6 : int
        var_3_1FB : byte[]
        var_5_1FC : int
        expr_213 : byte [generated]
        var_0_2DA : int
        expr_2C2 : byte [generated]
        stack_306_2 : byte [generated]
        stack_2DD_0 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_255 : byte[]
        var_5_256 : int
        expr_BB : int [generated]
        expr_E6 : int [generated]
        var_3_329 : byte[]
        var_5_32A : int
        var_3_11A : String
        stack_1EF_0 : String[] [generated]
        expr_12C : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(-1141354637), ldc:int(-1358176324))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_213_0 = stack_266_0 = stack_2C2_0 = stack_33A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("UAZXyKgfVt3EIq/w2QPI+WxyJzsDFzMT0NxeH8CpA/iJDhdT7CMPeMDUB6AnaME8hVynV8ZC7j7KybAtabAOs4QGs8QT")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1F6 = expr_6B:int
        var_3_1FB = newarray:byte[](byte.class, expr_6B:int)
        var_5_1FC = expr_6B:int
        Label_0510:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1215436848))
            var_5_1FC = add:int(var_5_1FC:int, ldc:int(-1))
            expr_213 = loadelement:byte(stack_213_0:byte[], var_5_1FC:int)
            storeelement:byte(var_3_1FB:byte[], var_5_1FC:int, xor:int(or:int(and:int(shl:int(expr_213:byte, and:int(ldc:int(2694), ldc:int(1060))), ldc:int(-16)), and:int(shr:int(expr_213:byte[expected:int], xor:int(ldc:int(642), ldc:int(646))), ldc:int(15))), ldc:int(49)))
            
            if (cmpne:boolean(var_5_1FC:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_213_0 = stack_266_0 = stack_2C2_0 = stack_33A_0 = var_3_1FB:byte[]
            goto(Label_0112)
        }
        
        Label_0685:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_2DA = and:int(var_0_5F:int, ldc:int(-244426919))
            var_5_1FC = add:int(var_5_1FC:int, ldc:int(-1))
            expr_2C2 = stack_306_2 = loadelement(stack_2C2_0, var_5_1FC)
            
            if (cmplt:boolean(add:int(add:int(var_5_1FC:int, ldc:int(6)), neg:int(var_4_1F6:int)), ldc:int(0))) {
                stack_306_2 = stack_2DD_0 = add:byte(expr_2C2:byte, loadelement:byte(var_3_1FB:byte[], add:int(var_5_1FC:int, ldc:int(6))))
                goto(Label_0749)
            }
            
            Label_0719:
            
            if (cmpne:boolean(and:int(var_0_2DA:int, ldc:int(256)), ldc:int(0))) {
                var_0_2DA = and:int(var_0_2DA:int, ldc:int(-246427784))
                stack_306_2 = stack_2DD_0 = add:byte(expr_2C2:byte, ldc:byte(6))
            }
            
            Label_0749:
            
            if (cmpne:boolean(and:int(var_0_2DA:int, ldc:int(32768)), ldc:int(0))) {
                var_0_2DA = and:int(var_0_2DA:int, ldc:int(-1318856610))
                goto(Label_0719)
            }
            
            var_0_5F = and:int(var_0_2DA:int, ldc:int(-438632682))
            storeelement:byte(var_3_1FB:byte[], var_5_1FC:int, stack_306_2:byte)
            
            if (cmpne:boolean(var_5_1FC:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_213_0 = stack_266_0 = stack_2C2_0 = stack_33A_0 = var_3_1FB:byte[]
            goto(Label_0192)
        }
        
        goto(Label_0510)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1518666189))
        }
        else {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-448104484))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_255 = newarray:byte[](byte.class, expr_98:int)
                var_5_256 = expr_98:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-507814017))
                    var_5_256 = add:int(var_5_256:int, ldc:int(-1))
                    storeelement:byte(var_3_255:byte[], var_5_256:int, add:int(shl:int(loadelement:byte(stack_266_0:byte[], var_5_256:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_256:int, and:int(ldc:int(1621), ldc:int(8321)))), ldc:int(6)), and:int(ldc:int(363), ldc:int(26643)))))
                    
                    if (cmpne:boolean(var_5_256:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_213_0 = stack_266_0 = stack_2C2_0 = stack_33A_0 = var_3_255:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1110476973))
            expr_BB = arraylength:int(stack_BB_0:byte[])
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_4_1F6 = expr_BB:int
                var_3_1FB = newarray:byte[](byte.class, expr_BB:int)
                var_5_1FC = expr_BB:int
                goto(Label_0685)
            }
        }
        
        Label_0192:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(623045818))
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1174614243))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_3_329 = newarray:byte[](byte.class, expr_E6:int)
                var_5_32A = expr_E6:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1241647148))
                    var_5_32A = add:int(var_5_32A:int, ldc:int(-1))
                    storeelement:byte(var_3_329:byte[], var_5_32A:int, add:byte(loadelement:byte(stack_33A_0:byte[], var_5_32A:int), ldc:byte(120)))
                    
                    if (cmpne:boolean(var_5_32A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_213_0 = stack_266_0 = stack_2C2_0 = stack_33A_0 = var_3_329:byte[]
            }
        }
        
        Label_0235:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-69021207))
            goto(Label_0157)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_11A = initobject:String(String::<init>, stack_10E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1EF_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5), ldc:int(2)))
            expr_12C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16897), ldc:int(16902)))
            storeelement:String(expr_12C:String[], and:int(ldc:int(5), ldc:int(17935)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(-31296), ldc:int(21031)), and:int(ldc:int(20651), ldc:int(-20652))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(1035), ldc:int(22641)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(11336), ldc:int(-27737)), xor:int(ldc:int(20540), ldc:int(20497))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(-10438), ldc:int(10437)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(28719), ldc:int(2557)), and:int(ldc:int(10356), ldc:int(16700))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(9621), ldc:int(21068)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(52), ldc:int(18814)), xor:int(ldc:int(12816), ldc:int(12837))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(26629), ldc:int(26627)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(5053), ldc:int(1141)), and:int(ldc:int(13052), ldc:int(1084))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(22035), ldc:int(8290)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(12360), ldc:int(12404)), and:int(ldc:int(4159), ldc:int(17470))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(22787), ldc:int(667)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(-32751), ldc:int(-32721)), and:int(ldc:int(720), ldc:int(4425))))
            putstatic:String[](\u4f52\uc2e8\u5f50\u4d85\u839e::\u7c6b\ubded\u0b8e\u2dcc\u8c8a, expr_12C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u5d20\u7043\u88c5\u5db4\uf94d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BF : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CC : double
        var_3_DE : int
        var_11_EF : int
        var_14_119 : double
        var_16_11D : int
        var_12_115 : double
        var_17_6CA : int
        
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
        var_3_6BF = and:int(ldc:int(1123231889), ldc:int(-469800205))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4f52\uc2e8\u5f50\u4d85\u839e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-339586397))
        }
        else {
            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1026336517))
            var_5_85 = and:int(ldc:int(27113), ldc:int(-27114))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3267), ldc:int(3266)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CC = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DE = and:int(var_3_6BF:int, ldc:int(1651980955))
                    var_9_CC = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EF = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EF:int, sub:int(var_6_8C:int, and:int(ldc:int(24609), ldc:int(397)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EF:int, xor:int(ldc:int(4738), ldc:int(4739)))), var_7_9B:double))) {
                        inc:int(var_11_EF, ldc:int(1))
                    }
                    
                    var_3_6BF = and:int(var_3_DE:int, ldc:int(-27952929))
                    var_14_119 = var_7_9B:double
                    var_16_11D = var_11_EF:int
                }
                else {
                    var_11_EF = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(25632), ldc:int(25633)))
                    var_12_115 = var_14_119 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11D = var_11_EF:int, var_6_8C:int)) {
                        var_9_CC = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EF:int)
                        var_16_11D = var_11_EF:int
                        var_14_119 = var_12_115:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1579707862))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(405713424))
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-2085450249))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(267802434))
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-839808269))
                        
                        if (cmplt:boolean(var_16_11D:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0578)
                            }
                            
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0414:
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-292460228))
                        goto(Label_1620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1268347690))
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(564613164))
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(2002716761))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(1985736379))
                            var_11_EF = and:int(ldc:int(8809), ldc:int(-8814))
                            goto(Label_1609)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0578:
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-290595212))
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-703179588))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(71293897))
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1817318929))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(988806240))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-992776457))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_119 = var_9_CC:double
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-519477193))
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(17056301))
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1390022006))
                            loopcontinue()
                        }
                        
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-522600747))
                        var_14_119 = mul:double(ldc:double(0.5), add:double(var_9_CC:double, var_14_119:double))
                    }
                    
                    Label_0829:
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1946939942))
                        goto(Label_1620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1980666040))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1845801368))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-2051911555))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-539739996))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(394776391))
                            loopcontinue()
                        }
                        
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-948479527))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EF = xor:int(ldc:int(2433), ldc:int(2432))
                                goto(Label_1172)
                            }
                        }
                    }
                    
                    Label_0970:
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-501714278))
                        goto(Label_1620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1183937878))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1303060220))
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1749973872))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(996941395))
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-775416269))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(1640518609))
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(2121753375))
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(867383753))
                            loopcontinue()
                        }
                        
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(2096205747))
                        var_11_EF = and:int(ldc:int(16388), ldc:int(-16389))
                    }
                    
                    Label_1172:
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-831736257))
                        goto(Label_1620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(1688046967))
                            goto(Label_0970)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(891227444))
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(1997941532))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-260833733))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1033621411))
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-874833697))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                                goto(Label_1447)
                            }
                        }
                    }
                    
                    Label_1314:
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1719761385))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1760555000))
                            goto(Label_1172)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(292257641))
                            goto(Label_0970)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-2076973320))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(1800637181))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_119:double, var_5_85:int, var_16_11D:int)
                            goto(Label_1609)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1447:
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1891167331))
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1421990032))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(498666731))
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1088863836))
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-955263683))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-270118421))
                        goto(Label_0414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(654187465))
                        loopcontinue()
                    }
                    
                    var_3_6BF = and:int(var_3_6BF:int, ldc:int(-855676455))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_119:double, ldc:double(0.0))
                    Label_1609:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CA = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1620:
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1390484033))
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(573470749))
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1425974972))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-122969892))
                        goto(Label_0578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-293635685))
                        var_17_6CA = add:int(var_16_11D:int, and:int(ldc:int(13313), ldc:int(17181)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6BF = and:int(var_3_6BF:int, ldc:int(-111413035))
                
                if (cmple:boolean(var_5_85 = var_17_6CA:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32635), ldc:int(-32636))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1714862734))
            goto(Label_0106)
        }
    }
}
