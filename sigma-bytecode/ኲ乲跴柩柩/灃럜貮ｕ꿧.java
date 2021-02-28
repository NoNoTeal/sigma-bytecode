public final class \u12b2\u4e72\u8df4\u67e9\u67e9.\u7043\ub7dc\u8cae\uff55\uafe7 {
    private void \u7043\ub7dc\u8cae\uff55\uafe7() {
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
            invokespecial:Object(Object::<init>, this:\u7043\ub7dc\u8cae\uff55\uafe7)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u873d\u74b1\u983f\u385b\u3bd6\u8df4(long p0) {
        var_2_5F : int
        var_4_67 : StringBuilder
        var_5_6A : long
        
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
            var_2_5F = and:int(ldc:int(1367791030), ldc:int(-1143744650))
            var_4_67 = initobject:StringBuilder(StringBuilder::<init>)
            var_5_6A = p0:long
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1054832631))
                invokevirtual:StringBuilder(StringBuilder::insert, var_4_67:StringBuilder, and:int(ldc:int(-19075), ldc:int(19074)), loadelement:char(getstatic:char[](\u7043\ub7dc\u8cae\uff55\uafe7::\u9937\u3d64\ubcb0\uafe7\uc246\ufcaf), l2i:int(rem:long(var_5_6A:long, i2l:long(getstatic:int(\u7043\ub7dc\u8cae\uff55\uafe7::\u6d99\u5bc4\uc7fe\u3504\ubded\u8bb0))))))
                var_5_6A = div:long(var_5_6A:long, i2l:long(getstatic:int(\u7043\ub7dc\u8cae\uff55\uafe7::\u6d99\u5bc4\uc7fe\u3504\ubded\u8bb0)))
                
                if (cmpgt:boolean(var_5_6A:long, ldc:long(0L))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, var_4_67:StringBuilder))
        }
        
        goto(Label_0006)
    }
    
    public static long \u983f\u8308\u760c\u64ab\u120d\ucb79(java.lang.String p0) {
        var_1_5F : int
        var_3_61 : long
        var_5_66 : char[]
        var_6_6B : int
        var_7_74 : int
        
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
            var_1_5F = and:int(ldc:int(169739607), ldc:int(675457365))
            var_3_61 = ldc:long(0L)
            var_5_66 = invokevirtual:char[](String::toCharArray, p0:String)
            var_6_6B = arraylength:int(var_5_66:char[])
            var_7_74 = and:int(ldc:int(-15559), ldc:int(11462))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(483008373))
                
                if (cmpge:boolean(var_7_74:int, var_6_6B:int)) {
                    looporswitchbreak()
                }
                
                var_3_61 = add:long(mul:long(var_3_61:long, i2l:long(getstatic:int(\u7043\ub7dc\u8cae\uff55\uafe7::\u6d99\u5bc4\uc7fe\u3504\ubded\u8bb0))), i2l:long(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Map<Character, Integer>::get, getstatic:Map<Character, Integer>(\u7043\ub7dc\u8cae\uff55\uafe7::\u7049\u3504\u4179\u93a2\u7330\u494c), invokestatic:Character(Character::valueOf, loadelement:char(var_5_66:char[], var_7_74:int)))))))
                inc:int(var_7_74, ldc:int(1))
            }
            
            return:long(var_3_61:long)
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u873d\u7bad\u56bd\uf9c5\uc84e\u3bd6() {
        var_2_6D : String
        stack_A9_0 : StringBuilder [generated]
        expr_96 : int [generated]
        
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
        var_2_6D = invokestatic:String(\u7043\ub7dc\u8cae\uff55\uafe7::\u873d\u74b1\u983f\u385b\u3bd6\u8df4, invokevirtual:long(Date::getTime, initobject:Date(Date::<init>)))
        
        if (invokevirtual:boolean(String::equals, var_2_6D:String, getstatic:String[expected:Object](\u7043\ub7dc\u8cae\uff55\uafe7::\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99))) {
            stack_A9_0 = invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_2_6D:String), loadelement:String(getstatic:String[](\u7043\ub7dc\u8cae\uff55\uafe7::\uc3e3\ud171\u12b2\u36d3\u8aa5\ucb79), and:int(ldc:int(-29352), ldc:int(12963))))
            expr_96 = getstatic:int(\u7043\ub7dc\u8cae\uff55\uafe7::\u516c\u92ff\u5f50\u1833\u3e75\u839e)
            putstatic:int(\u7043\ub7dc\u8cae\uff55\uafe7::\u516c\u92ff\u5f50\u1833\u3e75\u839e, add:int(expr_96:int, and:int(ldc:int(1297), ldc:int(16419))))
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, stack_A9_0:StringBuilder, invokestatic:String(\u7043\ub7dc\u8cae\uff55\uafe7::\u873d\u74b1\u983f\u385b\u3bd6\u8df4, i2l:long(expr_96:int)))))
        }
        
        putstatic:int(\u7043\ub7dc\u8cae\uff55\uafe7::\u516c\u92ff\u5f50\u1833\u3e75\u839e, and:int(ldc:int(-31649), ldc:int(31648)))
        return:String(putstatic:String(\u7043\ub7dc\u8cae\uff55\uafe7::\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99, var_2_6D:String))
    }
    
    static {
        var_0_18C : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_19E_0 : byte[] [generated]
        stack_1F4_0 : byte[] [generated]
        stack_250_0 : byte[] [generated]
        var_5_179 : int
        var_3_17E : byte[]
        var_6_17F : int
        expr_1A1 : byte [generated]
        var_0_246 : int
        expr_250 : byte [generated]
        stack_294_2 : byte [generated]
        stack_273_0 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_1E3 : byte[]
        var_6_1E4 : int
        expr_BD : int [generated]
        var_3_EA : String
        expr_F2 : String[] [generated]
        expr_FC : String[] [generated]
        var_4_16F : int
        
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
        var_0_18C = and:int(ldc:int(787256920), ldc:int(-1209157768))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_19E_0 = stack_1F4_0 = stack_250_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("KTU0NDQ0NDQ0Ly8vNDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQuLi40NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0xBKz3tMF")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_5_179 = expr_6B:int
        var_3_17E = newarray:byte[](byte.class, expr_6B:int)
        var_6_17F = expr_6B:int
        Label_0385:
        
        while (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(32)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(536211226))
            var_6_17F = add:int(var_6_17F:int, ldc:int(-1))
            expr_1A1 = add:byte(loadelement:byte(stack_19E_0:byte[], var_6_17F:int), ldc:byte(104))
            storeelement:byte(var_3_17E:byte[], var_6_17F:int, xor:int(or:int(and:int(shl:int(expr_1A1:byte, and:int(ldc:int(20484), ldc:int(1053))), ldc:int(-16)), and:int(shr:int(expr_1A1:byte[expected:int], xor:int(ldc:int(20771), ldc:int(20775))), ldc:int(15))), ldc:int(22)))
            
            if (cmpne:boolean(var_6_17F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_19E_0 = stack_1F4_0 = stack_250_0 = var_3_17E:byte[]
            goto(Label_0112)
        }
        
        var_0_18C = and:int(var_0_18C:int, ldc:int(-307093813))
        Label_0571:
        
        while (cmpne:boolean(and:int(var_0_18C:int, ldc:int(512)), ldc:int(0))) {
            var_0_246 = and:int(var_0_18C:int, ldc:int(603449275))
            var_6_17F = add:int(var_6_17F:int, ldc:int(-1))
            expr_250 = stack_294_2 = loadelement(stack_250_0, var_6_17F)
            
            if (cmplt:boolean(add:int(add:int(var_6_17F:int, ldc:int(3)), neg:int(var_5_179:int)), ldc:int(0))) {
                stack_294_2 = stack_273_0 = add:byte(expr_250:byte, loadelement:byte(var_3_17E:byte[], add:int(var_6_17F:int, ldc:int(3))))
                goto(Label_0643)
            }
            
            Label_0605:
            
            if (cmpne:boolean(and:int(var_0_246:int, ldc:int(16384)), ldc:int(0))) {
                var_0_246 = and:int(var_0_246:int, ldc:int(-872302603))
            }
            else {
                var_0_246 = and:int(var_0_246:int, ldc:int(-1829845078))
                stack_294_2 = stack_273_0 = add:byte(expr_250:byte, ldc:byte(3))
            }
            
            Label_0643:
            
            if (cmpeq:boolean(and:int(var_0_246:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0605)
            }
            
            var_0_18C = and:int(var_0_246:int, ldc:int(-688417239))
            storeelement:byte(var_3_17E:byte[], var_6_17F:int, stack_294_2:byte)
            
            if (cmpne:boolean(var_6_17F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_19E_0 = stack_1F4_0 = stack_250_0 = var_3_17E:byte[]
            goto(Label_0194)
        }
        
        goto(Label_0385)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_18C:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0194)
        }
        
        if (cmpne:boolean(and:int(var_0_18C:int, ldc:int(2048)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(751622239))
        }
        else {
            var_0_18C = and:int(var_0_18C:int, ldc:int(-2030786965))
            var_2_8D = stack_8D_0:byte[]
            expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                var_3_1E3 = newarray:byte[](byte.class, expr_91:int)
                var_6_1E4 = expr_91:int
                
                loop {
                    var_0_18C = and:int(var_0_18C:int, ldc:int(49600461))
                    var_6_1E4 = add:int(var_6_1E4:int, ldc:int(-1))
                    storeelement:byte(var_3_1E3:byte[], var_6_1E4:int, add:int(shl:int(loadelement:byte(stack_1F4_0:byte[], var_6_1E4:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_6_1E4:int, xor:int(ldc:int(2118), ldc:int(2119)))), ldc:int(4)), and:int(ldc:int(143), ldc:int(22031)))))
                    
                    if (cmpne:boolean(var_6_1E4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_19E_0 = stack_1F4_0 = stack_250_0 = var_3_1E3:byte[]
            }
        }
        
        Label_0150:
        
        if (cmpne:boolean(and:int(var_0_18C:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(161023238))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(512)), ldc:int(0))) {
                var_0_18C = and:int(var_0_18C:int, ldc:int(-1286611062))
                goto(Label_0112)
            }
            
            var_0_18C = and:int(var_0_18C:int, ldc:int(-807018886))
            expr_BD = arraylength:int(stack_BD_0:byte[])
            
            if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                var_5_179 = expr_BD:int
                var_3_17E = newarray:byte[](byte.class, expr_BD:int)
                var_6_17F = expr_BD:int
                goto(Label_0571)
            }
        }
        
        Label_0194:
        
        if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0150)
        }
        
        if (cmpeq:boolean(and:int(var_0_18C:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_18C = and:int(var_0_18C:int, ldc:int(993905400))
            goto(Label_0112)
        }
        
        var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_F2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(10242), ldc:int(5898)))
        expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16394), ldc:int(3123)))
        storeelement:String(expr_FC:String[], and:int(ldc:int(-20468), ldc:int(19826)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(-25798), ldc:int(17604)), xor:int(ldc:int(16416), ldc:int(16417))))
        storeelement:String(expr_F2:String[], xor:int(ldc:int(8208), ldc:int(8209)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(1289), ldc:int(1288)), xor:int(ldc:int(781), ldc:int(844))))
        putstatic:String[](\u7043\ub7dc\u8cae\uff55\uafe7::\uc3e3\ud171\u12b2\u36d3\u8aa5\ucb79, expr_FC:String[])
        putstatic:char[](\u7043\ub7dc\u8cae\uff55\uafe7::\u9937\u3d64\ubcb0\uafe7\uc246\ufcaf, invokevirtual:char[](String::toCharArray, loadelement:String(expr_F2:String[], xor:int(ldc:int(18432), ldc:int(18433)))))
        putstatic:int(\u7043\ub7dc\u8cae\uff55\uafe7::\u6d99\u5bc4\uc7fe\u3504\ubded\u8bb0, arraylength:int(getstatic:char[](\u7043\ub7dc\u8cae\uff55\uafe7::\u9937\u3d64\ubcb0\uafe7\uc246\ufcaf)))
        putstatic:int(\u7043\ub7dc\u8cae\uff55\uafe7::\u516c\u92ff\u5f50\u1833\u3e75\u839e, and:int(ldc:int(24816), ldc:int(-25843)))
        putstatic:Map<Character, Integer>(\u7043\ub7dc\u8cae\uff55\uafe7::\u7049\u3504\u4179\u93a2\u7330\u494c, initobject:HashMap<Character, Integer>[expected:Map<Character, Integer>](HashMap<K, V>::<init>, getstatic:int(\u7043\ub7dc\u8cae\uff55\uafe7::\u6d99\u5bc4\uc7fe\u3504\ubded\u8bb0)))
        var_4_16F = and:int(ldc:int(22864), ldc:int(-22898))
        
        while (cmplt:boolean(var_4_16F:int, getstatic:int(\u7043\ub7dc\u8cae\uff55\uafe7::\u6d99\u5bc4\uc7fe\u3504\ubded\u8bb0))) {
            invokeinterface:Integer(Map<Character, Integer>::put, getstatic:Map<Character, Integer>(\u7043\ub7dc\u8cae\uff55\uafe7::\u7049\u3504\u4179\u93a2\u7330\u494c), invokestatic:Character(Character::valueOf, loadelement:char(getstatic:char[](\u7043\ub7dc\u8cae\uff55\uafe7::\u9937\u3d64\ubcb0\uafe7\uc246\ufcaf), var_4_16F:int)), invokestatic:Integer(Integer::valueOf, var_4_16F:int))
            inc:int(var_4_16F, ldc:int(1))
        }
    }
    
    public void \u62da\u7006\u960f\u6198\ub83f\u5db4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67E : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_689 : int
        
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
        var_3_67E = and:int(ldc:int(1951162808), ldc:int(-1228374596))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7043\ub7dc\u8cae\uff55\uafe7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(524288)), ldc:int(0))) {
            var_3_67E = and:int(var_3_67E:int, ldc:int(819585533))
            var_5_7D = and:int(ldc:int(-28100), ldc:int(27075))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3616), ldc:int(1567)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_67E:int, ldc:int(-1169361617))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(8789), ldc:int(33)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(-32733), ldc:int(-32734)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_67E = and:int(var_3_CA:int, ldc:int(910912317))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(16385), ldc:int(13569)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(828074117))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1849841305))
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-386155553))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1362037448))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1557445049))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-2124930822))
                    }
                    else {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1141311197))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0574)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0403:
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1286431256))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1871514407))
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1547979777))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-368182872))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-1000564743))
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(905962786))
                        var_11_DB = and:int(ldc:int(-4201), ldc:int(4200))
                        goto(Label_1536)
                    }
                    
                    Label_0574:
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-706777190))
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1964305118))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1960460824))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-479787162))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-751699833))
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1174899733))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0701:
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-508641546))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1709161636))
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-754682375))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-469902799))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(810285495))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1828647443))
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1999792754))
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(653182472))
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(1957325011))
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(861502883))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(16513), ldc:int(4217))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0946:
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(731439014))
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-56969839))
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(260302143))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-1252278822))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-127175261))
                        var_11_DB = and:int(ldc:int(-31756), ldc:int(23563))
                    }
                    
                    Label_1101:
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-2137440218))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(901146144))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1600391463))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0946)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-1277811353))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-102844806))
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-907058736))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-1027682055))
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-1372981525))
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-159809690))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1387)
                            }
                        }
                    }
                    
                    Label_1256:
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1866653236))
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(448696981))
                            goto(Label_1101)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(397695130))
                            goto(Label_0946)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(1499937692))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(1063807930))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1536)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1387:
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-601473246))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(366985469))
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(652855279))
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(840803231))
                        goto(Label_0574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1722525481))
                        goto(Label_0403)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1952642506))
                        loopcontinue()
                    }
                    
                    var_3_67E = and:int(var_3_67E:int, ldc:int(-1218676433))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1536:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_689 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1547:
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(2085570018))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(854674523))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(105259531))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1628924485))
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1363371776))
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0403)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-79042061))
                        var_17_689 = add:int(var_16_109:int, xor:int(ldc:int(-32736), ldc:int(-32735)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67E = and:int(var_3_67E:int, ldc:int(2088659839))
                
                if (cmple:boolean(var_5_7D = var_17_689:int, sub:int(var_6_84:int, and:int(ldc:int(6145), ldc:int(141))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
