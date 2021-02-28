public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ub1b9\ua61f\u4e72\u3e75\u98a4\u983f {
    public void \ub1b9\ua61f\u4e72\u3e75\u98a4\u983f() {
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
            invokespecial:Object(Object::<init>, this:\ub1b9\ua61f\u4e72\u3e75\u98a4\u983f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6 \uc2bd\ud4fe\u5fe1\ub7dc\uc238\u56bd(int p0) {
        var_3_64 : Optional<\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6>
        
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
        var_3_64 = invokestatic:Optional<\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6>(\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6::\u4c04\u4c04\uf995\u624e\u97b7\u7e3f, p0:int)
        
        if (invokevirtual:boolean(Optional<T>::isPresent, var_3_64:Optional<\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6>)) {
            return:\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6(checkcast:\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6.class, invokevirtual:\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6(Optional<\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6>::get, var_3_64:Optional<\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6>)))
        }
        
        invokevirtual:void(Logger::severe, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub1b9\ua61f\u4e72\u3e75\u98a4\u983f::\u6b0d\u1187\ub19c\u56bd\u9033\ub102), and:int(ldc:int(1507), ldc:int(-4068)))), p0:int)))
        return:\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6(getstatic:\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6(\u6bb9\uceb8\u34df\u3d64\u2dcc\u7af6::\u12b2\u56bd\u4daf\u385b\uc84e\u839e))
    }
    
    static {
        var_0_177 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_189_0 : byte[] [generated]
        stack_208_0 : byte[] [generated]
        stack_25B_0 : byte[] [generated]
        stack_2B0_0 : byte[] [generated]
        var_4_164 : int
        var_3_169 : byte[]
        var_5_16A : int
        var_0_17F : int
        expr_189 : byte [generated]
        stack_1CD_2 : byte [generated]
        stack_1AC_0 : byte [generated]
        expr_20B : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_24A : byte[]
        var_5_24B : int
        expr_EE : int [generated]
        var_3_29F : byte[]
        var_5_2A0 : int
        var_3_12A : String
        stack_15D_0 : String[] [generated]
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
        var_0_177 = and:int(ldc:int(1714742098), ldc:int(-475635497))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_189_0 = stack_208_0 = stack_25B_0 = stack_2B0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("lAPxFrhE+gXxANDFy80AQE1FMf/w+6UwWRQNWOQ=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_164 = expr_6B:int
        var_3_169 = newarray:byte[](byte.class, expr_6B:int)
        var_5_16A = expr_6B:int
        Label_0364:
        
        while (cmpeq:boolean(and:int(var_0_177:int, ldc:int(4)), ldc:int(0))) {
            var_0_17F = and:int(var_0_177:int, ldc:int(-68653362))
            var_5_16A = add:int(var_5_16A:int, ldc:int(-1))
            expr_189 = stack_1CD_2 = loadelement(stack_189_0, var_5_16A)
            
            if (cmplt:boolean(add:int(add:int(var_5_16A:int, ldc:int(5)), neg:int(var_4_164:int)), ldc:int(0))) {
                stack_1CD_2 = stack_1AC_0 = add:byte(expr_189:byte, loadelement:byte(var_3_169:byte[], add:int(var_5_16A:int, ldc:int(5))))
                goto(Label_0444)
            }
            
            Label_0406:
            
            if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(16384)), ldc:int(0))) {
                var_0_17F = and:int(var_0_17F:int, ldc:int(182690816))
            }
            else {
                var_0_17F = and:int(var_0_17F:int, ldc:int(-148799625))
                stack_1CD_2 = stack_1AC_0 = add:byte(expr_189:byte, ldc:byte(5))
            }
            
            Label_0444:
            
            if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0406)
            }
            
            var_0_177 = and:int(var_0_17F:int, ldc:int(-134716201))
            storeelement:byte(var_3_169:byte[], var_5_16A:int, stack_1CD_2:byte)
            
            if (cmpne:boolean(var_5_16A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_189_0 = stack_208_0 = stack_25B_0 = stack_2B0_0 = var_3_169:byte[]
            goto(Label_0112)
        }
        
        var_0_177 = and:int(var_0_177:int, ldc:int(895900307))
        Label_0499:
        
        while (cmpeq:boolean(and:int(var_0_177:int, ldc:int(65536)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-277352353))
            var_5_16A = add:int(var_5_16A:int, ldc:int(-1))
            expr_20B = add:byte(loadelement:byte(stack_208_0:byte[], var_5_16A:int), ldc:byte(31))
            storeelement:byte(var_3_169:byte[], var_5_16A:int, or:int(and:int(shl:int(expr_20B:byte, xor:int(ldc:int(769), ldc:int(773))), ldc:int(-16)), and:int(shr:int(expr_20B:byte[expected:int], and:int(ldc:int(6404), ldc:int(740))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_16A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_189_0 = stack_208_0 = stack_25B_0 = stack_2B0_0 = var_3_169:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0364)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(8192)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-864532289))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(32)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(2075387771))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_164 = expr_96:int
                var_3_169 = newarray:byte[](byte.class, expr_96:int)
                var_5_16A = expr_96:int
                goto(Label_0499)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(477318904))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_177 = and:int(var_0_177:int, ldc:int(-273090830))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_24A = newarray:byte[](byte.class, expr_C3:int)
                var_5_24B = expr_C3:int
                
                loop {
                    var_0_177 = and:int(var_0_177:int, ldc:int(-80388013))
                    var_5_24B = add:int(var_5_24B:int, ldc:int(-1))
                    storeelement:byte(var_3_24A:byte[], var_5_24B:int, add:int(shl:int(loadelement:byte(stack_25B_0:byte[], var_5_24B:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_24B:int, and:int(ldc:int(4153), ldc:int(197)))), ldc:int(4)), and:int(ldc:int(2255), ldc:int(16415)))))
                    
                    if (cmpne:boolean(var_5_24B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_189_0 = stack_208_0 = stack_25B_0 = stack_2B0_0 = var_3_24A:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(1584838690))
        }
        else {
            if (cmpne:boolean(and:int(var_0_177:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_177 = and:int(var_0_177:int, ldc:int(-361858486))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_29F = newarray:byte[](byte.class, expr_EE:int)
                var_5_2A0 = expr_EE:int
                
                loop {
                    var_0_177 = and:int(var_0_177:int, ldc:int(2117101938))
                    var_5_2A0 = add:int(var_5_2A0:int, ldc:int(-1))
                    storeelement:byte(var_3_29F:byte[], var_5_2A0:int, xor:byte(loadelement:byte(stack_2B0_0:byte[], var_5_2A0:int), ldc:byte(88)))
                    
                    if (cmpne:boolean(var_5_2A0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_189_0 = stack_208_0 = stack_25B_0 = stack_2B0_0 = var_3_29F:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(128)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-1366266874))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(1346646045))
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(1024)), ldc:int(0))) {
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_15D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(516), ldc:int(517)))
            expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16902), ldc:int(16903)))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-3890), ldc:int(1841)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(16743), ldc:int(-17384)), and:int(ldc:int(10268), ldc:int(4668))))
            putstatic:String[](\ub1b9\ua61f\u4e72\u3e75\u98a4\u983f::\u6b0d\u1187\ub19c\u56bd\u9033\ub102, expr_13C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ua6bd\u527a\ubded\ub171\u51b2\u873d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_607 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_612 : int
        
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
        var_3_607 = and:int(ldc:int(395854969), ldc:int(-980033537))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub1b9\ua61f\u4e72\u3e75\u98a4\u983f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(256)), ldc:int(0))) {
            var_3_607 = and:int(var_3_607:int, ldc:int(-2123313153))
            var_5_7D = and:int(ldc:int(-16134), ldc:int(15621))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9410), ldc:int(-9923)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_607:int, ldc:int(622559229))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(19), ldc:int(1025)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(544), ldc:int(545)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_607 = and:int(var_3_D2:int, ldc:int(-480702849))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(10725), ldc:int(531)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1808926155))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1789869808))
                        goto(Label_1030)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-632768981))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-310946452))
                        goto(Label_0781)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(74150313))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1856446931))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(32)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1612444471))
                    }
                    else {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1177336709))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0781)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-727275305))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(126190482))
                        goto(Label_1030)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1910633132))
                        goto(Label_0781)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1893525368))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(2002349945))
                        var_11_E3 = and:int(ldc:int(15648), ldc:int(-15845))
                        goto(Label_1437)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1317946664))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(256)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1288030286))
                        goto(Label_1030)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0781)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1317505971))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(28706303))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0781)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-402991681))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(256)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-468385012))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1030)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-82079210))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(1637309689))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0781:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-500863100))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-80400459))
                        goto(Label_1030)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1823128635))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1014799902))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1414160513))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-23808), ldc:int(-23807))
                                goto(Label_1030)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0781)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(256)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(875517557))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-2029126053))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1552351235))
                        var_11_E3 = and:int(ldc:int(-29146), ldc:int(12633))
                    }
                    
                    Label_1030:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(256)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1532360817))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-2114020202))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-961787262))
                            goto(Label_0781)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1862799523))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-221712711))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1053239301))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1155:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-646435927))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-2059852443))
                            goto(Label_1030)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(256)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-272605301))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0781)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(182327056))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(727268230))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(60771464))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(1635035131))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1437)
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-2131954665))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1323982550))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1030)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1832328853))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0781)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(211589479))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(455500747))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_607 = and:int(var_3_607:int, ldc:int(533822585))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1437:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_612 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1448:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(32)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-934782929))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1030)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-968023179))
                        goto(Label_0781)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-2018148881))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1717698821))
                        var_17_612 = add:int(var_16_111:int, and:int(ldc:int(9761), ldc:int(4181)))
                        looporswitchbreak()
                    }
                }
                
                var_3_607 = and:int(var_3_607:int, ldc:int(-138691461))
                
                if (cmple:boolean(var_5_7D = var_17_612:int, sub:int(var_6_84:int, and:int(ldc:int(7427), ldc:int(8849))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
            var_3_607 = and:int(var_3_607:int, ldc:int(2144645652))
            goto(Label_0106)
        }
    }
}
