public class \u3504\ufe34\u600f\u6b0d\u69d9.\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9 {
    public void \u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p1, \u12b2\u7049\u8df4\uc9f6\uae87.\ub8be\u071d\u527a\u3711\ubff1\u759a p2) {
        var_6_95 : \u8258\ub19c\u0b8e\u98a4\u0800\ud217
        
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
            invokespecial:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::<init>, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, getstatic:ITextComponent(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u7bad\u3e75\u0b8e\u16f6\u6ec6\ua3b4))
            putfield:ITextComponent(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\ua3b4\ub8be\uf995\u8bb0\u64f2\uc246, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u3d64\u4f4a\u3c25\uf995\u64f2\uae5d), and:int(ldc:int(-30947), ldc:int(28898)))))
            putfield:long(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u1187\u3e75\u183a\u7e3f\ub113\u836c, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, ldc:long(-1L))
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u836c\u67d0\u6435\u4bc8\ud217\u12b2, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            var_6_95 = invokestatic:\u8258\ub19c\u0b8e\u98a4\u0800\ud217(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u0b8e\ub1b9\ub6ab\ub70c\uc4d2\u8c8a, getfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u4975\u600f\u92ee\u071d\u3bc9\u51b2, p2:\ub8be\u071d\u527a\u3711\ubff1\u759a))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4492\u8350\u88c5\u7af6\u8413\ub32d, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u5654\ufe34\ud171\u446c\u8258\u16f6, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p2:\ub8be\u071d\u527a\u3711\ubff1\u759a)
            invokespecial:void(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\uc246\u88c5\u385b\u71ae\u3bc9\u59ec, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, invokevirtual:String(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\uc910\u67e9\uc29a\ua3b4\u2dcc\u965f, var_6_95:\u8258\ub19c\u0b8e\u98a4\u0800\ud217), invokevirtual:int(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\ua6bd\ubff1\u8c8a\u3776\uc84e\u9af2, var_6_95:\u8258\ub19c\u0b8e\u98a4\u0800\ud217))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p1, java.lang.String p2, int p3) {
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
            invokespecial:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::<init>, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, getstatic:ITextComponent(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u7bad\u3e75\u0b8e\u16f6\u6ec6\ua3b4))
            putfield:ITextComponent(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\ua3b4\ub8be\uf995\u8bb0\u64f2\uc246, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u3d64\u4f4a\u3c25\uf995\u64f2\uae5d), and:int(ldc:int(-9773), ldc:int(9772)))))
            putfield:long(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u1187\u3e75\u183a\u7e3f\ub113\u836c, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, ldc:long(-1L))
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u836c\u67d0\u6435\u4bc8\ud217\u12b2, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4492\u8350\u88c5\u7af6\u8413\ub32d, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            invokespecial:void(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\uc246\u88c5\u385b\u71ae\u3bc9\u59ec, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, p2:String, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc246\u88c5\u385b\u71ae\u3bc9\u59ec(java.lang.String p0, int p1) {
        var_5_A3 : \u071d\u16f6\u7049\u983f\uc9f6\uae5d
        
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
            invokeinterface:void(Logger::info, getstatic:Logger(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u7d52\ua068\u8258\uc2e8\u4e72\u983f), loadelement:String(getstatic:String[](\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u3d64\u4f4a\u3c25\uf995\u64f2\uae5d), and:int(ldc:int(16417), ldc:int(4229))), p0:String[expected:Object], invokestatic:Integer[expected:Object](Integer::valueOf, p1:int))
            var_5_A3 = initobject:\u071d\u16f6\u7049\u983f\uc9f6\uae5d(\u071d\u16f6\u7049\u983f\uc9f6\uae5d::<init>, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u3d64\u4f4a\u3c25\uf995\u64f2\uae5d), and:int(ldc:int(2102), ldc:int(21890)))), invokevirtual:int(AtomicInteger::incrementAndGet, getstatic:AtomicInteger(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u3e2a\u9af2\ub83f\u5d20\uc2e8\u92ee)))), p0:String, p1:int)
            invokevirtual:void(Thread::setUncaughtExceptionHandler, var_5_A3:\u071d\u16f6\u7049\u983f\uc9f6\uae5d[expected:Thread], initobject:\u9a18\u7bad\u5db4\u6d99\u7873\u59ec[expected:UncaughtExceptionHandler](\u9a18\u7bad\u5db4\u6d99\u7873\u59ec::<init>, getstatic:Logger(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u7d52\ua068\u8258\uc2e8\u4e72\u983f)))
            invokevirtual:void(Thread::start, var_5_A3:\u071d\u16f6\u7049\u983f\uc9f6\uae5d[expected:Thread])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4cd9\u72f1\u74b1\u6435\u071d\ub171(net.minecraft.util.text.ITextComponent p0) {
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
            putfield:ITextComponent(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\ua3b4\ub8be\uf995\u8bb0\u64f2\uc246, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, p0:ITextComponent)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\uc87f\u5140\ud36e\u12cb\ubcb0() {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(-2034819823), ldc:int(849337942))
            
            if (cmpne:boolean(getfield:\u527a\u494c\u88c5\u965f\u759a(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u56bd\u8258\u8d98\u120d\uff55\uc229, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9), aconstnull:\u527a\u494c\u88c5\u965f\u759a())) {
                if (logicalnot:boolean(invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\u98a4\u960f\u6198\u3d4b\ub83f\ud171, getfield:\u527a\u494c\u88c5\u965f\u759a(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u56bd\u8258\u8d98\u120d\uff55\uc229, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9)))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-961061039))
                    invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\ua068\ud51e\u5140\u59ec\u6c52\u92ee, getfield:\u527a\u494c\u88c5\u965f\u759a(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u56bd\u8258\u8d98\u120d\uff55\uc229, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9))
                }
                else {
                    invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u446c\u93a2\u76bc\uc7fe\uf94d\uc246, getfield:\u527a\u494c\u88c5\u965f\u759a(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u56bd\u8258\u8d98\u120d\uff55\uc229, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6b0d\u8753\u4f4a\u2dcc\u8709\uae5d() {
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
            return:boolean(and:int[expected:boolean](ldc:int(-32704), ldc:int(23982)))
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_7_6B : long
        
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            var_7_6B = invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52)
            
            if (cmpgt:boolean(sub:long(var_7_6B:long, getfield:long(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u1187\u3e75\u183a\u7e3f\ub113\u836c, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9)), ldc:long(2000L))) {
                putfield:long(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u1187\u3e75\u183a\u7e3f\ub113\u836c, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, var_7_6B:long)
                invokevirtual:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u624e\u76bc\u92ee\u5db4\u5654\u88c5, getstatic:\u74b1\u516c\u7330\ud523\u8df4\uc87f(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u385b\uf9c5\uf94d\u718f\u5d20\u494c), invokevirtual:String(ITextComponent::getString, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u3d64\u4f4a\u3c25\uf995\u64f2\uae5d), xor:int(ldc:int(16422), ldc:int(16421))))))
            }
            
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9), getfield:ITextComponent(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\ua3b4\ub8be\uf995\u8bb0\u64f2\uc246, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9), div:int(getfield:int(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9), and:int(ldc:int(1083), ldc:int(17158))), sub:int(div:int(getfield:int(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9), and:int(ldc:int(134), ldc:int(3690))), ldc:int(50)), ldc:int(16777215))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3711\u59ec\ud158\u156b\u4975\u1187$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:boolean(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u960f\u6d99\ub70c\u8753\u4ab3\u6c56, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, xor:int[expected:boolean](ldc:int(8704), ldc:int(8705)))
            
            if (cmpne:boolean(getfield:\u527a\u494c\u88c5\u965f\u759a(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u56bd\u8258\u8d98\u120d\uff55\uc229, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9), aconstnull:\u527a\u494c\u88c5\u965f\u759a())) {
                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u98a4\uc31c\u6c52\uf995\u62da\u64f2, getfield:\u527a\u494c\u88c5\u965f\u759a(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u56bd\u8258\u8d98\u120d\uff55\uc229, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u3d64\u4f4a\u3c25\uf995\u64f2\uae5d), and:int(ldc:int(16388), ldc:int(1895)))))
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u836c\u67d0\u6435\u4bc8\ud217\u12b2, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \uc2bd\u392e\u34df\u71f1\u99f7\uf94d(\u3504\ufe34\u600f\u6b0d\u69d9.\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9 p0) {
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
            return:boolean(getfield:boolean(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u960f\u6d99\ub70c\u8753\u4ab3\u6c56, p0:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9))
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a \u5db4\u2dcc\u718f\u8753\u120d\u494c(\u3504\ufe34\u600f\u6b0d\u69d9.\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a p1) {
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
            return:\u527a\u494c\u88c5\u965f\u759a(putfield:\u527a\u494c\u88c5\u965f\u759a(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u56bd\u8258\u8d98\u120d\uff55\uc229, p0:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, p1:\u527a\u494c\u88c5\u965f\u759a))
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a \u64ab\u6fb0\u760c\ud158\u88c5\ud158(\u3504\ufe34\u600f\u6b0d\u69d9.\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9 p0) {
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
            return:\u527a\u494c\u88c5\u965f\u759a(getfield:\u527a\u494c\u88c5\u965f\u759a(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u56bd\u8258\u8d98\u120d\uff55\uc229, p0:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9))
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 \u8c8a\ufe34\u9af2\ucef1\uae87\u2dcc(\u3504\ufe34\u600f\u6b0d\u69d9.\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9 p0) {
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
            return:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u836c\u67d0\u6435\u4bc8\ud217\u12b2, p0:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9))
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u5245\ub102\u67e9\u183a\u4e72\u183a() {
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
            return:Logger(getstatic:Logger(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u7d52\ua068\u8258\uc2e8\u4e72\u983f))
        }
        
        goto(Label_0006)
    }
    
    public static void \u4c2b\uf94d\u9033\u8753\u7bad\u839e(\u3504\ufe34\u600f\u6b0d\u69d9.\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9 p0, net.minecraft.util.text.ITextComponent p1) {
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
            invokespecial:void(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u4cd9\u72f1\u74b1\u6435\u071d\ub171, p0:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9, p1:ITextComponent)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_240 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_120_0 : byte[] [generated]
        stack_122_0 : byte[] [generated]
        stack_15A_0 : byte[] [generated]
        stack_253_0 : byte[] [generated]
        stack_2AA_0 : byte[] [generated]
        stack_338_0 : byte[] [generated]
        stack_38C_0 : byte[] [generated]
        var_4_223 : int
        var_3_228 : byte[]
        var_5_229 : int
        var_0_2A0 : int
        expr_2AA : byte [generated]
        stack_2EA_2 : byte [generated]
        stack_2C7_0 : byte [generated]
        expr_338 : byte [generated]
        expr_A7 : int [generated]
        expr_E0 : int [generated]
        var_2_120 : byte[]
        expr_124 : int [generated]
        var_3_37A : byte[]
        var_5_37B : int
        var_3_166 : String
        stack_205_0 : String[] [generated]
        expr_178 : String[] [generated]
        
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
        var_0_240 = and:int(ldc:int(-1057945133), ldc:int(-1149622847))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DE_0 = stack_E0_0 = stack_120_0 = stack_122_0 = stack_15A_0 = stack_253_0 = stack_2AA_0 = stack_338_0 = stack_38C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("w9Qr2ivdJBzIK9khyCN12pPuPCfK3CFxNzOSw9Qr2ivHcBU9nuDU1Cvaa9Yz487O3zsvINfX1Cvaa9YxlCHUK9or3STc2tzULSEvwm7XNJIk3SfaRkRLIg==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_223 = expr_6E:int
        var_3_228 = newarray:byte[](byte.class, expr_6E:int)
        var_5_229 = expr_6E:int
        Label_0555:
        
        while (cmpeq:boolean(and:int(var_0_240:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(4)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(356324709))
                goto(Label_0642)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(-1099845125))
            var_5_229 = add:int(var_5_229:int, ldc:int(-1))
            storeelement:byte(var_3_228:byte[], var_5_229:int, xor:byte(loadelement:byte(stack_253_0:byte[], var_5_229:int), ldc:byte(33)))
            
            if (cmpne:boolean(var_5_229:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_120_0 = stack_122_0 = stack_15A_0 = stack_253_0 = stack_2AA_0 = stack_338_0 = stack_38C_0 = var_3_228:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0784)
        Label_0642:
        
        while (cmpeq:boolean(and:int(var_0_240:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0555)
            }
            
            var_0_2A0 = and:int(var_0_240:int, ldc:int(-965059587))
            var_5_229 = add:int(var_5_229:int, ldc:int(-1))
            expr_2AA = stack_2EA_2 = loadelement(stack_2AA_0, var_5_229)
            
            if (cmplt:boolean(add:int(add:int(var_5_229:int, ldc:int(3)), neg:int(var_4_223:int)), ldc:int(0))) {
                stack_2EA_2 = stack_2C7_0 = add:byte(expr_2AA:byte, loadelement:byte(var_3_228:byte[], add:int(var_5_229:int, ldc:int(3))))
                goto(Label_0727)
            }
            
            Label_0695:
            
            if (cmpeq:boolean(and:int(var_0_2A0:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_2A0 = and:int(var_0_2A0:int, ldc:int(-748057095))
                stack_2EA_2 = stack_2C7_0 = add:byte(expr_2AA:byte, ldc:byte(3))
            }
            
            Label_0727:
            
            if (cmpeq:boolean(and:int(var_0_2A0:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0695)
            }
            
            var_0_240 = and:int(var_0_2A0:int, ldc:int(-638517283))
            storeelement:byte(var_3_228:byte[], var_5_229:int, stack_2EA_2:byte)
            
            if (cmpne:boolean(var_5_229:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_120_0 = stack_122_0 = stack_15A_0 = stack_253_0 = stack_2AA_0 = stack_338_0 = stack_38C_0 = var_3_228:byte[]
            goto(Label_0172)
        }
        
        var_0_240 = and:int(var_0_240:int, ldc:int(-1694618441))
        Label_0784:
        
        while (cmpeq:boolean(and:int(var_0_240:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(512)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(-1092655489))
                goto(Label_0555)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(-866094641))
            var_5_229 = add:int(var_5_229:int, ldc:int(-1))
            expr_338 = loadelement:byte(stack_338_0:byte[], var_5_229:int)
            storeelement:byte(var_3_228:byte[], var_5_229:int, add:int(or:int(and:int(shl:int(expr_338:byte, and:int(ldc:int(6311), ldc:int(16404))), ldc:int(-16)), and:int(shr:int(expr_338:byte[expected:int], xor:int(ldc:int(-23520), ldc:int(-23516))), ldc:int(15))), ldc:int(16)))
            
            if (cmpne:boolean(var_5_229:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_120_0 = stack_122_0 = stack_15A_0 = stack_253_0 = stack_2AA_0 = stack_338_0 = stack_38C_0 = var_3_228:byte[]
            goto(Label_0229)
        }
        
        goto(Label_0642)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(-877420688))
            goto(Label_0297)
        }
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(64)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(1550012341))
            goto(Label_0229)
        }
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(256)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(-151667757))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_223 = expr_A7:int
                var_3_228 = newarray:byte[](byte.class, expr_A7:int)
                var_5_229 = expr_A7:int
                goto(Label_0642)
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(64)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(1299730268))
            goto(Label_0297)
        }
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(524288)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(1272037141))
                goto(Label_0115)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(-1325979143))
            expr_E0 = arraylength:int(stack_E0_0:byte[])
            
            if (cmpne:boolean(expr_E0:int, ldc:int(0))) {
                var_4_223 = expr_E0:int
                var_3_228 = newarray:byte[](byte.class, expr_E0:int)
                var_5_229 = expr_E0:int
                goto(Label_0784)
            }
        }
        
        Label_0229:
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(512)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(1650792853))
        }
        else {
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(32768)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(1953110330))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(488782822))
                goto(Label_0115)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(-1779894823))
            var_2_120 = stack_120_0:byte[]
            expr_124 = add:int(arraylength:int(stack_122_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_124:int, ldc:int(0))) {
                var_3_37A = newarray:byte[](byte.class, expr_124:int)
                var_5_37B = expr_124:int
                
                loop {
                    var_0_240 = and:int(var_0_240:int, ldc:int(-2039238703))
                    var_5_37B = add:int(var_5_37B:int, ldc:int(-1))
                    storeelement:byte(var_3_37A:byte[], var_5_37B:int, add:int(shl:int(loadelement:byte(stack_38C_0:byte[], var_5_37B:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_120:byte[], add:int(var_5_37B:int, and:int(ldc:int(2177), ldc:int(22029)))), ldc:int(4)), and:int(ldc:int(4111), ldc:int(19023)))))
                    
                    if (cmpne:boolean(var_5_37B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_120_0 = stack_122_0 = stack_15A_0 = stack_253_0 = stack_2AA_0 = stack_338_0 = stack_38C_0 = var_3_37A:byte[]
            }
        }
        
        Label_0297:
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(16384)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(276755021))
            goto(Label_0229)
        }
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(770794795))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_166 = initobject:String(String::<init>, stack_15A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_205_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4229), ldc:int(775)))
            expr_178 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(273), ldc:int(276)))
            storeelement:String(expr_178:String[], xor:int(ldc:int(5640), ldc:int(5641)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(1716), ldc:int(-1717)), and:int(ldc:int(116), ldc:int(10260))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(8320), ldc:int(8322)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(8724), ldc:int(4180)), xor:int(ldc:int(1569), ldc:int(1543))))
            storeelement:String(expr_178:String[], and:int(ldc:int(1164), ldc:int(10756)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(1086), ldc:int(24614)), and:int(ldc:int(3135), ldc:int(17013))))
            storeelement:String(expr_178:String[], and:int(ldc:int(-26402), ldc:int(26401)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(4221), ldc:int(2869)), and:int(ldc:int(6231), ldc:int(8263))))
            storeelement:String(expr_178:String[], and:int(ldc:int(2179), ldc:int(4167)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(2219), ldc:int(2284)), and:int(ldc:int(3287), ldc:int(25215))))
            putstatic:String[](\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u3d64\u4f4a\u3c25\uf995\u64f2\uae5d, expr_178:String[])
            putstatic:AtomicInteger(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u3e2a\u9af2\ub83f\u5d20\uc2e8\u92ee, initobject:AtomicInteger(AtomicInteger::<init>, and:int(ldc:int(27745), ldc:int(-31866))))
            putstatic:Logger(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u7d52\ua068\u8258\uc2e8\u4e72\u983f, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6AA : int
        
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
        var_3_69F = and:int(ldc:int(844091904), ldc:int(-85985872))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-143663454))
            var_5_81 = and:int(ldc:int(-4959), ldc:int(4954))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11794), ldc:int(-11795)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_69F:int, ldc:int(2127542332))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(3), ldc:int(3105)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(17045), ldc:int(13665)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_DA:int, ldc:int(857709108))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(259), ldc:int(1549)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(909668635))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1647286010))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(88966003))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1975746303))
                    }
                    else {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-81809008))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1212693535))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-778168036))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-142319370))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1053768990))
                        var_11_EB = and:int(ldc:int(-11407), ldc:int(11402))
                        goto(Label_1553)
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(497285387))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-863751235))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1091215305))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-853772058))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1640910541))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-150006046))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-843243124))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(15602455))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1546655770))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(858772599))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1802768356))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(503007472))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1906833031))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(755956973))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-653414033))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2013224251))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(21901), ldc:int(33))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-953644147))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1960589831))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-995844298))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1094676139))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1933291164))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-2133233367))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1072666292))
                        var_11_EB = and:int(ldc:int(-28586), ldc:int(11689))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1920673318))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-797154395))
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1289598398))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-452337180))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(368013105))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-216015138))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1434)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1051222393))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-760344957))
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1778056534))
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-999998534))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(219377407))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1528301105))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1379779129))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(861903382))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1553)
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1444538518))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(564395175))
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-219202497))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-424749004))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-111113136))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(15448017))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2041880493))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1637746964))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1253689633))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(996135479))
                        var_17_6AA = add:int(var_16_119:int, and:int(ldc:int(4609), ldc:int(18433)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(2002736601))
                
                if (cmple:boolean(var_5_81 = var_17_6AA:int, sub:int(var_6_88:int, and:int(ldc:int(653), ldc:int(8209))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-1445965878))
            goto(Label_0108)
        }
    }
}
