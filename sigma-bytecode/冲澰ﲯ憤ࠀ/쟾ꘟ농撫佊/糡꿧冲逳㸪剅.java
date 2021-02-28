public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T> {
    public void \u7ce1\uafe7\u51b2\u9033\u3e2a\u5245(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, com.mojang.serialization.Lifecycle p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4(\u97e6\u3a62\uc29a\u16f6\u647c\u5db4::<init>, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>, p1:Lifecycle)
            putfield:ObjectList<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u960f\u16f6\u946b\u4c04\u3711\u3e2a, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, initobject:ObjectArrayList[expected:ObjectList<T>](ObjectArrayList::<init>, and:int(ldc:int(320), ldc:int(22274))))
            invokeinterface:void(Object2IntMap::defaultReturnValue, putfield:Object2IntMap<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u6fb0\ubff1\ubcb0\u1833\u52d3\u446c, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, initobject:Object2IntOpenCustomHashMap[expected:Object2IntMap<T>](Object2IntOpenCustomHashMap::<init>, invokestatic:Hash$Strategy(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u1187\u718f\uceb8\u3e2a\ufcaf\u9255))), ldc:int(-1))
            putfield:BiMap<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u836c\u97b7\u3bc9\ubf56\u839e\u3776, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, invokestatic:HashBiMap[expected:BiMap<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>](HashBiMap::create))
            putfield:BiMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u965f\u385b\u52d3\u3bd6\uc238\ub102, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, invokestatic:HashBiMap[expected:BiMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>](HashBiMap::create))
            putfield:Map<T, Lifecycle>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u4c2b\u446c\ubb2b\ucfaf\u9033\u965f, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, invokestatic:IdentityHashMap[expected:Map<T, Lifecycle>](Maps::newIdentityHashMap))
            putfield:Lifecycle(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u156b\u5245\u4e72\uafe7\u52d3\u71f1, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, p1:Lifecycle)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.serialization.MapCodec<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u9255\u93a2\ufe34\u56bd\u4179\u600f<T>> \ud36e\u4d85\ub7dc\uc246\u5245\uc2e8(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, com.mojang.serialization.MapCodec<T> p1) {
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
    
    public V extends T \ud158\ub19c\u8258\ub113\u6cfe\uc29a(int p0, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T> p1, V extends T p2, com.mojang.serialization.Lifecycle p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:V extends T(invokespecial:V extends T(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>::\u4492\u76bc\ud7e8\u88c5\u61a4\u93a2, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, p0:int, p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, p2:V extends T, p3:Lifecycle, and:int[expected:boolean](ldc:int(1301), ldc:int(4099))))
        }
        
        goto(Label_0006)
    }
    
    private V extends T \u4492\u76bc\ud7e8\u88c5\u61a4\u93a2(int p0, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T> p1, V extends T p2, com.mojang.serialization.Lifecycle p3, boolean p4) {
        var_6_BA : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_6_BA = and:int(ldc:int(-36482343), ldc:int(2138502046))
            invokestatic:Object(Validate::notNull, p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6)
            invokestatic:Object(Validate::notNull, p2:V extends T[expected:Object])
            invokeinterface:void(ObjectList::size, getfield:ObjectList<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u960f\u16f6\u946b\u4c04\u3711\u3e2a, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), invokestatic:int(Math::max, invokeinterface:int(ObjectList::size, getfield:ObjectList<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u960f\u16f6\u946b\u4c04\u3711\u3e2a, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>)), add:int(p0:int, and:int(ldc:int(2201), ldc:int(21601)))))
            invokeinterface:Object(ObjectList::set, getfield:ObjectList<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u960f\u16f6\u946b\u4c04\u3711\u3e2a, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p0:int, p2:V extends T[expected:Object])
            invokeinterface:int(Object2IntMap::put, getfield:Object2IntMap<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u6fb0\ubff1\ubcb0\u1833\u52d3\u446c, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p2:V extends T[expected:Object], p0:int)
            putfield:Object[](\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u759a\u76bc\ube23\uf995\u516c\ubcb0, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, aconstnull:Object[]())
            
            if (p4:boolean) {
                if (invokeinterface:boolean(BiMap::containsKey, getfield:BiMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u965f\u385b\u52d3\u3bd6\uc238\ub102, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6[expected:Object])) {
                    invokeinterface:void(Logger::debug, getstatic:Logger(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u0c95\u93a2\u3504\uf94d\uc7fe\u47c2), ldc:String("Adding duplicate key '{}' to registry"), p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6[expected:Object])
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_6_BA:int, ldc:int(8192)), ldc:int(0))) {
                    var_6_BA = and:int(var_6_BA:int, ldc:int(2039706539))
                    
                    if (invokeinterface:boolean(BiMap::containsValue, getfield:BiMap<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u836c\u97b7\u3bc9\ubf56\u839e\u3776, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p2:V extends T[expected:Object])) {
                        invokeinterface:void(Logger::error, getstatic:Logger(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u0c95\u93a2\u3504\uf94d\uc7fe\u47c2), ldc:String("Adding duplicate value '{}' to registry"), p2:V extends T[expected:Object])
                    }
                }
                
                if (cmpeq:boolean(and:int(var_6_BA:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_6_BA = and:int(var_6_BA:int, ldc:int(-387139731))
            }
            
            invokeinterface:Object(BiMap::put, getfield:BiMap<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u836c\u97b7\u3bc9\ubf56\u839e\u3776, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u64f2\ub8be\u760c\u5245\u6c52\u7af6::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6), p2:V extends T[expected:Object])
            invokeinterface:Object(BiMap::put, getfield:BiMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u965f\u385b\u52d3\u3bd6\uc238\ub102, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6[expected:Object], p2:V extends T[expected:Object])
            invokeinterface:Lifecycle(Map<T, Lifecycle>::put, getfield:Map<T, Lifecycle>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u4c2b\u446c\ubb2b\ucfaf\u9033\u965f, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p2:V extends T[expected:T], p3:Lifecycle)
            putfield:Lifecycle(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u156b\u5245\u4e72\uafe7\u52d3\u71f1, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, invokevirtual:Lifecycle(Lifecycle::add, getfield:Lifecycle(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u156b\u5245\u4e72\uafe7\u52d3\u71f1, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p3:Lifecycle))
            
            if (cmple:boolean(getfield:int(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\ub7dc\ube23\uc84e\u7d52\u4f52\ud158, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p0:int)) {
                putfield:int(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\ub7dc\ube23\uc84e\u7d52\u4f52\ud158, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, add:int(p0:int, and:int(ldc:int(131), ldc:int(16425))))
            }
            
            return:V extends T(p2:V extends T)
        }
        
        goto(Label_0006)
    }
    
    public V extends T \ud158\ub19c\u8258\ub113\u6cfe\uc29a(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T> p0, V extends T p1, com.mojang.serialization.Lifecycle p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:V extends T(invokevirtual:V extends T(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, getfield:int(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\ub7dc\ube23\uc84e\u7d52\u4f52\ud158, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, p1:V extends T, p2:Lifecycle))
        }
        
        goto(Label_0006)
    }
    
    public V extends T \u8753\u836c\u51b2\u6c56\u718f\u5db4(java.util.OptionalInt p0, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T> p1, V extends T p2, com.mojang.serialization.Lifecycle p3) {
        var_5_E8 : int
        var_7_77 : Object
        stack_101_0 : int [generated]
        var_8_98 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_E8 = and:int(ldc:int(-721625408), ldc:int(-117793031))
            invokestatic:Object(Validate::notNull, p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>[expected:Object])
            invokestatic:Object(Validate::notNull, p2:V extends T[expected:Object])
            var_7_77 = invokeinterface:Object(BiMap::get, getfield:BiMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u965f\u385b\u52d3\u3bd6\uc238\ub102, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>[expected:Object])
            
            if (cmpeq:boolean(var_7_77:Object, aconstnull:Object())) {
                if (logicalnot:boolean(invokevirtual:boolean(OptionalInt::isPresent, p0:OptionalInt))) {
                    goto(Label_0207)
                }
                
                stack_101_0 = invokevirtual:int(OptionalInt::getAsInt, p0:OptionalInt)
                goto(Label_0249)
            }
            
            Label_0126:
            
            if (cmpne:boolean(and:int(var_5_E8:int, ldc:int(268435456)), ldc:int(0))) {
                var_8_98 = invokeinterface:int(Object2IntMap::getInt, getfield:Object2IntMap<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u6fb0\ubff1\ubcb0\u1833\u52d3\u446c, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), var_7_77:Object)
                
                if (logicaland:boolean(invokevirtual:boolean(OptionalInt::isPresent, p0:OptionalInt), cmpne:boolean(invokevirtual:int(OptionalInt::getAsInt, p0:OptionalInt), var_8_98:int))) {
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("ID mismatch")))
                }
                
                invokeinterface:int(Object2IntMap::removeInt, getfield:Object2IntMap<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u6fb0\ubff1\ubcb0\u1833\u52d3\u446c, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), var_7_77:Object)
                invokeinterface:Lifecycle(Map<T, Lifecycle>::remove, getfield:Map<T, Lifecycle>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u4c2b\u446c\ubb2b\ucfaf\u9033\u965f, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), var_7_77:Object)
                return:V extends T(invokespecial:V extends T(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>::\u4492\u76bc\ud7e8\u88c5\u61a4\u93a2, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, var_8_98:int, p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, p2:V extends T, p3:Lifecycle, and:int[expected:boolean](ldc:int(-8960), ldc:int(8382))))
            }
            
            Label_0207:
            
            if (cmpne:boolean(and:int(var_5_E8:int, ldc:int(8192)), ldc:int(0))) {
                var_5_E8 = and:int(var_5_E8:int, ldc:int(-628920720))
                goto(Label_0126)
            }
            
            var_5_E8 = and:int(var_5_E8:int, ldc:int(-606349672))
            stack_101_0 = getfield:int(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\ub7dc\ube23\uc84e\u7d52\u4f52\ud158, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>)
            Label_0249:
            var_8_98 = stack_101_0:int
            return:V extends T(invokespecial:V extends T(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>::\u4492\u76bc\ud7e8\u88c5\u61a4\u93a2, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, var_8_98:int, p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, p2:V extends T, p3:Lifecycle, and:int[expected:boolean](ldc:int(-8960), ldc:int(8382))))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u8df4\ua068\u9af2\u8350\uc29a\u392e(T p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:Object[expected:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753](BiMap::get, invokeinterface:BiMap(BiMap::inverse, getfield:BiMap<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u836c\u97b7\u3bc9\ubf56\u839e\u3776, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>)), p0:T[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>> \u836c\uc3e3\u9a18\ufcaf\uc3e3\ubff1(T p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Optional<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>>(invokestatic:Optional<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>>(Optional<T>::ofNullable, invokeinterface:Object[expected:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>](BiMap::get, invokeinterface:BiMap(BiMap::inverse, getfield:BiMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u965f\u385b\u52d3\u3bd6\uc238\ub102, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>)), p0:T[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public int \ud217\u5d20\u52d3\u92ee\u446c\ube23(T p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(invokeinterface:int(Object2IntMap::getInt, getfield:Object2IntMap<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u6fb0\ubff1\ubcb0\u1833\u52d3\u446c, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p0:T[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public T \ube23\ucb79\uc84e\u92ee\u965f\u3bc9(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T> p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:T(invokeinterface:Object[expected:T](BiMap::get, getfield:BiMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u965f\u385b\u52d3\u3bd6\uc238\ub102, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public T \ufe34\u6ec6\uceb8\uff55\u9033\ube23(int p0) {
        var_2_61 : int
        stack_98_0 : Object [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(-162005914), ldc:int(-581247377))
            
            if (logicaland:boolean(cmpge:boolean(p0:int, ldc:int(0)), cmplt:boolean(p0:int, invokeinterface:int(ObjectList::size, getfield:ObjectList<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u960f\u16f6\u946b\u4c04\u3711\u3e2a, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>))))) {
                stack_98_0 = invokeinterface:Object(ObjectList::get, getfield:ObjectList<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u960f\u16f6\u946b\u4c04\u3711\u3e2a, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p0:int)
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1245712657))
                stack_98_0 = aconstnull:Object()
            }
            
            return:T(stack_98_0:Object)
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Lifecycle \u8df4\u4492\u983f\uc246\u6ec6\u4cd9(T p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Lifecycle(checkcast:Lifecycle(com.mojang.serialization.Lifecycle.class, invokeinterface:Lifecycle(Map<T, Lifecycle>::get, getfield:Map<T, Lifecycle>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u4c2b\u446c\ubb2b\ucfaf\u9033\u965f, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p0:T[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Lifecycle \u98a4\u6fb0\u8350\u7873\u2dcc\ua068() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Lifecycle(getfield:Lifecycle(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u156b\u5245\u4e72\uafe7\u52d3\u71f1, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Iterator<T> iterator() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Iterator<T>(invokestatic:UnmodifiableIterator[expected:Iterator<T>](Iterators::filter, invokeinterface:ObjectListIterator[expected:Iterator](ObjectList::iterator, getfield:ObjectList<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u960f\u16f6\u946b\u4c04\u3711\u3e2a, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>)), invokedynamic:Predicate(apply:()Lcom/google/common/base/Predicate;)))
        }
        
        goto(Label_0006)
    }
    
    public T \u3776\uc2bd\uc246\ufcaf\u4975\u0800(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:T(invokeinterface:Object[expected:T](BiMap::get, getfield:BiMap<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u836c\u97b7\u3bc9\ubf56\u839e\u3776, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u92ee\u4c04\u7c6b\u5db4\ud36e\u8389() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(invokestatic:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(Collections::unmodifiableSet, invokeinterface:Set(BiMap::keySet, getfield:BiMap<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u836c\u97b7\u3bc9\ubf56\u839e\u3776, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<java.util.Map.Entry<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>> \u516c\ud51e\u3e2a\u36d3\uc7fe\u836c() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Set<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>>(invokeinterface:Set<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>>(Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>::entrySet, invokestatic:Map<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>(Collections::unmodifiableMap, getfield:BiMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>[expected:Map<? extends \u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, ? extends T>](\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u965f\u385b\u52d3\u3bd6\uc238\ub102, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>))))
        }
        
        goto(Label_0006)
    }
    
    public T \ubded\u4daf\uc229\u97e6\u3776\u4daf(java.util.Random p0) {
        var_2_61 : int
        var_4_88 : Set
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(-439392136), ldc:int(-1312330375))
            
            if (cmpeq:boolean(getfield:Object[](\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u759a\u76bc\ube23\uf995\u516c\ubcb0, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), aconstnull:Object[]())) {
                var_4_88 = invokeinterface:Set(BiMap::values, getfield:BiMap<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u836c\u97b7\u3bc9\ubf56\u839e\u3776, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>))
                
                if (invokeinterface:boolean(Collection::isEmpty, var_4_88:Set[expected:Collection])) {
                    return:T(aconstnull:T())
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-637698865))
                putfield:Object[](\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u759a\u76bc\ube23\uf995\u516c\ubcb0, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, invokeinterface:Object[](Collection::toArray, var_4_88:Set[expected:Collection], newarray:Object[](java.lang.Object.class, invokeinterface:int(Collection::size, var_4_88:Set[expected:Collection]))))
            }
            
            return:T(invokestatic:T(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u6d99\u4daf\u52d3\u624e\ub18d\ub8be, checkcast:Object[][expected:T[]](java.lang.Object[].class, getfield:Object[][expected:T[]](\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u759a\u76bc\ube23\uf995\u516c\ubcb0, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>)), p0:Random))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u1187\u97b7\u839e\ub8be\u40a9\u7330(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokeinterface:boolean(BiMap::containsKey, getfield:BiMap<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u836c\u97b7\u3bc9\ubf56\u839e\u3776, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.serialization.Codec<\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>> \ud36e\u600f\u88c5\u7330\ud51e\u3711(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, com.mojang.serialization.Lifecycle p1, com.mojang.serialization.Codec<T> p2) {
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
    
    public static com.mojang.serialization.Codec<\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>> \u4c04\u8413\ub6ab\u4c04\u47c2\u6cfe(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, com.mojang.serialization.Lifecycle p1, com.mojang.serialization.Codec<T> p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Codec<\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>>(invokestatic:\ub113\u64f2\u5db4\u6c52\ub83f\u3bd6<Object>[expected:Codec<\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>>](\ub113\u64f2\u5db4\u6c52\ub83f\u3bd6<E>::\u9937\u6ec6\uc246\ub102\uc229\u74b1, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>>, p1:Lifecycle, p2:Codec))
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.serialization.Codec<\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>> \u16f6\ufe34\ufe34\u62da\ucb79\uc31c(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, com.mojang.serialization.Lifecycle p1, com.mojang.serialization.Codec<T> p2) {
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
    
    private static java.util.Map lambda$\ub18d\u0a06\u6c56\u92ee\u3d4b\u4f52$8(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Map(invokestatic:ImmutableMap[expected:Map](ImmutableMap::copyOf, getfield:BiMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>[expected:Map](\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u965f\u385b\u52d3\u3bd6\uc238\ub102, p0:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245)))
        }
        
        goto(Label_0006)
    }
    
    private static \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245 lambda$\u4c04\u98a4\u69d9\u2dcc\ud523\ua3b4$7(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6 p0, com.mojang.serialization.Lifecycle p1, java.util.Map p2) {
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
    
    private static void lambda$\u446c\u6d99\uc3e3\u9a18\ua562\u0800$6(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245 p0, com.mojang.serialization.Lifecycle p1, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6 p2, java.lang.Object p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:Object(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, p0:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245, p2:\u64f2\ub8be\u760c\u5245\u6c52\u7af6, p3:Object, p1:Lifecycle)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u4c2b\uae87\uc84e\u64f2\u385b\u946b$5(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245 p0) {
        var_1_61 : int
        var_3_65 : ImmutableList$Builder
        var_4_6A : Iterator<Object>
        var_5_92 : Object
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(1584073318), ldc:int(1945767140))
            var_3_65 = invokestatic:ImmutableList$Builder(ImmutableList::builder)
            var_4_6A = invokevirtual:Iterator<Object>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>::iterator, p0:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>)
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-621275034))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_6A:Iterator<Object>))) {
                    looporswitchbreak()
                }
                
                var_5_92 = invokeinterface:Object(Iterator<Object>::next, var_4_6A:Iterator<Object>)
                invokevirtual:ImmutableList$Builder(ImmutableList$Builder::add, var_3_65:ImmutableList$Builder, initobject:\u9255\u93a2\ufe34\u56bd\u4179\u600f<T>(\u9255\u93a2\ufe34\u56bd\u4179\u600f<Object>::<init>, checkcast:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<java.lang.Object>.class, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>(Optional<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>>::get, invokevirtual:Optional<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>::\u836c\uc3e3\u9a18\ufcaf\uc3e3\ubff1, p0:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>, var_5_92:Object))), invokevirtual:int(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>::\ud217\u5d20\u52d3\u92ee\u446c\ube23, p0:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>, var_5_92:Object), var_5_92:Object))
            }
            
            return:List(invokevirtual:ImmutableList(ImmutableList$Builder::build, var_3_65:ImmutableList$Builder))
        }
        
        goto(Label_0006)
    }
    
    private static \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245 lambda$\u51fa\u67e9\ua3b4\ub102\u516c\u120d$4(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6 p0, com.mojang.serialization.Lifecycle p1, java.util.List p2) {
        var_3_61 : int
        var_5_6B : \u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>
        var_6_73 : Iterator<\u9255\u93a2\ufe34\u56bd\u4179\u600f>
        var_7_9C : \u9255\u93a2\ufe34\u56bd\u4179\u600f
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(-1080987005), ldc:int(-46599581))
            var_5_6B = initobject:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>::<init>, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>>, p1:Lifecycle)
            var_6_73 = invokeinterface:Iterator<\u9255\u93a2\ufe34\u56bd\u4179\u600f>(List<\u9255\u93a2\ufe34\u56bd\u4179\u600f>::iterator, p2:List<\u9255\u93a2\ufe34\u56bd\u4179\u600f>)
            
            loop {
                var_3_61 = and:int(var_3_61:int, ldc:int(-859121))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_73:Iterator<\u9255\u93a2\ufe34\u56bd\u4179\u600f>))) {
                    looporswitchbreak()
                }
                
                var_7_9C = checkcast:\u9255\u93a2\ufe34\u56bd\u4179\u600f(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u9255\u93a2\ufe34\u56bd\u4179\u600f.class, invokeinterface:\u9255\u93a2\ufe34\u56bd\u4179\u600f(Iterator<\u9255\u93a2\ufe34\u56bd\u4179\u600f>::next, var_6_73:Iterator<\u9255\u93a2\ufe34\u56bd\u4179\u600f>))
                invokevirtual:T(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, var_5_6B:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>, getfield:int(\u9255\u93a2\ufe34\u56bd\u4179\u600f::\ub32d\u960f\u8753\u8709\ufcaf\ufcaf, var_7_9C:\u9255\u93a2\ufe34\u56bd\u4179\u600f), getfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>(\u9255\u93a2\ufe34\u56bd\u4179\u600f::\u416d\u6b0d\ub32d\u3bc9\u4c04\u7af6, var_7_9C:\u9255\u93a2\ufe34\u56bd\u4179\u600f), getfield:T(\u9255\u93a2\ufe34\u56bd\u4179\u600f::\u4492\u8753\uc87f\u7d52\ub1b9\u3bd6, var_7_9C:\u9255\u93a2\ufe34\u56bd\u4179\u600f), p1:Lifecycle)
            }
            
            return:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245(var_5_6B:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u71f1\u6ec6\ub83f\ub70c\u6ec6\u5bc4$3(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6 p0, com.mojang.serialization.MapCodec p1, com.mojang.serialization.codecs.RecordCodecBuilder$Instance p2) {
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
    
    private static java.lang.Object lambda$\u183a\ud171\u5654\uc9f6\u7330\u76bc$2(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u9255\u93a2\ufe34\u56bd\u4179\u600f p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Object(getfield:T[expected:Object](\u9255\u93a2\ufe34\u56bd\u4179\u600f::\u4492\u8753\uc87f\u7d52\ub1b9\u3bd6, p0:\u9255\u93a2\ufe34\u56bd\u4179\u600f))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u624e\u4f52\u6c56\u8640\u839e\ub6ab$1(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u9255\u93a2\ufe34\u56bd\u4179\u600f p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u9255\u93a2\ufe34\u56bd\u4179\u600f::\ub32d\u960f\u8753\u8709\ufcaf\ufcaf, p0:\u9255\u93a2\ufe34\u56bd\u4179\u600f)))
        }
        
        goto(Label_0006)
    }
    
    private static \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6 lambda$\ud217\ud36e\ub32d\ub70c\u3d4b\u6d69$0(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u9255\u93a2\ufe34\u56bd\u4179\u600f p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u64f2\ub8be\u760c\u5245\u6c52\u7af6(getfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>(\u9255\u93a2\ufe34\u56bd\u4179\u600f::\u416d\u6b0d\ub32d\u3bc9\u4c04\u7af6, p0:\u9255\u93a2\ufe34\u56bd\u4179\u600f))
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
            putstatic:Logger(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245::\u0c95\u93a2\u3504\uf94d\uc7fe\u47c2, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u40a9\u8753\u7d52\ucef1\u927d\ub1b9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64D : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_658 : int
        
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
        var_3_64D = and:int(ldc:int(1208979610), ldc:int(-843377718))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_64D = and:int(var_3_64D:int, ldc:int(714829275))
            var_5_81 = and:int(ldc:int(-18011), ldc:int(17482))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-26682), ldc:int(26681)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_64D:int, ldc:int(-1973767529))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(1027), ldc:int(29121)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(3332), ldc:int(3333)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_64D = and:int(var_3_DA:int, ldc:int(992911266))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(10273), ldc:int(16385)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-144923939))
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2108547843))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0662)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1056696975))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0539)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0392:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(261818244))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1123395652))
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0662)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1226804199))
                            var_11_EB = and:int(ldc:int(-12226), ldc:int(12224))
                            goto(Label_1482)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0539:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1487192833))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1036205619))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(2071351007))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-114119505))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(490420391))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0662:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-908798171))
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(2060924942))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-953036384))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-200407456))
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(851995638))
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(850386546))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(166392007))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(265225150))
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1041790904))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(2018387322))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0662)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1483622554))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1315851681))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-268736349))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-22016), ldc:int(-22015))
                                goto(Label_1085)
                            }
                        }
                    }
                    
                    Label_0943:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-4223300))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1521445780))
                            goto(Label_0662)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1944441966))
                        var_11_EB = and:int(ldc:int(475), ldc:int(-16892))
                    }
                    
                    Label_1085:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0943)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-546773971))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(753398523))
                            goto(Label_0662)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-725300394))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1937785832))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-825313321))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1336)
                            }
                        }
                    }
                    
                    Label_1210:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1286616246))
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(444408935))
                            goto(Label_1085)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0943)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0662)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-974950317))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1746566655))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1482)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1336:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1053876809))
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1864547344))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1359090116))
                        goto(Label_0662)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1495528901))
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1447727272))
                        loopcontinue()
                    }
                    
                    var_3_64D = and:int(var_3_64D:int, ldc:int(1327387786))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1482:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_658 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1493:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1685899870))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(932773499))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(2057859072))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0662)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(159664997))
                        goto(Label_0539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(2017360330))
                        var_17_658 = add:int(var_16_119:int, xor:int(ldc:int(549), ldc:int(548)))
                        looporswitchbreak()
                    }
                    
                    var_3_64D = and:int(var_3_64D:int, ldc:int(-448331170))
                }
                
                var_3_64D = and:int(var_3_64D:int, ldc:int(-810632449))
                
                if (cmple:boolean(var_5_81 = var_17_658:int, sub:int(var_6_88:int, and:int(ldc:int(20737), ldc:int(2145))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_64D = and:int(var_3_64D:int, ldc:int(-1810281392))
            goto(Label_0108)
        }
    }
}
