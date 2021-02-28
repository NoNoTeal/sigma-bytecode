public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc7fe\u76bc\ub6ab\u960f\u4492\u071d {
    public void \uc7fe\u76bc\ub6ab\u960f\u4492\u071d() {
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
            invokespecial:Object(Object::<init>, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u516c\ub113\u0b8e\u74b1\u7330\u92ee(java.util.List<java.lang.Object> p0) {
        var_2_5F : int
        var_2_6B : int
        stack_F4_1 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(716134242), ldc:int(-1234190483))
        
        if (logicalnot:boolean(getfield:boolean(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u12cb\u9033\ud171\u8c8a\u8aa5\u839e, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d))) {
            var_2_6B = and:int(var_2_5F:int, ldc:int(2084509574))
            putfield:List<Object>(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u4daf\uc246\u61a4\ubded\u97e6\u92ff, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d, p0:List<Object>)
            putfield:int(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u8640\ucfaf\u8d90\u76bc\ub83f\u47c2, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d, and:int(ldc:int(-2660), ldc:int(2659)))
            
            if (logicaland:boolean(cmpne:boolean(p0:List<Object>, aconstnull:List<Object>()), cmplt:boolean(getfield:int(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u8640\ucfaf\u8d90\u76bc\ub83f\u47c2, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d), invokeinterface:int(List::size, p0:List)))) {
                stack_F4_1 = and:int[expected:boolean](ldc:int(16419), ldc:int(14913))
            }
            else {
                var_2_6B = and:int(var_2_6B:int, ldc:int(-120594868))
                stack_F4_1 = and:int[expected:boolean](ldc:int(-9230), ldc:int(9229))
            }
            
            putfield:boolean(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u12cb\u9033\ud171\u8c8a\u8aa5\u839e, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d, stack_F4_1:boolean)
            return:void()
        }
        
        athrow(initobject:RuntimeException(RuntimeException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\uae87\u9af2\ubcb0\u8413\u8389\uc2e8), and:int(ldc:int(-8298), ldc:int(8297)))), getfield:List<Object>[expected:Object](\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u4daf\uc246\u61a4\ubded\u97e6\u92ff, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d)), loadelement:String(getstatic:String[](\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\uae87\u9af2\ubcb0\u8413\u8389\uc2e8), and:int(ldc:int(1677), ldc:int(1)))), p0:List<Object>[expected:Object]))))
    }
    
    public java.lang.Object next() {
        var_1_5F : int
        var_1_6B : int
        var_3_79 : Object
        stack_C3_1 : int [generated]
        
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
        var_1_5F = and:int(ldc:int(-1821066501), ldc:int(-69340929))
        
        if (getfield:boolean(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u12cb\u9033\ud171\u8c8a\u8aa5\u839e, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d)) {
            var_1_6B = and:int(var_1_5F:int, ldc:int(-1881300225))
            var_3_79 = invokeinterface:Object(List<Object>::get, getfield:List<Object>(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u4daf\uc246\u61a4\ubded\u97e6\u92ff, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d), getfield:int(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u8640\ucfaf\u8d90\u76bc\ub83f\u47c2, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d))
            putfield:int(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u8640\ucfaf\u8d90\u76bc\ub83f\u47c2, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d, add:int(getfield:int(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u8640\ucfaf\u8d90\u76bc\ub83f\u47c2, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d), and:int(ldc:int(29367), ldc:int(2057))))
            
            if (cmpge:boolean(getfield:int(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u8640\ucfaf\u8d90\u76bc\ub83f\u47c2, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d), invokeinterface:int(List<E>::size, getfield:List<Object>(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u4daf\uc246\u61a4\ubded\u97e6\u92ff, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d)))) {
                var_1_6B = and:int(var_1_6B:int, ldc:int(-201723651))
                stack_C3_1 = and:int[expected:boolean](ldc:int(-29857), ldc:int(29856))
            }
            else {
                stack_C3_1 = and:int[expected:boolean](ldc:int(1097), ldc:int(18695))
            }
            
            putfield:boolean(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u12cb\u9033\ud171\u8c8a\u8aa5\u839e, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d, stack_C3_1:boolean)
            return:Object(var_3_79:Object)
        }
        
        return:Object(aconstnull:Object())
    }
    
    public boolean hasNext() {
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
        
        if (getfield:boolean(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u12cb\u9033\ud171\u8c8a\u8aa5\u839e, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d)) {
            return:boolean(getfield:boolean(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\u12cb\u9033\ud171\u8c8a\u8aa5\u839e, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d))
        }
        
        invokestatic:void(\u6d99\ucef1\ub7dc\u4179\u4e72\u156b::\u71f1\uae87\u983f\u3bd6\u6cfe\u3c25, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d[expected:\u7d52\uc229\ub113\u385b\u760c\ubded])
        return:boolean(and:int[expected:boolean](ldc:int(22096), ldc:int(-22097)))
    }
    
    static {
        var_0_18A : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_19C_0 : byte[] [generated]
        stack_1D9_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        stack_2B5_0 : byte[] [generated]
        var_4_177 : int
        var_3_17C : byte[]
        var_5_17D : int
        var_0_233 : int
        expr_23D : byte [generated]
        stack_281_2 : byte [generated]
        stack_260_0 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_1C8 : byte[]
        var_5_1C9 : int
        expr_BB : int [generated]
        expr_EE : int [generated]
        var_3_2A4 : byte[]
        var_5_2A5 : int
        expr_2B5 : byte [generated]
        var_3_122 : String
        stack_170_0 : String[] [generated]
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
        var_0_18A = and:int(ldc:int(-906432512), ldc:int(2133292018))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_19C_0 = stack_1D9_0 = stack_23D_0 = stack_2B5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("sHN3pO+FSaT5zaJqW7mPu7uOzrJjhYCx96FtnoT58XpyvZK1SaT5w429")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_177 = expr_6B:int
        var_3_17C = newarray:byte[](byte.class, expr_6B:int)
        var_5_17D = expr_6B:int
        Label_0383:
        
        while (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(4)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(-617389602))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, add:byte(xor:byte(loadelement:byte(stack_19C_0:byte[], var_5_17D:int), ldc:byte(47)), ldc:byte(110)))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_19C_0 = stack_1D9_0 = stack_23D_0 = stack_2B5_0 = var_3_17C:byte[]
            goto(Label_0112)
        }
        
        var_0_18A = and:int(var_0_18A:int, ldc:int(-653663254))
        Label_0544:
        
        while (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_233 = and:int(var_0_18A:int, ldc:int(1273914519))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_23D = stack_281_2 = loadelement(stack_23D_0, var_5_17D)
            
            if (cmplt:boolean(add:int(add:int(var_5_17D:int, ldc:int(2)), neg:int(var_4_177:int)), ldc:int(0))) {
                stack_281_2 = stack_260_0 = add:byte(expr_23D:byte, loadelement:byte(var_3_17C:byte[], add:int(var_5_17D:int, ldc:int(2))))
                goto(Label_0624)
            }
            
            Label_0586:
            
            if (cmpeq:boolean(and:int(var_0_233:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_233 = and:int(var_0_233:int, ldc:int(-231717837))
            }
            else {
                var_0_233 = and:int(var_0_233:int, ldc:int(-572919821))
                stack_281_2 = stack_260_0 = add:byte(expr_23D:byte, ldc:byte(2))
            }
            
            Label_0624:
            
            if (cmpne:boolean(and:int(var_0_233:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0586)
            }
            
            var_0_18A = and:int(var_0_233:int, ldc:int(-552639220))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, stack_281_2:byte)
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_19C_0 = stack_1D9_0 = stack_23D_0 = stack_2B5_0 = var_3_17C:byte[]
            goto(Label_0192)
        }
        
        var_0_18A = and:int(var_0_18A:int, ldc:int(-217058277))
        goto(Label_0383)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(65536)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(-648446864))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_1C8 = newarray:byte[](byte.class, expr_90:int)
                var_5_1C9 = expr_90:int
                
                loop {
                    var_0_18A = and:int(var_0_18A:int, ldc:int(-878415586))
                    var_5_1C9 = add:int(var_5_1C9:int, ldc:int(-1))
                    storeelement:byte(var_3_1C8:byte[], var_5_1C9:int, add:int(shl:int(loadelement:byte(stack_1D9_0:byte[], var_5_1C9:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_1C9:int, xor:int(ldc:int(9222), ldc:int(9223)))), ldc:int(4)), xor:int(ldc:int(3), ldc:int(12)))))
                    
                    if (cmpne:boolean(var_5_1C9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_19C_0 = stack_1D9_0 = stack_23D_0 = stack_2B5_0 = var_3_1C8:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(8)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(64)), ldc:int(0))) {
                var_0_18A = and:int(var_0_18A:int, ldc:int(-1049477606))
                goto(Label_0112)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(2137161492))
            expr_BB = arraylength:int(stack_BB_0:byte[])
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_4_177 = expr_BB:int
                var_3_17C = newarray:byte[](byte.class, expr_BB:int)
                var_5_17D = expr_BB:int
                goto(Label_0544)
            }
        }
        
        Label_0192:
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(8192)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(2137721368))
        }
        else {
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(65536)), ldc:int(0))) {
                var_0_18A = and:int(var_0_18A:int, ldc:int(-36353406))
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(-385719648))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2A4 = newarray:byte[](byte.class, expr_EE:int)
                var_5_2A5 = expr_EE:int
                
                loop {
                    var_0_18A = and:int(var_0_18A:int, ldc:int(-106004533))
                    var_5_2A5 = add:int(var_5_2A5:int, ldc:int(-1))
                    expr_2B5 = loadelement:byte(stack_2B5_0:byte[], var_5_2A5:int)
                    storeelement:byte(var_3_2A4:byte[], var_5_2A5:int, or:int(and:int(shl:int(expr_2B5:byte, and:int(ldc:int(4148), ldc:int(2439))), ldc:int(-16)), and:int(shr:int(expr_2B5:byte[expected:int], and:int(ldc:int(132), ldc:int(4))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2A5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_19C_0 = stack_1D9_0 = stack_23D_0 = stack_2B5_0 = var_3_2A4:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0149)
        }
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(-936269016))
            goto(Label_0112)
        }
        
        var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_170_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-27904), ldc:int(-27902)))
        expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(12770), ldc:int(3)))
        storeelement:String(expr_134:String[], xor:int(ldc:int(192), ldc:int(193)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-881), ldc:int(880)), and:int(ldc:int(10283), ldc:int(4171))))
        storeelement:String(expr_134:String[], and:int(ldc:int(-15793), ldc:int(15408)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(27), ldc:int(395)), xor:int(ldc:int(8722), ldc:int(8763))))
        putstatic:String[](\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::\uae87\u9af2\ubcb0\u8413\u8389\uc2e8, expr_134:String[])
    }
    
    public void \u3bc9\uae87\u97b7\u93a2\u4492\u6b5f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_669 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_674 : int
        
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
        var_3_669 = and:int(ldc:int(829664641), ldc:int(2100817187))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(-1825445115))
            var_5_7D = and:int(ldc:int(16430), ldc:int(-16751))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3170), ldc:int(-3176)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_669:int, ldc:int(-1741165683))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(3569), ldc:int(521)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-30703), ldc:int(-30704)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_669 = and:int(var_3_D2:int, ldc:int(-616699033))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(22051), ldc:int(2497)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1190863969))
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1935723165))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-624838986))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1390660639))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(28596768))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1950191089))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1377940335))
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1176172909))
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2112771817))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1272858879))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1895364576))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(1983094187))
                        var_11_E3 = and:int(ldc:int(8451), ldc:int(-8452))
                        goto(Label_1525)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-424691901))
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-546091497))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-213392076))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1500950591))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-2048673583))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-732800603))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1828642803))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1187136153))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-590136783))
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1721092001))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-605641255))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1149904069))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0815:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1328937024))
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1761561068))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1391215452))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1681602509))
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1909124417))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(159084165))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(1992138505))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(25993), ldc:int(69))
                                goto(Label_1113)
                            }
                        }
                    }
                    
                    Label_0951:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1018793997))
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(160077093))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-676135253))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1986057800))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(798035042))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(981069725))
                        var_11_E3 = and:int(ldc:int(15538), ldc:int(-31923))
                    }
                    
                    Label_1113:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(614913965))
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-24161659))
                            goto(Label_0951)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-386531985))
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-441215410))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-522794044))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(284117389))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1083077323))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1404)
                            }
                        }
                    }
                    
                    Label_1249:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(200722741))
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(190159966))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1113)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1901256688))
                            goto(Label_0951)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1616337941))
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(2098759035))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1450158842))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1826028905))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1325662917))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1525)
                    }
                    
                    Label_1404:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1782263428))
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-125293011))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1550158002))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(-134874293))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1525:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_674 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1536:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-168320961))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(529480648))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(612758029))
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1182302013))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-76023313))
                        var_17_674 = add:int(var_16_111:int, xor:int(ldc:int(2370), ldc:int(2371)))
                        looporswitchbreak()
                    }
                }
                
                var_3_669 = and:int(var_3_669:int, ldc:int(-25699351))
                
                if (cmple:boolean(var_5_7D = var_17_674:int, sub:int(var_6_84:int, and:int(ldc:int(1025), ldc:int(26905))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(-1123976886))
            goto(Label_0106)
        }
    }
}
