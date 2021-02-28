public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8bb0\ua562\u8308\u7330\u7330\u4d85 {
    public void \u8bb0\ua562\u8308\u7330\u7330\u4d85(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6b0d\u3bd6\u6bb9\u3d64\uc229\u4c2b p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8df4\u4492\u7049\u6435\u446c\ubded p1) {
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
            putfield:\u6b0d\u3bd6\u6bb9\u3d64\uc229\u4c2b(\u8bb0\ua562\u8308\u7330\u7330\u4d85::\u5db4\ua61f\u0800\ua562\ub8be\u61a4, this:\u8bb0\ua562\u8308\u7330\u7330\u4d85, p0:\u6b0d\u3bd6\u6bb9\u3d64\uc229\u4c2b)
            invokespecial:\u0b8e\u446c\u8d90\u40a9\u4c04\u965f(\u0b8e\u446c\u8d90\u40a9\u4c04\u965f::<init>, this:\u8bb0\ua562\u8308\u7330\u7330\u4d85, p1:\u8df4\u4492\u7049\u6435\u446c\ubded)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\u5654\uc229\u8df4\u3504\u4c04(java.io.IOException p0) {
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
        
        if (logicalnot:boolean(logicalor:boolean(getstatic:boolean(\u8bb0\ua562\u8308\u7330\u7330\u4d85::\u927d\ud217\u1187\u56bd\u8d90\u600f), invokestatic:boolean(Thread::holdsLock, getfield:\u6b0d\u3bd6\u6bb9\u3d64\uc229\u4c2b[expected:Object](\u8bb0\ua562\u8308\u7330\u7330\u4d85::\u5db4\ua61f\u0800\ua562\ub8be\u61a4, this:\u8bb0\ua562\u8308\u7330\u7330\u4d85))))) {
            athrow(initobject:AssertionError(AssertionError::<init>))
        }
        
        putfield:boolean(\u6b0d\u3bd6\u6bb9\u3d64\uc229\u4c2b::\u8c8a\ud4fe\u8350\u3a62\u4c2b\u392e, getfield:\u6b0d\u3bd6\u6bb9\u3d64\uc229\u4c2b(\u8bb0\ua562\u8308\u7330\u7330\u4d85::\u5db4\ua61f\u0800\ua562\ub8be\u61a4, this:\u8bb0\ua562\u8308\u7330\u7330\u4d85), and:int[expected:boolean](ldc:int(24631), ldc:int(2241)))
    }
    
    static {
        var_0_5F : int
        stack_87_0 : int [generated]
        
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
            var_0_5F = and:int(ldc:int(-249546325), ldc:int(-12111395))
            
            if (invokevirtual:boolean(Class<T>::desiredAssertionStatus, ldc:Class<\u6b0d\u3bd6\u6bb9\u3d64\uc229\u4c2b>(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6b0d\u3bd6\u6bb9\u3d64\uc229\u4c2b.class))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(2143858605))
                stack_87_0 = and:int(ldc:int(-26968), ldc:int(26965))
            }
            else {
                stack_87_0 = and:int(ldc:int(3289), ldc:int(257))
            }
            
            putstatic:boolean(\u8bb0\ua562\u8308\u7330\u7330\u4d85::\u927d\ud217\u1187\u56bd\u8d90\u600f, stack_87_0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u836c\u516c\u6c56\u8389\ub70c\uc3e3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5ED : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5F8 : int
        
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
        var_3_5ED = and:int(ldc:int(298203765), ldc:int(-762515852))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8bb0\ua562\u8308\u7330\u7330\u4d85[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(2077633347))
            var_5_7D = and:int(ldc:int(18484), ldc:int(-18485))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2912), ldc:int(-19451)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5ED:int, ldc:int(2122820423))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(9233), ldc:int(9232)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(21632), ldc:int(21633)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5ED = and:int(var_3_CA:int, ldc:int(899645397))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(9987), ldc:int(16453)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(547589268))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1707590154))
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(712884925))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1744677866))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1312242963))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1021689685))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-53437966))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1229642145))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(698438374))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-908971917))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2129033925))
                        var_11_DB = and:int(ldc:int(-17216), ldc:int(16957))
                        goto(Label_1407)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(272069816))
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(824468994))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1993129689))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1325050666))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1853396238))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-840091755))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1573034951))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1585110056))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(909791036))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2060943056))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1613359120))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(760226233))
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-232265695))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1652065848))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1161547781))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(8513), ldc:int(8512))
                                goto(Label_1011)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1209645057))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(161855190))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1504488038))
                        var_11_DB = and:int(ldc:int(-16629), ldc:int(16628))
                    }
                    
                    Label_1011:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(496837092))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1981377208))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1436170304))
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1796267240))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(435250792))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-559940737))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-875265921))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1750769118))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1011)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1866333088))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1439140534))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1939588754))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(964280224))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1385541350))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1268:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-384989210))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(950376583))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1179370614))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(813127474))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1398536647))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1513100264))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1853441445))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(766477969))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-3898398))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1061815104))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1288815198))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1178325016))
                        var_17_5F8 = add:int(var_16_109:int, and:int(ldc:int(8385), ldc:int(6691)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5ED = and:int(var_3_5ED:int, ldc:int(-218333617))
                
                if (cmple:boolean(var_5_7D = var_17_5F8:int, sub:int(var_6_84:int, and:int(ldc:int(177), ldc:int(5643))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
