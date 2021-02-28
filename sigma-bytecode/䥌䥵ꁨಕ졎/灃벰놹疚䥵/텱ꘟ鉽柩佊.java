public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ud171\ua61f\u927d\u67e9\u4f4a {
    public void \ud171\ua61f\u927d\u67e9\u4f4a(java.util.Random p0, int p1, int p2) {
        var_6_78 : \ub113\u527a\u836c\uc2e8\ua6bd[]
        var_7_7D : int
        var_8_86 : int
        var_9_BD : \ub113\u527a\u836c\uc2e8\ua6bd
        var_6_A1 : \ub113\u527a\u836c\uc2e8\ua6bd[]
        var_7_A6 : int
        var_8_AF : int
        var_9_F6 : \ub113\u527a\u836c\uc2e8\ua6bd
        
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
            invokespecial:\uae5d\u97b7\u600f\u647c\uc238(\uae5d\u97b7\u600f\u647c\uc238::<init>, this:\ud171\ua61f\u927d\u67e9\u4f4a, p0:Random, p1:int, p2:int)
            putfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\ud171\ua61f\u927d\u67e9\u4f4a::\u61a4\u4c2b\u960f\u40a9\uff55\ub18d, this:\ud171\ua61f\u927d\u67e9\u4f4a, invokestatic:ArrayList[expected:List<\uc7fe\u12cb\u1833\u67e9\u92ff>](Lists::newArrayList))
            putfield:List<\ub113\u527a\u836c\uc2e8\ua6bd>(\ud171\ua61f\u927d\u67e9\u4f4a::\u6b5f\u6435\u64ab\u9937\u416d\u5140, this:\ud171\ua61f\u927d\u67e9\u4f4a, invokestatic:ArrayList[expected:List<\ub113\u527a\u836c\uc2e8\ua6bd>](Lists::newArrayList))
            var_6_78 = invokestatic:\ub113\u527a\u836c\uc2e8\ua6bd[](\u3d64\u64f2\u9033\u97b7\u8cae::\u5d20\u4bc8\u983f\uc2e8\u72f1\u946b)
            var_7_7D = arraylength:int(var_6_78:\ub113\u527a\u836c\uc2e8\ua6bd[])
            var_8_86 = and:int(ldc:int(119), ldc:int(-120))
            
            while (cmplt:boolean(var_8_86:int, var_7_7D:int)) {
                var_9_BD = loadelement:\ub113\u527a\u836c\uc2e8\ua6bd(var_6_78:\ub113\u527a\u836c\uc2e8\ua6bd[], var_8_86:int)
                putfield:int(\ub113\u527a\u836c\uc2e8\ua6bd::\ub70c\u4492\u4179\u16f6\u3e2a\ua61f, var_9_BD:\ub113\u527a\u836c\uc2e8\ua6bd, and:int(ldc:int(-15306), ldc:int(15041)))
                invokeinterface:boolean(List<\ub113\u527a\u836c\uc2e8\ua6bd>::add, getfield:List<\ub113\u527a\u836c\uc2e8\ua6bd>(\ud171\ua61f\u927d\u67e9\u4f4a::\u6b5f\u6435\u64ab\u9937\u416d\u5140, this:\ud171\ua61f\u927d\u67e9\u4f4a), var_9_BD:\ub113\u527a\u836c\uc2e8\ua6bd)
                inc:int(var_8_86, ldc:int(1))
            }
            
            putfield:List<\ub113\u527a\u836c\uc2e8\ua6bd>(\ud171\ua61f\u927d\u67e9\u4f4a::\u8df4\u6ec6\u51fa\uc238\u12b2\u40a9, this:\ud171\ua61f\u927d\u67e9\u4f4a, invokestatic:ArrayList[expected:List<\ub113\u527a\u836c\uc2e8\ua6bd>](Lists::newArrayList))
            var_6_A1 = invokestatic:\ub113\u527a\u836c\uc2e8\ua6bd[](\u3d64\u64f2\u9033\u97b7\u8cae::\uc31c\u8d98\u927d\ua562\ube23\ud12e)
            var_7_A6 = arraylength:int(var_6_A1:\ub113\u527a\u836c\uc2e8\ua6bd[])
            var_8_AF = and:int(ldc:int(-32414), ldc:int(31885))
            
            while (cmplt:boolean(var_8_AF:int, var_7_A6:int)) {
                var_9_F6 = loadelement:\ub113\u527a\u836c\uc2e8\ua6bd(var_6_A1:\ub113\u527a\u836c\uc2e8\ua6bd[], var_8_AF:int)
                putfield:int(\ub113\u527a\u836c\uc2e8\ua6bd::\ub70c\u4492\u4179\u16f6\u3e2a\ua61f, var_9_F6:\ub113\u527a\u836c\uc2e8\ua6bd, and:int(ldc:int(-13918), ldc:int(9289)))
                invokeinterface:boolean(List<\ub113\u527a\u836c\uc2e8\ua6bd>::add, getfield:List<\ub113\u527a\u836c\uc2e8\ua6bd>(\ud171\ua61f\u927d\u67e9\u4f4a::\u8df4\u6ec6\u51fa\uc238\u12b2\u40a9, this:\ud171\ua61f\u927d\u67e9\u4f4a), var_9_F6:\ub113\u527a\u836c\uc2e8\ua6bd)
                inc:int(var_8_AF, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\ua61f\u927d\u67e9\u4f4a(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1) {
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
            invokespecial:\uae5d\u97b7\u600f\u647c\uc238(\uae5d\u97b7\u600f\u647c\uc238::<init>, this:\ud171\ua61f\u927d\u67e9\u4f4a, getstatic:\uc87f\ud12e\u0b8e\u7049\u7e3f(\uc87f\ud12e\u0b8e\u7049\u7e3f::\u67e9\u8aa5\u927d\ud51e\u5245\u0a06), p1:\uc31c\uc87f\uc246\u3776\ub7dc)
            putfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\ud171\ua61f\u927d\u67e9\u4f4a::\u61a4\u4c2b\u960f\u40a9\uff55\ub18d, this:\ud171\ua61f\u927d\u67e9\u4f4a, invokestatic:ArrayList[expected:List<\uc7fe\u12cb\u1833\u67e9\u92ff>](Lists::newArrayList))
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
    
    public void \u120d\u3d4b\u4c04\ua6bd\u40a9\ub6ab(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5F0 : int
        
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
        var_3_5E5 = and:int(ldc:int(-1283524962), ldc:int(-1082210905))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud171\ua61f\u927d\u67e9\u4f4a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-404195952))
        }
        else {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1150316577))
            var_5_85 = and:int(ldc:int(16552), ldc:int(-16553))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9108), ldc:int(913)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5E5:int, ldc:int(-210779978))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(20651), ldc:int(1617)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(41), ldc:int(9473)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5E5 = and:int(var_3_D2:int, ldc:int(-1150313826))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2603), ldc:int(16785)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1843101629))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-640920662))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-637960135))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(565820742))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1140918625))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1308367153))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1506563619))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-533380344))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1262139329))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1390149070))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-397249007))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1150372906))
                            var_11_E3 = and:int(ldc:int(11032), ldc:int(-11033))
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1435862878))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1535324118))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1136452979))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-619721784))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1704164922))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1174718695))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1484856578))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1069711978))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-855245822))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1035454948))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-814414394))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1342203706))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1710383965))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(649369399))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(158674103))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-325178658))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-76638474))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(13315), ldc:int(17217))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(12967555))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(240797723))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2089759658))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1779187814))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1498785081))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-403721497))
                        var_11_E3 = and:int(ldc:int(-10205), ldc:int(10124))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(392532447))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1807671646))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(368728028))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1276135234))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(741646027))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1162836421))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-209809186))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2041938432))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1195336036))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-353819407))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-107852494))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1485916753))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F0 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1057305960))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2084582154))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-33737832))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-8391529))
                        var_17_5F0 = add:int(var_16_111:int, and:int(ldc:int(2563), ldc:int(24617)))
                        looporswitchbreak()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(794314936))
                }
                
                var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-210779962))
                
                if (cmple:boolean(var_5_85 = var_17_5F0:int, sub:int(var_6_8C:int, xor:int(ldc:int(16552), ldc:int(16553))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
