public abstract class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7330\u12b2\u516c\u960f\u9255 {
    public void \u7330\u12b2\u516c\u960f\u9255(com.mojang.serialization.Codec<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u836c\u6b0d\uc3e3\u71f1\u4daf> p0) {
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
            invokespecial:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>::<init>, this:\u7330\u12b2\u516c\u960f\u9255[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>], p0:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>)
            putfield:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u97b7\u7ce1\u071d\u183a\u7af6\ub113, this:\u7330\u12b2\u516c\u960f\u9255, invokestatic:ImmutableMap(ImmutableMap::of))
            putfield:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u183a\u71ae\ubf56\u8640\uc7fe\ub8be, this:\u7330\u12b2\u516c\u960f\u9255, invokestatic:ImmutableMap(ImmutableMap::of))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4cd9\u40a9\u4c04\uf94d\u760c\u69d9(java.util.Random p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p1, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p2, int p3, int p4, int p5, double p6, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p7, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p8, int p9, long p10, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u836c\u6b0d\uc3e3\u71f1\u4daf p11) {
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
    
    public void \u3e75\ub32d\u0a06\u3bc9\ub7dc\u64f2(long p0) {
        var_3_5F : int
        
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
            var_3_5F = and:int(ldc:int(-1129323957), ldc:int(769584475))
            
            if (cmpeq:boolean(getfield:long(\u7330\u12b2\u516c\u960f\u9255::\u5f50\u12b2\u7043\ub1b9\u56bd\u3bd6, this:\u7330\u12b2\u516c\u960f\u9255), p0:long)) {
                if (cmpne:boolean(getfield:\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3(\u7330\u12b2\u516c\u960f\u9255::\u59ec\u8308\u600f\ud171\u494c\u52d3, this:\u7330\u12b2\u516c\u960f\u9255), aconstnull:\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3())) {
                    if (logicalnot:boolean(invokevirtual:boolean(ImmutableMap::isEmpty, getfield:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u97b7\u7ce1\u071d\u183a\u7af6\ub113, this:\u7330\u12b2\u516c\u960f\u9255)))) {
                        if (logicalnot:boolean(invokevirtual:boolean(ImmutableMap::isEmpty, getfield:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u183a\u71ae\ubf56\u8640\uc7fe\ub8be, this:\u7330\u12b2\u516c\u960f\u9255)))) {
                            goto(Label_0241)
                        }
                    }
                }
            }
            
            var_3_5F = and:int(var_3_5F:int, ldc:int(-36737431))
            putfield:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u97b7\u7ce1\u071d\u183a\u7af6\ub113, this:\u7330\u12b2\u516c\u960f\u9255, invokestatic:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u16f6\u6d99\uc29a\u8cae\u3711\uc4d2, invokevirtual:ImmutableList<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u7330\u12b2\u516c\u960f\u9255::\ud523\ub19c\u3711\u3d64\u4e72\ub8be, this:\u7330\u12b2\u516c\u960f\u9255), p0:long))
            putfield:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u183a\u71ae\ubf56\u8640\uc7fe\ub8be, this:\u7330\u12b2\u516c\u960f\u9255, invokestatic:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u16f6\u6d99\uc29a\u8cae\u3711\uc4d2, invokevirtual:ImmutableList<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u7330\u12b2\u516c\u960f\u9255::\u93a2\ud7e8\ubded\uc31c\ub1b9\u3d4b, this:\u7330\u12b2\u516c\u960f\u9255), add:long(p0:long, i2l:long(invokevirtual:int(ImmutableMap::size, getfield:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u97b7\u7ce1\u071d\u183a\u7af6\ub113, this:\u7330\u12b2\u516c\u960f\u9255))))))
            putfield:\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3(\u7330\u12b2\u516c\u960f\u9255::\u59ec\u8308\u600f\ud171\u494c\u52d3, this:\u7330\u12b2\u516c\u960f\u9255, initobject:\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3(\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3::<init>, initobject:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf(\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf::<init>, add:long(add:long(p0:long, i2l:long(invokevirtual:int(ImmutableMap::size, getfield:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u97b7\u7ce1\u071d\u183a\u7af6\ub113, this:\u7330\u12b2\u516c\u960f\u9255)))), i2l:long(invokevirtual:int(ImmutableMap::size, getfield:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(\u7330\u12b2\u516c\u960f\u9255::\u183a\u71ae\ubf56\u8640\uc7fe\ub8be, this:\u7330\u12b2\u516c\u960f\u9255))))), invokestatic:ImmutableList[expected:List<Integer>](ImmutableList::of, invokestatic:Integer[expected:Object](Integer::valueOf, and:int(ldc:int(8476), ldc:int(-8477))))))
            Label_0241:
            putfield:long(\u7330\u12b2\u516c\u960f\u9255::\u5f50\u12b2\u7043\ub1b9\u56bd\u3bd6, this:\u7330\u12b2\u516c\u960f\u9255, p0:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.google.common.collect.ImmutableMap<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3> \u16f6\u6d99\uc29a\u8cae\u3711\uc4d2(com.google.common.collect.ImmutableList<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p0, long p1) {
        var_3_61 : int
        var_5_69 : ImmutableMap$Builder
        var_6_6F : UnmodifiableIterator
        
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
            var_3_61 = and:int(ldc:int(-2001683053), ldc:int(1644034719))
            var_5_69 = initobject:ImmutableMap$Builder(ImmutableMap$Builder::<init>)
            var_6_6F = invokevirtual:UnmodifiableIterator(ImmutableList::iterator, p0:ImmutableList<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)
            
            loop {
                var_3_61 = and:int(var_3_61:int, ldc:int(805043347))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_6F:UnmodifiableIterator[expected:Iterator]))) {
                    looporswitchbreak()
                }
                
                invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, var_5_69:ImmutableMap$Builder, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::next, var_6_6F:Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)), initobject:\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3[expected:Object](\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3::<init>, initobject:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf(\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf::<init>, p1:long), invokestatic:ImmutableList[expected:List<Integer>](ImmutableList::of, invokestatic:Integer[expected:Object](Integer::valueOf, ldc:int(-4)))))
                p1 = add:long(p1:long, ldc:long(1L))
            }
            
            return:ImmutableMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>(invokevirtual:ImmutableMap(ImmutableMap$Builder::build, var_5_69:ImmutableMap$Builder))
        }
        
        goto(Label_0006)
    }
    
    public abstract com.google.common.collect.ImmutableList<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> \ud523\ub19c\u3711\u3d64\u4e72\ub8be();
    
    public abstract com.google.common.collect.ImmutableList<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> \u93a2\ud7e8\ubded\uc31c\ub1b9\u3d4b();
    
    public abstract \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u71ae\u3711\ubded\u494c\u8d90\uf9c5();
    
    public void \u4cd9\u40a9\u4c04\uf94d\u760c\u69d9(java.util.Random p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p1, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p2, int p3, int p4, int p5, double p6, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p7, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p8, int p9, long p10, \u59ec\u8413\u97e6\uc229\u3776.\u3a62\u47c2\u946b\u6c56\u51b2 p11) {
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
            invokevirtual:void(\u7330\u12b2\u516c\u960f\u9255::\u4cd9\u40a9\u4c04\uf94d\u760c\u69d9, this:\u7330\u12b2\u516c\u960f\u9255, p0:Random, p1:\u8aa5\ubded\ub18d\u4f4a\u4f52, p2:\uc2e8\u9255\u647c\ud171\ubf56, p3:int, p4:int, p5:int, p6:double, p7:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p8:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p9:int, p10:long, checkcast:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u836c\u6b0d\uc3e3\u71f1\u4daf.class, p11:\u3a62\u47c2\u946b\u6c56\u51b2[expected:\u836c\u6b0d\uc3e3\u71f1\u4daf]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Double lambda$\u8258\u120d\u51fa\u64ab\u36d3\uc2e8$1(int p0, int p1, int p2, java.util.Map.Entry p3) {
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
            return:Double(invokestatic:Double(Double::valueOf, invokevirtual:double(\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3::\u7bad\u9255\ud7e8\u7bad\ua3b4\u40a9, checkcast:\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3.class, invokeinterface:\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3(Entry<K, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>::getValue, p3:Entry<K, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>)), i2d:double(p0:int), i2d:double(p1:int), i2d:double(p2:int))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Double lambda$\u6fb0\u4c2b\u4492\uc2e8\u59ec\ube23$0(int p0, int p1, int p2, java.util.Map.Entry p3) {
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
            return:Double(invokestatic:Double(Double::valueOf, invokevirtual:double(\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3::\u7bad\u9255\ud7e8\u7bad\ua3b4\u40a9, checkcast:\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3.class, invokeinterface:\u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3(Entry<K, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>::getValue, p3:Entry<K, \u88c5\u446c\u3e2a\ub8be\u3a62\u3dd3>)), i2d:double(p0:int), i2d:double(p1:int), i2d:double(p2:int))))
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u97b7\u6d69\ub70c\u718f\uc2bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_614 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_61F : int
        
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
        var_3_614 = and:int(ldc:int(-2023390125), ldc:int(-1697544476))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7330\u12b2\u516c\u960f\u9255[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
            var_3_614 = and:int(var_3_614:int, ldc:int(-24908032))
            var_5_80 = and:int(ldc:int(-13456), ldc:int(5261))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12775), ldc:int(12740)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_614:int, ldc:int(-702425714))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(45), ldc:int(16641)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(23593), ldc:int(21)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_614 = and:int(var_3_D0:int, ldc:int(730453936))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(6408), ldc:int(6409)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-422510828))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1323)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-14390652))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0780)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-412379152))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0780)
                        }
                    }
                    
                    Label_0380:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(371623541))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1323)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1379332984))
                        goto(Label_1079)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1380234689))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-956887841))
                        goto(Label_0780)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(101259069))
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-470692089))
                            var_11_E1 = and:int(ldc:int(-24503), ldc:int(23602))
                            goto(Label_1428)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-327927496))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1323)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1962773334))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-820657863))
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0780)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1060471464))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(522823002))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0780)
                        }
                    }
                    
                    Label_0669:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1439)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1323)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1125454412))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-978240751))
                            goto(Label_0380)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-481446010))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0780:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(212476763))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(32839768))
                        goto(Label_1323)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(768494390))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(232725103))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0669)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1640552374))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0380)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(184715018))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(518491762))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(16577), ldc:int(8459))
                                goto(Label_1079)
                            }
                        }
                    }
                    
                    Label_0915:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-138291491))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1323)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0780)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-90183765))
                            goto(Label_0669)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-616026397))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1945722801))
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-902988811))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1901867685))
                        var_11_E1 = and:int(ldc:int(14915), ldc:int(-15204))
                    }
                    
                    Label_1079:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-128675458))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1323)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0915)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0780)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0669)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-793808135))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0380)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(1389464733))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1323)
                            }
                        }
                    }
                    
                    Label_1183:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-379481015))
                            goto(Label_1079)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-443858697))
                            goto(Label_0915)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0780)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0669)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1813816372))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(2123380744))
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-31523098))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-289946083))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1428)
                    }
                    
                    Label_1323:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1439)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1079)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0780)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1808416353))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_614 = and:int(var_3_614:int, ldc:int(932965939))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1428:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61F = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1439:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1323)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1322847218))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-564852005))
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1830466870))
                        goto(Label_0780)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1031837838))
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1040357975))
                        goto(Label_0380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-488000381))
                        var_17_61F = add:int(var_16_10F:int, xor:int(ldc:int(16548), ldc:int(16549)))
                        looporswitchbreak()
                    }
                }
                
                var_3_614 = and:int(var_3_614:int, ldc:int(1607589416))
                
                if (cmple:boolean(var_5_80 = var_17_61F:int, sub:int(var_6_87:int, and:int(ldc:int(1), ldc:int(5255))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
