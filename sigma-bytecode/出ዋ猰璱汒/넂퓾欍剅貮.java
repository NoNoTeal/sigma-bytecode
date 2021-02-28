public class \u51fa\u12cb\u7330\u74b1\u6c52.\ub102\ud4fe\u6b0d\u5245\u8cae {
    public void \ub102\ud4fe\u6b0d\u5245\u8cae() {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\ub102\ud4fe\u6b0d\u5245\u8cae, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u47c2\ubded\u600f\u120d\ubf56\u3776), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u59ec\u7330\ucb79\u40a9\u6bb9\uff55)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4ab3\uafe7\u8709\ub171\ubefe\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_3_5F : int
        stack_8C_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(1883836171), ldc:int(-58889459))
            
            if (cmple:boolean(invokevirtual:float(Random::nextFloat, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5)), ldc:float(0.95f))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1641155368))
                stack_8C_0 = and:int(ldc:int(19009), ldc:int(-19010))
            }
            else {
                stack_8C_0 = xor:int(ldc:int(72), ldc:int(73))
            }
            
            return:boolean(stack_8C_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, long p2) {
        var_8_7A : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_9_9D : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_8_7A = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8709\u8bb0\u718f\u416d\u6b0d\u92ee::\u3d4b\u7c6b\u5d20\u8d98\u600f\u71f1, checkcast:\u8709\u8bb0\u718f\u416d\u6b0d\u92ee(\ub113\uc4d2\u183a\u527a\u6435.\u8709\u8bb0\u718f\u416d\u6b0d\u92ee.class, invokevirtual:\u8709\u8bb0\u718f\u416d\u6b0d\u92ee(Optional<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>::get, invokevirtual:Optional<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u47c2\ubded\u600f\u120d\ubf56\u3776)))))
            
            if (invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u92ee\ua3b4\u3c25\u7330\u3711\uc2e8, var_8_7A:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:double(3.0))) {
                var_9_9D = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_8_7A:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                
                if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_9_9D:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u7e3f\u16f6\ufe34\ud171\uc910\u5f50))) {
                    invokevirtual:boolean(\u965f\u6435\u3e75\u9937\u7006\u4179::\u6fb0\u71ae\uafe7\u8aa5\u983f\ua61f, checkcast:\u965f\u6435\u3e75\u9937\u7006\u4179(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u965f\u6435\u3e75\u9937\u7006\u4179.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_9_9D:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])), p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_8_7A:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2()))
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
        var_3_64C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_657 : int
        
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
        var_3_64C = and:int(ldc:int(-1502305346), ldc:int(1444681637))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub102\ud4fe\u6b0d\u5245\u8cae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_64C = and:int(var_3_64C:int, ldc:int(533283844))
        }
        else {
            var_3_64C = and:int(var_3_64C:int, ldc:int(-493382668))
            var_5_85 = and:int(ldc:int(1384), ldc:int(-1385))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5961), ldc:int(-6090)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_64C:int, ldc:int(-2096267523))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(66), ldc:int(67)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(20545), ldc:int(21)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_64C = and:int(var_3_D2:int, ldc:int(-806606169))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(17089), ldc:int(5)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(389199149))
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-647253947))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-2127077917))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1586649972))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(918545388))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1692449448))
                    }
                    else {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(846588926))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(588250550))
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-417068568))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1141682889))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(2066878943))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1515101801))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-460062522))
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-486030610))
                        var_11_E3 = and:int(ldc:int(8430), ldc:int(-8431))
                        goto(Label_1485)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1069784461))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1710053421))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(1967885232))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-92341585))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(653249667))
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1352497723))
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(828139563))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-1922264689))
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1678494748))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1555659055))
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1055082823))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1970507730))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(2029506141))
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1591916096))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-1956938894))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(1131852775))
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1816260881))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(22017), ldc:int(259))
                                goto(Label_1086)
                            }
                        }
                    }
                    
                    Label_0935:
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1380824676))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-176457595))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(170232956))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-310497940))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1691572500))
                        var_11_E3 = and:int(ldc:int(28172), ldc:int(-28318))
                    }
                    
                    Label_1086:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(780295858))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-428156693))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0935)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(618611538))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(258118461))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1720510462))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1203:
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-701053708))
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(1993148541))
                            goto(Label_1086)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0935)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(1707761870))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-1297355145))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-1164467038))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-219454886))
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1473170092))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1485)
                    }
                    
                    Label_1348:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1087755026))
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(2101864774))
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1838784297))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-2092962998))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-207180566))
                        loopcontinue()
                    }
                    
                    var_3_64C = and:int(var_3_64C:int, ldc:int(-1751134212))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1485:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_657 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1496:
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-2065496387))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(947906615))
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1354497733))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(162261478))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1380128831))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-2089480194))
                        var_17_657 = add:int(var_16_111:int, xor:int(ldc:int(16736), ldc:int(16737)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64C = and:int(var_3_64C:int, ldc:int(-543736916))
                
                if (cmple:boolean(var_5_85 = var_17_657:int, sub:int(var_6_8C:int, xor:int(ldc:int(3092), ldc:int(3093))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
