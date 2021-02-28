public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b {
    public void \u5140\ud523\u3d4b\u647c\ub1b9\u4c2b(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0) {
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
            invokespecial:Object(Object::<init>, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b)
            putfield:SessionEventListener(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\ufe34\u446c\ua61f\u8350\u47c2\u7873, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b, getstatic:SessionEventListener(SessionEventListener::NONE))
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\u99f7\u0800\ud217\uc4d2\u9a18\ub19c, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            putfield:Launcher(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\u4d85\u9a18\ua068\u7c6b\u3d64\ub18d, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b, invokestatic:Launcher(Bridge::getLauncher))
            
            if (cmpne:boolean(getfield:Launcher(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\u4d85\u9a18\ua068\u7c6b\u3d64\ub18d, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b), aconstnull:Launcher())) {
                invokeinterface:void(Launcher::registerGame, getfield:Launcher(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\u4d85\u9a18\ua068\u7c6b\u3d64\ub18d, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b), this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b[expected:RunningGame])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.bridge.game.GameVersion getVersion() {
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
            return:GameVersion(invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.bridge.game.Language getSelectedLanguage() {
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
            return:Language(invokevirtual:\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e[expected:Language](\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9::\u74b1\u8c8a\u62da\u4e72\uc2e8\ud12e, invokevirtual:\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u516c\ub8be\u839e\u47c2\ub171, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\u99f7\u0800\ud217\uc4d2\u9a18\ub19c, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b))))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.bridge.game.GameSession getCurrentSession() {
        var_3_67 : \u16f6\u61a4\u5db4\u4c04\u64ab\u9255
        
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
            var_3_67 = getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\u99f7\u0800\ud217\uc4d2\u9a18\ub19c, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b))
            return:GameSession(ternaryop:\u6b5f\ube23\u8753\u4bc8\u624e\ud523(cmpne:boolean(var_3_67:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255()), initobject:\u6b5f\ube23\u8753\u4bc8\u624e\ud523(\u6b5f\ube23\u8753\u4bc8\u624e\ud523::<init>, var_3_67:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\u99f7\u0800\ud217\uc4d2\u9a18\ub19c, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b)), getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u99f7\u67d0\u6b5f\ub70c\u3e2a\u6d69, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\u99f7\u0800\ud217\uc4d2\u9a18\ub19c, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b)))), aconstnull:\u6b5f\ube23\u8753\u4bc8\u624e\ud523()))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.bridge.game.PerformanceMetrics getPerformanceMetrics() {
        var_1_5F : int
        var_3_67 : \u624e\u416d\u97b7\u1187\u8df4\u71ae
        var_4_6B : long
        var_6_70 : long
        var_8_73 : long
        var_10_79 : long[]
        var_11_7E : int
        var_12_87 : int
        var_13_C0 : long
        
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
            var_1_5F = and:int(ldc:int(1517229366), ldc:int(-110104897))
            var_3_67 = invokevirtual:\u624e\u416d\u97b7\u1187\u8df4\u71ae(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9a18\ub32d\u718f\u6b5f\u12cb\ub70c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\u99f7\u0800\ud217\uc4d2\u9a18\ub19c, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b))
            var_4_6B = ldc:long(2147483647L)
            var_6_70 = ldc:long(-2147483648L)
            var_8_73 = ldc:long(0L)
            var_10_79 = invokevirtual:long[](\u624e\u416d\u97b7\u1187\u8df4\u71ae::\u516c\u385b\u4cd9\u8aa5\u8350\u983f, var_3_67:\u624e\u416d\u97b7\u1187\u8df4\u71ae)
            var_11_7E = arraylength:int(var_10_79:long[])
            var_12_87 = and:int(ldc:int(10212), ldc:int(-16357))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1501005823))
                
                if (cmpge:boolean(var_12_87:int, var_11_7E:int)) {
                    looporswitchbreak()
                }
                
                var_13_C0 = loadelement:long(var_10_79:long[], var_12_87:int)
                var_4_6B = invokestatic:long(Math::min, var_4_6B:long, var_13_C0:long)
                var_6_70 = invokestatic:long(Math::max, var_6_70:long, var_13_C0:long)
                var_8_73 = add:long(var_8_73:long, var_13_C0:long)
                inc:int(var_12_87, ldc:int(1))
            }
            
            return:PerformanceMetrics(initobject:\ub32d\ub8be\u64ab\ua068\u9937\uf94d(\ub32d\ub8be\u64ab\ua068\u9937\uf94d::<init>, l2i:int(var_4_6B:long), l2i:int(var_6_70:long), l2i:int(div:long(var_8_73:long, i2l:long(arraylength:int(invokevirtual:long[](\u624e\u416d\u97b7\u1187\u8df4\u71ae::\u516c\u385b\u4cd9\u8aa5\u8350\u983f, var_3_67:\u624e\u416d\u97b7\u1187\u8df4\u71ae))))), arraylength:int(invokevirtual:long[](\u624e\u416d\u97b7\u1187\u8df4\u71ae::\u516c\u385b\u4cd9\u8aa5\u8350\u983f, var_3_67:\u624e\u416d\u97b7\u1187\u8df4\u71ae))))
        }
        
        goto(Label_0006)
    }
    
    public void setSessionEventListener(com.mojang.bridge.launcher.SessionEventListener p0) {
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
            putfield:SessionEventListener(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\ufe34\u446c\ua61f\u8350\u47c2\u7873, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b, p0:SessionEventListener)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\ubff1\u960f\u983f\u4ab3\u72f1() {
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
            invokeinterface:void(SessionEventListener::onStartGameSession, getfield:SessionEventListener(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\ufe34\u446c\ua61f\u8350\u47c2\u7873, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b), invokevirtual:GameSession(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::getCurrentSession, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9033\ub8be\u624e\u3d4b\u759a\ud171() {
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
            invokeinterface:void(SessionEventListener::onLeaveGameSession, getfield:SessionEventListener(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\ufe34\u446c\ua61f\u8350\u47c2\u7873, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b), invokevirtual:GameSession(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::getCurrentSession, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b))
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
    
    public void \uc3e3\u965f\u34df\u3e75\u946b\u12cb(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_616 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_621 : int
        
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
        var_3_616 = and:int(ldc:int(380493632), ldc:int(1877991082))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(524288)), ldc:int(0))) {
            var_3_616 = and:int(var_3_616:int, ldc:int(1874788090))
            var_5_7D = and:int(ldc:int(28297), ldc:int(-28362))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-6007), ldc:int(4438)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_616:int, ldc:int(-402661511))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(16461), ldc:int(257)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(16770), ldc:int(16771)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_616 = and:int(var_3_D2:int, ldc:int(-1498489071))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(36), ldc:int(37)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1865621932))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1345766695))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1638860892))
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1887555490))
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-21307453))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0553)
                            }
                            
                            goto(Label_0797)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(555200930))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1133615454))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1153419078))
                        goto(Label_0797)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-2060033467))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(390352455))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1346568592))
                        var_11_E3 = and:int(ldc:int(9858), ldc:int(-9859))
                        goto(Label_1423)
                    }
                    
                    Label_0553:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1251976413))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-2139579958))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-469855487))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-2036657697))
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1116859015))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-970858227))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1225859140))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0797)
                        }
                    }
                    
                    Label_0689:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1046451485))
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1078676649))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(535683022))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0797:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-807221608))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(178140369))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(788070019))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(385), ldc:int(22627))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0898:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(794173923))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0797)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(2025740787))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-2006430397))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(536412082))
                        var_11_E3 = and:int(ldc:int(-4678), ldc:int(4677))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-615141538))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-414342477))
                            goto(Label_0797)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-574254648))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-135733286))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1291)
                            }
                        }
                    }
                    
                    Label_1153:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1674566943))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(1722091070))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0797)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(654688270))
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(1981621245))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(351105758))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-138420609))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1423)
                    }
                    
                    Label_1291:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-94426778))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(2082816206))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(564224666))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-354093668))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_616 = and:int(var_3_616:int, ldc:int(1593835073))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_621 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1661793533))
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(16)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(553214679))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(365808996))
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1900989382))
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-324829212))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1740504797))
                        var_17_621 = add:int(var_16_111:int, xor:int(ldc:int(1056), ldc:int(1057)))
                        looporswitchbreak()
                    }
                    
                    var_3_616 = and:int(var_3_616:int, ldc:int(-1347333660))
                }
                
                var_3_616 = and:int(var_3_616:int, ldc:int(1072365537))
                
                if (cmple:boolean(var_5_7D = var_17_621:int, sub:int(var_6_84:int, xor:int(ldc:int(2689), ldc:int(2688))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_616 = and:int(var_3_616:int, ldc:int(1318131373))
            goto(Label_0106)
        }
    }
}
