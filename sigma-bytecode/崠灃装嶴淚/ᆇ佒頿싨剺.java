public abstract class \u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a {
    public void \u1187\u4f52\u983f\uc2e8\u527a(java.util.concurrent.Executor p0, java.util.concurrent.Executor p1) {
        var_5_C3 : \u9a18\u62da\ucfaf\u92ee\u183a\u6198<Runnable>
        var_6_D9 : \u7ce1\ud158\u927d\u5f50\uc29a
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u1187\u4f52\u983f\uc2e8\u527a)
            putfield:Long2ObjectMap<ObjectSet<\u51fa\u6c52\u7330\u7330\u960f>>(\u1187\u4f52\u983f\uc2e8\u527a::\u59ec\u071d\u8c8a\u759a\ucef1\uc2e8, this:\u1187\u4f52\u983f\uc2e8\u527a, initobject:Long2ObjectOpenHashMap[expected:Long2ObjectMap<ObjectSet<\u51fa\u6c52\u7330\u7330\u960f>>](Long2ObjectOpenHashMap::<init>))
            putfield:Long2ObjectOpenHashMap<\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>>(\u1187\u4f52\u983f\uc2e8\u527a::\ub1b9\u59ec\u4975\u8df4\u1187\u527a, this:\u1187\u4f52\u983f\uc2e8\u527a, initobject:Long2ObjectOpenHashMap(Long2ObjectOpenHashMap::<init>))
            putfield:\ua562\u98a4\u8709\u51fa\uc29a(\u1187\u4f52\u983f\uc2e8\u527a::\uceb8\u446c\u927d\ud4fe\u836c\u3bd6, this:\u1187\u4f52\u983f\uc2e8\u527a, initobject:\ua562\u98a4\u8709\u51fa\uc29a(\ua562\u98a4\u8709\u51fa\uc29a::<init>, this:\u1187\u4f52\u983f\uc2e8\u527a))
            putfield:\u624e\u5140\u3e2a\ua6bd\u527a(\u1187\u4f52\u983f\uc2e8\u527a::\u64ab\u4f4a\u4d85\u3bd6\u7330\ub6ab, this:\u1187\u4f52\u983f\uc2e8\u527a, initobject:\u624e\u5140\u3e2a\ua6bd\u527a(\u624e\u5140\u3e2a\ua6bd\u527a::<init>, this:\u1187\u4f52\u983f\uc2e8\u527a, ldc:int(8)))
            putfield:\uceb8\u6b5f\u92ff\u3e75\u9a18(\u1187\u4f52\u983f\uc2e8\u527a::\u3d64\u9255\u624e\u3776\u9255\u760c, this:\u1187\u4f52\u983f\uc2e8\u527a, initobject:\uceb8\u6b5f\u92ff\u3e75\u9a18(\uceb8\u6b5f\u92ff\u3e75\u9a18::<init>, this:\u1187\u4f52\u983f\uc2e8\u527a, ldc:int(65)))
            putfield:Set<\u8bb0\u4975\ub7dc\u47c2\u3e75>(\u1187\u4f52\u983f\uc2e8\u527a::\uc87f\u8c8a\ub19c\u4cd9\u9033\u7043, this:\u1187\u4f52\u983f\uc2e8\u527a, invokestatic:HashSet[expected:Set<\u8bb0\u4975\ub7dc\u47c2\u3e75>](Sets::newHashSet))
            putfield:LongSet(\u1187\u4f52\u983f\uc2e8\u527a::\u8aa5\u8bb0\u74b1\u8df4\uf995\u71ae, this:\u1187\u4f52\u983f\uc2e8\u527a, initobject:LongOpenHashSet[expected:LongSet](LongOpenHashSet::<init>))
            var_5_C3 = invokestatic:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<Runnable>(\u9a18\u62da\ucfaf\u92ee\u183a\u6198<Msg>::\u7043\uf9c5\u6cfe\u7af6\u9937\uc229, ldc:String("player ticket throttler"), invokedynamic:Consumer<Runnable>(accept:(Ljava/util/concurrent/Executor;)Ljava/util/function/Consumer;, p1:Executor))
            var_6_D9 = initobject:\u7ce1\ud158\u927d\u5f50\uc29a(\u7ce1\ud158\u927d\u5f50\uc29a::<init>, invokestatic:ImmutableList[expected:List<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<?>>](ImmutableList::of, var_5_C3:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<Runnable>[expected:Object]), p0:Executor, and:int(ldc:int(15878), ldc:int(16684)))
            putfield:\u7ce1\ud158\u927d\u5f50\uc29a(\u1187\u4f52\u983f\uc2e8\u527a::\u0b8e\u62da\u6435\u647c\u624e\u385b, this:\u1187\u4f52\u983f\uc2e8\u527a, var_6_D9:\u7ce1\ud158\u927d\u5f50\uc29a)
            putfield:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u2dcc\u64ab\uf94d\ub18d\uff55<Runnable>>(\u1187\u4f52\u983f\uc2e8\u527a::\u385b\uc87f\u5bc4\ub113\u67e9\u7c6b, this:\u1187\u4f52\u983f\uc2e8\u527a, invokevirtual:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u2dcc\u64ab\uf94d\ub18d\uff55<Runnable>>(\u7ce1\ud158\u927d\u5f50\uc29a::\u3711\u3bd6\ufe34\ub32d\ub7dc\ub19c, var_6_D9:\u7ce1\ud158\u927d\u5f50\uc29a, var_5_C3:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<Runnable>, xor:int[expected:boolean](ldc:int(1328), ldc:int(1329))))
            putfield:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u8413\u1833\u3dd3\u3a62\ufcaf>(\u1187\u4f52\u983f\uc2e8\u527a::\u7043\ud12e\ub6ab\u600f\u7e3f\uff55, this:\u1187\u4f52\u983f\uc2e8\u527a, invokevirtual:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u8413\u1833\u3dd3\u3a62\ufcaf>(\u7ce1\ud158\u927d\u5f50\uc29a::\u9255\uff55\u88c5\ua562\u6435\ub70c, var_6_D9:\u7ce1\ud158\u927d\u5f50\uc29a, var_5_C3:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<Runnable>))
            putfield:Executor(\u1187\u4f52\u983f\uc2e8\u527a::\u7af6\u624e\u6fb0\u3504\u8308\ub32d, this:\u1187\u4f52\u983f\uc2e8\u527a, p1:Executor)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub113\u624e\u8c8a\u759a\u5654\ub6ab() {
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
    
    private static int \u5654\u8c8a\u624e\u759a\u61a4\ubf56(\u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9<?>> p0) {
        var_1_5F : int
        stack_8E_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_5F = and:int(ldc:int(1401707437), ldc:int(-232854059))
            
            if (invokevirtual:boolean(AbstractCollection::isEmpty, p0:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c[expected:AbstractCollection<E>])) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-764490435))
                stack_8E_0 = add:int(getstatic:int(\uc246\u156b\u7ce1\u3d64\u7873::\u600f\u6d99\ud523\u97b7\ubb2b\u98a4), and:int(ldc:int(12417), ldc:int(1121)))
            }
            else {
                stack_8E_0 = invokevirtual:int(\u0a06\uae87\ua562\ub83f\u69d9<T>::\u8df4\u9937\ua6bd\u4ab3\u47c2\u4daf, checkcast:\u0a06\uae87\ua562\ub83f\u69d9<?>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9<?>.class, invokevirtual:\u0a06\uae87\ua562\ub83f\u69d9<?>(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>::\u071d\u839e\uc29a\u3bc9\ub70c\uc9f6, p0:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>)))
            }
            
            return:int(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u3504\uc4d2\u98a4\u64f2\ube23\ub8be(long p0);
    
    public abstract \u392e\ud7e8\u3bc9\u88c5\ud51e.\u8bb0\u4975\ub7dc\u47c2\u3e75 \u6fb0\u8df4\u40a9\u760c\u759a\u59ec(long p0);
    
    public abstract \u392e\ud7e8\u3bc9\u88c5\ud51e.\u8bb0\u4975\ub7dc\u47c2\u3e75 \u120d\u51b2\uc3e3\uae87\ub6ab\u64ab(long p0, int p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u8bb0\u4975\ub7dc\u47c2\u3e75 p2, int p3);
    
    public boolean \u0b8e\u416d\uc29a\u1187\u5db4\u0a06(\u71f1\uc910\u3bc9\u516c\u93a2.\uc246\u156b\u7ce1\u3d64\u7873 p0) {
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
    
    private void \u960f\uc87f\u6ec6\u6198\u9937\uc238(long p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9<?> p1) {
        var_6_6A : \u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>
        var_7_71 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_6_6A = invokespecial:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>(\u1187\u4f52\u983f\uc2e8\u527a::\ubefe\u4179\uf9c5\ube23\uc2e8\uc9f6, this:\u1187\u4f52\u983f\uc2e8\u527a, p0:long)
            var_7_71 = invokestatic:int(\u1187\u4f52\u983f\uc2e8\u527a::\u5654\u8c8a\u624e\u759a\u61a4\ubf56, var_6_6A:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>)
            invokevirtual:void(\u0a06\uae87\ua562\ub83f\u69d9<T>::\uc84e\uc4d2\u718f\u7ce1\ub32d\uc31c, checkcast:\u0a06\uae87\ua562\ub83f\u69d9<?>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9<?>.class, invokevirtual:\u0a06\uae87\ua562\ub83f\u69d9<?>(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>::\u7043\u69d9\uf995\u1833\u718f\u6435, var_6_6A:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>, p1:\u0a06\uae87\ua562\ub83f\u69d9<?>)), getfield:long(\u1187\u4f52\u983f\uc2e8\u527a::\ubff1\uafe7\ub32d\u8308\ua3b4\uc910, this:\u1187\u4f52\u983f\uc2e8\u527a))
            
            if (cmplt:boolean(invokevirtual:int(\u0a06\uae87\ua562\ub83f\u69d9<T>::\u8df4\u9937\ua6bd\u4ab3\u47c2\u4daf, p1:\u0a06\uae87\ua562\ub83f\u69d9<?>), var_7_71:int)) {
                invokevirtual:void(\u718f\u3e75\u5fe1\ub113\u071d::\u7bad\u7af6\uf995\u4cd9\u3504\ub18d, getfield:\ua562\u98a4\u8709\u51fa\uc29a[expected:\u718f\u3e75\u5fe1\ub113\u071d](\u1187\u4f52\u983f\uc2e8\u527a::\uceb8\u446c\u927d\ud4fe\u836c\u3bd6, this:\u1187\u4f52\u983f\uc2e8\u527a), p0:long, invokevirtual:int(\u0a06\uae87\ua562\ub83f\u69d9<T>::\u8df4\u9937\ua6bd\u4ab3\u47c2\u4daf, p1:\u0a06\uae87\ua562\ub83f\u69d9<?>), and:int[expected:boolean](ldc:int(521), ldc:int(7171)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud158\u446c\u3bd6\u3e75\u0c95\uc910(long p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9<?> p1) {
        var_6_6A : \u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_6_6A = invokespecial:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>(\u1187\u4f52\u983f\uc2e8\u527a::\ubefe\u4179\uf9c5\ube23\uc2e8\uc9f6, this:\u1187\u4f52\u983f\uc2e8\u527a, p0:long)
            
            if (logicalnot:boolean(invokevirtual:boolean(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::remove, var_6_6A:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>, p1:\u0a06\uae87\ua562\ub83f\u69d9<?>[expected:Object]))) {
            }
            
            if (invokevirtual:boolean(AbstractCollection::isEmpty, var_6_6A:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>)) {
                invokevirtual:Object(Long2ObjectOpenHashMap::remove, getfield:Long2ObjectOpenHashMap<\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>>(\u1187\u4f52\u983f\uc2e8\u527a::\ub1b9\u59ec\u4975\u8df4\u1187\u527a, this:\u1187\u4f52\u983f\uc2e8\u527a), p0:long)
            }
            
            invokevirtual:void(\u718f\u3e75\u5fe1\ub113\u071d::\u7bad\u7af6\uf995\u4cd9\u3504\ub18d, getfield:\ua562\u98a4\u8709\u51fa\uc29a[expected:\u718f\u3e75\u5fe1\ub113\u071d](\u1187\u4f52\u983f\uc2e8\u527a::\uceb8\u446c\u927d\ud4fe\u836c\u3bd6, this:\u1187\u4f52\u983f\uc2e8\u527a), p0:long, invokestatic:int(\u1187\u4f52\u983f\uc2e8\u527a::\u5654\u8c8a\u624e\u759a\u61a4\ubf56, var_6_6A:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>), and:int[expected:boolean](ldc:int(-7415), ldc:int(7414)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5bc4\u1187\uf995\u4c04\uc238\ucef1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7ce1\u3bd6\ud51e\u0800\u3d64<T> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p1, int p2, T p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u1187\u4f52\u983f\uc2e8\u527a::\u960f\uc87f\u6ec6\u6198\u9937\uc238, this:\u1187\u4f52\u983f\uc2e8\u527a, invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, p1:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), initobject:\u0a06\uae87\ua562\ub83f\u69d9<Object>(\u0a06\uae87\ua562\ub83f\u69d9<?>::<init>, p0:\u7ce1\u3bd6\ud51e\u0800\u3d64<T>, p2:int, p3:T[expected:?]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uf995\uf995\uf94d\u3d4b\u4492\uf94d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7ce1\u3bd6\ud51e\u0800\u3d64<T> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p1, int p2, T p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u1187\u4f52\u983f\uc2e8\u527a::\ud158\u446c\u3bd6\u3e75\u0c95\uc910, this:\u1187\u4f52\u983f\uc2e8\u527a, invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, p1:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), initobject:\u0a06\uae87\ua562\ub83f\u69d9<Object>(\u0a06\uae87\ua562\ub83f\u69d9<?>::<init>, p0:\u7ce1\u3bd6\ud51e\u0800\u3d64<T>, p2:int, p3:T[expected:?]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u960f\uc87f\u6ec6\u6198\u9937\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7ce1\u3bd6\ud51e\u0800\u3d64<T> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p1, int p2, T p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u1187\u4f52\u983f\uc2e8\u527a::\u960f\uc87f\u6ec6\u6198\u9937\uc238, this:\u1187\u4f52\u983f\uc2e8\u527a, invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, p1:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), initobject:\u0a06\uae87\ua562\ub83f\u69d9<Object>(\u0a06\uae87\ua562\ub83f\u69d9<?>::<init>, p0:\u7ce1\u3bd6\ud51e\u0800\u3d64<T>, sub:int(ldc:int(33), p2:int), p3:T[expected:?]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud158\u446c\u3bd6\u3e75\u0c95\uc910(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7ce1\u3bd6\ud51e\u0800\u3d64<T> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p1, int p2, T p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u1187\u4f52\u983f\uc2e8\u527a::\ud158\u446c\u3bd6\u3e75\u0c95\uc910, this:\u1187\u4f52\u983f\uc2e8\u527a, invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, p1:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), initobject:\u0a06\uae87\ua562\ub83f\u69d9<Object>(\u0a06\uae87\ua562\ub83f\u69d9<?>::<init>, p0:\u7ce1\u3bd6\ud51e\u0800\u3d64<T>, sub:int(ldc:int(33), p2:int), p3:T[expected:?]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9<?>> \ubefe\u4179\uf9c5\ube23\uc2e8\uc9f6(long p0) {
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
    
    public void \u4bc8\ub83f\u6d69\u40a9\u1187\u0b8e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, boolean p1) {
        var_3_61 : int
        var_5_6F : \u0a06\uae87\ua562\ub83f\u69d9<Object>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(64895168), ldc:int(1204345834))
            var_5_6F = initobject:\u0a06\uae87\ua562\ub83f\u69d9<Object>(\u0a06\uae87\ua562\ub83f\u69d9<Object>::<init>, getstatic:\u7ce1\u3bd6\ud51e\u0800\u3d64<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>(\u7ce1\u3bd6\ud51e\u0800\u3d64::\uae5d\u51b2\u5654\u4492\u8bb0\u7e3f), ldc:int(31), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object])
            
            if (logicalnot:boolean(p1:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1204730349))
                invokespecial:void(\u1187\u4f52\u983f\uc2e8\u527a::\ud158\u446c\u3bd6\u3e75\u0c95\uc910, this:\u1187\u4f52\u983f\uc2e8\u527a, invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), var_5_6F:\u0a06\uae87\ua562\ub83f\u69d9<Object>)
            }
            else {
                invokespecial:void(\u1187\u4f52\u983f\uc2e8\u527a::\u960f\uc87f\u6ec6\u6198\u9937\uc238, this:\u1187\u4f52\u983f\uc2e8\u527a, invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), var_5_6F:\u0a06\uae87\ua562\ub83f\u69d9<Object>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae87\uc2e8\u40a9\u6b5f\u527a\u51b2(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p1) {
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
    
    public void \u36d3\u98a4\u6b0d\u12cb\u5654\u8753(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p1) {
        var_5_69 : long
        var_7_79 : ObjectSet
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_69 = invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u446c\ucb79\u6fb0\u3776\uc2bd\u7006, p0:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2))
            var_7_79 = checkcast:ObjectSet(it.unimi.dsi.fastutil.objects.ObjectSet.class, invokeinterface:Object[expected:ObjectSet](Long2ObjectMap::get, getfield:Long2ObjectMap<ObjectSet<\u51fa\u6c52\u7330\u7330\u960f>>(\u1187\u4f52\u983f\uc2e8\u527a::\u59ec\u071d\u8c8a\u759a\ucef1\uc2e8, this:\u1187\u4f52\u983f\uc2e8\u527a), var_5_69:long))
            invokeinterface:boolean(ObjectSet::remove, var_7_79:ObjectSet, p1:\u51fa\u6c52\u7330\u7330\u960f[expected:Object])
            
            if (invokeinterface:boolean(ObjectSet::isEmpty, var_7_79:ObjectSet)) {
                invokeinterface:Object(Long2ObjectMap::remove, getfield:Long2ObjectMap<ObjectSet<\u51fa\u6c52\u7330\u7330\u960f>>(\u1187\u4f52\u983f\uc2e8\u527a::\u59ec\u071d\u8c8a\u759a\ucef1\uc2e8, this:\u1187\u4f52\u983f\uc2e8\u527a), var_5_69:long)
                invokevirtual:void(\u718f\u3e75\u5fe1\ub113\u071d::\u7bad\u7af6\uf995\u4cd9\u3504\ub18d, getfield:\u624e\u5140\u3e2a\ua6bd\u527a[expected:\u718f\u3e75\u5fe1\ub113\u071d](\u1187\u4f52\u983f\uc2e8\u527a::\u64ab\u4f4a\u4d85\u3bd6\u7330\ub6ab, this:\u1187\u4f52\u983f\uc2e8\u527a), var_5_69:long, ldc:int(2147483647), and:int[expected:boolean](ldc:int(-22029), ldc:int(22028)))
                invokevirtual:void(\u718f\u3e75\u5fe1\ub113\u071d::\u7bad\u7af6\uf995\u4cd9\u3504\ub18d, getfield:\uceb8\u6b5f\u92ff\u3e75\u9a18[expected:\u718f\u3e75\u5fe1\ub113\u071d](\u1187\u4f52\u983f\uc2e8\u527a::\u3d64\u9255\u624e\u3776\u9255\u760c, this:\u1187\u4f52\u983f\uc2e8\u527a), var_5_69:long, ldc:int(2147483647), and:int[expected:boolean](ldc:int(26001), ldc:int(-26514)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u7ce1\u8258\u873d\u51b2\u9a18\u72f1(long p0) {
        var_3_61 : int
        var_5_6D : \u836c\u873d\u99f7\u6b5f\ucfaf\u836c
        var_6_7D : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(-1596504026), ldc:int(-1598689290))
            var_5_6D = checkcast:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c(\u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c.class, invokevirtual:Object[expected:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c](Long2ObjectOpenHashMap::get, getfield:Long2ObjectOpenHashMap<\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>>(\u1187\u4f52\u983f\uc2e8\u527a::\ub1b9\u59ec\u4975\u8df4\u1187\u527a, this:\u1187\u4f52\u983f\uc2e8\u527a), p0:long))
            
            if (logicaland:boolean(cmpne:boolean(var_5_6D:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c, aconstnull:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c()), logicalnot:boolean(invokevirtual:boolean(AbstractCollection::isEmpty, var_5_6D:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c[expected:AbstractCollection])))) {
                var_6_7D = invokevirtual:String(\u0a06\uae87\ua562\ub83f\u69d9::toString, checkcast:\u0a06\uae87\ua562\ub83f\u69d9(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9.class, invokevirtual:\u0a06\uae87\ua562\ub83f\u69d9(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9>::\u071d\u839e\uc29a\u3bc9\ub70c\uc9f6, var_5_6D:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9>)))
            }
            else {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1248474393))
                var_6_7D = ldc:String("no_ticket")
            }
            
            return:String(var_6_7D:String)
        }
        
        goto(Label_0006)
    }
    
    public void \u5f50\ud4fe\u0c95\u446c\u8bb0\u34df(int p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\uceb8\u6b5f\u92ff\u3e75\u9a18::\u6d69\u99f7\u4daf\ubcb0\u9937\u4492, getfield:\uceb8\u6b5f\u92ff\u3e75\u9a18(\u1187\u4f52\u983f\uc2e8\u527a::\u3d64\u9255\u624e\u3776\u9255\u760c, this:\u1187\u4f52\u983f\uc2e8\u527a), p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u8308\u64f2\ub32d\u6d99\u6b0d\ud12e() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u624e\u5140\u3e2a\ua6bd\u527a::\u1833\uc2e8\ud51e\uc7fe\u4975\u8413, getfield:\u624e\u5140\u3e2a\ua6bd\u527a(\u1187\u4f52\u983f\uc2e8\u527a::\u64ab\u4f4a\u4d85\u3bd6\u7330\ub6ab, this:\u1187\u4f52\u983f\uc2e8\u527a))
            return:int(invokeinterface:int(Long2ByteMap::size, getfield:Long2ByteMap(\u624e\u5140\u3e2a\ua6bd\u527a::\uc238\u6cfe\u12cb\u8d98\uc29a\u99f7, getfield:\u624e\u5140\u3e2a\ua6bd\u527a(\u1187\u4f52\u983f\uc2e8\u527a::\u64ab\u4f4a\u4d85\u3bd6\u7330\ub6ab, this:\u1187\u4f52\u983f\uc2e8\u527a))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc910\u9255\u3711\ufe34\u4975\ud12e(long p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u624e\u5140\u3e2a\ua6bd\u527a::\u1833\uc2e8\ud51e\uc7fe\u4975\u8413, getfield:\u624e\u5140\u3e2a\ua6bd\u527a(\u1187\u4f52\u983f\uc2e8\u527a::\u64ab\u4f4a\u4d85\u3bd6\u7330\ub6ab, this:\u1187\u4f52\u983f\uc2e8\u527a))
            return:boolean(invokeinterface:boolean(Long2ByteMap::containsKey, getfield:Long2ByteMap(\u624e\u5140\u3e2a\ua6bd\u527a::\uc238\u6cfe\u12cb\u8d98\uc29a\u99f7, getfield:\u624e\u5140\u3e2a\ua6bd\u527a(\u1187\u4f52\u983f\uc2e8\u527a::\u64ab\u4f4a\u4d85\u3bd6\u7330\ub6ab, this:\u1187\u4f52\u983f\uc2e8\u527a)), p0:long))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \uf94d\u7049\u156b\u61a4\ub1b9\ub8be() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(invokevirtual:String(\u7ce1\ud158\u927d\u5f50\uc29a::\u760c\u836c\ube23\ub1b9\u61a4\u98a4, getfield:\u7ce1\ud158\u927d\u5f50\uc29a(\u1187\u4f52\u983f\uc2e8\u527a::\u0b8e\u62da\u6435\u647c\u624e\u385b, this:\u1187\u4f52\u983f\uc2e8\u527a)))
        }
        
        goto(Label_0006)
    }
    
    private static it.unimi.dsi.fastutil.objects.ObjectSet lambda$\u3711\u600f\u8753\u385b\ua61f\u647c$7(long p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:ObjectSet(initobject:ObjectOpenHashSet[expected:ObjectSet](ObjectOpenHashSet::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static \u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c lambda$\u98a4\u61a4\u74b1\ub7dc\u983f\ubefe$6(long p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c(invokestatic:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<Comparable>(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<Object>::\u9033\ud51e\uc9f6\ube23\u385b\uc229, and:int(ldc:int(5124), ldc:int(24596))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6d69\u36d3\u600f\u416d\u6cfe\u3e75$5(long p0, com.mojang.datafixers.util.Either p1) {
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
    
    private void lambda$\uc84e\u56bd\ub70c\u4975\u071d\u5654$4(long p0) {
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
    
    private static void lambda$\u5d20\u7873\ufe34\u8413\u97e6\u9937$3() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
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
    
    private static boolean lambda$\uafe7\u7043\u8d90\ubcb0\u64ab\u12cb$2(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9 p0) {
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
            var_1_61 = and:int(ldc:int(1928854930), ldc:int(334986658))
            
            if (cmpne:boolean(invokevirtual:\u7ce1\u3bd6\ud51e\u0800\u3d64(\u0a06\uae87\ua562\ub83f\u69d9::\u64f2\ud36e\uc9f6\u71f1\ucb79\u6bb9, p0:\u0a06\uae87\ua562\ub83f\u69d9), getstatic:\u7ce1\u3bd6\ud51e\u0800\u3d64<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>(\u7ce1\u3bd6\ud51e\u0800\u3d64::\u36d3\u6fb0\u0800\u120d\u8d90\u5654))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1301548880))
                stack_8D_0 = and:int(ldc:int(9926), ldc:int(-26311))
            }
            else {
                stack_8D_0 = and:int(ldc:int(401), ldc:int(17449))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u64ab\ucb79\u5140\u8413\u69d9\u8753$1(\u71f1\uc910\u3bc9\u516c\u93a2.\uc246\u156b\u7ce1\u3d64\u7873 p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u8bb0\u4975\ub7dc\u47c2\u3e75 p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ube23\u69d9\u4492\uc910\u7e3f\u5fe1, p1:\u8bb0\u4975\ub7dc\u47c2\u3e75, p0:\uc246\u156b\u7ce1\u3d64\u7873)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\uc4d2\u3dd3\u92ee\u92ff\u93a2\u516c$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokevirtual:boolean(\u0a06\uae87\ua562\ub83f\u69d9::\ua3b4\ud7e8\ub19c\u0b8e\ub32d\u3e75, p0:\u0a06\uae87\ua562\ub83f\u69d9, getfield:long(\u1187\u4f52\u983f\uc2e8\u527a::\ubff1\uafe7\ub32d\u8308\ua3b4\uc910, this:\u1187\u4f52\u983f\uc2e8\u527a)))
        }
        
        goto(Label_0006)
    }
    
    public static it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap \u51fa\u92ee\u6435\u3a62\u52d3\u4bc8(\u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Long2ObjectOpenHashMap(getfield:Long2ObjectOpenHashMap<\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<\u0a06\uae87\ua562\ub83f\u69d9<?>>>(\u1187\u4f52\u983f\uc2e8\u527a::\ub1b9\u59ec\u4975\u8df4\u1187\u527a, p0:\u1187\u4f52\u983f\uc2e8\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Set \u156b\ub8be\uafe7\uceb8\uc238\u516c(\u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Set(getfield:Set<\u8bb0\u4975\ub7dc\u47c2\u3e75>(\u1187\u4f52\u983f\uc2e8\u527a::\uc87f\u8c8a\ub19c\u4cd9\u9033\u7043, p0:\u1187\u4f52\u983f\uc2e8\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static it.unimi.dsi.fastutil.longs.Long2ObjectMap \u0a06\u4179\ub171\u965f\u839e\u52d3(\u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Long2ObjectMap(getfield:Long2ObjectMap<ObjectSet<\u51fa\u6c52\u7330\u7330\u960f>>(\u1187\u4f52\u983f\uc2e8\u527a::\u59ec\u071d\u8c8a\u759a\ucef1\uc2e8, p0:\u1187\u4f52\u983f\uc2e8\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static int \u93a2\u4d85\u5245\u6b5f\u9255\u9033() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getstatic:int(\u1187\u4f52\u983f\uc2e8\u527a::\u760c\u51b2\u52d3\uc246\ud7e8\u8d90))
        }
        
        goto(Label_0006)
    }
    
    public static \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 \u120d\ub19c\uf995\u3a62\u16f6\u47c2(\u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u9a18\u62da\ucfaf\u92ee\u183a\u6198(getfield:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u2dcc\u64ab\uf94d\ub18d\uff55<Runnable>>(\u1187\u4f52\u983f\uc2e8\u527a::\u385b\uc87f\u5bc4\ub113\u67e9\u7c6b, p0:\u1187\u4f52\u983f\uc2e8\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 \ud4fe\u0a06\u7d52\u6c52\ufe34\u40a9(\u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u9a18\u62da\ucfaf\u92ee\u183a\u6198(getfield:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u8413\u1833\u3dd3\u3a62\ufcaf>(\u1187\u4f52\u983f\uc2e8\u527a::\u7043\ud12e\ub6ab\u600f\u7e3f\uff55, p0:\u1187\u4f52\u983f\uc2e8\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static \u6435\ub8be\u718f\u6b0d\u67e9.\u7ce1\ud158\u927d\u5f50\uc29a \u7c6b\u1187\u3a62\u98a4\u5f50\u67d0(\u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u7ce1\ud158\u927d\u5f50\uc29a(getfield:\u7ce1\ud158\u927d\u5f50\uc29a(\u1187\u4f52\u983f\uc2e8\u527a::\u0b8e\u62da\u6435\u647c\u624e\u385b, p0:\u1187\u4f52\u983f\uc2e8\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.concurrent.Executor \ub70c\u7049\u3711\u88c5\u40a9\u3d4b(\u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Executor(getfield:Executor(\u1187\u4f52\u983f\uc2e8\u527a::\u7af6\u624e\u6fb0\u3504\u8308\ub32d, p0:\u1187\u4f52\u983f\uc2e8\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static void \u52d3\u6c56\u7873\u600f\u8bb0\u4975(\u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a p0, long p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9 p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u1187\u4f52\u983f\uc2e8\u527a::\ud158\u446c\u3bd6\u3e75\u0c95\uc910, p0:\u1187\u4f52\u983f\uc2e8\u527a, p1:long, p2:\u0a06\uae87\ua562\ub83f\u69d9<?>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u3bd6\u67d0\u527a\u385b\u8cae\u4975(\u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a p0, long p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u0a06\uae87\ua562\ub83f\u69d9 p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u1187\u4f52\u983f\uc2e8\u527a::\u960f\uc87f\u6ec6\u6198\u9937\uc238, p0:\u1187\u4f52\u983f\uc2e8\u527a, p1:long, p2:\u0a06\uae87\ua562\ub83f\u69d9<?>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static it.unimi.dsi.fastutil.longs.LongSet \u69d9\ud171\ubf56\u6c52\u8cae\ucb79(\u5d20\u7043\u88c5\u5db4\uf94d.\u1187\u4f52\u983f\uc2e8\u527a p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:LongSet(getfield:LongSet(\u1187\u4f52\u983f\uc2e8\u527a::\u8aa5\u8bb0\u74b1\u8df4\uf995\u71ae, p0:\u1187\u4f52\u983f\uc2e8\u527a))
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
            putstatic:Logger(\u1187\u4f52\u983f\uc2e8\u527a::\u9a18\ub113\u40a9\u99f7\u34df\u4daf, invokestatic:Logger(LogManager::getLogger))
            putstatic:int(\u1187\u4f52\u983f\uc2e8\u527a::\u760c\u51b2\u52d3\uc246\ud7e8\u8d90, sub:int(add:int(ldc:int(33), invokestatic:int(\ucb79\u7ce1\ubded\u3d64\ub171::\uc3e3\u7c6b\u8389\u8cae\ub113\u88c5, getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068))), xor:int(ldc:int(3072), ldc:int(3074))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u4c04\ubff1\u36d3\u56bd\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AB : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6B6 : int
        
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
        var_3_6AB = and:int(ldc:int(980092564), ldc:int(929484599))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u1187\u4f52\u983f\uc2e8\u527a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(2)), ldc:int(0))) {
            var_3_6AB = and:int(var_3_6AB:int, ldc:int(1541598559))
            var_5_81 = and:int(ldc:int(1508), ldc:int(-26085))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21684), ldc:int(-21750)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6AB:int, ldc:int(-1276676969))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(-24558), ldc:int(-24557)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(16641), ldc:int(13833)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6AB = and:int(var_3_D1:int, ldc:int(929774814))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(25221), ldc:int(5395)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(256086888))
                        goto(Label_1595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(610053757))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(740858628))
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-829817502))
                        goto(Label_1001)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-2011777483))
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1368687309))
                    }
                    else {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1821438212))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0558)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1001)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(46954735))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(1458986877))
                            var_11_E2 = and:int(ldc:int(18691), ldc:int(-26884))
                            goto(Label_1584)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0558:
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-582616075))
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1896857173))
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1060741144))
                        goto(Label_1001)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1586569023))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(1003469122))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1551939425))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1149514455))
                            loopcontinue()
                        }
                        
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1679616460))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0709:
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(1352289972))
                        goto(Label_1595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1304103432))
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-27194810))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1001)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(2108853798))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(-983562874))
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(506946297))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(401901375))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(1147982612))
                        goto(Label_1595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(536688836))
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-2130736355))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-331417779))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(612962781))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1017865500))
                            loopcontinue()
                        }
                        
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(1391048053))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(1427), ldc:int(26689))
                                goto(Label_1178)
                            }
                        }
                    }
                    
                    Label_1001:
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(1420967376))
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(715968158))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(1595930001))
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-797463467))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(-527758997))
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1627788657))
                            loopcontinue()
                        }
                        
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(468815070))
                        var_11_E2 = and:int(ldc:int(4205), ldc:int(-20590))
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(373313804))
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1001)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(669445478))
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(837968061))
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-26049226))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1420)
                            }
                        }
                    }
                    
                    Label_1294:
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1068126484))
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-413131613))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1178)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1001)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AB = and:int(var_3_6AB:int, ldc:int(-2029291358))
                            loopcontinue()
                        }
                        
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(325983967))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1584)
                    }
                    
                    Label_1420:
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-950652652))
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1891826779))
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(317904587))
                        goto(Label_1001)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(1373160599))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(2014095395))
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(408341831))
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(673563043))
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1158949601))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1584:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B6 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1595:
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(977747238))
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(834822915))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-630310673))
                        goto(Label_1001)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-1879005080))
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6AB = and:int(var_3_6AB:int, ldc:int(-93552993))
                        var_17_6B6 = add:int(var_16_110:int, and:int(ldc:int(26965), ldc:int(553)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6AB = and:int(var_3_6AB:int, ldc:int(-2038186))
                
                if (cmple:boolean(var_5_81 = var_17_6B6:int, sub:int(var_6_88:int, xor:int(ldc:int(-32640), ldc:int(-32639))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6AB:int, ldc:int(32)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
