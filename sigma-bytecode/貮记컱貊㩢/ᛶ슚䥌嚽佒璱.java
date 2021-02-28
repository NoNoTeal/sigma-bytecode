public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u16f6\uc29a\u494c\u56bd\u4f52\u74b1 {
    public void \u16f6\uc29a\u494c\u56bd\u4f52\u74b1() {
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
            invokespecial:Object(Object::<init>, this:\u16f6\uc29a\u494c\u56bd\u4f52\u74b1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_24A : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_EA_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_26B_0 : byte[] [generated]
        stack_2D7_0 : byte[] [generated]
        stack_35D_0 : byte[] [generated]
        stack_397_0 : byte[] [generated]
        var_4_237 : int
        var_3_23C : byte[]
        var_5_23D : int
        expr_26B : byte [generated]
        var_0_2CD : int
        expr_2D7 : byte [generated]
        stack_313_2 : byte [generated]
        stack_2F2_0 : byte [generated]
        expr_96 : int [generated]
        expr_C1 : int [generated]
        var_2_EA : byte[]
        expr_EE : int [generated]
        var_3_386 : byte[]
        var_5_387 : int
        var_3_122 : String
        expr_12A : String[] [generated]
        expr_134 : String[] [generated]
        var_3_1E8 : String[]
        
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
        var_0_24A = and:int(ldc:int(-1620408561), ldc:int(1072482220))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_EA_0 = stack_EC_0 = stack_116_0 = stack_26B_0 = stack_2D7_0 = stack_35D_0 = stack_397_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("q7tMDMuzvgSDITREbDtz6xTbiyxM66u7TAzLs77Ti0Hry9tMNPtbfJtUQzQ84/Oro7tMDMuzvuMU+NOLu+t0FCxjPKO7TAzLs76Ea/AL48QULGM8o7tMDMuzvoS7oTNj6+Mcc0Q8q7tMDMuzvrRjMUs0PHOTNBwNzaaF")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_237 = expr_6B:int
        var_3_23C = newarray:byte[](byte.class, expr_6B:int)
        var_5_23D = expr_6B:int
        Label_0575:
        
        while (cmpeq:boolean(and:int(var_0_24A:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_24A:int, ldc:int(256)), ldc:int(0))) {
                var_0_24A = and:int(var_0_24A:int, ldc:int(-323455584))
                goto(Label_0691)
            }
            
            var_0_24A = and:int(var_0_24A:int, ldc:int(1298711390))
            var_5_23D = add:int(var_5_23D:int, ldc:int(-1))
            expr_26B = loadelement:byte(stack_26B_0:byte[], var_5_23D:int)
            storeelement:byte(var_3_23C:byte[], var_5_23D:int, add:int(or:int(and:int(shl:int(expr_26B:byte, xor:int(ldc:int(512), ldc:int(516))), ldc:int(-16)), and:int(shr:int(expr_26B:byte[expected:int], xor:int(ldc:int(24578), ldc:int(24582))), ldc:int(15))), ldc:int(66)))
            
            if (cmpne:boolean(var_5_23D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EA_0 = stack_EC_0 = stack_116_0 = stack_26B_0 = stack_2D7_0 = stack_35D_0 = stack_397_0 = var_3_23C:byte[]
            goto(Label_0112)
        }
        
        var_0_24A = and:int(var_0_24A:int, ldc:int(-96842550))
        goto(Label_0825)
        Label_0691:
        
        while (cmpne:boolean(and:int(var_0_24A:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_24A:int, ldc:int(512)), ldc:int(0))) {
                var_0_24A = and:int(var_0_24A:int, ldc:int(-2037524383))
                goto(Label_0575)
            }
            
            var_0_2CD = and:int(var_0_24A:int, ldc:int(-1074028550))
            var_5_23D = add:int(var_5_23D:int, ldc:int(-1))
            expr_2D7 = stack_313_2 = loadelement(stack_2D7_0, var_5_23D)
            
            if (cmplt:boolean(add:int(add:int(var_5_23D:int, ldc:int(3)), neg:int(var_4_237:int)), ldc:int(0))) {
                stack_313_2 = stack_2F2_0 = add:byte(expr_2D7:byte, loadelement:byte(var_3_23C:byte[], add:int(var_5_23D:int, ldc:int(3))))
                goto(Label_0770)
            }
            
            Label_0740:
            
            if (cmpne:boolean(and:int(var_0_2CD:int, ldc:int(256)), ldc:int(0))) {
                var_0_2CD = and:int(var_0_2CD:int, ldc:int(-1351756901))
                stack_313_2 = stack_2F2_0 = add:byte(expr_2D7:byte, ldc:byte(3))
            }
            
            Label_0770:
            
            if (cmpeq:boolean(and:int(var_0_2CD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0740)
            }
            
            var_0_24A = and:int(var_0_2CD:int, ldc:int(535672609))
            storeelement:byte(var_3_23C:byte[], var_5_23D:int, stack_313_2:byte)
            
            if (cmpne:boolean(var_5_23D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EA_0 = stack_EC_0 = stack_116_0 = stack_26B_0 = stack_2D7_0 = stack_35D_0 = stack_397_0 = var_3_23C:byte[]
            goto(Label_0155)
        }
        
        Label_0825:
        
        while (cmpeq:boolean(and:int(var_0_24A:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_24A:int, ldc:int(256)), ldc:int(0))) {
                var_0_24A = and:int(var_0_24A:int, ldc:int(278066405))
                goto(Label_0575)
            }
            
            var_0_24A = and:int(var_0_24A:int, ldc:int(-1077020784))
            var_5_23D = add:int(var_5_23D:int, ldc:int(-1))
            storeelement:byte(var_3_23C:byte[], var_5_23D:int, xor:byte(loadelement:byte(stack_35D_0:byte[], var_5_23D:int), ldc:byte(29)))
            
            if (cmpne:boolean(var_5_23D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EA_0 = stack_EC_0 = stack_116_0 = stack_26B_0 = stack_2D7_0 = stack_35D_0 = stack_397_0 = var_3_23C:byte[]
            goto(Label_0198)
        }
        
        goto(Label_0691)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_24A:int, ldc:int(512)), ldc:int(0))) {
            var_0_24A = and:int(var_0_24A:int, ldc:int(376594052))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_24A:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_24A:int, ldc:int(512)), ldc:int(0))) {
            var_0_24A = and:int(var_0_24A:int, ldc:int(-1075125428))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_237 = expr_96:int
                var_3_23C = newarray:byte[](byte.class, expr_96:int)
                var_5_23D = expr_96:int
                goto(Label_0691)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_24A:int, ldc:int(16)), ldc:int(0))) {
            var_0_24A = and:int(var_0_24A:int, ldc:int(-487083412))
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_24A:int, ldc:int(256)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_24A:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_24A = and:int(var_0_24A:int, ldc:int(1028585305))
            expr_C1 = arraylength:int(stack_C1_0:byte[])
            
            if (cmpne:boolean(expr_C1:int, ldc:int(0))) {
                var_4_237 = expr_C1:int
                var_3_23C = newarray:byte[](byte.class, expr_C1:int)
                var_5_23D = expr_C1:int
                goto(Label_0825)
            }
        }
        
        Label_0198:
        
        if (cmpne:boolean(and:int(var_0_24A:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_24A:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_24A = and:int(var_0_24A:int, ldc:int(-125294637))
                goto(Label_0155)
            }
            
            if (cmpne:boolean(and:int(var_0_24A:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_24A = and:int(var_0_24A:int, ldc:int(-1612920904))
            var_2_EA = stack_EA_0:byte[]
            expr_EE = add:int(arraylength:int(stack_EC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_386 = newarray:byte[](byte.class, expr_EE:int)
                var_5_387 = expr_EE:int
                
                loop {
                    var_0_24A = and:int(var_0_24A:int, ldc:int(-1343503470))
                    var_5_387 = add:int(var_5_387:int, ldc:int(-1))
                    storeelement:byte(var_3_386:byte[], var_5_387:int, add:int(shl:int(loadelement:byte(stack_397_0:byte[], var_5_387:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_EA:byte[], add:int(var_5_387:int, xor:int(ldc:int(554), ldc:int(555)))), ldc:int(7)), and:int(ldc:int(10757), ldc:int(17643)))))
                    
                    if (cmpne:boolean(var_5_387:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EA_0 = stack_EC_0 = stack_116_0 = stack_26B_0 = stack_2D7_0 = stack_35D_0 = stack_397_0 = var_3_386:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_24A:int, ldc:int(32)), ldc:int(0))) {
            var_0_24A = and:int(var_0_24A:int, ldc:int(-110933628))
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_24A:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_24A:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_12A = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-30335), ldc:int(-30329)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2150), ldc:int(24719)))
            storeelement:String(expr_12A:String[], and:int(ldc:int(-11812), ldc:int(11811)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-13690), ldc:int(13417)), xor:int(ldc:int(-16120), ldc:int(-16098))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(38), ldc:int(21725)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(-23532), ldc:int(-23550)), and:int(ldc:int(12338), ldc:int(3125))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(1057), ldc:int(16391)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(4100), ldc:int(4148)), and:int(ldc:int(67), ldc:int(30403))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(3683), ldc:int(275)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(912), ldc:int(979)), and:int(ldc:int(4692), ldc:int(468))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(34), ldc:int(4122)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(20820), ldc:int(8950)), and:int(ldc:int(246), ldc:int(1382))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(11445), ldc:int(16911)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(20966), ldc:int(126)), xor:int(ldc:int(1088), ldc:int(1082))))
            putstatic:String[](\u16f6\uc29a\u494c\u56bd\u4f52\u74b1::\u0b8e\u6198\u4daf\ucef1\u9a18\u965f, expr_134:String[])
            var_3_1E8 = expr_12A:String[]
            putstatic:Map<String, String>(\u16f6\uc29a\u494c\u56bd\u4f52\u74b1::\u8753\u6cfe\u0b8e\u927d\u9255\u600f, invokevirtual:ImmutableMap(ImmutableMap$Builder::build, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokestatic:ImmutableMap$Builder(ImmutableMap::builder), loadelement:String(var_3_1E8:String[], and:int(ldc:int(842), ldc:int(-1871))), loadelement:String(var_3_1E8:String[], xor:int(ldc:int(418), ldc:int(419)))), loadelement:String(var_3_1E8:String[], and:int(ldc:int(282), ldc:int(31234))), loadelement:String(var_3_1E8:String[], xor:int(ldc:int(5120), ldc:int(5123)))), loadelement:String(var_3_1E8:String[], and:int(ldc:int(7958), ldc:int(141))), loadelement:String(var_3_1E8:String[], and:int(ldc:int(2597), ldc:int(17557))))))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u0800\u71f1\u3d4b\u3dd3\u64f2\u8d98(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_610 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_61B : int
        
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
        var_3_610 = and:int(ldc:int(-1509285506), ldc:int(-349181953))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u16f6\uc29a\u494c\u56bd\u4f52\u74b1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_610 = and:int(var_3_610:int, ldc:int(-1520700545))
            var_5_7D = and:int(ldc:int(31249), ldc:int(-31290))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(24869), ldc:int(-31526)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_610:int, ldc:int(-1264845960))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(12420), ldc:int(12421)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(18562), ldc:int(18563)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_610 = and:int(var_3_CA:int, ldc:int(-1484819459))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(13509), ldc:int(16393)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-550293663))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-48667343))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-147593508))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-521443976))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1187988842))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1763515049))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(989136966))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1108200407))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-80830158))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1796041881))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-1197753351))
                            var_11_DB = and:int(ldc:int(-13952), ldc:int(13394))
                            goto(Label_1437)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1815835705))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1305051843))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(32)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1711231756))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(237826799))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-922761587))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-6345860))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(784590509))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-482925565))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-311714304))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(569324610))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(574299060))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(78893784))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-1150631105))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-348147843))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1256703287))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(32)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-252730960))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-330854021))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1252281858))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(4364), ldc:int(4365))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(795944412))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1966436569))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-356463615))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-994278455))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(553456633))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-417694856))
                        var_11_DB = and:int(ldc:int(30912), ldc:int(-30915))
                    }
                    
                    Label_1059:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(585825034))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-252703521))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(32)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(566092171))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(598866631))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(1785080817))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1153735303))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1509159627))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-169253304))
                            goto(Label_1059)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(32)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-1362405396))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-270643519))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(32)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-1228194949))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1437)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-435688057))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-281377261))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-2109641897))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1544542585))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1168360613))
                        loopcontinue()
                    }
                    
                    var_3_610 = and:int(var_3_610:int, ldc:int(-1123320964))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1437:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61B = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1448:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-628638541))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1262260262))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1497376464))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-262244481))
                        var_17_61B = add:int(var_16_109:int, xor:int(ldc:int(24705), ldc:int(24704)))
                        looporswitchbreak()
                    }
                    
                    var_3_610 = and:int(var_3_610:int, ldc:int(1580808621))
                }
                
                var_3_610 = and:int(var_3_610:int, ldc:int(-330417795))
                
                if (cmple:boolean(var_5_7D = var_17_61B:int, sub:int(var_6_84:int, and:int(ldc:int(8269), ldc:int(17))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
