public class \ub113\uc4d2\u183a\u527a\u6435.\u4975\u8d98\u8d90\u6b0d\u759a\u8bb0 {
    public void \u4975\u8d98\u8d90\u6b0d\u759a\u8bb0() {
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
            invokespecial:Object(Object::<init>, this:\u4975\u8d98\u8d90\u6b0d\u759a\u8bb0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ucb79\u183a\u7bad\u4ab3\u8640\ud158(com.google.gson.JsonElement p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p1) {
        var_4_75 : JsonObject
        var_5_87 : JsonElement
        
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
            
            if (instanceof:boolean(com.google.gson.JsonObject.class, p0:JsonElement)) {
                var_4_75 = checkcast:JsonObject(com.google.gson.JsonObject.class, p0:JsonElement[expected:JsonObject])
                var_5_87 = invokevirtual:JsonElement(JsonObject::get, var_4_75:JsonObject, loadelement:String(getstatic:String[](\u4975\u8d98\u8d90\u6b0d\u759a\u8bb0::\ubefe\u5f50\u8389\ud7e8\uc246\ua61f), and:int(ldc:int(-21198), ldc:int(21197))))
                
                if (cmpne:boolean(var_5_87:JsonElement, aconstnull:JsonElement())) {
                    if (invokevirtual:boolean(String::startsWith, invokevirtual:String(JsonElement::getAsString, var_5_87:JsonElement), loadelement:String(getstatic:String[](\u4975\u8d98\u8d90\u6b0d\u759a\u8bb0::\ubefe\u5f50\u8389\ud7e8\uc246\ua61f), xor:int(ldc:int(2115), ldc:int(2114))))) {
                        invokevirtual:void(\u0b8e\ud171\u6d69\ud523\u5140\uff55::\ua61f\uf94d\u8308\ud523\ub113\u99f7, getstatic:\u0b8e\ud171\u6d69\ud523\u5140\uff55(\u4975\u8d98\u8d90\u6b0d\u759a\u8bb0::\u97e6\u8640\u3c25\u4f52\u960f\u836c), var_4_75:JsonElement)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_8A : int
        expr_6B : int [generated]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_16E_0 : byte[] [generated]
        stack_1CE_0 : byte[] [generated]
        stack_24B_0 : byte[] [generated]
        var_4_151 : int
        var_3_156 : byte[]
        var_5_157 : int
        expr_171 : byte [generated]
        var_0_1E6 : int
        expr_1CE : byte [generated]
        stack_21A_2 : byte [generated]
        stack_1F1_0 : byte [generated]
        expr_97 : int [generated]
        var_2_C1 : byte[]
        expr_C5 : int [generated]
        var_3_23A : byte[]
        var_5_23B : int
        var_3_F2 : String
        stack_140_0 : String[] [generated]
        expr_104 : String[] [generated]
        
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
        var_0_8A = and:int(ldc:int(703454245), ldc:int(-1444970753))
        expr_6B = arraylength:int(stack_95_0 = stack_97_0 = stack_C1_0 = stack_C3_0 = stack_E6_0 = stack_16E_0 = stack_1CE_0 = stack_24B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("gRIx44+5EjJjIKGJ0fEpQpEaaYHZyUpBseEyMVL8oQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_151 = expr_6B:int
        var_3_156 = newarray:byte[](byte.class, expr_6B:int)
        var_5_157 = expr_6B:int
        Label_0345:
        
        while (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_8A = and:int(var_0_8A:int, ldc:int(665417285))
            var_5_157 = add:int(var_5_157:int, ldc:int(-1))
            expr_171 = xor:byte(loadelement:byte(stack_16E_0:byte[], var_5_157:int), ldc:byte(20))
            storeelement:byte(var_3_156:byte[], var_5_157:int, add:int(or:int(and:int(shl:int(expr_171:byte, xor:int(ldc:int(6160), ldc:int(6164))), ldc:int(-16)), and:int(shr:int(expr_171:byte[expected:int], xor:int(ldc:int(672), ldc:int(676))), ldc:int(15))), ldc:int(36)))
            
            if (cmpne:boolean(var_5_157:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_C1_0 = stack_C3_0 = stack_E6_0 = stack_16E_0 = stack_1CE_0 = stack_24B_0 = var_3_156:byte[]
            goto(Label_0112)
        }
        
        Label_0441:
        
        while (cmpne:boolean(and:int(var_0_8A:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_8A:int, ldc:int(667942685))
            var_5_157 = add:int(var_5_157:int, ldc:int(-1))
            expr_1CE = stack_21A_2 = loadelement(stack_1CE_0, var_5_157)
            
            if (cmplt:boolean(add:int(add:int(var_5_157:int, ldc:int(1)), neg:int(var_4_151:int)), ldc:int(0))) {
                stack_21A_2 = stack_1F1_0 = add:byte(expr_1CE:byte, loadelement:byte(var_3_156:byte[], add:int(var_5_157:int, ldc:int(1))))
                goto(Label_0513)
            }
            
            Label_0475:
            
            if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(16)), ldc:int(0))) {
                var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-1508719662))
            }
            else {
                var_0_1E6 = and:int(var_0_1E6:int, ldc:int(1904858311))
                stack_21A_2 = stack_1F1_0 = add:byte(expr_1CE:byte, ldc:byte(1))
            }
            
            Label_0513:
            
            if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(65536)), ldc:int(0))) {
                var_0_1E6 = and:int(var_0_1E6:int, ldc:int(1073599673))
                goto(Label_0475)
            }
            
            var_0_8A = and:int(var_0_1E6:int, ldc:int(701199479))
            storeelement:byte(var_3_156:byte[], var_5_157:int, stack_21A_2:byte)
            
            if (cmpne:boolean(var_5_157:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_C1_0 = stack_C3_0 = stack_E6_0 = stack_16E_0 = stack_1CE_0 = stack_24B_0 = var_3_156:byte[]
            goto(Label_0156)
        }
        
        goto(Label_0345)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_8A = and:int(var_0_8A:int, ldc:int(565102657))
            goto(Label_0202)
        }
        
        if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(524288)), ldc:int(0))) {
            var_0_8A = and:int(var_0_8A:int, ldc:int(804120387))
        }
        else {
            var_0_8A = and:int(var_0_8A:int, ldc:int(-1182141017))
            expr_97 = arraylength:int(stack_97_0:byte[])
            
            if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                var_4_151 = expr_97:int
                var_3_156 = newarray:byte[](byte.class, expr_97:int)
                var_5_157 = expr_97:int
                goto(Label_0441)
            }
        }
        
        Label_0156:
        
        if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(1024)), ldc:int(0))) {
            var_0_8A = and:int(var_0_8A:int, ldc:int(1536422392))
        }
        else {
            if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(131072)), ldc:int(0))) {
                var_0_8A = and:int(var_0_8A:int, ldc:int(-1602607301))
                goto(Label_0112)
            }
            
            var_0_8A = and:int(var_0_8A:int, ldc:int(633173583))
            var_2_C1 = stack_C1_0:byte[]
            expr_C5 = add:int(arraylength:int(stack_C3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C5:int, ldc:int(0))) {
                var_3_23A = newarray:byte[](byte.class, expr_C5:int)
                var_5_23B = expr_C5:int
                
                loop {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(-505809897))
                    var_5_23B = add:int(var_5_23B:int, ldc:int(-1))
                    storeelement:byte(var_3_23A:byte[], var_5_23B:int, add:int(shl:int(loadelement:byte(stack_24B_0:byte[], var_5_23B:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_C1:byte[], add:int(var_5_23B:int, xor:int(ldc:int(8320), ldc:int(8321)))), ldc:int(7)), xor:int(ldc:int(11296), ldc:int(11297)))))
                    
                    if (cmpne:boolean(var_5_23B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_C1_0 = stack_C3_0 = stack_E6_0 = stack_16E_0 = stack_1CE_0 = stack_24B_0 = var_3_23A:byte[]
            }
        }
        
        Label_0202:
        
        if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_8A = and:int(var_0_8A:int, ldc:int(-1183499967))
            goto(Label_0156)
        }
        
        if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_F2 = initobject:String(String::<init>, stack_E6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_140_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(7363), ldc:int(514)))
            expr_104 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(576), ldc:int(578)))
            storeelement:String(expr_104:String[], xor:int(ldc:int(-32640), ldc:int(-32639)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, and:int(ldc:int(810), ldc:int(-1008)), and:int(ldc:int(21269), ldc:int(29))))
            storeelement:String(expr_104:String[], and:int(ldc:int(10268), ldc:int(-30813)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, xor:int(ldc:int(12803), ldc:int(12822)), and:int(ldc:int(2078), ldc:int(22079))))
            putstatic:String[](\u4975\u8d98\u8d90\u6b0d\u759a\u8bb0::\ubefe\u5f50\u8389\ud7e8\uc246\ua61f, expr_104:String[])
            putstatic:\u0b8e\ud171\u6d69\ud523\u5140\uff55(\u4975\u8d98\u8d90\u6b0d\u759a\u8bb0::\u97e6\u8640\u3c25\u4f52\u960f\u836c, initobject:\u4d85\u7c6b\u12cb\u6b5f\u40a9\u3504[expected:\u0b8e\ud171\u6d69\ud523\u5140\uff55](\u4d85\u7c6b\u12cb\u6b5f\u40a9\u3504::<init>))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u7049\uf94d\ufe34\uc229\u3bd6\ud7e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64F : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_65A : int
        
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
        var_3_64F = and:int(ldc:int(1185636214), ldc:int(1991630718))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4975\u8d98\u8d90\u6b0d\u759a\u8bb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_64F = and:int(var_3_64F:int, ldc:int(-763539593))
            var_5_7D = and:int(ldc:int(10507), ldc:int(-11024))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22557), ldc:int(-22558)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_64F:int, ldc:int(-672169986))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(3101), ldc:int(12675)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(18435), ldc:int(8537)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_64F = and:int(var_3_CA:int, ldc:int(1609907575))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(19), ldc:int(7685)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(419856329))
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-26930813))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1382912123))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-549423953))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1151768076))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-672272409))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1718357859))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1383561511))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1844829238))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-506191011))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1558163649))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-357708434))
                            var_11_DB = and:int(ldc:int(3206), ldc:int(-19591))
                            goto(Label_1482)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1134511736))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-156668441))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(633570781))
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1672332175))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(995794601))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-2002077471))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1064996115))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(847952015))
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1592602606))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1013174099))
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1640185285))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1972401267))
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-882384922))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(10498), ldc:int(10499))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1947958949))
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-824844447))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-675011935))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1094847643))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-41106170))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-1349348310))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(2069448383))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-1630305261))
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1115495927))
                        var_11_DB = and:int(ldc:int(18190), ldc:int(-18255))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1613384048))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(229054673))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1883929130))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1407152333))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(2066247346))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-198754103))
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1872863086))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1327)
                            }
                        }
                    }
                    
                    Label_1182:
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1883134475))
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1451615580))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-227418614))
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-1847626342))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1397839239))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1786333997))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1860259175))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1482)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1327:
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1657186464))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1700378441))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1734020374))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-675507956))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(64718756))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1613300052))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-2033547351))
                        loopcontinue()
                    }
                    
                    var_3_64F = and:int(var_3_64F:int, ldc:int(-679911961))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1482:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65A = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1493:
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(2073488955))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1618675800))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-788776323))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1250752110))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-739370062))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-4362889))
                        var_17_65A = add:int(var_16_109:int, and:int(ldc:int(8997), ldc:int(17)))
                        looporswitchbreak()
                    }
                    
                    var_3_64F = and:int(var_3_64F:int, ldc:int(414541819))
                }
                
                var_3_64F = and:int(var_3_64F:int, ldc:int(1337007607))
                
                if (cmple:boolean(var_5_7D = var_17_65A:int, sub:int(var_6_84:int, xor:int(ldc:int(-31584), ldc:int(-31583))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
