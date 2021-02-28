public class \u71f1\uc910\u3bc9\u516c\u93a2.\u7330\u69d9\u1187\u67e9\u67e9\ud523 {
    public void \u7330\u69d9\u1187\u67e9\u67e9\ud523(\u51fa\u12cb\u7330\u74b1\u6c52.\u3dd3\ufcaf\u8640\u647c\u927d\ud12e p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u3dd3\ufcaf\u8640\u647c\u927d\ud12e p1, int p2) {
        var_6_83 : int
        
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
            putfield:\u3dd3\ufcaf\u8640\u647c\u927d\ud12e(\u7330\u69d9\u1187\u67e9\u67e9\ud523::\ub83f\u8413\uc87f\u7873\u8258\u647c, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523, p0:\u3dd3\ufcaf\u8640\u647c\u927d\ud12e)
            invokespecial:Object(Object::<init>, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523)
            putfield:\u392e\ucfaf\u47c2\uae87\u0800\ub6ab[](\u7330\u69d9\u1187\u67e9\u67e9\ud523::\u8c8a\u6cfe\u4c2b\u0b8e\uc84e\u1833, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523, newarray:\u392e\ucfaf\u47c2\uae87\u0800\ub6ab[](\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u392e\ucfaf\u47c2\uae87\u0800\ub6ab.class, p2:int))
            putfield:ArrayList(\u7330\u69d9\u1187\u67e9\u67e9\ud523::\ub171\u3bc9\u392e\u69d9\u47c2\ufe34, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523, initobject:ArrayList(ArrayList<E>::<init>))
            var_6_83 = and:int(ldc:int(-7819), ldc:int(7818))
            
            while (cmplt:boolean(var_6_83:int, arraylength:int(getfield:\u392e\ucfaf\u47c2\uae87\u0800\ub6ab[](\u7330\u69d9\u1187\u67e9\u67e9\ud523::\u8c8a\u6cfe\u4c2b\u0b8e\uc84e\u1833, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523)))) {
                storeelement:\u392e\ucfaf\u47c2\uae87\u0800\ub6ab(getfield:\u392e\ucfaf\u47c2\uae87\u0800\ub6ab[](\u7330\u69d9\u1187\u67e9\u67e9\ud523::\u8c8a\u6cfe\u4c2b\u0b8e\uc84e\u1833, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523), var_6_83:int, invokevirtual:\u392e\ucfaf\u47c2\uae87\u0800\ub6ab(\u3dd3\ufcaf\u8640\u647c\u927d\ud12e::\uf9c5\u8640\ub113\u7af6\uc7fe\ud158, p0:\u3dd3\ufcaf\u8640\u647c\u927d\ud12e, p1:\u3dd3\ufcaf\u8640\u647c\u927d\ud12e))
                inc:int(var_6_83, ldc:int(1))
            }
            
            invokevirtual:void(\u7330\u69d9\u1187\u67e9\u67e9\ud523::\ub83f\u3a62\u67e9\u6ec6\ubb2b\u71ae, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523, p1:\u3dd3\ufcaf\u8640\u647c\u927d\ud12e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub83f\u3a62\u67e9\u6ec6\ubb2b\u71ae(\u51fa\u12cb\u7330\u74b1\u6c52.\u3dd3\ufcaf\u8640\u647c\u927d\ud12e p0) {
        var_2_5F : int
        var_4_6E : int
        
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
            var_2_5F = and:int(ldc:int(478357238), ldc:int(-827111625))
            invokevirtual:void(ArrayList::clear, getfield:ArrayList(\u7330\u69d9\u1187\u67e9\u67e9\ud523::\ub171\u3bc9\u392e\u69d9\u47c2\ufe34, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523))
            var_4_6E = and:int(ldc:int(1698), ldc:int(-1763))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1442299575))
                
                if (cmpge:boolean(var_4_6E:int, arraylength:int(getfield:\u392e\ucfaf\u47c2\uae87\u0800\ub6ab[](\u7330\u69d9\u1187\u67e9\u67e9\ud523::\u8c8a\u6cfe\u4c2b\u0b8e\uc84e\u1833, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:boolean(ArrayList<\u392e\ucfaf\u47c2\uae87\u0800\ub6ab>::add, getfield:ArrayList(\u7330\u69d9\u1187\u67e9\u67e9\ud523::\ub171\u3bc9\u392e\u69d9\u47c2\ufe34, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523), loadelement:\u392e\ucfaf\u47c2\uae87\u0800\ub6ab(getfield:\u392e\ucfaf\u47c2\uae87\u0800\ub6ab[](\u7330\u69d9\u1187\u67e9\u67e9\ud523::\u8c8a\u6cfe\u4c2b\u0b8e\uc84e\u1833, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523), var_4_6E:int))
                inc:int(var_4_6E, ldc:int(1))
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
    
    public void \u3bc9\u7e3f\u67e9\u6c52\u8709\u72f1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_605 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_610 : int
        
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
        var_3_605 = and:int(ldc:int(1815277236), ldc:int(-291016723))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7330\u69d9\u1187\u67e9\u67e9\ud523[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
            var_3_605 = and:int(var_3_605:int, ldc:int(-372445457))
            var_5_7D = and:int(ldc:int(-17975), ldc:int(1574))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13491), ldc:int(-14008)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_605:int, ldc:int(-256016396))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(68), ldc:int(69)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(133), ldc:int(9291)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_605 = and:int(var_3_D2:int, ldc:int(-118923401))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(2370), ldc:int(2371)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-601028327))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(599961867))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-376424601))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-475463812))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-97777314))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(928256565))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1096337072))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1362469035))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1655390181))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-529333613))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1789596524))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1693919022))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-522617113))
                        var_11_E3 = and:int(ldc:int(4883), ldc:int(-6964))
                        goto(Label_1423)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1901092474))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-118735544))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(2126577196))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-2055146624))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1627108963))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(284417115))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1476074336))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(2070478655))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1050921518))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1555757319))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1858109556))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-18798371))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1851934712))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-122826820))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(452), ldc:int(453))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1838377904))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(534373053))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(660977138))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1071027547))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-699676785))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-205828556))
                        var_11_E3 = and:int(ldc:int(-25090), ldc:int(25089))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1250751079))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(268680506))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(380058952))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-264523518))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-127799625))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-508745545))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1150735948))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-2079170381))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-2053695481))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1670635932))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1786341664))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(2010206135))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1820154618))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(962289394))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1384362330))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(363996350))
                        loopcontinue()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(2055196325))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_610 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1630913781))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1284036839))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-689343198))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-35600797))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-223949137))
                        var_17_610 = add:int(var_16_111:int, xor:int(ldc:int(2440), ldc:int(2441)))
                        looporswitchbreak()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(-1999558460))
                }
                
                var_3_605 = and:int(var_3_605:int, ldc:int(1726611237))
                
                if (cmple:boolean(var_5_7D = var_17_610:int, sub:int(var_6_84:int, and:int(ldc:int(651), ldc:int(20737))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_605 = and:int(var_3_605:int, ldc:int(778690164))
            goto(Label_0106)
        }
    }
}
