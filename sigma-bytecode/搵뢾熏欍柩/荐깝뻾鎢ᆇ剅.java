public class \u6435\ub8be\u718f\u6b0d\u67e9.\u8350\uae5d\ubefe\u93a2\u1187\u5245 {
    public void \u8350\uae5d\ubefe\u93a2\u1187\u5245() {
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
            invokespecial:Object(Object::<init>, this:\u8350\uae5d\ubefe\u93a2\u1187\u5245)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u62da\u8389\uceb8\uc4d2\u7d52\u51b2 \u36d3\u36d3\u927d\u12b2\u4d85\u12cb(int p0) {
        var_3_64 : Optional<\u62da\u8389\uceb8\uc4d2\u7d52\u51b2>
        
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
        var_3_64 = invokestatic:Optional<\u62da\u8389\uceb8\uc4d2\u7d52\u51b2>(\u62da\u8389\uceb8\uc4d2\u7d52\u51b2::\u88c5\u3e75\uf9c5\u071d\u6b0d\ud51e, p0:int)
        
        if (invokevirtual:boolean(Optional<T>::isPresent, var_3_64:Optional<\u62da\u8389\uceb8\uc4d2\u7d52\u51b2>)) {
            return:\u62da\u8389\uceb8\uc4d2\u7d52\u51b2(checkcast:\u62da\u8389\uceb8\uc4d2\u7d52\u51b2(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u62da\u8389\uceb8\uc4d2\u7d52\u51b2.class, invokevirtual:\u62da\u8389\uceb8\uc4d2\u7d52\u51b2(Optional<\u62da\u8389\uceb8\uc4d2\u7d52\u51b2>::get, var_3_64:Optional<\u62da\u8389\uceb8\uc4d2\u7d52\u51b2>)))
        }
        
        invokevirtual:void(Logger::severe, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8350\uae5d\ubefe\u93a2\u1187\u5245::\ub8be\u647c\u3e75\u3776\ub19c\u839e), and:int(ldc:int(20229), ldc:int(-24326)))), p0:int)))
        return:\u62da\u8389\uceb8\uc4d2\u7d52\u51b2(getstatic:\u62da\u8389\uceb8\uc4d2\u7d52\u51b2(\u62da\u8389\uceb8\uc4d2\u7d52\u51b2::\u3dd3\u873d\ucfaf\u8bb0\uc84e\uc84e))
    }
    
    static {
        var_0_1E6 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_171_0 : byte[] [generated]
        stack_1F8_0 : byte[] [generated]
        stack_24B_0 : byte[] [generated]
        stack_2A0_0 : byte[] [generated]
        var_4_154 : int
        var_3_159 : byte[]
        var_5_15A : int
        var_0_167 : int
        expr_171 : byte [generated]
        stack_1B5_2 : byte [generated]
        stack_194_0 : byte [generated]
        expr_1FB : byte [generated]
        expr_96 : int [generated]
        var_2_B7 : byte[]
        expr_BB : int [generated]
        var_3_23A : byte[]
        var_5_23B : int
        expr_E6 : int [generated]
        var_3_28F : byte[]
        var_5_290 : int
        var_3_11A : String
        stack_14D_0 : String[] [generated]
        expr_12C : String[] [generated]
        
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
        var_0_1E6 = and:int(ldc:int(1267940727), ldc:int(1323183965))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_171_0 = stack_1F8_0 = stack_24B_0 = stack_2A0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("7gbxv/RGG7rlPgkIu8b9ChDoP1IJ7KwARMQndAg=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_154 = expr_6B:int
        var_3_159 = newarray:byte[](byte.class, expr_6B:int)
        var_5_15A = expr_6B:int
        Label_0348:
        
        while (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_167 = and:int(var_0_1E6:int, ldc:int(-371835427))
            var_5_15A = add:int(var_5_15A:int, ldc:int(-1))
            expr_171 = stack_1B5_2 = loadelement(stack_171_0, var_5_15A)
            
            if (cmplt:boolean(add:int(add:int(var_5_15A:int, ldc:int(2)), neg:int(var_4_154:int)), ldc:int(0))) {
                stack_1B5_2 = stack_194_0 = add:byte(expr_171:byte, loadelement:byte(var_3_159:byte[], add:int(var_5_15A:int, ldc:int(2))))
                goto(Label_0420)
            }
            
            Label_0382:
            
            if (cmpeq:boolean(and:int(var_0_167:int, ldc:int(16)), ldc:int(0))) {
                var_0_167 = and:int(var_0_167:int, ldc:int(1601442107))
            }
            else {
                var_0_167 = and:int(var_0_167:int, ldc:int(-659362308))
                stack_1B5_2 = stack_194_0 = add:byte(expr_171:byte, ldc:byte(2))
            }
            
            Label_0420:
            
            if (cmpne:boolean(and:int(var_0_167:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0382)
            }
            
            var_0_1E6 = and:int(var_0_167:int, ldc:int(-313757835))
            storeelement:byte(var_3_159:byte[], var_5_15A:int, stack_1B5_2:byte)
            
            if (cmpne:boolean(var_5_15A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_171_0 = stack_1F8_0 = stack_24B_0 = stack_2A0_0 = var_3_159:byte[]
            goto(Label_0112)
        }
        
        Label_0475:
        
        while (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-611537444))
            var_5_15A = add:int(var_5_15A:int, ldc:int(-1))
            expr_1FB = add:byte(loadelement:byte(stack_1F8_0:byte[], var_5_15A:int), ldc:byte(3))
            storeelement:byte(var_3_159:byte[], var_5_15A:int, or:int(and:int(shl:int(expr_1FB:byte, and:int(ldc:int(16420), ldc:int(7694))), ldc:int(-16)), and:int(shr:int(expr_1FB:byte[expected:int], xor:int(ldc:int(16395), ldc:int(16399))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_15A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_171_0 = stack_1F8_0 = stack_24B_0 = stack_2A0_0 = var_3_159:byte[]
            goto(Label_0155)
        }
        
        var_0_1E6 = and:int(var_0_1E6:int, ldc:int(151340309))
        goto(Label_0348)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(16)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-2088545896))
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(64)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(1234136447))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_154 = expr_96:int
                var_3_159 = newarray:byte[](byte.class, expr_96:int)
                var_5_15A = expr_96:int
                goto(Label_0475)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-362168843))
            var_2_B7 = stack_B7_0:byte[]
            expr_BB = add:int(arraylength:int(stack_B9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_3_23A = newarray:byte[](byte.class, expr_BB:int)
                var_5_23B = expr_BB:int
                
                loop {
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(2100051294))
                    var_5_23B = add:int(var_5_23B:int, ldc:int(-1))
                    storeelement:byte(var_3_23A:byte[], var_5_23B:int, add:int(shl:int(loadelement:byte(stack_24B_0:byte[], var_5_23B:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_B7:byte[], add:int(var_5_23B:int, xor:int(ldc:int(-26616), ldc:int(-26615)))), ldc:int(4)), xor:int(ldc:int(18494), ldc:int(18481)))))
                    
                    if (cmpne:boolean(var_5_23B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_171_0 = stack_1F8_0 = stack_24B_0 = stack_2A0_0 = var_3_23A:byte[]
            }
        }
        
        Label_0192:
        
        if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-1986445485))
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-376590508))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_3_28F = newarray:byte[](byte.class, expr_E6:int)
                var_5_290 = expr_E6:int
                
                loop {
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(1795534813))
                    var_5_290 = add:int(var_5_290:int, ldc:int(-1))
                    storeelement:byte(var_3_28F:byte[], var_5_290:int, xor:byte(loadelement:byte(stack_2A0_0:byte[], var_5_290:int), ldc:byte(93)))
                    
                    if (cmpne:boolean(var_5_290:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_171_0 = stack_1F8_0 = stack_24B_0 = stack_2A0_0 = var_3_28F:byte[]
            }
        }
        
        Label_0235:
        
        if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(1565387058))
            goto(Label_0112)
        }
        
        var_3_11A = initobject:String(String::<init>, stack_10E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_14D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18433), ldc:int(4465)))
        expr_12C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8397), ldc:int(3585)))
        storeelement:String(expr_12C:String[], and:int(ldc:int(23440), ldc:int(-24467)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(10611), ldc:int(-10740)), and:int(ldc:int(16732), ldc:int(10269))))
        putstatic:String[](\u8350\uae5d\ubefe\u93a2\u1187\u5245::\ub8be\u647c\u3e75\u3776\ub19c\u839e, expr_12C:String[])
    }
    
    public void \ud51e\u92ee\uf94d\uae5d\u446c\u5245(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_641 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_64C : int
        
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
        var_3_641 = and:int(ldc:int(747713633), ldc:int(933196269))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8350\uae5d\ubefe\u93a2\u1187\u5245[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(1028781553))
            var_5_7D = and:int(ldc:int(3014), ldc:int(-3015))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7895), ldc:int(2774)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_641:int, ldc:int(-1355170945))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(4877), ldc:int(16579)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(8337), ldc:int(8336)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_641 = and:int(var_3_D2:int, ldc:int(-1252000027))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(547), ldc:int(16385)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(583326960))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2018343681))
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1474080707))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1014591221))
                        goto(Label_1045)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-276166057))
                        goto(Label_0894)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(25328384))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1029944955))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(231161572))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1882237856))
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-270830302))
                        goto(Label_1045)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1301272390))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(923613025))
                            var_11_E3 = and:int(ldc:int(4757), ldc:int(-21142))
                            goto(Label_1484)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1045)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-570040373))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1006461033))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-450642951))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1396614845))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1119802107))
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(596851250))
                        goto(Label_1045)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2116650696))
                        goto(Label_0894)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(252904108))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(447657849))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1488191763))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1238111338))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1045)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(405734766))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1639458247))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1946628219))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(14849), ldc:int(16401))
                                goto(Label_1045)
                            }
                        }
                    }
                    
                    Label_0894:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1088144879))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1725039957))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1472780401))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1241226453))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1242597143))
                        var_11_E3 = and:int(ldc:int(19084), ldc:int(-24272))
                    }
                    
                    Label_1045:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1028197315))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1524917645))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0894)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-378565836))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1113207823))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1460417586))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1023173806))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(670269031))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1320)
                            }
                        }
                    }
                    
                    Label_1181:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(578924953))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2145972151))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(807722062))
                            goto(Label_1045)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0894)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-892126120))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-971956769))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(623378287))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1484)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1320:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-694001563))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2046198236))
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1980819679))
                        goto(Label_1045)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1553449365))
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-675095095))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1816891513))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1671397321))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(732106750))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(-1505675921))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1484:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64C = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1495:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1474031754))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2085333357))
                        goto(Label_1045)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(240367079))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1520913013))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1362248581))
                        var_17_64C = add:int(var_16_111:int, xor:int(ldc:int(-20472), ldc:int(-20471)))
                        looporswitchbreak()
                    }
                }
                
                var_3_641 = and:int(var_3_641:int, ldc:int(2125987707))
                
                if (cmple:boolean(var_5_7D = var_17_64C:int, sub:int(var_6_84:int, xor:int(ldc:int(-24062), ldc:int(-24061))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-1018752097))
            goto(Label_0106)
        }
    }
}
