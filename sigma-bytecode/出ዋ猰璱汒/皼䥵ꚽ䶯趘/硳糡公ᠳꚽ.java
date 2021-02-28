public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u7873\u7ce1\u516c\u1833\ua6bd<T> {
    private static java.util.Comparator<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u67e9\uc84e\u839e\uc9f6\u8d98<T>> \u9a18\u9af2\ua3b4\ucfaf\u3bd6\u6c52() {
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
    
    public void \u7873\u7ce1\u516c\u1833\ua6bd(\u5d20\u97b7\u8753\u873d\u16f6.\u8c8a\u836c\u183a\u3e2a\u3c25<T> p0, java.util.stream.Stream<com.mojang.serialization.Dynamic<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab>> p1) {
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
    
    public void \u7873\u7ce1\u516c\u1833\ua6bd(\u5d20\u97b7\u8753\u873d\u16f6.\u8c8a\u836c\u183a\u3e2a\u3c25<T> p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>)
            putfield:Queue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>(\u7873\u7ce1\u516c\u1833\ua6bd::\ub1b9\u72f1\u4c04\u71f1\u647c\u3504, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>, initobject:PriorityQueue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>[expected:Queue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>](PriorityQueue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>::<init>, invokestatic:Comparator<\u67e9\uc84e\u839e\uc9f6\u8d98<Object>>(\u7873\u7ce1\u516c\u1833\ua6bd<T>::\u9a18\u9af2\ua3b4\ucfaf\u3bd6\u6c52)))
            putfield:UnsignedLong(\u7873\u7ce1\u516c\u1833\ua6bd::\u718f\u99f7\u5bc4\u62da\uff55\u4d85, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>, getstatic:UnsignedLong(UnsignedLong::ZERO))
            putfield:Table<String, Long, \u67e9\uc84e\u839e\uc9f6\u8d98<T>>(\u7873\u7ce1\u516c\u1833\ua6bd::\u0a06\uc238\u0800\u4179\u836c\u7873, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>, invokestatic:HashBasedTable[expected:Table<String, Long, \u67e9\uc84e\u839e\uc9f6\u8d98<T>>](HashBasedTable::create))
            putfield:\u8c8a\u836c\u183a\u3e2a\u3c25<T>(\u7873\u7ce1\u516c\u1833\ua6bd::\u624e\uc4d2\u7d52\uafe7\uc2bd\u40a9, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>, p0:\u8c8a\u836c\u183a\u3e2a\u3c25<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run(T p0, long p1) {
        var_4_61 : int
        var_4_68 : int
        var_6_76 : \u67e9\uc84e\u839e\uc9f6\u8d98<T>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_61 = and:int(ldc:int(1860317040), ldc:int(1006581337))
            
            loop {
                var_4_68 = and:int(var_4_61:int, ldc:int(795535227))
                var_6_76 = checkcast:\u67e9\uc84e\u839e\uc9f6\u8d98<T>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u67e9\uc84e\u839e\uc9f6\u8d98<T>.class, invokeinterface:\u67e9\uc84e\u839e\uc9f6\u8d98<T>(Queue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>::peek, getfield:Queue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>(\u7873\u7ce1\u516c\u1833\ua6bd::\ub1b9\u72f1\u4c04\u71f1\u647c\u3504, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>)))
                
                if (logicalor:boolean(cmpeq:boolean(var_6_76:\u67e9\uc84e\u839e\uc9f6\u8d98<T>, aconstnull:\u67e9\uc84e\u839e\uc9f6\u8d98<T>()), cmpgt:boolean(getfield:long(\u67e9\uc84e\u839e\uc9f6\u8d98::\u7c6b\u3711\u3711\uc9f6\u718f\u97b7, var_6_76:\u67e9\uc84e\u839e\uc9f6\u8d98<T>), p1:long))) {
                    looporswitchbreak()
                }
                
                var_4_61 = and:int(var_4_68:int, ldc:int(1064527697))
                invokeinterface:\u67e9\uc84e\u839e\uc9f6\u8d98<T>(Queue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>::remove, getfield:Queue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>(\u7873\u7ce1\u516c\u1833\ua6bd::\ub1b9\u72f1\u4c04\u71f1\u647c\u3504, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>))
                invokeinterface:Object(Table::remove, getfield:Table<String, Long, \u67e9\uc84e\u839e\uc9f6\u8d98<T>>(\u7873\u7ce1\u516c\u1833\ua6bd::\u0a06\uc238\u0800\u4179\u836c\u7873, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>), getfield:String(\u67e9\uc84e\u839e\uc9f6\u8d98::\u88c5\u385b\u385b\u8389\uc7fe\u9af2, var_6_76:\u67e9\uc84e\u839e\uc9f6\u8d98<T>), invokestatic:Long[expected:Object](Long::valueOf, p1:long))
                invokeinterface:void(\u6ec6\ud7e8\u7043\u9255\u0800<T>::run, getfield:\u6ec6\ud7e8\u7043\u9255\u0800<T>(\u67e9\uc84e\u839e\uc9f6\u8d98::\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae, var_6_76:\u67e9\uc84e\u839e\uc9f6\u8d98<T>), p0:T, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>, p1:long)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7049\ud4fe\ub171\u5fe1\u5140\u8350(java.lang.String p0, long p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u6ec6\ud7e8\u7043\u9255\u0800<T> p2) {
        var_7_9E : \u67e9\uc84e\u839e\uc9f6\u8d98<T>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            
            if (logicalnot:boolean(invokeinterface:boolean(Table::contains, getfield:Table<String, Long, \u67e9\uc84e\u839e\uc9f6\u8d98<T>>(\u7873\u7ce1\u516c\u1833\ua6bd::\u0a06\uc238\u0800\u4179\u836c\u7873, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>), p0:String[expected:Object], invokestatic:Long[expected:Object](Long::valueOf, p1:long)))) {
                putfield:UnsignedLong(\u7873\u7ce1\u516c\u1833\ua6bd::\u718f\u99f7\u5bc4\u62da\uff55\u4d85, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>, invokevirtual:UnsignedLong(UnsignedLong::plus, getfield:UnsignedLong(\u7873\u7ce1\u516c\u1833\ua6bd::\u718f\u99f7\u5bc4\u62da\uff55\u4d85, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>), getstatic:UnsignedLong(UnsignedLong::ONE)))
                var_7_9E = initobject:\u67e9\uc84e\u839e\uc9f6\u8d98<T>(\u67e9\uc84e\u839e\uc9f6\u8d98<T>::<init>, p1:long, getfield:UnsignedLong(\u7873\u7ce1\u516c\u1833\ua6bd::\u718f\u99f7\u5bc4\u62da\uff55\u4d85, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>), p0:String, p2:\u6ec6\ud7e8\u7043\u9255\u0800<T>, aconstnull:\ud7e8\u8df4\uc4d2\u5d20\u3bc9())
                invokeinterface:Object(Table::put, getfield:Table<String, Long, \u67e9\uc84e\u839e\uc9f6\u8d98<T>>(\u7873\u7ce1\u516c\u1833\ua6bd::\u0a06\uc238\u0800\u4179\u836c\u7873, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>), p0:String[expected:Object], invokestatic:Long[expected:Object](Long::valueOf, p1:long), var_7_9E:\u67e9\uc84e\u839e\uc9f6\u8d98<T>[expected:Object])
                invokeinterface:boolean(Queue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>::add, getfield:Queue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>(\u7873\u7ce1\u516c\u1833\ua6bd::\ub1b9\u72f1\u4c04\u71f1\u647c\u3504, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>), var_7_9E:\u67e9\uc84e\u839e\uc9f6\u8d98<T>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \ud4fe\u839e\u92ee\u6b0d\uf9c5\u4492(java.lang.String p0) {
        var_4_6F : Collection
        var_5_8D : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_6F = invokeinterface:Collection(Map::values, invokeinterface:Map(Table::row, getfield:Table<String, Long, \u67e9\uc84e\u839e\uc9f6\u8d98<T>>(\u7873\u7ce1\u516c\u1833\ua6bd::\u0a06\uc238\u0800\u4179\u836c\u7873, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>), p0:String[expected:Object]))
            invokeinterface:void(Iterable::forEach, var_4_6F:Collection[expected:Iterable], invokedynamic:Consumer<Object>(accept:(Ljava/util/Queue;)Ljava/util/function/Consumer;, getfield:Queue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>[expected:Collection](\u7873\u7ce1\u516c\u1833\ua6bd::\ub1b9\u72f1\u4c04\u71f1\u647c\u3504, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>)))
            var_5_8D = invokeinterface:int(Collection::size, var_4_6F:Collection)
            invokeinterface:void(Collection::clear, var_4_6F:Collection)
            return:int(var_5_8D:int)
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<java.lang.String> \u836c\u3dd3\u983f\u56bd\u600f\u4975() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Set<String>(invokestatic:Set<String>(Collections::unmodifiableSet, invokeinterface:Set(Table::rowKeySet, getfield:Table<String, Long, \u67e9\uc84e\u839e\uc9f6\u8d98<T>>(\u7873\u7ce1\u516c\u1833\ua6bd::\u0a06\uc238\u0800\u4179\u836c\u7873, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>))))
        }
        
        goto(Label_0006)
    }
    
    private void \u983f\ud36e\u12cb\uc29a\u6b5f\u9937(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
        var_5_7C : \u6ec6\ud7e8\u7043\u9255\u0800<T>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_7C = invokevirtual:\u6ec6\ud7e8\u7043\u9255\u0800<T>(\u8c8a\u836c\u183a\u3e2a\u3c25<T>::\u3bd6\u72f1\ubcb0\ub7dc\u927d\uc9f6, getfield:\u8c8a\u836c\u183a\u3e2a\u3c25<T>(\u7873\u7ce1\u516c\u1833\ua6bd::\u624e\uc4d2\u7d52\uafe7\uc2bd\u40a9, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u7873\u7ce1\u516c\u1833\ua6bd::\u64ab\u36d3\uc87f\u4d85\u516c\u494c), and:int(ldc:int(948), ldc:int(-2997)))))
            
            if (cmpne:boolean(var_5_7C:\u6ec6\ud7e8\u7043\u9255\u0800<T>, aconstnull:\u6ec6\ud7e8\u7043\u9255\u0800<T>())) {
                invokevirtual:void(\u7873\u7ce1\u516c\u1833\ua6bd<T>::\u7049\ud4fe\ub171\u5fe1\u5140\u8350, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>, invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u7873\u7ce1\u516c\u1833\ua6bd::\u64ab\u36d3\uc87f\u4d85\u516c\u494c), xor:int(ldc:int(20738), ldc:int(20739)))), invokevirtual:long(\uc31c\uc87f\uc246\u3776\ub7dc::\ud217\ud4fe\ubded\uae87\u873d\u8df4, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u7873\u7ce1\u516c\u1833\ua6bd::\u64ab\u36d3\uc87f\u4d85\u516c\u494c), xor:int(ldc:int(24577), ldc:int(24579)))), var_5_7C:\u6ec6\ud7e8\u7043\u9255\u0800<T>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u76bc\u3e2a\u72f1\u071d\u7bad\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u67e9\uc84e\u839e\uc9f6\u8d98<T> p0) {
        var_4_69 : \uc31c\uc87f\uc246\u3776\ub7dc
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_69 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_4_69:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u7873\u7ce1\u516c\u1833\ua6bd::\u64ab\u36d3\uc87f\u4d85\u516c\u494c), and:int(ldc:int(1), ldc:int(35))), getfield:String(\u67e9\uc84e\u839e\uc9f6\u8d98::\u88c5\u385b\u385b\u8389\uc7fe\u9af2, p0:\u67e9\uc84e\u839e\uc9f6\u8d98<T>))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u7e3f\ub113\u12b2\ubb2b\u64f2\u7af6, var_4_69:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u7873\u7ce1\u516c\u1833\ua6bd::\u64ab\u36d3\uc87f\u4d85\u516c\u494c), xor:int(ldc:int(720), ldc:int(722))), getfield:long(\u67e9\uc84e\u839e\uc9f6\u8d98::\u7c6b\u3711\u3711\uc9f6\u718f\u97b7, p0:\u67e9\uc84e\u839e\uc9f6\u8d98<T>))
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_4_69:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u7873\u7ce1\u516c\u1833\ua6bd::\u64ab\u36d3\uc87f\u4d85\u516c\u494c), and:int(ldc:int(18190), ldc:int(-22303))), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u8c8a\u836c\u183a\u3e2a\u3c25<T>::\ubb2b\uc246\uc9f6\ub83f\u3dd3\ud523, getfield:\u8c8a\u836c\u183a\u3e2a\u3c25<T>(\u7873\u7ce1\u516c\u1833\ua6bd::\u624e\uc4d2\u7d52\uafe7\uc2bd\u40a9, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>), getfield:\u6ec6\ud7e8\u7043\u9255\u0800<T>(\u67e9\uc84e\u839e\uc9f6\u8d98::\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae, p0:\u67e9\uc84e\u839e\uc9f6\u8d98<T>)))
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_4_69:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    public \u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e \u7ce1\u9937\ub171\u8389\u3e75\u4f4a() {
        var_3_69 : \ud158\u8308\u76bc\u0a06\ud36e
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_69 = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
            invokeinterface:void(Stream<Object>::forEach, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Stream<Object>::sorted, invokeinterface:Stream<Object>(Collection<Object>::stream, getfield:Queue<\u67e9\uc84e\u839e\uc9f6\u8d98<T>>[expected:Collection<Object>](\u7873\u7ce1\u516c\u1833\ua6bd::\ub1b9\u72f1\u4c04\u71f1\u647c\u3504, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>)), invokestatic:Comparator<\u67e9\uc84e\u839e\uc9f6\u8d98<Object>>(\u7873\u7ce1\u516c\u1833\ua6bd<T>::\u9a18\u9af2\ua3b4\ucfaf\u3bd6\u6c52)), invokedynamic:Function<\u67e9\uc84e\u839e\uc9f6\u8d98, \uc31c\uc87f\uc246\u3776\ub7dc>(apply:(L\u51fa\u12cb\u7330\u74b1\u6c52/\u76bc\u4975\ua6bd\u4daf\u8d98/\u7873\u7ce1\u516c\u1833\ua6bd;)Ljava/util/function/Function;, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>)), invokedynamic:Consumer<Object>(accept:(L\u36d3\u9033\u6b0d\u983f\u8d90/\ud158\u8308\u76bc\u0a06\ud36e;)Ljava/util/function/Consumer;, var_3_69:\ud158\u8308\u76bc\u0a06\ud36e[expected:AbstractList<Object>]))
            return:\ud158\u8308\u76bc\u0a06\ud36e(var_3_69:\ud158\u8308\u76bc\u0a06\ud36e)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6198\u836c\u4179\uc84e\ua61f\u3a62$2(com.mojang.serialization.Dynamic p0) {
        var_2_61 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(1345967344), ldc:int(-281158340))
            
            if (instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, invokevirtual:Object(Dynamic::getValue, p0:Dynamic))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-608578209))
                invokespecial:void(\u7873\u7ce1\u516c\u1833\ua6bd<T>::\u983f\ud36e\u12cb\uc29a\u6b5f\u9937, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>, checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, invokevirtual:Object[expected:\uc31c\uc87f\uc246\u3776\ub7dc](Dynamic::getValue, p0:Dynamic)))
            }
            else {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u7873\u7ce1\u516c\u1833\ua6bd::\uc31c\u12cb\ufcaf\u6435\u392e\u7006), loadelement:String(getstatic:String[](\u7873\u7ce1\u516c\u1833\ua6bd::\u64ab\u36d3\uc87f\u4d85\u516c\u494c), xor:int(ldc:int(-15870), ldc:int(-15871))), p0:Dynamic[expected:Object])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.google.common.primitives.UnsignedLong lambda$\u3504\u4daf\ub7dc\ub32d\u7d52\u4c2b$1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u67e9\uc84e\u839e\uc9f6\u8d98 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:UnsignedLong(getfield:UnsignedLong(\u67e9\uc84e\u839e\uc9f6\u8d98::\ua068\uc84e\u6b0d\u156b\uf9c5\u1187, p0:\u67e9\uc84e\u839e\uc9f6\u8d98))
        }
        
        goto(Label_0006)
    }
    
    private static long lambda$\ub19c\ucef1\u76bc\u927d\u5245\u7bad$0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u67e9\uc84e\u839e\uc9f6\u8d98 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:long(getfield:long(\u67e9\uc84e\u839e\uc9f6\u8d98::\u7c6b\u3711\u3711\uc9f6\u718f\u97b7, p0:\u67e9\uc84e\u839e\uc9f6\u8d98))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_353 : int
        expr_6E : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_128_0 : byte[] [generated]
        stack_12A_0 : byte[] [generated]
        stack_169_0 : byte[] [generated]
        stack_16B_0 : byte[] [generated]
        stack_1B2_0 : byte[] [generated]
        stack_276_0 : byte[] [generated]
        stack_2B1_0 : byte[] [generated]
        stack_317_0 : byte[] [generated]
        stack_36E_0 : byte[] [generated]
        stack_3E3_0 : byte[] [generated]
        var_4_24F : int
        var_3_254 : byte[]
        var_5_255 : int
        var_0_364 : int
        expr_36E : byte [generated]
        stack_3AE_2 : byte [generated]
        stack_38B_0 : byte [generated]
        var_2_9B : byte[]
        expr_9F : int [generated]
        var_3_29F : byte[]
        var_5_2A0 : int
        expr_E9 : int [generated]
        expr_12A : int [generated]
        expr_16B : int [generated]
        var_3_3D1 : byte[]
        var_5_3D2 : int
        expr_3E3 : byte [generated]
        var_3_1BE : String
        stack_242_0 : String[] [generated]
        expr_1D0 : String[] [generated]
        
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
        var_0_353 = and:int(ldc:int(-885050578), ldc:int(-1347454321))
        expr_6E = arraylength:int(stack_9B_0 = stack_9D_0 = stack_E7_0 = stack_E9_0 = stack_128_0 = stack_12A_0 = stack_169_0 = stack_16B_0 = stack_1B2_0 = stack_276_0 = stack_2B1_0 = stack_317_0 = stack_36E_0 = stack_3E3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("CgbfnB/fHZ4URZrS3l7erA1c2tCc2qPN3SxPW9FcG93sEssfaMadn9IF0h+eHlsUWJ2e4Q==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_24F = expr_6E:int
        var_3_254 = newarray:byte[](byte.class, expr_6E:int)
        var_5_255 = expr_6E:int
        Label_0599:
        
        while (cmpeq:boolean(and:int(var_0_353:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_353:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0760)
            }
            
            var_0_353 = and:int(var_0_353:int, ldc:int(1941417708))
            var_5_255 = add:int(var_5_255:int, ldc:int(-1))
            storeelement:byte(var_3_254:byte[], var_5_255:int, xor:byte(loadelement:byte(stack_276_0:byte[], var_5_255:int), ldc:byte(9)))
            
            if (cmpne:boolean(var_5_255:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_E7_0 = stack_E9_0 = stack_128_0 = stack_12A_0 = stack_169_0 = stack_16B_0 = stack_1B2_0 = stack_276_0 = stack_2B1_0 = stack_317_0 = stack_36E_0 = stack_3E3_0 = var_3_254:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0838)
        Label_0760:
        
        while (cmpne:boolean(and:int(var_0_353:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_353:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0599)
            }
            
            var_0_353 = and:int(var_0_353:int, ldc:int(-1619052755))
            var_5_255 = add:int(var_5_255:int, ldc:int(-1))
            storeelement:byte(var_3_254:byte[], var_5_255:int, add:byte(loadelement:byte(stack_317_0:byte[], var_5_255:int), ldc:byte(91)))
            
            if (cmpne:boolean(var_5_255:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_E7_0 = stack_E9_0 = stack_128_0 = stack_12A_0 = stack_169_0 = stack_16B_0 = stack_1B2_0 = stack_276_0 = stack_2B1_0 = stack_317_0 = stack_36E_0 = stack_3E3_0 = var_3_254:byte[]
            goto(Label_0238)
        }
        
        Label_0838:
        
        while (cmpeq:boolean(and:int(var_0_353:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_353:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0599)
            }
            
            var_0_364 = and:int(var_0_353:int, ldc:int(2146383711))
            var_5_255 = add:int(var_5_255:int, ldc:int(-1))
            expr_36E = stack_3AE_2 = loadelement(stack_36E_0, var_5_255)
            
            if (cmplt:boolean(add:int(add:int(var_5_255:int, ldc:int(1)), neg:int(var_4_24F:int)), ldc:int(0))) {
                stack_3AE_2 = stack_38B_0 = add:byte(expr_36E:byte, loadelement:byte(var_3_254:byte[], add:int(var_5_255:int, ldc:int(1))))
                goto(Label_0923)
            }
            
            Label_0891:
            
            if (cmpne:boolean(and:int(var_0_364:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_364 = and:int(var_0_364:int, ldc:int(-1010849140))
                stack_3AE_2 = stack_38B_0 = add:byte(expr_36E:byte, ldc:byte(1))
            }
            
            Label_0923:
            
            if (cmpeq:boolean(and:int(var_0_364:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0891)
            }
            
            var_0_353 = and:int(var_0_364:int, ldc:int(-1813533091))
            storeelement:byte(var_3_254:byte[], var_5_255:int, stack_3AE_2:byte)
            
            if (cmpne:boolean(var_5_255:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_E7_0 = stack_E9_0 = stack_128_0 = stack_12A_0 = stack_169_0 = stack_16B_0 = stack_1B2_0 = stack_276_0 = stack_2B1_0 = stack_317_0 = stack_36E_0 = stack_3E3_0 = var_3_254:byte[]
            goto(Label_0303)
        }
        
        var_0_353 = and:int(var_0_353:int, ldc:int(1943819057))
        goto(Label_0760)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0368)
        }
        
        if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0303)
        }
        
        if (cmpne:boolean(and:int(var_0_353:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0238)
        }
        
        if (cmpne:boolean(and:int(var_0_353:int, ldc:int(65536)), ldc:int(0))) {
            var_0_353 = and:int(var_0_353:int, ldc:int(859830142))
            var_2_9B = stack_9B_0:byte[]
            expr_9F = add:int(arraylength:int(stack_9D_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_3_29F = newarray:byte[](byte.class, expr_9F:int)
                var_5_2A0 = expr_9F:int
                
                loop {
                    var_0_353 = and:int(var_0_353:int, ldc:int(-2027472337))
                    var_5_2A0 = add:int(var_5_2A0:int, ldc:int(-1))
                    storeelement:byte(var_3_29F:byte[], var_5_2A0:int, add:int(shl:int(loadelement:byte(stack_2B1_0:byte[], var_5_2A0:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_9B:byte[], add:int(var_5_2A0:int, xor:int(ldc:int(4112), ldc:int(4113)))), ldc:int(2)), and:int(ldc:int(2751), ldc:int(16703)))))
                    
                    if (cmpne:boolean(var_5_2A0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_E7_0 = stack_E9_0 = stack_128_0 = stack_12A_0 = stack_169_0 = stack_16B_0 = stack_1B2_0 = stack_276_0 = stack_2B1_0 = stack_317_0 = stack_36E_0 = stack_3E3_0 = var_3_29F:byte[]
            }
        }
        
        Label_0164:
        
        if (cmpne:boolean(and:int(var_0_353:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_353 = and:int(var_0_353:int, ldc:int(-599464296))
            goto(Label_0368)
        }
        
        if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_353 = and:int(var_0_353:int, ldc:int(-1795169086))
            goto(Label_0303)
        }
        
        if (cmpne:boolean(and:int(var_0_353:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_353 = and:int(var_0_353:int, ldc:int(478796589))
                goto(Label_0115)
            }
            
            var_0_353 = and:int(var_0_353:int, ldc:int(335017902))
            expr_E9 = arraylength:int(stack_E9_0:byte[])
            
            if (cmpne:boolean(expr_E9:int, ldc:int(0))) {
                var_4_24F = expr_E9:int
                var_3_254 = newarray:byte[](byte.class, expr_E9:int)
                var_5_255 = expr_E9:int
                goto(Label_0760)
            }
        }
        
        Label_0238:
        
        if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_353 = and:int(var_0_353:int, ldc:int(-1144307726))
            goto(Label_0368)
        }
        
        if (cmpne:boolean(and:int(var_0_353:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0164)
            }
            
            if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_353 = and:int(var_0_353:int, ldc:int(-1322102320))
                goto(Label_0115)
            }
            
            var_0_353 = and:int(var_0_353:int, ldc:int(1462744750))
            expr_12A = arraylength:int(stack_12A_0:byte[])
            
            if (cmpne:boolean(expr_12A:int, ldc:int(0))) {
                var_4_24F = expr_12A:int
                var_3_254 = newarray:byte[](byte.class, expr_12A:int)
                var_5_255 = expr_12A:int
                goto(Label_0838)
            }
        }
        
        Label_0303:
        
        if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_353:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0238)
            }
            
            if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_353 = and:int(var_0_353:int, ldc:int(65820421))
                goto(Label_0164)
            }
            
            if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_353 = and:int(var_0_353:int, ldc:int(1796344599))
                goto(Label_0115)
            }
            
            var_0_353 = and:int(var_0_353:int, ldc:int(933734348))
            expr_16B = arraylength:int(stack_16B_0:byte[])
            
            if (cmpne:boolean(expr_16B:int, ldc:int(0))) {
                var_3_3D1 = newarray:byte[](byte.class, expr_16B:int)
                var_5_3D2 = expr_16B:int
                
                loop {
                    var_0_353 = and:int(var_0_353:int, ldc:int(-213946612))
                    var_5_3D2 = add:int(var_5_3D2:int, ldc:int(-1))
                    expr_3E3 = loadelement:byte(stack_3E3_0:byte[], var_5_3D2:int)
                    storeelement:byte(var_3_3D1:byte[], var_5_3D2:int, or:int(and:int(shl:int(expr_3E3:byte, xor:int(ldc:int(-32736), ldc:int(-32732))), ldc:int(-16)), and:int(shr:int(expr_3E3:byte[expected:int], xor:int(ldc:int(1474), ldc:int(1478))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_3D2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_E7_0 = stack_E9_0 = stack_128_0 = stack_12A_0 = stack_169_0 = stack_16B_0 = stack_1B2_0 = stack_276_0 = stack_2B1_0 = stack_317_0 = stack_36E_0 = stack_3E3_0 = var_3_3D1:byte[]
            }
        }
        
        Label_0368:
        
        if (cmpne:boolean(and:int(var_0_353:int, ldc:int(32768)), ldc:int(0))) {
            var_0_353 = and:int(var_0_353:int, ldc:int(475473684))
            goto(Label_0303)
        }
        
        if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(131072)), ldc:int(0))) {
            var_0_353 = and:int(var_0_353:int, ldc:int(1887931986))
            goto(Label_0238)
        }
        
        if (cmpne:boolean(and:int(var_0_353:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0164)
        }
        
        if (cmpeq:boolean(and:int(var_0_353:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_353 = and:int(var_0_353:int, ldc:int(646752810))
            goto(Label_0115)
        }
        
        var_3_1BE = initobject:String(String::<init>, stack_1B2_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_242_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6214), ldc:int(8341)))
        expr_1D0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16429), ldc:int(6148)))
        storeelement:String(expr_1D0:String[], and:int(ldc:int(1976), ldc:int(-2041)), invokevirtual:String[expected:String](String::substring, var_3_1BE:String, and:int(ldc:int(26752), ldc:int(-26753)), and:int(ldc:int(8712), ldc:int(3100))))
        storeelement:String(expr_1D0:String[], xor:int(ldc:int(-32702), ldc:int(-32703)), invokevirtual:String[expected:String](String::substring, var_3_1BE:String, xor:int(ldc:int(16429), ldc:int(16421)), xor:int(ldc:int(4108), ldc:int(4136))))
        storeelement:String(expr_1D0:String[], xor:int(ldc:int(16896), ldc:int(16897)), invokevirtual:String[expected:String](String::substring, var_3_1BE:String, and:int(ldc:int(310), ldc:int(9252)), and:int(ldc:int(42), ldc:int(364))))
        storeelement:String(expr_1D0:String[], and:int(ldc:int(5131), ldc:int(10882)), invokevirtual:String[expected:String](String::substring, var_3_1BE:String, and:int(ldc:int(8489), ldc:int(4264)), xor:int(ldc:int(-15834), ldc:int(-15851))))
        putstatic:String[](\u7873\u7ce1\u516c\u1833\ua6bd::\u64ab\u36d3\uc87f\u4d85\u516c\u494c, expr_1D0:String[])
        putstatic:Logger(\u7873\u7ce1\u516c\u1833\ua6bd::\uc31c\u12cb\ufcaf\u6435\u392e\u7006, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \uc229\u7049\u120d\u494c\u7d52\u718f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6DE : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6E9 : int
        
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
        var_3_6DE = and:int(ldc:int(1808619159), ldc:int(1835784118))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7873\u7ce1\u516c\u1833\ua6bd<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_6DE = and:int(var_3_6DE:int, ldc:int(219863816))
        }
        else {
            var_3_6DE = and:int(var_3_6DE:int, ldc:int(2036464885))
            var_5_8A = and:int(ldc:int(-8773), ldc:int(8772))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18587), ldc:int(-18588)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6DE:int, ldc:int(1642443825))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(305), ldc:int(304)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(16416), ldc:int(16417)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6DE = and:int(var_3_E3:int, ldc:int(-8757703))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(1280), ldc:int(1281)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(223678153))
                        goto(Label_1645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1315688826))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1418733921))
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1933906824))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1650264767))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1217741896))
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1883527282))
                        goto(Label_0765)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(953250908))
                    }
                    else {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-201558433))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0915)
                        }
                    }
                    
                    Label_0456:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1489839747))
                        goto(Label_1352)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(196515323))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0765)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1385313053))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-212396271))
                            var_11_F4 = and:int(ldc:int(6930), ldc:int(-6931))
                            goto(Label_1634)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0613:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1887123101))
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1527119356))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(589981513))
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-38626620))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1019907165))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-490113787))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1459095755))
                            goto(Label_0456)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-143051117))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0915)
                        }
                    }
                    
                    Label_0765:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(2106531771))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(2034008252))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1312226145))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(210319550))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(316935696))
                            goto(Label_0456)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-552640492))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-168265765))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0915:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(103977195))
                        goto(Label_1352)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1371422027))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0765)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(540861676))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0456)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1878261461))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(18439), ldc:int(4977))
                                goto(Label_1209)
                            }
                        }
                    }
                    
                    Label_1031:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(636223067))
                        goto(Label_1645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1597631499))
                        goto(Label_1352)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-166564330))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(288605615))
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-437256123))
                            goto(Label_0765)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1485032325))
                            goto(Label_0456)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1776400094))
                        var_11_F4 = and:int(ldc:int(3183), ldc:int(-7536))
                    }
                    
                    Label_1209:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(19542925))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(458752997))
                            goto(Label_1031)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(99437320))
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0765)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1445392828))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1576164809))
                            goto(Label_0456)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(191248426))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-406463087))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1479)
                            }
                        }
                    }
                    
                    Label_1352:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1209)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1031)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1197429947))
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0765)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1932469244))
                            goto(Label_0456)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(582653016))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(2002558423))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1634)
                    }
                    
                    Label_1479:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1638797474))
                        goto(Label_1645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(753291737))
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(861607565))
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1441268049))
                        goto(Label_0765)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-820549255))
                        goto(Label_0456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(784411091))
                        loopcontinue()
                    }
                    
                    var_3_6DE = and:int(var_3_6DE:int, ldc:int(-512805738))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1634:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6E9 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1645:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(222340257))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1628311867))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0765)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(946101214))
                        goto(Label_0456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-68283114))
                        var_17_6E9 = add:int(var_16_122:int, and:int(ldc:int(69), ldc:int(4097)))
                        looporswitchbreak()
                    }
                    
                    var_3_6DE = and:int(var_3_6DE:int, ldc:int(-109952263))
                }
                
                var_3_6DE = and:int(var_3_6DE:int, ldc:int(2044977114))
                
                if (cmple:boolean(var_5_8A = var_17_6E9:int, sub:int(var_6_91:int, xor:int(ldc:int(2625), ldc:int(2624))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4096)), ldc:int(0))) {
            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1923775637))
            goto(Label_0108)
        }
    }
}
