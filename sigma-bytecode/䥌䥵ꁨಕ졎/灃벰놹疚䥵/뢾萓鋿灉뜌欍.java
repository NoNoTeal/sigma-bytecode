public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ub8be\u8413\u92ff\u7049\ub70c\u6b0d {
    public void \ub8be\u8413\u92ff\u7049\ub70c\u6b0d(\u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1, java.util.Optional<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ub18d\u6198\u760c\u960f\u494c\u8709> p2, java.util.OptionalLong p3) {
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
            invokespecial:Object(Object::<init>, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)
            putfield:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u3a62\u74b1\u7d52\u9937\u6198\u965f, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, getstatic:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a::\u51b2\u52d3\u446c\u4ab3\ubff1\u8d90))
            putfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u9937\u5654\u6bb9\ud158\ubff1\u0800, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p0:\u7d52\u51fa\u56bd\u76bc\u4975\ub113)
            putfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p1:\u7043\u40a9\u4975\u0800\u385b)
            putfield:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p2:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>)
            putfield:OptionalLong(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u983f\u760c\ufe34\uc246\u965f\u1833, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p3:OptionalLong)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u52d3\u99f7\u92ff\u385b\u3dd3\u36d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 p2) {
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
    
    private void \u120d\u7006\u873d\u5654\u7ce1\u416d(\u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1) {
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
            putfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u9937\u5654\u6bb9\ud158\ubff1\u0800, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p0:\u7d52\u51fa\u56bd\u76bc\u4975\ub113)
            putfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p1:\u7043\u40a9\u4975\u0800\u385b)
            putfield:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, invokestatic:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub18d\u6198\u760c\u960f\u494c\u8709::\u6b5f\u7e3f\ub171\u12b2\u965f\uc29a, p1:\u7043\u40a9\u4975\u0800\u385b))
            putfield:OptionalLong(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u983f\u760c\ufe34\uc246\u965f\u1833, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, invokestatic:OptionalLong(OptionalLong::of, invokevirtual:long(\u7043\u40a9\u4975\u0800\u385b::\ubf56\u071d\u873d\u4c04\u0800\uc29a, p1:\u7043\u40a9\u4975\u0800\u385b)))
            invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\u47c2\u0800\u6435\u97b7\ud12e\u72f1, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ua61f\u7d52\uc2e8\u12cb\u9a18\u5245, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), invokestatic:String(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u0b8e\u759a\u7873\ubcb0\u8709\u72f1, getfield:OptionalLong(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u983f\u760c\ufe34\uc246\u965f\u1833, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u5f50\uc910\u5140\u7330\u8709\uc2bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), invokevirtual:boolean(Optional<T>::isPresent, getfield:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\uc87f\u5140\ud36e\u12cb\ubcb0() {
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
            invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ub6ab\u51fa\u3c25\u183a\u9a18\u6ec6, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ua61f\u7d52\uc2e8\u12cb\u9a18\u5245, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))
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
            
            if (getfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u4cd9\u156b\u7d52\uc246\u4d85\ua068, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))) {
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6bb9\u67e9\u8df4\u8413\u624e\ucb79, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\uc4d2\u1187\u3504\u67d0\ub113\ua6bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getstatic:ITextComponent(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ud12e\u1187\u071d\ub70c\u76bc\uc2e8), i2f:float(sub:int(div:int(getfield:int(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ub113\ufe34\u9255\u67d0\u494c\ubb2b, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), and:int(ldc:int(16450), ldc:int(4746))), and:int(ldc:int(8350), ldc:int(19606)))), ldc:float(122.0f), ldc:int(-6250336))
            }
            
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ua61f\u7d52\uc2e8\u12cb\u9a18\u5245, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            
            if (invokevirtual:boolean(Optional<T>::equals, getfield:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), invokestatic:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>[expected:Object](Optional<T>::of, getstatic:\ub18d\u6198\u760c\u960f\u494c\u8709(\ub18d\u6198\u760c\u960f\u494c\u8709::\u8709\ud171\u67d0\u600f\u98a4\ubf56)))) {
                invokeinterface:int(\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a::\u4d85\u8308\u99f7\u3d4b\u7c6b\u1187, getfield:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u3a62\u74b1\u7d52\u9937\u6198\u965f, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(getfield:int(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u5f50\uc910\u5140\u7330\u8709\uc2bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)), xor:int(ldc:int(-32711), ldc:int(-32709))), add:int(getfield:int(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u5f50\uc910\u5140\u7330\u8709\uc2bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)), ldc:int(22)), ldc:int(9), ldc:int(10526880))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub83f\u760c\u4d85\uc3e3\ua3b4\uc29a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p0) {
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
            putfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p0:\u7043\u40a9\u4975\u0800\u385b)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \u0b8e\u759a\u7873\ubcb0\u8709\u72f1(java.util.OptionalLong p0) {
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
            return:String(ternaryop:String(invokevirtual:boolean(OptionalLong::isPresent, p0:OptionalLong), invokestatic:String(Long::toString, invokevirtual:long(OptionalLong::getAsLong, p0:OptionalLong)), loadelement:String(getstatic:String[](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ucef1\u71ae\uc31c\uc29a\u4f52\u3e75), xor:int(ldc:int(9485), ldc:int(9483)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.OptionalLong \ube23\u6198\u516c\u0b8e\u6435\u76bc(java.lang.String p0) {
        var_1_61 : int
        stack_75_0 : OptionalLong [generated]
        
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
        var_1_61 = and:int(ldc:int(1541009634), ldc:int(1288219575))
        
        try {
            var_1_61 = and:int(var_1_61:int, ldc:int(1759371531))
            stack_75_0 = invokestatic:OptionalLong(OptionalLong::of, invokestatic:long(Long::parseLong, p0:String))
            var_1_61 = and:int(var_1_61:int, ldc:int(-151080800))
            return:OptionalLong(stack_75_0:OptionalLong)
        }
        catch (java.lang.NumberFormatException var_3_7A) {
            return:OptionalLong(invokestatic:OptionalLong(OptionalLong::empty))
        }
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \u6198\u2dcc\u3a62\u88c5\u0b8e\u8258(boolean p0) {
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
            return:\u7043\u40a9\u4975\u0800\u385b(invokevirtual:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::\u873d\u759a\ubf56\u7d52\ud523\u7ce1, getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), p0:boolean, invokespecial:OptionalLong(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ucef1\u9255\u9a18\u983f\u3bc9\u7bad, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)))
        }
        
        goto(Label_0006)
    }
    
    private java.util.OptionalLong \ucef1\u9255\u9a18\u983f\u3bc9\u7bad() {
        var_1_61 : int
        var_3_69 : String
        var_4_7B : OptionalLong
        var_5_93 : OptionalLong
        
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
            var_1_61 = and:int(ldc:int(1184492556), ldc:int(1188390958))
            var_3_69 = invokevirtual:String(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ubefe\ucfaf\ud36e\u71ae\uafe7\u47c2, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ua61f\u7d52\uc2e8\u12cb\u9a18\u5245, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))
            
            if (logicalnot:boolean(invokestatic:boolean(StringUtils::isEmpty, var_3_69:String[expected:CharSequence]))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-443450084))
                var_4_7B = invokestatic:OptionalLong(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ube23\u6198\u516c\u0b8e\u6435\u76bc, var_3_69:String)
                
                if (logicaland:boolean(invokevirtual:boolean(OptionalLong::isPresent, var_4_7B:OptionalLong), cmpne:boolean(invokevirtual:long(OptionalLong::getAsLong, var_4_7B:OptionalLong), ldc:long(0L)))) {
                    var_5_93 = var_4_7B:OptionalLong
                }
                else {
                    var_1_61 = and:int(var_1_61:int, ldc:int(117144088))
                    var_5_93 = invokestatic:OptionalLong(OptionalLong::of, i2l:long(invokevirtual:int(String::hashCode, var_3_69:String)))
                }
            }
            else {
                var_5_93 = invokestatic:OptionalLong(OptionalLong::empty)
            }
            
            return:OptionalLong(var_5_93:OptionalLong)
        }
        
        goto(Label_0006)
    }
    
    public boolean \ufe34\u494c\u97b7\ub83f\u3a62\ud158() {
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
            return:boolean(invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\u8df4\u5f50\u8df4\u0800\u6cfe\u4cd9, getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)))
        }
        
        goto(Label_0006)
    }
    
    public void \u12b2\u4c04\u6cfe\u600f\u8709\u47c2(boolean p0) {
        var_2_61 : int
        var_2_79 : int
        stack_108_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_108_1 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-976740387), ldc:int(158235607))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u5f50\uc910\u5140\u7330\u8709\uc2bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), p0:boolean)
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\u8df4\u5f50\u8df4\u0800\u6cfe\u4cd9, getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)))) {
                var_2_79 = and:int(var_2_61:int, ldc:int(1667964765))
                putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u4cd9\u156b\u7d52\uc246\u4d85\ua068, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), p0:boolean)
                putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6bb9\u7049\u6435\ud51e\uc87f\u3776, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), p0:boolean)
                stack_108_0 = getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\uf995\u5140\u7bad\uc29a\ub8be\u836c, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)
                
                if (logicaland:boolean(p0:boolean, invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>, \u759a\uf995\u51fa\u7330\u4c2b\u8bb0>(\ub18d\u6198\u760c\u960f\u494c\u8709::\u2dcc\u5db4\u93a2\u6cfe\u5245\u8aa5), getfield:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>[expected:Object](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)))) {
                    stack_108_1 = and:int[expected:boolean](ldc:int(17), ldc:int(17417))
                }
                else {
                    var_2_79 = and:int(var_2_79:int, ldc:int(1733063639))
                    stack_108_1 = and:int[expected:boolean](ldc:int(6446), ldc:int(-22831))
                }
                
                var_2_61 = and:int(var_2_79:int, ldc:int(-202497185))
                putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, stack_108_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_108_1:boolean)
                putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u16f6\u4492\u946b\u0a06\uc2e8\u51b2, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), p0:boolean)
            }
            else {
                putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u4cd9\u156b\u7d52\uc246\u4d85\ua068, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), and:int[expected:boolean](ldc:int(23107), ldc:int(-32372)))
                putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6bb9\u7049\u6435\ud51e\uc87f\u3776, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), and:int[expected:boolean](ldc:int(11456), ldc:int(-11505)))
                putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\uf995\u5140\u7bad\uc29a\ub8be\u836c, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), and:int[expected:boolean](ldc:int(-25852), ldc:int(25715)))
                putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u16f6\u4492\u946b\u0a06\uc2e8\u51b2, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), and:int[expected:boolean](ldc:int(27024), ldc:int(-27097)))
            }
            
            invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\u624e\u6435\u92ff\uf94d\uc246\uc9f6, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ua61f\u7d52\uc2e8\u12cb\u9a18\u5245, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 \u5db4\u67d0\u8258\ub113\uc246\u5fe1() {
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
            return:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(getfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u9937\u5654\u6bb9\ud158\ubff1\u0800, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    public void \u3e2a\u4d85\u92ff\u64ab\ufcaf\u34df(\u59ec\u8413\u97e6\uc229\u3776.\u7bad\u76bc\uae5d\u12cb\u16f6 p0) {
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
    
    private void lambda$\u6fb0\uc9f6\u946b\u74b1\ua6bd\u4bc8$9(\u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1) {
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
            putfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p1:\u7043\u40a9\u4975\u0800\u385b)
            putfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u9937\u5654\u6bb9\ud158\ubff1\u0800, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p0:\u7d52\u51fa\u56bd\u76bc\u4975\ub113)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.DataResult lambda$\ub113\u72f1\ubf56\u69d9\u6cfe\u5d20$8(\ub113\uc4d2\u183a\u527a\u6435.\ud171\ub171\u4c2b\uae5d\u4c04\u494c p0, com.google.gson.JsonElement p1) {
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
            return:DataResult(invokeinterface:DataResult(Codec::parse, getstatic:Codec<\u7043\u40a9\u4975\u0800\u385b>(\u7043\u40a9\u4975\u0800\u385b::\ub171\u4ab3\ubff1\u156b\u7873\ub7dc), p0:DynamicOps, p1:JsonElement[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc9f6\u7043\ua6bd\u647c\u93a2\u6ec6$7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p2) {
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
    
    private void lambda$\u9255\u965f\u9255\u9033\u600f\u6d69$6(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p2, com.mojang.serialization.Lifecycle p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p4) {
        var_6_AD : int
        var_8_70 : BooleanConsumer
        
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
            var_6_AD = and:int(ldc:int(1551299312), ldc:int(536408250))
            var_8_70 = invokedynamic:BooleanConsumer(accept:(L\u494c\u4975\ua068\u0c95\uc84e/\u7043\ubcb0\ub1b9\u759a\u4975/\ub8be\u8413\u92ff\u7049\ub70c\u6b0d;L\ubcb0\ud12e\u51fa\u8aa5\u0c95/\u67e9\u4daf\u760c\ud217\ua6bd\ubff1;L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u12b2\u1187\ub171\u56bd\u5f50;L\u5d20\u7043\u88c5\u5db4\uf94d/\u7d52\u51fa\u56bd\u76bc\u4975\ub113;L\u7c6b\u7c6b\ubefe\u385b\u3c25/\ud7e8\u0800\uae87\u8d90\u183a/\u7c6b\ubded\u0b8e\u2dcc\u8c8a/\ud12e\u16f6\u8d98\u4c04\u16f6/\u7043\u40a9\u4975\u0800\u385b;)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p1:\u4daf\u12b2\u1187\ub171\u56bd\u5f50, p2:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, p4:\u7043\u40a9\u4975\u0800\u385b)
            
            if (cmpne:boolean(p3:Lifecycle, invokestatic:Lifecycle(Lifecycle::stable))) {
                do {
                    if (cmpeq:boolean(and:int(var_6_AD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_6_AD = and:int(var_6_AD:int, ldc:int(745602377))
                    }
                    else {
                        var_6_AD = and:int(var_6_AD:int, ldc:int(2111353526))
                        
                        if (cmpne:boolean(p3:Lifecycle, invokestatic:Lifecycle(Lifecycle::experimental))) {
                            loopcontinue()
                        }
                        
                        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\uc238\u0b8e\ubefe\uc87f\uc9f6\u836c(\uc238\u0b8e\ubefe\uc87f\uc9f6\u836c::<init>, var_8_70:BooleanConsumer, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ucef1\u71ae\uc31c\uc29a\u4f52\u3e75), xor:int(ldc:int(-30169), ldc:int(-30166)))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ucef1\u71ae\uc31c\uc29a\u4f52\u3e75), xor:int(ldc:int(5512), ldc:int(5510))))))
                        return:void()
                    }
                } while (cmpeq:boolean(and:int(var_6_AD:int, ldc:int(4096)), ldc:int(0)))
                
                var_6_AD = and:int(var_6_AD:int, ldc:int(1609957308))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\uc238\u0b8e\ubefe\uc87f\uc9f6\u836c(\uc238\u0b8e\ubefe\uc87f\uc9f6\u836c::<init>, var_8_70:BooleanConsumer, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ucef1\u71ae\uc31c\uc29a\u4f52\u3e75), and:int(ldc:int(1279), ldc:int(15)))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ucef1\u71ae\uc31c\uc29a\u4f52\u3e75), and:int(ldc:int(6292), ldc:int(8539))))))
            }
            else {
                invokespecial:void(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u120d\u7006\u873d\u5654\u7ce1\u416d, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p2:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, p4:\u7043\u40a9\u4975\u0800\u385b)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud217\ubded\u6b5f\ua3b4\u3d4b\ud158$5(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p3, boolean p4) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p1:\u4daf\u12b2\u1187\ub171\u56bd\u5f50[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            
            if (p4:boolean) {
                invokespecial:void(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u120d\u7006\u873d\u5654\u7ce1\u416d, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, p2:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, p3:\u7043\u40a9\u4975\u0800\u385b)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u527a\u4d85\uc29a\u56bd\u4e72\ua6bd$4(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, invokevirtual:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::\u6c52\ub32d\u5fe1\u6b0d\uc3e3\u3e75, getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)))
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u52d3\u7873\uc29a\u6c56\u3a62\u8bb0, p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995], xor:int(ldc:int(-32547), ldc:int(-32729)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u7006\u6bb9\ub83f\u76bc\u0800\ua562$3(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p2) {
        var_6_74 : \u759a\uf995\u51fa\u7330\u4c2b\u8bb0
        
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
            var_6_74 = checkcast:\u759a\uf995\u51fa\u7330\u4c2b\u8bb0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u759a\uf995\u51fa\u7330\u4c2b\u8bb0.class, invokeinterface:\u759a\uf995\u51fa\u7330\u4c2b\u8bb0(Map<Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>, \u759a\uf995\u51fa\u7330\u4c2b\u8bb0>::get, getstatic:Map<Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>, \u759a\uf995\u51fa\u7330\u4c2b\u8bb0>(\ub18d\u6198\u760c\u960f\u494c\u8709::\u2dcc\u5db4\u93a2\u6cfe\u5245\u8aa5), getfield:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>[expected:Object](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)))
            
            if (cmpne:boolean(var_6_74:\u759a\uf995\u51fa\u7330\u4c2b\u8bb0, aconstnull:\u759a\uf995\u51fa\u7330\u4c2b\u8bb0())) {
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokeinterface:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u759a\uf995\u51fa\u7330\u4c2b\u8bb0::\ucef1\u1187\u40a9\u6ec6\u8709\uc246, var_6_74:\u759a\uf995\u51fa\u7330\u4c2b\u8bb0, p1:\u4daf\u12b2\u1187\ub171\u56bd\u5f50, getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc87f\u5654\u4f52\u416d\u72f1\u839e$2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p1) {
        var_3_61 : int
        var_5_B3 : int
        var_6_D5 : \ub18d\u6198\u760c\u960f\u494c\u8709
        
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
            var_3_61 = and:int(ldc:int(-1743495968), ldc:int(-610339514))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1734740641))
                    
                    if (invokevirtual:boolean(Optional<T>::isPresent, getfield:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))) {
                        var_5_B3 = add:int(invokeinterface:int(List<E>::indexOf, getstatic:List<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub18d\u6198\u760c\u960f\u494c\u8709::\u3711\u97e6\u071d\ua61f\u62da\u74b1), invokevirtual:\ub18d\u6198\u760c\u960f\u494c\u8709[expected:Object](Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>::get, getfield:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))), xor:int(ldc:int(1800), ldc:int(1801)))
                        
                        if (cmpge:boolean(var_5_B3:int, invokeinterface:int(List<E>::size, getstatic:List<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub18d\u6198\u760c\u960f\u494c\u8709::\u3711\u97e6\u071d\ua61f\u62da\u74b1)))) {
                            var_5_B3 = and:int(ldc:int(22675), ldc:int(-23736))
                        }
                        
                        var_3_61 = and:int(var_3_61:int, ldc:int(-579417049))
                        var_6_D5 = checkcast:\ub18d\u6198\u760c\u960f\u494c\u8709(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ub18d\u6198\u760c\u960f\u494c\u8709.class, invokeinterface:\ub18d\u6198\u760c\u960f\u494c\u8709(List<\ub18d\u6198\u760c\u960f\u494c\u8709>::get, getstatic:List<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub18d\u6198\u760c\u960f\u494c\u8709::\u3711\u97e6\u071d\ua61f\u62da\u74b1), var_5_B3:int))
                        putfield:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, invokestatic:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(Optional<T>::of, var_6_D5:\ub18d\u6198\u760c\u960f\u494c\u8709))
                        putfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, invokevirtual:\u7043\u40a9\u4975\u0800\u385b(\ub18d\u6198\u760c\u960f\u494c\u8709::\u52d3\u5654\ub32d\u7e3f\ub32d\u7c6b, var_6_D5:\ub18d\u6198\u760c\u960f\u494c\u8709, getfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u9937\u5654\u6bb9\ud158\ubff1\u0800, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d), invokevirtual:long(\u7043\u40a9\u4975\u0800\u385b::\ubf56\u071d\u873d\u4c04\u0800\uc29a, getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)), invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\ua6bd\u8258\u0b8e\ua61f\uc31c\ud51e, getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)), invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\ub18d\uc9f6\u7043\u7c6b\ucfaf\u3e2a, getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))))
                        
                        if (invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\u8df4\u5f50\u8df4\u0800\u6cfe\u4cd9, getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))) {
                            if (logicalnot:boolean(invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u40a9\u8350\ud12e\u8258\u0a06\ub7dc))) {
                                loopcontinue()
                            }
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokevirtual:void(\u4daf\u12b2\u1187\ub171\u56bd\u5f50::\u72f1\ud51e\u494c\u120d\u3504\u4f52, p0:\u4daf\u12b2\u1187\ub171\u56bd\u5f50)
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u52d3\u7873\uc29a\u6c56\u3a62\u8bb0, p1:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995], xor:int(ldc:int(2145), ldc:int(2203)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u64ab\u624e\u7af6\u67e9\uc3e3\ub1b9$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, invokevirtual:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::\u4ab3\u7043\u74b1\u760c\u67e9\ub113, getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d)))
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u52d3\u7873\uc29a\u6c56\u3a62\u8bb0, p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995], xor:int(ldc:int(963), ldc:int(825)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8df4\uf9c5\u4cd9\u52d3\u8d98\u836c$0(java.lang.String p0) {
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
            putfield:OptionalLong(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u983f\u760c\ufe34\uc246\u965f\u1833, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, invokespecial:OptionalLong(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ucef1\u9255\u9a18\u983f\u3bc9\u7bad, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \ud51e\u7ce1\u4e72\u67d0\ubefe\u5654(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ub8be\u8413\u92ff\u7049\ub70c\u6b0d p0) {
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
            return:\u7043\u40a9\u4975\u0800\u385b(getfield:\u7043\u40a9\u4975\u0800\u385b(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u64f2\u8cae\u7873\u8389\u12b2\u56bd, p0:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \u759a\u88c5\uff55\u392e\u3bc9\u8aa5() {
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
            return:ITextComponent(getstatic:ITextComponent(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\uae5d\u3a62\u385b\u5fe1\ub18d\u7ce1))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Optional \u7e3f\uc238\ub19c\u5d20\ua61f\u8709(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ub8be\u8413\u92ff\u7049\ub70c\u6b0d p0) {
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
            return:Optional(getfield:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, p0:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \ud7e8\u1833\ud171\u97b7\u97e6\u76bc() {
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
            return:ITextComponent(getstatic:ITextComponent(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u071d\u3e2a\ua6bd\u8d98\uc238\u983f))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_45C : int
        expr_6E : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_128_0 : byte[] [generated]
        stack_17B_0 : byte[] [generated]
        stack_17D_0 : byte[] [generated]
        stack_1BB_0 : byte[] [generated]
        stack_480_0 : byte[] [generated]
        stack_4ED_0 : byte[] [generated]
        stack_584_0 : byte[] [generated]
        stack_5BF_0 : byte[] [generated]
        stack_615_0 : byte[] [generated]
        var_4_447 : int
        var_3_44C : byte[]
        var_5_44D : int
        expr_480 : byte [generated]
        var_0_4E3 : int
        expr_4ED : byte [generated]
        stack_536_2 : byte [generated]
        stack_513_0 : byte [generated]
        expr_A6 : int [generated]
        expr_DE : int [generated]
        var_2_126 : byte[]
        expr_12A : int [generated]
        var_3_5AD : byte[]
        var_5_5AE : int
        expr_17D : int [generated]
        var_3_603 : byte[]
        var_5_604 : int
        var_3_1C7 : String
        expr_1CF : String[] [generated]
        expr_1D9 : String[] [generated]
        var_3_401 : String[]
        
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
        var_0_45C = and:int(ldc:int(-642976514), ldc:int(-364923202))
        expr_6E = arraylength:int(stack_A4_0 = stack_A6_0 = stack_DC_0 = stack_DE_0 = stack_126_0 = stack_128_0 = stack_17B_0 = stack_17D_0 = stack_1BB_0 = stack_480_0 = stack_4ED_0 = stack_584_0 = stack_5BF_0 = stack_615_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("+EsATaKpBZ68wk9BLm7SfZZZ79N8ggLhacVMQSCsQgPOz8KAS0EubsUOwo7tLcaMwwBLQU7UtEsATaKp03xGQItBLm7FDsKO7S3GjMMAS0FO1NGnyFAySwBNoqnTfEZAi0EubsUOwo4OzoEgrMaMwwBLQU7kOXBBhUwjqQWevMJPQS5u0n2WWe/TfIIC0dF3ifYCwk6vLQesbNN8RkBs7IHAwh5Vp8GBQM8T+cbMkg38Bc4BTU/AAZ+wzkEOQg6BQM8T+cbMkj1PhI9AzIGBjMFOjxT2BsKO3bAPQc/DX7PMTAKBAIzBTo8U9gbCjt2wT4SPQMyBDUaa+0fNT4OMwU6PFPYGwo7dsM9Ag0wTeIQAz8OMwU6PFPYGwo7dsM4Dzs/CUPgGDsKODs6BEHwHjMMAS0FOBQCMwU6PFPYGwo7dsM4Dzs/CUPgGDsKODs6BEHwHjMMAS0FO1PyPQMCCzF+9xkyfsMADDINAS4HPQ4zBTo8U9gbCjt2wzgPOz8JQ+AYOwo4OzoEQfAeMwwBLQU7U/I9AwILMX73GTJ+wg0vEDk6DjMFOjxT2BsKO3bDOA87PwlD4Bg7Cjg7OgRB8B4zDAEtBTtT8z8IOT0PLAw5AU3mUvsADDINAS4HPQ4zBTo8U9gbCjt2wzgPOz8JQ+AYOwo4OzoEQfAeMwwBLQU7U/M/CDk9DywMOQFN5lL6DS8QOToOMwU6PFPYGwo7dsM4Dzs/CUPgGDsKODs6BEHwHjMMAS0FO1Pzd/gLCQk/Mg4zBTo8U9gbCjt2wzgPOz8JQ+AYOwo4OzoEQfAeMwwBLQU7U/EOMwU6PFPjBwMJOg4zBTo8U9gbCjt2wkTuTtZk9xkBPzIMAjMFOjxT2BsKO3bCRO5O1mT3GQE/MU/zOQQ5CA4zBTo8U9gbCjt2wkTuTO0fNT/U=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_447 = expr_6E:int
        var_3_44C = newarray:byte[](byte.class, expr_6E:int)
        var_5_44D = expr_6E:int
        Label_1103:
        
        while (cmpne:boolean(and:int(var_0_45C:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(262144)), ldc:int(0))) {
                var_0_45C = and:int(var_0_45C:int, ldc:int(1083572239))
                goto(Label_1221)
            }
            
            var_0_45C = and:int(var_0_45C:int, ldc:int(-540150341))
            var_5_44D = add:int(var_5_44D:int, ldc:int(-1))
            expr_480 = loadelement:byte(stack_480_0:byte[], var_5_44D:int)
            storeelement:byte(var_3_44C:byte[], var_5_44D:int, or:int(and:int(shl:int(expr_480:byte, xor:int(ldc:int(24659), ldc:int(24663))), ldc:int(-16)), and:int(shr:int(expr_480:byte[expected:int], and:int(ldc:int(4), ldc:int(16501))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_44D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_DC_0 = stack_DE_0 = stack_126_0 = stack_128_0 = stack_17B_0 = stack_17D_0 = stack_1BB_0 = stack_480_0 = stack_4ED_0 = stack_584_0 = stack_5BF_0 = stack_615_0 = var_3_44C:byte[]
            goto(Label_0115)
        }
        
        var_0_45C = and:int(var_0_45C:int, ldc:int(-94733043))
        goto(Label_1372)
        Label_1221:
        
        while (cmpne:boolean(and:int(var_0_45C:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_45C:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_45C = and:int(var_0_45C:int, ldc:int(-445545236))
                goto(Label_1103)
            }
            
            var_0_4E3 = and:int(var_0_45C:int, ldc:int(-385903113))
            var_5_44D = add:int(var_5_44D:int, ldc:int(-1))
            expr_4ED = stack_536_2 = loadelement(stack_4ED_0, var_5_44D)
            
            if (cmplt:boolean(add:int(add:int(var_5_44D:int, ldc:int(1)), neg:int(var_4_447:int)), ldc:int(0))) {
                stack_536_2 = stack_513_0 = add:byte(expr_4ED:byte, loadelement:byte(var_3_44C:byte[], add:int(var_5_44D:int, ldc:int(1))))
                goto(Label_1315)
            }
            
            Label_1274:
            
            if (cmpeq:boolean(and:int(var_0_4E3:int, ldc:int(1024)), ldc:int(0))) {
                var_0_4E3 = and:int(var_0_4E3:int, ldc:int(1522371513))
            }
            else {
                var_0_4E3 = and:int(var_0_4E3:int, ldc:int(-602931278))
                stack_536_2 = stack_513_0 = add:byte(expr_4ED:byte, ldc:byte(1))
            }
            
            Label_1315:
            
            if (cmpeq:boolean(and:int(var_0_4E3:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_1274)
            }
            
            var_0_45C = and:int(var_0_4E3:int, ldc:int(-863013121))
            storeelement:byte(var_3_44C:byte[], var_5_44D:int, stack_536_2:byte)
            
            if (cmpne:boolean(var_5_44D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_DC_0 = stack_DE_0 = stack_126_0 = stack_128_0 = stack_17B_0 = stack_17D_0 = stack_1BB_0 = stack_480_0 = stack_4ED_0 = stack_584_0 = stack_5BF_0 = stack_615_0 = var_3_44C:byte[]
            goto(Label_0171)
        }
        
        Label_1372:
        
        while (cmpne:boolean(and:int(var_0_45C:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_45C = and:int(var_0_45C:int, ldc:int(-846999706))
                goto(Label_1103)
            }
            
            var_0_45C = and:int(var_0_45C:int, ldc:int(-855786061))
            var_5_44D = add:int(var_5_44D:int, ldc:int(-1))
            storeelement:byte(var_3_44C:byte[], var_5_44D:int, xor:byte(loadelement:byte(stack_584_0:byte[], var_5_44D:int), ldc:byte(108)))
            
            if (cmpne:boolean(var_5_44D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_DC_0 = stack_DE_0 = stack_126_0 = stack_128_0 = stack_17B_0 = stack_17D_0 = stack_1BB_0 = stack_480_0 = stack_4ED_0 = stack_584_0 = stack_5BF_0 = stack_615_0 = var_3_44C:byte[]
            goto(Label_0227)
        }
        
        goto(Label_1221)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0386)
        }
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0303)
        }
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(524288)), ldc:int(0))) {
            var_0_45C = and:int(var_0_45C:int, ldc:int(-775017581))
            goto(Label_0227)
        }
        
        if (cmpne:boolean(and:int(var_0_45C:int, ldc:int(524288)), ldc:int(0))) {
            var_0_45C = and:int(var_0_45C:int, ldc:int(-77679118))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_447 = expr_A6:int
                var_3_44C = newarray:byte[](byte.class, expr_A6:int)
                var_5_44D = expr_A6:int
                goto(Label_1221)
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0386)
        }
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0303)
        }
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(2)), ldc:int(0))) {
                var_0_45C = and:int(var_0_45C:int, ldc:int(-250493814))
                goto(Label_0115)
            }
            
            var_0_45C = and:int(var_0_45C:int, ldc:int(-923920713))
            expr_DE = arraylength:int(stack_DE_0:byte[])
            
            if (cmpne:boolean(expr_DE:int, ldc:int(0))) {
                var_4_447 = expr_DE:int
                var_3_44C = newarray:byte[](byte.class, expr_DE:int)
                var_5_44D = expr_DE:int
                goto(Label_1372)
            }
        }
        
        Label_0227:
        
        if (cmpne:boolean(and:int(var_0_45C:int, ldc:int(1)), ldc:int(0))) {
            var_0_45C = and:int(var_0_45C:int, ldc:int(-1865278861))
            goto(Label_0386)
        }
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(524288)), ldc:int(0))) {
            var_0_45C = and:int(var_0_45C:int, ldc:int(-182307094))
        }
        else {
            if (cmpne:boolean(and:int(var_0_45C:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(4096)), ldc:int(0))) {
                var_0_45C = and:int(var_0_45C:int, ldc:int(-521175668))
                goto(Label_0115)
            }
            
            var_0_45C = and:int(var_0_45C:int, ldc:int(-307251270))
            var_2_126 = stack_126_0:byte[]
            expr_12A = add:int(arraylength:int(stack_128_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_12A:int, ldc:int(0))) {
                var_3_5AD = newarray:byte[](byte.class, expr_12A:int)
                var_5_5AE = expr_12A:int
                
                loop {
                    var_0_45C = and:int(var_0_45C:int, ldc:int(-347089501))
                    var_5_5AE = add:int(var_5_5AE:int, ldc:int(-1))
                    storeelement:byte(var_3_5AD:byte[], var_5_5AE:int, add:int(shl:int(loadelement:byte(stack_5BF_0:byte[], var_5_5AE:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_126:byte[], add:int(var_5_5AE:int, and:int(ldc:int(20481), ldc:int(11803)))), ldc:int(2)), xor:int(ldc:int(21051), ldc:int(20996)))))
                    
                    if (cmpne:boolean(var_5_5AE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_DC_0 = stack_DE_0 = stack_126_0 = stack_128_0 = stack_17B_0 = stack_17D_0 = stack_1BB_0 = stack_480_0 = stack_4ED_0 = stack_584_0 = stack_5BF_0 = stack_615_0 = var_3_5AD:byte[]
            }
        }
        
        Label_0303:
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(32)), ldc:int(0))) {
            var_0_45C = and:int(var_0_45C:int, ldc:int(576689034))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(4096)), ldc:int(0))) {
                var_0_45C = and:int(var_0_45C:int, ldc:int(-912855497))
                goto(Label_0227)
            }
            
            if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_45C = and:int(var_0_45C:int, ldc:int(-1399293334))
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_45C:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_45C = and:int(var_0_45C:int, ldc:int(126835637))
                goto(Label_0115)
            }
            
            var_0_45C = and:int(var_0_45C:int, ldc:int(-651232078))
            expr_17D = arraylength:int(stack_17D_0:byte[])
            
            if (cmpne:boolean(expr_17D:int, ldc:int(0))) {
                var_3_603 = newarray:byte[](byte.class, expr_17D:int)
                var_5_604 = expr_17D:int
                
                loop {
                    var_0_45C = and:int(var_0_45C:int, ldc:int(-4390933))
                    var_5_604 = add:int(var_5_604:int, ldc:int(-1))
                    storeelement:byte(var_3_603:byte[], var_5_604:int, add:byte(loadelement:byte(stack_615_0:byte[], var_5_604:int), ldc:byte(98)))
                    
                    if (cmpne:boolean(var_5_604:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_DC_0 = stack_DE_0 = stack_126_0 = stack_128_0 = stack_17B_0 = stack_17D_0 = stack_1BB_0 = stack_480_0 = stack_4ED_0 = stack_584_0 = stack_5BF_0 = stack_615_0 = var_3_603:byte[]
            }
        }
        
        Label_0386:
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0303)
        }
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(524288)), ldc:int(0))) {
            var_0_45C = and:int(var_0_45C:int, ldc:int(-982128182))
            goto(Label_0227)
        }
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0171)
        }
        
        if (cmpeq:boolean(and:int(var_0_45C:int, ldc:int(128)), ldc:int(0))) {
            var_0_45C = and:int(var_0_45C:int, ldc:int(-752717910))
            goto(Label_0115)
        }
        
        var_3_1C7 = initobject:String(String::<init>, stack_1BB_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_1CF = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(21566), ldc:int(2068)))
        expr_1D9 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28134), ldc:int(-28146)))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(134), ldc:int(128)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, and:int(ldc:int(27702), ldc:int(-28215)), and:int(ldc:int(-17927), ldc:int(17926))))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(17925), ldc:int(17932)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, and:int(ldc:int(26795), ldc:int(-27820)), and:int(ldc:int(8254), ldc:int(2167))))
        storeelement:String(expr_1D9:String[], and:int(ldc:int(8717), ldc:int(17708)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, and:int(ldc:int(254), ldc:int(11318)), xor:int(ldc:int(8212), ldc:int(8258))))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(17423), ldc:int(17416)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(264), ldc:int(350)), xor:int(ldc:int(4122), ldc:int(4234))))
        storeelement:String(expr_1D9:String[], and:int(ldc:int(6155), ldc:int(159)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(-32226), ldc:int(-32114)), and:int(ldc:int(3814), ldc:int(16566))))
        storeelement:String(expr_1CF:String[], and:int(ldc:int(8754), ldc:int(19607)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(-24501), ldc:int(-24339)), and:int(ldc:int(8382), ldc:int(18942))))
        storeelement:String(expr_1CF:String[], xor:int(ldc:int(872), ldc:int(889)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(8284), ldc:int(8418)), and:int(ldc:int(6350), ldc:int(1262))))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(18432), ldc:int(18436)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, and:int(ldc:int(3278), ldc:int(20942)), xor:int(ldc:int(4), ldc:int(224))))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(25), ldc:int(26)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(213), ldc:int(49)), and:int(ldc:int(17663), ldc:int(4861))))
        storeelement:String(expr_1D9:String[], and:int(ldc:int(10088), ldc:int(-10219)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(53), ldc:int(200)), and:int(ldc:int(402), ldc:int(4951))))
        storeelement:String(expr_1D9:String[], and:int(ldc:int(261), ldc:int(19493)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(-16325), ldc:int(-16087)), xor:int(ldc:int(11275), ldc:int(11581))))
        storeelement:String(expr_1D9:String[], and:int(ldc:int(1169), ldc:int(12306)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(1074), ldc:int(1284)), xor:int(ldc:int(283), ldc:int(117))))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(16570), ldc:int(16565)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, and:int(ldc:int(2031), ldc:int(366)), and:int(ldc:int(4519), ldc:int(16803))))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(7195), ldc:int(7189)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(-27535), ldc:int(-27182)), and:int(ldc:int(1503), ldc:int(8669))))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(-31986), ldc:int(-31997)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, and:int(ldc:int(20957), ldc:int(8701)), and:int(ldc:int(13206), ldc:int(16949))))
        storeelement:String(expr_1D9:String[], and:int(ldc:int(25098), ldc:int(5194)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(877), ldc:int(377)), xor:int(ldc:int(4503), ldc:int(5079))))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(-32128), ldc:int(-32120)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(9347), ldc:int(9923)), and:int(ldc:int(632), ldc:int(11890))))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(-24573), ldc:int(-24574)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(5633), ldc:int(5233)), xor:int(ldc:int(2254), ldc:int(2633))))
        storeelement:String(expr_1CF:String[], xor:int(ldc:int(325), ldc:int(342)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, and:int(ldc:int(671), ldc:int(1671)), xor:int(ldc:int(281), ldc:int(954))))
        storeelement:String(expr_1D9:String[], and:int(ldc:int(906), ldc:int(2099)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, and:int(ldc:int(12259), ldc:int(17075)), and:int(ldc:int(3830), ldc:int(17078))))
        putstatic:String[](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ucef1\u71ae\uc31c\uc29a\u4f52\u3e75, expr_1D9:String[])
        var_3_401 = expr_1CF:String[]
        putstatic:Logger(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u5bc4\u67d0\u97b7\u3711\u5654\u8709, invokestatic:Logger(LogManager::getLogger))
        putstatic:ITextComponent(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\uae5d\u3a62\u385b\u5fe1\ub18d\u7ce1, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_401:String[], and:int(ldc:int(16953), ldc:int(2389)))))
        putstatic:ITextComponent(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u071d\u3e2a\ua6bd\u8d98\uc238\u983f, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_401:String[], xor:int(ldc:int(6161), ldc:int(6147)))))
        putstatic:ITextComponent(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ud12e\u1187\u071d\ub70c\u76bc\uc2e8, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_401:String[], and:int(ldc:int(17563), ldc:int(55)))))
    }
    
    public void \u51b2\u392e\uc2e8\u69d9\u7ce1\uc2bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C3 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6CE : int
        
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
        var_3_6C3 = and:int(ldc:int(547777964), ldc:int(2024695172))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(657106907))
        }
        else {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(755646831))
            var_5_8A = and:int(ldc:int(9442), ldc:int(-9443))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28399), ldc:int(27686)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6C3:int, ldc:int(1068309919))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(32003), ldc:int(5)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(17439), ldc:int(4097)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_E3:int, ldc:int(933965580))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(16712), ldc:int(16713)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(682405523))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-490352175))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(315963291))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1545815968))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(577940099))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(172128283))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-347534256))
                    }
                    else {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(642662735))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0447:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1357398346))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1541872529))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(462410669))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(130504118))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1366036185))
                        var_11_F4 = and:int(ldc:int(3713), ldc:int(-3714))
                        goto(Label_1607)
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-213792882))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1786710718))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1743332442))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(604002158))
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1311483295))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(177917343))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(513088190))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-517641479))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1281003266))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-26573654))
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-342003314))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1896340496))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(171806904))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-375150337))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-957416828))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1160579322))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(8769), ldc:int(18479))
                                goto(Label_1191)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1733052010))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1529621055))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1215941495))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1854955679))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(357351133))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(376015593))
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1247497828))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(343171406))
                        var_11_F4 = and:int(ldc:int(15507), ldc:int(-15544))
                    }
                    
                    Label_1191:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1406198407))
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-585202283))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-781914478))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-773144031))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1363156716))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1452)
                            }
                        }
                    }
                    
                    Label_1316:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1224813322))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(146112817))
                            goto(Label_1191)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1096379957))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1193005185))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(12021061))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1607)
                    }
                    
                    Label_1452:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1373638370))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2064183762))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(501524431))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2141173825))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(843537017))
                        goto(Label_0447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1219427885))
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1263139695))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1607:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1618:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2042715491))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1645897991))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1345324643))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1855835669))
                        goto(Label_0447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1486571571))
                        var_17_6CE = add:int(var_16_122:int, xor:int(ldc:int(13320), ldc:int(13321)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2065728075))
                
                if (cmple:boolean(var_5_8A = var_17_6CE:int, sub:int(var_6_91:int, and:int(ldc:int(14853), ldc:int(17697))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-554949020))
            goto(Label_0108)
        }
    }
}
