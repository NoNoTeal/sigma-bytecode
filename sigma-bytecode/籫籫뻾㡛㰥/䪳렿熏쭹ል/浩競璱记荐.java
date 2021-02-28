public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d69\u7af6\u74b1\u8bb0\u8350 {
    public void \u6d69\u7af6\u74b1\u8bb0\u8350() {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u6d69\u7af6\u74b1\u8bb0\u8350, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of))
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
            var_3_5F = and:int(ldc:int(-1307248566), ldc:int(-346810471))
            
            if (cmpne:boolean(invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5), ldc:int(20)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-527101529))
                stack_8B_0 = and:int(ldc:int(-29918), ldc:int(29836))
            }
            else {
                stack_8B_0 = and:int(ldc:int(30727), ldc:int(513))
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
            var_5_61 = and:int(ldc:int(-1555991719), ldc:int(-1209028115))
            var_7_67 = invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\ube23\u67d0\u64f2\u839e\u76bc)
            var_8_71 = invokevirtual:\ub83f\uc910\u4c2b\u446c\u71ae(\ube23\uc238\u5140\u4cd9\u8aa5::\u40a9\u9a18\uc246\u6bb9\u839e\u983f, p0:\ube23\uc238\u5140\u4cd9\u8aa5, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            
            if (cmpne:boolean(var_8_71:\ub83f\uc910\u4c2b\u446c\u71ae, aconstnull:\ub83f\uc910\u4c2b\u446c\u71ae())) {
                if (logicaland:boolean(invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ubcb0\u5bc4\u3a62\u40a9\u600f\u4f52, var_8_71:\ub83f\uc910\u4c2b\u446c\u71ae), logicalnot:boolean(invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u927d\u9255\u8413\uc246\uc246\ud4fe, var_8_71:\ub83f\uc910\u4c2b\u446c\u71ae)))) {
                    invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\uc31c\ubb2b\u3c25\u873d\u6d99\u76bc, var_7_67:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>, getstatic:\u3711\u3a62\u4cd9\ucfaf\u67e9(\u3711\u3a62\u4cd9\ucfaf\u67e9::\u5140\u52d3\u527a\ub171\u6c56\ud12e))
                    invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\u600f\u4cd9\u3d64\u47c2\u4d85\ub171, var_7_67:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>, getstatic:\u3711\u3a62\u4cd9\ucfaf\u67e9(\u3711\u3a62\u4cd9\ucfaf\u67e9::\u5140\u52d3\u527a\ub171\u6c56\ud12e))
                }
                else {
                    var_5_61 = and:int(var_5_61:int, ldc:int(1935012747))
                    invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\uc31c\ubb2b\u3c25\u873d\u6d99\u76bc, var_7_67:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>, getstatic:\u3711\u3a62\u4cd9\ucfaf\u67e9(\u3711\u3a62\u4cd9\ucfaf\u67e9::\u3bd6\u7af6\u946b\u946b\u7d52\u72f1))
                    invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\u600f\u4cd9\u3d64\u47c2\u4d85\ub171, var_7_67:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>, getstatic:\u3711\u3a62\u4cd9\ucfaf\u67e9(\u3711\u3a62\u4cd9\ucfaf\u67e9::\u3bd6\u7af6\u946b\u946b\u7d52\u72f1))
                }
            }
            
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
        var_3_613 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_61E : int
        
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
        var_3_613 = and:int(ldc:int(1866445735), ldc:int(1647915727))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d69\u7af6\u74b1\u8bb0\u8350[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
            var_3_613 = and:int(var_3_613:int, ldc:int(-1399627393))
        }
        else {
            var_3_613 = and:int(var_3_613:int, ldc:int(1782316742))
            var_5_85 = and:int(ldc:int(-17800), ldc:int(1415))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5566), ldc:int(5429)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_613:int, ldc:int(1806794351))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(6), ldc:int(7)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(3108), ldc:int(3109)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_613 = and:int(var_3_DA:int, ldc:int(-147753041))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(5), ldc:int(4)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-452308971))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1864484182))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(750750356))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(744442873))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1668003809))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1265595857))
                        goto(Label_0740)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-533213405))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1529737163))
                    }
                    else {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1983869686))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1572576518))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(498504935))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-528981677))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1791160755))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1344579683))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-483275708))
                        goto(Label_0740)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(430112037))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1450208136))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(1740633935))
                        var_11_EB = and:int(ldc:int(3399), ldc:int(-24416))
                        goto(Label_1440)
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1128745367))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(230956944))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1408746441))
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1890835991))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-1357460853))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1362885821))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(1983625799))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0740:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(467211867))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1467392905))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1356901952))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1528082870))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(-293896462))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-232484430))
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(322227716))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(321413126))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(2097377341))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(-214338741))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(384), ldc:int(385))
                                goto(Label_1123)
                            }
                        }
                    }
                    
                    Label_0969:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1666233523))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-1108424827))
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1917140645))
                            goto(Label_0740)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1971635181))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1136246524))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(2129887102))
                        var_11_EB = and:int(ldc:int(-5063), ldc:int(5062))
                    }
                    
                    Label_1123:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1039151672))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(513954082))
                            goto(Label_0969)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(-147213538))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(634051281))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1123)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(886685256))
                            goto(Label_0969)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-166619388))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(20295937))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-1311277440))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(-491259946))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1440)
                    }
                    
                    Label_1348:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0740)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_613 = and:int(var_3_613:int, ldc:int(2142976783))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1440:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61E = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1451:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1008394114))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1892573635))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1194856949))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0740)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(78299721))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-205652249))
                        var_17_61E = add:int(var_16_119:int, and:int(ldc:int(18755), ldc:int(9753)))
                        looporswitchbreak()
                    }
                }
                
                var_3_613 = and:int(var_3_613:int, ldc:int(2138388171))
                
                if (cmple:boolean(var_5_85 = var_17_61E:int, sub:int(var_6_8C:int, and:int(ldc:int(20753), ldc:int(1185))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
            var_3_613 = and:int(var_3_613:int, ldc:int(-628514067))
            goto(Label_0106)
        }
    }
}
