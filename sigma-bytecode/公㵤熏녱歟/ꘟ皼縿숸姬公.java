public class \u516c\u3d64\u718f\ub171\u6b5f.\ua61f\u76bc\u7e3f\uc238\u59ec\u516c {
    public void \ua61f\u76bc\u7e3f\uc238\u59ec\u516c() {
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
            invokespecial:Object(Object::<init>, this:\ua61f\u76bc\u7e3f\uc238\u59ec\u516c)
            putfield:Boolean(\ua61f\u76bc\u7e3f\uc238\u59ec\u516c::\u071d\u0b8e\uae87\ub83f\u3e2a\uc9f6, this:\ua61f\u76bc\u7e3f\uc238\u59ec\u516c, aconstnull:Boolean())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u836c\u7af6\ubded\ubb2b\u3dd3\u416d() {
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
            
            if (cmpeq:boolean(getfield:Boolean(\ua61f\u76bc\u7e3f\uc238\u59ec\u516c::\u071d\u0b8e\uae87\ub83f\u3e2a\uc9f6, this:\ua61f\u76bc\u7e3f\uc238\u59ec\u516c), aconstnull:Boolean())) {
                putfield:Boolean(\ua61f\u76bc\u7e3f\uc238\u59ec\u516c::\u071d\u0b8e\uae87\ub83f\u3e2a\uc9f6, this:\ua61f\u76bc\u7e3f\uc238\u59ec\u516c, invokestatic:Boolean(Boolean::valueOf, invokevirtual:boolean(String::startsWith, invokestatic:String(System::getProperty, loadelement:String(getstatic:String[](\ua61f\u76bc\u7e3f\uc238\u59ec\u516c::\u8df4\u34df\u960f\uae5d\u7d52\u6198), and:int(ldc:int(-84), ldc:int(83)))), loadelement:String(getstatic:String[](\ua61f\u76bc\u7e3f\uc238\u59ec\u516c::\u8df4\u34df\u960f\uae5d\u7d52\u6198), and:int(ldc:int(14093), ldc:int(2083))))))
            }
            
            return:boolean(invokevirtual:boolean(Boolean::booleanValue, getfield:Boolean(\ua61f\u76bc\u7e3f\uc238\u59ec\u516c::\u071d\u0b8e\uae87\ub83f\u3e2a\uc9f6, this:\ua61f\u76bc\u7e3f\uc238\u59ec\u516c)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_199 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_F2_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1AB_0 : byte[] [generated]
        stack_206_0 : byte[] [generated]
        stack_294_0 : byte[] [generated]
        stack_2E7_0 : byte[] [generated]
        var_4_17F : int
        var_3_184 : byte[]
        var_5_185 : int
        var_0_1FC : int
        expr_206 : byte [generated]
        stack_24A_2 : byte [generated]
        stack_229_0 : byte [generated]
        expr_297 : byte [generated]
        expr_8E : int [generated]
        expr_C1 : int [generated]
        var_2_F2 : byte[]
        expr_F6 : int [generated]
        var_3_2D6 : byte[]
        var_5_2D7 : int
        var_3_12A : String
        stack_178_0 : String[] [generated]
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
        var_0_199 = and:int(ldc:int(-2105455231), ldc:int(-2141385261))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_BF_0 = stack_C1_0 = stack_F2_0 = stack_F4_0 = stack_11E_0 = stack_1AB_0 = stack_206_0 = stack_294_0 = stack_2E7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("L7pjVEa7O54qxU5EzD9gPbqwQhDFxW5GRUJGVpqaEx1h")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_17F = expr_6B:int
        var_3_184 = newarray:byte[](byte.class, expr_6B:int)
        var_5_185 = expr_6B:int
        Label_0391:
        
        while (cmpeq:boolean(and:int(var_0_199:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_199:int, ldc:int(8192)), ldc:int(0))) {
                var_0_199 = and:int(var_0_199:int, ldc:int(1736919054))
                goto(Label_0474)
            }
            
            var_0_199 = and:int(var_0_199:int, ldc:int(-1709589221))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            storeelement:byte(var_3_184:byte[], var_5_185:int, xor:byte(loadelement:byte(stack_1AB_0:byte[], var_5_185:int), ldc:byte(70)))
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_F2_0 = stack_F4_0 = stack_11E_0 = stack_1AB_0 = stack_206_0 = stack_294_0 = stack_2E7_0 = var_3_184:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0624)
        Label_0474:
        
        while (cmpne:boolean(and:int(var_0_199:int, ldc:int(1)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_199:int, ldc:int(32)), ldc:int(0))) {
                var_0_199 = and:int(var_0_199:int, ldc:int(190049689))
                goto(Label_0391)
            }
            
            var_0_1FC = and:int(var_0_199:int, ldc:int(-346948545))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            expr_206 = stack_24A_2 = loadelement(stack_206_0, var_5_185)
            
            if (cmplt:boolean(add:int(add:int(var_5_185:int, ldc:int(5)), neg:int(var_4_17F:int)), ldc:int(0))) {
                stack_24A_2 = stack_229_0 = add:byte(expr_206:byte, loadelement:byte(var_3_184:byte[], add:int(var_5_185:int, ldc:int(5))))
                goto(Label_0569)
            }
            
            Label_0531:
            
            if (cmpne:boolean(and:int(var_0_1FC:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_1FC = and:int(var_0_1FC:int, ldc:int(-1316985492))
            }
            else {
                var_0_1FC = and:int(var_0_1FC:int, ldc:int(-643732037))
                stack_24A_2 = stack_229_0 = add:byte(expr_206:byte, ldc:byte(5))
            }
            
            Label_0569:
            
            if (cmpne:boolean(and:int(var_0_1FC:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0531)
            }
            
            var_0_199 = and:int(var_0_1FC:int, ldc:int(-101736743))
            storeelement:byte(var_3_184:byte[], var_5_185:int, stack_24A_2:byte)
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_F2_0 = stack_F4_0 = stack_11E_0 = stack_1AB_0 = stack_206_0 = stack_294_0 = stack_2E7_0 = var_3_184:byte[]
            goto(Label_0147)
        }
        
        var_0_199 = and:int(var_0_199:int, ldc:int(1076717225))
        Label_0624:
        
        while (cmpeq:boolean(and:int(var_0_199:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(1)), ldc:int(0))) {
                var_0_199 = and:int(var_0_199:int, ldc:int(-1179549021))
                goto(Label_0391)
            }
            
            var_0_199 = and:int(var_0_199:int, ldc:int(-577269849))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            expr_297 = add:byte(loadelement:byte(stack_294_0:byte[], var_5_185:int), ldc:byte(86))
            storeelement:byte(var_3_184:byte[], var_5_185:int, or:int(and:int(shl:int(expr_297:byte, xor:int(ldc:int(16576), ldc:int(16580))), ldc:int(-16)), and:int(shr:int(expr_297:byte[expected:int], xor:int(ldc:int(12327), ldc:int(12323))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_F2_0 = stack_F4_0 = stack_11E_0 = stack_1AB_0 = stack_206_0 = stack_294_0 = stack_2E7_0 = var_3_184:byte[]
            goto(Label_0198)
        }
        
        goto(Label_0474)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(1)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(-1650238277))
            expr_8E = arraylength:int(stack_8E_0:byte[])
            
            if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                var_4_17F = expr_8E:int
                var_3_184 = newarray:byte[](byte.class, expr_8E:int)
                var_5_185 = expr_8E:int
                goto(Label_0474)
            }
        }
        
        Label_0147:
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(8192)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(122572738))
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(16)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(577207535))
        }
        else {
            if (cmpne:boolean(and:int(var_0_199:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_199 = and:int(var_0_199:int, ldc:int(-1175630309))
            expr_C1 = arraylength:int(stack_C1_0:byte[])
            
            if (cmpne:boolean(expr_C1:int, ldc:int(0))) {
                var_4_17F = expr_C1:int
                var_3_184 = newarray:byte[](byte.class, expr_C1:int)
                var_5_185 = expr_C1:int
                goto(Label_0624)
            }
        }
        
        Label_0198:
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(-1845285773))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(1024)), ldc:int(0))) {
                var_0_199 = and:int(var_0_199:int, ldc:int(-796713041))
                goto(Label_0147)
            }
            
            if (cmpne:boolean(and:int(var_0_199:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_199 = and:int(var_0_199:int, ldc:int(-1641562461))
            var_2_F2 = stack_F2_0:byte[]
            expr_F6 = add:int(arraylength:int(stack_F4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2D6 = newarray:byte[](byte.class, expr_F6:int)
                var_5_2D7 = expr_F6:int
                
                loop {
                    var_0_199 = and:int(var_0_199:int, ldc:int(-368099819))
                    var_5_2D7 = add:int(var_5_2D7:int, ldc:int(-1))
                    storeelement:byte(var_3_2D6:byte[], var_5_2D7:int, add:int(shl:int(loadelement:byte(stack_2E7_0:byte[], var_5_2D7:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_F2:byte[], add:int(var_5_2D7:int, and:int(ldc:int(21505), ldc:int(10369)))), ldc:int(3)), and:int(ldc:int(287), ldc:int(127)))))
                    
                    if (cmpne:boolean(var_5_2D7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_F2_0 = stack_F4_0 = stack_11E_0 = stack_1AB_0 = stack_206_0 = stack_294_0 = stack_2E7_0 = var_3_2D6:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(2048)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(-1153995898))
            goto(Label_0198)
        }
        
        if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0147)
        }
        
        if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_178_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(11782), ldc:int(4194)))
            expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1028), ldc:int(1030)))
            storeelement:String(expr_13C:String[], and:int(ldc:int(519), ldc:int(4417)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-25010), ldc:int(24992)), and:int(ldc:int(2607), ldc:int(1295))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-6243), ldc:int(6242)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(5134), ldc:int(5121)), xor:int(ldc:int(-32254), ldc:int(-32222))))
            putstatic:String[](\ua61f\u76bc\u7e3f\uc238\u59ec\u516c::\u8df4\u34df\u960f\uae5d\u7d52\u6198, expr_13C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u9033\u718f\u8aa5\u4daf\uc910\u69d9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_619 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_624 : int
        
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
        var_3_619 = and:int(ldc:int(1039510217), ldc:int(-1653285382))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua61f\u76bc\u7e3f\uc238\u59ec\u516c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(128)), ldc:int(0))) {
            var_3_619 = and:int(var_3_619:int, ldc:int(-571148145))
            var_5_7D = and:int(ldc:int(-10456), ldc:int(10391))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-22878), ldc:int(6229)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_619:int, ldc:int(-638141185))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-30684), ldc:int(-30683)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(24641), ldc:int(7205)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_619 = and:int(var_3_CA:int, ldc:int(-109803282))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(36), ldc:int(37)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-772174732))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1506924896))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1019845847))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(32)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-949704158))
                    }
                    else {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1116288807))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(32)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1085872896))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-508097304))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(2)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-1843599804))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(1971109886))
                        var_11_DB = and:int(ldc:int(9633), ldc:int(-13746))
                        goto(Label_1427)
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1590609907))
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1264570965))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(349122099))
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(12621341))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(-679505989))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1804248781))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-165554995))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(32)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1550801930))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(1500834043))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(2074233841))
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-2126724581))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(408408567))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(32)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-1131993122))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1216488466))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(2176), ldc:int(2177))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0857:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-778884583))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1621049444))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1436267533))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-1168573015))
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(1168427658))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-1186196077))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(1427645279))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(1467848953))
                        var_11_DB = and:int(ldc:int(-5742), ldc:int(1645))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-353010898))
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(204255609))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(2114739465))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-1831157357))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-68978326))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1073755686))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1272)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1971176975))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-687424692))
                            goto(Label_1027)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(32)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-867589743))
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-772960073))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(2071248075))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1427)
                    }
                    
                    Label_1272:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(2112084217))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1562730537))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(2001937332))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1142451559))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1059284089))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1460283511))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(947780342))
                        loopcontinue()
                    }
                    
                    var_3_619 = and:int(var_3_619:int, ldc:int(-1812026438))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1427:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_624 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1438:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(624912758))
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1482770191))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-2076823823))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1736230779))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1386542411))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1238975992))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-771909416))
                        var_17_624 = add:int(var_16_109:int, and:int(ldc:int(9217), ldc:int(6539)))
                        looporswitchbreak()
                    }
                }
                
                var_3_619 = and:int(var_3_619:int, ldc:int(-109070131))
                
                if (cmple:boolean(var_5_7D = var_17_624:int, sub:int(var_6_84:int, xor:int(ldc:int(-28655), ldc:int(-28656))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
