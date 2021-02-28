public final class \u12b2\u7049\u8df4\uc9f6\uae87.\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0 {
    public void \ub70c\ub7dc\u8df4\u927d\u8258\u6fb0(java.lang.String p0, java.lang.String p1) {
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
            invokespecial:\u3bd6\u4179\ud36e\uc9f6\u8cae\u9033(\u3bd6\u4179\ud36e\uc9f6\u8cae\u9033::<init>, this:\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0, p0:String, p1:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc246\u8413\ud36e\u67d0\u7006\u5f50() {
        var_3_76 : Color
        
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
            var_3_76 = invokestatic:Color(JColorChooser::showDialog, aconstnull:Component(), loadelement:String(getstatic:String[](\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0::\u8df4\u92ff\u5f50\u97e6\u5245\u392e), and:int(ldc:int(25492), ldc:int(-27543))), invokestatic:Color(\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::\u5f50\ub18d\ud7e8\u624e\uc84e\ub6ab, getfield:String(\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0::\u8cae\u71f1\u8709\u600f\ub1b9\u0a06, this:\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0)))
            
            if (cmpne:boolean(var_3_76:Color, aconstnull:Color())) {
                putfield:String(\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0::\u8cae\u71f1\u8709\u600f\ub1b9\u0a06, this:\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0, invokestatic:String(\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::toString, var_3_76:Color))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \uafe7\u6b0d\u6bb9\ubcb0\u3d64\u16f6() {
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
            return:Object(invokestatic:Color[expected:Object](\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::\u5f50\ub18d\ud7e8\u624e\uc84e\ub6ab, getfield:String(\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0::\u8cae\u71f1\u8709\u600f\ub1b9\u0a06, this:\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_1A7_0 : byte[] [generated]
        stack_1FC_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_11C : int
        var_3_121 : byte[]
        var_5_122 : int
        var_0_14A : int
        expr_132 : byte [generated]
        stack_176_2 : byte [generated]
        stack_14D_0 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_196 : byte[]
        var_5_197 : int
        expr_B5 : int [generated]
        var_3_1EB : byte[]
        var_5_1EC : int
        expr_1FC : byte [generated]
        var_3_E2 : String
        stack_115_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(-458210111), ldc:int(-258016275))
            expr_65 = stack_8D_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1A7_0 = stack_1FC_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("eFaMYfx1Z3yZOIYKobud"))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_11C = expr_6B:int
                var_3_121 = newarray:byte[](byte.class, expr_6B:int)
                var_5_122 = expr_6B:int
                
                loop {
                    var_0_14A = and:int(var_0_5F:int, ldc:int(-134550316))
                    var_5_122 = add:int(var_5_122:int, ldc:int(-1))
                    expr_132 = stack_176_2 = loadelement(expr_65, var_5_122)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_122:int, ldc:int(3)), neg:int(var_4_11C:int)), ldc:int(0))) {
                        stack_176_2 = stack_14D_0 = add:byte(expr_132:byte, loadelement:byte(var_3_121:byte[], add:int(var_5_122:int, ldc:int(3))))
                        goto(Label_0349)
                    }
                    
                    Label_0319:
                    
                    if (cmpeq:boolean(and:int(var_0_14A:int, ldc:int(65536)), ldc:int(0))) {
                        var_0_14A = and:int(var_0_14A:int, ldc:int(-189729819))
                        stack_176_2 = stack_14D_0 = add:byte(expr_132:byte, ldc:byte(3))
                    }
                    
                    Label_0349:
                    
                    if (cmpne:boolean(and:int(var_0_14A:int, ldc:int(131072)), ldc:int(0))) {
                        var_0_14A = and:int(var_0_14A:int, ldc:int(1584549756))
                        goto(Label_0319)
                    }
                    
                    var_0_5F = and:int(var_0_14A:int, ldc:int(-29665824))
                    storeelement:byte(var_3_121:byte[], var_5_122:int, stack_176_2:byte)
                    
                    if (cmpne:boolean(var_5_122:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1A7_0 = stack_1FC_0 = var_3_121:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-678016896))
                }
                else {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-323432226))
                    var_2_8D = stack_8D_0:byte[]
                    expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                        var_3_196 = newarray:byte[](byte.class, expr_91:int)
                        var_5_197 = expr_91:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-222695740))
                            var_5_197 = add:int(var_5_197:int, ldc:int(-1))
                            storeelement:byte(var_3_196:byte[], var_5_197:int, add:int(shl:int(loadelement:byte(stack_1A7_0:byte[], var_5_197:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_197:int, xor:int(ldc:int(-24556), ldc:int(-24555)))), ldc:int(5)), xor:int(ldc:int(77), ldc:int(74)))))
                            
                            if (cmpne:boolean(var_5_197:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1A7_0 = stack_1FC_0 = var_3_196:byte[]
                    }
                }
                
                Label_0150:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1511931828))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-453521689))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_3_1EB = newarray:byte[](byte.class, expr_B5:int)
                        var_5_1EC = expr_B5:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-63220760))
                            var_5_1EC = add:int(var_5_1EC:int, ldc:int(-1))
                            expr_1FC = loadelement:byte(stack_1FC_0:byte[], var_5_1EC:int)
                            storeelement:byte(var_3_1EB:byte[], var_5_1EC:int, add:int(xor:int(or:int(and:int(shl:int(expr_1FC:byte, xor:int(ldc:int(-32182), ldc:int(-32178))), ldc:int(-16)), and:int(shr:int(expr_1FC:byte[expected:int], and:int(ldc:int(16589), ldc:int(14084))), ldc:int(15))), ldc:int(23)), ldc:int(42)))
                            
                            if (cmpne:boolean(var_5_1EC:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1A7_0 = stack_1FC_0 = var_3_1EB:byte[]
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(-1773081975))
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_115_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2185), ldc:int(2184)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10), ldc:int(11)))
            storeelement:String(expr_F4:String[], and:int(ldc:int(-25441), ldc:int(17248)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-29058), ldc:int(29057)), and:int(ldc:int(4622), ldc:int(9694))))
            putstatic:String[](\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4e72\u88c5\ub32d\u6c56\u64f2\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_646 : int
        
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
        var_3_63B = and:int(ldc:int(1615719125), ldc:int(-301999419))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_63B = and:int(var_3_63B:int, ldc:int(-112251347))
        }
        else {
            var_3_63B = and:int(var_3_63B:int, ldc:int(-1814114751))
            var_5_85 = and:int(ldc:int(-31398), ldc:int(14881))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(23972), ldc:int(-24494)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63B:int, ldc:int(-143667857))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(20609), ldc:int(97)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(16546), ldc:int(16547)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63B = and:int(var_3_D2:int, ldc:int(-2019562943))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(25619), ldc:int(4229)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(2091300802))
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1895471551))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-814350187))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-2109536547))
                    }
                    else {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1254935379))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(2125945911))
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(876650290))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1800384965))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-332381257))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-2013206917))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1162229111))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(1768327206))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-2145527741))
                        var_11_E3 = and:int(ldc:int(10057), ldc:int(-12122))
                        goto(Label_1453)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1707833050))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1527126548))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(45552283))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1095328054))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(2021395752))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(601641177))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1552867199))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1655917766))
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1781162702))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1518357290))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1411329440))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-202423892))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-388488104))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1672881879))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-135337897))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-315159723))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(579865649))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-986897040))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-470876969))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(2210), ldc:int(2211))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-613871309))
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-596061680))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-451823179))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1575301902))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-421663501))
                        var_11_E3 = and:int(ldc:int(-1619), ldc:int(1618))
                    }
                    
                    Label_1083:
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(407134304))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(316147858))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1319690648))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1111500545))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1325)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1890487410))
                        goto(Label_1464)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1284302024))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1782266463))
                            goto(Label_1083)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(1195359835))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-647829285))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1833979039))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1982926879))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1453)
                    }
                    
                    Label_1325:
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(542298973))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-634688842))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1046912016))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-451949452))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63B = and:int(var_3_63B:int, ldc:int(281934575))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1453:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_646 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1464:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1755579556))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1212789162))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1782084739))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1925627043))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-924342609))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1685139862))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1361894263))
                        var_17_646 = add:int(var_16_111:int, xor:int(ldc:int(8224), ldc:int(8225)))
                        looporswitchbreak()
                    }
                    
                    var_3_63B = and:int(var_3_63B:int, ldc:int(-693638175))
                }
                
                var_3_63B = and:int(var_3_63B:int, ldc:int(2010966645))
                
                if (cmple:boolean(var_5_85 = var_17_646:int, sub:int(var_6_8C:int, xor:int(ldc:int(-26560), ldc:int(-26559))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
