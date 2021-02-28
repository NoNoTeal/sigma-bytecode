public class \u12b2\u7049\u8df4\uc9f6\uae87.\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T> {
    public void \u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T> p0) {
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
            invokespecial:Object(Object::<init>, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>)
            putfield:Map<T, \u6435\u5d20\u071d\u5fe1\ubded\ud171<T>>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd::\u7ce1\u624e\ua068\u3d64\ua3b4\u7043, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>, initobject:IdentityHashMap<T, \u6435\u5d20\u071d\u5fe1\ubded\ud171<T>>[expected:Map<T, \u6435\u5d20\u071d\u5fe1\ubded\ud171<T>>](IdentityHashMap<K, V>::<init>))
            putfield:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd::\u0b8e\ub171\u40a9\u4975\u4bc8\ub83f, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4c04\u9af2\uc4d2\uc4d2\u1187\u839e(T p0) {
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
            return:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<T, \u6435\u5d20\u071d\u5fe1\ubded\ud171<T>>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd::\u7ce1\u624e\ua068\u3d64\ua3b4\u7043, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>), p0:T[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u6435\u5d20\u071d\u5fe1\ubded\ud171<T> \u0800\ufcaf\ucfaf\ub1b9\u8709\u446c(T p0, \u51fa\u12cb\u7330\u74b1\u6c52.\uf94d\u071d\u760c\u9937\u0800\ua6bd p1) {
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
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T> \ubefe\u7e3f\u7af6\u071d\uc229\u416d() {
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
            return:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>(getfield:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd::\u0b8e\ub171\u40a9\u4975\u4bc8\ub83f, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Iterator<\u5d20\u7043\u88c5\u5db4\uf94d.\u6435\u5d20\u071d\u5fe1\ubded\ud171<T>> iterator() {
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
            return:Iterator<\u6435\u5d20\u071d\u5fe1\ubded\ud171<T>>(invokeinterface:Iterator<\u6435\u5d20\u071d\u5fe1\ubded\ud171<T>>(Collection<\u6435\u5d20\u071d\u5fe1\ubded\ud171<T>>::iterator, invokeinterface:Collection<\u6435\u5d20\u071d\u5fe1\ubded\ud171<T>>(Map<T, \u6435\u5d20\u071d\u5fe1\ubded\ud171<T>>::values, getfield:Map<T, \u6435\u5d20\u071d\u5fe1\ubded\ud171<T>>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd::\u7ce1\u624e\ua068\u3d64\ua3b4\u7043, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>))))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u6435\u5d20\u071d\u5fe1\ubded\ud171<T> \u0800\ufcaf\ucfaf\ub1b9\u8709\u446c(T p0) {
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
            return:\u6435\u5d20\u071d\u5fe1\ubded\ud171<T>(invokevirtual:\u6435\u5d20\u071d\u5fe1\ubded\ud171<T>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>::\u0800\ufcaf\ucfaf\ub1b9\u8709\u446c, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>, p0:T, getstatic:\uf94d\u071d\u760c\u9937\u0800\ua6bd(\uf94d\u071d\u760c\u9937\u0800\ua6bd::\u71f1\u946b\u494c\u6198\u446c\ucfaf)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u7e3f\uc29a\u97e6\u51fa\u983f\u12cb() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd::\u183a\ubcb0\u98a4\u4bc8\u4bc8\u62da), and:int(ldc:int(-27197), ldc:int(27188)))), invokevirtual:String(String::replace, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u12cb\uc31c\u12cb\ucb79\u98a4\u59ec), this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>)), ldc:char(58), ldc:char(46)))))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u156b\u516c\u0b8e\uceb8\u7af6\u8cae() {
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
            
            if (cmpeq:boolean(getfield:ITextComponent(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd::\u59ec\u64f2\u9a18\uc229\u6435\ub113, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>), aconstnull:ITextComponent())) {
                putfield:ITextComponent(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd::\u59ec\u64f2\u9a18\uc229\u6435\ub113, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, invokevirtual:String(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>::\u7e3f\uc29a\u97e6\u51fa\u983f\u12cb, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>)))
            }
            
            return:ITextComponent(getfield:ITextComponent(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd::\u59ec\u64f2\u9a18\uc229\u6435\ub113, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>))
        }
        
        goto(Label_0006)
    }
    
    private \u5d20\u7043\u88c5\u5db4\uf94d.\u6435\u5d20\u071d\u5fe1\ubded\ud171 lambda$\uc910\u3a62\uf94d\u385b\u3a62\ub7dc$0(\u51fa\u12cb\u7330\u74b1\u6c52.\uf94d\u071d\u760c\u9937\u0800\ua6bd p0, java.lang.Object p1) {
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
            return:\u6435\u5d20\u071d\u5fe1\ubded\ud171(initobject:\u6435\u5d20\u071d\u5fe1\ubded\ud171(\u6435\u5d20\u071d\u5fe1\ubded\ud171<T>::<init>, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>, p1:Object[expected:T], p0:\uf94d\u071d\u760c\u9937\u0800\ua6bd))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_218 : int
        expr_6B : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_CD_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_10F_0 : byte[] [generated]
        stack_111_0 : byte[] [generated]
        stack_143_0 : byte[] [generated]
        stack_145_0 : byte[] [generated]
        stack_174_0 : byte[] [generated]
        stack_1DE_0 : byte[] [generated]
        stack_231_0 : byte[] [generated]
        stack_2BF_0 : byte[] [generated]
        stack_2F9_0 : byte[] [generated]
        stack_34E_0 : byte[] [generated]
        var_4_1BA : int
        var_3_1BF : byte[]
        var_5_1C0 : int
        var_0_249 : int
        expr_231 : byte [generated]
        stack_275_2 : byte [generated]
        stack_24C_0 : byte [generated]
        expr_A5 : int [generated]
        expr_CF : int [generated]
        var_2_10F : byte[]
        expr_113 : int [generated]
        var_3_2E8 : byte[]
        var_5_2E9 : int
        expr_145 : int [generated]
        var_3_33D : byte[]
        var_5_33E : int
        expr_34E : byte [generated]
        var_3_180 : String
        stack_1B3_0 : String[] [generated]
        expr_192 : String[] [generated]
        
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
        var_0_218 = and:int(ldc:int(-1613003497), ldc:int(-18148061))
        expr_6B = arraylength:int(stack_A3_0 = stack_A5_0 = stack_CD_0 = stack_CF_0 = stack_10F_0 = stack_111_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1DE_0 = stack_231_0 = stack_2BF_0 = stack_2F9_0 = stack_34E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("kmFnb18t+HTyfxw=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1BA = expr_6B:int
        var_3_1BF = newarray:byte[](byte.class, expr_6B:int)
        var_5_1C0 = expr_6B:int
        Label_0450:
        
        while (cmpne:boolean(and:int(var_0_218:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0525)
            }
            
            var_0_218 = and:int(var_0_218:int, ldc:int(-159648409))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, add:byte(loadelement:byte(stack_1DE_0:byte[], var_5_1C0:int), ldc:byte(25)))
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_CD_0 = stack_CF_0 = stack_10F_0 = stack_111_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1DE_0 = stack_231_0 = stack_2BF_0 = stack_2F9_0 = stack_34E_0 = var_3_1BF:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0667)
        Label_0525:
        
        while (cmpne:boolean(and:int(var_0_218:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0450)
            }
            
            var_0_249 = and:int(var_0_218:int, ldc:int(-1219814061))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            expr_231 = stack_275_2 = loadelement(stack_231_0, var_5_1C0)
            
            if (cmplt:boolean(add:int(add:int(var_5_1C0:int, ldc:int(5)), neg:int(var_4_1BA:int)), ldc:int(0))) {
                stack_275_2 = stack_24C_0 = add:byte(expr_231:byte, loadelement:byte(var_3_1BF:byte[], add:int(var_5_1C0:int, ldc:int(5))))
                goto(Label_0604)
            }
            
            Label_0574:
            
            if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(262144)), ldc:int(0))) {
                var_0_249 = and:int(var_0_249:int, ldc:int(-1756391557))
                stack_275_2 = stack_24C_0 = add:byte(expr_231:byte, ldc:byte(5))
            }
            
            Label_0604:
            
            if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(1024)), ldc:int(0))) {
                var_0_249 = and:int(var_0_249:int, ldc:int(796093929))
                goto(Label_0574)
            }
            
            var_0_218 = and:int(var_0_249:int, ldc:int(-1235260033))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, stack_275_2:byte)
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_CD_0 = stack_CF_0 = stack_10F_0 = stack_111_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1DE_0 = stack_231_0 = stack_2BF_0 = stack_2F9_0 = stack_34E_0 = var_3_1BF:byte[]
            goto(Label_0170)
        }
        
        var_0_218 = and:int(var_0_218:int, ldc:int(-120399212))
        Label_0667:
        
        while (cmpne:boolean(and:int(var_0_218:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0450)
            }
            
            var_0_218 = and:int(var_0_218:int, ldc:int(-1216731377))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, xor:byte(loadelement:byte(stack_2BF_0:byte[], var_5_1C0:int), ldc:byte(42)))
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_CD_0 = stack_CF_0 = stack_10F_0 = stack_111_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1DE_0 = stack_231_0 = stack_2BF_0 = stack_2F9_0 = stack_34E_0 = var_3_1BF:byte[]
            goto(Label_0212)
        }
        
        var_0_218 = and:int(var_0_218:int, ldc:int(914792991))
        goto(Label_0525)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(524288)), ldc:int(0))) {
            var_0_218 = and:int(var_0_218:int, ldc:int(31216060))
            goto(Label_0330)
        }
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(1024)), ldc:int(0))) {
            var_0_218 = and:int(var_0_218:int, ldc:int(119657076))
            goto(Label_0212)
        }
        
        if (cmpne:boolean(and:int(var_0_218:int, ldc:int(1024)), ldc:int(0))) {
            var_0_218 = and:int(var_0_218:int, ldc:int(-153121365))
            expr_A5 = arraylength:int(stack_A5_0:byte[])
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_4_1BA = expr_A5:int
                var_3_1BF = newarray:byte[](byte.class, expr_A5:int)
                var_5_1C0 = expr_A5:int
                goto(Label_0525)
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_0_218:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0330)
        }
        
        if (cmpne:boolean(and:int(var_0_218:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_218:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_218 = and:int(var_0_218:int, ldc:int(-1211228281))
            expr_CF = arraylength:int(stack_CF_0:byte[])
            
            if (cmpne:boolean(expr_CF:int, ldc:int(0))) {
                var_4_1BA = expr_CF:int
                var_3_1BF = newarray:byte[](byte.class, expr_CF:int)
                var_5_1C0 = expr_CF:int
                goto(Label_0667)
            }
        }
        
        Label_0212:
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0330)
        }
        
        if (cmpne:boolean(and:int(var_0_218:int, ldc:int(32)), ldc:int(0))) {
            var_0_218 = and:int(var_0_218:int, ldc:int(302815856))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(524288)), ldc:int(0))) {
                var_0_218 = and:int(var_0_218:int, ldc:int(746346313))
                goto(Label_0170)
            }
            
            if (cmpne:boolean(and:int(var_0_218:int, ldc:int(8)), ldc:int(0))) {
                var_0_218 = and:int(var_0_218:int, ldc:int(1912370716))
                goto(Label_0112)
            }
            
            var_0_218 = and:int(var_0_218:int, ldc:int(-1619056721))
            var_2_10F = stack_10F_0:byte[]
            expr_113 = add:int(arraylength:int(stack_111_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_113:int, ldc:int(0))) {
                var_3_2E8 = newarray:byte[](byte.class, expr_113:int)
                var_5_2E9 = expr_113:int
                
                loop {
                    var_0_218 = and:int(var_0_218:int, ldc:int(-1755379849))
                    var_5_2E9 = add:int(var_5_2E9:int, ldc:int(-1))
                    storeelement:byte(var_3_2E8:byte[], var_5_2E9:int, add:int(shl:int(loadelement:byte(stack_2F9_0:byte[], var_5_2E9:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_10F:byte[], add:int(var_5_2E9:int, xor:int(ldc:int(5120), ldc:int(5121)))), ldc:int(3)), xor:int(ldc:int(2824), ldc:int(2839)))))
                    
                    if (cmpne:boolean(var_5_2E9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_CD_0 = stack_CF_0 = stack_10F_0 = stack_111_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1DE_0 = stack_231_0 = stack_2BF_0 = stack_2F9_0 = stack_34E_0 = var_3_2E8:byte[]
            }
        }
        
        Label_0280:
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_218:int, ldc:int(128)), ldc:int(0))) {
                var_0_218 = and:int(var_0_218:int, ldc:int(352973855))
                goto(Label_0212)
            }
            
            if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0170)
            }
            
            if (cmpne:boolean(and:int(var_0_218:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_218 = and:int(var_0_218:int, ldc:int(-16890529))
            expr_145 = arraylength:int(stack_145_0:byte[])
            
            if (cmpne:boolean(expr_145:int, ldc:int(0))) {
                var_3_33D = newarray:byte[](byte.class, expr_145:int)
                var_5_33E = expr_145:int
                
                loop {
                    var_0_218 = and:int(var_0_218:int, ldc:int(-142696553))
                    var_5_33E = add:int(var_5_33E:int, ldc:int(-1))
                    expr_34E = loadelement:byte(stack_34E_0:byte[], var_5_33E:int)
                    storeelement:byte(var_3_33D:byte[], var_5_33E:int, or:int(and:int(shl:int(expr_34E:byte, and:int(ldc:int(22548), ldc:int(9348))), ldc:int(-16)), and:int(shr:int(expr_34E:byte[expected:int], xor:int(ldc:int(17491), ldc:int(17495))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_33E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_CD_0 = stack_CF_0 = stack_10F_0 = stack_111_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1DE_0 = stack_231_0 = stack_2BF_0 = stack_2F9_0 = stack_34E_0 = var_3_33D:byte[]
            }
        }
        
        Label_0330:
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0212)
        }
        
        if (cmpne:boolean(and:int(var_0_218:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_218 = and:int(var_0_218:int, ldc:int(-388818351))
            goto(Label_0170)
        }
        
        if (cmpne:boolean(and:int(var_0_218:int, ldc:int(1024)), ldc:int(0))) {
            var_3_180 = initobject:String(String::<init>, stack_174_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1B3_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32176), ldc:int(-32175)))
            expr_192 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(673), ldc:int(17413)))
            storeelement:String(expr_192:String[], and:int(ldc:int(20757), ldc:int(-29982)), invokevirtual:String[expected:String](String::substring, var_3_180:String, and:int(ldc:int(7499), ldc:int(-8016)), and:int(ldc:int(570), ldc:int(11530))))
            putstatic:String[](\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd::\u183a\ubcb0\u98a4\u4bc8\u4bc8\u62da, expr_192:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u416d\ub83f\u4f4a\ufe34\u12b2\u6ec6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_674 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_67F : int
        
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
        var_3_674 = and:int(ldc:int(-553969457), ldc:int(-1345594145))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
            var_3_674 = and:int(var_3_674:int, ldc:int(-21775537))
            var_5_80 = and:int(ldc:int(31856), ldc:int(-32113))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10008), ldc:int(9751)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_674:int, ldc:int(-1348740771))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, and:int(ldc:int(5829), ldc:int(18689)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(129), ldc:int(5193)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_674 = and:int(var_3_D8:int, ldc:int(-1879343747))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(2626), ldc:int(2627)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1906475448))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(888979907))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-470499741))
                    }
                    else {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1616921107))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1934237150))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(276558845))
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1676772838))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-548855942))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-555615491))
                        var_11_E9 = and:int(ldc:int(-4067), ldc:int(3554))
                        goto(Label_1533)
                    }
                    
                    Label_0559:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2089924758))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(237761615))
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-151807933))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1491585169))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-425860417))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-6186897))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0686:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1419234345))
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1753297653))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1744101291))
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-132749335))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(872530515))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1362396163))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0822:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-964838350))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-856045252))
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(236987369))
                        goto(Label_1120)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-873136419))
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(381615814))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1611031729))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = and:int(ldc:int(4737), ldc:int(8193))
                                goto(Label_1120)
                            }
                        }
                    }
                    
                    Label_0954:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1561196332))
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1969028931))
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(827113137))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1444089881))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1927380317))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-273991457))
                        var_11_E9 = and:int(ldc:int(23396), ldc:int(-23397))
                    }
                    
                    Label_1120:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1350987688))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-583154047))
                            goto(Label_0954)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1235544197))
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-739584775))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1097614465))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1383)
                            }
                        }
                    }
                    
                    Label_1241:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2108471699))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1695315194))
                            goto(Label_1120)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-266320002))
                            goto(Label_0954)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-548010778))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1194217347))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1902011569))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                            goto(Label_1533)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1383:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-933052281))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(901082995))
                        goto(Label_0954)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-795934425))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2127862708))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(637143488))
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(328047137))
                        loopcontinue()
                    }
                    
                    var_3_674 = and:int(var_3_674:int, ldc:int(-1629520145))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1533:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67F = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1544:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-460645979))
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(64)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(467381678))
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1849156274))
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-829055011))
                        var_17_67F = add:int(var_16_117:int, xor:int(ldc:int(2112), ldc:int(2113)))
                        looporswitchbreak()
                    }
                    
                    var_3_674 = and:int(var_3_674:int, ldc:int(-167311748))
                }
                
                var_3_674 = and:int(var_3_674:int, ldc:int(-7112499))
                
                if (cmple:boolean(var_5_80 = var_17_67F:int, sub:int(var_6_87:int, xor:int(ldc:int(21760), ldc:int(21761))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_674 = and:int(var_3_674:int, ldc:int(-878478499))
            goto(Label_0108)
        }
    }
}
