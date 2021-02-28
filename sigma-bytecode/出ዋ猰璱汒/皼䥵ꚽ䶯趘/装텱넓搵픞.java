public abstract class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e {
    public static S extends \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e \u7c6b\u0800\u983f\u5d20\u392e\u8cae(java.util.function.Function<java.lang.Thread, S> p0) {
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
    
    public void \u88c5\ud171\ub113\u6435\ud51e(java.lang.Thread p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p1, \u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p2, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec p3, \ub113\uc4d2\u183a\u527a\u6435.\u4f52\ua068\u4f52\u47c2\u4492 p4, java.net.Proxy p5, com.mojang.datafixers.DataFixer p6, \u59ec\u8413\u97e6\uc229\u3776.\u7bad\u76bc\uae5d\u12cb\u16f6 p7, com.mojang.authlib.minecraft.MinecraftSessionService p8, com.mojang.authlib.GameProfileRepository p9, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ub1b9\u983f\uf9c5\u6fb0\u51fa p10, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u446c\u527a\u8c8a\u927d\u3e75 p11) {
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
            invokespecial:\ua068\ud217\u72f1\u446c\u3d64\ub6ab(\ua068\ud217\u72f1\u446c\u3d64\ub6ab::<init>, this:\u88c5\ud171\ub113\u6435\ud51e, ldc:String("Server"))
            putfield:\u9255\u7e3f\u5d20\u8389\u4daf(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\u4c04\ucef1\u4d85\u7af6\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\u9255\u7e3f\u5d20\u8389\u4daf(\u9255\u7e3f\u5d20\u8389\u4daf::<init>, ldc:String("server"), this:\u88c5\ud171\ub113\u6435\ud51e[expected:\ub171\u4f4a\u76bc\ud7e8\u8cae], invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52)))
            putfield:List<Runnable>(\u88c5\ud171\ub113\u6435\ud51e::\u99f7\ub70c\ub6ab\uf94d\uc910\ua3b4, this:\u88c5\ud171\ub113\u6435\ud51e, invokestatic:ArrayList[expected:List<Runnable>](Lists::newArrayList))
            putfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\ub8be\u6fb0\u8bb0\ub7dc\u98a4, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\u56bd\u6b0d\u3711\ub18d\u12b2(\u56bd\u6b0d\u3711\ub18d\u12b2::<init>, getstatic:LongSupplier(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u0c95\ubcb0\u6cfe\uae5d\u8258\uc87f), invokedynamic:IntSupplier(getAsInt:(L\u51fa\u12cb\u7330\u74b1\u6c52/\u76bc\u4975\ua6bd\u4daf\u8d98/\u88c5\ud171\ub113\u6435\ud51e;)Ljava/util/function/IntSupplier;, this:\u88c5\ud171\ub113\u6435\ud51e)))
            putfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e, getstatic:\u836c\ub171\u3a62\u34df\u3dd3[expected:\ubf56\u64f2\u392e\u98a4\u120d](\u836c\ub171\u3a62\u34df\u3dd3::\u59ec\u8709\ubb2b\u76bc\u5140\u7af6))
            putfield:\uc84e\ub32d\u3dd3\u2dcc\u34df(\u88c5\ud171\ub113\u6435\ud51e::\uc229\u8bb0\uc31c\u624e\u62da\u446c, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\uc84e\ub32d\u3dd3\u2dcc\u34df(\uc84e\ub32d\u3dd3\u2dcc\u34df::<init>))
            putfield:Random(\u88c5\ud171\ub113\u6435\ud51e::\uc238\u47c2\u446c\u392e\u416d\u64f2, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:Random(Random::<init>))
            putfield:int(\u88c5\ud171\ub113\u6435\ud51e::\ub102\u5bc4\ub83f\u40a9\u51b2\u62da, this:\u88c5\ud171\ub113\u6435\ud51e, ldc:int(-1))
            putfield:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u8c8a\u3e2a\u8df4\u718f\u69d9\u3776, this:\u88c5\ud171\ub113\u6435\ud51e, invokestatic:LinkedHashMap[expected:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>](Maps::newLinkedHashMap))
            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, this:\u88c5\ud171\ub113\u6435\ud51e, and:int[expected:boolean](ldc:int(609), ldc:int(12417)))
            putfield:long[](\u88c5\ud171\ub113\u6435\ud51e::\ubcb0\ub70c\u6c52\u3776\u93a2\u8df4, this:\u88c5\ud171\ub113\u6435\ud51e, newarray:long[](long.class, ldc:int(100)))
            putfield:String(\u88c5\ud171\ub113\u6435\ud51e::\uc29a\u071d\u4f4a\uc31c\ubff1\u3bc9, this:\u88c5\ud171\ub113\u6435\ud51e, ldc:String(""))
            putfield:String(\u88c5\ud171\ub113\u6435\ud51e::\u8258\ua61f\u8258\u4975\ud7e8\u7ce1, this:\u88c5\ud171\ub113\u6435\ud51e, ldc:String(""))
            putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e, invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52))
            putfield:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\u62da\u9033\uc84e\u9255\uf995, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\u9033\uc2e8\u72f1\u8d98\u6d69(\u9033\uc2e8\u72f1\u8d98\u6d69::<init>, this:\u88c5\ud171\ub113\u6435\ud51e))
            putfield:\u600f\u64ab\uc9f6\u2dcc\u62da(\u88c5\ud171\ub113\u6435\ud51e::\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\u600f\u64ab\uc9f6\u2dcc\u62da(\u600f\u64ab\uc9f6\u2dcc\u62da::<init>))
            putfield:\u624e\u416d\u97b7\u1187\u8df4\u71ae(\u88c5\ud171\ub113\u6435\ud51e::\uae87\u8308\u6fb0\u3bd6\uae5d\uc229, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\u624e\u416d\u97b7\u1187\u8df4\u71ae(\u624e\u416d\u97b7\u1187\u8df4\u71ae::<init>))
            putfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(\u88c5\ud171\ub113\u6435\ud51e::\uf995\ub113\u51fa\u9937\u6bb9\uae87, this:\u88c5\ud171\ub113\u6435\ud51e, p1:\u7d52\u51fa\u56bd\u76bc\u4975\ub113)
            putfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e, p3:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec)
            putfield:Proxy(\u88c5\ud171\ub113\u6435\ud51e::\ud158\u8d98\ubded\u40a9\ub70c\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e, p5:Proxy)
            putfield:\u4f52\ua068\u4f52\u47c2\u4492(\u88c5\ud171\ub113\u6435\ud51e::\u92ee\u6bb9\uc7fe\ub102\u52d3\u92ee, this:\u88c5\ud171\ub113\u6435\ud51e, p4:\u4f52\ua068\u4f52\u47c2\u4492)
            putfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e, p7:\u7bad\u76bc\uae5d\u12cb\u16f6)
            putfield:MinecraftSessionService(\u88c5\ud171\ub113\u6435\ud51e::\u6d69\u071d\ucb79\ucfaf\uc246\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e, p8:MinecraftSessionService)
            putfield:GameProfileRepository(\u88c5\ud171\ub113\u6435\ud51e::\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3, this:\u88c5\ud171\ub113\u6435\ud51e, p9:GameProfileRepository)
            putfield:\ub1b9\u983f\uf9c5\u6fb0\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u93a2\uc3e3\u6d69\uae5d\u600f\ud36e, this:\u88c5\ud171\ub113\u6435\ud51e, p10:\ub1b9\u983f\uf9c5\u6fb0\u51fa)
            putfield:\u9255\u0b8e\ud36e\ucef1\ud523(\u88c5\ud171\ub113\u6435\ud51e::\u6fb0\u3711\u99f7\u16f6\u76bc\u8258, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\u9255\u0b8e\ud36e\ucef1\ud523(\u9255\u0b8e\ud36e\ucef1\ud523::<init>, this:\u88c5\ud171\ub113\u6435\ud51e))
            putfield:\u446c\u527a\u8c8a\u927d\u3e75(\u88c5\ud171\ub113\u6435\ud51e::\ub83f\u71ae\ub171\u527a\u34df\u3e2a, this:\u88c5\ud171\ub113\u6435\ud51e, p11:\u446c\u527a\u8c8a\u927d\u3e75)
            putfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e, p2:\uae87\ub19c\u9937\u836c\u34df\ub8be)
            putfield:\u7e3f\uc84e\u873d\u7049\ubb2b\u960f(\u88c5\ud171\ub113\u6435\ud51e::\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a, this:\u88c5\ud171\ub113\u6435\ud51e, invokevirtual:\u7e3f\uc84e\u873d\u7049\ubb2b\u960f(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u5fe1\ub83f\u836c\u8c8a\uc29a\u7873, p2:\uae87\ub19c\u9937\u836c\u34df\ub8be))
            putfield:DataFixer(\u88c5\ud171\ub113\u6435\ud51e::\u759a\uf995\u51fa\u7330\u4c2b\u8bb0, this:\u88c5\ud171\ub113\u6435\ud51e, p6:DataFixer)
            putfield:\ua3b4\u4179\uae5d\ub102\u9a18\u624e(\u88c5\ud171\ub113\u6435\ud51e::\u3711\u4d85\u3776\ua562\u7873\u51fa, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\ua3b4\u4179\uae5d\ub102\u9a18\u624e(\ua3b4\u4179\uae5d\ub102\u9a18\u624e::<init>, this:\u88c5\ud171\ub113\u6435\ud51e, invokevirtual:\u7ce1\u9937\uf9c5\u983f\u98a4(\u7bad\u76bc\uae5d\u12cb\u16f6::\ub171\u4f52\u92ee\ub1b9\u6198\u3e75, p7:\u7bad\u76bc\uae5d\u12cb\u16f6)))
            putfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\u88c5\ud171\ub113\u6435\ud51e::\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1::<init>, invokevirtual:\u6c52\u52d3\u516c\uae87\uae5d(\u7bad\u76bc\uae5d\u12cb\u16f6::\u6cfe\u92ff\uc84e\u760c\u0c95\uc238, p7:\u7bad\u76bc\uae5d\u12cb\u16f6), p2:\uae87\ub19c\u9937\u836c\u34df\ub8be, p6:DataFixer))
            putfield:Thread(\u88c5\ud171\ub113\u6435\ud51e::\u3e75\u62da\ub171\ub83f\u416d\u71ae, this:\u88c5\ud171\ub113\u6435\ud51e, p0:Thread)
            putfield:Executor(\u88c5\ud171\ub113\u6435\ud51e::\u59ec\u74b1\ua61f\u8df4\u8df4\u3dd3, this:\u88c5\ud171\ub113\u6435\ud51e, invokestatic:Executor(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u760c\uceb8\ub32d\ub113\u120d\u4ab3))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u67e9\u156b\u3504\u6198\ubefe\u071d(\u5245\u8aa5\u61a4\u7049\u4cd9.\ub1b9\u4f52\ubff1\u8709\u36d3\ub113 p0) {
        var_4_71 : \u0c95\u4f4a\u7043\u8350\u3711
        
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
            var_4_71 = checkcast:\u0c95\u4f4a\u7043\u8350\u3711(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u0c95\u4f4a\u7043\u8350\u3711.class, invokevirtual:\u0c95\u4f4a\u7043\u8350\u3711(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\ube23\ud523\u1833\u9af2\ud12e\ua3b4, p0:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, invokedynamic:Supplier<\u0c95\u4f4a\u7043\u8350\u3711>(get:()Ljava/util/function/Supplier;), ldc:String("scoreboard")))
            invokevirtual:void(\u0c95\u4f4a\u7043\u8350\u3711::\u0b8e\ucfaf\u6c52\u47c2\ub7dc\u494c, var_4_71:\u0c95\u4f4a\u7043\u8350\u3711, invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd](\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, this:\u88c5\ud171\ub113\u6435\ud51e))
            invokevirtual:void(\u9033\uc2e8\u72f1\u8d98\u6d69::\u7af6\u0c95\u0c95\u6d69\u4bc8\u8389, invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, this:\u88c5\ud171\ub113\u6435\ud51e), initobject:\u88c5\u5bc4\ud523\u983f\u9a18\ub102(\u88c5\u5bc4\ud523\u983f\u9a18\ub102::<init>, var_4_71:\u0c95\u4f4a\u7043\u8350\u3711[expected:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \ud12e\u8350\u51fa\u7049\u51fa\ua068();
    
    public static void \u7049\u156b\u8258\uc4d2\uc3e3\uc84e(\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p0) {
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
            
            if (invokevirtual:boolean(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u6fb0\u0c95\u4daf\u8c8a\u71f1\u61a4, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be)) {
                invokeinterface:void(Logger::info, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Converting map!"))
                invokevirtual:boolean(\uae87\ub19c\u9937\u836c\u34df\ub8be::\uf9c5\u97e6\u6198\u8cae\u6c56\u527a, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be, initobject:\ub70c\ud36e\u446c\u6cfe\u64f2[expected:\u8389\u8413\u3a62\u8cae\uc31c\u6d69](\ub70c\ud36e\u446c\u6cfe\u64f2::<init>))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubb2b\u927d\u4bc8\u8389\u69d9\u8350() {
        var_3_85 : \u647c\u8308\u446c\uc3e3\u69d9
        
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
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\ucb79\ucfaf\u88c5\u071d\u12b2\uc910, this:\u88c5\ud171\ub113\u6435\ud51e)
            invokeinterface:void(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u3dd3\ua61f\u416d\ucb79\u6435\ucfaf, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e), invokevirtual:String(\u88c5\ud171\ub113\u6435\ud51e::\u4d85\uc3e3\u7873\uc246\ua3b4\ub1b9, this:\u88c5\ud171\ub113\u6435\ud51e), invokevirtual:boolean(Optional<T>::isPresent, invokevirtual:Optional<String>(\u88c5\ud171\ub113\u6435\ud51e::\u0a06\u5fe1\u183a\u67e9\u7af6\uf995, this:\u88c5\ud171\ub113\u6435\ud51e)))
            var_3_85 = invokeinterface:\u647c\u8308\u446c\uc3e3\u69d9(\u446c\u527a\u8c8a\u927d\u3e75::\ud12e\ub18d\u8cae\ua6bd\u47c2\uae87, getfield:\u446c\u527a\u8c8a\u927d\u3e75(\u88c5\ud171\ub113\u6435\ud51e::\ub83f\u71ae\ub171\u527a\u34df\u3e2a, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:int(11))
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u7006\u960f\u64f2\uc4d2\ubded\u6c52, this:\u88c5\ud171\ub113\u6435\ud51e, var_3_85:\u647c\u8308\u446c\uc3e3\u69d9)
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\ubded\ucfaf\u74b1\u4f52\u3bc9\u946b, this:\u88c5\ud171\ub113\u6435\ud51e)
            invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\uff55\u873d\ubded\u759a\u9255\uc229, this:\u88c5\ud171\ub113\u6435\ud51e, var_3_85:\u647c\u8308\u446c\uc3e3\u69d9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\ucfaf\u74b1\u4f52\u3bc9\u946b() {
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
    
    public void \u7006\u960f\u64f2\uc4d2\ubded\u6c52(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u647c\u8308\u446c\uc3e3\u69d9 p0) {
        var_2_67 : int
        var_4_71 : \uc84e\u983f\u0a06\u3d64\u5d20\u4179
        var_2_78 : int
        var_5_82 : \u7043\u40a9\u4975\u0800\u385b
        var_2_89 : int
        var_6_8F : boolean
        var_2_96 : int
        var_7_9C : long
        var_2_A3 : int
        var_9_A9 : long
        var_2_B0 : int
        var_11_D9 : ImmutableList
        var_2_E0 : int
        var_12_E6 : \u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>
        var_2_ED : int
        var_13_F9 : \u6ec6\ub19c\u392e\uc238\u51fa\u92ee
        var_14_176 : \u3d4b\u9937\u7af6\u7af6\u6198\uae87
        var_15_19F : \ufcaf\u97e6\u34df\u5245\u927d\ubcb0
        var_16_1E3 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_17_1F9 : \ub1b9\u4f52\ubff1\u8709\u36d3\ub113
        var_18_213 : \u34df\u4492\u71ae\uc238\u7873\uafe7
        var_20_26C : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_19_262 : Throwable
        var_19_2CA : Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>
        var_20_2E0 : Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>
        var_21_2EC : \u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>
        var_22_301 : \u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>
        var_26_357 : \ube23\uc238\u5140\u4cd9\u8aa5
        
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
            var_2_67 = and:int(and:int(ldc:int(-263293730), ldc:int(-446254865)), ldc:int(-203733045))
            var_4_71 = invokeinterface:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u6435\u5db4\uc31c\u7049\ubded\u3bc9, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e))
            var_2_78 = and:int(var_2_67:int, ldc:int(1759200122))
            var_5_82 = invokeinterface:\u7043\u40a9\u4975\u0800\u385b(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub32d\u446c\uf9c5\u3504\u4c04\u7ce1, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e))
            var_2_89 = and:int(var_2_78:int, ldc:int(-162119094))
            var_6_8F = invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\u8df4\u5f50\u8df4\u0800\u6cfe\u4cd9, var_5_82:\u7043\u40a9\u4975\u0800\u385b)
            var_2_96 = and:int(var_2_89:int, ldc:int(-196874501))
            var_7_9C = invokevirtual:long(\u7043\u40a9\u4975\u0800\u385b::\ubf56\u071d\u873d\u4c04\u0800\uc29a, var_5_82:\u7043\u40a9\u4975\u0800\u385b)
            var_2_A3 = and:int(var_2_96:int, ldc:int(-101819558))
            var_9_A9 = invokestatic:long(\u8c8a\u51b2\u516c\ub70c\u624e::\u56bd\u6d99\u494c\uf995\u4c04\uc84e, var_7_9C:long)
            var_2_B0 = and:int(var_2_A3:int, ldc:int(-296615349))
            var_11_D9 = invokestatic:ImmutableList(ImmutableList::of, initobject:\ub1b9\ud171\u4d85\u1187\u8389\ucb79[expected:Object](\ub1b9\ud171\u4d85\u1187\u8389\ucb79::<init>), initobject:\u3a62\u7043\u3e75\u624e\u88c5\uf9c5[expected:Object](\u3a62\u7043\u3e75\u624e\u88c5\uf9c5::<init>), initobject:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0[expected:Object](\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0::<init>), initobject:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56[expected:Object](\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::<init>), initobject:\uae87\u3a62\u12b2\ubff1\u983f\u8350[expected:Object](\uae87\u3a62\u12b2\ubff1\u983f\u8350::<init>, var_4_71:\uc84e\u983f\u0a06\u3d64\u5d20\u4179))
            var_2_E0 = and:int(var_2_B0:int, ldc:int(1758948970))
            var_12_E6 = invokevirtual:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u9937\u74b1\u7c6b\ub7dc\u3bc9\u1833, var_5_82:\u7043\u40a9\u4975\u0800\u385b)
            var_2_ED = and:int(var_2_E0:int, ldc:int(1793462783))
            var_13_F9 = checkcast:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee.class, invokevirtual:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\ube23\ucb79\uc84e\u92ee\u965f\u3bc9, var_12_E6:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u7e3f\u4492\u760c\u6bb9\u4c2b\u4c04)))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_ED:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_ED = and:int(var_2_ED:int, ldc:int(-1440741347))
                    goto(Label_0327)
                }
                
                if (cmpeq:boolean(and:int(var_2_ED:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_ED = and:int(var_2_ED:int, ldc:int(1915104462))
                }
                else {
                    var_2_ED = and:int(var_2_ED:int, ldc:int(1710687742))
                    
                    if (cmpne:boolean(var_13_F9:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee, aconstnull:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee())) {
                        var_14_176 = invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u3504\u0b8e\u93a2\u0800\u3a62\u69d9, var_13_F9:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee)
                        var_15_19F = invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\ufcaf\u4c2b\u600f\u9937\u183a\uf995, var_13_F9:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee)
                        looporswitchbreak()
                    }
                }
                
                Label_0296:
                
                if (cmpeq:boolean(and:int(var_2_ED:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_ED = and:int(var_2_ED:int, ldc:int(-1878072471))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_ED:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_ED = and:int(var_2_ED:int, ldc:int(-218405413))
                }
                
                Label_0327:
                
                if (cmpeq:boolean(and:int(var_2_ED:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_ED = and:int(var_2_ED:int, ldc:int(-1763632769))
                    goto(Label_0296)
                }
                
                if (cmpne:boolean(and:int(var_2_ED:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_14_176 = checkcast:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87.class, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>::\u624e\u62da\u9937\uafe7\u8389\u98a4, invokevirtual:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ud36e\u5654\u965f\ub8be\u8d90\uae87, getfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f](\u88c5\ud171\ub113\u6435\ud51e::\uf995\ub113\u51fa\u9937\u6bb9\uae87, this:\u88c5\ud171\ub113\u6435\ud51e)), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u9a18\u6cfe\uae5d\u385b\ub70c\u9a18)))
                    var_15_19F = invokestatic:\ud158\uc9f6\u8413\u7049\uceb8\u3bd6[expected:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0](\u7043\u40a9\u4975\u0800\u385b::\ua61f\u4daf\u183a\u7006\ud4fe\u74b1, invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>](\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, getfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f](\u88c5\ud171\ub113\u6435\ud51e::\uf995\ub113\u51fa\u9937\u6bb9\uae87, this:\u88c5\ud171\ub113\u6435\ud51e), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4d85\u071d\u4c2b\ua6bd\uc238\u718f)), invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>](\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, getfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f](\u88c5\ud171\ub113\u6435\ud51e::\uf995\ub113\u51fa\u9937\u6bb9\uae87, this:\u88c5\ud171\ub113\u6435\ud51e), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u8350\u760c\u4d85\u071d\u93a2\ud51e)), invokevirtual:long(Random::nextLong, initobject:Random(Random::<init>)))
                    looporswitchbreak()
                }
            }
            
            var_16_1E3 = initobject:\ube23\uc238\u5140\u4cd9\u8aa5(\ube23\uc238\u5140\u4cd9\u8aa5::<init>, this:\u88c5\ud171\ub113\u6435\ud51e, getfield:Executor(\u88c5\ud171\ub113\u6435\ud51e::\u59ec\u74b1\ua61f\u8df4\u8df4\u3dd3, this:\u88c5\ud171\ub113\u6435\ud51e), getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e), var_4_71:\uc84e\u983f\u0a06\u3d64\u5d20\u4179, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u071d\u5140\u600f\u4975\ufcaf\u624e), var_14_176:\u3d4b\u9937\u7af6\u7af6\u6198\uae87, p0:\u647c\u8308\u446c\uc3e3\u69d9, var_15_19F:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, var_6_8F:boolean, var_9_A9:long, var_11_D9:List<\u67d0\u61a4\u5f50\u647c\u836c\u71ae>, and:int[expected:boolean](ldc:int(6293), ldc:int(1281)))
            invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>::put, getfield:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u8c8a\u3e2a\u8df4\u718f\u69d9\u3776, this:\u88c5\ud171\ub113\u6435\ud51e), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u071d\u5140\u600f\u4975\ufcaf\u624e), var_16_1E3:\ube23\uc238\u5140\u4cd9\u8aa5)
            var_17_1F9 = invokevirtual:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(\ube23\uc238\u5140\u4cd9\u8aa5::\u4c2b\u40a9\u88c5\uc84e\u600f\ubded, var_16_1E3:\ube23\uc238\u5140\u4cd9\u8aa5)
            invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u67e9\u156b\u3504\u6198\ubefe\u071d, this:\u88c5\ud171\ub113\u6435\ud51e, var_17_1F9:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113)
            putfield:\u516c\u8aa5\u8df4\u71f1\u8258\u4d85(\u88c5\ud171\ub113\u6435\ud51e::\ud7e8\u0800\u7ce1\u12cb\u759a\u8bb0, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\u516c\u8aa5\u8df4\u71f1\u8258\u4d85(\u516c\u8aa5\u8df4\u71f1\u8258\u4d85::<init>, var_17_1F9:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113))
            var_18_213 = invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, var_16_1E3:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
            invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u64f2\u0a06\u600f\u6198\u156b\u51fa, var_18_213:\u34df\u4492\u71ae\uc238\u7873\uafe7, invokeinterface:\ud523\u0a06\u76bc\u4e72\u59ec\ufe34(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u1833\uf9c5\u1833\u98a4\ucb79\ub70c, var_4_71:\uc84e\u983f\u0a06\u3d64\u5d20\u4179))
            
            if (logicalnot:boolean(invokeinterface:boolean(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u6b0d\ub83f\u47c2\u8d98\u8cae\ua068, var_4_71:\uc84e\u983f\u0a06\u3d64\u5d20\u4179))) {
                try {
                    invokestatic:void(\u88c5\ud171\ub113\u6435\ud51e::\u34df\u7d52\u7049\u5140\ucfaf\ub70c, var_16_1E3:\ube23\uc238\u5140\u4cd9\u8aa5, var_4_71:\uc84e\u983f\u0a06\u3d64\u5d20\u4179, invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\ub18d\uc9f6\u7043\u7c6b\ucfaf\u3e2a, var_5_82:\u7043\u40a9\u4975\u0800\u385b), var_6_8F:boolean, xor:int[expected:boolean](ldc:int(5200), ldc:int(5201)))
                    invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u4ab3\u624e\u8350\u36d3\uc246\u600f, var_4_71:\uc84e\u983f\u0a06\u3d64\u5d20\u4179, xor:int[expected:boolean](ldc:int(-24319), ldc:int(-24320)))
                    
                    if (var_6_8F:boolean) {
                        invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u72f1\u8c8a\ua562\ub8be\u8258\u9033, this:\u88c5\ud171\ub113\u6435\ud51e, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e))
                    }
                }
                catch (java.lang.Throwable var_19_262) {
                    var_20_26C = invokestatic:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubcb0\u59ec\u6d99\u156b\u0800\u946b, var_19_262:Throwable, ldc:String("Exception initializing level"))
                    
                    try {
                        invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3504\u8413\u5fe1\ub8be\u0b8e\u3e2a, var_16_1E3:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_20_26C:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
                    }
                    catch (java.lang.Throwable stack_27D_0) {
                    }
                    
                    athrow(initobject:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf(\uceb8\u8258\uf9c5\uc229\u7330\ucfaf::<init>, var_20_26C:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e))
                }
                
                invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u4ab3\u624e\u8350\u36d3\uc246\u600f, var_4_71:\uc84e\u983f\u0a06\u3d64\u5d20\u4179, xor:int[expected:boolean](ldc:int(66), ldc:int(67)))
            }
            
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u7873\ud171\u6ec6\u3d64\u156b\u0c95, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, this:\u88c5\ud171\ub113\u6435\ud51e), var_16_1E3:\ube23\uc238\u5140\u4cd9\u8aa5)
            
            if (cmpne:boolean(invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u4cd9\ud4fe\u3bd6\u983f\u8c8a\u8413, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e)), aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
                invokevirtual:void(\u600f\u64ab\uc9f6\u2dcc\u62da::\u6435\u47c2\u946b\u72f1\u8350\u5654, invokevirtual:\u600f\u64ab\uc9f6\u2dcc\u62da(\u88c5\ud171\ub113\u6435\ud51e::\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe, this:\u88c5\ud171\ub113\u6435\ud51e), invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u4cd9\ud4fe\u3bd6\u983f\u8c8a\u8413, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e)))
            }
            
            var_19_2CA = invokeinterface:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>(Set<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>::iterator, invokevirtual:Set<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\u516c\ud51e\u3e2a\u36d3\uc7fe\u836c, var_12_E6:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_19_2CA:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>)) {
                var_20_2E0 = checkcast:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>(java.util.Map.Entry<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>.class, invokeinterface:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>::next, var_19_2CA:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>))
                var_21_2EC = checkcast:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>.class, invokeinterface:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, V>::getKey, var_20_2E0:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, V>))
                
                if (cmpne:boolean(var_21_2EC:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u7e3f\u4492\u760c\u6bb9\u4c2b\u4c04))) {
                    var_22_301 = invokestatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u8c8a\u0800\uceb8\u647c\ud4fe\u6c56, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u47c2\uc229\u759a\u2dcc\u2dcc\u34df), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, var_21_2EC:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>))
                    var_26_357 = initobject:\ube23\uc238\u5140\u4cd9\u8aa5(\ube23\uc238\u5140\u4cd9\u8aa5::<init>, this:\u88c5\ud171\ub113\u6435\ud51e, getfield:Executor(\u88c5\ud171\ub113\u6435\ud51e::\u59ec\u74b1\ua61f\u8df4\u8df4\u3dd3, this:\u88c5\ud171\ub113\u6435\ud51e), getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e), initobject:\u3e75\uafe7\u836c\u8aa5\u64f2\u8c8a[expected:\uc84e\u983f\u0a06\u3d64\u5d20\u4179](\u3e75\uafe7\u836c\u8aa5\u64f2\u8c8a::<init>, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e), var_4_71:\uc84e\u983f\u0a06\u3d64\u5d20\u4179), var_22_301:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u3504\u0b8e\u93a2\u0800\u3a62\u69d9, checkcast:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee.class, invokeinterface:V[expected:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee](Entry<K, V>::getValue, var_20_2E0:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, V>))), p0:\u647c\u8308\u446c\uc3e3\u69d9, invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\ufcaf\u4c2b\u600f\u9937\u183a\uf995, checkcast:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee.class, invokeinterface:V[expected:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee](Entry<K, V>::getValue, var_20_2E0:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, V>))), var_6_8F:boolean, var_9_A9:long, invokestatic:ImmutableList[expected:List<\u67d0\u61a4\u5f50\u647c\u836c\u71ae>](ImmutableList::of), and:int[expected:boolean](ldc:int(4741), ldc:int(-4750)))
                    invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u983f\ub32d\u0b8e\ud158\u74b1\ud36e, var_18_213:\u34df\u4492\u71ae\uc238\u7873\uafe7, initobject:\u36d3\u4e72\ubcb0\u93a2\uc238\u67e9(\u36d3\u4e72\ubcb0\u93a2\uc238\u67e9::<init>, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, var_26_357:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])))
                    invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>::put, getfield:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u8c8a\u3e2a\u8df4\u718f\u69d9\u3776, this:\u88c5\ud171\ub113\u6435\ud51e), var_22_301:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, var_26_357:\ube23\uc238\u5140\u4cd9\u8aa5)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u34df\u7d52\u7049\u5140\ucfaf\ub70c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc84e\u983f\u0a06\u3d64\u5d20\u4179 p1, boolean p2, boolean p3, boolean p4) {
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
    
    private void \u72f1\u8c8a\ua562\ub8be\u8258\u9033(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec p0) {
        var_4_7E : \uc84e\u983f\u0a06\u3d64\u5d20\u4179
        
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
            invokeinterface:void(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub171\u8709\u92ff\u7ce1\ud51e\u0800, p0:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec, getstatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u97b7\u98a4\u385b\u5140\u0c95\uc4d2))
            invokeinterface:void(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u8bb0\u8cae\u0b8e\ub1b9\ud217\u7330, p0:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec, and:int[expected:boolean](ldc:int(21251), ldc:int(10321)))
            var_4_7E = invokeinterface:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u6435\u5db4\uc31c\u7049\ubded\u3bc9, p0:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec)
            invokeinterface:void(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u3776\u6d69\u4ab3\ub18d\uc29a\u2dcc, var_4_7E:\uc84e\u983f\u0a06\u3d64\u5d20\u4179[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043], and:int[expected:boolean](ldc:int(-28954), ldc:int(28953)))
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\uc2e8\u47c2\ub19c\ub32d\u40a9\u61a4, var_4_7E:\uc84e\u983f\u0a06\u3d64\u5d20\u4179, and:int[expected:boolean](ldc:int(12876), ldc:int(-13149)))
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u93a2\u4c04\u4e72\u9255\u7049\ud217, var_4_7E:\uc84e\u983f\u0a06\u3d64\u5d20\u4179, ldc:int(1000000000))
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u527a\uc7fe\u6d99\ud4fe\u7049\u3e2a, var_4_7E:\uc84e\u983f\u0a06\u3d64\u5d20\u4179, ldc:long(6000L))
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\ud171\u983f\u6d69\u92ee\u5fe1\u4c2b, var_4_7E:\uc84e\u983f\u0a06\u3d64\u5d20\u4179, getstatic:\uf94d\u51b2\u1833\u34df\u1187(\uf94d\u51b2\u1833\u34df\u1187::\u71ae\u98a4\ub6ab\ucef1\u0c95\u3776))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uff55\u873d\ubded\u759a\u9255\uc229(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u647c\u8308\u446c\uc3e3\u69d9 p0) {
        var_2_61 : int
        var_4_66 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_5_80 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_6_96 : \u69d9\u759a\u64ab\ua3b4\u6b0d
        var_2_1B5 : int
        var_7_115 : Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>
        var_8_17B : \ube23\uc238\u5140\u4cd9\u8aa5
        var_9_190 : \ua562\u965f\u8350\u16f6\u59ec
        var_10_1AE : LongIterator
        
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
            var_2_61 = and:int(ldc:int(1970806444), ldc:int(1591366449))
            var_4_66 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u88c5\ud171\ub113\u6435\ud51e::\u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e)
            invokeinterface:void(Logger::info, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Preparing start region for dimension {}"), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, var_4_66:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])))
            var_5_80 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ube23\uc238\u5140\u4cd9\u8aa5::\u873d\u6435\u5245\ud12e\uae87\u64f2, var_4_66:\ube23\uc238\u5140\u4cd9\u8aa5)
            invokeinterface:void(\u647c\u8308\u446c\uc3e3\u69d9::\u416d\u3bd6\u8709\u8df4\u3776\ud12e, p0:\u647c\u8308\u446c\uc3e3\u69d9, initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, var_5_80:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            var_6_96 = invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, var_4_66:\ube23\uc238\u5140\u4cd9\u8aa5)
            invokevirtual:void(\ufcaf\u4c2b\u927d\u4975\u3e2a::\ud36e\u6c52\u61a4\u3711\u40a9\u6bb9, invokevirtual:\ufcaf\u4c2b\u927d\u4975\u3e2a(\u69d9\u759a\u64ab\ua3b4\u6b0d::\ufe34\u3d4b\u946b\u74b1\ud4fe\ucb79, var_6_96:\u69d9\u759a\u64ab\ua3b4\u6b0d), and:int(ldc:int(502), ldc:int(24052)))
            putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e, invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52))
            invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\uceb8\u156b\uc246\u1187\u92ff\u67e9, var_6_96:\u69d9\u759a\u64ab\ua3b4\u6b0d, getstatic:\u7ce1\u3bd6\ud51e\u0800\u3d64<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(\u7ce1\u3bd6\ud51e\u0800\u3d64::\uc31c\ubefe\uae87\ud7e8\ubcb0\u6c56), initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, var_5_80:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:int(11), getstatic:\u3bc9\u4492\u69d9\ud12e\uc238\u6c56(\u3bc9\u4492\u69d9\ud12e\uc238\u6c56::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(777994270))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1109740704))
                    
                    if (cmpne:boolean(invokevirtual:int(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u72f1\u97e6\u392e\ub113\u6fb0\ub113, var_6_96:\u69d9\u759a\u64ab\ua3b4\u6b0d), xor:int(ldc:int(1120), ldc:int(1497)))) {
                        putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e, add:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), ldc:long(10L)))
                        invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\ubefe\u600f\u56bd\u8d90\u7330\uc246, this:\u88c5\ud171\ub113\u6435\ud51e)
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_2_1B5 = and:int(var_2_61:int, ldc:int(920622892))
            putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e, add:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), ldc:long(10L)))
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\ubefe\u600f\u56bd\u8d90\u7330\uc246, this:\u88c5\ud171\ub113\u6435\ud51e)
            var_7_115 = invokeinterface:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>(Collection<\ube23\uc238\u5140\u4cd9\u8aa5>::iterator, invokeinterface:Collection<\ube23\uc238\u5140\u4cd9\u8aa5>(Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>::values, getfield:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u8c8a\u3e2a\u8df4\u718f\u69d9\u3776, this:\u88c5\ud171\ub113\u6435\ud51e)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_115:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>)) {
                var_8_17B = checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>::next, var_7_115:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))
                var_9_190 = checkcast:\ua562\u965f\u8350\u16f6\u59ec(\u5245\u8aa5\u61a4\u7049\u4cd9.\ua562\u965f\u8350\u16f6\u59ec.class, invokevirtual:\ua562\u965f\u8350\u16f6\u59ec(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u527a\u839e\uc246\u624e\u759a\ua562, invokevirtual:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(\ube23\uc238\u5140\u4cd9\u8aa5::\u4c2b\u40a9\u88c5\uc84e\u600f\ubded, var_8_17B:\ube23\uc238\u5140\u4cd9\u8aa5), invokedynamic:Supplier<\ua562\u965f\u8350\u16f6\u59ec>(get:()Ljava/util/function/Supplier;), ldc:String("chunks")))
                
                if (cmpne:boolean(var_9_190:\ua562\u965f\u8350\u16f6\u59ec, aconstnull:\ua562\u965f\u8350\u16f6\u59ec())) {
                    var_10_1AE = invokeinterface:LongIterator(LongSet::iterator, invokevirtual:LongSet(\ua562\u965f\u8350\u16f6\u59ec::\u965f\u56bd\u0a06\u7e3f\u40a9\u8df4, var_9_190:\ua562\u965f\u8350\u16f6\u59ec))
                    
                    loop {
                        var_2_1B5 = and:int(var_2_1B5:int, ldc:int(1557806773))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(LongIterator::hasNext, var_10_1AE:LongIterator))) {
                            looporswitchbreak()
                        }
                        
                        invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u61a4\u385b\ub19c\u98a4\ua6bd\u4c04, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, var_8_17B:\ube23\uc238\u5140\u4cd9\u8aa5), initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, invokeinterface:long(LongIterator::nextLong, var_10_1AE:LongIterator)), and:int[expected:boolean](ldc:int(641), ldc:int(71)))
                    }
                }
                
                var_2_1B5 = and:int(var_2_1B5:int, ldc:int(1425996386))
            }
            
            putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e, add:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), ldc:long(10L)))
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\ubefe\u600f\u56bd\u8d90\u7330\uc246, this:\u88c5\ud171\ub113\u6435\ud51e)
            invokeinterface:void(\u647c\u8308\u446c\uc3e3\u69d9::\u4bc8\u3a62\u3d64\u8258\ub18d\uc2e8, p0:\u647c\u8308\u446c\uc3e3\u69d9)
            invokevirtual:void(\ufcaf\u4c2b\u927d\u4975\u3e2a::\ud36e\u6c52\u61a4\u3711\u40a9\u6bb9, invokevirtual:\ufcaf\u4c2b\u927d\u4975\u3e2a(\u69d9\u759a\u64ab\ua3b4\u6b0d::\ufe34\u3d4b\u946b\u74b1\ud4fe\ucb79, var_6_96:\u69d9\u759a\u64ab\ua3b4\u6b0d), and:int(ldc:int(437), ldc:int(31239)))
            invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u0a06\uc246\ubf56\ub83f\u61a4\u64f2, this:\u88c5\ud171\ub113\u6435\ud51e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\ucfaf\u88c5\u071d\u12b2\uc910() {
        var_1_13A : int
        var_3_77 : File
        var_4_E3 : String
        
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
            var_1_13A = and:int(and:int(ldc:int(1149184887), ldc:int(-1900100673)), ldc:int(-1369777161))
            var_3_77 = invokeinterface:File(Path::toFile, invokevirtual:Path(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u759a\u7bad\u59ec\u3d64\u7043\u3bc9, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e), getstatic:\u51b2\ub6ab\u5654\u647c\ub102\u8d90(\u51b2\ub6ab\u5654\u647c\ub102\u8d90::\u16f6\u72f1\u7043\u76bc\u839e\u12b2)))
            
            loop {
                if (cmpne:boolean(and:int(var_1_13A:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0189)
                }
                
                if (cmpeq:boolean(and:int(var_1_13A:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_13A = and:int(var_1_13A:int, ldc:int(261787334))
                }
                else {
                    var_1_13A = and:int(var_1_13A:int, ldc:int(1431997367))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::isFile, var_3_77:File))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0158:
                
                if (cmpne:boolean(and:int(var_1_13A:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_13A = and:int(var_1_13A:int, ldc:int(1137488336))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_13A:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_13A = and:int(var_1_13A:int, ldc:int(-1480866241))
                }
                
                Label_0189:
                
                if (cmpeq:boolean(and:int(var_1_13A:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0158)
                }
                
                if (cmpeq:boolean(and:int(var_1_13A:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_13A = and:int(var_1_13A:int, ldc:int(759148351))
                    var_4_E3 = invokevirtual:String(\uae87\ub19c\u9937\u836c\u34df\ub8be::\uc87f\u4ab3\u9af2\uc238\u7d52\u8709, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e))
                    
                    try {
                        do {
                            if (cmpeq:boolean(and:int(var_1_13A:int, ldc:int(536870912)), ldc:int(0))) {
                                var_1_13A = and:int(var_1_13A:int, ldc:int(-1080082499))
                                invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\uc29a\uc246\u760c\u647c\u92ee\u120d, this:\u88c5\ud171\ub113\u6435\ud51e, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("level://")), invokestatic:String(URLEncoder::encode, var_4_E3:String, invokevirtual:String(Charset::toString, getstatic:Charset(StandardCharsets::UTF_8)))), ldc:String("/resources.zip"))), ldc:String(""))
                            }
                        } while (cmpeq:boolean(and:int(var_1_13A:int, ldc:int(32)), ldc:int(0)))
                        
                        var_1_13A = and:int(var_1_13A:int, ldc:int(247074743))
                    }
                    catch (java.io.UnsupportedEncodingException var_5_133) {
                        var_1_13A = and:int(var_1_13A:int, ldc:int(796598135))
                        invokeinterface:void(Logger::warn, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Something went wrong url encoding {}"), var_4_E3:String[expected:Object])
                    }
                    
                    looporswitchbreak()
                }
                
                var_1_13A = and:int(var_1_13A:int, ldc:int(1616878438))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\uf94d\u51b2\u1833\u34df\u1187 \u3dd3\u5140\u839e\u3c25\u600f\uf995() {
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
            return:\uf94d\u51b2\u1833\u34df\u1187(invokeinterface:\uf94d\u51b2\u1833\u34df\u1187(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u1833\ub102\u72f1\u4ab3\u647c\uff55, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud158\u2dcc\u74b1\ud523\u97b7\u120d() {
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
            return:boolean(invokeinterface:boolean(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u7af6\u946b\uceb8\uc246\u5d20\u6b5f, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public abstract int \u92ff\ua6bd\u120d\uc31c\u6fb0\u156b();
    
    public abstract int \u9255\u7e3f\u67e9\ub70c\uceb8\u92ff();
    
    public abstract boolean \u446c\u960f\u5bc4\u8709\u983f\u5fe1();
    
    public boolean \u98a4\u4f52\u4c04\u8aa5\u47c2\u4ab3(boolean p0, boolean p1, boolean p2) {
        var_4_88 : int
        var_6_6C : int
        var_7_77 : Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>
        var_8_107 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_4_113 : int
        stack_170_0 : \ube23\uc238\u5140\u4cd9\u8aa5 [generated]
        stack_170_1 : \u8389\u8413\u3a62\u8cae\uc31c\u6d69 [generated]
        stack_170_3 : int [generated]
        
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
            var_4_88 = and:int(ldc:int(-1133722973), ldc:int(-1896502002))
            var_6_6C = and:int(ldc:int(5700), ldc:int(-22229))
            var_7_77 = invokeinterface:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>(Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>::iterator, invokevirtual:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u983f\ubefe\ua562\u9a18\uae87\u34df, this:\u88c5\ud171\ub113\u6435\ud51e))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_88:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_88 = and:int(var_4_88:int, ldc:int(-1746500077))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_7_77:Iterator)) {
                        var_8_107 = checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>::next, var_7_77:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))
                        
                        if (logicalnot:boolean(p0:boolean)) {
                            invokeinterface:void(Logger::info, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Saving chunks for level '{}'/{}"), var_8_107:\ube23\uc238\u5140\u4cd9\u8aa5[expected:Object], invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, var_8_107:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])))
                        }
                        
                        var_4_113 = and:int(var_4_88:int, ldc:int(-184970918))
                        stack_170_0 = var_8_107:\ube23\uc238\u5140\u4cd9\u8aa5
                        stack_170_1 = checkcast:\u8389\u8413\u3a62\u8cae\uc31c\u6d69(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u8389\u8413\u3a62\u8cae\uc31c\u6d69.class, aconstnull:\u8389\u8413\u3a62\u8cae\uc31c\u6d69())
                        
                        if (logicaland:boolean(getfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc29a\u61a4\u64f2\u88c5\u516c\u5db4, var_8_107:\ube23\uc238\u5140\u4cd9\u8aa5), logicalnot:boolean(p2:boolean))) {
                            stack_170_3 = and:int[expected:boolean](ldc:int(177), ldc:int(29193))
                        }
                        else {
                            var_4_113 = and:int(var_4_113:int, ldc:int(-588662498))
                            stack_170_3 = and:int[expected:boolean](ldc:int(-5223), ldc:int(5222))
                        }
                        
                        var_4_88 = and:int(var_4_113:int, ldc:int(-140385077))
                        invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u9a18\u7d52\ud171\u4daf\ub6ab\ubf56, stack_170_0:\ube23\uc238\u5140\u4cd9\u8aa5, stack_170_1:\u8389\u8413\u3a62\u8cae\uc31c\u6d69, p1:boolean, stack_170_3:boolean)
                        var_6_6C = xor:int(ldc:int(544), ldc:int(545))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_88:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_88 = and:int(var_4_88:int, ldc:int(-2018054340))
            }
            
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u3e2a\u51fa\uae5d\u4c2b\u62da\u5654, invokeinterface:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u6435\u5db4\uc31c\u7049\ubded\u3bc9, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e)), invokevirtual:\ud523\u0a06\u76bc\u4e72\u59ec\ufe34(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u7ce1\u92ee\uc31c\u8c8a\u8aa5\u156b, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u88c5\ud171\ub113\u6435\ud51e::\u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e))))
            invokeinterface:void(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u52d3\ub6ab\ud36e\u7873\u6c52\u9255, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u600f\u64ab\uc9f6\u2dcc\u62da::\u3a62\ud158\ud7e8\u1833\u8350\u4492, invokevirtual:\u600f\u64ab\uc9f6\u2dcc\u62da(\u88c5\ud171\ub113\u6435\ud51e::\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe, this:\u88c5\ud171\ub113\u6435\ud51e)))
            invokevirtual:void(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u6435\u8bb0\ud217\u47c2\u12cb\ub70c, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e), getfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f](\u88c5\ud171\ub113\u6435\ud51e::\uf995\ub113\u51fa\u9937\u6bb9\uae87, this:\u88c5\ud171\ub113\u6435\ud51e), getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ucb79\u8350\u7bad\u392e\u51fa::\u67d0\uc87f\uc31c\ub83f\u983f\ub1b9, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, this:\u88c5\ud171\ub113\u6435\ud51e)))
            return:boolean(var_6_6C:int)
        }
        
        goto(Label_0006)
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
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8709\u416d\u8c8a\u52d3\u527a, this:\u88c5\ud171\ub113\u6435\ud51e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8d98\u8709\u416d\u8c8a\u52d3\u527a() {
        var_1_61 : int
        var_1_EF8 : int
        var_3_67D : Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>
        var_1_76A : int
        var_4_774 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_5_C50 : IOException
        var_3_F00 : IOException
        
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
            var_1_61 = and:int(ldc:int(-615603651), ldc:int(-506493827))
            
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_1530)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1379)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1470196549))
                    goto(Label_1241)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1644781377))
                    goto(Label_1085)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0961)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1402915673))
                    goto(Label_0812)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-796956779))
                    goto(Label_0683)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0518)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0387)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(109091713))
                }
                else {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-178796809))
                    invokeinterface:void(Logger::info, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Stopping server"))
                }
                
                Label_0240:
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1890686811))
                    goto(Label_1530)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1508597544))
                    goto(Label_1379)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1241)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(2045724977))
                    goto(Label_1085)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0961)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0812)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1775571534))
                    goto(Label_0683)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1799126495))
                    goto(Label_0518)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(1285785368))
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-984705225))
                    
                    if (cmpeq:boolean(invokevirtual:\u9255\u0b8e\ud36e\ucef1\ud523(\u88c5\ud171\ub113\u6435\ud51e::\ucfaf\u71ae\u5d20\uc31c\u9af2\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e), aconstnull:\u9255\u0b8e\ud36e\ucef1\ud523())) {
                        goto(Label_0683)
                    }
                }
                
                Label_0387:
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1530)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(296835064))
                    goto(Label_1379)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(593860029))
                    goto(Label_1241)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_1085)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0961)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1235404699))
                    goto(Label_0812)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0683)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-580413451))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(1292359390))
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-280055491))
                }
                
                Label_0518:
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(764775542))
                    goto(Label_1530)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1802409822))
                    goto(Label_1379)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(637788660))
                    goto(Label_1241)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_1085)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(265777199))
                    goto(Label_0961)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0812)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1512408244))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(431976540))
                        goto(Label_0387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(1333851338))
                        goto(Label_0240)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-826433324))
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-982219659))
                    invokevirtual:void(\u9255\u0b8e\ud36e\ucef1\ud523::\u873d\uc229\u4d85\u97b7\u93a2\u4c04, invokevirtual:\u9255\u0b8e\ud36e\ucef1\ud523(\u88c5\ud171\ub113\u6435\ud51e::\ucfaf\u71ae\u5d20\uc31c\u9af2\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e))
                }
                
                Label_0683:
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1530)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_1379)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1241)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1085)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(262213563))
                    goto(Label_0961)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1294522641))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(726524541))
                        goto(Label_0387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-256249492))
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1017207051))
                    
                    if (cmpeq:boolean(getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e), aconstnull:\ucb79\u8350\u7bad\u392e\u51fa())) {
                        goto(Label_1379)
                    }
                }
                
                Label_0812:
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_1530)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(229131432))
                    goto(Label_1379)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1241)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-368819137))
                    goto(Label_1085)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(558139606))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-1160678701))
                        goto(Label_0518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(1599316026))
                        goto(Label_0387)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(873563427))
                        goto(Label_0240)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-812290823))
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-916063617))
                }
                
                Label_0961:
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-816709775))
                    goto(Label_1530)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_1379)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1710091349))
                    goto(Label_1241)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1585536770))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0518)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0240)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1040261123))
                    invokeinterface:void(Logger::info, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Saving players"))
                }
                
                Label_1085:
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(776954509))
                    goto(Label_1530)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1379)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(122818950))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-1300557107))
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-848403532))
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-93182240))
                        goto(Label_0518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(740320425))
                        goto(Label_0387)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-851873310))
                        goto(Label_0240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-943350859))
                    invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\ua3b4\u836c\u983f\u51b2\u8aa5\u7ce1, getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e))
                }
                
                Label_1241:
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1530)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1071201318))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(1732438784))
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-931716178))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(298635907))
                        goto(Label_0387)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-1254213854))
                        goto(Label_0240)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-914951235))
                    invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u8d98\u156b\ubcb0\u6cfe\u93a2\u71f1, getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e))
                }
                
                Label_1379:
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(2113110206))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-197618828))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(1957172612))
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(2123482041))
                        goto(Label_0518)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0387)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(2000560479))
                        goto(Label_0240)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(827201962))
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-225227))
                    invokeinterface:void(Logger::info, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Saving worlds"))
                }
                
                Label_1530:
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1896146593))
                    goto(Label_1379)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(257459306))
                    goto(Label_1241)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1085)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0961)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-745244560))
                    goto(Label_0812)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0683)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(245061737))
                    goto(Label_0518)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0387)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0240)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_1_EF8 = and:int(var_1_61:int, ldc:int(-615652995))
            var_3_67D = invokeinterface:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>(Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>::iterator, invokevirtual:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u983f\ubefe\ua562\u9a18\uae87\u34df, this:\u88c5\ud171\ub113\u6435\ud51e))
            
            loop {
                Label_1662:
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-725626158))
                    goto(Label_3719)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-776242590))
                    goto(Label_3616)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_3504)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_3392)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-87322549))
                    goto(Label_3287)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-360397312))
                    goto(Label_2631)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_2499)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_2393)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(1)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-345729923))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_67D:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))) {
                        invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u98a4\u4f52\u4c04\u8aa5\u47c2\u4ab3, this:\u88c5\ud171\ub113\u6435\ud51e, and:int[expected:boolean](ldc:int(-13915), ldc:int(13386)), and:int[expected:boolean](ldc:int(3), ldc:int(133)), and:int[expected:boolean](ldc:int(17360), ldc:int(-17363)))
                        goto(Label_2393)
                    }
                }
                
                Label_1785:
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_3719)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(32)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-1830644604))
                    goto(Label_3616)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_3504)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(128)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(893363472))
                    goto(Label_3392)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(256)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-944309773))
                    goto(Label_3287)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_2631)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_2499)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(1569830235))
                    goto(Label_2393)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(4)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_76A = and:int(var_1_EF8:int, ldc:int(-807426627))
                var_4_774 = checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>::next, var_3_67D:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))
                Label_1910:
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_3173)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(64)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-1198582233))
                    goto(Label_3057)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-664752770))
                    goto(Label_2955)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_2849)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-784191390))
                    goto(Label_2738)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_2263)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(256)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-838954532))
                    goto(Label_2127)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(64)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-1929997724))
                }
                else {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-873159811))
                    
                    if (cmpeq:boolean(var_4_774:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5())) {
                        goto(Label_2263)
                    }
                }
                
                Label_2030:
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_3173)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_3057)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-555759816))
                    goto(Label_2955)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-1538643265))
                    goto(Label_2849)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-1858984697))
                    goto(Label_2738)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_2263)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1910)
                    }
                    
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-411703363))
                }
                
                Label_2127:
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(614343766))
                    goto(Label_3173)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_3057)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-1365690022))
                    goto(Label_2955)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(128)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(63906805))
                    goto(Label_2849)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(64)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(1555155813))
                    goto(Label_2738)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_76A = and:int(var_1_76A:int, ldc:int(686543354))
                        goto(Label_2030)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(64)), ldc:int(0))) {
                        var_1_76A = and:int(var_1_76A:int, ldc:int(-1319237799))
                        goto(Label_1910)
                    }
                    
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-612512841))
                    putfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc29a\u61a4\u64f2\u88c5\u516c\u5db4, var_4_774:\ube23\uc238\u5140\u4cd9\u8aa5, and:int[expected:boolean](ldc:int(-3745), ldc:int(3744)))
                }
                
                Label_2263:
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_3173)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_3057)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_2955)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_2849)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_2738)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-407329951))
                    goto(Label_2127)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(16)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-1199627750))
                    goto(Label_2030)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(371628877))
                    goto(Label_1910)
                }
                
                var_1_EF8 = and:int(var_1_76A:int, ldc:int(-570502281))
                loopcontinue()
                Label_2393:
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_3719)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_3616)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_3504)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(331104757))
                    goto(Label_3392)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_3287)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2631)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(1784717025))
                        goto(Label_1785)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-436273803))
                    var_3_67D = invokeinterface:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>(Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>::iterator, invokevirtual:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u983f\ubefe\ua562\u9a18\uae87\u34df, this:\u88c5\ud171\ub113\u6435\ud51e))
                }
                
                Label_2499:
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_3719)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-1956771487))
                    goto(Label_3616)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(1529735991))
                    goto(Label_3504)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(128)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-1735092373))
                    goto(Label_3392)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(1905775096))
                    goto(Label_3287)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_2393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(4)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(510384017))
                        goto(Label_1785)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-34748801))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator<E>::hasNext, var_3_67D:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))) {
                        if (invokevirtual:boolean(\u9255\u7e3f\u5d20\u8389\u4daf::\u983f\u4d85\u527a\u3711\u183a\u8bb0, getfield:\u9255\u7e3f\u5d20\u8389\u4daf(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\u4c04\ucef1\u4d85\u7af6\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e))) {
                            goto(Label_3287)
                        }
                        
                        goto(Label_3504)
                    }
                }
                
                Label_2631:
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(861074184))
                    goto(Label_3719)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_3616)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_3504)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(1923224901))
                    goto(Label_3392)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_3287)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_2499)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_2393)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_1785)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(64)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_76A = and:int(var_1_EF8:int, ldc:int(-213548171))
                var_4_774 = checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>::next, var_3_67D:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))
                Label_2738:
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_3173)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_3057)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(64)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(1078259006))
                    goto(Label_2955)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-1107166971))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(128)), ldc:int(0))) {
                        var_1_76A = and:int(var_1_76A:int, ldc:int(-1542182490))
                        goto(Label_2263)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_2127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_76A = and:int(var_1_76A:int, ldc:int(71933799))
                        goto(Label_2030)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1910)
                    }
                    
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-907027587))
                    
                    if (cmpeq:boolean(var_4_774:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5())) {
                        goto(Label_3173)
                    }
                }
                
                Label_2849:
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-1458999076))
                    goto(Label_3173)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_3057)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(804465322))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(64)), ldc:int(0))) {
                        var_1_76A = and:int(var_1_76A:int, ldc:int(436035722))
                        goto(Label_2738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4)), ldc:int(0))) {
                        var_1_76A = and:int(var_1_76A:int, ldc:int(-782578479))
                        goto(Label_2263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_2127)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_2030)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1910)
                    }
                    
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-780735499))
                }
                
                try {
                    Label_2955:
                    
                    while (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(256)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_2849)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(32)), ldc:int(0))) {
                                goto(Block_246)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_2263)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_2127)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Block_249)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Block_250)
                            }
                            
                            var_1_76A = and:int(var_1_76A:int, ldc:int(-605174659))
                            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::close, var_4_774:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
                        }
                        
                        Label_3057:
                        
                        if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2048)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Block_252)
                        }
                    }
                    
                    goto(Label_3173)
                    Block_246:
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-197015077))
                    goto(Label_2738)
                    Block_249:
                    var_1_76A = and:int(var_1_76A:int, ldc:int(1409473445))
                    goto(Label_2030)
                    Block_250:
                    var_1_76A = and:int(var_1_76A:int, ldc:int(1608009175))
                    goto(Label_1910)
                    Block_252:
                    
                    if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_2849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_2738)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(256)), ldc:int(0))) {
                        var_1_76A = and:int(var_1_76A:int, ldc:int(-656369045))
                        goto(Label_2263)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_2127)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_2030)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_76A = and:int(var_1_76A:int, ldc:int(-1759395537))
                        goto(Label_1910)
                    }
                    
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-917185537))
                }
                catch (java.io.IOException var_5_C50) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(-982088897))
                    invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Exception closing the level"), var_5_C50:IOException[expected:Throwable])
                }
                
                Label_3173:
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_3057)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_2955)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(1220348466))
                    goto(Label_2849)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(1974655130))
                    goto(Label_2738)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_2263)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_2127)
                }
                
                if (cmpeq:boolean(and:int(var_1_76A:int, ldc:int(1)), ldc:int(0))) {
                    var_1_76A = and:int(var_1_76A:int, ldc:int(1877282053))
                    goto(Label_2030)
                }
                
                if (cmpne:boolean(and:int(var_1_76A:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_76A:int, ldc:int(-515458881))
                    goto(Label_2499)
                }
                
                goto(Label_1910)
                Label_3287:
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(2018069394))
                    goto(Label_3719)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_3616)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_3504)
                }
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(1336724269))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_2631)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_2499)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_2393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1785)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(32)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-866290982))
                        loopcontinue()
                    }
                    
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-77072451))
                }
                
                Label_3392:
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(32)), ldc:int(0))) {
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(104987439))
                    goto(Label_3719)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_3616)
                }
                
                if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_3287)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-2008782001))
                        goto(Label_2631)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_2499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_2393)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(969051814))
                        goto(Label_1785)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-345057987))
                    invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\ub102\ud217\u6435\u494c\u9937\ub83f, getfield:\u9255\u7e3f\u5d20\u8389\u4daf(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\u4c04\ucef1\u4d85\u7af6\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e))
                }
                
                Label_3504:
                
                if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_3616)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-929574027))
                        goto(Label_3392)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_3287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_2631)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(1496617171))
                        goto(Label_2499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-218431217))
                        goto(Label_2393)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1785)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-540623883))
                    invokevirtual:void(\u7bad\u76bc\uae5d\u12cb\u16f6::close, getfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e))
                }
                
                try {
                    Label_3719:
                    
                    do {
                        Label_3616:
                        
                        if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(128)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_3504)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_3392)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(64)), ldc:int(0))) {
                                goto(Label_3287)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2048)), ldc:int(0))) {
                                var_1_EF8 = and:int(var_1_EF8:int, ldc:int(1010464743))
                                goto(Label_2631)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(128)), ldc:int(0))) {
                                goto(Label_2499)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_2393)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2097152)), ldc:int(0))) {
                                var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-579694040))
                                goto(Label_1785)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(32768)), ldc:int(0))) {
                                loopcontinue(Label_1662)
                            }
                            
                            var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-915014859))
                            invokevirtual:void(\uae87\ub19c\u9937\u836c\u34df\ub8be::close, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e))
                        }
                    } while (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(4194304)), ldc:int(0)))
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(1)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-1177105908))
                        goto(Label_3504)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_3392)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-926579462))
                        goto(Label_3287)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_2631)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_2499)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_EF8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_2393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(691954382))
                        goto(Label_1785)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_EF8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_EF8 = and:int(var_1_EF8:int, ldc:int(1471240746))
                        loopcontinue()
                    }
                    
                    var_1_EF8 = and:int(var_1_EF8:int, ldc:int(-673801481))
                }
                catch (java.io.IOException var_3_F00) {
                    invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Failed to unlock level {}"), invokevirtual:String[expected:Object](\uae87\ub19c\u9937\u836c\u34df\ub8be::\uc87f\u4ab3\u9af2\uc238\u7d52\u8709, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e)), var_3_F00:IOException[expected:Object])
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u71f1\u62da\u183a\u71ae\u6bb9\u8d90() {
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
            return:String(getfield:String(\u88c5\ud171\ub113\u6435\ud51e::\u4492\u4ab3\u97e6\u71ae\ucfaf\u7873, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u67e9\u839e\uc238\u8413\u59ec\u9937(java.lang.String p0) {
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
            putfield:String(\u88c5\ud171\ub113\u6435\ud51e::\u4492\u4ab3\u97e6\u71ae\ucfaf\u7873, this:\u88c5\ud171\ub113\u6435\ud51e, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5245\u8389\uceb8\u51b2\u3d64\u4c04() {
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
            return:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\u5fe1\u7c6b\u92ee\u7d52\u6c56(boolean p0) {
        var_2_183 : int
        var_4_17C : InterruptedException
        
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
            var_2_183 = and:int(ldc:int(1765425814), ldc:int(-616990984))
            
            loop {
                Label_0098:
                
                if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0335)
                }
                
                if (cmpne:boolean(and:int(var_2_183:int, ldc:int(1)), ldc:int(0))) {
                    var_2_183 = and:int(var_2_183:int, ldc:int(-794160669))
                    goto(Label_0272)
                }
                
                if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_183 = and:int(var_2_183:int, ldc:int(2147244985))
                    putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, this:\u88c5\ud171\ub113\u6435\ud51e, and:int[expected:boolean](ldc:int(2328), ldc:int(-2329)))
                }
                
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_183 = and:int(var_2_183:int, ldc:int(-680028785))
                    goto(Label_0335)
                }
                
                if (cmpne:boolean(and:int(var_2_183:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_183 = and:int(var_2_183:int, ldc:int(1069511363))
                    goto(Label_0272)
                }
                
                if (cmpne:boolean(and:int(var_2_183:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_183 = and:int(var_2_183:int, ldc:int(-583311467))
                    
                    if (logicalnot:boolean(p0:boolean)) {
                        looporswitchbreak()
                    }
                }
                
                Label_0216:
                
                if (cmpne:boolean(and:int(var_2_183:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_183 = and:int(var_2_183:int, ldc:int(973417967))
                        goto(Label_0156)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_183:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_183 = and:int(var_2_183:int, ldc:int(-1379492452))
                        loopcontinue()
                    }
                    
                    var_2_183 = and:int(var_2_183:int, ldc:int(-574925829))
                }
                
                try {
                    Label_0335:
                    
                    do {
                        Label_0272:
                        
                        if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(-860842451))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_0216)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_0156)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_2_183 = and:int(var_2_183:int, ldc:int(342413106))
                                loopcontinue(Label_0098)
                            }
                            
                            var_2_183 = and:int(var_2_183:int, ldc:int(-369198383))
                            invokevirtual:void(Thread::join, getfield:Thread(\u88c5\ud171\ub113\u6435\ud51e::\u3e75\u62da\ub171\ub83f\u416d\u71ae, this:\u88c5\ud171\ub113\u6435\ud51e))
                        }
                    } while (cmpeq:boolean(and:int(var_2_183:int, ldc:int(512)), ldc:int(0)))
                    
                    if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0156)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_183:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_183 = and:int(var_2_183:int, ldc:int(2046785208))
                }
                catch (java.lang.InterruptedException var_4_17C) {
                    var_2_183 = and:int(var_2_183:int, ldc:int(2143083231))
                    invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Error while shutting down"), var_4_17C:InterruptedException[expected:Throwable])
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u74b1\ub171\u59ec\u5140\uc29a\u446c() {
        var_1_1E29 : int
        var_3_657 : long
        var_5_787 : long
        var_7_8A2 : \u5db4\u8640\u6cfe\u9a18\ubff1
        var_8 : \uceb8\u8258\uf9c5\uc229\u7330\ucfaf
        var_10_1654 : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_7_16B7 : File
        var_13_1DBA : Throwable
        var_12_1CF9 : Throwable
        
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
            var_1_1E29 = and:int(ldc:int(999394376), ldc:int(-1126985954))
            
            try {
                loop {
                    try {
                        loop {
                            Label_0098:
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-63030733))
                                goto(Label_4832)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_4681)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-81076751))
                                goto(Label_4494)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(134758448))
                                goto(Label_4336)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-509397794))
                                goto(Label_1459)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_1312)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1023855734))
                                goto(Label_1158)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-146408997))
                                goto(Label_0994)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2114630751))
                                goto(Label_0808)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_0634)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-982406372))
                                goto(Label_0462)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1057976753))
                            }
                            else {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(263790404))
                                
                                if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\ud12e\u8350\u51fa\u7049\u51fa\ua068, this:\u88c5\ud171\ub113\u6435\ud51e))) {
                                    goto(Label_4328)
                                }
                            }
                            
                            Label_0288:
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1986806957))
                                goto(Label_4832)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-639479048))
                                goto(Label_4681)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_4494)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1870827935))
                                goto(Label_4336)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_1459)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(671344225))
                                goto(Label_1312)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_1158)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-628439119))
                                goto(Label_0994)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(869027827))
                                goto(Label_0808)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_0634)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1797016859))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(2119638733))
                                    loopcontinue()
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1484471310))
                            }
                            
                            Label_0462:
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(31395979))
                                goto(Label_4832)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-596172512))
                                goto(Label_4681)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_4494)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_4336)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_1459)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1699598024))
                                goto(Label_1312)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1591564512))
                                goto(Label_1158)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-900750894))
                                goto(Label_0994)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_0808)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(308996597))
                                    goto(Label_0288)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1499756999))
                                    loopcontinue()
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(274033883))
                                putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e, invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52))
                            }
                            
                            Label_0634:
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_4832)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_4681)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_4494)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(446203405))
                                goto(Label_4336)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_1459)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(992573511))
                                goto(Label_1312)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(2062725288))
                                goto(Label_1158)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1836908490))
                                goto(Label_0994)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_0462)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-36207077))
                                    goto(Label_0288)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-150682549))
                                    loopcontinue()
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1570598378))
                                invokevirtual:void(\uc84e\ub32d\u3dd3\u2dcc\u34df::\u3c25\ua61f\u51b2\u6ec6\ubded\ubefe, getfield:\uc84e\ub32d\u3dd3\u2dcc\u34df(\u88c5\ud171\ub113\u6435\ud51e::\uc229\u8bb0\uc31c\u624e\u62da\u446c, this:\u88c5\ud171\ub113\u6435\ud51e), initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, getfield:String(\u88c5\ud171\ub113\u6435\ud51e::\u64ab\u7d52\u3dd3\u0b8e\uafe7\u5654, this:\u88c5\ud171\ub113\u6435\ud51e)))
                            }
                            
                            Label_0808:
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(554179148))
                                goto(Label_4832)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_4681)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-441304495))
                                goto(Label_4494)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_4336)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_1459)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_1312)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1202790210))
                                goto(Label_1158)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2063487548))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_0634)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_0462)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1426713346))
                                    goto(Label_0288)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1433896594))
                                    loopcontinue()
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-864613208))
                                invokevirtual:void(\uc84e\ub32d\u3dd3\u2dcc\u34df::\ub32d\u120d\u71ae\ubff1\u16f6\uc2e8, getfield:\uc84e\ub32d\u3dd3\u2dcc\u34df(\u88c5\ud171\ub113\u6435\ud51e::\uc229\u8bb0\uc31c\u624e\u62da\u446c, this:\u88c5\ud171\ub113\u6435\ud51e), initobject:\u4daf\ub70c\ubded\ub19c\u0b8e(\u4daf\ub70c\ubded\ub19c\u0b8e::<init>, invokeinterface:String(GameVersion::getName, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a)), invokeinterface:int(GameVersion::getProtocolVersion, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a))))
                            }
                            
                            Label_0994:
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_4832)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                goto(Label_4681)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_4494)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1749635379))
                                goto(Label_4336)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_1459)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_1312)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(926377532))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(884958502))
                                    goto(Label_0808)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-486839923))
                                    goto(Label_0634)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    goto(Label_0462)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1042073622))
                                    goto(Label_0288)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-717876846))
                                    loopcontinue()
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(716402506))
                                invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u4ab3\u183a\u8258\u4cd9\ud158\u0b8e, this:\u88c5\ud171\ub113\u6435\ud51e, getfield:\uc84e\ub32d\u3dd3\u2dcc\u34df(\u88c5\ud171\ub113\u6435\ud51e::\uc229\u8bb0\uc31c\u624e\u62da\u446c, this:\u88c5\ud171\ub113\u6435\ud51e))
                            }
                            
                            Label_1158:
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1594477407))
                                goto(Label_4832)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(360616268))
                                goto(Label_4681)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1602382171))
                                goto(Label_4494)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_4336)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_1459)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    goto(Label_0994)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    goto(Label_0808)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1764438))
                                    goto(Label_0634)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(83993770))
                                    goto(Label_0462)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_0288)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-853577940))
                                
                                if (logicalnot:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, this:\u88c5\ud171\ub113\u6435\ud51e))) {
                                    goto(Label_4336)
                                }
                            }
                            
                            Label_1312:
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1626101148))
                                goto(Label_4832)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_4681)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_4494)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_4336)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_1158)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_0994)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1747083875))
                                    goto(Label_0808)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_0634)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1098611295))
                                    goto(Label_0462)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1264512001))
                                    goto(Label_0288)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1824027754))
                                    loopcontinue()
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1451942544))
                            }
                            
                            Label_1459:
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_4832)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-894108819))
                                goto(Label_4681)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_4494)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_4336)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_1312)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_1158)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2066692297))
                                goto(Label_0994)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1041926579))
                                goto(Label_0808)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_0634)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1592043281))
                                goto(Label_0462)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(768111276))
                                goto(Label_0288)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-481077384))
                                loopcontinue()
                            }
                            
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(402648644))
                            var_3_657 = sub:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-946033037))
                                    goto(Label_2150)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1934825369))
                                    goto(Label_2065)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_1867)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1794)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(2016877981))
                                    
                                    if (cmple:boolean(var_3_657:long, ldc:long(2000L))) {
                                        goto(Label_2065)
                                    }
                                }
                                
                                Label_1696:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1707931396))
                                    goto(Label_2150)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1731372169))
                                    goto(Label_2065)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_1867)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-964740481))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1641088533))
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1956588824))
                                    
                                    if (cmplt:boolean(sub:long(getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e), getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u5d20\u3d64\uc31c\ub18d\ua61f\u4ab3, this:\u88c5\ud171\ub113\u6435\ud51e)), ldc:long(15000L))) {
                                        goto(Label_2065)
                                    }
                                }
                                
                                Label_1794:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_2150)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_2065)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-386866144))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1529544013))
                                        goto(Label_1696)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-343045214))
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1101406763))
                                }
                                
                                Label_1867:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2093665934))
                                    goto(Label_2150)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        goto(Label_1794)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                        goto(Label_1696)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1748184417))
                                    var_5_787 = div:long(var_3_657:long, ldc:long(50L))
                                    
                                    loop {
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2104950105))
                                            goto(Label_2026)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2106332074))
                                            invokeinterface:void(Logger::warn, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind"), invokestatic:Long[expected:Object](Long::valueOf, var_3_657:long), invokestatic:Long(Long::valueOf, var_5_787:long))
                                        }
                                        
                                        Label_1980:
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1273139722))
                                        }
                                        else {
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                                loopcontinue()
                                            }
                                            
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1466364739))
                                            putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e, add:long(getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e), mul:long(var_5_787:long, ldc:long(50L))))
                                        }
                                        
                                        Label_2026:
                                        
                                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                            goto(Label_1980)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                        
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1430707812))
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-883482689))
                                    putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u5d20\u3d64\uc31c\ub18d\ua61f\u4ab3, this:\u88c5\ud171\ub113\u6435\ud51e, getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e))
                                }
                                
                                Label_2065:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1734340636))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_1867)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                        goto(Label_1794)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-375602839))
                                        goto(Label_1696)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(976505522))
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1766199759))
                                    putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e, add:long(getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:long(50L)))
                                }
                                
                                Label_2150:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_2065)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_1867)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_1794)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-755783320))
                                    goto(Label_1696)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1200697250))
                            var_7_8A2 = invokestatic:\u5db4\u8640\u6cfe\u9a18\ubff1(\u5db4\u8640\u6cfe\u9a18\ubff1::\u6b5f\ud12e\u3e2a\u0800\u494c\u3a62, ldc:String("Server"))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_4165)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-251173043))
                                    goto(Label_3998)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1864629339))
                                    goto(Label_3854)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    goto(Label_3725)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    goto(Label_3551)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(914756554))
                                    goto(Label_3418)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(965882971))
                                    goto(Label_3226)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1980688790))
                                    goto(Label_3050)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1536410867))
                                    goto(Label_2891)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    goto(Label_2734)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1109973787))
                                    goto(Label_2575)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(392153125))
                                }
                                else {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(928636631))
                                    invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u156b\uc31c\ubf56\u3dd3\u47c2\ucef1, this:\u88c5\ud171\ub113\u6435\ud51e, var_7_8A2:\u5db4\u8640\u6cfe\u9a18\ubff1)
                                }
                                
                                Label_2392:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_4165)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_3998)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1159781397))
                                    goto(Label_3854)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-289271948))
                                    goto(Label_3725)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(670257444))
                                    goto(Label_3551)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-764022673))
                                    goto(Label_3418)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1073295049))
                                    goto(Label_3226)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-488975168))
                                    goto(Label_3050)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_2891)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_2734)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1878248861))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(203394152))
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1603742847))
                                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\ucef1\u8258\u446c\u760c\u1833\u36d3, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e))
                                }
                                
                                Label_2575:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    goto(Label_4165)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1633673488))
                                    goto(Label_3998)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(512272637))
                                    goto(Label_3854)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    goto(Label_3725)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_3551)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-937265494))
                                    goto(Label_3418)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_3226)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_3050)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-726231604))
                                    goto(Label_2891)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-343784174))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                        goto(Label_2392)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1541140051))
                                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:String("tick"))
                                }
                                
                                Label_2734:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_4165)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    goto(Label_3998)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(560493268))
                                    goto(Label_3854)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_3725)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_3551)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2071154197))
                                    goto(Label_3418)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-960768270))
                                    goto(Label_3226)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1785015983))
                                    goto(Label_3050)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                        goto(Label_2575)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                        goto(Label_2392)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(85422632))
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-434905490))
                                    invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\u3a62\u8350\u946b\u4179\u93a2, this:\u88c5\ud171\ub113\u6435\ud51e, invokedynamic:BooleanSupplier(getAsBoolean:(L\u51fa\u12cb\u7330\u74b1\u6c52/\u76bc\u4975\ua6bd\u4daf\u8d98/\u88c5\ud171\ub113\u6435\ud51e;)Ljava/util/function/BooleanSupplier;, this:\u88c5\ud171\ub113\u6435\ud51e))
                                }
                                
                                Label_2891:
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_4165)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-682936623))
                                    goto(Label_3998)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1176095711))
                                    goto(Label_3854)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_3725)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-921992295))
                                    goto(Label_3551)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1825711783))
                                    goto(Label_3418)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    goto(Label_3226)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                        goto(Label_2734)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        goto(Label_2575)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1062083807))
                                        goto(Label_2392)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1778204373))
                                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u3d4b\u64f2\u7d52\u3d4b\ua3b4\u385b, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:String("nextTickWait"))
                                }
                                
                                Label_3050:
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1015518086))
                                    goto(Label_4165)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    goto(Label_3998)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(689249))
                                    goto(Label_3854)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1397167090))
                                    goto(Label_3725)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(29429519))
                                    goto(Label_3551)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_3418)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-954591789))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                        goto(Label_2891)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                        goto(Label_2734)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                        goto(Label_2575)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(274230215))
                                        goto(Label_2392)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1892929960))
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(74837933))
                                    putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u6cfe\u983f\u3504\u3bc9\u67e9\u5f50, this:\u88c5\ud171\ub113\u6435\ud51e, and:int[expected:boolean](ldc:int(6459), ldc:int(8197)))
                                }
                                
                                Label_3226:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(15020956))
                                    goto(Label_4165)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_3998)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1973278712))
                                    goto(Label_3854)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    goto(Label_3725)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1677909367))
                                    goto(Label_3551)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(458817554))
                                        goto(Label_3050)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-700295242))
                                        goto(Label_2891)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-668790266))
                                        goto(Label_2734)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1512730132))
                                        goto(Label_2575)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1277790197))
                                        goto(Label_2392)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1351822663))
                                    putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\ubded\ub6ab\u760c\ubcb0\uc238\u183a, this:\u88c5\ud171\ub113\u6435\ud51e, invokestatic:long(Math::max, add:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), ldc:long(50L)), getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e)))
                                }
                                
                                Label_3418:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    goto(Label_4165)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_3998)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_3854)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2023676730))
                                    goto(Label_3725)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                        goto(Label_3226)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_3050)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(2127330138))
                                        goto(Label_2891)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1087703880))
                                        goto(Label_2734)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                        goto(Label_2575)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_2392)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(733064800))
                                    invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\ubefe\u600f\u56bd\u8d90\u7330\uc246, this:\u88c5\ud171\ub113\u6435\ud51e)
                                }
                                
                                Label_3551:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1638350498))
                                    goto(Label_4165)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-495732417))
                                    goto(Label_3998)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_3854)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(71872645))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1482122956))
                                        goto(Label_3418)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_3226)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                        goto(Label_3050)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(749938861))
                                        goto(Label_2891)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_2734)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_2575)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(2063040450))
                                        goto(Label_2392)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1012702900))
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-553967812))
                                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e))
                                }
                                
                                Label_3725:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    goto(Label_4165)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    goto(Label_3998)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(623234882))
                                        goto(Label_3551)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                        goto(Label_3418)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_3226)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_3050)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                        goto(Label_2891)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1942205512))
                                        goto(Label_2734)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                        goto(Label_2575)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                        goto(Label_2392)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1859505724))
                                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u8aa5\ufcaf\u64f2\ua562\ubefe\u69d9, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e))
                                }
                                
                                Label_3854:
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(437168038))
                                    goto(Label_4165)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                        goto(Label_3725)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                        goto(Label_3551)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_3418)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                        goto(Label_3226)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                        goto(Label_3050)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1645598756))
                                        goto(Label_2891)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1841011793))
                                        goto(Label_2734)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                        goto(Label_2575)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(2059332012))
                                        goto(Label_2392)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1785369405))
                                    invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u6bb9\u946b\u120d\u6435\ub102\u983f, this:\u88c5\ud171\ub113\u6435\ud51e, var_7_8A2:\u5db4\u8640\u6cfe\u9a18\ubff1)
                                }
                                
                                Label_3998:
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                        goto(Label_3854)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(141114333))
                                        goto(Label_3725)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                        goto(Label_3551)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                        goto(Label_3418)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(705214163))
                                        goto(Label_3226)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(158290636))
                                        goto(Label_3050)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1954625167))
                                        goto(Label_2891)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(869891941))
                                        goto(Label_2734)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-465550612))
                                        goto(Label_2575)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_2392)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1771687233))
                                    putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u47c2\u9af2\u67d0\uae5d\u92ee\u392e, this:\u88c5\ud171\ub113\u6435\ud51e, xor:int[expected:boolean](ldc:int(1314), ldc:int(1315)))
                                }
                                
                                Label_4165:
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_3998)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_3854)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(347927553))
                                    goto(Label_3725)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-833568909))
                                    goto(Label_3551)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(892454494))
                                    goto(Label_3418)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1106703640))
                                    goto(Label_3226)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_3050)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1618489150))
                                    goto(Label_2891)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    goto(Label_2734)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-342078956))
                                    goto(Label_2575)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_2392)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1114505677))
                            goto(Label_1158)
                            Label_4328:
                            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u69d9\u7006\u0c95\u8bb0\u12b2\u71ae, this:\u88c5\ud171\ub113\u6435\ud51e, checkcast:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e.class, aconstnull:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e()))
                            
                            try {
                                try {
                                    loop {
                                        Label_4336:
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2077568089))
                                            goto(Label_4832)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1313874726))
                                            goto(Label_4681)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-651236586))
                                        }
                                        else {
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                                goto(Label_1459)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                                goto(Label_1312)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                                goto(Label_1158)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1815692025))
                                                goto(Label_0994)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                                goto(Label_0808)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                                goto(Label_0634)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                                goto(Label_0462)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(2122498501))
                                                goto(Label_0288)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                                loopcontinue(Label_0098)
                                            }
                                            
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1560821975))
                                            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u40a9\u7873\u67e9\u16f6\u071d\u3e2a, this:\u88c5\ud171\ub113\u6435\ud51e, xor:int[expected:boolean](ldc:int(-24316), ldc:int(-24315)))
                                        }
                                        
                                        Label_4494:
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(159803043))
                                            goto(Label_4832)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(642915240))
                                        }
                                        else {
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1697921725))
                                                loopcontinue()
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                                goto(Label_1459)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                                goto(Label_1312)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1765098522))
                                                goto(Label_1158)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2055562174))
                                                goto(Label_0994)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                                goto(Label_0808)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(373476540))
                                                goto(Label_0634)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-621571888))
                                                goto(Label_0462)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(471432953))
                                                goto(Label_0288)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(814960396))
                                                loopcontinue(Label_0098)
                                            }
                                            
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1180507488))
                                            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8709\u416d\u8c8a\u52d3\u527a, this:\u88c5\ud171\ub113\u6435\ud51e)
                                        }
                                        
                                        Label_4681:
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(262541302))
                                                goto(Label_4494)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(548441428))
                                                loopcontinue()
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-489911730))
                                                goto(Label_1459)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                                goto(Label_1312)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                                goto(Label_1158)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-13820257))
                                                goto(Label_0994)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                                goto(Label_0808)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1964855447))
                                                goto(Label_0634)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                                goto(Label_0462)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                                goto(Label_0288)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                                loopcontinue(Label_0098)
                                            }
                                            
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1356304281))
                                            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u4c04\u4179\uae87\ub113\uc2bd\ubb2b, this:\u88c5\ud171\ub113\u6435\ud51e)
                                        }
                                        
                                        Label_4832:
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-840719707))
                                            goto(Label_4681)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                            goto(Label_4494)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-395164217))
                                        }
                                        else {
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                                goto(Label_1459)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2055462365))
                                                goto(Label_1312)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                                goto(Label_1158)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                                goto(Label_0994)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2103008776))
                                                goto(Label_0808)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-906362808))
                                                goto(Label_0634)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1900459694))
                                                goto(Label_0462)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                                goto(Label_0288)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(538104214))
                                                loopcontinue(Label_0098)
                                            }
                                            
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(227786462))
                                            looporswitchbreak(Label_5341)
                                        }
                                    }
                                }
                                catch (java.lang.Throwable stack_138C_0) {
                                }
                                
                                Label_5006:
                                
                                while (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                        goto(Label_5524)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_5435)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_5350)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-320963709))
                                        goto(Label_5194)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1519278103))
                                    }
                                    else {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(943398804))
                                        invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Exception stopping the server"), var_8:Throwable)
                                    }
                                    
                                    Label_5100:
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-372223360))
                                        goto(Label_5605)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                        goto(Label_5524)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                        goto(Label_5435)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(203016544))
                                        goto(Label_5350)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-332469489))
                                    }
                                    else {
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(627887310))
                                            loopcontinue()
                                        }
                                        
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(498715767))
                                        invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u4c04\u4179\uae87\ub113\uc2bd\ubb2b, this:\u88c5\ud171\ub113\u6435\ud51e)
                                    }
                                    
                                    Label_5194:
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1158486842))
                                        goto(Label_5605)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-585101500))
                                        goto(Label_5524)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                        goto(Label_5435)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                        goto(Label_5350)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-470246707))
                                        goto(Label_5100)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1016815055))
                                        looporswitchbreak(Label_5341)
                                    }
                                    
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-222372376))
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(543560846))
                                goto(Label_5605)
                            }
                            finally {
                                do {
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1127261600))
                                    }
                                    else {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1732640963))
                                        invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u4c04\u4179\uae87\ub113\uc2bd\ubb2b, this:\u88c5\ud171\ub113\u6435\ud51e)
                                    }
                                } while (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0)))
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1065930902))
                            }
                            
                            looporswitchbreak()
                        }
                        
                        Label_5341:
                        return:void()
                    }
                    catch (java.lang.Throwable stack_14E4_0) {
                    }
                    
                    Label_5350:
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1513174906))
                        goto(Label_5605)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-792796478))
                        goto(Label_5524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_5194)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_5100)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_5006)
                        }
                        
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-896459165))
                        invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Encountered an unexpected exception"), var_8:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf[expected:Throwable])
                    }
                    
                    Label_5435:
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_5605)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1245997019))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_5350)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_5194)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(954784486))
                            goto(Label_5100)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-481026842))
                            goto(Label_5006)
                        }
                        
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-631402654))
                        
                        if (logicalnot:boolean(instanceof:boolean(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uceb8\u8258\uf9c5\uc229\u7330\ucfaf.class, var_8:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf))) {
                            var_10_1654 = invokevirtual:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u88c5\ud171\ub113\u6435\ud51e::\u3dd3\u76bc\u4f4a\u494c\ubded\u600f, this:\u88c5\ud171\ub113\u6435\ud51e, initobject:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::<init>, ldc:String("Exception in server tick loop"), var_8:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf[expected:Throwable]))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_5524:
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-252494227))
                            goto(Label_5435)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_5350)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_5194)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(805121741))
                            goto(Label_5100)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1116022434))
                            goto(Label_5006)
                        }
                        
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-218919374))
                    }
                    
                    Label_5605:
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_5524)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-182459440))
                        goto(Label_5435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(963508860))
                        goto(Label_5350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-198264357))
                        goto(Label_5194)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(2004476607))
                        goto(Label_5100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1189043717))
                        goto(Label_5006)
                    }
                    
                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1028263963))
                    var_10_1654 = invokevirtual:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u88c5\ud171\ub113\u6435\ud51e::\u3dd3\u76bc\u4f4a\u494c\ubded\u600f, this:\u88c5\ud171\ub113\u6435\ud51e, invokevirtual:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\uceb8\u8258\uf9c5\uc229\u7330\ucfaf::\u4c04\u3711\ub113\u718f\u9af2\u4d85, checkcast:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uceb8\u8258\uf9c5\uc229\u7330\ucfaf.class, var_8:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf)))
                    looporswitchbreak()
                }
                
                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1796956060))
                var_7_16B7 = initobject:File(File::<init>, initobject:File(File::<init>, invokevirtual:File(\u88c5\ud171\ub113\u6435\ud51e::\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:String("crash-reports")), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("crash-")), invokevirtual:String(DateFormat::format, initobject:SimpleDateFormat[expected:DateFormat](SimpleDateFormat::<init>, ldc:String("yyyy-MM-dd_HH.mm.ss")), initobject:Date(Date::<init>))), ldc:String("-server.txt"))))
                
                loop {
                    Label_5817:
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_7240)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1306485557))
                        goto(Label_7087)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_6925)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-399654696))
                        goto(Label_6776)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_6614)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_6515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_6373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1299482131))
                        goto(Label_6254)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_6089)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(468147820))
                    }
                    else {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1786350738))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\uc2bd\ud36e\ud171\u3776\u8308\u624e, var_10_1654:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e, var_7_16B7:File))) {
                            invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("We were unable to save this crash report to disk."))
                            goto(Label_6254)
                        }
                    }
                    
                    Label_5949:
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2070889793))
                        goto(Label_7240)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(811827282))
                        goto(Label_7087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(854745293))
                        goto(Label_6925)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_6776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_6614)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1613135737))
                        goto(Label_6515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1665467132))
                        goto(Label_6373)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_6254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1709543636))
                            loopcontinue()
                        }
                        
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1739219905))
                    }
                    
                    Label_6089:
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_7240)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1455951942))
                        goto(Label_7087)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_6925)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_6776)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_6614)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1197573403))
                        goto(Label_6515)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(574531198))
                        goto(Label_6373)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(949189625))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1440012463))
                            goto(Label_5949)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-989880357))
                        invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("This crash report has been saved to: {}"), invokevirtual:String(File::getAbsolutePath, var_7_16B7:File))
                    }
                    
                    Label_6254:
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_7240)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_7087)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_6925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(301628197))
                        goto(Label_6776)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1467663588))
                        goto(Label_6614)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_6515)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_6373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_6089)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_5949)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1690480725))
                        loopcontinue()
                    }
                    
                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-90866118))
                    invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u69d9\u7006\u0c95\u8bb0\u12b2\u71ae, this:\u88c5\ud171\ub113\u6435\ud51e, var_10_1654:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
                    
                    try {
                        loop {
                            try {
                                Label_6373:
                                
                                while (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2102829353))
                                        goto(Label_7087)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                        goto(Label_6925)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                        goto(Label_6776)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                        goto(Label_6614)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1000512317))
                                    }
                                    else {
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-580852947))
                                            goto(Label_6254)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                            goto(Label_6089)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1937918200))
                                            goto(Label_5949)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                            loopcontinue(Label_5817)
                                        }
                                        
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(371133672))
                                        putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u40a9\u7873\u67e9\u16f6\u071d\u3e2a, this:\u88c5\ud171\ub113\u6435\ud51e, and:int[expected:boolean](ldc:int(5893), ldc:int(2259)))
                                    }
                                    
                                    Label_6515:
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                        goto(Label_7240)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                        goto(Label_7087)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                        goto(Label_6925)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                        goto(Label_6776)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                            goto(Label_6254)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                            goto(Label_6089)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-7273435))
                                            goto(Label_5949)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                            loopcontinue(Label_5817)
                                        }
                                        
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(434064548))
                                        invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8709\u416d\u8c8a\u52d3\u527a, this:\u88c5\ud171\ub113\u6435\ud51e)
                                    }
                                    
                                    Label_6614:
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1651879536))
                                        goto(Label_7240)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1889115863))
                                        goto(Label_7087)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1954900823))
                                        goto(Label_6925)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(964496587))
                                    }
                                    else {
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                            goto(Label_6515)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1891407672))
                                            goto(Label_6254)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-612554158))
                                            goto(Label_6089)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(331446591))
                                            goto(Label_5949)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1346124565))
                                            loopcontinue(Label_5817)
                                        }
                                        
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1032122604))
                                        invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u4c04\u4179\uae87\ub113\uc2bd\ubb2b, this:\u88c5\ud171\ub113\u6435\ud51e)
                                    }
                                    
                                    Label_6776:
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(148586907))
                                        goto(Label_7240)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1073560678))
                                        goto(Label_7087)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                        goto(Label_6925)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                        goto(Label_6614)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1421518947))
                                        goto(Label_6515)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-970564150))
                                    }
                                    else {
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(211862880))
                                            goto(Label_6254)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(313668495))
                                            goto(Label_6089)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                            goto(Label_5949)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-21369719))
                                            looporswitchbreak(Label_7410)
                                        }
                                        
                                        loopcontinue(Label_5817)
                                    }
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(793772594))
                                goto(Label_7240)
                            }
                            catch (java.lang.Throwable stack_1B0B_0) {
                            }
                            
                            Label_6925:
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1014981994))
                                goto(Label_7240)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1598525662))
                                    goto(Label_6776)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1207018126))
                                    goto(Label_6614)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-2128206843))
                                    goto(Label_6515)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1403731491))
                                    loopcontinue()
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(491114613))
                                    goto(Label_6254)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                                    goto(Label_6089)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    goto(Label_5949)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-731204794))
                                    loopcontinue(Label_5817)
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1563186004))
                                invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Exception stopping the server"), var_8:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf[expected:Throwable])
                            }
                            
                            Label_7087:
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1874479944))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                    goto(Label_6925)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(488812695))
                                    goto(Label_6776)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_6614)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_6515)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1823313749))
                                    loopcontinue()
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1663411444))
                                    goto(Label_6254)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(2064441111))
                                    goto(Label_6089)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(2126337837))
                                    goto(Label_5949)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-97796831))
                                    loopcontinue(Label_5817)
                                }
                                
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1532488926))
                                invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u4c04\u4179\uae87\ub113\uc2bd\ubb2b, this:\u88c5\ud171\ub113\u6435\ud51e)
                            }
                            
                            Label_7240:
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_7087)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_6925)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                                goto(Label_6776)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(800655857))
                                goto(Label_6614)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_6515)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1971017199))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(549829894))
                                    goto(Label_6254)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(157255534))
                                    goto(Label_6089)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                    goto(Label_5949)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1176317378))
                                    looporswitchbreak()
                                }
                                
                                loopcontinue(Label_5817)
                            }
                        }
                    }
                    finally {
                        do {
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1190637072))
                                invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u4c04\u4179\uae87\ub113\uc2bd\ubb2b, this:\u88c5\ud171\ub113\u6435\ud51e)
                            }
                        } while (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0)))
                        
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1480031291))
                    }
                    
                    looporswitchbreak()
                }
                
                Label_7410:
                return:void()
            }
            finally {
                try {
                    loop {
                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_7564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_7512)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(683133957))
                        }
                        else {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1409336181))
                            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u40a9\u7873\u67e9\u16f6\u071d\u3e2a, this:\u88c5\ud171\ub113\u6435\ud51e, xor:int[expected:boolean](ldc:int(8458), ldc:int(8459)))
                        }
                        
                        Label_7469:
                        
                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_7564)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1784151731))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(2)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1727889066))
                            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8709\u416d\u8c8a\u52d3\u527a, this:\u88c5\ud171\ub113\u6435\ud51e)
                        }
                        
                        Label_7512:
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(359322590))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1266243485))
                                goto(Label_7469)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-109200050))
                            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u4c04\u4179\uae87\ub113\uc2bd\ubb2b, this:\u88c5\ud171\ub113\u6435\ud51e)
                        }
                        
                        Label_7564:
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1263241577))
                            goto(Label_7512)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_7469)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1024)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(783641779))
                }
                catch (java.lang.Throwable var_13_1DBA) {
                    loop {
                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_7691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(32)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(1886596268))
                            invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Exception stopping the server"), var_13_1DBA:Throwable)
                        }
                        
                        Label_7647:
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(903910558))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(65536)), ldc:int(0))) {
                                var_1_1E29 = and:int(var_1_1E29:int, ldc:int(717925610))
                                loopcontinue()
                            }
                            
                            var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-557904104))
                            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u4c04\u4179\uae87\ub113\uc2bd\ubb2b, this:\u88c5\ud171\ub113\u6435\ud51e)
                        }
                        
                        Label_7691:
                        
                        if (cmpne:boolean(and:int(var_1_1E29:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_7647)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E29:int, ldc:int(67108864)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-807623122))
                    }
                    
                    var_1_1E29 = and:int(var_1_1E29:int, ldc:int(-1764405330))
                }
                finally {
                    invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u4c04\u4179\uae87\ub113\uc2bd\ubb2b, this:\u88c5\ud171\ub113\u6435\ud51e)
                }
            }
            
            athrow(var_12_1CF9:Throwable)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u392e\u47c2\u9a18\u5d20\u51fa\u56bd() {
        var_1_8C : int
        expr_7D : long [generated]
        stack_A2_2 : long [generated]
        stack_C1_0 : int [generated]
        
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
            var_1_8C = and:int(ldc:int(-377874841), ldc:int(-176470291))
            
            if (logicalnot:boolean(invokevirtual:boolean(\ua068\ud217\u72f1\u446c\u3d64\ub6ab<R>::\ub1b9\u6fb0\u3bc9\u98a4\ub102\u8cae, this:\u88c5\ud171\ub113\u6435\ud51e[expected:\ua068\ud217\u72f1\u446c\u3d64\ub6ab<\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a>]))) {
                expr_7D = invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52)
                
                if (logicalnot:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u6cfe\u983f\u3504\u3bc9\u67e9\u5f50, this:\u88c5\ud171\ub113\u6435\ud51e))) {
                    var_1_8C = and:int(var_1_8C:int, ldc:int(-361322649))
                    stack_A2_2 = getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e)
                }
                else {
                    stack_A2_2 = getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\ubded\ub6ab\u760c\ubcb0\uc238\u183a, this:\u88c5\ud171\ub113\u6435\ud51e)
                }
                
                var_1_8C = and:int(var_1_8C:int, ldc:int(-369965459))
                
                if (cmpge:boolean(expr_7D:long, stack_A2_2:long)) {
                    stack_C1_0 = and:int(ldc:int(-29880), ldc:int(29719))
                    return:boolean(stack_C1_0:int)
                }
            }
            
            stack_C1_0 = and:int(ldc:int(18021), ldc:int(12441))
            return:boolean(stack_C1_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \ubefe\u600f\u56bd\u8d90\u7330\uc246() {
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
    
    public \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a \u4c04\ud217\u7330\u67e9\u8389\u4c2b(java.lang.Runnable p0) {
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
            return:\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a(initobject:\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a(\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a::<init>, getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u516c\ub19c\u4bc8\ua3b4\u88c5\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e), p0:Runnable))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5fe1\u8413\uafe7\u98a4\ud158\u67d0(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpge:boolean(add:int(invokevirtual:int(\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a::\u6d99\ua6bd\u12b2\u8d90\u5245\uc7fe, p0:\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a), xor:int(ldc:int(8258), ldc:int(8257))), getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u516c\ub19c\u4bc8\ua3b4\u88c5\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e)), logicalnot:boolean(invokespecial:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u392e\u47c2\u9a18\u5d20\u51fa\u56bd, this:\u88c5\ud171\ub113\u6435\ud51e))), and:int(ldc:int(17120), ldc:int(-17123)), and:int(ldc:int(1109), ldc:int(2179))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u0c95\u36d3\u0a06\uc229\ufcaf\u527a() {
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
            return:boolean(putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u6cfe\u983f\u3504\u3bc9\u67e9\u5f50, this:\u88c5\ud171\ub113\u6435\ud51e, invokespecial:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u1833\u4179\u9255\u8aa5\u7006\u8258, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    private boolean \u1833\u4179\u9255\u8aa5\u7006\u8258() {
        var_1_E2 : int
        var_3_B0 : Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>
        
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
        var_1_E2 = and:int(ldc:int(-4869191), ldc:int(1973263977))
        
        if (invokespecial:boolean(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u0c95\u36d3\u0a06\uc229\ufcaf\u527a, this:\u88c5\ud171\ub113\u6435\ud51e[expected:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a>])) {
            return:boolean(and:int[expected:boolean](ldc:int(1605), ldc:int(16385)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_1_E2:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_E2 = and:int(var_1_E2:int, ldc:int(-539512197))
                
                if (invokespecial:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u392e\u47c2\u9a18\u5d20\u51fa\u56bd, this:\u88c5\ud171\ub113\u6435\ud51e)) {
                    var_3_B0 = invokeinterface:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>(Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>::iterator, invokevirtual:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u983f\ubefe\ua562\u9a18\uae87\u34df, this:\u88c5\ud171\ub113\u6435\ud51e))
                    
                    loop {
                        var_1_E2 = and:int(var_1_E2:int, ldc:int(-541594691))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_B0:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))) {
                            looporswitchbreak()
                        }
                        
                        if (invokevirtual:boolean(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u8d90\u873d\u3e2a\uc2e8\u759a\u6d99, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>::next, var_3_B0:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))))) {
                            return:boolean(and:int[expected:boolean](ldc:int(26893), ldc:int(705)))
                        }
                        
                        var_1_E2 = and:int(var_1_E2:int, ldc:int(-138416453))
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_1_E2:int, ldc:int(262144)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(18886), ldc:int(-19399)))
            }
        }
    }
    
    public void run(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a p0) {
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
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\ud51e\u8413\u51b2\u72f1\uc84e\u6198, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u8bb0\u5db4\uae5d\u40a9\ud158\ud7e8, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:String("runTask"))
            invokespecial:void(\ua068\ud217\u72f1\u446c\u3d64\ub6ab<\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a>::run, this:\u88c5\ud171\ub113\u6435\ud51e[expected:\ua068\ud217\u72f1\u446c\u3d64\ub6ab<\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a>], p0:\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4ab3\u183a\u8258\u4cd9\ud158\u0b8e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc84e\ub32d\u3dd3\u2dcc\u34df p0) {
        var_2_67 : int
        var_4_6F : File
        var_2_538 : int
        var_5_231 : ByteBuf
        var_6_23E : BufferedImage
        stack_3AE_0 : int [generated]
        stack_2F1_0 : int [generated]
        var_7_44E : ByteBuffer
        var_6_4E2 : Exception
        
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
            var_2_67 = and:int(and:int(ldc:int(-644018408), ldc:int(-46153887)), ldc:int(2109579104))
            var_4_6F = invokevirtual:File(\u88c5\ud171\ub113\u6435\ud51e::\u7bad\u4d85\u3d64\u1833\ud523\u8d98, this:\u88c5\ud171\ub113\u6435\ud51e, ldc:String("server-icon.png"))
            
            loop {
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0485)
                }
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_67 = and:int(var_2_67:int, ldc:int(-1570581631))
                    goto(Label_0412)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0331)
                }
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0258)
                }
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_67 = and:int(var_2_67:int, ldc:int(-824473473))
                }
                else {
                    var_2_67 = and:int(var_2_67:int, ldc:int(-740434128))
                    
                    if (invokevirtual:boolean(File::exists, var_4_6F:File)) {
                        goto(Label_0331)
                    }
                }
                
                Label_0185:
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0485)
                }
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_67 = and:int(var_2_67:int, ldc:int(675378392))
                    goto(Label_0412)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0331)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_67 = and:int(var_2_67:int, ldc:int(147777526))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(-2110811057))
                        loopcontinue()
                    }
                    
                    var_2_67 = and:int(var_2_67:int, ldc:int(1507688347))
                }
                
                Label_0258:
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0485)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0412)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(-284170669))
                        goto(Label_0185)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(130061472))
                        loopcontinue()
                    }
                    
                    var_2_67 = and:int(var_2_67:int, ldc:int(-239259777))
                    var_4_6F = invokevirtual:File(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u5fe1\uae5d\u69d9\ucfaf\u071d\uc9f6, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e))
                }
                
                Label_0331:
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(512)), ldc:int(0))) {
                    var_2_67 = and:int(var_2_67:int, ldc:int(610269866))
                    goto(Label_0485)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(4)), ldc:int(0))) {
                    var_2_67 = and:int(var_2_67:int, ldc:int(-167924124))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(953591971))
                        goto(Label_0258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0185)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_67 = and:int(var_2_67:int, ldc:int(1038057362))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::isFile, var_4_6F:File))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0412:
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_67 = and:int(var_2_67:int, ldc:int(1918872269))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(-285153414))
                        goto(Label_0331)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0185)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(-1804472227))
                        loopcontinue()
                    }
                    
                    var_2_67 = and:int(var_2_67:int, ldc:int(-81965184))
                }
                
                Label_0485:
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(512)), ldc:int(0))) {
                    var_2_67 = and:int(var_2_67:int, ldc:int(-1211920823))
                    goto(Label_0412)
                }
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0331)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_67 = and:int(var_2_67:int, ldc:int(1996185760))
                    goto(Label_0258)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0185)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(512)), ldc:int(0))) {
                    var_2_538 = and:int(var_2_67:int, ldc:int(2076012321))
                    var_5_231 = invokestatic:ByteBuf(Unpooled::buffer)
                    
                    try {
                        var_2_538 = and:int(var_2_538:int, ldc:int(-1247813762))
                        var_6_23E = invokestatic:BufferedImage(ImageIO::read, var_4_6F:File)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_1036)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(2048)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(480177281))
                                goto(Label_0945)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_0830)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(4096)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(-1623188572))
                                goto(Label_0756)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(524288)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(1899827084))
                                
                                if (cmpne:boolean(invokevirtual:int(BufferedImage::getWidth, var_6_23E:BufferedImage), ldc:int(64))) {
                                    stack_3AE_0 = stack_2F1_0 = and(ldc(-14492), ldc(14491))
                                    goto(Label_0726)
                                }
                            }
                            
                            Label_0650:
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_1036)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_0945)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_0830)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(4)), ldc:int(0))) {
                                goto(Label_0756)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(536870912)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(353331152))
                                loopcontinue()
                            }
                            
                            var_2_538 = and:int(var_2_538:int, ldc:int(1543360260))
                            stack_3AE_0 = stack_2F1_0 = xor(ldc(24706), ldc(24707))
                            Label_0726:
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_0906)
                            }
                            
                            var_2_538 = and:int(var_2_538:int, ldc:int(1427984358))
                            invokestatic:void(Validate::validState, stack_2F1_0:boolean, ldc:String("Must be 64 pixels wide"), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-30934), ldc:int(30800))))
                            Label_0756:
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_1036)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_0945)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(1048576)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(-1653068269))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_2_538:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_0650)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(2048)), ldc:int(0))) {
                                    var_2_538 = and:int(var_2_538:int, ldc:int(-1696815082))
                                    loopcontinue()
                                }
                                
                                var_2_538 = and:int(var_2_538:int, ldc:int(1461583693))
                                
                                if (cmpne:boolean(invokevirtual:int(BufferedImage::getHeight, var_6_23E:BufferedImage), ldc:int(64))) {
                                    stack_3AE_0 = stack_2F1_0 = and(ldc(-28263), ldc(11364))
                                    goto(Label_0906)
                                }
                            }
                            
                            Label_0830:
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(4096)), ldc:int(0))) {
                                goto(Label_1036)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(131072)), ldc:int(0))) {
                                goto(Label_0945)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(524288)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(-1790910176))
                                goto(Label_0756)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_0650)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(2048)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_538 = and:int(var_2_538:int, ldc:int(-42074340))
                            stack_3AE_0 = stack_2F1_0 = and(ldc(17081), ldc(2051))
                            Label_0906:
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(256)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(-1733845091))
                                goto(Label_0726)
                            }
                            
                            var_2_538 = and:int(var_2_538:int, ldc:int(1004519229))
                            invokestatic:void(Validate::validState, stack_3AE_0:boolean, ldc:String("Must be 64 pixels high"), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-1139), ldc:int(1138))))
                            Label_0945:
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(536870912)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(-515163005))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_0830)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(512)), ldc:int(0))) {
                                    var_2_538 = and:int(var_2_538:int, ldc:int(-664151910))
                                    goto(Label_0756)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_538:int, ldc:int(2)), ldc:int(0))) {
                                    goto(Label_0650)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_2_538 = and:int(var_2_538:int, ldc:int(1230875431))
                                    loopcontinue()
                                }
                                
                                var_2_538 = and:int(var_2_538:int, ldc:int(-614506514))
                                invokestatic:boolean(ImageIO::write, var_6_23E:BufferedImage[expected:RenderedImage], ldc:String("PNG"), initobject:ByteBufOutputStream[expected:OutputStream](ByteBufOutputStream::<init>, var_5_231:ByteBuf))
                            }
                            
                            Label_1036:
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_0945)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(131072)), ldc:int(0))) {
                                goto(Label_0830)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(131072)), ldc:int(0))) {
                                goto(Label_0756)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(536870912)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(-244130293))
                                goto(Label_0650)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(131072)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_2_538 = and:int(var_2_538:int, ldc:int(-1281409116))
                        var_7_44E = invokevirtual:ByteBuffer(Encoder::encode, invokestatic:Encoder(Base64::getEncoder), invokevirtual:ByteBuffer(ByteBuf::nioBuffer, var_5_231:ByteBuf))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Label_1212)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(1)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(-2038451166))
                            }
                            else {
                                var_2_538 = and:int(var_2_538:int, ldc:int(-1755492566))
                                invokevirtual:void(\uc84e\ub32d\u3dd3\u2dcc\u34df::\u156b\ud12e\u8709\u7d52\ud51e\u2dcc, p0:\uc84e\ub32d\u3dd3\u2dcc\u34df, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("data:image/png;base64,")), invokevirtual:CharBuffer(Charset::decode, getstatic:Charset(StandardCharsets::UTF_8), var_7_44E:ByteBuffer))))
                            }
                            
                            Label_1166:
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(131072)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(-872416107))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_2_538:int, ldc:int(1)), ldc:int(0))) {
                                    var_2_538 = and:int(var_2_538:int, ldc:int(1990480200))
                                    loopcontinue()
                                }
                                
                                var_2_538 = and:int(var_2_538:int, ldc:int(-1686114498))
                                invokevirtual:boolean(ByteBuf::release, var_5_231:ByteBuf)
                            }
                            
                            Label_1212:
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_1166)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(2)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_2_538 = and:int(var_2_538:int, ldc:int(-933094915))
                        }
                        
                        var_2_538 = and:int(var_2_538:int, ldc:int(1438506967))
                    }
                    catch (java.lang.Exception var_6_4E2) {
                        loop {
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_1315)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(1048576)), ldc:int(0))) {
                                var_2_538 = and:int(var_2_538:int, ldc:int(2073894754))
                                invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Couldn't load server icon"), var_6_4E2:Exception[expected:Throwable])
                            }
                            
                            Label_1287:
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(1024)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(2147483647)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_538 = and:int(var_2_538:int, ldc:int(499093258))
                                invokevirtual:boolean(ByteBuf::release, var_5_231:ByteBuf)
                            }
                            
                            Label_1315:
                            
                            if (cmpeq:boolean(and:int(var_2_538:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_1287)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_538:int, ldc:int(16777216)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_2_538 = and:int(var_2_538:int, ldc:int(-709009529))
                    }
                    finally {
                        invokevirtual:boolean(ByteBuf::release, var_5_231:ByteBuf)
                    }
                    
                    looporswitchbreak()
                }
                
                var_2_67 = and:int(var_2_67:int, ldc:int(-1408369771))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7af6\ubb2b\uc910\ub7dc\u9af2\u6c56() {
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
            return:boolean(putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u7006\ud36e\u3e2a\u8308\u61a4\u8258, this:\u88c5\ud171\ub113\u6435\ud51e, ternaryop:int[expected:boolean](logicalor:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u7006\ud36e\u3e2a\u8308\u61a4\u8258, this:\u88c5\ud171\ub113\u6435\ud51e), invokevirtual:boolean(File::isFile, invokevirtual:File(\u88c5\ud171\ub113\u6435\ud51e::\ub18d\u6c52\u67e9\u67e9\u3bc9\u88c5, this:\u88c5\ud171\ub113\u6435\ud51e))), xor:int(ldc:int(4138), ldc:int(4139)), and:int(ldc:int(6372), ldc:int(-6373)))))
        }
        
        goto(Label_0006)
    }
    
    public java.io.File \ub18d\u6c52\u67e9\u67e9\u3bc9\u88c5() {
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
            return:File(invokevirtual:File(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u5fe1\uae5d\u69d9\ucfaf\u071d\uc9f6, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public java.io.File \u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330() {
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
            return:File(initobject:File(File::<init>, ldc:String(".")))
        }
        
        goto(Label_0006)
    }
    
    public void \u69d9\u7006\u0c95\u8bb0\u12b2\u71ae(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e p0) {
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
    
    public void \u4c04\u4179\uae87\ub113\uc2bd\ubb2b() {
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
    
    public void \u5bc4\u3a62\u8350\u946b\u4179\u93a2(java.util.function.BooleanSupplier p0) {
        var_2_214 : int
        var_4_65 : long
        var_10_1EC : GameProfile[]
        var_11_204 : int
        var_12_20D : int
        expr_179 : long[] [generated]
        expr_182 : int [generated]
        expr_188 : long [generated]
        
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
            var_2_214 = and:int(ldc:int(-1577503092), ldc:int(400447452))
            var_4_65 = invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u4f4a\u5140\u6b5f\uc910\u983f\u0b8e)
            putfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u516c\ub19c\u4bc8\ua3b4\u88c5\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e, add:int(getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u516c\ub19c\u4bc8\ua3b4\u88c5\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e), and:int(ldc:int(2069), ldc:int(13257))))
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u527a\u40a9\u12cb\u7ce1\u98a4\u6d69, this:\u88c5\ud171\ub113\u6435\ud51e, p0:BooleanSupplier)
            
            if (cmpge:boolean(sub:long(var_4_65:long, getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u960f\u16f6\uc238\ubff1\u9a18\u927d, this:\u88c5\ud171\ub113\u6435\ud51e)), ldc:long(5000000000L))) {
                putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u960f\u16f6\uc238\ubff1\u9a18\u927d, this:\u88c5\ud171\ub113\u6435\ud51e, var_4_65:long)
                invokevirtual:void(\uc84e\ub32d\u3dd3\u2dcc\u34df::\ub6ab\u6ec6\u624e\u6198\u12b2\u8df4, getfield:\uc84e\ub32d\u3dd3\u2dcc\u34df(\u88c5\ud171\ub113\u6435\ud51e::\uc229\u8bb0\uc31c\u624e\u62da\u446c, this:\u88c5\ud171\ub113\u6435\ud51e), initobject:\u3dd3\u4179\u839e\ubcb0\u4d85(\u3dd3\u4179\u839e\ubcb0\u4d85::<init>, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u71ae\u40a9\ub8be\uc31c\u3d4b\u5d20, this:\u88c5\ud171\ub113\u6435\ud51e), invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u7873\ud171\uc246\u40a9\ud12e\u3d4b, this:\u88c5\ud171\ub113\u6435\ud51e)))
                var_10_1EC = newarray:GameProfile[](com.mojang.authlib.GameProfile.class, invokestatic:int(Math::min, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u7873\ud171\uc246\u40a9\ud12e\u3d4b, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:int(12)))
                var_11_204 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u446c\u8aa5\ufcaf\u99f7\u6bb9\ub113, getfield:Random(\u88c5\ud171\ub113\u6435\ud51e::\uc238\u47c2\u446c\u392e\u416d\u64f2, this:\u88c5\ud171\ub113\u6435\ud51e), and:int(ldc:int(32312), ldc:int(-32569)), sub:int(invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u7873\ud171\uc246\u40a9\ud12e\u3d4b, this:\u88c5\ud171\ub113\u6435\ud51e), arraylength:int(var_10_1EC:GameProfile[])))
                var_12_20D = and:int(ldc:int(-29135), ldc:int(12746))
                
                loop {
                    var_2_214 = and:int(var_2_214:int, ldc:int(-1412884497))
                    
                    if (cmpge:boolean(var_12_20D:int, arraylength:int(var_10_1EC:GameProfile[]))) {
                        looporswitchbreak()
                    }
                    
                    storeelement:GameProfile(var_10_1EC:GameProfile[], var_12_20D:int, invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e)), add:int(var_11_204:int, var_12_20D:int)))))
                    inc:int(var_12_20D, ldc:int(1))
                }
                
                var_2_214 = and:int(var_2_214:int, ldc:int(-2116528506))
                invokestatic:void(Collections::shuffle, invokestatic:List<GameProfile>(Arrays::asList, var_10_1EC:GameProfile[]))
                invokevirtual:void(\u3dd3\u4179\u839e\ubcb0\u4d85::\uafe7\u34df\uf995\ubded\ua6bd\u718f, invokevirtual:\u3dd3\u4179\u839e\ubcb0\u4d85(\uc84e\ub32d\u3dd3\u2dcc\u34df::\u34df\u6c56\ua6bd\u6435\u7af6\u1187, getfield:\uc84e\ub32d\u3dd3\u2dcc\u34df(\u88c5\ud171\ub113\u6435\ud51e::\uc229\u8bb0\uc31c\u624e\u62da\u446c, this:\u88c5\ud171\ub113\u6435\ud51e)), var_10_1EC:GameProfile[])
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_2_214:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0307)
                }
                
                if (cmpeq:boolean(and:int(var_2_214:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0253)
                }
                
                if (cmpne:boolean(and:int(var_2_214:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_214 = and:int(var_2_214:int, ldc:int(-136364323))
                    
                    if (cmpeq:boolean(rem:int(getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u516c\ub19c\u4bc8\ua3b4\u88c5\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e), and:int(ldc:int(6002), ldc:int(32624))), ldc:int(0))) {
                        invokeinterface:void(Logger::debug, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Autosave started"))
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:String("save"))
                        invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\ua3b4\u836c\u983f\u51b2\u8aa5\u7ce1, getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e))
                        invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u98a4\u4f52\u4c04\u8aa5\u47c2\u4ab3, this:\u88c5\ud171\ub113\u6435\ud51e, xor:int[expected:boolean](ldc:int(18704), ldc:int(18705)), and:int[expected:boolean](ldc:int(9445), ldc:int(-9470)), and:int[expected:boolean](ldc:int(13220), ldc:int(-16309)))
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e))
                        invokeinterface:void(Logger::debug, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Autosave finished"))
                    }
                }
                
                Label_0183:
                
                if (cmpeq:boolean(and:int(var_2_214:int, ldc:int(512)), ldc:int(0))) {
                    var_2_214 = and:int(var_2_214:int, ldc:int(-1594944938))
                    goto(Label_0307)
                }
                
                if (cmpeq:boolean(and:int(var_2_214:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_214 = and:int(var_2_214:int, ldc:int(-354361419))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_214:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_214 = and:int(var_2_214:int, ldc:int(601546471))
                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:String("snooper"))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u9255\u7e3f\u5d20\u8389\u4daf::\u983f\u4d85\u527a\u3711\u183a\u8bb0, getfield:\u9255\u7e3f\u5d20\u8389\u4daf(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\u4c04\ucef1\u4d85\u7af6\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e)))) {
                        if (cmpgt:boolean(getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u516c\ub19c\u4bc8\ua3b4\u88c5\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:int(100))) {
                            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u59ec\ud523\u1833\u4f4a\u67e9\u527a, getfield:\u9255\u7e3f\u5d20\u8389\u4daf(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\u4c04\ucef1\u4d85\u7af6\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e))
                        }
                    }
                }
                
                Label_0253:
                
                if (cmpne:boolean(and:int(var_2_214:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_214:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_214:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_214 = and:int(var_2_214:int, ldc:int(694617994))
                        loopcontinue()
                    }
                    
                    var_2_214 = and:int(var_2_214:int, ldc:int(-268845163))
                    
                    if (cmpeq:boolean(rem:int(getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u516c\ub19c\u4bc8\ua3b4\u88c5\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e), xor:int(ldc:int(1415), ldc:int(4855))), ldc:int(0))) {
                        invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u760c\u76bc\u8413\ud158\ucfaf\u51fa, getfield:\u9255\u7e3f\u5d20\u8389\u4daf(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\u4c04\ucef1\u4d85\u7af6\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e))
                    }
                }
                
                Label_0307:
                
                if (cmpeq:boolean(and:int(var_2_214:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0253)
                }
                
                if (cmpeq:boolean(and:int(var_2_214:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_214 = and:int(var_2_214:int, ldc:int(-35421352))
                    goto(Label_0183)
                }
                
                if (cmpne:boolean(and:int(var_2_214:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_214 = and:int(var_2_214:int, ldc:int(-1736593787))
            }
            
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e))
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:String("tallying"))
            expr_179 = getfield:long[](\u88c5\ud171\ub113\u6435\ud51e::\ubcb0\ub70c\u6c52\u3776\u93a2\u8df4, this:\u88c5\ud171\ub113\u6435\ud51e)
            expr_182 = rem:int(getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u516c\ub19c\u4bc8\ua3b4\u88c5\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:int(100))
            expr_188 = sub:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u4f4a\u5140\u6b5f\uc910\u983f\u0b8e), var_4_65:long)
            storeelement:long(expr_179:long[], expr_182:int, expr_188:long)
            putfield:float(\u88c5\ud171\ub113\u6435\ud51e::\u600f\u7006\u6435\ud217\uc9f6\u6c52, this:\u88c5\ud171\ub113\u6435\ud51e, add:float(mul:float(getfield:float(\u88c5\ud171\ub113\u6435\ud51e::\u600f\u7006\u6435\ud217\uc9f6\u6c52, this:\u88c5\ud171\ub113\u6435\ud51e), ldc:float(0.8f)), mul:float(div:float(l2f:float(expr_188:long), ldc:float(1000000.0f)), ldc:float(0.19999999f))))
            invokevirtual:void(\u624e\u416d\u97b7\u1187\u8df4\u71ae::\u3711\uafe7\u7330\u647c\u5140\u8389, getfield:\u624e\u416d\u97b7\u1187\u8df4\u71ae(\u88c5\ud171\ub113\u6435\ud51e::\uae87\u8308\u6fb0\u3bd6\uae5d\uc229, this:\u88c5\ud171\ub113\u6435\ud51e), sub:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u4f4a\u5140\u6b5f\uc910\u983f\u0b8e), var_4_65:long))
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u527a\u40a9\u12cb\u7ce1\u98a4\u6d69(java.util.function.BooleanSupplier p0) {
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
    
    public boolean \u92ff\uc2e8\u98a4\u0a06\uc910\u6fb0() {
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
            return:boolean(and:int[expected:boolean](ldc:int(517), ldc:int(193)))
        }
        
        goto(Label_0006)
    }
    
    public void \ua562\u3d64\u8cae\ubb2b\u76bc\u873d(java.lang.Runnable p0) {
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
            invokeinterface:boolean(List<Runnable>::add, getfield:List<Runnable>(\u88c5\ud171\ub113\u6435\ud51e::\u99f7\ub70c\ub6ab\uf94d\uc910\ua3b4, this:\u88c5\ud171\ub113\u6435\ud51e), p0:Runnable)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7af6\u8d90\u120d\u8d98\u3711\u7006(java.lang.String p0) {
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
            putfield:String(\u88c5\ud171\ub113\u6435\ud51e::\u120d\u72f1\uc229\ub70c\ud12e\u7bad, this:\u88c5\ud171\ub113\u6435\ud51e, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6435\ud217\u7af6\ucb79\u927d\u3504() {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-817506072), ldc:int(-884475778))
            
            if (invokevirtual:boolean(Thread::isAlive, getfield:Thread(\u88c5\ud171\ub113\u6435\ud51e::\u3e75\u62da\ub171\ub83f\u416d\u71ae, this:\u88c5\ud171\ub113\u6435\ud51e))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-437256616))
                stack_8D_0 = and:int(ldc:int(-22290), ldc:int(17169))
            }
            else {
                stack_8D_0 = and:int(ldc:int(28801), ldc:int(1281))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public java.io.File \u7bad\u4d85\u3d64\u1833\ud523\u8d98(java.lang.String p0) {
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
            return:File(initobject:File(File::<init>, invokevirtual:File(\u88c5\ud171\ub113\u6435\ud51e::\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330, this:\u88c5\ud171\ub113\u6435\ud51e), p0:String))
        }
        
        goto(Label_0006)
    }
    
    public final \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 \u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d() {
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
            return:\ube23\uc238\u5140\u4cd9\u8aa5(checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>::get, getfield:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u8c8a\u3e2a\u8df4\u718f\u69d9\u3776, this:\u88c5\ud171\ub113\u6435\ud51e), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>[expected:Object](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u071d\u5140\u600f\u4975\ufcaf\u624e))))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 \u760c\uc9f6\uff55\u3dd3\ubff1\u8cae(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> p0) {
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
            return:\ube23\uc238\u5140\u4cd9\u8aa5(checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>::get, getfield:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u8c8a\u3e2a\u8df4\u718f\u69d9\u3776, this:\u88c5\ud171\ub113\u6435\ud51e), p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>> \uf94d\u3bc9\uae5d\u3d64\u960f\u5bc4() {
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
            return:Set<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(invokeinterface:Set<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>::keySet, getfield:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u8c8a\u3e2a\u8df4\u718f\u69d9\u3776, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Iterable<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5> \u983f\ubefe\ua562\u9a18\uae87\u34df() {
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
            return:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>(invokeinterface:Collection<\ube23\uc238\u5140\u4cd9\u8aa5>[expected:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>](Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>::values, getfield:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u8c8a\u3e2a\u8df4\u718f\u69d9\u3776, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u67e9\uc246\u7bad\u61a4\u51b2\uae87() {
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
            return:String(invokeinterface:String(GameVersion::getName, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a)))
        }
        
        goto(Label_0006)
    }
    
    public int \u7873\ud171\uc246\u40a9\ud12e\u3d4b() {
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
            return:int(invokevirtual:int(\ucb79\u8350\u7bad\u392e\u51fa::\u40a9\u8cae\uc31c\u59ec\u7043\u8350, getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public int \u71ae\u40a9\ub8be\uc31c\u3d4b\u5d20() {
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
            return:int(invokevirtual:int(\ucb79\u8350\u7bad\u392e\u51fa::\ubcb0\u960f\uc29a\u4e72\ud51e\uc2bd, getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String[] \u4daf\u7d52\ub32d\u99f7\ucb79\u927d() {
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
            return:String[](invokevirtual:String[](\ucb79\u8350\u7bad\u392e\u51fa::\ub83f\u946b\u0b8e\ud171\u51fa\u7873, getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u4d85\uc3e3\u7873\uc246\ua3b4\ub1b9() {
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
            return:String(ldc:String("vanilla"))
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e \u3dd3\u76bc\u4f4a\u494c\ubded\u600f(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e p0) {
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
    
    public abstract java.util.Optional<java.lang.String> \u0a06\u5fe1\u183a\u67e9\u7af6\uf995();
    
    public void \u5db4\u0c95\u960f\u3776\ud217\u647c(net.minecraft.util.text.ITextComponent p0, java.util.UUID p1) {
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
            invokeinterface:void(Logger::info, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), invokeinterface:String(ITextComponent::getString, p0:ITextComponent))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.security.KeyPair \u4179\ubcb0\u59ec\ub18d\u7d52\u6b5f() {
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
            return:KeyPair(getfield:KeyPair(\u88c5\ud171\ub113\u6435\ud51e::\u5f50\u6198\u0b8e\ud51e\ubff1\u8709, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public int \u1187\u5245\ub6ab\u9a18\u12cb\ua6bd() {
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
            return:int(getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\ub102\u5bc4\ub83f\u40a9\u51b2\u62da, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u74b1\u494c\u0a06\u7049\u8c8a(int p0) {
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
            putfield:int(\u88c5\ud171\ub113\u6435\ud51e::\ub102\u5bc4\ub83f\u40a9\u51b2\u62da, this:\u88c5\ud171\ub113\u6435\ud51e, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ud158\u62da\ufe34\u8389\u72f1\u8d90() {
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
            return:String(getfield:String(\u88c5\ud171\ub113\u6435\ud51e::\uc9f6\u1187\u8308\u98a4\uafe7\uc229, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \ubefe\uc7fe\u8df4\u6fb0\u72f1\uc7fe(java.lang.String p0) {
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
            putfield:String(\u88c5\ud171\ub113\u6435\ud51e::\uc9f6\u1187\u8308\u98a4\uafe7\uc229, this:\u88c5\ud171\ub113\u6435\ud51e, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u946b\u965f\u2dcc\ud217\u40a9\u3504() {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1607218692), ldc:int(-838886162))
            
            if (cmpeq:boolean(getfield:String(\u88c5\ud171\ub113\u6435\ud51e::\uc9f6\u1187\u8308\u98a4\uafe7\uc229, this:\u88c5\ud171\ub113\u6435\ud51e), aconstnull:String())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-539017705))
                stack_8A_0 = and:int(ldc:int(-9104), ldc:int(9101))
            }
            else {
                stack_8A_0 = and:int(ldc:int(4165), ldc:int(16403))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \ucef1\u516c\uc3e3\ub7dc\ubcb0\u071d() {
        var_1_C7 : int
        var_3_CF : \u156b\u416d\ua6bd\ua61f\u718f\u72f1
        
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
            var_1_C7 = and:int(ldc:int(-961536230), ldc:int(-151742706))
            
            loop {
                Label_0098:
                
                if (cmpne:boolean(and:int(var_1_C7:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0169)
                }
                
                if (cmpne:boolean(and:int(var_1_C7:int, ldc:int(32)), ldc:int(0))) {
                    var_1_C7 = and:int(var_1_C7:int, ldc:int(-391654709))
                    goto(Label_0140)
                }
                
                var_1_C7 = and:int(var_1_C7:int, ldc:int(-956915733))
                invokeinterface:void(Logger::info, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Generating keypair"))
                
                try {
                    loop {
                        Label_0140:
                        
                        if (cmpeq:boolean(and:int(var_1_C7:int, ldc:int(64)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_C7:int, ldc:int(64)), ldc:int(0))) {
                                loopcontinue(Label_0098)
                            }
                            
                            var_1_C7 = and:int(var_1_C7:int, ldc:int(-671221925))
                            putfield:KeyPair(\u88c5\ud171\ub113\u6435\ud51e::\u5f50\u6198\u0b8e\ud51e\ubff1\u8709, this:\u88c5\ud171\ub113\u6435\ud51e, invokestatic:KeyPair(\u4c2b\ubff1\u839e\ub7dc\u6b0d\ud51e::\uae87\u8d90\u4492\uae5d\ub19c\uc29a))
                        }
                        
                        Label_0169:
                        
                        if (cmpne:boolean(and:int(var_1_C7:int, ldc:int(8)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_1_C7 = and:int(var_1_C7:int, ldc:int(293264957))
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C7:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_C7 = and:int(var_1_C7:int, ldc:int(-4971265))
                }
                catch (\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u156b\u416d\ua6bd\ua61f\u718f\u72f1 var_3_CF) {
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("Failed to generate key pair"), var_3_CF:\u156b\u416d\ua6bd\ua61f\u718f\u72f1[expected:Throwable]))
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\ub19c\u6b0d\u3c25\u4e72\u839e(\u6435\ub8be\u718f\u6b0d\u67e9.\u8753\u0800\u4f4a\u4975\u64ab\u4c04 p0, boolean p1) {
        var_3_61 : int
        var_3_7C : int
        stack_CA_0 : \u960f\u76bc\u8c8a\u5654\u4c2b\u59ec [generated]
        stack_CA_1 : \u8753\u0800\u4f4a\u4975\u64ab\u4c04 [generated]
        
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
        var_3_61 = and:int(ldc:int(-1364041154), ldc:int(-282689731))
        
        if (logicalnot:boolean(p1:boolean)) {
            if (invokeinterface:boolean(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\uc87f\u71ae\u5245\uff55\u9255\u5140, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e))) {
                goto(Label_0167)
            }
        }
        
        Label_0102:
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(524288)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(1339304448))
        }
        else {
            var_3_7C = and:int(var_3_61:int, ldc:int(-1112645061))
            stack_CA_0 = getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e)
            
            if (logicalnot:boolean(invokeinterface:boolean(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u7af6\u946b\uceb8\uc246\u5d20\u6b5f, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e)))) {
                var_3_7C = and:int(var_3_7C:int, ldc:int(-33655815))
                stack_CA_1 = p0:\u8753\u0800\u4f4a\u4975\u64ab\u4c04
            }
            else {
                stack_CA_1 = getstatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u5fe1\u69d9\u0c95\u6b0d\u7c6b\ub19c)
            }
            
            var_3_61 = and:int(var_3_7C:int, ldc:int(-1385536516))
            invokeinterface:void(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub171\u8709\u92ff\u7ce1\ud51e\u0800, stack_CA_0:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec, stack_CA_1:\u8753\u0800\u4f4a\u4975\u64ab\u4c04)
            invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u0a06\uc246\ubf56\ub83f\u61a4\u64f2, this:\u88c5\ud171\ub113\u6435\ud51e)
            invokeinterface:void(Iterable<Object>::forEach, invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>[expected:Iterable<Object>](\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, this:\u88c5\ud171\ub113\u6435\ud51e)), invokedynamic:Consumer<\u51fa\u6c52\u7330\u7330\u960f>(accept:(L\u51fa\u12cb\u7330\u74b1\u6c52/\u76bc\u4975\ua6bd\u4daf\u8d98/\u88c5\ud171\ub113\u6435\ud51e;)Ljava/util/function/Consumer;, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0102)
    }
    
    public int \ud4fe\uae87\u6c52\u92ee\u4e72\u8640(int p0) {
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
            return:int(p0:int)
        }
        
        goto(Label_0006)
    }
    
    private void \u0a06\uc246\ubf56\ub83f\u61a4\u64f2() {
        var_1_61 : int
        var_3_6B : Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>
        
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
            var_1_61 = and:int(ldc:int(-1507203603), ldc:int(-709099675))
            var_3_6B = invokeinterface:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>(Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>::iterator, invokevirtual:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u983f\ubefe\ua562\u9a18\uae87\u34df, this:\u88c5\ud171\ub113\u6435\ud51e))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1909463559))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_6B:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3a62\u74b1\u7d52\u9937\u6198\u965f, checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>::next, var_3_6B:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>)), invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u6d99\ua61f\u7ce1\uae5d\u51b2\u0800, this:\u88c5\ud171\ub113\u6435\ud51e), invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u946b\u56bd\uc238\u6fb0\uc9f6\u983f, this:\u88c5\ud171\ub113\u6435\ud51e))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7049\u8cae\ud217\u624e\u392e\u3a62(boolean p0) {
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
            invokeinterface:void(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u8bb0\u8cae\u0b8e\ub1b9\ud217\u7330, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e), p0:boolean)
            invokeinterface:void(Iterable<Object>::forEach, invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>[expected:Iterable<Object>](\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, this:\u88c5\ud171\ub113\u6435\ud51e)), invokedynamic:Consumer<\u51fa\u6c52\u7330\u7330\u960f>(accept:(L\u51fa\u12cb\u7330\u74b1\u6c52/\u76bc\u4975\ua6bd\u4daf\u8d98/\u88c5\ud171\ub113\u6435\ud51e;)Ljava/util/function/Consumer;, this:\u88c5\ud171\ub113\u6435\ud51e))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8350\u8640\u0800\ud171\uc31c\u120d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
        var_4_69 : \u4492\u92ee\u9255\uc29a\u3e75\u7043
        
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
            var_4_69 = invokevirtual:\u4492\u92ee\u9255\uc29a\u3e75\u7043(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3d4b\ud523\uff55\u647c\u4ab3\u7af6, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u51fa\u6c52\u7330\u7330\u960f::\u120d\u3d4b\u3a62\u965f\ua6bd\ubcb0, p0:\u51fa\u6c52\u7330\u7330\u960f))
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u9af2\uff55\ubcb0\u624e\uf94d(\u9af2\uff55\ubcb0\u624e\uf94d::<init>, invokeinterface:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u3bc9\u6435\u47c2\uf9c5\u3a62\u6198, var_4_69:\u4492\u92ee\u9255\uc29a\u3e75\u7043), invokeinterface:boolean(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uc87f\u71ae\u5245\uff55\u9255\u5140, var_4_69:\u4492\u92ee\u9255\uc29a\u3e75\u7043)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6d99\ua61f\u7ce1\uae5d\u51b2\u0800() {
        var_1_61 : int
        stack_92_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1704394601), ldc:int(-1293042700))
            
            if (cmpeq:boolean(invokeinterface:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u3bc9\u6435\u47c2\uf9c5\u3a62\u6198, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e)), getstatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u97b7\u98a4\u385b\u5140\u0c95\uc4d2))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-747677546))
                stack_92_0 = and:int(ldc:int(29908), ldc:int(-29941))
            }
            else {
                stack_92_0 = and:int(ldc:int(2375), ldc:int(8233))
            }
            
            return:boolean(stack_92_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u836c\u56bd\u4ab3\u9af2\u718f\u59ec() {
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
            return:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u71f1\uc910\ud12e\u516c\uf995\u8aa5, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u494c\ubefe\u7043\u4179\u3e2a\uc84e(boolean p0) {
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
            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u71f1\uc910\ud12e\u516c\uf995\u8aa5, this:\u88c5\ud171\ub113\u6435\ud51e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u4f52\u385b\u647c\uae87\u4daf\u3d4b() {
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
            return:String(getfield:String(\u88c5\ud171\ub113\u6435\ud51e::\uc29a\u071d\u4f4a\uc31c\ubff1\u3bc9, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u8258\u7af6\u927d\u6c56\uc7fe\u6c56() {
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
            return:String(getfield:String(\u88c5\ud171\ub113\u6435\ud51e::\u8258\ua61f\u8258\u4975\ud7e8\u7ce1, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \uc29a\uc246\u760c\u647c\u92ee\u120d(java.lang.String p0, java.lang.String p1) {
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
            putfield:String(\u88c5\ud171\ub113\u6435\ud51e::\uc29a\u071d\u4f4a\uc31c\ubff1\u3bc9, this:\u88c5\ud171\ub113\u6435\ud51e, p0:String)
            putfield:String(\u88c5\ud171\ub113\u6435\ud51e::\u8258\ua61f\u8258\u4975\ud7e8\u7ce1, this:\u88c5\ud171\ub113\u6435\ud51e, p1:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u98a4\u4bc8\uc238\u3bd6\ubded\u0a06(\u6435\ub8be\u718f\u6b0d\u67e9.\u9255\u7e3f\u5d20\u8389\u4daf p0) {
        var_2_61 : int
        var_2_90 : int
        stack_F8_1 : String [generated]
        stack_F8_2 : String [generated]
        var_2_14C : int
        var_4_132 : int
        var_5_13D : Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>
        var_6_189 : \ube23\uc238\u5140\u4cd9\u8aa5
        
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
            var_2_61 = and:int(ldc:int(-1154813723), ldc:int(-68215819))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, ldc:String("whitelist_enabled"), invokestatic:Boolean[expected:Object](Boolean::valueOf, and:int[expected:boolean](ldc:int(-162), ldc:int(161))))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, ldc:String("whitelist_count"), invokestatic:Integer[expected:Object](Integer::valueOf, and:int(ldc:int(-186), ldc:int(185))))
            
            if (cmpne:boolean(getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e), aconstnull:\ucb79\u8350\u7bad\u392e\u51fa())) {
                invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, ldc:String("players_current"), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u7873\ud171\uc246\u40a9\ud12e\u3d4b, this:\u88c5\ud171\ub113\u6435\ud51e)))
                invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, ldc:String("players_max"), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u71ae\u40a9\ub8be\uc31c\u3d4b\u5d20, this:\u88c5\ud171\ub113\u6435\ud51e)))
                invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, ldc:String("players_seen"), invokestatic:Integer[expected:Object](Integer::valueOf, arraylength:int(invokevirtual:String[](\u7e3f\uc84e\u873d\u7049\ubb2b\u960f::\u4f52\u98a4\u7006\uc2bd\u62da\uc9f6, getfield:\u7e3f\uc84e\u873d\u7049\ubb2b\u960f(\u88c5\ud171\ub113\u6435\ud51e::\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a, this:\u88c5\ud171\ub113\u6435\ud51e)))))
            }
            
            var_2_90 = and:int(var_2_61:int, ldc:int(-542761539))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, ldc:String("uses_auth"), invokestatic:Boolean[expected:Object](Boolean::valueOf, getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e)))
            stack_F8_1 = ldc:String("gui_state")
            
            if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u516c\u3d64\u76bc\u92ff\ub113\u516c, this:\u88c5\ud171\ub113\u6435\ud51e))) {
                var_2_90 = and:int(var_2_90:int, ldc:int(-550088241))
                stack_F8_2 = ldc:String("disabled")
            }
            else {
                stack_F8_2 = ldc:String("enabled")
            }
            
            var_2_14C = and:int(var_2_90:int, ldc:int(-1625146155))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, stack_F8_1:String, stack_F8_2:String[expected:Object])
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, ldc:String("run_time"), invokestatic:Long[expected:Object](Long::valueOf, mul:long(div:long(sub:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), invokevirtual:long(\u9255\u7e3f\u5d20\u8389\u4daf::\u97b7\ufcaf\ud4fe\u3a62\ub18d\u3776, p0:\u9255\u7e3f\u5d20\u8389\u4daf)), ldc:long(60L)), ldc:long(1000L))))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, ldc:String("avg_tick_ms"), invokestatic:Integer[expected:Object](Integer::valueOf, d2i:int(mul:double(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u59ec\u9255\u5654\ub70c\u8640\ubb2b, getfield:long[](\u88c5\ud171\ub113\u6435\ud51e::\ubcb0\ub70c\u6c52\u3776\u93a2\u8df4, this:\u88c5\ud171\ub113\u6435\ud51e)), ldc:double(1.0E-6)))))
            var_4_132 = and:int(ldc:int(9093), ldc:int(-9094))
            var_5_13D = invokeinterface:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>(Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>::iterator, invokevirtual:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u983f\ubefe\ua562\u9a18\uae87\u34df, this:\u88c5\ud171\ub113\u6435\ud51e))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_14C:int, ldc:int(8)), ldc:int(0))) {
                    var_2_14C = and:int(var_2_14C:int, ldc:int(-1078805785))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_5_13D:Iterator)) {
                        var_6_189 = checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>::next, var_5_13D:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))
                        
                        if (cmpne:boolean(var_6_189:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5())) {
                            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("world[")), var_4_132:int), ldc:String("][dimension]"))), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, var_6_189:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])))
                            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("world[")), var_4_132:int), ldc:String("][mode]"))), invokeinterface:\uf94d\u51b2\u1833\u34df\u1187[expected:Object](\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u1833\ub102\u72f1\u4ab3\u647c\uff55, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e)))
                            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("world[")), var_4_132:int), ldc:String("][difficulty]"))), invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, var_6_189:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd]))
                            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("world[")), var_4_132:int), ldc:String("][hardcore]"))), invokestatic:Boolean[expected:Object](Boolean::valueOf, invokeinterface:boolean(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u7af6\u946b\uceb8\uc246\u5d20\u6b5f, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e))))
                            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("world[")), var_4_132:int), ldc:String("][height]"))), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u5f50\u071d\u4daf\u3d64\u6435, this:\u88c5\ud171\ub113\u6435\ud51e)))
                            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("world[")), var_4_132:int), ldc:String("][chunks_loaded]"))), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u4daf\u416d\u6c56\u97b7\ufe34\u071d, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, var_6_189:\ube23\uc238\u5140\u4cd9\u8aa5))))
                            inc:int(var_4_132, ldc:int(1))
                        }
                        
                        var_2_14C = and:int(var_2_14C:int, ldc:int(-8759081))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_14C:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_14C = and:int(var_2_14C:int, ldc:int(-1278755296))
            }
            
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, ldc:String("worlds"), invokestatic:Integer(Integer::valueOf, var_4_132:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u7e3f\uc2bd\u647c\u3504\ud36e\u3c25();
    
    public abstract int \ud36e\u527a\u7ce1\u8640\u6ec6\uc87f();
    
    public boolean \u8413\ub19c\ube23\u71ae\ud36e\ubff1() {
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
            return:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u67d0\ub32d\u6c52\u5bc4\ub113\u416d(boolean p0) {
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
            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u92ff\u93a2\ua068\ub83f\u7043\uf9c5() {
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
            return:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u71f1\ud4fe\u47c2\ubcb0\uff55\u156b, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u5fe1\u8258\u7bad\u960f\u392e\ua6bd(boolean p0) {
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
            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u71f1\ud4fe\u47c2\ubcb0\uff55\u156b, this:\u88c5\ud171\ub113\u6435\ud51e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u946b\u56bd\uc238\u6fb0\uc9f6\u983f() {
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
            return:boolean(xor:int[expected:boolean](ldc:int(16640), ldc:int(16641)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub102\u873d\u3c25\u8350\u51fa\ubb2b() {
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
            return:boolean(and:int[expected:boolean](ldc:int(4697), ldc:int(3073)))
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u156b\u446c\ubded\ud158\u7873\u183a();
    
    public boolean \u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae() {
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
            return:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u34df\uc7fe\ud12e\u99f7\ubff1\ua61f, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2(boolean p0) {
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
            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u34df\uc7fe\ud12e\u99f7\ubff1\ua61f, this:\u88c5\ud171\ub113\u6435\ud51e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub171\u392e\u3bc9\u6cfe\u3c25\u6b0d() {
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
            return:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2(boolean p0) {
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
            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7, this:\u88c5\ud171\ub113\u6435\ud51e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8();
    
    public java.lang.String \ub70c\u67d0\u92ee\uc87f\u3bd6\u7d52() {
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
            return:String(getfield:String(\u88c5\ud171\ub113\u6435\ud51e::\u64ab\u7d52\u3dd3\u0b8e\uafe7\u5654, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \uafe7\uc229\u3711\u4bc8\ud4fe\ufe34(java.lang.String p0) {
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
            putfield:String(\u88c5\ud171\ub113\u6435\ud51e::\u64ab\u7d52\u3dd3\u0b8e\uafe7\u5654, this:\u88c5\ud171\ub113\u6435\ud51e, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u6c52\ub18d\u392e\u93a2\u7af6\ua6bd() {
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
            return:int(getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u5f50\u071d\u4daf\u3d64\u6435, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u4f4a\u6fb0\u8753\u34df\u7bad\uf995(int p0) {
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
            putfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u5f50\u071d\u4daf\u3d64\u6435, this:\u88c5\ud171\ub113\u6435\ud51e, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u836c\u62da\u8aa5\u156b\uc3e3\ubefe() {
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
            return:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u40a9\u7873\u67e9\u16f6\u071d\u3e2a, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ucb79\u8350\u7bad\u392e\u51fa \uc84e\u8cae\ucb79\u8df4\uae5d\ub83f() {
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
            return:\ucb79\u8350\u7bad\u392e\u51fa(getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u760c\u7af6\u6d69\u7330\u4daf\u7d52(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ucb79\u8350\u7bad\u392e\u51fa p0) {
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
            putfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e, p0:\ucb79\u8350\u7bad\u392e\u51fa)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u3711\u0c95\u718f\u9033\u4cd9\u8308();
    
    public void \u6b5f\u416d\u392e\uae5d\ub6ab\ub102(\u3504\ufe34\u600f\u6b0d\u69d9.\uf94d\u51b2\u1833\u34df\u1187 p0) {
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
            invokeinterface:void(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ud171\u983f\u6d69\u92ee\u5fe1\u4c2b, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e), p0:\uf94d\u51b2\u1833\u34df\u1187)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u9255\u0b8e\ud36e\ucef1\ud523 \ucfaf\u71ae\u5d20\uc31c\u9af2\uc9f6() {
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
            return:\u9255\u0b8e\ud36e\ucef1\ud523(getfield:\u9255\u0b8e\ud36e\ucef1\ud523(\u88c5\ud171\ub113\u6435\ud51e::\u6fb0\u3711\u99f7\u16f6\u76bc\u8258, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ua068\u8c8a\ub1b9\u67d0\u718f\uf9c5() {
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
            return:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u47c2\u9af2\u67d0\uae5d\u92ee\u392e, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u516c\u3d64\u76bc\u92ff\ub113\u516c() {
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
            return:boolean(and:int[expected:boolean](ldc:int(-14235), ldc:int(14218)))
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \ucb79\ua3b4\u4ab3\u62da\uc87f\ua562(\u3504\ufe34\u600f\u6b0d\u69d9.\uf94d\u51b2\u1833\u34df\u1187 p0, boolean p1, int p2);
    
    public int \u960f\uc238\u5f50\u7bad\u7bad\u51b2() {
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
            return:int(getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u516c\ub19c\u4bc8\ua3b4\u88c5\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\u9255\u7e3f\u5d20\u8389\u4daf \ubff1\ubcb0\u97e6\ua068\ua6bd\uc246() {
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
            return:\u9255\u7e3f\u5d20\u8389\u4daf(getfield:\u9255\u7e3f\u5d20\u8389\u4daf(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\u4c04\ucef1\u4d85\u7af6\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public int \u6ec6\ubff1\u7d52\u98a4\uceb8\u071d() {
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
            return:int(ldc:int(16))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u516c\u64ab\u3e75\u8350\u946b\u3e75(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p2) {
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
            return:boolean(and:int[expected:boolean](ldc:int(8756), ldc:int(-8757)))
        }
        
        goto(Label_0006)
    }
    
    public void \u183a\u52d3\ubded\ua61f\ucfaf\u3a62(boolean p0) {
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
            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\ube23\uae87\u4f4a\ub6ab\u62da\u600f, this:\u88c5\ud171\ub113\u6435\ud51e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u67e9\u3711\u7873\u6cfe\u7af6\u7043() {
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
            return:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\ube23\uae87\u4f4a\ub6ab\u62da\u600f, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7af6\u3a62\u92ee\u56bd\ua562\ucfaf() {
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
            return:boolean(and:int[expected:boolean](ldc:int(549), ldc:int(9)))
        }
        
        goto(Label_0006)
    }
    
    public int \ubded\u516c\u839e\u1833\u8df4\ub32d() {
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
            return:int(getfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\ub8be\u36d3\u3776\u6ec6\u3dd3(int p0) {
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
            putfield:int(\u88c5\ud171\ub113\u6435\ud51e::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, this:\u88c5\ud171\ub113\u6435\ud51e, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.authlib.minecraft.MinecraftSessionService \u3a62\u47c2\u760c\u61a4\ub8be\uc9f6() {
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
            return:MinecraftSessionService(getfield:MinecraftSessionService(\u88c5\ud171\ub113\u6435\ud51e::\u6d69\u071d\ucb79\ucfaf\uc246\ubcb0, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.authlib.GameProfileRepository \u071d\ub8be\ud4fe\u3711\uf9c5\u6ec6() {
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
            return:GameProfileRepository(getfield:GameProfileRepository(\u88c5\ud171\ub113\u6435\ud51e::\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ub1b9\u983f\uf9c5\u6fb0\u51fa \u62da\u8df4\ua3b4\u64f2\u3bc9\u927d() {
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
            return:\ub1b9\u983f\uf9c5\u6fb0\u51fa(getfield:\ub1b9\u983f\uf9c5\u6fb0\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u93a2\uc3e3\u6d69\uae5d\u600f\ud36e, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc84e\ub32d\u3dd3\u2dcc\u34df \uc4d2\ud51e\ub171\u8389\uff55\u647c() {
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
            return:\uc84e\ub32d\u3dd3\u2dcc\u34df(getfield:\uc84e\ub32d\u3dd3\u2dcc\u34df(\u88c5\ud171\ub113\u6435\ud51e::\uc229\u8bb0\uc31c\u624e\u62da\u446c, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u6bb9\u7049\u69d9\u1833\u3711\u1187() {
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
            putfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u960f\u16f6\uc238\ubff1\u9a18\u927d, this:\u88c5\ud171\ub113\u6435\ud51e, ldc:long(0L))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \ucef1\uc87f\u8753\u8753\u6d69\u4d85() {
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
            return:int(ldc:int(29999984))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8cae\uc4d2\ud171\ubefe\u16f6\uc246() {
        var_1_61 : int
        stack_98_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1805933333), ldc:int(1864193989))
            
            if (logicaland:boolean(invokespecial:boolean(\ua068\ud217\u72f1\u446c\u3d64\ub6ab<R>::\u8cae\uc4d2\ud171\ubefe\u16f6\uc246, this:\u88c5\ud171\ub113\u6435\ud51e[expected:\ua068\ud217\u72f1\u446c\u3d64\ub6ab<\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a>]), logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u836c\u62da\u8aa5\u156b\uc3e3\ubefe, this:\u88c5\ud171\ub113\u6435\ud51e)))) {
                stack_98_0 = xor:int(ldc:int(16385), ldc:int(16384))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-80342049))
                stack_98_0 = and:int(ldc:int(-29251), ldc:int(29250))
            }
            
            return:boolean(stack_98_0:int)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Thread \u5f50\u12b2\u92ee\uc31c\ub8be\u4ab3() {
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
            return:Thread(getfield:Thread(\u88c5\ud171\ub113\u6435\ud51e::\u3e75\u62da\ub171\ub83f\u416d\u71ae, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public int \u6bb9\u74b1\ubefe\u2dcc\u93a2\uc4d2() {
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
            return:int(and:int(ldc:int(12778), ldc:int(18176)))
        }
        
        goto(Label_0006)
    }
    
    public long \ube23\u64ab\u4492\u4179\u3c25\uc31c() {
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
            return:long(getfield:long(\u88c5\ud171\ub113\u6435\ud51e::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.DataFixer \u6ec6\u4cd9\ub32d\u7006\u183a\ucfaf() {
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
            return:DataFixer(getfield:DataFixer(\u88c5\ud171\ub113\u6435\ud51e::\u759a\uf995\u51fa\u7330\u4c2b\u8bb0, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public int \u416d\u56bd\u600f\u4ab3\u7bad\u51b2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0) {
        var_2_61 : int
        stack_85_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-2093037662), ldc:int(-658737193))
            
            if (cmpeq:boolean(p0:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5())) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-637599857))
                stack_85_0 = ldc:int(10)
            }
            else {
                stack_85_0 = invokevirtual:int(\u7e3f\ubff1\u718f\ub171\u72f1::\u385b\u3d64\u76bc\u36d3\ub102\u6c56, invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u7006\uc3e3\uc910\u9033\u8c8a>(\u7e3f\ubff1\u718f\ub171\u72f1::\u624e\u836c\uf94d\u12cb\ub8be\u5f50))
            }
            
            return:int(stack_85_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u183a\u2dcc\u36d3\u8753\ua61f\ub8be \uae87\ubff1\uc238\ud12e\u6d69\u67e9() {
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
            return:\u183a\u2dcc\u36d3\u8753\ua61f\ub8be(invokevirtual:\u183a\u2dcc\u36d3\u8753\ua61f\ub8be(\u7bad\u76bc\uae5d\u12cb\u16f6::\ub70c\ubded\u64f2\u9af2\ud51e\u12cb, getfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\ua3b4\u4179\uae5d\ub102\u9a18\u624e \u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0() {
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
            return:\ua3b4\u4179\uae5d\ub102\u9a18\u624e(getfield:\ua3b4\u4179\uae5d\ub102\u9a18\u624e(\u88c5\ud171\ub113\u6435\ud51e::\u3711\u4d85\u3776\ua562\u7873\u51fa, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(java.util.Collection<java.lang.String> p0) {
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
    
    public static \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf \u99f7\u9a18\u92ee\u12b2\u9255\u7330(\ub113\uc4d2\u183a\u527a\u6435.\u4f52\ua068\u4f52\u47c2\u4492 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf p1, boolean p2) {
        var_3_61 : int
        var_3_FD : int
        var_5_73 : LinkedHashSet
        var_6_7E : Iterator<String>
        var_7_E5 : String
        var_6_D2 : Iterator<\ua61f\uae87\u36d3\u647c\u3d64>
        var_8_1AC : String
        
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
        var_3_61 = and:int(ldc:int(-2014414948), ldc:int(-940867783))
        invokevirtual:void(\u4f52\ua068\u4f52\u47c2\u4492::\ub83f\u72f1\u8aa5\u64f2\ud158\ub171, p0:\u4f52\ua068\u4f52\u47c2\u4492)
        
        if (logicalnot:boolean(p2:boolean)) {
            var_3_FD = and:int(var_3_61:int, ldc:int(-1209057332))
            var_5_73 = invokestatic:LinkedHashSet(Sets::newLinkedHashSet)
            var_6_7E = invokeinterface:Iterator<String>(List<String>::iterator, invokevirtual:List<String>(\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf::\u8bb0\ubf56\u99f7\u3504\u4492\u4e72, p1:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_7E:Iterator<String>)) {
                var_7_E5 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_6_7E:Iterator<String>))
                
                if (invokevirtual:boolean(\u4f52\ua068\u4f52\u47c2\u4492::\u40a9\u7ce1\u5bc4\ubded\u12b2\u2dcc, p0:\u4f52\ua068\u4f52\u47c2\u4492, var_7_E5:String)) {
                    invokeinterface:boolean(Set<String>::add, var_5_73:LinkedHashSet<String>[expected:Set<String>], var_7_E5:String)
                    goto(Label_0284)
                }
                
                Label_0240:
                
                if (cmpne:boolean(and:int(var_3_FD:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_FD = and:int(var_3_FD:int, ldc:int(-806412450))
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Missing data pack {}"), var_7_E5:String[expected:Object])
                }
                
                Label_0284:
                
                if (cmpeq:boolean(and:int(var_3_FD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_FD = and:int(var_3_FD:int, ldc:int(-1733239317))
                    goto(Label_0240)
                }
                
                var_3_FD = and:int(var_3_FD:int, ldc:int(-1415215))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_3_FD:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0365)
                }
                
                if (cmpne:boolean(and:int(var_3_FD:int, ldc:int(4194304)), ldc:int(0))) {
                    var_3_FD = and:int(var_3_FD:int, ldc:int(-974416026))
                    var_6_D2 = invokeinterface:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>(Collection<\ua61f\uae87\u36d3\u647c\u3d64>::iterator, invokevirtual:Collection<\ua61f\uae87\u36d3\u647c\u3d64>(\u4f52\ua068\u4f52\u47c2\u4492::\u0c95\u6b5f\u1187\u12b2\ub1b9\u6435, p0:\u4f52\ua068\u4f52\u47c2\u4492))
                    
                    while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_D2:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>)) {
                        var_8_1AC = invokevirtual:String(\ua61f\uae87\u36d3\u647c\u3d64::\uc2bd\u12b2\u9937\ub102\u64f2\uc238, checkcast:\ua61f\uae87\u36d3\u647c\u3d64(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64.class, invokeinterface:\ua61f\uae87\u36d3\u647c\u3d64(Iterator<\ua61f\uae87\u36d3\u647c\u3d64>::next, var_6_D2:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>)))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(List<E>::contains, invokevirtual:List<String>(\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf::\u927d\u9033\u0a06\ufcaf\u392e\uc2bd, p1:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf), var_8_1AC:String[expected:Object]))) {
                            if (logicalnot:boolean(invokeinterface:boolean(Set<E>::contains, var_5_73:LinkedHashSet<String>[expected:Set<String>], var_8_1AC:String[expected:Object]))) {
                                invokeinterface:void(Logger::info, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("Found new data pack {}, loading it automatically"), var_8_1AC:String[expected:Object])
                                invokeinterface:boolean(Set<String>::add, var_5_73:LinkedHashSet<String>[expected:Set<String>], var_8_1AC:String)
                            }
                        }
                        
                        var_3_FD = and:int(var_3_FD:int, ldc:int(-706025621))
                    }
                }
                
                Label_0324:
                
                if (cmpne:boolean(and:int(var_3_FD:int, ldc:int(1024)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_FD = and:int(var_3_FD:int, ldc:int(-1792702818))
                        loopcontinue()
                    }
                    
                    var_3_FD = and:int(var_3_FD:int, ldc:int(-571484293))
                    
                    if (invokeinterface:boolean(Set<E>::isEmpty, var_5_73:LinkedHashSet<String>)) {
                        invokeinterface:void(Logger::info, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), ldc:String("No datapacks selected, forcing vanilla"))
                        invokeinterface:boolean(Set<String>::add, var_5_73:LinkedHashSet<String>[expected:Set<String>], ldc:String("vanilla"))
                    }
                }
                
                Label_0365:
                
                if (cmpne:boolean(and:int(var_3_FD:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_FD = and:int(var_3_FD:int, ldc:int(-1764941418))
                    goto(Label_0324)
                }
                
                if (cmpeq:boolean(and:int(var_3_FD:int, ldc:int(536870912)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokevirtual:void(\u4f52\ua068\u4f52\u47c2\u4492::\u16f6\u392e\u3776\u64f2\u9937\u47c2, p0:\u4f52\ua068\u4f52\u47c2\u4492, var_5_73:LinkedHashSet<String>[expected:Collection<String>])
            return:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(invokestatic:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u88c5\ud171\ub113\u6435\ud51e::\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6, p0:\u4f52\ua068\u4f52\u47c2\u4492))
        }
        
        invokevirtual:void(\u4f52\ua068\u4f52\u47c2\u4492::\u16f6\u392e\u3776\u64f2\u9937\u47c2, p0:\u4f52\ua068\u4f52\u47c2\u4492, invokestatic:Set<String>[expected:Collection<String>](Collections::singleton, ldc:String("vanilla")))
        return:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(initobject:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf::<init>, invokestatic:ImmutableList[expected:List<String>](ImmutableList::of, ldc:String[expected:Object]("vanilla")), invokestatic:ImmutableList[expected:List<String>](ImmutableList::of)))
    }
    
    private static \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf \u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6(\ub113\uc4d2\u183a\u527a\u6435.\u4f52\ua068\u4f52\u47c2\u4492 p0) {
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
    
    public void \u385b\u6ec6\ubefe\u983f\u5fe1\u7d52(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
        var_2_C6 : int
        var_4_7B : \ucb79\u8350\u7bad\u392e\u51fa
        var_5_82 : \u71f1\ub18d\u62da\u9255\u7ce1
        var_6_8F : Iterator
        var_7_B2 : \u51fa\u6c52\u7330\u7330\u960f
        
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
            var_2_C6 = and:int(ldc:int(-104060866), ldc:int(-413277441))
            
            if (invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u7c6b\u92ff\u6c56\u56bd\u3c25\u624e, this:\u88c5\ud171\ub113\u6435\ud51e)) {
                var_4_7B = invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
                var_5_82 = invokevirtual:\u71f1\ub18d\u62da\u9255\u7ce1(\ucb79\u8350\u7bad\u392e\u51fa::\u527a\ud171\u120d\u64ab\ubf56\u6c52, var_4_7B:\ucb79\u8350\u7bad\u392e\u51fa)
                var_6_8F = invokevirtual:Iterator(ArrayList::iterator, invokestatic:ArrayList(Lists::newArrayList, invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>[expected:Iterable](\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, var_4_7B:\ucb79\u8350\u7bad\u392e\u51fa)))
                
                loop {
                    var_2_C6 = and:int(var_2_C6:int, ldc:int(-8635721))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_8F:Iterator))) {
                        looporswitchbreak()
                    }
                    
                    var_7_B2 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_6_8F:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u71f1\ub18d\u62da\u9255\u7ce1::\uc4d2\uc2bd\u965f\uc29a\u760c\ua068, var_5_82:\u71f1\ub18d\u62da\u9255\u7ce1, invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, var_7_B2:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])))) {
                        invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\uc246\u97b7\u6ec6\uc87f\uc238\u3e75, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_7_B2:\u51fa\u6c52\u7330\u7330\u960f), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, ldc:String("multiplayer.disconnect.not_whitelisted")))
                    }
                    
                    var_2_C6 = and:int(var_2_C6:int, ldc:int(-379921090))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\u4f52\ua068\u4f52\u47c2\u4492 \uc246\u6b5f\uf94d\u8c8a\ub102\uc31c() {
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
            return:\u4f52\ua068\u4f52\u47c2\u4492(getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u88c5\ud171\ub113\u6435\ud51e::\u92ee\u6bb9\uc7fe\ub102\u52d3\u92ee, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u40a9\ud51e\ua562\ucef1\u873d \u8aa5\uc7fe\u8d98\u47c2\ua562\u6d69() {
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
            return:\u40a9\ud51e\ua562\ucef1\u873d(invokevirtual:\u40a9\ud51e\ua562\ucef1\u873d(\u7bad\u76bc\uae5d\u12cb\u16f6::\ub70c\uc3e3\u8d98\uc29a\ubcb0\ud523, getfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 \u8413\ub70c\u183a\ub171\u5140\u759a() {
        var_3_66 : \ube23\uc238\u5140\u4cd9\u8aa5
        
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
            var_3_66 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u88c5\ud171\ub113\u6435\ud51e::\u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e)
            return:\u8413\u5140\u64f2\uc9f6\u9937(initobject:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::<init>, this:\u88c5\ud171\ub113\u6435\ud51e[expected:\u4179\ud36e\u4bc8\u446c\u3504], ternaryop:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(cmpne:boolean(var_3_66:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5()), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u8c8a\uc87f\u7d52\uc238\u6d69\ubcb0, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ube23\uc238\u5140\u4cd9\u8aa5::\u873d\u6435\u5245\ud12e\uae87\u64f2, var_3_66:\ube23\uc238\u5140\u4cd9\u8aa5)), getstatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u52d3\ua6bd\ubefe\u836c\u6d99\uc2bd)), getstatic:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2(\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2::\ub171\u97e6\u516c\u3d4b\u156b\u6435), var_3_66:\ube23\uc238\u5140\u4cd9\u8aa5, and:int(ldc:int(21836), ldc:int(517)), ldc:String("Server"), initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, ldc:String("Server")), this:\u88c5\ud171\ub113\u6435\ud51e, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ua562\ub18d\u7006\u8413\u3dd3\ubff1() {
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
            return:boolean(xor:int[expected:boolean](ldc:int(10274), ldc:int(10275)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7330\u759a\u92ff\u67d0\u8d90\uae87() {
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
            return:boolean(xor:int[expected:boolean](ldc:int(4160), ldc:int(4161)))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8350\u76bc\u67e9\uff55\u8bb0\u385b \uc229\u6c56\u5fe1\u3e75\u67d0\u516c() {
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
            return:\u8350\u76bc\u67e9\uff55\u8bb0\u385b(invokevirtual:\u8350\u76bc\u67e9\uff55\u8bb0\u385b(\u7bad\u76bc\uae5d\u12cb\u16f6::\ua562\uc238\u836c\u7043\u7c6b\ud36e, getfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85 \u3e2a\u6d99\u92ee\ua3b4\u4c04\u7e3f() {
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
            return:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85(invokevirtual:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85(\u7bad\u76bc\uae5d\u12cb\u16f6::\uc246\u0c95\u9af2\u71ae\u99f7\ub102, getfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u9033\uc2e8\u72f1\u8d98\u6d69 \u494c\u7043\ub7dc\u0b8e\uceb8\ucb79() {
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
            return:\u9033\uc2e8\u72f1\u8d98\u6d69(getfield:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\u62da\u9033\uc84e\u9255\uf995, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u516c\u8aa5\u8df4\u71f1\u8258\u4d85 \u0a06\ua3b4\u3776\ubf56\uc29a\u12b2() {
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
        
        if (cmpne:boolean(getfield:\u516c\u8aa5\u8df4\u71f1\u8258\u4d85(\u88c5\ud171\ub113\u6435\ud51e::\ud7e8\u0800\u7ce1\u12cb\u759a\u8bb0, this:\u88c5\ud171\ub113\u6435\ud51e), aconstnull:\u516c\u8aa5\u8df4\u71f1\u8258\u4d85())) {
            return:\u516c\u8aa5\u8df4\u71f1\u8258\u4d85(getfield:\u516c\u8aa5\u8df4\u71f1\u8258\u4d85(\u88c5\ud171\ub113\u6435\ud51e::\ud7e8\u0800\u7ce1\u12cb\u759a\u8bb0, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        athrow(initobject:NullPointerException(NullPointerException::<init>, ldc:String("Called before server init")))
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u7ce1\u5d20\u1187\u5f50\ua068 \u8308\u6bb9\u8308\u7e3f\u965f\ubb2b() {
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
            return:\u7ce1\u5d20\u1187\u5f50\ua068(invokevirtual:\u7ce1\u5d20\u1187\u5f50\ua068(\u7bad\u76bc\uae5d\u12cb\u16f6::\u8308\uc4d2\u983f\u4f52\u7006\ubefe, getfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\ufcaf\u3c25\u071d\u97b7.\uae5d\u7af6\u52d3\u6c52\u839e \u3504\u624e\u0b8e\u965f\ubf56\uc4d2() {
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
            return:\uae5d\u7af6\u52d3\u6c52\u839e(invokevirtual:\uae5d\u7af6\u52d3\u6c52\u839e(\u7bad\u76bc\uae5d\u12cb\u16f6::\uc2bd\u6c56\u392e\uae87\u8389\ub6ab, getfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7e3f\ubff1\u718f\ub171\u72f1 \u8cae\u1187\uc910\u64f2\ua6bd\u36d3() {
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
            return:\u7e3f\ubff1\u718f\ub171\u72f1(invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u88c5\ud171\ub113\u6435\ud51e::\u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\u600f\u64ab\uc9f6\u2dcc\u62da \ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe() {
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
            return:\u600f\u64ab\uc9f6\u2dcc\u62da(getfield:\u600f\u64ab\uc9f6\u2dcc\u62da(\u88c5\ud171\ub113\u6435\ud51e::\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7c6b\u92ff\u6c56\u56bd\u3c25\u624e() {
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
            return:boolean(getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u12cb\ub6ab\u36d3\ua61f\u59ec\ud171, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public void \u12cb\u7e3f\u6fb0\u2dcc\u12cb\u62da(boolean p0) {
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
            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u12cb\ub6ab\u36d3\ua61f\u59ec\ud171, this:\u88c5\ud171\ub113\u6435\ud51e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \u5654\u624e\u4cd9\u8bb0\u62da\u7049() {
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
            return:float(getfield:float(\u88c5\ud171\ub113\u6435\ud51e::\u600f\u7006\u6435\ud217\uc9f6\u6c52, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public int \ub19c\uc84e\u5d20\u4f52\u4bc8\ua068(com.mojang.authlib.GameProfile p0) {
        var_2_17F : int
        var_4_8D : \u98a4\ua562\u624e\ud4fe\ubb2b
        stack_19B_0 : int [generated]
        
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
        var_2_17F = and:int(ldc:int(563813331), ldc:int(-155752))
        
        if (logicalnot:boolean(invokevirtual:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\ub7dc\u624e\u183a\uc9f6\u8350\uae87, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, this:\u88c5\ud171\ub113\u6435\ud51e), p0:GameProfile))) {
            return:int(and:int(ldc:int(-792), ldc:int(791)))
        }
        
        var_4_8D = checkcast:\u98a4\ua562\u624e\ud4fe\ubb2b(\ub113\uc4d2\u183a\u527a\u6435.\u98a4\ua562\u624e\ud4fe\ubb2b.class, invokevirtual:\u98a4\ua562\u624e\ud4fe\ubb2b(\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \u98a4\ua562\u624e\ud4fe\ubb2b>::\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe, invokevirtual:\ub113\u1833\u392e\ubf56\u97e6[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \u98a4\ua562\u624e\ud4fe\ubb2b>](\ucb79\u8350\u7bad\u392e\u51fa::\u416d\u72f1\u8d98\ud4fe\u88c5\u4daf, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, this:\u88c5\ud171\ub113\u6435\ud51e)), p0:GameProfile))
        
        if (cmpeq:boolean(var_4_8D:\u98a4\ua562\u624e\ud4fe\ubb2b, aconstnull:\u98a4\ua562\u624e\ud4fe\ubb2b())) {
            loop {
                if (cmpeq:boolean(and:int(var_2_17F:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0345)
                }
                
                if (cmpeq:boolean(and:int(var_2_17F:int, ldc:int(128)), ldc:int(0))) {
                    var_2_17F = and:int(var_2_17F:int, ldc:int(-2142350335))
                    goto(Label_0250)
                }
                
                if (cmpeq:boolean(and:int(var_2_17F:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_17F = and:int(var_2_17F:int, ldc:int(-113804806))
                }
                else {
                    var_2_17F = and:int(var_2_17F:int, ldc:int(664352699))
                    
                    if (invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u839e\uc229\u6c56\ud4fe\u9033\u69d9, this:\u88c5\ud171\ub113\u6435\ud51e, p0:GameProfile)) {
                        return:int(xor:int(ldc:int(4103), ldc:int(4099)))
                    }
                }
                
                Label_0204:
                
                if (cmpeq:boolean(and:int(var_2_17F:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0345)
                }
                
                if (cmpne:boolean(and:int(var_2_17F:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_17F:int, ldc:int(4)), ldc:int(0))) {
                        var_2_17F = and:int(var_2_17F:int, ldc:int(1858084960))
                        loopcontinue()
                    }
                    
                    var_2_17F = and:int(var_2_17F:int, ldc:int(794640349))
                    
                    if (invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u946b\u965f\u2dcc\ud217\u40a9\u3504, this:\u88c5\ud171\ub113\u6435\ud51e)) {
                        if (logicalnot:boolean(invokevirtual:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\u5245\u759a\u8389\ucfaf\u72f1\u9937, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, this:\u88c5\ud171\ub113\u6435\ud51e)))) {
                            goto(Label_0345)
                        }
                        
                        stack_19B_0 = xor:int(ldc:int(2323), ldc:int(2327))
                        looporswitchbreak()
                    }
                }
                
                Label_0250:
                
                if (cmpeq:boolean(and:int(var_2_17F:int, ldc:int(1024)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_17F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_17F = and:int(var_2_17F:int, ldc:int(-1780229114))
                        goto(Label_0204)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_17F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_17F = and:int(var_2_17F:int, ldc:int(1170716398))
                        loopcontinue()
                    }
                    
                    return:int(invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u92ff\ua6bd\u120d\uc31c\u6fb0\u156b, this:\u88c5\ud171\ub113\u6435\ud51e))
                }
                
                Label_0345:
                
                if (cmpne:boolean(and:int(var_2_17F:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_17F = and:int(var_2_17F:int, ldc:int(1619843228))
                    goto(Label_0250)
                }
                
                if (cmpne:boolean(and:int(var_2_17F:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0204)
                }
                
                if (cmpne:boolean(and:int(var_2_17F:int, ldc:int(16)), ldc:int(0))) {
                    var_2_17F = and:int(var_2_17F:int, ldc:int(-1927544870))
                    stack_19B_0 = and:int(ldc:int(3645), ldc:int(-3646))
                    looporswitchbreak()
                }
            }
            
            return:int(stack_19B_0:int)
        }
        
        return:int(invokevirtual:int(\u98a4\ua562\u624e\ud4fe\ubb2b::\u718f\u7330\uc229\ud217\uc87f\u8709, var_4_8D:\u98a4\ua562\u624e\ud4fe\ubb2b))
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\u624e\u416d\u97b7\u1187\u8df4\u71ae \u983f\ucfaf\u927d\u93a2\ubded\u873d() {
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
            return:\u624e\u416d\u97b7\u1187\u8df4\u71ae(getfield:\u624e\u416d\u97b7\u1187\u8df4\u71ae(\u88c5\ud171\ub113\u6435\ud51e::\uae87\u8308\u6fb0\u3bd6\uae5d\uc229, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d \u8bb0\u5db4\uae5d\u40a9\ud158\ud7e8() {
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
            return:\ubf56\u64f2\u392e\u98a4\u120d(getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u839e\uc229\u6c56\ud4fe\u9033\u69d9(com.mojang.authlib.GameProfile p0);
    
    public void \uc2bd\uff55\u4e72\u983f\ub8be\u6ec6(java.nio.file.Path p0) {
        var_2_61 : int
        var_4_6B : Path
        var_5_7B : Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>>
        var_6_E3 : Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>
        var_7_F2 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_8_10A : Path
        
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
            var_2_61 = and:int(ldc:int(-780555450), ldc:int(935062400))
            var_4_6B = invokeinterface:Path(Path::resolve, p0:Path, ldc:String("levels"))
            var_5_7B = invokeinterface:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>>(Set<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>>::iterator, invokeinterface:Set<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>>(Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>::entrySet, getfield:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u8c8a\u3e2a\u8df4\u718f\u69d9\u3776, this:\u88c5\ud171\ub113\u6435\ud51e)))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(364640099))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_7B:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>>))) {
                    looporswitchbreak()
                }
                
                var_6_E3 = checkcast:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(java.util.Map.Entry<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5>.class, invokeinterface:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>(Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>>::next, var_5_7B:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>>))
                var_7_F2 = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, checkcast:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>.class, invokeinterface:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>::getKey, var_6_E3:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>)))
                var_8_10A = invokeinterface:Path(Path::resolve, invokeinterface:Path(Path::resolve, var_4_6B:Path, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, var_7_F2:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, var_7_F2:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
                invokestatic:Path(Files::createDirectories, var_8_10A:Path, newarray:FileAttribute[](java.nio.file.attribute.FileAttribute.class, and:int(ldc:int(-19813), ldc:int(3428))))
                invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u600f\ud12e\ud4fe\u6c56\u5654\ud7e8, checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>::getValue, var_6_E3:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, \ube23\uc238\u5140\u4cd9\u8aa5>)), var_8_10A:Path)
            }
            
            invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u3bc9\u9033\u6bb9\u965f\ua562\u527a, this:\u88c5\ud171\ub113\u6435\ud51e, invokeinterface:Path(Path::resolve, p0:Path, ldc:String("gamerules.txt")))
            invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\uc87f\u4975\ub8be\u4e72\u7c6b\u6cfe, this:\u88c5\ud171\ub113\u6435\ud51e, invokeinterface:Path(Path::resolve, p0:Path, ldc:String("classpath.txt")))
            invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u960f\u4bc8\u6b5f\u3776\u873d\ud4fe, this:\u88c5\ud171\ub113\u6435\ud51e, invokeinterface:Path(Path::resolve, p0:Path, ldc:String("example_crash.txt")))
            invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u0800\u8413\u3d64\u8258\u0c95\u965f, this:\u88c5\ud171\ub113\u6435\ud51e, invokeinterface:Path(Path::resolve, p0:Path, ldc:String("stats.txt")))
            invokespecial:void(\u88c5\ud171\ub113\u6435\ud51e::\u965f\ud36e\u4975\ub102\u6198\u416d, this:\u88c5\ud171\ub113\u6435\ud51e, invokeinterface:Path(Path::resolve, p0:Path, ldc:String("threads.txt")))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u0800\u8413\u3d64\u8258\u0c95\u965f(java.nio.file.Path p0) {
        var_4_76 : BufferedWriter
        var_5_79 : Throwable
        stack_9D_0 : BufferedWriter [generated]
        stack_9A_0 : String [generated]
        expr_87 : Object[] [generated]
        stack_C2_0 : BufferedWriter [generated]
        stack_BF_0 : String [generated]
        expr_AC : Object[] [generated]
        stack_E7_0 : BufferedWriter [generated]
        stack_E4_0 : String [generated]
        expr_D1 : Object[] [generated]
        stack_108_0 : BufferedWriter [generated]
        stack_105_0 : String [generated]
        expr_F6 : Object[] [generated]
        var_6_13D : Throwable
        var_8_162 : Throwable
        
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
            var_4_76 = invokestatic:BufferedWriter(Files::newBufferedWriter, p0:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(9611), ldc:int(-25996))))
            var_5_79 = aconstnull:Throwable()
            
            try {
                stack_9D_0 = var_4_76:BufferedWriter
                stack_9A_0 = ldc:String("pending_tasks: %d\n")
                expr_87 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(22809), ldc:int(8325)))
                storeelement:Object(expr_87:Object[], and:int(ldc:int(31000), ldc:int(-31513)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u16f6\u6bb9\u6fb0\u5245\ua6bd\ubded, this:\u88c5\ud171\ub113\u6435\ud51e[expected:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a>])))
                invokevirtual:void(Writer::write, stack_9D_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_9A_0:String, expr_87:Object[]))
                stack_C2_0 = var_4_76:BufferedWriter
                stack_BF_0 = ldc:String("average_tick_time: %f\n")
                expr_AC = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-26496), ldc:int(-26495)))
                storeelement:Object(expr_AC:Object[], and:int(ldc:int(-31874), ldc:int(31872)), invokestatic:Float[expected:Object](Float::valueOf, invokevirtual:float(\u88c5\ud171\ub113\u6435\ud51e::\u5654\u624e\u4cd9\u8bb0\u62da\u7049, this:\u88c5\ud171\ub113\u6435\ud51e)))
                invokevirtual:void(Writer::write, stack_C2_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_BF_0:String, expr_AC:Object[]))
                stack_E7_0 = var_4_76:BufferedWriter
                stack_E4_0 = ldc:String("tick_times: %s\n")
                expr_D1 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(21769), ldc:int(8327)))
                storeelement:Object(expr_D1:Object[], and:int(ldc:int(3157), ldc:int(-3158)), invokestatic:String[expected:Object](Arrays::toString, getfield:long[](\u88c5\ud171\ub113\u6435\ud51e::\ubcb0\ub70c\u6c52\u3776\u93a2\u8df4, this:\u88c5\ud171\ub113\u6435\ud51e)))
                invokevirtual:void(Writer::write, stack_E7_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_E4_0:String, expr_D1:Object[]))
                stack_108_0 = var_4_76:BufferedWriter
                stack_105_0 = ldc:String("queue: %s\n")
                expr_F6 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(16405), ldc:int(779)))
                storeelement:Object(expr_F6:Object[], and:int(ldc:int(-20746), ldc:int(20745)), invokestatic:Executor[expected:Object](\ud217\u3504\u760c\uc29a\u97e6\ube23::\u760c\uceb8\ub32d\ub113\u120d\u4ab3))
                invokevirtual:void(Writer::write, stack_108_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_105_0:String, expr_F6:Object[]))
            }
            catch (java.lang.Throwable var_6_13D) {
                var_5_79 = var_6_13D:Throwable
                athrow(var_6_13D:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_76:BufferedWriter, aconstnull:BufferedWriter())) {
                    if (cmpne:boolean(var_5_79:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(Writer::close, var_4_76:BufferedWriter[expected:Writer])
                        }
                        catch (java.lang.Throwable var_8_162) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_79:Throwable, var_8_162:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(Writer::close, var_4_76:BufferedWriter[expected:Writer])
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u960f\u4bc8\u6b5f\u3776\u873d\ud4fe(java.nio.file.Path p0) {
        var_4_7C : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_5_9F : BufferedWriter
        var_6_A2 : Throwable
        var_7_E0 : Throwable
        var_9_105 : Throwable
        
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
            var_4_7C = initobject:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::<init>, ldc:String("Server dump"), initobject:Exception[expected:Throwable](Exception::<init>, ldc:String("dummy")))
            invokevirtual:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u88c5\ud171\ub113\u6435\ud51e::\u3dd3\u76bc\u4f4a\u494c\ubded\u600f, this:\u88c5\ud171\ub113\u6435\ud51e, var_4_7C:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
            var_5_9F = invokestatic:BufferedWriter(Files::newBufferedWriter, p0:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(-444), ldc:int(442))))
            var_6_A2 = aconstnull:Throwable()
            
            try {
                invokevirtual:void(Writer::write, var_5_9F:BufferedWriter[expected:Writer], invokevirtual:String(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubded\uc238\u0b8e\u2dcc\u69d9\u4cd9, var_4_7C:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e))
            }
            catch (java.lang.Throwable var_7_E0) {
                var_6_A2 = var_7_E0:Throwable
                athrow(var_7_E0:Throwable)
            }
            finally {
                if (cmpne:boolean(var_5_9F:BufferedWriter, aconstnull:BufferedWriter())) {
                    if (cmpne:boolean(var_6_A2:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(Writer::close, var_5_9F:BufferedWriter[expected:Writer])
                        }
                        catch (java.lang.Throwable var_9_105) {
                            invokevirtual:void(Throwable::addSuppressed, var_6_A2:Throwable, var_9_105:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(Writer::close, var_5_9F:BufferedWriter[expected:Writer])
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3bc9\u9033\u6bb9\u965f\ua562\u527a(java.nio.file.Path p0) {
        var_4_76 : BufferedWriter
        var_5_79 : Throwable
        var_6_7E : ArrayList
        var_8_9C : Iterator<String>
        var_6_F4 : Throwable
        var_11_119 : Throwable
        
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
            var_4_76 = invokestatic:BufferedWriter(Files::newBufferedWriter, p0:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(3042), ldc:int(-3043))))
            var_5_79 = aconstnull:Throwable()
            
            try {
                var_6_7E = invokestatic:ArrayList(Lists::newArrayList)
                invokestatic:void(\u7e3f\ubff1\u718f\ub171\u72f1::\u99f7\u0800\ud217\uc4d2\u9a18\ub19c, initobject:\u67d0\uc910\u839e\uae87\ubff1(\u67d0\uc910\u839e\uae87\ubff1::<init>, this:\u88c5\ud171\ub113\u6435\ud51e, var_6_7E:ArrayList<String>[expected:List], invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\u88c5\ud171\ub113\u6435\ud51e::\u8cae\u1187\uc910\u64f2\ua6bd\u36d3, this:\u88c5\ud171\ub113\u6435\ud51e)))
                var_8_9C = invokeinterface:Iterator<String>(List<String>::iterator, var_6_7E:ArrayList<String>[expected:List<String>])
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_8_9C:Iterator<String>)) {
                    invokevirtual:void(Writer::write, var_4_76:BufferedWriter[expected:Writer], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_8_9C:Iterator<String>)))
                }
            }
            catch (java.lang.Throwable var_6_F4) {
                var_5_79 = var_6_F4:Throwable
                athrow(var_6_F4:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_76:BufferedWriter, aconstnull:BufferedWriter())) {
                    if (cmpne:boolean(var_5_79:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(Writer::close, var_4_76:BufferedWriter[expected:Writer])
                        }
                        catch (java.lang.Throwable var_11_119) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_79:Throwable, var_11_119:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(Writer::close, var_4_76:BufferedWriter[expected:Writer])
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc87f\u4975\ub8be\u4e72\u7c6b\u6cfe(java.nio.file.Path p0) {
        var_4_76 : BufferedWriter
        var_5_79 : Throwable
        var_8_9A : Iterator<String>
        var_6_FA : Throwable
        var_11_11F : Throwable
        
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
            var_4_76 = invokestatic:BufferedWriter(Files::newBufferedWriter, p0:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(-20764), ldc:int(283))))
            var_5_79 = aconstnull:Throwable()
            
            try {
                var_8_9A = invokeinterface:Iterator<String>(Iterable<String>::iterator, invokevirtual:Iterable(Splitter::split, invokestatic:Splitter(Splitter::on, invokestatic:String(System::getProperty, ldc:String("path.separator"))), invokestatic:String[expected:CharSequence](System::getProperty, ldc:String("java.class.path"))))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_8_9A:Iterator<String>)) {
                    invokevirtual:void(Writer::write, var_4_76:BufferedWriter[expected:Writer], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_8_9A:Iterator<String>)))
                    invokevirtual:void(Writer::write, var_4_76:BufferedWriter[expected:Writer], ldc:String("\n"))
                }
            }
            catch (java.lang.Throwable var_6_FA) {
                var_5_79 = var_6_FA:Throwable
                athrow(var_6_FA:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_76:BufferedWriter, aconstnull:BufferedWriter())) {
                    if (cmpne:boolean(var_5_79:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(Writer::close, var_4_76:BufferedWriter[expected:Writer])
                        }
                        catch (java.lang.Throwable var_11_11F) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_79:Throwable, var_11_11F:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(Writer::close, var_4_76:BufferedWriter[expected:Writer])
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u965f\ud36e\u4975\ub102\u6198\u416d(java.nio.file.Path p0) {
        var_5_88 : ThreadInfo[]
        var_6_B1 : BufferedWriter
        var_7_B4 : Throwable
        var_8_B8 : ThreadInfo[]
        var_9_BD : int
        var_10_C6 : int
        var_8_123 : Throwable
        var_13_148 : Throwable
        
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
            var_5_88 = invokeinterface:ThreadInfo[](ThreadMXBean::dumpAllThreads, invokestatic:ThreadMXBean(ManagementFactory::getThreadMXBean), and:int[expected:boolean](ldc:int(153), ldc:int(19749)), xor:int[expected:boolean](ldc:int(17184), ldc:int(17185)))
            invokestatic:void(Arrays::sort, var_5_88:ThreadInfo[], invokestatic:Comparator<? super ThreadInfo>(Comparator<Object>::comparing, invokedynamic:Function<? super ThreadInfo, String>(apply:()Ljava/util/function/Function;)))
            var_6_B1 = invokestatic:BufferedWriter(Files::newBufferedWriter, p0:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(-6196), ldc:int(6195))))
            var_7_B4 = aconstnull:Throwable()
            
            try {
                var_8_B8 = var_5_88:ThreadInfo[]
                var_9_BD = arraylength:int(var_8_B8:ThreadInfo[])
                var_10_C6 = and:int(ldc:int(-24028), ldc:int(7555))
                
                while (cmplt:boolean(var_10_C6:int, var_9_BD:int)) {
                    invokevirtual:void(Writer::write, var_6_B1:BufferedWriter[expected:Writer], invokevirtual:String(ThreadInfo::toString, loadelement:ThreadInfo(var_8_B8:ThreadInfo[], var_10_C6:int)))
                    invokevirtual:void(Writer::write, var_6_B1:BufferedWriter[expected:Writer], ldc:int(10))
                    inc:int(var_10_C6, ldc:int(1))
                }
            }
            catch (java.lang.Throwable var_8_123) {
                var_7_B4 = var_8_123:Throwable
                athrow(var_8_123:Throwable)
            }
            finally {
                if (cmpne:boolean(var_6_B1:BufferedWriter, aconstnull:BufferedWriter())) {
                    if (cmpne:boolean(var_7_B4:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(Writer::close, var_6_B1:BufferedWriter[expected:Writer])
                        }
                        catch (java.lang.Throwable var_13_148) {
                            invokevirtual:void(Throwable::addSuppressed, var_7_B4:Throwable, var_13_148:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(Writer::close, var_6_B1:BufferedWriter[expected:Writer])
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u156b\uc31c\ubf56\u3dd3\u47c2\ucef1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u5db4\u8640\u6cfe\u9a18\ubff1 p0) {
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
            
            if (getfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\uf94d\u71f1\u8cae\u3bc9\ub1b9, this:\u88c5\ud171\ub113\u6435\ud51e)) {
                putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\uf94d\u71f1\u8cae\u3bc9\ub1b9, this:\u88c5\ud171\ub113\u6435\ud51e, and:int[expected:boolean](ldc:int(-1537), ldc:int(1536)))
                invokevirtual:void(\u56bd\u6b0d\u3711\ub18d\u12b2::\u494c\ub171\u7af6\u6ec6\uc29a\u36d3, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\ub8be\u6fb0\u8bb0\ub7dc\u98a4, this:\u88c5\ud171\ub113\u6435\ud51e))
            }
            
            putfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e, invokestatic:\ubf56\u64f2\u392e\u98a4\u120d(\u5db4\u8640\u6cfe\u9a18\ubff1::\u6d69\u5245\u88c5\u4492\ua6bd\u9937, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\u56bd\u6b0d\u3711\ub18d\u12b2::\u67d0\u6198\ub83f\u0c95\u392e\u7049, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\ub8be\u6fb0\u8bb0\ub7dc\u98a4, this:\u88c5\ud171\ub113\u6435\ud51e)), p0:\u5db4\u8640\u6cfe\u9a18\ubff1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6bb9\u946b\u120d\u6435\ub102\u983f(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u5db4\u8640\u6cfe\u9a18\ubff1 p0) {
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
            
            if (cmpne:boolean(p0:\u5db4\u8640\u6cfe\u9a18\ubff1, aconstnull:\u5db4\u8640\u6cfe\u9a18\ubff1())) {
                invokevirtual:void(\u5db4\u8640\u6cfe\u9a18\ubff1::\u99f7\ub83f\ucef1\u8709\u0b8e\uae5d, p0:\u5db4\u8640\u6cfe\u9a18\ubff1)
            }
            
            putfield:\ubf56\u64f2\u392e\u98a4\u120d(\u88c5\ud171\ub113\u6435\ud51e::\u7873\u1187\u183a\u385b\u4179\u5fe1, this:\u88c5\ud171\ub113\u6435\ud51e, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\u56bd\u6b0d\u3711\ub18d\u12b2::\u67d0\u6198\ub83f\u0c95\u392e\u7049, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\ub8be\u6fb0\u8bb0\ub7dc\u98a4, this:\u88c5\ud171\ub113\u6435\ud51e)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u983f\u3711\ud171\ub32d\ubded\uc3e3() {
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
            return:boolean(invokevirtual:boolean(\u56bd\u6b0d\u3711\ub18d\u12b2::\ucef1\ubded\u156b\u8389\u3bd6\u97b7, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\ub8be\u6fb0\u8bb0\ub7dc\u98a4, this:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\u51fa\uc910\u59ec\uc29a\u12b2() {
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
            putfield:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\uf94d\u71f1\u8cae\u3bc9\ub1b9, this:\u88c5\ud171\ub113\u6435\ud51e, and:int[expected:boolean](ldc:int(8355), ldc:int(4105)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u4179\u416d\uc910\u8d98 \u5bc4\uc4d2\u64f2\u16f6\u3d64\uafe7() {
        var_3_69 : \u4492\u4179\u416d\uc910\u8d98
        
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
            var_3_69 = invokevirtual:\u4492\u4179\u416d\uc910\u8d98(\u56bd\u6b0d\u3711\ub18d\u12b2::\u516c\u67d0\u98a4\uc84e\u8308\u4f52, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\ub8be\u6fb0\u8bb0\ub7dc\u98a4, this:\u88c5\ud171\ub113\u6435\ud51e))
            invokevirtual:void(\u56bd\u6b0d\u3711\ub18d\u12b2::\u8df4\u946b\u5245\u0c95\u8cae\ubb2b, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\ub8be\u6fb0\u8bb0\ub7dc\u98a4, this:\u88c5\ud171\ub113\u6435\ud51e))
            return:\u4492\u4179\u416d\uc910\u8d98(var_3_69:\u4492\u4179\u416d\uc910\u8d98)
        }
        
        goto(Label_0006)
    }
    
    public java.nio.file.Path \ucb79\u8df4\u3711\u9af2\u5bc4\u6c52(\u6435\ub8be\u718f\u6b0d\u67e9.\u51b2\ub6ab\u5654\u647c\ub102\u8d90 p0) {
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
            return:Path(invokevirtual:Path(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u759a\u7bad\u59ec\u3d64\u7043\u3bc9, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\u183a\uae87\u6435\u99f7\u4f4a\ub32d, this:\u88c5\ud171\ub113\u6435\ud51e), p0:\u51b2\ub6ab\u5654\u647c\ub102\u8d90))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub171\u8df4\ub70c\u7006\uc238\u3bc9() {
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
            return:boolean(and:int[expected:boolean](ldc:int(1617), ldc:int(16385)))
        }
        
        goto(Label_0006)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 \u12cb\ud7e8\u071d\u5f50\ud158\u9a18() {
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
            return:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\u88c5\ud171\ub113\u6435\ud51e::\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec \uafe7\u47c2\uff55\ub19c\uc9f6\u61a4() {
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
            return:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f \u64ab\u3711\ub1b9\u3e75\u0800\u7bad() {
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
            return:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(getfield:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f](\u88c5\ud171\ub113\u6435\ud51e::\uf995\ub113\u51fa\u9937\u6bb9\uae87, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.filter.IChatFilter \ub171\u6bb9\u7e3f\u40a9\u7ce1\u3bd6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            return:IChatFilter(aconstnull:IChatFilter())
        }
        
        goto(Label_0006)
    }
    
    public void run(java.lang.Runnable p0) {
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
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::run, this:\u88c5\ud171\ub113\u6435\ud51e, checkcast:\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a.class, p0:Runnable[expected:\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5fe1\u8413\uafe7\u98a4\ud158\u67d0(java.lang.Runnable p0) {
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
            return:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u5fe1\u8413\uafe7\u98a4\ud158\u67d0, this:\u88c5\ud171\ub113\u6435\ud51e, checkcast:\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a.class, p0:Runnable[expected:\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a])))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Runnable \u4c04\ud217\u7330\u67e9\u8389\u4c2b(java.lang.Runnable p0) {
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
            return:Runnable(invokevirtual:\u8389\u4c2b\u4f52\ud217\uc3e3\u4f4a[expected:Runnable](\u88c5\ud171\ub113\u6435\ud51e::\u4c04\ud217\u7330\u67e9\u8389\u4c2b, this:\u88c5\ud171\ub113\u6435\ud51e, p0:Runnable))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc7fe\ud217\u416d\u4c2b\u47c2\ufe34$11(java.util.Collection p0, java.lang.String p1) {
        var_2_61 : int
        stack_8D_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-1830838614), ldc:int(-220686873))
            
            if (invokeinterface:boolean(Collection::contains, p0:Collection, p1:String[expected:Object])) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-555962201))
                stack_8D_0 = and:int(ldc:int(-15442), ldc:int(15440))
            }
            else {
                stack_8D_0 = xor:int(ldc:int(16412), ldc:int(16413))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0$10(java.util.Collection p0, \u59ec\u8413\u97e6\uc229\u3776.\u7bad\u76bc\uae5d\u12cb\u16f6 p1) {
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
            invokevirtual:void(\u7bad\u76bc\uae5d\u12cb\u16f6::close, getfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e))
            putfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e, p1:\u7bad\u76bc\uae5d\u12cb\u16f6)
            invokevirtual:void(\u4f52\ua068\u4f52\u47c2\u4492::\u16f6\u392e\u3776\u64f2\u9937\u47c2, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u88c5\ud171\ub113\u6435\ud51e::\u92ee\u6bb9\uc7fe\ub102\u52d3\u92ee, this:\u88c5\ud171\ub113\u6435\ud51e), p0:Collection<String>)
            invokeinterface:void(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ua562\u62da\uf995\u62da\uc7fe\ub1b9, getfield:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\u6b5f\u47c2\u12cb\u97e6\ub32d\u5bc4, this:\u88c5\ud171\ub113\u6435\ud51e), invokestatic:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u88c5\ud171\ub113\u6435\ud51e::\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u88c5\ud171\ub113\u6435\ud51e::\u92ee\u6bb9\uc7fe\ub102\u52d3\u92ee, this:\u88c5\ud171\ub113\u6435\ud51e)))
            invokevirtual:void(\u7bad\u76bc\uae5d\u12cb\u16f6::\u516c\ua6bd\u7049\ud217\ud4fe\ua6bd, p1:\u7bad\u76bc\uae5d\u12cb\u16f6)
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\ua3b4\u836c\u983f\u51b2\u8aa5\u7ce1, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, this:\u88c5\ud171\ub113\u6435\ud51e))
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\ufcaf\u12cb\u0800\u7049\ucfaf\u836c, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, this:\u88c5\ud171\ub113\u6435\ud51e))
            invokevirtual:void(\ua3b4\u4179\uae5d\ub102\u9a18\u624e::\u4492\ud158\u4c2b\u6cfe\u56bd\ubff1, getfield:\ua3b4\u4179\uae5d\ub102\u9a18\u624e(\u88c5\ud171\ub113\u6435\ud51e::\u3711\u4d85\u3776\ua562\u7873\u51fa, this:\u88c5\ud171\ub113\u6435\ud51e), invokevirtual:\u7ce1\u9937\uf9c5\u983f\u98a4(\u7bad\u76bc\uae5d\u12cb\u16f6::\ub171\u4f52\u92ee\ub1b9\u6198\u3e75, getfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e)))
            invokevirtual:void(\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1::\u4d85\uafe7\uc4d2\ubff1\u51b2\u59ec, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\u88c5\ud171\ub113\u6435\ud51e::\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a, this:\u88c5\ud171\ub113\u6435\ud51e), invokevirtual:\u6c52\u52d3\u516c\uae87\uae5d(\u7bad\u76bc\uae5d\u12cb\u16f6::\u6cfe\u92ff\uc84e\u760c\u0c95\uc238, getfield:\u7bad\u76bc\uae5d\u12cb\u16f6(\u88c5\ud171\ub113\u6435\ud51e::\u3776\u647c\u5f50\u51fa\uceb8\u6bb9, this:\u88c5\ud171\ub113\u6435\ud51e)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletionStage lambda$\u9033\u527a\ucb79\uc7fe\u3d64\u51b2$9(com.google.common.collect.ImmutableList p0) {
        var_2_61 : int
        stack_8C_1 : \u3c25\u40a9\ua068\u3c25\u4f52 [generated]
        
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
            var_2_61 = and:int(ldc:int(-2108889347), ldc:int(-280045827))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u7e3f\uc2bd\u647c\u3504\ud36e\u3c25, this:\u88c5\ud171\ub113\u6435\ud51e))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-2105936161))
                stack_8C_1 = getstatic:\u3c25\u40a9\ua068\u3c25\u4f52(\u3c25\u40a9\ua068\u3c25\u4f52::\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd)
            }
            else {
                stack_8C_1 = getstatic:\u3c25\u40a9\ua068\u3c25\u4f52(\u3c25\u40a9\ua068\u3c25\u4f52::\u5245\u7043\ubefe\u4c2b\u64f2\u0a06)
            }
            
            return:CompletionStage(invokestatic:CompletableFuture<\u7bad\u76bc\uae5d\u12cb\u16f6>(\u7bad\u76bc\uae5d\u12cb\u16f6::\u836c\u62da\u4c2b\u4bc8\u156b\u8350, p0:ImmutableList[expected:List<\u4f52\u7ce1\uc229\ucef1\ube23>], stack_8C_1:\u3c25\u40a9\ua068\u3c25\u4f52, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff, this:\u88c5\ud171\ub113\u6435\ud51e), getfield:Executor(\u88c5\ud171\ub113\u6435\ud51e::\u59ec\u74b1\ua61f\u8df4\u8df4\u3dd3, this:\u88c5\ud171\ub113\u6435\ud51e), this:\u88c5\ud171\ub113\u6435\ud51e[expected:Executor]))
        }
        
        goto(Label_0006)
    }
    
    private com.google.common.collect.ImmutableList lambda$\u6cfe\ua3b4\u416d\u71ae\uc910\u7e3f$8(java.util.Collection p0) {
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
            return:ImmutableList(checkcast:ImmutableList(com.google.common.collect.ImmutableList.class, invokeinterface:ImmutableList(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Stream<Object>::filter, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, p0:Collection<Object>), invokedynamic:Function<String, \ua61f\uae87\u36d3\u647c\u3d64>(apply:(L\ub113\uc4d2\u183a\u527a\u6435/\u4f52\ua068\u4f52\u47c2\u4492;)Ljava/util/function/Function;, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u88c5\ud171\ub113\u6435\ud51e::\u92ee\u6bb9\uc7fe\ub102\u52d3\u92ee, this:\u88c5\ud171\ub113\u6435\ud51e))), invokedynamic:Predicate<Object>(test:()Ljava/util/function/Predicate;)), invokedynamic:Function<? super Object, \u4f52\u7ce1\uc229\ucef1\ube23>(apply:()Ljava/util/function/Function;)), invokestatic:Collector(ImmutableList::toImmutableList))))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String lambda$\ubded\u718f\ucef1\ube23\u8640\u9af2$7() {
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
            return:String(getfield:String(\u88c5\ud171\ub113\u6435\ud51e::\u120d\u72f1\uc229\ub70c\ud12e\u7bad, this:\u88c5\ud171\ub113\u6435\ud51e))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String lambda$\ub6ab\u516c\ub70c\u76bc\u74b1\u416d$6() {
        var_1_85 : int
        var_3_69 : StringBuilder
        var_4_76 : Iterator<\ua61f\uae87\u36d3\u647c\u3d64>
        var_5_BA : \ua61f\uae87\u36d3\u647c\u3d64
        var_1_C8 : int
        
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
            var_1_85 = and:int(ldc:int(-1473849442), ldc:int(-18389000))
            var_3_69 = initobject:StringBuilder(StringBuilder::<init>)
            var_4_76 = invokeinterface:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>(Collection<\ua61f\uae87\u36d3\u647c\u3d64>::iterator, invokevirtual:Collection<\ua61f\uae87\u36d3\u647c\u3d64>(\u4f52\ua068\u4f52\u47c2\u4492::\u527a\u5fe1\u8c8a\u600f\ubefe\u4bc8, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u88c5\ud171\ub113\u6435\ud51e::\u92ee\u6bb9\uc7fe\ub102\u52d3\u92ee, this:\u88c5\ud171\ub113\u6435\ud51e)))
            
            loop {
                if (cmpne:boolean(and:int(var_1_85:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_85 = and:int(var_1_85:int, ldc:int(-444715062))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_76:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>)) {
                        var_5_BA = checkcast:\ua61f\uae87\u36d3\u647c\u3d64(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64.class, invokeinterface:\ua61f\uae87\u36d3\u647c\u3d64(Iterator<\ua61f\uae87\u36d3\u647c\u3d64>::next, var_4_76:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>))
                        
                        if (cmpgt:boolean(invokevirtual:int(StringBuilder::length, var_3_69:StringBuilder), ldc:int(0))) {
                            invokevirtual:StringBuilder(StringBuilder::append, var_3_69:StringBuilder, ldc:String(", "))
                        }
                        
                        var_1_C8 = and:int(var_1_85:int, ldc:int(1635652600))
                        invokevirtual:StringBuilder(StringBuilder::append, var_3_69:StringBuilder, invokevirtual:String(\ua61f\uae87\u36d3\u647c\u3d64::\uc2bd\u12b2\u9937\ub102\u64f2\uc238, var_5_BA:\ua61f\uae87\u36d3\u647c\u3d64))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u67d0\u7c6b\u5db4\u8df4\u120d::\u7873\uc2bd\u9033\u6fb0\u92ff\u6b0d, invokevirtual:\u67d0\u7c6b\u5db4\u8df4\u120d(\ua61f\uae87\u36d3\u647c\u3d64::\u7d52\u93a2\u4daf\ub7dc\u56bd\u7049, var_5_BA:\ua61f\uae87\u36d3\u647c\u3d64)))) {
                            invokevirtual:StringBuilder(StringBuilder::append, var_3_69:StringBuilder, ldc:String(" (incompatible)"))
                        }
                        
                        var_1_85 = and:int(var_1_C8:int, ldc:int(661594027))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_85:int, ldc:int(67108864)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_85 = and:int(var_1_85:int, ldc:int(-1169609800))
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, var_3_69:StringBuilder))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String lambda$\ub32d\u0c95\uc2bd\ucfaf\uceb8\u56bd$5() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:int(\ucb79\u8350\u7bad\u392e\u51fa::\u40a9\u8cae\uc31c\u59ec\u7043\u8350, getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e))), ldc:String(" / ")), invokevirtual:int(\ucb79\u8350\u7bad\u392e\u51fa::\ubcb0\u960f\uc29a\u4e72\ud51e\uc2bd, getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e))), ldc:String("; ")), invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>[expected:Object](\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, getfield:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u446c\u8640\ub1b9\u4c04\u71ae\uc9f6, this:\u88c5\ud171\ub113\u6435\ud51e)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u5bc4\u34df\u5f50\uf9c5\ub113\u7873$4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0) {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:Object]), ldc:String(" ")), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])))))
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255$3() {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1602241118), ldc:int(1536363607))
            
            if (invokespecial:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u392e\u47c2\u9a18\u5d20\u51fa\u56bd, this:\u88c5\ud171\ub113\u6435\ud51e)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(199522263))
                stack_8A_0 = and:int(ldc:int(13633), ldc:int(-14146))
            }
            else {
                stack_8A_0 = and:int(ldc:int(19477), ldc:int(8515))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6ec6\u4d85\u760c\u5f50\ubb2b\u2dcc$2(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:boolean(invokevirtual:boolean(\u6198\uff55\u56bd\u8308\u4cd9::\u3504\ua3b4\u6b0d\ub102\ub102\u6435, invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\uc2e8\u9255\u647c\ud171\ubf56::\u36d3\u873d\uf9c5\u3bd6\u156b\u6d69, p0:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u4daf\ub102\u12cb\u3711\ubb2b\uc7fe$1(java.lang.Thread p0, java.lang.Throwable p1) {
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
            invokeinterface:void(Logger::error, getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90), p1:Throwable[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u494c\u5245\u4ab3\u88c5\u5654\u3d4b$0(java.util.concurrent.atomic.AtomicReference p0) {
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
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u74b1\ub171\u59ec\u5140\uc29a\u446c, checkcast:\u88c5\ud171\ub113\u6435\ud51e(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e.class, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(AtomicReference<\u88c5\ud171\ub113\u6435\ud51e>::get, p0:AtomicReference<\u88c5\ud171\ub113\u6435\ud51e>)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u1833\u9a18\u0b8e\u0c95\u3a62\u965f() {
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
            return:Logger(getstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90))
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
            putstatic:Logger(\u88c5\ud171\ub113\u6435\ud51e::\u8d98\u8753\u36d3\u9a18\u34df\u8d90, invokestatic:Logger(LogManager::getLogger))
            putstatic:File(\u88c5\ud171\ub113\u6435\ud51e::\ucef1\u7d52\u1187\u4cd9\u8640\ua61f, initobject:File(File::<init>, ldc:String("usercache.json")))
            putstatic:\ubded\u9033\u5654\u6198\uc29a\uc910(\u88c5\ud171\ub113\u6435\ud51e::\u6ec6\uf995\u92ff\u392e\u3711\uc910, initobject:\ubded\u9033\u5654\u6198\uc29a\uc910(\ubded\u9033\u5654\u6198\uc29a\uc910::<init>, ldc:String("Demo World"), getstatic:\uf94d\u51b2\u1833\u34df\u1187(\uf94d\u51b2\u1833\u34df\u1187::\u120d\u3c25\ubff1\u8640\u6b5f\ud4fe), and:int[expected:boolean](ldc:int(-16480), ldc:int(16479)), getstatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u4c2b\ud217\u3776\u9af2\uc31c\ud217), and:int[expected:boolean](ldc:int(27465), ldc:int(-27466)), initobject:\u7e3f\ubff1\u718f\ub171\u72f1(\u7e3f\ubff1\u718f\ub171\u72f1::<init>), getstatic:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf::\u8308\u4e72\u5f50\u9937\u3c25\u7bad)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4492\u3776\u52d3\u1833\u8753\u7c6b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66B : int
        
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
        var_3_660 = and:int(ldc:int(-723126598), ldc:int(918804472))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u88c5\ud171\ub113\u6435\ud51e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(2129654712))
            var_5_81 = and:int(ldc:int(-30471), ldc:int(29444))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9245), ldc:int(-26430)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_660:int, ldc:int(-1614292228))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(67), ldc:int(10241)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(16832), ldc:int(16833)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_DA:int, ldc:int(-3213189))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(10280), ldc:int(10281)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(35297500))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(376405947))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-742579320))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-645885659))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1818356213))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(571352874))
                    }
                    else {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-688073672))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-490825081))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1766787519))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-368776857))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(94818739))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-51064406))
                        var_11_EB = and:int(ldc:int(-11083), ldc:int(11082))
                        goto(Label_1508)
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1356305267))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(7265035))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1293805899))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1662065538))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(501284287))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(413406389))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(491650294))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1470931119))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-589178120))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-645085125))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(488579512))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(885903532))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(2213), ldc:int(593))
                                goto(Label_1092)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1248870456))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(977592487))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1243295381))
                        var_11_EB = and:int(ldc:int(-14907), ldc:int(12858))
                    }
                    
                    Label_1092:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1926858734))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1314223440))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-631620308))
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1592858588))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-2145898374))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1581637046))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(460727072))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1886468710))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(1610473005))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1943554578))
                            goto(Label_1092)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(269789210))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(351513492))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1108673736))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1380:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2054812725))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(877724206))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-353158039))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(364967353))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(998942833))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1343484178))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(487004786))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1024338841))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1472786924))
                        var_17_66B = add:int(var_16_119:int, xor:int(ldc:int(96), ldc:int(97)))
                        looporswitchbreak()
                    }
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(-1127753032))
                
                if (cmple:boolean(var_5_81 = var_17_66B:int, sub:int(var_6_88:int, and:int(ldc:int(1283), ldc:int(2233))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(1492875338))
            goto(Label_0108)
        }
    }
}
