public class \u59ec\u8413\u97e6\uc229\u3776.\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4 {
    public void \ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u47c2\ubded\u12cb\u3dd3\u12cb\u0800 p0) {
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
            invokespecial:\u6ec6\u7af6\ub171\u67d0\ub83f\uc31c(\u6ec6\u7af6\ub171\u67d0\ub83f\uc31c::<init>, this:\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4, p0:\u47c2\ubded\u12cb\u3dd3\u12cb\u0800)
            invokevirtual:void(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u36d3\u624e\u4c2b\u56bd\u385b\u4c2b, this:\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a], checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u5654\ub83f\u71f1\u7bad\ub1b9\u6b5f, getfield:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\ufcaf\ub7dc\u16f6\u12b2\u4d85\ubff1, this:\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4))), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u6b5f\u9937\u5f50\u516c\ub32d\uceb8(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p1) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b)))))))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \ub19c\u6ec6\u8640\uc2e8\u3bd6\ucef1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5 p1) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\u8640\u8413\u7ce1\u7049\u9937\u40a9, p1:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b)))))))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 \u6b5f\u5fe1\ua3b4\u873d\u71ae\ub113(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u494c\u4975\ua068\u0c95\uc84e.\ucfaf\u9255\u839e\u8258\uc31c\u983f p3) {
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
        
        switch (loadelement:int(getstatic:int[](\uc29a\u3a62\u3d4b\u62da\u52d3\uff55::\uae5d\u3776\uafe7\u8413\u4975\u8640), invokevirtual:int(Enum<E>::ordinal, invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2[expected:Enum<\u6c52\u156b\u4179\u5654\uceb8\u9af2>](\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b))))))) {
            default:
                return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u516c\u7006\u88c5\ucef1\u3711\u64f2))
            
            case 2:
                return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u8389\ucef1\u759a\u5f50\uf94d\uceb8))
            
            case 3:
                return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u120d\ucfaf\u6b5f\ua6bd\u9937\u3504))
        }
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u983f\u3504\uc29a\ub113\uc238\u5fe1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2 p0) {
        var_2_5F : int
        var_4_64 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_5_79 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        stack_CA_0 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d [generated]
        
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
            var_2_5F = and:int(ldc:int(-249357713), ldc:int(1941925625))
            var_4_64 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f::\u3c25\u34df\u1187\u385b\u1833\u8413, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2[expected:\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f])
            var_5_79 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, invokevirtual:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f::\uae5d\ud171\u6b5f\u8753\u8753\u5db4, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2[expected:\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f]), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2::\u3d64\u67e9\u5245\u4daf\u8d90\uafe7, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u759a\u4bc8\u873d\ud171\ub32d\u7873, var_4_64:\u760c\u4975\u4179\uc246\u8640\u64f2)))
            
            if (logicaland:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_5_79:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a]), cmpeq:boolean(invokevirtual:Comparable(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_5_79:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>, getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b)), var_4_64:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Comparable]))) {
                stack_CA_0 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, this:\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a]), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u759a\u4bc8\u873d\ud171\ub32d\u7873, var_4_64:\u760c\u4975\u4179\uc246\u8640\u64f2)))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(2075397487))
                stack_CA_0 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, this:\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a]), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b), var_4_64:\u760c\u4975\u4179\uc246\u8640\u64f2))
            }
            
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(stack_CA_0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u156b\ud12e\ubff1\u3711\u74b1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, java.util.Random p3) {
        var_7_6D : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_8_82 : double
        var_10_97 : double
        var_12_AC : double
        var_14_C0 : double
        
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
            var_7_6D = checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b)))
            var_8_82 = sub:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.55)), f2d:double(mul:float(invokevirtual:float(Random::nextFloat, p3:Random), ldc:float(0.1f))))
            var_10_97 = sub:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.55)), f2d:double(mul:float(invokevirtual:float(Random::nextFloat, p3:Random), ldc:float(0.1f))))
            var_12_AC = sub:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.55)), f2d:double(mul:float(invokevirtual:float(Random::nextFloat, p3:Random), ldc:float(0.1f))))
            var_14_C0 = f2d:double(sub:float(ldc:float(0.4f), mul:float(add:float(invokevirtual:float(Random::nextFloat, p3:Random), invokevirtual:float(Random::nextFloat, p3:Random)), ldc:float(0.4f))))
            
            if (cmpeq:boolean(invokevirtual:int(Random::nextInt, p3:Random, and:int(ldc:int(16711), ldc:int(9253))), ldc:int(0))) {
                invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\uc4d2\u34df\u71f1\u4ab3\u8753\u5245), add:double(var_8_82:double, mul:double(i2d:double(invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_7_6D:\u760c\u4975\u4179\uc246\u8640\u64f2)), var_14_C0:double)), add:double(var_10_97:double, mul:double(i2d:double(invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u64f2\u0c95\u3d64\u2dcc\uc84e\uc4d2, var_7_6D:\u760c\u4975\u4179\uc246\u8640\u64f2)), var_14_C0:double)), add:double(var_12_AC:double, mul:double(i2d:double(invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_7_6D:\u760c\u4975\u4179\uc246\u8640\u64f2)), var_14_C0:double)), mul:double(invokevirtual:double(Random::nextGaussian, p3:Random), ldc:double(0.005)), mul:double(invokevirtual:double(Random::nextGaussian, p3:Random), ldc:double(0.005)), mul:double(invokevirtual:double(Random::nextGaussian, p3:Random), ldc:double(0.005)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u69d9\u8640\u12cb\ua068\u7ce1\u61a4(\u71f1\uc910\u3bc9\u516c\u93a2.\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p0) {
        expr_68 : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[] [generated]
        
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
            expr_68 = newarray:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[](\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d.class, xor:int(ldc:int(-30720), ldc:int(-30719)))
            storeelement:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(expr_68:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[], and:int(ldc:int(26736), ldc:int(-26867)), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d](\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u62da\u4daf\uc31c\ufcaf\u7e3f\ubb2b))
            invokevirtual:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u9af2\ua3b4\u3dd3\ub102\u3c25\uc31c, p0:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, expr_68:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u7049\u8df4\uc9f6\uae87.\uc910\ub7dc\u873d\ubf56\u4f52\u446c \ua3b4\u0800\u983f\u67e9\ud171\u3e75(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:\uc910\ub7dc\u873d\ubf56\u4f52\u446c(getstatic:\uc910\ub7dc\u873d\ubf56\u4f52\u446c(\uc910\ub7dc\u873d\ubf56\u4f52\u446c::\u527a\ucfaf\u6b0d\u72f1\u99f7\u8308))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7873\u1187\u71f1\u600f\ud51e\ub70c(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u516c\u3d64\u718f\ub171\u6b5f.\uc4d2\ufcaf\u4f52\u120d\uc2e8\u7873 p3) {
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
            return:boolean(and:int[expected:boolean](ldc:int(13060), ldc:int(-13061)))
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
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u120d\ucfaf\u6b5f\ua6bd\u9937\u3504, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(6.0), ldc:double(0.0), ldc:double(6.0), ldc:double(10.0), ldc:double(16.0), ldc:double(10.0)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u8389\ucef1\u759a\u5f50\uf94d\uceb8, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(6.0), ldc:double(6.0), ldc:double(0.0), ldc:double(10.0), ldc:double(10.0), ldc:double(16.0)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4::\u516c\u7006\u88c5\ucef1\u3711\u64f2, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(0.0), ldc:double(6.0), ldc:double(6.0), ldc:double(16.0), ldc:double(10.0), ldc:double(10.0)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\u61a4\u8c8a\u5245\u1187\u7bad(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66B : int
        
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
        var_3_660 = and:int(ldc:int(-877918549), ldc:int(1303752227))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud51e\ubefe\u4cd9\u9033\ucfaf\ua3b4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(432605260))
        }
        else {
            var_3_660 = and:int(var_3_660:int, ldc:int(1789724519))
            var_5_8A = and:int(ldc:int(-18629), ldc:int(18628))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18682), ldc:int(-18683)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_660:int, ldc:int(-844753165))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(725), ldc:int(8227)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(25089), ldc:int(25088)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_DA:int, ldc:int(-123306245))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(17088), ldc:int(17089)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(869628083))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2081646733))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1838702764))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1527727717))
                        goto(Label_0798)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-571559953))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0798)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1611733870))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0798)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(310885604))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1911698708))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-123214169))
                        var_11_EB = and:int(ldc:int(4772), ldc:int(-4789))
                        goto(Label_1508)
                    }
                    
                    Label_0568:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1969413322))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-89596765))
                        goto(Label_0798)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1269965632))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-822264265))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0798)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(995878187))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(16088690))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-604543061))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0798:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1235677543))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1473301834))
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(705091140))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(857752801))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(511297913))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-273844229))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(5667), ldc:int(2505))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0932:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-463838496))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1593414988))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-643351333))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1914980401))
                            goto(Label_0798)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-304906946))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(1873096439))
                        var_11_EB = and:int(ldc:int(-4670), ldc:int(4125))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1463361804))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0932)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0798)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1455453199))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-655387029))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1344)
                            }
                        }
                    }
                    
                    Label_1208:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0932)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(101066233))
                            goto(Label_0798)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(932914628))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1356388878))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(2124576549))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(1538604963))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1508)
                    }
                    
                    Label_1344:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2088641209))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(264673184))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-277199711))
                        goto(Label_0798)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-880028698))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1508054950))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1790576620))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(685388501))
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(2063542071))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-952224681))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0798)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1165073136))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1750545118))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1575327535))
                        var_17_66B = add:int(var_16_119:int, and:int(ldc:int(577), ldc:int(17541)))
                        looporswitchbreak()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(130287401))
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(-85709077))
                
                if (cmple:boolean(var_5_8A = var_17_66B:int, sub:int(var_6_91:int, and:int(ldc:int(16397), ldc:int(9249))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
