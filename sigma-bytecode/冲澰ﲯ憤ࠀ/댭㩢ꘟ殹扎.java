public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\ub32d\u3a62\ua61f\u6bb9\u624e {
    public void \ub32d\u3a62\ua61f\u6bb9\u624e(int p0, java.util.Random p1, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p3) {
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
            invokespecial:\u1833\u8aa5\u6198\u416d\u8753(\u1833\u8aa5\u6198\u416d\u8753::<init>, this:\ub32d\u3a62\ua61f\u6bb9\u624e, getstatic:\uc87f\ud12e\u0b8e\u7049\u7e3f(\uc87f\ud12e\u0b8e\u7049\u7e3f::\u8350\ubff1\u7e3f\u4c04\u92ee\ubff1), p0:int)
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u93a2\u8bb0\u8aa5\u7e3f\u8d98\uc3e3, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p3:\u760c\u4975\u4179\uc246\u8640\u64f2)
            putfield:\u760c\u5fe1\u5db4\uc31c\u3711(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8709\u74b1\ub113\u0b8e\u927d\u7043, this:\ub32d\u3a62\ua61f\u6bb9\u624e, invokevirtual:\u760c\u5fe1\u5db4\uc31c\u3711(\u1833\u8aa5\u6198\u416d\u8753::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\u1833\u8aa5\u6198\u416d\u8753], p1:Random))
            putfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ub32d\u3a62\ua61f\u6bb9\u624e::\u5bc4\ub19c\u5654\u71ae\u64f2\u3776, this:\ub32d\u3a62\ua61f\u6bb9\u624e, p2:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            putfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\u62da\uc238\u8d90\u34df\ua3b4\u3d64, this:\ub32d\u3a62\ua61f\u6bb9\u624e, invokevirtual:boolean(Random::nextBoolean, p1:Random))
            putfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\ucfaf\u839e\uc31c\ub6ab\u4c2b\uff55, this:\ub32d\u3a62\ua61f\u6bb9\u624e, invokevirtual:boolean(Random::nextBoolean, p1:Random))
            putfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\u7873\u6cfe\u6198\uceb8\u8bb0\u69d9, this:\ub32d\u3a62\ua61f\u6bb9\u624e, invokevirtual:boolean(Random::nextBoolean, p1:Random))
            putfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\ub70c\u0a06\u6d69\u1187\uc3e3\u51fa, this:\ub32d\u3a62\ua61f\u6bb9\u624e, ternaryop:int[expected:boolean](cmple:boolean(invokevirtual:int(Random::nextInt, p1:Random, xor:int(ldc:int(-24317), ldc:int(-24320))), ldc:int(0)), and:int(ldc:int(19042), ldc:int(-23395)), and:int(ldc:int(2121), ldc:int(931))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub32d\u3a62\ua61f\u6bb9\u624e(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1) {
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
            invokespecial:\u1833\u8aa5\u6198\u416d\u8753(\u1833\u8aa5\u6198\u416d\u8753::<init>, this:\ub32d\u3a62\ua61f\u6bb9\u624e, getstatic:\uc87f\ud12e\u0b8e\u7049\u7e3f(\uc87f\ud12e\u0b8e\u7049\u7e3f::\u8350\ubff1\u7e3f\u4c04\u92ee\ubff1), p1:\uc31c\uc87f\uc246\u3776\ub7dc)
            putfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\u62da\uc238\u8d90\u34df\ua3b4\u3d64, this:\ub32d\u3a62\ua61f\u6bb9\u624e, invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u3711\u6c52\ud4fe\u3d64\u76bc, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub32d\u3a62\ua61f\u6bb9\u624e::\u52d3\u98a4\u600f\u527a\u624e\u3776), and:int(ldc:int(-1246), ldc:int(1181)))))
            putfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\ucfaf\u839e\uc31c\ub6ab\u4c2b\uff55, this:\ub32d\u3a62\ua61f\u6bb9\u624e, invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u3711\u6c52\ud4fe\u3d64\u76bc, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub32d\u3a62\ua61f\u6bb9\u624e::\u52d3\u98a4\u600f\u527a\u624e\u3776), xor:int(ldc:int(9240), ldc:int(9241)))))
            putfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\u7873\u6cfe\u6198\uceb8\u8bb0\u69d9, this:\ub32d\u3a62\ua61f\u6bb9\u624e, invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u3711\u6c52\ud4fe\u3d64\u76bc, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub32d\u3a62\ua61f\u6bb9\u624e::\u52d3\u98a4\u600f\u527a\u624e\u3776), and:int(ldc:int(18474), ldc:int(323)))))
            putfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\ub70c\u0a06\u6d69\u1187\uc3e3\u51fa, this:\ub32d\u3a62\ua61f\u6bb9\u624e, invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u3711\u6c52\ud4fe\u3d64\u76bc, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub32d\u3a62\ua61f\u6bb9\u624e::\u52d3\u98a4\u600f\u527a\u624e\u3776), and:int(ldc:int(2055), ldc:int(4851)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc84e\u3bc9\u92ee\ubf56\u120d\ubb2b(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
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
            invokespecial:void(\u1833\u8aa5\u6198\u416d\u8753::\uc84e\u3bc9\u92ee\ubf56\u120d\ubb2b, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\u1833\u8aa5\u6198\u416d\u8753], p0:\uc31c\uc87f\uc246\u3776\ub7dc)
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\uae87\u5654\u88c5\u5245\u7bad\u3776, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub32d\u3a62\ua61f\u6bb9\u624e::\u52d3\u98a4\u600f\u527a\u624e\u3776), and:int(ldc:int(-22334), ldc:int(5641))), getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\u62da\uc238\u8d90\u34df\ua3b4\u3d64, this:\ub32d\u3a62\ua61f\u6bb9\u624e))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\uae87\u5654\u88c5\u5245\u7bad\u3776, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub32d\u3a62\ua61f\u6bb9\u624e::\u52d3\u98a4\u600f\u527a\u624e\u3776), xor:int(ldc:int(-32752), ldc:int(-32751))), getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\ucfaf\u839e\uc31c\ub6ab\u4c2b\uff55, this:\ub32d\u3a62\ua61f\u6bb9\u624e))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\uae87\u5654\u88c5\u5245\u7bad\u3776, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub32d\u3a62\ua61f\u6bb9\u624e::\u52d3\u98a4\u600f\u527a\u624e\u3776), xor:int(ldc:int(17029), ldc:int(17031))), getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\u7873\u6cfe\u6198\uceb8\u8bb0\u69d9, this:\ub32d\u3a62\ua61f\u6bb9\u624e))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\uae87\u5654\u88c5\u5245\u7bad\u3776, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub32d\u3a62\ua61f\u6bb9\u624e::\u52d3\u98a4\u600f\u527a\u624e\u3776), and:int(ldc:int(3107), ldc:int(16463))), getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\ub70c\u0a06\u6d69\u1187\uc3e3\u51fa, this:\ub32d\u3a62\ua61f\u6bb9\u624e))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae5d\u5245\u4d85\u5d20\u3a62\uc3e3(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff p0, java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff> p1, java.util.Random p2) {
        var_4_61 : int
        var_6_6A : int
        var_7_73 : int
        var_8_79 : \u760c\u4975\u4179\uc246\u8640\u64f2
        
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
        var_4_61 = and:int(ldc:int(-382567600), ldc:int(-42241326))
        var_6_6A = xor:int(ldc:int(10402), ldc:int(10401))
        var_7_73 = and:int(ldc:int(93), ldc:int(16421))
        var_8_79 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc7fe\u12cb\u1833\u67e9\u92ff::\u7bad\u7873\u718f\u7e3f\u9937\ud158, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff])
        
        if (cmpne:boolean(var_8_79:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
            if (cmpne:boolean(var_8_79:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                goto(Label_0209)
            }
        }
        
        Label_0131:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0412)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0356)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0290)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32768)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-1709966027))
        }
        else {
            var_4_61 = and:int(var_4_61:int, ldc:int(-75071529))
            var_6_6A = sub:int(ldc:int(8), var_6_6A:int)
            var_7_73 = sub:int(ldc:int(8), var_7_73:int)
        }
        
        Label_0209:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0412)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0356)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(536870912)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(935990081))
                goto(Label_0131)
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(-281854352))
            invokevirtual:\uc7fe\u12cb\u1833\u67e9\u92ff(\u1833\u8aa5\u6198\u416d\u8753::\ubcb0\u93a2\ud7e8\ua068\u71ae\ud4fe, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\u1833\u8aa5\u6198\u416d\u8753], checkcast:\uc2bd\u6cfe\u8aa5\u3bd6\u7330(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\uc2bd\u6cfe\u8aa5\u3bd6\u7330.class, p0:\uc7fe\u12cb\u1833\u67e9\u92ff[expected:\uc2bd\u6cfe\u8aa5\u3bd6\u7330]), p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, and:int(ldc:int(5), ldc:int(863)), xor:int(ldc:int(4146), ldc:int(4147)))
            
            if (getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\u62da\uc238\u8d90\u34df\ua3b4\u3d64, this:\ub32d\u3a62\ua61f\u6bb9\u624e)) {
                invokevirtual:\uc7fe\u12cb\u1833\u67e9\u92ff(\u1833\u8aa5\u6198\u416d\u8753::\ud217\u7c6b\u6c52\u4cd9\u4179\u4f52, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\u1833\u8aa5\u6198\u416d\u8753], checkcast:\uc2bd\u6cfe\u8aa5\u3bd6\u7330(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\uc2bd\u6cfe\u8aa5\u3bd6\u7330.class, p0:\uc7fe\u12cb\u1833\u67e9\u92ff[expected:\uc2bd\u6cfe\u8aa5\u3bd6\u7330]), p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, var_6_6A:int, xor:int(ldc:int(773), ldc:int(772)))
            }
        }
        
        Label_0290:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(779598436))
            goto(Label_0412)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(131072)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1488077124))
                goto(Label_0209)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0131)
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(-276860324))
            
            if (getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\ucfaf\u839e\uc31c\ub6ab\u4c2b\uff55, this:\ub32d\u3a62\ua61f\u6bb9\u624e)) {
                invokevirtual:\uc7fe\u12cb\u1833\u67e9\u92ff(\u1833\u8aa5\u6198\u416d\u8753::\ud217\u7c6b\u6c52\u4cd9\u4179\u4f52, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\u1833\u8aa5\u6198\u416d\u8753], checkcast:\uc2bd\u6cfe\u8aa5\u3bd6\u7330(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\uc2bd\u6cfe\u8aa5\u3bd6\u7330.class, p0:\uc7fe\u12cb\u1833\u67e9\u92ff[expected:\uc2bd\u6cfe\u8aa5\u3bd6\u7330]), p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, var_7_73:int, ldc:int(7))
            }
        }
        
        Label_0356:
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-948495829))
                goto(Label_0290)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0209)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0131)
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(-41192875))
            
            if (getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\u7873\u6cfe\u6198\uceb8\u8bb0\u69d9, this:\ub32d\u3a62\ua61f\u6bb9\u624e)) {
                invokevirtual:\uc7fe\u12cb\u1833\u67e9\u92ff(\u1833\u8aa5\u6198\u416d\u8753::\u9937\u3776\ubb2b\u494c\u392e\ud36e, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\u1833\u8aa5\u6198\u416d\u8753], checkcast:\uc2bd\u6cfe\u8aa5\u3bd6\u7330(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\uc2bd\u6cfe\u8aa5\u3bd6\u7330.class, p0:\uc7fe\u12cb\u1833\u67e9\u92ff[expected:\uc2bd\u6cfe\u8aa5\u3bd6\u7330]), p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, var_6_6A:int, xor:int(ldc:int(17456), ldc:int(17457)))
            }
        }
        
        Label_0412:
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0356)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0290)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0209)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(2)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-598805063))
            goto(Label_0131)
        }
        
        if (getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\ub70c\u0a06\u6d69\u1187\uc3e3\u51fa, this:\ub32d\u3a62\ua61f\u6bb9\u624e)) {
            invokevirtual:\uc7fe\u12cb\u1833\u67e9\u92ff(\u1833\u8aa5\u6198\u416d\u8753::\u9937\u3776\ubb2b\u494c\u392e\ud36e, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\u1833\u8aa5\u6198\u416d\u8753], checkcast:\uc2bd\u6cfe\u8aa5\u3bd6\u7330(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\uc2bd\u6cfe\u8aa5\u3bd6\u7330.class, p0:\uc7fe\u12cb\u1833\u67e9\u92ff[expected:\uc2bd\u6cfe\u8aa5\u3bd6\u7330]), p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, var_7_73:int, ldc:int(7))
        }
    }
    
    public static \u51b2\u6fb0\ufcaf\u61a4\u0800.\ub32d\u3a62\ua61f\u6bb9\u624e \u7e3f\ub32d\ud36e\ud51e\u8640\ube23(java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff> p0, java.util.Random p1, int p2, int p3, int p4, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p5, int p6) {
        var_9_7D : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        
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
            var_9_7D = invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u98a4\u9937\u62da\u4e72\ua61f\u392e, p2:int, p3:int, p4:int, ldc:int(-4), ldc:int(-3), and:int(ldc:int(3019), ldc:int(-11232)), ldc:int(10), ldc:int(9), ldc:int(11), p5:\u760c\u4975\u4179\uc246\u8640\u64f2)
            return:\ub32d\u3a62\ua61f\u6bb9\u624e(ternaryop:\ub32d\u3a62\ua61f\u6bb9\u624e(logicaland:boolean(invokestatic:boolean(\u1833\u8aa5\u6198\u416d\u8753::\u392e\u4cd9\u8df4\u624e\u51b2\u69d9, var_9_7D:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), cmpeq:boolean(invokestatic:\uc7fe\u12cb\u1833\u67e9\u92ff(\uc7fe\u12cb\u1833\u67e9\u92ff::\u71ae\uc4d2\u4f4a\u647c\u8cae\u3e75, p0:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, var_9_7D:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), aconstnull:\uc7fe\u12cb\u1833\u67e9\u92ff())), initobject:\ub32d\u3a62\ua61f\u6bb9\u624e(\ub32d\u3a62\ua61f\u6bb9\u624e::<init>, p6:int, p1:Random, var_9_7D:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p5:\u760c\u4975\u4179\uc246\u8640\u64f2), aconstnull:\ub32d\u3a62\ua61f\u6bb9\u624e()))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u69d9\u5db4\ubded\ubb2b\u0c95\u5140(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8753\u4975\ubf56\u6b0d\u7e3f p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p2, java.util.Random p3, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p4, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p5, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p6) {
        var_8_61 : int
        
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
            var_8_61 = and:int(ldc:int(1464242575), ldc:int(1422391627))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\uc29a\u156b\u7e3f\ubcb0\uc238\u99f7, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, and:int(ldc:int(-29038), ldc:int(28749)), and:int(ldc:int(-28825), ldc:int(28824)), and:int(ldc:int(-15766), ldc:int(9493)), ldc:int(9), ldc:int(8), ldc:int(10), and:int[expected:boolean](ldc:int(1105), ldc:int(137)), p3:Random, invokestatic:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b[expected:\u97e6\u8753\u4179\ub1b9\u1833](\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u7af6\u8350\u5db4\u836c\u4c04\uc3e3))
            invokevirtual:void(\u1833\u8aa5\u6198\u416d\u8753::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\u1833\u8aa5\u6198\u416d\u8753], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p3:Random, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, getfield:\u760c\u5fe1\u5db4\uc31c\u3711(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8709\u74b1\ub113\u0b8e\u927d\u7043, this:\ub32d\u3a62\ua61f\u6bb9\u624e), xor:int(ldc:int(12864), ldc:int(12868)), xor:int(ldc:int(-12270), ldc:int(-12271)), and:int(ldc:int(2179), ldc:int(-2180)))
            
            if (getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\u62da\uc238\u8d90\u34df\ua3b4\u3d64, this:\ub32d\u3a62\ua61f\u6bb9\u624e)) {
                invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, and:int(ldc:int(-13597), ldc:int(13572)), and:int(ldc:int(6167), ldc:int(8203)), and:int(ldc:int(12801), ldc:int(1065)), and:int(ldc:int(-6369), ldc:int(6368)), and:int(ldc:int(12309), ldc:int(1031)), xor:int(ldc:int(1152), ldc:int(1155)), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8df4\u759a\u3bd6\uc31c\uc238\u6bb9), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8df4\u759a\u3bd6\uc31c\uc238\u6bb9), and:int[expected:boolean](ldc:int(-23381), ldc:int(19284)))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_8_61:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0256)
                }
                
                if (cmpeq:boolean(and:int(var_8_61:int, ldc:int(134217728)), ldc:int(0))) {
                    var_8_61 = and:int(var_8_61:int, ldc:int(-137405585))
                    
                    if (getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\u7873\u6cfe\u6198\uceb8\u8bb0\u69d9, this:\ub32d\u3a62\ua61f\u6bb9\u624e)) {
                        invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, ldc:int(9), xor:int(ldc:int(18442), ldc:int(18441)), xor:int(ldc:int(-8190), ldc:int(-8189)), ldc:int(9), and:int(ldc:int(13207), ldc:int(69)), and:int(ldc:int(26755), ldc:int(103)), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8df4\u759a\u3bd6\uc31c\uc238\u6bb9), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8df4\u759a\u3bd6\uc31c\uc238\u6bb9), and:int[expected:boolean](ldc:int(2652), ldc:int(-2653)))
                    }
                }
                
                Label_0216:
                
                if (cmpeq:boolean(and:int(var_8_61:int, ldc:int(2)), ldc:int(0))) {
                    var_8_61 = and:int(var_8_61:int, ldc:int(-1718796303))
                }
                else {
                    if (cmpne:boolean(and:int(var_8_61:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_8_61 = and:int(var_8_61:int, ldc:int(1498641023))
                    
                    if (getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\ucfaf\u839e\uc31c\ub6ab\u4c2b\uff55, this:\ub32d\u3a62\ua61f\u6bb9\u624e)) {
                        invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, and:int(ldc:int(23920), ldc:int(-23923)), and:int(ldc:int(4869), ldc:int(16581)), ldc:int(7), and:int(ldc:int(-25942), ldc:int(25941)), ldc:int(7), ldc:int(9), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8df4\u759a\u3bd6\uc31c\uc238\u6bb9), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8df4\u759a\u3bd6\uc31c\uc238\u6bb9), and:int[expected:boolean](ldc:int(-14869), ldc:int(10772)))
                    }
                }
                
                Label_0256:
                
                if (cmpne:boolean(and:int(var_8_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpne:boolean(and:int(var_8_61:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (getfield:boolean(\ub32d\u3a62\ua61f\u6bb9\u624e::\ub70c\u0a06\u6d69\u1187\uc3e3\u51fa, this:\ub32d\u3a62\ua61f\u6bb9\u624e)) {
                invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, ldc:int(9), xor:int(ldc:int(4361), ldc:int(4364)), ldc:int(7), ldc:int(9), ldc:int(7), ldc:int(9), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8df4\u759a\u3bd6\uc31c\uc238\u6bb9), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8df4\u759a\u3bd6\uc31c\uc238\u6bb9), and:int[expected:boolean](ldc:int(-8061), ldc:int(6748)))
            }
            
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, xor:int(ldc:int(8209), ldc:int(8212)), and:int(ldc:int(549), ldc:int(28681)), ldc:int(10), ldc:int(7), xor:int(ldc:int(21520), ldc:int(21523)), ldc:int(10), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8df4\u759a\u3bd6\uc31c\uc238\u6bb9), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub32d\u3a62\ua61f\u6bb9\u624e::\u8df4\u759a\u3bd6\uc31c\uc238\u6bb9), and:int[expected:boolean](ldc:int(19392), ldc:int(-19393)))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\uc29a\u156b\u7e3f\ubcb0\uc238\u99f7, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, and:int(ldc:int(8201), ldc:int(16913)), xor:int(ldc:int(1797), ldc:int(1799)), xor:int(ldc:int(-32472), ldc:int(-32471)), ldc:int(8), and:int(ldc:int(4106), ldc:int(146)), ldc:int(6), and:int[expected:boolean](ldc:int(-8344), ldc:int(8343)), p3:Random, invokestatic:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b[expected:\u97e6\u8753\u4179\ub1b9\u1833](\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u7af6\u8350\u5db4\u836c\u4c04\uc3e3))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\uc29a\u156b\u7e3f\ubcb0\uc238\u99f7, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, xor:int(ldc:int(-32190), ldc:int(-32186)), xor:int(ldc:int(2061), ldc:int(2060)), and:int(ldc:int(4869), ldc:int(16591)), xor:int(ldc:int(1546), ldc:int(1550)), xor:int(ldc:int(4100), ldc:int(4096)), ldc:int(9), and:int[expected:boolean](ldc:int(29329), ldc:int(-29330)), p3:Random, invokestatic:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b[expected:\u97e6\u8753\u4179\ub1b9\u1833](\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u7af6\u8350\u5db4\u836c\u4c04\uc3e3))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\uc29a\u156b\u7e3f\ubcb0\uc238\u99f7, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, ldc:int(8), and:int(ldc:int(10761), ldc:int(17411)), xor:int(ldc:int(8593), ldc:int(8596)), ldc:int(8), and:int(ldc:int(4236), ldc:int(24596)), ldc:int(9), and:int[expected:boolean](ldc:int(20675), ldc:int(-20708)), p3:Random, invokestatic:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b[expected:\u97e6\u8753\u4179\ub1b9\u1833](\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u7af6\u8350\u5db4\u836c\u4c04\uc3e3))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\uc29a\u156b\u7e3f\ubcb0\uc238\u99f7, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, xor:int(ldc:int(16453), ldc:int(16452)), and:int(ldc:int(18532), ldc:int(519)), ldc:int(7), xor:int(ldc:int(3458), ldc:int(3457)), and:int(ldc:int(7188), ldc:int(45)), ldc:int(9), and:int[expected:boolean](ldc:int(6310), ldc:int(-14567)), p3:Random, invokestatic:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b[expected:\u97e6\u8753\u4179\ub1b9\u1833](\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u7af6\u8350\u5db4\u836c\u4c04\uc3e3))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\uc29a\u156b\u7e3f\ubcb0\uc238\u99f7, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, and:int(ldc:int(4167), ldc:int(137)), and:int(ldc:int(12295), ldc:int(795)), and:int(ldc:int(1029), ldc:int(4749)), and:int(ldc:int(2211), ldc:int(8535)), and:int(ldc:int(16579), ldc:int(1047)), ldc:int(6), and:int[expected:boolean](ldc:int(18617), ldc:int(-18618)), p3:Random, invokestatic:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b[expected:\u97e6\u8753\u4179\ub1b9\u1833](\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u7af6\u8350\u5db4\u836c\u4c04\uc3e3))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, xor:int(ldc:int(-24000), ldc:int(-23999)), xor:int(ldc:int(722), ldc:int(721)), xor:int(ldc:int(-32766), ldc:int(-32762)), xor:int(ldc:int(8202), ldc:int(8201)), and:int(ldc:int(2035), ldc:int(24579)), and:int(ldc:int(16654), ldc:int(52)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), and:int[expected:boolean](ldc:int(-9071), ldc:int(9038)))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, and:int(ldc:int(16931), ldc:int(1281)), xor:int(ldc:int(4134), ldc:int(4130)), ldc:int(6), xor:int(ldc:int(-32749), ldc:int(-32752)), xor:int(ldc:int(-32749), ldc:int(-32745)), ldc:int(6), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), and:int[expected:boolean](ldc:int(12307), ldc:int(-12852)))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\uc29a\u156b\u7e3f\ubcb0\uc238\u99f7, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, xor:int(ldc:int(5265), ldc:int(5268)), and:int(ldc:int(16833), ldc:int(9753)), ldc:int(7), ldc:int(7), xor:int(ldc:int(1065), ldc:int(1064)), ldc:int(8), and:int[expected:boolean](ldc:int(575), ldc:int(-576)), p3:Random, invokestatic:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b[expected:\u97e6\u8753\u4179\ub1b9\u1833](\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u7af6\u8350\u5db4\u836c\u4c04\uc3e3))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, xor:int(ldc:int(1), ldc:int(4)), and:int(ldc:int(9), ldc:int(29953)), ldc:int(9), ldc:int(7), xor:int(ldc:int(8448), ldc:int(8449)), ldc:int(9), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), and:int[expected:boolean](ldc:int(-23385), ldc:int(19272)))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, and:int(ldc:int(565), ldc:int(4293)), xor:int(ldc:int(4124), ldc:int(4126)), ldc:int(7), ldc:int(7), and:int(ldc:int(1027), ldc:int(8266)), ldc:int(7), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), and:int[expected:boolean](ldc:int(-31726), ldc:int(23204)))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, and:int(ldc:int(1213), ldc:int(16644)), xor:int(ldc:int(20483), ldc:int(20486)), ldc:int(7), xor:int(ldc:int(3), ldc:int(7)), xor:int(ldc:int(19587), ldc:int(19590)), ldc:int(9), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), and:int[expected:boolean](ldc:int(2249), ldc:int(-2270)))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, ldc:int(8), and:int(ldc:int(1285), ldc:int(4645)), ldc:int(7), ldc:int(8), and:int(ldc:int(1133), ldc:int(12293)), ldc:int(9), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), and:int[expected:boolean](ldc:int(-6002), ldc:int(4961)))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\u0800\u3e75\uc84e\uc2bd\u99f7\u3bd6, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, xor:int(ldc:int(519), ldc:int(514)), and:int(ldc:int(789), ldc:int(12295)), ldc:int(7), ldc:int(7), xor:int(ldc:int(24640), ldc:int(24645)), ldc:int(9), checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u9255\u5f50\u74b1\u6b5f\u0800\u4975>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u9255\u5f50\u74b1\u6b5f\u0800\u4975>](\u3d64\ubf56\u3dd3\ua3b4\uc229\u7af6::\u4c2b\u4492\u3d4b\uc246\u624e\u6198), getstatic:\u9255\u5f50\u74b1\u6b5f\u0800\u4975(\u9255\u5f50\u74b1\u6b5f\u0800\u4975::\ubcb0\u6b5f\u71ae\u3bc9\uae87\uf9c5))), checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u9255\u5f50\u74b1\u6b5f\u0800\u4975>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u9255\u5f50\u74b1\u6b5f\u0800\u4975>](\u3d64\ubf56\u3dd3\ua3b4\uc229\u7af6::\u4c2b\u4492\u3d4b\uc246\u624e\u6198), getstatic:\u9255\u5f50\u74b1\u6b5f\u0800\u4975(\u9255\u5f50\u74b1\u6b5f\u0800\u4975::\ubcb0\u6b5f\u71ae\u3bc9\uae87\uf9c5))), and:int[expected:boolean](ldc:int(12484), ldc:int(-30405)))
            invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\uc2e8\ub6ab\u51b2\ubf56\u9033\uc84e, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\uc7fe\u12cb\u1833\u67e9\u92ff], p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u4cd9\ud171\u61a4\u6198\u3d4b\u9af2)), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u74b1\u16f6\u071d\ubf56\u965f\u51fa::\u960f\ud36e\uc246\u0800\uf995\u67d0), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))), ldc:int(6), and:int(ldc:int(16519), ldc:int(8197)), ldc:int(6), p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            return:boolean(and:int[expected:boolean](ldc:int(809), ldc:int(12293)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_28D : int
        expr_6E : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_114_0 : byte[] [generated]
        stack_149_0 : byte[] [generated]
        stack_1FE_0 : byte[] [generated]
        stack_239_0 : byte[] [generated]
        stack_2A0_0 : byte[] [generated]
        stack_31C_0 : byte[] [generated]
        var_4_1E0 : int
        var_3_1E5 : byte[]
        var_5_1E6 : int
        var_0_2B9 : int
        expr_2A0 : byte [generated]
        stack_2E7_2 : byte [generated]
        stack_2BC_0 : byte [generated]
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_227 : byte[]
        var_5_228 : int
        expr_DE : int [generated]
        expr_114 : int [generated]
        var_3_30A : byte[]
        var_5_30B : int
        expr_31F : byte [generated]
        var_3_155 : String
        stack_1D9_0 : String[] [generated]
        expr_167 : String[] [generated]
        
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
        var_0_28D = and:int(ldc:int(1289185793), ldc:int(-300259850))
        expr_6E = arraylength:int(stack_A3_0 = stack_A5_0 = stack_DC_0 = stack_DE_0 = stack_112_0 = stack_114_0 = stack_149_0 = stack_1FE_0 = stack_239_0 = stack_2A0_0 = stack_31C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("rpe6t8fPrK6qkbmdrtO6yauZrLfBu6urubeTq58HGvL7")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1E0 = expr_6E:int
        var_3_1E5 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1E6 = expr_6E:int
        Label_0488:
        
        while (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(2)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(-38485858))
            var_5_1E6 = add:int(var_5_1E6:int, ldc:int(-1))
            storeelement:byte(var_3_1E5:byte[], var_5_1E6:int, add:byte(loadelement:byte(stack_1FE_0:byte[], var_5_1E6:int), ldc:byte(85)))
            
            if (cmpne:boolean(var_5_1E6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DC_0 = stack_DE_0 = stack_112_0 = stack_114_0 = stack_149_0 = stack_1FE_0 = stack_239_0 = stack_2A0_0 = stack_31C_0 = var_3_1E5:byte[]
            goto(Label_0115)
        }
        
        Label_0640:
        
        while (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(1024)), ldc:int(0))) {
            var_0_2B9 = and:int(var_0_28D:int, ldc:int(-1722487956))
            var_5_1E6 = add:int(var_5_1E6:int, ldc:int(-1))
            expr_2A0 = stack_2E7_2 = loadelement(stack_2A0_0, var_5_1E6)
            
            if (cmplt:boolean(add:int(add:int(var_5_1E6:int, ldc:int(4)), neg:int(var_4_1E0:int)), ldc:int(0))) {
                stack_2E7_2 = stack_2BC_0 = add:byte(expr_2A0:byte, loadelement:byte(var_3_1E5:byte[], add:int(var_5_1E6:int, ldc:int(4))))
                goto(Label_0716)
            }
            
            Label_0685:
            
            if (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(2)), ldc:int(0))) {
                var_0_2B9 = and:int(var_0_2B9:int, ldc:int(1518041932))
                stack_2E7_2 = stack_2BC_0 = add:byte(expr_2A0:byte, ldc:byte(4))
            }
            
            Label_0716:
            
            if (cmpne:boolean(and:int(var_0_2B9:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_2B9 = and:int(var_0_2B9:int, ldc:int(1913565910))
                goto(Label_0685)
            }
            
            var_0_28D = and:int(var_0_2B9:int, ldc:int(-1634380044))
            storeelement:byte(var_3_1E5:byte[], var_5_1E6:int, stack_2E7_2:byte)
            
            if (cmpne:boolean(var_5_1E6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DC_0 = stack_DE_0 = stack_112_0 = stack_114_0 = stack_149_0 = stack_1FE_0 = stack_239_0 = stack_2A0_0 = stack_31C_0 = var_3_1E5:byte[]
            goto(Label_0227)
        }
        
        var_0_28D = and:int(var_0_28D:int, ldc:int(-859770713))
        goto(Label_0488)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(64)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(1286444861))
            goto(Label_0281)
        }
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(128)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(-665640276))
            goto(Label_0227)
        }
        
        if (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(256)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(-1090521063))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_227 = newarray:byte[](byte.class, expr_A7:int)
                var_5_228 = expr_A7:int
                
                loop {
                    var_0_28D = and:int(var_0_28D:int, ldc:int(-594513649))
                    var_5_228 = add:int(var_5_228:int, ldc:int(-1))
                    storeelement:byte(var_3_227:byte[], var_5_228:int, add:int(shl:int(loadelement:byte(stack_239_0:byte[], var_5_228:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_228:int, xor:int(ldc:int(8833), ldc:int(8832)))), ldc:int(4)), xor:int(ldc:int(12551), ldc:int(12552)))))
                    
                    if (cmpne:boolean(var_5_228:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DC_0 = stack_DE_0 = stack_112_0 = stack_114_0 = stack_149_0 = stack_1FE_0 = stack_239_0 = stack_2A0_0 = stack_31C_0 = var_3_227:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(2)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(220485980))
            goto(Label_0281)
        }
        
        if (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(32)), ldc:int(0))) {
                var_0_28D = and:int(var_0_28D:int, ldc:int(-1799553925))
                goto(Label_0115)
            }
            
            var_0_28D = and:int(var_0_28D:int, ldc:int(-870716473))
            expr_DE = arraylength:int(stack_DE_0:byte[])
            
            if (cmpne:boolean(expr_DE:int, ldc:int(0))) {
                var_4_1E0 = expr_DE:int
                var_3_1E5 = newarray:byte[](byte.class, expr_DE:int)
                var_5_1E6 = expr_DE:int
                goto(Label_0640)
            }
        }
        
        Label_0227:
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(524288)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(1199970426))
        }
        else {
            if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_28D = and:int(var_0_28D:int, ldc:int(570390059))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_28D = and:int(var_0_28D:int, ldc:int(1608013564))
            expr_114 = arraylength:int(stack_114_0:byte[])
            
            if (cmpne:boolean(expr_114:int, ldc:int(0))) {
                var_3_30A = newarray:byte[](byte.class, expr_114:int)
                var_5_30B = expr_114:int
                
                loop {
                    var_0_28D = and:int(var_0_28D:int, ldc:int(-72161682))
                    var_5_30B = add:int(var_5_30B:int, ldc:int(-1))
                    expr_31F = xor:byte(loadelement:byte(stack_31C_0:byte[], var_5_30B:int), ldc:byte(14))
                    storeelement:byte(var_3_30A:byte[], var_5_30B:int, or:int(and:int(shl:int(expr_31F:byte, and:int(ldc:int(17412), ldc:int(132))), ldc:int(-16)), and:int(shr:int(expr_31F:byte[expected:int], xor:int(ldc:int(2049), ldc:int(2053))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_30B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DC_0 = stack_DE_0 = stack_112_0 = stack_114_0 = stack_149_0 = stack_1FE_0 = stack_239_0 = stack_2A0_0 = stack_31C_0 = var_3_30A:byte[]
            }
        }
        
        Label_0281:
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(1816803938))
            goto(Label_0227)
        }
        
        if (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(64)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(1165289660))
            goto(Label_0115)
        }
        
        var_3_155 = initobject:String(String::<init>, stack_149_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1D9_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16419), ldc:int(16423)))
        expr_167 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3182), ldc:int(4884)))
        storeelement:String(expr_167:String[], and:int(ldc:int(31241), ldc:int(1123)), invokevirtual:String[expected:String](String::substring, var_3_155:String, and:int(ldc:int(6784), ldc:int(-6785)), and:int(ldc:int(8970), ldc:int(21548))))
        storeelement:String(expr_167:String[], and:int(ldc:int(-2835), ldc:int(2834)), invokevirtual:String[expected:String](String::substring, var_3_155:String, and:int(ldc:int(2408), ldc:int(5641)), xor:int(ldc:int(-31743), ldc:int(-31730))))
        storeelement:String(expr_167:String[], xor:int(ldc:int(14), ldc:int(13)), invokevirtual:String[expected:String](String::substring, var_3_155:String, and:int(ldc:int(16479), ldc:int(303)), and:int(ldc:int(8217), ldc:int(16920))))
        storeelement:String(expr_167:String[], and:int(ldc:int(190), ldc:int(2)), invokevirtual:String[expected:String](String::substring, var_3_155:String, xor:int(ldc:int(20502), ldc:int(20494)), xor:int(ldc:int(3123), ldc:int(3091))))
        putstatic:String[](\ub32d\u3a62\ua61f\u6bb9\u624e::\u52d3\u98a4\u600f\u527a\u624e\u3776, expr_167:String[])
    }
    
    public void \u120d\u3d4b\u4c04\ua6bd\u40a9\ub6ab(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_677 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_682 : int
        
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
        var_3_677 = and:int(ldc:int(-1799745634), ldc:int(-1501563715))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
            var_3_677 = and:int(var_3_677:int, ldc:int(775371615))
        }
        else {
            var_3_677 = and:int(var_3_677:int, ldc:int(-1252243802))
            var_5_8A = and:int(ldc:int(24624), ldc:int(-24625))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1690), ldc:int(-1691)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_677:int, ldc:int(-1531870050))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(10308), ldc:int(10309)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(554), ldc:int(555)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_677 = and:int(var_3_E3:int, ldc:int(-945904756))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(16410), ldc:int(16411)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1577192026))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(128)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-531539055))
                        goto(Label_0571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(399827485))
                    }
                    else {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1351114329))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0571)
                            }
                            
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(128)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-120555741))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(709500726))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1277135246))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1680697774))
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-719465026))
                            var_11_F4 = and:int(ldc:int(20012), ldc:int(-20016))
                            goto(Label_1552)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0571:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1386198368))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(606352793))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1065146428))
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(128)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(65476989))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(314492132))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-2039744093))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-420396363))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0709:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(467030346))
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(4)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-2103690473))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(4)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1196299953))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(897293941))
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(4)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1645897862))
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1253028715))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0848:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1461018174))
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(4)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1287521977))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(575583106))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-948152734))
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1623215753))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(219772073))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1898271521))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(257), ldc:int(135))
                                goto(Label_1150)
                            }
                        }
                    }
                    
                    Label_0987:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(327658552))
                        goto(Label_1563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-452128448))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-629097532))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-181870647))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-1870265751))
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1629757003))
                        var_11_F4 = and:int(ldc:int(4177), ldc:int(-4178))
                    }
                    
                    Label_1150:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1558307146))
                        goto(Label_1563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(4)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1548073723))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0987)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-409146439))
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-2097370716))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-757945618))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-638501232))
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-34528091))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1427)
                            }
                        }
                    }
                    
                    Label_1289:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-132321002))
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(128)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-233298227))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1150)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-1521132255))
                            goto(Label_0987)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(128)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(2044777971))
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(580569434))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-31994667))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1552)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1427:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(64)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1680923741))
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1985206558))
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1589048067))
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_677 = and:int(var_3_677:int, ldc:int(-966854978))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1552:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_682 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1563:
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1196698649))
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-2049769273))
                        var_17_682 = add:int(var_16_122:int, and:int(ldc:int(29), ldc:int(31747)))
                        looporswitchbreak()
                    }
                    
                    var_3_677 = and:int(var_3_677:int, ldc:int(1538264837))
                }
                
                var_3_677 = and:int(var_3_677:int, ldc:int(-146820202))
                
                if (cmple:boolean(var_5_8A = var_17_682:int, sub:int(var_6_91:int, xor:int(ldc:int(24720), ldc:int(24721))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(65536)), ldc:int(0))) {
            var_3_677 = and:int(var_3_677:int, ldc:int(1506303995))
            goto(Label_0108)
        }
    }
}
