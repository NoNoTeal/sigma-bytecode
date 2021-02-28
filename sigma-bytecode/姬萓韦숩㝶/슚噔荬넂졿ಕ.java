public class \u59ec\u8413\u97e6\uc229\u3776.\uc29a\u5654\u836c\ub102\uc87f\u0c95 {
    public void \uc29a\u5654\u836c\ub102\uc87f\u0c95(\u71f1\uc910\u3bc9\u516c\u93a2.\ud171\u56bd\ub18d\ubded\u4bc8\u4c04 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p1) {
        var_5_82 : Iterator<\u9255\u0c95\u4cd9\ube23\u760c<?>>
        var_6_A5 : \u9255\u0c95\u4cd9\ube23\u760c<?>
        
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
            putfield:\ud171\u56bd\ub18d\ubded\u4bc8\u4c04(\uc29a\u5654\u836c\ub102\uc87f\u0c95::\uc31c\uceb8\u6c52\u4f52\u56bd\uc3e3, this:\uc29a\u5654\u836c\ub102\uc87f\u0c95, p0:\ud171\u56bd\ub18d\ubded\u4bc8\u4c04)
            invokespecial:\ub7dc\u0800\u64ab\u8640\u6198\u927d(\ub7dc\u0800\u64ab\u8640\u6198\u927d::<init>, this:\uc29a\u5654\u836c\ub102\uc87f\u0c95, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, getfield:int(\ud171\u56bd\ub18d\ubded\u4bc8\u4c04::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, p0:\ud171\u56bd\ub18d\ubded\u4bc8\u4c04), getfield:int(\ud171\u56bd\ub18d\ubded\u4bc8\u4c04::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, p0:\ud171\u56bd\ub18d\ubded\u4bc8\u4c04), ldc:int(32), sub:int(getfield:int(\ud171\u56bd\ub18d\ubded\u4bc8\u4c04::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, p0:\ud171\u56bd\ub18d\ubded\u4bc8\u4c04), ldc:int(64)), ldc:int(36))
            var_5_82 = invokevirtual:Iterator<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u9255\u0c95\u4cd9\ube23\u760c<?>>::iterator, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>[expected:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u9255\u0c95\u4cd9\ube23\u760c<?>>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_82:Iterator<\u9255\u0c95\u4cd9\ube23\u760c<?>>)) {
                var_6_A5 = checkcast:\u9255\u0c95\u4cd9\ube23\u760c<?>(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<?>.class, invokeinterface:\u9255\u0c95\u4cd9\ube23\u760c<?>(Iterator<\u9255\u0c95\u4cd9\ube23\u760c<?>>::next, var_5_82:Iterator<\u9255\u0c95\u4cd9\ube23\u760c<?>>))
                
                if (logicaland:boolean(cmple:boolean(invokevirtual:int(\u5fe1\u071d\u34df\u9937\u3bd6\u69d9::\u7006\ud12e\uafe7\u760c\ube23\u4c04, invokestatic:\u5fe1\u071d\u34df\u9937\u3bd6\u69d9(\ud171\u56bd\ub18d\ubded\u4bc8\u4c04::\u8d90\u64f2\u7330\u3bc9\ua3b4\u8753, p0:\ud171\u56bd\ub18d\ubded\u4bc8\u4c04), invokevirtual:\u6435\u5d20\u071d\u5fe1\ubded\ud171<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u0800\ufcaf\ucfaf\ub1b9\u8709\u446c, getstatic:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\u69d9\u64ab\u98a4\uc87f\u5db4\u52d3), var_6_A5:\u9255\u0c95\u4cd9\ube23\u760c<?>)), ldc:int(0)), cmple:boolean(invokevirtual:int(\u5fe1\u071d\u34df\u9937\u3bd6\u69d9::\u7006\ud12e\uafe7\u760c\ube23\u4c04, invokestatic:\u5fe1\u071d\u34df\u9937\u3bd6\u69d9(\ud171\u56bd\ub18d\ubded\u4bc8\u4c04::\u8d90\u64f2\u7330\u3bc9\ua3b4\u8753, p0:\ud171\u56bd\ub18d\ubded\u4bc8\u4c04), invokevirtual:\u6435\u5d20\u071d\u5fe1\ubded\ud171<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u0800\ufcaf\ucfaf\ub1b9\u8709\u446c, getstatic:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\u6cfe\u983f\ua61f\ua3b4\u51b2\u16f6), var_6_A5:\u9255\u0c95\u4cd9\ube23\u760c<?>)), ldc:int(0)))) {
                    loopcontinue()
                }
                
                invokevirtual:int(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u839e\ua61f\uf94d\u1187\ud51e\ubff1>::\u446c\uff55\u9a18\ube23\u983f\u4cd9, this:\uc29a\u5654\u836c\ub102\uc87f\u0c95[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u839e\ua61f\uf94d\u1187\ud51e\ubff1>], initobject:\u839e\ua61f\uf94d\u1187\ud51e\ubff1(\u839e\ua61f\uf94d\u1187\ud51e\ubff1::<init>, this:\uc29a\u5654\u836c\ub102\uc87f\u0c95, var_6_A5:\u9255\u0c95\u4cd9\ube23\u760c<?>))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u120d\ucef1\u7af6\u9255\u8cae\ud171(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0) {
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, getfield:\ud171\u56bd\ub18d\ubded\u4bc8\u4c04[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uc29a\u5654\u836c\ub102\uc87f\u0c95::\uc31c\uceb8\u6c52\u4f52\u56bd\uc3e3, this:\uc29a\u5654\u836c\ub102\uc87f\u0c95), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
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
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64E : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_659 : int
        
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
        var_3_64E = and:int(ldc:int(897809687), ldc:int(-315196180))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc29a\u5654\u836c\ub102\uc87f\u0c95[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(-149018249))
            var_5_7D = and:int(ldc:int(-13221), ldc:int(13188))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10587), ldc:int(-26972)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_64E:int, ldc:int(-964543044))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(19017), ldc:int(131)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4129), ldc:int(16913)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_64E = and:int(var_3_D2:int, ldc:int(661895422))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(18), ldc:int(19)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(270110840))
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1685065911))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(276189449))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1239879655))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(191959462))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-2090246183))
                    }
                    else {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-137707962))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1484097034))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-942131130))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1858581507))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1593250301))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(710215361))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-271078505))
                        var_11_E3 = and:int(ldc:int(10467), ldc:int(-11492))
                        goto(Label_1481)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(210885715))
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-491064399))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1780543944))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1255642647))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-2020123529))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1803584954))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-566461269))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-547387313))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(495276049))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1814649451))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-79585048))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1728277311))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1674056957))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1350970241))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1134435631))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1108338336))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-393399920))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-157369036))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(656813662))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(5312), ldc:int(5313))
                                goto(Label_1115)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-94960378))
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-885640068))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-385965762))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(504695187))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(410737731))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1385354526))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-471153911))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1818360032))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1675220779))
                        var_11_E3 = and:int(ldc:int(24673), ldc:int(-28772))
                    }
                    
                    Label_1115:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-71198505))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-126345671))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-447516267))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-564393886))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(391347996))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1344)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(649930898))
                            goto(Label_1115)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-2079323929))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-2035760527))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(229305414))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1481)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1344:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(384332582))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1608709084))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1163453534))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-670961749))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1376575299))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64E = and:int(var_3_64E:int, ldc:int(926576325))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1481:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_659 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1492:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-116412859))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(798978899))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1745590006))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1641020530))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-567062154))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(504019372))
                        var_17_659 = add:int(var_16_111:int, and:int(ldc:int(17605), ldc:int(2049)))
                        looporswitchbreak()
                    }
                    
                    var_3_64E = and:int(var_3_64E:int, ldc:int(2040308151))
                }
                
                var_3_64E = and:int(var_3_64E:int, ldc:int(-1537851657))
                
                if (cmple:boolean(var_5_7D = var_17_659:int, sub:int(var_6_84:int, and:int(ldc:int(1099), ldc:int(20485))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(-1463904690))
            goto(Label_0106)
        }
    }
}
