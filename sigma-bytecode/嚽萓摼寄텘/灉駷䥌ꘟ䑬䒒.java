public class \u56bd\u8413\u647c\u5bc4\ud158.\u7049\u99f7\u494c\ua61f\u446c\u4492 {
    public void \u7049\u99f7\u494c\ua61f\u446c\u4492() {
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
            invokespecial:Object(Object::<init>, this:\u7049\u99f7\u494c\ua61f\u446c\u4492)
            putfield:byte[](\u7049\u99f7\u494c\ua61f\u446c\u4492::\u965f\u927d\u7049\uc31c\u59ec\ud36e, this:\u7049\u99f7\u494c\ua61f\u446c\u4492, newarray:byte[](byte.class, xor:int(ldc:int(1920), ldc:int(3968))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7049\u99f7\u494c\ua61f\u446c\u4492(byte[] p0) {
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
        invokespecial:Object(Object::<init>, this:\u7049\u99f7\u494c\ua61f\u446c\u4492)
        putfield:byte[](\u7049\u99f7\u494c\ua61f\u446c\u4492::\u965f\u927d\u7049\uc31c\u59ec\ud36e, this:\u7049\u99f7\u494c\ua61f\u446c\u4492, p0:byte[])
        
        if (cmpeq:boolean(arraylength:int(p0:byte[]), xor:int(ldc:int(-30816), ldc:int(-28768)))) {
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7049\u99f7\u494c\ua61f\u446c\u4492::\u6d99\uc246\u64ab\ube23\ub83f\u7bad), and:int(ldc:int(17538), ldc:int(-17539)))), arraylength:int(p0:byte[])))))
    }
    
    public int \ud12e\u6d69\u6c52\u0800\u0b8e\u9a18(int p0, int p1, int p2) {
        var_4_61 : int
        var_6_77 : int
        stack_C1_0 : int [generated]
        
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
            var_4_61 = and:int(ldc:int(-829032028), ldc:int(-817900874))
            var_6_77 = invokespecial:int(\u7049\u99f7\u494c\ua61f\u446c\u4492::\u8258\ubff1\u64f2\uc7fe\u7e3f\ud36e, this:\u7049\u99f7\u494c\ua61f\u446c\u4492, or:int(or:int(shl:int(p1:int, ldc:int(8)), shl:int(p2:int, xor:int(ldc:int(-28666), ldc:int(-28670)))), p0:int))
            
            if (logicalnot:boolean(invokespecial:boolean(\u7049\u99f7\u494c\ua61f\u446c\u4492::\u3d4b\u8640\u34df\u6ec6\u47c2\ubded, this:\u7049\u99f7\u494c\ua61f\u446c\u4492, or:int(or:int(shl:int(p1:int, ldc:int(8)), shl:int(p2:int, and:int(ldc:int(5382), ldc:int(18436)))), p0:int)))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-346090508))
                stack_C1_0 = and:int(shr:int(loadelement:byte[expected:int](getfield:byte[](\u7049\u99f7\u494c\ua61f\u446c\u4492::\u965f\u927d\u7049\uc31c\u59ec\ud36e, this:\u7049\u99f7\u494c\ua61f\u446c\u4492), var_6_77:int), and:int(ldc:int(10244), ldc:int(16932))), ldc:int(15))
            }
            else {
                stack_C1_0 = and:byte[expected:int](loadelement:byte(getfield:byte[](\u7049\u99f7\u494c\ua61f\u446c\u4492::\u965f\u927d\u7049\uc31c\u59ec\ud36e, this:\u7049\u99f7\u494c\ua61f\u446c\u4492), var_6_77:int), ldc:byte(15))
            }
            
            return:int(stack_C1_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u3d4b\u8640\u34df\u6ec6\u47c2\ubded(int p0) {
        var_2_5F : int
        stack_8B_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(578559946), ldc:int(172833738))
            
            if (cmpne:boolean(and:int(p0:int, and:int(ldc:int(20481), ldc:int(8387))), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(2011126510))
                stack_8B_0 = and:int(ldc:int(12296), ldc:int(-12297))
            }
            else {
                stack_8B_0 = xor:int(ldc:int(8196), ldc:int(8197))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    private int \u8258\ubff1\u64f2\uc7fe\u7e3f\ud36e(int p0) {
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
            return:int(shr:int(p0:int, xor:int(ldc:int(538), ldc:int(539))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_85_0 : byte[] [generated]
        stack_87_0 : byte[] [generated]
        stack_A1_0 : byte[] [generated]
        stack_A3_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_121_0 : byte[] [generated]
        stack_1A0_0 : byte[] [generated]
        stack_1F6_0 : byte[] [generated]
        var_4_104 : int
        var_3_109 : byte[]
        var_5_10A : int
        var_0_139 : int
        expr_121 : byte [generated]
        stack_165_2 : byte [generated]
        stack_13C_0 : byte [generated]
        expr_1A6 : byte [generated]
        expr_87 : int [generated]
        var_2_A1 : byte[]
        expr_A5 : int [generated]
        var_3_1E5 : byte[]
        var_5_1E6 : int
        var_3_CA : String
        stack_FD_0 : String[] [generated]
        expr_DC : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(1658593118), ldc:int(2146728820))
        expr_6B = arraylength:int(stack_85_0 = stack_87_0 = stack_A1_0 = stack_A3_0 = stack_BE_0 = stack_121_0 = stack_1A0_0 = stack_1F6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("zfDQ6PBwWNgQyHj/WDhQ4DC2kkhQ4iriIFJiBs6GftboYBAAkuoTbW21i7vA")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_104 = expr_6B:int
        var_3_109 = newarray:byte[](byte.class, expr_6B:int)
        var_5_10A = expr_6B:int
        Label_0268:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
            var_0_139 = and:int(var_0_5F:int, ldc:int(1006508993))
            var_5_10A = add:int(var_5_10A:int, ldc:int(-1))
            expr_121 = stack_165_2 = loadelement(stack_121_0, var_5_10A)
            
            if (cmplt:boolean(add:int(add:int(var_5_10A:int, ldc:int(6)), neg:int(var_4_104:int)), ldc:int(0))) {
                stack_165_2 = stack_13C_0 = add:byte(expr_121:byte, loadelement:byte(var_3_109:byte[], add:int(var_5_10A:int, ldc:int(6))))
                goto(Label_0332)
            }
            
            Label_0302:
            
            if (cmpeq:boolean(and:int(var_0_139:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_139 = and:int(var_0_139:int, ldc:int(198622072))
                stack_165_2 = stack_13C_0 = add:byte(expr_121:byte, ldc:byte(6))
            }
            
            Label_0332:
            
            if (cmpeq:boolean(and:int(var_0_139:int, ldc:int(64)), ldc:int(0))) {
                var_0_139 = and:int(var_0_139:int, ldc:int(265417164))
                goto(Label_0302)
            }
            
            var_0_5F = and:int(var_0_139:int, ldc:int(266297340))
            storeelement:byte(var_3_109:byte[], var_5_10A:int, stack_165_2:byte)
            
            if (cmpne:boolean(var_5_10A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_A1_0 = stack_A3_0 = stack_BE_0 = stack_121_0 = stack_1A0_0 = stack_1F6_0 = var_3_109:byte[]
            goto(Label_0112)
        }
        
        Label_0395:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1277731858))
            var_5_10A = add:int(var_5_10A:int, ldc:int(-1))
            expr_1A6 = add:byte(xor:byte(loadelement:byte(stack_1A0_0:byte[], var_5_10A:int), ldc:byte(45)), ldc:byte(21))
            storeelement:byte(var_3_109:byte[], var_5_10A:int, or:int(and:int(shl:int(expr_1A6:byte, xor:int(ldc:int(641), ldc:int(645))), ldc:int(-16)), and:int(shr:int(expr_1A6:byte[expected:int], xor:int(ldc:int(4172), ldc:int(4168))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_10A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_A1_0 = stack_A3_0 = stack_BE_0 = stack_121_0 = stack_1A0_0 = stack_1F6_0 = var_3_109:byte[]
            goto(Label_0140)
        }
        
        goto(Label_0268)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0170)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1275658376))
            expr_87 = arraylength:int(stack_87_0:byte[])
            
            if (cmpne:boolean(expr_87:int, ldc:int(0))) {
                var_4_104 = expr_87:int
                var_3_109 = newarray:byte[](byte.class, expr_87:int)
                var_5_10A = expr_87:int
                goto(Label_0395)
            }
        }
        
        Label_0140:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(534723576))
            var_2_A1 = stack_A1_0:byte[]
            expr_A5 = add:int(arraylength:int(stack_A3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_3_1E5 = newarray:byte[](byte.class, expr_A5:int)
                var_5_1E6 = expr_A5:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(201088874))
                    var_5_1E6 = add:int(var_5_1E6:int, ldc:int(-1))
                    storeelement:byte(var_3_1E5:byte[], var_5_1E6:int, add:int(shl:int(loadelement:byte(stack_1F6_0:byte[], var_5_1E6:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_A1:byte[], add:int(var_5_1E6:int, xor:int(ldc:int(8704), ldc:int(8705)))), ldc:int(7)), and:int(ldc:int(2113), ldc:int(9241)))))
                    
                    if (cmpne:boolean(var_5_1E6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_87_0 = stack_85_0 = stack_A1_0 = stack_A3_0 = stack_BE_0 = stack_121_0 = stack_1A0_0 = stack_1F6_0 = var_3_1E5:byte[]
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0140)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_CA = initobject:String(String::<init>, stack_BE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_FD_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(19489), ldc:int(263)))
            expr_DC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(777), ldc:int(19649)))
            storeelement:String(expr_DC:String[], and:int(ldc:int(-23973), ldc:int(23972)), invokevirtual:String[expected:String](String::substring, var_3_CA:String, and:int(ldc:int(-23984), ldc:int(22946)), xor:int(ldc:int(6), ldc:int(42))))
            putstatic:String[](\u7049\u99f7\u494c\ua61f\u446c\u4492::\u6d99\uc246\u64ab\ube23\ub83f\u7bad, expr_DC:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u4e72\u97e6\u3711\ucb79\u8389\u8aa5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_600 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60B : int
        
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
        var_3_600 = and:int(ldc:int(-1234383198), ldc:int(2003658915))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7049\u99f7\u494c\ua61f\u446c\u4492[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_600 = and:int(var_3_600:int, ldc:int(1459584459))
            var_5_7D = and:int(ldc:int(664), ldc:int(-665))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17732), ldc:int(17731)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_600:int, ldc:int(912124477))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(4296), ldc:int(4297)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(771), ldc:int(770)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_600 = and:int(var_3_D2:int, ldc:int(1590487230))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16992), ldc:int(16993)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1316851006))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1048320322))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1222565552))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1926793182))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-674333887))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1723302001))
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(868927494))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1400612762))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1625368151))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(845683179))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(80267649))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-112467491))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1225889423))
                        var_11_E3 = and:int(ldc:int(-23208), ldc:int(6822))
                        goto(Label_1421)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1117758103))
                        goto(Label_1432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1154224862))
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1936387389))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1819675530))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(673399565))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(214487233))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(1474096494))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1229298110))
                        goto(Label_1432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-855925622))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-965879943))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(528284508))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1058691085))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(848586420))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1597397253))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1043323321))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(2146232743))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-31984), ldc:int(-31983))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1584287540))
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-1707251797))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-936303410))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(2013255838))
                        var_11_E3 = and:int(ldc:int(31786), ldc:int(-31867))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(193504641))
                        goto(Label_1432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1750826407))
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-130117972))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-1130137950))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-1822002346))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1290186068))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1621332261))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1302)
                            }
                        }
                    }
                    
                    Label_1183:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-335626488))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-136997186))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(477243644))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1756508178))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1421)
                    }
                    
                    Label_1302:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(153172095))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-673966890))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(978959454))
                        loopcontinue()
                    }
                    
                    var_3_600 = and:int(var_3_600:int, ldc:int(2012118354))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1421:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60B = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1432:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1327162600))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(4)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1901875014))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-2143708340))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-128694806))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-672379668))
                        var_17_60B = add:int(var_16_111:int, xor:int(ldc:boolean(0), ldc:boolean(1)))
                        looporswitchbreak()
                    }
                }
                
                var_3_600 = and:int(var_3_600:int, ldc:int(391969780))
                
                if (cmple:boolean(var_5_7D = var_17_60B:int, sub:int(var_6_84:int, xor:int(ldc:int(23040), ldc:int(23041))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(65536)), ldc:int(0))) {
            var_3_600 = and:int(var_3_600:int, ldc:int(1128313093))
            goto(Label_0106)
        }
    }
}
