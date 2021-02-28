public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ufcaf\ud7e8\ud158\u6435\u759a\u6435 {
    public void \ufcaf\ud7e8\ud158\u6435\u759a\u6435(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
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
            invokespecial:Object(Object::<init>, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435)
            putfield:List<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u0a06\u3e75\u12b2\ubf56\uc4d2\u8bb0, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, invokestatic:ArrayList[expected:List<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>](Lists::newArrayList))
            putfield:Int2ObjectMap<\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u3c25\ub113\u4492\ud158\u4ab3\ubb2b, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, initobject:Int2ObjectOpenHashMap[expected:Int2ObjectMap<\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf>](Int2ObjectOpenHashMap::<init>))
            putfield:Int2ObjectMap<\u8350\ub70c\u8753\u0800\u0c95\ud217>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u16f6\u4bc8\u5245\u12b2\u5fe1\u67d0, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, initobject:Int2ObjectOpenHashMap[expected:Int2ObjectMap<\u8350\ub70c\u8753\u0800\u0c95\ud217>](Int2ObjectOpenHashMap::<init>))
            putfield:Int2ObjectMap<IntList>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u51fa\u71f1\u6b5f\u760c\uc2e8\ub8be, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, initobject:Int2ObjectOpenHashMap[expected:Int2ObjectMap<IntList>](Int2ObjectOpenHashMap::<init>))
            putfield:List<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ubb2b\u385b\uf9c5\uc84e\u34df\u3d4b, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, invokestatic:ArrayList[expected:List<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>](Lists::newArrayList))
            putfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\uae87\u3bc9\ub7dc\u56bd\u8cae\u600f, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, p0:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99)
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ud7e8\u5d20\uc7fe\ufe34\u97b7\u983f, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubff1\u62da\u67e9\u120d\u8308\u6bb9(java.util.List<\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub113\u9af2\u64f2\u5f50\u4179\u7bad> p0) {
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
    
    public void close() {
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
            invokespecial:void(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u3d64\u98a4\u92ee\u3711\ub171\u983f, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435)
            invokespecial:void(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u6435\u8389\u7c6b\ud171\u97e6\ufe34, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3d64\u98a4\u92ee\u3711\ub171\u983f() {
        var_1_5F : int
        var_3_69 : Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>
        
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
            var_1_5F = and:int(ldc:int(-1362665700), ldc:int(-18396009))
            var_3_69 = invokeinterface:Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>(List<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>::iterator, getfield:List<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u0a06\u3e75\u12b2\ubf56\uc4d2\u8bb0, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1348516770))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_69:Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>))) {
                    looporswitchbreak()
                }
                
                invokeinterface:void(\ub113\u9af2\u64f2\u5f50\u4179\u7bad::close, checkcast:\ub113\u9af2\u64f2\u5f50\u4179\u7bad(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub113\u9af2\u64f2\u5f50\u4179\u7bad.class, invokeinterface:\ub113\u9af2\u64f2\u5f50\u4179\u7bad(Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>::next, var_3_69:Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>)))
            }
            
            invokeinterface:void(List<E>::clear, getfield:List<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u0a06\u3e75\u12b2\ubf56\uc4d2\u8bb0, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6435\u8389\u7c6b\ud171\u97e6\ufe34() {
        var_1_5F : int
        var_3_69 : Iterator<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>
        
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
            var_1_5F = and:int(ldc:int(981512051), ldc:int(116428603))
            var_3_69 = invokeinterface:Iterator<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>(List<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>::iterator, getfield:List<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ubb2b\u385b\uf9c5\uc84e\u34df\u3d4b, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-291573978))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_69:Iterator<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u983f\u34df\ufe34\u7e3f\ucb79\u873d::close, checkcast:\u983f\u34df\ufe34\u7e3f\ucb79\u873d(\u516c\u3d64\u718f\ub171\u6b5f.\u983f\u34df\ufe34\u7e3f\ucb79\u873d.class, invokeinterface:\u983f\u34df\ufe34\u7e3f\ucb79\u873d(Iterator<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>::next, var_3_69:Iterator<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>)))
            }
            
            invokeinterface:void(List<E>::clear, getfield:List<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ubb2b\u385b\uf9c5\uc84e\u34df\u3d4b, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8350\ub70c\u8753\u0800\u0c95\ud217 \u0c95\u4c04\u718f\u64ab\ua562\ucb79(int p0) {
        var_4_6D : \u8350\ub70c\u8753\u0800\u0c95\ud217
        
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
            var_4_6D = checkcast:\u8350\ub70c\u8753\u0800\u0c95\ud217(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8350\ub70c\u8753\u0800\u0c95\ud217.class, invokeinterface:Object[expected:\u8350\ub70c\u8753\u0800\u0c95\ud217](Int2ObjectMap::get, getfield:Int2ObjectMap<\u8350\ub70c\u8753\u0800\u0c95\ud217>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u16f6\u4bc8\u5245\u12b2\u5fe1\u67d0, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435), p0:int))
            
            if (cmpeq:boolean(var_4_6D:\u8350\ub70c\u8753\u0800\u0c95\ud217, aconstnull:\u8350\ub70c\u8753\u0800\u0c95\ud217())) {
                if (cmpne:boolean(p0:int, ldc:int(32))) {
                    var_4_6D = invokespecial:\u8258\u8389\ub18d\u718f\u61a4\ubf56[expected:\u8350\ub70c\u8753\u0800\u0c95\ud217](\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ubf56\u183a\u8aa5\u0a06\ucfaf\ufe34, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, p0:int)
                }
                else {
                    var_4_6D = getstatic:\u8350\ub70c\u8753\u0800\u0c95\ud217(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u8350\u5245\u4f4a\u3d64\u5654\u3d64)
                }
                
                invokeinterface:Object(Int2ObjectMap::put, getfield:Int2ObjectMap<\u8350\ub70c\u8753\u0800\u0c95\ud217>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u16f6\u4bc8\u5245\u12b2\u5fe1\u67d0, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435), p0:int, var_4_6D:\u8350\ub70c\u8753\u0800\u0c95\ud217[expected:Object])
            }
            
            return:\u8350\ub70c\u8753\u0800\u0c95\ud217(var_4_6D:\u8350\ub70c\u8753\u0800\u0c95\ud217)
        }
        
        goto(Label_0006)
    }
    
    private \u71f1\uc910\u3bc9\u516c\u93a2.\u8258\u8389\ub18d\u718f\u61a4\ubf56 \ubf56\u183a\u8aa5\u0a06\ucfaf\ufe34(int p0) {
        var_2_61 : int
        var_4_6B : Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>
        var_6_AF : \u8258\u8389\ub18d\u718f\u61a4\ubf56
        
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
        var_2_61 = and:int(ldc:int(-1304741710), ldc:int(-1263797050))
        var_4_6B = invokeinterface:Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>(List<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>::iterator, getfield:List<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u0a06\u3e75\u12b2\ubf56\uc4d2\u8bb0, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-948324437))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_6B:Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>)) {
                    var_6_AF = invokeinterface:\u8258\u8389\ub18d\u718f\u61a4\ubf56(\ub113\u9af2\u64f2\u5f50\u4179\u7bad::\u5245\uae87\u3d64\u3e75\u6bb9\u4f52, checkcast:\ub113\u9af2\u64f2\u5f50\u4179\u7bad(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub113\u9af2\u64f2\u5f50\u4179\u7bad.class, invokeinterface:\ub113\u9af2\u64f2\u5f50\u4179\u7bad(Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>::next, var_4_6B:Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>)), p0:int)
                    
                    if (cmpeq:boolean(var_6_AF:\u8258\u8389\ub18d\u718f\u61a4\ubf56, aconstnull:\u8258\u8389\ub18d\u718f\u61a4\ubf56())) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-559336981))
                        loopcontinue()
                    }
                    
                    return:\u8258\u8389\ub18d\u718f\u61a4\ubf56(var_6_AF:\u8258\u8389\ub18d\u718f\u61a4\ubf56)
                }
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                return:\u8258\u8389\ub18d\u718f\u61a4\ubf56(getstatic:\uae5d\uc3e3\ube23\u7ce1\u4c04\u4975[expected:\u8258\u8389\ub18d\u718f\u61a4\ubf56](\uae5d\uc3e3\ube23\u7ce1\u4c04\u4975::\u3e75\u624e\uc7fe\u92ff\ua6bd\u7ce1))
            }
        }
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf \u4f4a\ub1b9\u9a18\uc9f6\uc246\u1833(int p0) {
        var_4_6F : \u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf
        
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
            var_4_6F = checkcast:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf.class, invokeinterface:Object[expected:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf](Int2ObjectMap::get, getfield:Int2ObjectMap<\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u3c25\ub113\u4492\ud158\u4ab3\ubb2b, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435), p0:int))
            
            if (cmpeq:boolean(var_4_6F:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf, aconstnull:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf())) {
                if (cmpne:boolean(p0:int, ldc:int(32))) {
                    var_4_6F = invokespecial:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u494c\uc7fe\ud12e\uc9f6\u7d52\ub113, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, invokespecial:\u8258\u8389\ub18d\u718f\u61a4\ubf56(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ubf56\u183a\u8aa5\u0a06\ucfaf\ufe34, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, p0:int))
                }
                else {
                    var_4_6F = getstatic:\u5db4\u4bc8\ua3b4\u76bc\u8df4\u7043[expected:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf](\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\uc87f\u71ae\u5245\uff55\u9255\u5140)
                }
                
                invokeinterface:Object(Int2ObjectMap::put, getfield:Int2ObjectMap<\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u3c25\ub113\u4492\ud158\u4ab3\ubb2b, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435), p0:int, var_4_6F:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf[expected:Object])
            }
            
            return:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(var_4_6F:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf)
        }
        
        goto(Label_0006)
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf \u494c\uc7fe\ud12e\uc9f6\u7d52\ub113(\u71f1\uc910\u3bc9\u516c\u93a2.\u8258\u8389\ub18d\u718f\u61a4\ubf56 p0) {
        var_2_7A : int
        var_4_6B : Iterator<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>
        var_6_12F : \u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf
        var_2_9B : int
        var_4_E5 : \u983f\u34df\ufe34\u7e3f\ucb79\u873d
        var_5_107 : \u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf
        stack_157_0 : \u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf [generated]
        
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
        var_2_7A = and:int(ldc:int(1704912121), ldc:int(1275002077))
        var_4_6B = invokeinterface:Iterator<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>(List<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>::iterator, getfield:List<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ubb2b\u385b\uf9c5\uc84e\u34df\u3d4b, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435))
        
        loop {
            if (cmpne:boolean(and:int(var_2_7A:int, ldc:int(32768)), ldc:int(0))) {
                var_2_7A = and:int(var_2_7A:int, ldc:int(1405022205))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_4_6B:Iterator)) {
                    var_6_12F = invokevirtual:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(\u983f\u34df\ufe34\u7e3f\ucb79\u873d::\uc4d2\u7049\u4ab3\u6b5f\u0800\u67e9, checkcast:\u983f\u34df\ufe34\u7e3f\ucb79\u873d(\u516c\u3d64\u718f\ub171\u6b5f.\u983f\u34df\ufe34\u7e3f\ucb79\u873d.class, invokeinterface:\u983f\u34df\ufe34\u7e3f\ucb79\u873d(Iterator<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>::next, var_4_6B:Iterator<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>)), p0:\u8258\u8389\ub18d\u718f\u61a4\ubf56)
                    
                    if (cmpeq:boolean(var_6_12F:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf, aconstnull:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf())) {
                        var_2_7A = and:int(var_2_7A:int, ldc:int(-71369011))
                        loopcontinue()
                    }
                    
                    return:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(var_6_12F:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf)
                }
            }
            
            if (cmpne:boolean(and:int(var_2_7A:int, ldc:int(8192)), ldc:int(0))) {
                var_2_9B = and:int(var_2_7A:int, ldc:int(1908073725))
                var_4_E5 = initobject:\u983f\u34df\ufe34\u7e3f\ucb79\u873d(\u983f\u34df\ufe34\u7e3f\ucb79\u873d::<init>, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ud7e8\u5d20\uc7fe\ufe34\u97b7\u983f, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ud7e8\u5d20\uc7fe\ufe34\u97b7\u983f, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435))), loadelement:String(getstatic:String[](\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u3bc9\u6435\u47c2\uf9c5\u3a62\u6198), and:int(ldc:int(-2637), ldc:int(2636)))), invokeinterface:int(List<E>::size, getfield:List<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ubb2b\u385b\uf9c5\uc84e\u34df\u3d4b, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435))))), invokeinterface:boolean(\u8258\u8389\ub18d\u718f\u61a4\ubf56::\u8df4\u5654\ud171\u3a62\u4bc8\u3c25, p0:\u8258\u8389\ub18d\u718f\u61a4\ubf56))
                invokeinterface:boolean(List<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>::add, getfield:List<\u983f\u34df\ufe34\u7e3f\ucb79\u873d>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ubb2b\u385b\uf9c5\uc84e\u34df\u3d4b, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435), var_4_E5:\u983f\u34df\ufe34\u7e3f\ucb79\u873d)
                invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u51fa\u4f52\ub171\u8d90\u0b8e\uc910, getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\uae87\u3bc9\ub7dc\u56bd\u8cae\u600f, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u983f\u34df\ufe34\u7e3f\ucb79\u873d::\u97b7\u4c2b\uc246\u6cfe\u8413\u4179, var_4_E5:\u983f\u34df\ufe34\u7e3f\ucb79\u873d), var_4_E5:\u983f\u34df\ufe34\u7e3f\ucb79\u873d[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
                var_5_107 = invokevirtual:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(\u983f\u34df\ufe34\u7e3f\ucb79\u873d::\uc4d2\u7049\u4ab3\u6b5f\u0800\u67e9, var_4_E5:\u983f\u34df\ufe34\u7e3f\ucb79\u873d, p0:\u8258\u8389\ub18d\u718f\u61a4\ubf56)
                
                if (cmpne:boolean(var_5_107:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf, aconstnull:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf())) {
                    var_2_9B = and:int(var_2_9B:int, ldc:int(-404750869))
                    stack_157_0 = var_5_107:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf
                }
                else {
                    stack_157_0 = getfield:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\uafe7\ub113\u8413\ubcb0\u4f4a\u960f, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435)
                }
                
                return:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(stack_157_0:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf)
            }
            
            var_2_7A = and:int(var_2_7A:int, ldc:int(-2086584215))
        }
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf \u9255\u960f\u88c5\u8c8a\u6d99\uc7fe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8350\ub70c\u8753\u0800\u0c95\ud217 p0) {
        var_2_61 : int
        var_4_7E : IntList
        stack_C5_0 : \u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf [generated]
        
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
            var_2_61 = and:int(ldc:int(-371265110), ldc:int(-1644178173))
            var_4_7E = checkcast:IntList(it.unimi.dsi.fastutil.ints.IntList.class, invokeinterface:Object[expected:IntList](Int2ObjectMap::get, getfield:Int2ObjectMap<IntList>(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u51fa\u71f1\u6b5f\u760c\uc2e8\ub8be, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, invokeinterface:float(\u8350\ub70c\u8753\u0800\u0c95\ud217::\u2dcc\u3a62\u67d0\u40a9\u5bc4\uf9c5, p0:\u8350\ub70c\u8753\u0800\u0c95\ud217, and:int[expected:boolean](ldc:int(-28485), ldc:int(28420))))))
            
            if (logicaland:boolean(cmpne:boolean(var_4_7E:IntList, aconstnull:IntList()), logicalnot:boolean(invokeinterface:boolean(IntList::isEmpty, var_4_7E:IntList)))) {
                stack_C5_0 = invokevirtual:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u4f4a\ub1b9\u9a18\uc9f6\uc246\u1833, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, invokeinterface:int(IntList::getInt, var_4_7E:IntList, invokevirtual:int(Random::nextInt, getstatic:Random(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u836c\ub18d\uc2e8\u3bd6\ub113\u7043), invokeinterface:int(IntList::size, var_4_7E:IntList))))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-2004883070))
                stack_C5_0 = getfield:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\uafe7\ub113\u8413\ubcb0\u4f4a\u960f, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435)
            }
            
            return:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(stack_C5_0:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf)
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf \ub102\u52d3\uf94d\u839e\u3504\uc246() {
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
            return:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(getfield:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u8cae\u8753\u156b\u62da\u9937\ubcb0, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8bb0\u67d0\u494c\u516c\ub113\uc87f$2(java.util.List p0, java.util.Set p1, int p2) {
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
    
    private static it.unimi.dsi.fastutil.ints.IntList lambda$\uc238\u8350\u9937\u4cd9\u72f1\uc9f6$1(int p0) {
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
            return:IntList(initobject:IntArrayList[expected:IntList](IntArrayList::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static float lambda$\u3d4b\ub102\u36d3\u34df\ud4fe\u1187$0() {
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
            return:float(ldc:float(4.0f))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u4daf\u71ae\u47c2\ub18d\ub6ab\u647c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_684 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_68F : int
        
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
        var_3_684 = and:int(ldc:int(519705969), ldc:int(-1679985163))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ufcaf\ud7e8\ud158\u6435\u759a\u6435[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(435222377))
            var_5_81 = and:int(ldc:int(28960), ldc:int(-29089))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(7223), ldc:int(-15416)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_684:int, ldc:int(-269385865))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(3459), ldc:int(24641)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(16388), ldc:int(16389)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_D1:int, ldc:int(-1077717001))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(1539), ldc:int(1538)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(876958481))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-643281402))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(494474327))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-346527539))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1777497804))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(215491048))
                    }
                    else {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-34643975))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2026602277))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-588911390))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1084944900))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1488378543))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-247407561))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-822551182))
                            var_11_E2 = and:int(ldc:int(17525), ldc:int(-29814))
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-704701143))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1355520577))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1657380191))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(752719188))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1508777262))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(686751734))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1504212441))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1639828870))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1873698953))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-950001668))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(794980641))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1288439450))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1950289854))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(485023722))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0888:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(115871677))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(906108518))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-428754957))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(308832833))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1182791326))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(736991218))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(37), ldc:int(14339))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1023531638))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1678451211))
                        var_11_E2 = and:int(ldc:int(-26714), ldc:int(10313))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(377006812))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-99150276))
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1530105436))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-339182216))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-966210198))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1155)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(519456869))
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1899530206))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(251207549))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1553)
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-58859897))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(793135827))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(55291256))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1468354193))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1941466117))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2117938457))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-119113731))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-719784384))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1977427199))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1179280694))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1111097986))
                        var_17_68F = add:int(var_16_110:int, xor:int(ldc:int(23040), ldc:int(23041)))
                        looporswitchbreak()
                    }
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(1575787903))
                
                if (cmple:boolean(var_5_81 = var_17_68F:int, sub:int(var_6_88:int, xor:int(ldc:int(45), ldc:int(44))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
