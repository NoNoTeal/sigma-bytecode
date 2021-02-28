public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u8bb0\ud7e8\u7873\u8413\u4179\u1833 {
    public void \u8bb0\ud7e8\u7873\u8413\u4179\u1833(int p0, com.mojang.datafixers.schemas.Schema p1) {
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
            invokespecial:\uae87\u927d\u4179\u6bb9\ufcaf\uceb8(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::<init>, this:\u8bb0\ud7e8\u7873\u8413\u4179\u1833, p0:int, p1:Schema)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> registerEntities(com.mojang.datafixers.schemas.Schema p0) {
        var_4_65 : Map
        
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
            var_4_65 = invokespecial:Map(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::registerEntities, this:\u8bb0\ud7e8\u7873\u8413\u4179\u1833[expected:\uae87\u927d\u4179\u6bb9\ufcaf\uceb8], p0:Schema)
            invokeinterface:Object(Map<String, Object>::put, var_4_65:Map<String, Object>, loadelement:String(getstatic:String[](\u8bb0\ud7e8\u7873\u8413\u4179\u1833::\u61a4\u0800\ub19c\u960f\u9255\u6ec6), and:int(ldc:int(-11065), ldc:int(2616))), invokeinterface:Object(Map<String, Object>::remove, var_4_65:Map<String, Object>, loadelement:String[expected:Object](getstatic:String[](\u8bb0\ud7e8\u7873\u8413\u4179\u1833::\u61a4\u0800\ub19c\u960f\u9255\u6ec6), xor:int(ldc:int(-31552), ldc:int(-31551)))))
            return:Map<String, Supplier<TypeTemplate>>(var_4_65:Map<String, Object>)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1A4 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_8F_0 : byte[] [generated]
        stack_91_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_1B6_0 : byte[] [generated]
        stack_216_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_141 : byte[]
        var_4_142 : int
        expr_91 : int [generated]
        var_5_191 : int
        var_3_196 : byte[]
        var_4_197 : int
        expr_1BC : byte [generated]
        var_0_20C : int
        expr_216 : byte [generated]
        stack_244_2 : byte [generated]
        expr_B5 : int [generated]
        var_3_EA : String
        stack_138_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
            var_0_1A4 = and:int(ldc:int(674680580), ldc:int(1769721679))
            expr_65 = var_2_69 = stack_8F_0 = stack_91_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1B6_0 = stack_216_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("TxdY1hDA0K83aSe3QJDAh3jojy/4zxdY1hDA0K83aV9PELi1zCwURBwA"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_141 = newarray:byte[](byte.class, expr_6D:int)
                var_4_142 = expr_6D:int
                
                loop {
                    var_0_1A4 = and:int(var_0_1A4:int, ldc:int(2020728373))
                    var_4_142 = add:int(var_4_142:int, ldc:int(-1))
                    storeelement:byte(var_3_141:byte[], var_4_142:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_142:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_142:int, xor:int(ldc:int(18), ldc:int(19)))), ldc:int(7)), and:int(ldc:int(529), ldc:int(8267)))))
                    
                    if (cmpne:boolean(var_4_142:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1B6_0 = stack_216_0 = var_3_141:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_1A4:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_1A4 = and:int(var_0_1A4:int, ldc:int(-1751685637))
                    goto(Label_0186)
                }
                
                if (cmpne:boolean(and:int(var_0_1A4:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_0_1A4 = and:int(var_0_1A4:int, ldc:int(-1103995210))
                expr_91 = arraylength:int(stack_91_0:byte[])
                
                if (cmpeq:boolean(expr_91:int, ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_5_191 = expr_91:int
                var_3_196 = newarray:byte[](byte.class, expr_91:int)
                var_4_197 = expr_91:int
                Label_0409:
                
                while (cmpeq:boolean(and:int(var_0_1A4:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_1A4 = and:int(var_0_1A4:int, ldc:int(969760316))
                    var_4_197 = add:int(var_4_197:int, ldc:int(-1))
                    expr_1BC = xor:byte(add:byte(loadelement:byte(stack_1B6_0:byte[], var_4_197:int), ldc:byte(32)), ldc:byte(126))
                    storeelement:byte(var_3_196:byte[], var_4_197:int, or:int(and:int(shl:int(expr_1BC:byte, and:int(ldc:int(4), ldc:int(10055))), ldc:int(-16)), and:int(shr:int(expr_1BC:byte[expected:int], and:int(ldc:int(4), ldc:int(24637))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_197:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1B6_0 = stack_216_0 = var_3_196:byte[]
                    goto(Label_0150)
                }
                
                var_0_1A4 = and:int(var_0_1A4:int, ldc:int(742823107))
                Label_0513:
                
                while (cmpeq:boolean(and:int(var_0_1A4:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_20C = and:int(var_0_1A4:int, ldc:int(744058821))
                    var_4_197 = add:int(var_4_197:int, ldc:int(-1))
                    expr_216 = loadelement:byte(stack_216_0:byte[], var_4_197:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_197:int, ldc:int(6)), neg:int(var_5_191:int)), ldc:int(0))) {
                        var_0_20C = and:int(var_0_20C:int, ldc:int(-317129186))
                        stack_244_2 = add:byte(expr_216:byte, ldc:byte(6))
                    }
                    else {
                        stack_244_2 = add:byte(expr_216:byte, loadelement:byte(var_3_196:byte[], add:int(var_4_197:int, ldc:int(6))))
                    }
                    
                    var_0_1A4 = and:int(var_0_20C:int, ldc:int(-23105964))
                    storeelement:byte(var_3_196:byte[], var_4_197:int, stack_244_2:byte)
                    
                    if (cmpne:boolean(var_4_197:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1B6_0 = stack_216_0 = var_3_196:byte[]
                    goto(Label_0186)
                }
                
                goto(Label_0409)
                Label_0150:
                
                if (cmpne:boolean(and:int(var_0_1A4:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_1A4:int, ldc:int(33554432)), ldc:int(0))) {
                        var_0_1A4 = and:int(var_0_1A4:int, ldc:int(-986466697))
                        loopcontinue()
                    }
                    
                    var_0_1A4 = and:int(var_0_1A4:int, ldc:int(954564285))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_5_191 = expr_B5:int
                        var_3_196 = newarray:byte[](byte.class, expr_B5:int)
                        var_4_197 = expr_B5:int
                        goto(Label_0513)
                    }
                }
                
                Label_0186:
                
                if (cmpne:boolean(and:int(var_0_1A4:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_1A4 = and:int(var_0_1A4:int, ldc:int(620777997))
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_0_1A4:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_1A4 = and:int(var_0_1A4:int, ldc:int(1085015069))
            }
            
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_138_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(96), ldc:int(98)))
            expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(162), ldc:int(4106)))
            storeelement:String(expr_FC:String[], xor:int(ldc:int(260), ldc:int(261)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(24839), ldc:int(-24864)), xor:int(ldc:int(-28664), ldc:int(-28643))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(592), ldc:int(-593)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(8795), ldc:int(8782)), and:int(ldc:int(24889), ldc:int(4143))))
            putstatic:String[](\u8bb0\ud7e8\u7873\u8413\u4179\u1833::\u61a4\u0800\ub19c\u960f\u9255\u6ec6, expr_FC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u624e\u67d0\uc87f\ub18d\uc2e8\u4ab3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F1 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5FC : int
        
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
        var_3_5F1 = and:int(ldc:int(-641789304), ldc:int(-671138241))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8bb0\ud7e8\u7873\u8413\u4179\u1833[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-201360723))
            var_5_7D = and:int(ldc:int(13144), ldc:int(-29530))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6932), ldc:int(-6933)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5F1:int, ldc:int(-738233554))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(4370), ldc:int(4371)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(1601), ldc:int(1600)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5F1 = and:int(var_3_CA:int, ldc:int(-604170465))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(269), ldc:int(9441)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1655603733))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-249379988))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(8750741))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1644067981))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1031140923))
                    }
                    else {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-574759287))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-309007462))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1834551900))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1658507827))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(680912892))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(709135018))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(739354818))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1059948936))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-67136693))
                            var_11_DB = and:int(ldc:int(2092), ldc:int(-2093))
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-766637107))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1882424714))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-134268002))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(7131726))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(269645285))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1254309825))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(997013408))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-4383831))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(489646661))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1462826301))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2067341781))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(559063659))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1120915670))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-771940756))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-32640), ldc:int(-32639))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-791218676))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(210887200))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-489580788))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2111418463))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-288710956))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-536882488))
                        var_11_DB = and:int(ldc:int(-29728), ldc:int(12319))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-841732355))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(553297290))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(954319195))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(867829609))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-574761990))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(731588521))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(703053735))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-757960453))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-738249169))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(744323974))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2076948578))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1972273834))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1079385301))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-805775991))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1448593320))
                        loopcontinue()
                    }
                    
                    var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-570600627))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FC = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1394041996))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-910136509))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-234907864))
                        var_17_5FC = add:int(var_16_109:int, xor:int(ldc:int(170), ldc:int(171)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F1 = and:int(var_3_5F1:int, ldc:int(645338275))
                }
                
                var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-234899747))
                
                if (cmple:boolean(var_5_7D = var_17_5FC:int, sub:int(var_6_84:int, xor:int(ldc:int(-16381), ldc:int(-16382))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
