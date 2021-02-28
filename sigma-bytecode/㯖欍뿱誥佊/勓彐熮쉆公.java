public abstract class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u52d3\u5f50\u71ae\uc246\u516c<T> {
    public void \u52d3\u5f50\u71ae\uc246\u516c(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u0800\u6c56\u47c2\ufe34\u5db4 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T> p1) {
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
            invokespecial:Object(Object::<init>, this:\u52d3\u5f50\u71ae\uc246\u516c<T>)
            putfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u7d52\u3776\u7ce1\u97e6\ud158\u6d99>(\u52d3\u5f50\u71ae\uc246\u516c::\u59ec\ubf56\ucef1\ubcb0\ubb2b\u6435, this:\u52d3\u5f50\u71ae\uc246\u516c<T>, invokestatic:LinkedHashMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u7d52\u3776\u7ce1\u97e6\ud158\u6d99>](Maps::newLinkedHashMap))
            putfield:\u0800\u6c56\u47c2\ufe34\u5db4(\u52d3\u5f50\u71ae\uc246\u516c::\ucfaf\u0a06\u64ab\u7d52\u527a\u3711, this:\u52d3\u5f50\u71ae\uc246\u516c<T>, p0:\u0800\u6c56\u47c2\ufe34\u5db4)
            putfield:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>(\u52d3\u5f50\u71ae\uc246\u516c::\u392e\u494c\u5bc4\u6c56\u5db4\u3bc9, this:\u52d3\u5f50\u71ae\uc246\u516c<T>, p1:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract void \ub70c\u93a2\ufe34\u759a\ud12e\u494c();
    
    public void \u9a18\u47c2\u74b1\u8258\u3c25\u946b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4daf\u72f1\u16f6\u8aa5\u8389 p0) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.BasicBlock
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
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
    
    public abstract java.nio.file.Path \u5d20\u8d90\u12b2\ubff1\uf9c5\uc2bd(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0);
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u4ab3\u51b2\u12cb\u16f6\u2dcc<T> \u5140\uc229\u52d3\uc29a\u416d\u7d52(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<T> p0) {
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
            return:\u4ab3\u51b2\u12cb\u16f6\u2dcc<T>(initobject:\u4ab3\u51b2\u12cb\u16f6\u2dcc<T>(\u4ab3\u51b2\u12cb\u16f6\u2dcc<T>::<init>, invokevirtual:\u7d52\u3776\u7ce1\u97e6\ud158\u6d99(\u52d3\u5f50\u71ae\uc246\u516c<T>::\u4cd9\u3dd3\u8cae\u52d3\ud51e\u51fa, this:\u52d3\u5f50\u71ae\uc246\u516c<T>, p0:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<T>), getfield:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>(\u52d3\u5f50\u71ae\uc246\u516c::\u392e\u494c\u5bc4\u6c56\u5db4\u3bc9, this:\u52d3\u5f50\u71ae\uc246\u516c<T>), ldc:String("vanilla"), aconstnull:\u8753\ubcb0\u8709\u120d\u873d()))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u7d52\u3776\u7ce1\u97e6\ud158\u6d99 \u4cd9\u3dd3\u8cae\u52d3\ud51e\u51fa(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<T> p0) {
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
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u7d52\u3776\u7ce1\u97e6\ud158\u6d99 lambda$\ubff1\u6ec6\u6b5f\u88c5\u3a62\ufcaf$3(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\u7d52\u3776\u7ce1\u97e6\ud158\u6d99(initobject:\u7d52\u3776\u7ce1\u97e6\ud158\u6d99(\u7d52\u3776\u7ce1\u97e6\ud158\u6d99::<init>))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ucfaf\uc3e3\ubb2b\u1187\u7bad\u72f1$2(java.util.function.Function p0, java.util.function.Function p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4daf\u72f1\u16f6\u8aa5\u8389 p2, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p3, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u7d52\u3776\u7ce1\u97e6\ud158\u6d99 p4) {
        var_6_93 : int
        var_8_7C : List<? super \u4492\u51fa\u8413\u3bd6\uc31c\ubded>
        var_9_13A : JsonObject
        var_6_142 : int
        var_10_14A : Path
        var_11_15C : String
        var_12_173 : String
        var_13_351 : BufferedWriter
        var_14_354 : Throwable
        var_15_38F : Throwable
        var_17_3B4 : Throwable
        var_11_41E : IOException
        stack_12A_0 : String [generated]
        expr_F8 : Object[] [generated]
        
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
        var_6_93 = and:int(and:int(ldc:int(-787631030), ldc:int(1955520478)), ldc:int(1565269726))
        var_8_7C = checkcast:List<? super \u4492\u51fa\u8413\u3bd6\uc31c\ubded>(java.util.List<? super \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4492\u51fa\u8413\u3bd6\uc31c\ubded>.class, invokeinterface:List<? super \u4492\u51fa\u8413\u3bd6\uc31c\ubded>(Stream<\u4492\u51fa\u8413\u3bd6\uc31c\ubded>::collect, invokevirtual:Stream<\u4492\u51fa\u8413\u3bd6\uc31c\ubded>(\u7d52\u3776\u7ce1\u97e6\ud158\u6d99::\uc87f\ubb2b\ua3b4\u4daf\u1187\u93a2, p4:\u7d52\u3776\u7ce1\u97e6\ud158\u6d99, p0:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<Object>>, p1:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Object>), invokestatic:Collector<\u4492\u51fa\u8413\u3bd6\uc31c\ubded, ?, List<\u4492\u51fa\u8413\u3bd6\uc31c\ubded>>(Collectors::toList)))
        
        loop {
            if (cmpne:boolean(and:int(var_6_93:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0212)
            }
            
            if (cmpeq:boolean(and:int(var_6_93:int, ldc:int(268435456)), ldc:int(0))) {
                var_6_93 = and:int(var_6_93:int, ldc:int(-239841674))
            }
            else {
                var_6_93 = and:int(var_6_93:int, ldc:int(-703719942))
                
                if (invokeinterface:boolean(List<E>::isEmpty, var_8_7C:List<? super \u4492\u51fa\u8413\u3bd6\uc31c\ubded>)) {
                    var_9_13A = invokevirtual:JsonObject(\u7d52\u3776\u7ce1\u97e6\ud158\u6d99::\u3d64\u4492\uc7fe\u8350\ud7e8\u8d98, p4:\u7d52\u3776\u7ce1\u97e6\ud158\u6d99)
                    var_6_142 = and:int(var_6_93:int, ldc:int(-779266182))
                    var_10_14A = invokevirtual:Path(\u52d3\u5f50\u71ae\uc246\u516c<T>::\u5d20\u8d90\u12b2\ubff1\uf9c5\uc2bd, this:\u52d3\u5f50\u71ae\uc246\u516c<T>, p3:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                    
                    try {
                        var_6_142 = and:int(var_6_142:int, ldc:int(2015196911))
                        var_11_15C = invokevirtual:String(Gson::toJson, getstatic:Gson(\u52d3\u5f50\u71ae\uc246\u516c::\u2dcc\u416d\u946b\ub171\ubff1\ud7e8), var_9_13A:JsonElement)
                        var_6_142 = and:int(var_6_142:int, ldc:int(1599075947))
                        var_12_173 = invokevirtual:String(HashCode::toString, invokeinterface:HashCode(HashFunction::hashUnencodedChars, getstatic:HashFunction(\u52d3\u5f50\u71ae\uc246\u516c::\uc87f\u4975\ub8be\u4e72\u7c6b\u6cfe), var_11_15C:String[expected:CharSequence]))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_0984)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(128)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(-1666434578))
                                goto(Label_0739)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(4)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(1851023029))
                                goto(Label_0645)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_0551)
                            }
                            
                            if (cmpeq:boolean(and:int(var_6_142:int, ldc:int(16)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(-226609682))
                                
                                if (logicalnot:boolean(invokestatic:boolean(Objects::equals, invokevirtual:String[expected:Object](\u4daf\u72f1\u16f6\u8aa5\u8389::\u759a\ub171\u62da\u8308\uae87\ub32d, p2:\u4daf\u72f1\u16f6\u8aa5\u8389, var_10_14A:Path), var_12_173:String[expected:Object]))) {
                                    goto(Label_0645)
                                }
                            }
                            
                            Label_0460:
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(128)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(796211430))
                                goto(Label_0984)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Label_0739)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_0645)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(16384)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(-389515451))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_6_142:int, ldc:int(4)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_6_142 = and:int(var_6_142:int, ldc:int(1934614495))
                                
                                if (invokestatic:boolean(Files::exists, var_10_14A:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-23704), ldc:int(7319))))) {
                                    goto(Label_0976)
                                }
                            }
                            
                            Label_0551:
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(536870912)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(-2130878510))
                                goto(Label_0984)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(4)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(1525797727))
                                goto(Label_0739)
                            }
                            
                            if (cmpeq:boolean(and:int(var_6_142:int, ldc:int(262144)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(-354835668))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_6_142:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_6_142 = and:int(var_6_142:int, ldc:int(-625512719))
                                    goto(Label_0460)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_142:int, ldc:int(4)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_6_142 = and:int(var_6_142:int, ldc:int(1351368175))
                            }
                            
                            Label_0645:
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(134217728)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(-1314933788))
                                goto(Label_0984)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(8)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_6_142:int, ldc:int(134217728)), ldc:int(0))) {
                                    goto(Label_0551)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_142:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_6_142 = and:int(var_6_142:int, ldc:int(-707379395))
                                    goto(Label_0460)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_142:int, ldc:int(33554432)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_6_142 = and:int(var_6_142:int, ldc:int(2002566751))
                                invokestatic:Path(Files::createDirectories, invokeinterface:Path(Path::getParent, var_10_14A:Path), newarray:FileAttribute[](java.nio.file.attribute.FileAttribute.class, and:int(ldc:int(-29375), ldc:int(25246))))
                            }
                            
                            Label_0739:
                            
                            if (cmpeq:boolean(and:int(var_6_142:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_0984)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(4194304)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(-893006534))
                                goto(Label_0645)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(4)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(-174122343))
                                goto(Label_0551)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(16384)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(-1695288521))
                                goto(Label_0460)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(4)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(-123325156))
                                loopcontinue()
                            }
                            
                            var_6_142 = and:int(var_6_142:int, ldc:int(1402911950))
                            var_13_351 = invokestatic:BufferedWriter(Files::newBufferedWriter, var_10_14A:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(-8669), ldc:int(8668))))
                            var_14_354 = aconstnull:Throwable()
                            
                            try {
                                invokevirtual:void(Writer::write, var_13_351:BufferedWriter[expected:Writer], var_11_15C:String)
                            }
                            catch (java.lang.Throwable var_15_38F) {
                                var_14_354 = var_15_38F:Throwable
                                athrow(var_15_38F:Throwable)
                            }
                            finally {
                                if (cmpne:boolean(var_13_351:BufferedWriter, aconstnull:BufferedWriter())) {
                                    if (cmpne:boolean(var_14_354:Throwable, aconstnull:Throwable())) {
                                        try {
                                            invokevirtual:void(BufferedWriter::close, var_13_351:BufferedWriter)
                                        }
                                        catch (java.lang.Throwable var_17_3B4) {
                                            invokevirtual:void(Throwable::addSuppressed, var_14_354:Throwable, var_17_3B4:Throwable)
                                        }
                                    }
                                    else {
                                        invokevirtual:void(BufferedWriter::close, var_13_351:BufferedWriter)
                                    }
                                }
                            }
                            
                            Label_0976:
                            invokevirtual:void(\u4daf\u72f1\u16f6\u8aa5\u8389::\ud158\uf94d\uae87\u56bd\uf995\u92ff, p2:\u4daf\u72f1\u16f6\u8aa5\u8389, var_10_14A:Path, var_12_173:String)
                            Label_0984:
                            
                            if (cmpeq:boolean(and:int(var_6_142:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_0739)
                            }
                            
                            if (cmpeq:boolean(and:int(var_6_142:int, ldc:int(524288)), ldc:int(0))) {
                                var_6_142 = and:int(var_6_142:int, ldc:int(183501898))
                                goto(Label_0645)
                            }
                            
                            if (cmpeq:boolean(and:int(var_6_142:int, ldc:int(8)), ldc:int(0))) {
                                goto(Label_0551)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(4)), ldc:int(0))) {
                                goto(Label_0460)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_142:int, ldc:int(524288)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_6_142 = and:int(var_6_142:int, ldc:int(-94407186))
                    }
                    catch (java.io.IOException var_11_41E) {
                        invokeinterface:void(Logger::error, getstatic:Logger(\u52d3\u5f50\u71ae\uc246\u516c::\ubf56\u5d20\u760c\u7bad\u4e72\u9a18), ldc:String("Couldn't save tags to {}"), var_10_14A:Path[expected:Object], var_11_41E:IOException[expected:Object])
                    }
                    
                    return:void()
                }
            }
            
            Label_0169:
            
            if (cmpne:boolean(and:int(var_6_93:int, ldc:int(8388608)), ldc:int(0))) {
                var_6_93 = and:int(var_6_93:int, ldc:int(96196734))
            }
            else {
                if (cmpne:boolean(and:int(var_6_93:int, ldc:int(4)), ldc:int(0))) {
                    var_6_93 = and:int(var_6_93:int, ldc:int(1159760365))
                    loopcontinue()
                }
                
                var_6_93 = and:int(var_6_93:int, ldc:int(-570589606))
            }
            
            Label_0212:
            
            if (cmpne:boolean(and:int(var_6_93:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0169)
            }
            
            if (cmpeq:boolean(and:int(var_6_93:int, ldc:int(33554432)), ldc:int(0))) {
                stack_12A_0 = ldc:String("Couldn't define tag %s as it is missing following references: %s")
                expr_F8 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2106), ldc:int(70)))
                storeelement:Object(expr_F8:Object[], and:int(ldc:int(14377), ldc:int(-15466)), p3:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                storeelement:Object(expr_F8:Object[], and:int(ldc:int(3083), ldc:int(12581)), invokeinterface:String[expected:Object](Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, var_8_7C:Collection<Object>), invokedynamic:Function<Object, String>(apply:()Ljava/util/function/Function;)), invokestatic:Collector<CharSequence, ?, String>(Collectors::joining, ldc:String[expected:CharSequence](","))))
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokestatic:String(String::format, stack_12A_0:String, expr_F8:Object[])))
            }
        }
    }
    
    private java.lang.Object lambda$\u71ae\u98a4\ub6ab\ucef1\u0c95\u3776$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:Object(invokevirtual:T[expected:Object](Optional<T>::orElse, invokevirtual:Optional<T>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u624e\uc238\u71f1\ub102\ua562\ub8be, getfield:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>(\u52d3\u5f50\u71ae\uc246\u516c::\u392e\u494c\u5bc4\u6c56\u5db4\u3bc9, this:\u52d3\u5f50\u71ae\uc246\u516c<T>), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), aconstnull:T()))
        }
        
        goto(Label_0006)
    }
    
    private \u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3 lambda$\u71f1\uff55\u16f6\u4e72\u927d\u0c95$0(\u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
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
            return:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3(ternaryop:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u7d52\u3776\u7ce1\u97e6\ud158\u6d99>(\u52d3\u5f50\u71ae\uc246\u516c::\u59ec\ubf56\ucef1\ubcb0\ubb2b\u6435, this:\u52d3\u5f50\u71ae\uc246\u516c<T>), p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]), p0:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3, aconstnull:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3()))
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
            putstatic:Logger(\u52d3\u5f50\u71ae\uc246\u516c::\ubf56\u5d20\u760c\u7bad\u4e72\u9a18, invokestatic:Logger(LogManager::getLogger))
            putstatic:Gson(\u52d3\u5f50\u71ae\uc246\u516c::\u2dcc\u416d\u946b\ub171\ubff1\ud7e8, invokevirtual:Gson(GsonBuilder::create, invokevirtual:GsonBuilder(GsonBuilder::setPrettyPrinting, initobject:GsonBuilder(GsonBuilder::<init>))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5fe1\u873d\u3d64\ua562\u8aa5\u4179(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_691 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_69C : int
        
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
        var_3_691 = and:int(ldc:int(-439495854), ldc:int(-1275274273))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u52d3\u5f50\u71ae\uc246\u516c<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2)), ldc:int(0))) {
            var_3_691 = and:int(var_3_691:int, ldc:int(1204763419))
        }
        else {
            var_3_691 = and:int(var_3_691:int, ldc:int(-1426153609))
            var_5_8A = and:int(ldc:int(-10611), ldc:int(10610))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10795), ldc:int(10794)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_691:int, ldc:int(-1141970077))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, xor:int(ldc:int(129), ldc:int(128)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(-32760), ldc:int(-32759)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_691 = and:int(var_3_E2:int, ldc:int(-1998606346))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(10393), ldc:int(16455)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(858857317))
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(32)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(1455926367))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(512)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-739014303))
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(793904419))
                        goto(Label_0768)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(4164869))
                        goto(Label_0609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-68224137))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0609)
                            }
                            
                            goto(Label_0873)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(1337391363))
                        goto(Label_1586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(32)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(293566415))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-565682675))
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-2123873854))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0768)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-233370512))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(-15132154))
                            loopcontinue()
                        }
                        
                        var_3_691 = and:int(var_3_691:int, ldc:int(-117514373))
                        var_11_F3 = and:int(ldc:int(28788), ldc:int(-31862))
                        goto(Label_1575)
                    }
                    
                    Label_0609:
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(1516996214))
                        goto(Label_1586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1543108125))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(1107387695))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1703887869))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(1655907378))
                        goto(Label_1014)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1123091031))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(113620346))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(256)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(-2011371894))
                            loopcontinue()
                        }
                        
                        var_3_691 = and:int(var_3_691:int, ldc:int(-84102190))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0873)
                        }
                    }
                    
                    Label_0768:
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1127767769))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_691:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1007903801))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0873:
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(478213551))
                        goto(Label_1586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1256555297))
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1441736639))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-356078273))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0768)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(-2039657391))
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_691:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(862400201))
                            loopcontinue()
                        }
                        
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1612713122))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = xor:int(ldc:int(12), ldc:int(13))
                                goto(Label_1183)
                            }
                        }
                    }
                    
                    Label_1014:
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-52784393))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(64)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(1011542216))
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_691:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0768)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(494573919))
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(-2021379324))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(512)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(-1867096966))
                            loopcontinue()
                        }
                        
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1644260502))
                        var_11_F3 = and:int(ldc:int(2936), ldc:int(-2941))
                    }
                    
                    Label_1183:
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1968005946))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(2087650932))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1014)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0768)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_691:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(-1638146253))
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(-1420108348))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_691 = and:int(var_3_691:int, ldc:int(-321012914))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1430)
                            }
                        }
                    }
                    
                    Label_1306:
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_691:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1183)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(609478866))
                            goto(Label_1014)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_691:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0768)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_691:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(64)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(186789472))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2)), ldc:int(0))) {
                            var_3_691 = and:int(var_3_691:int, ldc:int(-886111639))
                            loopcontinue()
                        }
                        
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1477596342))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                        goto(Label_1575)
                    }
                    
                    Label_1430:
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(1450586398))
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(1557103976))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1514859426))
                        goto(Label_1014)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(64)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(1863930376))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0768)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-931648996))
                        goto(Label_0609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_691 = and:int(var_3_691:int, ldc:int(-1479565470))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1575:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69C = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1586:
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1014)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-1004916547))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0768)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(32)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-299284154))
                        goto(Label_0609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_691:int, ldc:int(512)), ldc:int(0))) {
                        var_3_691 = and:int(var_3_691:int, ldc:int(-302018713))
                        var_17_69C = add:int(var_16_121:int, xor:int(ldc:int(8193), ldc:int(8192)))
                        looporswitchbreak()
                    }
                }
                
                var_3_691 = and:int(var_3_691:int, ldc:int(-771887130))
                
                if (cmple:boolean(var_5_8A = var_17_69C:int, sub:int(var_6_91:int, and:int(ldc:int(16713), ldc:int(165))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_691:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_691 = and:int(var_3_691:int, ldc:int(1810813443))
            goto(Label_0108)
        }
    }
}
