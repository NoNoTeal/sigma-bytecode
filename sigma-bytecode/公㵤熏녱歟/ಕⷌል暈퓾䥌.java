public class \u516c\u3d64\u718f\ub171\u6b5f.\u0c95\u2dcc\u120d\uf9c5\ud4fe\u494c {
    public void \u0c95\u2dcc\u120d\uf9c5\ud4fe\u494c(com.mojang.serialization.Codec<\ud36e\u6bb9\u960f\u4c04\u64ab.\u4975\ud12e\u2dcc\u718f\ub83f\u4d85> p0) {
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
            invokespecial:\u946b\u7e3f\u4179\ufcaf\u76bc\u8cae(\u946b\u7e3f\u4179\ufcaf\u76bc\u8cae::<init>, this:\u0c95\u2dcc\u120d\uf9c5\ud4fe\u494c, p0:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8c8a\uc2bd\ud171\uf995\u3bc9\ud4fe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd p0, java.util.Random p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3) {
        var_5_61 : int
        var_7_67 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_8_7C : int
        var_9_85 : int
        var_5_25C : int
        var_9_D5 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_10_EA : int
        var_11_F2 : ArrayList
        var_12_10F : Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>
        var_13_18F : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_14_1B4 : int
        var_15_1BD : int
        var_16_1C6 : int
        
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
        var_5_61 = and:int(ldc:int(693360898), ldc:int(2088229844))
        var_7_67 = invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u839e\uc7fe\u392e\u7330\ud523\u3d4b, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        var_8_7C = add:int(invokevirtual:int(Random::nextInt, p1:Random, and:int(ldc:int(67), ldc:int(16783))), and:int(ldc:int(16403), ldc:int(1)))
        var_9_85 = and:int(ldc:int(27651), ldc:int(-27652))
        
        loop {
            if (cmpne:boolean(and:int(var_5_61:int, ldc:int(268435456)), ldc:int(0))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-860969509))
                goto(Label_0293)
            }
            
            if (cmpne:boolean(and:int(var_5_61:int, ldc:int(131072)), ldc:int(0))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-271330029))
                
                if (cmplt:boolean(var_9_85:int, var_8_7C:int)) {
                    if (invokevirtual:boolean(\u946b\u7e3f\u4179\ufcaf\u76bc\u8cae::\u7049\u8bb0\u4d85\ubff1\u8d98\u88c5, this:\u0c95\u2dcc\u120d\uf9c5\ud4fe\u494c[expected:\u946b\u7e3f\u4179\ufcaf\u76bc\u8cae], p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd, p1:Random, var_7_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                        goto(Label_0293)
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(21961), ldc:int(10773)))
                }
            }
            
            Label_0175:
            
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(131072)), ldc:int(0))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-1880166948))
            }
            else {
                if (cmpne:boolean(and:int(var_5_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_5_25C = and:int(var_5_61:int, ldc:int(-1446545575))
                    var_9_D5 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u183a\u647c\u71f1\u6435\u6c52\u8df4, var_7_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a)
                    var_10_EA = add:int(invokevirtual:int(Random::nextInt, p1:Random, xor:int(ldc:int(35), ldc:int(32))), and:int(ldc:int(25094), ldc:int(2234)))
                    var_11_F2 = invokestatic:ArrayList(Lists::newArrayList, getstatic:\u385b\u3e2a\uf9c5\u7043\u12cb\ub32d[expected:Iterable](\u385b\u3e2a\uf9c5\u7043\u12cb\ub32d::\u97e6\u3d4b\u3e75\u5654\u9a18\u4ab3))
                    invokestatic:void(Collections::shuffle, var_11_F2:ArrayList<?>[expected:List<?>], p1:Random)
                    var_12_10F = invokeinterface:Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>(List<\u760c\u4975\u4179\uc246\u8640\u64f2>::iterator, invokeinterface:List<\u760c\u4975\u4179\uc246\u8640\u64f2>(List<\u760c\u4975\u4179\uc246\u8640\u64f2>::subList, var_11_F2:ArrayList<\u760c\u4975\u4179\uc246\u8640\u64f2>[expected:List<\u760c\u4975\u4179\uc246\u8640\u64f2>], and:int(ldc:int(18676), ldc:int(-19191)), var_10_EA:int))
                    
                    while (invokeinterface:boolean(Iterator::hasNext, var_12_10F:Iterator)) {
                        var_13_18F = checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokeinterface:\u760c\u4975\u4179\uc246\u8640\u64f2(Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>::next, var_12_10F:Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>))
                        invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_7_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_9_D5:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
                        invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, var_7_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_13_18F:\u760c\u4975\u4179\uc246\u8640\u64f2)
                        var_14_1B4 = add:int(invokevirtual:int(Random::nextInt, p1:Random, xor:int(ldc:int(-12278), ldc:int(-12273))), and:int(ldc:int(18530), ldc:int(13062)))
                        var_15_1BD = and:int(ldc:int(8717), ldc:int(-8718))
                        var_16_1C6 = and:int(ldc:int(5262), ldc:int(-23951))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_5_25C:int, ldc:int(1)), ldc:int(0))) {
                                var_5_25C = and:int(var_5_25C:int, ldc:int(-799738008))
                                goto(Label_0583)
                            }
                            
                            if (cmpne:boolean(and:int(var_5_25C:int, ldc:int(1)), ldc:int(0))) {
                                var_5_25C = and:int(var_5_25C:int, ldc:int(-1596554586))
                            }
                            else {
                                var_5_25C = and:int(var_5_25C:int, ldc:int(2111012310))
                                
                                if (cmplt:boolean(var_16_1C6:int, var_14_1B4:int)) {
                                    if (invokevirtual:boolean(\u946b\u7e3f\u4179\ufcaf\u76bc\u8cae::\u7049\u8bb0\u4d85\ubff1\u8d98\u88c5, this:\u0c95\u2dcc\u120d\uf9c5\ud4fe\u494c[expected:\u946b\u7e3f\u4179\ufcaf\u76bc\u8cae], p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd, p1:Random, var_7_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                                        inc:int(var_15_1BD, ldc:int(1))
                                        invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, var_7_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))
                                        
                                        if (cmpeq:boolean(var_16_1C6:int, ldc:int(0))) {
                                            goto(Label_0583)
                                        }
                                        
                                        if (cmplt:boolean(var_15_1BD:int, and:int(ldc:int(2), ldc:int(8515)))) {
                                            goto(Label_0642)
                                        }
                                        
                                        if (cmpge:boolean(invokevirtual:float(Random::nextFloat, p1:Random), ldc:float(0.25f))) {
                                            goto(Label_0642)
                                        }
                                        
                                        goto(Label_0583)
                                    }
                                }
                            }
                            
                            Label_0506:
                            
                            if (cmpeq:boolean(and:int(var_5_25C:int, ldc:int(4194304)), ldc:int(0))) {
                                var_5_25C = and:int(var_5_25C:int, ldc:int(1987202414))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_5_25C:int, ldc:int(2147483647)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                loopcontinue()
                            }
                            
                            Label_0583:
                            
                            if (cmpne:boolean(and:int(var_5_25C:int, ldc:int(8)), ldc:int(0))) {
                                goto(Label_0506)
                            }
                            
                            if (cmpne:boolean(and:int(var_5_25C:int, ldc:int(268435456)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_5_25C = and:int(var_5_25C:int, ldc:int(2143549844))
                            invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, var_7_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_13_18F:\u760c\u4975\u4179\uc246\u8640\u64f2)
                            var_15_1BD = and:int(ldc:int(-32758), ldc:int(32400))
                            Label_0642:
                            var_5_25C = and:int(var_5_25C:int, ldc:int(989035287))
                            inc:int(var_16_1C6, ldc:int(1))
                        }
                        
                        var_5_25C = and:int(var_5_25C:int, ldc:int(1843393805))
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(5155), ldc:int(641)))
                }
                
                loopcontinue()
            }
            
            Label_0293:
            
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(65536)), ldc:int(0))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(550144318))
                goto(Label_0175)
            }
            
            if (cmpne:boolean(and:int(var_5_61:int, ldc:int(33554432)), ldc:int(0))) {
                loopcontinue()
            }
            
            var_5_61 = and:int(var_5_61:int, ldc:int(-1076397820))
            invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, var_7_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))
            inc:int(var_9_85, ldc:int(1))
        }
    }
    
    public void \u5bc4\ub18d\u5140\ucfaf\u392e\u1833(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F4 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5FF : int
        
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
        var_3_5F4 = and:int(ldc:int(-637562786), ldc:int(468549372))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0c95\u2dcc\u120d\uf9c5\ud4fe\u494c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16384)), ldc:int(0))) {
            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1628352036))
            var_5_7D = and:int(ldc:int(19782), ldc:int(-19783))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3214), ldc:int(-3535)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5F4:int, ldc:int(-588152993))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(4169), ldc:int(293)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(-12224), ldc:int(-12223)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5F4 = and:int(var_3_CA:int, ldc:int(-1174676961))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16422), ldc:int(16423)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-2073655159))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1455799834))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1255161865))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1811538347))
                    }
                    else {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1588190620))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(701152310))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(818073930))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1947920410))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-461906888))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1712621731))
                            var_11_DB = and:int(ldc:int(9440), ldc:int(-26593))
                            goto(Label_1409)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-718598347))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1841178459))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-2103661669))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(83747778))
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-118522177))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1561178469))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(395785800))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1124773540))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1692011803))
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-256693110))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-780423518))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1415049424))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(870265030))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(684538921))
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-570830562))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(20549), ldc:int(11561))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1836547882))
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1403749660))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1154148984))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-764678343))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1711696292))
                        var_11_DB = and:int(ldc:int(-13909), ldc:int(13908))
                    }
                    
                    Label_1019:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-830695308))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(512242283))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1793681843))
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1188067837))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1022623263))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1271)
                            }
                        }
                    }
                    
                    Label_1135:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1575686499))
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(944779174))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1516240412))
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(809375338))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-639896061))
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(2130416958))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1409)
                    }
                    
                    Label_1271:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-442338521))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1359195648))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1702207050))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-934049909))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(501694226))
                        loopcontinue()
                    }
                    
                    var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-641909794))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1409:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FF = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1420:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-49086752))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(2035588139))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1940368977))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(480702637))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(2112994399))
                        var_17_5FF = add:int(var_16_109:int, and:int(ldc:int(7169), ldc:int(3)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F4 = and:int(var_3_5F4:int, ldc:int(414186237))
                
                if (cmple:boolean(var_5_7D = var_17_5FF:int, sub:int(var_6_84:int, and:int(ldc:int(17605), ldc:int(10763))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
