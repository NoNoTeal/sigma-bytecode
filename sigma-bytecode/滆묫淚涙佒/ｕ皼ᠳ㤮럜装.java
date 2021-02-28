public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\uff55\u76bc\u1833\u392e\ub7dc\u88c5 {
    public void \uff55\u76bc\u1833\u392e\ub7dc\u88c5(char[] p0, java.lang.Runnable p1) {
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
        invokespecial:Object(Object::<init>, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5)
        putfield:Runnable(\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\u3bc9\ubefe\u8350\u4179\u34df\u071d, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5, p1:Runnable)
        
        if (cmpge:boolean(arraylength:int(p0:char[]), and:int(ldc:int(2069), ldc:int(17219)))) {
            putfield:char[](\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\ud36e\u6d69\uae5d\u960f\uc229\u59ec, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5, p0:char[])
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\ufcaf\u836c\u8709\u071d\u392e\u8d90), and:int(ldc:int(-21351), ldc:int(21348)))))
    }
    
    public boolean \u4ab3\u2dcc\ud7e8\u74b1\u960f\u72f1(char p0) {
        var_2_5F : int
        stack_76_0 : char[] [generated]
        expr_67 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-1523090135), ldc:int(-1483229190))
            stack_76_0 = getfield:char[](\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\ud36e\u6d69\uae5d\u960f\uc229\u59ec, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5)
            expr_67 = getfield:int(\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\uf9c5\ud36e\u8d90\u527a\ud158\u600f, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5)
            putfield:int(\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\uf9c5\ud36e\u8d90\u527a\ud158\u600f, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5, add:int(expr_67:int, and:int(ldc:int(8289), ldc:int(157))))
            
            if (cmpne:boolean(p0:char, loadelement:char(stack_76_0:char[], expr_67:int))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-919634564))
                invokevirtual:void(\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\u92ee\u6fb0\u6b5f\u5bc4\u5654\u9a18, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5)
            }
            else {
                if (cmpeq:boolean(getfield:int(\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\uf9c5\ud36e\u8d90\u527a\ud158\u600f, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5), arraylength:int(getfield:char[](\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\ud36e\u6d69\uae5d\u960f\uc229\u59ec, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5)))) {
                    invokevirtual:void(\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\u92ee\u6fb0\u6b5f\u5bc4\u5654\u9a18, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5)
                    invokeinterface:void(Runnable::run, getfield:Runnable(\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\u3bc9\ubefe\u8350\u4179\u34df\u071d, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5))
                    return:boolean(xor:int[expected:boolean](ldc:int(16548), ldc:int(16549)))
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-14208), ldc:int(10074)))
        }
        
        goto(Label_0006)
    }
    
    public void \u92ee\u6fb0\u6b5f\u5bc4\u5654\u9a18() {
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
            putfield:int(\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\uf9c5\ud36e\u8d90\u527a\ud158\u600f, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5, and:int(ldc:int(5397), ldc:int(-7638)))
            return:void()
        }
        
        goto(Label_0006)
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\ufcaf\u836c\u8709\u071d\u392e\u8d90), and:int(ldc:int(129), ldc:int(2635)))), invokestatic:String(Arrays::toString, getfield:char[](\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\ud36e\u6d69\uae5d\u960f\uc229\u59ec, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5))), loadelement:String(getstatic:String[](\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\ufcaf\u836c\u8709\u071d\u392e\u8d90), and:int(ldc:int(194), ldc:int(6)))), getfield:int(\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\uf9c5\ud36e\u8d90\u527a\ud158\u600f, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5)), ldc:char(125))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1BD : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_167_0 : byte[] [generated]
        stack_1CF_0 : byte[] [generated]
        stack_244_0 : byte[] [generated]
        var_4_14A : int
        var_3_14F : byte[]
        var_5_150 : int
        expr_167 : byte [generated]
        var_0_1E7 : int
        expr_1CF : byte [generated]
        stack_213_2 : byte [generated]
        stack_1EA_0 : byte [generated]
        expr_8F : int [generated]
        var_2_A9 : byte[]
        expr_AD : int [generated]
        var_3_233 : byte[]
        var_5_234 : int
        var_3_DA : String
        stack_143_0 : String[] [generated]
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
        var_0_1BD = and:int(ldc:int(204853835), ldc:int(1052112724))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_A9_0 = stack_AB_0 = stack_CE_0 = stack_167_0 = stack_1CF_0 = stack_244_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("CJO+SVZpWf2+1fAv72jNBhj9vcVxFq5+8N1hdrA2eVbVHvAkmXPVzfL7KUnlPGul5UHWnGQsFSk=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_14A = expr_6B:int
        var_3_14F = newarray:byte[](byte.class, expr_6B:int)
        var_5_150 = expr_6B:int
        Label_0338:
        
        while (cmpne:boolean(and:int(var_0_1BD:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1BD = and:int(var_0_1BD:int, ldc:int(1588057084))
            var_5_150 = add:int(var_5_150:int, ldc:int(-1))
            expr_167 = loadelement:byte(stack_167_0:byte[], var_5_150:int)
            storeelement:byte(var_3_14F:byte[], var_5_150:int, xor:int(add:int(or:int(and:int(shl:int(expr_167:byte, and:int(ldc:int(4109), ldc:int(25638))), ldc:int(-16)), and:int(shr:int(expr_167:byte[expected:int], and:int(ldc:int(5196), ldc:int(10276))), ldc:int(15))), ldc:int(70)), ldc:int(35)))
            
            if (cmpne:boolean(var_5_150:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_CE_0 = stack_167_0 = stack_1CF_0 = stack_244_0 = var_3_14F:byte[]
            goto(Label_0112)
        }
        
        Label_0434:
        
        while (cmpeq:boolean(and:int(var_0_1BD:int, ldc:int(256)), ldc:int(0))) {
            var_0_1E7 = and:int(var_0_1BD:int, ldc:int(1273405293))
            var_5_150 = add:int(var_5_150:int, ldc:int(-1))
            expr_1CF = stack_213_2 = loadelement(stack_1CF_0, var_5_150)
            
            if (cmplt:boolean(add:int(add:int(var_5_150:int, ldc:int(5)), neg:int(var_4_14A:int)), ldc:int(0))) {
                stack_213_2 = stack_1EA_0 = add:byte(expr_1CF:byte, loadelement:byte(var_3_14F:byte[], add:int(var_5_150:int, ldc:int(5))))
                goto(Label_0506)
            }
            
            Label_0476:
            
            if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(262144)), ldc:int(0))) {
                var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-1406863380))
                stack_213_2 = stack_1EA_0 = add:byte(expr_1CF:byte, ldc:byte(5))
            }
            
            Label_0506:
            
            if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(4)), ldc:int(0))) {
                var_0_1E7 = and:int(var_0_1E7:int, ldc:int(561018819))
                goto(Label_0476)
            }
            
            var_0_1BD = and:int(var_0_1E7:int, ldc:int(-1170891187))
            storeelement:byte(var_3_14F:byte[], var_5_150:int, stack_213_2:byte)
            
            if (cmpne:boolean(var_5_150:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_CE_0 = stack_167_0 = stack_1CF_0 = stack_244_0 = var_3_14F:byte[]
            goto(Label_0148)
        }
        
        var_0_1BD = and:int(var_0_1BD:int, ldc:int(1558480221))
        goto(Label_0338)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1BD:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0178)
        }
        
        if (cmpne:boolean(and:int(var_0_1BD:int, ldc:int(32)), ldc:int(0))) {
            var_0_1BD = and:int(var_0_1BD:int, ldc:int(271641066))
        }
        else {
            var_0_1BD = and:int(var_0_1BD:int, ldc:int(976065474))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_14A = expr_8F:int
                var_3_14F = newarray:byte[](byte.class, expr_8F:int)
                var_5_150 = expr_8F:int
                goto(Label_0434)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_1BD:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1BD:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1BD = and:int(var_0_1BD:int, ldc:int(247394900))
            var_2_A9 = stack_A9_0:byte[]
            expr_AD = add:int(arraylength:int(stack_AB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_3_233 = newarray:byte[](byte.class, expr_AD:int)
                var_5_234 = expr_AD:int
                
                loop {
                    var_0_1BD = and:int(var_0_1BD:int, ldc:int(-542861341))
                    var_5_234 = add:int(var_5_234:int, ldc:int(-1))
                    storeelement:byte(var_3_233:byte[], var_5_234:int, add:int(shl:int(loadelement:byte(stack_244_0:byte[], var_5_234:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_A9:byte[], add:int(var_5_234:int, xor:int(ldc:int(4098), ldc:int(4099)))), ldc:int(7)), xor:int(ldc:int(4248), ldc:int(4249)))))
                    
                    if (cmpne:boolean(var_5_234:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_CE_0 = stack_167_0 = stack_1CF_0 = stack_244_0 = var_3_233:byte[]
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_0_1BD:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0148)
        }
        
        if (cmpeq:boolean(and:int(var_0_1BD:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1BD = and:int(var_0_1BD:int, ldc:int(-1997674763))
            goto(Label_0112)
        }
        
        var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_143_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2223), ldc:int(16659)))
        expr_EC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(27), ldc:int(31783)))
        storeelement:String(expr_EC:String[], and:int(ldc:int(16386), ldc:int(3490)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(-7130), ldc:int(7112)), xor:int(ldc:int(16457), ldc:int(16452))))
        storeelement:String(expr_EC:String[], and:int(ldc:int(6177), ldc:int(16651)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(-32759), ldc:int(-32764)), and:int(ldc:int(8733), ldc:int(5180))))
        storeelement:String(expr_EC:String[], and:int(ldc:int(-12596), ldc:int(12337)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(3485), ldc:int(8732)), and:int(ldc:int(8375), ldc:int(2679))))
        putstatic:String[](\uff55\u76bc\u1833\u392e\ub7dc\u88c5::\ufcaf\u836c\u8709\u071d\u392e\u8d90, expr_EC:String[])
    }
    
    public void \u2dcc\u183a\u4c04\u8709\u6198\ud4fe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_634 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63F : int
        
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
        var_3_634 = and:int(ldc:int(-885123896), ldc:int(1933112975))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uff55\u76bc\u1833\u392e\ub7dc\u88c5[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(1262195062))
        }
        else {
            var_3_634 = and:int(var_3_634:int, ldc:int(-1556579726))
            var_5_85 = and:int(ldc:int(11562), ldc:int(-15675))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4038), ldc:int(-20463)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_634:int, ldc:int(401585384))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(16433), ldc:int(8897)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(1125), ldc:int(16897)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_634 = and:int(var_3_D2:int, ldc:int(791245991))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(12469), ldc:int(515)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1106674061))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1159857865))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-971702652))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1341823978))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0813)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-646999993))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(614182059))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-679208849))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1432212545))
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1325797978))
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(441761479))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(811907925))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(460141471))
                            var_11_E3 = and:int(ldc:int(-1535), ldc:int(1278))
                            goto(Label_1464)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1092923685))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-21840049))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-324707720))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(304875590))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1211192485))
                        goto(Label_0813)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1590177854))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1669206096))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0813)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(859019049))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1912562092))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-572101133))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-561635127))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(203764236))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1198388561))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0813:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-262951606))
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-873532937))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-831937425))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1783341650))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(899658159))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1321359758))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(492040765))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(2138895323))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(16441), ldc:int(4545))
                                goto(Label_1108)
                            }
                        }
                    }
                    
                    Label_0956:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2141424973))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1641574534))
                            goto(Label_0813)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(2145583742))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1509243941))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1279345011))
                        var_11_E3 = and:int(ldc:int(9110), ldc:int(-25495))
                    }
                    
                    Label_1108:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0956)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1549398054))
                            goto(Label_0813)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(458767470))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(736745787))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1334)
                            }
                        }
                    }
                    
                    Label_1207:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1121867582))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(994390613))
                            goto(Label_1108)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(473133230))
                            goto(Label_0813)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1866975670))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1132179737))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1464)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1334:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-253097968))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-491919828))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(785855764))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(271136709))
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(57401303))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1464:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1475:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-88809084))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(811041891))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1757782084))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1812797648))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-809906079))
                        var_17_63F = add:int(var_16_111:int, xor:int(ldc:int(1032), ldc:int(1033)))
                        looporswitchbreak()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(1251364640))
                }
                
                var_3_634 = and:int(var_3_634:int, ldc:int(-604442055))
                
                if (cmple:boolean(var_5_85 = var_17_63F:int, sub:int(var_6_8C:int, and:int(ldc:int(20545), ldc:int(2223))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
