public class \u12b2\u7049\u8df4\uc9f6\uae87.\u624e\u0800\uc29a\u67e9\u8753\u34df {
    public void \u624e\u0800\uc29a\u67e9\u8753\u34df() {
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
            invokespecial:Object(Object::<init>, this:\u624e\u0800\uc29a\u67e9\u8753\u34df)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75 \u4bc8\u6bb9\uff55\u8df4\u3d64\u385b(int p0) {
        var_3_64 : Optional<\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75>
        
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
        var_3_64 = invokestatic:Optional<\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75>(\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75::\u983f\u97b7\u4f52\u8cae\u7006\ud217, p0:int)
        
        if (invokevirtual:boolean(Optional<T>::isPresent, var_3_64:Optional<\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75>)) {
            return:\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75(checkcast:\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75(\u51fa\u12cb\u7330\u74b1\u6c52.\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75.class, invokevirtual:\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75(Optional<\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75>::get, var_3_64:Optional<\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75>)))
        }
        
        invokevirtual:void(Logger::severe, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u624e\u0800\uc29a\u67e9\u8753\u34df::\u97e6\ubff1\u183a\u64ab\u600f\ucb79), and:int(ldc:int(-30357), ldc:int(29828)))), p0:int)))
        return:\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75(getstatic:\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75(\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75::\u8640\u92ee\u99f7\u40a9\u4ab3\u3504))
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
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
        var_2_95 : byte[]
        expr_99 : int [generated]
        var_3_196 : byte[]
        var_5_197 : int
        expr_B5 : int [generated]
        var_3_1EB : byte[]
        var_5_1EC : int
        expr_202 : byte [generated]
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
            var_0_5F = and:int(ldc:int(1702750605), ldc:int(-944244241))
            expr_65 = stack_95_0 = stack_97_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1A7_0 = stack_1FC_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("D6ikIBEH/OzRZ/Ts6BH8zDTw1C/s5CwVG9QRLH8="))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_11C = expr_6B:int
                var_3_121 = newarray:byte[](byte.class, expr_6B:int)
                var_5_122 = expr_6B:int
                
                loop {
                    var_0_14A = and:int(var_0_5F:int, ldc:int(1732757997))
                    var_5_122 = add:int(var_5_122:int, ldc:int(-1))
                    expr_132 = stack_176_2 = loadelement(expr_65, var_5_122)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_122:int, ldc:int(1)), neg:int(var_4_11C:int)), ldc:int(0))) {
                        stack_176_2 = stack_14D_0 = add:byte(expr_132:byte, loadelement:byte(var_3_121:byte[], add:int(var_5_122:int, ldc:int(1))))
                        goto(Label_0349)
                    }
                    
                    Label_0319:
                    
                    if (cmpeq:boolean(and:int(var_0_14A:int, ldc:int(64)), ldc:int(0))) {
                        var_0_14A = and:int(var_0_14A:int, ldc:int(1731705804))
                        stack_176_2 = stack_14D_0 = add:byte(expr_132:byte, ldc:byte(1))
                    }
                    
                    Label_0349:
                    
                    if (cmpeq:boolean(and:int(var_0_14A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_14A = and:int(var_0_14A:int, ldc:int(-533022882))
                        goto(Label_0319)
                    }
                    
                    var_0_5F = and:int(var_0_14A:int, ldc:int(-988825105))
                    storeelement:byte(var_3_121:byte[], var_5_122:int, stack_176_2:byte)
                    
                    if (cmpne:boolean(var_5_122:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1A7_0 = stack_1FC_0 = var_3_121:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-850943274))
                    goto(Label_0186)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(2011446620))
                }
                else {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-8925252))
                    var_2_95 = stack_95_0:byte[]
                    expr_99 = add:int(arraylength:int(stack_97_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                        var_3_196 = newarray:byte[](byte.class, expr_99:int)
                        var_5_197 = expr_99:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-576737827))
                            var_5_197 = add:int(var_5_197:int, ldc:int(-1))
                            storeelement:byte(var_3_196:byte[], var_5_197:int, add:int(shl:int(loadelement:byte(stack_1A7_0:byte[], var_5_197:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_95:byte[], add:int(var_5_197:int, xor:int(ldc:int(-31738), ldc:int(-31737)))), ldc:int(6)), and:int(ldc:int(4899), ldc:int(16523)))))
                            
                            if (cmpne:boolean(var_5_197:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1A7_0 = stack_1FC_0 = var_3_196:byte[]
                    }
                }
                
                Label_0158:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1475735022))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_3_1EB = newarray:byte[](byte.class, expr_B5:int)
                        var_5_1EC = expr_B5:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-548562451))
                            var_5_1EC = add:int(var_5_1EC:int, ldc:int(-1))
                            expr_202 = add:byte(xor:byte(loadelement:byte(stack_1FC_0:byte[], var_5_1EC:int), ldc:byte(2)), ldc:byte(82))
                            storeelement:byte(var_3_1EB:byte[], var_5_1EC:int, or:int(and:int(shl:int(expr_202:byte, xor:int(ldc:int(8288), ldc:int(8292))), ldc:int(-16)), and:int(shr:int(expr_202:byte[expected:int], xor:int(ldc:int(9538), ldc:int(9542))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_5_1EC:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1A7_0 = stack_1FC_0 = var_3_1EB:byte[]
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0158)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(-1349202862))
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_115_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(545), ldc:int(24859)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-24063), ldc:int(-24064)))
            storeelement:String(expr_F4:String[], and:int(ldc:int(-30826), ldc:int(6249)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(16693), ldc:int(-17718)), xor:int(ldc:int(1054), ldc:int(1026))))
            putstatic:String[](\u624e\u0800\uc29a\u67e9\u8753\u34df::\u97e6\ubff1\u183a\u64ab\u600f\ucb79, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\uc2bd\ua61f\u5f50\u965f\u8d90(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5BA : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5C5 : int
        
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
        var_3_5BA = and:int(ldc:int(-1411361613), ldc:int(1743933586))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u624e\u0800\uc29a\u67e9\u8753\u34df[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_5BA = and:int(var_3_5BA:int, ldc:int(331294418))
            var_5_7D = and:int(ldc:int(26671), ldc:int(-27760))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8207), ldc:int(8206)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5BA:int, ldc:int(400949991))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(16896), ldc:int(16897)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(132), ldc:int(133)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5BA = and:int(var_3_CA:int, ldc:int(199482782))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-26368), ldc:int(-26367)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(1072417166))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1435915432))
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(1978745303))
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-738488373))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1640435898))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(710221341))
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(410660026))
                        goto(Label_0980)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(1850048173))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(-73131798))
                            var_11_DB = and:int(ldc:int(20931), ldc:int(-21956))
                            goto(Label_1369)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(1188931948))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1264981429))
                        goto(Label_0980)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(-255264871))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(1006048699))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0628:
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(1540127506))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1221266552))
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(27710788))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(611709917))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(1193775864))
                            loopcontinue()
                        }
                        
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-944470273))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1661814762))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-638183229))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1014643058))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-335897394))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(8320), ldc:int(8321))
                                goto(Label_0980)
                            }
                        }
                    }
                    
                    Label_0857:
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1718402050))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(598899874))
                        var_11_DB = and:int(ldc:int(-11849), ldc:int(11848))
                    }
                    
                    Label_0980:
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1620631675))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1916752471))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(-2069483864))
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(136118036))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(-890889380))
                            loopcontinue()
                        }
                        
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1884172654))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1241)
                            }
                        }
                    }
                    
                    Label_1105:
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(112066500))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1086680700))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0980)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(557113182))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(-500872505))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5BA = and:int(var_3_5BA:int, ldc:int(8896050))
                            loopcontinue()
                        }
                        
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1011856685))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1369)
                    }
                    
                    Label_1241:
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-684391229))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(1013868353))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(1600215135))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-787722402))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1141998145))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1369:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5C5 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1380:
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1762010394))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BA = and:int(var_3_5BA:int, ldc:int(463699631))
                        var_17_5C5 = add:int(var_16_109:int, and:int(ldc:int(3), ldc:int(5641)))
                        looporswitchbreak()
                    }
                    
                    var_3_5BA = and:int(var_3_5BA:int, ldc:int(1473597506))
                }
                
                var_3_5BA = and:int(var_3_5BA:int, ldc:int(-1477082729))
                
                if (cmple:boolean(var_5_7D = var_17_5C5:int, sub:int(var_6_84:int, xor:int(ldc:int(80), ldc:int(81))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5BA:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
