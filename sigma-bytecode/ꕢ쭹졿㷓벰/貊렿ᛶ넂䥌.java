public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u8c8a\ub83f\u16f6\ub102\u494c {
    public void \u8c8a\ub83f\u16f6\ub102\u494c() {
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
            invokespecial:Object(Object::<init>, this:\u8c8a\ub83f\u16f6\ub102\u494c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u56bd\u8413\u647c\u5bc4\ud158.\ud4fe\uf9c5\u5fe1\uc9f6\uafe7 \u6cfe\uafe7\u4ab3\u4daf\ub102\uc910(java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff> p0, java.util.Random p1, int p2, int p3, int p4, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p5, int p6, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7006\u7049\ub70c\u74b1\ud217 p7) {
        var_8_B6 : int
        var_10_69 : int
        var_11_11C : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_8_95 : int
        var_11_A2 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_11_D3 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        
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
        var_8_B6 = and:int(ldc:int(-524043596), ldc:int(-1127466252))
        var_10_69 = invokevirtual:int(Random::nextInt, p1:Random, ldc:int(100))
        
        if (cmplt:boolean(var_10_69:int, ldc:int(80))) {
            do {
                if (cmpeq:boolean(and:int(var_8_B6:int, ldc:int(1048576)), ldc:int(0))) {
                    var_8_B6 = and:int(var_8_B6:int, ldc:int(1973673724))
                    
                    if (cmplt:boolean(var_10_69:int, ldc:int(70))) {
                        loopcontinue()
                    }
                    
                    var_11_11C = invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u965f\u4c2b\u5fe1\uc238\uc2e8::\ud51e\ubf56\ubcb0\u97b7\u3bc9\u5fe1, p0:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p1:Random, p2:int, p3:int, p4:int, p5:\u760c\u4975\u4179\uc246\u8640\u64f2)
                    
                    if (cmpeq:boolean(var_11_11C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, aconstnull:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6())) {
                        var_8_95 = and:int(var_8_B6:int, ldc:int(1652701103))
                        goto(Label_0169)
                    }
                    
                    return:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(initobject:\u965f\u4c2b\u5fe1\uc238\uc2e8(\u965f\u4c2b\u5fe1\uc238\uc2e8::<init>, p6:int, var_11_11C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p5:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:\u7006\u7049\ub70c\u74b1\ud217))
                }
            } while (cmpeq:boolean(and:int(var_8_B6:int, ldc:int(8388608)), ldc:int(0)))
            
            var_8_95 = and:int(var_8_B6:int, ldc:int(865145598))
            var_11_A2 = invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ub113\u3a62\u8413\u9255\ubb2b::\u56bd\u7049\u9937\u6fb0\u836c\uf94d, p0:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p1:Random, p2:int, p3:int, p4:int, p5:\u760c\u4975\u4179\uc246\u8640\u64f2)
            
            if (cmpne:boolean(var_11_A2:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, aconstnull:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6())) {
                return:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(initobject:\ub113\u3a62\u8413\u9255\ubb2b(\ub113\u3a62\u8413\u9255\ubb2b::<init>, p6:int, p1:Random, var_11_A2:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p5:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:\u7006\u7049\ub70c\u74b1\ud217))
            }
        }
        else {
            var_11_D3 = invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ua068\u4492\u960f\u416d\u4daf::\uf94d\u12cb\u4975\u7873\ua068\ud36e, p0:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p1:Random, p2:int, p3:int, p4:int, p5:\u760c\u4975\u4179\uc246\u8640\u64f2)
            
            if (cmpeq:boolean(var_11_D3:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, aconstnull:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6())) {
                goto(Label_0218)
            }
            
            return:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(initobject:\ua068\u4492\u960f\u416d\u4daf(\ua068\u4492\u960f\u416d\u4daf::<init>, p6:int, var_11_D3:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p5:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:\u7006\u7049\ub70c\u74b1\ud217))
        }
        
        Label_0169:
        
        if (cmpne:boolean(and:int(var_8_95:int, ldc:int(32)), ldc:int(0))) {
            return:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(aconstnull:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7())
        }
        
        var_8_B6 = and:int(var_8_95:int, ldc:int(205393287))
        Label_0218:
        
        if (cmpne:boolean(and:int(var_8_B6:int, ldc:int(2097152)), ldc:int(0))) {
            var_8_95 = and:int(var_8_B6:int, ldc:int(914790896))
            goto(Label_0169)
        }
        
        var_8_95 = and:int(var_8_B6:int, ldc:int(-1130357834))
        goto(Label_0169)
    }
    
    private static \u56bd\u8413\u647c\u5bc4\ud158.\ud4fe\uf9c5\u5fe1\uc9f6\uafe7 \u6fb0\u74b1\ucef1\u52d3\ub171\u7049(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff p0, java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff> p1, java.util.Random p2, int p3, int p4, int p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p6, int p7) {
        var_8_77 : int
        var_11_EC : \ud4fe\uf9c5\u5fe1\uc9f6\uafe7
        
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
        var_8_77 = and:int(ldc:int(-261391155), ldc:int(-1733429831))
        
        if (cmpgt:boolean(p7:int, ldc:int(8))) {
            return:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(aconstnull:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7())
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_8_77:int, ldc:int(16777216)), ldc:int(0))) {
                var_8_77 = and:int(var_8_77:int, ldc:int(-1276299511))
                
                if (cmple:boolean(invokestatic:int(Math::abs, sub:int(p3:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, invokevirtual:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\uc7fe\u12cb\u1833\u67e9\u92ff::\u8bb0\u3dd3\u0800\u416d\u3e75\uc2e8, p0:\uc7fe\u12cb\u1833\u67e9\u92ff)))), ldc:int(80))) {
                    if (cmple:boolean(invokestatic:int(Math::abs, sub:int(p5:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, invokevirtual:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\uc7fe\u12cb\u1833\u67e9\u92ff::\u8bb0\u3dd3\u0800\u416d\u3e75\uc2e8, p0:\uc7fe\u12cb\u1833\u67e9\u92ff)))), ldc:int(80))) {
                        var_11_EC = invokestatic:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(\u8c8a\ub83f\u16f6\ub102\u494c::\u6cfe\uafe7\u4ab3\u4daf\ub102\uc910, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, add:int(p7:int, and:int(ldc:int(1537), ldc:int(4135))), getfield:\u7006\u7049\ub70c\u74b1\ud217(\ud4fe\uf9c5\u5fe1\uc9f6\uafe7::\u71ae\u40a9\ub8be\uc31c\u3d4b\u5d20, checkcast:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(\u56bd\u8413\u647c\u5bc4\ud158.\ud4fe\uf9c5\u5fe1\uc9f6\uafe7.class, p0:\uc7fe\u12cb\u1833\u67e9\u92ff[expected:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7])))
                        
                        if (cmpne:boolean(var_11_EC:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7, aconstnull:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7())) {
                            invokeinterface:boolean(List<\ud4fe\uf9c5\u5fe1\uc9f6\uafe7>::add, p1:List<\ud4fe\uf9c5\u5fe1\uc9f6\uafe7>, var_11_EC:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7)
                            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\uae5d\u5245\u4d85\u5d20\u3a62\uc3e3, var_11_EC:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\uc7fe\u12cb\u1833\u67e9\u92ff, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random)
                        }
                        
                        return:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(var_11_EC:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7)
                    }
                }
            }
            
            if (cmpeq:boolean(and:int(var_8_77:int, ldc:int(16777216)), ldc:int(0))) {
                return:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(aconstnull:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7())
            }
            
            var_8_77 = and:int(var_8_77:int, ldc:int(708274666))
        }
    }
    
    public static \u56bd\u8413\u647c\u5bc4\ud158.\ud4fe\uf9c5\u5fe1\uc9f6\uafe7 \ubf56\ua562\ud51e\u3c25\u446c\u983f(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p6, int p7) {
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
            return:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(invokestatic:\ud4fe\uf9c5\u5fe1\uc9f6\uafe7(\u8c8a\ub83f\u16f6\ub102\u494c::\u6fb0\u74b1\ucef1\u52d3\ub171\u7049, p0:\uc7fe\u12cb\u1833\u67e9\u92ff, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int))
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
    
    public void \u7bad\u99f7\uc3e3\u97e6\u72f1\ub32d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63C : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_647 : int
        
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
        var_3_63C = and:int(ldc:int(117671054), ldc:int(-183767538))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8c8a\ub83f\u16f6\ub102\u494c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
            var_3_63C = and:int(var_3_63C:int, ldc:int(535766603))
            var_5_7D = and:int(ldc:int(9301), ldc:int(-9302))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16500), ldc:int(-16501)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63C:int, ldc:int(1296803259))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(9025), ldc:int(3237)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2825), ldc:int(1059)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63C = and:int(var_3_D2:int, ldc:int(-1648663093))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16460), ldc:int(16461)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1385804220))
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1065)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-697913562))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1295832999))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(202881969))
                    }
                    else {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-858013814))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1301154113))
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1199)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1547049696))
                        goto(Label_1065)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1455128657))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1545747142))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1098168863))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-649542095))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-132888314))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1484321713))
                        var_11_E3 = and:int(ldc:int(-10207), ldc:int(1886))
                        goto(Label_1472)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(845451586))
                        goto(Label_1065)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(908696012))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-976754219))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1986002366))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(933722554))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(2133777998))
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-375298152))
                        goto(Label_1065)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(981354268))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-2128206134))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(626122683))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1636667892))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(2137242954))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1548460183))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1065)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1712290140))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-2029789409))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(1856), ldc:int(1857))
                                goto(Label_1065)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-2012120701))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1939353512))
                        goto(Label_1199)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1374416980))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1020442244))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1275293561))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1867193903))
                        var_11_E3 = and:int(ldc:int(-14378), ldc:int(14345))
                    }
                    
                    Label_1065:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(294608825))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(487697878))
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(2078189280))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1742814186))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-329525937))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1896309204))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-2055773045))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1326)
                            }
                        }
                    }
                    
                    Label_1199:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-751635049))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(661296588))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1065)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-883853954))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-2123047318))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1740367322))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1472)
                    }
                    
                    Label_1326:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1565544519))
                        goto(Label_1065)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-327842408))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-871304987))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1817545978))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1698380131))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1208207076))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63C = and:int(var_3_63C:int, ldc:int(373544318))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1472:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_647 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1483:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1065)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1921641121))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(500236479))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(506279826))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-458038305))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1222693681))
                        var_17_647 = add:int(var_16_111:int, and:int(ldc:int(53), ldc:int(1)))
                        looporswitchbreak()
                    }
                    
                    var_3_63C = and:int(var_3_63C:int, ldc:int(1401546456))
                }
                
                var_3_63C = and:int(var_3_63C:int, ldc:int(506435387))
                
                if (cmple:boolean(var_5_7D = var_17_647:int, sub:int(var_6_84:int, and:int(ldc:int(14849), ldc:int(16389))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_63C = and:int(var_3_63C:int, ldc:int(1506558711))
            goto(Label_0106)
        }
    }
}
