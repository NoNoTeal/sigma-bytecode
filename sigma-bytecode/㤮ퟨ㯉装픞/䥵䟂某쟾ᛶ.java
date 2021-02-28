public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u4975\u47c2\u67d0\uc7fe\u16f6 {
    public void \u4975\u47c2\u67d0\uc7fe\u16f6() {
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
            invokespecial:Object(Object::<init>, this:\u4975\u47c2\u67d0\uc7fe\u16f6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uc910\u97e6\u88c5\u5245\u5140() {
        var_0_188 : int
        var_2_102 : Field
        var_2_15F : Exception
        
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
            var_0_188 = and:int(ldc:int(380504822), ldc:int(-895002049))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0310)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_188:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(32)), ldc:int(0))) {
                        var_0_188 = and:int(var_0_188:int, ldc:int(-780726434))
                    }
                    else {
                        var_0_188 = and:int(var_0_188:int, ldc:int(1102256947))
                        
                        if (cmpge:boolean(invokestatic:int(Cipher::getMaxAllowedKeyLength, loadelement:String(getstatic:String[](\u4975\u47c2\u67d0\uc7fe\u16f6::\u62da\ub19c\uae5d\u67e9\u7e3f), and:int(ldc:int(-28375), ldc:int(10834)))), xor:int(ldc:int(-24440), ldc:int(-24184)))) {
                            goto(Label_0310)
                        }
                    }
                    
                    Label_0154:
                    
                    if (cmpne:boolean(and:int(var_0_188:int, ldc:int(134217728)), ldc:int(0))) {
                        var_0_188 = and:int(var_0_188:int, ldc:int(-2001900261))
                        goto(Label_0310)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_188:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_0_188 = and:int(var_0_188:int, ldc:int(767389490))
                    }
                    
                    Label_0188:
                    
                    if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_188 = and:int(var_0_188:int, ldc:int(-1762228508))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(16)), ldc:int(0))) {
                            var_0_188 = and:int(var_0_188:int, ldc:int(-907874207))
                            goto(Label_0154)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_0_188 = and:int(var_0_188:int, ldc:int(-2069820617))
                        var_2_102 = invokevirtual:Field(Class<T>::getDeclaredField, invokestatic:Class<?>(Class<T>::forName, loadelement:String(getstatic:String[](\u4975\u47c2\u67d0\uc7fe\u16f6::\u62da\ub19c\uae5d\u67e9\u7e3f), xor:int(ldc:int(29), ldc:int(28)))), loadelement:String(getstatic:String[](\u4975\u47c2\u67d0\uc7fe\u16f6::\u62da\ub19c\uae5d\u67e9\u7e3f), and:int(ldc:int(114), ldc:int(4738))))
                        
                        do {
                            if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(16)), ldc:int(0))) {
                                var_0_188 = and:int(var_0_188:int, ldc:int(-1925592818))
                            }
                            else {
                                var_0_188 = and:int(var_0_188:int, ldc:int(-85927053))
                                invokevirtual:void(AccessibleObject::setAccessible, var_2_102:Field[expected:AccessibleObject], xor:int[expected:boolean](ldc:int(1088), ldc:int(1089)))
                            }
                        } while (cmpeq:boolean(and:int(var_0_188:int, ldc:int(2)), ldc:int(0)))
                        
                        var_0_188 = and:int(var_0_188:int, ldc:int(-1208807434))
                        invokevirtual:void(Field::set, var_2_102:Field, aconstnull:Object(), getstatic:Boolean[expected:Object](Boolean::FALSE))
                    }
                    
                    Label_0310:
                    
                    if (cmpne:boolean(and:int(var_0_188:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(16)), ldc:int(0))) {
                        var_0_188 = and:int(var_0_188:int, ldc:int(721000835))
                        goto(Label_0154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(16384)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_0_188 = and:int(var_0_188:int, ldc:int(-437765134))
            }
            catch (java.lang.Exception var_2_15F) {
                do {
                    if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_0_188 = and:int(var_0_188:int, ldc:int(-1292992517))
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), loadelement:String(getstatic:String[](\u4975\u47c2\u67d0\uc7fe\u16f6::\u62da\ub19c\uae5d\u67e9\u7e3f), and:int(ldc:int(7), ldc:int(12443))))
                    }
                } while (cmpeq:boolean(and:int(var_0_188:int, ldc:int(2147483647)), ldc:int(0)))
                
                var_0_188 = and:int(var_0_188:int, ldc:int(1906618358))
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(Throwable::getMessage, var_2_15F:Exception[expected:Throwable]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1D2_0 : byte[] [generated]
        stack_20C_0 : byte[] [generated]
        stack_268_0 : byte[] [generated]
        stack_2E0_0 : byte[] [generated]
        var_4_1B5 : int
        var_3_1BA : byte[]
        var_5_1BB : int
        var_0_25E : int
        expr_268 : byte [generated]
        stack_2AC_2 : byte [generated]
        stack_28B_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1FB : byte[]
        var_5_1FC : int
        expr_CB : int [generated]
        expr_FE : int [generated]
        var_3_2CF : byte[]
        var_5_2D0 : int
        expr_2E0 : byte [generated]
        var_3_12A : String
        stack_1AE_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(-2122881236), ldc:int(-679518453))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_1D2_0 = stack_20C_0 = stack_268_0 = stack_2E0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("zkbBh4Odjw7Hzo0KjzgHDwsSX5YT08yD/8K3iZJPTY+HjAsbDcmLfg8PTAtdiRDMexFI3UdOC7hRiw+RSNJNR47Ey8/LEg0Nj4mOSp2Pios3iZChWhBLgQPOxwTLiM7YlViX")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1B5 = expr_6B:int
        var_3_1BA = newarray:byte[](byte.class, expr_6B:int)
        var_5_1BB = expr_6B:int
        Label_0445:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1125687990))
            var_5_1BB = add:int(var_5_1BB:int, ldc:int(-1))
            storeelement:byte(var_3_1BA:byte[], var_5_1BB:int, add:byte(loadelement:byte(stack_1D2_0:byte[], var_5_1BB:int), ldc:byte(53)))
            
            if (cmpne:boolean(var_5_1BB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_1D2_0 = stack_20C_0 = stack_268_0 = stack_2E0_0 = var_3_1BA:byte[]
            goto(Label_0112)
        }
        
        Label_0595:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_25E = and:int(var_0_5F:int, ldc:int(-1578373875))
            var_5_1BB = add:int(var_5_1BB:int, ldc:int(-1))
            expr_268 = stack_2AC_2 = loadelement(stack_268_0, var_5_1BB)
            
            if (cmplt:boolean(add:int(add:int(var_5_1BB:int, ldc:int(4)), neg:int(var_4_1B5:int)), ldc:int(0))) {
                stack_2AC_2 = stack_28B_0 = add:byte(expr_268:byte, loadelement:byte(var_3_1BA:byte[], add:int(var_5_1BB:int, ldc:int(4))))
                goto(Label_0667)
            }
            
            Label_0629:
            
            if (cmpeq:boolean(and:int(var_0_25E:int, ldc:int(1024)), ldc:int(0))) {
                var_0_25E = and:int(var_0_25E:int, ldc:int(610197386))
            }
            else {
                var_0_25E = and:int(var_0_25E:int, ldc:int(-1335636037))
                stack_2AC_2 = stack_28B_0 = add:byte(expr_268:byte, ldc:byte(4))
            }
            
            Label_0667:
            
            if (cmpne:boolean(and:int(var_0_25E:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0629)
            }
            
            var_0_5F = and:int(var_0_25E:int, ldc:int(1977797897))
            storeelement:byte(var_3_1BA:byte[], var_5_1BB:int, stack_2AC_2:byte)
            
            if (cmpne:boolean(var_5_1BB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_1D2_0 = stack_20C_0 = stack_268_0 = stack_2E0_0 = var_3_1BA:byte[]
            goto(Label_0208)
        }
        
        goto(Label_0445)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1827273383))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-124760200))
        }
        else {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-730597555))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1FB = newarray:byte[](byte.class, expr_A0:int)
                var_5_1FC = expr_A0:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(761751434))
                    var_5_1FC = add:int(var_5_1FC:int, ldc:int(-1))
                    storeelement:byte(var_3_1FB:byte[], var_5_1FC:int, add:int(shl:int(loadelement:byte(stack_20C_0:byte[], var_5_1FC:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1FC:int, xor:int(ldc:int(432), ldc:int(433)))), ldc:int(2)), xor:int(ldc:int(4277), ldc:int(4234)))))
                    
                    if (cmpne:boolean(var_5_1FC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_1D2_0 = stack_20C_0 = stack_268_0 = stack_2E0_0 = var_3_1FB:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(475125017))
        }
        else {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(1013085450))
            expr_CB = arraylength:int(stack_CB_0:byte[])
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_4_1B5 = expr_CB:int
                var_3_1BA = newarray:byte[](byte.class, expr_CB:int)
                var_5_1BB = expr_CB:int
                goto(Label_0595)
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(1104097889))
                goto(Label_0165)
            }
            
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-13196292))
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(997879241))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2CF = newarray:byte[](byte.class, expr_FE:int)
                var_5_2D0 = expr_FE:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1075624580))
                    var_5_2D0 = add:int(var_5_2D0:int, ldc:int(-1))
                    expr_2E0 = loadelement:byte(stack_2E0_0:byte[], var_5_2D0:int)
                    storeelement:byte(var_3_2CF:byte[], var_5_2D0:int, xor:int(or:int(and:int(shl:int(expr_2E0:byte, xor:int(ldc:int(-32762), ldc:int(-32766))), ldc:int(-16)), and:int(shr:int(expr_2E0:byte[expected:int], xor:int(ldc:int(8194), ldc:int(8198))), ldc:int(15))), ldc:int(14)))
                    
                    if (cmpne:boolean(var_5_2D0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_1D2_0 = stack_20C_0 = stack_268_0 = stack_2E0_0 = var_3_2CF:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1AE_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2690), ldc:int(2694)))
            expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4134), ldc:int(1284)))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-3893), ldc:int(1588)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-16652), ldc:int(16651)), xor:int(ldc:int(1092), ldc:int(1095))))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(98), ldc:int(97)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(38), ldc:int(37)), xor:int(ldc:int(8722), ldc:int(8748))))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(2128), ldc:int(2130)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(1087), ldc:int(1025)), and:int(ldc:int(4571), ldc:int(24654))))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(706), ldc:int(707)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(24779), ldc:int(90)), and:int(ldc:int(626), ldc:int(2150))))
            putstatic:String[](\u4975\u47c2\u67d0\uc7fe\u16f6::\u62da\ub19c\uae5d\u67e9\u7e3f, expr_13C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u0800\ubb2b\u8bb0\ud51e\u3c25(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_621 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_62C : int
        
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
        var_3_621 = and:int(ldc:int(314210711), ldc:int(-1712916785))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4975\u47c2\u67d0\uc7fe\u16f6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4096)), ldc:int(0))) {
            var_3_621 = and:int(var_3_621:int, ldc:int(284064996))
        }
        else {
            var_3_621 = and:int(var_3_621:int, ldc:int(-2106951709))
            var_5_85 = and:int(ldc:int(12551), ldc:int(-28936))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31538), ldc:int(27425)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_621:int, ldc:int(585497247))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(65), ldc:int(147)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(18048), ldc:int(18049)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_621 = and:int(var_3_DA:int, ldc:int(-1174538285))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2373), ldc:int(9873)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1222917451))
                        goto(Label_1072)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(475564597))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(574313129))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-2000176122))
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(988723197))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1215181575))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1072)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1285660580))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1488477413))
                            var_11_EB = and:int(ldc:int(-30186), ldc:int(26088))
                            goto(Label_1462)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1556092438))
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1262849310))
                        goto(Label_1072)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(456191740))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(982232591))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(361952636))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1032954155))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(2028862179))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1785990557))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1072)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(604129254))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-875494033))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1571593849))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1124175621))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1192248184))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1167868168))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1072)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1655970663))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(974895467))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-718123548))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1253467737))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(1550316939))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(3137), ldc:int(12547))
                                goto(Label_1072)
                            }
                        }
                    }
                    
                    Label_0912:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1028116616))
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-735702759))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-969126338))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(285289207))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(543956328))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-52405287))
                        var_11_EB = and:int(ldc:int(-31440), ldc:int(29387))
                    }
                    
                    Label_1072:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1850754575))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-191500397))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(47524822))
                            goto(Label_0912)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1441340322))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(200823616))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-855900995))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1325)
                            }
                        }
                    }
                    
                    Label_1198:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-375612632))
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1072)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0912)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-219506943))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-933588159))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-397314146))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-425173587))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1462)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1325:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1412014038))
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(431694699))
                        goto(Label_1072)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1136475450))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1642622561))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(2143373260))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_621 = and:int(var_3_621:int, ldc:int(-182428747))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1462:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62C = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1473:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1072)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-369093652))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1563628398))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(477615857))
                        var_17_62C = add:int(var_16_119:int, and:int(ldc:int(4417), ldc:int(16423)))
                        looporswitchbreak()
                    }
                    
                    var_3_621 = and:int(var_3_621:int, ldc:int(-1678231046))
                }
                
                var_3_621 = and:int(var_3_621:int, ldc:int(790941939))
                
                if (cmple:boolean(var_5_85 = var_17_62C:int, sub:int(var_6_8C:int, xor:int(ldc:int(6273), ldc:int(6272))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
            var_3_621 = and:int(var_3_621:int, ldc:int(754654247))
            goto(Label_0106)
        }
    }
}
