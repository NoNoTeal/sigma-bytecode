public abstract class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ucb79\u8350\u7bad\u392e\u51fa {
    public void \ucb79\u8350\u7bad\u392e\u51fa(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u7e3f\uc84e\u873d\u7049\ubb2b\u960f p2, int p3) {
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
            invokespecial:Object(Object::<init>, this:\ucb79\u8350\u7bad\u392e\u51fa)
            putfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa, invokestatic:ArrayList[expected:List<\u51fa\u6c52\u7330\u7330\u960f>](Lists::newArrayList))
            putfield:Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, this:\ucb79\u8350\u7bad\u392e\u51fa, invokestatic:HashMap[expected:Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>](Maps::newHashMap))
            putfield:\uc31c\uff55\u6fb0\u4c04\u8753(\ucb79\u8350\u7bad\u392e\u51fa::\ud158\u12b2\u99f7\uf9c5\u5bc4\u7d52, this:\ucb79\u8350\u7bad\u392e\u51fa, initobject:\uc31c\uff55\u6fb0\u4c04\u8753(\uc31c\uff55\u6fb0\u4c04\u8753::<init>, getstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)))
            putfield:\u3d4b\uc4d2\u9937\u98a4\u6198(\ucb79\u8350\u7bad\u392e\u51fa::\u4bc8\u385b\ud217\uae5d\u8d98\u67e9, this:\ucb79\u8350\u7bad\u392e\u51fa, initobject:\u3d4b\uc4d2\u9937\u98a4\u6198(\u3d4b\uc4d2\u9937\u98a4\u6198::<init>, getstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\u416d\u3e2a\u4975\u3a62\u8df4\u7049)))
            putfield:\ub113\u1833\u392e\ubf56\u97e6(\ucb79\u8350\u7bad\u392e\u51fa::\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, this:\ucb79\u8350\u7bad\u392e\u51fa, initobject:\ub113\u1833\u392e\ubf56\u97e6(\ub113\u1833\u392e\ubf56\u97e6::<init>, getstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\ub102\u0c95\u8d98\u6435\ud158\u960f)))
            putfield:\u71f1\ub18d\u62da\u9255\u7ce1(\ucb79\u8350\u7bad\u392e\u51fa::\u0800\uae5d\ubf56\u8709\u4d85\u7873, this:\ucb79\u8350\u7bad\u392e\u51fa, initobject:\u71f1\ub18d\u62da\u9255\u7ce1(\u71f1\ub18d\u62da\u9255\u7ce1::<init>, getstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\u6cfe\u67e9\u6b0d\u3e75\u8709\u98a4)))
            putfield:Map<UUID, \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56>(\ucb79\u8350\u7bad\u392e\u51fa::\u47c2\u67e9\ub1b9\u494c\u8cae\u6b5f, this:\ucb79\u8350\u7bad\u392e\u51fa, invokestatic:HashMap[expected:Map<UUID, \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56>](Maps::newHashMap))
            putfield:Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>(\ucb79\u8350\u7bad\u392e\u51fa::\u99f7\u8d90\u74b1\u3bd6\ub113\u4975, this:\ucb79\u8350\u7bad\u392e\u51fa, invokestatic:HashMap[expected:Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>](Maps::newHashMap))
            putfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa, p0:\u88c5\ud171\ub113\u6435\ud51e)
            putfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(\ucb79\u8350\u7bad\u392e\u51fa::\u5654\u3e75\u92ff\u97e6\u8c8a\uf995, this:\ucb79\u8350\u7bad\u392e\u51fa, p1:\u7d52\u51fa\u56bd\u76bc\u4975\ub113)
            putfield:int(\ucb79\u8350\u7bad\u392e\u51fa::\u6c52\u416d\u385b\ud7e8\ufcaf\u9937, this:\ucb79\u8350\u7bad\u392e\u51fa, p3:int)
            putfield:\u7e3f\uc84e\u873d\u7049\ubb2b\u960f(\ucb79\u8350\u7bad\u392e\u51fa::\ua61f\u40a9\u3776\u946b\u8389\u98a4, this:\ucb79\u8350\u7bad\u392e\u51fa, p2:\u7e3f\uc84e\u873d\u7049\ubb2b\u960f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\u9af2\ud523\ucef1\u51b2\ud171(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p1) {
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
    
    public void \u494c\ubff1\u99f7\u7043\ufcaf\ub8be(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u9033\uc2e8\u72f1\u8d98\u6d69 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p1) {
        var_3_61 : int
        var_5_65 : HashSet
        var_6_70 : Iterator<\u3e2a\u8413\ud12e\u4f4a\ud7e8>
        var_3_12F : int
        var_6_A8 : int
        var_7_F3 : \u4c04\u34df\ua3b4\uc29a\ub70c
        var_8_128 : Iterator<\u946b\u6d99\u8df4\u12cb\u5d20<?>>
        
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
            var_3_61 = and:int(ldc:int(646610016), ldc:int(-1780598726))
            var_5_65 = invokestatic:HashSet(Sets::newHashSet)
            var_6_70 = invokeinterface:Iterator<\u3e2a\u8413\ud12e\u4f4a\ud7e8>(Collection<\u3e2a\u8413\ud12e\u4f4a\ud7e8>::iterator, invokevirtual:Collection<\u3e2a\u8413\ud12e\u4f4a\ud7e8>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u5f50\ua068\ub83f\u4cd9\u8d98\u67d0, p0:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd]))
            
            loop {
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2097152)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-483891568))
                }
                else {
                    var_3_61 = and:int(var_3_61:int, ldc:int(2097118851))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_70:Iterator<\u3e2a\u8413\ud12e\u4f4a\ud7e8>)) {
                        invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p1:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u6fb0\u4bc8\u3bd6\u516c\u40a9(\u6fb0\u4bc8\u3bd6\u516c\u40a9::<init>, checkcast:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8.class, invokeinterface:\u3e2a\u8413\ud12e\u4f4a\ud7e8(Iterator<\u3e2a\u8413\ud12e\u4f4a\ud7e8>::next, var_6_70:Iterator<\u3e2a\u8413\ud12e\u4f4a\ud7e8>)), and:int(ldc:int(-14886), ldc:int(14884))))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_12F = and:int(var_3_61:int, ldc:int(-1886672440))
            var_6_A8 = and:int(ldc:int(1738), ldc:int(-22224))
            
            while (cmplt:boolean(var_6_A8:int, ldc:int(19))) {
                var_7_F3 = invokevirtual:\u4c04\u34df\ua3b4\uc29a\ub70c(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u4179\u9937\u3bd6\u7e3f\ud217\uf9c5, p0:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_6_A8:int)
                
                if (cmpne:boolean(var_7_F3:\u4c04\u34df\ua3b4\uc29a\ub70c, aconstnull:\u4c04\u34df\ua3b4\uc29a\ub70c())) {
                    if (logicalnot:boolean(invokeinterface:boolean(Set<E>::contains, var_5_65:HashSet<\u4c04\u34df\ua3b4\uc29a\ub70c>[expected:Set<\u4c04\u34df\ua3b4\uc29a\ub70c>], var_7_F3:\u4c04\u34df\ua3b4\uc29a\ub70c[expected:Object]))) {
                        var_8_128 = invokeinterface:Iterator<\u946b\u6d99\u8df4\u12cb\u5d20<?>>(List<\u946b\u6d99\u8df4\u12cb\u5d20<?>>::iterator, invokevirtual:List<\u946b\u6d99\u8df4\u12cb\u5d20<?>>(\u9033\uc2e8\u72f1\u8d98\u6d69::\ua6bd\u156b\u718f\u7049\u1187\ud7e8, p0:\u9033\uc2e8\u72f1\u8d98\u6d69, var_7_F3:\u4c04\u34df\ua3b4\uc29a\ub70c))
                        
                        loop {
                            var_3_12F = and:int(var_3_12F:int, ldc:int(-1482735944))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_128:Iterator<\u946b\u6d99\u8df4\u12cb\u5d20<?>>))) {
                                looporswitchbreak()
                            }
                            
                            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p1:\u51fa\u6c52\u7330\u7330\u960f), checkcast:\u946b\u6d99\u8df4\u12cb\u5d20<?>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?>.class, invokeinterface:\u946b\u6d99\u8df4\u12cb\u5d20<?>(Iterator<\u946b\u6d99\u8df4\u12cb\u5d20<?>>::next, var_8_128:Iterator<\u946b\u6d99\u8df4\u12cb\u5d20<?>>)))
                        }
                        
                        var_3_12F = and:int(var_3_12F:int, ldc:int(1703554680))
                        invokeinterface:boolean(Set<\u4c04\u34df\ua3b4\uc29a\ub70c>::add, var_5_65:HashSet<\u4c04\u34df\ua3b4\uc29a\ub70c>[expected:Set<\u4c04\u34df\ua3b4\uc29a\ub70c>], var_7_F3:\u4c04\u34df\ua3b4\uc29a\ub70c)
                    }
                }
                
                var_3_12F = and:int(var_3_12F:int, ldc:int(512749184))
                inc:int(var_6_A8, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\ud171\u6ec6\u3d64\u156b\u0c95(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0) {
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
            invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u983f\ub32d\u0b8e\ud158\u74b1\ud36e, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), initobject:\u6c56\ub19c\u6cfe\u0b8e\u3711[expected:\ufe34\u7873\ua61f\uf94d\u3e2a\u9a18](\u6c56\ub19c\u6cfe\u0b8e\u3711::<init>, this:\ucb79\u8350\u7bad\u392e\u51fa))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ub171\uc238\u836c\u4f4a\u9255\uc31c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
        var_2_61 : int
        var_4_6E : \uc31c\uc87f\uc246\u3776\ub7dc
        var_5_94 : \uc31c\uc87f\uc246\u3776\ub7dc
        
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
            var_2_61 = and:int(ldc:int(1491108426), ldc:int(-218922418))
            var_4_6E = invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u51b2\u946b\ub70c\u74b1\ub19c\u4bc8, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa)))
            
            if (logicaland:boolean(invokevirtual:boolean(String::equals, invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\ua3b4\u8aa5\ub113\ubf56\u873d::\uf94d\u7c6b\u92ff\u071d\u7e3f\u69d9, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])), invokevirtual:String[expected:Object](\u88c5\ud171\ub113\u6435\ud51e::\ud158\u62da\ufe34\u8389\u72f1\u8d90, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa))), cmpne:boolean(var_4_6E:\uc31c\uc87f\uc246\u3776\ub7dc, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc()))) {
                var_5_94 = var_4_6E:\uc31c\uc87f\uc246\u3776\ub7dc
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\ub18d\uc229\u071d\u7873\u4daf\u3e2a, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], var_4_6E:\uc31c\uc87f\uc246\u3776\ub7dc)
                invokeinterface:void(Logger::debug, getstatic:Logger(\ucb79\u8350\u7bad\u392e\u51fa::\u7873\u4975\u4c2b\uc87f\ubded\u16f6), ldc:String("loading single player"))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-673538308))
                var_5_94 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u7e3f\uc84e\u873d\u7049\ubb2b\u960f::\u52d3\u3dd3\u7873\u6c52\ub171\u56bd, getfield:\u7e3f\uc84e\u873d\u7049\ubb2b\u960f(\ucb79\u8350\u7bad\u392e\u51fa::\ua61f\u40a9\u3776\u946b\u8389\u98a4, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])
            }
            
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_5_94:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    public void \u56bd\u0c95\ub83f\u6d99\u52d3\u8bb0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
        var_4_7A : \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56
        var_5_97 : \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e
        
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
            invokevirtual:void(\u7e3f\uc84e\u873d\u7049\ubb2b\u960f::\u67e9\u69d9\uf94d\u64f2\uc31c\uc4d2, getfield:\u7e3f\uc84e\u873d\u7049\ubb2b\u960f(\ucb79\u8350\u7bad\u392e\u51fa::\ua61f\u40a9\u3776\u946b\u8389\u98a4, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])
            var_4_7A = checkcast:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56(\u36d3\u9033\u6b0d\u983f\u8d90.\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56.class, invokeinterface:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56(Map<UUID, \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56>::get, getfield:Map<UUID, \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56>(\ucb79\u8350\u7bad\u392e\u51fa::\u47c2\u67e9\ub1b9\u494c\u8cae\u6b5f, this:\ucb79\u8350\u7bad\u392e\u51fa), invokevirtual:UUID[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
            
            if (cmpne:boolean(var_4_7A:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56, aconstnull:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56())) {
                invokevirtual:void(\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56::\u8709\u8d90\u3776\u40a9\u88c5\u3d4b, var_4_7A:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56)
            }
            
            var_5_97 = checkcast:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e.class, invokeinterface:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>::get, getfield:Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>(\ucb79\u8350\u7bad\u392e\u51fa::\u99f7\u8d90\u74b1\u3bd6\ub113\u4975, this:\ucb79\u8350\u7bad\u392e\u51fa), invokevirtual:UUID[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
            
            if (cmpne:boolean(var_5_97:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e, aconstnull:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e())) {
                invokevirtual:void(\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e::\u56bd\u5bc4\u183a\u4daf\u8bb0\u8413, var_5_97:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\uc2bd\u76bc\u071d\u3504\u4f4a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
        var_2_139 : int
        var_4_66 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_5_F5 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_6_132 : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_7_16B : \u7d52\u718f\u3776\u6fb0\ub83f
        var_5_AC : UUID
        stack_E6_1 : \u34df\ud523\u392e\ud4fe\u7c6b [generated]
        expr_D9 : \u51fa\u6c52\u7330\u7330\u960f[] [generated]
        
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
            var_2_139 = and:int(ldc:int(-1037759177), ldc:int(-1964132354))
            var_4_66 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u51fa\u6c52\u7330\u7330\u960f::\u120d\u3d4b\u3a62\u965f\ua6bd\ubcb0, p0:\u51fa\u6c52\u7330\u7330\u960f)
            invokevirtual:void(\ua3b4\u8aa5\ub113\ubf56\u873d::\uc3e3\u8cae\u4492\u92ee\ub70c\ub7dc, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d], getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\uae87\ud36e\u839e\u4cd9\u7873\u3711))
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u56bd\u0c95\ub83f\u6d99\u52d3\u8bb0, this:\ucb79\u8350\u7bad\u392e\u51fa, p0:\u51fa\u6c52\u7330\u7330\u960f)
            
            if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u72f1\u8753\u8bb0\ub102\ua3b4\u3c25, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                var_5_F5 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u7d52\u718f\u3776\u6fb0\ub83f::\uc87f\u6b5f\u4975\u5db4\u4c2b\ub32d, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                
                if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u88c5\u3dd3\u983f\ua61f\u6d99\u4f52, var_5_F5:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                    invokeinterface:void(Logger::debug, getstatic:Logger(\ucb79\u8350\u7bad\u392e\u51fa::\u7873\u4975\u4c2b\uc87f\ubded\u16f6), ldc:String("Removing player mount"))
                    invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u446c\ub113\u5fe1\u3a62\ube23\u8bb0, p0:\u51fa\u6c52\u7330\u7330\u960f)
                    invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc87f\ub1b9\u98a4\u71f1\u7c6b\uae87, var_4_66:\ube23\uc238\u5140\u4cd9\u8aa5, var_5_F5:\u7d52\u718f\u3776\u6fb0\ub83f)
                    putfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua6bd\u3a62\ua61f\u12b2\u3e2a\ub19c, var_5_F5:\u7d52\u718f\u3776\u6fb0\ub83f, and:int[expected:boolean](ldc:int(8449), ldc:int(2213)))
                    var_6_132 = invokeinterface:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(Collection<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, invokevirtual:Collection<\u7d52\u718f\u3776\u6fb0\ub83f>(\u7d52\u718f\u3776\u6fb0\ub83f::\u97b7\u4f52\u8df4\uc246\u3bc9\uc84e, var_5_F5:\u7d52\u718f\u3776\u6fb0\ub83f))
                    
                    loop {
                        var_2_139 = and:int(var_2_139:int, ldc:int(-2005028945))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_132:Iterator))) {
                            looporswitchbreak()
                        }
                        
                        var_7_16B = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_6_132:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                        invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc87f\ub1b9\u98a4\u71f1\u7c6b\uae87, var_4_66:\ube23\uc238\u5140\u4cd9\u8aa5, var_7_16B:\u7d52\u718f\u3776\u6fb0\ub83f)
                        putfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua6bd\u3a62\ua61f\u12b2\u3e2a\ub19c, var_7_16B:\u7d52\u718f\u3776\u6fb0\ub83f, xor:int[expected:boolean](ldc:int(22560), ldc:int(22561)))
                    }
                    
                    var_2_139 = and:int(var_2_139:int, ldc:int(1974958262))
                    invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u74b1\uf94d\u8640\u5bc4\ufcaf\u8350, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, var_4_66:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:int(\u51fa\u6c52\u7330\u7330\u960f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, p0:\u51fa\u6c52\u7330\u7330\u960f), getfield:int(\u51fa\u6c52\u7330\u7330\u960f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, p0:\u51fa\u6c52\u7330\u7330\u960f)))
                }
            }
            
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u836c\u5654\u3e2a\u7af6\uae87\ub8be, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u4c04\u8258\u5d20\u97e6\ud158\u600f, var_4_66:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f)
            invokevirtual:void(\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e::\u3dd3\u3bd6\ub1b9\u446c\u516c\ucef1, invokevirtual:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(\u51fa\u6c52\u7330\u7330\u960f::\u8640\u7c6b\ubefe\ua61f\u71ae\ub32d, p0:\u51fa\u6c52\u7330\u7330\u960f))
            invokeinterface:boolean(List<E>::remove, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:\u51fa\u6c52\u7330\u7330\u960f[expected:Object])
            invokevirtual:void(\u600f\u64ab\uc9f6\u2dcc\u62da::\u0c95\u67d0\u6435\u8350\u5140\u8d90, invokevirtual:\u600f\u64ab\uc9f6\u2dcc\u62da(\u88c5\ud171\ub113\u6435\ud51e::\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa)), p0:\u51fa\u6c52\u7330\u7330\u960f)
            var_5_AC = invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            
            if (cmpeq:boolean(checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>::get, getfield:Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, this:\ucb79\u8350\u7bad\u392e\u51fa), var_5_AC:UUID[expected:Object])), p0:\u51fa\u6c52\u7330\u7330\u960f)) {
                invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>::remove, getfield:Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, this:\ucb79\u8350\u7bad\u392e\u51fa), var_5_AC:UUID[expected:Object])
                invokeinterface:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56(Map<UUID, \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56>::remove, getfield:Map<UUID, \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56>(\ucb79\u8350\u7bad\u392e\u51fa::\u47c2\u67e9\ub1b9\u494c\u8cae\u6b5f, this:\ucb79\u8350\u7bad\u392e\u51fa), var_5_AC:UUID[expected:Object])
                invokeinterface:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>::remove, getfield:Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>(\ucb79\u8350\u7bad\u392e\u51fa::\u99f7\u8d90\u74b1\u3bd6\ub113\u4975, this:\ucb79\u8350\u7bad\u392e\u51fa), var_5_AC:UUID[expected:Object])
            }
            
            stack_E6_1 = getstatic:\u34df\ud523\u392e\ud4fe\u7c6b(\u34df\ud523\u392e\ud4fe\u7c6b::\ud523\ub70c\uceb8\u5f50\u2dcc\ub8be)
            expr_D9 = newarray:\u51fa\u6c52\u7330\u7330\u960f[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, and:int(ldc:int(2061), ldc:int(611)))
            storeelement:\u51fa\u6c52\u7330\u7330\u960f(expr_D9:\u51fa\u6c52\u7330\u7330\u960f[], and:int(ldc:int(-2988), ldc:int(2731)), p0:\u51fa\u6c52\u7330\u7330\u960f)
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\uafe7\u8389\u76bc\u4975\ucb79\u3c25, this:\ucb79\u8350\u7bad\u392e\u51fa, initobject:\u71f1\u4c2b\u5bc4\u759a\uc4d2(\u71f1\u4c2b\u5bc4\u759a\uc4d2::<init>, stack_E6_1:\u34df\ud523\u392e\ud4fe\u7c6b, expr_D9:\u51fa\u6c52\u7330\u7330\u960f[]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u61a4\ud7e8\u8d98\u8d98\ud4fe\u527a(java.net.SocketAddress p0, com.mojang.authlib.GameProfile p1) {
        var_3_61 : int
        var_5_1E6 : \ud51e\u494c\uc910\u3e75\u34df
        stack_207_1 : String [generated]
        expr_1F6 : Object[] [generated]
        var_6_20A : TranslationTextComponent
        stack_24B_0 : TranslationTextComponent [generated]
        stack_248_1 : String [generated]
        expr_231 : Object[] [generated]
        stack_271_0 : ITextComponent [generated]
        var_5_15A : \ucef1\u4c2b\uc229\u7ce1\ud158
        stack_17B_1 : String [generated]
        expr_16A : Object[] [generated]
        var_6_17E : TranslationTextComponent
        stack_1BF_0 : TranslationTextComponent [generated]
        stack_1BC_1 : String [generated]
        expr_1A5 : Object[] [generated]
        
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
        var_3_61 = and:int(ldc:int(48856376), ldc:int(-1954906168))
        
        if (logicalnot:boolean(invokevirtual:boolean(\uc31c\uff55\u6fb0\u4c04\u8753::\u8308\u4e72\uc3e3\u873d\ud171\uceb8, getfield:\uc31c\uff55\u6fb0\u4c04\u8753(\ucb79\u8350\u7bad\u392e\u51fa::\ud158\u12b2\u99f7\uf9c5\u5bc4\u7d52, this:\ucb79\u8350\u7bad\u392e\u51fa), p1:GameProfile))) {
            loop {
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-67425566))
                    goto(Label_0288)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-85894627))
                    goto(Label_0224)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1414138579))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\u5f50\ub18d\u3c25\u9255\ua068\ua6bd, this:\ucb79\u8350\u7bad\u392e\u51fa, p1:GameProfile))) {
                        return:ITextComponent(initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, ldc:String("multiplayer.disconnect.not_whitelisted")))
                    }
                }
                
                Label_0165:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(512)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1023335899))
                    goto(Label_0288)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(95156684))
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(1399324056))
                    
                    if (invokevirtual:boolean(\u3d4b\uc4d2\u9937\u98a4\u6198::\ub8be\uc246\u47c2\u3776\u6c52\ud51e, getfield:\u3d4b\uc4d2\u9937\u98a4\u6198(\ucb79\u8350\u7bad\u392e\u51fa::\u4bc8\u385b\ud217\uae5d\u8d98\u67e9, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:SocketAddress)) {
                        var_5_1E6 = invokevirtual:\ud51e\u494c\uc910\u3e75\u34df(\u3d4b\uc4d2\u9937\u98a4\u6198::\u12cb\uc910\ud171\uc246\u7330\u8aa5, getfield:\u3d4b\uc4d2\u9937\u98a4\u6198(\ucb79\u8350\u7bad\u392e\u51fa::\u4bc8\u385b\ud217\uae5d\u8d98\u67e9, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:SocketAddress)
                        stack_207_1 = ldc:String("multiplayer.disconnect.banned_ip.reason")
                        expr_1F6 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(10276), ldc:int(10277)))
                        storeelement:Object(expr_1F6:Object[], and:int(ldc:int(7253), ldc:int(-7254)), invokevirtual:String[expected:Object](\u51b2\u156b\ub19c\u8640\ud4fe<T>::\u7bad\uc229\uc31c\u5f50\u120d\u62da, var_5_1E6:\ud51e\u494c\uc910\u3e75\u34df[expected:\u51b2\u156b\ub19c\u8640\ud4fe<String>]))
                        var_6_20A = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_207_1:String, expr_1F6:Object[])
                        
                        if (cmpne:boolean(invokevirtual:Date(\u51b2\u156b\ub19c\u8640\ud4fe<T>::\u8640\uc29a\u93a2\u071d\u59ec\u0b8e, var_5_1E6:\ud51e\u494c\uc910\u3e75\u34df[expected:\u51b2\u156b\ub19c\u8640\ud4fe<String>]), aconstnull:Date())) {
                            stack_24B_0 = var_6_20A:TranslationTextComponent
                            stack_248_1 = ldc:String("multiplayer.disconnect.banned_ip.expiration")
                            expr_231 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2363), ldc:int(24645)))
                            storeelement:Object(expr_231:Object[], and:int(ldc:int(-962), ldc:int(961)), invokevirtual:String[expected:Object](DateFormat::format, getstatic:SimpleDateFormat[expected:DateFormat](\ucb79\u8350\u7bad\u392e\u51fa::\u8640\u51b2\u6cfe\ub32d\uc246\u7e3f), invokevirtual:Date(\u51b2\u156b\ub19c\u8640\ud4fe<T>::\u8640\uc29a\u93a2\u071d\u59ec\u0b8e, var_5_1E6:\ud51e\u494c\uc910\u3e75\u34df[expected:\u51b2\u156b\ub19c\u8640\ud4fe<String>])))
                            invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, stack_24B_0:TranslationTextComponent[expected:IFormattableTextComponent], initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_248_1:String, expr_231:Object[]))
                        }
                        
                        return:ITextComponent(var_6_20A:TranslationTextComponent[expected:ITextComponent])
                    }
                }
                
                Label_0224:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-9180013))
                        goto(Label_0165)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-1944968927))
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(-88212167))
                    
                    if (cmpge:boolean(invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)), getfield:int(\ucb79\u8350\u7bad\u392e\u51fa::\u6c52\u416d\u385b\ud7e8\ufcaf\u9937, this:\ucb79\u8350\u7bad\u392e\u51fa))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\u6bb9\u92ff\u927d\u759a\u2dcc\u4c2b, this:\ucb79\u8350\u7bad\u392e\u51fa, p1:GameProfile))) {
                            stack_271_0 = initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, ldc:String("multiplayer.disconnect.server_full"))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0288:
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1297650284))
                    goto(Label_0224)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                    stack_271_0 = aconstnull:ITextComponent()
                    looporswitchbreak()
                }
            }
            
            return:ITextComponent(stack_271_0:ITextComponent)
        }
        
        var_5_15A = checkcast:\ucef1\u4c2b\uc229\u7ce1\ud158(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u4c2b\uc229\u7ce1\ud158.class, invokevirtual:\ucef1\u4c2b\uc229\u7ce1\ud158(\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \ucef1\u4c2b\uc229\u7ce1\ud158>::\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe, getfield:\uc31c\uff55\u6fb0\u4c04\u8753[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \ucef1\u4c2b\uc229\u7ce1\ud158>](\ucb79\u8350\u7bad\u392e\u51fa::\ud158\u12b2\u99f7\uf9c5\u5bc4\u7d52, this:\ucb79\u8350\u7bad\u392e\u51fa), p1:GameProfile))
        stack_17B_1 = ldc:String("multiplayer.disconnect.banned.reason")
        expr_16A = newarray:Object[](java.lang.Object.class, and:int(ldc:int(49), ldc:int(333)))
        storeelement:Object(expr_16A:Object[], and:int(ldc:int(20682), ldc:int(-29388)), invokevirtual:String[expected:Object](\u51b2\u156b\ub19c\u8640\ud4fe<T>::\u7bad\uc229\uc31c\u5f50\u120d\u62da, var_5_15A:\ucef1\u4c2b\uc229\u7ce1\ud158[expected:\u51b2\u156b\ub19c\u8640\ud4fe<GameProfile>]))
        var_6_17E = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_17B_1:String, expr_16A:Object[])
        
        if (cmpne:boolean(invokevirtual:Date(\u51b2\u156b\ub19c\u8640\ud4fe<T>::\u8640\uc29a\u93a2\u071d\u59ec\u0b8e, var_5_15A:\ucef1\u4c2b\uc229\u7ce1\ud158[expected:\u51b2\u156b\ub19c\u8640\ud4fe<GameProfile>]), aconstnull:Date())) {
            stack_1BF_0 = var_6_17E:TranslationTextComponent
            stack_1BC_1 = ldc:String("multiplayer.disconnect.banned.expiration")
            expr_1A5 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1041), ldc:int(4105)))
            storeelement:Object(expr_1A5:Object[], and:int(ldc:int(7424), ldc:int(-7425)), invokevirtual:String[expected:Object](DateFormat::format, getstatic:SimpleDateFormat[expected:DateFormat](\ucb79\u8350\u7bad\u392e\u51fa::\u8640\u51b2\u6cfe\ub32d\uc246\u7e3f), invokevirtual:Date(\u51b2\u156b\ub19c\u8640\ud4fe<T>::\u8640\uc29a\u93a2\u071d\u59ec\u0b8e, var_5_15A:\ucef1\u4c2b\uc229\u7ce1\ud158[expected:\u51b2\u156b\ub19c\u8640\ud4fe<GameProfile>])))
            invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, stack_1BF_0:TranslationTextComponent[expected:IFormattableTextComponent], initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_1BC_1:String, expr_1A5:Object[]))
        }
        
        return:ITextComponent(var_6_17E:TranslationTextComponent[expected:ITextComponent])
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f \u8c8a\ufcaf\u16f6\u965f\uc2bd\u6b0d(com.mojang.authlib.GameProfile p0) {
        var_2_61 : int
        var_4_66 : UUID
        var_5_6B : ArrayList
        var_6_74 : int
        var_7_E4 : \u51fa\u6c52\u7330\u7330\u960f
        var_6_B9 : \u51fa\u6c52\u7330\u7330\u960f
        var_7_CD : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_7_14F : \ube23\uc238\u5140\u4cd9\u8aa5
        var_8_16A : \u8bb0\u36d3\u40a9\u836c\u7ce1
        
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
            var_2_61 = and:int(ldc:int(2000997782), ldc:int(-278475369))
            var_4_66 = invokestatic:UUID(\ua3b4\u8aa5\ub113\ubf56\u873d::\ub7dc\ub83f\u0c95\ub83f\u8bb0\u516c, p0:GameProfile)
            var_5_6B = invokestatic:ArrayList(Lists::newArrayList)
            var_6_74 = and:int(ldc:int(-20683), ldc:int(20682))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(901730693))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-943661097))
                    
                    if (cmplt:boolean(var_6_74:int, invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))) {
                        var_7_E4 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), var_6_74:int))
                        
                        if (invokevirtual:boolean(UUID::equals, invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, var_7_E4:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), var_4_66:UUID[expected:Object])) {
                            invokeinterface:boolean(List<\u51fa\u6c52\u7330\u7330\u960f>::add, var_5_6B:ArrayList<\u51fa\u6c52\u7330\u7330\u960f>[expected:List<\u51fa\u6c52\u7330\u7330\u960f>], var_7_E4:\u51fa\u6c52\u7330\u7330\u960f)
                        }
                        
                        var_2_61 = and:int(var_2_61:int, ldc:int(-26239050))
                        inc:int(var_6_74, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_6_B9 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>::get, getfield:Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, this:\ucb79\u8350\u7bad\u392e\u51fa), invokevirtual:UUID[expected:Object](GameProfile::getId, p0:GameProfile)))
            
            if (cmpne:boolean(var_6_B9:\u51fa\u6c52\u7330\u7330\u960f, aconstnull:\u51fa\u6c52\u7330\u7330\u960f())) {
                if (logicalnot:boolean(invokeinterface:boolean(List<E>::contains, var_5_6B:ArrayList<Object>[expected:List<Object>], var_6_B9:\u51fa\u6c52\u7330\u7330\u960f[expected:Object]))) {
                    invokeinterface:boolean(List<\u51fa\u6c52\u7330\u7330\u960f>::add, var_5_6B:ArrayList<\u51fa\u6c52\u7330\u7330\u960f>[expected:List<\u51fa\u6c52\u7330\u7330\u960f>], var_6_B9:\u51fa\u6c52\u7330\u7330\u960f)
                }
            }
            
            var_7_CD = invokeinterface:Iterator<Object>(List<Object>::iterator, var_5_6B:ArrayList<Object>[expected:List<Object>])
            
            while (invokeinterface:boolean(Iterator::hasNext, var_7_CD:Iterator)) {
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\uc246\u97b7\u6ec6\uc87f\uc238\u3e75, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_7_CD:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, ldc:String("multiplayer.disconnect.duplicate_login")))
            }
            
            var_7_14F = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u88c5\ud171\ub113\u6435\ud51e::\u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u836c\u56bd\u4ab3\u9af2\u718f\u59ec, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa)))) {
                var_8_16A = initobject:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u8bb0\u36d3\u40a9\u836c\u7ce1::<init>, var_7_14F:\ube23\uc238\u5140\u4cd9\u8aa5)
            }
            else {
                var_8_16A = initobject:\u4c04\u5db4\ubcb0\u97e6\u92ff[expected:\u8bb0\u36d3\u40a9\u836c\u7ce1](\u4c04\u5db4\ubcb0\u97e6\u92ff::<init>, var_7_14F:\ube23\uc238\u5140\u4cd9\u8aa5)
            }
            
            return:\u51fa\u6c52\u7330\u7330\u960f(initobject:\u51fa\u6c52\u7330\u7330\u960f(\u51fa\u6c52\u7330\u7330\u960f::<init>, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa), var_7_14F:\ube23\uc238\u5140\u4cd9\u8aa5, p0:GameProfile, var_8_16A:\u8bb0\u36d3\u40a9\u836c\u7ce1))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f \u69d9\u9af2\ud12e\ubcb0\ubff1\u6d69(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0, boolean p1) {
        var_3_E5 : int
        var_5_79 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_6_7F : float
        var_7_85 : boolean
        var_8_92 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_9_A2 : Object
        stack_10B_0 : \ube23\uc238\u5140\u4cd9\u8aa5 [generated]
        var_10_10B : \ube23\uc238\u5140\u4cd9\u8aa5
        var_11_126 : \u8bb0\u36d3\u40a9\u836c\u7ce1
        var_12_14D : \u51fa\u6c52\u7330\u7330\u960f
        var_13_17A : Iterator<String>
        var_13_196 : int
        var_14_2E8 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_15_2F2 : boolean
        var_16_2FC : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_18_331 : float
        var_17_316 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_14_1B7 : \u4492\u92ee\u9255\uc29a\u3e75\u7043
        
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
            var_3_E5 = and:int(ldc:int(1628146716), ldc:int(1803500028))
            invokeinterface:boolean(List<E>::remove, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:\u51fa\u6c52\u7330\u7330\u960f[expected:Object])
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u4c04\u8258\u5d20\u97e6\ud158\u600f, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u51fa\u6c52\u7330\u7330\u960f::\u120d\u3d4b\u3a62\u965f\ua6bd\ubcb0, p0:\u51fa\u6c52\u7330\u7330\u960f), p0:\u51fa\u6c52\u7330\u7330\u960f)
            var_5_79 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u51fa\u6c52\u7330\u7330\u960f::\u4e72\u156b\ua3b4\u8d98\u2dcc\u120d, p0:\u51fa\u6c52\u7330\u7330\u960f)
            var_6_7F = invokevirtual:float(\u51fa\u6c52\u7330\u7330\u960f::\u9255\uae87\u6cfe\u5140\u8308\u5d20, p0:\u51fa\u6c52\u7330\u7330\u960f)
            var_7_85 = invokevirtual:boolean(\u51fa\u6c52\u7330\u7330\u960f::\ub70c\uf995\u4492\u3776\u2dcc\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f)
            var_8_92 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u88c5\ud171\ub113\u6435\ud51e::\u760c\uc9f6\uff55\u3dd3\ubff1\u8cae, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa), invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\u51fa\u6c52\u7330\u7330\u960f::\ud171\u7049\uc229\u8cae\u6c56\u64f2, p0:\u51fa\u6c52\u7330\u7330\u960f))
            
            if (logicaland:boolean(cmpne:boolean(var_8_92:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5()), cmpne:boolean(var_5_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()))) {
                var_9_A2 = invokestatic:Optional<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8>[expected:Object](\ua3b4\u8aa5\ub113\ubf56\u873d::\ua068\ud523\u5654\u36d3\u6c56\u64f2, var_8_92:\ube23\uc238\u5140\u4cd9\u8aa5, var_5_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_6_7F:float, var_7_85:boolean, p1:boolean)
            }
            else {
                var_3_E5 = and:int(var_3_E5:int, ldc:int(1763531452))
                var_9_A2 = invokestatic:Optional<Object>[expected:Object](Optional<Object>::empty)
            }
            
            loop {
                if (cmpne:boolean(and:int(var_3_E5:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_E5 = and:int(var_3_E5:int, ldc:int(-135418313))
                    
                    if (cmpne:boolean(var_8_92:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5())) {
                        if (invokevirtual:boolean(Optional<T>::isPresent, var_9_A2:Object)) {
                            stack_10B_0 = var_8_92:\ube23\uc238\u5140\u4cd9\u8aa5
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_E5:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_E5 = and:int(var_3_E5:int, ldc:int(2034228085))
                    stack_10B_0 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u88c5\ud171\ub113\u6435\ud51e::\u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa))
                    looporswitchbreak()
                }
            }
            
            var_10_10B = stack_10B_0:\ube23\uc238\u5140\u4cd9\u8aa5
            
            if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u836c\u56bd\u4ab3\u9af2\u718f\u59ec, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa)))) {
                var_11_126 = initobject:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u8bb0\u36d3\u40a9\u836c\u7ce1::<init>, var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5)
            }
            else {
                var_11_126 = initobject:\u4c04\u5db4\ubcb0\u97e6\u92ff[expected:\u8bb0\u36d3\u40a9\u836c\u7ce1](\u4c04\u5db4\ubcb0\u97e6\u92ff::<init>, var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5)
            }
            
            var_12_14D = initobject:\u51fa\u6c52\u7330\u7330\u960f(\u51fa\u6c52\u7330\u7330\u960f::<init>, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa), var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5, invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d]), var_11_126:\u8bb0\u36d3\u40a9\u836c\u7ce1)
            putfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f))
            invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u4ab3\ud7e8\u7873\ucef1\uc31c\uc29a, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f, p0:\u51fa\u6c52\u7330\u7330\u960f, p1:boolean)
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u624e\u8308\u34df\u8413\u4e72\u8df4, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            invokevirtual:void(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud7e8\u3e75\u9af2\u56bd\u8258\u6b5f, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d], invokevirtual:\u93a2\u7bad\u946b\u4ab3\ub171\u0b8e(\ua3b4\u8aa5\ub113\ubf56\u873d::\u718f\ud217\ub70c\uc2e8\u3d4b\u6198, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d]))
            var_13_17A = invokeinterface:Iterator<String>(Set<String>::iterator, invokevirtual:Set<String>(\u7d52\u718f\u3776\u6fb0\ub83f::\u0a06\uc4d2\uff55\ua068\u6435\ucef1, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_13_17A:Iterator<String>)) {
                invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u99f7\u9033\u8d90\u4daf\ud217\u527a, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_13_17A:Iterator<String>)))
            }
            
            invokespecial:void(\ucb79\u8350\u7bad\u392e\u51fa::\ub6ab\u4daf\u3bc9\ud217\uf94d\ud523, this:\ucb79\u8350\u7bad\u392e\u51fa, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f, p0:\u51fa\u6c52\u7330\u7330\u960f, var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5)
            var_13_196 = and:int(ldc:int(10489), ldc:int(-10490))
            
            if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_9_A2:Optional[expected:Object]))) {
                if (cmpne:boolean(var_5_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                    invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f), initobject:\ud12e\u6fb0\u8c8a\ubf56\ube23[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ud12e\u6fb0\u8c8a\ubf56\ube23::<init>, getstatic:\u5d20\u446c\u4e72\ua562\u600f(\ud12e\u6fb0\u8c8a\ubf56\ube23::\u4bc8\u8d98\ubff1\u385b\u927d\uceb8), ldc:float(0.0f)))
                }
            }
            else {
                var_14_2E8 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_5_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                var_15_2F2 = invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_14_2E8:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u873d\u3bd6\u76bc\u385b\uc84e\uc87f))
                var_16_2FC = checkcast:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8.class, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(Optional<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8>::get, var_9_A2:Optional<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8>))
                
                if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_14_2E8:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\u8c8a\u72f1\u52d3\u93a2\u72f1\u071d)), var_15_2F2:boolean))) {
                    var_18_331 = var_6_7F:float
                }
                else {
                    var_17_316 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u5db4\ubb2b\ube23\uc2e8\u873d\ub32d, invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u494c\u47c2\u9255\u69d9\u8c8a\u624e, var_5_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), var_16_2FC:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
                    var_18_331 = d2f:float(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9255\uae87\u7330\u8308\u88c5\u965f, sub:double(mul:double(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u16f6\u9255\ud36e\u718f\u7330\u836c, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_17_316:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_17_316:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)), ldc:double(57.2957763671875)), ldc:double(90.0))))
                }
                
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u392e\u4179\ud51e\u12b2\ub83f\u960f, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_16_2FC:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_16_2FC:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_16_2FC:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), var_18_331:float, ldc:float(0.0f))
                invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u64ab\u72f1\u8d98\u4cd9\u16f6\u51b2, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), var_5_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_6_7F:float, var_7_85:boolean, and:int[expected:boolean](ldc:int(27151), ldc:int(-27152)))
                var_13_196 = ternaryop:int(logicaland:boolean(logicalnot:boolean(p1:boolean), var_15_2F2:boolean), and:int(ldc:int(4129), ldc:int(2077)), and:int(ldc:int(-11770), ldc:int(11705)))
            }
            
            while (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\u516c\u5bc4\u494c\ub1b9\u5245::\u9a18\u6c56\uafe7\u7330\u92ee\uc246, var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u516c\u5bc4\u494c\ub1b9\u5245], var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), cmplt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:double(256.0)))) {
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\u6d99\u1187\ucb79\u7d52\u7e3f, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:double(1.0)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            }
            
            var_14_1B7 = invokevirtual:\u4492\u92ee\u9255\uc29a\u3e75\u7043(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3d4b\ud523\uff55\u647c\u4ab3\u7af6, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u51fa\u6c52\u7330\u7330\u960f::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f))
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f), initobject:\uf995\ud51e\u516c\u6c56\ua61f(\uf995\ud51e\u516c\u6c56\ua61f::<init>, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u51fa\u6c52\u7330\u7330\u960f::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)), invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u51fa\u6c52\u7330\u7330\u960f::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)), invokestatic:long(\u8c8a\u51b2\u516c\ub70c\u624e::\u56bd\u6d99\u494c\uf995\u4c04\uc84e, invokevirtual:long(\ube23\uc238\u5140\u4cd9\u8aa5::\ud12e\ubded\u6b5f\u4cd9\u64ab\ud36e, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u51fa\u6c52\u7330\u7330\u960f::\u120d\u3d4b\u3a62\u965f\ua6bd\ubcb0, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f))), invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u8bb0\u36d3\u40a9\u836c\u7ce1::\u12b2\ud523\u4ab3\u97e6\ub18d\u9255, getfield:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u51fa\u6c52\u7330\u7330\u960f::\ub8be\u3a62\u718f\u7330\u3711\ud36e, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)), invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u8bb0\u36d3\u40a9\u836c\u7ce1::\u6c52\u071d\u446c\u760c\u836c\ud523, getfield:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u51fa\u6c52\u7330\u7330\u960f::\ub8be\u3a62\u718f\u7330\u3711\ud36e, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)), invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u5bc4\u6b5f\ua6bd\u52d3\u36d3\u392e, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u51fa\u6c52\u7330\u7330\u960f::\u120d\u3d4b\u3a62\u965f\ua6bd\ubcb0, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)), invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u9033\u92ff\ud171\u416d\u7330\u61a4, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u51fa\u6c52\u7330\u7330\u960f::\u120d\u3d4b\u3a62\u965f\ua6bd\ubcb0, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)), p1:boolean))
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u6b0d\u8389\u3c25\uff55\u839e\u7006, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), getfield:float(\u51fa\u6c52\u7330\u7330\u960f::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f), getfield:float(\u51fa\u6c52\u7330\u7330\u960f::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f))
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f), initobject:\ud12e\u4975\u64ab\ubded\u8df4[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ud12e\u4975\u64ab\ubded\u8df4::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ube23\uc238\u5140\u4cd9\u8aa5::\u873d\u6435\u5245\ud12e\uae87\u64f2, var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:float(\ube23\uc238\u5140\u4cd9\u8aa5::\u600f\uc7fe\u9033\u3e2a\uf995\ucfaf, var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5)))
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u9af2\uff55\ubcb0\u624e\uf94d(\u9af2\uff55\ubcb0\u624e\uf94d::<init>, invokeinterface:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u3bc9\u6435\u47c2\uf9c5\u3a62\u6198, var_14_1B7:\u4492\u92ee\u9255\uc29a\u3e75\u7043), invokeinterface:boolean(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uc87f\u71ae\u5245\uff55\u9255\u5140, var_14_1B7:\u4492\u92ee\u9255\uc29a\u3e75\u7043)))
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u88c5\u6fb0\u5654\ub19c\ua3b4(\u88c5\u6fb0\u5654\ub19c\ua3b4::<init>, getfield:float(\u51fa\u6c52\u7330\u7330\u960f::\u8d90\u8c8a\uc87f\ua3b4\u8bb0\u72f1, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f), getfield:int(\u51fa\u6c52\u7330\u7330\u960f::\u9a18\u494c\u5f50\u64ab\u156b\u836c, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f), getfield:int(\u51fa\u6c52\u7330\u7330\u960f::\u9a18\u6bb9\u0a06\u4e72\u9255\u624e, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)))
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u56bd\ucfaf\uc31c\u5fe1\u4179\u9255, this:\ucb79\u8350\u7bad\u392e\u51fa, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f, var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5)
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u6fb0\u76bc\u5fe1\u7af6\u8d98\uc87f, this:\ucb79\u8350\u7bad\u392e\u51fa, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u0b8e\uc87f\u4179\u983f\u7d52\u7bad, var_10_10B:\ube23\uc238\u5140\u4cd9\u8aa5, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)
            invokeinterface:boolean(List<\u51fa\u6c52\u7330\u7330\u960f>::add, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)
            invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>::put, getfield:Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, this:\ucb79\u8350\u7bad\u392e\u51fa), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)
            invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u4bc8\uae5d\ub32d\ufe34\u7af6\uc2e8, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)
            invokevirtual:void(\ube23\u67d0\u64f2\u839e\u76bc::\u5140\u9033\u8389\u6198\u527a\u3a62, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\ube23\u67d0\u64f2\u839e\u76bc], invokevirtual:float(\ube23\u67d0\u64f2\u839e\u76bc::\u120d\u51fa\u6d69\ubded\u97e6\u0a06, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f[expected:\ube23\u67d0\u64f2\u839e\u76bc]))
            
            if (cmpne:boolean(var_13_196:int, ldc:int(0))) {
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_12_14D:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u759a\u3504\u6b0d\u5245\ucb79[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u759a\u3504\u6b0d\u5245\ucb79::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u3bc9\u8258\uc29a\uc9f6\u759a\u8350), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_5_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_5_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_5_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:float(1.0f), ldc:float(1.0f)))
            }
            
            return:\u51fa\u6c52\u7330\u7330\u960f(var_12_14D:\u51fa\u6c52\u7330\u7330\u960f)
        }
        
        goto(Label_0006)
    }
    
    public void \u6fb0\u76bc\u5fe1\u7af6\u8d98\uc87f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            invokespecial:void(\ucb79\u8350\u7bad\u392e\u51fa::\u76bc\u5f50\u9937\u8df4\uc2e8\u4e72, this:\ucb79\u8350\u7bad\u392e\u51fa, p0:\u51fa\u6c52\u7330\u7330\u960f, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\ub19c\uc84e\u5d20\u4f52\u4bc8\ua068, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa), invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u69d9\ub32d\u5245\ub171\u8389\ub83f() {
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
            
            if (cmpgt:boolean(putfield:int(\ucb79\u8350\u7bad\u392e\u51fa::\u97e6\u4975\u836c\u7ce1\u36d3\ucb79, this:\ucb79\u8350\u7bad\u392e\u51fa, add:int(getfield:int(\ucb79\u8350\u7bad\u392e\u51fa::\u97e6\u4975\u836c\u7ce1\u36d3\ucb79, this:\ucb79\u8350\u7bad\u392e\u51fa), xor:int(ldc:int(8304), ldc:int(8305)))), xor:int(ldc:int(-32608), ldc:int(-32008)))) {
                invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\uafe7\u8389\u76bc\u4975\ucb79\u3c25, this:\ucb79\u8350\u7bad\u392e\u51fa, initobject:\u71f1\u4c2b\u5bc4\u759a\uc4d2[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u71f1\u4c2b\u5bc4\u759a\uc4d2::<init>, getstatic:\u34df\ud523\u392e\ud4fe\u7c6b(\u34df\ud523\u392e\ud4fe\u7c6b::\uc238\u624e\u64ab\u8709\u965f\u7006), getfield:List<\u51fa\u6c52\u7330\u7330\u960f>[expected:Iterable<\u51fa\u6c52\u7330\u7330\u960f>](\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))
                putfield:int(\ucb79\u8350\u7bad\u392e\u51fa::\u97e6\u4975\u836c\u7ce1\u36d3\ucb79, this:\ucb79\u8350\u7bad\u392e\u51fa, and:int(ldc:int(-25698), ldc:int(24673)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uafe7\u8389\u76bc\u4975\ucb79\u3c25(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0) {
        var_2_61 : int
        var_4_69 : int
        
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
            var_2_61 = and:int(ldc:int(-1012055529), ldc:int(-1912796459))
            var_4_69 = and:int(ldc:int(-445), ldc:int(316))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1850965369))
                
                if (cmpge:boolean(var_4_69:int, invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), var_4_69:int))), p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
                inc:int(var_4_69, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u494c\u6c52\uae87\u8c8a\ud171\uf9c5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> p1) {
        var_3_78 : int
        var_5_69 : int
        var_6_B1 : \u51fa\u6c52\u7330\u7330\u960f
        
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
            var_3_78 = and:int(ldc:int(-1562059764), ldc:int(-1644300147))
            var_5_69 = and:int(ldc:int(-22009), ldc:int(1528))
            
            loop {
                if (cmpne:boolean(and:int(var_3_78:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_78 = and:int(var_3_78:int, ldc:int(-391708706))
                    
                    if (cmplt:boolean(var_5_69:int, invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))) {
                        var_6_B1 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), var_5_69:int))
                        
                        if (cmpeq:boolean(invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u51fa\u6c52\u7330\u7330\u960f::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_6_B1:\u51fa\u6c52\u7330\u7330\u960f)), p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>)) {
                            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_6_B1:\u51fa\u6c52\u7330\u7330\u960f), p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
                        }
                        
                        var_3_78 = and:int(var_3_78:int, ldc:int(-324739788))
                        inc:int(var_5_69, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_78:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_78 = and:int(var_3_78:int, ldc:int(1022962631))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5d20\ud171\uae5d\u3d64\uf94d\u7049(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, net.minecraft.util.text.ITextComponent p1) {
        var_3_B9 : int
        var_5_66 : \ub6ab\u4d85\u97e6\ud51e\u983f
        var_6_82 : Iterator<String>
        var_8_AD : \u51fa\u6c52\u7330\u7330\u960f
        
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
            var_3_B9 = and:int(ldc:int(640160155), ldc:int(1785213487))
            var_5_66 = invokevirtual:\ub6ab\u4d85\u97e6\ud51e\u983f(\u7d52\u718f\u3776\u6fb0\ub83f::\u647c\ufcaf\ube23\u8bb0\u4c04\u8c8a, p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            
            if (cmpne:boolean(var_5_66:\ub6ab\u4d85\u97e6\ud51e\u983f, aconstnull:\ub6ab\u4d85\u97e6\ud51e\u983f())) {
                var_6_82 = invokeinterface:Iterator<String>(Collection<String>::iterator, invokevirtual:Collection<String>(\ub6ab\u4d85\u97e6\ud51e\u983f::\u839e\uc229\u6bb9\uc229\u16f6\u6ec6, var_5_66:\ub6ab\u4d85\u97e6\ud51e\u983f))
                
                loop {
                    var_3_B9 = and:int(var_3_B9:int, ldc:int(1788820702))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_82:Iterator<String>))) {
                        looporswitchbreak()
                    }
                    
                    var_8_AD = invokevirtual:\u51fa\u6c52\u7330\u7330\u960f(\ucb79\u8350\u7bad\u392e\u51fa::\u8aa5\u67d0\u56bd\u6435\u3776\u4f52, this:\ucb79\u8350\u7bad\u392e\u51fa, checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_6_82:Iterator<String>)))
                    
                    if (cmpne:boolean(var_8_AD:\u51fa\u6c52\u7330\u7330\u960f, aconstnull:\u51fa\u6c52\u7330\u7330\u960f())) {
                        if (cmpne:boolean(var_8_AD:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d], p0:\ua3b4\u8aa5\ub113\ubf56\u873d)) {
                            invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u5db4\u0c95\u960f\u3776\ud217\u647c, var_8_AD:\u51fa\u6c52\u7330\u7330\u960f, p1:ITextComponent, invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                        }
                    }
                    
                    var_3_B9 = and:int(var_3_B9:int, ldc:int(1878667674))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3776\u3776\u5bc4\u61a4\u12cb\u97b7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, net.minecraft.util.text.ITextComponent p1) {
        var_3_7A : int
        var_5_66 : \ub6ab\u4d85\u97e6\ud51e\u983f
        var_6_82 : int
        var_7_D6 : \u51fa\u6c52\u7330\u7330\u960f
        
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
        var_3_7A = and:int(ldc:int(960224657), ldc:int(-100880385))
        var_5_66 = invokevirtual:\ub6ab\u4d85\u97e6\ud51e\u983f(\u7d52\u718f\u3776\u6fb0\ub83f::\u647c\ufcaf\ube23\u8bb0\u4c04\u8c8a, p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
        
        if (cmpeq:boolean(var_5_66:\ub6ab\u4d85\u97e6\ud51e\u983f, aconstnull:\ub6ab\u4d85\u97e6\ud51e\u983f())) {
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u3bc9\u7006\ud12e\u7c6b\u6fb0\ubf56, this:\ucb79\u8350\u7bad\u392e\u51fa, p1:ITextComponent, getstatic:ChatType(ChatType::SYSTEM), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            goto(Label_0172)
        }
        
        Label_0109:
        
        if (cmpne:boolean(and:int(var_3_7A:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_7A = and:int(var_3_7A:int, ldc:int(-1109529355))
            var_6_82 = and:int(ldc:int(13254), ldc:int(-13256))
            
            while (cmplt:boolean(var_6_82:int, invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))) {
                var_7_D6 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), var_6_82:int))
                
                if (cmpne:boolean(invokevirtual:\ub6ab\u4d85\u97e6\ud51e\u983f(\u7d52\u718f\u3776\u6fb0\ub83f::\u647c\ufcaf\ube23\u8bb0\u4c04\u8c8a, var_7_D6:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), var_5_66:\ub6ab\u4d85\u97e6\ud51e\u983f)) {
                    invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u5db4\u0c95\u960f\u3776\ud217\u647c, var_7_D6:\u51fa\u6c52\u7330\u7330\u960f, p1:ITextComponent, invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                }
                
                var_3_7A = and:int(var_3_7A:int, ldc:int(985579199))
                inc:int(var_6_82, ldc:int(1))
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_3_7A:int, ldc:int(32768)), ldc:int(0))) {
            var_3_7A = and:int(var_3_7A:int, ldc:int(-871214783))
            goto(Label_0109)
        }
    }
    
    public java.lang.String[] \ub83f\u946b\u0b8e\ud171\u51fa\u7873() {
        var_1_61 : int
        var_3_6E : String[]
        var_4_76 : int
        
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
            var_1_61 = and:int(ldc:int(-1485132956), ldc:int(-2021860510))
            var_3_6E = newarray:String[](java.lang.String.class, invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))
            var_4_76 = and:int(ldc:int(2156), ldc:int(-18541))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-805799747))
                
                if (cmpge:boolean(var_4_76:int, invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))) {
                    looporswitchbreak()
                }
                
                storeelement:String(var_3_6E:String[], var_4_76:int, invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), var_4_76:int)))))
                inc:int(var_4_76, ldc:int(1))
            }
            
            return:String[](var_3_6E:String[])
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uc31c\uff55\u6fb0\u4c04\u8753 \uc87f\uc31c\u3c25\ud51e\u5bc4\u40a9() {
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
            return:\uc31c\uff55\u6fb0\u4c04\u8753(getfield:\uc31c\uff55\u6fb0\u4c04\u8753(\ucb79\u8350\u7bad\u392e\u51fa::\ud158\u12b2\u99f7\uf9c5\u5bc4\u7d52, this:\ucb79\u8350\u7bad\u392e\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public \u516c\u3d64\u718f\ub171\u6b5f.\u3d4b\uc4d2\u9937\u98a4\u6198 \u6c52\u8308\u4c2b\u120d\u0a06\u4179() {
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
            return:\u3d4b\uc4d2\u9937\u98a4\u6198(getfield:\u3d4b\uc4d2\u9937\u98a4\u6198(\ucb79\u8350\u7bad\u392e\u51fa::\u4bc8\u385b\ud217\uae5d\u8d98\u67e9, this:\ucb79\u8350\u7bad\u392e\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public void \uc4d2\u92ee\u8350\ub32d\ud12e\ud12e(com.mojang.authlib.GameProfile p0) {
        var_4_88 : \u51fa\u6c52\u7330\u7330\u960f
        
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
            invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, \u98a4\ua562\u624e\ud4fe\ubb2b>::\ud36e\u7330\u67d0\u8389\ub171\u647c, getfield:\ub113\u1833\u392e\ubf56\u97e6[expected:\u9937\u7049\ubefe\u3bc9\u446c<K, \u98a4\ua562\u624e\ud4fe\ubb2b>](\ucb79\u8350\u7bad\u392e\u51fa::\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, this:\ucb79\u8350\u7bad\u392e\u51fa), initobject:\u98a4\ua562\u624e\ud4fe\ubb2b(\u98a4\ua562\u624e\ud4fe\ubb2b::<init>, p0:GameProfile, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u92ff\ua6bd\u120d\uc31c\u6fb0\u156b, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa)), invokevirtual:boolean(\ub113\u1833\u392e\ubf56\u97e6::\u8709\u759a\uc910\u88c5\u3e2a\uc31c, getfield:\ub113\u1833\u392e\ubf56\u97e6(\ucb79\u8350\u7bad\u392e\u51fa::\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:GameProfile)))
            var_4_88 = invokevirtual:\u51fa\u6c52\u7330\u7330\u960f(\ucb79\u8350\u7bad\u392e\u51fa::\u4492\u416d\uf9c5\u6bb9\u34df\u527a, this:\ucb79\u8350\u7bad\u392e\u51fa, invokevirtual:UUID(GameProfile::getId, p0:GameProfile))
            
            if (cmpne:boolean(var_4_88:\u51fa\u6c52\u7330\u7330\u960f, aconstnull:\u51fa\u6c52\u7330\u7330\u960f())) {
                invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u6fb0\u76bc\u5fe1\u7af6\u8d98\uc87f, this:\ucb79\u8350\u7bad\u392e\u51fa, var_4_88:\u51fa\u6c52\u7330\u7330\u960f)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\ub113\u385b\uc2bd\ud12e\u5fe1(com.mojang.authlib.GameProfile p0) {
        var_4_72 : \u51fa\u6c52\u7330\u7330\u960f
        
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
            invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, V>::\u12b2\u1833\ub83f\u4492\u494c\ua068, getfield:\ub113\u1833\u392e\ubf56\u97e6[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, V>](\ucb79\u8350\u7bad\u392e\u51fa::\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:GameProfile)
            var_4_72 = invokevirtual:\u51fa\u6c52\u7330\u7330\u960f(\ucb79\u8350\u7bad\u392e\u51fa::\u4492\u416d\uf9c5\u6bb9\u34df\u527a, this:\ucb79\u8350\u7bad\u392e\u51fa, invokevirtual:UUID(GameProfile::getId, p0:GameProfile))
            
            if (cmpne:boolean(var_4_72:\u51fa\u6c52\u7330\u7330\u960f, aconstnull:\u51fa\u6c52\u7330\u7330\u960f())) {
                invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u6fb0\u76bc\u5fe1\u7af6\u8d98\uc87f, this:\ucb79\u8350\u7bad\u392e\u51fa, var_4_72:\u51fa\u6c52\u7330\u7330\u960f)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u76bc\u5f50\u9937\u8df4\uc2e8\u4e72(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0, int p1) {
        var_3_ED : int
        var_5_F3 : byte
        
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
            var_3_ED = and:int(ldc:int(-589022591), ldc:int(-1224851485))
            
            if (cmpne:boolean(getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), aconstnull:\u0a06\ub83f\u34df\u7873\u5bc4())) {
                if (cmpgt:boolean(p1:int, ldc:int(0))) {
                    goto(Label_0156)
                }
                
                var_5_F3 = ldc:byte(24)
                goto(Label_0267)
            }
            
            Label_0105:
            
            if (cmpne:boolean(and:int(var_3_ED:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0207)
            }
            
            if (cmpeq:boolean(and:int(var_3_ED:int, ldc:int(32768)), ldc:int(0))) {
                invokevirtual:void(\u40a9\ud51e\ua562\ucef1\u873d::\u7ce1\ua068\u5bc4\uae5d\u3c25\u4179, invokevirtual:\u40a9\ud51e\ua562\ucef1\u873d(\u88c5\ud171\ub113\u6435\ud51e::\u8aa5\uc7fe\u8d98\u47c2\ua562\u6d69, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa)), p0:\u51fa\u6c52\u7330\u7330\u960f)
                return:void()
            }
            
            var_3_ED = and:int(var_3_ED:int, ldc:int(-457307382))
            Label_0156:
            
            if (cmpeq:boolean(and:int(var_3_ED:int, ldc:int(1)), ldc:int(0))) {
                var_3_ED = and:int(var_3_ED:int, ldc:int(1510780208))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_ED:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_ED = and:int(var_3_ED:int, ldc:int(1858635439))
                    goto(Label_0105)
                }
                
                var_3_ED = and:int(var_3_ED:int, ldc:int(-286938187))
                
                if (cmpge:boolean(p1:int, and:int(ldc:int(4644), ldc:int(26893)))) {
                    var_5_F3 = ldc:byte(28)
                    goto(Label_0267)
                }
            }
            
            Label_0207:
            
            if (cmpne:boolean(and:int(var_3_ED:int, ldc:int(32)), ldc:int(0))) {
                var_3_ED = and:int(var_3_ED:int, ldc:int(67024089))
                goto(Label_0156)
            }
            
            if (cmpne:boolean(and:int(var_3_ED:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_3_ED = and:int(var_3_ED:int, ldc:int(-1746474043))
            var_5_F3 = i2b:byte(add:int(ldc:int(24), p1:int))
            Label_0267:
            var_3_ED = and:int(var_3_ED:int, ldc:int(-50942369))
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u8640\u3bd6\uafe7\u3d64\u52d3(\u8640\u3bd6\uafe7\u3d64\u52d3::<init>, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], var_5_F3:byte))
            goto(Label_0105)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5f50\ub18d\u3c25\u9255\ua068\ua6bd(com.mojang.authlib.GameProfile p0) {
        stack_B5_0 : int [generated]
        
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
            
            if (getfield:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, this:\ucb79\u8350\u7bad\u392e\u51fa)) {
                if (logicalnot:boolean(invokevirtual:boolean(\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, V>::\u4e72\u960f\u7bad\uc31c\u983f\u3776, getfield:\ub113\u1833\u392e\ubf56\u97e6[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, V>](\ucb79\u8350\u7bad\u392e\u51fa::\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:GameProfile))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, V>::\u4e72\u960f\u7bad\uc31c\u983f\u3776, getfield:\u71f1\ub18d\u62da\u9255\u7ce1[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, V>](\ucb79\u8350\u7bad\u392e\u51fa::\u0800\uae5d\ubf56\u8709\u4d85\u7873, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:GameProfile))) {
                        stack_B5_0 = and:int[expected:boolean](ldc:int(-19487), ldc:int(18460))
                        return:boolean(stack_B5_0:boolean)
                    }
                }
            }
            
            stack_B5_0 = and:int[expected:boolean](ldc:int(10305), ldc:int(4661))
            return:boolean(stack_B5_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub7dc\u624e\u183a\uc9f6\u8350\uae87(com.mojang.authlib.GameProfile p0) {
        var_2_61 : int
        stack_EA_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-144770347), ldc:int(-673204322))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, V>::\u4e72\u960f\u7bad\uc31c\u983f\u3776, getfield:\ub113\u1833\u392e\ubf56\u97e6[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, V>](\ucb79\u8350\u7bad\u392e\u51fa::\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:GameProfile))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u839e\uc229\u6c56\ud4fe\u9033\u69d9, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:GameProfile))) {
                    goto(Label_0157)
                }
                
                if (logicalnot:boolean(invokeinterface:boolean(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u8709\u0b8e\u6d99\u3c25\u9033\uae5d, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa))))) {
                    goto(Label_0157)
                }
            }
            
            Label_0109:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                stack_EA_0 = xor:int[expected:boolean](ldc:int(8337), ldc:int(8336))
                return:boolean(stack_EA_0:boolean)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(1131502364))
            Label_0157:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0109)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(1937611700))
            
            if (getfield:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\ub32d\u8bb0\u5bc4\u67d0\u8350\u3bd6, this:\ucb79\u8350\u7bad\u392e\u51fa)) {
                goto(Label_0109)
            }
            
            stack_EA_0 = and:int[expected:boolean](ldc:int(28685), ldc:int(-29710))
            return:boolean(stack_EA_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f \u8aa5\u67d0\u56bd\u6435\u3776\u4f52(java.lang.String p0) {
        var_2_61 : int
        var_4_6B : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_5_AC : \u51fa\u6c52\u7330\u7330\u960f
        
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
        var_2_61 = and:int(ldc:int(-769496204), ldc:int(137150006))
        var_4_6B = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa))
        
        loop {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1498884517))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(903659192))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_6B:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)) {
                    var_5_AC = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_4_6B:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, var_5_AC:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])), p0:String))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-626954637))
                        loopcontinue()
                    }
                    
                    return:\u51fa\u6c52\u7330\u7330\u960f(var_5_AC:\u51fa\u6c52\u7330\u7330\u960f)
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                return:\u51fa\u6c52\u7330\u7330\u960f(aconstnull:\u51fa\u6c52\u7330\u7330\u960f())
            }
        }
    }
    
    public void \u9255\u1833\u927d\ud523\u5245\ud171(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, double p1, double p2, double p3, double p4, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> p5, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p6) {
        var_12_63 : int
        var_14_6C : int
        var_12_7D : int
        var_15_C7 : \u51fa\u6c52\u7330\u7330\u960f
        var_16_FC : double
        var_18_106 : double
        var_20_110 : double
        
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
            var_12_63 = and:int(ldc:int(1567339532), ldc:int(-856285943))
            var_14_6C = and:int(ldc:int(-8696), ldc:int(8695))
            
            loop {
                if (cmpeq:boolean(and:int(var_12_63:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_12_7D = and:int(var_12_63:int, ldc:int(260624344))
                }
                else {
                    var_12_7D = and:int(var_12_63:int, ldc:int(-60328225))
                    
                    if (cmplt:boolean(var_14_6C:int, invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))) {
                        var_15_C7 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), var_14_6C:int))
                        
                        if (cmpne:boolean(var_15_C7:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d], p0:\ua3b4\u8aa5\ub113\ubf56\u873d)) {
                            if (cmpeq:boolean(invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u51fa\u6c52\u7330\u7330\u960f::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_15_C7:\u51fa\u6c52\u7330\u7330\u960f)), p5:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>)) {
                                var_16_FC = sub:double(p1:double, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_15_C7:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                                var_18_106 = sub:double(p2:double, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_15_C7:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                                var_20_110 = sub:double(p3:double, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_15_C7:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                                
                                if (cmplt:boolean(add:double(add:double(mul:double(var_16_FC:double, var_16_FC:double), mul:double(var_18_106:double, var_18_106:double)), mul:double(var_20_110:double, var_20_110:double)), mul:double(p4:double, p4:double))) {
                                    invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_15_C7:\u51fa\u6c52\u7330\u7330\u960f), p6:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
                                }
                            }
                        }
                        
                        var_12_63 = and:int(var_12_7D:int, ldc:int(-823165334))
                        inc:int(var_14_6C, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_12_7D:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_12_63 = and:int(var_12_7D:int, ldc:int(-870530935))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua3b4\u836c\u983f\u51b2\u8aa5\u7ce1() {
        var_1_61 : int
        var_3_69 : int
        
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
            var_1_61 = and:int(ldc:int(-1519626304), ldc:int(-2047139871))
            var_3_69 = and:int(ldc:int(887), ldc:int(-888))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-2098282498))
                
                if (cmpge:boolean(var_3_69:int, invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u56bd\u0c95\ub83f\u6d99\u52d3\u8bb0, this:\ucb79\u8350\u7bad\u392e\u51fa, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), var_3_69:int)))
                inc:int(var_3_69, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u71f1\ub18d\u62da\u9255\u7ce1 \u527a\ud171\u120d\u64ab\ubf56\u6c52() {
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
            return:\u71f1\ub18d\u62da\u9255\u7ce1(getfield:\u71f1\ub18d\u62da\u9255\u7ce1(\ucb79\u8350\u7bad\u392e\u51fa::\u0800\uae5d\ubf56\u8709\u4d85\u7873, this:\ucb79\u8350\u7bad\u392e\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String[] \u64ab\ubff1\u7c6b\ud171\ucef1\u98a4() {
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
            return:String[](invokevirtual:String[](\u71f1\ub18d\u62da\u9255\u7ce1::\u120d\u6d99\u99f7\u946b\ub113\u2dcc, getfield:\u71f1\ub18d\u62da\u9255\u7ce1(\ucb79\u8350\u7bad\u392e\u51fa::\u0800\uae5d\ubf56\u8709\u4d85\u7873, this:\ucb79\u8350\u7bad\u392e\u51fa)))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\ub113\u1833\u392e\ubf56\u97e6 \u416d\u72f1\u8d98\ud4fe\u88c5\u4daf() {
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
            return:\ub113\u1833\u392e\ubf56\u97e6(getfield:\ub113\u1833\u392e\ubf56\u97e6(\ucb79\u8350\u7bad\u392e\u51fa::\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, this:\ucb79\u8350\u7bad\u392e\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String[] \u5654\u6c52\u836c\u0a06\u946b\ub8be() {
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
            return:String[](invokevirtual:String[](\ub113\u1833\u392e\ubf56\u97e6::\u120d\u6d99\u99f7\u946b\ub113\u2dcc, getfield:\ub113\u1833\u392e\ubf56\u97e6(\ucb79\u8350\u7bad\u392e\u51fa::\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, this:\ucb79\u8350\u7bad\u392e\u51fa)))
        }
        
        goto(Label_0006)
    }
    
    public void \u392e\ua3b4\u946b\u416d\u4f4a\ud217() {
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
    
    public void \u56bd\ucfaf\uc31c\u5fe1\u4179\u9255(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1) {
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
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u16f6\u120d\u71f1\ub102\u9937[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u16f6\u120d\u71f1\ub102\u9937::<init>, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u88c5\ud171\ub113\u6435\ud51e::\u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa))), getstatic:\u8709\ubff1\u5140\ub8be\ub102(\u8709\ubff1\u5140\ub8be\ub102::\ud4fe\ub113\ubf56\u40a9\u16f6\ud523)))
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u4e72\u8753\u8258\u5bc4\u6b0d[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u4e72\u8753\u8258\u5bc4\u6b0d::<init>, invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u960f\u6d99\ub70c\u8753\u4ab3\u6c56, p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), invokevirtual:boolean(\u7e3f\ubff1\u718f\ub171\u72f1::\ub113\u718f\u8389\u071d\uc87f\u16f6, invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\u5245\u965f\ubcb0\u4f52\ud217\uc3e3))))
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\ud12e\u4975\u64ab\ubded\u8df4[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ud12e\u4975\u64ab\ubded\u8df4::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ube23\uc238\u5140\u4cd9\u8aa5::\u873d\u6435\u5245\ud12e\uae87\u64f2, p1:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:float(\ube23\uc238\u5140\u4cd9\u8aa5::\u600f\uc7fe\u9033\u3e2a\uf995\ucfaf, p1:\ube23\uc238\u5140\u4cd9\u8aa5)))
            
            if (invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u74b1\u7af6\ua61f\u6c52\u7873\ub7dc, p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])) {
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\ud12e\u6fb0\u8c8a\ubf56\ube23[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ud12e\u6fb0\u8c8a\ubf56\ube23::<init>, getstatic:\u5d20\u446c\u4e72\ua562\u600f(\ud12e\u6fb0\u8c8a\ubf56\ube23::\u3711\u8aa5\u7d52\ub83f\ua3b4\u4bc8), ldc:float(0.0f)))
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\ud12e\u6fb0\u8c8a\ubf56\ube23[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ud12e\u6fb0\u8c8a\ubf56\ube23::<init>, getstatic:\u5d20\u446c\u4e72\ua562\u600f(\ud12e\u6fb0\u8c8a\ubf56\ube23::\uafe7\u9937\ubf56\u071d\u4179\u3d4b), invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub32d\u8413\u600f\ucfaf\u61a4\ua3b4, p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], ldc:float(1.0f))))
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\ud12e\u6fb0\u8c8a\ubf56\ube23[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ud12e\u6fb0\u8c8a\ubf56\ube23::<init>, getstatic:\u5d20\u446c\u4e72\ua562\u600f(\ud12e\u6fb0\u8c8a\ubf56\ube23::\u5bc4\uc84e\u8350\u7873\u9af2\u72f1), invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u76bc\ua3b4\ubf56\ub83f\u6ec6\u759a, p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], ldc:float(1.0f))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7043\u4ab3\u5654\ua3b4\u1833\uc84e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u7043\uc2bd\u183a\u4c04\u6bb9\ufcaf, p0:\u51fa\u6c52\u7330\u7330\u960f, getfield:\ubb2b\u6b0d\u6c56\uc29a\u4e72[expected:\ub1b9\u62da\u9af2\u92ee\u64f2](\u51fa\u6c52\u7330\u7330\u960f::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, p0:\u51fa\u6c52\u7330\u7330\u960f))
            invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u5fe1\uc9f6\u7330\u3776\uceb8\uc2bd, p0:\u51fa\u6c52\u7330\u7330\u960f)
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u59ec\u4ab3\u3a62\u4cd9\u8d90[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u59ec\u4ab3\u3a62\u4cd9\u8d90::<init>, getfield:int(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u0800\u946b\u4c04\u494c\u4c04\u527a, getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\u51fa\u6c52\u7330\u7330\u960f::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, p0:\u51fa\u6c52\u7330\u7330\u960f))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u40a9\u8cae\uc31c\u59ec\u7043\u8350() {
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
            return:int(invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))
        }
        
        goto(Label_0006)
    }
    
    public int \ubcb0\u960f\uc29a\u4e72\ud51e\uc2bd() {
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
            return:int(getfield:int(\ucb79\u8350\u7bad\u392e\u51fa::\u6c52\u416d\u385b\ud7e8\ufcaf\u9937, this:\ucb79\u8350\u7bad\u392e\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud158\ubb2b\ucb79\u0c95\u624e\u927d() {
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
            return:boolean(getfield:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, this:\ucb79\u8350\u7bad\u392e\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public void \u76bc\u4daf\u624e\u51b2\ud4fe\u56bd(boolean p0) {
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
            putfield:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, this:\ucb79\u8350\u7bad\u392e\u51fa, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> \uc2e8\u8709\u8d98\uc2e8\u76bc\ud51e(java.lang.String p0) {
        var_2_61 : int
        var_4_65 : ArrayList
        var_5_70 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_2_7F : int
        var_6_BB : \u51fa\u6c52\u7330\u7330\u960f
        
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
            var_2_61 = and:int(ldc:int(1666050151), ldc:int(996120909))
            var_4_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_5_70 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa))
            
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_7F = and:int(var_2_61:int, ldc:int(-803938154))
                }
                else {
                    var_2_7F = and:int(var_2_61:int, ldc:int(1932336893))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_70:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)) {
                        var_6_BB = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_5_70:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                        
                        if (invokevirtual:boolean(String::equals, invokevirtual:String(\u51fa\u6c52\u7330\u7330\u960f::\u8258\u4c04\u3711\u5db4\u0800\uc3e3, var_6_BB:\u51fa\u6c52\u7330\u7330\u960f), p0:String[expected:Object])) {
                            invokeinterface:boolean(List<\u51fa\u6c52\u7330\u7330\u960f>::add, var_4_65:ArrayList<\u51fa\u6c52\u7330\u7330\u960f>[expected:List<\u51fa\u6c52\u7330\u7330\u960f>], var_6_BB:\u51fa\u6c52\u7330\u7330\u960f)
                        }
                        
                        var_2_61 = and:int(var_2_7F:int, ldc:int(-42996217))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_7F:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_7F:int, ldc:int(-938372680))
            }
            
            return:List<\u51fa\u6c52\u7330\u7330\u960f>(var_4_65:ArrayList<\u51fa\u6c52\u7330\u7330\u960f>)
        }
        
        goto(Label_0006)
    }
    
    public int \u71ae\u47c2\u4492\u98a4\uc84e\ua562() {
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
            return:int(getfield:int(\ucb79\u8350\u7bad\u392e\u51fa::\uae87\ua3b4\u88c5\u8413\u7d52\u647c, this:\ucb79\u8350\u7bad\u392e\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e \u9033\ubded\ucb79\u0a06\u4f4a\u12cb() {
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
            return:\u88c5\ud171\ub113\u6435\ud51e(getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u67d0\uc87f\uc31c\ub83f\u983f\ub1b9() {
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
            return:\uc31c\uc87f\uc246\u3776\ub7dc(aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())
        }
        
        goto(Label_0006)
    }
    
    public void \ua562\u3dd3\ud523\u9033\u47c2\u927d(\u3504\ufe34\u600f\u6b0d\u69d9.\uf94d\u51b2\u1833\u34df\u1187 p0) {
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
            putfield:\uf94d\u51b2\u1833\u34df\u1187(\ucb79\u8350\u7bad\u392e\u51fa::\uc31c\u8df4\ufe34\u4179\ua562\u3d4b, this:\ucb79\u8350\u7bad\u392e\u51fa, p0:\uf94d\u51b2\u1833\u34df\u1187)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub6ab\u4daf\u3bc9\ud217\uf94d\ud523(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p2) {
        var_4_63 : int
        
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
            var_4_63 = and:int(ldc:int(-383420084), ldc:int(-514985122))
            
            if (cmpeq:boolean(p1:\u51fa\u6c52\u7330\u7330\u960f, aconstnull:\u51fa\u6c52\u7330\u7330\u960f())) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-401610934))
                
                if (cmpne:boolean(getfield:\uf94d\u51b2\u1833\u34df\u1187(\ucb79\u8350\u7bad\u392e\u51fa::\uc31c\u8df4\ufe34\u4179\ua562\u3d4b, this:\ucb79\u8350\u7bad\u392e\u51fa), aconstnull:\uf94d\u51b2\u1833\u34df\u1187())) {
                    invokevirtual:void(\u8bb0\u36d3\u40a9\u836c\u7ce1::\u8bb0\u4975\ud12e\ube23\u69d9\u6d69, getfield:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u51fa\u6c52\u7330\u7330\u960f::\ub8be\u3a62\u718f\u7330\u3711\ud36e, p0:\u51fa\u6c52\u7330\u7330\u960f), getfield:\uf94d\u51b2\u1833\u34df\u1187(\ucb79\u8350\u7bad\u392e\u51fa::\uc31c\u8df4\ufe34\u4179\ua562\u3d4b, this:\ucb79\u8350\u7bad\u392e\u51fa), getstatic:\uf94d\u51b2\u1833\u34df\u1187(\uf94d\u51b2\u1833\u34df\u1187::\ubff1\u6ec6\u6b5f\u88c5\u3a62\ufcaf))
                }
            }
            else {
                invokevirtual:void(\u8bb0\u36d3\u40a9\u836c\u7ce1::\u8bb0\u4975\ud12e\ube23\u69d9\u6d69, getfield:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u51fa\u6c52\u7330\u7330\u960f::\ub8be\u3a62\u718f\u7330\u3711\ud36e, p0:\u51fa\u6c52\u7330\u7330\u960f), invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u8bb0\u36d3\u40a9\u836c\u7ce1::\u12b2\ud523\u4ab3\u97e6\ub18d\u9255, getfield:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u51fa\u6c52\u7330\u7330\u960f::\ub8be\u3a62\u718f\u7330\u3711\ud36e, p1:\u51fa\u6c52\u7330\u7330\u960f)), invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u8bb0\u36d3\u40a9\u836c\u7ce1::\u6c52\u071d\u446c\u760c\u836c\ud523, getfield:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u51fa\u6c52\u7330\u7330\u960f::\ub8be\u3a62\u718f\u7330\u3711\ud36e, p1:\u51fa\u6c52\u7330\u7330\u960f)))
            }
            
            invokevirtual:void(\u8bb0\u36d3\u40a9\u836c\u7ce1::\u8d98\ua3b4\u7bad\uff55\ua068\u6198, getfield:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u51fa\u6c52\u7330\u7330\u960f::\ub8be\u3a62\u718f\u7330\u3711\ud36e, p0:\u51fa\u6c52\u7330\u7330\u960f), invokeinterface:\uf94d\u51b2\u1833\u34df\u1187(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u1833\ub102\u72f1\u4ab3\u647c\uff55, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90, p2:\ube23\uc238\u5140\u4cd9\u8aa5))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3dd3\u5654\u392e\u67e9\uc2e8\u93a2(boolean p0) {
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
            putfield:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\ub32d\u8bb0\u5bc4\u67d0\u8350\u3bd6, this:\ucb79\u8350\u7bad\u392e\u51fa, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8d98\u156b\ubcb0\u6cfe\u93a2\u71f1() {
        var_1_61 : int
        var_3_69 : int
        
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
            var_1_61 = and:int(ldc:int(569719953), ldc:int(601075375))
            var_3_69 = and:int(ldc:int(3209), ldc:int(-11422))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(692054831))
                
                if (cmpge:boolean(var_3_69:int, invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\uc246\u97b7\u6ec6\uc87f\uc238\u3e75, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa), var_3_69:int))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, ldc:String("multiplayer.disconnect.server_shutdown")))
                inc:int(var_3_69, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u7006\ud12e\u7c6b\u6fb0\ubf56(net.minecraft.util.text.ITextComponent p0, net.minecraft.util.text.ChatType p1, java.util.UUID p2) {
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
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u5db4\u0c95\u960f\u3776\ud217\u647c, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:ITextComponent, p2:UUID)
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\uafe7\u8389\u76bc\u4975\ucb79\u3c25, this:\ucb79\u8350\u7bad\u392e\u51fa, initobject:\ubff1\ub70c\uae5d\u52d3\u8308[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ubff1\ub70c\uae5d\u52d3\u8308::<init>, p0:ITextComponent, p1:ChatType, p2:UUID))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u36d3\u9033\u6b0d\u983f\u8d90.\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56 \u8aa5\u9af2\u4f4a\u760c\uc31c\u718f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0) {
        var_4_66 : UUID
        var_5_89 : \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56
        var_6_A6 : File
        var_7_C6 : File
        var_8_119 : File
        
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
            var_4_66 = invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            var_5_89 = ternaryop:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56(cmpne:boolean(var_4_66:UUID, aconstnull:UUID()), checkcast:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56(\u36d3\u9033\u6b0d\u983f\u8d90.\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56.class, invokeinterface:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56(Map<UUID, \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56>::get, getfield:Map<UUID, \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56>(\ucb79\u8350\u7bad\u392e\u51fa::\u47c2\u67e9\ub1b9\u494c\u8cae\u6b5f, this:\ucb79\u8350\u7bad\u392e\u51fa), var_4_66:UUID[expected:Object])), aconstnull:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56())
            
            if (cmpeq:boolean(var_5_89:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56, aconstnull:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56())) {
                var_6_A6 = invokeinterface:File(Path::toFile, invokevirtual:Path(\u88c5\ud171\ub113\u6435\ud51e::\ucb79\u8df4\u3711\u9af2\u5bc4\u6c52, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa), getstatic:\u51b2\ub6ab\u5654\u647c\ub102\u8d90(\u51b2\ub6ab\u5654\u647c\ub102\u8d90::\u120d\u8413\u7330\ubefe\u92ee\uc910)))
                var_7_C6 = initobject:File(File::<init>, var_6_A6:File, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_4_66:UUID[expected:Object]), ldc:String(".json"))))
                
                if (logicalnot:boolean(invokevirtual:boolean(File::exists, var_7_C6:File))) {
                    var_8_119 = initobject:File(File::<init>, var_6_A6:File, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\ua3b4\u8aa5\ub113\ubf56\u873d::\uf94d\u7c6b\u92ff\u071d\u7e3f\u69d9, p0:\ua3b4\u8aa5\ub113\ubf56\u873d))), ldc:String(".json"))))
                    
                    if (invokevirtual:boolean(File::exists, var_8_119:File)) {
                        if (invokevirtual:boolean(File::isFile, var_8_119:File)) {
                            invokevirtual:boolean(File::renameTo, var_8_119:File, var_7_C6:File)
                        }
                    }
                }
                
                var_5_89 = initobject:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56(\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56::<init>, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa), var_7_C6:File)
                invokeinterface:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56(Map<UUID, \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56>::put, getfield:Map<UUID, \u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56>(\ucb79\u8350\u7bad\u392e\u51fa::\u47c2\u67e9\ub1b9\u494c\u8cae\u6b5f, this:\ucb79\u8350\u7bad\u392e\u51fa), var_4_66:UUID, var_5_89:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56)
            }
            
            return:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56(var_5_89:\u7ce1\u71f1\u36d3\u3bc9\u1833\ubf56)
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e \u6198\u0c95\u0a06\uc2bd\u51b2\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
        var_4_66 : UUID
        var_5_76 : \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e
        
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
            var_4_66 = invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            var_5_76 = checkcast:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e.class, invokeinterface:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>::get, getfield:Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>(\ucb79\u8350\u7bad\u392e\u51fa::\u99f7\u8d90\u74b1\u3bd6\ub113\u4975, this:\ucb79\u8350\u7bad\u392e\u51fa), var_4_66:UUID[expected:Object]))
            
            if (cmpeq:boolean(var_5_76:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e, aconstnull:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e())) {
                var_5_76 = initobject:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e::<init>, invokevirtual:DataFixer(\u88c5\ud171\ub113\u6435\ud51e::\u6ec6\u4cd9\ub32d\u7006\u183a\ucfaf, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa)), this:\ucb79\u8350\u7bad\u392e\u51fa, invokevirtual:\u183a\u2dcc\u36d3\u8753\ua61f\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\uae87\ubff1\uc238\ud12e\u6d69\u67e9, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa)), initobject:File(File::<init>, invokeinterface:File(Path::toFile, invokevirtual:Path(\u88c5\ud171\ub113\u6435\ud51e::\ucb79\u8df4\u3711\u9af2\u5bc4\u6c52, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa), getstatic:\u51b2\ub6ab\u5654\u647c\ub102\u8d90(\u51b2\ub6ab\u5654\u647c\ub102\u8d90::\u8308\u8cae\u9af2\u71ae\u8c8a\u97b7))), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_4_66:UUID[expected:Object]), ldc:String(".json")))), p0:\u51fa\u6c52\u7330\u7330\u960f)
                invokeinterface:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>::put, getfield:Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>(\ucb79\u8350\u7bad\u392e\u51fa::\u99f7\u8d90\u74b1\u3bd6\ub113\u4975, this:\ucb79\u8350\u7bad\u392e\u51fa), var_4_66:UUID, var_5_76:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e)
            }
            
            invokevirtual:void(\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e::\ua3b4\u9a18\u3711\ua61f\uafe7\u8640, var_5_76:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e, p0:\u51fa\u6c52\u7330\u7330\u960f)
            return:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(var_5_76:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e)
        }
        
        goto(Label_0006)
    }
    
    public void \uc229\u67d0\u927d\uc4d2\u4975\u6b5f(int p0) {
        var_2_61 : int
        var_4_7F : Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>
        var_2_8E : int
        var_5_C8 : \ube23\uc238\u5140\u4cd9\u8aa5
        
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
            var_2_61 = and:int(ldc:int(725385499), ldc:int(-1349516194))
            putfield:int(\ucb79\u8350\u7bad\u392e\u51fa::\uae87\ua3b4\u88c5\u8413\u7d52\u647c, this:\ucb79\u8350\u7bad\u392e\u51fa, p0:int)
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\uafe7\u8389\u76bc\u4975\ucb79\u3c25, this:\ucb79\u8350\u7bad\u392e\u51fa, initobject:\ud36e\u99f7\u6c56\u3e75\u2dcc[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ud36e\u99f7\u6c56\u3e75\u2dcc::<init>, p0:int))
            var_4_7F = invokeinterface:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>(Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>::iterator, invokevirtual:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u983f\ubefe\ua562\u9a18\uae87\u34df, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa)))
            
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                    var_2_8E = and:int(var_2_61:int, ldc:int(-510718058))
                }
                else {
                    var_2_8E = and:int(var_2_61:int, ldc:int(-1350888325))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_7F:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>)) {
                        var_5_C8 = checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>::next, var_4_7F:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))
                        
                        if (cmpne:boolean(var_5_C8:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5())) {
                            invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u836c\u4daf\u392e\u64ab\u3d4b\u6bb9, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, var_5_C8:\ube23\uc238\u5140\u4cd9\u8aa5), p0:int)
                        }
                        
                        var_2_61 = and:int(var_2_8E:int, ldc:int(-455821505))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_8E:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_8E:int, ldc:int(-481370987))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> \u7330\u40a9\u5654\u3d4b\ua6bd\ua562() {
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
            return:List<\u51fa\u6c52\u7330\u7330\u960f>(getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f \u4492\u416d\uf9c5\u6bb9\u34df\u527a(java.util.UUID p0) {
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
            return:\u51fa\u6c52\u7330\u7330\u960f(checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>::get, getfield:Map<UUID, \u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, this:\ucb79\u8350\u7bad\u392e\u51fa), p0:UUID[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6bb9\u92ff\u927d\u759a\u2dcc\u4c2b(com.mojang.authlib.GameProfile p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(682), ldc:int(-683)))
        }
        
        goto(Label_0006)
    }
    
    public void \ufcaf\u12cb\u0800\u7049\ucfaf\u836c() {
        var_1_61 : int
        var_3_70 : Iterator<\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>
        var_3_C2 : \ub7dc\u71f1\uc238\ub19c\u965f
        var_4_CC : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_5_112 : \u51fa\u6c52\u7330\u7330\u960f
        
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
            var_1_61 = and:int(ldc:int(-997444673), ldc:int(-186893890))
            var_3_70 = invokeinterface:Iterator<\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>(Collection<\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>::iterator, invokeinterface:Collection<\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>(Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>::values, getfield:Map<UUID, \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>(\ucb79\u8350\u7bad\u392e\u51fa::\u99f7\u8d90\u74b1\u3bd6\ub113\u4975, this:\ucb79\u8350\u7bad\u392e\u51fa)))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(928243114))
                }
                else {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1453981558))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_3_70:Iterator)) {
                        invokevirtual:void(\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e::\u624e\u4bc8\u873d\ufe34\u071d\u92ee, checkcast:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e.class, invokeinterface:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(Iterator<\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>::next, var_3_70:Iterator<\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e>)), invokevirtual:\u183a\u2dcc\u36d3\u8753\ua61f\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\uae87\ubff1\uc238\ud12e\u6d69\u67e9, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa)))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\uafe7\u8389\u76bc\u4975\ucb79\u3c25, this:\ucb79\u8350\u7bad\u392e\u51fa, initobject:\u8bb0\u64ab\ubff1\u946b\u71ae[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u8bb0\u64ab\ubff1\u946b\u71ae::<init>, invokevirtual:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85(\u88c5\ud171\ub113\u6435\ud51e::\u3e2a\u6d99\u92ee\ua3b4\u4c04\u7e3f, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa))))
            var_3_C2 = initobject:\ub7dc\u71f1\uc238\ub19c\u965f(\ub7dc\u71f1\uc238\ub19c\u965f::<init>, invokevirtual:Collection<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u8350\u76bc\u67e9\uff55\u8bb0\u385b::\ucb79\ubf56\ub171\ud36e\uc229\u56bd, invokevirtual:\u8350\u76bc\u67e9\uff55\u8bb0\u385b(\u88c5\ud171\ub113\u6435\ud51e::\uc229\u6c56\u5fe1\u3e75\u67d0\u516c, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ucb79\u8350\u7bad\u392e\u51fa::\u8350\u183a\ubded\u2dcc\ub8be\u88c5, this:\ucb79\u8350\u7bad\u392e\u51fa))))
            var_4_CC = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7043\uceb8\ube23\ubb2b\u071d\u3776, this:\ucb79\u8350\u7bad\u392e\u51fa))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_4_CC:Iterator)) {
                var_5_112 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_4_CC:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_5_112:\u51fa\u6c52\u7330\u7330\u960f), var_3_C2:\ub7dc\u71f1\uc238\ub19c\u965f[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>])
                invokevirtual:void(\u392e\u47c2\u5bc4\u7c6b\uc910\u3711::\u98a4\u59ec\u74b1\uc2bd\u6b5f\ub102, invokevirtual:\u392e\u47c2\u5bc4\u7c6b\uc910\u3711(\u51fa\u6c52\u7330\u7330\u960f::\uc2bd\u4ab3\u93a2\ucb79\u7049\u647c, var_5_112:\u51fa\u6c52\u7330\u7330\u960f), var_5_112:\u51fa\u6c52\u7330\u7330\u960f)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5245\u759a\u8389\ucfaf\u72f1\u9937() {
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
            return:boolean(getfield:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\ub32d\u8bb0\u5bc4\u67d0\u8350\u3bd6, this:\ucb79\u8350\u7bad\u392e\u51fa))
        }
        
        goto(Label_0006)
    }
    
    private static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f lambda$\uf94d\u960f\u120d\u4c2b\u7af6\ud523$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
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
            return:\u7d52\u718f\u3776\u6fb0\ub83f(ternaryop:\u7d52\u718f\u3776\u6fb0\ub83f(invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc31c\u6cfe\u4e72\uc238\u0800\u6ec6, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p1:\u7d52\u718f\u3776\u6fb0\ub83f), p1:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()))
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
            putstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe, initobject:File(File::<init>, ldc:String("banned-players.json")))
            putstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\u416d\u3e2a\u4975\u3a62\u8df4\u7049, initobject:File(File::<init>, ldc:String("banned-ips.json")))
            putstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\ub102\u0c95\u8d98\u6435\ud158\u960f, initobject:File(File::<init>, ldc:String("ops.json")))
            putstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\u6cfe\u67e9\u6b0d\u3e75\u8709\u98a4, initobject:File(File::<init>, ldc:String("whitelist.json")))
            putstatic:Logger(\ucb79\u8350\u7bad\u392e\u51fa::\u7873\u4975\u4c2b\uc87f\ubded\u16f6, invokestatic:Logger(LogManager::getLogger))
            putstatic:SimpleDateFormat(\ucb79\u8350\u7bad\u392e\u51fa::\u8640\u51b2\u6cfe\ub32d\uc246\u7e3f, initobject:SimpleDateFormat(SimpleDateFormat::<init>, ldc:String("yyyy-MM-dd 'at' HH:mm:ss z")))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud36e\u3c25\u1833\u8350\u6198\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BA : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6C5 : int
        
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
        var_3_6BA = and:int(ldc:int(-1515865664), ldc:int(467776158))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucb79\u8350\u7bad\u392e\u51fa[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-188367783))
        }
        else {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-403446079))
            var_5_8A = and:int(ldc:int(19587), ldc:int(-28068))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32519), ldc:int(9990)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6BA:int, ldc:int(1006627304))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(18472), ldc:int(18473)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(264), ldc:int(265)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6BA = and:int(var_3_DA:int, ldc:int(866312950))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(10274), ldc:int(10275)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(350020953))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1660684542))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1311614600))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(915955196))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2082167816))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1068231764))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1166643929))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1767367203))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1962674580))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-476887947))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1812547675))
                        var_11_EB = and:int(ldc:int(-25663), ldc:int(24622))
                        goto(Label_1580)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1730460933))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(316182269))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1650520217))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1583245055))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-39066684))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1125697225))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-272712717))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-927412652))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1805319412))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-772098582))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1088747741))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(798556344))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(586527140))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2102360810))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1556743417))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-710810188))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(21191), ldc:int(33))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-714916994))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-988575365))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1584468535))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-635349852))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-638537289))
                        var_11_EB = and:int(ldc:int(-2600), ldc:int(2567))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(785838778))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1499000589))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1148539727))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1007742775))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-561191909))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1649942347))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1443)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(890631682))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1325753623))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1213581562))
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(854732591))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-138232583))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1261723736))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1510620763))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2065500291))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1609425337))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1580)
                    }
                    
                    Label_1443:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-982706090))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1499030734))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-269770128))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(682415389))
                        loopcontinue()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(464889596))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1580:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C5 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1557000044))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1197220634))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(888964152))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-549212228))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1020117361))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(529213079))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(937540324))
                        var_17_6C5 = add:int(var_16_119:int, xor:int(ldc:int(-30720), ldc:int(-30719)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1179734141))
                
                if (cmple:boolean(var_5_8A = var_17_6C5:int, sub:int(var_6_91:int, and:int(ldc:int(17937), ldc:int(12289))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
