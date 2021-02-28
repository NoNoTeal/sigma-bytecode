public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u9255\u72f1\ud217\u8c8a\ubb2b {
    public void \u9255\u72f1\ud217\u8c8a\ubb2b() {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u9255\u72f1\ud217\u8c8a\ubb2b, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4ab3\uafe7\u8709\ub171\ubefe\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_3_5F : int
        stack_8B_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-456262487), ldc:int(-161481238))
            
            if (cmpne:boolean(invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5), ldc:int(20)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-973349126))
                stack_8B_0 = and:int(ldc:int(16525), ldc:int(-16526))
            }
            else {
                stack_8B_0 = and:int(ldc:int(513), ldc:int(4521))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, long p2) {
        var_5_61 : int
        var_7_67 : \ub32d\u92ff\uc2bd\ud36e\ud36e<?>
        var_8_71 : \ub83f\uc910\u4c2b\u446c\u71ae
        
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
            var_5_61 = and:int(ldc:int(-1972670903), ldc:int(1862231233))
            var_7_67 = invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\ube23\u67d0\u64f2\u839e\u76bc)
            var_8_71 = invokevirtual:\ub83f\uc910\u4c2b\u446c\u71ae(\ube23\uc238\u5140\u4cd9\u8aa5::\u40a9\u9a18\uc246\u6bb9\u839e\u983f, p0:\ube23\uc238\u5140\u4cd9\u8aa5, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            
            if (cmpne:boolean(var_8_71:\ub83f\uc910\u4c2b\u446c\u71ae, aconstnull:\ub83f\uc910\u4c2b\u446c\u71ae())) {
                if (logicalnot:boolean(invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u7ce1\u4179\u93a2\ub6ab\u8308\u0800, var_8_71:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ud7e8\u3504\u92ee\u64f2\u6d99\u1833, var_8_71:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                        return:void()
                    }
                }
            }
            
            var_5_61 = and:int(var_5_61:int, ldc:int(1525471351))
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\uc31c\ubb2b\u3c25\u873d\u6d99\u76bc, var_7_67:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>, getstatic:\u3711\u3a62\u4cd9\ucfaf\u67e9(\u3711\u3a62\u4cd9\ucfaf\u67e9::\u6cfe\u92ff\uc84e\u760c\u0c95\uc238))
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\u4f52\u8d98\ub70c\uceb8\u9937\uf995, var_7_67:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>, invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u960f\u6d99\ub70c\u8753\u4ab3\u6c56, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))
            return:void()
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
    
    public void \u6fb0\u8413\u8389\ub1b9\ub83f\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5EB : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5F6 : int
        
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
        var_3_5EB = and:int(ldc:int(-1319569077), ldc:int(-1856251428))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9255\u72f1\ud217\u8c8a\ubb2b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(64)), ldc:int(0))) {
            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1661731463))
            var_5_7D = and:int(ldc:int(-20917), ldc:int(20660))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31728), ldc:int(31179)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5EB:int, ldc:int(-1308796455))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(579), ldc:int(2049)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(4487), ldc:int(57)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5EB = and:int(var_3_CA:int, ldc:int(-204088453))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(8813), ldc:int(7297)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-875093561))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1411040851))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1384825081))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(949485590))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1099900113))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1806206118))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(525373292))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-2070845923))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-800662816))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1834808346))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-578977971))
                        var_11_DB = and:int(ldc:int(19296), ldc:int(-27493))
                        goto(Label_1391)
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1662904730))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(235567482))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-541112989))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1124442786))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1663382522))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1479305097))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1958066827))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(823909384))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-253862451))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1191318069))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1334766111))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(459143523))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1265078754))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(835186712))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1277734401))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(1075), ldc:int(769))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-685164685))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(186467496))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1707636205))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(302062784))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-629736072))
                        var_11_DB = and:int(ldc:int(-4770), ldc:int(4769))
                    }
                    
                    Label_1027:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1106203592))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(780241934))
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-458728522))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-2001992252))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1671538853))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-631107129))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1410050668))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(950232410))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1632240219))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1805811750))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1391)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1260:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-116516157))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(131705923))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(302103104))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-868667428))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(853833581))
                        loopcontinue()
                    }
                    
                    var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1294018721))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1391:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F6 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1402:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1655536034))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1285514513))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-245236570))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1821401520))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-469828397))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1687135752))
                        var_17_5F6 = add:int(var_16_109:int, xor:int(ldc:int(25604), ldc:int(25605)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1711548597))
                
                if (cmple:boolean(var_5_7D = var_17_5F6:int, sub:int(var_6_84:int, xor:int(ldc:int(2563), ldc:int(2562))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
