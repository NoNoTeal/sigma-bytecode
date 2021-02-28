public class \u5d20\u97b7\u8753\u873d\u16f6.\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d {
    public void \ub83f\u156b\ud7e8\u0c95\u47c2\ub32d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7e3f\ubff1\u718f\ub171\u72f1 p0, java.util.function.Consumer<java.util.Optional<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7e3f\ubff1\u718f\ub171\u72f1>> p1) {
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
            invokespecial:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::<init>, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\ua61f\u6c56\u7c6b\u51fa\u67d0\ucfaf), and:int(ldc:int(-22841), ldc:int(22840)))))
            putfield:Set<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\ua6bd\u946b\ub6ab\u69d9\uf9c5\ud7e8, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, invokestatic:HashSet[expected:Set<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>](Sets::newHashSet))
            putfield:\u7e3f\ubff1\u718f\ub171\u72f1(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u59ec\u7049\u4daf\uc238\u5db4\u6fb0, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, p0:\u7e3f\ubff1\u718f\ub171\u72f1)
            putfield:Consumer<Optional<\u7e3f\ubff1\u718f\ub171\u72f1>>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u760c\u51b2\u2dcc\u3e2a\u960f\ubb2b, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, p1:Consumer<Optional<\u7e3f\ubff1\u718f\ub171\u72f1>>)
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
    
    public void \u760c\ud51e\u3e2a\uc910\uc7fe\u71ae() {
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d)), and:int[expected:boolean](ldc:int(1675), ldc:int(-1676)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubf56\u64ab\u97e6\u7d52\ufe34\u6cfe() {
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
            invokeinterface:void(Consumer<Optional<\u7e3f\ubff1\u718f\ub171\u72f1>>::accept, getfield:Consumer<Optional<\u7e3f\ubff1\u718f\ub171\u72f1>>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u760c\u51b2\u2dcc\u3e2a\u960f\ubb2b, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), invokestatic:Optional<\u7e3f\ubff1\u718f\ub171\u72f1>(Optional<T>::empty))
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
            putfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u6b5f\u52d3\u183a\u527a\u67d0\ub113, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, aconstnull:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>())
            invokevirtual:void(\u3e75\u8753\u61a4\uc31c\u946b\u72f1::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u3e75\u8753\u61a4\uc31c\u946b\u72f1(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u8258\u8d98\u946b\u64f2\u8d98\u494c, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), getfield:ITextComponent(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\ud36e\uafe7\ubf56\uc229\u51b2\u8413, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), div:int(getfield:int(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), and:int(ldc:int(1031), ldc:int(12610))), ldc:int(20), ldc:int(16777215))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            
            if (cmpne:boolean(getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u6b5f\u52d3\u183a\u527a\u67d0\ub113, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), aconstnull:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>())) {
                invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u6b0d\ud12e\u760c\u6d99\u7873\u3bc9, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u6b5f\u52d3\u183a\u527a\u67d0\ub113, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), p1:int, p2:int)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uf94d\u8df4\u760c\ua068\ua068\u960f(java.util.List<\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d> p0) {
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
            putfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u6b5f\u52d3\u183a\u527a\u67d0\ub113, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, p0:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u1187\u760c\u946b\u4f4a\u3d4b\u6bb9() {
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
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u4975\u92ff\u5db4\u527a\ucef1\u836c, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), invokeinterface:boolean(Set<E>::isEmpty, getfield:Set<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\ua6bd\u946b\ub6ab\u69d9\uf9c5\ud7e8, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud158\u7bad\u8df4\uc238\u52d3\u960f(\u51fa\u12cb\u7330\u74b1\u6c52.\u8389\ub18d\u494c\u1833\ub8be\u6cfe p0) {
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
            invokeinterface:boolean(Set<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>::add, getfield:Set<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\ua6bd\u946b\ub6ab\u69d9\uf9c5\ud7e8, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), p0:\u8389\ub18d\u494c\u1833\ub8be\u6cfe)
            invokespecial:void(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u1187\u760c\u946b\u4f4a\u3d4b\u6bb9, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4179\u385b\u4cd9\uceb8\u71ae\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u8389\ub18d\u494c\u1833\ub8be\u6cfe p0) {
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
            invokeinterface:boolean(Set<E>::remove, getfield:Set<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\ua6bd\u946b\ub6ab\u69d9\uf9c5\ud7e8, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), p0:\u8389\ub18d\u494c\u1833\ub8be\u6cfe[expected:Object])
            invokespecial:void(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u1187\u760c\u946b\u4f4a\u3d4b\u6bb9, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3bc9\u8cae\u392e\u5245\uc7fe\u61a4$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokeinterface:void(Consumer<Optional<\u7e3f\ubff1\u718f\ub171\u72f1>>::accept, getfield:Consumer<Optional<\u7e3f\ubff1\u718f\ub171\u72f1>>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u760c\u51b2\u2dcc\u3e2a\u960f\ubb2b, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), invokestatic:Optional<\u7e3f\ubff1\u718f\ub171\u72f1>(Optional<T>::of, getfield:\u7e3f\ubff1\u718f\ub171\u72f1(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u59ec\u7049\u4daf\uc238\u5db4\u6fb0, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u67e9\u3bd6\u385b\u7330\uf995\ub32d$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokeinterface:void(Consumer<Optional<\u7e3f\ubff1\u718f\ub171\u72f1>>::accept, getfield:Consumer<Optional<\u7e3f\ubff1\u718f\ub171\u72f1>>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u760c\u51b2\u2dcc\u3e2a\u960f\ubb2b, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d), invokestatic:Optional<\u7e3f\ubff1\u718f\ub171\u72f1>(Optional<T>::empty))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9a18\u6198\u5654\u59ec\uae5d\u385b(\u5d20\u97b7\u8753\u873d\u16f6.\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d p0, java.util.List p1) {
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
            invokespecial:void(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\uf94d\u8df4\u760c\ua068\ua068\u960f, p0:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, p1:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9033\u88c5\u67d0\u7006\u51fa\u51fa(\u5d20\u97b7\u8753\u873d\u16f6.\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u8389\ub18d\u494c\u1833\ub8be\u6cfe p1) {
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
            invokespecial:void(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u4179\u385b\u4cd9\uceb8\u71ae\u97b7, p0:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, p1:\u8389\ub18d\u494c\u1833\ub8be\u6cfe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ua61f\uc31c\ud158\u8389\u120d\u8c8a(\u5d20\u97b7\u8753\u873d\u16f6.\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u8389\ub18d\u494c\u1833\ub8be\u6cfe p1) {
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
            invokespecial:void(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\ud158\u7bad\u8df4\uc238\u52d3\u960f, p0:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, p1:\u8389\ub18d\u494c\u1833\ub8be\u6cfe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_19C : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9F_0 : byte[] [generated]
        stack_A1_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_C0_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_1AF_0 : byte[] [generated]
        stack_211_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_136 : byte[]
        var_4_137 : int
        expr_A1 : int [generated]
        var_5_187 : int
        var_3_18C : byte[]
        var_4_18D : int
        expr_1B2 : byte [generated]
        var_0_207 : int
        expr_211 : byte [generated]
        stack_241_2 : byte [generated]
        expr_C0 : int [generated]
        var_3_FA : String
        stack_12D_0 : String[] [generated]
        expr_10C : String[] [generated]
        
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
            var_0_19C = and:int(ldc:int(747578813), ldc:int(-1937264837))
            expr_68 = var_2_6C = stack_9F_0 = stack_A1_0 = stack_BE_0 = stack_C0_0 = stack_EE_0 = stack_1AF_0 = stack_211_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("C3M5HwVPWXtzHplxdfkBCnpEQA=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_136 = newarray:byte[](byte.class, expr_70:int)
                var_4_137 = expr_70:int
                
                loop {
                    var_0_19C = and:int(var_0_19C:int, ldc:int(-1366920773))
                    var_4_137 = add:int(var_4_137:int, ldc:int(-1))
                    storeelement:byte(var_3_136:byte[], var_4_137:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_137:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_137:int, xor:int(ldc:int(1088), ldc:int(1089)))), ldc:int(5)), and:int(ldc:int(9223), ldc:int(4423)))))
                    
                    if (cmpne:boolean(var_4_137:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A1_0 = stack_9F_0 = stack_BE_0 = stack_C0_0 = stack_EE_0 = stack_1AF_0 = stack_211_0 = var_3_136:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_19C:int, ldc:int(64)), ldc:int(0))) {
                    var_0_19C = and:int(var_0_19C:int, ldc:int(2084717211))
                    goto(Label_0197)
                }
                
                if (cmpeq:boolean(and:int(var_0_19C:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_19C = and:int(var_0_19C:int, ldc:int(139411087))
                    goto(Label_0166)
                }
                
                var_0_19C = and:int(var_0_19C:int, ldc:int(-1112046215))
                expr_A1 = arraylength:int(stack_A1_0:byte[])
                
                if (cmpeq:boolean(expr_A1:int, ldc:int(0))) {
                    goto(Label_0166)
                }
                
                var_5_187 = expr_A1:int
                var_3_18C = newarray:byte[](byte.class, expr_A1:int)
                var_4_18D = expr_A1:int
                Label_0399:
                
                while (cmpne:boolean(and:int(var_0_19C:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_19C = and:int(var_0_19C:int, ldc:int(-1631147077))
                    var_4_18D = add:int(var_4_18D:int, ldc:int(-1))
                    expr_1B2 = add:byte(loadelement:byte(stack_1AF_0:byte[], var_4_18D:int), ldc:byte(30))
                    storeelement:byte(var_3_18C:byte[], var_4_18D:int, xor:int(or:int(and:int(shl:int(expr_1B2:byte, and:int(ldc:int(5), ldc:int(1412))), ldc:int(-16)), and:int(shr:int(expr_1B2:byte[expected:int], and:int(ldc:int(7526), ldc:int(16908))), ldc:int(15))), ldc:int(102)))
                    
                    if (cmpne:boolean(var_4_18D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A1_0 = stack_9F_0 = stack_BE_0 = stack_C0_0 = stack_EE_0 = stack_1AF_0 = stack_211_0 = var_3_18C:byte[]
                    goto(Label_0166)
                }
                
                var_0_19C = and:int(var_0_19C:int, ldc:int(1297626068))
                Label_0506:
                
                while (cmpne:boolean(and:int(var_0_19C:int, ldc:int(1)), ldc:int(0))) {
                    var_0_207 = and:int(var_0_19C:int, ldc:int(2095000877))
                    var_4_18D = add:int(var_4_18D:int, ldc:int(-1))
                    expr_211 = loadelement:byte(stack_211_0:byte[], var_4_18D:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_18D:int, ldc:int(3)), neg:int(var_5_187:int)), ldc:int(0))) {
                        var_0_207 = and:int(var_0_207:int, ldc:int(262111737))
                        stack_241_2 = add:byte(expr_211:byte, ldc:byte(3))
                    }
                    else {
                        stack_241_2 = add:byte(expr_211:byte, loadelement:byte(var_3_18C:byte[], add:int(var_4_18D:int, ldc:int(3))))
                    }
                    
                    var_0_19C = and:int(var_0_207:int, ldc:int(-274231809))
                    storeelement:byte(var_3_18C:byte[], var_4_18D:int, stack_241_2:byte)
                    
                    if (cmpne:boolean(var_4_18D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A1_0 = stack_9F_0 = stack_BE_0 = stack_C0_0 = stack_EE_0 = stack_1AF_0 = stack_211_0 = var_3_18C:byte[]
                    goto(Label_0197)
                }
                
                goto(Label_0399)
                Label_0166:
                
                if (cmpeq:boolean(and:int(var_0_19C:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_19C:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_19C = and:int(var_0_19C:int, ldc:int(-571051537))
                    expr_C0 = arraylength:int(stack_C0_0:byte[])
                    
                    if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                        var_5_187 = expr_C0:int
                        var_3_18C = newarray:byte[](byte.class, expr_C0:int)
                        var_4_18D = expr_C0:int
                        goto(Label_0506)
                    }
                }
                
                Label_0197:
                
                if (cmpeq:boolean(and:int(var_0_19C:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_19C = and:int(var_0_19C:int, ldc:int(2021710070))
                    goto(Label_0166)
                }
                
                if (cmpeq:boolean(and:int(var_0_19C:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_19C = and:int(var_0_19C:int, ldc:int(539192599))
            }
            
            var_3_FA = initobject:String(String::<init>, stack_EE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_12D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(33), ldc:int(387)))
            expr_10C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(640), ldc:int(641)))
            storeelement:String(expr_10C:String[], and:int(ldc:int(1760), ldc:int(-1761)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(-16229), ldc:int(3424)), xor:int(ldc:int(3073), ldc:int(3091))))
            putstatic:String[](\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\ua61f\u6c56\u7c6b\u51fa\u67d0\ucfaf, expr_10C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(-1538986446), ldc:int(803138577))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(1386204192))
        }
        else {
            var_3_672 = and:int(var_3_672:int, ldc:int(-410669935))
            var_5_8A = and:int(ldc:int(-1102), ldc:int(1101))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4916), ldc:int(-5046)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_672:int, ldc:int(1953820242))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(16473), ldc:int(10245)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8705), ldc:int(5265)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_DA:int, ldc:int(1062661213))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-32368), ldc:int(-32367)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-982386166))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(501468180))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(777130810))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1190861067))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1518483923))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-273826762))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-159833834))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1410405497))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1704897917))
                        var_11_EB = and:int(ldc:int(-10834), ldc:int(10833))
                        goto(Label_1508)
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-279443389))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1973168911))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1727256068))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(848280349))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1493254544))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1578878510))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-549517472))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(861509949))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1636775526))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1994239796))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(260824686))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-946481214))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(790584832))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1983053403))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(2132), ldc:int(2133))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1203804424))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1794939203))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-290483181))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(13849992))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-928163111))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1381464420))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(793033811))
                        var_11_EB = and:int(ldc:int(-28247), ldc:int(28182))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2106074707))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1624571923))
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1470984019))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1797597505))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1282729246))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1995288368))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1371)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(315986329))
                            goto(Label_1119)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-220479978))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1818750715))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1508)
                    }
                    
                    Label_1371:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1474618333))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1455721419))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1930873431))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(106788104))
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-299126856))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(398040208))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-384954643))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1963347206))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1512088154))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1381150006))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-445141166))
                        var_17_67D = add:int(var_16_119:int, xor:int(ldc:int(8200), ldc:int(8201)))
                        looporswitchbreak()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(76593353))
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(2091887831))
                
                if (cmple:boolean(var_5_8A = var_17_67D:int, sub:int(var_6_91:int, xor:int(ldc:int(25728), ldc:int(25729))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
