public class \u6435\ub8be\u718f\u6b0d\u67e9.\u3c25\ubcb0\u3e2a\ube23\u67d0 {
    public void \u3c25\ubcb0\u3e2a\ube23\u67d0(java.io.File p0, java.lang.String p1) {
        stack_89_0 : String [generated]
        expr_72 : Object[] [generated]
        
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
            stack_89_0 = loadelement:String(getstatic:String[](\u3c25\ubcb0\u3e2a\ube23\u67d0::\u72f1\ub171\u527a\u0800\u5245\ud12e), and:int(ldc:int(-10916), ldc:int(10915)))
            expr_72 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(22603), ldc:int(406)))
            storeelement:Object(expr_72:Object[], and:int(ldc:int(308), ldc:int(-309)), p1:String[expected:Object])
            storeelement:Object(expr_72:Object[], xor:int(ldc:int(4160), ldc:int(4161)), p0:File[expected:Object])
            invokespecial:FileNotFoundException(FileNotFoundException::<init>, this:\u3c25\ubcb0\u3e2a\ube23\u67d0, invokestatic:String(String::format, stack_89_0:String, expr_72:Object[]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1E9 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_141_0 : byte[] [generated]
        stack_197_0 : byte[] [generated]
        stack_1FB_0 : byte[] [generated]
        var_4_124 : int
        var_3_129 : byte[]
        var_5_12A : int
        expr_147 : byte [generated]
        var_0_1F1 : int
        expr_1FB : byte [generated]
        stack_229_2 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_186 : byte[]
        var_5_187 : int
        expr_B5 : int [generated]
        var_3_EA : String
        stack_11D_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
        var_0_1E9 = and:int(ldc:int(-1702503809), ldc:int(-889515282))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_141_0 = stack_197_0 = stack_1FB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("8aWvgfKLFnUMnDGiHCrAsjSOLFOfNqHUq6E=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_124 = expr_6B:int
        var_3_129 = newarray:byte[](byte.class, expr_6B:int)
        var_5_12A = expr_6B:int
        Label_0300:
        
        while (cmpne:boolean(and:int(var_0_1E9:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-293555523))
            var_5_12A = add:int(var_5_12A:int, ldc:int(-1))
            expr_147 = xor:byte(add:byte(loadelement:byte(stack_141_0:byte[], var_5_12A:int), ldc:byte(37)), ldc:byte(70))
            storeelement:byte(var_3_129:byte[], var_5_12A:int, or:int(and:int(shl:int(expr_147:byte, and:int(ldc:int(6), ldc:int(22533))), ldc:int(-16)), and:int(shr:int(expr_147:byte[expected:int], xor:int(ldc:int(-31582), ldc:int(-31578))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_12A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_141_0 = stack_197_0 = stack_1FB_0 = var_3_129:byte[]
            goto(Label_0112)
        }
        
        Label_0478:
        
        while (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1F1 = and:int(var_0_1E9:int, ldc:int(-891814962))
            var_5_12A = add:int(var_5_12A:int, ldc:int(-1))
            expr_1FB = loadelement:byte(stack_1FB_0:byte[], var_5_12A:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_12A:int, ldc:int(6)), neg:int(var_4_124:int)), ldc:int(0))) {
                var_0_1F1 = and:int(var_0_1F1:int, ldc:int(-557352996))
                stack_229_2 = add:byte(expr_1FB:byte, ldc:byte(6))
            }
            else {
                stack_229_2 = add:byte(expr_1FB:byte, loadelement:byte(var_3_129:byte[], add:int(var_5_12A:int, ldc:int(6))))
            }
            
            var_0_1E9 = and:int(var_0_1F1:int, ldc:int(-1635729908))
            storeelement:byte(var_3_129:byte[], var_5_12A:int, stack_229_2:byte)
            
            if (cmpne:boolean(var_5_12A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_141_0 = stack_197_0 = stack_1FB_0 = var_3_129:byte[]
            goto(Label_0186)
        }
        
        var_0_1E9 = and:int(var_0_1E9:int, ldc:int(763538206))
        goto(Label_0300)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1E9:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1E9 = and:int(var_0_1E9:int, ldc:int(2028609689))
        }
        else {
            var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-1416274193))
            var_2_8D = stack_8D_0:byte[]
            expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                var_3_186 = newarray:byte[](byte.class, expr_91:int)
                var_5_187 = expr_91:int
                
                loop {
                    var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-1900333492))
                    var_5_187 = add:int(var_5_187:int, ldc:int(-1))
                    storeelement:byte(var_3_186:byte[], var_5_187:int, add:int(shl:int(loadelement:byte(stack_197_0:byte[], var_5_187:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_187:int, xor:int(ldc:int(1176), ldc:int(1177)))), ldc:int(3)), xor:int(ldc:int(-16338), ldc:int(-16335)))))
                    
                    if (cmpne:boolean(var_5_187:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_141_0 = stack_197_0 = stack_1FB_0 = var_3_186:byte[]
            }
        }
        
        Label_0150:
        
        if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(4096)), ldc:int(0))) {
                var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-2030356210))
                goto(Label_0112)
            }
            
            var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-1953598962))
            expr_B5 = arraylength:int(stack_B5_0:byte[])
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_4_124 = expr_B5:int
                var_3_129 = newarray:byte[](byte.class, expr_B5:int)
                var_5_12A = expr_B5:int
                goto(Label_0478)
            }
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_0_1E9:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-956702900))
            goto(Label_0150)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(4)), ldc:int(0))) {
            var_0_1E9 = and:int(var_0_1E9:int, ldc:int(1648055257))
            goto(Label_0112)
        }
        
        var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_11D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4417), ldc:int(1051)))
        expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(137), ldc:int(22529)))
        storeelement:String(expr_FC:String[], and:int(ldc:int(-16673), ldc:int(16672)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(-21077), ldc:int(21060)), and:int(ldc:int(27), ldc:int(6685))))
        putstatic:String[](\u3c25\ubcb0\u3e2a\ube23\u67d0::\u72f1\ub171\u527a\u0800\u5245\ud12e, expr_FC:String[])
    }
    
    public void \uc7fe\u5f50\u6c52\u983f\u3bc9\u6bb9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5D5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5E0 : int
        
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
        var_3_5D5 = and:int(ldc:int(1449994215), ldc:int(-156523787))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3c25\ubcb0\u3e2a\ube23\u67d0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(32)), ldc:int(0))) {
            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1572567999))
            var_5_7D = and:int(ldc:int(26884), ldc:int(-27397))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8731), ldc:int(-27164)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5D5:int, ldc:int(-679907355))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(1041), ldc:int(19201)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(18565), ldc:int(113)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5D5 = and:int(var_3_CA:int, ldc:int(1979705005))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(73), ldc:int(18449)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(619065125))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-302214811))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(288112087))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-904172704))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(638330730))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1421732031))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1933577470))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(944213115))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(30573376))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-148941683))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-281408014))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2109338101))
                        var_11_DB = and:int(ldc:int(3500), ldc:int(-16383))
                        goto(Label_1383)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2143102140))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1646509598))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1985566199))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-567413315))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(452845830))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1693959561))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1879087730))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1551859647))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1645665773))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-610024759))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-749147735))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1412283895))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(805), ldc:int(6145))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0865:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1313175691))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1332332435))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1207840995))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2013767119))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-145723940))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-563530323))
                        var_11_DB = and:int(ldc:int(6677), ldc:int(-16278))
                    }
                    
                    Label_1019:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-2003762668))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1044412867))
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1675241329))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-392244288))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(891478285))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-546623811))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(131879015))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-885759295))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-287654034))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1771053443))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2130670245))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1383)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1260:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2116022880))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-73259428))
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(6032263))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1975652442))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2125064111))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1383:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1394:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-208663434))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1404042441))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1676651894))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(594229541))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-563482625))
                        var_17_5E0 = add:int(var_16_109:int, and:int(ldc:int(10241), ldc:int(4425)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1476210927))
                
                if (cmple:boolean(var_5_7D = var_17_5E0:int, sub:int(var_6_84:int, xor:int(ldc:int(1091), ldc:int(1090))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
