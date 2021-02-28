public class \u56bd\u8413\u647c\u5bc4\ud158.\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a {
    public void \uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a(\u56bd\u8413\u647c\u5bc4\ud158.\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p1, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p2) {
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
            putfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a::\u40a9\ud4fe\u64f2\u7049\u8308\u71ae, this:\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a, p0:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b)
            putfield:\u1833\ud171\u8350\ubded\u34df\uc9f6(\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a::\u6ec6\u3dd3\u47c2\u6198\u4c04\u385b, this:\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a, p1:\u1833\ud171\u8350\ubded\u34df\uc9f6)
            putfield:\u1833\ud171\u8350\ubded\u34df\uc9f6(\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a::\u1833\u5140\u6c56\u69d9\ub6ab\ud217, this:\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a, p2:\u1833\ud171\u8350\ubded\u34df\uc9f6)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u93a2\ud7e8\u6198\u156b\u8640() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
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
    
    private void lambda$\u4f52\ub32d\u7d52\u1833\u61a4\ua6bd$0(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
        var_3_5F : int
        var_5_74 : int
        var_3_80 : int
        var_6_8E : \u9af2\u7330\u1833\ua562\u6b0d\u71ae
        var_7_141 : int
        
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
        var_3_5F = and:int(ldc:int(-650925951), ldc:int(-210371113))
        var_5_74 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(-13667), ldc:int(13666)))))
        
        if (cmpeq:boolean(var_5_74:int, ldc:int(-1))) {
            return:void()
        }
        
        var_3_80 = and:int(var_3_5F:int, ldc:int(-684623679))
        var_6_8E = invokevirtual:\u9af2\u7330\u1833\ua562\u6b0d\u71ae(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\u5f50\ubded\u4d85\u8640\u6b5f\u1187, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, invokestatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b::\u120d\u1187\u8350\ub19c\ucef1\u4179, getfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a::\u40a9\ud4fe\u64f2\u7049\u8308\u71ae, this:\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a))))
        
        if (cmpne:boolean(var_5_74:int, invokevirtual:int(\u9af2\u7330\u1833\ua562\u6b0d\u71ae::\uf9c5\u6198\u6d69\u92ee\u99f7\u946b, var_6_8E:\u9af2\u7330\u1833\ua562\u6b0d\u71ae))) {
            if (cmpne:boolean(var_5_74:int, invokevirtual:int(\u9af2\u7330\u1833\ua562\u6b0d\u71ae::\u071d\u8258\ud51e\u61a4\u527a\u47c2, var_6_8E:\u9af2\u7330\u1833\ua562\u6b0d\u71ae))) {
                goto(Label_0250)
            }
        }
        
        Label_0154:
        
        if (cmpne:boolean(and:int(var_3_80:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_80 = and:int(var_3_80:int, ldc:int(2065970772))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_3_80:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_80 = and:int(var_3_80:int, ldc:int(-106960209))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6435\ub1b9\u88c5\u4c04\u72f1\u8df4, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), and:int(ldc:int(-3548), ldc:int(1435)), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\u647c\u97b7\uf995\u67e9\u873d\u5f50, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, invokestatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b::\u120d\u1187\u8350\ub19c\ucef1\u4179, getfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a::\u40a9\ud4fe\u64f2\u7049\u8308\u71ae, this:\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a))), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1)))))))
            goto(Label_0279)
        }
        
        Label_0250:
        
        if (cmpne:boolean(and:int(var_3_80:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_3_80:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0154)
            }
            
            var_3_80 = and:int(var_3_80:int, ldc:int(-149164369))
            
            if (cmpeq:boolean(var_5_74:int, invokevirtual:int(\u9af2\u7330\u1833\ua562\u6b0d\u71ae::\uc29a\ub171\u5f50\u7043\u8389\u624e, var_6_8E:\u9af2\u7330\u1833\ua562\u6b0d\u71ae))) {
                invokeinterface:void(\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9::\u99f7\u600f\u72f1\u6fb0\u67d0\uc238, invokestatic:\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9(\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b::\uc29a\u2dcc\u4f52\ub18d\u51fa\u5245, getfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a::\u40a9\ud4fe\u64f2\u7049\u8308\u71ae, this:\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a)), checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>)))
            }
        }
        
        Label_0279:
        
        if (cmpne:boolean(and:int(var_3_80:int, ldc:int(1024)), ldc:int(0))) {
            var_3_80 = and:int(var_3_80:int, ldc:int(2031307560))
            goto(Label_0250)
        }
        
        if (cmpne:boolean(and:int(var_3_80:int, ldc:int(2048)), ldc:int(0))) {
            var_7_141 = invokevirtual:int(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\u4cd9\u3bc9\u9a18\u7bad\ud36e\ub32d, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, invokestatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b::\u120d\u1187\u8350\ub19c\ucef1\u4179, getfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a::\u40a9\ud4fe\u64f2\u7049\u8308\u71ae, this:\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a))), var_5_74:int)
            
            if (cmpne:boolean(var_7_141:int, var_5_74:int)) {
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6435\ub1b9\u88c5\u4c04\u72f1\u8df4, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(9460), ldc:int(-9461)), invokestatic:Integer(Integer::valueOf, var_7_141:int))
            }
            
            return:void()
        }
        
        goto(Label_0154)
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
    
    public void \u6cfe\u3e75\uf94d\u071d\u3776\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62C : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_637 : int
        
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
        var_3_62C = and:int(ldc:int(-233879737), ldc:int(-1684454442))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_62C = and:int(var_3_62C:int, ldc:int(-32563378))
            var_5_7D = and:int(ldc:int(3846), ldc:int(-28423))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(30026), ldc:int(-32203)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_62C:int, ldc:int(-1016509457))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(1), ldc:int(1747)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2063), ldc:int(513)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_62C = and:int(var_3_D2:int, ldc:int(-1421924529))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(21193), ldc:int(21)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1710093538))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1772672848))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(625015322))
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0934)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1932479131))
                    }
                    else {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-273052730))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0553)
                            }
                            
                            goto(Label_0805)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-500363808))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(836587365))
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1236727425))
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(20923869))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-425297202))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-544244921))
                        var_11_E3 = and:int(ldc:int(-29061), ldc:int(29060))
                        goto(Label_1436)
                    }
                    
                    Label_0553:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-697872181))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-354456700))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-47745459))
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(66161397))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-872870042))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0805)
                        }
                    }
                    
                    Label_0670:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1108320095))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1641794391))
                        goto(Label_1076)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1545774360))
                        goto(Label_0934)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1920060888))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1478633398))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1434477753))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0805:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1681102823))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1912110465))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1524682220))
                        goto(Label_1076)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1206067784))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(204761104))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1626655745))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(393), ldc:int(392))
                                goto(Label_1076)
                            }
                        }
                    }
                    
                    Label_0934:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(530764901))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-559530675))
                            goto(Label_0805)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(560670175))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1765159970))
                        var_11_E3 = and:int(ldc:int(3352), ldc:int(-3483))
                    }
                    
                    Label_1076:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-127754714))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-668418396))
                            goto(Label_0934)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(810362747))
                            goto(Label_0805)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1139706556))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-2032159898))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1196:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-474729383))
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1076)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1741861675))
                            goto(Label_0934)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0805)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1865440218))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1276147738))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1436)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1076)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(159713114))
                        goto(Label_0934)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1445936349))
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1245048383))
                        loopcontinue()
                    }
                    
                    var_3_62C = and:int(var_3_62C:int, ldc:int(-1149690033))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1436:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_637 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1447:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(2005661618))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(897608992))
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1483530009))
                        goto(Label_1076)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(79752621))
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-725951380))
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-460914726))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1231321225))
                        var_17_637 = add:int(var_16_111:int, and:int(ldc:int(8705), ldc:int(6153)))
                        looporswitchbreak()
                    }
                    
                    var_3_62C = and:int(var_3_62C:int, ldc:int(-1364210703))
                }
                
                var_3_62C = and:int(var_3_62C:int, ldc:int(-294843433))
                
                if (cmple:boolean(var_5_7D = var_17_637:int, sub:int(var_6_84:int, xor:int(ldc:int(16899), ldc:int(16898))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_62C = and:int(var_3_62C:int, ldc:int(-219594217))
            goto(Label_0106)
        }
    }
}
