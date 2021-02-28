public class \ud36e\u6bb9\u960f\u4c04\u64ab.\ub1b9\ud171\u4d85\u1187\u8389\ucb79 {
    public void \ub1b9\ud171\u4d85\u1187\u8389\ucb79() {
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
            invokespecial:Object(Object::<init>, this:\ub1b9\ud171\u4d85\u1187\u8389\ucb79)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u7d52\u5654\u52d3\u836c\ub1b9\u6b0d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, boolean p1, boolean p2) {
        var_4_61 : int
        var_4_74 : int
        var_4_D0 : int
        var_6_AA : Random
        var_4_1C7 : int
        var_7_116 : int
        var_8_121 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_9_199 : \u51fa\u6c52\u7330\u7330\u960f
        var_10_1B6 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_11_1CF : \u6d99\u6b0d\ubff1\uc246\u946b
        var_15_27D : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_18_2A7 : \u120d\u98a4\uceb8\u8cae\u47c2
        var_19_2C6 : int
        var_20_2CF : int
        var_21_2F0 : \u7006\ucef1\ua562\ud217\u4179
        
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
        var_4_61 = and:int(ldc:int(-1723755687), ldc:int(-2368097))
        
        if (logicalnot:boolean(p1:boolean)) {
            return:int(and:int(ldc:int(-29014), ldc:int(20805)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                var_4_74 = and:int(var_4_61:int, ldc:int(863113399))
            }
            else {
                var_4_74 = and:int(var_4_61:int, ldc:int(-2927751))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u7e3f\ubff1\u718f\ub171\u72f1::\ub113\u718f\u8389\u071d\uc87f\u16f6, invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\ua3b4\u8d98\u6bb9\u0a06\u6ec6\u9a18)))) {
                    return:int(and:int(ldc:int(22737), ldc:int(-22738)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_4_74:int, ldc:int(16)), ldc:int(0))) {
                var_4_61 = and:int(var_4_74:int, ldc:int(2881529))
            }
            else {
                var_4_D0 = and:int(var_4_74:int, ldc:int(-612437733))
                var_6_AA = getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5)
                putfield:int(\ub1b9\ud171\u4d85\u1187\u8389\ucb79::\uc2e8\u59ec\u839e\u3c25\u7c6b\u4ab3, this:\ub1b9\ud171\u4d85\u1187\u8389\ucb79, sub:int(getfield:int(\ub1b9\ud171\u4d85\u1187\u8389\ucb79::\uc2e8\u59ec\u839e\u3c25\u7c6b\u4ab3, this:\ub1b9\ud171\u4d85\u1187\u8389\ucb79), and:int(ldc:int(4369), ldc:int(549))))
                
                if (cmpgt:boolean(getfield:int(\ub1b9\ud171\u4d85\u1187\u8389\ucb79::\uc2e8\u59ec\u839e\u3c25\u7c6b\u4ab3, this:\ub1b9\ud171\u4d85\u1187\u8389\ucb79), ldc:int(0))) {
                    return:int(and:int(ldc:int(-2266), ldc:int(2265)))
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_4_D0:int, ldc:int(8388608)), ldc:int(0))) {
                        var_4_D0 = and:int(var_4_D0:int, ldc:int(-1720078023))
                        putfield:int(\ub1b9\ud171\u4d85\u1187\u8389\ucb79::\uc2e8\u59ec\u839e\u3c25\u7c6b\u4ab3, this:\ub1b9\ud171\u4d85\u1187\u8389\ucb79, add:int(getfield:int(\ub1b9\ud171\u4d85\u1187\u8389\ucb79::\uc2e8\u59ec\u839e\u3c25\u7c6b\u4ab3, this:\ub1b9\ud171\u4d85\u1187\u8389\ucb79), mul:int(add:int(ldc:int(60), invokevirtual:int(Random::nextInt, var_6_AA:Random, ldc:int(60))), ldc:int(20))))
                        
                        if (cmplt:boolean(invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8308\ufcaf\u392e\u5db4\u5d20\ud51e, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), and:int(ldc:int(21), ldc:int(103)))) {
                            if (invokevirtual:boolean(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u6bb9\ubf56\u9af2\u927d\u927d\ub19c, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))) {
                                return:int(and:int(ldc:int(-19117), ldc:int(19084)))
                            }
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_4_D0:int, ldc:int(4194304)), ldc:int(0))) {
                        var_4_1C7 = and:int(var_4_D0:int, ldc:int(-1074201765))
                        var_7_116 = and:int(ldc:int(-23897), ldc:int(23888))
                        var_8_121 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a, p0:\ube23\uc238\u5140\u4cd9\u8aa5))
                        
                        while (invokeinterface:boolean(Iterator::hasNext, var_8_121:Iterator)) {
                            var_9_199 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_8_121:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(\ua3b4\u8aa5\ub113\ubf56\u873d::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, var_9_199:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d]))) {
                                var_10_1B6 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, var_9_199:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                                
                                if (invokevirtual:boolean(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u6bb9\ubf56\u9af2\u927d\u927d\ub19c, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))) {
                                    if (cmplt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_10_1B6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))) {
                                        goto(Label_0419)
                                    }
                                    
                                    if (logicalnot:boolean(invokevirtual:boolean(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\u8df4\u71f1\u12b2\u9af2\u1833\ub1b9, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140], var_10_1B6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                                        goto(Label_0419)
                                    }
                                }
                                
                                var_4_1C7 = and:int(var_4_1C7:int, ldc:int(-1144767045))
                                var_11_1CF = invokevirtual:\u6d99\u6b0d\ubff1\uc246\u946b(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7af6\u8350\u4179\ufe34\ub18d\ucfaf, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_10_1B6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                                
                                if (invokevirtual:boolean(\u6d99\u6b0d\ubff1\uc246\u946b::\ub83f\ud7e8\uafe7\u8640\u51b2\u4179, var_11_1CF:\u6d99\u6b0d\ubff1\uc246\u946b, mul:float(invokevirtual:float(Random::nextFloat, var_6_AA:Random), ldc:float(3.0f)))) {
                                    if (cmpge:boolean(invokevirtual:int(Random::nextInt, var_6_AA:Random, invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokevirtual:int(\u5fe1\u071d\u34df\u9937\u3bd6\u69d9::\u7006\ud12e\uafe7\u760c\ube23\u4c04, invokevirtual:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56(\u51fa\u6c52\u7330\u7330\u960f::\ud7e8\u92ff\u927d\ud158\ud158\ubefe, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_9_199:\u51fa\u6c52\u7330\u7330\u960f)), invokevirtual:\u6435\u5d20\u071d\u5fe1\ubded\ud171<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::\u0800\ufcaf\ucfaf\ub1b9\u8709\u446c, getstatic:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\u516c\u6d99\u8709\u6c52\uc3e3\u9af2), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\u99f7\uc910\u8d98\u9937\u385b\uc238))), and:int(ldc:int(9825), ldc:int(18695)), ldc:int(2147483647))), ldc:int(72000))) {
                                        var_15_27D = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc246\u76bc\u4daf\uf9c5\uc246\u416d, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u7bad\u72f1\u7873\u5fe1\ua068, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, var_10_1B6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, add:int(ldc:int(20), invokevirtual:int(Random::nextInt, var_6_AA:Random, ldc:int(15)))), add:int(ldc:int(-10), invokevirtual:int(Random::nextInt, var_6_AA:Random, ldc:int(21)))), add:int(ldc:int(-10), invokevirtual:int(Random::nextInt, var_6_AA:Random, ldc:int(21))))
                                        
                                        if (invokestatic:boolean(\ud7e8\ud171\u9937\u647c\u6b5f\ud523::\u36d3\ubcb0\u6b0d\u6b5f\ud4fe\u56bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_15_27D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_15_27D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u9033\u3711\u494c\u88c5\u69d9\u97b7, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_15_27D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u7006\ucef1\ua562\ud217\u4179>(\u9255\u0c95\u4cd9\ube23\u760c::\u8d90\ud36e\uc31c\ud523\u8d98\ud7e8))) {
                                            var_18_2A7 = aconstnull:\u120d\u98a4\uceb8\u8cae\u47c2()
                                            var_19_2C6 = add:int(xor:int(ldc:int(18), ldc:int(19)), invokevirtual:int(Random::nextInt, var_6_AA:Random, add:int(invokevirtual:int(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u8d90\ud36e\ub70c\u946b\u7e3f\uc2e8, invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u6d99\u6b0d\ubff1\uc246\u946b::\uc3e3\u3776\u8413\u1187\ufcaf\uc87f, var_11_1CF:\u6d99\u6b0d\ubff1\uc246\u946b)), xor:int(ldc:int(16472), ldc:int(16473)))))
                                            var_20_2CF = and:int(ldc:int(4459), ldc:int(-15868))
                                            
                                            while (cmplt:boolean(var_20_2CF:int, var_19_2C6:int)) {
                                                var_21_2F0 = checkcast:\u7006\ucef1\ua562\ud217\u4179(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u7006\ucef1\ua562\ud217\u4179.class, invokevirtual:\u7006\ucef1\ua562\ud217\u4179(\u9255\u0c95\u4cd9\ube23\u760c<\u7006\ucef1\ua562\ud217\u4179>::\u7d52\u62da\uc29a\uc9f6\u51fa\u983f, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u7006\ucef1\ua562\ud217\u4179>(\u9255\u0c95\u4cd9\ube23\u760c::\u8d90\ud36e\uc31c\ud523\u8d98\ud7e8), p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))
                                                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u5db4\u4cd9\ub7dc\ucfaf\ub18d\u071d, var_21_2F0:\u7006\ucef1\ua562\ud217\u4179[expected:\u7d52\u718f\u3776\u6fb0\ub83f], var_15_27D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:float(0.0f), ldc:float(0.0f))
                                                var_18_2A7 = invokevirtual:\u120d\u98a4\uceb8\u8cae\u47c2(\u7006\ucef1\ua562\ud217\u4179::\uc3e3\u183a\u8640\ud171\uafe7\u1833, var_21_2F0:\u7006\ucef1\ua562\ud217\u4179, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\ua6bd\u8d98\u6ec6\uc246\uc238], var_11_1CF:\u6d99\u6b0d\ubff1\uc246\u946b, getstatic:\u5f50\u3e75\u51fa\u983f\u67e9(\u5f50\u3e75\u51fa\u983f\u67e9::\u6fb0\u120d\u7bad\uc7fe\u64ab\uc3e3), var_18_2A7:\u120d\u98a4\uceb8\u8cae\u47c2, checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc()))
                                                invokevirtual:void(\ua6bd\u8d98\u6ec6\uc246\uc238::\u624e\ub113\u3a62\u93a2\u6cfe\u6fb0, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\ua6bd\u8d98\u6ec6\uc246\uc238], var_21_2F0:\u7006\ucef1\ua562\ud217\u4179[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                                                inc:int(var_20_2CF, ldc:int(1))
                                            }
                                            
                                            var_7_116 = add:int(var_7_116:int, var_19_2C6:int)
                                        }
                                    }
                                }
                            }
                            
                            Label_0419:
                            var_4_1C7 = and:int(var_4_1C7:int, ldc:int(-1681097797))
                        }
                        
                        return:int(var_7_116:int)
                    }
                    
                    var_4_D0 = and:int(var_4_D0:int, ldc:int(-1356634097))
                }
            }
        }
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
    
    public void \u67e9\u960f\u8258\u516c\u36d3\u0b8e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_663 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66E : int
        
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
        var_3_663 = and:int(ldc:int(-921131670), ldc:int(-150803969))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub1b9\ud171\u4d85\u1187\u8389\ucb79[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(-1184881302))
            var_5_81 = and:int(ldc:int(17945), ldc:int(-17946))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3528), ldc:int(3527)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_663:int, ldc:int(-1982894738))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(4097), ldc:int(16401)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(912), ldc:int(913)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_663 = and:int(var_3_DA:int, ldc:int(-1749063190))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(8601), ldc:int(33)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1729929108))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-160378881))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(2004312686))
                    }
                    else {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1451987970))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0401:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(186458214))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(627919072))
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1408330982))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(849006742))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-437980805))
                            var_11_EB = and:int(ldc:int(7520), ldc:int(-8033))
                            goto(Label_1486)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(540102266))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1965520318))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1335248638))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1066757456))
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(862789748))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1820415110))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1866021488))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(796939695))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1038050543))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(393094398))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-2019923074))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0829:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1868671152))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(726788420))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-2120482557))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1153837612))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-148280454))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(6216), ldc:int(6217))
                                goto(Label_1111)
                            }
                        }
                    }
                    
                    Label_0952:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1101903378))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(2001747281))
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(608194088))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(423192650))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-484482054))
                        var_11_EB = and:int(ldc:int(-115), ldc:int(114))
                    }
                    
                    Label_1111:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1213381790))
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0952)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1904494986))
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1882571666))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1282965084))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-709317782))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1368)
                            }
                        }
                    }
                    
                    Label_1233:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1157100712))
                            goto(Label_1111)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0952)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1862049988))
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-479601525))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(2090397612))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1757879429))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1486)
                    }
                    
                    Label_1368:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1452693201))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-449079937))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_663 = and:int(var_3_663:int, ldc:int(-279877778))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1486:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66E = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1497:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(580561204))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(814137071))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-816127554))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(831295365))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-313348195))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-232776536))
                        goto(Label_0401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-180574866))
                        var_17_66E = add:int(var_16_119:int, and:int(ldc:int(4177), ldc:int(8199)))
                        looporswitchbreak()
                    }
                    
                    var_3_663 = and:int(var_3_663:int, ldc:int(663722811))
                }
                
                var_3_663 = and:int(var_3_663:int, ldc:int(-1894025733))
                
                if (cmple:boolean(var_5_81 = var_17_66E:int, sub:int(var_6_88:int, and:int(ldc:int(16449), ldc:int(553))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(1218249157))
            goto(Label_0108)
        }
    }
}
