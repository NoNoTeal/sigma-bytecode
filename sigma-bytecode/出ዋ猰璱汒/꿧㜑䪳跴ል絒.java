public class \u51fa\u12cb\u7330\u74b1\u6c52.\uafe7\u3711\u4ab3\u8df4\u120d\u7d52 {
    public void \uafe7\u3711\u4ab3\u8df4\u120d\u7d52(com.mojang.serialization.Dynamic<?> p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52)
            putfield:\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72<Dynamic<?>>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ub83f\uf995\u97e6\u7330\u6198\u9937, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, initobject:\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72<Dynamic<?>>(\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72<K>::<init>, ldc:int(32)))
            putfield:Int2ObjectMap<IntList>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\uf995\u92ee\u5db4\u97e6\ub6ab\ub18d, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, initobject:Int2ObjectLinkedOpenHashMap[expected:Int2ObjectMap<IntList>](Int2ObjectLinkedOpenHashMap::<init>))
            putfield:IntList(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\uc229\uc910\u64ab\ua562\u3e2a\u5fe1, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, initobject:IntArrayList[expected:IntList](IntArrayList::<init>))
            putfield:Set<Dynamic<?>>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ub7dc\u74b1\u8308\u3d4b\u4d85\ua3b4, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, invokestatic:Set(Sets::newIdentityHashSet))
            putfield:int[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u7d52\u99f7\ua3b4\u69d9\u527a\u9937, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, newarray:int[](int.class, and:int(ldc:int(5984), ldc:int(12304))))
            putfield:List<Dynamic<?>>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u8350\u8bb0\u3711\u3c25\ub7dc\u64f2, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, invokestatic:ArrayList[expected:List<Dynamic<?>>](Lists::newArrayList))
            putfield:Dynamic<?>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ua562\u5f50\u67e9\u718f\u88c5\uc7fe, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, p0:Dynamic<?>)
            putfield:int(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u624e\u36d3\uceb8\uc910\ud51e\u516c, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, loadelement:String(getstatic:String[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ucfaf\u718f\u7e3f\u3e2a\uae5d\ud217), and:int(ldc:int(20676), ldc:int(-20677)))), and:int(ldc:int(-22896), ldc:int(6509))))
            putfield:boolean(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u51b2\u3e2a\ub7dc\ud4fe\u3bc9\ub6ab, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, loadelement:String(getstatic:String[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ucfaf\u718f\u7e3f\u3e2a\uae5d\ud217), and:int(ldc:int(20529), ldc:int(8257)))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Dynamic<?> \u59ec\u8258\u8413\u8cae\uc4d2\u6bb9(int p0) {
        var_2_5F : int
        var_4_93 : Dynamic<?>
        stack_B0_0 : Dynamic [generated]
        
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
        var_2_5F = and:int(ldc:int(393849870), ldc:int(-1086786474))
        
        if (logicaland:boolean(cmpge:boolean(p0:int, ldc:int(0)), cmple:boolean(p0:int, xor:int(ldc:int(7008), ldc:int(5279))))) {
            var_4_93 = checkcast:Dynamic<?>(com.mojang.serialization.Dynamic<?>.class, invokevirtual:Dynamic<?>(\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72<Dynamic<?>>::\ufe34\u6ec6\uceb8\uff55\u9033\ube23, getfield:\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72<Dynamic<?>>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ub83f\uf995\u97e6\u7330\u6198\u9937, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52), loadelement:int(getfield:int[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u7d52\u99f7\ua3b4\u69d9\u527a\u9937, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52), p0:int)))
            
            if (cmpne:boolean(var_4_93:Dynamic<?>, aconstnull:Dynamic<?>())) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(628866872))
                stack_B0_0 = var_4_93:Dynamic<?>
            }
            else {
                stack_B0_0 = invokestatic:Dynamic(\u960f\u7049\u5654\u8308\u494c\u4cd9::\u3a62\ud36e\u6b5f\u8350\ubff1\u67d0)
            }
            
            return:Dynamic<?>(stack_B0_0:Dynamic)
        }
        
        return:Dynamic<?>(invokestatic:Dynamic(\u960f\u7049\u5654\u8308\u494c\u4cd9::\u3a62\ud36e\u6b5f\u8350\ubff1\u67d0))
    }
    
    public void \u8df4\ud171\u51fa\u3776\u647c\ub83f(int p0, com.mojang.serialization.Dynamic<?> p1) {
        var_3_A2 : int
        stack_B3_0 : List<Dynamic<?>> [generated]
        stack_B3_1 : Dynamic [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_A2 = and:int(ldc:int(609350964), ldc:int(-1214810500))
            
            if (invokeinterface:boolean(Set<Dynamic<?>>::add, getfield:Set<Dynamic<?>>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ub7dc\u74b1\u8308\u3d4b\u4d85\ua3b4, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52), p1:Dynamic<?>)) {
                stack_B3_0 = getfield:List<Dynamic<?>>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u8350\u8bb0\u3711\u3c25\ub7dc\u64f2, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52)
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ucfaf\u718f\u7e3f\u3e2a\uae5d\ud217), and:int(ldc:int(18594), ldc:int(9026))), invokestatic:String[expected:Object](\u960f\u7049\u5654\u8308\u494c\u4cd9::\ua068\u92ee\u40a9\u6b5f\u7049\u873d, p1:Dynamic<?>)))) {
                    var_3_A2 = and:int(var_3_A2:int, ldc:int(-817572113))
                    stack_B3_1 = p1:Dynamic<?>
                }
                else {
                    stack_B3_1 = invokestatic:Dynamic(\u960f\u7049\u5654\u8308\u494c\u4cd9::\u3a62\ud36e\u6b5f\u8350\ubff1\u67d0)
                }
                
                var_3_A2 = and:int(var_3_A2:int, ldc:int(-1385735068))
                invokeinterface:boolean(List<Dynamic<?>>::add, stack_B3_0:List<Dynamic<?>>, stack_B3_1:Dynamic<?>)
            }
            
            storeelement:int(getfield:int[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u7d52\u99f7\ua3b4\u69d9\u527a\u9937, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52), p0:int, invokestatic:int(\u960f\u7049\u5654\u8308\u494c\u4cd9::\ucb79\u4f4a\ub19c\u8bb0\u8cae\u6ec6, getfield:\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72<Dynamic<?>>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ub83f\uf995\u97e6\u7330\u6198\u9937, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52), p1:Dynamic<?>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u5d20\u760c\ua3b4\uae87\uc2bd\u7af6(int p0) {
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
    
    private void \u7bad\ub19c\uc3e3\u4179\u7bad\ub1b9(int p0, int p1) {
        var_5_6F : Object
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_6F = checkcast:IntList(it.unimi.dsi.fastutil.ints.IntList.class, invokeinterface:Object[expected:IntList](Int2ObjectMap::get, getfield:Int2ObjectMap<IntList>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\uf995\u92ee\u5db4\u97e6\ub6ab\ub18d, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52), p0:int))
            
            if (cmpeq:boolean(var_5_6F:IntList, aconstnull:IntList())) {
                var_5_6F = initobject:IntArrayList[expected:IntList](IntArrayList::<init>)
                invokeinterface:Object(Int2ObjectMap::put, getfield:Int2ObjectMap<IntList>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\uf995\u92ee\u5db4\u97e6\ub6ab\ub18d, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52), p0:int, var_5_6F:IntList[expected:Object])
            }
            
            invokeinterface:boolean(IntList::add, var_5_6F:IntList, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Dynamic<?> \ub18d\u416d\u6c52\u5654\u9033\u6fb0() {
        var_3_66 : Dynamic<?>
        var_3_90 : Dynamic
        var_5_B9 : \u718f\u7e3f\uc238\u5f50\u183a\uc2e8
        var_6_C2 : int
        
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
        var_3_66 = getfield:Dynamic<?>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ua562\u5f50\u67e9\u718f\u88c5\uc7fe, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52)
        
        if (getfield:boolean(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u51b2\u3e2a\ub7dc\ud4fe\u3bc9\ub6ab, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52)) {
            var_3_90 = invokevirtual:Dynamic(Dynamic::set, var_3_66:Dynamic<?>, loadelement:String(getstatic:String[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ucfaf\u718f\u7e3f\u3e2a\uae5d\ud217), xor:int(ldc:int(-32487), ldc:int(-32484))), invokevirtual:Dynamic(Dynamic::createList, var_3_66:Dynamic<?>, invokeinterface:Stream<Object>(Collection<Object>::stream, getfield:List<Dynamic<?>>[expected:Collection<Object>](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u8350\u8bb0\u3711\u3c25\ub7dc\u64f2, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52))))
            var_5_B9 = initobject:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::<init>, invokestatic:int(Math::max, xor:int(ldc:int(-31614), ldc:int(-31610)), invokestatic:int(DataFixUtils::ceillog2, invokeinterface:int(Set<E>::size, getfield:Set<Dynamic<?>>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ub7dc\u74b1\u8308\u3d4b\u4d85\ua3b4, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52)))), xor:int(ldc:int(1609), ldc:int(5705)))
            var_6_C2 = and:int(ldc:int(350), ldc:int(-4447))
            
            while (cmplt:boolean(var_6_C2:int, arraylength:int(getfield:int[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u7d52\u99f7\ua3b4\u69d9\u527a\u9937, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52)))) {
                invokevirtual:void(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u6d69\u156b\u3c25\u600f\u600f\u51fa, var_5_B9:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8, var_6_C2:int, loadelement:int(getfield:int[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u7d52\u99f7\ua3b4\u69d9\u527a\u9937, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52), var_6_C2:int))
                inc:int(var_6_C2, ldc:int(1))
            }
            
            return:Dynamic<?>(invokevirtual:Dynamic(Dynamic::remove, invokevirtual:Dynamic(Dynamic::remove, invokevirtual:Dynamic(Dynamic::remove, invokevirtual:Dynamic(Dynamic::set, var_3_90:Dynamic, loadelement:String(getstatic:String[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ucfaf\u718f\u7e3f\u3e2a\uae5d\ud217), xor:int(ldc:int(581), ldc:int(579))), invokevirtual:Dynamic(Dynamic::createLongList, var_3_90:Dynamic, invokestatic:LongStream(Arrays::stream, invokevirtual:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u97e6\u446c\ub8be\u51fa\u4daf\u12cb, var_5_B9:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8)))), loadelement:String(getstatic:String[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ucfaf\u718f\u7e3f\u3e2a\uae5d\ud217), xor:int(ldc:int(16448), ldc:int(16449)))), loadelement:String(getstatic:String[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ucfaf\u718f\u7e3f\u3e2a\uae5d\ud217), xor:int(ldc:int(4484), ldc:int(4487)))), loadelement:String(getstatic:String[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ucfaf\u718f\u7e3f\u3e2a\uae5d\ud217), and:int(ldc:int(4244), ldc:int(260)))))
        }
        
        return:Dynamic<?>(var_3_66:Dynamic<?>)
    }
    
    private static \u56bd\u8413\u647c\u5bc4\ud158.\u7049\u99f7\u494c\ua61f\u446c\u4492 lambda$\u4cd9\uf94d\u7049\u9af2\uf94d\uf9c5$1(java.nio.ByteBuffer p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u7049\u99f7\u494c\ua61f\u446c\u4492(initobject:\u7049\u99f7\u494c\ua61f\u446c\u4492(\u7049\u99f7\u494c\ua61f\u446c\u4492::<init>, invokestatic:byte[](DataFixUtils::toArray, p0:ByteBuffer)))
        }
        
        goto(Label_0006)
    }
    
    private static \u56bd\u8413\u647c\u5bc4\ud158.\u7049\u99f7\u494c\ua61f\u446c\u4492 lambda$\u3bc9\ud158\u2dcc\u5245\u1187\ub171$0(java.nio.ByteBuffer p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u7049\u99f7\u494c\ua61f\u446c\u4492(initobject:\u7049\u99f7\u494c\ua61f\u446c\u4492(\u7049\u99f7\u494c\ua61f\u446c\u4492::<init>, invokestatic:byte[](DataFixUtils::toArray, p0:ByteBuffer)))
        }
        
        goto(Label_0006)
    }
    
    public static it.unimi.dsi.fastutil.ints.Int2ObjectMap \ub6ab\u0c95\u7043\u946b\u69d9\ud158(\u51fa\u12cb\u7330\u74b1\u6c52.\uafe7\u3711\u4ab3\u8df4\u120d\u7d52 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Int2ObjectMap(getfield:Int2ObjectMap<IntList>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\uf995\u92ee\u5db4\u97e6\ub6ab\ub18d, p0:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52))
        }
        
        goto(Label_0006)
    }
    
    public static it.unimi.dsi.fastutil.ints.IntList \u8413\u7bad\u960f\u8709\u3e75\u8df4(\u51fa\u12cb\u7330\u74b1\u6c52.\uafe7\u3711\u4ab3\u8df4\u120d\u7d52 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:IntList(getfield:IntList(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\uc229\uc910\u64ab\ua562\u3e2a\u5fe1, p0:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_22A : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_100_0 : byte[] [generated]
        stack_12D_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        stack_291_0 : byte[] [generated]
        stack_2F8_0 : byte[] [generated]
        stack_376_0 : byte[] [generated]
        var_4_215 : int
        var_3_21A : byte[]
        var_5_21B : int
        expr_23D : byte [generated]
        var_0_2EE : int
        expr_2F8 : byte [generated]
        stack_341_2 : byte [generated]
        stack_31E_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_27F : byte[]
        var_5_280 : int
        expr_D0 : int [generated]
        expr_100 : int [generated]
        var_3_364 : byte[]
        var_5_365 : int
        var_3_139 : String
        stack_20E_0 : String[] [generated]
        expr_14B : String[] [generated]
        
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
        var_0_22A = and:int(ldc:int(793600644), ldc:int(1810756558))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_23D_0 = stack_291_0 = stack_2F8_0 = stack_376_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("tqY/NchVUcY+O0IXGq25Si7BMzu5yk6yzz7LtskzS8dLr7rItjBD4mXmYWHWzA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_215 = expr_6E:int
        var_3_21A = newarray:byte[](byte.class, expr_6E:int)
        var_5_21B = expr_6E:int
        Label_0541:
        
        while (cmpne:boolean(and:int(var_0_22A:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_22A = and:int(var_0_22A:int, ldc:int(-1074267491))
            var_5_21B = add:int(var_5_21B:int, ldc:int(-1))
            expr_23D = loadelement:byte(stack_23D_0:byte[], var_5_21B:int)
            storeelement:byte(var_3_21A:byte[], var_5_21B:int, xor:int(or:int(and:int(shl:int(expr_23D:byte, and:int(ldc:int(6), ldc:int(27269))), ldc:int(-16)), and:int(shr:int(expr_23D:byte[expected:int], and:int(ldc:int(1428), ldc:int(16389))), ldc:int(15))), ldc:int(108)))
            
            if (cmpne:boolean(var_5_21B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_23D_0 = stack_291_0 = stack_2F8_0 = stack_376_0 = var_3_21A:byte[]
            goto(Label_0115)
        }
        
        var_0_22A = and:int(var_0_22A:int, ldc:int(753981184))
        Label_0728:
        
        while (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_2EE = and:int(var_0_22A:int, ldc:int(-1613267049))
            var_5_21B = add:int(var_5_21B:int, ldc:int(-1))
            expr_2F8 = stack_341_2 = loadelement(stack_2F8_0, var_5_21B)
            
            if (cmplt:boolean(add:int(add:int(var_5_21B:int, ldc:int(6)), neg:int(var_4_215:int)), ldc:int(0))) {
                stack_341_2 = stack_31E_0 = add:byte(expr_2F8:byte, loadelement:byte(var_3_21A:byte[], add:int(var_5_21B:int, ldc:int(6))))
                goto(Label_0814)
            }
            
            Label_0773:
            
            if (cmpne:boolean(and:int(var_0_2EE:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_2EE = and:int(var_0_2EE:int, ldc:int(-1014347926))
            }
            else {
                var_0_2EE = and:int(var_0_2EE:int, ldc:int(158726798))
                stack_341_2 = stack_31E_0 = add:byte(expr_2F8:byte, ldc:byte(6))
            }
            
            Label_0814:
            
            if (cmpne:boolean(and:int(var_0_2EE:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0773)
            }
            
            var_0_22A = and:int(var_0_2EE:int, ldc:int(1577018255))
            storeelement:byte(var_3_21A:byte[], var_5_21B:int, stack_341_2:byte)
            
            if (cmpne:boolean(var_5_21B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_23D_0 = stack_291_0 = stack_2F8_0 = stack_376_0 = var_3_21A:byte[]
            goto(Label_0213)
        }
        
        var_0_22A = and:int(var_0_22A:int, ldc:int(107650241))
        goto(Label_0541)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0261)
        }
        
        if (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0213)
        }
        
        if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_22A = and:int(var_0_22A:int, ldc:int(1656592136))
        }
        else {
            var_0_22A = and:int(var_0_22A:int, ldc:int(-850039818))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_27F = newarray:byte[](byte.class, expr_A0:int)
                var_5_280 = expr_A0:int
                
                loop {
                    var_0_22A = and:int(var_0_22A:int, ldc:int(457537221))
                    var_5_280 = add:int(var_5_280:int, ldc:int(-1))
                    storeelement:byte(var_3_27F:byte[], var_5_280:int, add:int(shl:int(loadelement:byte(stack_291_0:byte[], var_5_280:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_280:int, xor:int(ldc:int(308), ldc:int(309)))), ldc:int(3)), xor:int(ldc:int(2582), ldc:int(2569)))))
                    
                    if (cmpne:boolean(var_5_280:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_23D_0 = stack_291_0 = stack_2F8_0 = stack_376_0 = var_3_27F:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0261)
        }
        
        if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_22A = and:int(var_0_22A:int, ldc:int(-643563783))
                goto(Label_0115)
            }
            
            var_0_22A = and:int(var_0_22A:int, ldc:int(1868395492))
            expr_D0 = arraylength:int(stack_D0_0:byte[])
            
            if (cmpne:boolean(expr_D0:int, ldc:int(0))) {
                var_4_215 = expr_D0:int
                var_3_21A = newarray:byte[](byte.class, expr_D0:int)
                var_5_21B = expr_D0:int
                goto(Label_0728)
            }
        }
        
        Label_0213:
        
        if (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_22A = and:int(var_0_22A:int, ldc:int(528162982))
        }
        else {
            if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_22A = and:int(var_0_22A:int, ldc:int(1005054911))
            expr_100 = arraylength:int(stack_100_0:byte[])
            
            if (cmpne:boolean(expr_100:int, ldc:int(0))) {
                var_3_364 = newarray:byte[](byte.class, expr_100:int)
                var_5_365 = expr_100:int
                
                loop {
                    var_0_22A = and:int(var_0_22A:int, ldc:int(427648685))
                    var_5_365 = add:int(var_5_365:int, ldc:int(-1))
                    storeelement:byte(var_3_364:byte[], var_5_365:int, add:byte(loadelement:byte(stack_376_0:byte[], var_5_365:int), ldc:byte(31)))
                    
                    if (cmpne:boolean(var_5_365:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_23D_0 = stack_291_0 = stack_2F8_0 = stack_376_0 = var_3_364:byte[]
            }
        }
        
        Label_0261:
        
        if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0213)
        }
        
        if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(131072)), ldc:int(0))) {
            var_0_22A = and:int(var_0_22A:int, ldc:int(-337430975))
            goto(Label_0165)
        }
        
        if (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_139 = initobject:String(String::<init>, stack_12D_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_20E_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(134), ldc:int(129)))
            expr_14B = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8743), ldc:int(8736)))
            storeelement:String(expr_14B:String[], and:int(ldc:int(2254), ldc:int(9474)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(-25240), ldc:int(25237)), and:int(ldc:int(1037), ldc:int(10589))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-12287), ldc:int(-12283)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(21661), ldc:int(109)), and:int(ldc:int(4433), ldc:int(17076))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-12219), ldc:int(-12221)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-23923), ldc:int(-23907)), xor:int(ldc:int(5269), ldc:int(5262))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(6193), ldc:int(1475)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(26639), ldc:int(26644)), and:int(ldc:int(16997), ldc:int(8489))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(12295), ldc:int(16899)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(5417), ldc:int(119)), and:int(ldc:int(18919), ldc:int(1077))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(16445), ldc:int(3077)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(10589), ldc:int(10616)), xor:int(ldc:int(-32146), ldc:int(-32190))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(1075), ldc:int(-1076)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(16446), ldc:int(16402)), xor:int(ldc:int(16421), ldc:int(16392))))
            putstatic:String[](\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ucfaf\u718f\u7e3f\u3e2a\uae5d\ud217, expr_14B:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u56bd\u7ce1\u4cd9\u9033\u7bad\ubcb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6AA : int
        
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
        var_3_69F = and:int(ldc:int(968128775), ldc:int(1774152175))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(750020885))
            var_5_81 = and:int(ldc:int(8650), ldc:int(-11723))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21129), ldc:int(-21130)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_69F:int, ldc:int(-268964842))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(12300), ldc:int(12301)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(20495), ldc:int(8257)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_DA:int, ldc:int(1039989326))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-23548), ldc:int(-23547)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-664954933))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2076384272))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1270997475))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-912342667))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1663283288))
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2142698990))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1877535752))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1441579944))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(249807819))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-112529767))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1522117382))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-103678937))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1095468218))
                            var_11_EB = and:int(ldc:int(17904), ldc:int(-18426))
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0604:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(314774716))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1197418283))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-795355417))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1023306845))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2072761434))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2010356505))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2106516881))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(675360595))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-589815901))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-753965192))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(336160629))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1111725330))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1634871245))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(851215450))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-726186729))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1730478336))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(956201958))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(13089), ldc:int(17409))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(243567366))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1620710070))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1610136285))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-105617234))
                        var_11_EB = and:int(ldc:int(-22607), ldc:int(22606))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1779999447))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-128870700))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-82358621))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1251923883))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1854428484))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(968883834))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1191772252))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-216897918))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1155)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-139929607))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1248791132))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-55153554))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1571)
                    }
                    
                    Label_1425:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-171882393))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(668635479))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2117833678))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1139575748))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2077717789))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-369329459))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(9581670))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(158596152))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1202856789))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-104927737))
                        var_17_6AA = add:int(var_16_119:int, xor:int(ldc:int(418), ldc:int(419)))
                        looporswitchbreak()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-881018086))
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(1756786260))
                
                if (cmple:boolean(var_5_81 = var_17_6AA:int, sub:int(var_6_88:int, xor:int(ldc:int(272), ldc:int(273))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(1396970505))
            goto(Label_0108)
        }
    }
}
