public class \u5d20\u97b7\u8753\u873d\u16f6.\u3e75\u446c\u7d52\u718f\ua61f\uc238 {
    public void \u3e75\u446c\u7d52\u718f\ua61f\uc238() {
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
            invokespecial:\u4bc8\ud36e\u4975\uc9f6\u760c\u16f6(\u4bc8\ud36e\u4975\uc9f6\u760c\u16f6::<init>, this:\u3e75\u446c\u7d52\u718f\ua61f\uc238)
            putfield:Map<\u965f\u69d9\u600f\uc3e3\u12cb\ub83f, List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>>(\u3e75\u446c\u7d52\u718f\ua61f\uc238::\u7d52\uc31c\u7330\ufe34\u12cb\ud523, this:\u3e75\u446c\u7d52\u718f\ua61f\uc238, invokestatic:ImmutableMap[expected:Map<\u965f\u69d9\u600f\uc3e3\u12cb\ub83f, List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>>](ImmutableMap::of))
            putfield:List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>(\u3e75\u446c\u7d52\u718f\ua61f\uc238::\u93a2\u839e\u4492\u8d90\u5db4\ucef1, this:\u3e75\u446c\u7d52\u718f\ua61f\uc238, invokestatic:ImmutableList[expected:List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>](ImmutableList::of))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uf995\uc246\u6d69\ud12e\uf94d\ub7dc(java.lang.Iterable<\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>> p0) {
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
    
    private static java.util.Map<\ub113\ufcaf\u3c25\u071d\u97b7.\u965f\u69d9\u600f\uc3e3\u12cb\ub83f, java.util.List<java.util.List<\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>>> \uc229\ua562\u64f2\u8cae\u385b\uc910(java.lang.Iterable<\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>> p0) {
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
    
    private static \ub113\ufcaf\u3c25\u071d\u97b7.\u965f\u69d9\u600f\uc3e3\u12cb\ub83f \u4179\u4492\u6b5f\uf995\u52d3\ub18d(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?> p0) {
        var_1_620 : int
        var_3_66 : \uc3e3\u8cae\u4e72\u4e72\u16f6\u760c
        stack_634_0 : \u965f\u69d9\u600f\uc3e3\u12cb\ub83f [generated]
        stack_3D8_0 : Logger [generated]
        stack_3D8_1 : String [generated]
        expr_3B2 : Supplier[] [generated]
        stack_5A2_0 : \u965f\u69d9\u600f\uc3e3\u12cb\ub83f [generated]
        var_5_3F5 : \u718f\u99f7\u5bc4\u62da\uff55\u4d85
        stack_495_0 : \u965f\u69d9\u600f\uc3e3\u12cb\ub83f [generated]
        
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
        var_1_620 = and:int(ldc:int(-2139781679), ldc:int(-939596303))
        var_3_66 = invokeinterface:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7::\uc246\u92ff\u392e\u494c\u071d\uff55, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7)
        
        if (cmpne:boolean(var_3_66:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\uc238\u8d98\u4f4a\uc910\uc910\ubb2b>, getstatic:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\uc238\u8d98\u4f4a\uc910\uc910\ubb2b>(\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c::\uc2e8\u76bc\u12cb\ud158\u3711\u3bd6))) {
            loop {
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_1462)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1296)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1219530766))
                    goto(Label_1193)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0791)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0675)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0543)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(512)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(200257456))
                    goto(Label_0422)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0316)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(64)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1535338304))
                    
                    if (cmpeq:boolean(var_3_66:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\u7ce1\u759a\ud523\u0a06\u8389\u1187>, getstatic:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\u7ce1\u759a\ud523\u0a06\u8389\u1187>(\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c::\ub113\uae87\u5245\ubcb0\uc2e8\u6d99))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\uc2bd\u4c2b\u6b5f\u7af6\uc84e\ub8be, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7::\u446c\ucef1\u1187\u8aa5\u7330\u5245, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7))))) {
                            goto(Label_1193)
                        }
                        
                        return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\u62da\u4c2b\u8709\u4975\uae5d\u4c2b))
                    }
                }
                
                Label_0201:
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(1105065818))
                    goto(Label_1462)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(1504545792))
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1193)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0791)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0675)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-610253377))
                    goto(Label_0543)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0422)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(128)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(2119978890))
                        loopcontinue()
                    }
                    
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1208156717))
                    
                    if (cmpeq:boolean(var_3_66:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\ubb2b\u97b7\u624e\u760c\u8c8a\u839e>, getstatic:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\ubb2b\u97b7\u624e\u760c\u8c8a\u839e>(\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c::\u8308\ud523\u5140\uc3e3\u759a\ubff1))) {
                        if (logicalnot:boolean(instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u0b8e\u7af6\u74b1\u12b2\u0800\u12b2.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7::\u446c\ucef1\u1187\u8aa5\u7330\u5245, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7))))) {
                            goto(Label_1462)
                        }
                        
                        stack_634_0 = getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\u759a\u4daf\u7c6b\uc29a\u8753\u839e)
                        return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(stack_634_0:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f)
                    }
                }
                
                Label_0316:
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1462)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(128)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-2034169380))
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(64)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(169425096))
                    goto(Label_1193)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0791)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0675)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0543)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(890905408))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1317755706))
                    
                    if (cmpeq:boolean(var_3_66:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\u5f50\u67e9\u3504\u965f\ucb79\u3e75>, getstatic:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\u5f50\u67e9\u3504\u965f\ucb79\u3e75>(\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c::\u4e72\u12cb\ub113\u51fa\ube23\u6198))) {
                        return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\u4179\u8413\uafe7\u74b1\ubb2b\u965f))
                    }
                }
                
                Label_0422:
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1650843847))
                    goto(Label_1462)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-996992267))
                    goto(Label_1193)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0791)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0675)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-674326342))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-970062285))
                        goto(Label_0316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(1549966698))
                        goto(Label_0201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1862474768))
                    
                    if (cmpeq:boolean(var_3_66:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\u873d\u7bad\u56bd\uf9c5\uc84e\u3bd6>, getstatic:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\u873d\u7bad\u56bd\uf9c5\uc84e\u3bd6>(\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c::\u40a9\u6fb0\u839e\ua61f\u156b\ub113))) {
                        return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\u8bb0\uc3e3\u3d64\uc3e3\u7d52\u6198))
                    }
                }
                
                Label_0543:
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1462)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(64)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(1997995190))
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-818474981))
                    goto(Label_1193)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0791)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-779153680))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(764483786))
                        goto(Label_0422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-1655218597))
                        goto(Label_0316)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(2007124837))
                        loopcontinue()
                    }
                    
                    var_1_620 = and:int(var_1_620:int, ldc:int(-67664648))
                    
                    if (cmpeq:boolean(var_3_66:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\u71f1\ud12e\ua562\u72f1\u0800\u6198>, getstatic:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\u71f1\ud12e\ua562\u72f1\u0800\u6198>(\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c::\u7c6b\u385b\u527a\u3bd6\uae87\u3c25))) {
                        return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\u47c2\u74b1\u965f\ub102\ub1b9\u4daf))
                    }
                }
                
                Label_0675:
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-529468633))
                    goto(Label_1462)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(273500201))
                    goto(Label_1193)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(2065984292))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0543)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-971508462))
                        goto(Label_0201)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_620 = and:int(var_1_620:int, ldc:int(-998341401))
                    
                    if (cmpeq:boolean(var_3_66:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\u071d\uc2bd\u6b5f\ua61f\u946b\u97e6>, getstatic:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\u071d\uc2bd\u6b5f\ua61f\u946b\u97e6>(\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c::\u62da\u36d3\u600f\uf9c5\ubff1\u1187))) {
                        return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\ub83f\u3bc9\u183a\u3e75\u8c8a\u960f))
                    }
                }
                
                Label_0791:
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(1113388927))
                    goto(Label_1462)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(512)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-1643466061))
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-2129123686))
                        goto(Label_0543)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(1782052988))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-692525448))
                        goto(Label_0316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(1190918983))
                        goto(Label_0201)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(512)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-241959633))
                        loopcontinue()
                    }
                    
                    stack_3D8_0 = getstatic:Logger(\u3e75\u446c\u7d52\u718f\ua61f\uc238::\u600f\u67d0\u61a4\uc229\u5f50\ubf56)
                    stack_3D8_1 = loadelement:String(getstatic:String[](\u3e75\u446c\u7d52\u718f\ua61f\uc238::\u6ec6\u4c2b\ub171\ubcb0\u8cae\u3776), and:int(ldc:int(3175), ldc:int(-3304)))
                    expr_3B2 = newarray:Supplier[](org.apache.logging.log4j.util.Supplier.class, xor:int(ldc:int(16482), ldc:int(16480)))
                    storeelement:Supplier(expr_3B2:Supplier[], and:int(ldc:int(1125), ldc:int(-1126)), invokedynamic:Supplier(get:(L\u494c\u4975\ua068\u0c95\uc84e/\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7;)Lorg/apache/logging/log4j/util/Supplier;, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7))
                    storeelement:Supplier(expr_3B2:Supplier[], and:int(ldc:int(2349), ldc:int(16515)), invokedynamic:Supplier(get:(L\u494c\u4975\ua068\u0c95\uc84e/\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7;)Lorg/apache/logging/log4j/util/Supplier;, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7))
                    invokeinterface:void(Logger::warn, stack_3D8_0:Logger, stack_3D8_1:String, expr_3B2:Supplier[])
                    return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\ufe34\u4e72\u946b\u6b5f\ubf56\uae87))
                }
                
                Label_1193:
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1462)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1970385715))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0791)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-1958994555))
                        goto(Label_0543)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0201)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1694642439))
                    
                    if (instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u0b8e\u7af6\u74b1\u12b2\u0800\u12b2.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7::\u446c\ucef1\u1187\u8aa5\u7330\u5245, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7)))) {
                        stack_5A2_0 = getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\ud217\u7ce1\u67e9\ubded\u0c95\ubf56)
                        looporswitchbreak()
                    }
                }
                
                Label_1296:
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(1651825779))
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-33299167))
                        goto(Label_0543)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(512)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(256857931))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(1644988751))
                        goto(Label_0316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0201)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_620:int, ldc:int(512)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-794171189))
                        loopcontinue()
                    }
                    
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1200243995))
                    stack_5A2_0 = getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\u6198\u3d4b\u34df\u9a18\ub102\u2dcc)
                    looporswitchbreak()
                }
                
                Label_1462:
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1850999428))
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1193)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0791)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0675)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0543)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0422)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(512)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-1471336490))
                    goto(Label_0316)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(1756686801))
                    goto(Label_0201)
                }
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-721953045))
                    stack_634_0 = getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\u4ab3\ud36e\u983f\u071d\u3776\u0a06)
                    return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(stack_634_0:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f)
                }
                
                var_1_620 = and:int(var_1_620:int, ldc:int(-221463902))
            }
            
            return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(stack_5A2_0:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f)
        }
        
        var_5_3F5 = invokevirtual:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u36d3\u6cfe\u3a62\u946b\u4ab3\uc2bd, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7::\u446c\ucef1\u1187\u8aa5\u7330\u5245, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7)))
        
        if (cmpne:boolean(var_5_3F5:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, getstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u3d64\u8bb0\u600f\uc2bd\u12cb\u4e72))) {
            loop {
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1133)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-713032749))
                    
                    if (cmpne:boolean(var_5_3F5:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, getstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ua6bd\u759a\ub70c\u8753\u67e9\u9af2))) {
                        if (cmpne:boolean(var_5_3F5:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, getstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u071d\u59ec\u88c5\u74b1\u98a4\ud523))) {
                            if (cmpne:boolean(var_5_3F5:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, getstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\uc2bd\u7bad\uc2bd\u4c04\ub8be\u516c))) {
                                goto(Label_1133)
                            }
                            
                            stack_495_0 = getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\uc29a\ub113\ua3b4\u3e2a\u6ec6\uf9c5)
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_1052:
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(1048692165))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_620 = and:int(var_1_620:int, ldc:int(-1518846642))
                        loopcontinue()
                    }
                    
                    return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\u946b\u960f\uf995\u5d20\u7e3f\u5db4))
                }
                
                Label_1133:
                
                if (cmpeq:boolean(and:int(var_1_620:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1052)
                }
                
                if (cmpne:boolean(and:int(var_1_620:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_620 = and:int(var_1_620:int, ldc:int(-2130850614))
                    stack_495_0 = getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\u3e75\u67e9\ud4fe\u16f6\uafe7\u6c52)
                    looporswitchbreak()
                }
            }
            
            return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(stack_495_0:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f)
        }
        
        return:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(getstatic:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f(\u965f\u69d9\u600f\uc3e3\u12cb\ub83f::\ud217\u8c8a\u1833\u92ee\ua3b4\uc3e3))
    }
    
    public java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8> \u93a2\u927d\u69d9\ud36e\u3bd6\uc31c() {
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
            return:List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>(getfield:List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>(\u3e75\u446c\u7d52\u718f\ua61f\uc238::\u93a2\u839e\u4492\u8d90\u5db4\ucef1, this:\u3e75\u446c\u7d52\u718f\ua61f\uc238))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8> \u93a2\u927d\u69d9\ud36e\u3bd6\uc31c(\ub113\ufcaf\u3c25\u071d\u97b7.\u965f\u69d9\u600f\uc3e3\u12cb\ub83f p0) {
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
            return:List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>(checkcast:List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>.class, invokeinterface:List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>(Map<\u965f\u69d9\u600f\uc3e3\u12cb\ub83f, List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>>::getOrDefault, getfield:Map<\u965f\u69d9\u600f\uc3e3\u12cb\ub83f, List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>>(\u3e75\u446c\u7d52\u718f\ua61f\uc238::\u7d52\uc31c\u7330\ufe34\u12cb\ud523, this:\u3e75\u446c\u7d52\u718f\ua61f\uc238), p0:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f[expected:Object], invokestatic:List<\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>(Collections::emptyList))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Object lambda$\u7ce1\u7c6b\u5f50\uff55\u5db4\u4bc8$5(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7 p0) {
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
            return:Object(invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u7c6b\u4bc8\ubcb0\u0a06\uc9f6\ub19c), invokeinterface:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7::\uc246\u92ff\u392e\u494c\u071d\uff55, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7)))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u4c04\u0c95\ufe34\u8d90\ub83f\u67e9$4(\ub113\ufcaf\u3c25\u071d\u97b7.\u965f\u69d9\u600f\uc3e3\u12cb\ub83f p0) {
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
            return:List(invokestatic:ArrayList[expected:List](Lists::newArrayList))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u8709\ud12e\u8cae\ucef1\ufcaf\u4f4a$3(\ub113\ufcaf\u3c25\u071d\u97b7.\u965f\u69d9\u600f\uc3e3\u12cb\ub83f p0) {
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
            return:List(invokestatic:ArrayList[expected:List](Lists::newArrayList))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u0800\ube23\u8389\uc3e3\u983f\u67e9$2(java.util.Map p0, \ub113\ufcaf\u3c25\u071d\u97b7.\u965f\u69d9\u600f\uc3e3\u12cb\ub83f p1, java.util.List p2) {
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
    
    private static java.util.stream.Stream lambda$\u4179\u8df4\u516c\u7d52\uc7fe\ub7dc$1(java.util.Map p0, \ub113\ufcaf\u3c25\u071d\u97b7.\u965f\u69d9\u600f\uc3e3\u12cb\ub83f p1) {
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
            return:Stream(invokeinterface:Stream(Collection::stream, checkcast:List[expected:Collection](java.util.List.class, invokeinterface:List(Map<K, List>::getOrDefault, p0:Map<K, List>, p1:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f[expected:Object], invokestatic:ImmutableList[expected:List](ImmutableList::of)))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u97b7\u4c04\ubefe\u0b8e\u965f\uf995$0(java.util.Map p0, com.google.common.collect.ImmutableList$Builder p1, \ub113\ufcaf\u3c25\u071d\u97b7.\u965f\u69d9\u600f\uc3e3\u12cb\ub83f p2, java.util.List p3) {
        var_6_97 : List
        
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
            var_6_97 = checkcast:List(java.util.List.class, invokeinterface:List(Map<\u965f\u69d9\u600f\uc3e3\u12cb\ub83f, List>::put, p0:Map<\u965f\u69d9\u600f\uc3e3\u12cb\ub83f, List>, p2:\u965f\u69d9\u600f\uc3e3\u12cb\ub83f, invokeinterface:List(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::peek, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, p3:List<Object>[expected:Collection<Object>]), invokedynamic:Function<List, \u5f50\uc29a\u3a62\uceb8\ud171\uc2e8>(apply:()Ljava/util/function/Function;)), invokedynamic:Consumer<Object>(accept:(Lcom/google/common/collect/ImmutableList$Builder;)Ljava/util/function/Consumer;, p1:ImmutableList$Builder)), invokestatic:Collector(ImmutableList::toImmutableList))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1B3 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_118_0 : byte[] [generated]
        stack_143_0 : byte[] [generated]
        stack_1C6_0 : byte[] [generated]
        stack_201_0 : byte[] [generated]
        stack_277_0 : byte[] [generated]
        stack_2E5_0 : byte[] [generated]
        var_4_18F : int
        var_3_194 : byte[]
        var_5_195 : int
        expr_277 : byte [generated]
        var_0_2DB : int
        expr_2E5 : byte [generated]
        stack_315_2 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_1EF : byte[]
        var_5_1F0 : int
        expr_D7 : int [generated]
        expr_118 : int [generated]
        var_3_14F : String
        stack_182_0 : String[] [generated]
        expr_161 : String[] [generated]
        
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
        var_0_1B3 = and:int(ldc:int(2136377827), ldc:int(1709028053))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D5_0 = stack_D7_0 = stack_116_0 = stack_118_0 = stack_143_0 = stack_1C6_0 = stack_201_0 = stack_277_0 = stack_2E5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ZtX6dYW0LddsK9WV9dWPNV19+xu1LQPfuKERBKERew==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_18F = expr_6E:int
        var_3_194 = newarray:byte[](byte.class, expr_6E:int)
        var_5_195 = expr_6E:int
        Label_0407:
        
        while (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-502323592))
                goto(Label_0584)
            }
            
            var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-149887390))
            var_5_195 = add:int(var_5_195:int, ldc:int(-1))
            storeelement:byte(var_3_194:byte[], var_5_195:int, xor:byte(loadelement:byte(stack_1C6_0:byte[], var_5_195:int), ldc:byte(123)))
            
            if (cmpne:boolean(var_5_195:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_116_0 = stack_118_0 = stack_143_0 = stack_1C6_0 = stack_201_0 = stack_277_0 = stack_2E5_0 = var_3_194:byte[]
            goto(Label_0115)
        }
        
        var_0_1B3 = and:int(var_0_1B3:int, ldc:int(164281392))
        goto(Label_0703)
        Label_0584:
        
        while (cmpne:boolean(and:int(var_0_1B3:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(32768)), ldc:int(0))) {
                var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-446111327))
                goto(Label_0407)
            }
            
            var_0_1B3 = and:int(var_0_1B3:int, ldc:int(1964739223))
            var_5_195 = add:int(var_5_195:int, ldc:int(-1))
            expr_277 = loadelement:byte(stack_277_0:byte[], var_5_195:int)
            storeelement:byte(var_3_194:byte[], var_5_195:int, add:int(or:int(and:int(shl:int(expr_277:byte, xor:int(ldc:int(8244), ldc:int(8240))), ldc:int(-16)), and:int(shr:int(expr_277:byte[expected:int], xor:int(ldc:int(20489), ldc:int(20493))), ldc:int(15))), ldc:int(43)))
            
            if (cmpne:boolean(var_5_195:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_116_0 = stack_118_0 = stack_143_0 = stack_1C6_0 = stack_201_0 = stack_277_0 = stack_2E5_0 = var_3_194:byte[]
            goto(Label_0220)
        }
        
        var_0_1B3 = and:int(var_0_1B3:int, ldc:int(682922190))
        Label_0703:
        
        while (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(512)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1B3:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0407)
            }
            
            var_0_2DB = and:int(var_0_1B3:int, ldc:int(1868531607))
            var_5_195 = add:int(var_5_195:int, ldc:int(-1))
            expr_2E5 = loadelement:byte(stack_2E5_0:byte[], var_5_195:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_195:int, ldc:int(5)), neg:int(var_4_18F:int)), ldc:int(0))) {
                var_0_2DB = and:int(var_0_2DB:int, ldc:int(-2564118))
                stack_315_2 = add:byte(expr_2E5:byte, ldc:byte(5))
            }
            else {
                stack_315_2 = add:byte(expr_2E5:byte, loadelement:byte(var_3_194:byte[], add:int(var_5_195:int, ldc:int(5))))
            }
            
            var_0_1B3 = and:int(var_0_2DB:int, ldc:int(-283592318))
            storeelement:byte(var_3_194:byte[], var_5_195:int, stack_315_2:byte)
            
            if (cmpne:boolean(var_5_195:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_116_0 = stack_118_0 = stack_143_0 = stack_1C6_0 = stack_201_0 = stack_277_0 = stack_2E5_0 = var_3_194:byte[]
            goto(Label_0285)
        }
        
        var_0_1B3 = and:int(var_0_1B3:int, ldc:int(1929905785))
        goto(Label_0584)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_1B3 = and:int(var_0_1B3:int, ldc:int(1646598241))
            goto(Label_0285)
        }
        
        if (cmpne:boolean(and:int(var_0_1B3:int, ldc:int(4)), ldc:int(0))) {
            var_0_1B3 = and:int(var_0_1B3:int, ldc:int(1356754248))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-36636721))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_1EF = newarray:byte[](byte.class, expr_A9:int)
                var_5_1F0 = expr_A9:int
                
                loop {
                    var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-407579948))
                    var_5_1F0 = add:int(var_5_1F0:int, ldc:int(-1))
                    storeelement:byte(var_3_1EF:byte[], var_5_1F0:int, add:int(shl:int(loadelement:byte(stack_201_0:byte[], var_5_1F0:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_1F0:int, and:int(ldc:int(2577), ldc:int(1093)))), ldc:int(7)), xor:int(ldc:int(4242), ldc:int(4243)))))
                    
                    if (cmpne:boolean(var_5_1F0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_116_0 = stack_118_0 = stack_143_0 = stack_1C6_0 = stack_201_0 = stack_277_0 = stack_2E5_0 = var_3_1EF:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpne:boolean(and:int(var_0_1B3:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0285)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-1012939890))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1B3:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-138952449))
            expr_D7 = arraylength:int(stack_D7_0:byte[])
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_4_18F = expr_D7:int
                var_3_194 = newarray:byte[](byte.class, expr_D7:int)
                var_5_195 = expr_D7:int
                goto(Label_0584)
            }
        }
        
        Label_0220:
        
        if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1B3 = and:int(var_0_1B3:int, ldc:int(278896157))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1B3:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-1817325610))
                goto(Label_0174)
            }
            
            if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-635042636))
                goto(Label_0115)
            }
            
            var_0_1B3 = and:int(var_0_1B3:int, ldc:int(1841271202))
            expr_118 = arraylength:int(stack_118_0:byte[])
            
            if (cmpne:boolean(expr_118:int, ldc:int(0))) {
                var_4_18F = expr_118:int
                var_3_194 = newarray:byte[](byte.class, expr_118:int)
                var_5_195 = expr_118:int
                goto(Label_0703)
            }
        }
        
        Label_0285:
        
        if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-1625233483))
            goto(Label_0174)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_14F = initobject:String(String::<init>, stack_143_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_182_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16706), ldc:int(16707)))
            expr_161 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-30206), ldc:int(-30205)))
            storeelement:String(expr_161:String[], and:int(ldc:int(-18088), ldc:int(17063)), invokevirtual:String[expected:String](String::substring, var_3_14F:String, and:int(ldc:int(8461), ldc:int(-9102)), and:int(ldc:int(8350), ldc:int(1630))))
            putstatic:String[](\u3e75\u446c\u7d52\u718f\ua61f\uc238::\u6ec6\u4c2b\ub171\ubcb0\u8cae\u3776, expr_161:String[])
            putstatic:Logger(\u3e75\u446c\u7d52\u718f\ua61f\uc238::\u600f\u67d0\u61a4\uc229\u5f50\ubf56, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u3c25\u69d9\u5654\u9a18\u946b\ucb79(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62F : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_63A : int
        
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
        var_3_62F = and:int(ldc:int(862737430), ldc:int(-1146562001))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e75\u446c\u7d52\u718f\ua61f\uc238[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(524288)), ldc:int(0))) {
            var_3_62F = and:int(var_3_62F:int, ldc:int(2137544734))
            var_5_80 = and:int(ldc:int(18706), ldc:int(-18707))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10763), ldc:int(-10780)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_62F:int, ldc:int(-1150355618))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(18433), ldc:int(12493)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(5), ldc:int(29747)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_62F = and:int(var_3_D0:int, ldc:int(-1220904769))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(24579), ldc:int(24578)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-820962551))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(502392702))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1332469736))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-593172188))
                        goto(Label_0669)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-708282168))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1068260758))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-2023334512))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-228277644))
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-2147356013))
                        goto(Label_0669)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-18876191))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-8858313))
                            var_11_E1 = and:int(ldc:int(18626), ldc:int(-18627))
                            goto(Label_1470)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0572:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-675295686))
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(925827031))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0669:
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1963307315))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1419953002))
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1256904672))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-100405684))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-205727842))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0799:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-74496086))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1270412195))
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(950817272))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(161546166))
                            goto(Label_0669)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(2000277807))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(5223), ldc:int(8193))
                                goto(Label_1082)
                            }
                        }
                    }
                    
                    Label_0922:
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-880793589))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(589371948))
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0669)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(1804851322))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1335667290))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1082271946))
                        var_11_E1 = and:int(ldc:int(9274), ldc:int(-9788))
                    }
                    
                    Label_1082:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0922)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0669)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(2138504059))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-12986729))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1319)
                            }
                        }
                    }
                    
                    Label_1177:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1082)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-168439445))
                            goto(Label_0922)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1165509813))
                            goto(Label_0669)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(1239600417))
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1446569155))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1093904595))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1079316002))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1470)
                    }
                    
                    Label_1319:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-14094936))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(795886046))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1724400403))
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(389325867))
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(723559829))
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1131195803))
                        loopcontinue()
                    }
                    
                    var_3_62F = and:int(var_3_62F:int, ldc:int(2138930479))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1470:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63A = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1481:
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1578493736))
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1373237349))
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(684008718))
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1072190183))
                        var_17_63A = add:int(var_16_10F:int, and:int(ldc:int(549), ldc:int(2259)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62F = and:int(var_3_62F:int, ldc:int(938078591))
                
                if (cmple:boolean(var_5_80 = var_17_63A:int, sub:int(var_6_87:int, and:int(ldc:int(8329), ldc:int(20577))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
