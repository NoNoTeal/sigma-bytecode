public class \u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf {
    public void \uc84e\u3dd3\u98a4\u52d3\u4daf(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
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
            invokespecial:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::<init>, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)
            putfield:int(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u56bd\uae87\u4492\u9af2\u5245\u52d3, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, ldc:int(-1))
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ud171\u5f50\u98a4\u8753\u8aa5\ud36e, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            return:void()
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
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
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
        
        if (cmpne:boolean(p0:int, xor:int(ldc:int(2129), ldc:int(2385)))) {
            return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\uc84e\u3dd3\u98a4\u52d3\u4daf[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
        }
        
        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), initobject:\u3d4b\u9af2\u71f1\u67d0\u99f7[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u3d4b\u9af2\u71f1\u67d0\u99f7::<init>, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ud171\u5f50\u98a4\u8753\u8aa5\ud36e, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)))
        return:boolean(xor:int[expected:boolean](ldc:int(3072), ldc:int(3073)))
    }
    
    private void \u6fb0\u8709\u647c\ua6bd\u6c56\u527a(int p0) {
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
            invokevirtual:void(\u0a06\u8df4\ua068\u62da\u69d9::\u927d\u7bad\u51fa\ud4fe\uc84e\u4f52, getfield:\u0a06\u8df4\ua068\u62da\u69d9(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ub32d\u4975\u8258\ua562\u0a06\u7043, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc87f\ud217\u7873\u51fa\u718f\u59ec(int p0) {
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
            
            if (cmplt:boolean(p0:int, invokevirtual:int(\u873d\u6d99\u983f\u6198\u8d90\u416d<E>::\u72f1\ufcaf\ube23\u64ab\u56bd\uae5d, getfield:\u0a06\u8df4\ua068\u62da\u69d9[expected:\u873d\u6d99\u983f\u6198\u8d90\u416d<\u839e\u97e6\u4d85\u392e\ubff1>](\uc84e\u3dd3\u98a4\u52d3\u4daf::\ub32d\u4975\u8258\ua562\u0a06\u7043, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)))) {
                invokevirtual:void(Thread::start, initobject:\uceb8\u5fe1\ubff1\u0c95\u8d90[expected:Thread](\uceb8\u5fe1\ubff1\u0c95\u8d90::<init>, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, loadelement:String(getstatic:String[](\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8350\u8413\ud51e\u16f6\u6b0d\u69d9), xor:int(ldc:int(-31701), ldc:int(-31697))), p0:int))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4c04\ub1b9\u946b\ufcaf\ud4fe\uc4d2(int p0) {
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
            
            if (cmplt:boolean(p0:int, invokevirtual:int(\u873d\u6d99\u983f\u6198\u8d90\u416d<E>::\u72f1\ufcaf\ube23\u64ab\u56bd\uae5d, getfield:\u0a06\u8df4\ua068\u62da\u69d9[expected:\u873d\u6d99\u983f\u6198\u8d90\u416d<\u839e\u97e6\u4d85\u392e\ubff1>](\uc84e\u3dd3\u98a4\u52d3\u4daf::\ub32d\u4975\u8258\ua562\u0a06\u7043, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)))) {
                invokevirtual:void(Thread::start, initobject:\u67e9\ua562\u97b7\u4c2b\u946b[expected:Thread](\u67e9\ua562\u97b7\u4c2b\u946b::<init>, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, loadelement:String(getstatic:String[](\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8350\u8413\ud51e\u16f6\u6b0d\u69d9), and:int(ldc:int(19501), ldc:int(12295))), p0:int))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
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
            putfield:ITextComponent(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ub18d\u965f\u4c2b\u51b2\u5db4\u071d, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, aconstnull:ITextComponent())
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\uc84e\u3dd3\u98a4\u52d3\u4daf[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokevirtual:void(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u0a06\u8df4\ua068\u62da\u69d9[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u839e\u97e6\u4d85\u392e\ubff1>](\uc84e\u3dd3\u98a4\u52d3\u4daf::\ub32d\u4975\u8258\ua562\u0a06\u7043, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokevirtual:void(\u6c56\u647c\u97b7\u6d99\u5654\u385b::\u071d\ub8be\u1833\u120d\u3e75\u56bd, getfield:\u6c56\u647c\u97b7\u6d99\u5654\u385b(\uc84e\u3dd3\u98a4\u52d3\u4daf::\uf995\u8709\ua61f\ub32d\ubff1\u99f7, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), this:\uc84e\u3dd3\u98a4\u52d3\u4daf[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            
            if (cmpne:boolean(getfield:ITextComponent(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ub18d\u965f\u4c2b\u51b2\u5db4\u071d, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), aconstnull:ITextComponent())) {
                invokevirtual:void(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u3e75\u6c52\u8709\u64ab\u52d3\ube23, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:ITextComponent(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ub18d\u965f\u4c2b\u51b2\u5db4\u071d, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), p1:int, p2:int)
            }
            
            if (cmpeq:boolean(invokevirtual:int(\u873d\u6d99\u983f\u6198\u8d90\u416d<E>::\u72f1\ufcaf\ube23\u64ab\u56bd\uae5d, getfield:\u0a06\u8df4\ua068\u62da\u69d9[expected:\u873d\u6d99\u983f\u6198\u8d90\u416d<\u839e\u97e6\u4d85\u392e\ubff1>](\uc84e\u3dd3\u98a4\u52d3\u4daf::\ub32d\u4975\u8258\ua562\u0a06\u7043, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)), ldc:int(0))) {
                if (getfield:boolean(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u9a18\uc4d2\u6d99\ub6ab\u51fa\u71ae, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)) {
                    invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), getstatic:ITextComponent(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u5f50\uc3e3\u64ab\u4e72\ub171\u40a9), div:int(getfield:int(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), and:int(ldc:int(2), ldc:int(5962))), sub:int(div:int(getfield:int(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), xor:int(ldc:int(20737), ldc:int(20739))), ldc:int(20)), ldc:int(16777215))
                }
            }
            
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\uc84e\u3dd3\u98a4\u52d3\u4daf[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3e75\u6c52\u8709\u64ab\u52d3\ube23(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, net.minecraft.util.text.ITextComponent p1, int p2, int p3) {
        var_7_7A : int
        var_8_81 : int
        
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
            
            if (cmpne:boolean(p1:ITextComponent, aconstnull:ITextComponent())) {
                var_7_7A = add:int(p2:int, ldc:int(12))
                var_8_81 = sub:int(p3:int, ldc:int(12))
                invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u8d98\u120d\u7ce1\u647c\u416d\uc238, this:\uc84e\u3dd3\u98a4\u52d3\u4daf[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, sub:int(var_7_7A:int, xor:int(ldc:int(3330), ldc:int(3329))), sub:int(var_8_81:int, xor:int(ldc:int(16933), ldc:int(16934))), add:int(add:int(var_7_7A:int, invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), p1:ITextComponent[expected:ITextProperties])), and:int(ldc:int(259), ldc:int(6291))), add:int(add:int(var_8_81:int, ldc:int(8)), xor:int(ldc:int(17410), ldc:int(17409))), ldc:int(-1073741824), ldc:int(-1073741824))
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6bb9\u67e9\u8df4\u8413\u624e\ucb79, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:ITextComponent, i2f:float(var_7_7A:int), i2f:float(var_8_81:int), ldc:int(16777215))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8bb0\u9033\u5d20\u5db4\u0a06\ud51e() {
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
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u4e72\u8413\u8d90\u4d85\u156b\u9937, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), invokespecial:boolean(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8413\uc87f\u62da\ud171\u3bd6\u983f, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, getfield:int(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u56bd\uae87\u4492\u9af2\u5245\u52d3, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u4975\u7330\u8bb0\u516c\u0800\ub8be, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), invokespecial:boolean(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8413\uc87f\u62da\ud171\u3bd6\u983f, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, getfield:int(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u56bd\uae87\u4492\u9af2\u5245\u52d3, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u8413\uc87f\u62da\ud171\u3bd6\u983f(int p0) {
        var_2_61 : int
        stack_88_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-496793804), ldc:int(1726068055))
            
            if (cmpeq:boolean(p0:int, ldc:int(-1))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(2137493389))
                stack_88_0 = and:int(ldc:int(25174), ldc:int(-25175))
            }
            else {
                stack_88_0 = and:int(ldc:int(9233), ldc:int(491))
            }
            
            return:boolean(stack_88_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u71ae\u9a18\u4c2b\uc3e3\u3dd3\u62da$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\uc84e\u3dd3\u98a4\u52d3\u4daf::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, getfield:int(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u56bd\uae87\u4492\u9af2\u5245\u52d3, this:\uc84e\u3dd3\u98a4\u52d3\u4daf))
            putfield:int(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u56bd\uae87\u4492\u9af2\u5245\u52d3, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, ldc:int(-1))
            invokespecial:void(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8bb0\u9033\u5d20\u5db4\u0a06\ud51e, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u7873\u4179\u839e\u392e\ube23\uafe7$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\uc84e\u3dd3\u98a4\u52d3\u4daf), initobject:\u3d4b\u9af2\u71f1\u67d0\u99f7[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u3d4b\u9af2\u71f1\u67d0\u99f7::<init>, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ud171\u5f50\u98a4\u8753\u8aa5\ud36e, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u071d\ub1b9\ucfaf\u3bd6\u12cb\u98a4$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u4c04\ub1b9\u946b\ufcaf\ud4fe\uc4d2, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, getfield:int(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u56bd\uae87\u4492\u9af2\u5245\u52d3, this:\uc84e\u3dd3\u98a4\u52d3\u4daf))
            putfield:int(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u56bd\uae87\u4492\u9af2\u5245\u52d3, this:\uc84e\u3dd3\u98a4\u52d3\u4daf, ldc:int(-1))
            invokespecial:void(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8bb0\u9033\u5d20\u5db4\u0a06\ud51e, this:\uc84e\u3dd3\u98a4\u52d3\u4daf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u3e2a\ua068\u873d\ubff1\ud158\u3776(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u4f52\u3e2a\u6c52\ua068\u7049\u8aa5() {
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
            return:Logger(getstatic:Logger(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u3bc9\u98a4\u392e\uc3e3\u7873\u183a))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u97e6\ub7dc\uae5d\u64ab\u3c25\u3d64(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0, boolean p1) {
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
            return:boolean(putfield:boolean(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u9a18\uc4d2\u6d99\ub6ab\u51fa\u71ae, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf, p1:boolean))
        }
        
        goto(Label_0006)
    }
    
    public static \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u0a06\u8df4\ua068\u62da\u69d9 \u983f\u3bd6\u647c\ub171\u4f4a\ub19c(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0) {
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
            return:\u0a06\u8df4\ua068\u62da\u69d9(getfield:\u0a06\u8df4\ua068\u62da\u69d9(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ub32d\u4975\u8258\ua562\u0a06\u7043, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u6c52\u47c2\u1833\u759a\u9a18\u71f1(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public static void \u965f\u9a18\u3e75\uc2e8\u2dcc\ub102(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0, int p1) {
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
            invokespecial:void(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u6fb0\u8709\u647c\ua6bd\u6c56\u527a, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u9255\u6c56\u3a62\u59ec\u3711\ua61f(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 \ubded\u983f\u3504\u4daf\u7049\ucfaf(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0) {
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
            return:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 \ub19c\u93a2\u7043\u3bd6\u7ce1\ub8be(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0) {
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
            return:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 \u3bd6\u3711\u8d90\u5bc4\u3c25\ufe34(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0) {
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
            return:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u839e\uae87\u9255\u0c95\u9af2\u1187() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u5245\uc7fe\u5d20\ub70c\u3bd6\uc29a))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u5654\u0a06\u8c8a\uf94d\ud51e\u4975(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \u527a\u3776\u120d\u183a\uf995\uae5d(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0, net.minecraft.util.text.ITextComponent p1) {
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
            return:ITextComponent(putfield:ITextComponent(\uc84e\u3dd3\u98a4\u52d3\u4daf::\ub18d\u965f\u4c2b\u51b2\u5db4\u071d, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf, p1:ITextComponent))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \uc246\ufcaf\ubded\u67e9\ub171\u97e6() {
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
            return:ITextComponent(getstatic:ITextComponent(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8258\u3bc9\u5d20\u67d0\u40a9\u759a))
        }
        
        goto(Label_0006)
    }
    
    public static void \ubefe\u40a9\u6fb0\u99f7\u0800\u8df4(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0, int p1) {
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
            invokespecial:void(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u4c04\ub1b9\u946b\ufcaf\ud4fe\uc4d2, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u67e9\u6bb9\u7330\ua562\ud36e\u40a9() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc84e\u3dd3\u98a4\u52d3\u4daf::\uae5d\u4d85\u98a4\u5db4\u527a\ua6bd))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u5bc4\u120d\uf94d\u759a\u9937\u5db4(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \uc229\u4bc8\u8bb0\uc2bd\u9033\u6c56() {
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
            return:ITextComponent(getstatic:ITextComponent(\uc84e\u3dd3\u98a4\u52d3\u4daf::\uc31c\u6bb9\u120d\u960f\u9255\u9937))
        }
        
        goto(Label_0006)
    }
    
    public static void \ubefe\u8d90\u7af6\u071d\u8308\uafe7(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0, int p1) {
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
            invokespecial:void(\uc84e\u3dd3\u98a4\u52d3\u4daf::\uc87f\ud217\u7873\u51fa\u718f\u59ec, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u8753\ub83f\u67d0\uceb8\u5db4\u62da(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0, int p1) {
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
            return:int(putfield:int(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u56bd\uae87\u4492\u9af2\u5245\u52d3, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf, p1:int))
        }
        
        goto(Label_0006)
    }
    
    public static void \u416d\u927d\ud158\u494c\ua61f\u3a62(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0) {
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
            invokespecial:void(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8bb0\u9033\u5d20\u5db4\u0a06\ud51e, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_307 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_31A_0 : byte[] [generated]
        stack_3A9_0 : byte[] [generated]
        stack_3E4_0 : byte[] [generated]
        stack_43A_0 : byte[] [generated]
        var_4_2F2 : int
        var_3_2F7 : byte[]
        var_5_2F8 : int
        var_0_310 : int
        expr_31A : byte [generated]
        stack_363_2 : byte [generated]
        stack_340_0 : byte [generated]
        expr_A7 : int [generated]
        var_2_DE : byte[]
        expr_E2 : int [generated]
        var_3_3D2 : byte[]
        var_5_3D3 : int
        expr_109 : int [generated]
        var_3_428 : byte[]
        var_5_429 : int
        expr_43A : byte [generated]
        var_3_142 : String
        expr_14A : String[] [generated]
        expr_154 : String[] [generated]
        var_3_270 : String[]
        
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
        var_0_307 = and:int(ldc:int(954093533), ldc:int(-1349066817))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DE_0 = stack_E0_0 = stack_107_0 = stack_109_0 = stack_136_0 = stack_31A_0 = stack_3A9_0 = stack_3E4_0 = stack_43A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("4xz/+J4ABd4Bd3wkiwNY/fuCfokDA2X/gxz/+J53B14OAP9+I4R7WP37gn6JAwP5HP8EWoaAiHPoAYsc//iddwlfifv8JQMDWP37gn6JAwb+AH+lAHzY/fmD+yl//df7Cwsn/n5eAXd8/4uHpQB82P35g/spf/3X+wsLJnWC34n7/AADh6UAfNj9+YP7K4IH1YB+DgD/fv6E/6UAfNj9+YP7KH0F3AIB/IIDDP/09AWAAPMAiQKn/wPkIXr/4wz/954ABt4Bd3vsiYgVgp94/F79h3gA8wCJAqf/A+Qhev/jDP/3nXcKX4n7++0BiBWCn3j8ZIqG/w==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2F2 = expr_6E:int
        var_3_2F7 = newarray:byte[](byte.class, expr_6E:int)
        var_5_2F8 = expr_6E:int
        Label_0762:
        
        while (cmpne:boolean(and:int(var_0_307:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_310 = and:int(var_0_307:int, ldc:int(-820746337))
            var_5_2F8 = add:int(var_5_2F8:int, ldc:int(-1))
            expr_31A = stack_363_2 = loadelement(stack_31A_0, var_5_2F8)
            
            if (cmplt:boolean(add:int(add:int(var_5_2F8:int, ldc:int(3)), neg:int(var_4_2F2:int)), ldc:int(0))) {
                stack_363_2 = stack_340_0 = add:byte(expr_31A:byte, loadelement:byte(var_3_2F7:byte[], add:int(var_5_2F8:int, ldc:int(3))))
                goto(Label_0848)
            }
            
            Label_0807:
            
            if (cmpne:boolean(and:int(var_0_310:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_310 = and:int(var_0_310:int, ldc:int(-753906678))
            }
            else {
                var_0_310 = and:int(var_0_310:int, ldc:int(430690077))
                stack_363_2 = stack_340_0 = add:byte(expr_31A:byte, ldc:byte(3))
            }
            
            Label_0848:
            
            if (cmpeq:boolean(and:int(var_0_310:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0807)
            }
            
            var_0_307 = and:int(var_0_310:int, ldc:int(959764447))
            storeelement:byte(var_3_2F7:byte[], var_5_2F8:int, stack_363_2:byte)
            
            if (cmpne:boolean(var_5_2F8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_107_0 = stack_109_0 = stack_136_0 = stack_31A_0 = stack_3A9_0 = stack_3E4_0 = stack_43A_0 = var_3_2F7:byte[]
            goto(Label_0115)
        }
        
        var_0_307 = and:int(var_0_307:int, ldc:int(-1928745357))
        Label_0905:
        
        while (cmpeq:boolean(and:int(var_0_307:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_307 = and:int(var_0_307:int, ldc:int(2085777180))
            var_5_2F8 = add:int(var_5_2F8:int, ldc:int(-1))
            storeelement:byte(var_3_2F7:byte[], var_5_2F8:int, add:byte(loadelement:byte(stack_3A9_0:byte[], var_5_2F8:int), ldc:byte(30)))
            
            if (cmpne:boolean(var_5_2F8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_107_0 = stack_109_0 = stack_136_0 = stack_31A_0 = stack_3A9_0 = stack_3E4_0 = stack_43A_0 = var_3_2F7:byte[]
            goto(Label_0172)
        }
        
        var_0_307 = and:int(var_0_307:int, ldc:int(-319683065))
        goto(Label_0762)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_307:int, ldc:int(512)), ldc:int(0))) {
            var_0_307 = and:int(var_0_307:int, ldc:int(587844379))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_307:int, ldc:int(16)), ldc:int(0))) {
            var_0_307 = and:int(var_0_307:int, ldc:int(-1918427167))
            goto(Label_0231)
        }
        
        if (cmpne:boolean(and:int(var_0_307:int, ldc:int(16)), ldc:int(0))) {
            var_0_307 = and:int(var_0_307:int, ldc:int(1792960381))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_2F2 = expr_A7:int
                var_3_2F7 = newarray:byte[](byte.class, expr_A7:int)
                var_5_2F8 = expr_A7:int
                goto(Label_0905)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_307:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_307:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_307 = and:int(var_0_307:int, ldc:int(500982324))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_307:int, ldc:int(16)), ldc:int(0))) {
                var_0_307 = and:int(var_0_307:int, ldc:int(1276052154))
                goto(Label_0115)
            }
            
            var_0_307 = and:int(var_0_307:int, ldc:int(-590944449))
            var_2_DE = stack_DE_0:byte[]
            expr_E2 = add:int(arraylength:int(stack_E0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                var_3_3D2 = newarray:byte[](byte.class, expr_E2:int)
                var_5_3D3 = expr_E2:int
                
                loop {
                    var_0_307 = and:int(var_0_307:int, ldc:int(-581632228))
                    var_5_3D3 = add:int(var_5_3D3:int, ldc:int(-1))
                    storeelement:byte(var_3_3D2:byte[], var_5_3D3:int, add:int(shl:int(loadelement:byte(stack_3E4_0:byte[], var_5_3D3:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_DE:byte[], add:int(var_5_3D3:int, xor:int(ldc:int(132), ldc:int(133)))), ldc:int(3)), xor:int(ldc:int(2139), ldc:int(2116)))))
                    
                    if (cmpne:boolean(var_5_3D3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_107_0 = stack_109_0 = stack_136_0 = stack_31A_0 = stack_3A9_0 = stack_3E4_0 = stack_43A_0 = var_3_3D2:byte[]
            }
        }
        
        Label_0231:
        
        if (cmpne:boolean(and:int(var_0_307:int, ldc:int(16)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_307:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_307:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_307 = and:int(var_0_307:int, ldc:int(-1388089378))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_3_428 = newarray:byte[](byte.class, expr_109:int)
                var_5_429 = expr_109:int
                
                loop {
                    var_0_307 = and:int(var_0_307:int, ldc:int(-1380255908))
                    var_5_429 = add:int(var_5_429:int, ldc:int(-1))
                    expr_43A = loadelement:byte(stack_43A_0:byte[], var_5_429:int)
                    storeelement:byte(var_3_428:byte[], var_5_429:int, xor:int(or:int(and:int(shl:int(expr_43A:byte, xor:int(ldc:int(1057), ldc:int(1061))), ldc:int(-16)), and:int(shr:int(expr_43A:byte[expected:int], and:int(ldc:int(11781), ldc:int(16540))), ldc:int(15))), ldc:int(41)))
                    
                    if (cmpne:boolean(var_5_429:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_107_0 = stack_109_0 = stack_136_0 = stack_31A_0 = stack_3A9_0 = stack_3E4_0 = stack_43A_0 = var_3_428:byte[]
            }
        }
        
        Label_0270:
        
        if (cmpeq:boolean(and:int(var_0_307:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0231)
        }
        
        if (cmpne:boolean(and:int(var_0_307:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_307 = and:int(var_0_307:int, ldc:int(-582511787))
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_307:int, ldc:int(16)), ldc:int(0))) {
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_14A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(267), ldc:int(18954)))
            expr_154 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17419), ldc:int(17409)))
            storeelement:String(expr_154:String[], xor:int(ldc:int(2880), ldc:int(2885)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(3409), ldc:int(-3410)), xor:int(ldc:int(-32753), ldc:int(-32745))))
            storeelement:String(expr_154:String[], and:int(ldc:int(15232), ldc:int(-15233)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(19516), ldc:int(90)), xor:int(ldc:int(-20431), ldc:int(-20469))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(14337), ldc:int(14341)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(12346), ldc:int(2366)), xor:int(ldc:int(3084), ldc:int(3166))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(-20479), ldc:int(-20480)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(883), ldc:int(5206)), xor:int(ldc:int(-31106), ldc:int(-31211))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(8712), ldc:int(8714)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(29803), ldc:int(639)), and:int(ldc:int(900), ldc:int(15502))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(16521), ldc:int(8475)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(4206), ldc:int(4330)), xor:int(ldc:int(357), ldc:int(508))))
            storeelement:String(expr_154:String[], and:int(ldc:int(7239), ldc:int(24835)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(221), ldc:int(4761)), and:int(ldc:int(8427), ldc:int(174))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(16395), ldc:int(16397)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1194), ldc:int(17082)), and:int(ldc:int(1206), ldc:int(17137))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(3111), ldc:int(20743)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(4784), ldc:int(18682)), and:int(ldc:int(20691), ldc:int(3551))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(-15803), ldc:int(-15795)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1243), ldc:int(27091)), and:int(ldc:int(4342), ldc:int(16886))))
            putstatic:String[](\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8350\u8413\ud51e\u16f6\u6b0d\u69d9, expr_154:String[])
            var_3_270 = expr_14A:String[]
            putstatic:Logger(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u3bc9\u98a4\u392e\uc3e3\u7873\u183a, invokestatic:Logger(LogManager::getLogger))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u5245\uc7fe\u5d20\ub70c\u3bd6\uc29a, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_270:String[], xor:int(ldc:int(20866), ldc:int(20868))), loadelement:String(var_3_270:String[], and:int(ldc:int(4231), ldc:int(351)))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc84e\u3dd3\u98a4\u52d3\u4daf::\uae5d\u4d85\u98a4\u5db4\u527a\ua6bd, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_270:String[], and:int(ldc:int(134), ldc:int(542))), loadelement:String(var_3_270:String[], and:int(ldc:int(300), ldc:int(2265)))))
            putstatic:ITextComponent(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u5f50\uc3e3\u64ab\u4e72\ub171\u40a9, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_270:String[], xor:int(ldc:int(-26604), ldc:int(-26595)))))
            putstatic:ITextComponent(\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8258\u3bc9\u5d20\u67d0\u40a9\u759a, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8350\u8413\ud51e\u16f6\u6b0d\u69d9), xor:int(ldc:int(8448), ldc:int(8449)))))
            putstatic:ITextComponent(\uc84e\u3dd3\u98a4\u52d3\u4daf::\uc31c\u6bb9\u120d\u960f\u9255\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\uc84e\u3dd3\u98a4\u52d3\u4daf::\u8350\u8413\ud51e\u16f6\u6b0d\u69d9), xor:int(ldc:int(16411), ldc:int(16409)))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B1 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6BC : int
        
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
        var_3_6B1 = and:int(ldc:int(1481518612), ldc:int(1792998964))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc84e\u3dd3\u98a4\u52d3\u4daf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-648120041))
            var_5_81 = and:int(ldc:int(5984), ldc:int(-5985))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32578), ldc:int(31489)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6B1:int, ldc:int(-883953700))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(2112), ldc:int(2113)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(151), ldc:int(23073)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6B1 = and:int(var_3_D1:int, ldc:int(1571810422))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(8776), ldc:int(8777)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1484990228))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1177155870))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-402365286))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1565587660))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-429617747))
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1160097170))
                    }
                    else {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2076175607))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1763117818))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1098334533))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1075347181))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(602885793))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(227738669))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1733160333))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1330539167))
                        var_11_E2 = and:int(ldc:int(-8630), ldc:int(8597))
                        goto(Label_1562)
                    }
                    
                    Label_0604:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1010367234))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1150538453))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1876784778))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-97933736))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1138436672))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-541185833))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-150621964))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-49337668))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1589671345))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(896945343))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(868319769))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(102785626))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1918080234))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1889035177))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1775145394))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2127473309))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(8457), ldc:int(193))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(209534637))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-116181165))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(899892114))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1877895318))
                        var_11_E2 = and:int(ldc:int(23156), ldc:int(-24183))
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1892052644))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(531984995))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1069296605))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(900093713))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1875869151))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1581421337))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2041715553))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-320419165))
                            goto(Label_1146)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1323951164))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-617627721))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2059665982))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1480803817))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(603166132))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(707227710))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1726210223))
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1636608747))
                        loopcontinue()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1511930358))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BC = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-257416513))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1196351532))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1258303104))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1894943863))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1818301171))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(724720544))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-83306))
                        var_17_6BC = add:int(var_16_110:int, xor:int(ldc:int(-28663), ldc:int(-28664)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(565712880))
                }
                
                var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1754213973))
                
                if (cmple:boolean(var_5_81 = var_17_6BC:int, sub:int(var_6_88:int, and:int(ldc:int(12297), ldc:int(2597))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
