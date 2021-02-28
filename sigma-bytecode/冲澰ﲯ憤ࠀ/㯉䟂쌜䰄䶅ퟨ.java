public final class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u3bc9\u47c2\uc31c\u4c04\u4d85\ud7e8 {
    public void \u3bc9\u47c2\uc31c\u4c04\u4d85\ud7e8() {
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
            invokespecial:Object(Object::<init>, this:\u3bc9\u47c2\uc31c\u4c04\u4d85\ud7e8)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ube23\u0800\u52d3\u69d9\u92ee\u8709 \u76bc\u69d9\u8640\u34df\u99f7\ufe34(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ube23\u0800\u52d3\u69d9\u92ee\u8709 p0, java.lang.Integer[] p1) {
        var_3_5F : int
        var_5_C0 : \u7d52\u69d9\uae87\ud4fe\uc910\u3e2a
        
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
            var_3_5F = and:int(ldc:int(888656187), ldc:int(1969150942))
            
            if (cmpne:boolean(arraylength:int(p1:Integer[]), and:int(ldc:int(9), ldc:int(4357)))) {
                do {
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-522091500))
                    }
                    else {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-608507368))
                        
                        if (cmpne:boolean(arraylength:int(p1:Integer[]), and:int(ldc:int(202), ldc:int(24834)))) {
                            loopcontinue()
                        }
                        
                        var_5_C0 = initobject:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::<init>, invokevirtual:int(Integer::intValue, loadelement:Integer(p1:Integer[], and:int(ldc:int(-12374), ldc:int(12373)))), and:int[expected:byte](ldc:int(12353), ldc:int(16947)), invokevirtual:short(Integer::shortValue, loadelement:Integer(p1:Integer[], xor:int(ldc:int(16395), ldc:int(16394)))), aconstnull:\ub83f\u6c52\u12cb\u3c25\u3776())
                        goto(Label_0242)
                    }
                } while (cmpne:boolean(and:int(var_3_5F:int, ldc:int(134217728)), ldc:int(0)))
                
                return:\ube23\u0800\u52d3\u69d9\u92ee\u8709(p0:\ube23\u0800\u52d3\u69d9\u92ee\u8709)
            }
            
            var_5_C0 = initobject:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::<init>, invokevirtual:int(Integer::intValue, loadelement:Integer(p1:Integer[], and:int(ldc:int(4174), ldc:int(-4175)))), and:int[expected:byte](ldc:int(16409), ldc:int(839)), and:int[expected:short](ldc:int(-17159), ldc:int(17158)), aconstnull:\ub83f\u6c52\u12cb\u3c25\u3776())
            Label_0242:
            invokestatic:void(\u12b2\uc9f6\u4f52\ud12e\ub83f\u7043::\uf94d\u6c56\ub19c\ub7dc\ube23\u983f, var_5_C0:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a)
            invokeinterface:boolean(List<\u8350\u4179\ud7e8\ufe34\u62da\u9af2>::add, invokevirtual:List<\u8350\u4179\ud7e8\ufe34\u62da\u9af2>(\ube23\u0800\u52d3\u69d9\u92ee\u8709::\ub113\ud7e8\u9255\uceb8\u836c\u4ab3, p0:\ube23\u0800\u52d3\u69d9\u92ee\u8709), initobject:\u8350\u4179\ud7e8\ufe34\u62da\u9af2(\u8350\u4179\ud7e8\ufe34\u62da\u9af2::<init>, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uceb8\ufcaf\uc3e3\u4c04\u392e\u8cae), var_5_C0:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[expected:Object]))
            return:\ube23\u0800\u52d3\u69d9\u92ee\u8709(p0:\ube23\u0800\u52d3\u69d9\u92ee\u8709)
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u965f\u74b1\u1833\uc229\uf995\uf9c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_608 : int
        
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
        var_3_5FD = and:int(ldc:int(132284470), ldc:int(1314976055))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bc9\u47c2\uc31c\u4c04\u4d85\ud7e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-564406289))
            var_5_7D = and:int(ldc:int(-17859), ldc:int(16834))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30899), ldc:int(18610)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5FD:int, ldc:int(130827575))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(4352), ldc:int(4353)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(16453), ldc:int(16452)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_CA:int, ldc:int(-2045814734))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(8293), ldc:int(17155)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1877811216))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1652092455))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1550372653))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(652236731))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(687316051))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1154715039))
                    }
                    else {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-277486602))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-390949748))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(973818435))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(324005101))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1067497918))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(384425279))
                            var_11_DB = and:int(ldc:int(4440), ldc:int(-4441))
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-761807193))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1746795411))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1883855873))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(174660663))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(742154941))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-281853405))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1631881984))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-279860708))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1143023195))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-575696986))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1912425298))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(166496071))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1547157882))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1194381743))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2006755742))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-241137944))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-680683733))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-32664), ldc:int(-32663))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-953971541))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2010393688))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1521602005))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-958075244))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-562211760))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-297302597))
                        var_11_DB = and:int(ldc:int(-11411), ldc:int(11410))
                    }
                    
                    Label_1059:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2055167719))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(223414981))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-924096938))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1923145558))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1427274498))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(774147198))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1764980296))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2015869984))
                            goto(Label_1059)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1789041619))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2087487311))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(2077493184))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1044302485))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1330005510))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-167165014))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1324:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1838970683))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-502768117))
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(1184350179))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(390804116))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-895353832))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(830394395))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1890549901))
                        var_17_608 = add:int(var_16_109:int, and:int(ldc:int(4225), ldc:int(877)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(518425147))
                
                if (cmple:boolean(var_5_7D = var_17_608:int, sub:int(var_6_84:int, and:int(ldc:int(4241), ldc:int(8271))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
