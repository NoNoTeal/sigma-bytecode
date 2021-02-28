public class \u494c\u4975\ua068\u0c95\uc84e.\u3bd6\u965f\u6b5f\u8709\ufcaf {
    public void \u3bd6\u965f\u6b5f\u8709\ufcaf() {
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
            invokespecial:Object(Object::<init>, this:\u3bd6\u965f\u6b5f\u8709\ufcaf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9a18\u4f4a\u64ab\ua562\u392e() {
        var_0_64 : int
        var_2_77 : File
        stack_F8_0 : Class<System> [generated]
        stack_F8_1 : String [generated]
        expr_E9 : Class[] [generated]
        stack_120_0 : Method [generated]
        stack_120_1 : Object [generated]
        expr_10A : Object[] [generated]
        stack_130_0 : Throwable [generated]
        
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
            var_0_64 = and:int(and:int(ldc:int(-643020932), ldc:int(-1144111290)), ldc:int(-2103382))
            var_2_77 = initobject:File(File::<init>, loadelement:String(getstatic:String[](\u3bd6\u965f\u6b5f\u8709\ufcaf::\u6c52\u5654\u12cb\ua562\u647c), and:int(ldc:int(32257), ldc:int(-32258))))
            
            loop {
                if (cmpne:boolean(and:int(var_0_64:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_64 = and:int(var_0_64:int, ldc:int(1477636989))
                    goto(Label_0186)
                }
                
                if (cmpne:boolean(and:int(var_0_64:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_64 = and:int(var_0_64:int, ldc:int(-254087988))
                }
                else {
                    var_0_64 = and:int(var_0_64:int, ldc:int(-1727240289))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, var_2_77:File))) {
                        goto(Label_0186)
                    }
                }
                
                Label_0162:
                
                if (cmpeq:boolean(and:int(var_0_64:int, ldc:int(2048)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_64:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_64 = and:int(var_0_64:int, ldc:int(-1615923325))
                    invokevirtual:boolean(File::delete, var_2_77:File)
                }
                
                try {
                    Label_0186:
                    
                    if (cmpeq:boolean(and:int(var_0_64:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_64:int, ldc:int(512)), ldc:int(0))) {
                        var_0_64 = and:int(var_0_64:int, ldc:int(-1069518758))
                        loopcontinue()
                    }
                    
                    stack_F8_0 = ldc:Class<System>(java.lang.System.class)
                    stack_F8_1 = loadelement:String(getstatic:String[](\u3bd6\u965f\u6b5f\u8709\ufcaf::\u6c52\u5654\u12cb\ua562\u647c), xor:int(ldc:boolean(0), ldc:boolean(1)))
                    expr_E9 = newarray:Class[](java.lang.Class.class, xor:int(ldc:int(272), ldc:int(273)))
                    storeelement:Class(expr_E9:Class[], and:int(ldc:int(-17465), ldc:int(17464)), getstatic:Class<Integer>(Integer::TYPE))
                    stack_120_0 = invokevirtual:Method(Class::getMethod, stack_F8_0:Class, stack_F8_1:String, expr_E9:Class[])
                    stack_120_1 = aconstnull:Object()
                    expr_10A = newarray:Object[](java.lang.Object.class, and:int(ldc:int(17569), ldc:int(4119)))
                    storeelement:Object(expr_10A:Object[], and:int(ldc:int(-9137), ldc:int(9008)), invokestatic:Integer[expected:Object](Integer::valueOf, and:int(ldc:int(-15035), ldc:int(8378))))
                    invokevirtual:Object(Method::invoke, stack_120_0:Method, stack_120_1:Object, expr_10A:Object[])
                }
                catch (java.lang.reflect.InvocationTargetException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.NoSuchMethodException | java.lang.SecurityException ex_130) {
                    invokevirtual:void(Throwable::printStackTrace, stack_130_0:Throwable)
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_227 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_19B_0 : byte[] [generated]
        stack_1D5_0 : byte[] [generated]
        stack_248_0 : byte[] [generated]
        stack_2BC_0 : byte[] [generated]
        var_4_16F : int
        var_3_174 : byte[]
        var_5_175 : int
        expr_248 : byte [generated]
        var_0_2B2 : int
        expr_2BC : byte [generated]
        stack_2EA_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1C4 : byte[]
        var_5_1C5 : int
        expr_C3 : int [generated]
        expr_E6 : int [generated]
        var_3_11A : String
        stack_168_0 : String[] [generated]
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
        var_0_227 = and:int(ldc:int(-1697592189), ldc:int(-1176774991))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_19B_0 = stack_1D5_0 = stack_248_0 = stack_2BC_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("JFaj2d7a1jzY237a1r3a30AKjY8=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16F = expr_6B:int
        var_3_174 = newarray:byte[](byte.class, expr_6B:int)
        var_5_175 = expr_6B:int
        Label_0375:
        
        while (cmpeq:boolean(and:int(var_0_227:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_227 = and:int(var_0_227:int, ldc:int(719937734))
                goto(Label_0540)
            }
            
            var_0_227 = and:int(var_0_227:int, ldc:int(-88546697))
            var_5_175 = add:int(var_5_175:int, ldc:int(-1))
            storeelement:byte(var_3_174:byte[], var_5_175:int, xor:byte(loadelement:byte(stack_19B_0:byte[], var_5_175:int), ldc:byte(39)))
            
            if (cmpne:boolean(var_5_175:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_19B_0 = stack_1D5_0 = stack_248_0 = stack_2BC_0 = var_3_174:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0656)
        Label_0540:
        
        while (cmpeq:boolean(and:int(var_0_227:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_227:int, ldc:int(262144)), ldc:int(0))) {
                var_0_227 = and:int(var_0_227:int, ldc:int(-2114882796))
                goto(Label_0375)
            }
            
            var_0_227 = and:int(var_0_227:int, ldc:int(-1674453569))
            var_5_175 = add:int(var_5_175:int, ldc:int(-1))
            expr_248 = loadelement:byte(stack_248_0:byte[], var_5_175:int)
            storeelement:byte(var_3_174:byte[], var_5_175:int, add:int(or:int(and:int(shl:int(expr_248:byte, and:int(ldc:int(29540), ldc:int(2054))), ldc:int(-16)), and:int(shr:int(expr_248:byte[expected:int], and:int(ldc:int(68), ldc:int(9516))), ldc:int(15))), ldc:int(11)))
            
            if (cmpne:boolean(var_5_175:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_19B_0 = stack_1D5_0 = stack_248_0 = stack_2BC_0 = var_3_174:byte[]
            goto(Label_0200)
        }
        
        var_0_227 = and:int(var_0_227:int, ldc:int(-814181221))
        Label_0656:
        
        while (cmpne:boolean(and:int(var_0_227:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_227:int, ldc:int(8192)), ldc:int(0))) {
                var_0_227 = and:int(var_0_227:int, ldc:int(-1164624679))
                goto(Label_0375)
            }
            
            var_0_2B2 = and:int(var_0_227:int, ldc:int(-577054245))
            var_5_175 = add:int(var_5_175:int, ldc:int(-1))
            expr_2BC = loadelement:byte(stack_2BC_0:byte[], var_5_175:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_175:int, ldc:int(3)), neg:int(var_4_16F:int)), ldc:int(0))) {
                var_0_2B2 = and:int(var_0_2B2:int, ldc:int(-568864921))
                stack_2EA_2 = add:byte(expr_2BC:byte, ldc:byte(3))
            }
            else {
                stack_2EA_2 = add:byte(expr_2BC:byte, loadelement:byte(var_3_174:byte[], add:int(var_5_175:int, ldc:int(3))))
            }
            
            var_0_227 = and:int(var_0_2B2:int, ldc:int(-654907049))
            storeelement:byte(var_3_174:byte[], var_5_175:int, stack_2EA_2:byte)
            
            if (cmpne:boolean(var_5_175:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_19B_0 = stack_1D5_0 = stack_248_0 = stack_2BC_0 = var_3_174:byte[]
            goto(Label_0235)
        }
        
        var_0_227 = and:int(var_0_227:int, ldc:int(1511739453))
        goto(Label_0540)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_227:int, ldc:int(262144)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(-1732898751))
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(32768)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(2036673923))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_227:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(-642006723))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1C4 = newarray:byte[](byte.class, expr_A0:int)
                var_5_1C5 = expr_A0:int
                
                loop {
                    var_0_227 = and:int(var_0_227:int, ldc:int(-72102761))
                    var_5_1C5 = add:int(var_5_1C5:int, ldc:int(-1))
                    storeelement:byte(var_3_1C4:byte[], var_5_1C5:int, add:int(shl:int(loadelement:byte(stack_1D5_0:byte[], var_5_1C5:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1C5:int, xor:int(ldc:int(-32731), ldc:int(-32732)))), ldc:int(3)), xor:int(ldc:int(100), ldc:int(123)))))
                    
                    if (cmpne:boolean(var_5_1C5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_19B_0 = stack_1D5_0 = stack_248_0 = stack_2BC_0 = var_3_1C4:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_227:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_227 = and:int(var_0_227:int, ldc:int(-634322987))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_16F = expr_C3:int
                var_3_174 = newarray:byte[](byte.class, expr_C3:int)
                var_5_175 = expr_C3:int
                goto(Label_0540)
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_227 = and:int(var_0_227:int, ldc:int(-1130371841))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_4_16F = expr_E6:int
                var_3_174 = newarray:byte[](byte.class, expr_E6:int)
                var_5_175 = expr_E6:int
                goto(Label_0656)
            }
        }
        
        Label_0235:
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(-758779812))
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_227:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_11A = initobject:String(String::<init>, stack_10E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_168_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(258), ldc:int(2083)))
            expr_12C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(836), ldc:int(838)))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(68), ldc:int(69)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(-11680), ldc:int(10527)), xor:int(ldc:int(-30176), ldc:int(-30172))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(17988), ldc:int(-17989)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(4172), ldc:int(261)), xor:int(ldc:int(773), ldc:int(790))))
            putstatic:String[](\u3bd6\u965f\u6b5f\u8709\ufcaf::\u6c52\u5654\u12cb\ua562\u647c, expr_12C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u7330\uae87\u2dcc\u47c2\u647c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60A : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_615 : int
        
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
        var_3_60A = and:int(ldc:int(1032634449), ldc:int(1603609979))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bd6\u965f\u6b5f\u8709\ufcaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_60A = and:int(var_3_60A:int, ldc:int(-1730775566))
        }
        else {
            var_3_60A = and:int(var_3_60A:int, ldc:int(1876289499))
            var_5_85 = and:int(ldc:int(-20958), ldc:int(20956))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3424), ldc:int(-3425)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_60A:int, ldc:int(-43197325))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(4353), ldc:int(121)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(2118), ldc:int(2119)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_60A = and:int(var_3_DA:int, ldc:int(-581135619))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(16468), ldc:int(16469)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(177251839))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-2098712226))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1114777227))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1594962580))
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1470340467))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-832035106))
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-45263119))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-171849500))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1178384479))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-11038330))
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-849508485))
                        var_11_EB = and:int(ldc:int(19027), ldc:int(-19316))
                        goto(Label_1438)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1354227655))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-628347672))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-652748909))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(399357243))
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(219580379))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1190608733))
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-764593502))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-2021120031))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-734819986))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(628681678))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-585108747))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-904430914))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1424208804))
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1424530262))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-289767535))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-1840228085))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-35835397))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(16465), ldc:int(8197))
                                goto(Label_1080)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(791565537))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(566658010))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(1322776086))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-1056771547))
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(2136265171))
                        var_11_EB = and:int(ldc:int(-15423), ldc:int(13342))
                    }
                    
                    Label_1080:
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-730977717))
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(1283959315))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-118044276))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1883476747))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1319)
                            }
                        }
                    }
                    
                    Label_1191:
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-203349720))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1080)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-365549922))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(971372810))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-1816140239))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(1031058783))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1438)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1319:
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1088757045))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(837860183))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-231093881))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60A = and:int(var_3_60A:int, ldc:int(536128861))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1438:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_615 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1449:
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(905995512))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1505067824))
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(502612433))
                        var_17_615 = add:int(var_16_119:int, and:int(ldc:int(13825), ldc:int(103)))
                        looporswitchbreak()
                    }
                    
                    var_3_60A = and:int(var_3_60A:int, ldc:int(205424756))
                }
                
                var_3_60A = and:int(var_3_60A:int, ldc:int(-312643365))
                
                if (cmple:boolean(var_5_85 = var_17_615:int, sub:int(var_6_8C:int, xor:int(ldc:int(4100), ldc:int(4101))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(8)), ldc:int(0))) {
            var_3_60A = and:int(var_3_60A:int, ldc:int(-1608605557))
            goto(Label_0106)
        }
    }
}
