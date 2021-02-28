public final class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u6198\u8c8a\u960f\ubefe\u8d90<E> {
    private void \u6198\u8c8a\u960f\ubefe\u8d90(java.util.Collection<? extends \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>> p0, java.util.Collection<? extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8350\uf9c5\ubb2b\ub70c\u9255<? extends \u36d3\u9033\u6b0d\u983f\u8d90.\u0c95\u8cae\u67e9\u67e9\ub18d<? super E>>> p1) {
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
            invokespecial:Object(Object::<init>, this:\u6198\u8c8a\u960f\ubefe\u8d90<E>)
            putfield:Collection<? extends \ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>(\u6198\u8c8a\u960f\ubefe\u8d90::\u836c\ud12e\u8d98\ucb79\ubf56\u647c, this:\u6198\u8c8a\u960f\ubefe\u8d90<E>, p0:Collection<? extends \ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>)
            putfield:Collection<? extends \u8350\uf9c5\ubb2b\ub70c\u9255<? extends \u0c95\u8cae\u67e9\u67e9\ub18d<? super E>>>(\u6198\u8c8a\u960f\ubefe\u8d90::\u8bb0\u7873\u8308\u6198\ub7dc\ua3b4, this:\u6198\u8c8a\u960f\ubefe\u8d90<E>, p1:Collection<? extends \u8350\uf9c5\ubb2b\ub70c\u9255<? extends \u0c95\u8cae\u67e9\u67e9\ub18d<? super E>>>)
            putfield:Codec<\ub32d\u92ff\uc2bd\ud36e\ud36e<E>>(\u6198\u8c8a\u960f\ubefe\u8d90::\u6bb9\u69d9\u8d98\u92ff\u4975\u8d90, this:\u6198\u8c8a\u960f\ubefe\u8d90<E>, invokestatic:Codec(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\u385b\u74b1\ua562\u516c\u5654\u69d9, p0:Collection<? extends \ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>, p1:Collection<? extends \u8350\uf9c5\ubb2b\ub70c\u9255<? extends \u0c95\u8cae\u67e9\u67e9\ub18d<? super E>>>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e<E> \u3bc9\u8258\uc29a\uc9f6\u759a\u8350(com.mojang.serialization.Dynamic<?> p0) {
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
    
    private \u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e lambda$\uc229\u527a\u3a62\ucb79\u7ce1\u9937$1() {
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
    
    private com.mojang.serialization.Codec lambda$\u7af6\u59ec\u120d\u72f1\ud158\u5fe1$0() {
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
            return:Codec(getfield:Codec<\ub32d\u92ff\uc2bd\ud36e\ud36e<E>>(\u6198\u8c8a\u960f\ubefe\u8d90::\u6bb9\u69d9\u8d98\u92ff\u4975\u8d90, this:\u6198\u8c8a\u960f\ubefe\u8d90<E>))
        }
        
        goto(Label_0006)
    }
    
    public void \u6198\u8c8a\u960f\ubefe\u8d90(java.util.Collection p0, java.util.Collection p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u7049\u3504\ua3b4\u4f4a\ubff1 p2) {
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
            invokespecial:\u6198\u8c8a\u960f\ubefe\u8d90(\u6198\u8c8a\u960f\ubefe\u8d90::<init>, this:\u6198\u8c8a\u960f\ubefe\u8d90<E>, p0:Collection, p1:Collection)
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
    
    public void \u99f7\ud36e\uc29a\u392e\uc4d2\u4d85(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F8 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_603 : int
        
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
        var_3_5F8 = and:int(ldc:int(-482737850), ldc:int(1782981102))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6198\u8c8a\u960f\ubefe\u8d90<E>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1246987058))
            var_5_7D = and:int(ldc:int(-4834), ldc:int(737))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11686), ldc:int(-11751)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F8:int, ldc:int(-1357799971))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(5569), ldc:int(8209)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(16386), ldc:int(16387)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F8 = and:int(var_3_D2:int, ldc:int(-880620601))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1153), ldc:int(8267)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(325846766))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-197130002))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-180181258))
                        goto(Label_1024)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1734811983))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1243881855))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(106690418))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1024)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-419840396))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2104724145))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1420793241))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1016101561))
                            var_11_E3 = and:int(ldc:int(-1061), ldc:int(1060))
                            goto(Label_1395)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-2577979))
                        goto(Label_1024)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(845458848))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-818266769))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(354697399))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-410645697))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1518972159))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1755670881))
                        goto(Label_1024)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1367316455))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1245285206))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-140726419))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-812447426))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-589272605))
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1024)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1535945118))
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-2021886529))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(20673), ldc:int(8209))
                                goto(Label_1024)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1561197126))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-2031500142))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1245287987))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(456961105))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(579152383))
                        var_11_E3 = and:int(ldc:int(3228), ldc:int(-3229))
                    }
                    
                    Label_1024:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(385276581))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-617395640))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(611053149))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2028779886))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1367805793))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1682118844))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1267)
                            }
                        }
                    }
                    
                    Label_1149:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1024)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(290550822))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-785164324))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1387159590))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-80576573))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1395)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1267:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1207383259))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1024)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1891552765))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1303793690))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-240216824))
                        loopcontinue()
                    }
                    
                    var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2009375142))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1395:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_603 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1406:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(888956436))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1024)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(796487943))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1530050349))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(477661333))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(861746738))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-626837681))
                        var_17_603 = add:int(var_16_111:int, xor:int(ldc:int(17408), ldc:int(17409)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1823462534))
                }
                
                var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-279341275))
                
                if (cmple:boolean(var_5_7D = var_17_603:int, sub:int(var_6_84:int, and:int(ldc:int(3649), ldc:int(12289))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1755811311))
            goto(Label_0106)
        }
    }
}
